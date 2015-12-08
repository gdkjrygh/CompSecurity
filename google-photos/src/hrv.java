// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;

public final class hrv extends mtf
{

    private final int a;

    public hrv(int i)
    {
        super("InvalidateSuggestCache");
        a = i;
    }

    protected final mue a(Context context)
    {
        ((eto)olm.a(context, eto)).c(a);
        context.getContentResolver().notifyChange(hrz.a(a), null);
        return new mue(true);
    }
}
