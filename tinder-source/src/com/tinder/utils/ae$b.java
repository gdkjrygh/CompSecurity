// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.graphics.Bitmap;
import com.google.android.gms.wearable.Asset;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tinder.utils:
//            ae, ag, v

protected static final class nit>
{

    List a;
    List b;
    Asset c;

    public final void a(Bitmap bitmap)
    {
        try
        {
            c = ag.a(bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            v.b(bitmap.toString());
        }
    }

    public p()
    {
        c = null;
        a = new ArrayList();
        b = new ArrayList();
    }
}
