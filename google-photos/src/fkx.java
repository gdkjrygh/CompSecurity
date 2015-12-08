// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

public final class fkx extends mtf
{

    private final int a;
    private final ekq b;
    private final hpk c;

    public fkx(int i, int j, ekq ekq, hpk hpk)
    {
        super(a(i));
        a = j;
        b = ekq;
        c = hpk;
    }

    public static String a(int i)
    {
        String s = String.valueOf("FindMediaTask:");
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    protected final mue a(Context context)
    {
        context = ((fkw)b.a(context, fkw, b)).a(a, b, c);
        mue mue1;
        try
        {
            mue1 = new mue(true);
            mue1.a().putParcelable("com.google.android.apps.photos.core.media", (Parcelable)context.a());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return mue1;
    }
}
