// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;

public final class omi extends oml
{

    private final Activity a;

    public omi(Activity activity, opd opd)
    {
        super(opd, omh);
        a = activity;
    }

    protected final omk a(Context context)
    {
        return new omh(context);
    }

    protected final void a(omj omj, opd opd, olm olm)
    {
        ((omg)omj).a(a, opd, olm);
    }
}
