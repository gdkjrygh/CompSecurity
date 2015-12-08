// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.Context;
import bolts.g;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.model.InstalledStickerBundle;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.ActionableBackground;
import com.cardinalblue.android.piccollage.model.gson.AssetBackgroundBundle;
import com.cardinalblue.android.piccollage.model.gson.PurchasableBackground;
import com.cardinalblue.android.piccollage.model.i;
import com.cardinalblue.android.piccollage.model.m;
import com.google.b.f;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.lingala.zip4j.a.c;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            f

public class com.cardinalblue.android.piccollage.controller.a extends Observable
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

        public static a.a valueOf(String s)
        {
            return (a.a)Enum.valueOf(com/cardinalblue/android/piccollage/controller/a$a$a, s);
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

        private a.a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private static com.cardinalblue.android.piccollage.controller.a f;
    private final File a;
    private final File b;
    private final Context c = com.cardinalblue.android.b.k.a();
    private final List d = Collections.synchronizedList(new ArrayList());
    private AtomicBoolean e;
    private g g;

    private com.cardinalblue.android.piccollage.controller.a()
    {
        e = new AtomicBoolean(false);
        a = c.getExternalFilesDir(com.cardinalblue.android.piccollage.controller.f.c);
        b = new File(a, "Bundles/Backgrounds/");
    }

    private j a(PurchasableStickerBundle purchasablestickerbundle, g g1)
    {
        return bolts.j.a(new Callable(purchasablestickerbundle, g1) {

            final PurchasableStickerBundle a;
            final g b;
            final com.cardinalblue.android.piccollage.controller.a c;

            public InstalledStickerBundle a()
                throws Exception
            {
                PurchasableStickerBundle purchasablestickerbundle1 = a;
                Object obj = purchasablestickerbundle1.m();
                if (b.a())
                {
                    throw new InterruptedException();
                }
                Object obj1 = (HttpURLConnection)(new URL(((String) (obj)))).openConnection();
                obj = ((HttpURLConnection) (obj1)).getInputStream();
                int j1 = ((HttpURLConnection) (obj1)).getContentLength();
                obj1 = new File(c.b(), (new StringBuilder()).append(purchasablestickerbundle1.n()).append(".zip").toString());
                BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(((File) (obj1))));
                byte abyte0[] = new byte[8192];
                int i1 = 0;
                do
                {
                    int k1 = ((InputStream) (obj)).read(abyte0);
                    if (k1 > 0)
                    {
                        if (b.a())
                        {
                            bufferedoutputstream.flush();
                            bufferedoutputstream.close();
                            throw new InterruptedException();
                        }
                        i1 += k1;
                        bolts.j.a(new Callable(this, (i1 * 100) / j1) {

                            final int a;
                            final _cls2 b;

                            public Object call()
                                throws Exception
                            {
                                com.cardinalblue.android.piccollage.controller.a.a(b.c, com.cardinalblue.android.piccollage.controller.a.a.b, Integer.valueOf(a));
                                return null;
                            }

            
            {
                b = _pcls2;
                a = i1;
                super();
            }
                        }, j.b);
                        bufferedoutputstream.write(abyte0, 0, k1);
                    } else
                    {
                        bufferedoutputstream.flush();
                        bufferedoutputstream.close();
                        c c1 = new c(((File) (obj1)));
                        c1.a(c.b().getAbsolutePath());
                        com.cardinalblue.android.b.k.a(c1.a());
                        return InstalledStickerBundle.a(new File(c.b(), (new StringBuilder()).append(purchasablestickerbundle1.f()).append(".bundle").toString()));
                    }
                } while (true);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                c = com.cardinalblue.android.piccollage.controller.a.this;
                a = purchasablestickerbundle;
                b = g1;
                super();
            }
        });
    }

    public static com.cardinalblue.android.piccollage.controller.a a()
    {
        if (f == null)
        {
            f = new com.cardinalblue.android.piccollage.controller.a();
        }
        return f;
    }

    static File a(com.cardinalblue.android.piccollage.controller.a a1)
    {
        return a1.b;
    }

    private List a(File file)
        throws com.cardinalblue.android.b.k.a, JSONException
    {
        file = com.cardinalblue.android.b.k.a("nvdciuewkbnbdsgydsg", file);
        Object obj1 = (m)(new f()).a(new InputStreamReader(file), com/cardinalblue/android/piccollage/model/m);
        Object obj;
label0:
        {
            if (obj1 == null)
            {
                com.cardinalblue.android.b.k.a(file);
                return null;
            }
            try
            {
                obj = new ArrayList();
                for (obj1 = ((m) (obj1)).a().iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new PurchasableBackground((PurchasableStickerBundle)((Iterator) (obj1)).next()))) { }
                break label0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                com.cardinalblue.android.b.k.a(file);
                throw obj;
            }
        }
        throw new JSONException(((Throwable) (obj)).getMessage());
        com.cardinalblue.android.b.k.a(file);
        return ((List) (obj));
    }

    private void a(a.a a1, Object obj)
    {
        a1 = new a(a1, obj);
        setChanged();
        notifyObservers(a1);
    }

    static void a(com.cardinalblue.android.piccollage.controller.a a1, a.a a2, Object obj)
    {
        a1.a(a2, obj);
    }

    static void a(com.cardinalblue.android.piccollage.controller.a a1, InstalledStickerBundle installedstickerbundle)
    {
        a1.a(installedstickerbundle);
    }

    static void a(com.cardinalblue.android.piccollage.controller.a a1, List list)
    {
        a1.a(list);
    }

    private void a(InstalledStickerBundle installedstickerbundle)
    {
        com.cardinalblue.android.piccollage.a.b.G("success");
        a(com.cardinalblue.android.piccollage.controller.a.a.c, installedstickerbundle);
        a(com.cardinalblue.android.piccollage.controller.a.a.f, installedstickerbundle);
    }

    private void a(List list)
    {
        list.add(new ActionableBackground());
        list.addAll(n());
        list.addAll(m());
        list.addAll(l());
    }

    private boolean a(String s)
    {
        return (new File(b(), s)).exists();
    }

    static AtomicBoolean b(com.cardinalblue.android.piccollage.controller.a a1)
    {
        return a1.e;
    }

    static void c(com.cardinalblue.android.piccollage.controller.a a1)
    {
        a1.k();
    }

    static File d(com.cardinalblue.android.piccollage.controller.a a1)
    {
        return a1.j();
    }

    static File e(com.cardinalblue.android.piccollage.controller.a a1)
    {
        return a1.i();
    }

    static List f(com.cardinalblue.android.piccollage.controller.a a1)
    {
        return a1.d;
    }

    private File i()
    {
        return new File((new StringBuilder()).append(a).append(File.separator).append("EncryptedIAPBackgroundList").toString());
    }

    private File j()
    {
        return new File((new StringBuilder()).append(a).append(File.separator).append("TempEncryptedIAPBackgroundList").toString());
    }

    private void k()
    {
        ArrayList arraylist = new ArrayList();
        a(arraylist);
        d.clear();
        d.addAll(arraylist);
    }

    private List l()
    {
        return (new AssetBackgroundBundle("backgrounds")).getBackgrounds();
    }

    private List m()
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = b.listFiles(new FilenameFilter() {

            final com.cardinalblue.android.piccollage.controller.a a;

            public boolean accept(File file1, String s)
            {
                return file1.equals(com.cardinalblue.android.piccollage.controller.a.a(a)) && s.endsWith(".bundle");
            }

            
            {
                a = com.cardinalblue.android.piccollage.controller.a.this;
                super();
            }
        });
        if (afile != null)
        {
            int j1 = afile.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                File file = afile[i1];
                if (file.isDirectory())
                {
                    try
                    {
                        arraylist.addAll(com.cardinalblue.android.piccollage.model.i.a(file).a());
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

    private List n()
    {
        Object obj1 = new ArrayList();
        boolean flag = true;
        File file = i();
        if (!file.exists() || !file.isFile())
        {
            flag = false;
        }
        Object obj = obj1;
        if (flag)
        {
            try
            {
                obj = a(file);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        }
        if (obj == null)
        {
            obj = o();
        }
        obj1 = ((List) (obj)).listIterator();
        do
        {
            if (!((ListIterator) (obj1)).hasNext())
            {
                break;
            }
            if (a(((PurchasableBackground)((ListIterator) (obj1)).next()).getPurchaseInfo().n()))
            {
                ((ListIterator) (obj1)).remove();
            }
        } while (true);
        return ((List) (obj));
    }

    private List o()
    {
        Object obj1 = (m)com.cardinalblue.android.b.k.a("backgrounds_iap/background.json", com/cardinalblue/android/piccollage/model/m);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new m();
        }
        obj1 = new ArrayList();
        for (obj = ((m) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); ((List) (obj1)).add(new PurchasableBackground((PurchasableStickerBundle)((Iterator) (obj)).next()))) { }
        return ((List) (obj1));
    }

    public j a(PurchasableStickerBundle purchasablestickerbundle)
    {
        if (e.get() || purchasablestickerbundle == null)
        {
            return bolts.j.a(Boolean.valueOf(false));
        }
        e.set(true);
        String s1 = purchasablestickerbundle.f();
        String s;
        if (purchasablestickerbundle.i())
        {
            s = "free";
        } else
        {
            s = "paid";
        }
        com.cardinalblue.android.piccollage.a.b.g(s1, s);
        a(a.a.a, null);
        g = new g();
        return a(purchasablestickerbundle, g).a(new bolts.i() {

            final com.cardinalblue.android.piccollage.controller.a a;

            public Boolean a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.controller.a.b(a).set(false);
                if (j1.c())
                {
                    com.cardinalblue.android.piccollage.a.b.G("cancel");
                    com.cardinalblue.android.piccollage.controller.a.a(a, a.a.e, null);
                    return null;
                }
                if (j1.d() || j1.e() == null)
                {
                    com.cardinalblue.android.piccollage.a.b.G("fail");
                    com.cardinalblue.android.piccollage.controller.a.a(a, a.a.d, Integer.valueOf(0x7f0700f8));
                    return null;
                } else
                {
                    com.cardinalblue.android.piccollage.controller.a.a(a, (InstalledStickerBundle)j1.e());
                    return null;
                }
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = com.cardinalblue.android.piccollage.controller.a.this;
                super();
            }
        }, j.b);
    }

    public boolean a(StickerBundle stickerbundle)
    {
        if (!e.get() && stickerbundle != null)
        {
            if (stickerbundle instanceof InstalledStickerBundle)
            {
                a(com.cardinalblue.android.piccollage.controller.a.a.c, stickerbundle);
                a(com.cardinalblue.android.piccollage.controller.a.a.f, stickerbundle);
                return true;
            }
            if (stickerbundle instanceof PurchasableStickerBundle)
            {
                e.set(true);
                String s1 = stickerbundle.f();
                String s;
                if (stickerbundle.i())
                {
                    s = "free";
                } else
                {
                    s = "paid";
                }
                com.cardinalblue.android.piccollage.a.b.g(s1, s);
                a(a.a.a, null);
                g = new g();
                a((PurchasableStickerBundle)stickerbundle, g).a(new bolts.i() {

                    final com.cardinalblue.android.piccollage.controller.a a;

                    public InstalledStickerBundle a(j j1)
                        throws Exception
                    {
                        com.cardinalblue.android.piccollage.controller.a.b(a).set(false);
                        if (j1.c())
                        {
                            com.cardinalblue.android.piccollage.a.b.G("cancel");
                            com.cardinalblue.android.piccollage.controller.a.a(a, a.a.e, null);
                            return null;
                        }
                        if (j1.d() || j1.e() == null)
                        {
                            com.cardinalblue.android.piccollage.a.b.G("fail");
                            com.cardinalblue.android.piccollage.controller.a.a(a, a.a.d, Integer.valueOf(0x7f0700f8));
                            return null;
                        } else
                        {
                            com.cardinalblue.android.piccollage.controller.a.a(a, (InstalledStickerBundle)j1.e());
                            return null;
                        }
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                a = com.cardinalblue.android.piccollage.controller.a.this;
                super();
            }
                }, j.b);
                return true;
            }
        }
        return false;
    }

    public File b()
    {
        return b;
    }

    public List c()
    {
        return d;
    }

    public List d()
    {
        return n();
    }

    public void e()
    {
        if (g != null)
        {
            g.b();
        }
    }

    public j f()
    {
        return com.cardinalblue.android.piccollage.controller.network.f.b(c).c(new bolts.i() {

            final com.cardinalblue.android.piccollage.controller.a a;

            public Void a(j j1)
                throws Exception
            {
                File file1 = com.cardinalblue.android.piccollage.controller.a.d(a);
                File file = file1;
                com.cardinalblue.android.b.k.a("nvdciuewkbnbdsgydsg", (File)j1.e(), file1);
                file = file1;
                com.cardinalblue.android.b.k.a(file1, com.cardinalblue.android.piccollage.controller.a.e(a));
                if (file1 != null)
                {
                    file1.delete();
                }
_L2:
                return null;
                j1;
                file1 = null;
_L5:
                file = file1;
                com.cardinalblue.android.piccollage.a.f.a(j1);
                if (file1 == null) goto _L2; else goto _L1
_L1:
                file1.delete();
                return null;
                j1;
                file = null;
_L4:
                if (file != null)
                {
                    file.delete();
                }
                throw j1;
                j1;
                if (true) goto _L4; else goto _L3
_L3:
                j1;
                  goto _L5
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = com.cardinalblue.android.piccollage.controller.a.this;
                super();
            }
        }, k.b).c(new bolts.i() {

            final com.cardinalblue.android.piccollage.controller.a a;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.controller.a.c(a);
                com.cardinalblue.android.piccollage.controller.a.a(a, com.cardinalblue.android.piccollage.controller.a.a.g, null);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = com.cardinalblue.android.piccollage.controller.a.this;
                super();
            }
        }, k.a);
    }

    public void g()
    {
        d.clear();
        File afile[] = b().listFiles();
        if (afile != null)
        {
            int j1 = afile.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.cardinalblue.android.b.k.a(afile[i1]);
            }

        }
        com.cardinalblue.android.b.k.a(i());
        k();
        f();
    }

    public j h()
    {
        ArrayList arraylist = new ArrayList();
        return bolts.j.a(new Callable(arraylist) {

            final List a;
            final com.cardinalblue.android.piccollage.controller.a b;

            public Void a()
                throws Exception
            {
                com.cardinalblue.android.piccollage.controller.a.a(b, a);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = com.cardinalblue.android.piccollage.controller.a.this;
                a = list;
                super();
            }
        }).c(new bolts.i(arraylist) {

            final List a;
            final com.cardinalblue.android.piccollage.controller.a b;

            public Void a(j j1)
                throws Exception
            {
                com.cardinalblue.android.piccollage.controller.a.f(b).clear();
                com.cardinalblue.android.piccollage.controller.a.f(b).addAll(a);
                com.cardinalblue.android.piccollage.controller.a.a(b, com.cardinalblue.android.piccollage.controller.a.a.f, null);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                b = com.cardinalblue.android.piccollage.controller.a.this;
                a = list;
                super();
            }
        }, k.a);
    }
}
