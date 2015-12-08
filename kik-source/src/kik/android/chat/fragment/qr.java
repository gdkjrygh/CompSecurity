// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            ScanCodeTabFragment

final class qr
    implements android.view.View.OnClickListener
{

    final ScanCodeTabFragment a;

    qr(ScanCodeTabFragment scancodetabfragment)
    {
        a = scancodetabfragment;
        super();
    }

    public final void onClick(View view)
    {
        ScanCodeTabFragment.i(a);
    }
}
