// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.app.Application;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.skype.Account;
import com.skype.MediaDocument;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ImageCache;
import com.skype.android.util.MethodTrace;
import com.skype.android.util.cache.SpannedStringCache;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

// Referenced classes of package com.skype.android.mediacontent:
//            MojiContent, PackInfo, MediaContent, EmoticonContent, 
//            OnPackInfoReady, b, OnMediaContentReady, c, 
//            OnVideoReady

public class MediaContentRoster
{
    public static interface PackInfoRequestCallback
    {

        public static final PackInfoRequestCallback a = new PackInfoRequestCallback() {

            public final void onAllPacksReady()
            {
            }

            public final void onContent(PackInfo packinfo, MediaContent mediacontent)
            {
            }

            public final void onPackReady(PackInfo packinfo)
            {
            }

            public final void onPackStart(PackInfo packinfo)
            {
            }

        };

        public abstract void onAllPacksReady();

        public abstract void onContent(PackInfo packinfo, MediaContent mediacontent);

        public abstract void onPackReady(PackInfo packinfo);

        public abstract void onPackStart(PackInfo packinfo);

    }


    private static final Logger a = Logger.getLogger("MediaContentRoster");
    private final com.skype.MediaDocument.DOCUMENT_TYPE b[];
    private final EventBus c;
    private Application d;
    private SkyLib e;
    private ImageCache f;
    private ConcurrentHashMap g;
    private Executor h;
    private ObjectIdMap i;
    private Handler j;
    private Runnable k;
    private Analytics l;
    private EcsConfiguration m;
    private final List n = Collections.synchronizedList(new ArrayList());
    private final Map o = Collections.synchronizedMap(new HashMap());
    private Map p;
    private Map q;
    private Map r;

