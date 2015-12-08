// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class ofu
    implements ofq
{

    ofu(ofn ofn)
    {
    }

    public final boolean a(Intent intent)
    {
        return intent.getBooleanExtra("from_url_gateway", false);
    }

    public final msm b(Intent intent)
    {
        return new msm(pwo.e);
    }
}
