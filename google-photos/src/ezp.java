// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.daydream.DreamViewFlipper;

public final class ezp
    implements Runnable
{

    private DreamViewFlipper a;

    public ezp(DreamViewFlipper dreamviewflipper)
    {
        a = dreamviewflipper;
        super();
    }

    public final void run()
    {
        if (!DreamViewFlipper.a(a))
        {
            return;
        }
        if (DreamViewFlipper.b(a))
        {
            DreamViewFlipper.c(a);
            return;
        } else
        {
            DreamViewFlipper.a(a, true);
            return;
        }
    }
}
