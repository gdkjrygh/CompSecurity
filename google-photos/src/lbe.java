// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class lbe extends lic
{

    private Account g;

    lbe(lbd lbd, jyn jyn, Account account)
    {
        g = account;
        super(jyn);
    }

    protected final jyw a(Status status)
    {
        return new lbh(status, null);
    }

    protected final void a(jyl jyl)
    {
        jyl = ((lbc)jyl).a(g);
        a(((jyw) (new lbh(Status.a, jyl))));
    }
}
