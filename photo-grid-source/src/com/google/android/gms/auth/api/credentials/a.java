// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;


// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            CredentialPickerConfig

public final class a
{

    private boolean a;
    private boolean b;

    public a()
    {
        a = false;
        b = true;
    }

    static boolean a(a a1)
    {
        return a1.a;
    }

    static boolean b(a a1)
    {
        return a1.b;
    }

    public final CredentialPickerConfig a()
    {
        return new CredentialPickerConfig(this, (byte)0);
    }
}
