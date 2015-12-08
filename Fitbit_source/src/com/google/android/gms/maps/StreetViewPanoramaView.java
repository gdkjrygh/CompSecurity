// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.internal.i;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            j, StreetViewPanoramaOptions, h

public class StreetViewPanoramaView extends FrameLayout
{

    private final b a;
    private j b;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
    /* block-local class not found */
    class b {}

        a = new b(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new b(context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        a = new b(context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        a = new b(context, streetviewpanoramaoptions);
    }

    public final j a()
    {
        if (b != null)
        {
            return b;
        }
        a.i();
        if (a.a() == null)
        {
            return null;
        }
    /* block-local class not found */
    class a {}

        try
        {
            b = new j(((a)a.a()).h().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return b;
    }

    public final void a(Bundle bundle)
    {
        a.a(bundle);
        if (a.a() == null)
        {
            com.google.android.gms.dynamic.b.b(this);
        }
    }

    public void a(h h)
    {
        am.b("getStreetViewPanoramaAsync() must be called on the main thread");
        a.a(h);
    }

    public final void b()
    {
        a.c();
    }

    public final void b(Bundle bundle)
    {
        a.b(bundle);
    }

    public final void c()
    {
        a.d();
    }

    public final void d()
    {
        a.g();
    }

    public final void e()
    {
        a.h();
    }
}
