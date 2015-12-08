// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.j;
import com.ford.syncV4.e.e;
import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.ford.syncV4.e.c:
//            bs

public final class ay extends e
{

    public ay()
    {
        super("RegisterAppInterface");
    }

    public final void a(j j)
    {
        if (j != null)
        {
            b.put("languageDesired", j);
            return;
        } else
        {
            b.remove("languageDesired");
            return;
        }
    }

    public final void a(bs bs)
    {
        if (bs != null)
        {
            b.put("syncMsgVersion", bs);
            return;
        } else
        {
            b.remove("syncMsgVersion");
            return;
        }
    }

    public final void a(Boolean boolean1)
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

    public final void a(String s)
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

    public final void a(Vector vector)
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

    public final void b(j j)
    {
        if (j != null)
        {
            b.put("hmiDisplayLanguageDesired", j);
            return;
        } else
        {
            b.remove("hmiDisplayLanguageDesired");
            return;
        }
    }

    public final void b(String s)
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

    public final void b(Vector vector)
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

    public final void c(String s)
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

    public final void c(Vector vector)
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

    public final void d(String s)
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
