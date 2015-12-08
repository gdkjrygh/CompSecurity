// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.content.Context;
import android.content.SharedPreferences;
import com.microsoft.onlineid.internal.a.a;
import com.microsoft.onlineid.internal.a.b;
import com.microsoft.onlineid.internal.a.d;
import com.microsoft.onlineid.internal.a.e;
import com.microsoft.onlineid.internal.a.f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Set;

public final class n extends com.microsoft.onlineid.internal.a.a
{
    public static final class a extends com.microsoft.onlineid.internal.a.a.a
    {

        public final com.microsoft.onlineid.internal.a.a.a a(com.microsoft.onlineid.internal.a.d d1, int i)
        {
            return b(d1, i);
        }

        public final com.microsoft.onlineid.internal.a.a.a a(com.microsoft.onlineid.internal.a.d d1, String s)
        {
            return b(d1, s);
        }

        public final com.microsoft.onlineid.internal.a.a.a a(com.microsoft.onlineid.internal.a.d d1, Set set)
        {
            return b(d1, set);
        }

        public final a a(b b1, URL url)
        {
            a.putString(b1.a(), url.toExternalForm());
            return this;
        }

        public final volatile com.microsoft.onlineid.internal.a.a.a b()
        {
            super.b();
            return this;
        }

        public final a b(com.microsoft.onlineid.internal.a.d d1, int i)
        {
            super.a(d1, i);
            return this;
        }

        public final a b(com.microsoft.onlineid.internal.a.d d1, String s)
        {
            super.a(d1, s);
            return this;
        }

        public final a b(com.microsoft.onlineid.internal.a.d d1, Set set)
        {
            super.a(d1, set);
            return this;
        }

        public final a c()
        {
            super.b();
            return this;
        }

        private a(android.content.SharedPreferences.Editor editor)
        {
            super(editor);
        }

        a(android.content.SharedPreferences.Editor editor, byte byte0)
        {
            this(editor);
        }
    }

