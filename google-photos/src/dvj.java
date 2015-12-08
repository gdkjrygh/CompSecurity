// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.view.View;

final class dvj
    implements android.view.View.OnClickListener
{

    private msp a;
    private efb b;
    private dvf c;

    dvj(dvf dvf1, msp msp, efb efb1)
    {
        c = dvf1;
        super();
        a = msp;
        b = efb1;
    }

    public final void onClick(View view)
    {
        mry.a(view.getContext(), 4, (new msn()).a(new msm(a)).a(view));
        view = c.a;
        boolean flag1 = ContentResolver.getMasterSyncAutomatically();
        boolean flag;
        if (b == efb.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(flag1, flag);
    }
}
