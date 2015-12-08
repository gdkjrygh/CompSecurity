// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ChatPerformanceAnalytics;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.networkmanager.DownloadPriority;
import com.snapchat.android.util.cache.DiscoverShareCache;
import com.snapchat.android.util.crypto.CbcEncryptionAlgorithm;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;

public final class CE
{

    private static final CE b = new CE();
    private static Map c = new ConcurrentHashMap();
    public final ChatPerformanceAnalytics a;
    private final oy d;
    private final Kc e;
    private final Kk f;
    private Map g;

    private CE()
    {
        this(oy.a(), Kc.a.a(), ChatPerformanceAnalytics.a(), new Kk());
    }

    private CE(oy oy1, Kc kc, ChatPerformanceAnalytics chatperformanceanalytics, Kk kk)
    {
        g = new HashMap();
        d = oy1;
        e = kc;
        a = chatperformanceanalytics;
        f = kk;
    }

    public static CE a()
    {
        return b;
    }

    public static void a(String s)
    {
        if (c.containsKey(s))
        {
            CD cd = (CD)c.get(s);
            if (cd.d != null)
            {
                cd.b.a(cd.d);
            }
            c.remove(s);
        }
    }

    public static byte[] a(String s, pn pn, String s1, String s2, String s3, boolean flag)
    {
        CC cc = new CC();
        c.put(s3, cc);
        s = cc.a(s, pn, DownloadPriority.HIGH, DownloadPriority.BACKGROUND_MEDIUM, s1, s2, flag);
        c.remove(s3);
        return s;
    }

    public final void a(ChatMedia chatmedia)
    {
        if (chatmedia.H() == null || chatmedia.I() == null)
        {
            d.b(chatmedia.ac(), null);
        }
    }

