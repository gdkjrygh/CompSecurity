// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

final class lcw extends lcz
{

    private Uri g;
    private Bundle h;

    lcw(lcv lcv, jyn jyn, Uri uri, Bundle bundle)
    {
        g = uri;
        h = bundle;
        super(jyn);
    }

    protected final jyw a(Status status)
    {
        return new lco(status, null, 0);
    }

    protected final void a(Context context, lcs lcs1)
    {
        Object obj = new lcy(this);
        Uri uri = g;
        Bundle bundle = h;
        context.grantUriPermission("com.google.android.gms", uri, 1);
        obj = new lcx(context, uri, ((lcp) (obj)));
        try
        {
            lcs1.a(((lcp) (obj)), uri, bundle, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (lcs lcs1)
        {
            context.revokeUriPermission(uri, 1);
            throw lcs1;
        }
        // Misplaced declaration of an exception variable
        catch (lcs lcs1)
        {
            context.revokeUriPermission(uri, 1);
        }
        throw lcs1;
    }
}
