// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.EnumSet;

public final class eqf extends mtf
{

    private final int a;
    private final EnumSet b;

    public eqf(int i, EnumSet enumset)
    {
        super("ReadPhotosFeaturesTask");
        a = i;
        b = enumset;
    }

    protected final mue a(Context context)
    {
        context = new eqe(context, a, b);
        context.d();
        mue mue1 = new mue(((nxx) (context)).l, ((nxx) (context)).n, null);
        if (!context.l() && b.contains(eqd.b))
        {
            mue1.a().putParcelableArrayList("manual_awesome_types", ((eqe) (context)).a);
        }
        return mue1;
    }
}
