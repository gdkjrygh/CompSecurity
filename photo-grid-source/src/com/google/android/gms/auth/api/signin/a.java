// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            GoogleSignInConfig

public final class a
{

    private Set a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private Account f;

    public a()
    {
        a = new HashSet(Arrays.asList(new Scope[] {
            GoogleSignInConfig.c
        }));
    }

    public final GoogleSignInConfig a()
    {
        return new GoogleSignInConfig(a, f, d, b, c, e, (byte)0);
    }
}
