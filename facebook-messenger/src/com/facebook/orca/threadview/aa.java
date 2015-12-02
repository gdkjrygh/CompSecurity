// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.location.Coordinates;
import com.facebook.location.c;
import com.facebook.orca.common.ui.a.b;
import com.facebook.orca.common.ui.widgets.text.RowReceiptTextView;
import com.facebook.orca.common.ui.widgets.text.e;
import com.facebook.orca.k.d;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.threadview:
//            ReceiptItemView

class aa
    implements h
{

    final Coordinates a;
    final ReceiptItemView b;

    aa(ReceiptItemView receiptitemview, Coordinates coordinates)
    {
        b = receiptitemview;
        a = coordinates;
        super();
    }

    public void a(d d1)
    {
        ReceiptItemView.a(b, null);
        d1 = ReceiptItemView.a(b).a(d1.a(), d1.b());
        if (d1 != null)
        {
            com.facebook.orca.threadview.ReceiptItemView.b(b).setData(new e(d1));
            com.facebook.orca.threadview.ReceiptItemView.c(b).a(a, d1);
        }
    }

    public volatile void a(Object obj)
    {
        a((d)obj);
    }

    public void a(Throwable throwable)
    {
        ReceiptItemView.a(b, null);
    }
}
