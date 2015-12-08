// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;

public final class fjv
    implements ekr
{

    private final Context a;

    public fjv(Context context)
    {
        a = context;
    }

    public final ejy a(Class class1)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        throw new UnsupportedOperationException("Not supported - ExternalMediaCollections have no parents.");
    }

    public final elb a(ekq ekq, ekk ekk)
    {
        throw new UnsupportedOperationException("Not supported - ExternalMediaCollections have no features.");
    }

    public final Object a()
    {
        return "ExternalMediaCore";
    }

    public final void a(ekq ekq, ContentObserver contentobserver)
    {
        if (ekq instanceof fjs)
        {
            ekq = ((fjs)ekq).b;
            if ("content".equals(((fjz) (ekq)).a.getScheme()))
            {
                a.getContentResolver().registerContentObserver(((fjz) (ekq)).a, true, contentobserver);
            }
            return;
        } else
        {
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 29)).append("Cannot register observer for ").append(ekq).toString());
        }
    }

    public final void b(ekq ekq, ContentObserver contentobserver)
    {
        if (ekq instanceof fjs)
        {
            a.getContentResolver().unregisterContentObserver(contentobserver);
            return;
        } else
        {
            ekq = String.valueOf(ekq);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq).length() + 31)).append("Cannot unregister observer for ").append(ekq).toString());
        }
    }
}
