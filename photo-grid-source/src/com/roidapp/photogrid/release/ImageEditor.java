// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Region;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.p;
import com.roidapp.photogrid.FacebookMessengerActivity;
import com.roidapp.photogrid.cloud.BaseShareActivity;
import com.roidapp.photogrid.cloud.br;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.common.aj;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.common.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, ik, ih, PhotoGridActivity, 
//            it, rf, an, if, 
//            iy, ig, lc, iz, 
//            EffectsList, aq, ja, ap, 
//            jb, is, iu, ic, 
//            ImageSelector, iv, jc, jd, 
//            jf, jg, jh, ji, 
//            il, im, in, io, 
//            ip, iq, ir, je, 
//            ix, iw

public class ImageEditor extends ParentActivity
    implements SensorEventListener, android.view.GestureDetector.OnGestureListener, android.widget.ViewSwitcher.ViewFactory
{

    private static int A = 94;
    private static int B = 95;
    private static int C = 96;
    private static int D = 97;
    private static int E = 98;
    private static int F = 90;
    private static int G = 91;
    private static int H = 92;
    private static int I = 93;
    public static int a = 8;
    private static int i = 1;
    private static int j = 2;
    private static int k = 3;
    private static int l = 4;
    private static int m = 5;
    private static int n = 6;
    private static int o = 7;
    private static int p = 9;
    private static int q = 10;
    private static int r = 11;
    private static int s = 87;
    private static int y = 88;
    private static int z = 89;
    private boolean J;
    private RelativeLayout K;
    private int L[];
    private View M;
    private GestureDetector N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private View T;
    private aq U;
    private boolean V;
    private String W;
    private boolean X;
    private Map Y;
    private int Z;
    private com.roidapp.photogrid.release.an aa;
    private ViewGroup ab;
    private RelativeLayout ac;
    private FrameLayout ad;
    private RelativeLayout ae;
    private int af;
    private boolean ag;
    private HashMap ah;
    private ArrayList ai;
    private float aj;
    private int ak;
    private int al;
    private boolean am;
    private al an;
    String b;
    int c;
    String d[];
    ig e[];
    int f;
    public String g;
    public Handler h;

    public ImageEditor()
    {
        J = false;
        O = 0;
        P = 0;
        Q = 0;
        R = 0;
        S = 0;
        V = false;
        W = "exchange";
        X = false;
        af = 160;
        ag = false;
        ah = new HashMap();
        ai = new ArrayList();
        aj = 1.0F;
        h = new ik(this);
    }

    static boolean A(ImageEditor imageeditor)
    {
        imageeditor.V = true;
        return true;
    }

    static void B(ImageEditor imageeditor)
    {
        if (imageeditor.e != null)
        {
            ih.C().a(imageeditor.e);
            ih.C().a(imageeditor.d);
            ih.C().j(imageeditor.c);
            ih.C().d(imageeditor.b);
            ih.C().i(imageeditor.f);
            ih.C().h(imageeditor.O);
            Intent intent = new Intent(imageeditor, com/roidapp/photogrid/release/PhotoGridActivity);
            intent.putExtra("firstCreate", false);
            if (imageeditor.u != null)
            {
                imageeditor.u.removeAllViews();
            }
            imageeditor.startActivity(intent);
            imageeditor.finish();
        }
    }

    static void C(ImageEditor imageeditor)
    {
        (new Thread(new it(imageeditor))).start();
    }

    static void D(ImageEditor imageeditor)
    {
        Object obj;
        Object obj1;
        Bitmap bitmap;
        Object obj4;
        obj4 = null;
        bitmap = null;
        obj = bitmap;
        obj1 = obj4;
        Calendar calendar = Calendar.getInstance();
        obj = bitmap;
        obj1 = obj4;
        Object obj6 = imageeditor.I();
        obj = bitmap;
        obj1 = obj4;
        Object obj5 = new File(((String) (obj6)));
        obj = bitmap;
        obj1 = obj4;
        if (((File) (obj5)).exists()) goto _L2; else goto _L1
_L1:
        obj = bitmap;
        obj1 = obj4;
        if (((File) (obj5)).mkdirs()) goto _L2; else goto _L3
_L3:
        obj = bitmap;
        obj1 = obj4;
        if (android.os.Build.VERSION.SDK_INT != 19) goto _L5; else goto _L4
_L4:
        obj = bitmap;
        obj1 = obj4;
        Object obj2 = new ae(imageeditor.getContentResolver(), ((File) (obj5)));
        obj = bitmap;
        obj1 = obj4;
        ((ae) (obj2)).a();
_L2:
        obj = bitmap;
        obj1 = obj4;
        if (imageeditor.Z != 1) goto _L7; else goto _L6
_L6:
        obj = bitmap;
        obj1 = obj4;
        obj2 = android.graphics.Bitmap.CompressFormat.PNG;
        Object obj3 = ".png";
_L19:
        obj = bitmap;
        obj1 = obj4;
        obj6 = new File(((String) (obj6)), (new StringBuilder("PhotoGrid_")).append(calendar.getTimeInMillis()).append(((String) (obj3))).toString());
        obj = bitmap;
        obj1 = obj4;
        imageeditor.g = ((File) (obj6)).getAbsolutePath();
        obj = bitmap;
        obj1 = obj4;
        ((File) (obj6)).createNewFile();
_L16:
        obj = bitmap;
        obj1 = obj4;
        if (!((File) (obj6)).isFile()) goto _L9; else goto _L8
_L8:
        obj = bitmap;
        obj1 = obj4;
        if (((File) (obj6)).canWrite()) goto _L10; else goto _L9
_L9:
        obj = bitmap;
        obj1 = obj4;
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 <= 18) goto _L12; else goto _L11
_L11:
        obj = bitmap;
        obj1 = obj4;
        obj3 = (new ae(imageeditor.getContentResolver(), ((File) (obj6)))).b();
        if (obj3 != null) goto _L14; else goto _L13
_L13:
        obj = bitmap;
        obj1 = obj4;
        throw new IOException("4.4 IOException");
        obj2;
        obj = bitmap;
        obj1 = obj4;
        ((IOException) (obj2)).printStackTrace();
        break MISSING_BLOCK_LABEL_321;
        obj2;
        obj = bitmap;
        obj1 = obj4;
        ((IOException) (obj2)).printStackTrace();
        obj = bitmap;
        obj1 = obj4;
        imageeditor.c(((String) (obj6)));
        return;
_L5:
        obj = bitmap;
        obj1 = obj4;
        imageeditor.c(((String) (obj6)));
        return;
_L7:
        obj = bitmap;
        obj1 = obj4;
        obj2 = android.graphics.Bitmap.CompressFormat.JPEG;
        obj3 = ".jpg";
        continue; /* Loop/switch isn't completed */
        obj3;
        obj = bitmap;
        obj1 = obj4;
        ((IOException) (obj3)).printStackTrace();
        obj = bitmap;
        obj1 = obj4;
        if (android.os.Build.VERSION.SDK_INT > 18) goto _L16; else goto _L15
_L15:
        obj = bitmap;
        obj1 = obj4;
        imageeditor.b(((File) (obj5)).getAbsolutePath());
        return;
_L14:
        obj = bitmap;
        obj1 = obj4;
        obj5 = (LinearLayout)imageeditor.findViewById(0x7f0d03a9);
        obj = bitmap;
        obj1 = obj4;
        rf.a();
        obj = bitmap;
        obj1 = obj4;
        bitmap = rf.a(((LinearLayout) (obj5)).getMeasuredWidth(), ((LinearLayout) (obj5)).getMeasuredHeight(), az.c);
        obj = bitmap;
        obj1 = bitmap;
        ((LinearLayout) (obj5)).draw(new Canvas(bitmap));
        obj = bitmap;
        obj1 = bitmap;
        bitmap.compress(((android.graphics.Bitmap.CompressFormat) (obj2)), 100, ((OutputStream) (obj3)));
        obj = bitmap;
        obj1 = bitmap;
        ((OutputStream) (obj3)).flush();
        obj = bitmap;
        obj1 = bitmap;
        ((OutputStream) (obj3)).close();
        obj = bitmap;
        obj1 = bitmap;
        imageeditor.d(((File) (obj6)).getAbsolutePath());
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = bitmap;
        obj1 = bitmap;
        if (bitmap.isRecycled())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = bitmap;
        obj1 = bitmap;
        bitmap.recycle();
        return;
_L12:
        obj = bitmap;
        obj1 = obj4;
        imageeditor.b(((File) (obj5)).getAbsolutePath());
        return;
_L10:
        obj = bitmap;
        obj1 = obj4;
        obj3 = new FileOutputStream(((File) (obj6)));
        if (true) goto _L14; else goto _L17
        obj = bitmap;
        obj1 = obj4;
        try
        {
            imageeditor.b(((File) (obj5)).getAbsolutePath());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (obj != null && !((Bitmap) (obj)).isRecycled())
            {
                ((Bitmap) (obj)).recycle();
            }
            imageeditor.J = false;
            obj = Message.obtain();
            obj.what = j;
            obj.obj = Boolean.valueOf(false);
            imageeditor.h.sendMessage(((Message) (obj)));
            ((Exception) (obj1)).printStackTrace();
            if ((new StringBuilder()).append(((Exception) (obj1)).getMessage()).toString().contains("No space"))
            {
                imageeditor.h.sendEmptyMessage(16);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (obj1 != null && !((Bitmap) (obj1)).isRecycled())
            {
                ((Bitmap) (obj1)).recycle();
            }
            imageeditor.af = 169;
            imageeditor.h.sendEmptyMessage(n);
            imageeditor.J = false;
            obj = Message.obtain();
            obj.what = j;
            obj.obj = Boolean.valueOf(false);
            imageeditor.h.sendMessage(((Message) (obj)));
            System.gc();
            return;
        }
        com.roidapp.photogrid.common.c.a(imageeditor.h, ((Throwable) (obj1)));
_L17:
        return;
        if (true) goto _L19; else goto _L18
_L18:
    }

    static void E(ImageEditor imageeditor)
    {
        Object obj;
        Object obj1;
        Bitmap bitmap;
        Object obj4;
        obj4 = null;
        bitmap = null;
        obj = bitmap;
        obj1 = obj4;
        Calendar calendar = Calendar.getInstance();
        obj = bitmap;
        obj1 = obj4;
        Object obj6 = imageeditor.I();
        obj = bitmap;
        obj1 = obj4;
        Object obj5 = new File(((String) (obj6)));
        obj = bitmap;
        obj1 = obj4;
        if (((File) (obj5)).exists()) goto _L2; else goto _L1
_L1:
        obj = bitmap;
        obj1 = obj4;
        if (((File) (obj5)).mkdirs()) goto _L2; else goto _L3
_L3:
        obj = bitmap;
        obj1 = obj4;
        if (android.os.Build.VERSION.SDK_INT != 19) goto _L5; else goto _L4
_L4:
        obj = bitmap;
        obj1 = obj4;
        Object obj2 = new ae(imageeditor.getContentResolver(), ((File) (obj5)));
        obj = bitmap;
        obj1 = obj4;
        ((ae) (obj2)).a();
_L2:
        obj = bitmap;
        obj1 = obj4;
        if (imageeditor.Z != 1) goto _L7; else goto _L6
_L6:
        obj = bitmap;
        obj1 = obj4;
        obj2 = android.graphics.Bitmap.CompressFormat.PNG;
        Object obj3 = ".png";
_L19:
        obj = bitmap;
        obj1 = obj4;
        obj6 = new File(((String) (obj6)), (new StringBuilder("PhotoGrid_")).append(calendar.getTimeInMillis()).append(((String) (obj3))).toString());
        obj = bitmap;
        obj1 = obj4;
        imageeditor.g = ((File) (obj6)).getAbsolutePath();
        obj = bitmap;
        obj1 = obj4;
        ((File) (obj6)).createNewFile();
_L16:
        obj = bitmap;
        obj1 = obj4;
        if (!((File) (obj6)).isFile()) goto _L9; else goto _L8
_L8:
        obj = bitmap;
        obj1 = obj4;
        if (((File) (obj6)).canWrite()) goto _L10; else goto _L9
_L9:
        obj = bitmap;
        obj1 = obj4;
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 <= 18) goto _L12; else goto _L11
_L11:
        obj = bitmap;
        obj1 = obj4;
        obj3 = (new ae(imageeditor.getContentResolver(), ((File) (obj6)))).b();
        if (obj3 != null) goto _L14; else goto _L13
_L13:
        obj = bitmap;
        obj1 = obj4;
        throw new IOException("4.4 IOException");
        obj2;
        obj = bitmap;
        obj1 = obj4;
        ((IOException) (obj2)).printStackTrace();
        break MISSING_BLOCK_LABEL_321;
        obj2;
        obj = bitmap;
        obj1 = obj4;
        ((IOException) (obj2)).printStackTrace();
        obj = bitmap;
        obj1 = obj4;
        imageeditor.c(((String) (obj6)));
        return;
_L5:
        obj = bitmap;
        obj1 = obj4;
        imageeditor.c(((String) (obj6)));
        return;
_L7:
        obj = bitmap;
        obj1 = obj4;
        obj2 = android.graphics.Bitmap.CompressFormat.JPEG;
        obj3 = ".jpg";
        continue; /* Loop/switch isn't completed */
        obj3;
        obj = bitmap;
        obj1 = obj4;
        ((IOException) (obj3)).printStackTrace();
        obj = bitmap;
        obj1 = obj4;
        if (android.os.Build.VERSION.SDK_INT > 18) goto _L16; else goto _L15
_L15:
        obj = bitmap;
        obj1 = obj4;
        imageeditor.b(((File) (obj5)).getAbsolutePath());
        return;
_L14:
        obj = bitmap;
        obj1 = obj4;
        obj5 = (LinearLayout)imageeditor.findViewById(0x7f0d03a8);
        obj = bitmap;
        obj1 = obj4;
        rf.a();
        obj = bitmap;
        obj1 = obj4;
        bitmap = rf.a(((LinearLayout) (obj5)).getMeasuredWidth(), ((LinearLayout) (obj5)).getMeasuredHeight(), az.c);
        obj = bitmap;
        obj1 = bitmap;
        ((LinearLayout) (obj5)).draw(new Canvas(bitmap));
        obj = bitmap;
        obj1 = bitmap;
        bitmap.compress(((android.graphics.Bitmap.CompressFormat) (obj2)), 100, ((OutputStream) (obj3)));
        obj = bitmap;
        obj1 = bitmap;
        ((OutputStream) (obj3)).flush();
        obj = bitmap;
        obj1 = bitmap;
        ((OutputStream) (obj3)).close();
        obj = bitmap;
        obj1 = bitmap;
        imageeditor.d(((File) (obj6)).getAbsolutePath());
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = bitmap;
        obj1 = bitmap;
        if (bitmap.isRecycled())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = bitmap;
        obj1 = bitmap;
        bitmap.recycle();
        return;
_L12:
        obj = bitmap;
        obj1 = obj4;
        imageeditor.b(((File) (obj5)).getAbsolutePath());
        return;
_L10:
        obj = bitmap;
        obj1 = obj4;
        obj3 = new FileOutputStream(((File) (obj6)));
        if (true) goto _L14; else goto _L17
        obj = bitmap;
        obj1 = obj4;
        try
        {
            imageeditor.b(((File) (obj5)).getAbsolutePath());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (obj != null && !((Bitmap) (obj)).isRecycled())
            {
                ((Bitmap) (obj)).recycle();
            }
            imageeditor.J = false;
            obj = Message.obtain();
            obj.what = j;
            obj.obj = Boolean.valueOf(false);
            imageeditor.h.sendMessage(((Message) (obj)));
            ((Exception) (obj1)).printStackTrace();
            if ((new StringBuilder()).append(((Exception) (obj1)).getMessage()).toString().contains("No space"))
            {
                imageeditor.h.sendEmptyMessage(16);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (obj1 != null && !((Bitmap) (obj1)).isRecycled())
            {
                ((Bitmap) (obj1)).recycle();
            }
            imageeditor.af = 168;
            imageeditor.h.sendEmptyMessage(n);
            imageeditor.J = false;
            obj = Message.obtain();
            obj.what = j;
            obj.obj = Boolean.valueOf(false);
            imageeditor.h.sendMessage(((Message) (obj)));
            System.gc();
            return;
        }
        com.roidapp.photogrid.common.c.a(imageeditor.h, ((Throwable) (obj1)));
_L17:
        return;
        if (true) goto _L19; else goto _L18
_L18:
    }

    static void F(ImageEditor imageeditor)
    {
        Object obj;
        Object obj1;
        Object obj4;
        Object obj5;
        Object obj6;
        obj5 = null;
        obj6 = null;
        obj4 = null;
        obj1 = obj4;
        obj = obj5;
        Object obj7 = Calendar.getInstance();
        obj1 = obj4;
        obj = obj5;
        Object obj3 = imageeditor.I();
        obj1 = obj4;
        obj = obj5;
        File file = new File(((String) (obj3)));
        obj1 = obj4;
        obj = obj5;
        if (file.exists()) goto _L2; else goto _L1
_L1:
        obj1 = obj4;
        obj = obj5;
        if (file.mkdirs()) goto _L2; else goto _L3
_L3:
        obj1 = obj4;
        obj = obj5;
        if (android.os.Build.VERSION.SDK_INT != 19) goto _L5; else goto _L4
_L4:
        obj1 = obj4;
        obj = obj5;
        Object obj2 = new ae(imageeditor.getContentResolver(), file);
        obj1 = obj4;
        obj = obj5;
        ((ae) (obj2)).a();
_L2:
        obj1 = obj4;
        obj = obj5;
        if (imageeditor.Z != 1) goto _L7; else goto _L6
_L6:
        obj1 = obj4;
        obj = obj5;
        android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.PNG;
        obj2 = ".png";
_L15:
        obj1 = obj4;
        obj = obj5;
        obj7 = new File(((String) (obj3)), (new StringBuilder("PhotoGrid_")).append(((Calendar) (obj7)).getTimeInMillis()).append(((String) (obj2))).toString());
        obj1 = obj4;
        obj = obj5;
        imageeditor.g = ((File) (obj7)).getAbsolutePath();
        obj1 = obj4;
        obj = obj5;
        ((File) (obj7)).createNewFile();
_L17:
        obj1 = obj4;
        obj = obj5;
        if (!((File) (obj7)).isFile()) goto _L9; else goto _L8
_L8:
        obj1 = obj4;
        obj = obj5;
        if (((File) (obj7)).canWrite()) goto _L10; else goto _L9
_L9:
        obj1 = obj4;
        obj = obj5;
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 <= 18) goto _L12; else goto _L11
_L11:
        obj1 = obj4;
        obj = obj5;
        obj2 = (new ae(imageeditor.getContentResolver(), ((File) (obj7)))).b();
        obj3 = obj2;
        if (obj2 != null) goto _L14; else goto _L13
_L13:
        obj1 = obj4;
        obj = obj5;
        throw new IOException("4.4 IOException");
        obj2;
        obj1 = obj4;
        obj = obj5;
        ((IOException) (obj2)).printStackTrace();
        obj1 = obj4;
        obj = obj5;
        imageeditor.b(file.getAbsolutePath());
        return;
        obj2;
        obj1 = obj4;
        obj = obj5;
        ((IOException) (obj2)).printStackTrace();
        obj1 = obj4;
        obj = obj5;
        imageeditor.c(((String) (obj3)));
        return;
        obj;
_L19:
        if (obj1 != null && !((Bitmap) (obj1)).isRecycled())
        {
            ((Bitmap) (obj1)).recycle();
        }
        imageeditor.J = false;
        obj1 = Message.obtain();
        obj1.what = j;
        obj1.obj = Boolean.valueOf(false);
        imageeditor.h.sendMessage(((Message) (obj1)));
        ((Exception) (obj)).printStackTrace();
        IOException ioexception;
        if ((new StringBuilder()).append(((Exception) (obj)).getMessage()).toString().contains("No space"))
        {
            imageeditor.h.sendEmptyMessage(16);
            return;
        } else
        {
            com.roidapp.photogrid.common.c.a(imageeditor.h, ((Throwable) (obj)));
            return;
        }
_L5:
        obj1 = obj4;
        obj = obj5;
        imageeditor.c(((String) (obj3)));
        return;
        obj2;
        obj1 = obj;
        obj = obj2;
_L18:
        if (obj1 != null && !((Bitmap) (obj1)).isRecycled())
        {
            ((Bitmap) (obj1)).recycle();
        }
        imageeditor.af = 170;
        imageeditor.h.sendEmptyMessage(n);
        imageeditor.J = false;
        obj1 = Message.obtain();
        obj1.what = j;
        obj1.obj = Boolean.valueOf(false);
        imageeditor.h.sendMessage(((Message) (obj1)));
        System.gc();
        ((OutOfMemoryError) (obj)).printStackTrace();
        return;
_L7:
        obj1 = obj4;
        obj = obj5;
        compressformat = android.graphics.Bitmap.CompressFormat.JPEG;
        obj2 = ".jpg";
          goto _L15
        ioexception;
        obj1 = obj4;
        obj = obj5;
        ioexception.printStackTrace();
        obj1 = obj4;
        obj = obj5;
        if (android.os.Build.VERSION.SDK_INT > 18) goto _L17; else goto _L16
_L16:
        obj1 = obj4;
        obj = obj5;
        imageeditor.b(file.getAbsolutePath());
        return;
_L12:
        obj1 = obj4;
        obj = obj5;
        imageeditor.b(file.getAbsolutePath());
        return;
_L10:
        obj1 = obj4;
        obj = obj5;
        obj3 = new FileOutputStream(((File) (obj7)));
_L14:
        obj1 = obj4;
        obj = obj5;
        rf.a();
        obj1 = obj4;
        obj = obj5;
        ioexception = rf.a(imageeditor.ac.getMeasuredWidth(), imageeditor.ac.getMeasuredHeight(), az.c);
        obj = new Canvas(ioexception);
        if ((az.q == 0 || az.q == 5) && imageeditor.Z == 2)
        {
            ((Canvas) (obj)).drawColor(-1);
        }
        imageeditor.ac.draw(((Canvas) (obj)));
        ioexception.compress(compressformat, 100, ((OutputStream) (obj3)));
        ((OutputStream) (obj3)).flush();
        ((OutputStream) (obj3)).close();
        if (ioexception == null)
        {
            break MISSING_BLOCK_LABEL_790;
        }
        if (ioexception.isRecycled())
        {
            break MISSING_BLOCK_LABEL_790;
        }
        ioexception.recycle();
        obj = obj6;
_L20:
        obj1 = obj;
        imageeditor.d(((File) (obj7)).getAbsolutePath());
        return;
        obj;
        obj1 = ioexception;
          goto _L18
        obj;
        obj1 = ioexception;
          goto _L19
        obj = ioexception;
          goto _L20
    }

    private void G()
    {
        J = true;
        Message message = Message.obtain();
        message.what = j;
        message.obj = Boolean.valueOf(true);
        h.sendMessage(message);
        ae.removeAllViews();
        Object obj;
        J();
        int i1 = ae.getLayoutParams().width;
        i1 = ae.getLayoutParams().height;
        rf.a();
        rf.a(this, ai, L, f, e.length);
        obj = ae;
        rf.a();
        rf.a(ac, ((RelativeLayout) (obj)), null, this, e, ai);
_L1:
        if (aa == null)
        {
            aa = new com.roidapp.photogrid.release.an(this, ac.getLayoutParams().width, ac.getLayoutParams().height);
            if (O >= 0)
            {
                aa.a(P, S, Q, R);
            }
        }
        M = ae;
        int j1 = 0;
        do
        {
            XmlPullParserException xmlpullparserexception;
            try
            {
                if (j1 >= e.length)
                {
                    break;
                }
                ((if)ae.findViewById(j1 + 1)).setOnClickListener(new iy(this));
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                J();
                outofmemoryerror.printStackTrace();
                af = 141;
                h.sendEmptyMessage(n);
                return;
            }
            j1++;
        } while (true);
        break MISSING_BLOCK_LABEL_300;
        xmlpullparserexception;
        xmlpullparserexception.printStackTrace();
          goto _L1
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
          goto _L1
        float f1;
        float f2;
        float f3;
        float f4;
        int j2;
        int k2;
        j2 = ae.getLayoutParams().width;
        k2 = ae.getLayoutParams().height;
        f2 = ih.C().S();
        f1 = (0.0115F - f2 / 100F) * (float)ac.getLayoutParams().width;
        f2 = (0.0115F - f2 / 100F) * (float)ac.getLayoutParams().height;
        f3 = (float)ac.getLayoutParams().width - 2.0F * f1;
        f4 = (float)ac.getLayoutParams().height - 2.0F * f2;
        int k1 = 0;
_L5:
        if (k1 >= e.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ioexception = e[k1].y;
        if (ioexception != null)
        {
            break MISSING_BLOCK_LABEL_449;
        }
        throw new OutOfMemoryError("data null");
        Path path;
        List list;
        int l2;
        int l1 = Math.round((((lc) (ioexception)).k * f4) / 100F + f2);
        l2 = Math.round((((lc) (ioexception)).j * f3) / 100F + f1);
        int i3 = Math.round((((lc) (ioexception)).l * f3) / 100F);
        int j3 = Math.round((((lc) (ioexception)).m * f4) / 100F);
        ((lc) (ioexception)).p.set(l2, l1, i3 + l2, j3 + l1);
        path = new Path();
        list = ((lc) (ioexception)).b;
        path.moveTo(Math.round((((PointF)list.get(0)).x * (float)j2) / 100F), Math.round((((PointF)list.get(0)).y * (float)k2) / 100F));
        l2 = list.size();
        int i2 = 1;
_L3:
        if (i2 >= l2)
        {
            break; /* Loop/switch isn't completed */
        }
        path.lineTo(Math.round((((PointF)list.get(i2)).x * (float)j2) / 100F), Math.round((((PointF)list.get(i2)).y * (float)k2) / 100F));
        i2++;
        if (true) goto _L3; else goto _L2
_L2:
        path.close();
        ioexception.a = path;
        k1++;
        if (true) goto _L5; else goto _L4
_L4:
        (new Thread(new iz(this, ac.getLayoutParams().width, ac.getLayoutParams().height))).start();
        return;
    }

    static void G(ImageEditor imageeditor)
    {
        imageeditor.J();
    }

    private void H()
    {
        if (e == null)
        {
            return;
        }
        ih.C().a(e);
        ih.C().a(d);
        ih.C().j(c);
        ih.C().d(b);
        ih.C().i(f);
        ih.C().h(O);
        Intent intent = new Intent();
        intent.setClass(this, com/roidapp/photogrid/release/EffectsList);
        if (u != null)
        {
            u.removeAllViews();
        }
        startActivity(intent);
        finish();
    }

    private String I()
    {
        String s1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(getString(0x7f07002e)).toString();
        return PreferenceManager.getDefaultSharedPreferences(this).getString("SAVEPATH", s1);
    }

    private void J()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = ah.keySet().iterator();
_L2:
        Bitmap bitmap;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_70;
            }
            bitmap = (Bitmap)ah.get(iterator.next());
        } while (bitmap == null);
        if (bitmap.isRecycled()) goto _L2; else goto _L1
