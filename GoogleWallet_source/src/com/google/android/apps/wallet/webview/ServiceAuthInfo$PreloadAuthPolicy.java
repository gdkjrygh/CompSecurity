// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            ServiceAuthInfo

public static final class  extends Enum
{

    private static final Always $VALUES[];
    public static final Always Always;
    public static final Always Check;
    public static final Always Never;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/webview/ServiceAuthInfo$PreloadAuthPolicy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Never = new <init>("Never", 0);
        Check = new <init>("Check", 1);
        Always = new <init>("Always", 2);
        $VALUES = (new .VALUES[] {
            Never, Check, Always
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
