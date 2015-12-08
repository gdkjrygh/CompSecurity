// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import android.view.View;
import com.kik.scan.KikCode;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

final class t
    implements android.view.View.OnClickListener
{

    final KikCode a;
    final ScanFragment b;

    t(ScanFragment scanfragment, KikCode kikcode)
    {
        b = scanfragment;
        a = kikcode;
        super();
    }

    public final void onClick(View view)
    {
        ScanFragment.h(b);
        ScanFragment.c(b, a);
    }
}
