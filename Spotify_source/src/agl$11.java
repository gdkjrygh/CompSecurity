// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.bmwgroup.connected.car.internal.SdkManager;

final class ng.Object
    implements Runnable
{

    private String a;
    private String b;
    private adk c;
    private int d[];

    public final void run()
    {
        Object obj1;
        obj1 = (aez)SdkManager.a.a(a);
        String s = b;
        ((aez) (obj1)).a.b("setLastClickableIdent(%s)", new Object[] {
            s
        });
        if (!(c instanceof adn)) goto _L2; else goto _L1
_L1:
        ((adn)c).a(d[1]);
_L4:
        return;
_L2:
        if (!(c instanceof aem))
        {
            continue; /* Loop/switch isn't completed */
        }
        agl.m().b((new StringBuilder("BigImageScreenListener --> ")).append(d).toString(), new Object[0]);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((aei)obj1).a(d[1]);
        return;
        if (!(c instanceof agy)) goto _L4; else goto _L5
_L5:
        Object obj = null;
        aht aht = obj;
        if (obj1 != null)
        {
            obj1 = (afu)((afv)obj1).a(d[0]);
            aht = obj;
            if (obj1 != null)
            {
                aht aaht[] = ((afu) (obj1)).a;
                aht = obj;
                if (aaht != null)
                {
                    aht = obj;
                    if (aaht.length > d[1])
                    {
                        aht = aaht[d[1]];
                    }
                }
            }
        }
        ((agy)c).a(aht);
        return;
    }

    ng.String(String s, String s1, adk adk, int ai[])
    {
        a = s;
        b = s1;
        c = adk;
        d = ai;
        super();
    }
}
