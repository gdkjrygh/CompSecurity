// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;

// Referenced classes of package com.google.android.gms.internal:
//            bk

public final class bl
    implements com.google.android.gms.ads.formats.a.a
{

    private final bk a;
    private final Drawable b;
    private final Uri c;

    public bl(bk bk1)
    {
        Object obj;
        obj = null;
        super();
        a = bk1;
        bk1 = a.a();
        if (bk1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        bk1 = (Drawable)d.a(bk1);
_L1:
        b = bk1;
        try
        {
            bk1 = a.b();
        }
        // Misplaced declaration of an exception variable
        catch (bk bk1)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Failed to get uri.", bk1);
            bk1 = obj;
        }
        c = bk1;
        return;
        bk1;
        com.google.android.gms.ads.internal.util.client.b.a("Failed to get drawable.", bk1);
        bk1 = null;
          goto _L1
    }

    public final Drawable a()
    {
        return b;
    }

    public final Uri b()
    {
        return c;
    }
}
