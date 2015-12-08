// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.Iterator;

public final class gzm
    implements Iterable
{

    private final View a;

    public gzm(View view)
    {
        a = view;
    }

    public final Iterator iterator()
    {
        return new gzn(a);
    }
}
