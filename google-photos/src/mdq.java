// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;

public final class mdq
    implements mdy
{

    public mdq()
    {
    }

    public final lzv a(lzq lzq, Account account)
    {
        lzq = (mat)lzq;
        return new lzv(lia.b.a(lzq.d(), account), new mdr(this));
    }

    public final lzv a(lzq lzq, mec mec1)
    {
        lzq = (mat)lzq;
        mec1 = (mec)mec1;
        return new lzv(lia.b.a(lzq.d(), mec1.a()), new mds(this));
    }

    public final lzv b(lzq lzq, Account account)
    {
        lzq = (mat)lzq;
        return new lzv(lia.b.b(lzq.d(), account), new mdt(this));
    }
}
