// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;
import com.nuance.dragon.toolkit.a.a.f;
import com.nuance.dragon.toolkit.a.ah;
import com.nuance.dragon.toolkit.a.an;
import com.nuance.dragon.toolkit.a.w;
import com.nuance.dragon.toolkit.b.d;
import com.nuance.dragon.toolkit.b.e;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nuance.b.b:
//            v, fc, ff, fr, 
//            ay

final class ax
{

    ax()
    {
    }

    public static f a(String s, e e1, String s1)
    {
        return new f(s, e1, s1);
    }

    public static w a(String s)
    {
        return new w("BODY", s);
    }

    public static e a()
    {
        e e1 = new e();
        a(e1);
        return e1;
    }

    public static e a(long l)
    {
        Object obj = v.r();
        fc fc1 = ((v) (obj)).p();
        e e1 = new e();
        e1.a("request_id", String.valueOf(l));
        e1.a("ANI", ((v) (obj)).l());
        e1.a("application", fc1.e());
        obj = "2.1.3.6";
        if (!fc1.b.a)
        {
            fr.b("Compatability mode -- Sending version using old format");
            int i = "2.1.3.6".indexOf('.');
            obj = (new StringBuilder()).append("2.1.3.6".substring(0, i)).append(".").append("2.1.3.6".substring(i).replaceAll("\\.", "")).toString();
        }
        e1.a("mmfControllerVersion", ((String) (obj)));
        obj = fc1.c();
        if (obj != null)
        {
            e1.a("jsessionid", ((String) (obj)));
        }
        return e1;
    }

    public static String a(an an1)
    {
        switch (an1.b())
        {
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "CANCELED";

        case 1: // '\001'
            switch (an1.g())
            {
            default:
                return "CONNECTION_ERROR";

            case 1: // '\001'
                return (new StringBuilder()).append("CONNECTION_ERROR").append("-TIMED_OUT_WAITING_FOR_RESULT").toString();

            case 4: // '\004'
                return (new StringBuilder()).append("CONNECTION_ERROR").append("-COMMAND_ENDED_UNEXPECTEDLY").toString();

            case 5: // '\005'
                return (new StringBuilder()).append("CONNECTION_ERROR").append("-COMMAND_IDLE_FOR_TOO_LONG").toString();

            case 268369920: 
                return (new StringBuilder()).append("CONNECTION_ERROR").append("-NETWORK_UNAVAILABLE").toString();

            case 3: // '\003'
                return (new StringBuilder()).append("CONNECTION_ERROR").append("-REMOTE_DISCONNECTION").toString();
            }

        case 4: // '\004'
            return "OTHER_ERROR";

        case 3: // '\003'
            return "QUERY_ERROR";

        case 2: // '\002'
            return "RETRY_ERROR";
        }
    }

    public static void a(e e1)
    {
        d d1 = new d();
        Object obj = v.r().p().b();
        if (obj == null || ((List) (obj)).size() == 0)
        {
            fr.b("No active grammmars when trying to do a recognition.");
        } else
        {
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s = (String)((Iterator) (obj)).next();
                e e2 = new e();
                e2.a("grammar_desc", s);
                e2.a("grammar_type", "uri");
                d1.b(e2);
            }
        }
        e1.a("grammar_list", d1);
    }

    public static Handler b(String s)
    {
        s = new ay(s);
        s.start();
        return s.a();
    }

    public static ah b(e e1)
    {
        return new ah("REQUEST_INFO", e1);
    }

    public static e b()
    {
        e e1 = new e();
        e1.b("start");
        e1.b("end");
        e1.a("text", "");
        return e1;
    }

    public static e b(long l)
    {
        e e1 = a(l);
        e1.a("dictation_type", "dictation");
        e1.a("audio_source", "SpeakerAndMicrophone");
        return e1;
    }
}
