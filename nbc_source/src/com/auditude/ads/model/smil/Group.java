// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.smil;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.event.AdPluginEvent;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.repackaging.AssetRepackager;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.IEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.model.smil:
//            ISMILIterator, SmilElementType, Ref, Sequence, 
//            Par

public class Group
    implements ISMILIterator, Par.ParResoultionCompleteListener, com.auditude.ads.repackaging.AssetRepackager.AssetRepackagingCompletionListener, IEventListener
{
    public static interface PrefetchCompleteListener
    {

        public abstract void onPrefetchComplete(ArrayList arraylist);
    }


    private ArrayList adPluginEvents;
    private AdSettings adSettings;
    private Sequence currentSequence;
    private int duration;
    private int index;
    private boolean isWatched;
    private int maxDuration;
    private PrefetchCompleteListener prefetchListener;
    private int prefetchParCount;
    private int repackageAssetCount;
    private boolean repackageCreatives;
    private ArrayList repackagerArray;
    private int sequenceIteratorIndex;
    private ArrayList sequenceList;
    private boolean skipCurrentSequence;
    private int startTime;
    private SmilElementType type;

    public Group(SmilElementType smilelementtype, int i, AdSettings adsettings)
    {
        isWatched = false;
        maxDuration = 0;
        duration = 0;
        startTime = 0;
        index = 0;
        sequenceIteratorIndex = -1;
        type = SmilElementType.values()[0];
        sequenceList = new ArrayList();
        skipCurrentSequence = false;
        prefetchParCount = 0;
        repackageCreatives = false;
        repackageAssetCount = 0;
        type = smilelementtype;
        index = i;
        adSettings = adsettings;
    }

    private void notifyPrefetchComplete()
    {
        if (prefetchListener != null)
        {
            prefetchListener.onPrefetchComplete(adPluginEvents);
            prefetchListener = null;
        }
        if (adPluginEvents != null)
        {
            adPluginEvents.clear();
            adPluginEvents = null;
        }
    }

    private void repackageIncompatibleCreatives()
    {
        if (type == SmilElementType.LINEAR) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist;
        repackagerArray = null;
        arraylist = getRefs();
        if (arraylist == null || arraylist.size() <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        boolean flag;
        flag = false;
        if (adSettings.getProperty("repackageCreativeEnabled") != null)
        {
            flag = Boolean.valueOf(adSettings.getProperty("repackageCreativeEnabled").toString()).booleanValue();
        }
        obj = "";
        if (adSettings.getProperty("repackageCreativeFormat") != null)
        {
            obj = adSettings.getProperty("repackageCreativeFormat").toString();
        }
        if (!StringUtil.isNotNullOrEmpty(((String) (obj))) || !flag) goto _L6; else goto _L5
_L5:
        Iterator iterator;
        repackagerArray = new ArrayList();
        iterator = arraylist.iterator();
_L7:
        do
        {
            if (!iterator.hasNext())
            {
                Object obj1;
                Asset asset;
                Iterator iterator1;
                MediaFile mediafile;
                if (repackagerArray.size() > 0)
                {
                    repackageAssetCount = repackagerArray.size();
                    obj = repackagerArray.iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        ((AssetRepackager)((Iterator) (obj)).next()).repackage();
                    }
                } else
                {
                    notifyPrefetchComplete();
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (Ref)iterator.next();
        } while (((Ref) (obj1)).getPrimaryAsset() == null);
        asset = ((Ref) (obj1)).getPrimaryAsset();
        obj1 = Boolean.valueOf(false);
        iterator1 = asset.getMediaFiles().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                if (!((Boolean) (obj1)).booleanValue() && ((Ad)asset.getParent()).isRepackagingEnabled())
                {
                    obj1 = new AssetRepackager(this, asset, ((String) (obj)), adSettings.getDomain(), adSettings.getZoneId());
                    repackagerArray.add(obj1);
                }
                continue; /* Loop/switch isn't completed */
            }
            mediafile = (MediaFile)iterator1.next();
            if (mediafile != null && StringUtil.isNotNullOrEmpty(mediafile.mimeType) && ((String) (obj)).toLowerCase().equalsIgnoreCase(mediafile.mimeType))
            {
                obj1 = Boolean.valueOf(true);
            }
        } while (true);
_L6:
        notifyPrefetchComplete();
        return;
        if (true) goto _L7; else goto _L4
_L4:
        notifyPrefetchComplete();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void addSequence(Sequence sequence)
    {
        if (sequence != null)
        {
            sequenceList.add(sequence);
            if (sequence.getMaxDuration() >= 0)
            {
                maxDuration = maxDuration + sequence.getMaxDuration();
            }
            if (sequence.getDuration() >= 0)
            {
                duration = duration + sequence.getDuration();
            }
        }
    }

    public final void begin()
    {
        reset();
        isWatched = true;
        skipCurrentSequence = false;
        currentSequence = null;
    }

    public final void dispose()
    {
        currentSequence = null;
        Iterator iterator = sequenceList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                sequenceList = null;
                return;
            }
            ((Sequence)iterator.next()).dispose();
        } while (true);
    }

    public final void end()
    {
        end(true);
    }

    public final void end(boolean flag)
    {
        isWatched = true;
        skipCurrentSequence = false;
        if (currentSequence != null)
        {
            currentSequence.end(flag);
            currentSequence = null;
        }
    }

    public final Par getCurrent()
    {
        if (currentSequence != null)
        {
            return currentSequence.getCurrent();
        } else
        {
            return null;
        }
    }

    public volatile Object getCurrent()
    {
        return getCurrent();
    }

    public final HashMap getDescription()
    {
        int j = 0;
        int i = 0;
        Object obj = sequenceList.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                obj = new HashMap();
                ((HashMap) (obj)).put("startTime", Integer.valueOf(startTime));
                ((HashMap) (obj)).put("isEmpty", Boolean.valueOf(isEmpty()));
                ((HashMap) (obj)).put("breakDuration", Integer.valueOf(j));
                ((HashMap) (obj)).put("breakIndex", Integer.valueOf(index));
                ((HashMap) (obj)).put("adCount", Integer.valueOf(i));
                return ((HashMap) (obj));
            }
            HashMap hashmap = ((Sequence)((Iterator) (obj)).next()).getPlayableMetrics();
            j += ((Integer)hashmap.get(Sequence.PLAYABLE_DURATION)).intValue();
            i += ((Integer)hashmap.get(Sequence.PLAYABLE_AD_COUNT)).intValue();
        } while (true);
    }

    public final int getDuration()
    {
        return duration;
    }

    public final int getIndex()
    {
        return index;
    }

    public final int getMaxDuration()
    {
        return maxDuration;
    }

    public final Par getNext()
    {
        Object obj = currentSequence;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Sequence) (obj)).getNext();
        if (obj == null) goto _L2; else goto _L3
