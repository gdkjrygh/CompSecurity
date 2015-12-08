// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p.df.a;

// Referenced classes of package com.pandora.android.daydream:
//            LightshowView

public class LightshowRenderer extends Thread
{
    private static class Sprite
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Sprite a(Parcel parcel)
            {
                return new Sprite(parcel);
            }

            public Sprite[] a(int l)
            {
                return new Sprite[l];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int l)
            {
                return a(l);
            }

        };
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public double f;
        public float g;
        public float h;
        public int i;
        public int j;
        public int k;
        public int l;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeFloat(a);
            parcel.writeFloat(b);
            parcel.writeFloat(e);
            parcel.writeDouble(f);
            parcel.writeFloat(g);
            parcel.writeFloat(h);
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            parcel.writeInt(l);
        }


        public Sprite()
        {
        }

        public Sprite(Parcel parcel)
        {
            a = parcel.readFloat();
            b = parcel.readFloat();
            e = parcel.readFloat();
            f = parcel.readDouble();
            g = parcel.readFloat();
            h = parcel.readFloat();
            i = parcel.readInt();
            j = parcel.readInt();
            k = parcel.readInt();
            l = parcel.readInt();
        }
    }

    public static class State
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public State a(Parcel parcel)
            {
                return new State(parcel);
            }

            public State[] a(int l)
            {
                return new State[l];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int l)
            {
                return a(l);
            }

        };
        public float a;
        public float b;
        public ArrayList c;
        private Bitmap d;

        static Bitmap a(State state)
        {
            return state.d;
        }

        static Bitmap a(State state, Bitmap bitmap)
        {
            state.d = bitmap;
            return bitmap;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int l)
        {
            parcel.writeFloat(a);
            parcel.writeFloat(b);
            parcel.writeTypedList(c);
            parcel.writeParcelable(d, 0);
        }


        public State()
        {
        }

        public State(Parcel parcel)
        {
            a = parcel.readFloat();
            b = parcel.readFloat();
            c = new ArrayList();
            parcel.readTypedList(c, Sprite.CREATOR);
        }
    }


    LightshowView a;
    private Resources b;
    private volatile boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private ArrayList h;
    private Bitmap i;
    private Paint j;
    private Paint k;

    public LightshowRenderer(LightshowView lightshowview)
    {
        d = 0;
        a = lightshowview;
        c = false;
        b = a.getResources();
        g = b.getColor(0x7f0b0046);
    }

    private int a(int l, int i1)
    {
        return (int)(Math.random() * (double)(l - i1)) + i1;
    }

    private Sprite a(float f1, float f2)
    {
        Sprite sprite;
        int l;
        sprite = new Sprite();
        sprite.a = f1;
        sprite.b = f2;
        l = a(100, 0);
        if (l < 0 || l >= 20) goto _L2; else goto _L1
_L1:
        if (l < 10)
        {
            sprite.l = b.getColor(0x7f0b004b);
        } else
        {
            sprite.l = b.getColor(0x7f0b0049);
        }
        sprite.h = a((int)b.getDimension(0x7f0900d2), (int)b.getDimension(0x7f0900d3));
        sprite.d = b(0.6F, 0.18F);
_L4:
        sprite.g = sprite.h;
        sprite.k = (int)((float)sprite.i * 0.4F);
        sprite.f = b(0.06F, 0.018F);
        sprite.c = b(6.283185F, 0.0F);
        sprite.e = b(3.141593F, 0.0F);
        return sprite;
_L2:
        if (l >= 20 && l < 40)
        {
            if (l < 30)
            {
                sprite.l = b.getColor(0x7f0b004d);
            } else
            {
                sprite.l = b.getColor(0x7f0b004c);
            }
            sprite.h = a((int)b.getDimension(0x7f0900d4), (int)b.getDimension(0x7f0900d5));
            sprite.d = b(0.75F, 0.3F);
            continue; /* Loop/switch isn't completed */
        }
        if (l >= 60)
        {
            break; /* Loop/switch isn't completed */
        }
        sprite.l = b.getColor(0x7f0b0047);
_L5:
        sprite.h = a((int)b.getDimension(0x7f0900d6), (int)b.getDimension(0x7f0900d7));
        sprite.d = b(1.02F, 0.3F);
        if (true) goto _L4; else goto _L3
_L3:
        if (l < 80)
        {
            sprite.l = b.getColor(0x7f0b004a);
        } else
        {
            sprite.l = b.getColor(0x7f0b0048);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void a(Canvas canvas)
    {
        canvas.drawBitmap(i, 0.0F, 0.0F, j);
        for (int l = 0; l < h.size(); l++)
        {
            Sprite sprite = (Sprite)h.get(l);
            int k1 = sprite.i;
            int j1 = sprite.j + k1;
            Paint paint = k;
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = 0;
            }
            paint.setAlpha(i1);
            k.setColor(sprite.l);
            canvas.drawCircle(sprite.a, sprite.b, sprite.g, k);
            canvas.drawCircle(sprite.a, sprite.b, sprite.g * 0.6F, k);
            k.setAlpha(k1);
        }

    }

    private void a(Sprite sprite)
    {
        int l;
        int i1;
        l = e;
        i1 = f;
        sprite.c = (float)Math.toRadians(a(160, 20));
        d;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 88
    //                   1 132
    //                   2 178
    //                   3 224;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        d = d + 1;
        if (d > 3)
        {
            d = 0;
        }
        return;
_L2:
        sprite.a = -sprite.h;
        sprite.b = a((int)((float)i1 * 0.8F), (int)((float)i1 * 0.2F));
        sprite.c = sprite.c - 90F;
        continue; /* Loop/switch isn't completed */
_L3:
        sprite.a = a((int)((float)l * 0.8F), (int)((float)l * 0.2F));
        sprite.b = (float)i1 + sprite.h;
        sprite.c = sprite.c + 180F;
        continue; /* Loop/switch isn't completed */
_L4:
        sprite.a = (float)l + sprite.h;
        sprite.b = a((int)((float)i1 * 0.8F), (int)((float)i1 * 0.2F));
        sprite.c = sprite.c + 90F;
        continue; /* Loop/switch isn't completed */
_L5:
        sprite.a = a((int)((float)l * 0.8F), (int)((float)l * 0.2F));
        sprite.b = -sprite.h;
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void a(ArrayList arraylist, float f1)
    {
        int l = 0;
        int i1 = Math.max(e, f);
        int j1 = Math.min(e, f);
        boolean flag;
        if (e < f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        while (l < i1) 
        {
            l = (int)((float)l + (float)a((int)b.getDimension(0x7f0900d8), (int)b.getDimension(0x7f0900d9)) * f1);
            int k1 = a((int)((float)j1 * 0.9F), (int)((float)j1 * 0.1F));
            float f2;
            float f3;
            if (flag)
            {
                f2 = k1;
            } else
            {
                f2 = l;
            }
            if (flag)
            {
                f3 = l;
            } else
            {
                f3 = k1;
            }
            arraylist.add(a(f2, f3));
        }
    }

    private float b(float f1, float f2)
    {
        return (float)(Math.random() * (double)(f1 - f2)) + f2;
    }

    private void b()
    {
        if (h != null)
        {
            return;
        } else
        {
            e = a.getWidth();
            f = a.getHeight();
            h = new ArrayList();
            a(h, 1.0F);
            k = new Paint(1);
            j = new Paint();
            i = d();
            return;
        }
    }

    private void c()
    {
        for (int l = 0; l < h.size(); l++)
        {
            Sprite sprite = (Sprite)h.get(l);
            sprite.a = (float)((double)sprite.a + (double)sprite.d * Math.cos(sprite.c));
            sprite.b = (float)((double)sprite.b + (double)sprite.d * Math.sin(sprite.c));
            if (sprite.a + sprite.g < 0.0F || sprite.a - sprite.g > (float)e || sprite.b + sprite.g < 0.0F || sprite.b - sprite.g > (float)f)
            {
                a(sprite);
            }
            double d1 = Math.sin(sprite.e);
            sprite.g = (float)((double)sprite.h + (double)(sprite.h * 0.1F) * (d1 - 1.0D));
            sprite.j = (int)(d1 * (double)sprite.k - (double)sprite.k);
            sprite.e = (float)((double)sprite.e + sprite.f);
        }

    }

    private Bitmap d()
    {
        Object obj = new ArrayList();
        a(((ArrayList) (obj)), 3F);
        Bitmap bitmap = Bitmap.createBitmap(e, f, android.graphics.Bitmap.Config.ARGB_8888);
        float f1 = (float)e * 0.4F;
        Object obj1 = new RadialGradient(0.0F, 0.0F, f1, 0xff233b57, g, android.graphics.Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setShader(((android.graphics.Shader) (obj1)));
        obj1 = new RadialGradient(e, f, f1, 0xff233b57, g, android.graphics.Shader.TileMode.CLAMP);
        Paint paint1 = new Paint();
        paint1.setDither(true);
        paint1.setShader(((android.graphics.Shader) (obj1)));
        obj1 = new Canvas(bitmap);
        ((Canvas) (obj1)).drawColor(b.getColor(0x7f0b0046));
        ((Canvas) (obj1)).drawCircle(0.0F, 0.0F, f1, paint);
        ((Canvas) (obj1)).drawCircle(e, f, f1, paint1);
        k.setAlpha(10);
        Sprite sprite;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Canvas) (obj1)).drawCircle(sprite.a, sprite.b, sprite.g * 0.6F, k))
        {
            sprite = (Sprite)((Iterator) (obj)).next();
            k.setColor(sprite.l);
            ((Canvas) (obj1)).drawCircle(sprite.a, sprite.b, sprite.g, k);
        }

        return bitmap;
    }

    public State a()
    {
        State state = new State();
        state.a = e;
        state.b = f;
        state.c = h;
        com.pandora.android.daydream.State.a(state, i);
        return state;
    }

    public void a(State state)
    {
        if (state == null)
        {
            return;
        }
        if (state.a != (float)e || state.b != (float)f)
        {
            b();
            return;
        } else
        {
            h = state.c;
            i = com.pandora.android.daydream.State.a(state);
            return;
        }
    }

    protected void a(boolean flag)
    {
        c = flag;
    }

    public void b(State state)
    {
        a(state);
    }

    public void run()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b();
_L5:
        if (!c) goto _L1; else goto _L3
_L3:
        Canvas canvas = null;
        Canvas canvas1 = a.lockCanvas();
        canvas = canvas1;
        LightshowView lightshowview = a;
        canvas = canvas1;
        lightshowview;
        JVM INSTR monitorenter ;
        long l1 = System.currentTimeMillis();
        boolean flag;
        flag = false;
        if (canvas1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        c();
        a(canvas1);
        lightshowview;
        JVM INSTR monitorexit ;
        int l;
        int i1;
        int j1;
        if (canvas1 != null)
        {
            a.unlockCanvasAndPost(canvas1);
        }
        j1 = (int)(33L - (System.currentTimeMillis() - l1));
        l = ((flag) ? 1 : 0);
        i1 = j1;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        l1 = j1;
        sleep(l1);
        i1 = j1;
        l = ((flag) ? 1 : 0);
_L6:
        while (i1 < 0 && l < 5) 
        {
            c();
            i1 += 33;
            l++;
        }
        if (true) goto _L5; else goto _L4
_L4:
          goto _L1
        Exception exception1;
        exception1;
        lightshowview;
        JVM INSTR monitorexit ;
        canvas = canvas1;
        throw exception1;
        Exception exception;
        exception;
        if (canvas != null)
        {
            a.unlockCanvasAndPost(canvas);
        }
        throw exception;
        InterruptedException interruptedexception;
        interruptedexception;
        p.df.a.a("LightshowRenderer", "Sleep Interrupted", interruptedexception);
        l = ((flag) ? 1 : 0);
        i1 = j1;
          goto _L6
    }
}
