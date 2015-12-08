// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.core.APIBridge;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.event.PlayerErrorEvent;
import com.auditude.ads.exception.AssetException;
import com.auditude.ads.loader.AdRequest;
import com.auditude.ads.loader.DataLoader;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.smil.Group;
import com.auditude.ads.model.smil.Par;
import com.auditude.ads.model.smil.Ref;
import com.auditude.ads.model.smil.Sequence;
import com.auditude.ads.model.smil.SmilElementType;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.network.vast.model.VASTDocument;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.event.EventDispatcher;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.auditude.ads.response:
//            IResponseParser, VmapXmlParser, AdResponse, VMAPAdBreak, 
//            VmapXmlNode

public class VMAPParser extends EventDispatcher
    implements com.auditude.ads.loader.DataLoader.DataLoaderListener, IResponseParser
{
    public class sortOnStartTime
        implements Comparator
    {

        final VMAPParser this$0;

        public int compare(VMAPAdBreak vmapadbreak, VMAPAdBreak vmapadbreak1)
        {
            return vmapadbreak.getStartTime() - vmapadbreak1.getStartTime();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((VMAPAdBreak)obj, (VMAPAdBreak)obj1);
        }

        public sortOnStartTime()
        {
            this$0 = VMAPParser.this;
            super();
        }
    }


    public static final String VMAP = "VMAP";
    private ArrayList adBreaks;
    private AdRequest adRequest;
    private AdResponse adResponse;
    private ArrayList breaks;
    private ArrayList chapters;
    private DataLoader dataLoader;
    private IResponseParser.ResponseParserListener listener;
    private Boolean loadFailed;
    private int timeout;
    private Ad trackingAd;
    private VmapXmlParser xmlParser;

    public VMAPParser()
    {
        xmlParser = new VmapXmlParser();
        breaks = new ArrayList();
        chapters = new ArrayList();
        adBreaks = new ArrayList();
        loadFailed = Boolean.valueOf(false);
    }

    private void appendSequenceState(ArrayList arraylist, ArrayList arraylist1)
    {
        int i = 0;
_L4:
        Group group;
        if (i >= arraylist1.size())
        {
            return;
        }
        group = (Group)arraylist1.get(i);
        if (arraylist.size() <= i) goto _L2; else goto _L1
_L1:
        Group group1;
        int j;
        group1 = (Group)arraylist.get(i);
        j = 0;
_L7:
        if (j < group.getSequenceList().size()) goto _L3; else goto _L2
_L2:
        i++;
          goto _L4
_L3:
        Object obj = (Sequence)group.getSequenceList().get(j);
        if (group1.getSequenceList().size() <= j) goto _L6; else goto _L5
_L5:
        Sequence sequence;
        Iterator iterator;
        sequence = (Sequence)group1.getSequenceList().get(j);
        sequence.setSubmissionId(((Sequence) (obj)).getSubmissionId());
        obj = ((Sequence) (obj)).getState();
        iterator = ((HashMap) (obj)).keySet().iterator();
_L8:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_157;
        }
_L6:
        j++;
          goto _L7
        String s = (String)iterator.next();
        sequence.addState(s, (String)((HashMap) (obj)).get(s));
          goto _L8
    }

    private String constructURL(String s)
    {
        String s3;
        Iterator iterator;
        int i;
        s3 = "";
        i = 1;
        iterator = adResponse.getBreaks().iterator();
_L2:
        String s2;
        Group group;
        String s4;
        do
        {
            if (!iterator.hasNext())
            {
                int j = 1320;
                i = -1;
                if ((Integer)AuditudeEnv.getInstance().getAdSettings().getProperty("duration") != null)
                {
                    i = ((Integer)AuditudeEnv.getInstance().getAdSettings().getProperty("duration")).intValue();
                }
                if (i > 0)
                {
                    j = i;
                }
                String s1 = String.valueOf(adRequest.getMediaId());
                return AuditudeUtil.substituteTags(AuditudeUtil.substituteCustomPublisherTags(s, AuditudeEnv.getInstance().getAdSettings().getPassThroughParams()).replaceAll("\\[vdur\\]", Integer.valueOf(j).toString()).replaceAll("\\[pvrn\\]", "[random]").replaceAll("\\[vprn\\]", "[random]").replaceAll("\\[vid\\]", s1).replaceAll("\\[slot\\]", s3));
            }
            group = (Group)iterator.next();
        } while (group.getStartTime() <= 0 || group.getStartTime() >= 0x989680);
        s4 = (new StringBuilder("pod")).append(Integer.valueOf(i).toString()).toString();
        s2 = "midroll";
        if (group.getStartTime() > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = "preroll";
_L4:
        int k = group.getStartTime() / 1000;
        s3 = (new StringBuilder(String.valueOf(s3))).append("slid=").append(s4).append("&slau=").append(s2).append("&h=[height]&w=[width]&tpos=").append(k).append("&ptgt=a&cpsq=").append(Integer.valueOf(i)).append(";").toString();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (group.getStartTime() < 0x989680) goto _L4; else goto _L3
_L3:
        s2 = "postroll";
          goto _L4
    }

    private void createGroups()
    {
        Iterator iterator;
        int i;
        int l;
        int i1;
        i1 = 0;
        i = 0;
        l = 0;
        Collections.sort(adBreaks, new sortOnStartTime());
        iterator = adBreaks.iterator();
_L2:
        Object obj;
        Object obj1;
        VMAPAdBreak vmapadbreak;
        if (!iterator.hasNext())
        {
            if (i1 < 0x186a0)
            {
                Group group = new Group(SmilElementType.NON_LINEAR, l, adResponse.getAdSettings());
                group.setStartTime(i1 * 1000);
                Sequence sequence = new Sequence(null, SmilElementType.NON_LINEAR);
                sequence.setDuration(0x5f5e100);
                group.addSequence(sequence);
                chapters.add(group);
            }
            return;
        }
        vmapadbreak = (VMAPAdBreak)iterator.next();
        int j = i;
        if (i == 0)
        {
            j = i;
            if (vmapadbreak.getStartTime() != 0)
            {
                Group group1 = new Group(SmilElementType.LINEAR, i, adResponse.getAdSettings());
                group1.addSequence(new Sequence(null, SmilElementType.LINEAR));
                breaks.add(group1);
                j = i + 1;
            }
        }
        obj1 = getBreakAt(vmapadbreak.getStartTime() * 1000);
        i = j;
        obj = obj1;
        if (obj1 == null)
        {
            obj = new Group(SmilElementType.LINEAR, j, adResponse.getAdSettings());
            ((Group) (obj)).setStartTime(vmapadbreak.getStartTime() * 1000);
            breaks.add(obj);
            i = j + 1;
        }
        obj1 = new Sequence(null, SmilElementType.LINEAR);
        ((Sequence) (obj1)).setDuration(0x5f5e100);
        ((Group) (obj)).addSequence(((Sequence) (obj1)));
        obj = vmapadbreak.getVastDocuments().iterator();
_L3:
label0:
        {
            if (((Iterator) (obj)).hasNext())
            {
                break label0;
            }
            int k = l;
            if (vmapadbreak.getStartTime() != i1)
            {
                obj = new Group(SmilElementType.NON_LINEAR, l, adResponse.getAdSettings());
                ((Group) (obj)).setStartTime(i1 * 1000);
                obj1 = new Sequence(null, SmilElementType.NON_LINEAR);
                ((Sequence) (obj1)).setDuration((vmapadbreak.getStartTime() - i1) * 1000);
                ((Group) (obj)).addSequence(((Sequence) (obj1)));
                chapters.add(obj);
                k = l + 1;
            }
            i1 = vmapadbreak.getStartTime();
            l = k;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj3;
        obj2 = (VASTDocument)((Iterator) (obj)).next();
        obj3 = vmapadbreak.getTrackingUrls().iterator();
_L4:
label1:
        {
            if (((Iterator) (obj3)).hasNext())
            {
                break label1;
            }
            obj3 = new Ad(null);
            ((Ad) (obj3)).setIsFromVmapDoc(Boolean.valueOf(true));
            ((Ad) (obj3)).setDispatchError(Boolean.valueOf(false));
            ((Ad) (obj3)).setIsNetworkAd(true);
            ((Ad) (obj3)).setNetworkAdType("vast");
            ((Ad) (obj3)).setFollowRedirects(vmapadbreak.getFollowRedirects());
            ((Ad) (obj3)).setAllowMultipleAds(vmapadbreak.getAllowMultipleAds());
            if (trackingAd != null)
            {
                ((Ad) (obj3)).setID(trackingAd.getID());
                ((Ad) (obj3)).setRepackagingEnabled(trackingAd.isRepackagingEnabled());
                ((Ad) (obj3)).addTrackingAsset(trackingAd.getTrackingAssetByType("linear"));
                ((Ad) (obj3)).addTrackingAsset(trackingAd.getTrackingAssetByType("nonlinear"));
                ((Ad) (obj3)).addTrackingAsset(trackingAd.getTrackingAssetByType("companion"));
            }
            Object obj4;
            if (((VASTDocument) (obj2)).adTagURI != null)
            {
                ((Ad) (obj3)).setNetworkAdSource(((VASTDocument) (obj2)).adTagURI);
            } else
            {
                ((Ad) (obj3)).setNetworkAdSource(obj2);
            }
            obj2 = new Par(((Sequence) (obj1)));
            obj4 = new Ref(((Par) (obj2)));
            ((Par) (obj2)).addRef(((Ref) (obj4)));
            ((Ref) (obj4)).setAd(((Ad) (obj3)));
            ((Sequence) (obj1)).addPar(((Par) (obj2)));
        }
          goto _L3
        obj4 = (TrackingUrl)((Iterator) (obj3)).next();
        ((Sequence) (obj1)).addTrackingUrlForType(((TrackingUrl) (obj4)), ((TrackingUrl) (obj4)).getType());
          goto _L4
    }

    private void createRepeatBreaks(VMAPAdBreak vmapadbreak, int i)
    {
        ArrayList arraylist;
        int j;
        int l;
        j = vmapadbreak.getStartTime();
        l = vmapadbreak.getRepeatAfter();
        arraylist = new ArrayList();
        Iterator iterator = adBreaks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                Collections.sort(arraylist);
                break MISSING_BLOCK_LABEL_43;
            }
            VMAPAdBreak vmapadbreak2 = (VMAPAdBreak)iterator.next();
            if (vmapadbreak2.getStartTime() > j)
            {
                arraylist.add(Integer.valueOf(vmapadbreak2.getStartTime()));
            }
        } while (true);
_L2:
        int k;
        if (j + l > i)
        {
            return;
        }
        k = j + l;
        if (arraylist.size() <= 0 || ((Integer)arraylist.get(0)).intValue() >= k)
        {
            VMAPAdBreak vmapadbreak1 = vmapadbreak.getCopy(k);
            adBreaks.add(vmapadbreak1);
        }
_L4:
        j = k;
        if (arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        j = k;
        if (((Integer)arraylist.get(0)).intValue() > k) goto _L2; else goto _L3
_L3:
        arraylist.remove(0);
          goto _L4
    }

    private VMAPAdBreak getAdBreakAt(int i)
    {
        VMAPAdBreak vmapadbreak = new VMAPAdBreak(i);
        adBreaks.add(vmapadbreak);
        return vmapadbreak;
    }

    private AssetException getAssetException(int i, String s)
    {
        s = new AssetException(i, s);
        if (trackingAd != null)
        {
            s.adId = trackingAd.getID();
        }
        return s;
    }

    private Group getBreakAt(int i)
    {
        Iterator iterator = breaks.iterator();
        Group group;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            group = (Group)iterator.next();
        } while (group.getStartTime() != i);
        return group;
    }

    private int getTimeOffset(String s)
    {
        if (s == null || s.length() <= 0)
        {
            return -1;
        }
        int i = -1;
        if ((Integer)AuditudeEnv.getInstance().getAdSettings().getProperty("duration") != null)
        {
            i = ((Integer)AuditudeEnv.getInstance().getAdSettings().getProperty("duration")).intValue();
        }
        if (s.equalsIgnoreCase("start"))
        {
            return 0;
        }
        if (s.equalsIgnoreCase("end"))
        {
            return 0x186a0;
        }
        if (s.matches("(^[-.0-9]+:[-.0-9]+:[-.0-9]+$)"))
        {
            return StringUtil.parseDuration(s);
        }
        if (s.contains("%") && i > 0)
        {
            int j = StringUtil.convertToInt(s.replaceAll("%", ""));
            if (j >= 100)
            {
                return 0x186a0;
            } else
            {
                return (int)(((float)i * (float)j) / 100F) / 1000;
            }
        } else
        {
            return -1;
        }
    }

    public static Boolean isValidParserForResponse(AdResponse adresponse)
    {
        if (adresponse == null) goto _L2; else goto _L1
_L1:
        adresponse = adresponse.getAds();
        if (adresponse == null || adresponse.size() <= 0) goto _L2; else goto _L3
_L3:
        adresponse = adresponse.entrySet().iterator();
_L6:
        if (adresponse.hasNext()) goto _L4; else goto _L2
_L2:
        return Boolean.valueOf(false);
_L4:
        Ad ad = (Ad)((java.util.Map.Entry)adresponse.next()).getValue();
        if (ad.getIsNetworkAd() && ad.getNetworkAdType().equalsIgnoreCase("VMAP"))
        {
            return Boolean.valueOf(true);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void loadVMAP(String s)
    {
        if (s != null)
        {
            dataLoader = new DataLoader();
            dataLoader.setDataLoaderListener(this);
            s = constructURL(s);
            dataLoader.load(s, null, timeout);
            return;
        }
        adResponse.setBreaks(breaks);
        adResponse.setChapters(chapters);
        s = "VMAP load failed";
        if (trackingAd != null)
        {
            s = (new StringBuilder(String.valueOf("VMAP load failed"))).append(": ").append(trackingAd.getNetworkAdSource()).toString();
        }
        listener.onRequestComplete(getAssetException(1109, s));
        logError(1109, s);
        loadFailed = Boolean.valueOf(true);
    }

    private void parseLinearBreak(VmapXmlNode vmapxmlnode)
    {
        int i = getTimeOffset(vmapxmlnode.getAttributeByName("timeOffset"));
        if (i < 0) goto _L2; else goto _L1
_L1:
        VMAPAdBreak vmapadbreak;
        Object obj;
        vmapadbreak = getAdBreakAt(i);
        i = getTimeOffset(vmapxmlnode.getAttributeByName("repeatAfter"));
        if (i >= 0)
        {
            vmapadbreak.setRepeatAfter(i);
        }
        obj = vmapxmlnode.getChildeNodesByName("AdSource");
        if (obj == null || ((ArrayList) (obj)).size() <= 0) goto _L4; else goto _L3
_L3:
        String s;
        Object obj1;
        obj1 = (VmapXmlNode)((ArrayList) (obj)).get(0);
        obj = ((VmapXmlNode) (obj1)).getAttributeByName("allowMultipleAds");
        s = ((VmapXmlNode) (obj1)).getAttributeByName("followRedirects");
        obj1 = ((VmapXmlNode) (obj1)).getChildNodes();
        if (obj1 == null || ((ArrayList) (obj1)).size() <= 0) goto _L4; else goto _L5
_L5:
        obj1 = ((ArrayList) (obj1)).iterator();
_L9:
        if (((Iterator) (obj1)).hasNext()) goto _L6; else goto _L4
_L4:
        vmapxmlnode = vmapxmlnode.getChildeNodesByName("TrackingEvents");
        if (vmapxmlnode == null || vmapxmlnode.size() <= 0) goto _L2; else goto _L7
_L7:
        vmapxmlnode = ((VmapXmlNode)vmapxmlnode.get(0)).getChildeNodesByName("Tracking");
        if (vmapxmlnode == null || vmapxmlnode.size() <= 0) goto _L2; else goto _L8
_L8:
        vmapxmlnode = vmapxmlnode.iterator();
_L10:
        if (vmapxmlnode.hasNext())
        {
            break MISSING_BLOCK_LABEL_328;
        }
_L2:
        return;
_L6:
        Object obj2 = (VmapXmlNode)((Iterator) (obj1)).next();
        if (((VmapXmlNode) (obj2)).getName().equalsIgnoreCase("AdTagURI"))
        {
            vmapadbreak.setAllowMultipleAds(((String) (obj)));
            vmapadbreak.setFollowRedirects(s);
            VASTDocument vastdocument = new VASTDocument(null);
            vastdocument.adTagURI = ((VmapXmlNode) (obj2)).getValue();
            vmapadbreak.addVastDocument(vastdocument);
        }
        if (((VmapXmlNode) (obj2)).getName().equalsIgnoreCase("VASTAdData"))
        {
            obj2 = ((VmapXmlNode) (obj2)).getVastDocuments().iterator();
            while (((Iterator) (obj2)).hasNext()) 
            {
                VASTDocument vastdocument1 = (VASTDocument)((Iterator) (obj2)).next();
                if (vastdocument1 != null)
                {
                    vmapadbreak.setAllowMultipleAds(((String) (obj)));
                    vmapadbreak.setFollowRedirects(s);
                    vmapadbreak.addVastDocument(vastdocument1);
                }
            }
        }
          goto _L9
        VmapXmlNode vmapxmlnode1 = (VmapXmlNode)vmapxmlnode.next();
        vmapadbreak.addTrackingUrl(vmapxmlnode1.getAttributeByName("event"), vmapxmlnode1.getValue());
          goto _L10
    }

    private void parseXML(String s)
        throws XmlPullParserException, IOException
    {
        if (s == null || s.length() <= 0) goto _L2; else goto _L1
_L1:
        xmlParser.parseXML(s);
        s = xmlParser.getChildeNodesByName("AdBreak");
        if (s == null) goto _L2; else goto _L3
_L3:
        s = s.iterator();
_L7:
        if (s.hasNext()) goto _L4; else goto _L2
_L2:
        int i;
        i = -1;
        if ((Integer)AuditudeEnv.getInstance().getAdSettings().getProperty("duration") != null)
        {
            i = ((Integer)AuditudeEnv.getInstance().getAdSettings().getProperty("duration")).intValue();
        }
        if (i <= 0) goto _L6; else goto _L5
_L5:
        Object obj;
        s = new ArrayList();
        obj = adBreaks.iterator();
_L8:
        if (((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_218;
        }
        VMAPAdBreak vmapadbreak;
        for (s = s.iterator(); s.hasNext(); createRepeatBreaks((VMAPAdBreak)s.next(), i / 1000))
        {
            break MISSING_BLOCK_LABEL_244;
        }

_L6:
        if (adBreaks.size() > 0)
        {
            createGroups();
            appendSequenceState(breaks, adResponse.getBreaks());
            appendSequenceState(chapters, adResponse.getChapters());
        }
        return;
_L4:
        obj = (VmapXmlNode)s.next();
        if (((VmapXmlNode) (obj)).getAttributeByName("breakType").split(",")[0].equalsIgnoreCase("linear"))
        {
            parseLinearBreak(((VmapXmlNode) (obj)));
        }
          goto _L7
        vmapadbreak = (VMAPAdBreak)((Iterator) (obj)).next();
        if (vmapadbreak.getRepeatAfter() > 0)
        {
            s.add(vmapadbreak);
        }
          goto _L8
    }

    public void cancel()
    {
        if (dataLoader != null)
        {
            dataLoader.cancel();
        }
    }

    public void loadAdRequest(AdResponse adresponse, AdRequest adrequest, int i)
    {
        adResponse = adresponse;
        adRequest = adrequest;
        timeout = i;
        if (adResponse == null) goto _L2; else goto _L1
_L1:
        adresponse = adResponse.getAds();
        if (adresponse == null || adresponse.size() <= 0) goto _L2; else goto _L3
_L3:
        adresponse = adresponse.entrySet().iterator();
_L8:
        if (adresponse.hasNext()) goto _L4; else goto _L2
_L2:
        listener.onRequestComplete(null);
_L6:
        return;
_L4:
        adrequest = (Ad)((java.util.Map.Entry)adresponse.next()).getValue();
        if (!adrequest.getIsNetworkAd() || !adrequest.getNetworkAdType().equalsIgnoreCase("VMAP"))
        {
            continue; /* Loop/switch isn't completed */
        }
        trackingAd = adrequest;
        if (adrequest.getNetworkAdSource() instanceof String)
        {
            loadVMAP((String)adrequest.getNetworkAdSource());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void logError(int i, String s)
    {
        s = getAssetException(i, s);
        AuditudeEnv.getInstance().getAPI().dispatchEvent("playerError", new PlayerErrorEvent(this, s));
    }

    public void onRequestComplete(String s)
    {
        parseXML(s);
        adResponse.setBreaks(breaks);
        adResponse.setChapters(chapters);
        s = "VMAP returned no ads";
        if (trackingAd != null)
        {
            s = (new StringBuilder(String.valueOf("VMAP returned no ads"))).append(": ").append(trackingAd.getNetworkAdSource()).toString();
        }
        if (listener != null)
        {
            listener.onRequestComplete(getAssetException(1108, s));
        }
        if (!loadFailed.booleanValue() && breaks.size() <= 0)
        {
            logError(1108, s);
        }
_L1:
        return;
        s;
        s.printStackTrace();
        logError(1103, "");
        if (listener != null)
        {
            listener.onRequestComplete(null);
            return;
        }
          goto _L1
        s;
        s.printStackTrace();
        return;
    }

    public void onRequestFailed(Throwable throwable)
    {
        adResponse.setBreaks(breaks);
        adResponse.setChapters(chapters);
        if (throwable instanceof SocketTimeoutException)
        {
            listener.onRequestComplete(null);
            logError(1112, "");
        } else
        {
            throwable = "VMAP load failed";
            if (trackingAd != null)
            {
                throwable = (new StringBuilder(String.valueOf("VMAP load failed"))).append(": ").append(trackingAd.getNetworkAdSource()).toString();
            }
            listener.onRequestComplete(getAssetException(1109, throwable));
            logError(1109, throwable);
        }
        loadFailed = Boolean.valueOf(true);
    }

    public void setResponseParserListener(IResponseParser.ResponseParserListener responseparserlistener)
    {
        listener = responseparserlistener;
    }
}