_L3:
        return ((Par) (obj));
_L2:
        int i = sequenceIteratorIndex + 1;
        do
        {
            if (i >= sequenceList.size())
            {
                return null;
            }
            Par par = ((Sequence)sequenceList.get(i)).getNext();
            obj = par;
            if (par != null)
            {
                continue;
            }
            i++;
        } while (true);
        if (true) goto _L3; else goto _L4
_L4:
    }

    public final ArrayList getPars()
    {
        ArrayList arraylist = new ArrayList();
        if (sequenceList == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < sequenceList.size()) goto _L3; else goto _L2
_L2:
        return arraylist;
_L3:
        arraylist.addAll(((Sequence)sequenceList.get(i)).getPars());
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int getPlayableDuration()
    {
        int i = 0;
        Iterator iterator = sequenceList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return i;
            }
            i += ((Integer)((Sequence)iterator.next()).getPlayableMetrics().get(Sequence.PLAYABLE_DURATION)).intValue();
        } while (true);
    }

    public final ArrayList getRefs()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = sequenceList.iterator();
        do
        {
            Object obj;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        return arraylist;
                    }
                    obj = (Sequence)iterator.next();
                } while (obj == null);
                obj = ((Sequence) (obj)).getRefs();
            } while (obj == null || ((ArrayList) (obj)).size() <= 0);
            arraylist.addAll(((java.util.Collection) (obj)));
        } while (true);
    }

    public final ArrayList getSequenceList()
    {
        return sequenceList;
    }

    public final boolean getSkipCurrentSequence()
    {
        return skipCurrentSequence;
    }

    public final int getStartTime()
    {
        return startTime;
    }

    public final SmilElementType getType()
    {
        return type;
    }

    public final boolean isEmpty()
    {
        if (!sequenceList.isEmpty())
        {
            int i = 0;
            while (i < sequenceList.size()) 
            {
                Sequence sequence = (Sequence)sequenceList.get(i);
                if (sequence != null && !sequence.isEmpty())
                {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean isLinear()
    {
        return type == SmilElementType.LINEAR;
    }

    public final boolean isWatched()
    {
        return isWatched;
    }

    public final void load(PrefetchCompleteListener prefetchcompletelistener, Boolean boolean1, HashMap hashmap)
    {
        prefetchListener = prefetchcompletelistener;
        repackageCreatives = boolean1.booleanValue();
        prefetchcompletelistener = getPars();
        prefetchParCount = prefetchcompletelistener.size();
        if (prefetchParCount > 0)
        {
            prefetchcompletelistener = prefetchcompletelistener.iterator();
            do
            {
                if (!prefetchcompletelistener.hasNext())
                {
                    return;
                }
                boolean1 = (Par)prefetchcompletelistener.next();
                boolean1.addEventListener("error", this);
                boolean1.setParResolutionCompleteListener(this);
                boolean1.resolve(hashmap);
            } while (true);
        } else
        {
            onParResolutionComplete();
            return;
        }
    }

    public final void load(PrefetchCompleteListener prefetchcompletelistener, HashMap hashmap)
    {
        load(prefetchcompletelistener, Boolean.valueOf(false), hashmap);
    }

    public final boolean moveNext()
    {
        if (currentSequence != null)
        {
            if (!skipCurrentSequence && currentSequence.moveNext())
            {
                return true;
            }
            if (currentSequence.getType() == SmilElementType.LINEAR)
            {
                currentSequence.end(true);
                currentSequence = null;
            }
        }
        skipCurrentSequence = false;
        sequenceIteratorIndex = sequenceIteratorIndex + 1;
        do
        {
            if (sequenceIteratorIndex >= sequenceList.size())
            {
                return false;
            }
            currentSequence = (Sequence)sequenceList.get(sequenceIteratorIndex);
            currentSequence.begin();
            if (currentSequence.moveNext())
            {
                return true;
            }
            if (currentSequence.getType() == SmilElementType.LINEAR)
            {
                currentSequence.end(true);
                currentSequence = null;
            }
            sequenceIteratorIndex = sequenceIteratorIndex + 1;
        } while (true);
    }

    public void onEvent(String s, Object obj)
    {
        if (obj instanceof AdPluginEvent)
        {
            if (adPluginEvents == null)
            {
                adPluginEvents = new ArrayList();
            }
            adPluginEvents.add((AdPluginEvent)obj);
        }
    }

    public void onParResolutionComplete()
    {
label0:
        {
            prefetchParCount = prefetchParCount - 1;
            if (prefetchParCount <= 0 && prefetchListener != null)
            {
                if (!repackageCreatives)
                {
                    break label0;
                }
                repackageIncompatibleCreatives();
            }
            return;
        }
        notifyPrefetchComplete();
    }

    public void onRepackagingComplete(Asset asset, boolean flag)
    {
        repackageAssetCount = repackageAssetCount - 1;
        if (repackageAssetCount <= 0)
        {
            repackagerArray = null;
            notifyPrefetchComplete();
        }
    }

    public final void reset()
    {
        sequenceIteratorIndex = -1;
        int i = 0;
        do
        {
            if (i >= sequenceList.size())
            {
                return;
            }
            Sequence sequence = (Sequence)sequenceList.get(i);
            if (sequence != null)
            {
                sequence.reset();
            }
            i++;
        } while (true);
    }

    public final void setSkipCurrentSequence(boolean flag)
    {
        skipCurrentSequence = flag;
    }

    public final void setStartTime(int i)
    {
        startTime = i;
    }

    public final void setWatched(boolean flag)
    {
        isWatched = flag;
    }
}
