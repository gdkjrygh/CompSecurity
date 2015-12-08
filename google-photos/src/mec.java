// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import com.google.android.gms.location.reporting.UploadRequest;

public class mec
{

    public final UploadRequest a;

    public mec(Account account, String s, long l, int i)
    {
        account = UploadRequest.a(account, s, l);
        l = i;
        account.d = l;
        account.e = l;
        a = new UploadRequest(account);
    }

    public UploadRequest a()
    {
        return a;
    }
}
