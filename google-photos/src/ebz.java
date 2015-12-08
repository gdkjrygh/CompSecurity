// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;

final class ebz
    implements ekr
{

    private final ebp a;
    private final Context b;

    public ebz(Context context)
    {
        b = context;
        a = new ebp(context, new elp(context, ebh));
    }

    private elb b(ekq ekq1, ekk ekk)
    {
        if (!(ekq1 instanceof ebv))
        {
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq1).length() + 25)).append("collection type unknown: ").append(ekq1).toString());
        }
        ekq1 = (ebv)ekq1;
        try
        {
            ekk = a.a(ekq1, ekk);
        }
        // Misplaced declaration of an exception variable
        catch (ekq ekq1)
        {
            return b.a(ekq1);
        }
        return b.b(ebp.a(ekq1, ekk));
    }

    public final ejy a(Class class1)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        return b((ekq)ekg, ekk);
    }

    public final elb a(ekq ekq1, ekk ekk)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.assistant.remote.provider";
    }

    public final void a(ekq ekq1, ContentObserver contentobserver)
    {
        if (ekq1 instanceof ebv)
        {
            ekq1 = (ebv)ekq1;
            b.getContentResolver().registerContentObserver(nsw.a, false, contentobserver);
            ekq1 = ((ebv) (ekq1)).d;
            if (ekq1 != null)
            {
                b.b(b, ekq1).a(ekq1, contentobserver);
            }
            return;
        }
        if (ekq1 instanceof ecj)
        {
            ekq1 = (ecj)ekq1;
            b.b(b, ((ecj) (ekq1)).b).a(((ecj) (ekq1)).b, contentobserver);
            return;
        } else
        {
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq1).length() + 24)).append("Unsupported collection: ").append(ekq1).toString());
        }
    }

    public final void b(ekq ekq1, ContentObserver contentobserver)
    {
        if (ekq1 instanceof ebv)
        {
            ekq1 = (ebv)ekq1;
            b.getContentResolver().unregisterContentObserver(contentobserver);
            ekq1 = ((ebv) (ekq1)).d;
            if (ekq1 != null)
            {
                b.b(b, ekq1).b(ekq1, contentobserver);
            }
            return;
        }
        if (ekq1 instanceof ecj)
        {
            ekq1 = (ecj)ekq1;
            b.b(b, ((ecj) (ekq1)).b).b(((ecj) (ekq1)).b, contentobserver);
            return;
        } else
        {
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq1).length() + 24)).append("Unsupported collection: ").append(ekq1).toString());
        }
    }
}
