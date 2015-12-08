// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import android.app.Activity;
import android.content.Context;
import android.view.View;

final class d extends a.a
{

    d(String s)
    {
        super(s, 1, (byte)0);
    }

    protected final View a(Object obj, int i)
    {
        return ((Activity)obj).findViewById(i);
    }

    public final Context b(Object obj)
    {
        return (Activity)obj;
    }
}
