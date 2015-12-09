// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class a
    implements TransformationMethod
{

    private Locale a;

    public a(Context context)
    {
        a = context.getResources().getConfiguration().locale;
    }

    public final CharSequence getTransformation(CharSequence charsequence, View view)
    {
        if (charsequence != null)
        {
            return charsequence.toString().toUpperCase(a);
        } else
        {
            return null;
        }
    }

    public final void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
    {
    }
}
