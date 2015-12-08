// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class an extends av
{

    private am a;

    an(am am1)
    {
        a = am1;
        super();
    }

    public final View a(int i)
    {
        if (a.R == null)
        {
            throw new IllegalStateException("Fragment does not have a view");
        } else
        {
            return a.R.findViewById(i);
        }
    }

    public final boolean a()
    {
        return a.R != null;
    }
}
