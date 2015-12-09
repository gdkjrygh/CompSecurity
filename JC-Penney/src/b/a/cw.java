// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.OutputStream;
import org.json.JSONArray;

// Referenced classes of package b.a:
//            bb, cx, fc, cy, 
//            eu

public final class cw extends bb
{

    public static final cw a;
    private String b;
    private String c;
    private String d;
    private cx e;

    public cw(String s, cx cx1)
    {
        this(s, fc.a.a(), cx1);
    }

    private cw(String s, String s1, cx cx1)
    {
        d = cy.a.a();
        String s2 = s;
        if (s.length() > 140)
        {
            s2 = s.substring(0, 140);
        }
        b = s2;
        c = s1;
        e = cx1;
    }

    public final void a(OutputStream outputstream)
    {
        Object obj = new JSONArray();
        ((JSONArray) (obj)).put(b);
        ((JSONArray) (obj)).put(c);
        obj = ((JSONArray) (obj)).toString();
        (new StringBuilder("BREADCRUMB WRITING ")).append(((String) (obj)));
        eu.b();
        outputstream.write(((String) (obj)).getBytes());
    }

    public final String j()
    {
        return d;
    }

    static 
    {
        a = new cw("session_start", cx.a);
    }
}
