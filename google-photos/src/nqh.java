// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class nqh
    implements nqg
{

    private static final Pattern a = Pattern.compile("([a-z0-9-]+)\\.[a-z0-9-]+\\.com");
    private static final Pattern b[] = {
        Pattern.compile(".*/(.+)?/.+\\..{3,4}+"), Pattern.compile("/[^=\\?]*=(.*)"), Pattern.compile("/gadgets/proxy\\?(.+)\\&url=.+"), Pattern.compile("/gadgets/proxy\\?(.+[^\\&url=])"), Pattern.compile("/-[^/]+/[^/]+/[^/]+/[^/]+/([a-z0-9-^/]+)/[^/]+?$")
    };
    private static final onh c = new onh("debug.plus.image_metrics");
    private final Context d;
    private npw e;

    nqh(Context context)
    {
        d = context;
    }

    private static String a(String s, String s1)
    {
        String s2;
        String s3;
        s3 = "";
        s2 = s3;
        Object obj1 = new URL(s);
        s2 = s3;
        Matcher matcher = a.matcher(((URL) (obj1)).getHost());
        Object obj;
        obj = s3;
        s2 = s3;
        if (!matcher.matches()) goto _L2; else goto _L1
_L1:
        s2 = s3;
        s3 = String.valueOf(matcher.group(1)).concat("/");
        int i = 0;
_L7:
        obj = s3;
        s2 = s3;
        if (i >= b.length) goto _L2; else goto _L3
_L3:
        s2 = s3;
        obj = b[i].matcher(((URL) (obj1)).getFile());
        s2 = s3;
        if (!((Matcher) (obj)).matches()) goto _L5; else goto _L4
_L4:
        s2 = s3;
        obj1 = String.valueOf(s3);
        s2 = s3;
        obj = String.valueOf(((Matcher) (obj)).group(1));
        s2 = s3;
        try
        {
            obj = (new StringBuilder(String.valueOf(obj1).length() + 1 + String.valueOf(obj).length())).append(((String) (obj1))).append(((String) (obj))).append("/").toString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("NetworkLoggerImpl", 6))
            {
                obj = String.valueOf(s);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Couldn't parse url:".concat(((String) (obj)));
                } else
                {
                    obj = new String("Couldn't parse url:");
                }
                Log.e("NetworkLoggerImpl", ((String) (obj)));
            }
            obj = s2;
        }
_L2:
        i = s1.indexOf(';');
        if (i > 0)
        {
            obj = String.valueOf(obj);
            s1 = String.valueOf(s1.substring(0, i));
            if (s1.length() != 0)
            {
                s1 = ((String) (obj)).concat(s1);
            } else
            {
                s1 = new String(((String) (obj)));
            }
        } else
        {
            obj = String.valueOf(obj);
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = ((String) (obj)).concat(s1);
            } else
            {
                s1 = new String(((String) (obj)));
            }
        }
        if (Log.isLoggable("NetworkLoggerImpl", 3))
        {
            (new StringBuilder(String.valueOf(s).length() + 14 + String.valueOf(s1).length())).append("Sanitized:").append(s).append(" to:").append(s1);
        }
        return s1;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(int i, String s, String s1, long l, long l1, 
            long l2, long l3, int j, String s2)
    {
        List list = ((mmv)olm.a(d, mmv)).a(new String[] {
            "logged_in"
        });
        String s3 = null;
        if (!list.isEmpty())
        {
            int k = i;
            if (i == -1)
            {
                k = ((Integer)list.get(0)).intValue();
            }
            s3 = ((mmv)olm.a(d, mmv)).a(k).b("account_name");
        }
        e = (npw)olm.b(d, npw);
        if (e != null)
        {
            e.a(new npy(1, new String[] {
                a(s, s1)
            }, s3, l, l1, l2, 0L, l3, j, s2));
        }
    }

}
