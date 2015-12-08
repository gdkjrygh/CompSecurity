// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

final class hb extends ha
{

    private hb()
    {
        super((byte)0);
    }

    hb(byte byte0)
    {
        this();
    }

    public final int a(Locale locale)
    {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
