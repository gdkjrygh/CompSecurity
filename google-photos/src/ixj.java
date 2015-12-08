// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;

public final class ixj extends mtf
{

    private final int a;
    private final hyw b;

    public ixj(int i, hyw hyw1)
    {
        super("com.google.android.apps.photos.trash.restore-action-tag");
        a = i;
        b = hyw1;
    }

    protected final mue a(Context context)
    {
        Object obj;
        Object obj1;
        obj = b.a;
        obj1 = ((iyl)b.a(context, iyl, ((Collection) (obj)))).a(a, ((Collection) (obj)));
        obj = new mue(true);
        context = Collections.emptySet();
        obj1 = (Collection)((elb) (obj1)).a();
        context = ((Context) (obj1));
_L2:
        ((mue) (obj)).a().putParcelable("acted_media", new hyw(context));
        return ((mue) (obj));
        eke eke1;
        eke1;
        eke1 = new mue(0, eke1, null);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
