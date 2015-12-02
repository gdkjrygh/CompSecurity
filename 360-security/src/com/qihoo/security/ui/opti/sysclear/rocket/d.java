// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear.rocket;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.k;
import com.nineoldandroids.a.m;
import com.nineoldandroids.a.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear.rocket:
//            Star, Stellar

public class d extends Drawable
    implements com.nineoldandroids.a.o.b
{

    protected ArrayList a;
    private Context b;
    private long c;

    public d()
    {
        a = new ArrayList();
        c = 0L;
    }

    public d(Context context)
    {
        a = new ArrayList();
        c = 0L;
        b = context;
    }

    private Stellar c()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            Star star = (Star)iterator.next();
            if (star != null && star.isDied() && (star instanceof Stellar))
            {
                return (Stellar)star;
            }
        }

        return null;
    }

    private Star d()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            Star star = (Star)iterator.next();
            if (star != null && star.isDied() && !(star instanceof Stellar))
            {
                return star;
            }
        }

        return null;
    }

    public Star a(Drawable drawable, float f, float f1, float f2, float f3, int i, float f4, 
            int j)
    {
        Stellar stellar1 = c();
        Stellar stellar = stellar1;
        if (stellar1 == null)
        {
            stellar = new Stellar();
            a.add(stellar);
        }
        f1 = -f1;
        stellar.setAngle(f3);
        stellar.setPx(f);
        stellar.setPy(f1);
        stellar.setScale(f4);
        stellar.setRadius(f2);
        stellar.setAlpha(i);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        stellar.setImage(drawable);
        stellar.setDied(false);
        drawable = k.a(stellar, new m[] {
            m.a("angle", new float[] {
                f3, f3 - 360F
            })
        }).c(j);
        drawable.a(this);
        drawable.a(new LinearInterpolator());
        drawable.b(1);
        drawable.a(-1);
        stellar.setAnimator(drawable);
        return stellar;
    }

    public Star a(Drawable drawable, float f, float f1, float f2, int i, float f3, float f4, 
            float f5, int j)
    {
        Star star1 = d();
        Star star = star1;
        if (star1 == null)
        {
            star = new Star();
            a.add(star);
        }
        star.setX(f);
        star.setY(f1);
        star.setAngle(f2);
        float f7 = -f1;
        float f6 = (float)Math.tan(((double)f2 * 3.1415926535897931D) / 180D);
        float f8 = 0.0F;
        if (f2 % 360F == 0.0F)
        {
            f4 = 0.0F;
            f1 = 0.0F;
            f2 = f7;
        } else
        if (f2 % 180F == 0.0F)
        {
            f1 = 0.0F;
            f2 = f7;
        } else
        if (f2 % 270F == 0.0F)
        {
            f2 = 0.0F;
            f1 = 0.0F;
            f4 = f;
        } else
        if (f2 % 90F == 0.0F)
        {
            f2 = -f5;
            f1 = 0.0F;
            f4 = f;
        } else
        if (f2 % 360F < 90F)
        {
            f4 = 0.0F;
            f1 = f6;
            f2 = f8;
        } else
        if (f2 % 360F < 270F)
        {
            f1 = f6;
            f2 = f8;
        } else
        if (f2 % 360F < 360F)
        {
            f4 = 0.0F;
            f1 = f6;
            f2 = f8;
        } else
        {
            f4 = 0.0F;
            f1 = f6;
            f2 = f8;
        }
        if (f1 != 0.0F)
        {
            f2 = f1 * f4 + (f7 - f6 * f);
        }
        star.setImage(drawable);
        star.setDied(false);
        star.setAlpha(i);
        star.setScale(f3);
        drawable = k.a(star, new m[] {
            m.a("x", new float[] {
                f, f4
            }), m.a("y", new float[] {
                -f7, -f2
            })
        }).c(j);
        drawable.a(this);
        star.setAnimator(drawable);
        return star;
    }

    public ArrayList a()
    {
        return a;
    }

    protected void a(Canvas canvas)
    {
        Object obj = a();
        if (obj != null)
        {
            android.graphics.Rect rect = getBounds();
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Star star = (Star)((Iterator) (obj)).next();
                if (star != null && !star.isDied())
                {
                    star.draw(canvas, rect);
                }
            } while (true);
        }
    }

    public void a(o o)
    {
        long l = System.currentTimeMillis();
        if (l - c > 10L)
        {
            invalidateSelf();
            c = l;
        }
    }

    public void b()
    {
        ArrayList arraylist = a();
        if (arraylist != null)
        {
            Iterator iterator = arraylist.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Star star = (Star)iterator.next();
                if (star != null && !star.isDied())
                {
                    star.getAnimator().b();
                }
            } while (true);
            arraylist.clear();
        }
    }

    public void draw(Canvas canvas)
    {
        a(canvas);
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
