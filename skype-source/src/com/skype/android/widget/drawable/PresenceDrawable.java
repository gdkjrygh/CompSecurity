// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.skype.android.text.SymbolDrawable;
import com.skype.android.text.TypeFaceFactory;

public class PresenceDrawable extends SymbolDrawable
{

    private final Drawable c;

    public PresenceDrawable(TypeFaceFactory typefacefactory, Context context)
    {
        super(com.skype.android.widget.SymbolElement.SymbolCode.a, typefacefactory, new com.skype.android.text.SymbolDrawable.Options(1.0F));
        c = context.getResources().getDrawable(com.skype.android.widget.R.drawable.skype_avatar_presence_background);
        a(context.getResources().getDimensionPixelSize(com.skype.android.widget.R.dimen.skype_avatar_presence_small));
        a();
    }

    public void draw(Canvas canvas)
    {
        c.setBounds(getBounds());
        c.draw(canvas);
        super.draw(canvas);
    }
}
