// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            s

private static final class  extends Enum
{

    public static final tq tk;
    public static final tq tl;
    public static final tq tm;
    public static final tq tn;
    public static final tq to;
    public static final tq tp;
    public static final tq tq;
    private static final tq tr[];

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/google/android/gms/analytics/s$a, s1);
    }

    public static [] values()
    {
        return ([])tr.clone();
    }

    static 
    {
        tk = new <init>("CONNECTING", 0);
        tl = new <init>("CONNECTED_SERVICE", 1);
        tm = new <init>("CONNECTED_LOCAL", 2);
        tn = new <init>("BLOCKED", 3);
        to = new <init>("PENDING_CONNECTION", 4);
        tp = new <init>("PENDING_DISCONNECT", 5);
        tq = new <init>("DISCONNECTED", 6);
        tr = (new tr[] {
            tk, tl, tm, tn, to, tp, tq
        });
    }

    private (String s1, int i)
    {
        super(s1, i);
    }
}
