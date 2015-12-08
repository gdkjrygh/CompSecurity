// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.social;

import android.view.View;
import android.widget.TextView;
import com.roidapp.cloudlib.sns.aa;
import com.roidapp.cloudlib.sns.b.a.d;
import com.roidapp.cloudlib.sns.login.a;

// Referenced classes of package com.roidapp.photogrid.social:
//            d

final class g extends aa
{

    final com.roidapp.photogrid.social.d a;

    private g(com.roidapp.photogrid.social.d d1)
    {
        a = d1;
        super();
    }

    g(com.roidapp.photogrid.social.d d1, byte byte0)
    {
        this(d1);
    }

    public final void b(int i, Exception exception)
    {
        if (a.getActivity() == null)
        {
            return;
        }
        super.b(i, exception);
        a.a();
        if (d.c(a) == 0)
        {
            if (com.roidapp.photogrid.social.d.a(a) != null && com.roidapp.photogrid.social.d.a(a).size() > 0)
            {
                d.e(a).setText(a.getString(0x7f07035c, new Object[] {
                    Integer.valueOf(com.roidapp.photogrid.social.d.a(a).size())
                }));
                d.e(a).setVisibility(0);
                return;
            } else
            {
                d.h(a);
                return;
            }
        } else
        {
            d.h(a);
            return;
        }
    }

    public final volatile void b(Object obj)
    {
        super.b((d)obj);
    }

    public final void c(Object obj)
    {
        obj = (d)obj;
        if (a.getActivity() == null) goto _L2; else goto _L1
_L1:
        super.c(obj);
        if (com.roidapp.photogrid.social.d.a(a) != null && obj != null)
        {
            com.roidapp.photogrid.social.d.a(a).addAll(((java.util.Collection) (obj)));
        } else
        {
            com.roidapp.photogrid.social.d.a(a, ((d) (obj)));
        }
        a.a();
        if (d.b(a) == null) goto _L2; else goto _L3
_L3:
        if (d.c(a) != 0) goto _L5; else goto _L4
_L4:
        if (com.roidapp.photogrid.social.d.d(a).getVisibility() != 8)
        {
            com.roidapp.photogrid.social.d.d(a).setVisibility(8);
        }
        if (com.roidapp.photogrid.social.d.a(a) == null || com.roidapp.photogrid.social.d.a(a).size() <= 0) goto _L7; else goto _L6
_L6:
        d.e(a).setText(a.getString(0x7f07035c, new Object[] {
            Integer.valueOf(com.roidapp.photogrid.social.d.a(a).size())
        }));
        d.e(a).setVisibility(0);
_L9:
        d.b(a).a(com.roidapp.photogrid.social.d.a(a));
        d.b(a).notifyDataSetChanged();
_L2:
        return;
_L7:
        if (d.f(a).getVisibility() != 0)
        {
            d.f(a).setVisibility(0);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (com.roidapp.photogrid.social.d.a(a) != null && com.roidapp.photogrid.social.d.a(a).size() > 0)
        {
            if (com.roidapp.photogrid.social.d.d(a).getVisibility() != 8)
            {
                com.roidapp.photogrid.social.d.d(a).setVisibility(8);
            }
            if (d.e(a).getVisibility() != 0)
            {
                d.e(a).setVisibility(0);
            }
        } else
        {
            d.g(a).setText(0x7f0700c6);
            if (com.roidapp.photogrid.social.d.d(a).getVisibility() != 0)
            {
                com.roidapp.photogrid.social.d.d(a).setVisibility(0);
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
    }
}
