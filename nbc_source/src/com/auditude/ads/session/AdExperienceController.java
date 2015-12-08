// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.session;

import android.view.ViewGroup;
import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.model.smil.Group;
import com.auditude.ads.response.AdResponse;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.ObjectUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.Log;
import com.auditude.ads.view.ViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.auditude.ads.session:
//            ChapterManager, BreakManager, AdExceptions

public class AdExperienceController
    implements IEventListener
{

    private static final int BREAK_TOLERANCE = 500;
    private AdSettings adSettings;
    private APIBridge apiBridge;
    private BreakManager breakManager;
    private ChapterManager chapterManager;
    private int currentChapterIndex;
    private boolean isManagingBreak;
    private int lastPosition;
    private int mediaResumeTime;
    private AdResponse response;
    private boolean skipAllBreaks;
    private boolean skipBreaksBeforeResumeTime;
    private ViewManager viewManager;

    public AdExperienceController(AdResponse adresponse, APIBridge apibridge, AdSettings adsettings, ViewGroup viewgroup)
    {
        isManagingBreak = false;
        skipBreaksBeforeResumeTime = false;
        skipAllBreaks = false;
        currentChapterIndex = -1;
        mediaResumeTime = 0;
        lastPosition = 0;
        response = adresponse;
        apiBridge = apibridge;
        adSettings = adsettings;
        viewManager = new ViewManager(viewgroup, apibridge, adsettings);
        chapterManager = new ChapterManager(apibridge, viewManager, adsettings);
        breakManager = new BreakManager(apibridge, viewManager, adsettings);
        apiBridge.addEventListener("apiEvent", this, 100);
    }

    private Group getBreakAtIndex(int i)
    {
        if (response == null || response.getBreaks() == null || response.getBreaks().size() <= i)
        {
            return null;
        } else
        {
            return (Group)response.getBreaks().get(i);
        }
    }

    private Group getBreakBeforePosition(int i, boolean flag)
    {
        if (skipAllBreaks || i <= 0) goto _L2; else goto _L1
_L1:
        if (response.getBreaks() == null || response.getBreaks().size() <= 0) goto _L2; else goto _L3
_L3:
        int j = response.getBreaks().size() - 1;
          goto _L4
_L5:
        Group group;
        group = (Group)response.getBreaks().get(j);
        if (!isGroupQualifiedForPosition(group, i, flag))
        {
            break MISSING_BLOCK_LABEL_132;
        }
        if (group.isWatched())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        Object obj;
        obj = group;
        try
        {
            if (!skipBreaksBeforeResumeTime)
            {
                break MISSING_BLOCK_LABEL_153;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = group;
        if (mediaResumeTime <= 0)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        i = group.getStartTime();
        j = mediaResumeTime;
        obj = group;
        if (i <= j)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_153;
        return null;
        j--;
        continue; /* Loop/switch isn't completed */
_L4:
        if (j >= 1) goto _L5; else goto _L2
_L2:
        obj = null;
        return ((Group) (obj));
    }

    private Group getChapterAtIndex(int i)
    {
        if (response == null || response.getChapters() == null || response.getChapters().size() <= i)
        {
            return null;
        } else
        {
            return (Group)response.getChapters().get(i);
        }
    }

    private Group getNextBreak()
    {
        return getBreakAtIndex(currentChapterIndex + 1);
    }

    private boolean inSameChapter(int i, int j)
    {
        if (i != j && response.getBreaks() != null && response.getBreaks().size() > 1)
        {
            int k = 1;
            while (k < response.getBreaks().size()) 
            {
                Group group = (Group)response.getBreaks().get(k);
                if (i < j)
                {
                    if (group.getStartTime() >= i && group.getStartTime() <= j)
                    {
                        return false;
                    }
                } else
                if (group.getStartTime() >= j && group.getStartTime() <= i)
                {
                    return false;
                }
                k++;
            }
        }
        return true;
    }

    private boolean isGroupQualifiedForPosition(Group group, int i, boolean flag)
    {
        if (group != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (group.getStartTime() > i) goto _L1; else goto _L3
_L3:
        return true;
        if ((group.getStartTime() < i || group.getStartTime() - i > 500) && (group.getStartTime() >= i || i - group.getStartTime() > 500)) goto _L1; else goto _L4
_L4:
        return true;
    }

    private void onBreakBeginNotification(HashMap hashmap)
    {
        if (breakManager.isHandlingBreak())
        {
            return;
        }
        onMediaPlaybackCompleteNotification(hashmap);
        if (AuditudeEnv.getInstance().shouldIgnoreNextBreak.booleanValue())
        {
            apiBridge.breakEnd(null);
            return;
        }
        if (hashmap != null && hashmap.containsKey("breakIndex"))
        {
            int i = ((Integer)hashmap.get("breakIndex")).intValue();
            if (i >= 0)
            {
                currentChapterIndex = i - 1;
            }
        }
        breakManager.begin(getNextBreak());
    }

    private void onBreakEndNotification(HashMap hashmap)
    {
        if (AdExceptions.hasException("skipNextBreak").booleanValue() && breakManager.isHandlingBreak())
        {
            AuditudeEnv.getInstance().shouldPauseAdPatterns = Boolean.valueOf(true);
            AuditudeEnv.getInstance().shouldIgnoreNextBreak = Boolean.valueOf(true);
        }
        isManagingBreak = false;
        breakManager.end();
    }

    private void onMediaPlaybackCompleteNotification(HashMap hashmap)
    {
        if (chapterManager.isHandlingChapter())
        {
            chapterManager.end();
        }
    }

    private void onMediaPlaybackPausedNotification(HashMap hashmap)
    {
        if (chapterManager.isHandlingChapter())
        {
            chapterManager.pause();
        }
    }

    private void onMediaPlaybackResumedNotification(HashMap hashmap)
    {
        if (chapterManager.isHandlingChapter())
        {
            chapterManager.resume();
            return;
        } else
        {
            onMediaPlaybackStartedNotification(hashmap);
            return;
        }
    }

    private void onMediaPlaybackStartedNotification(HashMap hashmap)
    {
        if (chapterManager.isHandlingChapter())
        {
            onMediaPlaybackResumedNotification(hashmap);
            return;
        }
        currentChapterIndex = currentChapterIndex + 1;
        if (hashmap != null)
        {
            if (hashmap.containsKey("auditudeSkipBreaksBeforeResumeTime"))
            {
                skipBreaksBeforeResumeTime = ObjectUtil.convertToBoolean(hashmap.get("auditudeSkipBreaksBeforeResumeTime"));
            }
            if (hashmap.containsKey("auditudeResumeTimeInMilliSeconds"))
            {
                mediaResumeTime = ObjectUtil.convertToInt(hashmap.get("auditudeResumeTimeInMilliSeconds"), 0);
            }
        }
        if (breakManager.isHandlingBreak())
        {
            breakManager.end();
        }
        chapterManager.begin(getChapterAtIndex(currentChapterIndex));
        AuditudeEnv.getInstance().shouldPauseAdPatterns = Boolean.valueOf(false);
        AuditudeEnv.getInstance().shouldIgnoreNextBreak = Boolean.valueOf(false);
    }

    private void onMediaPlayheadUpdateNotification(HashMap hashmap, boolean flag)
    {
        if (!breakManager.isHandlingBreak() && hashmap != null && ((Boolean)adSettings.getProperty("auditudeHandlesChapterBreaks")).booleanValue())
        {
            hashmap = hashmap.entrySet().iterator();
            while (hashmap.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.next();
                if (((String)entry.getKey()).toLowerCase().equals("position".toLowerCase()))
                {
                    int i = ObjectUtil.convertToInt(entry.getValue(), -1);
                    if (i > 0)
                    {
                        chapterManager.setPosition(i);
                        lastPosition = i;
                        AuditudeUtil.setContentPlayhead(i);
                        Log.getLogger("Auditude").info((new StringBuilder("position: ")).append(i).toString());
                        Group group = getBreakBeforePosition(i, flag);
                        if (group != null)
                        {
                            int j;
                            if (group.getIndex() > 0)
                            {
                                j = group.getIndex() - 1;
                            } else
                            {
                                j = 0;
                            }
                            currentChapterIndex = j;
                            if (!group.isEmpty())
                            {
                                isManagingBreak = true;
                                apiBridge.pauseMainMedia(null);
                                notify("breakBegin", null);
                            } else
                            {
                                group.end();
                                notify("mediaPlaybackComplete", null);
                                notify("mediaPlaybackStarted", null);
                            }
                        }
                    }
                }
            }
        }
    }

    private void onMediaSeekCompleteNotification(HashMap hashmap)
    {
        if (!skipAllBreaks && hashmap != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator = hashmap.entrySet().iterator();
        java.util.Map.Entry entry;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            entry = (java.util.Map.Entry)iterator.next();
        } while (!((String)entry.getKey()).toLowerCase().equals("position".toLowerCase()));
        int i = ObjectUtil.convertToInt(entry.getValue(), -1);
        if (!inSameChapter(lastPosition, i))
        {
            onMediaPlayheadUpdateNotification(hashmap, false);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private boolean shouldPlayBreaksAtMarkers()
    {
        return adSettings.getPropertyAsBoolean("auditudePlayBreaksAtMarkers");
    }

    public final boolean HasBreak(int i)
    {
        Group group;
        if (i < 0)
        {
            group = getNextBreak();
        } else
        {
            group = getBreakAtIndex(i);
        }
        while (group == null || group.isWatched() || group.isEmpty()) 
        {
            return false;
        }
        return true;
    }

    public final void dispose()
    {
        apiBridge.removeEventListener("apiEvent", this);
        breakManager.dispose();
        breakManager = null;
        chapterManager.dispose();
        chapterManager = null;
        viewManager.dispose();
        viewManager = null;
        if (response != null)
        {
            response.dispose();
            response = null;
        }
    }

    public final void notify(String s, HashMap hashmap)
    {
        if (!StringUtil.isNullOrEmpty(s))
        {
            if ("breakBegin".equalsIgnoreCase(s))
            {
                onBreakBeginNotification(hashmap);
                return;
            }
            if ("breakEnd".equalsIgnoreCase(s))
            {
                onBreakEndNotification(hashmap);
                return;
            }
            if ("mediaPlaybackStarted".equalsIgnoreCase(s))
            {
                onMediaPlaybackStartedNotification(hashmap);
                return;
            }
            if ("mediaPlaybackComplete".equalsIgnoreCase(s))
            {
                onMediaPlaybackCompleteNotification(hashmap);
                return;
            }
            if ("mediaPlaybackPaused".equalsIgnoreCase(s))
            {
                onMediaPlaybackPausedNotification(hashmap);
                return;
            }
            if ("mediaPlaybackResumed".equalsIgnoreCase(s))
            {
                onMediaPlaybackResumedNotification(hashmap);
                return;
            }
            if ("mediaSeekComplete".equalsIgnoreCase(s))
            {
                onMediaSeekCompleteNotification(hashmap);
                return;
            }
            if ("mediaProgress".equalsIgnoreCase(s))
            {
                onMediaPlayheadUpdateNotification(hashmap, shouldPlayBreaksAtMarkers());
                return;
            }
        }
    }

    public void onEvent(String s, Object obj)
    {
        if ((obj instanceof AdPluginEvent) && ((AdPluginEvent)obj).getType().equalsIgnoreCase("breakEnd") && isManagingBreak)
        {
            isManagingBreak = false;
            apiBridge.resumeMainMedia(null);
            if (currentChapterIndex >= 0)
            {
                notify("mediaPlaybackStarted", null);
            }
        }
    }
}
