// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

public final class dai extends dab
{

    private boolean c;

    public dai(List list, String s, daf daf)
    {
        super(list, s, daf, false);
        c = false;
    }

    public final void a()
    {
    }

    public final void a(View view)
    {
        if (view != null && !c)
        {
            c(view);
        }
        boolean flag;
        if (view != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    public final volatile void b(View view)
    {
        super.b(view);
    }
}
