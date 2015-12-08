// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.daydream.DreamViewFlipper;
import java.util.ArrayList;
import java.util.Set;

public final class ezu
    implements ezv
{

    private DreamViewFlipper a;

    public ezu(DreamViewFlipper dreamviewflipper)
    {
        a = dreamviewflipper;
        super();
    }

    public final void a(Set set)
    {
        DreamViewFlipper.a(a, new ArrayList(set));
        DreamViewFlipper.b(a, 0);
        DreamViewFlipper.b(a, (ekq)DreamViewFlipper.o(a).get(DreamViewFlipper.n(a)));
    }
}
