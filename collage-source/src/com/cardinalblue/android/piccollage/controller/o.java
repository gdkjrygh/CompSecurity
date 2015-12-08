// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import bolts.g;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.iab.util.d;
import com.cardinalblue.android.piccollage.iab.util.e;
import com.cardinalblue.android.piccollage.lib.FixedSizeStack;
import com.cardinalblue.android.piccollage.model.InstalledStickerBundle;
import com.cardinalblue.android.piccollage.model.NoInternetBundle;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.RecentStickersBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.PurchasableBackground;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import com.cardinalblue.android.piccollage.model.m;
import com.cardinalblue.android.piccollage.view.fragments.FreeStickerBundleFragment;
import com.cardinalblue.android.piccollage.view.fragments.t;
import com.cardinalblue.android.piccollage.view.fragments.w;
import com.cardinalblue.android.piccollage.view.fragments.z;
import com.google.b.f;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.lingala.zip4j.a.c;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            f, a

public class o extends Observable
{
    public static class a
    {

        public a a;
        public Object b;

        public a(a a1, Object obj)
        {
            a = a1;
            b = obj;
        }
    }

    public static final class a.a extends Enum
    {

        public static final a.a a;
        public static final a.a b;
        public static final a.a c;
        public static final a.a d;
        public static final a.a e;
        public static final a.a f;
        public static final a.a g;
        private static final a.a h[];

        public static a.a valueOf(String s1)
        {
            return (a.a)Enum.valueOf(com/cardinalblue/android/piccollage/controller/o$a$a, s1);
        }

        public static a.a[] values()
        {
            return (a.a[])h.clone();
        }

        static 
        {
            a = new a.a("START", 0);
            b = new a.a("PROGRESSING", 1);
            c = new a.a("SUCCESS", 2);
            d = new a.a("FAILED", 3);
            e = new a.a("CANCELLED", 4);
            f = new a.a("DATA_CHANGED", 5);
            g = new a.a("BUNDLE_LIST_UPDATED", 6);
            h = (new a.a[] {
                a, b, c, d, e, f, g
            });
        }

        private a.a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static int c = 24;
    private static o q;
    com.cardinalblue.android.piccollage.iab.util.d.e a;
    com.cardinalblue.android.piccollage.iab.util.d.b b;
    private final Type d = (new com.google.b.c.a() {

        final o a;

            
            {
                a = o.this;
                super();
            }
    }).getType();
    private final Handler e = new Handler();
    private FixedSizeStack f;
    private final RecentStickersBundle g = new RecentStickersBundle();
    private final List h = new ArrayList();
    private final File i;
    private final File j;
    private final Context k = com.cardinalblue.android.b.k.a();
    private final Object l = new Object();
    private final List m = Collections.synchronizedList(new ArrayList());
    private final List n = Collections.synchronizedList(new ArrayList());
    private d o;
    private AtomicBoolean p;
    private Object r;
    private g s;
    private final ArrayList t = new ArrayList();
    private Runnable u;

