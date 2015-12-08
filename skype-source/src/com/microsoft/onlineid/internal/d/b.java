// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.d;

import android.content.Context;
import android.util.JsonReader;
import android.util.JsonToken;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.g;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.e.f;
import com.microsoft.onlineid.internal.f.a;
import com.microsoft.onlineid.internal.transport.TransportFactory;
import com.microsoft.onlineid.sts.a.e;
import com.microsoft.onlineid.sts.c;
import com.microsoft.onlineid.sts.n;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Date;

public final class b
{
    protected static final class a
    {

        protected static String a(JsonReader jsonreader)
            throws IOException
        {
            jsonreader.beginObject();
            a(jsonreader, "Views");
            jsonreader.beginArray();
            jsonreader.beginObject();
            a(jsonreader, "Attributes");
            jsonreader.beginArray();
_L10:
            if (!jsonreader.hasNext()) goto _L2; else goto _L1
_L1:
            jsonreader.beginObject();
            Object obj;
            String s;
            obj = null;
            s = null;
_L9:
            Object obj1;
            while (jsonreader.hasNext()) 
            {
                obj1 = jsonreader.nextName();
                if (!"Name".equals(obj1))
                {
                    break MISSING_BLOCK_LABEL_72;
                }
                s = jsonreader.nextString();
            }
              goto _L3
            if (!"Value".equals(obj1)) goto _L5; else goto _L4
_L4:
            obj1 = jsonreader.peek();
            static final class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[JsonToken.values().length];
                    try
                    {
                        a[JsonToken.NULL.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[JsonToken.STRING.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            com.microsoft.onlineid.internal.d._cls1.a[((JsonToken) (obj1)).ordinal()];
            JVM INSTR tableswitch 1 2: default 192
        //                       1 130
        //                       2 139;
               goto _L6 _L7 _L8
_L6:
            jsonreader.skipValue();
              goto _L9
            obj;
            jsonreader.close();
            throw obj;
_L7:
            jsonreader.nextNull();
            obj = null;
              goto _L9
_L8:
            obj = jsonreader.nextString();
              goto _L9
_L5:
            jsonreader.skipValue();
              goto _L9
_L3:
            boolean flag;
            jsonreader.endObject();
            flag = "PublicProfile.OrderedBasicName".equals(s);
            if (!flag)
            {
                obj = null;
            }
            if (obj != null)
            {
                jsonreader.close();
                return ((String) (obj));
            }
              goto _L10
_L2:
            jsonreader.close();
            return null;
        }

        private static void a(JsonReader jsonreader, String s)
            throws IOException
        {
            for (; jsonreader.hasNext(); jsonreader.skipValue())
            {
                if (s.equals(jsonreader.nextName()))
                {
                    return;
                }
            }

            throw new IOException((new StringBuilder("Unable to find name ")).append(s).toString());
        }

        public a()
        {
        }
    }


    protected static final d a = new g("ssl.live.com", "mbi_ssl");
    protected static final d b = new g("ssl.live-int.com", "mbi_ssl");
    private final Context c;
    private final c d;
    private final a e;
    private final n f;
    private final com.microsoft.onlineid.internal.f.a g;
    private final TransportFactory h;
    private final f i;

    public b()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
    }

    public b(Context context)
    {
        c = context;
        d = new c(context);
        e = new a();
        f = new n(context);
        g = new com.microsoft.onlineid.internal.f.a(context);
        h = new TransportFactory(context);
        i = new f(context);
    }

    public final void a(String s, String s1)
        throws IOException, com.microsoft.onlineid.b.c, com.microsoft.onlineid.internal.b.a, com.microsoft.onlineid.internal.b.b, com.microsoft.onlineid.sts.a.c, e
    {
        Object obj;
        String s2;
        com.microsoft.onlineid.internal.transport.b b1;
        boolean flag = f.b().equals(com.microsoft.onlineid.sts.n.d.a.a());
        i j;
        if (flag)
        {
            obj = a;
        } else
        {
            obj = b;
        }
        j = g.a(s, ((d) (obj)), s1);
        b1 = h.createTransport();
        s2 = null;
        if (flag)
        {
            obj = "https://pf.directory.live.com/profile/mine/WLX.Profiles.IC.json";
        } else
        {
            obj = "https://directory.services.live-int.com/profile/mine/WLX.Profiles.IC.json";
        }
        s1 = s2;
        b1.b(new URL(((String) (obj))));
        s1 = s2;
        b1.a("PS-ApplicationId", "F5EF4246-47B3-403A-885B-023BBAE0F547");
        s1 = s2;
        b1.a("PS-MSAAuthTicket", j.c());
        s1 = s2;
        b1.a("X-ClientVersion", "MSA Android");
        s1 = s2;
        obj = b1.a();
        s1 = ((String) (obj));
        s2 = com.microsoft.onlineid.internal.d.a.a(new JsonReader(new BufferedReader(new InputStreamReader(((InputStream) (obj))))));
        s1 = ((String) (obj));
        s = i.a(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        s1 = ((String) (obj));
        throw new com.microsoft.onlineid.internal.b.a("Account was deleted before operation could be completed.");
        s;
        b1.e();
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s1 = ((String) (obj));
        s.a(s2);
        s1 = ((String) (obj));
        s.a(d.a().getTime());
        s1 = ((String) (obj));
        i.a(s);
        b1.e();
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        return;
    }

}
