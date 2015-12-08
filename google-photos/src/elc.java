// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class elc extends mtf
{

    private final ekq a;
    private final ekk b;

    public elc(ekq ekq1, ekk ekk, int i)
    {
        super(a(i));
        a = ekq1;
        b = ekk;
    }

    public static String a(int i)
    {
        String s = String.valueOf("CoreCollectionFeatureLoadTask:");
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    protected final mue a(Context context)
    {
        context = (els)olm.a(context, els);
        mue mue1;
        try
        {
            context = (ekq)((ekr)context.a(a.a())).a(a, b).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        mue1 = new mue(true);
        mue1.a().putParcelable("com.google.android.apps.photos.core.media_collection", context);
        return mue1;
    }
}
