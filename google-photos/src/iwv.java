// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class iwv extends mtf
{

    private final int a;
    private final hyw b;
    private final iww c;
    private final gaw j;

    public iwv(int i, hyw hyw1, iww iww, gaw gaw)
    {
        super("com.google.android.apps.photos.trash.delete-action-tag");
        a = i;
        b = hyw1;
        c = iww;
        j = gaw;
    }

    protected final mue a(Context context)
    {
        Object obj = b.a;
        obj = ((iyi)b.a(context, iyi, ((java.util.Collection) (obj)))).a(a, ((java.util.Collection) (obj)), j);
        context = new mue(true);
        try
        {
            ((elb) (obj)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = new mue(0, ((eke) (context)).a, null);
        }
        context.a().putParcelable("acted_media", b);
        context.a().putSerializable("message_type", c);
        return context;
    }
}
