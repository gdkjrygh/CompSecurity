// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.viewbuilders;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.accuweather.android.enums.LayoutStyleType;
import com.accuweather.android.enums.WeatherLabel;
import com.accuweather.android.enums.WeatherType;

// Referenced classes of package com.accuweather.android.details.viewbuilders:
//            RowView

public class RowBuilder
{

    private Context context;

    public RowBuilder(Context context1)
    {
        context = context1;
    }

    private String buildDailyHeaderWindTextView(String s, String s1, boolean flag, boolean flag1)
    {
        boolean flag2;
        if (flag1 && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            return (new StringBuilder()).append("<font color=\"#f2930b\">").append(s).append(" / ").append(s1).append("</font>").toString();
        }
        if (flag && !flag1)
        {
            return (new StringBuilder()).append("<font color=\"#f2930b\">").append(s).append("</font>").append("<font color=\"WHITE\">").append(" / ").append(s1).append("</font>").toString();
        }
        if (!flag && flag1)
        {
            return (new StringBuilder()).append("<font color=\"WHITE\">").append(s).append("</font>").append(" / ").append("<font color=\"#f2930b\">").append(s1).append("</font>").toString();
        } else
        {
            return (new StringBuilder()).append("<font color=\"WHITE\">").append(s).append(" / ").append(s1).append("</font>").toString();
        }
    }

    private String buildHourlyHeaderWindTextView(String s, String s1)
    {
        return (new StringBuilder()).append("<font color=\"WHITE\">").append(s).append(" / ").append(s1).append("</font>").toString();
    }

    private int getImage(boolean flag, boolean flag1, WeatherType weathertype)
    {
        boolean flag2;
        if (flag || flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag2)
        {
            return weathertype.getAlarmImageResource().intValue();
        } else
        {
            return weathertype.getImageResource().intValue();
        }
    }

    public View buildDailyHeaderRow(String s, boolean flag, WeatherType weathertype, LayoutStyleType layoutstyletype)
    {
        RowView rowview = new RowView(context, layoutstyletype);
        ImageView imageview = (ImageView)rowview.findViewById(com.accuweather.android.R.id.image);
        TextView textview = (TextView)rowview.findViewById(com.accuweather.android.R.id.textview);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (layoutstyletype.equals(LayoutStyleType.RIGHT_MARGIN))
        {
            layoutparams.setMargins(0, 0, 6, 0);
        } else
        {
            layoutparams.setMargins(6, 0, 0, 0);
            rowview.setGravity(5);
        }
        imageview.setLayoutParams(layoutparams);
        textview.setText(s);
        if (flag)
        {
            imageview.setBackgroundResource(weathertype.getAlarmImageResource().intValue());
            textview.setTextColor(context.getResources().getColor(com.accuweather.android.R.color.goldenrod));
            return rowview;
        } else
        {
            imageview.setBackgroundResource(weathertype.getImageResource().intValue());
            return rowview;
        }
    }

    public View buildDailyHeaderWindRow(String s, String s1, boolean flag, boolean flag1, WeatherType weathertype, LayoutStyleType layoutstyletype)
    {
        RowView rowview = new RowView(context, layoutstyletype);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (layoutstyletype.equals(LayoutStyleType.RIGHT_MARGIN))
        {
            layoutparams.setMargins(0, 0, 6, 0);
        } else
        {
            layoutparams.setMargins(6, 0, 0, 0);
            rowview.setGravity(5);
        }
        layoutstyletype = (ImageView)rowview.findViewById(com.accuweather.android.R.id.image);
        layoutstyletype.setLayoutParams(layoutparams);
        ((TextView)rowview.findViewById(com.accuweather.android.R.id.textview)).setText(Html.fromHtml(buildDailyHeaderWindTextView(s, s1, flag, flag1)));
        layoutstyletype.setBackgroundResource(getImage(flag1, flag, weathertype));
        return rowview;
    }

    public View buildDailyTableRow(String s, boolean flag, String s1, boolean flag1, boolean flag2, LayoutStyleType layoutstyletype, WeatherLabel weatherlabel)
    {
label0:
        {
            boolean flag3 = false;
            layoutstyletype = new RowView(context, layoutstyletype);
            ImageView imageview = (ImageView)layoutstyletype.findViewById(com.accuweather.android.R.id.alarm_img);
            TextView textview = (TextView)layoutstyletype.findViewById(com.accuweather.android.R.id.label);
            TextView textview1 = (TextView)layoutstyletype.findViewById(com.accuweather.android.R.id.day_value);
            TextView textview2 = (TextView)layoutstyletype.findViewById(com.accuweather.android.R.id.night_value);
            if (flag2)
            {
                imageview.setVisibility(0);
                textview.setTextColor(context.getResources().getColor(com.accuweather.android.R.color.goldenrod));
            } else
            {
                imageview.setVisibility(4);
            }
            textview.setText(weatherlabel.getLabel());
            if (!flag)
            {
                flag2 = flag3;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        textview.setEnabled(flag2);
        textview1.setEnabled(flag);
        textview1.setText(s);
        textview2.setEnabled(flag1);
        textview2.setText(s1);
        return layoutstyletype;
    }

    public View buildHourlyHeaderRow(String s, WeatherType weathertype, LayoutStyleType layoutstyletype)
    {
        RowView rowview = new RowView(context, layoutstyletype);
        ImageView imageview = (ImageView)rowview.findViewById(com.accuweather.android.R.id.image);
        TextView textview = (TextView)rowview.findViewById(com.accuweather.android.R.id.textview);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (layoutstyletype.equals(LayoutStyleType.RIGHT_MARGIN))
        {
            layoutparams.setMargins(0, 0, 6, 0);
            rowview.setGravity(83);
        } else
        {
            layoutparams.setMargins(6, 0, 0, 0);
            rowview.setGravity(5);
        }
        imageview.setLayoutParams(layoutparams);
        textview.setText(s);
        imageview.setBackgroundResource(weathertype.getImageResource().intValue());
        return rowview;
    }

    public View buildHourlyHeaderWindRow(String s, String s1, WeatherType weathertype, LayoutStyleType layoutstyletype)
    {
        RowView rowview = new RowView(context, layoutstyletype);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (layoutstyletype.equals(LayoutStyleType.RIGHT_MARGIN))
        {
            layoutparams.setMargins(0, 0, 6, 0);
            rowview.setGravity(83);
        } else
        {
            layoutparams.setMargins(6, 0, 0, 0);
            rowview.setGravity(5);
        }
        layoutstyletype = (ImageView)rowview.findViewById(com.accuweather.android.R.id.image);
        layoutstyletype.setLayoutParams(layoutparams);
        ((TextView)rowview.findViewById(com.accuweather.android.R.id.textview)).setText(Html.fromHtml(buildHourlyHeaderWindTextView(s, s1)));
        layoutstyletype.setBackgroundResource(weathertype.getImageResource().intValue());
        return rowview;
    }

    public View buildHourlyTableRow(String s, boolean flag, LayoutStyleType layoutstyletype, WeatherLabel weatherlabel)
    {
        layoutstyletype = new RowView(context, layoutstyletype);
        TextView textview = (TextView)layoutstyletype.findViewById(com.accuweather.android.R.id.label);
        TextView textview1 = (TextView)layoutstyletype.findViewById(com.accuweather.android.R.id.value);
        textview.setText(weatherlabel.getLabel());
        textview.setEnabled(flag);
        textview1.setEnabled(flag);
        textview1.setText(s);
        return layoutstyletype;
    }
}
