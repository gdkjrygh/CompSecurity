// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Dialog;

// Referenced classes of package com.google.android.gms.internal:
//            ux, vb, uz

final class vc extends ux
{

    final Dialog b;
    final vb c;

    vc(vb vb1, Dialog dialog)
    {
        c = vb1;
        b = dialog;
        super();
    }

    protected final void a()
    {
        uz.d(c.a);
        b.dismiss();
    }
}
