// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.photos.remotemedia.ui.Facepile;

public final class hnz
    implements android.view.View.OnLayoutChangeListener
{

    private Facepile a;

    public hnz(Facepile facepile)
    {
        a = facepile;
        super();
    }

    public final void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        if (Facepile.a(a))
        {
            return;
        } else
        {
            Facepile.b(a);
            return;
        }
    }
}
