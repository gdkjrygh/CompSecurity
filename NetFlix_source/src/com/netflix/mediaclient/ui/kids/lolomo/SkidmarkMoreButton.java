// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.PressedStateHandler;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsLomoDetailActivity

public class SkidmarkMoreButton extends FrameLayout
{

    private static final String TAG = "SkidmarkMoreButton";
    private final NetflixActivity activity;
    private final List imgViews = new ArrayList(3);
    private final android.view.View.OnClickListener launchLomoDetailsClickListener = new android.view.View.OnClickListener() {

        final SkidmarkMoreButton this$0;

        public void onClick(View view)
        {
            if (lomo == null)
            {
                Log.w("SkidmarkMoreButton", "No lomo available!");
                return;
            } else
            {
                launchAndLogKidsDetailsActivity();
                return;
            }
        }

            
            {
                this$0 = SkidmarkMoreButton.this;
                super();
            }
    };
    private LoMo lomo;
    private final TextView lomoTitle = (TextView)findViewById(0x7f0700e2);
    private final PressedStateHandler pressedStateHandler = new PressedStateHandler(this);

    public SkidmarkMoreButton(NetflixActivity netflixactivity)
    {
        super(netflixactivity);
        activity = netflixactivity;
        Log.v("SkidmarkMoreButton", "Creating more button");
        netflixactivity.getLayoutInflater().inflate(0x7f03003d, this);
        setOnClickListener(launchLomoDetailsClickListener);
        imgViews.add(findAndConfigureView(0x7f0700de));
        imgViews.add(findAndConfigureView(0x7f0700df));
        imgViews.add(findAndConfigureView(0x7f0700e0));
        int i = netflixactivity.getResources().getDimensionPixelSize(0x7f0a007e);
        setPadding(i, 0, i, AndroidUtils.dipToPixels(netflixactivity, 50));
    }

    private AdvancedImageView findAndConfigureView(int i)
    {
        AdvancedImageView advancedimageview = (AdvancedImageView)findViewById(i);
        advancedimageview.setPressedStateHandlerEnabled(false);
        return advancedimageview;
    }

    private void launchAndLogKidsDetailsActivity()
    {
        LogUtils.reportUIViewCommandStarted(activity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.moreButton, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.homeScreen, new DataContext(lomo));
        KidsLomoDetailActivity.show(activity, lomo);
        LogUtils.reportUIViewCommandEnded(activity);
    }

    protected void dispatchSetPressed(boolean flag)
    {
        pressedStateHandler.handleSetPressed(flag);
        super.dispatchSetPressed(flag);
    }

    public void update(LoMo lomo1)
    {
        lomo = lomo1;
        if (lomo1 == null)
        {
            Log.w("SkidmarkMoreButton", "No lomo to use for More button");
        } else
        {
            lomoTitle.setText(lomo1.getTitle());
            if (lomo1.getMoreImages() == null)
            {
                Log.w("SkidmarkMoreButton", "No images in lomo to use for More button");
                return;
            }
            if (Log.isLoggable("SkidmarkMoreButton", 2))
            {
                Log.v("SkidmarkMoreButton", (new StringBuilder()).append("Updating for lomo: ").append(lomo1.getTitle()).append(", more images: ").append(lomo1.getMoreImages()).toString());
            }
            int i = 0;
            while (i < Math.min(lomo1.getMoreImages().size(), imgViews.size())) 
            {
                String s = (String)lomo1.getMoreImages().get(i);
                NetflixActivity.getImageLoader(activity).showImg((AdvancedImageView)imgViews.get(i), s, null, null, false, true);
                i++;
            }
        }
    }


}
