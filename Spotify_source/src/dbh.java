// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.os.Handler;

public abstract class dbh extends dbl
{

    private final Handler a;
    final AccountManagerCallback b;

    public dbh(AccountManagerCallback accountmanagercallback, Handler handler)
    {
        b = accountmanagercallback;
        a = handler;
    }

    private void a()
    {
        if (b != null)
        {
            a.post(new Runnable() {

                private dbh a;

                public final void run()
                {
                    a.b.run(((dbl) (a)).c);
                }

            
            {
                a = dbh.this;
                super();
            }
            });
        }
    }

    public final Object b(dar dar, Exception exception)
    {
        dar = ((dar) (super.b(dar, exception)));
        a();
        return dar;
        dar;
        a();
        throw dar;
    }

    public final Object b(dar dar, Object obj)
    {
        dar = ((dar) (super.b(dar, obj)));
        a();
        return dar;
        dar;
        a();
        throw dar;
    }
}
