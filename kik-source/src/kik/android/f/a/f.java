// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.f.a;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.kik.cache.ad;
import com.kik.cache.av;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.f.a.a.a;
import com.kik.g.aq;
import com.kik.g.l;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.l.ab;
import com.kik.m.h;
import com.kik.platform.g;
import com.kik.sdkutils.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import kik.a.d.d;
import kik.a.d.j;
import kik.a.d.o;
import kik.a.e.q;
import kik.a.e.r;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.h.i;
import kik.a.h.n;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.k;
import kik.android.chat.fragment.KikCardBrowserFragment;
import kik.android.util.DeviceUtils;
import kik.android.util.ak;
import kik.android.util.ar;
import kik.android.util.bx;
import kik.android.util.ct;
import kik.android.util.e;
import kik.android.util.u;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.f.a:
//            q, g, ae, i, 
//            k, l, ad, h, 
//            r, t, s, u, 
//            w, z

public final class f
{

    public static int a = 0x2dc6c0;
    public static int b = 0x493e0;
    public static int c = 10000;
    private static final kik.a.d.a.a.c d[];
    private static final Map e;
    private static final b f = org.c.c.a("PlatformHelper");
    private static f o;
    private Hashtable g;
    private kik.a.d.a.a h;
    private long i;
    private boolean j;
    private String k;
    private List l;
    private byte m[];
    private boolean n;
    private t p;
    private v q;
    private ab r;
    private kik.a.f.k s;
    private ad t;
    private q u;
    private ar v;

    private f()
    {
        g = new Hashtable();
    }

    public static Bitmap a(Bitmap bitmap)
    {
        int i1 = bitmap.getHeight();
        int j1 = bitmap.getWidth();
        float f1 = 48F / (float)Math.max(j1, i1);
        Matrix matrix = new Matrix();
        matrix.postScale(f1, f1);
        return Bitmap.createBitmap(bitmap, 0, 0, j1, i1, matrix, true);
    }

    static ad a(f f1)
    {
        return f1.t;
    }

    public static a a(Context context, com.kik.f.a.a.c c1)
    {
        if (c1 == null)
        {
            return null;
        }
        boolean flag;
        for (int i1 = 0; i1 < c1.b(); i1++)
        {
            a a1 = c1.a(i1);
            if (DeviceUtils.a(context, a1.f()) && a1.c() == null || a1.c() != null && (a1.c().equals("android") || a1.c().equals("cards")))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return a1;
            }
        }

        return null;
    }

    public static String a(kik.a.d.a.a a1)
    {
        return a1.o();
    }

    private kik.a.d.a.a a(Intent intent)
    {
        String s1;
        Object obj;
        Object obj1;
        String s4;
        Bundle bundle;
        bundle = intent.getExtras();
        obj = bundle.getString("com.kik.platform.content.EXTRA_CONTENT_ID");
        s1 = ((String) (obj));
        if (obj == null)
        {
            s1 = UUID.randomUUID().toString();
        }
        s4 = bundle.getString("com.kik.platform.content.EXTRA_APP_ID");
        obj = (HashMap)bundle.get("com.kik.platform.content.EXTRA_EXTRA_HASH");
        Object obj2;
        Iterator iterator;
        if (obj == null)
        {
            obj = new Hashtable();
        } else
        {
            obj = new Hashtable(((Map) (obj)));
        }
        obj1 = (HashMap)bundle.get("com.kik.platform.content.EXTRA_STRING_HASH");
        if (obj1 == null)
        {
            obj1 = new Hashtable();
        } else
        {
            obj1 = new Hashtable(((Map) (obj1)));
        }
        if (bundle.getBoolean("allow-forward", true))
        {
            obj2 = "true";
        } else
        {
            obj2 = "false";
        }
        ((Hashtable) (obj1)).put("allow-forward", obj2);
        obj2 = new Vector();
        iterator = ((Hashtable) (obj1)).entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator.next();
            if (!((String)entry1.getKey()).matches("[a-zA-Z0-9\\-\\._]*"))
            {
                ((Vector) (obj2)).add((String)entry1.getKey());
            }
        } while (true);
        for (obj2 = ((Vector) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((Hashtable) (obj1)).remove((String)((Iterator) (obj2)).next())) { }
        if (((Hashtable) (obj1)).get("file-size") == null) goto _L2; else goto _L1
_L1:
        String s2 = h(s1);
        if (s2 != null)
        {
            ((Hashtable) (obj1)).put("file-url", s2);
        }
        Object obj3 = intent.getStringExtra("com.kik.platform.content.EXTRA_LOCAL_FILE_URI");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_351;
        }
        if (((String) (obj3)).startsWith("content:"))
        {
            obj3 = URI.create((new StringBuilder("file:///data/data/kik.android/thirdpartyfiles/")).append(Uri.parse(((String) (obj3))).getLastPathSegment()).toString()).getPath();
        }
        if (obj3 == null) goto _L4; else goto _L3
