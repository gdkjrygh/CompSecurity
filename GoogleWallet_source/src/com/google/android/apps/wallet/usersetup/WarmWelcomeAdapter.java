// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            WarmWelcomeScreens

public class WarmWelcomeAdapter extends PagerAdapter
{

    private static final String TAG = com/google/android/apps/wallet/usersetup/WarmWelcomeAdapter.getSimpleName();
    private final Activity activity;
    private final Bitmap images[];

    WarmWelcomeAdapter(Activity activity1)
    {
        int i;
        boolean flag;
        activity = activity1;
        images = new Bitmap[WarmWelcomeScreens.length()];
        flag = false;
        i = 1;
_L4:
        int j;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j = 0;
_L2:
        if (j >= images.length)
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        options.inSampleSize = i;
        images[j] = BitmapFactory.decodeResource(activity1.getResources(), WarmWelcomeScreens.images[j], options);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        flag = true;
        continue; /* Loop/switch isn't completed */
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        for (int k = 0; k < images.length; k++)
        {
            if (images[k] != null)
            {
                images[k].recycle();
                images[k] = null;
            }
        }

        i <<= 1;
        WLog.w(TAG, (new StringBuilder(75)).append("Encountered OOM when decoding images, moving to scale factor of ").append(i).toString(), outofmemoryerror);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final int getCount()
    {
        return WarmWelcomeScreens.length();
    }

    public final Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = LayoutInflater.from(activity).inflate(com.google.android.apps.walletnfcrel.R.layout.warm_welcome, null, false);
        ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.WarmWelcomeHeading)).setText(WarmWelcomeScreens.headers[i]);
        ((TextView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.WarmWelcomeText)).setText(WarmWelcomeScreens.descriptions[i]);
        ((ImageView)view.findViewById(com.google.android.apps.walletnfcrel.R.id.WarmWelcomeImage)).setImageBitmap(images[i]);
        view.setBackgroundColor(activity.getResources().getColor(WarmWelcomeScreens.colors[i]));
        viewgroup.addView(view);
        return view;
    }

    public final boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

}
