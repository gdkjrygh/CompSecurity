// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

class aro
{

    private static String a;
    private static final String b;
    private static volatile apt c;

    aro()
    {
    }

    static URI a(Context context, URI uri)
    {
        int i;
        i = 0;
        if (uri == null)
        {
            return null;
        }
        uri = uri.toString();
        apt apt1 = b(context);
        context = null;
_L6:
        Object obj = apt1.a(uri, b);
        if (obj == null) goto _L2; else goto _L1
_L1:
        uri = new InputStreamReader(((java.io.InputStream) (obj)));
        context = new char[128];
        obj = new StringBuilder();
_L5:
        i = uri.read(context, 0, 128);
        if (i <= 0) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj)).append(context, 0, i);
          goto _L5
        context;
_L11:
        arp.a(uri);
        return null;
_L4:
        arp.a(uri);
        obj = ((StringBuilder) (obj)).toString();
        context = uri;
        i = 1;
        uri = ((URI) (obj));
          goto _L6
_L2:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        uri = new URI(uri);
        arp.a(context);
        return uri;
        arp.a(context);
        return null;
        context;
        uri = null;
_L10:
        arp.a(uri);
        return null;
        context;
        uri = null;
_L8:
        arp.a(uri);
        throw context;
        context;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        uri = context;
        context = exception;
        if (true) goto _L8; else goto _L7
_L7:
        context;
        continue; /* Loop/switch isn't completed */
        uri;
        uri = context;
        if (true) goto _L10; else goto _L9
_L9:
        context;
        uri = null;
          goto _L11
        uri;
        uri = context;
          goto _L11
    }

    static void a(Context context)
    {
        LoggingBehavior loggingbehavior;
        try
        {
            b(context).a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            loggingbehavior = LoggingBehavior.d;
        }
        (new StringBuilder("clearCache failed ")).append(context.getMessage());
        arb.c();
    }

    static void a(Context context, URI uri, URI uri1)
    {
        if (uri == null)
        {
            return;
        }
        Context context1 = null;
        try
        {
            context = b(context).b(uri.toString(), b);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            arp.a(context1);
            return;
        }
        finally
        {
            uri1 = null;
        }
        context1 = context;
        context.write(uri1.toString().getBytes());
        arp.a(context);
        return;
        uri = context;
_L2:
        arp.a(uri1);
        throw uri;
        uri;
        uri1 = context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static apt b(Context context)
    {
        aro;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new apt(context.getApplicationContext(), a, new apx());
        }
        context = c;
        aro;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static 
    {
        a = aro.getSimpleName();
        b = (new StringBuilder()).append(a).append("_Redirect").toString();
    }
}
