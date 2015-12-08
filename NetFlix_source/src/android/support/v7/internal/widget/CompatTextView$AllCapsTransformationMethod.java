// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

// Referenced classes of package android.support.v7.internal.widget:
//            CompatTextView

private static class mLocale
    implements TransformationMethod
{

    private final Locale mLocale;

    public CharSequence getTransformation(CharSequence charsequence, View view)
    {
        if (charsequence != null)
        {
            return charsequence.toString().toUpperCase(mLocale);
        } else
        {
            return null;
        }
    }

    public void onFocusChanged(View view, CharSequence charsequence, boolean flag, int i, Rect rect)
    {
    }

    public (Context context)
    {
        mLocale = context.getResources().getConfiguration().locale;
    }
}
