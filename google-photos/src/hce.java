// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hce extends aer
    implements ens
{

    final List a = new ArrayList();
    final List b = new ArrayList();
    aes c;
    afn d;
    afn e;
    private final List f = new ArrayList();
    private final RecyclerView g;

    public hce(RecyclerView recyclerview)
    {
        g = recyclerview;
        mk.h(recyclerview);
        super.m = true;
    }

    private static int a(int i)
    {
        char c1 = '\372';
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Unknown phase in SmartItemAnimator.getPhaseDuration()");

        case 1: // '\001'
            c1 = '\u01F4';
            // fall through

        case 0: // '\0'
        case 2: // '\002'
            return c1;
        }
    }

    static void a(hce hce1, hci hci1)
    {
        boolean flag1 = true;
        ViewPropertyAnimator viewpropertyanimator = hci1.a.a.animate().setInterpolator(b.d(hce1.g.getContext()));
        boolean flag;
        if (hci1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            viewpropertyanimator.translationX(hci1.b.intValue());
        }
        if (hci1.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            viewpropertyanimator.translationY(hci1.c.intValue());
        }
        if (hci1.e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            viewpropertyanimator.scaleX(hci1.e.floatValue()).scaleY(hci1.e.floatValue());
        }
        if (hci1.d != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            viewpropertyanimator.alpha(hci1.d.floatValue());
        }
        hce1.b.add(hci1.a);
        viewpropertyanimator.setDuration(a(hci1.a())).setListener(new hcg(hce1, hci1, viewpropertyanimator)).start();
    }

    static void a(hci hci1)
    {
        boolean flag1 = true;
        View view = hci1.a.a;
        boolean flag;
        if (hci1.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.setTranslationX(hci1.b.intValue());
        }
        if (hci1.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.setTranslationY(hci1.c.intValue());
        }
        if (hci1.e != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.setScaleX(hci1.e.floatValue());
            view.setScaleY(hci1.e.floatValue());
        }
        if (hci1.d != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.setAlpha(hci1.d.floatValue());
        }
    }

    private void b(hci hci1)
    {
        a(hci1);
        hci1.b();
    }

    public final void a()
    {
        if (f.isEmpty())
        {
            return;
        }
        if (c != null)
        {
            a(c);
            c = null;
        }
        if (e == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = f.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (((hci)iterator.next()).a != e) goto _L6; else goto _L5
_L5:
        int i = 1;
_L8:
        if (i == 0)
        {
            f.add((new hcj(this, e)).a(0).b(0).b(1.0F));
        }
_L2:
        SparseArray sparsearray = new SparseArray();
        for (Iterator iterator1 = f.iterator(); iterator1.hasNext();)
        {
            hci hci1 = (hci)iterator1.next();
            if (sparsearray.get(hci1.a()) != null)
            {
                ((List)sparsearray.get(hci1.a())).add(hci1);
            } else
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(hci1);
                sparsearray.put(hci1.a(), arraylist);
            }
        }

        int j = 0;
        i = 0;
        while (j < sparsearray.size()) 
        {
            List list = (List)sparsearray.get(sparsearray.keyAt(j));
            int k = ((hci)list.get(0)).a();
            a.add(list);
            hcf hcf1 = new hcf(this, list);
            if (i > 0)
            {
                mk.a(((hci)list.get(0)).a.a, hcf1, i);
            } else
            {
                hcf1.run();
            }
            k = a(k);
            j++;
            i += k;
        }
        f.clear();
        return;
_L4:
        i = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean a(afn afn1)
    {
        c(afn1);
        f.add((new hck(this, afn1)).a(0.0F));
        return true;
    }

    public final boolean a(afn afn1, int i, int j, int k, int l)
    {
        View view = afn1.a;
        i = (int)((float)i + afn1.a.getTranslationX());
        j = (int)((float)j + afn1.a.getTranslationY());
        c(afn1);
        i = k - i;
        j = l - j;
        if (i == 0 && j == 0)
        {
            e(afn1);
            return false;
        }
        float f4 = 0.0F;
        float f3 = 0.0F;
        float f2 = 1.0F;
        float f1 = 1.0F;
        if (view.getTag(c.dR) != null)
        {
            Point point = (Point)view.getTag(c.dR);
            f2 = (float)point.x / (float)view.getWidth();
            f1 = (float)point.y / (float)view.getHeight();
            f3 = (f2 - 1.0F) / 2.0F;
            f4 = (float)view.getWidth() * f3;
            f3 = ((f1 - 1.0F) / 2.0F) * (float)view.getHeight();
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        if ((double)Math.abs(i) > 1.0000000000000001E-05D || (double)Math.abs(f4) > 1.0000000000000001E-05D)
        {
            view.setTranslationX(f4 + (float)(-i));
        }
        if ((double)Math.abs(j) > 1.0000000000000001E-05D || (double)Math.abs(f3) > 1.0000000000000001E-05D)
        {
            view.setTranslationY(f3 + (float)(-j));
        }
        view.setScaleX(f2 * view.getScaleX());
        view.setScaleY(f1 * view.getScaleY());
        if (afn1.equals(d))
        {
            f.add((new hcl(this, afn1)).b(1.0F));
        } else
        {
            f.add((new hcj(this, afn1)).a(0).b(0).b(1.0F));
        }
        return true;
    }

    public final boolean a(afn afn1, afn afn2, int i, int j, int k, int l)
    {
        if (afn1 != null)
        {
            a(afn1, true);
        }
        if (afn2 != null)
        {
            a(afn2, false);
        }
        return false;
    }

    public final boolean a(View view)
    {
        afn afn1 = g.a(view);
        c(afn1);
        float f1 = (float)view.getWidth() / (float)view.getMeasuredWidth();
        if ((double)Math.abs(f1 - 1.0F) > 1.0000000000000001E-05D)
        {
            view.setPivotX(0.0F);
            view.setPivotY(0.0F);
            view.setScaleX(view.getScaleX() * f1);
            view.setScaleY(f1 * view.getScaleY());
            f.add((new hcl(this, afn1)).b(1.0F));
        }
        return true;
    }

    public final boolean b()
    {
        return !f.isEmpty() || !b.isEmpty() || !a.isEmpty();
    }

    public final boolean b(afn afn1)
    {
        c(afn1);
        afn1.a.setAlpha(0.0F);
        f.add((new hch(this, afn1)).a(1.0F));
        return true;
    }

    void c()
    {
        if (!b())
        {
            f();
        }
    }

    public final void c(afn afn1)
    {
        int i;
        View view = afn1.a;
        if (view.getAnimation() != null)
        {
            view.getAnimation().cancel();
        }
        i = f.size() - 1;
_L10:
        if (i < 0) goto _L2; else goto _L1
_L1:
        Object obj = (hci)f.get(i);
        if (((hci) (obj)).a != afn1) goto _L4; else goto _L3
_L3:
        b(((hci) (obj)));
        f.remove(i);
_L2:
        i = a.size() - 1;
_L9:
        int j;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        obj = (List)a.get(i);
        j = ((List) (obj)).size() - 1;
_L11:
        if (j < 0) goto _L6; else goto _L5
_L5:
        hci hci1 = (hci)((List) (obj)).get(j);
        if (hci1.a != afn1) goto _L8; else goto _L7
_L7:
        b(hci1);
        ((List) (obj)).remove(j);
        if (((List) (obj)).isEmpty())
        {
            a.remove(i);
        }
_L6:
        i--;
          goto _L9
_L4:
        i--;
          goto _L10
_L8:
        j--;
          goto _L11
        c();
        return;
          goto _L9
    }

    public final void d()
    {
        for (int i = f.size() - 1; i >= 0; i--)
        {
            b((hci)f.get(i));
        }

        f.clear();
        for (int j = a.size() - 1; j >= 0; j--)
        {
            List list = (List)a.get(j);
            for (int l = list.size() - 1; l >= 0; l--)
            {
                b((hci)list.get(l));
            }

        }

        a.clear();
        List list1 = b;
        for (int k = list1.size() - 1; k >= 0; k--)
        {
            if (((afn)list1.get(k)).a.getAnimation() != null)
            {
                ((afn)list1.get(k)).a.getAnimation().cancel();
            }
        }

        f();
    }
}
