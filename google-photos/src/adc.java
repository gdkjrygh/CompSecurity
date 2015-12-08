// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;

public class adc extends adi
{

    private static int f = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    public adf a;
    private boolean g;
    private int h;
    private int i[];
    private View j[];
    private SparseIntArray k;
    private SparseIntArray l;
    private Rect m;

    public adc(Context context, int i1)
    {
        super(context);
        g = false;
        h = -1;
        k = new SparseIntArray();
        l = new SparseIntArray();
        a = new add();
        m = new Rect();
        if (i1 != h)
        {
            g = true;
            if (i1 <= 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Span count should be at least 1. Provided ")).append(i1).toString());
            }
            h = i1;
            a.a.clear();
        }
    }

    private static int a(int i1)
    {
        if (i1 < 0)
        {
            return f;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        }
    }

    private static int a(int i1, int j1, int k1)
    {
        int l1;
        if (j1 != 0 || k1 != 0)
        {
            if ((l1 = android.view.View.MeasureSpec.getMode(i1)) == 0x80000000 || l1 == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i1) - j1 - k1, l1);
            }
        }
        return i1;
    }

    private int a(afe afe1, afl afl1, int i1)
    {
        if (!afl1.j)
        {
            return a.c(i1, h);
        }
        int j1 = afe1.a(i1);
        if (j1 == -1)
        {
            Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. ")).append(i1).toString());
            return 0;
        } else
        {
            return a.c(j1, h);
        }
    }

    private void a(afe afe1, afl afl1, int i1, boolean flag)
    {
        int j1;
        int k1;
        int l1;
        byte byte0;
        if (flag)
        {
            k1 = 1;
            boolean flag1 = false;
            l1 = i1;
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1--;
            k1 = -1;
            l1 = -1;
        }
        if (b == 1 && a())
        {
            j1 = h - 1;
            byte0 = -1;
        } else
        {
            j1 = 0;
            byte0 = 1;
        }
        while (i1 != l1) 
        {
            View view = j[i1];
            ade ade1 = (ade)view.getLayoutParams();
            ade.a(ade1, c(afe1, afl1, getPosition(view)));
            if (byte0 == -1 && ade.b(ade1) > 1)
            {
                ade.b(ade1, j1 - (ade.b(ade1) - 1));
            } else
            {
                ade.b(ade1, j1);
            }
            j1 += ade.b(ade1) * byte0;
            i1 += k1;
        }
    }

    private void a(View view, int i1, int j1, boolean flag)
    {
        aez aez1;
        int k1;
label0:
        {
            calculateItemDecorationsForChild(view, m);
            aez1 = (aez)view.getLayoutParams();
            if (!flag)
            {
                k1 = i1;
                if (b != 1)
                {
                    break label0;
                }
            }
            k1 = a(i1, aez1.leftMargin + m.left, aez1.rightMargin + m.right);
        }
label1:
        {
            if (!flag)
            {
                i1 = j1;
                if (b != 0)
                {
                    break label1;
                }
            }
            i1 = a(j1, aez1.topMargin + m.top, aez1.bottomMargin + m.bottom);
        }
        view.measure(k1, i1);
    }

    private int b(afe afe1, afl afl1, int i1)
    {
        int j1;
        if (!afl1.j)
        {
            j1 = a.b(i1, h);
        } else
        {
            int l1 = l.get(i1, -1);
            j1 = l1;
            if (l1 == -1)
            {
                int k1 = afe1.a(i1);
                if (k1 == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i1).toString());
                    return 0;
                } else
                {
                    return a.b(k1, h);
                }
            }
        }
        return j1;
    }

    private int c(afe afe1, afl afl1, int i1)
    {
        int j1;
        if (!afl1.j)
        {
            j1 = a.a(i1);
        } else
        {
            int l1 = k.get(i1, -1);
            j1 = l1;
            if (l1 == -1)
            {
                int k1 = afe1.a(i1);
                if (k1 == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i1).toString());
                    return 1;
                } else
                {
                    return a.a(k1);
                }
            }
        }
        return j1;
    }

    final View a(afe afe1, afl afl1, int i1, int j1, int k1)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                b();
                int i2 = c.b();
                int j2 = c.c();
                int l1;
                if (j1 > i1)
                {
                    l1 = 1;
                } else
                {
                    l1 = -1;
                }
                view1 = null;
                while (i1 != j1) 
                {
                    View view2 = getChildAt(i1);
                    int k2 = getPosition(view2);
                    if (k2 >= 0 && k2 < k1 && b(afe1, afl1, k2) == 0)
                    {
                        if (((aez)view2.getLayoutParams()).c.o())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (c.a(view2) < j2)
                            {
                                view3 = view2;
                                if (c.b(view2) >= i2)
                                {
                                    break label1;
                                }
                            }
                            if (view == null)
                            {
                                view = view2;
                            }
                        }
                    }
                    i1 += l1;
                }
                if (view == null)
                {
                    break label0;
                }
                view3 = view;
            }
            return view3;
        }
        return view1;
    }

    final void a(afe afe1, afl afl1, adk adk1)
    {
        int j1 = 0;
        super.a(afe1, afl1, adk1);
        int i1;
        int k1;
        int i2;
        int j2;
        if (super.b == 1)
        {
            i1 = getWidth() - getPaddingRight() - getPaddingLeft();
        } else
        {
            i1 = getHeight() - getPaddingBottom() - getPaddingTop();
        }
        if (i == null || i.length != h + 1 || i[i.length - 1] != i1)
        {
            i = new int[h + 1];
        }
        i[0] = 0;
        i2 = i1 / h;
        j2 = i1 % h;
        k1 = 1;
        i1 = 0;
        while (k1 <= h) 
        {
            i1 += j2;
            int l1;
            if (i1 > 0 && h - i1 < j2)
            {
                i1 -= h;
                l1 = i2 + 1;
            } else
            {
                l1 = i2;
            }
            j1 += l1;
            i[k1] = j1;
            k1++;
        }
        if (afl1.b() > 0 && !afl1.j)
        {
            for (i1 = b(afe1, afl1, adk1.a); i1 > 0 && adk1.a > 0; i1 = b(afe1, afl1, adk1.a))
            {
                adk1.a = adk1.a - 1;
            }

        }
        if (j == null || j.length != h)
        {
            j = new View[h];
        }
    }

    final void a(afe afe1, afl afl1, adm adm1, adl adl1)
    {
        int i1;
        int i3;
        boolean flag1;
        if (adm1.e == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i1 = h;
        int k1;
        int j2;
        int l2;
        int j3;
        boolean flag;
        int k4;
        if (!flag1)
        {
            i1 = b(afe1, afl1, adm1.d) + c(afe1, afl1, adm1.d);
            i3 = 0;
        } else
        {
            i3 = 0;
        }
        do
        {
            if (i3 >= h || !adm1.a(afl1) || i1 <= 0)
            {
                break;
            }
            int j1 = adm1.d;
            int l1 = c(afe1, afl1, j1);
            if (l1 > h)
            {
                throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(j1).append(" requires ").append(l1).append(" spans but GridLayoutManager has only ").append(h).append(" spans.").toString());
            }
            i1 -= l1;
            if (i1 < 0)
            {
                break;
            }
            View view = adm1.a(afe1);
            if (view == null)
            {
                break;
            }
            j[i3] = view;
            i3++;
        } while (true);
        if (i3 == 0)
        {
            adl1.b = true;
            return;
        }
        i1 = 0;
        a(afe1, afl1, i3, flag1);
        k1 = 0;
        while (k1 < i3) 
        {
            afe1 = j[k1];
            int i2;
            if (adm1.j == null)
            {
                if (flag1)
                {
                    addView(afe1);
                } else
                {
                    addView(afe1, 0);
                }
            } else
            if (flag1)
            {
                addDisappearingView(afe1);
            } else
            {
                addDisappearingView(afe1, 0);
            }
            afl1 = (ade)afe1.getLayoutParams();
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(i[ade.a(afl1) + ade.b(afl1)] - i[ade.a(afl1)], 0x40000000);
            if (b == 1)
            {
                a(((View) (afe1)), i2, a(((ade) (afl1)).height), false);
            } else
            {
                a(((View) (afe1)), a(((ade) (afl1)).width), i2, false);
            }
            i2 = c.c(afe1);
            if (i2 > i1)
            {
                i1 = i2;
            }
            k1++;
        }
        j2 = a(i1);
        k1 = 0;
        while (k1 < i3) 
        {
            afe1 = j[k1];
            if (c.c(afe1) != i1)
            {
                afl1 = (ade)afe1.getLayoutParams();
                int k2 = android.view.View.MeasureSpec.makeMeasureSpec(i[ade.a(afl1) + ade.b(afl1)] - i[ade.a(afl1)], 0x40000000);
                if (b == 1)
                {
                    a(((View) (afe1)), k2, j2, true);
                } else
                {
                    a(((View) (afe1)), j2, k2, true);
                }
            }
            k1++;
        }
        adl1.a = i1;
        l2 = 0;
        j2 = 0;
        if (b == 1)
        {
            if (adm1.f == -1)
            {
                j2 = adm1.b;
                l2 = j2 - i1;
                i1 = 0;
                k1 = 0;
            } else
            {
                l2 = adm1.b;
                j2 = l2 + i1;
                i1 = 0;
                k1 = 0;
            }
        } else
        if (adm1.f == -1)
        {
            int k3 = adm1.b;
            k1 = k3 - i1;
            i1 = k3;
        } else
        {
            k1 = adm1.b;
            i1 += k1;
        }
        j3 = 0;
        flag = k1;
        k1 = l2;
        k4 = i1;
        l2 = j2;
        i1 = ((flag) ? 1 : 0);
        j2 = k4;
        while (j3 < i3) 
        {
            afe1 = j[j3];
            afl1 = (ade)afe1.getLayoutParams();
            int i4;
            if (b == 1)
            {
                i1 = getPaddingLeft();
                i1 = i[ade.a(afl1)] + i1;
                int l3 = c.d(afe1);
                j2 = k1;
                k1 = l3 + i1;
            } else
            {
                k1 = getPaddingTop();
                k1 = i[ade.a(afl1)] + k1;
                l2 = c.d(afe1) + k1;
                int j4 = j2;
                j2 = k1;
                k1 = j4;
            }
            layoutDecorated(afe1, i1 + ((ade) (afl1)).leftMargin, j2 + ((ade) (afl1)).topMargin, k1 - ((ade) (afl1)).rightMargin, l2 - ((ade) (afl1)).bottomMargin);
            if (((aez) (afl1)).c.o() || ((aez) (afl1)).c.m())
            {
                adl1.c = true;
            }
            adl1.d = adl1.d | afe1.isFocusable();
            i4 = j3 + 1;
            j3 = k1;
            k1 = j2;
            j2 = j3;
            j3 = i4;
        }
        Arrays.fill(j, null);
    }

    public boolean checkLayoutParams(aez aez1)
    {
        return aez1 instanceof ade;
    }

    public aez generateDefaultLayoutParams()
    {
        return new ade(-2, -2);
    }

    public aez generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new ade(context, attributeset);
    }

    public aez generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new ade((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new ade(layoutparams);
        }
    }

    public int getColumnCountForAccessibility(afe afe1, afl afl1)
    {
        if (b == 1)
        {
            return h;
        }
        if (afl1.b() <= 0)
        {
            return 0;
        } else
        {
            return a(afe1, afl1, afl1.b() - 1);
        }
    }

    public int getRowCountForAccessibility(afe afe1, afl afl1)
    {
        if (b == 0)
        {
            return h;
        }
        if (afl1.b() <= 0)
        {
            return 0;
        } else
        {
            return a(afe1, afl1, afl1.b() - 1);
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(afe afe1, afl afl1, View view, pa pa1)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof ade))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, pa1);
            return;
        }
        view = (ade)layoutparams;
        int i1 = a(afe1, afl1, ((aez) (view)).c.d());
        if (b == 0)
        {
            int j1 = ((ade) (view)).a;
            int l1 = ((ade) (view)).b;
            boolean flag;
            if (h > 1 && ((ade) (view)).b == h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            pa1.a(pl.a(j1, l1, i1, 1, flag, false));
            return;
        }
        int k1 = ((ade) (view)).a;
        int i2 = ((ade) (view)).b;
        boolean flag1;
        if (h > 1 && ((ade) (view)).b == h)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        pa1.a(pl.a(i1, 1, k1, i2, flag1, false));
    }

    public void onItemsAdded(RecyclerView recyclerview, int i1, int j1)
    {
        a.a.clear();
    }

    public void onItemsChanged(RecyclerView recyclerview)
    {
        a.a.clear();
    }

    public void onItemsMoved(RecyclerView recyclerview, int i1, int j1, int k1)
    {
        a.a.clear();
    }

    public void onItemsRemoved(RecyclerView recyclerview, int i1, int j1)
    {
        a.a.clear();
    }

    public void onItemsUpdated(RecyclerView recyclerview, int i1, int j1, Object obj)
    {
        a.a.clear();
    }

    public void onLayoutChildren(afe afe1, afl afl1)
    {
        if (afl1.j)
        {
            int j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ade ade1 = (ade)getChildAt(i1).getLayoutParams();
                int k1 = ((aez) (ade1)).c.d();
                k.put(k1, ade1.b);
                l.put(k1, ade1.a);
            }

        }
        super.onLayoutChildren(afe1, afl1);
        k.clear();
        l.clear();
        if (!afl1.j)
        {
            g = false;
        }
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return e == null && !g;
    }

}