_L1:
        bitmap.recycle();
        iterator.remove();
          goto _L2
        Exception exception;
        exception;
        throw exception;
        ah.clear();
        this;
        JVM INSTR monitorexit ;
    }

    static int a()
    {
        return i;
    }

    static int a(ImageEditor imageeditor, int i1)
    {
        imageeditor.af = i1;
        return i1;
    }

    static com.roidapp.photogrid.release.an a(ImageEditor imageeditor)
    {
        return imageeditor.aa;
    }

    static void a(ImageEditor imageeditor, View view)
    {
        if (imageeditor.T == null)
        {
            imageeditor.T = view;
            imageeditor.J = false;
            view = Message.obtain();
            view.what = j;
            view.obj = Boolean.valueOf(false);
            imageeditor.h.sendMessage(view);
            return;
        }
        for (int i1 = 0; i1 < imageeditor.e.length; i1++)
        {
            Object obj1 = (ImageView)imageeditor.T.findViewById(i1 + 1);
            ImageView imageview = (ImageView)view.findViewById(i1 + 1);
            Object obj = (android.widget.AbsoluteLayout.LayoutParams)imageview.getLayoutParams();
            obj1 = (android.widget.AbsoluteLayout.LayoutParams)((ImageView) (obj1)).getLayoutParams();
            obj = new TranslateAnimation(((android.widget.AbsoluteLayout.LayoutParams) (obj1)).x - ((android.widget.AbsoluteLayout.LayoutParams) (obj)).x, 0.0F, ((android.widget.AbsoluteLayout.LayoutParams) (obj1)).y - ((android.widget.AbsoluteLayout.LayoutParams) (obj)).y, 0.0F);
            obj1 = new AnimationSet(true);
            ((AnimationSet) (obj1)).addAnimation(((android.view.animation.Animation) (obj)));
            ((AnimationSet) (obj1)).setDuration(az.d);
            imageview.startAnimation(((android.view.animation.Animation) (obj1)));
        }

        imageeditor.T = view;
        imageeditor.J = false;
        view = Message.obtain();
        view.what = j;
        view.obj = Boolean.valueOf(false);
        imageeditor.h.sendMessage(view);
    }

    private boolean a(View view)
    {
        int i1 = 0;
_L8:
        if (i1 >= e.length) goto _L2; else goto _L1
_L1:
        Object obj1;
        List list;
        aq aq1;
        lc lc1;
        aq1 = (aq)view.findViewById(i1 + 1);
        if (az.q == 3 || az.q == 2)
        {
            aq1.setOnClickListener(new ja(this, aq1));
        }
        lc1 = e[i1].y;
        e[i1].w = false;
        obj1 = null;
        list = null;
        int j1 = az.q;
        Object obj = list;
        j1;
        JVM INSTR tableswitch 0 5: default 132
    //                   0 168
    //                   1 135
    //                   2 495
    //                   3 537
    //                   4 135
    //                   5 168;
           goto _L3 _L4 _L5 _L6 _L7 _L5 _L4
_L3:
        obj = list;
_L5:
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            aq1.a(((Bitmap) (obj)));
            a(i1, ((Bitmap) (obj)));
        }
        i1++;
          goto _L8
