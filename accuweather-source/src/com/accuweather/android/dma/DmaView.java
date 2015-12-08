// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.dma;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.accuweather.android.models.DmaModel;
import com.accuweather.android.models.WeatherDataModel;
import com.accuweather.android.models.location.LocationModel;
import com.accuweather.android.utilities.Data;
import com.accuweather.android.utilities.Utilities;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import java.util.HashMap;
import java.util.Locale;

public class DmaView extends LinearLayout
    implements android.view.View.OnClickListener
{
    private class DmaImageLoadingListener
        implements ImageLoadingListener
    {

        final DmaView this$0;

        public void onLoadingCancelled(String s, View view)
        {
            mLogo.setVisibility(8);
        }

        public void onLoadingComplete(String s, View view, Bitmap bitmap)
        {
            mLogo.setVisibility(0);
        }

        public void onLoadingFailed(String s, View view, FailReason failreason)
        {
            mLogo.setVisibility(8);
        }

        public void onLoadingStarted(String s, View view)
        {
        }

        private DmaImageLoadingListener()
        {
            this$0 = DmaView.this;
            super();
        }

    }

    public static interface IDmaListener
    {

        public abstract void onDmaClicked(String s);
    }


    private String mLinkUrl;
    private IDmaListener mListener;
    protected ImageView mLogo;
    protected TextView mText;

    public DmaView(Context context)
    {
        this(context, null);
    }

    public DmaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private int getBackgroundColorResourceId(boolean flag)
    {
        if (flag)
        {
            return getResources().getColor(0x106000c);
        } else
        {
            return 0xffffff;
        }
    }

    private DmaModel getDmaModel(Data data, LocationModel locationmodel)
    {
        if (Utilities.shouldDmaBeExcluded(locationmodel.getDmaId(), locationmodel.getPostalCode()))
        {
            locationmodel = "";
        } else
        {
            locationmodel = locationmodel.getDmaId();
        }
        return (DmaModel)data.getDmaModels().get(locationmodel);
    }

    private String getImageUrl(DmaModel dmamodel)
    {
        if (dmamodel != null)
        {
            return dmamodel.getMobileLogo();
        } else
        {
            return null;
        }
    }

    private String getLink(DmaModel dmamodel)
    {
        if (dmamodel != null)
        {
            return dmamodel.getMobileUrl();
        } else
        {
            return null;
        }
    }

    private int getLogoImageResourceId(boolean flag)
    {
        if (flag)
        {
            return com.accuweather.android.R.drawable.accuweatherlogo_dark;
        } else
        {
            return com.accuweather.android.R.drawable.accuweatherlogo;
        }
    }

    private String getText(DmaModel dmamodel)
    {
        if (dmamodel != null)
        {
            return getContext().getString(com.accuweather.android.R.string.InPartnershipWith);
        } else
        {
            return null;
        }
    }

    private int getTextColorResourceId(boolean flag)
    {
        if (flag)
        {
            return getResources().getColor(0x106000b);
        } else
        {
            return getResources().getColor(com.accuweather.android.R.color.primary_text);
        }
    }

    private boolean isDeviceLanguageEnglish()
    {
        return getContext().getResources().getConfiguration().locale.getDisplayLanguage().contains(Locale.ENGLISH.getDisplayLanguage());
    }

    protected void init()
    {
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.branding_bar_light, this);
        mLogo = (ImageView)findViewById(com.accuweather.android.R.id.logo);
        mText = (TextView)findViewById(com.accuweather.android.R.id.text);
        setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if (mLinkUrl != null && mListener != null)
        {
            mListener.onDmaClicked(mLinkUrl);
        }
    }

    public void setBackgroundColor(int i)
    {
        findViewById(com.accuweather.android.R.id.content).setBackgroundColor(i);
    }

    public void setDmaListener(IDmaListener idmalistener)
    {
        mListener = idmalistener;
    }

    public void setImageUrl(String s)
    {
        if (s == null || TextUtils.isEmpty(s))
        {
            mLogo.setImageBitmap(null);
            mLogo.setVisibility(8);
            return;
        } else
        {
            ImageLoader.getInstance().displayImage(s, mLogo, new DmaImageLoadingListener());
            return;
        }
    }

    public void setLink(String s)
    {
        mLinkUrl = s;
    }

    public void setText(String s)
    {
        if (TextUtils.isEmpty(s) || !isDeviceLanguageEnglish())
        {
            mText.setVisibility(8);
            return;
        } else
        {
            mText.setVisibility(0);
            mText.setText(s);
            return;
        }
    }

    public void setTextColor(int i)
    {
        mText.setTextColor(i);
    }

    public void setUsingDarkLogo(boolean flag)
    {
        ((ImageView)findViewById(com.accuweather.android.R.id.accuweather_logo)).setImageResource(getLogoImageResourceId(flag));
    }

    public void updateDma(WeatherDataModel weatherdatamodel, Data data, boolean flag, LocationModel locationmodel)
    {
        weatherdatamodel = getDmaModel(data, locationmodel);
        setImageUrl(getImageUrl(weatherdatamodel));
        setText(getText(weatherdatamodel));
        setLink(getLink(weatherdatamodel));
        setTextColor(getTextColorResourceId(flag));
        setBackgroundColor(getBackgroundColorResourceId(flag));
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setUsingDarkLogo(flag);
    }
}
