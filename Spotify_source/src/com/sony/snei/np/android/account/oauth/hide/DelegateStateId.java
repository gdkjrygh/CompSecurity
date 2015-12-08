// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.account.oauth.hide;


public final class DelegateStateId extends Enum
{

    public static final DelegateStateId a;
    public static final DelegateStateId b;
    public static final DelegateStateId c;
    public static final DelegateStateId d;
    private static final DelegateStateId e[];

    private DelegateStateId(String s, int i)
    {
        super(s, i);
    }

    public static DelegateStateId valueOf(String s)
    {
        return (DelegateStateId)Enum.valueOf(com/sony/snei/np/android/account/oauth/hide/DelegateStateId, s);
    }

    public static DelegateStateId[] values()
    {
        return (DelegateStateId[])e.clone();
    }

    static 
    {
        a = new DelegateStateId("SignedOut", 0);
        b = new DelegateStateId("SignedIn", 1);
        c = new DelegateStateId("Invalidated", 2);
        d = new DelegateStateId("Disposed", 3);
        e = (new DelegateStateId[] {
            a, b, c, d
        });
    }
}
