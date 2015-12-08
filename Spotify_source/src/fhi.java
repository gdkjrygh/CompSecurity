// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;

public abstract class fhi extends t
{

    fhq Y;

    public fhi()
    {
        Y = new fhq();
    }

    public final fhn F()
    {
        fhn fhn1 = (fhn)h();
        if (fhn1 == null)
        {
            throw new IllegalStateException("setTargetFragment was not called when creating the ConnectDialogFragment.");
        } else
        {
            return fhn1;
        }
    }

    public final void a(Fragment fragment, int i)
    {
        if (!(fragment instanceof fhn))
        {
            throw new IllegalArgumentException("The setTargetFragment method must be called with a Fragment that is an instance of PostFragment.");
        } else
        {
            super.a(fragment, i);
            return;
        }
    }
}
