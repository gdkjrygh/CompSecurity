// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import bolts.j;
import com.android.volley.toolbox.m;
import com.androidquery.callback.BitmapAjaxCallback;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.controller.o;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            e, h, f, i

public abstract class com.cardinalblue.android.piccollage.lib.a
    implements com.cardinalblue.android.piccollage.lib.e
{
    public static class a extends com.cardinalblue.android.piccollage.lib.a
    {

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException
        {
            Object obj;
            Object obj1;
            obj1 = null;
            obj = null;
            Object obj2 = k.a().getResources().getAssets().open(b.c(a));
            obj = obj2;
            obj1 = obj2;
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            obj = obj2;
            obj1 = obj2;
            options.inJustDecodeBounds = true;
            obj = obj2;
            obj1 = obj2;
            BitmapFactory.decodeStream(((InputStream) (obj2)), null, options);
            obj = obj2;
            obj1 = obj2;
            ((InputStream) (obj2)).close();
            obj = obj2;
            obj1 = obj2;
            l = a(options, l);
            obj = obj2;
            obj1 = obj2;
            options = new android.graphics.BitmapFactory.Options();
            obj = obj2;
            obj1 = obj2;
            options.inPreferredConfig = config;
            obj = obj2;
            obj1 = obj2;
            options.inSampleSize = l;
            obj = obj2;
            obj1 = obj2;
            config = k.a().getResources().getAssets().open(b.c(a));
            obj = config;
            obj1 = config;
            obj2 = BitmapFactory.decodeStream(config, null, options);
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_303;
            }
            obj = config;
            obj1 = config;
            try
            {
                throw new IOException((new StringBuilder()).append("can't decode bitmap, this url is not available : ").append(a).toString());
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.Config config)
            {
                obj1 = obj;
            }
            finally
            {
                k.a(((java.io.Closeable) (obj1)));
            }
            if (!(config instanceof OutOfMemoryError))
            {
                break MISSING_BLOCK_LABEL_246;
            }
            obj1 = obj;
            System.gc();
            obj1 = obj;
            obj2 = new IOException((new StringBuilder()).append("[AssetImageSource] : ").append(config).toString());
            obj1 = obj;
            ((IOException) (obj2)).setStackTrace(config.getStackTrace());
            obj1 = obj;
            throw obj2;
            throw config;
            k.a(config);
            return ((Bitmap) (obj2));
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
            throws IOException
        {
            f1 = (BitmapAjaxCallback)((BitmapAjaxCallback)(new AbstractImageSource.AssetsImageSource._cls1(this, imageview, f1)).a(a)).a(1);
            (new com.androidquery.a(imageview)).a(f1);
        }

        public InputStream d()
            throws IOException
        {
            return k.a().getResources().getAssets().open(b.c(a));
        }

        public a(String s)
        {
            super(s, null);
        }
    }

    public static class b extends com.cardinalblue.android.piccollage.lib.a
    {

        private final com.cardinalblue.android.piccollage.lib.a c = e.a(e());

        private String e()
        {
            Uri uri = Uri.parse(a());
            List list = uri.getPathSegments();
            if (!list.isEmpty())
            {
                if ("backgrounds".equals(list.get(0)))
                {
                    return a().replace(b.a(), e.a.e.a());
                }
                if ("StickerLite.bundle".equals(list.get(0)))
                {
                    return a().replace(b.a(), e.a.e.a()).replace("StickerLite.bundle", "stickers/StickerLite");
                }
            }
            return Uri.fromFile(new File(o.a().f(), uri.getPath())).toString();
        }

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException, OutOfMemoryError
        {
            return c.a(l, config);
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
            throws IOException, OutOfMemoryError
        {
            c.a(imageview, f1);
        }

        public InputStream d()
            throws IOException
        {
            return c.d();
        }

        public b(String s)
        {
            super(s, null);
        }
    }

    public static class c extends com.cardinalblue.android.piccollage.lib.a
    {

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException
        {
            Object obj;
            Object obj1;
            Object obj2;
            Uri uri;
            obj1 = null;
            obj = null;
            uri = a(a);
            obj2 = k.a().getContentResolver().openInputStream(uri);
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(((InputStream) (obj2)), null, options);
            l = a(options, l);
            if (obj2 != null)
            {
                if (false)
                {
                    try
                    {
                        ((InputStream) (obj2)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (android.graphics.Bitmap.Config config)
                    {
                        throw new NullPointerException();
                    }
                } else
                {
                    ((InputStream) (obj2)).close();
                }
            }
            obj1 = k.a().getContentResolver().openInputStream(uri);
            obj2 = new android.graphics.BitmapFactory.Options();
            obj2.inPreferredConfig = config;
            obj2.inSampleSize = l;
            config = com.cardinalblue.android.b.a.a(BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj2))), k.a(k.a(), uri), 2);
            if (config != null) goto _L2; else goto _L1
_L1:
            try
            {
                throw new IOException((new StringBuilder()).append("can't decode bitmap, this url is not available : ").append(uri).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally { }
            throw obj;
            config;
            if (obj1 == null) goto _L4; else goto _L3
_L3:
            if (obj == null) goto _L6; else goto _L5
_L5:
            ((InputStream) (obj1)).close();
_L4:
            try
            {
                throw config;
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.Config config) { }
            if (config instanceof OutOfMemoryError)
            {
                System.gc();
            }
            obj = new IOException((new StringBuilder()).append("[ContentkImageSource] : ").append(config).toString());
            ((IOException) (obj)).setStackTrace(config.getStackTrace());
            throw obj;
            obj;
            throw obj;
            config;
_L7:
            if (obj2 != null)
            {
                if (obj != null)
                {
                    try
                    {
                        ((InputStream) (obj2)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        ((Throwable) (obj)).addSuppressed(((Throwable) (obj1)));
                    }
                } else
                {
                    ((InputStream) (obj2)).close();
                }
            }
            throw config;
_L2:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_300;
            }
            if (true)
            {
                break MISSING_BLOCK_LABEL_311;
            }
            ((InputStream) (obj1)).close();
            return config;
            config;
            throw new NullPointerException();
            ((InputStream) (obj1)).close();
            return config;
            obj1;
            ((Throwable) (obj)).addSuppressed(((Throwable) (obj1)));
              goto _L4
_L6:
            ((InputStream) (obj1)).close();
              goto _L4
            config;
            obj = obj1;
              goto _L7
        }

        protected Uri a(String s)
            throws IOException
        {
            String as[] = s.split("content://");
            if (as.length > 2)
            {
                com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("weird intent uri : ").append(s).toString()));
                String s1 = (new StringBuilder()).append("content://").append(as[as.length - 1]).toString();
                int l = s1.indexOf("/ACTUAL");
                s = s1;
                if (l > 0)
                {
                    s = s1.substring(0, l);
                }
                return Uri.parse(s);
            } else
            {
                return a(s);
            }
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
        {
        }

        public InputStream d()
            throws IOException
        {
            return k.a().getContentResolver().openInputStream(Uri.parse(a));
        }

        public c(String s)
        {
            super(s, null);
        }
    }

    public static class d extends com.cardinalblue.android.piccollage.lib.a
    {

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException
        {
            Object obj;
            Object obj1;
            Uri uri;
            obj1 = null;
            obj = null;
            uri = a(a);
            Object obj2 = k.a().getContentResolver().openInputStream(uri);
            obj = obj2;
            obj1 = obj2;
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            obj = obj2;
            obj1 = obj2;
            options.inJustDecodeBounds = true;
            obj = obj2;
            obj1 = obj2;
            BitmapFactory.decodeStream(((InputStream) (obj2)), null, options);
            obj = obj2;
            obj1 = obj2;
            ((InputStream) (obj2)).close();
            obj = obj2;
            obj1 = obj2;
            l = a(options, l);
            obj = obj2;
            obj1 = obj2;
            options = new android.graphics.BitmapFactory.Options();
            obj = obj2;
            obj1 = obj2;
            options.inPreferredConfig = config;
            obj = obj2;
            obj1 = obj2;
            options.inSampleSize = l;
            obj = obj2;
            obj1 = obj2;
            config = k.a().getContentResolver().openInputStream(uri);
            obj = config;
            obj1 = config;
            obj2 = com.cardinalblue.android.b.a.a(BitmapFactory.decodeStream(config, null, options), k.a(k.a(), uri), 2);
            if (obj2 != null)
            {
                break MISSING_BLOCK_LABEL_300;
            }
            obj = config;
            obj1 = config;
            try
            {
                throw new IOException((new StringBuilder()).append("can't decode bitmap, this url is not available : ").append(uri).toString());
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.Config config)
            {
                obj1 = obj;
            }
            finally
            {
                k.a(((java.io.Closeable) (obj1)));
            }
            if (!(config instanceof OutOfMemoryError))
            {
                break MISSING_BLOCK_LABEL_243;
            }
            obj1 = obj;
            System.gc();
            obj1 = obj;
            obj2 = new IOException((new StringBuilder()).append("[FileImageSource] : ").append(config).toString());
            obj1 = obj;
            ((IOException) (obj2)).setStackTrace(config.getStackTrace());
            obj1 = obj;
            throw obj2;
            throw config;
            k.a(config);
            return ((Bitmap) (obj2));
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
        {
            f1 = (BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)(new AbstractImageSource.FileImageSource._cls1(this, f1, imageview)).a(b.c(a))).b(false)).a(true);
            (new com.androidquery.a(imageview)).a(f1);
        }

        public InputStream d()
            throws IOException
        {
            Uri uri = Uri.fromFile(new File(b.c(a)));
            return k.a().getContentResolver().openInputStream(uri);
        }

        public d(String s)
        {
            super(s, null);
        }
    }

    public static class e
    {

        public static com.cardinalblue.android.piccollage.lib.a a(com.cardinalblue.android.piccollage.view.g g1)
        {
            if (g1 == null)
            {
                throw new IllegalArgumentException("image scrap == null");
            }
            Object obj = g1.i();
            if (g1 instanceof com.cardinalblue.android.piccollage.view.o)
            {
                com.cardinalblue.android.piccollage.view.o o1 = (com.cardinalblue.android.piccollage.view.o)g1;
                obj = o1.aj();
                if (TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(o1.ag()))
                {
                    obj = (new StringBuilder()).append("https://i.ytimg.com/vi/").append(Uri.parse(o1.ag()).getLastPathSegment()).append("/hqdefault.jpg").toString();
                }
            }
            try
            {
                obj = a(((String) (obj)));
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                File file = g1.k();
                g1 = file;
                if (file == null)
                {
                    g1 = new File("");
                    com.cardinalblue.android.piccollage.a.f.a(new RuntimeException("image scrap has unexpected resource file path"));
                }
                return new f(g1.getAbsolutePath());
            }
            return ((com.cardinalblue.android.piccollage.lib.a) (obj));
        }

        public static com.cardinalblue.android.piccollage.lib.a a(String s)
            throws IllegalArgumentException
        {
            static class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[com.cardinalblue.android.piccollage.lib.e.a.values().length];
                    try
                    {
                        a[e.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[e.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[e.a.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[e.a.e.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[e.a.d.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.cardinalblue.android.piccollage.lib.e.a.f.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[e.a.g.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[e.a.h.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls2.a[com.cardinalblue.android.piccollage.lib.e.a.a(s).ordinal()])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("uri is not valid: ").append(s).toString());

            case 1: // '\001'
            case 2: // '\002'
                return new g(s);

            case 3: // '\003'
                return new d(s);

            case 4: // '\004'
                return new a(s);

            case 5: // '\005'
                return new c(s);

            case 6: // '\006'
                return new h(s);

            case 7: // '\007'
                return new b(s);

            case 8: // '\b'
                return new i(s);
            }
        }

        public e()
        {
        }
    }

    public static class f extends com.cardinalblue.android.piccollage.lib.a
    {

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException
        {
            try
            {
                config = com.cardinalblue.android.piccollage.model.k.a(new File(a), config);
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.Config config)
            {
                IOException ioexception = new IOException((new StringBuilder()).append("[LegacyImageSource] : ").append(config).toString());
                ioexception.setStackTrace(config.getStackTrace());
                throw ioexception;
            }
            return config;
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
            throws IOException
        {
            throw new RuntimeException("this method is not implemented");
        }

        public InputStream d()
            throws IOException
        {
            return new FileInputStream(new File(a));
        }

        public f(String s)
        {
            super(s, null);
        }
    }

    public static class g extends com.cardinalblue.android.piccollage.lib.a
    {

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException
        {
            try
            {
                config = com.cardinalblue.android.piccollage.lib.i.a(k.a()).a(a, l, l, config);
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.Config config)
            {
                IOException ioexception = new IOException((new StringBuilder()).append("[NetworkImageSource] : ").append(config).toString());
                ioexception.setStackTrace(config.getStackTrace());
                throw ioexception;
            }
            return config;
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
        {
            f1 = (BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)(new AbstractImageSource.NetworkImageSource._cls1(this, f1, imageview)).a(a)).a(5)).a(true);
            (new com.androidquery.a(imageview)).a(f1);
        }

        public Executor c()
        {
            return k.c;
        }

        public InputStream d()
            throws IOException
        {
            Object obj;
            try
            {
                obj = com.cardinalblue.android.piccollage.lib.i.a(k.a());
                m m1 = m.a();
                m1.a(((com.cardinalblue.android.piccollage.lib.i) (obj)).b(new i.a(0, a, m1, m1)));
                obj = new ByteArrayInputStream((byte[])m1.get());
            }
            catch (Throwable throwable)
            {
                IOException ioexception = new IOException((new StringBuilder()).append("[NetworkImageSource] : ").append(throwable).toString());
                ioexception.setStackTrace(throwable.getStackTrace());
                throw ioexception;
            }
            return ((InputStream) (obj));
        }

        public g(String s)
        {
            super(s, null);
        }
    }

    public static class h extends com.cardinalblue.android.piccollage.lib.a
    {

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException, OutOfMemoryError
        {
            try
            {
                config = BitmapFactory.decodeResource(k.a().getResources(), Integer.valueOf(b.c(a)).intValue());
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.Config config)
            {
                IOException ioexception = new IOException((new StringBuilder()).append("Invalid uri to convert resource id. Uri: ").append(a).toString());
                ioexception.setStackTrace(config.getStackTrace());
                throw ioexception;
            }
            return config;
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
            throws IOException, OutOfMemoryError
        {
            try
            {
                imageview.setImageResource(Integer.valueOf(b.c(a)).intValue());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ImageView imageview)
            {
                throw new IOException((new StringBuilder()).append("Invalid uri to convert resource id. Uri: ").append(a).toString());
            }
        }

        public InputStream d()
            throws IOException
        {
            return null;
        }

        public h(String s)
        {
            super(s, null);
        }
    }

    public static class i extends com.cardinalblue.android.piccollage.lib.a
    {

        private final com.cardinalblue.android.piccollage.lib.a c = e.a(e());

        private String e()
        {
            return (new StringBuilder()).append("https://i.ytimg.com/vi/").append(Uri.parse(a).getLastPathSegment()).append("/hqdefault.jpg").toString();
        }

        public Bitmap a(int l, android.graphics.Bitmap.Config config)
            throws IOException, OutOfMemoryError
        {
            return c.a(l, config);
        }

        public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
            throws IOException, OutOfMemoryError
        {
            c.a(imageview, f1);
        }

        public InputStream d()
            throws IOException
        {
            return c.d();
        }

        public i(String s)
        {
            super(s, null);
        }
    }


    protected final String a;
    protected e.a b;

    private com.cardinalblue.android.piccollage.lib.a(String s)
    {
        a = s;
        b = com.cardinalblue.android.piccollage.lib.e.a.a(a);
    }


    protected int a(android.graphics.BitmapFactory.Options options, int l)
    {
        if (l == 0)
        {
            return 1;
        } else
        {
            return com.cardinalblue.android.piccollage.lib.h.a(Math.max(options.outWidth, options.outHeight), l);
        }
    }

    public final Bitmap a(int l)
        throws IOException, OutOfMemoryError
    {
        return a(l, com.cardinalblue.android.piccollage.controller.f.e);
    }

    protected Uri a(String s)
        throws IOException
    {
        return Uri.parse(Uri.encode(s, ":/"));
    }

    public String a()
    {
        return a;
    }

    public void a(ImageView imageview)
        throws IOException, OutOfMemoryError
    {
        a(imageview, null);
    }

    public final j b(int l)
    {
        return j.a(new Callable(l) {

            final int a;
            final com.cardinalblue.android.piccollage.lib.a b;

            public Bitmap a()
                throws Exception
            {
                return b.a(a);
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                b = com.cardinalblue.android.piccollage.lib.a.this;
                a = l;
                super();
            }
        });
    }

    public byte[] b()
        throws IOException
    {
        return k.a(d());
    }

    public Executor c()
    {
        return k.d;
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/lib/AbstractImageSource$AssetsImageSource$1

/* anonymous class */
    class AbstractImageSource.AssetsImageSource._cls1 extends BitmapAjaxCallback
    {

        final ImageView i;
        final com.cardinalblue.android.piccollage.lib.f j;
        final a k;

        protected void a(String s, ImageView imageview, Bitmap bitmap, com.androidquery.callback.a a1)
        {
            bitmap = i.getResources().getAssets().open(k.b.c(k.a));
            s = null;
            imageview = BitmapFactory.decodeStream(bitmap);
            i.setImageBitmap(imageview);
            if (bitmap == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            if (true)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            bitmap.close();
_L2:
            return;
            s;
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                com.cardinalblue.android.piccollage.a.f.a(s);
            }
            if (s instanceof OutOfMemoryError)
            {
                System.gc();
            }
            if (j == null) goto _L2; else goto _L1
_L1:
            j.a(i, k.a);
            return;
            bitmap.close();
            return;
            s;
            throw s;
            imageview;
_L9:
            if (bitmap == null) goto _L4; else goto _L3
_L3:
            if (s == null) goto _L6; else goto _L5
_L5:
            bitmap.close();
_L4:
            throw imageview;
            bitmap;
            s.addSuppressed(bitmap);
            continue; /* Loop/switch isn't completed */
_L6:
            bitmap.close();
            if (true) goto _L4; else goto _L7
_L7:
            imageview;
            if (true) goto _L9; else goto _L8
_L8:
        }

            
            {
                k = a1;
                i = imageview;
                j = f1;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/lib/AbstractImageSource$FileImageSource$1

/* anonymous class */
    class AbstractImageSource.FileImageSource._cls1 extends BitmapAjaxCallback
    {

        final com.cardinalblue.android.piccollage.lib.f i;
        final ImageView j;
        final d k;

        protected void a(String s, ImageView imageview, Bitmap bitmap, com.androidquery.callback.a a1)
        {
            if (bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
            } else
            if (i != null)
            {
                i.a(j, k.a);
                return;
            }
        }

            
            {
                k = d1;
                i = f1;
                j = imageview;
                super();
            }
    }


    // Unreferenced inner class com/cardinalblue/android/piccollage/lib/AbstractImageSource$NetworkImageSource$1

/* anonymous class */
    class AbstractImageSource.NetworkImageSource._cls1 extends BitmapAjaxCallback
    {

        final com.cardinalblue.android.piccollage.lib.f i;
        final ImageView j;
        final g k;

        protected void a(String s, ImageView imageview, Bitmap bitmap, com.androidquery.callback.a a1)
        {
            if (bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
            } else
            if (i != null)
            {
                i.a(j, k.a);
                return;
            }
        }

            
            {
                k = g1;
                i = f1;
                j = imageview;
                super();
            }
    }

}
