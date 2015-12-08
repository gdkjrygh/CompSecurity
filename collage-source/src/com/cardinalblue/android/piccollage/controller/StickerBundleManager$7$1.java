// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import bolts.g;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.InstalledStickerBundle;
import com.cardinalblue.android.piccollage.model.PurchasableStickerBundle;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import net.lingala.zip4j.a.c;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            o

class a
    implements Callable
{

    final int a;
    final a b;

    public Object call()
        throws Exception
    {
        o.a(b.b, b, Integer.valueOf(a));
        return null;
    }

    ( , int i)
    {
        b = ;
        a = i;
        super();
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
            int i;
            int l;
            int i1;
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
            l = ((HttpURLConnection) (obj2)).getContentLength();
            obj2 = new BufferedOutputStream(new FileOutputStream(new File(file, (new StringBuilder()).append(((PurchasableStickerBundle) (obj)).a()).append(".zip").toString())));
            abyte0 = new byte[8192];
            i = 0;
_L1:
            i1 = ((InputStream) (obj1)).read(abyte0);
            if (i1 <= 0)
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
            i += i1;
            j.a(new StickerBundleManager._cls7._cls1(this, (i * 100) / l), j.b);
            ((BufferedOutputStream) (obj2)).write(abyte0, 0, i1);
              goto _L1
            ((BufferedOutputStream) (obj2)).flush();
            ((BufferedOutputStream) (obj2)).close();
            c c1 = new c((new StringBuilder()).append(file).append(File.separator).append(((PurchasableStickerBundle) (obj)).a()).append(".zip").toString());
            c1.a(file.getAbsolutePath());
            k.a(c1.a());
            k.a(new File((new StringBuilder()).append(c1.a().getParent()).append("/__MACOSX").toString()));
            obj = new File(file, (new StringBuilder()).append(((PurchasableStickerBundle) (obj)).f()).append(".bundle").toString());
            c.a(InstalledStickerBundle.a(((File) (obj))));
            return;
        }

            
            {
                d = o1;
                a = purchasablestickerbundle;
                b = g1;
                c = a1;
                super();
            }
    }

}
