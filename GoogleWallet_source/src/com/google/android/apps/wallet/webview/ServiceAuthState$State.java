// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            ServiceAuthState

public static final class  extends Enum
{

    private static final Authenticated $VALUES[];
    public static final Authenticated Authenticated;
    public static final Authenticated InProgress;
    public static final Authenticated NotAuthenticated;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/webview/ServiceAuthState$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NotAuthenticated = new <init>("NotAuthenticated", 0);
        InProgress = new <init>("InProgress", 1);
        Authenticated = new <init>("Authenticated", 2);
        $VALUES = (new .VALUES[] {
            NotAuthenticated, InProgress, Authenticated
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
