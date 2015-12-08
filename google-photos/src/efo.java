// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;

final class efo extends mvc
{

    private final ej l = new ej(this);

    public efo(Context context)
    {
        super(context);
    }

    public final Object d()
    {
        return ((egj)olm.a(super.f, egj)).a();
    }

    protected final boolean q()
    {
        super.f.getContentResolver().registerContentObserver(egj.a, true, l);
        return true;
    }

    protected final boolean r()
    {
        super.f.getContentResolver().unregisterContentObserver(l);
        return true;
    }
}
