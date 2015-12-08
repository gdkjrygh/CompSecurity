// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.kik.scan.GroupKikCode;
import com.kik.scan.KikCode;
import com.kik.scan.RemoteKikCode;
import com.kik.scan.UsernameKikCode;
import kik.android.util.bx;

// Referenced classes of package kik.android.widget:
//            KikCodeBackgroundImageView

public class KikCodeImageView extends KikCodeBackgroundImageView
{

    float b;
    private Bitmap c;
    private Paint d;
    private Paint e;
    private final float f = 0.32F;
    private final float g = 0.425F;
    private final float h = 0.95F;
    private final float i = 0.1F;
    private int j;
    private int k;
    private KikCode l;
    private byte m[];
    private int n;
    private byte o[];
    private Drawable p;
    private AnimationDrawable q;

    public KikCodeImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = 6;
        k = 8;
        n = 1;
        o = new byte[4];
        d = new Paint(1);
        d.setAntiAlias(true);
        d.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        e = new Paint(1);
        e.setAntiAlias(true);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setARGB(255, 255, 255, 255);
        e.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        p = getResources().getDrawable(0x7f0201b0);
        q = (AnimationDrawable)getResources().getDrawable(0x7f070080);
    }

    private void a(int i1)
    {
        if (l == null)
        {
            return;
        }
        if (l instanceof RemoteKikCode)
        {
            l = new RemoteKikCode(((RemoteKikCode)l).getPayloadId(), i1);
            a(l.encode());
        } else
        if (l instanceof UsernameKikCode)
        {
            UsernameKikCode usernamekikcode = (UsernameKikCode)l;
            l = new UsernameKikCode(usernamekikcode.getUsername(), usernamekikcode.getNonce(), i1);
            a(l.encode());
        } else
        if (l instanceof GroupKikCode)
        {
            l = new GroupKikCode(((GroupKikCode)l).getInviteCode(), i1);
            a(l.encode());
        } else
        {
            bx.d(new IllegalArgumentException("Code format unaccounted for! Unable to update view"));
        }
        invalidate();
    }

    public void a(KikCode kikcode)
    {
        l = kikcode;
    }

    public final void a(byte abyte0[])
    {
        if (abyte0 != null)
        {
            m = new byte[39];
            for (int i1 = 0; i1 < o.length; i1++)
            {
                m[i1] = o[i1];
            }

            for (int j1 = 4; j1 < abyte0.length + 4; j1++)
            {
                m[j1] = abyte0[j1 - 4];
            }

            invalidate();
            return;
        } else
        {
            m = null;
            return;
        }
    }

    public final byte[] a()
    {
        if (l instanceof RemoteKikCode)
        {
            return ((RemoteKikCode)l).encode();
        }
        if (l instanceof UsernameKikCode)
        {
            return ((UsernameKikCode)l).encode();
        }
        if (l instanceof GroupKikCode)
        {
            return ((GroupKikCode)l).encode();
        } else
        {
            return new byte[35];
        }
    }

    public final void b()
    {
        if (l == null)
        {
            return;
        } else
        {
            a((l.getColour() + 1) % kik.android.chat.b.a.a.values().length);
            return;
        }
    }

    public final void b(byte abyte0[])
    {
        if (o.length <= 4)
        {
            o = abyte0;
            return;
        } else
        {
            o = new byte[4];
            return;
        }
    }

    public final void c()
    {
        a(0);
    }

    public final KikCode d()
    {
        return l;
    }

    public final Bitmap e()
    {
        if (c == null)
        {
            Bitmap bitmap = Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            draw(new Canvas(bitmap));
            int i1 = getHeight() / 2;
            int j1 = Math.min(getHeight(), getWidth()) / 2;
            c = Bitmap.createBitmap(bitmap, 0, i1 - j1, j1 * 2, j1 * 2);
        }
        return c;
    }

    public final float f()
    {
        return b;
    }

    public void invalidate()
    {
        c = null;
        super.invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i1 = getWidth();
        int j1 = getHeight();
        float f4 = (float)i1 / 2.0F;
        float f5 = (float)j1 / 2.0F;
        float f1;
        if (i1 >= j1)
        {
            i1 = j1;
        }
        b = (float)i1 / 2.0F;
        f1 = (float)((double)b * 0.93000000000000005D);
        if (m != null)
        {
            float f6 = f1 * 0.32F;
            float f7 = f1 * 0.425F;
            float f8 = (f1 * 0.95F - f7) / (float)j;
            float f9 = (3F * f8) / 4F;
            e.setStrokeWidth(f9);
            d.setARGB(255, 255, 255, 255);
            int l1 = 0;
            int k1;
            for (j1 = 0; l1 < j; j1 = k1)
            {
                float f3 = (float)l1 * f8 + f7;
                float f2 = f3;
                if (l1 == 0)
                {
                    f2 = f3 - f6 / 10F;
                }
                int k2 = k * l1 + 32;
                double d3 = 6.2831853071795862D / (double)k2;
                f2 += f8 / 2.0F;
                i1 = 0;
                double d1 = 0.0D;
                int i2 = 0;
                k1 = j1;
                while (i2 < k2) 
                {
                    double d2 = (double)i2 * d3 - 1.5707963267948966D;
                    boolean flag;
                    if ((1 << k1 % 8 & m[k1 / 8]) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        if (i1 == 0)
                        {
                            d1 = d2;
                        }
                        int j2 = i1 + 1;
                        i1 = ((k1 - j1) + 1) % k2 + j1;
                        boolean flag1;
                        if ((m[i1 / 8] & 1 << i1 % 8) != 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        flag1 = flag;
                        i1 = j2;
                        if (i2 + 1 == k2)
                        {
                            flag1 = flag;
                            i1 = j2;
                            if (flag)
                            {
                                i1 = j2 + 1;
                                flag1 = false;
                            }
                        }
                        if (!flag1)
                        {
                            if (i1 > 1)
                            {
                                canvas.drawArc(new RectF(f4 - f2, f5 - f2, f4 + f2, f5 + f2), (float)Math.toDegrees(d1), (float)Math.toDegrees((double)(i1 - 1) * d3), false, e);
                            } else
                            {
                                double d4 = f4;
                                double d5 = f2;
                                double d6 = Math.cos(d2);
                                double d7 = f5;
                                double d8 = f2;
                                d2 = Math.sin(d2);
                                canvas.drawCircle((float)(d4 + d5 * d6), (float)(d2 * d8 + d7), f9 / 2.0F, d);
                            }
                            i1 = 0;
                        }
                    }
                    k1++;
                    i2++;
                }
                l1++;
            }

            p.setBounds((int)(f4 - f6), (int)(f5 - f6), (int)(f4 + f6), (int)(f5 + f6));
            p.draw(canvas);
        }
    }
}
