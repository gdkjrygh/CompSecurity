// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

public interface ThemedSpinnerAdapter
    extends SpinnerAdapter
{
    public static final class Helper
    {

        private final Context mContext;
        private LayoutInflater mDropDownInflater;
        private final LayoutInflater mInflater;

        public final LayoutInflater getDropDownViewInflater()
        {
            if (mDropDownInflater != null)
            {
                return mDropDownInflater;
            } else
            {
                return mInflater;
            }
        }

        public final android.content.res.Resources.Theme getDropDownViewTheme()
        {
            if (mDropDownInflater == null)
            {
                return null;
            } else
            {
                return mDropDownInflater.getContext().getTheme();
            }
        }

        public final void setDropDownViewTheme(android.content.res.Resources.Theme theme)
        {
            if (theme == null)
            {
                mDropDownInflater = null;
                return;
            }
            if (theme == mContext.getTheme())
            {
                mDropDownInflater = mInflater;
                return;
            } else
            {
                mDropDownInflater = LayoutInflater.from(new ContextThemeWrapper(mContext, theme));
                return;
            }
        }

        public Helper(Context context)
        {
            mContext = context;
            mInflater = LayoutInflater.from(context);
        }
    }


    public abstract android.content.res.Resources.Theme getDropDownViewTheme();

    public abstract void setDropDownViewTheme(android.content.res.Resources.Theme theme);
}
