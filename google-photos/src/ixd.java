// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collection;

final class ixd extends mtf
{

    private final int a;
    private final Collection b;
    private final Class c;

    public ixd(int i, Collection collection, Class class1)
    {
        super("MoveRemotePhotosToTrashTask");
        a = i;
        b = collection;
        c = class1;
    }

    private mue g(Context context)
    {
        context = ((iyj)b.a(context, iyj, b)).a(a, b, gaw.b, 0);
        try
        {
            context.a();
            context = new mue(true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return context;
    }

    private mue h(Context context)
    {
        context = ((iyi)b.a(context, iyi, b)).a(a, b, gaw.b);
        try
        {
            context.a();
            context = new mue(true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return context;
    }

    protected final mue a(Context context)
    {
        if (iyj.equals(c))
        {
            return g(context);
        }
        if (iyi.equals(c))
        {
            return h(context);
        } else
        {
            return new mue(false);
        }
    }
}
