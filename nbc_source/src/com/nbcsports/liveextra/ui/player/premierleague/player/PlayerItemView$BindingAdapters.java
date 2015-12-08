// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.nbcsports.liveextra.ApplicationComponent;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemView

public static class 
{

    public static void setDob(TextView textview, DateTime datetime)
    {
        if (datetime == null)
        {
            return;
        }
        if (datetime == null)
        {
            datetime = "--";
        } else
        {
            datetime = datetime.toString("dd MMM YYYY");
        }
        textview.setText(datetime);
    }

    public static void setHeight(TextView textview, Integer integer)
    {
        if (integer == null)
        {
            textview.setText("--");
            return;
        } else
        {
            Resources resources = textview.getContext().getResources();
            integer = Double.valueOf((double)integer.intValue() / 100D);
            double d = integer.doubleValue() * 39.370078700000001D;
            textview.setText(resources.getString(0x7f070149, new Object[] {
                Integer.valueOf((int)(d / 12D)), Integer.valueOf((int)(d % 12D)), integer
            }));
            return;
        }
    }

    public static void setPlayerPic(ImageView imageview, int i)
    {
        if (i == 0)
        {
            return;
        } else
        {
            NBCSportsApplication.component().picasso().load(String.format("http://stream.nbcsports.com/static/img/premier-league/mobile/players2015/%s.png", new Object[] {
                Integer.valueOf(i)
            })).error(0x7f02012d).into(imageview);
            return;
        }
    }

    public static void setTeamBackdrop(ImageView imageview, int i)
    {
        if (i == 0)
        {
            return;
        } else
        {
            NBCSportsApplication.component().picasso().load(String.format("http://stream.nbcsports.com/static/img/premier-league/mobile/teams2015/%s-bkgd.png", new Object[] {
                Integer.valueOf(i)
            })).error(0x7f02012d).into(imageview);
            return;
        }
    }

    public static void setWeight(TextView textview, Integer integer)
    {
        if (integer == null)
        {
            textview.setText("--");
            return;
        } else
        {
            textview.setText(textview.getContext().getResources().getString(0x7f07015b, new Object[] {
                Integer.valueOf((int)((double)integer.intValue() * 2.2046226199999999D)), integer
            }));
            return;
        }
    }

    public ()
    {
    }
}
