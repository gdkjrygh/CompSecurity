// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.b.e;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.c;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.ClippingPathModel;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.model.gson.ImageScrapModel;
import com.cardinalblue.android.piccollage.model.gson.TagModel;
import com.cardinalblue.android.piccollage.model.k;
import com.google.b.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            k, h

public class g extends com.cardinalblue.android.piccollage.view.k
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/view/g$a, s1);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("RIGHT", 1);
            c = new a("LEFT", 2);
            d = new a("TOP", 3);
            e = new a("BOTTOM", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class b extends k.a
    {

        public static void a(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("CREATE TABLE images (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, collage_id INTEGER NOT NULL, image_path TEXT NOT NULL, center_x FLOAT NOT NULL, center_y FLOAT NOT NULL, scale FLOAT NOT NULL, angle FLOAT NOT NULL, z_index INTEGER NOT NULL, clip_potin_x TEXT, clip_point_y TEXT, has_border INTEGER NOT NULL, has_shadow INTEGER NOT NULL, is_editable INTEGER NOT NULL, border_color INTEGER NOT NULL, has_frame INTEGER NOT NULL, frame_number INTEGER NOT NULL, original_image_url TEXT);");
        }

        public static void a(SQLiteDatabase sqlitedatabase, int i1, int j1, Context context)
        {
            i1;
            JVM INSTR tableswitch 3 15: default 68
        //                       3 85
        //                       4 91
        //                       5 97
        //                       6 103
        //                       7 103
        //                       8 115
        //                       9 121
        //                       10 127
        //                       11 131
        //                       12 143
        //                       13 149
        //                       14 149
        //                       15 149;
               goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L11 _L11
_L1:
            if (i1 != 15)
            {
                sqlitedatabase.execSQL("DROP TABLE IF EXISTS images;");
                a(sqlitedatabase);
            }
            return;
_L2:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN has_border INTEGER NOT NULL DEFAULT 1");
_L3:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN is_editable INTEGER NOT NULL DEFAULT 1");
_L4:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN z_index INTEGER NOT NULL DEFAULT -2147483648");
_L5:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN clip_potin_x TEXT ");
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN clip_point_y TEXT ");
_L6:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN border_color INTEGER NOT NULL DEFAULT -1");
_L7:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN has_shadow INTEGER NOT NULL DEFAULT 0");
_L8:
            b(sqlitedatabase);
_L9:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN has_frame INTEGER NOT NULL DEFAULT 1");
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN frame_number INTEGER NOT NULL DEFAULT -1");
_L10:
            sqlitedatabase.execSQL("ALTER TABLE images ADD COLUMN original_image_url TEXT");
_L11:
            a(sqlitedatabase, context);
            i1 = 15;
            if (true) goto _L1; else goto _L12
_L12:
        }

        private static void a(SQLiteDatabase sqlitedatabase, Context context)
        {
            sqlitedatabase.beginTransaction();
            int i1;
            i1 = context.getResources().getDimensionPixelSize(0x7f0b000a);
            context = sqlitedatabase.query("images", new String[] {
                "_id", "center_y"
            }, null, null, null, null, null);
            if (context.moveToFirst())
            {
                for (; !context.isAfterLast(); context.moveToNext())
                {
                    ContentValues contentvalues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(context, contentvalues);
                    contentvalues.put("center_y", Float.valueOf(contentvalues.getAsFloat("center_y").floatValue() - (float)i1));
                    sqlitedatabase.update("images", contentvalues, (new StringBuilder()).append("_id=").append(contentvalues.getAsLong("_id")).toString(), null);
                }

            }
            break MISSING_BLOCK_LABEL_151;
            Exception exception;
            exception;
            context.close();
            throw exception;
            context;
            sqlitedatabase.endTransaction();
            throw context;
            context.close();
            sqlitedatabase.setTransactionSuccessful();
            sqlitedatabase.endTransaction();
            return;
        }

        private static void b(SQLiteDatabase sqlitedatabase)
        {
            TreeMap treemap;
            Object obj1;
            int i1;
            int j1;
            treemap = new TreeMap();
            obj1 = sqlitedatabase.query("images", new String[] {
                "_id", "image_path"
            }, null, null, null, null, null);
            i1 = ((Cursor) (obj1)).getColumnIndex("_id");
            j1 = ((Cursor) (obj1)).getColumnIndex("image_path");
            ((Cursor) (obj1)).moveToFirst();
            for (; !((Cursor) (obj1)).isAfterLast(); ((Cursor) (obj1)).moveToNext())
            {
                String s1 = ((Cursor) (obj1)).getString(j1);
                if (!TextUtils.isEmpty(s1))
                {
                    treemap.put(Long.valueOf(((Cursor) (obj1)).getLong(i1)), s1);
                }
            }

              goto _L1
            Object obj;
            obj;
_L7:
            com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
            ((Cursor) (obj1)).close();
_L5:
            if (treemap.size() == 0) goto _L3; else goto _L2
_L2:
            sqlitedatabase.beginTransaction();
            ContentValues contentvalues;
            long l1;
            for (Iterator iterator = treemap.keySet().iterator(); iterator.hasNext(); sqlitedatabase.update("images", contentvalues, (new StringBuilder()).append("_id=").append(l1).toString(), null))
            {
                l1 = ((Long)iterator.next()).longValue();
                obj1 = com.cardinalblue.android.piccollage.model.k.c((String)treemap.get(Long.valueOf(l1)));
                contentvalues = new ContentValues();
                contentvalues.put("image_path", ((String) (obj1)));
            }

              goto _L4
            iterator;
            sqlitedatabase.endTransaction();
            throw iterator;
_L1:
            ((Cursor) (obj1)).close();
              goto _L5
            sqlitedatabase;
            ((Cursor) (obj1)).close();
            throw sqlitedatabase;
_L4:
            sqlitedatabase.setTransactionSuccessful();
            sqlitedatabase.endTransaction();
_L3:
            return;
            iterator;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public b()
        {
        }
    }


    static final boolean g;
    private static float r;
    private float A[];
    private int B;
    private Paint C;
    private final Paint D;
    private Paint E;
    private Paint F;
    private NinePatchDrawable G;
    private String H;
    private boolean I;
    private boolean J;
    private AtomicBoolean K;
    protected Rect a;
    protected Bitmap b;
    protected Context c;
    protected c d;
    protected final Paint e;
    protected pl.droidsonroids.gif.c f;
    private Matrix s;
    private File t;
    private Bitmap u;
    private RectF v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    g(Context context, ContentValues contentvalues)
        throws com.cardinalblue.android.piccollage.model.k.a, NullPointerException
    {
        boolean flag1 = true;
        super(contentvalues);
        s = new Matrix();
        B = -1;
        C = new Paint();
        C.setAntiAlias(true);
        C.setStyle(android.graphics.Paint.Style.STROKE);
        C.setDither(true);
        e = new Paint();
        e.setAntiAlias(false);
        D = new Paint();
        D.setAntiAlias(false);
        D.setAlpha(128);
        I = false;
        J = false;
        K = new AtomicBoolean(false);
        f = null;
        t = new File(com.cardinalblue.android.piccollage.model.k.d(contentvalues.getAsString("image_path")));
        b = com.cardinalblue.android.piccollage.model.k.a(t);
        ag();
        float f1;
        float f2;
        float f3;
        String s1;
        boolean flag;
        if (contentvalues.getAsInteger("has_border").intValue() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y = flag;
        if (contentvalues.getAsInteger("has_shadow").intValue() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        z = flag;
        B = contentvalues.getAsInteger("border_color").intValue();
        w = contentvalues.getAsInteger("frame_number").intValue();
        x = w;
        s1 = contentvalues.getAsString("original_image_url");
        H = s1;
        b(s1);
        if (TextUtils.isEmpty(i()))
        {
            b(Uri.fromFile(k()).toString());
        }
        if (c(H))
        {
            H = H.replace("assets://stickers/01/", "assets://stickers/StickerLite/");
        }
        c = context;
        G = (NinePatchDrawable)context.getResources().getDrawable(0x7f0202be);
        b(ClippingPathModel.parseFromPathXY(contentvalues.getAsString("clip_potin_x"), contentvalues.getAsString("clip_point_y")));
        e();
        f();
        f1 = contentvalues.getAsFloat("center_x").floatValue();
        f2 = contentvalues.getAsFloat("center_y").floatValue();
        f3 = com.cardinalblue.android.b.k.a().getResources().getDisplayMetrics().density;
        a(f1, f2, contentvalues.getAsFloat("scale").floatValue() / f3, contentvalues.getAsFloat("angle").floatValue());
    }

    protected g(Context context, Bitmap bitmap, File file)
    {
        s = new Matrix();
        B = -1;
        C = new Paint();
        C.setAntiAlias(true);
        C.setStyle(android.graphics.Paint.Style.STROKE);
        C.setDither(true);
        e = new Paint();
        e.setAntiAlias(false);
        D = new Paint();
        D.setAntiAlias(false);
        D.setAlpha(128);
        I = false;
        J = false;
        K = new AtomicBoolean(false);
        f = null;
        a(context, bitmap, file, c(context), b(context));
    }

    public g(Context context, Bitmap bitmap, File file, int i1, boolean flag)
    {
        s = new Matrix();
        B = -1;
        C = new Paint();
        C.setAntiAlias(true);
        C.setStyle(android.graphics.Paint.Style.STROKE);
        C.setDither(true);
        e = new Paint();
        e.setAntiAlias(false);
        D = new Paint();
        D.setAntiAlias(false);
        D.setAlpha(128);
        I = false;
        J = false;
        K = new AtomicBoolean(false);
        f = null;
        a(context, bitmap, file, i1, flag);
    }

    g(Context context, ImageScrapModel imagescrapmodel)
        throws IllegalArgumentException
    {
        super(imagescrapmodel);
        s = new Matrix();
        B = -1;
        C = new Paint();
        C.setAntiAlias(true);
        C.setStyle(android.graphics.Paint.Style.STROKE);
        C.setDither(true);
        e = new Paint();
        e.setAntiAlias(false);
        D = new Paint();
        D.setAntiAlias(false);
        D.setAlpha(128);
        I = false;
        J = false;
        K = new AtomicBoolean(false);
        f = null;
        c = context;
        if (!b(imagescrapmodel))
        {
            throw new IllegalArgumentException("the scrap model is not correct");
        } else
        {
            c(imagescrapmodel);
            return;
        }
    }

    private PointF a(PointF pointf, boolean flag)
    {
        int i1 = S();
        int j1 = T();
        if (pointf == null)
        {
            return new PointF(-i1 / 2, -j1 / 2);
        }
        float f1;
        float f2;
        if (Math.abs(pointf.x - (float)(i1 / 2)) < 10F)
        {
            f2 = i1 / 2;
            if (flag)
            {
                f1 = j1 / 2;
            } else
            {
                f1 = -j1 / 2;
            }
        } else
        if (Math.abs(pointf.x + (float)(i1 / 2)) < 10F)
        {
            f2 = -i1 / 2;
            if (flag)
            {
                f1 = -j1 / 2;
            } else
            {
                f1 = j1 / 2;
            }
        } else
        if (Math.abs(pointf.y - (float)(j1 / 2)) < 10F)
        {
            float f3;
            if (flag)
            {
                f1 = -i1 / 2;
            } else
            {
                f1 = i1 / 2;
            }
            f3 = j1 / 2;
            f2 = f1;
            f1 = f3;
        } else
        if (Math.abs(pointf.y + (float)(j1 / 2)) < 10F)
        {
            float f4;
            if (flag)
            {
                f1 = i1 / 2;
            } else
            {
                f1 = -i1 / 2;
            }
            f4 = -j1 / 2;
            f2 = f1;
            f1 = f4;
        } else
        {
            f2 = pointf.x;
            f1 = pointf.y;
        }
        return new PointF(f2, f1);
    }

    private a a(PointF pointf)
    {
        if (pointf == null)
        {
            return com.cardinalblue.android.piccollage.view.a.a;
        }
        if (Math.abs(pointf.x - (float)(S() / 2)) < 10F)
        {
            return a.b;
        }
        if (Math.abs(pointf.x + (float)(S() / 2)) < 10F)
        {
            return com.cardinalblue.android.piccollage.view.a.c;
        }
        if (Math.abs(pointf.y - (float)(T() / 2)) < 10F)
        {
            return com.cardinalblue.android.piccollage.view.a.e;
        }
        if (Math.abs(pointf.y + (float)(T() / 2)) < 10F)
        {
            return com.cardinalblue.android.piccollage.view.a.d;
        } else
        {
            return com.cardinalblue.android.piccollage.view.a.a;
        }
    }

    public static g a(Context context, Bitmap bitmap)
        throws IllegalArgumentException
    {
        if (bitmap == null)
        {
            throw new IllegalArgumentException("bitmap should not be null");
        } else
        {
            return new g(context, bitmap, new File(""));
        }
    }

    public static void a(Context context, int i1)
    {
        com.cardinalblue.android.b.k.c.a(context, "BORDER_COLOR", i1);
    }

    private void a(Context context, Bitmap bitmap, File file, int i1, boolean flag)
    {
        if (!g && bitmap == null)
        {
            throw new AssertionError();
        } else
        {
            c = context;
            t = file;
            z = flag;
            a(i1);
            w = -1;
            x = -1;
            G = (NinePatchDrawable)c.getResources().getDrawable(0x7f0202be);
            a(bitmap);
            return;
        }
    }

    public static void a(Context context, boolean flag)
    {
        com.cardinalblue.android.b.k.c.a(context, "HAS_SHADOW", flag);
    }

    private void a(Rect rect)
    {
        int i1 = c.getResources().getDimensionPixelSize(0x7f0b0174);
        int k1 = c.getResources().getDimensionPixelSize(0x7f0b0171);
        int l1 = c.getResources().getDimensionPixelSize(0x7f0b0172);
        int i2 = c.getResources().getDimensionPixelSize(0x7f0b0173);
        rect.top = rect.top - i1;
        rect.bottom = rect.bottom + k1;
        rect.left = rect.left - l1;
        rect.right = rect.right + i2;
        if (y)
        {
            int j1 = (int)(r / 2.0F);
            rect.top = rect.top - j1;
            rect.bottom = rect.bottom + j1;
            rect.left = rect.left - j1;
            rect.right = j1 + rect.right;
        }
    }

    private boolean a(int i1, int j1)
    {
        return i1 != -1 && j1 == -1;
    }

    public static boolean a(Context context)
    {
        return com.cardinalblue.android.b.k.c.b(context, "HAS_APPLY_ALL", true);
    }

    private void ag()
    {
        e(o());
        f(p());
    }

    private void ah()
    {
        if (a == null)
        {
            return;
        } else
        {
            Rect rect = new Rect(a);
            a(rect);
            G.setBounds(rect);
            return;
        }
    }

    private boolean ai()
    {
        return z && w == -1;
    }

    private boolean aj()
    {
        return y && A != null;
    }

    private void ak()
    {
        if (E == null)
        {
            E = new Paint();
            E.setColor(0xffff0000);
            E.setTextSize(14F);
            E.setStrokeWidth(2.0F);
        }
        if (F == null)
        {
            F = new Paint();
            F.setColor(Color.argb(200, 150, 150, 150));
        }
    }

    private String al()
    {
        return (new StringBuilder()).append("(").append(S()).append("x").append(T()).append(")").append("[").append(K()).append(",").append(L()).append("]").toString();
    }

    private void am()
    {
        if (u != null && !u.isRecycled())
        {
            u.recycle();
        }
        u = null;
    }

    private ImageScrapModel an()
        throws JSONException
    {
        return (ImageScrapModel)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(ab(), com/cardinalblue/android/piccollage/model/gson/ImageScrapModel);
    }

    private PointF b(PointF pointf)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i1;
        int j1;
        i1 = S();
        j1 = T();
        if (pointf == null)
        {
            return new PointF(i1 / 2, j1 / 2);
        }
        f1 = (float)(j1 / 2) - pointf.y;
        f2 = pointf.y + (float)(j1 / 2);
        f7 = (float)(i1 / 2) - pointf.x;
        f5 = pointf.x + (float)(i1 / 2);
        f6 = Math.min(Math.min(f1, f2), Math.min(f7, f5));
        f3 = pointf.x;
        f4 = pointf.y;
        if (f6 != f1 || f6 >= 10F) goto _L2; else goto _L1
_L1:
        f1 = j1 / 2;
        f2 = f3;
_L4:
        return new PointF(f2, f1);
_L2:
        if (f6 == f2 && f6 < 10F)
        {
            f1 = -j1 / 2;
            f2 = f3;
        } else
        if (f6 == f7 && f6 < 10F)
        {
            f2 = i1 / 2;
            f1 = f4;
        } else
        {
            f1 = f4;
            f2 = f3;
            if (f6 == f5)
            {
                f1 = f4;
                f2 = f3;
                if (f6 < 10F)
                {
                    f2 = -i1 / 2;
                    f1 = f4;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void b(Context context, boolean flag)
    {
        com.cardinalblue.android.b.k.c.a(context, "HAS_APPLY_ALL", flag);
    }

    private void b(List list)
    {
        am();
        if (list == null || list.isEmpty())
        {
            d = null;
            return;
        }
        d = new c(1.0F);
        d.a(list);
        PointF pointf = d.d();
        PointF pointf1 = d.e();
        if (a(pointf, pointf1))
        {
            list = b((PointF)list.get(list.size() - 1));
            d.lineTo(((PointF) (list)).x, ((PointF) (list)).y);
            pointf = a(pointf, true);
            list = a(pointf1, false);
            if (pointf.equals(list))
            {
                d.lineTo(pointf.x, pointf.y);
            } else
            if (pointf.x == ((PointF) (list)).x || pointf.y == ((PointF) (list)).y)
            {
                d.lineTo(((PointF) (list)).x, ((PointF) (list)).y);
                d.lineTo(pointf.x, pointf.y);
            } else
            {
                d.lineTo(((PointF) (list)).x, ((PointF) (list)).y);
                boolean flag;
                boolean flag1;
                if (pointf.x > 0.0F && pointf.y < 0.0F && ((PointF) (list)).x < 0.0F && ((PointF) (list)).y > 0.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (pointf.x < 0.0F && pointf.y > 0.0F && ((PointF) (list)).x > 0.0F && ((PointF) (list)).y < 0.0F)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag || flag1)
                {
                    list = a(pointf, true);
                } else
                {
                    list = a(list, false);
                }
                d.lineTo(((PointF) (list)).x, ((PointF) (list)).y);
                d.lineTo(pointf.x, pointf.y);
            }
        }
        d.offset(S() / 2, T() / 2);
        d.close();
    }

    private boolean b(Context context)
    {
        return com.cardinalblue.android.b.k.c.b(context, "HAS_SHADOW", false);
    }

    private boolean b(ImageScrapModel imagescrapmodel)
    {
        while (imagescrapmodel == null || !imagescrapmodel.isSticker() && !imagescrapmodel.isBackground() && imagescrapmodel.getBorder() == null) 
        {
            return false;
        }
        return true;
    }

    private int c(Context context)
    {
        return com.cardinalblue.android.b.k.c.b(context, "BORDER_COLOR", -1);
    }

    private void c(ImageScrapModel imagescrapmodel)
    {
        c(imagescrapmodel.getFrameSlotNumber());
        d(imagescrapmodel.getFrameSlotNumber());
        c(imagescrapmodel.getImage().isTile());
        b(imagescrapmodel.getImage().getSourceUrl());
        a(new File(imagescrapmodel.getImage().getDecodedThumbnailUrl()));
        G = (NinePatchDrawable)c.getResources().getDrawable(0x7f0202be);
        if (imagescrapmodel.isSticker() || imagescrapmodel.isBackground())
        {
            h(false);
            a(false);
        } else
        {
            h(imagescrapmodel.getBorder().isHasBorder());
            a(imagescrapmodel.getBorder().getColor());
            a(imagescrapmodel.getBorder().isHasShadow());
        }
        imagescrapmodel = imagescrapmodel.getClippingPath();
        if (imagescrapmodel != null)
        {
            imagescrapmodel.setScrapSize(S(), T());
            imagescrapmodel.normalizePoints();
            b(imagescrapmodel.getScaledClippingPath());
        } else
        {
            b(((List) (null)));
        }
        f();
        J();
    }

    private boolean c(String s1)
    {
        return !TextUtils.isEmpty(s1) && s1.startsWith("assets://stickers/01/");
    }

    private g d(ImageScrapModel imagescrapmodel)
    {
        imagescrapmodel = com.cardinalblue.android.piccollage.view.h.a(c, imagescrapmodel);
        if (m() != null)
        {
            try
            {
                imagescrapmodel.a(b.copy(android.graphics.Bitmap.Config.ARGB_8888, true));
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                com.cardinalblue.android.piccollage.a.f.a(outofmemoryerror);
            }
        }
        imagescrapmodel.a(new File(""));
        return imagescrapmodel;
    }

    private void d(String s1)
    {
        String as[];
        if (e(s1))
        {
            if ((as = s1.split("/")).length >= 2)
            {
                Object obj = as[as.length - 2];
                obj = com.cardinalblue.android.piccollage.controller.o.a().a(((String) (obj)));
                if (obj != null)
                {
                    a(TagModel.newStickerTag(((StickerBundle) (obj)).f(), ((StickerBundle) (obj)).a(), as[as.length - 1]));
                    return;
                } else
                {
                    com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("unexception sticker url : ").append(s1).toString()));
                    return;
                }
            }
        }
    }

    private boolean e(String s1)
    {
        while (TextUtils.isEmpty(s1) || !s1.contains("Bundles") && !s1.contains("stickers")) 
        {
            return false;
        }
        return true;
    }

    private void h(boolean flag)
    {
        if (y == flag)
        {
            return;
        }
        y = flag;
        if (flag)
        {
            e();
        }
        ah();
    }

    public g A()
    {
        Object obj;
        try
        {
            obj = an();
            ((ImageScrapModel) (obj)).setBackground(true);
            obj = d(((ImageScrapModel) (obj)));
        }
        catch (JSONException jsonexception)
        {
            com.cardinalblue.android.piccollage.a.f.a(jsonexception);
            return null;
        }
        return ((g) (obj));
    }

    public pl.droidsonroids.gif.c B()
    {
        return f;
    }

    public boolean C()
    {
        boolean flag1 = com.cardinalblue.android.b.g.b(i());
        boolean flag = flag1;
        if (f != null)
        {
            flag = flag1;
            if (1 == f.d())
            {
                flag = false;
            }
        }
        return flag;
    }

    public BaseScrapModel D()
    {
        return y();
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        if (!aa())
        {
            super.a(f1, f2, f3, f4);
        }
    }

    public void a(int i1)
    {
        B = i1;
        boolean flag;
        if (B != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h(flag);
        if (y)
        {
            e();
        }
    }

    public void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        }
        ClippingPathModel clippingpathmodel = r();
        b = bitmap;
        ag();
        e();
        if (clippingpathmodel != null)
        {
            clippingpathmodel.setScrapSize(S(), T());
            b(clippingpathmodel.getScaledClippingPath());
        } else
        {
            b(((List) (null)));
        }
        f();
        J();
    }

    public void a(Bitmap bitmap, boolean flag)
    {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0)
        {
            return;
        }
        if (flag)
        {
            Bitmap bitmap1 = m();
            float f1;
            float f2;
            if (bitmap1 == null)
            {
                f1 = S();
            } else
            {
                f1 = bitmap1.getWidth();
            }
            if (bitmap1 == null)
            {
                f2 = T();
            } else
            {
                f2 = bitmap1.getHeight();
            }
            j = Math.min(f2 / (float)bitmap.getHeight(), f1 / (float)bitmap.getWidth()) * j;
        }
        a(bitmap);
    }

    public void a(Canvas canvas)
    {
        if (!o && (b != null || f != null) && a != null)
        {
            Rect rect = a;
            if (p)
            {
                ak();
                canvas.drawRect(rect.left, (float)rect.top - E.getTextSize(), rect.left + S(), rect.top, F);
                canvas.drawText(al(), rect.left, rect.top, E);
            }
            if (d != null)
            {
                if (u == null)
                {
                    RectF rectf = com.cardinalblue.android.b.k.a(rect);
                    try
                    {
                        u = com.cardinalblue.android.b.a.a(S(), T(), d, b, rectf);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Canvas canvas)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(canvas);
                        return;
                    }
                }
                if (u == null)
                {
                    com.cardinalblue.android.piccollage.a.f.a(new NullPointerException(String.format("Clipped bitmap (%d x %d) is still null.", new Object[] {
                        Integer.valueOf(S()), Integer.valueOf(T())
                    })));
                    return;
                } else
                {
                    canvas.drawBitmap(u, null, rect, e);
                    return;
                }
            }
            if (!e.b)
            {
                int i1 = S() / 2;
                int j1 = T() / 2;
                canvas.clipRect(-i1, j1, i1, -j1);
            }
            if (ai())
            {
                G.draw(canvas);
            }
            if (f != null)
            {
                f.draw(canvas);
            } else
            if (w())
            {
                canvas.drawBitmap(b, null, rect, D);
            } else
            {
                canvas.drawBitmap(b, null, rect, e);
            }
            if (aj())
            {
                canvas.drawLines(A, C);
                return;
            }
        }
    }

    public final void a(Canvas canvas, float f1, float f2)
    {
        if (!w())
        {
            super.a(canvas, f1, f2);
            return;
        } else
        {
            canvas.concat(new Matrix(s));
            a(canvas);
            return;
        }
    }

    public volatile void a(BaseScrapModel basescrapmodel)
    {
        a((ImageScrapModel)basescrapmodel);
    }

    public void a(ImageScrapModel imagescrapmodel)
    {
        super.a(imagescrapmodel);
        c(imagescrapmodel);
    }

    public void a(File file)
    {
        t = file;
    }

    public void a(String s1)
    {
        if (!TextUtils.isEmpty(s1) && !s1.equals(H))
        {
            a(new File(""));
            b(s1);
        }
    }

    public void a(String s1, String s2, String s3)
    {
        if (s1 != null)
        {
            a(TagModel.newSearchTermTag(s1, s2, s3));
        }
    }

    public void a(List list)
    {
        b(list);
        f();
    }

    public void a(pl.droidsonroids.gif.c c1)
    {
        f = c1;
        f();
        f.setBounds(a);
    }

    public void a(float af[])
    {
        if (!c(af[0], af[1]))
        {
            if (Math.abs(af[0]) > (float)(S() / 2))
            {
                af[0] = Math.copySign(S() / 2, af[0]);
            }
            if (Math.abs(af[1]) > (float)(T() / 2))
            {
                af[1] = Math.copySign(T() / 2, af[1]);
                return;
            }
        }
    }

    public boolean a()
    {
        return d == null;
    }

    public boolean a(float f1, float f2)
    {
        boolean flag2 = true;
        boolean flag = false;
        if (u == null)
        {
            flag = super.a(f1, f2);
        } else
        if (v != null)
        {
            float af[] = new float[2];
            af[0] = f1;
            af[1] = f2;
            l.mapPoints(af, new float[] {
                f1, f2
            });
            int i1 = (int)(af[0] + v.centerX());
            int j1 = (int)(af[1] + v.centerY());
            boolean flag1;
            try
            {
                i1 = u.getPixel(i1, j1);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                return false;
            }
            if (i1 != 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            return flag1;
        }
        return flag;
    }

    public boolean a(PointF pointf, PointF pointf1)
    {
        pointf = a(pointf);
        pointf1 = a(pointf1);
        return pointf != com.cardinalblue.android.piccollage.view.a.a && pointf1 != com.cardinalblue.android.piccollage.view.a.a && pointf != pointf1;
    }

    public boolean a(d d1, int i1, int j1, float f1, float f2)
    {
        i1 = d1.a(f1, f2, i1, j1);
        if (i1 != w)
        {
            if (a(w, i1) && a())
            {
                K.set(true);
            }
            w = -1;
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(boolean flag)
    {
        if (z == flag)
        {
            return false;
        } else
        {
            z = flag;
            ah();
            return true;
        }
    }

    public void b(float f1, float f2)
    {
        float f3 = com.cardinalblue.android.b.k.a(S(), T());
        Matrix matrix = new Matrix();
        float f4 = R();
        matrix.postTranslate(-f1, -f2);
        matrix.postRotate(-f4);
        matrix.postScale(1.0F / f3, 1.0F / f3);
        matrix.invert(s);
    }

    public void b(int i1)
    {
        e.setAlpha(i1);
    }

    public void b(Bitmap bitmap)
    {
        a(bitmap, true);
    }

    public void b(String s1)
    {
        H = s1;
        d(s1);
    }

    public void b(boolean flag)
    {
        I = flag;
    }

    public boolean b()
    {
        return true;
    }

    public void c(int i1)
    {
        if (a(w, i1))
        {
            v();
        }
        w = i1;
    }

    public void c(boolean flag)
    {
        J = flag;
    }

    public boolean c()
    {
        return z;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return z();
    }

    public int d()
    {
        return B;
    }

    public void d(int i1)
    {
        x = i1;
    }

    protected void e()
    {
        if (!y)
        {
            return;
        } else
        {
            C.setColor(B);
            r = (float)Math.min(S(), T()) * 0.01F;
            C.setStrokeWidth(r);
            return;
        }
    }

    protected void f()
    {
        int i1 = S();
        int j1 = T();
        float f1;
        Rect rect;
        if (d == null)
        {
            rect = new Rect(-i1 / 2, -j1 / 2, i1 / 2, j1 / 2);
        } else
        {
            v = new RectF();
            d.computeBounds(v, false);
            int k1 = (int)(-v.centerX());
            int l1 = (int)(-v.centerY());
            rect = new Rect(k1, l1, i1 + k1, j1 + l1);
        }
        a = rect;
        rect = new Rect(rect);
        f1 = r / 2.0F;
        A = (new float[] {
            (float)rect.left - f1, (float)rect.top, (float)rect.right + f1, (float)rect.top, (float)rect.left - f1, (float)rect.bottom, f1 + (float)rect.right, (float)rect.bottom, (float)rect.left, (float)rect.top, 
            (float)rect.left, (float)rect.bottom, (float)rect.right, (float)rect.top, (float)rect.right, (float)rect.bottom
        });
        rect = new Rect(rect);
        a(rect);
        G.setBounds(rect);
    }

    public boolean g()
    {
        return I;
    }

    public boolean h()
    {
        return t != null && t.exists();
    }

    public String i()
    {
        return H;
    }

    public boolean j()
    {
        return J;
    }

    public File k()
    {
        return t;
    }

    public String l()
    {
        return com.cardinalblue.android.piccollage.model.k.c(t.getAbsolutePath());
    }

    public Bitmap m()
    {
        return b;
    }

    public void n()
    {
        if (t != null)
        {
            t.delete();
        }
    }

    public int o()
    {
        if (b != null)
        {
            return b.getWidth();
        } else
        {
            return super.o();
        }
    }

    public int p()
    {
        if (b != null)
        {
            return b.getHeight();
        } else
        {
            return super.p();
        }
    }

    public ArrayList q()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.b();
        }
    }

    public ClippingPathModel r()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return new ClippingPathModel(S(), T(), d);
        }
    }

    public String s()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.toString();
        }
    }

    public int t()
    {
        return w;
    }

    public int u()
    {
        return x;
    }

    public void v()
    {
        K.set(false);
    }

    public boolean w()
    {
        return K.get();
    }

    public void x()
    {
        com.cardinalblue.android.b.a.b(b);
        c = null;
        if (f != null)
        {
            f.a();
        }
    }

    public ImageScrapModel y()
    {
        return ImageScrapModel.newInstance(this);
    }

    public g z()
    {
        g g1;
        try
        {
            g1 = d(an());
        }
        catch (JSONException jsonexception)
        {
            com.cardinalblue.android.piccollage.a.f.a(jsonexception);
            return null;
        }
        return g1;
    }

    static 
    {
        boolean flag;
        if (!com/cardinalblue/android/piccollage/view/g.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}
