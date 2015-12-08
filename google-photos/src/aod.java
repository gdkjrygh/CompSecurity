// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

public final class aod extends aob
{

    public aod(Context context, Uri uri)
    {
        super(context, uri);
    }

    protected final Object a(Uri uri, ContentResolver contentresolver)
    {
        return contentresolver.openInputStream(uri);
    }

    protected final void a(Object obj)
    {
        ((InputStream)obj).close();
    }

    public final Class d()
    {
        return java/io/InputStream;
    }
}