    private o()
    {
        f = new FixedSizeStack(c);
        p = new AtomicBoolean(false);
        r = new Object();
        a = new com.cardinalblue.android.piccollage.iab.util.d.e() {

            final o a;

            public void a(e e1, com.cardinalblue.android.piccollage.iab.util.f f1)
            {
                Log.v("StickerBundleManager", "Query inventory finished.");
                if (e1.d())
                {
                    Log.v("StickerBundleManager", (new StringBuilder()).append("Failed to query inventory: ").append(e1).toString());
                    return;
                }
                Log.v("StickerBundleManager", "Query inventory was successful.");
                Object obj = o.a().g();
                e1 = new ArrayList();
                Object obj1 = f1.a("com.cardinalblue.piccollage.watermark");
                if (obj1 != null)
                {
                    e1.add(obj1);
                }
                obj1 = com.cardinalblue.android.piccollage.controller.a.a().d().iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    com.cardinalblue.android.piccollage.iab.util.g g1 = f1.a(((PurchasableBackground)((Iterator) (obj1)).next()).getPurchaseInfo().l());
                    if (g1 != null)
                    {
                        e1.add(g1);
                    }
                } while (true);
                if (obj != null)
                {
                    obj = ((List) (obj)).iterator();
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        Object obj2 = (StickerBundle)((Iterator) (obj)).next();
                        if (!((StickerBundle) (obj2)).i() && (obj2 instanceof PurchasableStickerBundle))
                        {
                            obj2 = f1.a(((StickerBundle) (obj2)).l());
                            if (obj2 != null)
                            {
                                e1.add(obj2);
                            }
                        }
                    } while (true);
                    com.cardinalblue.android.piccollage.controller.o.b(a).a(e1, a.b);
                }
                Log.v("StickerBundleManager", "Initial inventory query finished; enabling main UI.");
            }

            
            {
                a = o.this;
                super();
            }
        };
        b = new com.cardinalblue.android.piccollage.iab.util.d.b() {

            final o a;

            public void a(List list, List list1)
            {
                Log.v("StickerBundleManager", (new StringBuilder()).append("Consumption finished. Purchase: ").append(list).append(", result: ").append(list1).toString());
                Log.v("StickerBundleManager", "End consumption flow.");
            }

            
            {
                a = o.this;
                super();
            }
        };
        u = new StickerBundleManager._cls6();
        i = k.getExternalFilesDir(com.cardinalblue.android.piccollage.controller.f.c);
        j = new File(i, "Bundles");
        if (!com.cardinalblue.android.b.k.j().getBoolean("pref_move_folders_under_resources", false))
        {
            u();
            com.cardinalblue.android.b.k.j().edit().putBoolean("pref_move_folders_under_resources", true).apply();
        }
    }

    private j a(PurchasableStickerBundle purchasablestickerbundle, g g1)
    {
        bolts.j.a a1 = bolts.j.a();
        (new Thread(new StickerBundleManager._cls7(purchasablestickerbundle, g1, a1))).start();
        return a1.a();
    }

    public static o a()
    {
        if (q == null)
        {
            q = new o();
        }
        return q;
    }

    static File a(o o1)
    {
        return o1.j;
    }

    private List a(File file)
        throws com.cardinalblue.android.b.k.a, JSONException
    {
        file = com.cardinalblue.android.b.k.a("nvdciuewkbnbdsgydsg", file);
        Object obj2 = (m)(new f()).a(new InputStreamReader(file), com/cardinalblue/android/piccollage/model/m);
        if (obj2 == null)
        {
            com.cardinalblue.android.b.k.a(file);
            return null;
        }
        synchronized (l)
        {
            obj2 = ((m) (obj2)).a();
        }
        com.cardinalblue.android.b.k.a(file);
        return ((List) (obj2));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        throw new JSONException(((Throwable) (obj1)).getMessage());
        obj1;
        com.cardinalblue.android.b.k.a(file);
        throw obj1;
    }

    private List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = j.listFiles(new FilenameFilter() {

            final o a;

            public boolean accept(File file, String s1)
            {
                return file.equals(o.a(a)) && s1.endsWith(".bundle");
            }

            
            {
                a = o.this;
                super();
            }
        });
        if (afile != null)
        {
            int j1 = afile.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                Object obj = afile[i1];
                if (((File) (obj)).isDirectory())
                {
                    try
                    {
                        obj = InstalledStickerBundle.a(((File) (obj)));
                        if (list.contains(obj))
                        {
                            StickerBundle stickerbundle = (StickerBundle)list.get(list.indexOf(obj));
                            ((InstalledStickerBundle) (obj)).b(stickerbundle.l());
                            ((InstalledStickerBundle) (obj)).a(stickerbundle.k());
                        }
                        arraylist.add(obj);
                    }
                    catch (IOException ioexception)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(ioexception);
                    }
                }
                i1++;
            }
        }
        return arraylist;
    }

    private void a(Context context)
    {
        Log.v("StickerBundleManager", "Creating IAB helper.");
        o = new d(context, com.cardinalblue.android.b.k.o());
        o.a(false);
        Log.v("StickerBundleManager", "Starting setup.");
        o.a(new com.cardinalblue.android.piccollage.iab.util.d.d() {

            final o a;

            public void a(e e1)
            {
                Log.v("StickerBundleManager", "Setup finished.");
                if (!e1.c())
                {
                    Log.v("StickerBundleManager", (new StringBuilder()).append("Problem setting up in-app billing: ").append(e1).toString());
                } else
                if (com.cardinalblue.android.piccollage.controller.o.b(a) != null)
                {
                    Log.v("StickerBundleManager", "Setup successful. Querying inventory.");
                    try
                    {
                        com.cardinalblue.android.piccollage.controller.o.b(a).a(a.a);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (e e1)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(e1);
                    }
                    return;
                }
            }

            
            {
                a = o.this;
                super();
            }
        });
    }

    private void a(a.a a1, Object obj)
    {
        a1 = new a(a1, obj);
        setChanged();
        notifyObservers(a1);
    }

    static void a(o o1, a.a a1, Object obj)
    {
        o1.a(a1, obj);
    }

    static void a(o o1, File file)
    {
        o1.b(file);
    }

    static void a(o o1, List list, List list1)
    {
        o1.a(list, list1);
    }

    private void a(List list, List list1)
    {
        List list2 = x();
        List list3 = a(list2);
        Object obj = list3.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (InstalledStickerBundle)((Iterator) (obj)).next();
            if (((InstalledStickerBundle) (obj1)).m())
            {
                obj1 = ((InstalledStickerBundle) (obj1)).j().iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    Sticker sticker = (Sticker)((Iterator) (obj1)).next();
                    f.b(sticker);
                }
            }
        } while (true);
        t();
        if (g.m() > 0)
        {
            list.add(g);
            list1.add(g);
        }
        obj = w();
        list.addAll(((java.util.Collection) (obj)));
        list1.addAll(((java.util.Collection) (obj)));
        int i1 = 0;
        while (i1 < 2) 
        {
            StickerBundle stickerbundle;
            if (!list2.isEmpty())
            {
                stickerbundle = (StickerBundle)list2.get(0);
            } else
            {
                stickerbundle = null;
            }
            if (stickerbundle != null)
            {
                if (!list3.isEmpty() && list3.contains(stickerbundle))
                {
                    int j1 = list3.indexOf(stickerbundle);
                    StickerBundle stickerbundle1 = (StickerBundle)list3.get(j1);
                    list.add(stickerbundle1);
                    list1.add(stickerbundle1);
                    list3.remove(j1);
                } else
                {
                    list.add(stickerbundle);
                }
                list2.remove(stickerbundle);
            }
            i1++;
        }
        list.addAll(list3);
        list1.addAll(list3);
        list2.removeAll(list3);
        list.addAll(list2);
    }

    static d b(o o1)
    {
        return o1.o;
    }

    private void b(File file)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = a();
        String s2;
        String s1 = ((o) (obj1)).e();
        s2 = ((o) (obj1)).d();
        obj1 = new File(s1);
        Object obj = obj1;
        com.cardinalblue.android.b.k.a("nvdciuewkbnbdsgydsg", file, ((File) (obj1)));
        obj = obj1;
        file = ((File) (r));
        obj = obj1;
        file;
        JVM INSTR monitorenter ;
        com.cardinalblue.android.b.k.a(((File) (obj1)), new File(s2));
        file;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        ((File) (obj1)).delete();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        file;
        JVM INSTR monitorexit ;
        Object obj2;
        obj = obj1;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            file = ((File) (obj1));
        }
        finally { }
        obj2 = obj;
