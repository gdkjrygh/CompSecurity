// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import com.microsoft.onlineid.internal.a.b;
import com.microsoft.onlineid.internal.a.d;
import com.microsoft.onlineid.internal.a.f;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.microsoft.onlineid.sts:
//            n

public static final class g extends Enum
    implements d
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    private static final m p[];
    private final String n;
    private final URL o;

    public static .a.d valueOf(String s)
    {
        return (.a.d)Enum.valueOf(com/microsoft/onlineid/sts/n$b, s);
    }

    public static .a.d[] values()
    {
        return (.a.d[])p.clone();
    }

    public final String a()
    {
        return n;
    }

    public final volatile Object b()
    {
        return o;
    }

    public final URL c()
    {
        return o;
    }

    static 
    {
        com.microsoft.onlineid.internal.a.f.a();
        a = new <init>("Configuration", 0, "ConfigUrl", a.a().b().toExternalForm());
        b = new <init>("Sts", 1, "WLIDSTS_WCF", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append(":443/RST2.srf").toString());
        c = new <init>("DeviceProvision", 2, "DeviceAddService", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ppsecure/deviceaddcredential.srf").toString());
        d = new <init>("ManageApprover", 3, "ManageApprover", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ManageApprover.srf").toString());
        e = new <init>("ManageLoginKeys", 4, "ManageLoginKeys", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ManageLoginKeys.srf").toString());
        f = new <init>("ListSessions", 5, "ListSessions", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ListSessions.srf").toString());
        g = new <init>("ApproveSession", 6, "ApproveSession", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ApproveSession.srf").toString());
        h = new <init>("ConnectMsa", 7, "CPConnect", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ppsecure/InlineConnect.srf?id=80601").toString());
        i = new <init>("ConnectPartner", 8, "CompleteAccountConnect", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ppsecure/InlineConnect.srf?id=80604").toString());
        j = new <init>("SignInMsa", 9, "CPSignInAuthUp", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ppsecure/InlineLogin.srf?id=80601").toString());
        k = new <init>("SignInPartner", 10, "CompleteAccountSignIn", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/ppsecure/InlineLogin.srf?id=80604").toString());
        l = new <init>("Refresh", 11, "URL_AccountSettings", (new StringBuilder("https://account.")).append(com.microsoft.onlineid.sts.n.c()).append("/").toString());
        m = new <init>("RemoteConnect", 12, "RemoteConnect", (new StringBuilder("https://login.")).append(com.microsoft.onlineid.sts.n.c()).append("/RemoteConnectClientAuth.srf").toString());
        p = (new p[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }

    private ion(String s, int i1, String s1, String s2)
    {
        super(s, i1);
        n = s1;
        try
        {
            o = new URL(s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("Default value for ServerConfig.Url with name '")).append(s1).append("' is not a valid URL.").toString());
        }
    }
}