    public final boolean a(BD bd, boolean flag)
    {
        String s;
        s = bd.d();
        Timber.f("MediaDownloader", "[Conversation] Waiting to load Discover share media with Id [%s].", new Object[] {
            s
        });
        Object obj2 = bd.mExtractionLock;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        Br br;
        Timber.f("MediaDownloader", "[Conversation] Loading Discover share media with Id [%s].", new Object[] {
            s
        });
        br = (Br)Br.UNSAFE_USER_PROVIDER.get();
        obj = Bt.q();
        if (br != null && obj != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Timber.e("MediaDownloader", "[Conversation] Discover share media with Id [%s] failed to load as the user may have logged out.", new Object[] {
            s
        });
        obj2;
        JVM INSTR monitorexit ;
        return false;
        DiscoverShareCache discoversharecache;
        discoversharecache = (DiscoverShareCache)Ka.DISCOVER_SHARE;
        if (!bd.mIsExtracted)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj2;
        JVM INSTR monitorexit ;
        return true;
        if (bd.G() != com.snapchat.android.model.chat.ChatMedia.MediaType.IMAGE) goto _L2; else goto _L1
_L1:
        if (discoversharecache.b(s, com.snapchat.android.util.cache.DiscoverShareCache.DiscoverShareFileType.IMAGE) == null) goto _L4; else goto _L3
_L3:
        obj = e.a(s);
        if (obj == null) goto _L4; else goto _L5
_L5:
        bd.a(((TS) (obj)));
        bd.mIsExtracted = true;
        Timber.f("MediaDownloader", "[Conversation] Loaded Discover share image media and metadata with Id [%s] from cache.", new Object[] {
            s
        });
        obj2;
        JVM INSTR monitorexit ;
        return true;
_L2:
        if (!bd.ak()) goto _L4; else goto _L6
_L6:
        Object obj1 = e.a(s);
        if (obj1 == null) goto _L4; else goto _L7
_L7:
        boolean flag2 = ((TS) (obj1)).j();
        if (!flag2) goto _L9; else goto _L8
_L8:
        obj = discoversharecache.b(s, com.snapchat.android.util.cache.DiscoverShareCache.DiscoverShareFileType.VIDEO_OVERLAY);
_L12:
        byte abyte0[];
        String s1;
        boolean flag1;
        if (discoversharecache.b(s, com.snapchat.android.util.cache.DiscoverShareCache.DiscoverShareFileType.VIDEO_THUMBNAIL) != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1 = discoversharecache.b(s, com.snapchat.android.util.cache.DiscoverShareCache.DiscoverShareFileType.VIDEO);
        if (s1 == null || !flag1 || flag2 && obj == null) goto _L4; else goto _L10
_L10:
        bd.a(((TS) (obj1)));
        bd.a(Uri.parse(s1), ((String) (obj)));
        bd.mIsExtracted = true;
        Timber.f("MediaDownloader", "[Conversation] Loaded Discover share video media and metadata with Id [%s] from cache.", new Object[] {
            s
        });
        obj2;
        JVM INSTR monitorexit ;
        return true;
_L4:
        abyte0 = discoversharecache.a(s, com.snapchat.android.util.cache.DiscoverShareCache.DiscoverShareFileType.BLOB);
        obj = abyte0;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        if (!bd.ak())
        {
            break MISSING_BLOCK_LABEL_402;
        }
        obj = com.snapchat.android.analytics.ChatPerformanceAnalytics.ChatMediaType.DISCOVER_SHARE_VIDEO;
_L11:
        abyte0 = a.a(((com.snapchat.android.analytics.ChatPerformanceAnalytics.ChatMediaType) (obj)));
        obj = a(((ChatMedia) (bd)), flag);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        ChatPerformanceAnalytics.a(abyte0, 0);
        bd.mIsExtracted = false;
        Timber.e("MediaDownloader", "[Conversation] Discover share media with Id [%s] failed to load from server", new Object[] {
            s
        });
        obj2;
        JVM INSTR monitorexit ;
        return false;
        obj = com.snapchat.android.analytics.ChatPerformanceAnalytics.ChatMediaType.DISCOVER_SHARE_IMAGE;
          goto _L11
        ChatPerformanceAnalytics.a(abyte0, obj.length);
        discoversharecache.a(s, ((byte []) (obj)), com.snapchat.android.util.cache.DiscoverShareCache.DiscoverShareFileType.BLOB);
        abyte0 = new CbcEncryptionAlgorithm(bd.H(), bd.I());
        obj = abyte0.b(((byte []) (obj)));
        flag1 = false;
_L13:
        if (!flag1 && obj != null)
        {
            break MISSING_BLOCK_LABEL_500;
        }
        discoversharecache.e(s);
        bd.mIsExtracted = false;
        Timber.e("MediaDownloader", "Failed to decrypt discover resource with Id [%s]", new Object[] {
            s
        });
        obj2;
        JVM INSTR monitorexit ;
        return false;
        obj = (new uv()).a(SnapchatApplication.get(), bd.d(), ((byte []) (obj)), abyte0);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        bd.mIsExtracted = false;
        Timber.e("MediaDownloader", "Failed to extract discover resource with Id [%s]", new Object[] {
            s
        });
        obj2;
        JVM INSTR monitorexit ;
        return false;
        vv vv1 = (vv)((Mediabryo) (obj)).mMediaExtras;
        bd.a(((Mediabryo) (obj)).mVideoUri, ((Mediabryo) (obj)).mOverlayPath);
        bd.a(vv1);
        br.a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
            com.snapchat.android.database.table.DbTable.DatabaseTable.CONVERSATION, com.snapchat.android.database.table.DbTable.DatabaseTable.DISCOVER_SHARE_FILES
        });
        bd.mIsExtracted = true;
        Timber.f("MediaDownloader", "[Conversation] Extracted and loaded Discover share media with Id [%s].", new Object[] {
            s
        });
        obj2;
        JVM INSTR monitorexit ;
        return true;
        bd;
        obj2;
        JVM INSTR monitorexit ;
        throw bd;
_L9:
        obj = null;
          goto _L12
        GeneralSecurityException generalsecurityexception;
        generalsecurityexception;
        generalsecurityexception = null;
        flag1 = true;
          goto _L13
    }

