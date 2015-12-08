// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import kik.a.e.v;

public final class aa
{

    public String a;
    public Boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;
    public Boolean i;

    public aa()
    {
    }

    public static aa a(v v1)
    {
        aa aa1 = new aa();
        aa1.a = v1.n("user_profile_email");
        aa1.b = new Boolean("true".equals(v1.n("user_profile_email_emailConfirmed")));
        aa1.c = v1.n("user_profile_username");
        aa1.d = v1.n("user_profile_firstName");
        aa1.e = v1.n("user_profile_lastName");
        aa1.f = v1.n("user_profile_photoUrl");
        aa1.g = new Boolean("true".equals(v1.n("user_profile_is_updated")));
        boolean flag;
        if (!"false".equals(v1.n("notify_new_people")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aa1.h = new Boolean(flag);
        aa1.i = new Boolean("true".equals(v1.n("user_profile_verified")));
        return aa1;
    }

    public final boolean a()
    {
        return !g.booleanValue() || a == null || b == null || c == null || d == null || e == null || h == null;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (aa)obj;
        if (c != null) goto _L4; else goto _L3
_L3:
        if (((aa) (obj)).c == null) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (c.equals(((aa) (obj)).c))
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        int j;
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        return j + 31;
    }
}