    public MediaContentRoster(Application application, SkyLib skylib, ObjectIdMap objectidmap, ImageCache imagecache, SpannedStringCache spannedstringcache, Analytics analytics, EcsConfiguration ecsconfiguration, 
            EventBus eventbus)
    {
        b = (new com.skype.MediaDocument.DOCUMENT_TYPE[] {
            com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK
        });
        p = Collections.synchronizedMap(new HashMap());
        d = application;
        e = skylib;
        i = objectidmap;
        f = imagecache;
        l = analytics;
        m = ecsconfiguration;
        g = new ConcurrentHashMap();
        i();
        q = new ConcurrentHashMap();
        r = new ConcurrentHashMap();
        h = Executors.newSingleThreadExecutor();
        j = new Handler(Looper.getMainLooper());
        k = new Runnable(spannedstringcache) {

            final SpannedStringCache a;
            final MediaContentRoster b;

            public final void run()
            {
                a.a();
            }

            
            {
                b = MediaContentRoster.this;
                a = spannedstringcache;
                super();
            }
        };
        c = eventbus;
        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    private MediaContent a(MediaDocument mediadocument)
    {
        static final class _cls6
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.skype.MediaDocument.MEDIA_STATUS.values().length];
                try
                {
                    b[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.skype.MediaDocument.DOCUMENT_TYPE.values().length];
                try
                {
                    a[com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PACK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6.a[mediadocument.getDocTypeProp().ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 68
    //                   2 40
    //                   3 82;
           goto _L1 _L2 _L1 _L3
_L1:
        Object obj;
        a.warning(String.format("%s is an unsupported item for the picker", new Object[] {
            mediadocument.getDocTypeProp()
        }));
        obj = null;
_L5:
        return ((MediaContent) (obj));
_L2:
        return a(mediadocument.getTitleProp(), com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
_L3:
        MojiContent mojicontent1 = (MojiContent)a((new StringBuilder()).append(mediadocument.getObjectID()).toString(), com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK);
        obj = mojicontent1;
        if (mojicontent1 == null)
        {
            MojiContent mojicontent = new MojiContent(d, mediadocument, f);
            a((new StringBuilder()).append(mediadocument.getObjectID()).toString(), ((MediaContent) (mojicontent)));
            return mojicontent;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    static List a(MediaContentRoster mediacontentroster)
    {
        return mediacontentroster.n;
    }

    private ConcurrentHashMap a(com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        return (ConcurrentHashMap)g.get(document_type);
    }

    static void a(MediaContentRoster mediacontentroster, int i1, int j1, PackInfoRequestCallback packinforequestcallback)
    {
        PackInfo packinfo;
        Object obj1;
        MediaDocument mediadocument = (MediaDocument)mediacontentroster.i.a(i1, com/skype/MediaDocument);
        if (mediadocument.getDocTypeProp() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PACK)
        {
            a.severe(String.format("%d is not a pack id (type=%s)", new Object[] {
                Integer.valueOf(i1), mediadocument.getDocTypeProp()
            }));
            return;
        }
        packinfo = new PackInfo(i1, j1, mediadocument);
        packinforequestcallback.onPackStart(packinfo);
        if (packinfo.k())
        {
            if (packinfo.l())
            {
                obj1 = mediacontentroster.o;
                Object obj;
                if (!packinfo.l())
                {
                    obj = "";
                } else
                {
                    obj = packinfo.h().substring(11);
                }
                ((Map) (obj1)).put(obj, packinfo);
            }
        } else
        {
            mediacontentroster.n.add(packinfo);
        }
        obj = mediacontentroster.e.getEmoticonListFromPack(i1);
        if (!((com.skype.SkyLib.GetEmoticonListFromPack_Result) (obj)).m_return) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L10:
        if (i1 >= ((com.skype.SkyLib.GetEmoticonListFromPack_Result) (obj)).m_mediaDocuments.length) goto _L2; else goto _L3
_L3:
        j1 = ((com.skype.SkyLib.GetEmoticonListFromPack_Result) (obj)).m_mediaDocuments[i1];
        obj1 = mediacontentroster.a((MediaDocument)mediacontentroster.i.a(j1, com/skype/MediaDocument));
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        ((MediaContent) (obj1)).a(i1);
        _cls6.a[((MediaContent) (obj1)).n().ordinal()];
        JVM INSTR tableswitch 1 3: default 240
    //                   1 287
    //                   2 240
    //                   3 295;
           goto _L6 _L7 _L6 _L8
_L6:
        packinforequestcallback.onContent(packinfo, ((MediaContent) (obj1)));
_L5:
        i1++;
        continue; /* Loop/switch isn't completed */
_L7:
        ((EmoticonContent)obj1).i();
_L8:
        packinfo.a(((MediaContent) (obj1)));
        if (true) goto _L6; else goto _L2
_L2:
        packinforequestcallback.onPackReady(packinfo);
        a.info(String.format("found pack %s (id %d) with %d items, hidden? %b featured pack? %b", new Object[] {
            packinfo.h(), Integer.valueOf(packinfo.c()), Integer.valueOf(packinfo.c.size()), Boolean.valueOf(packinfo.k()), Boolean.valueOf(packinfo.l())
        }));
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static void a(MediaContentRoster mediacontentroster, MediaDocument mediadocument, MediaLinkProfile medialinkprofile)
    {
        MediaContent mediacontent = mediacontentroster.a(mediadocument);
        if (mediacontent == null)
        {
            a.severe(String.format("Unsupported profile (%s) for mediaDocument (%s)", new Object[] {
                medialinkprofile.toString(), mediadocument.getDocTypeProp()
            }));
        } else
        {
            mediacontentroster.q.put(Integer.valueOf(mediadocument.getObjectID()), mediacontent);
            if (mediadocument.getMediaLink(medialinkprofile.toString()).m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
            {
                mediacontentroster.b(mediadocument);
                return;
            }
        }
    }

    static void a(MediaContentRoster mediacontentroster, PackInfoRequestCallback packinforequestcallback)
    {
        PackInfo packinfo;
        for (Iterator iterator = mediacontentroster.n.iterator(); iterator.hasNext(); packinforequestcallback.onPackReady(packinfo))
        {
            packinfo = (PackInfo)iterator.next();
            mediacontentroster.a(packinfo);
            packinforequestcallback.onPackStart(packinfo);
            for (Iterator iterator1 = packinfo.c.iterator(); iterator1.hasNext(); packinforequestcallback.onContent(packinfo, (MediaContent)iterator1.next())) { }
        }

    }

    static void a(MediaContentRoster mediacontentroster, PackInfo packinfo)
    {
        mediacontentroster.a(packinfo);
    }

    private void a(PackInfo packinfo)
    {
        Object obj = (PackInfo)o.remove(packinfo.h());
        if (obj != null && ((PackInfo) (obj)).h().equals((new StringBuilder("FeaturedIn-")).append(packinfo.h()).toString()))
        {
            if (packinfo.e() != ((PackInfo) (obj)).e())
            {
                a.severe(String.format("document type for featured pack %s (type=%s) is not matching pack %s (type=%s)", new Object[] {
                    ((PackInfo) (obj)).h(), ((PackInfo) (obj)).e(), packinfo.h(), packinfo.e()
                }));
            } else
            {
                a.info(String.format("merging pack %s (%d items) with %s (%d items)", new Object[] {
                    packinfo.h(), Integer.valueOf(packinfo.a()), ((PackInfo) (obj)).h(), Integer.valueOf(((PackInfo) (obj)).c.size())
                }));
                obj = ((PackInfo) (obj)).c.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    MediaContent mediacontent = (MediaContent)((Iterator) (obj)).next();
                    if (packinfo.a.contains(mediacontent))
                    {
                        packinfo.a.remove(mediacontent);
                    }
                    if (!packinfo.b.contains(mediacontent))
                    {
                        packinfo.b.add(mediacontent);
                    }
                }
            }
        }
        c.a(new OnPackInfoReady(packinfo));
    }

    private void a(String s, MediaContent mediacontent)
    {
        a(mediacontent.n()).put(s, mediacontent);
    }

    static PackInfo b(MediaContentRoster mediacontentroster, PackInfoRequestCallback packinforequestcallback)
    {
        PackInfo packinfo = new PackInfo(-1, 0, null);
        packinforequestcallback.onPackStart(packinfo);
        mediacontentroster = mediacontentroster.a(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON).values().iterator();
        do
        {
            if (!mediacontentroster.hasNext())
            {
                break;
            }
            EmoticonContent emoticoncontent = (EmoticonContent)(MediaContent)mediacontentroster.next();
            if (emoticoncontent.h().c() && emoticoncontent.d())
            {
                packinfo.a(emoticoncontent);
                packinforequestcallback.onContent(packinfo, emoticoncontent);
            }
        } while (true);
        Collections.sort(packinfo.a);
        packinforequestcallback.onPackReady(packinfo);
        return packinfo;
    }

    private void b(MediaDocument mediadocument)
    {
        if (mediadocument.getMetadataStringValue("description").m_return)
        {
            d(mediadocument.getObjectID());
            return;
        } else
        {
            mediadocument.sync();
            return;
        }
    }

    static void b(MediaContentRoster mediacontentroster, PackInfo packinfo)
    {
label0:
        {
            if (mediacontentroster.r.get(Integer.valueOf(packinfo.c())) == null)
            {
                com.skype.MediaDocument.GetMediaLink_Result getmedialink_result = packinfo.j().getMediaLink(MediaLinkProfile.THUMBNAIL_PROFILE.toString());
                if (getmedialink_result.m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
                {
                    break label0;
                }
                packinfo.a(getmedialink_result.m_path);
                mediacontentroster.a(packinfo);
            }
            return;
        }
        mediacontentroster.r.put(Integer.valueOf(packinfo.c()), packinfo);
    }

    static int[] b(MediaContentRoster mediacontentroster)
    {
        mediacontentroster = mediacontentroster.e.getPackList("default");
        if (!((com.skype.SkyLib.GetPackList_Result) (mediacontentroster)).m_return)
        {
            return new int[0];
        } else
        {
            return ((com.skype.SkyLib.GetPackList_Result) (mediacontentroster)).m_mediaDocuments;
        }
    }

    static Analytics c(MediaContentRoster mediacontentroster)
    {
        return mediacontentroster.l;
    }

    static EcsConfiguration d(MediaContentRoster mediacontentroster)
    {
        return mediacontentroster.m;
    }

    private void d(int i1)
    {
        q.remove(Integer.valueOf(i1));
        c.a(new OnMediaContentReady(i1));
    }

    static ObjectIdMap e(MediaContentRoster mediacontentroster)
    {
        return mediacontentroster.i;
    }

    static Map f(MediaContentRoster mediacontentroster)
    {
        return mediacontentroster.q;
    }

    static Logger g()
    {
        return a;
    }

    private void h()
    {
        j.removeCallbacks(k);
        j.postDelayed(k, 3000L);
    }

    private void i()
    {
        g.clear();
        com.skype.MediaDocument.DOCUMENT_TYPE adocument_type[] = b;
        int j1 = adocument_type.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            com.skype.MediaDocument.DOCUMENT_TYPE document_type = adocument_type[i1];
            g.put(document_type, new ConcurrentHashMap());
        }

    }

    private void j()
        throws Exception
    {
        Object obj;
        Object obj1;
        MethodTrace methodtrace;
        methodtrace = new MethodTrace("Emoticons", "updateFromSmileyDefs");
        obj1 = null;
        obj = obj1;
        Object obj2 = d.getResources();
        obj = obj1;
        obj1 = ((Resources) (obj2)).openRawResource(((Resources) (obj2)).getIdentifier("smileydefs", "raw", d.getPackageName()));
        obj = obj1;
        obj2 = new c(e, d, f);
        obj = obj1;
        Object obj3 = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
        obj = obj1;
        ((XMLReader) (obj3)).setContentHandler(((org.xml.sax.ContentHandler) (obj2)));
        obj = obj1;
        ((XMLReader) (obj3)).parse(new InputSource(((InputStream) (obj1))));
        obj = obj1;
        obj2 = ((c) (obj2)).a().iterator();
_L2:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        obj3 = (EmoticonContent)((Iterator) (obj2)).next();
        obj = obj1;
        a(((EmoticonContent) (obj3)).e(), ((MediaContent) (obj3)));
        obj = obj1;
        p.put(((EmoticonContent) (obj3)).e(), obj3);
        if (true) goto _L2; else goto _L1
        obj1;
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        throw obj1;
_L1:
        if (obj1 != null)
        {
            ((InputStream) (obj1)).close();
        }
        methodtrace.b();
        return;
    }

    public final MediaContent a(String s, com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        switch (_cls6.a[document_type.ordinal()])
        {
        case 2: // '\002'
        default:
            return null;

        case 1: // '\001'
            return (MediaContent)((ConcurrentHashMap)g.get(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON)).get(s);

        case 3: // '\003'
            return (MediaContent)((ConcurrentHashMap)g.get(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)).get(s);
        }
    }

    public final PackInfo a(int i1)
    {
        for (Iterator iterator = n.iterator(); iterator.hasNext();)
        {
            PackInfo packinfo = (PackInfo)iterator.next();
            if (i1 == packinfo.c())
            {
                return packinfo;
            }
        }

        return null;
    }

    public final void a()
    {
        h.execute(new Runnable() {

            final MediaContentRoster a;

            public final void run()
            {
                a.c();
            }

            
            {
                a = MediaContentRoster.this;
                super();
            }
        });
    }

    public final void a(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        if (((Account)onpropertychange.getSender()).getStatusProp() == com.skype.Account.STATUS.LOGGED_IN && onpropertychange.getPropKey() == PROPKEY.ACCOUNT_STATUS)
        {
            q.clear();
            p.clear();
            h.execute(new Runnable() {

                final MediaContentRoster a;

                public final void run()
                {
                    a.c();
                }

            
            {
                a = MediaContentRoster.this;
                super();
            }
            });
        }
    }

    public final void a(com.skype.android.gen.MediaDocumentListener.OnDownloadError ondownloaderror)
    {
        MediaDocument mediadocument = ondownloaderror.getSender();
        if (mediadocument.getDocTypeProp() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON && ondownloaderror.getIsCritical())
        {
            l.a(AnalyticsEvent.bS, mediadocument.getTitleProp());
        }
    }

    public final void a(com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
    {
        Object obj = onmedialinkstatuschange.getSender();
        _cls6.b[onmedialinkstatuschange.getStatus().ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 45
    //                   2 341
    //                   3 341;
           goto _L1 _L2 _L3 _L3
_L5:
        return;
_L2:
        switch (_cls6.a[((MediaDocument) (obj)).getDocTypeProp().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            String s = ((MediaDocument) (obj)).getTitleProp();
            EmoticonContent emoticoncontent = (EmoticonContent)a(s, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
            if (emoticoncontent != null)
            {
                onmedialinkstatuschange = onmedialinkstatuschange.getProfile();
                emoticoncontent.a(onmedialinkstatuschange);
                emoticoncontent.a(onmedialinkstatuschange, ((MediaDocument) (obj)).getMediaLink(onmedialinkstatuschange));
                l.a(AnalyticsEvent.bT, s);
                onmedialinkstatuschange = emoticoncontent.b(onmedialinkstatuschange);
                if (onmedialinkstatuschange != null)
                {
                    long l1 = (System.currentTimeMillis() - onmedialinkstatuschange.longValue()) / 1000L;
                    l.a(AnalyticsEvent.bU, Analytics.a(l1));
                }
            }
            d(((MediaDocument) (obj)).getObjectID());
            return;

        case 2: // '\002'
            obj = (PackInfo)r.get(Integer.valueOf(((MediaDocument) (obj)).getObjectID()));
            if (obj != null)
            {
                r.remove(Integer.valueOf(((PackInfo) (obj)).c()));
                ((PackInfo) (obj)).a(onmedialinkstatuschange.getPath());
                a(((PackInfo) (obj)));
                return;
            }
            break;

        case 3: // '\003'
            if (!MediaLinkProfile.THUMBNAIL_PROFILE.toString().equals(onmedialinkstatuschange.getProfile()))
            {
                continue; /* Loop/switch isn't completed */
            }
            continue; /* Loop/switch isn't completed */
        }
_L1:
        if (true) goto _L5; else goto _L4
_L4:
        if ((MediaContent)q.get(Integer.valueOf(((MediaDocument) (obj)).getObjectID())) == null) goto _L5; else goto _L6
_L6:
        b(((MediaDocument) (obj)));
        return;
        if (!MediaLinkProfile.DEFAULT_PROFILE.toString().equals(onmedialinkstatuschange.getProfile())) goto _L5; else goto _L7
_L7:
        c.a(new OnVideoReady(((MediaDocument) (obj)).getObjectID(), onmedialinkstatuschange.getPath()));
        return;
_L3:
        q.remove(Integer.valueOf(onmedialinkstatuschange.getSender().getObjectID()));
        return;
    }

    public final void a(com.skype.android.gen.MediaDocumentListener.OnMetadataUpdated onmetadataupdated)
    {
        onmetadataupdated = onmetadataupdated.getSender();
        _cls6.a[onmetadataupdated.getDocTypeProp().ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 45
    //                   2 44
    //                   3 45;
           goto _L1 _L2 _L1 _L2
_L1:
        return;
_L2:
        if ((MediaContent)q.get(Integer.valueOf(onmetadataupdated.getObjectID())) != null)
        {
            d(onmetadataupdated.getObjectID());
        }
        onmetadataupdated = (EmoticonContent)a(onmetadataupdated.getTitleProp(), com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
        if (onmetadataupdated != null)
        {
            onmetadataupdated.i();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(PackInfoRequestCallback packinforequestcallback)
    {
        h.execute(new Runnable(packinforequestcallback) {

            final PackInfoRequestCallback a;
            final MediaContentRoster b;

            public final void run()
            {
                if (MediaContentRoster.a(b).size() == 0) goto _L2; else goto _L1
_L1:
                MediaContentRoster.g().info("packs ready");
                MediaContentRoster.a(b, a);
_L4:
                a.onAllPacksReady();
                return;
_L2:
                int ai[];
                ai = MediaContentRoster.b(b);
                if (ai.length != 0)
                {
                    break; /* Loop/switch isn't completed */
                }
                MediaContentRoster.g().info("no packs found, returning default emoticons pack");
                MediaContentRoster.a(b, MediaContentRoster.b(b, a));
                MediaContentRoster.c(b).c(AnalyticsEvent.bV);
                if (true) goto _L4; else goto _L3
_L3:
                MediaContentRoster.g().info(String.format("%d packs available", new Object[] {
                    Integer.valueOf(ai.length)
                }));
                for (int i1 = 0; i1 < ai.length; i1++)
                {
                    MediaContentRoster.a(b, ai[i1], i1, a);
                }

                Iterator iterator = MediaContentRoster.a(b).iterator();
                while (iterator.hasNext()) 
                {
                    PackInfo packinfo = (PackInfo)iterator.next();
                    MediaContentRoster.b(b, packinfo);
                    packinfo.a(MediaContentRoster.d(b).isMojiSectionEnabled());
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            
            {
                b = MediaContentRoster.this;
                a = packinforequestcallback;
                super();
            }
        });
    }

    public final void b()
    {
        h();
    }

    public final void b(int i1)
    {
        h.execute(new Runnable(i1) {

            final int a;
            final MediaContentRoster b;

            public final void run()
            {
                MediaDocument mediadocument = (MediaDocument)MediaContentRoster.e(b).a(a, com/skype/MediaDocument);
                if (mediadocument.getDocTypeProp() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON && mediadocument.getDocTypeProp() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
                {
                    MediaContentRoster.g().severe(String.format("%d is not an emotion or a Moji (type=%s)", new Object[] {
                        Integer.valueOf(a), mediadocument.getDocTypeProp()
                    }));
                } else
                if (MediaContentRoster.f(b).get(Integer.valueOf(a)) == null)
                {
                    MediaContentRoster.a(b, mediadocument, MediaLinkProfile.THUMBNAIL_PROFILE);
                    return;
                }
            }

            
            {
                b = MediaContentRoster.this;
                a = i1;
                super();
            }
        });
    }

    public final void c()
    {
        a.info("invalidating media content data");
        n.clear();
        q.clear();
        r.clear();
        o.clear();
        i();
        MethodTrace methodtrace = new MethodTrace("Emoticons", "updateFromList");
        com.skype.SkyLib.GetEmoticonList_Result getemoticonlist_result = e.getEmoticonList("all");
        HashSet hashset = new HashSet();
        ConcurrentHashMap concurrenthashmap = a(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
        int i1 = 0;
        while (i1 < getemoticonlist_result.m_mediaDocuments.length) 
        {
            int j1 = getemoticonlist_result.m_mediaDocuments[i1];
            MediaDocument mediadocument = (MediaDocument)i.a(j1, com/skype/MediaDocument);
            String s = mediadocument.getTitleProp();
            Object obj = mediadocument.getDescriptionProp();
            mediadocument.sync();
            b b1 = new b();
            b1.a(s);
            b1.b(0);
            b1.a(0);
            b1.c(24);
            EmoticonContent emoticoncontent = (EmoticonContent)p.get(s);
            if (emoticoncontent != null)
            {
                b1.b(emoticoncontent.f());
            } else
            {
                b1.b(((String) (obj)));
            }
            emoticoncontent = (EmoticonContent)a(s, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
            obj = emoticoncontent;
            if (emoticoncontent == null)
            {
                obj = new EmoticonContent(d, f, b1, mediadocument);
            }
            ((EmoticonContent) (obj)).i();
            ((EmoticonContent) (obj)).a(i1);
            concurrenthashmap.put(s, obj);
            hashset.add(((EmoticonContent) (obj)).e());
            i1++;
        }
        if (hashset.size() > 0)
        {
            concurrenthashmap.keySet().retainAll(hashset);
        }
        if (concurrenthashmap.isEmpty())
        {
            try
            {
                j();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        h();
        methodtrace.b();
        a(PackInfoRequestCallback.a);
    }

    public final void c(int i1)
    {
        Object obj = (MediaDocument)i.a(i1, com/skype/MediaDocument);
        if (((MediaDocument) (obj)).getDocTypeProp() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
        {
            a.severe(String.format("%d is not an a Moji, no video to request (type=%s)", new Object[] {
                Integer.valueOf(i1), ((MediaDocument) (obj)).getDocTypeProp()
            }));
        }
        obj = ((MediaDocument) (obj)).getMediaLink(MediaLinkProfile.DEFAULT_PROFILE.toString());
        if (((com.skype.MediaDocument.GetMediaLink_Result) (obj)).m_return == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
        {
            c.a(new OnVideoReady(i1, ((com.skype.MediaDocument.GetMediaLink_Result) (obj)).m_path));
        }
    }

    public final void d()
    {
        a(PackInfoRequestCallback.a);
    }

    public final boolean e()
    {
        for (Iterator iterator = n.iterator(); iterator.hasNext();)
        {
            PackInfo packinfo = (PackInfo)iterator.next();
            if (!packinfo.g() && (packinfo.e() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK || m.isMojiSupported()))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean f()
    {
        for (Iterator iterator = n.iterator(); iterator.hasNext();)
        {
            if (((PackInfo)iterator.next()).e() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
            {
                return true;
            }
        }

        return false;
    }

}