_L4:
        rf.a();
        obj = rf.a(aq1);
        int k1;
        j1 = obj[0];
        k1 = obj[1];
        rf.a();
        obj = rf.a(e[i1], k1 + 6, j1 + 6, Boolean.valueOf(false));
        int l1;
        int i2;
        obj1 = view.getLayoutParams();
        k1 = ((android.view.ViewGroup.LayoutParams) (obj1)).width;
        l1 = ((android.view.ViewGroup.LayoutParams) (obj1)).height;
        obj1 = new Path();
        list = lc1.b;
        ((Path) (obj1)).moveTo(Math.round((((PointF)list.get(0)).x * (float)k1) / 100F), Math.round((((PointF)list.get(0)).y * (float)l1) / 100F));
        i2 = list.size();
        j1 = 1;
_L10:
        if (j1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Path) (obj1)).lineTo(Math.round((((PointF)list.get(j1)).x * (float)k1) / 100F), Math.round((((PointF)list.get(j1)).y * (float)l1) / 100F));
        j1++;
        if (true) goto _L10; else goto _L9
_L9:
        ((Path) (obj1)).close();
        e[i1].y.a = ((Path) (obj1));
          goto _L5
        obj1;
        obj1 = obj;
_L19:
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (!((Bitmap) (obj1)).isRecycled())
            {
                ((Bitmap) (obj1)).recycle();
                obj = null;
            }
        }
        System.gc();
        j1 = az.q;
        obj1 = obj;
        j1;
        JVM INSTR tableswitch 0 5: default 488
    //                   0 579
    //                   1 490
    //                   2 864
    //                   3 908
    //                   4 490
    //                   5 579;
           goto _L11 _L12 _L13 _L14 _L15 _L13 _L12
