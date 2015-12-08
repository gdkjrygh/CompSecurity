// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.logging:
//            EventProtoCache, LogflowGamesUiElementNode, LogflowUiUtils, GamesLogHelper

public final class GamesLogflowLogger
{

    private static final boolean DBG;
    private static final AtomicInteger ELEMENT_ID = new AtomicInteger(1);
    public static final Object FLINGING_VIEW_LOCK = new Object();
    public static final Object LOGGING_QUEUE_LOCK = new Object();
    public static final long LOG_IMPRESSION_SETTLE_TIME_MS;
    private static final boolean VERBOSE_BACKGROUND = false;
    private static final boolean VERBOSE_CLICK;
    private static final boolean VERBOSE_DEEP_LINK = false;
    public static final boolean VERBOSE_IMPRESSION;
    private static final boolean VERBOSE_SEARCH = false;
    public static final SparseArray sFlingingViews = new SparseArray();
    private static boolean sInitializedImpressionId = false;
    private static long sNextImpressionId;
    public String mAccountName;
    public String mApplicationId;
    private final Context mContext;
    public ArrayList mEventQueue;
    public final EventProtoCache mProtoCache;
    private final int mSource;

    public GamesLogflowLogger(Context context, int i, String s, String s1)
    {
        mContext = context;
        mSource = i;
        mProtoCache = EventProtoCache.getInstance();
        mEventQueue = new ArrayList();
        mAccountName = s;
        mApplicationId = s1;
    }

    public GamesLogflowLogger(GamesFragmentActivity gamesfragmentactivity, String s)
    {
        int i;
        if (gamesfragmentactivity.mConfiguration.isClientUi())
        {
            i = 1;
        } else
        {
            i = 3;
        }
        this(((Context) (gamesfragmentactivity)), i, s, null);
    }

    private void buildImpressionTreeDown(View view, LogflowGamesUiElementNode logflowgamesuielementnode, SparseArray sparsearray, ArrayMap arraymap)
    {
        boolean flag = false;
        Object obj = logflowgamesuielementnode;
        if (view.getTag(0x7f0d0061) instanceof LogflowGamesUiElementNode)
        {
            LogflowGamesUiElementNode logflowgamesuielementnode1 = (LogflowGamesUiElementNode)view.getTag(0x7f0d0061);
            if (sparsearray.size() > 0)
            {
                sparsearray.remove(view.hashCode());
            }
            obj = logflowgamesuielementnode;
            if (!logflowgamesuielementnode.equals(logflowgamesuielementnode1))
            {
                obj = logflowgamesuielementnode1.getFauxParentLogflowUiElement();
                int i;
                int j;
                if (obj != null)
                {
                    com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement2 = logflowgamesuielementnode.getPlaylogGamesUiElement();
                    android.util.Pair pair = LogflowUiUtils.createElemKey(((com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement) (obj)));
                    com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement1 = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement)arraymap.get(pair);
                    logflowgamesuielementnode = playloggamesuielement1;
                    if (playloggamesuielement1 == null)
                    {
                        logflowgamesuielementnode = ((LogflowGamesUiElementNode) (obj));
                        arraymap.put(pair, logflowgamesuielementnode);
                        findOrAddChild(playloggamesuielement2, logflowgamesuielementnode);
                    }
                    findOrAddChild(logflowgamesuielementnode, logflowgamesuielementnode1.getPlaylogGamesUiElement());
                } else
                {
                    com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement = logflowgamesuielementnode1.getPlaylogGamesUiElement();
                    findOrAddChild(logflowgamesuielementnode.getPlaylogGamesUiElement(), playloggamesuielement);
                }
                obj = logflowgamesuielementnode1;
            }
            flag = logflowgamesuielementnode1.isLeaf();
        }
        if (!flag && (view instanceof ViewGroup))
        {
            view = (ViewGroup)view;
            j = view.getChildCount();
            for (i = 0; i < j; i++)
            {
                logflowgamesuielementnode = view.getChildAt(i);
                if (isShown(logflowgamesuielementnode))
                {
                    buildImpressionTreeDown(((View) (logflowgamesuielementnode)), ((LogflowGamesUiElementNode) (obj)), sparsearray, arraymap);
                }
            }

        }
    }

    private static com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement cloneElement(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement1 = obtainPlaylogGamesUiElement(0);
        cloneElement(playloggamesuielement, playloggamesuielement1);
        return playloggamesuielement1;
    }

    private static void cloneElement(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement, com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement1)
    {
        playloggamesuielement1.id = playloggamesuielement.id;
        playloggamesuielement1.type = playloggamesuielement.type;
    }

    public static void createClickPathFromView(View view, com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent playloggamesclickevent)
    {
        playloggamesclickevent.elementPath = createLeafToRootPath(view);
    }

    public static com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[] createLeafToRootPath(View view)
    {
        View view1;
        boolean flag;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[] = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[0];
        flag = false;
        view1 = view;
        view = aplayloggamesuielement;
_L9:
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement1[] = view;
        if (view1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        boolean flag2;
        flag2 = flag;
        obj = view;
        if (!(view1.getTag(0x7f0d0061) instanceof LogflowGamesUiElementNode)) goto _L4; else goto _L3
_L3:
        boolean flag1;
        LogflowGamesUiElementNode logflowgamesuielementnode = (LogflowGamesUiElementNode)view1.getTag(0x7f0d0061);
        obj = cloneElement(logflowgamesuielementnode.getPlaylogGamesUiElement());
        if (((com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement) (obj)).type >= 1100 && ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement) (obj)).type <= 1200)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1) goto _L6; else goto _L5
