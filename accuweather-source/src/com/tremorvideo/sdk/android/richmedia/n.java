// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.tremorvideo.sdk.android.videoad.aj;
import com.tremorvideo.sdk.android.videoad.ct;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            am, aa, a, c, 
//            ScriptInterpreter, l, ab, i, 
//            z, h

public class n
{
    public static interface a
    {

        public abstract int a();

        public abstract void a(int i1, int j1);

        public abstract void a(i.a a1);

        public abstract void a(String s);

        public abstract int b();

        public abstract boolean c();

        public abstract com.tremorvideo.sdk.android.videoad.bb.a d();
    }


    am a[];
    private long b;
    private z c;
    private a d;
    private aa e;
    private z.b f;
    private aj g;
    private ScriptInterpreter h;
    private h i;
    private ab j;
    private boolean k;

    public n(a a1, com.tremorvideo.sdk.android.richmedia.a a2, Context context, boolean flag)
    {
        a = new am[0];
        k = false;
        k = flag;
        d = a1;
        e = new aa();
        e.f = a2.p().a();
        g = null;
        h = new ScriptInterpreter(context);
        h.load(this, a2);
    }

    private float a(l l1, l l2)
    {
        float f5 = l1.a;
        float f6 = l1.f / 2.0F;
        float f1 = l1.b;
        float f2 = l1.g / 2.0F;
        float f7 = l2.a;
        float f8 = l2.f / 2.0F;
        float f3 = l2.b;
        float f4 = l2.g / 2.0F;
        f5 = (f5 + f6) - (f7 + f8);
        f1 = (f1 + f2) - (f3 + f4);
        return (float)Math.sqrt(f5 * f5 + f1 * f1);
    }

    private ab a(ab ab1)
    {
        if (!k)
        {
            return null;
        }
        if (ab1 == null)
        {
            return null;
        }
        int i1 = ab1.b().a(i.c.d).a();
        for (ab1 = c.d().iterator(); ab1.hasNext();)
        {
            ab ab2 = (ab)ab1.next();
            i.a a1 = ab2.b().a(i.c.d);
            if (a1 != null && a1.a() == i1)
            {
                return ab2;
            }
        }

        return null;
    }

    private boolean b(l l1, l l2)
    {
        float f1 = l1.a;
        float f2 = l1.f / 2.0F;
        float f3 = l1.b;
        float f4 = l1.g / 2.0F;
        float f5 = l2.a;
        float f6 = l2.f / 2.0F;
        float f7 = l2.b;
        float f8 = l2.g / 2.0F;
        return Math.abs((f1 + f2) - (f5 + f6)) > Math.abs((f3 + f4) - (f7 + f8));
    }

    private ab n()
    {
        Object obj;
        Object obj2;
        Iterator iterator;
        obj2 = null;
        if (!k)
        {
            return null;
        }
        iterator = c.d().iterator();
        obj = null;
_L2:
        Object obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ab ab1 = (ab)iterator.next();
        obj1 = ab1.b().a(i.c.d);
        if (obj1 == null || ((i.a) (obj1)).c() == i.b.u)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ab1.b(e, 0L);
        if (((l) (obj1)).f == 0.0F || ((l) (obj1)).g == 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null)
        {
            obj = obj1;
            obj1 = ab1;
        } else
        if (((l) (obj1)).b == ((l) (obj2)).b)
        {
            if (((l) (obj1)).a >= ((l) (obj2)).a)
            {
                break MISSING_BLOCK_LABEL_174;
            }
            obj = obj1;
            obj1 = ab1;
        } else
        {
            if (((l) (obj1)).b >= ((l) (obj2)).b)
            {
                break MISSING_BLOCK_LABEL_174;
            }
            obj = obj1;
            obj1 = ab1;
        }
_L3:
        obj2 = obj;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        return ((ab) (obj));
        obj1 = obj;
        obj = obj2;
          goto _L3
    }

    public l a(ab ab1, long l1)
    {
        ab1 = ab1.b(e, l1);
        ab1.a = ((l) (ab1)).a + e.d() / 2.0F;
        ab1.b = ((l) (ab1)).b + e.e() / 2.0F;
        return ab1;
    }

    public void a()
    {
        h.destroy();
    }

    public void a(int i1, int j1)
    {
        d.a(i1, j1);
    }

    public void a(int i1, int j1, int k1)
    {
        c.f().a(new GregorianCalendar(i1, j1, k1));
    }

