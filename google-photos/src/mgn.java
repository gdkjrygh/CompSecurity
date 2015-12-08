// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class mgn
    implements mfr
{

    private static final mau b = new mgo();
    private final Context a;

    public mgn(Context context)
    {
        a = context;
    }

    public final lzv a(mfu mfu, String s, String s1)
    {
        lmj lmj1 = lmk.c;
        if (mfu instanceof mgx)
        {
            mfu = ((mgx)mfu).a;
        } else
        {
            mfu = null;
        }
        return new lzv(lmj1.a(mfu, s, s1), b);
    }

    public final mfu a(int i)
    {
        jyo jyo1 = new jyo(a);
        jyh jyh = lmk.b;
        lmn lmn1 = new lmn();
        lmn1.a = 165;
        boolean flag;
        if (lmn1.a >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.b(flag, "Must provide valid client application ID!");
        return new mgx(jyo1.a(jyh, new lmm(lmn1)).a());
    }

}
