// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

public final class hyj extends mtf
{

    private final ehr a;
    private final Parcelable b;
    private final gly c;

    public hyj(ehr ehr, Parcelable parcelable, gly gly1)
    {
        super("com.google.android.apps.photos.pager.model.FindPositionTask");
        a = ehr;
        b = parcelable;
        c = gly1;
    }

    protected final mue a(Context context)
    {
        context = c.a(a, b);
        try
        {
            int i = ((Integer)context.a()).intValue();
            context = new mue(true);
            context.a().putParcelable("com.google.android.apps.photos.core.media", b);
            context.a().putInt("position", i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return context;
    }
}
