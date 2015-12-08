// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class aob
    implements ann
{

    private final Uri a;
    private final Context b;
    private Object c;

    public aob(Context context, Uri uri)
    {
        b = context.getApplicationContext();
        a = uri;
    }

    protected abstract Object a(Uri uri, ContentResolver contentresolver);

    public final void a()
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        a(c);
        return;
        IOException ioexception;
        ioexception;
    }

    public final void a(amb amb, ano ano1)
    {
        amb = b.getContentResolver();
        try
        {
            c = a(a, ((ContentResolver) (amb)));
        }
        // Misplaced declaration of an exception variable
        catch (amb amb)
        {
            ano1.a(amb);
            return;
        }
        ano1.a(c);
    }

    protected abstract void a(Object obj);

    public final void b()
    {
    }

    public final amz c()
    {
        return amz.a;
    }
}
