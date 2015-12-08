// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.places.internal.PlaceImpl;
import com.google.android.gms.maps.model.LatLng;

public final class mdn
    implements mdw
{

    private lhr a;

    public mdn()
    {
    }

    private void e()
    {
        if (a == null)
        {
            throw new IllegalStateException("Must call populate before accessing member variables.");
        } else
        {
            return;
        }
    }

    public final String a()
    {
        e();
        return a.a();
    }

    public final void a(Context context, Intent intent)
    {
        b.f(context, "context must not be null");
        intent = (PlaceImpl)b.a(intent, "selected_place", PlaceImpl.CREATOR);
        intent.r = lhu.a(context);
        a = intent;
    }

    public final String b()
    {
        e();
        CharSequence charsequence = a.b();
        if (charsequence == null)
        {
            return null;
        } else
        {
            return charsequence.toString();
        }
    }

    public final String c()
    {
        e();
        CharSequence charsequence = a.c();
        if (charsequence == null)
        {
            return null;
        } else
        {
            return charsequence.toString();
        }
    }

    public final meo d()
    {
        e();
        LatLng latlng = a.d();
        return new meo(latlng.b, latlng.c);
    }
}
