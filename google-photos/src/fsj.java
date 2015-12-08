// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import java.util.Calendar;

public final class fsj
{

    public final Context a;
    public final boolean b;
    public final SparseArray c;
    public final Calendar d;
    public fsi e;

    public fsj(Context context)
    {
        this(context, true);
    }

    private fsj(Context context, boolean flag)
    {
        c = new SparseArray();
        d = ivc.a();
        a = context;
        b = true;
    }
}