_L11:
        obj1 = obj;
_L13:
        obj = obj1;
          goto _L5
_L6:
        j1 = rf.a(this);
        k1 = (int)((float)j1 * 0.75F);
        rf.a();
        obj = rf.a(e[i1], j1, k1, Boolean.valueOf(false));
          goto _L5
_L7:
        j1 = rf.a(this);
        k1 = (int)((float)j1 * 0.75F);
        rf.a();
        obj = rf.a(e[i1], k1, j1, Boolean.valueOf(false));
          goto _L5
_L12:
        rf.a();
        obj1 = rf.a(aq1);
        j1 = obj1[0];
        k1 = obj1[1];
        rf.a();
        obj1 = rf.a(e[i1], k1 + 6, j1 + 6, Boolean.valueOf(false));
        obj = obj1;
        obj1 = view.getLayoutParams();
        k1 = ((android.view.ViewGroup.LayoutParams) (obj1)).width;
        l1 = ((android.view.ViewGroup.LayoutParams) (obj1)).height;
        obj1 = new Path();
        list = lc1.b;
        ((Path) (obj1)).moveTo(Math.round((((PointF)list.get(0)).x * (float)k1) / 100F), Math.round((((PointF)list.get(0)).y * (float)l1) / 100F));
        i2 = list.size();
        j1 = 1;
