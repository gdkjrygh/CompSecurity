// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.TextView;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            by, PhotoGridActivity, PhotoView, ra, 
//            ih, mm

final class bz
    implements android.view.View.OnClickListener
{

    final by a;

    bz(by by1)
    {
        a = by1;
        super();
    }

    public final void onClick(View view)
    {
        if (!by.a(a).i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (by.b(a) != 1) goto _L4; else goto _L3
_L3:
        Object obj;
        view = by.a(a).O();
        obj = view.g();
        if (obj == null || !(obj instanceof ra))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ra)obj;
        if (((ra) (obj)).T == null && ((ra) (obj)).P >= 0) goto _L6; else goto _L5
_L5:
        by.a(a, ((ra) (obj)).P);
        ((ra) (obj)).x();
        obj.T = null;
        by.c(a);
        if (by.d(a) != null)
        {
            by.d(a).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020361, 0, 0);
            by.d(a).setText(0x7f07026b);
        }
_L7:
        view.invalidate();
        return;
_L6:
        if (by.e(a))
        {
            ((ra) (obj)).a(by.f(a));
            ((ra) (obj)).j();
            if (by.d(a) != null)
            {
                by.d(a).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203c7, 0, 0);
                by.d(a).setText(0x7f0701fa);
            }
        }
        if (true) goto _L7; else goto _L4
_L4:
        if (!ih.C().B())
        {
            break; /* Loop/switch isn't completed */
        }
        by.a(a).b.a(false);
        if (az.q != 6 && by.d(a) != null)
        {
            by.d(a).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f0203c7, 0, 0);
            by.d(a).setText(0x7f0701fa);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        by.a(a).b.a(true);
        if (az.q != 6 && by.d(a) != null)
        {
            by.d(a).setCompoundDrawablesWithIntrinsicBounds(0, 0x7f020361, 0, 0);
            by.d(a).setText(0x7f07026b);
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }
}
