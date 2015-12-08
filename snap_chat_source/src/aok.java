// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.List;

public final class aok
    implements anQ
{
    public final class a
        implements aoq
    {

        private aok a;

        public final void a(int i, Exception exception)
        {
            anR.a();
            if (i == 10001)
            {
                a.a(exception);
                return;
            } else
            {
                a.a(i);
                return;
            }
        }

        public final void a(Object obj)
        {
            obj = (List)obj;
            anR.a();
            if (!((List) (obj)).isEmpty())
            {
                if (a.a != null)
                {
                    a.a.a(((List) (obj)).get(0));
                }
                return;
            } else
            {
                a.a(10002);
                return;
            }
        }

        private a()
        {
            a = aok.this;
            super();
        }

        public a(byte byte0)
        {
            this();
        }
    }


    aoq a;
    public final aom b;
    private final Activity c;

    aok(Activity activity, aoq aoq1, aom aom)
    {
        c = activity;
        a = aoq1;
        b = aom;
    }

    public final void a()
    {
        if (a != null)
        {
            anK.a(a);
            a = null;
        }
    }

    public final void a(int i)
    {
        (new StringBuilder("Error response: ")).append(i).append(" in ").append(aol.getSimpleName()).append(" request");
        anK.c();
        a(i, ((Exception) (new anL())));
    }

    public final void a(int i, Exception exception)
    {
        if (a != null)
        {
            a.a(i, exception);
        }
    }

    public final void a(Exception exception)
    {
        (new StringBuilder("Exception in ")).append(aol.getSimpleName()).append(" request: ");
        anK.d();
        a(10001, exception);
    }

    public final void a(Object obj)
    {
        obj = (PendingIntent)obj;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        c.startIntentSenderForResult(((PendingIntent) (obj)).getIntentSender(), 51966, new Intent(), 0, 0, 0);
        return;
        obj;
        a(((Exception) (obj)));
        return;
        obj;
        a(((Exception) (obj)));
        return;
    }
}