_L5:
        aplayloggamesuielement1 = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[])ArrayUtils.appendToArray(view, obj);
        flag1 = flag;
_L7:
        flag2 = flag1;
        obj = aplayloggamesuielement1;
        if (logflowgamesuielementnode.getFauxParentLogflowUiElement() != null)
        {
            obj = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[])ArrayUtils.appendToArray(aplayloggamesuielement1, cloneElement(logflowgamesuielementnode.getFauxParentLogflowUiElement()));
            flag2 = flag1;
        }
_L4:
        aplayloggamesuielement1 = ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement []) (obj));
        if (!(view1.getParent() instanceof View))
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = (View)view1.getParent();
        flag = flag2;
        view = ((View) (obj));
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = flag;
        aplayloggamesuielement1 = view;
        if (!flag)
        {
            aplayloggamesuielement1 = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[])ArrayUtils.appendToArray(view, obj);
            flag1 = true;
        }
        if (true) goto _L7; else goto _L2
_L2:
        return aplayloggamesuielement1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static void deepCloneAndWipeChildren(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement, com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement1)
    {
        cloneElement(playloggamesuielement, playloggamesuielement1);
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[] = playloggamesuielement.child;
        int j = aplayloggamesuielement.length;
        for (int i = 0; i < j; i++)
        {
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement2 = aplayloggamesuielement[i];
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement3 = obtainPlaylogGamesUiElement(0);
            deepCloneAndWipeChildren(playloggamesuielement2, playloggamesuielement3);
            playloggamesuielement1.child = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[])ArrayUtils.appendToArray(playloggamesuielement1.child, playloggamesuielement3);
        }

        playloggamesuielement.child = com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement.emptyArray();
    }

    private static void dumpElement(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        s = new StringBuilder(s1);
        s.append("type=").append(playloggamesuielement.type);
        GamesLog.d("GamesLogflowLogger", s.toString());
    }

    public static void dumpTree(String s, long l, com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement, String s1)
    {
        if (VERBOSE_IMPRESSION)
        {
            if (s != null)
            {
                GamesLog.d("GamesLogflowLogger", String.format("%s impression tree, id=%d", new Object[] {
                    s, Long.valueOf(l)
                }));
            }
            s = s1;
            if (s1 == null)
            {
                s = "";
            }
            dumpElement(playloggamesuielement, s);
            s = (new StringBuilder()).append(s).append("  ").toString();
            playloggamesuielement = playloggamesuielement.child;
            int j = playloggamesuielement.length;
            int i = 0;
            while (i < j) 
            {
                dumpTree(null, 0L, playloggamesuielement[i], s);
                i++;
            }
        }
    }

    private static boolean findOrAddChild(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement, com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement1)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[];
        int i;
        int j;
        boolean flag2;
        flag2 = false;
        aplayloggamesuielement = playloggamesuielement.child;
        j = aplayloggamesuielement.length;
        i = 0;
_L10:
        boolean flag1 = flag2;
        if (i >= j) goto _L2; else goto _L1
