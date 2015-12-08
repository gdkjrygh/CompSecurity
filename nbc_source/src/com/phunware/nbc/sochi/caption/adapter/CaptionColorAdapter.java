// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;
import com.phunware.nbc.sochi.data.BindingAdapter;

public class CaptionColorAdapter extends BindingAdapter
{

    private final CaptionPreviewHelper captionPreviewHelper = NBCSportsApplication.component().captionPreviewHelper();
    private final LayoutInflater inflater;
    private final String mColors[];
    private final Context mContext;
    private final String mDefaultColor;
    private final boolean mIsTelemundo = "nbclive".equals("telemundo");
    private final String mSpanishColors[] = {
        "Blanco", "Celeste", "Azul", "Verde", "Amarillo", "Magenta", "Rojo", "Negro"
    };

    public CaptionColorAdapter(Context context, String s)
    {
        mContext = context;
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mDefaultColor = s;
        mColors = mContext.getResources().getStringArray(0x7f0d0004);
    }

    public void bindView(int i, int j, View view, ViewGroup viewgroup)
    {
        viewgroup = (ImageView)view.findViewById(0x7f0f0123);
        view = (CheckedTextView)view.findViewById(0x1020014);
        String s = mColors[i];
        j = captionPreviewHelper.mapColorNameToARGB(s, 100);
        Color.red(j);
        viewgroup.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[] {
            (float)Color.red(j), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, (float)Color.green(j), 0.0F, 0.0F, 0.0F, 
            0.0F, 0.0F, (float)Color.blue(j), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F
        })));
        if (s.equalsIgnoreCase(mDefaultColor))
        {
            mContext.getString(0x7f07007b, new Object[] {
                getTranslatedItem(i)
            });
        }
        view.setText(getTranslatedItem(i));
    }

    public int getCount()
    {
        return mColors.length;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return mColors[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public String[] getItems()
    {
        return mColors;
    }

    public String getTranslatedItem(int i)
    {
        if (mIsTelemundo)
        {
            return mSpanishColors[i];
        } else
        {
            return mColors[i];
        }
    }

    public View newView(int i, ViewGroup viewgroup)
    {
        return inflater.inflate(0x7f040057, viewgroup, false);
    }
}
