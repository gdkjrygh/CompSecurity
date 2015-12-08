// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.ErrorCode;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

public final class gty
    implements gus
{

    private static final List a = gsp.a(new ByteString[] {
        ByteString.a("connection"), ByteString.a("host"), ByteString.a("keep-alive"), ByteString.a("proxy-connection"), ByteString.a("transfer-encoding")
    });
    private static final List b = gsp.a(new ByteString[] {
        ByteString.a("connection"), ByteString.a("host"), ByteString.a("keep-alive"), ByteString.a("proxy-connection"), ByteString.a("te"), ByteString.a("transfer-encoding"), ByteString.a("encoding"), ByteString.a("upgrade")
    });
    private final gui c;
    private final gst d;
    private gsw e;

    public gty(gui gui1, gst gst1)
    {
        c = gui1;
        d = gst1;
    }

    private static boolean a(Protocol protocol, ByteString bytestring)
    {
        if (protocol == Protocol.c)
        {
            return a.contains(bytestring);
        }
        if (protocol == Protocol.d)
        {
            return b.contains(bytestring);
        } else
        {
            throw new AssertionError(protocol);
        }
    }

    public final grv a(grt grt1)
    {
        return new gun(grt1.f, hcq.a(e.f));
    }

    public final hcv a(grq grq1, long l)
    {
        return e.d();
    }

    public final void a()
    {
        e.d().close();
    }

    public final void a(grq grq1)
    {
        gst gst1;
        ArrayList arraylist;
        Object obj;
        String s;
        boolean flag;
        if (e != null)
        {
            return;
        }
        c.b();
        flag = c.c();
        obj = guo.a(c.b.g);
        gst1 = d;
        Protocol protocol = d.a;
        grh grh1 = grq1.c;
        arraylist = new ArrayList(grh1.a.length / 2 + 10);
        arraylist.add(new gta(gta.b, grq1.b));
        arraylist.add(new gta(gta.c, guo.a(grq1.a)));
        s = gsp.a(grq1.a);
        int i;
        int k;
        if (Protocol.c == protocol)
        {
            arraylist.add(new gta(gta.g, ((String) (obj))));
            arraylist.add(new gta(gta.f, s));
        } else
        if (Protocol.d == protocol)
        {
            arraylist.add(new gta(gta.e, s));
        } else
        {
            throw new AssertionError();
        }
        arraylist.add(new gta(gta.d, grq1.a.a));
        grq1 = new LinkedHashSet();
        k = grh1.a.length / 2;
        i = 0;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        obj = ByteString.a(grh1.a(i).toLowerCase(Locale.US));
        s = grh1.b(i);
        if (!a(protocol, ((ByteString) (obj))) && !((ByteString) (obj)).equals(gta.b) && !((ByteString) (obj)).equals(gta.c) && !((ByteString) (obj)).equals(gta.d) && !((ByteString) (obj)).equals(gta.e) && !((ByteString) (obj)).equals(gta.f) && !((ByteString) (obj)).equals(gta.g))
        {
            if (!grq1.add(obj))
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.add(new gta(((ByteString) (obj)), s));
        }
_L6:
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_227;
_L1:
        int j = 0;
_L4:
        if (j < arraylist.size())
        {
label0:
            {
                if (!((gta)arraylist.get(j)).h.equals(obj))
                {
                    break label0;
                }
                arraylist.set(j, new gta(((ByteString) (obj)), (new StringBuilder(((gta)arraylist.get(j)).i.a())).append('\0').append(s).toString()));
            }
        }
        continue; /* Loop/switch isn't completed */
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        e = gst1.a(arraylist, flag);
        e.h.a(c.a.u, TimeUnit.MILLISECONDS);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(gui gui1)
    {
        if (e != null)
        {
            e.a(ErrorCode.h);
        }
    }

    public final void a(gup gup1)
    {
        gup1.a(e.d());
    }

    public final gru b()
    {
        List list = e.c();
        Protocol protocol = d.a;
        Object obj = null;
        Object obj1 = "HTTP/1.1";
        gri gri1 = new gri();
        gri1.b(gum.c, protocol.toString());
        int i1 = list.size();
        int i = 0;
        do
        {
            if (i >= i1)
            {
                break;
            }
            ByteString bytestring = ((gta)list.get(i)).h;
            String s1 = ((gta)list.get(i)).i.a();
            int j = 0;
            while (j < s1.length()) 
            {
                int l = s1.indexOf('\0', j);
                int k = l;
                if (l == -1)
                {
                    k = s1.length();
                }
                String s = s1.substring(j, k);
                if (bytestring.equals(gta.a))
                {
                    obj = s;
                } else
                if (bytestring.equals(gta.g))
                {
                    obj1 = s;
                } else
                if (!a(protocol, bytestring))
                {
                    gri1.a(bytestring.a(), s);
                }
                j = k + 1;
            }
            i++;
        } while (true);
        if (obj == null)
        {
            throw new ProtocolException("Expected ':status' header not present");
        } else
        {
            obj = gur.a((new StringBuilder()).append(((String) (obj1))).append(" ").append(((String) (obj))).toString());
            obj1 = new gru();
            obj1.b = protocol;
            obj1.c = ((gur) (obj)).b;
            obj1.d = ((gur) (obj)).c;
            return ((gru) (obj1)).a(gri1.a());
        }
    }

    public final void c()
    {
    }

    public final boolean d()
    {
        return true;
    }

}
