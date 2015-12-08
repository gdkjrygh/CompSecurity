// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

public class ActionBarSponsorView extends LinearLayout
{

    Configuration config;
    Picasso picasso;
    ImageView primary;
    ImageView secondary;
    AssetViewModel viewModel;

    public ActionBarSponsorView(Context context)
    {
        this(context, null);
    }

    public ActionBarSponsorView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionBarSponsorView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void bind()
    {
        String s = viewModel.asset().getSportCode();
        if (!TextUtils.isEmpty(s))
        {
            Sport sport1 = null;
            Iterator iterator = config.getSports().iterator();
            Sport sport;
            do
            {
                sport = sport1;
                if (!iterator.hasNext())
                {
                    break;
                }
                sport = (Sport)iterator.next();
            } while (!sport.getCode().equalsIgnoreCase(s));
            sport1 = sport;
            if (sport == null)
            {
                Iterator iterator1 = config.getTours().iterator();
                do
                {
                    sport1 = sport;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    sport1 = (Sport)iterator1.next();
                } while (!sport1.getCode().equalsIgnoreCase(s));
            }
            if (sport1 != null)
            {
                if (sport1.getSportAdLogo() != null)
                {
                    picasso.load((new StringBuilder()).append(sport1.getLogosBaseUrl()).append("phone/320/").append(sport1.getSportAdLogo()).toString()).into(primary);
                    primary.setVisibility(0);
                }
                if (sport1.getSportLogo() != null)
                {
                    picasso.load((new StringBuilder()).append(sport1.getLogosBaseUrl()).append("phone/320/").append(sport1.getSportLogo()).toString()).into(secondary);
                    secondary.setVisibility(0);
                    return;
                }
            }
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            PlayerActivity.component().inject(this);
            ButterKnife.bind(this);
            bind();
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
        picasso.cancelRequest(primary);
        picasso.cancelRequest(secondary);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
    }
}
