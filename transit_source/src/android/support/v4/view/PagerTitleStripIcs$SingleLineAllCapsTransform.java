// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStripIcs

private static class mLocale extends SingleLineTransformationMethod
{

    private static final String TAG = "SingleLineAllCapsTransform";
    private Locale mLocale;

    public CharSequence getTransformation(CharSequence charsequence, View view)
    {
        charsequence = super.getTransformation(charsequence, view);
        if (charsequence != null)
        {
            return charsequence.toString().toUpperCase(mLocale);
        } else
        {
            return null;
        }
    }

    public (Context context)
    {
        mLocale = context.getResources().getConfiguration().locale;
    }
}
