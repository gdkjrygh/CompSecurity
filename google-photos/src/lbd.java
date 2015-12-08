// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import com.google.android.gms.location.reporting.UploadRequest;

public final class lbd
    implements lhy
{

    public lbd()
    {
    }

    static int a(int i)
    {
        switch (i)
        {
        default:
            return 8;

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 3507;

        case 2: // '\002'
        case 3: // '\003'
            return 5;

        case 4: // '\004'
            return 10;

        case 5: // '\005'
            return 3500;

        case 6: // '\006'
            return 3501;

        case 7: // '\007'
            return 3502;

        case 8: // '\b'
            return 3503;
        }
    }

    public final jyt a(jyn jyn1, Account account)
    {
        return jyn1.a(new lbe(this, jyn1, account));
    }

    public final jyt a(jyn jyn1, UploadRequest uploadrequest)
    {
        return jyn1.b(new lbg(this, jyn1, uploadrequest));
    }

    public final jyt b(jyn jyn1, Account account)
    {
        return jyn1.b(new lbf(this, jyn1, account));
    }
}
