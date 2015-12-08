// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dma;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;

// Referenced classes of package com.accuweather.android.dma:
//            DmaView

public class CustomDmaView extends DmaView
{

    public CustomDmaView(Context context)
    {
        this(context, null);
    }

    public CustomDmaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void init()
    {
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.custom_branding_bar_light, this);
        mLogo = (ImageView)findViewById(com.accuweather.android.R.id.logo);
        mText = (TextView)findViewById(com.accuweather.android.R.id.text);
        Utilities.setTypeFace(mText, Data.getRobotoCondensed());
        setOnClickListener(this);
        setLink("");
    }

    public void setUsingDarkHuafengLogo(boolean flag)
    {
        ImageView imageview = (ImageView)findViewById(com.accuweather.android.R.id.huafeng_img);
        int i;
        if (flag)
        {
            i = com.accuweather.android.R.drawable.huafeng_logo_dark;
        } else
        {
            i = com.accuweather.android.R.drawable.huafeng_logo;
        }
        imageview.setImageResource(i);
    }
}
