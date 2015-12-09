// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

public abstract class czv
    implements czc
{

    final List a;
    final czb b = new czb();

    protected czv(List list)
    {
        a = list;
    }

    public abstract void a();

    public void b(View view)
    {
        b.a(view, a, this);
    }
}