_L1:
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement2 = aplayloggamesuielement[i];
        if (playloggamesuielement1 == playloggamesuielement2) goto _L4; else goto _L3
_L3:
        if (playloggamesuielement1 != null && playloggamesuielement2 != null) goto _L6; else goto _L5
_L5:
        boolean flag = false;
_L8:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = true;
_L2:
        if (!flag1)
        {
            playloggamesuielement.child = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[])ArrayUtils.appendToArray(playloggamesuielement.child, playloggamesuielement1);
        }
        return flag1;
_L6:
        if (playloggamesuielement1.type != playloggamesuielement2.type)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (!playloggamesuielement1.id.equals(playloggamesuielement2.id))
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static View findRootView(View view)
    {
        View view1 = view;
        View view3 = view1;
        do
        {
            boolean flag;
            if (view.getParent() != null && (view.getParent() instanceof View))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                View view2 = (View)view.getParent();
                view = view2;
                if (view2.getTag(0x7f0d0061) instanceof LogflowGamesUiElementNode)
                {
                    view3 = view2;
                    view = view2;
                }
            } else
            {
                return view3;
            }
        } while (true);
    }

    public static long getNextImpressionId()
    {
        if (!sInitializedImpressionId)
        {
            sNextImpressionId = System.currentTimeMillis() ^ System.nanoTime();
            sInitializedImpressionId = true;
        }
        long l = sNextImpressionId + 1L;
        sNextImpressionId = l;
        if (l == 0L)
        {
            sNextImpressionId++;
        }
        return sNextImpressionId;
    }

    public static boolean isShown(View view)
    {
        Rect rect = new Rect();
        view.getRootView().getHitRect(rect);
        return view.getLocalVisibleRect(rect);
    }

    private static boolean isValidRootType(int i)
    {
        return i > 0 && i <= 199 || 300 <= i && i <= 399;
    }

    private void logImpressionEvent(com.google.android.gms.games.proto.PlayGames.PlaylogGamesImpressionEvent playloggamesimpressionevent)
    {
        if (VERBOSE_IMPRESSION)
        {
            dumpTree("Sending", playloggamesimpressionevent.id, playloggamesimpressionevent.tree, null);
        }
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesLogEvent playloggameslogevent = mProtoCache.obtainPlaylogGamesLogEvent();
        playloggameslogevent.impression = playloggamesimpressionevent;
        logPlaylogEvent(playloggameslogevent);
    }

    public static com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement obtainPlaylogGamesUiElement(int i)
    {
        return obtainPlaylogGamesUiElement(i, Integer.toString(ELEMENT_ID.getAndIncrement()));
    }

    public static com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement obtainPlaylogGamesUiElement(int i, String s)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement = EventProtoCache.getInstance().obtainPlaylogGamesUiElement();
        playloggamesuielement.type = i;
        playloggamesuielement.id = s;
        return playloggamesuielement;
    }

    private static void processFlungViews(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement, SparseArray sparsearray, ArrayMap arraymap)
    {
        int i = 0;
        int k = sparsearray.size();
        while (i < k) 
        {
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[] = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[])sparsearray.valueAt(i);
            if (aplayloggamesuielement.length == 0)
            {
                GamesLog.e("GamesLogflowLogger", (new StringBuilder("Ignoring zero-length path for key ")).append(sparsearray.keyAt(i)).toString());
            } else
            if (aplayloggamesuielement[aplayloggamesuielement.length - 1].type == playloggamesuielement.type)
            {
                com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement1 = playloggamesuielement;
                int j = aplayloggamesuielement.length - 2;
                while (j >= 0) 
                {
                    com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement2 = aplayloggamesuielement[j];
                    android.util.Pair pair = LogflowUiUtils.createElemKey(playloggamesuielement2);
                    com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement3 = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement)arraymap.get(pair);
                    if (playloggamesuielement3 != null)
                    {
                        playloggamesuielement1 = playloggamesuielement3;
                    } else
                    {
                        findOrAddChild(playloggamesuielement1, playloggamesuielement2);
                        playloggamesuielement1 = playloggamesuielement2;
                        arraymap.put(pair, playloggamesuielement1);
                    }
                    j--;
                }
            }
            i++;
        }
    }

    public static void start()
    {
    }

    public final void clearPendingEvents()
    {
        synchronized (LOGGING_QUEUE_LOCK)
        {
            mEventQueue.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void logClick(int i, View view)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent playloggamesclickevent = mProtoCache.obtainPlaylogGamesClickEvent();
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement = mProtoCache.obtainPlaylogGamesUiElement();
        playloggamesuielement.type = i;
        if (view != null)
        {
            createClickPathFromView(view, playloggamesclickevent);
        }
        view = playloggamesclickevent.elementPath;
        playloggamesclickevent.elementPath = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[])ArrayUtils.concat(new com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[][] {
            new com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[] {
                playloggamesuielement
            }, view
        });
        logClickEvent(playloggamesclickevent);
    }

    public final void logClickEvent(com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent playloggamesclickevent)
    {
        if (VERBOSE_CLICK && VERBOSE_CLICK)
        {
            GamesLog.d("GamesLogflowLogger", "Sending click event:");
            String s = "";
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[] = playloggamesclickevent.elementPath;
            int j = aplayloggamesuielement.length;
            for (int i = 0; i < j; i++)
            {
                dumpElement(aplayloggamesuielement[i], s);
                s = (new StringBuilder()).append(s).append("  ").toString();
            }

        }
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesLogEvent playloggameslogevent = mProtoCache.obtainPlaylogGamesLogEvent();
        playloggameslogevent.click = playloggamesclickevent;
        logPlaylogEvent(playloggameslogevent);
    }

    public final void logEventInternalImmediate(com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension)
    {
        (new GamesLogHelper(mContext)).logEvent(mAccountName, playloggamesextension);
    }

    public final void logPlaylogEvent(com.google.android.gms.games.proto.PlayGames.PlaylogGamesLogEvent playloggameslogevent)
    {
        Object obj1;
        obj1 = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggameslogevent.uiSource = mSource;
        obj1.requestInfo = GamesLogHelper.getRequestInfo(mContext, mContext.getPackageName(), mApplicationId);
        obj1.logflowEvent = playloggameslogevent;
        Object obj = LOGGING_QUEUE_LOCK;
        obj;
        JVM INSTR monitorenter ;
        if (mAccountName != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        mEventQueue.add(obj1);
_L2:
        obj = mProtoCache;
        if (playloggameslogevent.impression != null)
        {
            obj1 = playloggameslogevent.impression;
            if (((com.google.android.gms.games.proto.PlayGames.PlaylogGamesImpressionEvent) (obj1)).tree != null)
            {
                ((EventProtoCache) (obj)).recycle(((com.google.android.gms.games.proto.PlayGames.PlaylogGamesImpressionEvent) (obj1)).tree);
            }
            ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesImpressionEvent) (obj1)).clear();
            ((EventProtoCache) (obj)).mCachePlaylogGamesImpression.recycle(obj1);
        }
        if (playloggameslogevent.click == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        obj1 = playloggameslogevent.click;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[] = ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent) (obj1)).elementPath;
        int j = aplayloggamesuielement.length;
        for (int i = 0; i < j; i++)
        {
            ((EventProtoCache) (obj)).recycle(aplayloggamesuielement[i]);
        }

        break MISSING_BLOCK_LABEL_176;
        logEventInternalImmediate(((com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
        playloggameslogevent;
        obj;
        JVM INSTR monitorexit ;
        throw playloggameslogevent;
        ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent) (obj1)).clear();
        ((EventProtoCache) (obj)).mCachePlaylogGamesClick.recycle(obj1);
        if (playloggameslogevent.backgroundAction != null)
        {
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesBackgroundActionEvent playloggamesbackgroundactionevent = playloggameslogevent.backgroundAction;
            playloggamesbackgroundactionevent.clear();
            ((EventProtoCache) (obj)).mCachePlaylogGamesBackgroundAction.recycle(playloggamesbackgroundactionevent);
        }
        if (playloggameslogevent.search != null)
        {
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesSearchEvent playloggamessearchevent = playloggameslogevent.search;
            playloggamessearchevent.clear();
            ((EventProtoCache) (obj)).mCachePlaylogGamesSearch.recycle(playloggamessearchevent);
        }
        playloggameslogevent.clear();
        ((EventProtoCache) (obj)).mCachePlaylogGamesLogEvent.recycle(playloggameslogevent);
        return;
    }

    public final void logSettingChangeEvent(int i, boolean flag, boolean flag1, boolean flag2)
    {
        int k = 1;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesBackgroundActionEvent playloggamesbackgroundactionevent;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesLogEvent playloggameslogevent;
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!flag1)
        {
            k = 0;
        }
        playloggamesbackgroundactionevent = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesBackgroundActionEvent();
        playloggamesbackgroundactionevent.actionType = i;
        playloggamesbackgroundactionevent.fromSetting = j;
        playloggamesbackgroundactionevent.toSetting = k;
        playloggamesbackgroundactionevent.operationSuccess = flag2;
        playloggameslogevent = mProtoCache.obtainPlaylogGamesLogEvent();
        playloggameslogevent.backgroundAction = playloggamesbackgroundactionevent;
        logPlaylogEvent(playloggameslogevent);
    }

    public final void logVideoRecordingOnboardingImpression(int i)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesImpressionEvent playloggamesimpressionevent = EventProtoCache.getInstance().obtainPlaylogGamesImpressionEvent();
        playloggamesimpressionevent.tree = obtainPlaylogGamesUiElement(i);
        logImpressionEvent(playloggamesimpressionevent);
    }

    public final void sendImpression(long l, View view, boolean flag)
    {
        Object obj;
        View view1;
        Object obj1;
        obj1 = (LogflowGamesUiElementNode)view.getTag(0x7f0d0061);
        obj = obj1;
        view1 = view;
        if (isValidRootType(((LogflowGamesUiElementNode) (obj1)).getPlaylogGamesUiElement().type)) goto _L2; else goto _L1
_L1:
        view1 = findRootView(view);
        view = (LogflowGamesUiElementNode)view1.getTag(0x7f0d0061);
        obj = view;
        if (isValidRootType(view.getPlaylogGamesUiElement().type)) goto _L2; else goto _L3
_L3:
        if (DBG)
        {
            GamesLog.d("GamesLogflowLogger", String.format("Ignoring impression, root node is not a valid page type=%s.", new Object[] {
                Integer.valueOf(view.getPlaylogGamesUiElement().type)
            }));
        }
_L7:
        return;
_L2:
        SparseArray sparsearray;
        obj1 = new ArrayMap();
        sparsearray = new SparseArray(sFlingingViews.size());
        view = ((View) (FLINGING_VIEW_LOCK));
        view;
        JVM INSTR monitorenter ;
        int i = sFlingingViews.size() - 1;
_L5:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = sFlingingViews.keyAt(i);
        sparsearray.put(j, sFlingingViews.valueAt(i));
        sFlingingViews.delete(j);
        i--;
        if (true) goto _L5; else goto _L4
_L4:
        view;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            buildImpressionTreeDown(view1, ((LogflowGamesUiElementNode) (obj)), sparsearray, ((ArrayMap) (obj1)));
        }
        processFlungViews(((LogflowGamesUiElementNode) (obj)).getPlaylogGamesUiElement(), sparsearray, ((ArrayMap) (obj1)));
        if (flag && ((LogflowGamesUiElementNode) (obj)).getPlaylogGamesUiElement().child.length == 0) goto _L7; else goto _L6
