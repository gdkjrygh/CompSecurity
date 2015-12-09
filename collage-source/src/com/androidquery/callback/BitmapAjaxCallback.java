// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.callback;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.ExifInterface;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.androidquery.util.Common;
import com.androidquery.util.a;
import com.androidquery.util.b;
import com.androidquery.util.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.apache.http.HttpHost;

// Referenced classes of package com.androidquery.callback:
//            AbstractAjaxCallback, a

public class BitmapAjaxCallback extends AbstractAjaxCallback
{

    private static Bitmap F;
    private static Bitmap G;
    private static int i = 20;
    private static int j = 20;
    private static int k = 2500;
    private static int l = 0x27100;
    private static int m = 0xf4240;
    private static boolean n = false;
    private static Map o;
    private static Map p;
    private static Map q;
    private static HashMap r = new HashMap();
    private int A;
    private boolean B;
    private float C;
    private boolean D;
    private boolean E;
    private WeakReference s;
    private int t;
    private int u;
    private File v;
    private Bitmap w;
    private int x;
    private Bitmap y;
    private float z;

    public BitmapAjaxCallback()
    {
        B = true;
        C = 3.402823E+38F;
        ((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)a(android/graphics/Bitmap)).b(true)).a(true)).a("");
    }

    private static int a(int i1, int j1)
    {
        int k1 = 1;
        boolean flag = false;
        int l1 = i1;
        do
        {
            for (i1 = ((flag) ? 1 : 0); i1 >= 10 || l1 < j1 * 2;)
            {
                return k1;
            }

            l1 /= 2;
            k1 *= 2;
            i1++;
        } while (true);
    }

    private static Bitmap a(Bitmap bitmap, int i1)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectf = new RectF(rect);
        float f1 = i1;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(0xff424242);
        canvas.drawRoundRect(rectf, f1, f1, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmap1;
    }

    private static Bitmap a(View view, Bitmap bitmap, int i1)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap != null)
        {
            bitmap1 = bitmap;
            if (bitmap.getWidth() == 1)
            {
                bitmap1 = bitmap;
                if (bitmap.getHeight() == 1)
                {
                    bitmap1 = bitmap;
                    if (bitmap != F)
                    {
                        bitmap1 = null;
                    }
                }
            }
        }
        if (bitmap1 != null)
        {
            view.setVisibility(0);
        } else
        {
            if (i1 == -2)
            {
                view.setVisibility(8);
                return bitmap1;
            }
            if (i1 == -1)
            {
                view.setVisibility(4);
                return bitmap1;
            }
        }
        return bitmap1;
    }

    private static Bitmap a(String s1, int i1, int j1)
    {
        String s2 = b(s1, i1, j1);
        Object obj = (Bitmap)j().get(s2);
        s1 = ((String) (obj));
        if (obj == null)
        {
            s1 = (Bitmap)k().get(s2);
        }
        obj = s1;
        if (s1 == null)
        {
            s1 = (Bitmap)l().get(s2);
            obj = s1;
            if (s1 != null)
            {
                obj = s1;
                if (f() == 200)
                {
                    q = null;
                    obj = null;
                }
            }
        }
        return ((Bitmap) (obj));
    }

    private static Bitmap a(String s1, android.graphics.BitmapFactory.Options options, boolean flag)
    {
        Object obj;
        obj = options;
        if (options == null)
        {
            obj = new android.graphics.BitmapFactory.Options();
        }
        obj.inInputShareable = h();
        obj.inPurgeable = true;
        FileInputStream fileinputstream = new FileInputStream(s1);
        options = fileinputstream;
        try
        {
            obj = BitmapFactory.decodeFileDescriptor(fileinputstream.getFD(), null, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            if (true) goto _L0; else goto _L0
        }
        options = ((android.graphics.BitmapFactory.Options) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        options = ((android.graphics.BitmapFactory.Options) (obj));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        options = fileinputstream;
        s1 = b(s1, ((Bitmap) (obj)));
        options = s1;
        com.androidquery.util.a.a(fileinputstream);
        return options;
        s1;
        fileinputstream = null;
        obj = null;
_L2:
        options = fileinputstream;
        com.androidquery.util.a.b(s1);
        com.androidquery.util.a.a(fileinputstream);
        return ((Bitmap) (obj));
        s1;
        options = null;
        com.androidquery.util.a.a(options);
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Bitmap a(String s1, byte abyte0[])
    {
        return a(s1, abyte0, t, B, A, E);
    }

    public static Bitmap a(String s1, byte abyte0[], int i1, boolean flag, int j1, boolean flag1)
    {
        if (s1 == null && abyte0 == null)
        {
            return null;
        }
        android.graphics.BitmapFactory.Options options;
        if (i1 > 0)
        {
            options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            a(s1, abyte0, options, flag1);
            int l1 = options.outWidth;
            int k1 = l1;
            if (!flag)
            {
                k1 = Math.max(l1, options.outHeight);
            }
            i1 = a(k1, i1);
            options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = i1;
        } else
        {
            options = null;
        }
        try
        {
            s1 = a(s1, abyte0, options, flag1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            g();
            com.androidquery.util.a.b(s1);
            s1 = null;
        }
        abyte0 = s1;
        if (j1 > 0)
        {
            abyte0 = a(((Bitmap) (s1)), j1);
        }
        return abyte0;
    }

    private static Bitmap a(String s1, byte abyte0[], android.graphics.BitmapFactory.Options options, boolean flag)
    {
        Bitmap bitmap = null;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        bitmap = a(s1, options, flag);
_L4:
        if (bitmap == null && options != null && !options.inJustDecodeBounds)
        {
            com.androidquery.util.a.b("decode image failed", s1);
        }
        return bitmap;
_L2:
        if (abyte0 != null)
        {
            bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, options);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Drawable a(ImageView imageview, Bitmap bitmap, float f1, float f2)
    {
        if (f1 > 0.0F)
        {
            return new e(imageview.getResources(), bitmap, imageview, f1, f2);
        } else
        {
            return new BitmapDrawable(imageview.getResources(), bitmap);
        }
    }

    public static void a(Activity activity, Context context, ImageView imageview, String s1, boolean flag, boolean flag1, int i1, int j1, 
            Bitmap bitmap, int k1, float f1, float f2, Object obj, com.androidquery.a.a a1, int l1, 
            int i2, HttpHost httphost, String s2)
    {
        Object obj1 = null;
        if (flag)
        {
            obj1 = a(s1, i1, i2);
        }
        if (obj1 != null)
        {
            imageview.setTag(0x40ff0001, s1);
            Common.a(obj, s1, false);
            a(imageview, ((Bitmap) (obj1)), bitmap, j1, k1, f1, f2, 4);
            return;
        }
        obj1 = new BitmapAjaxCallback();
        ((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback) (obj1)).a(s1)).a(imageview).b(flag)).a(flag1)).d(i1).e(j1).a(bitmap).f(k1).a(f1).b(f2).a(obj)).a(a1)).b(l1)).g(i2).b(s2);
        if (httphost != null)
        {
            ((BitmapAjaxCallback) (obj1)).a(httphost.getHostName(), httphost.getPort());
        }
        if (activity != null)
        {
            ((BitmapAjaxCallback) (obj1)).a(activity);
            return;
        } else
        {
            ((BitmapAjaxCallback) (obj1)).a(context);
            return;
        }
    }

    private static void a(ImageView imageview, Bitmap bitmap, Bitmap bitmap1, int i1, int j1, float f1, float f2, int k1)
    {
        bitmap = a(((View) (imageview)), bitmap, i1);
        if (bitmap == null)
        {
            imageview.setImageBitmap(null);
            return;
        }
        Drawable drawable = a(imageview, bitmap, f1, f2);
        if (b(j1, k1))
        {
            if (bitmap1 == null)
            {
                bitmap = new AlphaAnimation(0.0F, 1.0F);
                bitmap.setInterpolator(new DecelerateInterpolator());
                bitmap.setDuration(300L);
                bitmap1 = drawable;
            } else
            {
                bitmap1 = new TransitionDrawable(new Drawable[] {
                    a(imageview, bitmap1, f1, f2), drawable
                });
                bitmap1.setCrossFadeEnabled(true);
                bitmap1.startTransition(300);
                bitmap = null;
            }
        } else
        if (j1 > 0)
        {
            bitmap = AnimationUtils.loadAnimation(imageview.getContext(), j1);
            bitmap1 = drawable;
        } else
        {
            bitmap = null;
            bitmap1 = drawable;
        }
        imageview.setImageDrawable(bitmap1);
        if (bitmap != null)
        {
            bitmap.setStartTime(AnimationUtils.currentAnimationTimeMillis());
            imageview.startAnimation(bitmap);
            return;
        } else
        {
            imageview.setAnimation(null);
            return;
        }
    }

    private void a(BitmapAjaxCallback bitmapajaxcallback, String s1, ImageView imageview, Bitmap bitmap, com.androidquery.callback.a a1)
    {
        if (imageview == null || bitmapajaxcallback == null)
        {
            return;
        }
        if (s1.equals(imageview.getTag(0x40ff0001)))
        {
            if (imageview instanceof ImageView)
            {
                bitmapajaxcallback.a(s1, imageview, bitmap, a1);
            } else
            {
                bitmapajaxcallback.a(s1, imageview, bitmap, false);
            }
        }
        bitmapajaxcallback.c(false);
    }

    private static void a(String s1, int i1, int j1, Bitmap bitmap, boolean flag)
    {
        if (bitmap != null)
        {
            int k1 = bitmap.getWidth();
            int l1 = bitmap.getHeight();
            Map map;
            if (flag)
            {
                map = l();
            } else
            if (k1 * l1 <= k)
            {
                map = k();
            } else
            {
                map = j();
            }
            if (i1 > 0 || j1 > 0)
            {
                map.put(b(s1, i1, j1), bitmap);
                if (!map.containsKey(s1))
                {
                    map.put(s1, null);
                    return;
                }
            } else
            {
                map.put(s1, bitmap);
                return;
            }
        }
    }

    private void a(String s1, ImageView imageview)
    {
label0:
        {
            if (!s1.equals(imageview.getTag(0x40ff0001)) || y != null)
            {
                imageview.setTag(0x40ff0001, s1);
                if (y == null || b(imageview.getContext()))
                {
                    break label0;
                }
                a(s1, imageview, y, true);
            }
            return;
        }
        a(s1, imageview, ((Bitmap) (null)), true);
    }

    private void a(String s1, ImageView imageview, Bitmap bitmap, boolean flag)
    {
        if (bitmap == null)
        {
            imageview.setImageDrawable(null);
        } else
        {
            if (flag)
            {
                imageview.setImageDrawable(a(imageview, bitmap, z, C));
                return;
            }
            if (f != null)
            {
                a(imageview, bitmap, y, u, x, z, C, f.k());
                return;
            }
        }
    }

    private static Bitmap b(String s1, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            s1 = null;
        } else
        {
            int i1;
            try
            {
                i1 = (new ExifInterface(s1)).getAttributeInt("Orientation", 1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.androidquery.util.a.a(s1);
                i1 = 1;
            }
            s1 = bitmap;
            if (i1 > 0)
            {
                s1 = j(i1);
                s1 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), s1, true);
                com.androidquery.util.a.b("before", (new StringBuilder(String.valueOf(bitmap.getWidth()))).append(":").append(bitmap.getHeight()).toString());
                com.androidquery.util.a.b("after", (new StringBuilder(String.valueOf(s1.getWidth()))).append(":").append(s1.getHeight()).toString());
                if (bitmap != s1)
                {
                    bitmap.recycle();
                }
                return s1;
            }
        }
        return s1;
    }

    private static String b(String s1, int i1, int j1)
    {
        if (i1 > 0)
        {
            s1 = (new StringBuilder(String.valueOf(s1))).append("#").append(i1).toString();
        }
        String s2 = s1;
        if (j1 > 0)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("#").append(j1).toString();
        }
        return s2;
    }

    private void b(String s1, ImageView imageview)
    {
        WeakHashMap weakhashmap = (WeakHashMap)r.get(s1);
        if (weakhashmap == null)
        {
            if (r.containsKey(s1))
            {
                weakhashmap = new WeakHashMap();
                weakhashmap.put(imageview, this);
                r.put(s1, weakhashmap);
                return;
            } else
            {
                r.put(s1, null);
                return;
            }
        } else
        {
            weakhashmap.put(imageview, this);
            return;
        }
    }

    private static boolean b(int i1, int j1)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        i1;
        JVM INSTR tableswitch -3 -1: default 32
    //                   -3 36
    //                   -2 43
    //                   -1 34;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (j1 == 3) goto _L4; else goto _L3
