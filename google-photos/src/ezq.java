// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.daydream.DreamViewFlipper;

public final class ezq
    implements Runnable
{

    private DreamViewFlipper a;

    public ezq(DreamViewFlipper dreamviewflipper)
    {
        a = dreamviewflipper;
        super();
    }

    public final void run()
    {
        DreamViewFlipper.d(a);
    }
}