    public static final class b extends Enum
        implements com.microsoft.onlineid.internal.a.d
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        private static final b p[];
        private final String n;
        private final URL o;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/microsoft/onlineid/sts/n$b, s);
        }

        public static b[] values()
        {
            return (b[])p.clone();
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
            a = new b("Configuration", 0, "ConfigUrl", com.microsoft.onlineid.sts.d.a.a().b().toExternalForm());
            b = new b("Sts", 1, "WLIDSTS_WCF", (new StringBuilder("https://login.")).append(n.c()).append(":443/RST2.srf").toString());
            c = new b("DeviceProvision", 2, "DeviceAddService", (new StringBuilder("https://login.")).append(n.c()).append("/ppsecure/deviceaddcredential.srf").toString());
            d = new b("ManageApprover", 3, "ManageApprover", (new StringBuilder("https://login.")).append(n.c()).append("/ManageApprover.srf").toString());
            e = new b("ManageLoginKeys", 4, "ManageLoginKeys", (new StringBuilder("https://login.")).append(n.c()).append("/ManageLoginKeys.srf").toString());
            f = new b("ListSessions", 5, "ListSessions", (new StringBuilder("https://login.")).append(n.c()).append("/ListSessions.srf").toString());
            g = new b("ApproveSession", 6, "ApproveSession", (new StringBuilder("https://login.")).append(n.c()).append("/ApproveSession.srf").toString());
            h = new b("ConnectMsa", 7, "CPConnect", (new StringBuilder("https://login.")).append(n.c()).append("/ppsecure/InlineConnect.srf?id=80601").toString());
            i = new b("ConnectPartner", 8, "CompleteAccountConnect", (new StringBuilder("https://login.")).append(n.c()).append("/ppsecure/InlineConnect.srf?id=80604").toString());
            j = new b("SignInMsa", 9, "CPSignInAuthUp", (new StringBuilder("https://login.")).append(n.c()).append("/ppsecure/InlineLogin.srf?id=80601").toString());
            k = new b("SignInPartner", 10, "CompleteAccountSignIn", (new StringBuilder("https://login.")).append(n.c()).append("/ppsecure/InlineLogin.srf?id=80604").toString());
            l = new b("Refresh", 11, "URL_AccountSettings", (new StringBuilder("https://account.")).append(n.c()).append("/").toString());
            m = new b("RemoteConnect", 12, "RemoteConnect", (new StringBuilder("https://login.")).append(n.c()).append("/RemoteConnectClientAuth.srf").toString());
            p = (new b[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m
            });
        }

        private b(String s, int i1, String s1, String s2)
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

    public static final class c extends Enum
        implements com.microsoft.onlineid.internal.a.d
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        public static final c h;
        private static final c k[];
        private final String i;
        private final Integer j;

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/microsoft/onlineid/sts/n$c, s);
        }

        public static c[] values()
        {
            return (c[])k.clone();
        }

        public final String a()
        {
            return i;
        }

        public final volatile Object b()
        {
            return j;
        }

        static 
        {
            a = new c("ConnectTimeout", 0, "ConnectTimeout", 10000);
            b = new c("SendTimeout", 1, "SendTimeout", 30000);
            c = new c("ReceiveTimeout", 2, "ReceiveTimeout", 30000);
            d = new c("BackupSlaveCount", 3, "BackupSlaveCount", 3);
            e = new c("MaxSecondsBetweenBackups", 4, "MaxSecondsBetweenBackups", 0x3f480);
            f = new c("MinSecondsBetweenConfigDownloads", 5, "MinSecondsBetweenConfigDownloads", 28800);
            g = new c("MaxTriesForSsoRequestToSingleService", 6, "MaxTriesForSsoRequestToSingleService", 2);
            h = new c("MaxTriesForSsoRequestWithFallback", 7, "MaxTriesForSsoRequestWithFallback", 4);
            k = (new c[] {
                a, b, c, d, e, f, g, h
            });
        }

        private c(String s, int l, String s1, int i1)
        {
            super(s, l);
            i = s1;
            j = Integer.valueOf(i1);
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        private static final d d[];
        private final com.microsoft.onlineid.internal.a.b c;

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/microsoft/onlineid/sts/n$d, s);
        }

        public static d[] values()
        {
            return (d[])d.clone();
        }

        public final com.microsoft.onlineid.internal.a.b a()
        {
            return c;
        }

        static 
        {
            a = new d("Production", 0, "production", "https://go.microsoft.com/fwlink/?LinkId=398559");
            b = new d("Int", 1, "int", "https://go.microsoft.com/fwlink/?LinkId=398560");
            d = (new d[] {
                a, b
            });
        }

        private d(String s, int i, String s1, String s2)
        {
            super(s, i);
            try
            {
                c = new com.microsoft.onlineid.internal.a.b(s1, new URL(s2));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid known environment URL: ")).append(s2).toString());
            }
        }
    }


    public static e b = new e("ConfigVersion", "1");
    public static e c = new e("environment", "production");
    public static e d = new e("cloud_pin_length", Integer.valueOf(4));
    public static e e = new e("AndroidSsoCerts", Collections.singleton("sX6CAbEo4edMwCNRCrfqA6wn3eUNMtgQ6hV3dY8cwJg="));
    private static String f = "live.com";

    public n(Context context)
    {
        super(context, "ServerConfig");
    }

    static String c()
    {
        return f;
    }

    public final int a(com.microsoft.onlineid.internal.a.d d1)
    {
        return super.a(d1);
    }

    public final a a()
    {
        return new a(a.edit(), (byte)0);
    }

    public final URL a(b b1)
    {
        Object obj;
        try
        {
            obj = a.getString(b1.a(), null);
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new IllegalStateException((new StringBuilder("Stored URL for setting ")).append(b1.a()).append(" is invalid.").toString(), malformedurlexception);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        return new URL(((String) (obj)));
        obj = b1.c();
        return ((URL) (obj));
    }

    public final com.microsoft.onlineid.internal.a.b b()
    {
        return new com.microsoft.onlineid.internal.a.b(super.b(c), a(com.microsoft.onlineid.sts.b.a));
    }

    public final String b(com.microsoft.onlineid.internal.a.d d1)
    {
        return super.b(d1);
    }

    public final Set c(com.microsoft.onlineid.internal.a.d d1)
    {
        return super.c(d1);
    }

    static 
    {
        com.microsoft.onlineid.internal.a.f.a();
        com.microsoft.onlineid.internal.a.f.a();
    }
}