_L6:
        view = EventProtoCache.getInstance().obtainPlaylogGamesImpressionEvent();
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement = obtainPlaylogGamesUiElement(0);
        deepCloneAndWipeChildren(((LogflowGamesUiElementNode) (obj)).getPlaylogGamesUiElement(), playloggamesuielement);
        view.tree = playloggamesuielement;
        if (l != 0L)
        {
            view.id = l;
        }
        logImpressionEvent(view);
        return;
        Exception exception;
        exception;
        view;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag1 = true;
        DBG = ((Boolean)G.verboseGamesPlaylogLogging.get()).booleanValue();
        boolean flag;
        if (DBG)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        VERBOSE_CLICK = flag;
        if (DBG)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        VERBOSE_IMPRESSION = flag;
        LOG_IMPRESSION_SETTLE_TIME_MS = ((Integer)G.playLogImpressionSettleTimeMs.get()).intValue();
    }


    // Unreferenced inner class com/google/android/gms/games/logging/GamesLogflowLogger$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        final GamesLogflowLogger this$0;
        final long val$impressionId;
        final View val$rootView;

        public final void run()
        {
            sendImpression(impressionId, rootView);
        }

            public 
            {
                this$0 = GamesLogflowLogger.this;
                impressionId = l;
                rootView = view;
                super();
            }
    }

}
