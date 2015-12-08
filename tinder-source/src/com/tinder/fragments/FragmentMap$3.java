// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.animation.ValueAnimator;
import android.os.RemoteException;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.internal.k;
import com.google.android.m4b.maps.model.j;
import com.tinder.utils.s;

// Referenced classes of package com.tinder.fragments:
//            FragmentMap

final class c
    implements android.animation.AnimatorUpdateListener
{

    final j a;
    final LatLng b;
    final LatLng c;
    final FragmentMap d;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        j j1 = a;
        valueanimator = FragmentMap.a(d).a(valueanimator.getAnimatedFraction(), b, c);
        try
        {
            j1.a.a(valueanimator);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ValueAnimator valueanimator)
        {
            throw new RuntimeRemoteException(valueanimator);
        }
    }

    atLng(FragmentMap fragmentmap, j j1, LatLng latlng, LatLng latlng1)
    {
        d = fragmentmap;
        a = j1;
        b = latlng;
        c = latlng1;
        super();
    }
}