_L3:
        obj = file;
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj2)));
        if (file == null) goto _L2; else goto _L1
_L1:
        file.delete();
          goto _L2
        file;
        throw file;
        file;
        obj = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        ((File) (obj)).delete();
        throw file;
        obj2;
        file = null;
          goto _L3
    }

    public static com.cardinalblue.android.piccollage.view.fragments.g c(StickerBundle stickerbundle)
    {
        if (stickerbundle instanceof RecentStickersBundle)
        {
            return new t();
        }
        if (stickerbundle instanceof NoInternetBundle)
        {
            return new w();
        }
        if ((stickerbundle instanceof PurchasableStickerBundle) && !stickerbundle.i())
        {
            return new z();
        }
        if ((stickerbundle instanceof InstalledStickerBundle) && !((InstalledStickerBundle)stickerbundle).m())
        {
            return new t();
        } else
        {
            return new FreeStickerBundleFragment();
        }
    }

    static AtomicBoolean c(o o1)
    {
        return o1.p;
    }

    static List d(o o1)
    {
        return o1.m;
    }

    static List e(o o1)
    {
        return o1.n;
    }

    private void r()
    {
        String s1;
        s1 = com.cardinalblue.android.b.k.j().getString("key_recent_stickers_stack_v2", "");
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        f = (FixedSizeStack)com.cardinalblue.android.b.k.b(s1, d);
        t();
        return;
        Throwable throwable;
        throwable;
        com.cardinalblue.android.piccollage.a.f.a(throwable);
        return;
    }

    private void s()
    {
        String s1 = (new f()).b(f, d);
        if (!TextUtils.isEmpty(s1))
        {
            com.cardinalblue.android.b.k.j().edit().putString("key_recent_stickers_stack_v2", s1).commit();
        }
    }

    private void t()
    {
        List list = f.a();
        int i1 = g.j().size();
        int j1 = list.size();
        g.a(list);
        if (i1 == 0 && j1 > 0)
        {
            q();
        }
    }

    private void u()
    {
        f.b();
        t();
        com.cardinalblue.android.b.k.j().edit().remove("key_recent_stickers_stack_v2").apply();
        com.cardinalblue.android.b.k.j().edit().remove("pref_move_folders_under_resources").apply();
    }

    private void v()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        a(arraylist, arraylist1);
        m.clear();
        m.addAll(arraylist);
        n.clear();
        n.addAll(arraylist1);
    }

    private ArrayList w()
    {
        ArrayList arraylist = new ArrayList();
        AssetManager assetmanager = k.getAssets();
        String as[];
        int i1;
        try
        {
            as = assetmanager.list("stickers");
        }
        catch (IOException ioexception)
        {
            return arraylist;
        }
        i1 = 0;
        while (i1 < as.length) 
        {
            try
            {
                arraylist.add(InstalledStickerBundle.a((new StringBuilder()).append("assets://stickers/").append(as[i1]).toString()));
            }
            catch (IOException ioexception1)
            {
                com.cardinalblue.android.piccollage.a.f.a(ioexception1);
            }
            i1++;
        }
        return arraylist;
    }

    private List x()
    {
        boolean flag = true;
        obj = r;
        obj;
        JVM INSTR monitorenter ;
        File file = new File(d());
        if (!file.exists() || !file.isFile())
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        if (!flag) goto _L2; else goto _L1
_L1:
        synchronized (r)
        {
            obj = a(file);
        }
_L4:
        if (obj == null)
        {
            return new ArrayList();
        }
        break; /* Loop/switch isn't completed */
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = y();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
            obj = y();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj = y();
        if (true) goto _L4; else goto _L3
_L3:
        h.clear();
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
        {
            PurchasableStickerBundle purchasablestickerbundle = (PurchasableStickerBundle)iterator.next();
            h.add(purchasablestickerbundle);
            if (purchasablestickerbundle.i());
        }

        return ((List) (obj));
    }

    private List y()
    {
        InputStream inputstream = k.getResources().openRawResource(0x7f060008);
        Object obj2 = (m)(new f()).a(new InputStreamReader(inputstream), com/cardinalblue/android/piccollage/model/m);
        if (obj2 == null)
        {
            com.cardinalblue.android.b.k.a(inputstream);
            return null;
        }
        synchronized (l)
        {
            obj2 = ((m) (obj2)).a();
        }
        com.cardinalblue.android.b.k.a(inputstream);
        return ((List) (obj2));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj1)));
        com.cardinalblue.android.b.k.a(inputstream);
        return null;
        obj1;
        com.cardinalblue.android.b.k.a(inputstream);
        throw obj1;
    }

    public StickerBundle a(String s1)
    {
        if (s1 == null)
        {
            return null;
        }
        for (Iterator iterator = m.iterator(); iterator.hasNext();)
        {
            StickerBundle stickerbundle = (StickerBundle)iterator.next();
            if (s1.toLowerCase().contains(stickerbundle.f().toLowerCase()))
            {
                return stickerbundle;
            }
        }

        return null;
    }

    public List a(boolean flag)
    {
        if (flag)
        {
            return m;
        } else
        {
            return n;
        }
    }

    public void a(Sticker sticker, boolean flag)
    {
        if (flag)
        {
            t.add(sticker);
            return;
        } else
        {
            t.remove(sticker);
            return;
        }
    }

    public void a(ArrayList arraylist)
    {
        t.addAll(arraylist);
    }

    public boolean a(StickerBundle stickerbundle)
    {
        if (!p.get() && stickerbundle != null)
        {
            if (stickerbundle instanceof InstalledStickerBundle)
            {
                a(com.cardinalblue.android.piccollage.controller.a.a.c, stickerbundle);
                a(com.cardinalblue.android.piccollage.controller.a.a.f, stickerbundle);
                return true;
            }
            if (stickerbundle instanceof PurchasableStickerBundle)
            {
                p.set(true);
                String s2 = stickerbundle.f();
                String s1;
                if (stickerbundle.i())
                {
                    s1 = "free";
                } else
                {
                    s1 = "paid";
                }
                com.cardinalblue.android.piccollage.a.b.g(s2, s1);
                a(a.a.a, null);
                s = new g();
                a((PurchasableStickerBundle)stickerbundle, s).a(new i() {

                    final o a;

                    public InstalledStickerBundle a(j j1)
                        throws Exception
                    {
                        com.cardinalblue.android.piccollage.controller.o.c(a).set(false);
                        if (j1.c())
                        {
                            com.cardinalblue.android.piccollage.a.b.G("cancel");
                            o.a(a, com.cardinalblue.android.piccollage.controller.a.a.e, null);
                            return null;
                        }
                        if (j1.d() || j1.e() == null)
                        {
                            com.cardinalblue.android.piccollage.a.b.G("fail");
                            o.a(a, com.cardinalblue.android.piccollage.controller.a.a.d, Integer.valueOf(0x7f0700f8));
                            return null;
                        }
                        j1 = (InstalledStickerBundle)j1.e();
                        com.cardinalblue.android.piccollage.a.b.G("success");
                        o.a(a, com.cardinalblue.android.piccollage.controller.a.a.c, j1);
                        int i1 = com.cardinalblue.android.piccollage.controller.o.d(a).indexOf(j1);
                        if (i1 >= 0)
                        {
                            com.cardinalblue.android.piccollage.controller.o.d(a).set(i1, j1);
                        } else
                        {
                            com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException((new StringBuilder()).append(j1).append(" should be find in sticker bundle list").toString()));
                        }
                        o.a(a, com.cardinalblue.android.piccollage.controller.a.a.f, j1.f());
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                a = o.this;
                super();
            }
                }, j.b);
                return true;
            }
        }
        return false;
    }

    public boolean a(Sticker sticker)
    {
        return t.contains(sticker);
    }

    public PurchasableStickerBundle b(String s1)
    {
        List list = h;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = h.iterator();
_L2:
        PurchasableStickerBundle purchasablestickerbundle;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_72;
            }
            purchasablestickerbundle = (PurchasableStickerBundle)iterator.next();
        } while (purchasablestickerbundle == null || s1 == null);
        String s2 = purchasablestickerbundle.f();
        if (s2 == null) goto _L2; else goto _L1
