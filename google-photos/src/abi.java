// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;

public final class abi extends adh
{

    public boolean a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;

    public abi(int i, int j)
    {
        super(-2, -2);
        a = false;
    }

    public abi(abi abi1)
    {
        super(abi1);
        a = abi1.a;
    }

    public abi(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public abi(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
    }
}
