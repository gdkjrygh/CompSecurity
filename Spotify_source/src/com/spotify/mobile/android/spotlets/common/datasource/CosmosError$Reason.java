// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.datasource;


// Referenced classes of package com.spotify.mobile.android.spotlets.common.datasource:
//            CosmosError

public final class  extends Enum
{

    public static final e a;
    public static final e b;
    private static e c;
    private static e d;
    private static e e;
    private static final e f[];

    public static  a(com.spotify.mobile.android.cosmos.iver.ErrorCause errorcause)
    {
        switch ([errorcause.ordinal()])
        {
        default:
            return e;

        case 1: // '\001'
            return c;

        case 2: // '\002'
            return b;
        }
    }

    public static CosmosError a(Throwable throwable)
    {
        return new CosmosError(throwable);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/spotify/mobile/android/spotlets/common/datasource/CosmosError$Reason, s);
    }

    public static b[] values()
    {
        return (b[])f.clone();
    }

    static 
    {
        a = new <init>("TIMEOUT", 0);
        b = new <init>("PARSE_ERROR", 1);
        c = new <init>("NOT_RESOLVED", 2);
        d = new <init>("RESOLVER_NOT_READY", 3);
        e = new <init>("UNKNOWN_ERROR", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
