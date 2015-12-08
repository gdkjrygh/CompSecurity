// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class IcsToast extends Toast
{

    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    private static final String TAG = "Toast";

    public IcsToast(Context context)
    {
        super(context);
    }

    public static Toast makeText(Context context, int i, int j)
    {
        return makeText(context, ((CharSequence) (context.getResources().getString(i))), j);
    }

    public static Toast makeText(Context context, CharSequence charsequence, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return Toast.makeText(context, charsequence, i);
        } else
        {
            IcsToast icstoast = new IcsToast(context);
            icstoast.setDuration(i);
            context = new TextView(context);
            context.setText(charsequence);
            context.setTextColor(-1);
            context.setGravity(17);
            context.setBackgroundResource(com.actionbarsherlock.R.drawable.abs__toast_frame);
            icstoast.setView(context);
            return icstoast;
        }
    }

    public void setText(CharSequence charsequence)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            super.setText(charsequence);
        } else
        if (getView() != null)
        {
            try
            {
                ((TextView)getView()).setText(charsequence);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                Log.e("Toast", "This Toast was not created with IcsToast.makeText", charsequence);
            }
            return;
        }
    }
}
