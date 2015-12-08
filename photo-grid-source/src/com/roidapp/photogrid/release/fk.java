// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.HorizontalScrollView;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            fi, PhotoGridActivity, ih

final class fk
    implements android.view.View.OnClickListener
{

    final int a;
    final fi b;

    fk(fi fi1, int i)
    {
        b = fi1;
        a = i;
        super();
    }

    public final void onClick(View view)
    {
        byte byte0;
        boolean flag;
        boolean flag1;
        byte0 = 2;
        flag1 = true;
        flag = true;
        if (!fi.a(b).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (fi.b(b) == null) goto _L4; else goto _L3
_L3:
        int i = fi.c(b) - fi.b(b).getLeft() - (view.getRight() - fi.b(b).getScrollX());
        if (i >= fi.d(b)) goto _L6; else goto _L5
_L5:
        fi.b(b).smoothScrollBy(fi.d(b) - i, 0);
_L4:
        int j = ((Integer)view.getTag()).intValue();
        if (fi.e(b) != j || j == a - 1)
        {
            if (j == 0)
            {
                if (fi.e(b) == a - 1)
                {
                    view = ih.C().Z();
                    float f;
                    boolean flag2;
                    if (view != null)
                    {
                        if (view[2] == 0.0F)
                        {
                            f = view[1] / view[0];
                            view[2] = 1.0F;
                        } else
                        {
                            f = view[0] / view[1];
                            view[2] = 0.0F;
                        }
                    } else
                    {
                        f = 1.0F;
                    }
                    view = b;
                    if (f >= 1.0F)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    fi.a(view, flag2);
                    if (fi.f(b))
                    {
                        view = b;
                        byte0 = flag;
                        if (fi.g(b))
                        {
                            byte0 = 0;
                        }
                        fi.a(view, byte0);
                    } else
                    {
                        view = b;
                        if (fi.g(b))
                        {
                            byte0 = 2;
                        } else
                        {
                            byte0 = 3;
                        }
                        fi.a(view, byte0);
                    }
                    ih.C().f(fi.g(b));
                    ih.C().b(f);
                    fi.a(b).a(false, false);
                } else
                {
                    view = b;
                    if (!fi.g(b))
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    fi.a(view, flag2);
                    if (fi.f(b))
                    {
                        view = b;
                        byte0 = flag1;
                        if (fi.g(b))
                        {
                            byte0 = 0;
                        }
                        fi.a(view, byte0);
                    } else
                    {
                        view = b;
                        if (!fi.g(b))
                        {
                            byte0 = 3;
                        }
                        fi.a(view, byte0);
                    }
                    fi.a(b, fi.e(b), a);
                }
            } else
            {
                fi.a(b, j, a);
            }
            if (j != 0)
            {
                if (fi.e(b) > 0)
                {
                    ((View)fi.h(b).get(fi.e(b))).findViewById(0x7f0d0493).setVisibility(8);
                }
                ((View)fi.h(b).get(j)).findViewById(0x7f0d0493).setVisibility(0);
                fi.b(b, j);
                return;
            } else
            {
                fi.i(b);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
        j = view.getLeft() - fi.b(b).getScrollX();
        if (j < fi.d(b))
        {
            fi.b(b).smoothScrollBy(j - fi.d(b), 0);
        }
          goto _L4
    }
}
