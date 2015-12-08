// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

final class mom
    implements mng
{

    private final lww a;

    mom(lww lww1)
    {
        a = lww1;
    }

    public final List a()
    {
        Account aaccount[];
        aaccount = a.a("com.google");
        break MISSING_BLOCK_LABEL_12;
        Object obj;
        obj;
_L2:
        throw new mnj(((Throwable) (obj)));
        ArrayList arraylist = new ArrayList(aaccount.length);
        for (int i = 0; i < aaccount.length; i++)
        {
            arraylist.add((new mnf(aaccount[i].name, i)).a());
        }

        return arraylist;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