_L3:
        if (j1 == 1)
        {
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean f(String s1)
    {
        return j().containsKey(s1) || k().containsKey(s1) || l().containsKey(s1);
    }

    public static void g()
    {
        p = null;
        o = null;
        q = null;
    }

    public static void h(int i1)
    {
        j = i1;
        g();
    }

    private static boolean h()
    {
        com.androidquery.util.a.b("level", Integer.valueOf(com.androidquery.a.d));
        return com.androidquery.a.d < 19;
    }

    private Bitmap i()
    {
        Object obj = (View)s.get();
        if (obj != null)
        {
            String s1 = Integer.toString(u);
            Bitmap bitmap = e(s1);
            if (bitmap == null)
            {
                obj = BitmapFactory.decodeResource(((View) (obj)).getResources(), u);
                if (obj != null)
                {
                    a(s1, ((Bitmap) (obj)));
                }
                return ((Bitmap) (obj));
            } else
            {
                return bitmap;
            }
        } else
        {
            return null;
        }
    }

    public static void i(int i1)
    {
        m = i1;
        g();
    }

    private static Matrix j(int i1)
    {
        Matrix matrix = new Matrix();
        switch (i1)
        {
        default:
            return matrix;

        case 2: // '\002'
            matrix.setScale(-1F, 1.0F);
            return matrix;

        case 3: // '\003'
            matrix.setRotate(180F);
            return matrix;

        case 4: // '\004'
            matrix.setRotate(180F);
            matrix.postScale(-1F, 1.0F);
            return matrix;

        case 5: // '\005'
            matrix.setRotate(90F);
            matrix.postScale(-1F, 1.0F);
            return matrix;

        case 6: // '\006'
            matrix.setRotate(90F);
            return matrix;

        case 7: // '\007'
            matrix.setRotate(-90F);
            matrix.postScale(-1F, 1.0F);
            return matrix;

        case 8: // '\b'
            matrix.setRotate(-90F);
            break;
        }
        return matrix;
    }

    private static Map j()
    {
        if (p == null)
        {
            p = Collections.synchronizedMap(new b(j, l, m));
        }
        return p;
    }

    private static Map k()
    {
        if (o == null)
        {
            o = Collections.synchronizedMap(new b(i, k, 0x3d090));
        }
        return o;
    }

    private static Map l()
    {
        if (q == null)
        {
            q = Collections.synchronizedMap(new b(100, l, 0x3d090));
        }
        return q;
    }

    public BitmapAjaxCallback a(float f1)
    {
        z = f1;
        return this;
    }

    public BitmapAjaxCallback a(Bitmap bitmap)
    {
        y = bitmap;
        return this;
    }

    public BitmapAjaxCallback a(ImageView imageview)
    {
        s = new WeakReference(imageview);
        return this;
    }

    public BitmapAjaxCallback a(File file)
    {
        v = file;
        return this;
    }

    protected File a(File file, String s1)
    {
        if (v != null && v.exists())
        {
            return v;
        } else
        {
            return super.a(file, s1);
        }
    }

    protected Object a(String s1, File file, com.androidquery.callback.a a1)
    {
        return b(s1, file, a1);
    }

    public Object a(String s1, byte abyte0[], com.androidquery.callback.a a1)
    {
        return b(s1, abyte0, a1);
    }

    public void a(Context context)
    {
        context = d();
        ImageView imageview = (ImageView)s.get();
        if (context == null)
        {
            c(false);
            a(((String) (context)), imageview, ((Bitmap) (null)), false);
            return;
        }
        Bitmap bitmap = e(context);
        if (bitmap != null)
        {
            imageview.setTag(0x40ff0001, context);
            f = (new com.androidquery.callback.a()).a(4).a();
            a(((String) (context)), bitmap, f);
            return;
        }
        a(((String) (context)), imageview);
        if (!r.containsKey(context))
        {
            b(context, imageview);
            super.a(imageview.getContext());
            return;
        } else
        {
            c(true);
            b(context, imageview);
            return;
        }
    }

    protected void a(String s1, Bitmap bitmap)
    {
        a(s1, t, A, bitmap, D);
    }

    public final void a(String s1, Bitmap bitmap, com.androidquery.callback.a a1)
    {
        WeakHashMap weakhashmap;
        ImageView imageview = (ImageView)s.get();
        weakhashmap = (WeakHashMap)r.remove(s1);
        if (weakhashmap == null || !weakhashmap.containsKey(imageview))
        {
            a(this, s1, imageview, bitmap, a1);
        }
        if (weakhashmap == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = weakhashmap.keySet().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ImageView imageview1 = (ImageView)iterator.next();
        BitmapAjaxCallback bitmapajaxcallback = (BitmapAjaxCallback)weakhashmap.get(imageview1);
        bitmapajaxcallback.f = a1;
        a(bitmapajaxcallback, s1, imageview1, bitmap, a1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void a(String s1, ImageView imageview, Bitmap bitmap, com.androidquery.callback.a a1)
    {
        a(s1, imageview, bitmap, false);
    }

    protected volatile void a(String s1, Object obj)
    {
        a(s1, (Bitmap)obj);
    }

    public volatile void a(String s1, Object obj, com.androidquery.callback.a a1)
    {
        a(s1, (Bitmap)obj, a1);
    }

    protected Bitmap b(String s1, File file, com.androidquery.callback.a a1)
    {
        return a(file.getAbsolutePath(), ((byte []) (null)));
    }

    public Bitmap b(String s1, byte abyte0[], com.androidquery.callback.a a1)
    {
        File file;
        s1 = null;
        file = a1.j();
        if (file != null)
        {
            s1 = file.getAbsolutePath();
        }
        s1 = a(s1, abyte0);
        abyte0 = s1;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        if (u <= 0) goto _L4; else goto _L3
_L3:
        s1 = i();
_L6:
        if (a1.g() != 200)
        {
            D = true;
        }
        abyte0 = s1;
        if (a1.k() == 1)
        {
            abyte0 = s1;
            if (file != null)
            {
                com.androidquery.util.a.a("invalid bm from net");
                file.delete();
                abyte0 = s1;
            }
        }
_L2:
        return abyte0;
_L4:
        if (u == -2 || u == -1)
        {
            s1 = G;
        } else
        if (u == -3)
        {
            s1 = y;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public BitmapAjaxCallback b(float f1)
    {
        C = f1;
        return this;
    }

    protected void b(String s1, Bitmap bitmap, com.androidquery.callback.a a1)
    {
        r.remove(s1);
    }

    protected volatile void b(String s1, Object obj, com.androidquery.callback.a a1)
    {
        b(s1, (Bitmap)obj, a1);
    }

    protected boolean c()
    {
        return !n;
    }

    public BitmapAjaxCallback d(int i1)
    {
        t = i1;
        return this;
    }

    protected Object d(String s1)
    {
        return e(s1);
    }

    protected Bitmap e(String s1)
    {
        if (w != null)
        {
            return w;
        }
        if (!h)
        {
            return null;
        } else
        {
            return a(s1, t, A);
        }
    }

    public BitmapAjaxCallback e(int i1)
    {
        u = i1;
        return this;
    }

    public BitmapAjaxCallback f(int i1)
    {
        x = i1;
        return this;
    }

    public BitmapAjaxCallback g(int i1)
    {
        A = i1;
        return this;
    }

    static 
    {
        F = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ALPHA_8);
        G = Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ALPHA_8);
    }
}
