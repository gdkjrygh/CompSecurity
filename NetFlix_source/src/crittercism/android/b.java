// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            o, d, e, au, 
//            p

public final class b
    implements o
{
    public static final class a
        implements p
    {

        public final o a(JSONArray jsonarray)
        {
            return new b(jsonarray);
        }

        public a()
        {
        }
    }


    e a;
    private long b;
    private long c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private String l;
    private d m;
    private URL n;

    public b(JSONArray jsonarray)
    {
        b = 0x7fffffffffffffffL;
        c = 0x7fffffffffffffffL;
        d = false;
        e = false;
        f = false;
        g = 0;
        h = 0;
        i = false;
        j = false;
        k = 0;
        l = "";
        m = d.a;
        a = e.a;
        l = jsonarray.getString(0);
        if (!jsonarray.getString(1).equals("NULL"))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        URL url = null;
_L1:
        try
        {
            n = url;
        }
        catch (MalformedURLException malformedurlexception)
        {
            n = null;
        }
        b = au.a.a(jsonarray.getString(2));
        c = b + jsonarray.getLong(3);
        a = crittercism.android.e.a(jsonarray.getInt(4));
        g = jsonarray.getInt(5);
        h = jsonarray.getInt(6);
        k = jsonarray.getInt(7);
        m = crittercism.android.d.a(jsonarray.getInt(9));
        return;
        url = new URL(jsonarray.getString(1));
          goto _L1
    }

    private long c()
    {
        long l2 = 0x7fffffffffffffffL;
        long l1 = l2;
        if (b != 0x7fffffffffffffffL)
        {
            l1 = l2;
            if (c != 0x7fffffffffffffffL)
            {
                l1 = c - b;
            }
        }
        return l1;
    }

    public final JSONArray a()
    {
        JSONArray jsonarray = new JSONArray();
        String s;
        jsonarray.put(l);
        if (n == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        s = n.toExternalForm();
_L1:
        jsonarray.put(s);
        jsonarray.put(au.a.a(new Date(b)));
        jsonarray.put(c());
        jsonarray.put(a.a());
        jsonarray.put(g);
        jsonarray.put(h);
        jsonarray.put(k);
        jsonarray.put(3);
        jsonarray.put(Integer.toString(m.a()));
        return jsonarray;
        s = "NULL";
          goto _L1
        Exception exception;
        exception;
        System.out.println("Failed to create statsArray");
        exception.printStackTrace();
        return null;
    }

    public final Object b()
    {
        return a();
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("").append("Response time  : ").append(c()).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Start time     : ").append(b).append("\n").toString();
        s = (new StringBuilder()).append(s).append("End time       : ").append(c).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes out    : ").append(h).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Bytes in     : ").append(g).append("\n").toString();
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("Response code  : ").append(k).append("\n").toString();
        return (new StringBuilder()).append(s).append("Request method : ").append(l).append("\n").toString();
    }
}
