// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.PointF;
import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.roidapp.photogrid.release:
//            ra

final class rb
    implements TextWatcher
{

    final ra a;

    private rb(ra ra1)
    {
        a = ra1;
        super();
    }

    rb(ra ra1, byte byte0)
    {
        this(ra1);
    }

    public final void afterTextChanged(Editable editable)
    {
        editable = a.e();
        float f = a.d();
        ra.a(a);
        a.j();
        a.a(new PointF(editable[0], f), new PointF(a.o[16], a.d()));
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
