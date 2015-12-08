// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class lcx extends lcq
{

    private Context a;
    private Uri b;
    private lcp c;

    lcx(Context context, Uri uri, lcp lcp1)
    {
        a = context;
        b = uri;
        c = lcp1;
        super();
    }

    public final void a(int i, Bundle bundle, int j, Intent intent)
    {
        a.revokeUriPermission(b, 1);
        c.a(i, bundle, j, intent);
    }
}
