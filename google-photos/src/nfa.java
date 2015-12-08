// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.util.Log;
import com.google.android.libraries.social.location.GcmLocationService;

public final class nfa
    implements lzy
{

    final int a;
    final GcmLocationService b;
    private Account c;

    public nfa(GcmLocationService gcmlocationservice, Account account, int i)
    {
        b = gcmlocationservice;
        c = account;
        a = i;
        super();
    }

    public final void a(lzx lzx)
    {
        lzx = (mea)lzx;
        if (lzx != null && lzx.a() && lzx.b())
        {
            lzx = ((med)olm.a(b, med)).a(c, "one-shot update for oven fresh", 0L, 0);
            try
            {
                GcmLocationService.c(b).a(GcmLocationService.b(b), lzx).a(new nfb(this));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (lzx lzx)
            {
                GcmLocationService.a(b);
            }
            return;
        }
        if (Log.isLoggable("GcmLocationService", 4) && lzx != null && lzx.a())
        {
            lzx.b();
        }
        GcmLocationService.a(b);
    }
}
