// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class mqj
    implements opl, ops, opv
{

    int a;

    public mqj(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Bundle bundle)
    {
        if (bundle == null)
        {
            a = 16383;
            return;
        } else
        {
            a = bundle.getInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode");
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode", a);
    }
}
