// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class lhw
{

    public final Intent a = new Intent("com.google.android.gms.location.places.ui.PICK_PLACE");

    public lhw()
    {
        a.setPackage("com.google.android.gms");
        a.putExtra("gmscore_client_jar_version", jxz.a);
    }
}
