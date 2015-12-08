// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.EditText;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.az;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.photogrid.release:
//            as, PhotoGridActivity, ih, ig, 
//            fm

final class ax
    implements android.view.View.OnClickListener
{

    final as a;

    ax(as as1)
    {
        a = as1;
        super();
    }

    public final void onClick(View view)
    {
        float f;
        float f1;
        float f2;
        float f3;
label0:
        {
            f = 50F;
            if (as.a(a))
            {
                f1 = (new BigDecimal(as.c(a).getText().toString())).setScale(2, 4).floatValue();
                f2 = (new BigDecimal(as.d(a).getText().toString())).setScale(2, 4).floatValue();
                f3 = f1 / f2;
                if (!Float.isNaN(f3))
                {
                    break label0;
                }
                as.f(a);
                an.a(as.g(a), as.g(a).getString(0x7f070119));
            }
            return;
        }
        if ((az.q == 5 || az.q == 10) && ih.C().W() != 4)
        {
            ih.C().k(1);
            view = ih.C().M();
            if (view != null && view.length != 0)
            {
                view[0].B = true;
            }
            as.g(a).J();
        }
        ih.C().b(f3);
        ih.C().c(-1);
        ih.C().d(false);
        if (f3 < 1.0F)
        {
            f = 50F - ((1.0F - 1.0F / f3) * 100F) / 2.0F;
        } else
        if (f3 >= 1.0F)
        {
            f = 50F + ((1.0F - f3) * 100F) / 2.0F;
        }
        ih.C().a(new float[] {
            f1, f2, 0.0F, f
        });
        a.dismiss();
        if (f3 < 1.0F)
        {
            ih.C().f(false);
            as.h(a).a(false);
        } else
        if (f3 >= 1.0F)
        {
            ih.C().f(true);
            as.h(a).a(true);
        }
        as.g(a).a(false, false);
    }
}