_L17:
        if (j1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Path) (obj1)).lineTo(Math.round((((PointF)list.get(j1)).x * (float)k1) / 100F), Math.round((((PointF)list.get(j1)).y * (float)l1) / 100F));
        j1++;
        if (true) goto _L17; else goto _L16
_L16:
        ((Path) (obj1)).close();
        e[i1].y.a = ((Path) (obj1));
          goto _L5
        view;
_L18:
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        System.gc();
        af = 167;
        h.sendEmptyMessage(n);
        return false;
_L14:
        j1 = rf.a(this);
        k1 = (int)((float)j1 * 0.75F);
        rf.a();
        obj1 = rf.a(e[i1], j1, k1, Boolean.valueOf(false));
        obj = obj1;
          goto _L5
_L15:
        j1 = rf.a(this);
        k1 = (int)((float)j1 * 0.75F);
        rf.a();
        obj1 = rf.a(e[i1], k1, j1, Boolean.valueOf(false));
          goto _L13
_L2:
        return true;
        view;
          goto _L18
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
          goto _L19
    }

    static boolean a(ImageEditor imageeditor, boolean flag)
    {
        imageeditor.J = flag;
        return flag;
    }

    static int b()
    {
        return j;
    }

    static ViewGroup b(ImageEditor imageeditor)
    {
        return imageeditor.ab;
    }

    static void b(ImageEditor imageeditor, int i1)
    {
        try
        {
            imageeditor.U.a(i1);
            imageeditor.g = null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            com.roidapp.photogrid.common.c.a(imageeditor.h, exception);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            imageeditor.af = 171;
            imageeditor.h.sendEmptyMessage(n);
            outofmemoryerror.printStackTrace();
        }
        imageeditor.J = false;
    }

    static void b(ImageEditor imageeditor, boolean flag)
    {
        try
        {
            imageeditor.U.c(flag);
            imageeditor.g = null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            com.roidapp.photogrid.common.c.a(imageeditor.h, exception);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            imageeditor.af = 177;
            imageeditor.h.sendEmptyMessage(n);
            outofmemoryerror.printStackTrace();
        }
        imageeditor.J = false;
    }

    private void b(String s1)
    {
        J = false;
        Message message = Message.obtain();
        message.what = 700;
        message.obj = s1;
        h.sendMessage(message);
    }

    static boolean b(ImageEditor imageeditor, View view)
    {
        return imageeditor.a(view);
    }

    static View c(ImageEditor imageeditor, View view)
    {
        imageeditor.M = view;
        return view;
    }

    static ArrayList c(ImageEditor imageeditor)
    {
        return imageeditor.ai;
    }

    static void c(ImageEditor imageeditor, boolean flag)
    {
        try
        {
            imageeditor.U.d(flag);
            imageeditor.g = null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            com.roidapp.photogrid.common.c.a(imageeditor.h, exception);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            imageeditor.af = 178;
            imageeditor.h.sendEmptyMessage(n);
            outofmemoryerror.printStackTrace();
        }
        imageeditor.J = false;
    }

    private void c(String s1)
    {
        J = false;
        Message message = Message.obtain();
        message.what = 701;
        message.obj = s1;
        h.sendMessage(message);
    }

    static int d()
    {
        return k;
    }

    static RelativeLayout d(ImageEditor imageeditor)
    {
        return imageeditor.ae;
    }

    private void d(String s1)
    {
        sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse((new StringBuilder("file://")).append(s1).toString())));
        if (am)
        {
            com.roidapp.baselib.c.an.a(this, (new StringBuilder()).append(getString(0x7f07027e)).append(ap.a(this)).toString());
            FacebookMessengerActivity.a(s1, "image/jpeg");
            finish();
            return;
        }
        Message message = Message.obtain();
        message.what = k;
        message.obj = s1;
        h.sendMessage(message);
        s1 = Message.obtain();
        s1.what = j;
        s1.obj = Boolean.valueOf(false);
        h.sendMessage(s1);
        if (V)
        {
            h.sendEmptyMessage(l);
            return;
        } else
        {
            J = false;
            return;
        }
    }

    static void e(ImageEditor imageeditor)
    {
        imageeditor.G();
    }

    static int f()
    {
        return l;
    }

    static void f(ImageEditor imageeditor)
    {
        System.gc();
        try
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(imageeditor);
            builder.setTitle(0x7f070158);
            builder.setCancelable(false);
            builder.setMessage((new StringBuilder()).append(imageeditor.getString(0x7f070157)).append("   ErrorCode:").append(String.valueOf(imageeditor.af)).toString());
            builder.setPositiveButton(0x7f070156, new jb(imageeditor));
            builder.create();
            builder.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ImageEditor imageeditor)
        {
            imageeditor.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ImageEditor imageeditor)
        {
            imageeditor.printStackTrace();
        }
    }

    static int g()
    {
        return m;
    }

    static boolean g(ImageEditor imageeditor)
    {
        return imageeditor.X;
    }

    static String h(ImageEditor imageeditor)
    {
        return imageeditor.W;
    }

    static int i()
    {
        return n;
    }

    static boolean i(ImageEditor imageeditor)
    {
        imageeditor.X = false;
        return false;
    }

    static int j()
    {
        return F;
    }

    static RelativeLayout j(ImageEditor imageeditor)
    {
        return imageeditor.K;
    }

    static int k()
    {
        return G;
    }

    static boolean k(ImageEditor imageeditor)
    {
        return imageeditor.V;
    }

    static int l()
    {
        return H;
    }

    static String l(ImageEditor imageeditor)
    {
        return imageeditor.I();
    }

    static int m()
    {
        return I;
    }

    static int m(ImageEditor imageeditor)
    {
        return imageeditor.Z;
    }

    static int n()
    {
        return A;
    }

    static View n(ImageEditor imageeditor)
    {
        return imageeditor.M;
    }

    static int o()
    {
        return B;
    }

    static void o(ImageEditor imageeditor)
    {
        try
        {
            imageeditor.U.d();
            imageeditor.g = null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            com.roidapp.photogrid.common.c.a(imageeditor.h, exception);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            imageeditor.af = 173;
            imageeditor.h.sendEmptyMessage(n);
            outofmemoryerror.printStackTrace();
        }
        imageeditor.J = false;
    }

    static int p()
    {
        return C;
    }

    static void p(ImageEditor imageeditor)
    {
        try
        {
            imageeditor.U.e();
            imageeditor.g = null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            com.roidapp.photogrid.common.c.a(imageeditor.h, exception);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            imageeditor.af = 172;
            imageeditor.h.sendEmptyMessage(n);
            outofmemoryerror.printStackTrace();
        }
        imageeditor.J = false;
    }

    static int q()
    {
        return E;
    }

    static void q(ImageEditor imageeditor)
    {
        if (!imageeditor.U.a(false)) goto _L2; else goto _L1
_L1:
        imageeditor.findViewById(0x7f0d024a).setEnabled(false);
        ((ImageView)imageeditor.findViewById(0x7f0d024c)).setAlpha(100);
        imageeditor.e[imageeditor.U.getId() - 1].x = 1;
_L3:
        if (!imageeditor.findViewById(0x7f0d024d).isEnabled())
        {
            imageeditor.findViewById(0x7f0d024d).setEnabled(true);
            ((ImageView)imageeditor.findViewById(0x7f0d024f)).setAlpha(255);
        }
        imageeditor.g = null;
_L4:
        imageeditor.J = false;
        return;
_L2:
        imageeditor.e[imageeditor.U.getId() - 1].x = 0;
          goto _L3
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        com.roidapp.photogrid.common.c.a(imageeditor.h, ((Throwable) (obj)));
          goto _L4
        obj;
        imageeditor.af = 175;
        imageeditor.h.sendEmptyMessage(n);
        ((OutOfMemoryError) (obj)).printStackTrace();
          goto _L4
    }

    static int r()
    {
        return D;
    }

    static void r(ImageEditor imageeditor)
    {
        if (!imageeditor.U.b(false)) goto _L2; else goto _L1
_L1:
        imageeditor.findViewById(0x7f0d024d).setEnabled(false);
        ((ImageView)imageeditor.findViewById(0x7f0d024f)).setAlpha(100);
        imageeditor.e[imageeditor.U.getId() - 1].x = -1;
_L3:
        if (!imageeditor.findViewById(0x7f0d024a).isEnabled())
        {
            imageeditor.findViewById(0x7f0d024a).setEnabled(true);
            ((ImageView)imageeditor.findViewById(0x7f0d024c)).setAlpha(255);
        }
        imageeditor.g = null;
_L4:
        imageeditor.J = false;
        return;
_L2:
        imageeditor.e[imageeditor.U.getId() - 1].x = 0;
          goto _L3
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        com.roidapp.photogrid.common.c.a(imageeditor.h, ((Throwable) (obj)));
          goto _L4
        obj;
        imageeditor.af = 176;
        imageeditor.h.sendEmptyMessage(n);
        ((OutOfMemoryError) (obj)).printStackTrace();
          goto _L4
    }

    static int s()
    {
        return z;
    }

    static aq s(ImageEditor imageeditor)
    {
        return imageeditor.U;
    }

    static int t()
    {
        return y;
    }

    static aq t(ImageEditor imageeditor)
    {
        imageeditor.U = null;
        return null;
    }

    static int u()
    {
        return r;
    }

    static void u(ImageEditor imageeditor)
    {
        try
        {
            imageeditor.U.c();
            imageeditor.g = null;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            com.roidapp.photogrid.common.c.a(imageeditor.h, exception);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            imageeditor.af = 174;
            imageeditor.h.sendEmptyMessage(n);
            outofmemoryerror.printStackTrace();
        }
        imageeditor.J = false;
    }

    static int v()
    {
        return o;
    }

    static Map v(ImageEditor imageeditor)
    {
        return imageeditor.Y;
    }

    static int w()
    {
        return s;
    }

    static al w(ImageEditor imageeditor)
    {
        return imageeditor.an;
    }

    static void x(ImageEditor imageeditor)
    {
        imageeditor.H();
    }

    static int y()
    {
        return p;
    }

    static boolean y(ImageEditor imageeditor)
    {
        return imageeditor.J;
    }

    static int z()
    {
        return q;
    }

    static void z(ImageEditor imageeditor)
    {
        imageeditor.J = true;
        Message message = Message.obtain();
        message.what = j;
        message.obj = Boolean.valueOf(true);
        imageeditor.h.sendMessage(message);
        if (imageeditor.U != null)
        {
            int i1 = imageeditor.U.getId();
            View view = imageeditor.M.findViewWithTag((new StringBuilder("mask")).append(i1 - 1).toString());
            if (view != null)
            {
                view.setBackgroundColor(0);
            }
            imageeditor.U = null;
        }
        if (!rf.a(imageeditor, 10))
        {
            imageeditor.h.sendEmptyMessage(16);
            return;
        } else
        {
            imageeditor.h.post(new is(imageeditor));
            return;
        }
    }

    public final void a(int i1, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap1 = (Bitmap)ah.get(Integer.valueOf(i1));
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (!bitmap1.isRecycled())
        {
            bitmap1.recycle();
        }
        ah.put(Integer.valueOf(i1), bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    public final void a(aq aq1)
    {
        if (!J) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        i1 = aq1.getId();
        if (!"sketch".equals(W))
        {
            break; /* Loop/switch isn't completed */
        }
        U = aq1;
        if (!J && U != null)
        {
            J = true;
            aq1 = Message.obtain();
            aq1.what = j;
            aq1.obj = Boolean.valueOf(true);
            h.sendMessage(aq1);
            (new Thread(new iu(this))).start();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (U == null) goto _L5; else goto _L4
_L4:
        if (i1 == U.getId()) goto _L7; else goto _L6
_L6:
        View view;
        int i2;
        if ("exchange".equals(W))
        {
            J = true;
            K.setVisibility(0);
            Object obj = U;
            aq1 = (aq)aq1;
            i1 = ((aq) (obj)).getId() - 1;
            int j1 = aq1.getId() - 1;
            Object obj1 = M.findViewWithTag((new StringBuilder("mask")).append(i1).toString());
            if (obj1 != null)
            {
                ((View) (obj1)).setBackgroundColor(0);
            }
            e[i1].c();
            e[j1].c();
            obj1 = e[i1].a();
            lc lc1 = e[i1].y.a();
            e[i1] = e[j1];
            e[j1] = ((ig) (obj1));
            e[j1].y = e[i1].y;
            e[i1].y = lc1;
            if (ai != null && ai.size() > 0)
            {
                ((ic)ai.get(i1)).a();
                ((ic)ai.get(j1)).a();
            }
            obj1 = Message.obtain();
            obj1.what = m;
            obj1.arg1 = ((aq) (obj)).getId();
            h.sendMessage(((Message) (obj1)));
            obj = Message.obtain();
            obj.what = m;
            obj.arg1 = aq1.getId();
            h.sendMessage(((Message) (obj)));
            g = null;
            U = null;
            return;
        }
        int k1 = U.getId();
        view = M.findViewWithTag((new StringBuilder("mask")).append(k1 - 1).toString());
        if (view != null)
        {
            view.setBackgroundColor(0);
        }
        i2 = i1 - 1;
        view = M.findViewWithTag((new StringBuilder("mask")).append(i2).toString());
        if (view == null) goto _L9; else goto _L8
_L8:
        Object obj2;
        obj2 = e[i2].y;
        e[i2].w = false;
        obj2 = ((lc) (obj2)).a;
        az.q;
        JVM INSTR tableswitch 0 5: default 568
    //                   0 671
    //                   1 568
    //                   2 696
    //                   3 715
    //                   4 568
    //                   5 671;
           goto _L10 _L11 _L10 _L12 _L13 _L10 _L11
_L13:
        break MISSING_BLOCK_LABEL_715;
_L10:
        int l1;
        i1 = 0;
        l1 = 0;
_L14:
        if (obj2 != null)
        {
            obj2 = new ShapeDrawable(new PathShape(((Path) (obj2)), l1, i1));
            ((ShapeDrawable) (obj2)).getPaint().setColor(Color.argb(128, 0, 0, 0));
            ((ShapeDrawable) (obj2)).setBounds(0, 0, l1, i1);
            view.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
        } else
        {
            view.setBackgroundColor(Color.argb(128, 0, 0, 0));
        }
_L9:
        U = aq1;
        aq1 = Message.obtain();
        aq1.what = r;
        aq1.arg1 = e[i2].x;
        h.sendMessage(aq1);
        return;
_L11:
        rf.a();
        int ai2[] = rf.a(aq1);
        l1 = ai2[0];
        i1 = ai2[1];
          goto _L14
_L12:
        i1 = rf.a(this);
        l1 = (int)((float)i1 * 0.75F);
          goto _L14
        l1 = rf.a(this);
        i1 = (int)((float)l1 * 0.75F);
          goto _L14
_L5:
        i2 = i1 - 1;
        view = M.findViewWithTag((new StringBuilder("mask")).append(i2).toString());
        az.q;
        JVM INSTR tableswitch 0 5: default 824
    //                   0 981
    //                   1 824
    //                   2 1003
    //                   3 1022
    //                   4 824
    //                   5 981;
           goto _L15 _L16 _L15 _L17 _L18 _L15 _L16
_L15:
        i1 = 0;
        l1 = 0;
_L19:
        if (view != null)
        {
            Object obj3 = e[i2].y;
            e[i2].w = false;
            obj3 = ((lc) (obj3)).a;
            int ai1[];
            if (obj3 != null)
            {
                Log.i("imagee", " get irregular sharpe..");
                obj3 = new ShapeDrawable(new PathShape(((Path) (obj3)), l1, i1));
                ((ShapeDrawable) (obj3)).getPaint().setColor(Color.argb(128, 0, 0, 0));
                ((ShapeDrawable) (obj3)).setBounds(0, 0, l1, i1);
                view.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
            } else
            {
                view.setBackgroundColor(Color.argb(128, 0, 0, 0));
            }
        }
        U = aq1;
        if ("move_zoom_rotate".equals(W))
        {
            aq1 = Message.obtain();
            aq1.what = r;
            aq1.arg1 = e[i2].x;
            h.sendMessage(aq1);
            return;
        }
_L7:
        if (true) goto _L1; else goto _L16
_L16:
        rf.a();
        ai1 = rf.a(aq1);
        l1 = ai1[0];
        i1 = ai1[1];
          goto _L19
_L17:
        i1 = rf.a(this);
        l1 = (int)((float)i1 * 0.75F);
          goto _L19
_L18:
        l1 = rf.a(this);
        i1 = (int)((float)l1 * 0.75F);
          goto _L19
    }

    public final void a(String s1)
    {
        J = false;
        V = false;
        br.a(this, 3841, s1, Z, getString(0x7f0702b8), null, null, "ImageEditor", null, false, BaseShareActivity.a);
    }

    public View makeView()
    {
        ImageView imageview = new ImageView(this);
        if (ih.C().v())
        {
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        }
        if (ih.C().t() == 1.0F)
        {
            imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        }
        imageview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return imageview;
    }

    public void onAccuracyChanged(Sensor sensor, int i1)
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        int i1;
        if (configuration.orientation != 2)
        {
            i1 = configuration.orientation;
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ba.a().a(this);
        try
        {
            setContentView(0x7f030092);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v) goto _L2; else goto _L1
_L1:
        Y = new HashMap();
        b = ih.C().L();
        c = ih.C().K();
        d = ih.C().J();
        e = ih.C().M();
        f = ih.C().I();
        O = ih.C().H();
        P = ih.C().A();
        Q = ih.C().y();
        R = ih.C().z();
        S = ih.C().x();
        ag = ih.C().B();
        if (e != null || c <= 0) goto _L4; else goto _L3
_L3:
        bundle = new Intent();
        bundle.setClass(this, com/roidapp/photogrid/release/ImageSelector);
        if (u != null)
        {
            u.removeAllViews();
        }
        startActivity(bundle);
        finish();
_L2:
        return;
_L4:
        if (e == null && c == 0)
        {
            com.roidapp.photogrid.common.c.a("170", this);
            return;
        }
        ac = (RelativeLayout)findViewById(0x7f0d00aa);
        ae = (RelativeLayout)findViewById(0x7f0d0061);
        ad = (FrameLayout)findViewById(0x7f0d0239);
        W = getIntent().getExtras().getString("effect_mode");
        bundle = W;
        if ("exchange".equals(bundle))
        {
            findViewById(0x7f0d023b).setVisibility(0);
            findViewById(0x7f0d023d).setVisibility(8);
            findViewById(0x7f0d025e).setVisibility(8);
        } else
        if ("move_zoom_rotate".equals(bundle))
        {
            findViewById(0x7f0d023b).setVisibility(8);
            bundle = findViewById(0x7f0d023d);
            bundle.setVisibility(0);
            TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 2, -1F, 1, 0.0F, 1, 0.0F);
            translateanimation.setDuration(1000L);
            bundle.startAnimation(translateanimation);
            findViewById(0x7f0d025e).setVisibility(8);
        } else
        if ("sketch".equals(bundle))
        {
            findViewById(0x7f0d023b).setVisibility(8);
            findViewById(0x7f0d023d).setVisibility(8);
            findViewById(0x7f0d025e).setVisibility(0);
        }
        K = (RelativeLayout)findViewById(0x7f0d040d);
        N = new GestureDetector(this);
        ab = (ViewGroup)findViewById(0x7f0d0060);
        if (ag)
        {
            ab.setVisibility(4);
        }
        ((TextView)findViewById(0x7f0d0028)).setOnClickListener(new iv(this));
        if ("sketch".equals(W))
        {
            ((ImageButton)findViewById(0x7f0d0238)).setVisibility(8);
            bundle = (ImageButton)findViewById(0x7f0d003a);
            bundle.setAlpha(165);
            bundle.setOnClickListener(new jc(this));
            ImageButton imagebutton = (ImageButton)findViewById(0x7f0d0237);
            imagebutton.setAlpha(165);
            imagebutton.setOnClickListener(new jd(this));
            am = FacebookMessengerActivity.a(this);
            if (am)
            {
                bundle.setBackgroundResource(0x7f020459);
                android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)bundle.getLayoutParams();
                int i1 = getResources().getDimensionPixelSize(0x7f090193);
                layoutparams.width = i1;
                layoutparams.height = i1;
                layoutparams.setMargins(0, 0, getResources().getDimensionPixelSize(0x7f090187), 0);
                bundle.setLayoutParams(layoutparams);
                bundle.setImageDrawable(null);
                imagebutton.setVisibility(8);
            }
        } else
        {
            ((ImageButton)findViewById(0x7f0d003a)).setVisibility(8);
            ((ImageButton)findViewById(0x7f0d0237)).setVisibility(8);
            ((ImageButton)findViewById(0x7f0d0238)).setOnClickListener(new je(this));
        }
        ((RelativeLayout)findViewById(0x7f0d0250)).setOnClickListener(new jf(this));
        ((RelativeLayout)findViewById(0x7f0d0256)).setOnClickListener(new jg(this));
        ((RelativeLayout)findViewById(0x7f0d0253)).setOnClickListener(new jh(this));
        ((RelativeLayout)findViewById(0x7f0d0259)).setOnClickListener(new ji(this));
        ((RelativeLayout)findViewById(0x7f0d025c)).setOnClickListener(new il(this));
        ((RelativeLayout)findViewById(0x7f0d023e)).setOnClickListener(new im(this));
        ((RelativeLayout)findViewById(0x7f0d0241)).setOnClickListener(new in(this));
        ((RelativeLayout)findViewById(0x7f0d0244)).setOnClickListener(new io(this));
        ((RelativeLayout)findViewById(0x7f0d0247)).setOnClickListener(new ip(this));
        ((RelativeLayout)findViewById(0x7f0d024a)).setOnClickListener(new iq(this));
        ((RelativeLayout)findViewById(0x7f0d024d)).setOnClickListener(new ir(this));
        X = true;
        az.q;
        JVM INSTR tableswitch 0 5: default 892
    //                   0 1149
    //                   1 892
    //                   2 1737
    //                   3 1862
    //                   4 892
    //                   5 1149;
           goto _L5 _L6 _L5 _L7 _L8 _L5 _L6
_L8:
        break MISSING_BLOCK_LABEL_1862;
_L5:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L10:
        Z = getSharedPreferences(getPackageName(), 0).getInt("FORMAT", 2);
        if (getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
        {
            an = new al(this, h);
            an.b();
            ba.a().b();
            return;
        }
        if (true) goto _L2; else goto _L9
_L9:
        ac.setDrawingCacheEnabled(true);
        ac.setDrawingCacheQuality(0x100000);
        ac.setVisibility(0);
        ad.setVisibility(8);
        if (e == null)
        {
            com.roidapp.photogrid.common.c.a("171", this);
            return;
        }
        float f3 = ih.C().t();
        al = getResources().getDisplayMetrics().heightPixels;
        ak = getResources().getDisplayMetrics().widthPixels;
        if (al < ak)
        {
            int j1 = al;
            al = ak;
            ak = j1;
        }
        float f4 = getResources().getDimension(0x7f0900dd);
        float f5 = getResources().getDimension(0x7f090058);
        float f2 = getResources().getDimension(0x7f090057);
        float f1 = f2;
        if (u != null)
        {
            f1 = f2;
            if (u.getVisibility() == 0)
            {
                int k1 = u.getLayoutParams().height;
                f1 = f2;
                if (k1 > 0)
                {
                    f1 = k1;
                }
            }
        }
        f2 = getResources().getDimension(0x7f0900cb);
        int i2 = (int)((float)al - f4 - (50F + f5) - f1 - f2);
        int l1;
        int j2;
        if (f3 < (float)ak / (float)i2)
        {
            l1 = (int)((float)i2 * f3);
        } else
        {
            l1 = ak;
            i2 = (int)((float)l1 / f3);
        }
        if (f3 > 1.0F)
        {
            j2 = (int)((float)i2 * 0.0115F);
        } else
        {
            j2 = (int)((float)l1 * 0.0115F);
        }
        bundle = ac.getLayoutParams();
        bundle.width = l1;
        bundle.height = i2;
        ac.setLayoutParams(bundle);
        bundle = (android.view.ViewGroup.MarginLayoutParams)ae.getLayoutParams();
        bundle.width = l1 - j2 * 2;
        bundle.height = i2 - j2 * 2;
        bundle.setMargins(j2, j2, j2, j2);
        ae.setLayoutParams(bundle);
        if (e.length == 1)
        {
            L = com.roidapp.photogrid.common.aj.a().b;
        } else
        if (e.length == 2)
        {
            L = com.roidapp.photogrid.common.aj.a().c;
        } else
        if (e.length == 3)
        {
            L = com.roidapp.photogrid.common.aj.a().d;
        } else
        if (e.length == 4)
        {
            L = com.roidapp.photogrid.common.aj.a().e;
        } else
        if (e.length == 5)
        {
            L = com.roidapp.photogrid.common.aj.a().f;
        } else
        if (e.length == 6)
        {
            L = com.roidapp.photogrid.common.aj.a().g;
        } else
        if (e.length == 7)
        {
            L = com.roidapp.photogrid.common.aj.a().h;
        } else
        if (e.length == 8)
        {
            L = com.roidapp.photogrid.common.aj.a().i;
        } else
        if (e.length == 9)
        {
            L = com.roidapp.photogrid.common.aj.a().j;
        }
        G();
          goto _L10
_L7:
        ac.setVisibility(8);
        ad.setVisibility(0);
        if (e == null)
        {
            com.roidapp.photogrid.common.c.a("172", this);
            return;
        }
        J = true;
        bundle = Message.obtain();
        bundle.what = j;
        bundle.obj = Boolean.valueOf(true);
        h.sendMessage(bundle);
        bundle = LayoutInflater.from(this).inflate(0x7f0300df, null);
        LinearLayout linearlayout = (LinearLayout)bundle.findViewById(0x7f0d03a9);
        rf.a();
        rf.b(linearlayout, this, e);
        (new Thread(new ix(this, bundle))).start();
          goto _L10
        ac.setVisibility(8);
        ad.setVisibility(0);
        if (e == null)
        {
            com.roidapp.photogrid.common.c.a("173", this);
            return;
        }
        J = true;
        bundle = Message.obtain();
        bundle.what = j;
        bundle.obj = Boolean.valueOf(true);
        h.sendMessage(bundle);
        bundle = LayoutInflater.from(this).inflate(0x7f0300de, null);
        LinearLayout linearlayout1 = (LinearLayout)bundle.findViewById(0x7f0d03a8);
        rf.a();
        rf.a(linearlayout1, this, e);
        (new Thread(new iw(this, bundle))).start();
          goto _L10
    }

    public void onDestroy()
    {
        if (an != null)
        {
            an.c();
        }
        if (u != null)
        {
            u.removeAllViews();
        }
        J();
        if (ai != null)
        {
            Iterator iterator = ai.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ic ic1 = (ic)iterator.next();
                if (ic1 != null)
                {
                    ic1.a();
                }
            } while (true);
            ai.clear();
        }
        com.roidapp.baselib.c.p.b();
        com.roidapp.photogrid.common.n.d();
        com.roidapp.photogrid.common.aj.b();
        super.onDestroy();
    }

    public boolean onDown(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            if (J)
            {
                return true;
            } else
            {
                H();
                return true;
            }
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    public void onResume()
    {
        super.onResume();
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        return false;
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return true;
    }

    public void onStart()
    {
        super.onStart();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return N.onTouchEvent(motionevent);
    }

    public final void x()
    {
        t = "image_editor";
    }

}
