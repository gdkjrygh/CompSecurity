// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuItemView

private class mLocale
    implements TransformationMethod
{

    private Locale mLocale;
    final ActionMenuItemView this$0;

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

    public ()
    {
        this$0 = ActionMenuItemView.this;
        super();
        mLocale = getContext().getResources().getConfiguration().locale;
    }
}
