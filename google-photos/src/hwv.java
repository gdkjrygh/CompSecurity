// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class hwv
    implements android.view.View.OnClickListener
{

    private hww a;
    private hwu b;

    hwv(hwu hwu1, hww hww1)
    {
        b = hwu1;
        a = hww1;
        super();
    }

    public final void onClick(View view)
    {
        hwu hwu1 = b;
        msn msn1 = new msn();
        msn1.a(new msm(pwy.j));
        msn1.a(hya.a(hwu1.a));
        msn1.a(view);
        mry.a(hwu1.b, 4, msn1);
        a.a(b.a);
    }
}