_L3:
        obj3 = new File(((String) (obj3)));
_L6:
        String s3;
        s3 = ((File) (obj3)).getCanonicalPath();
        if (!((File) (obj3)).exists())
        {
            throw new IOException("Cannot attach file because it does not exist!");
        }
          goto _L5
        obj3;
        s3 = null;
_L8:
        if (s3 != null)
        {
            ((Hashtable) (obj1)).put("int-file-url-local", s3);
            ((Hashtable) (obj1)).put("int-file-state", "0");
            ((Hashtable) (obj1)).put("int-chunk-progress", "0");
        }
_L2:
        Object obj4 = (HashMap)bundle.get("com.kik.platform.content.EXTRA_IMAGE_HASH");
        obj3 = new Hashtable();
        if (obj4 != null)
        {
            obj4 = ((HashMap) (obj4)).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj4)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj4)).next();
                if (entry.getKey() != "icon")
                {
                    ((Hashtable) (obj3)).put(entry.getKey(), new d((byte[])entry.getValue()));
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_574;
_L4:
        obj3 = null;
          goto _L6
_L5:
        if (((File) (obj3)).length() <= 0x989680L) goto _L8; else goto _L7
_L7:
        throw new IOException("File too large! Cannot exceed 10000000 bytes");
        String as[] = intent.getStringArrayExtra("com.kik.platform.content.EXTRA_URIS");
        String as1[] = intent.getStringArrayExtra("com.kik.platform.content.EXTRA_URI_PLATFORMS");
        intent.getIntArrayExtra("com.kik.platform.content.EXTRA_URI_PRIORITIES");
        return new kik.a.d.a.a(s1, s4, "2", as, as1, ((Hashtable) (obj1)), ((Hashtable) (obj3)), ((Hashtable) (obj)));
          goto _L6
    }

    public static f a()
    {
        if (o == null)
        {
            o = new f();
        }
        return o;
    }

    public static void a(Activity activity)
    {
        if (activity == null)
        {
            return;
        } else
        {
            kik.android.chat.activity.k.a(new kik.android.chat.fragment.KikConversationsFragment.a(), activity).a().f();
            return;
        }
    }

    public static void a(String s1, Activity activity, int i1, boolean flag, r r1)
    {
        if (activity == null)
        {
            return;
        }
        kik.a.d.k k1 = null;
        if (s1 != null)
        {
            k1 = r1.a(s1, false);
        }
        if (k1 != null)
        {
            if (k1.m())
            {
                s1 = new kik.android.chat.fragment.KikChatInfoFragment.a();
                s1.a(k1).b(1).a(i1);
                kik.android.chat.activity.k.a(s1, activity).f();
                return;
            } else
            {
                s1 = new kik.android.chat.fragment.KikChatFragment.a();
                s1.b(flag).a(k1).a(i1);
                kik.android.chat.activity.k.a(s1, activity).f();
                return;
            }
        } else
        {
            s1 = new kik.android.chat.fragment.KikConversationsFragment.a();
            s1.a(i1);
            kik.android.chat.activity.k.a(s1, activity).f();
            return;
        }
    }

    private void a(String s1, p p1, int i1)
    {
        if (s1 == null)
        {
            p1.a(Boolean.valueOf(true));
            return;
        }
        if (kik.a.f.e.a.a(s1))
        {
            if (i(s1) < (long)i1)
            {
                p1.a(null);
                return;
            } else
            {
                p1.a(new IllegalArgumentException("Image too large."));
                return;
            }
        }
        if (!kik.a.h.n.a(s1))
        {
            p1.a(new IllegalArgumentException("Image url is invalid"));
            return;
        } else
        {
            p p2 = new p();
            (new kik.android.f.a.q(this, s1, p2)).execute(new Void[0]);
            p2.a(new kik.android.f.a.g(this, i1, p1));
            return;
        }
    }

    private boolean a(String s1, kik.a.d.a.a a1, Context context, v v1)
    {
        v1 = kik.android.util.e.a(s1, a1.o(), context, v1);
        if (v1 == null)
        {
            return false;
        }
        context = a1.o();
        s1 = context;
        if (context == null)
        {
            s1 = UUID.randomUUID().toString();
        }
        s1 = h(s1);
        if (s1 != null)
        {
            a1.a("file-url", s1);
        }
        s1 = v1.getCanonicalPath();
        if (!v1.exists())
        {
            throw new IOException("Cannot attach file because it does not exist!");
        }
          goto _L1
        s1;
        s1 = null;
_L3:
        if (s1 != null)
        {
            a1.a("int-file-url-local", s1);
            a1.a("int-file-state", "0");
            a1.a("int-chunk-progress", "0");
            a1.a("file-size", Long.toString(v1.length()));
        }
        f(a1.u());
        return true;
_L1:
        if (v1.length() <= 0x989680L) goto _L3; else goto _L2
_L2:
        throw new IOException("File too large! Cannot exceed 10000000 bytes");
    }

    private boolean a(kik.a.d.a.a a1, Context context)
    {
        InputStream inputstream;
        Object obj;
        File file;
        inputstream = null;
        for (obj = a1.h(); !kik.a.f.e.a.b(((String) (obj))) || ct.a(context, Uri.parse(((String) (obj)))) > 0x1d4c0L;)
        {
            return false;
        }

        obj = Uri.parse(((String) (obj)));
        file = u.b(a1.o());
        if (file.exists()) goto _L2; else goto _L1
_L1:
        boolean flag;
        FileOutputStream fileoutputstream;
        Object obj1;
        byte abyte0[];
        int i1;
        int j1;
        boolean flag1;
        try
        {
            flag = y.a(18);
            obj = context.getContentResolver().openInputStream(((Uri) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a1 = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a1 = null;
            inputstream = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
            inputstream = null;
        }
_L11:
        inputstream = ((InputStream) (obj));
        fileoutputstream = new FileOutputStream(file);
        obj1 = fileoutputstream;
        obj = inputstream;
        abyte0 = new byte[1024];
        i1 = 0;
_L4:
        obj1 = fileoutputstream;
        obj = inputstream;
        j1 = inputstream.read(abyte0);
        if (j1 == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i1 <= 0xf00000 || flag)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj1 = fileoutputstream;
        obj = inputstream;
        file.delete();
        com.kik.m.h.a(inputstream);
        com.kik.m.h.a(fileoutputstream);
        return false;
        obj1 = fileoutputstream;
        obj = inputstream;
        fileoutputstream.write(abyte0, 0, j1);
        i1 += j1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = fileoutputstream;
        obj = inputstream;
        if (a1.a("preview") != null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj1 = fileoutputstream;
        obj = inputstream;
        context = ct.a(context, file.getPath());
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_353;
        }
        obj1 = fileoutputstream;
        obj = inputstream;
        context = com.kik.m.k.a(context, android.graphics.Bitmap.CompressFormat.JPEG, 80);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj1 = fileoutputstream;
        obj = inputstream;
        a1.a("preview", new o(context));
        obj1 = fileoutputstream;
        obj = inputstream;
        file.getPath();
        obj1 = fileoutputstream;
        obj = inputstream;
        flag1 = y.a(18);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        obj1 = fileoutputstream;
        obj = inputstream;
        if (!ak.c(file.getPath()))
        {
            break MISSING_BLOCK_LABEL_377;
        }
        obj1 = fileoutputstream;
        obj = inputstream;
        file.delete();
        com.kik.m.h.a(inputstream);
        com.kik.m.h.a(fileoutputstream);
        return false;
        obj1 = fileoutputstream;
        obj = inputstream;
        file.delete();
        com.kik.m.h.a(inputstream);
        com.kik.m.h.a(fileoutputstream);
        return false;
        if (flag1) goto _L6; else goto _L5
_L5:
        obj1 = fileoutputstream;
        obj = inputstream;
        flag = r.a(a1.o(), file.getPath());
_L14:
        if (!flag) goto _L8; else goto _L7
_L7:
        obj1 = fileoutputstream;
        obj = inputstream;
        if (!r.e(file.getPath()))
        {
            break MISSING_BLOCK_LABEL_451;
        }
        obj1 = fileoutputstream;
        obj = inputstream;
        file.delete();
        obj1 = fileoutputstream;
        obj = inputstream;
        a1.a(r.f(a1.o()));
_L10:
        obj1 = fileoutputstream;
        obj = inputstream;
        a1.a(flag1);
        obj1 = fileoutputstream;
        obj = inputstream;
        a1.a(kik.a.d.a.a.a.b);
        com.kik.m.h.a(inputstream);
        com.kik.m.h.a(fileoutputstream);
_L2:
        f(a1.u());
        return true;
_L8:
        obj1 = fileoutputstream;
        obj = inputstream;
        a1.a(file);
        if (true) goto _L10; else goto _L9
_L9:
        context;
        a1 = fileoutputstream;
_L13:
        obj1 = a1;
        obj = inputstream;
        bx.b(context);
        com.kik.m.h.a(inputstream);
        com.kik.m.h.a(a1);
        return false;
_L12:
        com.kik.m.h.a(inputstream);
        com.kik.m.h.a(((java.io.Closeable) (obj1)));
        throw a1;
        a1;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        a1;
        inputstream = ((InputStream) (obj));
        if (true) goto _L12; else goto _L11
        context;
        a1 = null;
        continue; /* Loop/switch isn't completed */
        context;
        a1 = fileoutputstream;
        continue; /* Loop/switch isn't completed */
        context;
        a1 = null;
        if (true) goto _L13; else goto _L6
_L6:
        flag = false;
          goto _L14
    }

    static boolean a(f f1, String s1, kik.a.d.a.a a1, Context context, v v1)
    {
        return f1.a(s1, a1, context, v1);
    }

    static boolean a(f f1, kik.a.d.a.a a1, Context context)
    {
        return f1.a(a1, context);
    }

    public static boolean c(kik.a.d.a.a a1)
    {
        while (a1 == null || !"com.kik.ext.camera".equals(a1.u()) && !"com.kik.ext.gallery".equals(a1.u()) && (!kik.a.d.a.a.b.b.a(a1.t()) || a1.k() == null && !a1.d("image"))) 
        {
            return false;
        }
        return true;
    }

    public static boolean d(kik.a.d.a.a a1)
    {
        while (a1 == null || !"com.kik.ext.video-camera".equals(a1.u()) && !"com.kik.ext.video-gallery".equals(a1.u()) && !kik.a.d.a.a.b.e.a(a1.t())) 
        {
            return false;
        }
        return true;
    }

    private static long i(String s1)
    {
        s1 = kik.a.h.f.a(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        int i1 = com.kik.m.e.a(s1).length;
        return (long)i1;
        s1;
        return 0x7fffffffffffffffL;
    }

    public final p a(KikMessageParcelable kikmessageparcelable, Fragment fragment, int i1, r r1)
    {
        boolean flag = true;
        p p1 = new p();
        p p2 = new p();
        p p3 = kik.android.f.a.ae.a(fragment.getActivity(), kikmessageparcelable, t);
        if (kikmessageparcelable.f != null && kikmessageparcelable.f.length() > 0)
        {
            p2.a(kikmessageparcelable.f);
        } else
        if (kikmessageparcelable.g != null && kikmessageparcelable.g.length() > 0)
        {
            kik.a.d.k k1 = r1.b(kikmessageparcelable.g);
            if (k1 != null)
            {
                p2.a(k1.b());
            } else
            {
                r1.d(kikmessageparcelable.g).a(new kik.android.f.a.ad(this, p2));
            }
        } else
        {
            long l1 = ((KikApplication)fragment.getActivity().getApplication()).m().a(p3);
            kikmessageparcelable = new kik.android.chat.fragment.SendToFragment.a();
            kikmessageparcelable.a(false).a(l1).a(i1);
            kik.android.chat.activity.k.a(kikmessageparcelable, fragment.getActivity()).f().a(new kik.android.f.a.h(this, p2));
            flag = false;
        }
        if (fragment instanceof KikCardBrowserFragment)
        {
            p2.a(new kik.android.f.a.i(this, p3, (KikCardBrowserFragment)fragment, fragment));
        }
        p2.a(new kik.android.f.a.k(this, p1));
        p3.a(new kik.android.f.a.l(this, p2, r1, fragment, i1, flag, p1));
        return p1;
    }

    public final p a(String s1, kik.android.gifs.a.f f1, ad ad1, Bitmap bitmap)
    {
        p p1;
        kik.a.d.a.a a1;
        int i1;
        int j1;
        try
        {
            p1 = new p();
            a1 = new kik.a.d.a.a("com.kik.ext.gif");
            a1.a("layout", kik.a.d.a.a.b.e.a());
            com.kik.g.s.a(kik.android.util.e.a(ad1, av.a(s1, 0, 0), false), 2000L).a(new kik.android.f.a.r(this, a1, p1, bitmap));
            a1.a("icon", new d(kik.android.util.e.a(a(KikApplication.c(0x7f02012f)))));
            a1.a("allow-forward", "true");
            a1.j("true");
            a1.k("true");
            a1.i("true");
            a1.l("true");
            s1 = d;
            j1 = s1.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bx.a(s1);
            return null;
        }
        i1 = 0;
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        ad1 = s1[i1];
        bitmap = f1.a((kik.android.gifs.a.a)e.get(ad1));
        if (bitmap == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (bitmap.a() != null)
        {
            a1.a(bitmap.a(), "video", ad1);
        }
        i1++;
        break MISSING_BLOCK_LABEL_145;
_L2:
        return p1;
    }

    public final p a(kik.a.d.a.a a1, Activity activity, r r1, v v1)
    {
        p p1 = new p();
        p p2 = new p();
        p p3 = new p();
        Object obj = new kik.android.chat.fragment.SendToFragment.a();
        ((kik.android.chat.fragment.SendToFragment.a) (obj)).a(false);
        kik.android.chat.activity.k.a(((kik.android.util.an) (obj)), activity).f().a(new kik.android.f.a.t(this, p2));
        p p4 = new p();
        String s1 = a1.a();
        String s2 = a1.b();
        ArrayList arraylist;
        if (!kik.a.f.e.a.b(a1.g()))
        {
            obj = a1.g();
        } else
        {
            obj = null;
        }
        arraylist = new ArrayList();
        for (int i1 = 0; i1 < 3; i1++)
        {
            arraylist.add(com.kik.g.s.a(new p(), c));
        }

        a(s1, (p)arraylist.get(0), b);
        a(s2, (p)arraylist.get(1), b);
        a(((String) (obj)), (p)arraylist.get(2), a);
        com.kik.g.s.a(com.kik.g.s.a((p)arraylist.get(0), (p)arraylist.get(1)), (p)arraylist.get(2)).a(new kik.android.f.a.s(this, p4));
        p4.a(new kik.android.f.a.u(this, p3, a1, activity));
        p2.a(new w(this, p3, activity, p1));
        p3.a(new kik.android.f.a.z(this, p2, activity, v1, p1, r1));
        return p1;
    }

    public final String a(String s1)
    {
        Object obj;
        obj = null;
        if (s1 == null)
        {
            return null;
        }
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        obj = messagedigest;
_L2:
        byte abyte0[] = s1.getBytes();
        ((MessageDigest) (obj)).update(abyte0, 0, abyte0.length);
        obj = (new BigInteger(1, ((MessageDigest) (obj)).digest())).toString(16);
        g.put(obj, s1);
        return ((String) (obj));
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        bx.a(nosuchalgorithmexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final kik.a.d.a.a a(Activity activity, Intent intent)
    {
label0:
        {
            {
                String s1 = activity.getCallingPackage();
                PackageManager packagemanager = activity.getPackageManager();
                kik.a.d.a.a a1 = a(intent);
                a1.a("app-pkg", s1);
                Object obj = "";
                if (!activity.getPackageName().equals(s1))
                {
                    break label0;
                }
                if (intent.getExtras() != null)
                {
                    intent = intent.getExtras().getString("com.kik.platform.content.EXTRA_APP_ID");
                    if ("com.kik.ext.camera".equals(intent))
                    {
                        intent = activity.getResources().getString(0x7f09005f);
                        activity = (BitmapDrawable)activity.getResources().getDrawable(0x7f020043);
                    } else
                    if ("com.kik.ext.gallery".equals(intent))
                    {
                        intent = activity.getResources().getString(0x7f09010d);
                        activity = (BitmapDrawable)activity.getResources().getDrawable(0x7f020124);
                    } else
                    if ("com.kik.ext.video-camera".equals(intent))
                    {
                        intent = activity.getResources().getString(0x7f09005f);
                        activity = (BitmapDrawable)activity.getResources().getDrawable(0x7f020043);
                    } else
                    if ("com.kik.ext.video-gallery".equals(intent))
                    {
                        intent = activity.getResources().getString(0x7f09010d);
                        activity = (BitmapDrawable)activity.getResources().getDrawable(0x7f020124);
                    } else
                    {
                        activity = null;
                        intent = "";
                    }
                } else
                {
                    activity = null;
                    intent = ((Intent) (obj));
                }
            }
            if (activity != null && activity.getBitmap() != null)
            {
                obj = a(activity.getBitmap());
                a1.a("icon", new d(kik.android.util.e.a(((Bitmap) (obj)))));
                if (obj != null && !((Bitmap) (obj)).isRecycled() && obj != activity.getBitmap())
                {
                    ((Bitmap) (obj)).recycle();
                }
            }
            if (!kik.a.h.i.a(intent))
            {
                a1.a("app-name", intent);
            }
            return a1;
        }
        activity = activity.getCallingActivity();
        if (activity == null) goto _L2; else goto _L1
_L1:
        activity = (BitmapDrawable)packagemanager.getActivityIcon(activity);
_L4:
        try
        {
            intent = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(s1, 0)).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            intent = ((Intent) (obj));
        }
        if (true) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_97;
        activity;
        bx.a(activity);
        activity = null;
          goto _L4
        activity;
_L2:
        activity = null;
          goto _L4
    }

    public final kik.a.d.a.a a(Activity activity, File file, v v1)
    {
        Object obj;
        kik.a.d.a.a a1;
        boolean flag = false;
        int i1;
        try
        {
            a1 = new kik.a.d.a.a("com.kik.ext.gallery");
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Toast.makeText(activity, 0x7f09001f, 1).show();
            bx.a(file);
            return null;
        }
        i1 = 0;
        obj = null;
_L12:
        if (i1 < e.a.length) goto _L2; else goto _L1
_L1:
        bx.a(new Throwable("Gallery content message: All gallery resolutions failed to send"));
        v1 = ((v) (obj));
_L10:
        if (v1 != null) goto _L4; else goto _L3
_L3:
        Toast.makeText(activity, 0x7f09001f, 1).show();
        return null;
_L2:
        obj = kik.android.util.e.a(file, a1.o(), false, e.a[i1], v1);
        if (obj == null)
        {
            i1++;
            continue; /* Loop/switch isn't completed */
        }
        v1 = ((v) (obj));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = kik.android.util.u.a(file.getAbsolutePath());
        i1 = kik.android.util.r.a(file.getAbsolutePath());
        file = ((File) (obj));
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        file = kik.android.util.r.b(((Bitmap) (obj)), i1);
        file = com.kik.m.k.b(file, android.graphics.Bitmap.CompressFormat.JPEG, 80);
        obj = new StringBuilder("gallery message preview size:");
        if (file != null) goto _L6; else goto _L5
_L5:
        i1 = ((flag) ? 1 : 0);
_L7:
        ((StringBuilder) (obj)).append(i1);
        a1.a("preview", new o(file));
        a1.a("icon", new d(kik.android.util.e.a(a(KikApplication.c(0x7f020124)))));
        a1.a("allow-forward", "true");
        a1.a("file-name", v1.getName());
        a1.a("file-size", Long.toString(v1.length()));
        file = v1.getCanonicalPath();
_L8:
        if (file == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a1.a("int-file-url-local", file);
        a1.a("int-file-state", "0");
        a1.a("int-chunk-progress", "0");
        file = h(a1.o());
        if (file == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a1.a("file-url", file);
        break; /* Loop/switch isn't completed */
_L6:
        i1 = file.length;
          goto _L7
        file;
        bx.a(file);
        file = null;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        return a1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final kik.a.d.a.a a(Activity activity, String s1, long l1, String s2)
    {
        s2 = new kik.a.d.a.a("com.kik.ext.video-camera", s2);
        File file = new File(s1);
        activity = com.kik.m.k.b(ct.a(activity, s1), android.graphics.Bitmap.CompressFormat.JPEG, 90);
        s1 = new StringBuilder("video message preview size:");
        int i1;
        if (activity == null)
        {
            i1 = 0;
        } else
        {
            i1 = activity.length;
        }
        s1.append(i1);
        s2.a("preview", new o(activity));
        s2.a("icon", new d(kik.android.util.e.a(a(KikApplication.c(0x7f020043)))));
        s2.a("allow-forward", "true");
        s2.a("layout", kik.a.d.a.a.b.e.a());
        s2.a("file-content-type", "video/mp4");
        s2.a("file-name", file.getName());
        s2.a("file-size", Long.toString(file.length()));
        s2.a(l1);
        activity = null;
        s1 = file.getCanonicalPath();
        activity = s1;
_L2:
        if (activity != null)
        {
            s2.a("int-file-url-local", activity);
            s2.a("int-file-state", "0");
            s2.a("int-chunk-progress", "0");
            activity = h(s2.o());
            if (activity != null)
            {
                s2.a("file-url", activity);
            }
        }
        return s2;
        s1;
        bx.a(s1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final kik.a.d.a.a a(Activity activity, byte abyte0[], v v1)
    {
        Object obj = null;
        kik.a.d.a.a a1 = new kik.a.d.a.a("com.kik.ext.camera");
        v1 = kik.android.util.e.a(abyte0, a1.o(), v1);
        if (v1 == null)
        {
            Toast.makeText(activity, 0x7f090134, 1).show();
            return null;
        }
        activity = com.kik.m.k.b(kik.android.util.u.b(abyte0, 400), android.graphics.Bitmap.CompressFormat.JPEG, 80);
        abyte0 = new StringBuilder("camera message preview size:");
        int i1;
        if (activity == null)
        {
            i1 = 0;
        } else
        {
            i1 = activity.length;
        }
        abyte0.append(i1);
        a1.a("preview", new o(activity));
        a1.a("icon", new d(kik.android.util.e.a(a(KikApplication.c(0x7f020043)))));
        a1.a("allow-forward", "true");
        a1.a("file-content-type", "image/jpeg");
        a1.a("file-name", v1.getName());
        a1.a("file-size", Long.toString(v1.length()));
        try
        {
            activity = v1.getCanonicalPath();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            bx.a(activity);
            activity = obj;
        }
        if (activity != null)
        {
            a1.a("int-file-url-local", activity);
            a1.a("int-file-state", "0");
            a1.a("int-chunk-progress", "0");
            activity = h(a1.o());
            if (activity != null)
            {
                a1.a("file-url", activity);
            }
        }
        return a1;
    }

    public final kik.a.d.a.a a(Context context, String s1, long l1, boolean flag, ab ab1)
    {
        boolean flag1 = false;
        kik.a.d.a.a a1 = new kik.a.d.a.a("com.kik.ext.video-gallery");
        File file = new File(s1);
        context = kik.android.util.r.c(ct.a(context, s1));
        if (context != null)
        {
            context = com.kik.m.k.b(context, android.graphics.Bitmap.CompressFormat.JPEG, 90);
            s1 = new StringBuilder("video message preview size:");
            int i1;
            if (context == null)
            {
                i1 = 0;
            } else
            {
                i1 = context.length;
            }
            s1.append(i1);
            a1.a("preview", new o(context));
        }
        a1.a("icon", new d(kik.android.util.e.a(a(KikApplication.c(0x7f020124)))));
        a1.a("allow-forward", "true");
        a1.a("layout", kik.a.d.a.a.b.e.a());
        a1.a("file-name", file.getName());
        a1.a("file-size", Long.toString(file.length()));
        a1.a(l1);
        a1.a(flag);
        context = null;
        s1 = file.getCanonicalPath();
        context = s1;
_L2:
        if (context != null)
        {
            a1.a("int-file-url-local", context);
            a1.a("int-file-state", "0");
            a1.a("int-chunk-progress", "0");
            context = h(a1.o());
            if (context != null)
            {
                a1.a("file-url", context);
            }
        }
        if (!flag)
        {
            flag = ab1.a(a1.o(), file.getPath());
            flag1 = flag;
            if (r.e(file.getPath()))
            {
                file.delete();
                flag1 = flag;
            }
        }
        if (flag1)
        {
            context = ab1.f(a1.o());
            if (context != null)
            {
                a1.a(context);
            }
        }
        return a1;
        s1;
        bx.a(s1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(Activity activity, File file, String s1, String s2, boolean flag, v v1)
    {
        Object obj;
        g g1;
        int i1;
        obj = null;
        g1 = new g(s1);
        i1 = 0;
        s1 = null;
_L6:
        if (i1 < e.a.length) goto _L2; else goto _L1
_L1:
        bx.a(new Throwable("sendPicContentMessage: All gallery resolutions failed to send"));
_L4:
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        File file1;
        try
        {
            g1.a(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Toast.makeText(activity, 0x7f090134, 1).show();
            return;
        }
        try
        {
            g1.b(s1);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Toast.makeText(activity, 0x7f090134, 1).show();
            return;
        }
        file = obj;
        if (s2 != null)
        {
            file = a(s2);
        }
        com.kik.platform.a.a(activity, g1, file);
        return;
_L2:
        file1 = kik.android.util.e.a(file, g1.a(), flag, e.a[i1], v1);
        s1 = file1;
        if (file1 != null) goto _L4; else goto _L3
_L3:
        i1++;
        s1 = file1;
        if (true) goto _L6; else goto _L5
_L5:
        Toast.makeText(activity, 0x7f090134, 1).show();
        return;
    }

    public final void a(List list)
    {
        if (l != null && l == list)
        {
            b();
        }
    }

    public final void a(kik.a.d.a.a a1, long l1)
    {
        if (h != null && h.equals(a1) && l1 == i)
        {
            b();
        }
    }

    public final void a(kik.a.d.a.a a1, boolean flag, byte abyte0[])
    {
        i = UUID.randomUUID().getLeastSignificantBits();
        h = a1;
        m = abyte0;
        j = flag;
    }

    public final void a(v v1, ab ab1, kik.a.f.k k1, t t1, ad ad1, q q1, ar ar1)
    {
        q = v1;
        r = ab1;
        s = k1;
        p = t1;
        r = ab1;
        t = ad1;
        u = q1;
        v = ar1;
    }

    public final void a(boolean flag)
    {
        n = flag;
    }

    public final boolean a(String s1, long l1)
    {
        if (l1 < 0xf00000L)
        {
            return true;
        } else
        {
            return v.a("kik.android.internal.platform.settings.upload").getBoolean(s1, false);
        }
    }

    public final String b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return (String)g.get(s1);
        }
    }

    public final void b()
    {
        k = null;
        a(((kik.a.d.a.a) (null)), false, ((byte []) (null)));
        l = null;
    }

    public final void b(List list)
    {
        l = list;
    }

    public final boolean b(kik.a.d.a.a a1)
    {
        String s1 = h.g("int-file-url-local");
        String s2 = h.g("file-size");
        String s3 = h.g("int-file-state");
        if (s2 != null && !"1".equals(s3))
        {
            long l1;
            if (a1.l())
            {
                l1 = ak.a(s1);
            } else
            {
                l1 = Long.parseLong(s2);
            }
            return a(h.u(), l1);
        } else
        {
            return false;
        }
    }

    public final void c(String s1)
    {
        if (k != null && k.equals(s1))
        {
            b();
        }
    }

    public final boolean c()
    {
        return n;
    }

    public final void d(String s1)
    {
        g.remove(s1);
    }

    public final boolean d()
    {
        return j;
    }

    public final kik.a.d.a.a e()
    {
        return h;
    }

    public final void e(String s1)
    {
        k = s1;
    }

    public final void f(String s1)
    {
        v.a("kik.android.internal.platform.settings.upload").edit().putBoolean(s1, true).commit();
    }

    public final byte[] f()
    {
        return m;
    }

    public final long g()
    {
        return i;
    }

    public final boolean g(String s1)
    {
        return v.a("kik.android.internal.platform.settings.launch").getBoolean(s1, false);
    }

    public final String h()
    {
        return k;
    }

    public final String h(String s1)
    {
        Object obj = z.b(q);
        if (obj != null && ((z) (obj)).a() != null && s1 != null)
        {
            obj = ((z) (obj)).a().a();
            return (new StringBuilder()).append(s.h()).append(s1).append("?k=").append(p.a((new StringBuilder("b#YXa*ubr9da")).append(s1).append(((String) (obj))).toString())).toString();
        } else
        {
            return null;
        }
    }

    public final List i()
    {
        return l;
    }

    public final void j()
    {
        v.a("kik.android.internal.platform.settings.upload").edit().clear().commit();
        v.a("kik.android.internal.platform.settings.launch").edit().clear().commit();
    }

    static 
    {
        d = (new kik.a.d.a.a.c[] {
            kik.a.d.a.a.c.c, kik.a.d.a.a.c.d, kik.a.d.a.a.c.a, kik.a.d.a.a.c.b, kik.a.d.a.a.c.f
        });
        HashMap hashmap = new HashMap();
        e = hashmap;
        hashmap.put(kik.a.d.a.a.c.c, kik.android.gifs.a.a.a);
        e.put(kik.a.d.a.a.c.a, kik.android.gifs.a.a.b);
        e.put(kik.a.d.a.a.c.b, kik.android.gifs.a.a.c);
        e.put(kik.a.d.a.a.c.d, kik.android.gifs.a.a.g);
        e.put(kik.a.d.a.a.c.f, kik.android.gifs.a.a.d);
    }
}
