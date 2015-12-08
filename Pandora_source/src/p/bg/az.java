// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import java.util.Vector;
import p.bd.e;
import p.bh.n;

// Referenced classes of package p.bg:
//            bv

public class az extends e
{

    public az()
    {
        super("RegisterAppInterface");
    }

    public void a(Boolean boolean1)
    {
        if (boolean1 != null)
        {
            b.put("isMediaApplication", boolean1);
            return;
        } else
        {
            b.remove("isMediaApplication");
            return;
        }
    }

    public void a(String s)
    {
        if (s != null)
        {
            b.put("appName", s);
            return;
        } else
        {
            b.remove("appName");
            return;
        }
    }

    public void a(Vector vector)
    {
        if (vector != null)
        {
            b.put("ttsName", vector);
            return;
        } else
        {
            b.remove("ttsName");
            return;
        }
    }

    public void a(bv bv)
    {
        if (bv != null)
        {
            b.put("syncMsgVersion", bv);
            return;
        } else
        {
            b.remove("syncMsgVersion");
            return;
        }
    }

    public void a(n n)
    {
        if (n != null)
        {
            b.put("languageDesired", n);
            return;
        } else
        {
            b.remove("languageDesired");
            return;
        }
    }

    public void b(String s)
    {
        if (s != null)
        {
            b.put("ngnMediaScreenAppName", s);
            return;
        } else
        {
            b.remove("ngnMediaScreenAppName");
            return;
        }
    }

    public void b(Vector vector)
    {
        if (vector != null)
        {
            b.put("vrSynonyms", vector);
            return;
        } else
        {
            b.remove("vrSynonyms");
            return;
        }
    }

    public void b(n n)
    {
        if (n != null)
        {
            b.put("hmiDisplayLanguageDesired", n);
            return;
        } else
        {
            b.remove("hmiDisplayLanguageDesired");
            return;
        }
    }

    public void c(String s)
    {
        if (s != null)
        {
            b.put("hashID", s);
            return;
        } else
        {
            b.remove("hashID");
            return;
        }
    }

    public void c(Vector vector)
    {
        if (vector != null)
        {
            b.put("appHMIType", vector);
            return;
        } else
        {
            b.remove("appHMIType");
            return;
        }
    }

    public void d(String s)
    {
        if (s != null)
        {
            b.put("appID", s);
            return;
        } else
        {
            b.remove("appID");
            return;
        }
    }
}
