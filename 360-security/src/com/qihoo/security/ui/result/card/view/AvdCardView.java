// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card.view;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.appbox.ui.view.RemoteIconView;
import com.qihoo.security.locale.d;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.ui.result.a;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import com.qihoo360.mobilesafe.b.f;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.s;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.result.card.view:
//            CardView

public class AvdCardView extends CardView
    implements android.view.View.OnClickListener
{

    protected AdvData a;
    protected View b;

    public AvdCardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AvdCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = context;
    }

    protected void a()
    {
        if (a.nativeAd != null)
        {
            a.nativeAd.a(b);
        }
    }

    public void a(ImageView imageview, String s1)
    {
        if (s1 != null && imageview != null)
        {
            if (imageview instanceof RemoteIconView)
            {
                ((RemoteIconView)imageview).b(s1, 0);
            } else
            if (imageview instanceof RemoteImageView)
            {
                ((RemoteImageView)imageview).a(s1, 0);
                return;
            }
        }
    }

    protected void a(RatingBar ratingbar)
    {
        if (a.starLevel != 0.0F)
        {
            ratingbar.setRating(a.starLevel);
            return;
        } else
        {
            ratingbar.setRating(5F);
            return;
        }
    }

    public void a(TextView textview, TextView textview1)
    {
        if (!TextUtils.isEmpty(a.btnDesc))
        {
            textview.setVisibility(0);
            textview.setText(a.btnDesc);
        }
        if (!TextUtils.isEmpty(a.btnName))
        {
            textview1.setText(a.btnName);
            return;
        } else
        {
            textview1.setText(d.a().a(0x7f0c01c4));
            return;
        }
    }

    public List getAssertRemoteImageViews()
    {
        return null;
    }

    public void onClick(View view)
    {
        if (!f.a() && a != null)
        {
            view = new ArrayList();
            view.add(a);
            AdvDataManager.a().a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Click, view);
            com.qihoo.security.ui.result.f.a().b();
            if (a.nativeAd != null)
            {
                if (b != null)
                {
                    b.performClick();
                    return;
                }
            } else
            if (s.b(c))
            {
                com.qihoo.security.ui.result.a.a().a(a);
                return;
            } else
            {
                q.a().a(0x7f0c00c4);
                return;
            }
        }
    }

    public void setDescriptionText(TextView textview)
    {
        if (a == null || a.des == null)
        {
            return;
        } else
        {
            textview.setText(Html.fromHtml(a.des));
            return;
        }
    }

    public void setTitleText(TextView textview)
    {
        if (a == null || a.title == null)
        {
            return;
        } else
        {
            textview.setText(Html.fromHtml(a.title));
            return;
        }
    }
}
