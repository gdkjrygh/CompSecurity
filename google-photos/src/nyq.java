// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.UserAgent;

public class nyq
    implements nyb
{

    private static onh a = new onh("debug.allowBackendOverride");
    private static String g;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public nyq(Context context, String s, String s1)
    {
        this(context, s, null, s1);
    }

    private nyq(Context context, String s, String s1, String s2)
    {
        this(context, s, null, s2, null);
    }

    public nyq(Context context, String s, String s1, String s2, String s3)
    {
        b = context;
        c = s;
        d = s2;
        f = s1;
        e = s3;
    }

    protected String a(Context context)
    {
        if (g == null)
        {
            g = String.valueOf(UserAgent.a(context)).concat(" (gzip)");
        }
        return g;
    }

    public Map a(String s)
    {
        jk jk1 = new jk();
        jk1.put("Accept-Encoding", "gzip");
        jk1.put("Accept-Language", Locale.getDefault().toString());
        jk1.put("User-Agent", a(b));
        if (c != null)
        {
            Object obj;
            try
            {
                obj = ((nym)olm.a(b, nym)).a(d);
                s = ((nyn) (obj)).a(b, c);
                obj = Long.toString(((nyn) (obj)).c(b, s).longValue());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ocd ocd1 = new ocd(c, 26, -1);
                Context context = b;
                ((mrv)olm.a(context, mrv)).a(context, ocd1);
                throw new IOException("Cannot obtain authentication token", s);
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Bearer ".concat(s);
            } else
            {
                s = new String("Bearer ");
            }
            jk1.put("Authorization", s);
            jk1.put("X-Auth-Time", obj);
            if (f != null)
            {
                jk1.put("X-Goog-PageId", f);
            }
        }
        if ("PUT".equals(e))
        {
            jk1.put("X-HTTP-Method-Override", "PUT");
        }
        return jk1;
    }

    public final void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        ((nym)olm.a(b, nym)).a(d).b(b, c);
        return;
        Exception exception;
        exception;
        throw new IOException("Cannot invalidate authentication token", exception);
    }

    public boolean b(String s)
    {
        return TextUtils.equals(d, s);
    }

}
