// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;

public class gpp
{

    private final Activity a = null;
    private final am b;
    private final int c;

    public gpp(am am1, int i)
    {
        b = am1;
        c = i;
    }

    public final View a(int i)
    {
        View view = b.R;
        if (view == null)
        {
            return null;
        } else
        {
            return view.findViewById(c).findViewById(i);
        }
    }
}
