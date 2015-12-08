// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.io.IOException;

public final class ejl extends mtf
{

    private final Uri a;

    public ejl(Uri uri)
    {
        super("DownloadMediaToCacheTask");
        a = uri;
    }

    protected final mue a(Context context)
    {
        context = context.getContentResolver().openInputStream(a);
        try
        {
            p.a(context);
            context = new mue(true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = new mue(0, context, null);
        }
        context.a().putParcelable("content_uri", a);
        return context;
        context;
        p.a(null);
        throw context;
    }
}
