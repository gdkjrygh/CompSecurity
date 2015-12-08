// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.loader.AdRequest;
import com.auditude.ads.loader.DataLoader;
import com.auditude.ads.model.Ad;
import com.auditude.ads.model.Asset;
import com.auditude.ads.model.BaseElement;
import com.auditude.ads.model.Click;
import com.auditude.ads.model.ILinearAsset;
import com.auditude.ads.model.INonLinearAsset;
import com.auditude.ads.model.LinearAsset;
import com.auditude.ads.model.NonLinearAsset;
import com.auditude.ads.model.OnPageAsset;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.model.smil.Group;
import com.auditude.ads.model.smil.Par;
import com.auditude.ads.model.smil.Ref;
import com.auditude.ads.model.smil.Sequence;
import com.auditude.ads.model.smil.SmilElementType;
import com.auditude.ads.model.tracking.ParStateSubmission;
import com.auditude.ads.model.tracking.Submission;
import com.auditude.ads.model.tracking.Submissions;
import com.auditude.ads.model.tracking.TrackingEvent;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.XMLUtil;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

// Referenced classes of package com.auditude.ads.response:
//            IResponseParser, AdResponse

public class AuditudeResponseParser
    implements com.auditude.ads.loader.DataLoader.DataLoaderListener, IResponseParser
{

    private static String CRENABLED = "crenabled";
    private static final String MIME_TYPE_TEXT_HTML = "text/html";
    private static String SCR = "scr";
    private AdRequest adRequest;
    private AdResponse adResponse;
    private HashMap ads;
    private ArrayList breaks;
    private ArrayList chapters;
    private DataLoader dataLoader;
    private IResponseParser.ResponseParserListener listener;
    private XmlPullParser parser;
    private HashMap refs;
    private Submissions submissions;
    private int timeout;

    public AuditudeResponseParser()
    {
        submissions = new Submissions();
        breaks = new ArrayList();
        chapters = new ArrayList();
        ads = new HashMap();
        refs = new HashMap();
    }

    private Asset GetAssetForType(String s, BaseElement baseelement)
    {
        if ("linear".equals(s))
        {
            return new LinearAsset(baseelement);
        }
        if ("nonlinear".equals(s))
        {
            return new NonLinearAsset(baseelement);
        }
        if ("companion".equals(s))
        {
            return new OnPageAsset(baseelement);
        } else
        {
            return null;
        }
    }

    private void NotifyError(String s)
    {
    }

    private void applyAdsOnRefs()
    {
        Iterator iterator = refs.entrySet().iterator();
        do
        {
            Ref ref;
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    refs.clear();
                    refs = null;
                    return;
                }
                obj = (java.util.Map.Entry)iterator.next();
                ref = (Ref)((java.util.Map.Entry) (obj)).getKey();
                obj = (String)((java.util.Map.Entry) (obj)).getValue();
            } while (StringUtil.isNullOrEmpty(((String) (obj))) || !ads.containsKey(obj));
            obj = (Ad)ads.get(obj);
            ref.setAd(((Ad) (obj)));
            ref.setAssets(((Ad) (obj)).getAssetsBySegment(ref.getID()));
        } while (true);
    }

    private Boolean hasMimeType(ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        arraylist = arraylist.iterator();
_L4:
        if (arraylist.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return Boolean.valueOf(false);
        if (!((Asset)arraylist.next()).hasAssetsWithMimeType(arraylist1).booleanValue()) goto _L4; else goto _L3
_L3:
        return Boolean.valueOf(true);
    }

    private void parseAd()
        throws XmlPullParserException, IOException
    {
        Object obj;
        Object obj1;
        Ad ad;
        HashMap hashmap;
        Object obj3;
        int i;
        ad = new Ad(null);
        ad.setID(XMLUtil.attributeAsStringOrDefault(parser, "id", null));
        obj1 = null;
        hashmap = new HashMap();
        obj3 = new HashMap();
        obj = new ArrayList();
        i = parser.next();
_L2:
        Object obj2;
        Object obj4;
        obj4 = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("wrapper".equalsIgnoreCase(((String) (obj4))))
        {
            ad.setIsNetworkAd(true);
            ad.setNetworkAdType(parser.getAttributeValue(null, "adSystem"));
            ad.setNetworkAdSource(parser.getAttributeValue(null, "adTagURI"));
            obj2 = obj1;
        } else
        if ("behavior".equalsIgnoreCase(((String) (obj4))))
        {
            obj4 = XMLUtil.attributeAsStringOrDefault(parser, "type", null);
            obj2 = obj1;
            if (obj4 != null)
            {
                obj2 = obj1;
                if (!((String) (obj4)).equalsIgnoreCase(SCR))
                {
                    if (((String) (obj4)).equalsIgnoreCase(CRENABLED))
                    {
                        ad.setRepackagingEnabled(Boolean.valueOf(parser.nextText()).booleanValue());
                        obj2 = obj1;
                    } else
                    {
                        hashmap.put(obj4, StringUtil.ConvertToKeysAndValues(parser.nextText(), "&", "="));
                        obj2 = obj1;
                    }
                }
            }
        } else
        if ("submission".equalsIgnoreCase(((String) (obj4))))
        {
            parseSubmission(ad);
            obj2 = obj1;
        } else
        if ("asset".equalsIgnoreCase(((String) (obj4))))
        {
            obj4 = parseAsset(ad);
            obj2 = obj1;
            if (obj4 != null)
            {
                if (ad.getIsNetworkAd())
                {
                    ad.addTrackingAsset(((Asset) (obj4)));
                    if ((obj4 instanceof ILinearAsset) || (obj4 instanceof INonLinearAsset))
                    {
                        ad.setAuditudeParams(((Asset) (obj4)).getAuditudeParams());
                    }
                    obj2 = obj1;
                    if (obj4 instanceof OnPageAsset)
                    {
                        ((Asset) (obj4)).addTrackingUrlForType(new ParStateSubmission(((Asset) (obj4)).getUrl(), "creativeview"), "creativeview");
                        obj2 = obj1;
                    }
                } else
                {
                    ((ArrayList) (obj)).add(obj4);
                    obj2 = obj1;
                }
            }
        } else
        if ("customdata".equalsIgnoreCase(((String) (obj4))))
        {
            obj4 = XMLUtil.attributeAsStringOrDefault(parser, "type", null);
            obj2 = obj1;
            if (obj4 != null)
            {
                ((HashMap) (obj3)).put(obj4, parser.nextText().split("&"));
                obj2 = obj1;
            }
        } else
        {
            obj2 = obj1;
            if ("smil".equalsIgnoreCase(((String) (obj4))))
            {
                obj2 = parseAdSmil(ad);
            }
        }
_L4:
        i = parser.next();
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2 = obj1;
        if (i != 3) goto _L4; else goto _L3
_L3:
        obj2 = obj1;
        if (!"ad".equalsIgnoreCase(((String) (obj4)))) goto _L4; else goto _L5
_L5:
        if (!StringUtil.isNullOrEmpty(ad.getID()))
        {
            boolean flag = false;
            if (adResponse.getAdSettings().getProperty("repackageCreativeEnabled") != null)
            {
                flag = Boolean.valueOf(adResponse.getAdSettings().getProperty("repackageCreativeEnabled").toString()).booleanValue();
            }
            if (ad.getIsNetworkAd() || flag)
            {
                ads.put(ad.getID(), ad);
            } else
            {
                obj2 = (ArrayList)adResponse.getAdSettings().getProperty("validMimeTypes");
                if (obj2 == null || hasMimeType(((ArrayList) (obj)), ((ArrayList) (obj2))).booleanValue())
                {
                    ads.put(ad.getID(), ad);
                }
            }
        }
        obj2 = ((ArrayList) (obj)).iterator();
_L12:
        if (((Iterator) (obj2)).hasNext()) goto _L7; else goto _L6
_L6:
        obj2 = obj;
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        obj2 = ((HashMap) (obj1)).entrySet().iterator();
_L14:
        if (((Iterator) (obj2)).hasNext()) goto _L11; else goto _L10
_L10:
        obj2 = obj;
_L9:
        hashmap.clear();
        ((ArrayList) (obj2)).clear();
        return;
_L7:
        obj4 = (Asset)((Iterator) (obj2)).next();
        if (hashmap.containsKey(((Asset) (obj4)).getID()))
        {
            HashMap hashmap1 = (HashMap)hashmap.get(((Asset) (obj4)).getID());
            if (hashmap1 != null && hashmap1.containsKey("format"))
            {
                ((Asset) (obj4)).setFormat((String)hashmap1.get("format"));
            }
        }
        ((Asset) (obj4)).setCustomData(((HashMap) (obj3)));
        ad.addAsset(((Asset) (obj4)));
          goto _L12
_L11:
        obj = (java.util.Map.Entry)((Iterator) (obj2)).next();
        obj3 = (String)((java.util.Map.Entry) (obj)).getKey();
        obj4 = (ArrayList)((java.util.Map.Entry) (obj)).getValue();
        obj1 = new ArrayList();
        obj = obj1;
        if (!StringUtil.isNotNullOrEmpty(((String) (obj3)))) goto _L14; else goto _L13
_L13:
        obj = ((ArrayList) (obj4)).iterator();
_L15:
label0:
        {
            if (((Iterator) (obj)).hasNext())
            {
                break label0;
            }
            ad.addSegmentById(((String) (obj3)), (Asset[])((ArrayList) (obj1)).toArray(new Asset[((ArrayList) (obj1)).size()]));
            obj = obj1;
        }
          goto _L14
        Asset asset = ad.getAssetById((String)((Iterator) (obj)).next());
        if (asset != null)
        {
            ((ArrayList) (obj1)).add(asset);
        }
          goto _L15
    }

    private HashMap parseAdSmil(Ad ad)
        throws XmlPullParserException, IOException
    {
        String s1;
        ArrayList arraylist;
        HashMap hashmap;
        int i;
        s1 = null;
        arraylist = null;
        hashmap = new HashMap();
        i = parser.next();
_L2:
        String s;
        Object obj;
        ArrayList arraylist1;
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("par".equalsIgnoreCase(s))
        {
            obj = XMLUtil.attributeAsStringOrDefault(parser, "id", null);
            arraylist1 = new ArrayList();
        } else
        {
            arraylist1 = arraylist;
            obj = s1;
            if ("ref".equalsIgnoreCase(s))
            {
                Object obj1 = null;
                s = XMLUtil.attributeAsStringOrDefault(parser, "asset", null);
                arraylist1 = arraylist;
                obj = s1;
                if (!StringUtil.isNullOrEmpty(s))
                {
                    obj = s.split("\\.");
                    if (obj.length == 1)
                    {
                        s = obj[0];
                    } else
                    {
                        s = obj1;
                        if (obj.length == 2)
                        {
                            s = obj1;
                            if (ad.getID().equals(obj[0]))
                            {
                                s = obj[1];
                            }
                        }
                    }
                    arraylist1 = arraylist;
                    obj = s1;
                    if (!StringUtil.isNullOrEmpty(s))
                    {
                        arraylist.add(s);
                        arraylist1 = arraylist;
                        obj = s1;
                    }
                }
            }
        }
_L3:
        i = parser.next();
        arraylist = arraylist1;
        s1 = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        arraylist1 = arraylist;
        obj = s1;
        if (i == 3)
        {
            if ("par".equalsIgnoreCase(s))
            {
                arraylist1 = arraylist;
                obj = s1;
                if (!StringUtil.isNullOrEmpty(s1))
                {
                    hashmap.put(s1, arraylist);
                    arraylist1 = arraylist;
                    obj = s1;
                }
            } else
            {
                arraylist1 = arraylist;
                obj = s1;
                if ("smil".equalsIgnoreCase(s))
                {
                    return hashmap;
                }
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    private Asset parseAsset(Ad ad)
        throws XmlPullParserException, IOException
    {
        Asset asset = GetAssetForType(XMLUtil.attributeAsStringOrDefault(parser, "contentType", null), ad);
        if (asset != null) goto _L2; else goto _L1
_L1:
        ad = null;
_L8:
        return ad;
_L2:
        int i;
        asset.setID(XMLUtil.attributeAsStringOrDefault(parser, "id", null));
        asset.setDurationInMillis(XMLUtil.attributeAsIntOrDefault(parser, "runtime", 0) * 1000);
        asset.setLeadTimeInMillis(XMLUtil.attributeAsIntOrDefault(parser, "timeOffset", 15) * 1000);
        HashMap hashmap = StringUtil.ConvertToKeysAndValues(XMLUtil.attributeAsStringOrDefault(parser, "parameters", ""), "&", "=");
        if (ad.getNetworkAdType() != null && ad.getNetworkAdType().equalsIgnoreCase("VMAP") && hashmap.containsKey("daisy_chaining"))
        {
            hashmap.remove("daisy_chaining");
        }
        asset.setAuditudeParams(hashmap);
        i = parser.next();
_L4:
        ad = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("mediaFile".equalsIgnoreCase(ad))
        {
            MediaFile mediafile = parseMediaFile(asset);
            if (mediafile != null)
            {
                asset.setCreativeType(mediafile.mimeType);
                if ("text/html".equals(mediafile.mimeType))
                {
                    ad = "iframe";
                } else
                {
                    ad = "static";
                }
                asset.setResourceType(ad);
                asset.AddMediaFile(mediafile);
            }
        } else
        if ("click".equalsIgnoreCase(ad))
        {
            parseClick(asset);
        } else
        if ("tracking".equalsIgnoreCase(ad))
        {
            parseTracking(asset);
        } else
        if ("submission".equalsIgnoreCase(ad))
        {
            parseSubmission(asset);
        }
_L6:
        i = parser.next();
        if (true) goto _L4; else goto _L3
_L3:
        if (i != 3 || !"asset".equalsIgnoreCase(ad)) goto _L6; else goto _L5
_L5:
        if ("linear".equals(asset.getType()))
        {
            ad = asset.getTrackingEventByType("creativeprogress");
            if (ad != null && ad.getTrackingUrls() != null && ad.getTrackingUrls().size() > 0)
            {
                ad = (TrackingUrl)ad.getTrackingUrls().get(0);
                if (ad != null)
                {
                    asset.addTrackingUrlForType(new Submission(ad.getUrl(), "start"), "start");
                    asset.addTrackingUrlForType(new Submission(ad.getUrl(), "firstquartile"), "firstquartile");
                    asset.addTrackingUrlForType(new Submission(ad.getUrl(), "midpoint"), "midpoint");
                    asset.addTrackingUrlForType(new Submission(ad.getUrl(), "thirdquartile"), "thirdquartile");
                    asset.addTrackingUrlForType(new Submission(ad.getUrl(), "complete"), "complete");
                }
            }
        }
        ad = asset;
        if (asset instanceof OnPageAsset)
        {
            ad = asset;
            if (asset.getClick() != null)
            {
                ((Click)asset.getClick()).setShouldAppendParState(true);
                return asset;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void parseClick(Asset asset)
        throws XmlPullParserException, IOException
    {
        Click click1 = (Click)asset.getClick();
        Click click = click1;
        if (click1 == null)
        {
            click = new Click(asset);
            asset.setClick(click);
        }
        click.setUrl(XMLUtil.attributeAsStringOrDefault(parser, "href", null));
        click.setTitle(XMLUtil.attributeAsStringOrDefault(parser, "title", null));
        click.setID(XMLUtil.attributeAsStringOrDefault(parser, "id", null));
        if (asset.isNetworkAd())
        {
            click.addTrackingUrlForType(new TrackingUrl(click.getUrl(), "click"), "click");
        }
        int i;
        do
        {
            do
            {
                i = parser.nextTag();
                asset = parser.getName();
                if (i != 2)
                {
                    break;
                }
                if ("submission".equals(asset))
                {
                    parseSubmission(click);
                }
            } while (true);
        } while (i != 3 || !"click".equals(asset));
    }

    private MediaFile parseMediaFile(Asset asset)
        throws XmlPullParserException, IOException
    {
        asset = new MediaFile();
        asset.source = XMLUtil.attributeAsStringOrDefault(parser, "src", null);
        asset.width = XMLUtil.attributeAsIntOrDefault(parser, "width", 0);
        asset.height = XMLUtil.attributeAsIntOrDefault(parser, "height", 0);
        asset.mimeType = XMLUtil.attributeAsStringOrDefault(parser, "type", null);
        return asset;
    }

    private Par parsePar()
        throws XmlPullParserException, IOException
    {
        Par par;
        int i;
        par = new Par();
        i = parser.next();
_L2:
        Object obj;
        obj = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("meta".equalsIgnoreCase(((String) (obj))))
        {
            if (XMLUtil.attributeAsStringOrDefault(parser, "name", "").equals("priority"))
            {
                par.setPriority(XMLUtil.attributeAsIntOrDefault(parser, "content", 0));
            }
        } else
        if ("setvalue".equalsIgnoreCase(((String) (obj))))
        {
            obj = XMLUtil.attributeAsStringOrDefault(parser, "ref", null);
            if (!StringUtil.isNullOrEmpty(((String) (obj))))
            {
                par.addState(((String) (obj)), XMLUtil.attributeAsStringOrDefault(parser, "value", ""));
            }
        } else
        if ("ref".equalsIgnoreCase(((String) (obj))))
        {
            obj = parseRef(par);
            if (obj != null)
            {
                par.addRef(((Ref) (obj)));
            }
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"par".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
        return par;
    }

    private Ref parseRef(Par par)
        throws XmlPullParserException, IOException
    {
        Ref ref = new Ref(par);
        par = parser.getAttributeValue(null, "src");
        if (!StringUtil.isNullOrEmpty(par) && par.indexOf("urn:ad:") == 0)
        {
            par = par.substring((new String("urn:ad:")).length());
            if (par.indexOf("#") > 0)
            {
                String s = par.substring(0, par.indexOf("#"));
                ref.setID(par.substring(par.indexOf("#") + 1));
                par = s;
            }
            refs.put(ref, par);
        }
        return ref;
    }

    private void parseSMIL()
        throws XmlPullParserException, IOException
    {
        Group group;
        int i;
        int j;
        int k;
        int j1;
        j = 0;
        i = 0;
        group = null;
        k = -1;
        j1 = 2;
_L2:
        Group group1;
        Object obj;
        int l;
        int i1;
        int k1;
        obj = parser.getName();
        if (j1 != 2)
        {
            break MISSING_BLOCK_LABEL_307;
        }
        if (!"head".equalsIgnoreCase(((String) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        parseSMILSubmissions(submissions);
        k1 = i;
        i1 = j;
        l = k;
        group1 = group;
_L4:
        j1 = parser.next();
        group = group1;
        k = l;
        j = i1;
        i = k1;
        if (true) goto _L2; else goto _L1
_L1:
        group1 = group;
        l = k;
        i1 = j;
        k1 = i;
        if (!"seq".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
        l = k + 1;
        obj = parseSequence();
        k = l;
        if (obj == null) goto _L2; else goto _L5
_L5:
label0:
        {
            if (group != null)
            {
                group1 = group;
                k = j;
                if (group.getType() == ((Sequence) (obj)).getType())
                {
                    break label0;
                }
            }
            if (l == 0 && !((Sequence) (obj)).isLinear())
            {
                group = new Group(SmilElementType.LINEAR, j, adResponse.getAdSettings());
                group.setStartTime(0);
                breaks.add(group);
            }
            group1 = new Group(((Sequence) (obj)).getType(), j, adResponse.getAdSettings());
            if (group1.isLinear())
            {
                group1.setStartTime(i);
                breaks.add(group1);
                k = j;
            } else
            {
                k = j + 1;
                group1.setStartTime(i);
                chapters.add(group1);
            }
        }
        j = i;
        if (!((Sequence) (obj)).isLinear())
        {
            j = i + ((Sequence) (obj)).getDuration();
        }
        group1.addSequence(((Sequence) (obj)));
        i1 = k;
        k1 = j;
          goto _L4
        group1 = group;
        l = k;
        i1 = j;
        k1 = i;
        if (j1 == 3)
        {
            group1 = group;
            l = k;
            i1 = j;
            k1 = i;
            if ("smil".equalsIgnoreCase(((String) (obj))))
            {
                return;
            }
        }
          goto _L4
    }

    private void parseSMILData(BaseElement baseelement)
        throws XmlPullParserException, IOException
    {
        HashMap hashmap;
        int i;
        hashmap = new HashMap();
        baseelement.setState(hashmap);
        i = parser.next();
_L2:
        String s;
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        hashmap.put(s, parser.nextText());
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"data".equalsIgnoreCase(s)) goto _L4; else goto _L3
_L3:
        baseelement.setState(hashmap);
        return;
    }

    private void parseSMILSubmissions(BaseElement baseelement)
        throws XmlPullParserException, IOException
    {
        int i = parser.next();
_L2:
        String s;
        s = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("data".equalsIgnoreCase(s))
        {
            parseSMILData(baseelement);
        } else
        if ("submission".equalsIgnoreCase(s))
        {
            parseSubmission(baseelement);
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"head".equalsIgnoreCase(s)) goto _L4; else goto _L3
_L3:
    }

    private Sequence parseSequence()
        throws XmlPullParserException, IOException
    {
        Sequence sequence;
        int i;
        sequence = new Sequence(null, SmilElementType.LINEAR);
        i = parser.next();
_L2:
        Object obj;
        obj = parser.getName();
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("meta".equalsIgnoreCase(((String) (obj))))
        {
            obj = XMLUtil.attributeAsStringOrDefault(parser, "name", "");
            if (((String) (obj)).equals("dur"))
            {
                sequence.setDuration(XMLUtil.attributeAsIntOrDefault(parser, "content", 0) * 1000);
            } else
            if (((String) (obj)).equals("max-dur"))
            {
                sequence.setMaxDuration(XMLUtil.attributeAsIntOrDefault(parser, "content", 0) * 1000);
            } else
            if (((String) (obj)).equals("count"))
            {
                sequence.setCount(XMLUtil.attributeAsIntOrDefault(parser, "content", 0));
            } else
            if (((String) (obj)).equals("max-count"))
            {
                sequence.setMaxCount(XMLUtil.attributeAsIntOrDefault(parser, "content", 0));
            } else
            if (((String) (obj)).equals("creativemaxdur"))
            {
                sequence.setCreativeMaxDuration(XMLUtil.attributeAsIntOrDefault(parser, "content", 0) * 1000);
            } else
            if (((String) (obj)).equals("ctype"))
            {
                if (XMLUtil.attributeAsStringOrDefault(parser, "content", "").equals("linear"))
                {
                    obj = SmilElementType.LINEAR;
                } else
                {
                    obj = SmilElementType.NON_LINEAR;
                }
                if (obj != sequence.getType())
                {
                    sequence.setType(((SmilElementType) (obj)));
                }
            }
        } else
        if ("setvalue".equalsIgnoreCase(((String) (obj))))
        {
            obj = XMLUtil.attributeAsStringOrDefault(parser, "ref", null);
            if (!StringUtil.isNullOrEmpty(((String) (obj))))
            {
                sequence.addState(((String) (obj)), XMLUtil.attributeAsStringOrDefault(parser, "value", ""));
            }
        } else
        if ("par".equalsIgnoreCase(((String) (obj))))
        {
            obj = parsePar();
            if (obj != null)
            {
                sequence.addPar(((Par) (obj)));
            }
        } else
        if ("send".equalsIgnoreCase(((String) (obj))))
        {
            obj = XMLUtil.attributeAsStringOrDefault(parser, "submission", null);
            if (StringUtil.isNotNullOrEmpty(((String) (obj))))
            {
                sequence.setSubmissionId(((String) (obj)));
            }
        }
_L4:
        i = parser.next();
        if (true) goto _L2; else goto _L1
_L1:
        if (i != 3 || !"seq".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
        return sequence;
    }

    private void parseSubmission(BaseElement baseelement)
    {
        baseelement.addTrackingUrlForType(new Submission(parser.getAttributeValue(null, "action"), parser.getAttributeValue(null, "id")), parser.getAttributeValue(null, "id"));
    }

    private void parseTracking(Asset asset)
    {
        String s = XMLUtil.attributeAsStringOrDefault(parser, "action", null);
        Object obj = XMLUtil.attributeAsStringOrDefault(parser, "actuate", null);
        if (StringUtil.isNullOrEmpty(((String) (obj))) && !StringUtil.isNullOrEmpty(s))
        {
            asset.addTrackingUrlForType(new TrackingUrl(s, "creativeview"), "creativeview");
        } else
        {
            if (((String) (obj)).equals("click"))
            {
                Click click = (Click)asset.getClick();
                obj = click;
                if (click == null)
                {
                    obj = new Click(asset);
                    asset.setClick(((com.auditude.ads.model.IClick) (obj)));
                }
                ((Click) (obj)).addTrackingUrlForType(new TrackingUrl(s, "click"), "click");
                return;
            }
            if (((String) (obj)).indexOf("%") > 0)
            {
                switch (Integer.parseInt(((String) (obj)).substring(0, ((String) (obj)).length() - 1)))
                {
                default:
                    return;

                case 0: // '\0'
                    asset.addTrackingUrlForType(new TrackingUrl(s, "start"), "start");
                    return;

                case 25: // '\031'
                    asset.addTrackingUrlForType(new TrackingUrl(s, "firstquartile"), "firstquartile");
                    return;

                case 50: // '2'
                    asset.addTrackingUrlForType(new TrackingUrl(s, "midpoint"), "midpoint");
                    return;

                case 75: // 'K'
                    asset.addTrackingUrlForType(new TrackingUrl(s, "thirdquartile"), "thirdquartile");
                    return;

                case 100: // 'd'
                    asset.addTrackingUrlForType(new TrackingUrl(s, "complete"), "complete");
                    break;
                }
                return;
            }
        }
    }

    private Boolean parseXML(String s)
        throws XmlPullParserException, IOException
    {
        int i;
        if (StringUtil.isNullOrEmpty(s))
        {
            NotifyError("Adserver response is empty");
            return Boolean.valueOf(true);
        }
        Boolean boolean1 = Boolean.valueOf(false);
        parser = XmlPullParserFactory.newInstance().newPullParser();
        parser.setInput(new StringReader(s));
        i = parser.getEventType();
        s = boolean1;
_L1:
        Object obj;
        String s1;
        if (i == 1)
        {
            if (s.booleanValue())
            {
                applyAdsOnRefs();
                return Boolean.valueOf(true);
            } else
            {
                return Boolean.valueOf(false);
            }
        }
        switch (i)
        {
        default:
            obj = s;
            break;

        case 2: // '\002'
            break MISSING_BLOCK_LABEL_126;
        }
        i = parser.next();
        s = ((String) (obj));
          goto _L1
        s1 = parser.getName();
        if (s1.equalsIgnoreCase("response"))
        {
            obj = Boolean.valueOf(true);
        } else
        {
            if (s1.equalsIgnoreCase("error"))
            {
                NotifyError(parser.nextText());
                return Boolean.valueOf(true);
            }
            if (s1.equalsIgnoreCase("smil"))
            {
                parseSMIL();
                obj = s;
            } else
            {
                obj = s;
                if (s1.equalsIgnoreCase("ad"))
                {
                    parseAd();
                    obj = s;
                }
            }
        }
        break MISSING_BLOCK_LABEL_110;
    }

    public void cancel()
    {
        if (dataLoader != null)
        {
            dataLoader.cancel();
        }
    }

    public final void dispose()
    {
        Iterator iterator = breaks.iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        breaks = null;
        iterator = chapters.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        chapters = null;
        iterator = ads.entrySet().iterator();
_L7:
        if (!iterator.hasNext())
        {
            ads = null;
            if (dataLoader != null)
            {
                dataLoader.setDataLoaderListener(null);
                dataLoader = null;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_122;
_L2:
        ((Group)iterator.next()).dispose();
          goto _L5
_L4:
        ((Group)iterator.next()).dispose();
          goto _L6
        ((Ad)((java.util.Map.Entry)iterator.next()).getValue()).dispose();
          goto _L7
    }

    public void loadAdRequest(AdResponse adresponse, AdRequest adrequest, int i)
    {
        adResponse = adresponse;
        adRequest = adrequest;
        timeout = i;
        dataLoader = new DataLoader();
        dataLoader.setDataLoaderListener(this);
        dataLoader.load(adRequest.getAdRequestUrl(), adRequest.getKeyValueString(), timeout);
    }

    public void onRequestComplete(String s)
    {
        s = parseXML(s);
        adResponse.setBreaks(breaks);
        adResponse.setChapters(chapters);
        adResponse.setSubmissions(submissions);
        adResponse.setAds(ads);
        if (s.booleanValue())
        {
            listener.onRequestComplete(null);
            return;
        }
        try
        {
            listener.onRequestFailed(null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
    }

    public void onRequestFailed(Throwable throwable)
    {
        listener.onRequestFailed(throwable);
    }

    public void setResponseParserListener(IResponseParser.ResponseParserListener responseparserlistener)
    {
        listener = responseparserlistener;
    }

}
