// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.settings;

import android.content.Context;
import android.util.AttributeSet;
import b;
import nzw;
import oai;

public final class PreferenceCategory extends oai
{

    public PreferenceCategory(Context context)
    {
        this(context, null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.HM);
    }

    private PreferenceCategory(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final boolean a(nzw nzw)
    {
        if (nzw instanceof PreferenceCategory)
        {
            throw new IllegalArgumentException("Cannot add a PreferenceCategory directly to a PreferenceCategory");
        } else
        {
            return super.a(nzw);
        }
    }

    public final boolean b()
    {
        return false;
    }

    public final boolean e()
    {
        return !super.b();
    }
}
