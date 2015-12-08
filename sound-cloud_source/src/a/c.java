// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import android.content.Context;
import android.view.View;

final class c extends a.a
{

    c(String s)
    {
        super(s, 0, (byte)0);
    }

    protected final View a(Object obj, int i)
    {
        return ((View)obj).findViewById(i);
    }

    public final Context b(Object obj)
    {
        return ((View)obj).getContext();
    }
}