    public final boolean a(BF bf, JY jy, JY jy1, JY jy2, JY jy3, JY jy4, boolean flag)
    {
        Object obj;
        byte abyte0[];
        String s;
        s = bf.d();
        boolean flag1 = bf.O();
        if (jy.g(s) && jy2.g(s) && (!flag1 || jy3.f(s)))
        {
            bf.a(Uri.parse(jy2.d(s)));
            if (flag1)
            {
                bf.mOverlayPath = jy3.d(s);
            }
            a(((ChatMedia) (bf)));
            return true;
        }
        abyte0 = jy1.b(s);
        obj = null;
        jy1 = abyte0;
        if (abyte0 == null)
        {
            jy1 = jy4.b(s);
            obj = new CbcEncryptionAlgorithm(bf.H(), bf.I());
        }
        abyte0 = jy1;
        if (jy1 == null)
        {
            jy1 = a.a(com.snapchat.android.analytics.ChatPerformanceAnalytics.ChatMediaType.STORY_REPLY_VIDEO);
            abyte0 = a(((ChatMedia) (bf)), flag);
            if (abyte0 == null)
            {
                ChatPerformanceAnalytics.a(jy1, 0);
                return false;
            }
            ChatPerformanceAnalytics.a(jy1, abyte0.length);
            jy4.a(s, abyte0);
        }
        if (!g.containsKey(s)) goto _L2; else goto _L1
_L1:
        jy1 = (AD)g.get(s);
_L7:
        if (jy1 == null)
        {
            android.graphics.Bitmap bitmap;
            try
            {
                jy4 = f.a(s, abyte0, ((KK) (obj)), bf.ab(), false, false);
            }
            // Misplaced declaration of an exception variable
            catch (BF bf)
            {
                jy = jy1;
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (BF bf)
            {
                jy = jy1;
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                jy4 = jy1;
            }
            jy1 = jy4;
        }
        if (jy1 == null)
        {
            if (jy1 != null)
            {
                g.put(s, jy1);
            }
            return false;
        }
        jy4 = jy1;
        obj = jy1.b();
        jy4 = jy1;
        jy1.e();
        jy4 = jy1;
        bitmap = ((AD) (jy1)).mFirstFrame;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        jy4 = jy1;
        if (jy3.g(s))
        {
            break MISSING_BLOCK_LABEL_335;
        }
        jy4 = jy1;
        jy3.a(s, ((android.graphics.Bitmap) (obj)), android.graphics.Bitmap.CompressFormat.PNG, new CbcEncryptionAlgorithm(bf.H(), bf.I()));
        jy4 = jy1;
        bf.mOverlayPath = jy3.d(s);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        jy4 = jy1;
        if (jy.g(s))
        {
            break MISSING_BLOCK_LABEL_395;
        }
        jy4 = jy1;
        jy.a(s, bitmap, android.graphics.Bitmap.CompressFormat.PNG, new CbcEncryptionAlgorithm(bf.H(), bf.I()));
        jy4 = jy1;
        bf.a(Uri.parse(jy2.d(s)));
        if (jy1 != null)
        {
            g.put(s, jy1);
        }
        return true;
        bf;
        jy = null;
_L5:
        jy4 = jy;
        Timber.a("MediaDownloader", bf);
        if (jy != null)
        {
            g.put(s, jy);
        }
        return false;
        bf;
        jy4 = null;
_L4:
        if (jy4 != null)
        {
            g.put(s, jy4);
        }
        throw bf;
        bf;
        if (true) goto _L4; else goto _L3
_L3:
        bf;
        jy = jy1;
        continue; /* Loop/switch isn't completed */
        bf;
        jy = null;
        continue; /* Loop/switch isn't completed */
        bf;
        jy = jy1;
        if (true) goto _L5; else goto _L2
_L2:
        jy1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final byte[] a(ChatMedia chatmedia, boolean flag)
    {
        byte abyte0[] = null;
        if (chatmedia.F() != null)
        {
            abyte0 = (new StringBuilder("Media-")).append(chatmedia.d()).toString();
            oO oo = new oO(oS.buildAuthPayload((new Qk()).a(chatmedia.F()).b(chatmedia.ac())));
            abyte0 = a((new StringBuilder()).append(Lz.b()).append("/bq/chat_media").toString(), ((pn) (oo)), "CHAT", ((String) (abyte0)), chatmedia.d(), flag);
            a(chatmedia);
        }
        return abyte0;
    }

    public final void b()
    {
        Map map = g;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = g.values().iterator();
_L2:
        AD ad;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ad = (AD)iterator.next();
        } while (ad == null);
        ad.d();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        g.clear();
        map;
        JVM INSTR monitorexit ;
    }

}
