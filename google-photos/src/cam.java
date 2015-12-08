// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class cam extends mtf
{

    private static String a = cam.getSimpleName();
    private final nxv b;
    private final mmv c;
    private final int j;
    private final pye k;
    private final String l;
    private final String m;
    private final byte n[];

    public cam(nxv nxv1, mmv mmv1, int i, pye pye1, byte abyte0[], String s, String s1)
    {
        super(a);
        b = (nxv)b.a(nxv1, "httpExecutor", null);
        c = (mmv)b.a(mmv1, "accountStore", null);
        j = i;
        k = (pye)b.a(pye1, "storyboard", null);
        n = (byte[])b.a(abyte0, "storyboardToken", null);
        l = (String)b.a(s, "lastVersionId", null);
        m = (String)b.a(s1, "mediaKey", null);
    }

    static pkk a(String s, String s1, pye pye1)
    {
        pkk pkk1 = new pkk();
        pkk1.a = new pns();
        pkk1.a.c = s;
        pkk1.b = Boolean.valueOf(true);
        pkk1.c = new pkj();
        pkk1.c.a = s1;
        s = pkk1.c;
        s1 = new pkn();
        s1.a = 1;
        s1.b = new pkr();
        ((pkn) (s1)).b.a = new pyp();
        ((pkn) (s1)).b.a.a = new pyo();
        ((pkn) (s1)).b.a.a.a = (new int[] {
            1, 3
        });
        ((pkn) (s1)).b.a.b = 8;
        ((pkn) (s1)).b.a.c = new qpb();
        ((pkn) (s1)).b.a.c.a = pye1;
        ((pkn) (s1)).b.b = 1;
        s.b = s1;
        return pkk1;
    }

    protected final mue a(Context context)
    {
        Object obj = a(m, l, k);
        Object obj1 = c.a(j);
        nyh nyh1 = new nyh();
        nyh1.a = ((mmx) (obj1)).b("account_name");
        nyh1.b = "effective_gaia_id";
        obj1 = new nun(context, nyh1.a(), ((pkk) (obj)));
        b.a(((nxx) (obj1)));
        context = new mue(((nxx) (obj1)).l, ((nxx) (obj1)).n, ((nxx) (obj1)).m);
        obj = context.a();
        if (((nun) (obj1)).t() != null)
        {
            obj1 = ((pcc)((nun) (obj1)).t()).a;
            if (obj1 != null)
            {
                ((Bundle) (obj)).putByteArray("mutate_filters_response", qlw.a(((qlw) (obj1))));
            }
        }
        ((Bundle) (obj)).putByteArray("storyboard_token", n);
        return context;
    }

}
