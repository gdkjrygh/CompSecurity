// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.translate.k;

public class AbstractCard extends FrameLayout
{

    public AbstractCard(Context context, int i)
    {
        super(context);
        LayoutInflater.from(context).inflate(i, this, true);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(k.card_spacing));
    }

    protected final void a(int i, CharSequence charsequence)
    {
        ((TextView)findViewById(i)).setText(charsequence);
    }
}
