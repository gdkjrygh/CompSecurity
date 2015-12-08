// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class dbu
    implements Cloneable
{

    public String a;
    public String b;
    public String c;
    public String d;

    public dbu()
    {
        a = null;
        b = null;
        c = null;
        d = null;
    }

    public dbu(String s, String s1, String s2, String s3)
    {
        a = null;
        b = null;
        c = null;
        d = null;
        a = s;
        b = s1;
        c = s2;
        d = s3;
    }

    public final boolean a()
    {
        return !TextUtils.isEmpty(a) && !TextUtils.isEmpty(d) && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(c);
    }
}
