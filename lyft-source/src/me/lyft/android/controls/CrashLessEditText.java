// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import me.lyft.android.logging.L;

public class CrashLessEditText extends AutoCompleteTextView
{

    public CrashLessEditText(Context context)
    {
        super(context);
    }

    public CrashLessEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CrashLessEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public CrashLessEditText(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    public Parcelable onSaveInstanceState()
    {
        Parcelable parcelable;
        try
        {
            parcelable = super.onSaveInstanceState();
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            L.e(indexoutofboundsexception, "Unable to save state on view with ID %s.", new Object[] {
                Integer.valueOf(getId())
            });
            return android.view.View.BaseSavedState.EMPTY_STATE;
        }
        return parcelable;
    }
}
