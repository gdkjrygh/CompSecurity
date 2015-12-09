// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

final class gqp
{

    final String a;
    final grh b;
    final String c;
    final Protocol d;
    final int e;
    final String f;
    final grh g;
    final grg h;

    public gqp(grt grt1)
    {
        a = grt1.a.a.toString();
        b = gum.c(grt1);
        c = grt1.a.b;
        d = grt1.b;
        e = grt1.c;
        f = grt1.d;
        g = grt1.f;
        h = grt1.e;
    }

    public gqp(hcw hcw1)
    {
        boolean flag;
        flag = false;
        super();
        Object obj;
        Object obj1;
        int j;
        obj = hcq.a(hcw1);
        a = ((hcj) (obj)).q();
        c = ((hcj) (obj)).q();
        obj1 = new gri();
        j = gqm.a(((hcj) (obj)));
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((gri) (obj1)).a(((hcj) (obj)).q());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        b = ((gri) (obj1)).a();
        obj1 = gur.a(((hcj) (obj)).q());
        d = ((gur) (obj1)).a;
        e = ((gur) (obj1)).b;
        f = ((gur) (obj1)).c;
        obj1 = new gri();
        j = gqm.a(((hcj) (obj)));
        i = ((flag) ? 1 : 0);
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((gri) (obj1)).a(((hcj) (obj)).q());
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        g = ((gri) (obj1)).a();
        if (!a())
        {
            break MISSING_BLOCK_LABEL_290;
        }
        obj1 = ((hcj) (obj)).q();
        if (((String) (obj1)).length() > 0)
        {
            throw new IOException((new StringBuilder("expected \"\" but was \"")).append(((String) (obj1))).append("\"").toString());
        }
        break MISSING_BLOCK_LABEL_230;
        obj;
        hcw1.close();
        throw obj;
        List list;
        obj1 = ((hcj) (obj)).q();
        list = a(((hcj) (obj)));
        obj = a(((hcj) (obj)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        throw new IllegalArgumentException("cipherSuite == null");
        h = new grg(((String) (obj1)), gsp.a(list), gsp.a(((List) (obj))));
_L5:
        hcw1.close();
        return;
        h = null;
          goto _L5
    }

    private static List a(hcj hcj1)
    {
        int j = gqm.a(hcj1);
        if (j != -1) goto _L2; else goto _L1
_L1:
        Object obj = Collections.emptyList();
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist;
        CertificateFactory certificatefactory;
        hch hch1;
        int i;
        try
        {
            certificatefactory = CertificateFactory.getInstance("X.509");
            arraylist = new ArrayList(j);
        }
        // Misplaced declaration of an exception variable
        catch (hcj hcj1)
        {
            throw new IOException(hcj1.getMessage());
        }
        i = 0;
        obj = arraylist;
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj = hcj1.q();
        hch1 = new hch();
        hch1.a(ByteString.b(((String) (obj))));
        arraylist.add(certificatefactory.generateCertificate(hch1.f()));
        i++;
        break MISSING_BLOCK_LABEL_37;
    }

    private static void a(hci hci1, List list)
    {
        int i;
        int j;
        try
        {
            hci1.j(list.size());
            hci1.h(10);
            j = list.size();
        }
        // Misplaced declaration of an exception variable
        catch (hci hci1)
        {
            throw new IOException(hci1.getMessage());
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        hci1.b(ByteString.a(((Certificate)list.get(i)).getEncoded()).b());
        hci1.h(10);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
    }

    private boolean a()
    {
        return a.startsWith("https://");
    }

    public final void a(gsb gsb1)
    {
        boolean flag = false;
        gsb1 = hcq.a(gsb1.a(0));
        gsb1.b(a);
        gsb1.h(10);
        gsb1.b(c);
        gsb1.h(10);
        gsb1.j(b.a.length / 2);
        gsb1.h(10);
        int k = b.a.length / 2;
        for (int i = 0; i < k; i++)
        {
            gsb1.b(b.a(i));
            gsb1.b(": ");
            gsb1.b(b.b(i));
            gsb1.h(10);
        }

        gsb1.b((new gur(d, e, f)).toString());
        gsb1.h(10);
        gsb1.j(g.a.length / 2);
        gsb1.h(10);
        k = g.a.length / 2;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            gsb1.b(g.a(j));
            gsb1.b(": ");
            gsb1.b(g.b(j));
            gsb1.h(10);
        }

        if (a())
        {
            gsb1.h(10);
            gsb1.b(h.a);
            gsb1.h(10);
            a(((hci) (gsb1)), h.b);
            a(((hci) (gsb1)), h.c);
        }
        gsb1.close();
    }
}