    public void a(long l1)
    {
        try
        {
            if (c != null)
            {
                if (i != null)
                {
                    i.a(l1);
                }
                if (f == z.b.a)
                {
                    c.a(this, l1);
                    b = b + l1;
                    if (b >= c.c())
                    {
                        b = 0L;
                        a(i.c.g);
                    }
                }
            }
            return;
        }
        catch (Exception exception)
        {
            exception.getMessage();
        }
    }

    public void a(Canvas canvas)
    {
        byte byte1 = 2;
        byte byte0 = 0;
        Object obj = d.d();
        if (obj != com.tremorvideo.sdk.android.videoad.bb.a.e && obj != com.tremorvideo.sdk.android.videoad.bb.a.f)
        {
            Bitmap bitmap = c.f().b();
            int i2 = bitmap.getWidth();
            int j2 = bitmap.getHeight();
            Paint paint;
            int i1;
            int j1;
            int k1;
            int l1;
            if (obj == com.tremorvideo.sdk.android.videoad.bb.a.a)
            {
                l1 = canvas.getWidth() / 2 - (i2 + 4);
                i1 = -4;
                k1 = canvas.getHeight() / -2 + 2;
                j1 = -10;
                byte0 = 14;
            } else
            if (obj == com.tremorvideo.sdk.android.videoad.bb.a.b)
            {
                l1 = canvas.getWidth() / -2 + 4;
                i1 = -14;
                k1 = canvas.getHeight() / -2 + 2;
                j1 = -10;
                byte0 = 4;
            } else
            if (obj == com.tremorvideo.sdk.android.videoad.bb.a.d)
            {
                l1 = canvas.getWidth() / -2 + 4;
                i1 = -14;
                k1 = canvas.getHeight() / 2 - (j2 + 2);
                j1 = -2;
                byte1 = 12;
                byte0 = 4;
            } else
            if (obj == com.tremorvideo.sdk.android.videoad.bb.a.c)
            {
                l1 = canvas.getWidth() / 2 - (i2 + 4);
                i1 = -4;
                k1 = canvas.getHeight() / 2 - (j2 + 2);
                j1 = -2;
                byte1 = 12;
                byte0 = 14;
            } else
            {
                byte1 = 0;
                i1 = 0;
                j1 = 0;
                k1 = 0;
                l1 = 0;
            }
            obj = new RectF();
            obj.left = i1 + l1;
            obj.top = k1 + j1;
            obj.right = byte0 + (l1 + i2);
            obj.bottom = byte1 + (k1 + j2);
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.argb(179, 255, 255, 255));
            canvas.drawRoundRect(((RectF) (obj)), 10, 10, paint);
            canvas.drawBitmap(bitmap, l1, k1, null);
        }
    }

    public void a(i.a a1)
    {
        if (a1 != null && a1.d() != null)
        {
            h.callFunction(a1.d());
        }
    }

    public void a(i.c c1)
    {
        c1 = c.a(c1);
        if (c1 != null)
        {
            d.a(c1);
        }
    }

    public void a(z.b b1)
    {
        f = b1;
    }

    public void a(z z1)
    {
        b = 0L;
        c = z1;
        f = z1.e();
        c.b();
        if (z1.g() != -1)
        {
            i = new h(c.a(z1.g()));
        } else
        {
            i = null;
        }
        j = a(j);
        a(i.c.f);
    }

    public void a(aj aj1)
    {
        g = aj1;
    }

    public void a(String s)
    {
        c.f().a(s);
    }

    public void a(JSONObject jsonobject)
    {
        ArrayList arraylist;
        if (jsonobject == null)
        {
            c.f().a(null);
            return;
        }
        arraylist = new ArrayList();
        SimpleDateFormat simpledateformat;
        SimpleDateFormat simpledateformat1;
        JSONArray jsonarray;
        StringBuilder stringbuilder;
        ArrayList arraylist1;
        simpledateformat = new SimpleDateFormat("h:mma");
        simpledateformat1 = new SimpleDateFormat("hh:mm:ss");
        jsonarray = jsonobject.getJSONObject("theatresAndShowtimesByMovie").getJSONArray("theatres");
        stringbuilder = new StringBuilder();
        arraylist1 = new ArrayList();
        int i1;
        i1 = 0;
        jsonobject = null;
_L12:
        if (i1 >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        arraylist1.clear();
        JSONObject jsonobject1 = jsonobject;
        Object obj = jsonarray.getJSONObject(i1);
        jsonobject1 = jsonobject;
        stringbuilder.setLength(0);
        jsonobject1 = jsonobject;
        stringbuilder.append(((JSONObject) (obj)).getString("theatreName"));
        jsonobject1 = jsonobject;
        stringbuilder.append(":  ");
        jsonobject1 = jsonobject;
        arraylist1.add(new am(stringbuilder.toString(), am.a.b));
        jsonobject1 = jsonobject;
        Object obj2 = ((JSONObject) (obj)).getJSONArray("theatreDays");
        jsonobject1 = jsonobject;
        Object obj1 = ((JSONArray) (obj2)).getJSONObject(0).getJSONArray("movies");
        jsonobject1 = jsonobject;
        obj = ((JSONArray) (obj1)).getJSONObject(0).getJSONArray("showtimes");
        jsonobject1 = jsonobject;
        obj1 = ((JSONArray) (obj1)).getJSONObject(0).getJSONArray("ticketAffiliates").getJSONObject(0).getJSONObject("ticketOffer").getString("purchaseURI");
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        jsonobject1 = jsonobject;
        String as[];
        int j1;
        try
        {
            throw new Exception("No purchase URL found");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject = jsonobject1;
        }
          goto _L5
_L4:
        jsonobject1 = jsonobject;
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        jsonobject1 = jsonobject;
        as = ((JSONArray) (obj2)).getJSONObject(0).getString("day").split("-");
        jsonobject1 = jsonobject;
        as = new GregorianCalendar(Integer.valueOf(as[0]).intValue(), Integer.valueOf(as[1]).intValue() - 1, Integer.valueOf(as[2]).intValue());
        jsonobject1 = jsonobject;
        jsonobject = (new SimpleDateFormat("EEEE, MMMM d")).format(as.getTime());
        jsonobject1 = jsonobject;
        arraylist1.add(new am((new StringBuilder()).append(jsonobject).append("  ||  ").toString(), am.a.a));
        jsonobject1 = jsonobject;
        j1 = 0;
_L6:
        if (j1 >= ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_546;
        }
        jsonobject = ((JSONArray) (obj)).getJSONObject(j1).getString("datetime").split("T")[1];
        as = simpledateformat1.parse(jsonobject);
        stringbuilder.setLength(0);
        stringbuilder.append(simpledateformat.format(as));
        if (j1 >= ((JSONArray) (obj)).length() - 1)
        {
            break MISSING_BLOCK_LABEL_534;
        }
        stringbuilder.append(", ");
_L7:
        arraylist1.add(new am(stringbuilder.toString(), (new StringBuilder()).append(((String) (obj1))).append("+").append(jsonobject).toString(), am.a.c));
        j1++;
          goto _L6
        stringbuilder.append(" ");
          goto _L7
        if (i1 < jsonarray.length() - 1)
        {
            arraylist1.add(new am("  |  ", am.a.a));
        }
        obj = arraylist1.iterator();
_L8:
        jsonobject = jsonobject1;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add((am)((Iterator) (obj)).next());
        if (true) goto _L8; else goto _L5
_L2:
        a = new am[arraylist.size()];
        i1 = 0;
_L10:
        if (i1 >= a.length)
        {
            break; /* Loop/switch isn't completed */
        }
        a[i1] = (am)arraylist.get(i1);
        i1++;
        if (true) goto _L10; else goto _L9
_L9:
        try
        {
            c.f().a(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            ct.a(jsonobject);
        }
        return;
_L5:
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
        jsonobject;
        jsonobject = jsonobject1;
          goto _L5
    }

    public RectF b(int i1, int j1)
    {
        byte byte0 = 2;
        int k1 = 0;
        Object obj = d.d();
        Bitmap bitmap = c.f().b();
        int j2 = bitmap.getWidth();
        int k2 = bitmap.getHeight();
        int l1;
        int i2;
        if (obj == com.tremorvideo.sdk.android.videoad.bb.a.a)
        {
            i2 = i1 / 2 - (j2 + 4);
            i1 = -4;
            l1 = j1 / -2 + 2;
            k1 = -10;
            j1 = i1;
            i1 = 14;
        } else
        if (obj == com.tremorvideo.sdk.android.videoad.bb.a.b)
        {
            i2 = i1 / -2 + 4;
            i1 = -14;
            l1 = j1 / -2 + 2;
            k1 = -10;
            j1 = i1;
            i1 = 4;
        } else
        if (obj == com.tremorvideo.sdk.android.videoad.bb.a.d)
        {
            i2 = i1 / -2 + 4;
            i1 = -14;
            l1 = (j1 / 2 - k2) + 2;
            k1 = -2;
            byte0 = 12;
            j1 = i1;
            i1 = 4;
        } else
        if (obj == com.tremorvideo.sdk.android.videoad.bb.a.c)
        {
            i2 = i1 / 2 - (j2 + 4);
            i1 = -4;
            l1 = j1 / 2 - (k2 + 2);
            k1 = -2;
            byte0 = 12;
            j1 = i1;
            i1 = 14;
        } else
        {
            byte0 = 0;
            j1 = 0;
            boolean flag = false;
            l1 = 0;
            i2 = 0;
            i1 = k1;
            k1 = ((flag) ? 1 : 0);
        }
        obj = new RectF();
        obj.left = j1 + i2;
        obj.top = l1 + k1;
        obj.right = i1 + (i2 + j2);
        obj.bottom = byte0 + (l1 + k2);
        obj.left = ((RectF) (obj)).left - 15F;
        obj.right = ((RectF) (obj)).right + 15F;
        obj.top = ((RectF) (obj)).top - 15F;
        obj.bottom = ((RectF) (obj)).bottom + 15F;
        return ((RectF) (obj));
    }

    public z b()
    {
        return c;
    }

    public void b(long l1)
    {
        b = l1;
        if (b == c.c())
        {
            a(i.c.g);
        }
    }

    public void b(Canvas canvas)
    {
        if (c != null)
        {
            canvas.save();
            e.a(d, canvas, c.f().j(), c.f().k());
            e.g = d.c();
            c.c(e, b, i);
            a(canvas);
            if (i != null)
            {
                i.a(e);
            }
            if (j != null)
            {
                Object obj = j.b(e, b);
                RectF rectf = new RectF();
                rectf.left = ((l) (obj)).a - 10F;
                rectf.right = ((l) (obj)).a + ((l) (obj)).f + 10F;
                rectf.top = ((l) (obj)).b - 10F;
                float f1 = ((l) (obj)).b;
                rectf.bottom = ((l) (obj)).g + f1 + 10F;
                obj = new Paint();
                ((Paint) (obj)).setColor(Color.argb(128, 20, 20, 200));
                ((Paint) (obj)).setStrokeWidth(5F);
                ((Paint) (obj)).setStyle(android.graphics.Paint.Style.STROKE);
                canvas.drawRoundRect(rectf, 5F, 5F, ((Paint) (obj)));
                ((Paint) (obj)).setColor(Color.argb(128, 200, 200, 255));
                ((Paint) (obj)).setStrokeWidth(1.0F);
                ((Paint) (obj)).setStyle(android.graphics.Paint.Style.STROKE);
                canvas.drawRoundRect(rectf, 5F, 5F, ((Paint) (obj)));
            }
            canvas.restore();
        }
    }

    public void b(i.a a1)
    {
        if (a1 != null)
        {
            d.a(a1);
        }
    }

    public void b(String s)
    {
        d.a(s);
    }

    public void c()
    {
        Iterator iterator = c.d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            i.a a1 = ((ab)iterator.next()).b().a(i.c.d);
            if (a1 != null && a1.c() == i.b.u)
            {
                d.a(a1);
            }
        } while (true);
    }

    public void c(int i1, int j1)
    {
        i.a a1 = c.a(e, i1, j1, b);
        boolean flag = false;
        if (a1 != null)
        {
            d.a(a1);
            flag = true;
        }
        boolean flag1 = flag;
        if (i != null)
        {
            flag1 = flag;
            if (i.c(e, i1, j1))
            {
                i.a(e, i1, j1, b);
                i.a = true;
                flag1 = true;
            }
        }
        if (!flag1)
        {
            com.tremorvideo.sdk.android.videoad.bb.a a2 = d.d();
            if (a2 != com.tremorvideo.sdk.android.videoad.bb.a.e && a2 != com.tremorvideo.sdk.android.videoad.bb.a.f && b((int)e.d(), (int)e.e()).contains(i1, j1))
            {
                d.a("adchoices");
            }
        }
    }

    public void c(Canvas canvas)
    {
        if (c != null)
        {
            canvas.save();
            e.a(d, canvas, c.f().j(), c.f().k());
            e.g = d.c();
            c.b(e, b, i);
            canvas.restore();
        }
    }

    public void d()
    {
        if (j == null)
        {
            return;
        }
        i.a a1 = j.g();
        if (a1 != null)
        {
            d.a(a1);
            return;
        } else
        {
            i.a a2 = j.a(true);
            d.a(a2);
            return;
        }
    }

    public void d(int i1, int j1)
    {
        if (i != null && i.a)
        {
            i.a(e, i1, j1);
            i.a a1 = c.b(e, i1, j1, b);
            if (a1 != null)
            {
                d.a(a1);
            }
        }
    }

    public void e()
    {
        if (j == null)
        {
            j = n();
        } else
        {
            l l1 = j.b(e, b);
            ab ab1 = null;
            float f1 = 3.402823E+38F;
            Iterator iterator = c.d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ab ab2 = (ab)iterator.next();
                if (ab2.d() && ab2 != j)
                {
                    l l2 = ab2.b(e, 0L);
                    if (l2.f != 0.0F && l2.g != 0.0F && (l2.a < l1.a && b(l2, l1)))
                    {
                        float f2 = a(l1, l2);
                        if (ab1 == null)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        } else
                        if (f2 < f1)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        }
                    }
                }
            } while (true);
            if (ab1 != null)
            {
                j = ab1;
                return;
            }
        }
    }

    public void e(int i1, int j1)
    {
        i.a a1 = c.d(e, i1, j1, b);
        if (a1 != null)
        {
            d.a(a1);
        }
        if (i != null && i.a)
        {
            i.b(e, i1, j1);
            i.a = false;
            if (a1 == null)
            {
                i.a a2 = c.c(e, i1, j1, b);
                if (a2 != null)
                {
                    d.a(a2);
                }
            }
        }
    }

    public void f()
    {
        if (j == null)
        {
            j = n();
        } else
        {
            l l1 = j.b(e, b);
            ab ab1 = null;
            float f1 = 3.402823E+38F;
            Iterator iterator = c.d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ab ab2 = (ab)iterator.next();
                if (ab2.d() && ab2 != j)
                {
                    l l2 = ab2.b(e, 0L);
                    if (l2.f != 0.0F && l2.g != 0.0F && (l2.a > l1.a && b(l2, l1)))
                    {
                        float f2 = a(l1, l2);
                        if (ab1 == null)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        } else
                        if (f2 < f1)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        }
                    }
                }
            } while (true);
            if (ab1 != null)
            {
                j = ab1;
                return;
            }
        }
    }

    public void g()
    {
        if (j == null)
        {
            j = n();
        } else
        {
            l l1 = j.b(e, b);
            ab ab1 = null;
            float f1 = 3.402823E+38F;
            Iterator iterator = c.d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ab ab2 = (ab)iterator.next();
                if (ab2.d() && ab2 != j)
                {
                    l l2 = ab2.b(e, 0L);
                    if (l2.f != 0.0F && l2.g != 0.0F && (l2.b < l1.b && !b(l2, l1)))
                    {
                        float f2 = a(l1, l2);
                        if (ab1 == null)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        } else
                        if (f2 < f1)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        }
                    }
                }
            } while (true);
            if (ab1 != null)
            {
                j = ab1;
                return;
            }
        }
    }

    public void h()
    {
        if (j == null)
        {
            j = n();
        } else
        {
            l l1 = j.b(e, b);
            ab ab1 = null;
            float f1 = 3.402823E+38F;
            Iterator iterator = c.d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ab ab2 = (ab)iterator.next();
                if (ab2.d() && ab2 != j)
                {
                    l l2 = ab2.b(e, 0L);
                    if (l2.f != 0.0F && l2.g != 0.0F && (l2.b > l1.b && !b(l2, l1)))
                    {
                        float f2 = a(l1, l2);
                        if (ab1 == null)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        } else
                        if (f2 < f1)
                        {
                            ab1 = ab2;
                            f1 = f2;
                        }
                    }
                }
            } while (true);
            if (ab1 != null)
            {
                j = ab1;
                return;
            }
        }
    }

    public long i()
    {
        return b;
    }

    public void j()
    {
        if (i != null)
        {
            i.a();
        }
        for (Iterator iterator = c.d().iterator(); iterator.hasNext(); ((ab)iterator.next()).i()) { }
    }

    public void k()
    {
        i.a a1 = c.a(i.c.i);
        if (a1 != null)
        {
            d.a(a1);
        }
    }

    public boolean l()
    {
        return h.scriptLoaded;
    }

    public void m()
    {
        if (g != null)
        {
            g.o();
        }
    }
}
