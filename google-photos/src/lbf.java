// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class lbf extends lic
{

    private Account g;

    lbf(lbd lbd1, jyn jyn, Account account)
    {
        g = account;
        super(jyn);
    }

    protected final jyw a(Status status)
    {
        return status;
    }

    protected final void a(jyl jyl)
    {
        a(((jyw) (new Status(lbd.a(((lbc)jyl).b(g))))));
    }
}