_L1:
        if (!s2.equals(s1)) goto _L2; else goto _L3
_L3:
        list;
        JVM INSTR monitorexit ;
        return purchasablestickerbundle;
        list;
        JVM INSTR monitorexit ;
        return null;
        s1;
        list;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public String b(StickerBundle stickerbundle)
    {
        float f1 = stickerbundle.d();
        if (f1 <= 0.0F)
        {
            return k.getString(0x7f0701b7);
        } else
        {
            return Float.toString(f1);
        }
    }

    public void b()
    {
        r();
        q();
    }

    public String c()
    {
        return (new StringBuilder()).append(i).append(File.separator).append("DownloadedIAPStickerList").toString();
    }

    public String d()
    {
        return (new StringBuilder()).append(i).append(File.separator).append("EncryptedIAPStickerList").toString();
    }

    public String e()
    {
        return (new StringBuilder()).append(i).append(File.separator).append("TempEncryptedIAPStickerList").toString();
    }

    public File f()
    {
        return j;
    }

    public List g()
    {
        return a(com.cardinalblue.android.b.k.b(k));
    }

    public ArrayList h()
    {
        return t;
    }

    public void i()
    {
        t.clear();
    }

    public void j()
    {
        Sticker sticker;
        for (Iterator iterator = t.iterator(); iterator.hasNext(); f.a(sticker))
        {
            sticker = (Sticker)iterator.next();
        }

        t();
    }

    public void k()
    {
        s();
    }

    public void l()
    {
        m.clear();
        File afile[] = f().listFiles();
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            if (file.getAbsolutePath().endsWith(".bundle"))
            {
                com.cardinalblue.android.b.k.a(file);
            }
        }

        com.cardinalblue.android.b.k.a(new File(c()));
        u();
        v();
        p();
    }

    public void m()
    {
        if (k == null)
        {
            return;
        }
        try
        {
            a(k);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        com.cardinalblue.android.b.k.a(k, 0x7f07023f, 0);
    }

    public void n()
    {
        e.removeCallbacks(u);
        e.postDelayed(u, com.cardinalblue.android.b.d.i() + 1000L);
    }

    public void o()
    {
        if (s != null)
        {
            s.b();
        }
    }

    public j p()
    {
        return com.cardinalblue.android.piccollage.controller.network.f.c(k).d(new i() {

            final o a;

            public j a(j j1)
                throws Exception
            {
                o.a(a, (File)j1.e());
                return a.q();
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = o.this;
                super();
            }
        }, k.b).c(new i() {

            final o a;

            public Void a(j j1)
                throws Exception
            {
                o.a(a, com.cardinalblue.android.piccollage.controller.a.a.g, null);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = o.this;
                super();
            }
        }, k.a);
    }

    public j q()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        return bolts.j.a(new Callable(arraylist, arraylist1) {

            final List a;
            final List b;
            final o c;

            public Void a()
                throws Exception
            {
                o.a(c, a, b);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                c = o.this;
                a = list;
                b = list1;
                super();
            }
        }).c(new i(arraylist, arraylist1) {

            final List a;
            final List b;
            final o c;

            public Void a(j j1)
                throws Exception
            {
                if (com.cardinalblue.android.piccollage.controller.o.c(c).get())
                {
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.controller.o.d(c).clear();
                    com.cardinalblue.android.piccollage.controller.o.d(c).addAll(a);
                    com.cardinalblue.android.piccollage.controller.o.e(c).clear();
                    com.cardinalblue.android.piccollage.controller.o.e(c).addAll(b);
                    o.a(c, com.cardinalblue.android.piccollage.controller.a.a.f, null);
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                c = o.this;
                a = list;
                b = list1;
                super();
            }
        }, k.a);
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/controller/StickerBundleManager$6

/* anonymous class */
    class StickerBundleManager._cls6
        implements Runnable
    {

        final o a;

        public void run()
        {
            a.q();
        }

            
            {
                a = o.this;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/controller/StickerBundleManager$7

/* anonymous class */
    class StickerBundleManager._cls7
        implements Runnable
    {

        final PurchasableStickerBundle a;
        final g b;
        final bolts.j.a c;
        final o d;

        public void run()
        {
            Object obj;
            File file;
            Object obj2;
            byte abyte0[];
            int i1;
            int j1;
            int k1;
            obj = a;
            Object obj1 = ((PurchasableStickerBundle) (obj)).m();
            try
            {
                if (b.a())
                {
                    c.b();
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                c.a(((Exception) (obj)));
                return;
            }
            file = o.a().f();
            obj2 = (HttpURLConnection)(new URL(((String) (obj1)))).openConnection();
            obj1 = ((HttpURLConnection) (obj2)).getInputStream();
            j1 = ((HttpURLConnection) (obj2)).getContentLength();
            obj2 = new BufferedOutputStream(new FileOutputStream(new File(file, (new StringBuilder()).append(((PurchasableStickerBundle) (obj)).a()).append(".zip").toString())));
            abyte0 = new byte[8192];
            i1 = 0;
_L1:
            k1 = ((InputStream) (obj1)).read(abyte0);
            if (k1 <= 0)
            {
                break MISSING_BLOCK_LABEL_217;
            }
            if (b.a())
            {
                ((BufferedOutputStream) (obj2)).flush();
                ((BufferedOutputStream) (obj2)).close();
                c.b();
                return;
            }
            i1 += k1;
            bolts.j.a(new StickerBundleManager._cls7._cls1(this, (i1 * 100) / j1), j.b);
            ((BufferedOutputStream) (obj2)).write(abyte0, 0, k1);
              goto _L1
            ((BufferedOutputStream) (obj2)).flush();
            ((BufferedOutputStream) (obj2)).close();
            c c1 = new c((new StringBuilder()).append(file).append(File.separator).append(((PurchasableStickerBundle) (obj)).a()).append(".zip").toString());
            c1.a(file.getAbsolutePath());
            com.cardinalblue.android.b.k.a(c1.a());
            com.cardinalblue.android.b.k.a(new File((new StringBuilder()).append(c1.a().getParent()).append("/__MACOSX").toString()));
            obj = new File(file, (new StringBuilder()).append(((PurchasableStickerBundle) (obj)).f()).append(".bundle").toString());
            c.a(InstalledStickerBundle.a(((File) (obj))));
            return;
        }

            
            {
                d = o.this;
                a = purchasablestickerbundle;
                b = g1;
                c = a1;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/controller/StickerBundleManager$7$1

/* anonymous class */
    class StickerBundleManager._cls7._cls1
        implements Callable
    {

        final int a;
        final StickerBundleManager._cls7 b;

        public Object call()
            throws Exception
        {
            o.a(b.d, com.cardinalblue.android.piccollage.controller.a.a.b, Integer.valueOf(a));
            return null;
        }

            
            {
                b = _pcls7;
                a = i1;
                super();
            }
    }

}
