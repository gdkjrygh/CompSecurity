// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.kohls.mcommerce.opal.wallet.util.Appconfig;
import com.kohls.mcommerce.opal.wallet.util.BarcodeCreator;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            MainActivity

class val.parent extends AsyncTask
{

    final MainActivity this$0;
    final ImageView val$img;
    final View val$parent;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient WeakReference doInBackground(Void avoid[])
    {
        return (new BarcodeCreator()).renderQRcode(Appconfig.WALLET_ID, getResources().getDisplayMetrics().widthPixels - 100, getResources().getDisplayMetrics().heightPixels / 2, 0xff000000);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((WeakReference)obj);
    }

    protected void onPostExecute(WeakReference weakreference)
    {
        if (weakreference != null)
        {
            val$img.setImageDrawable(new BitmapDrawable(getResources(), (Bitmap)weakreference.get()));
        }
        val$parent.findViewById(0x7f0d0588).setVisibility(8);
        super.onPostExecute(weakreference);
    }

    ()
    {
        this$0 = final_mainactivity;
        val$img = imageview;
        val$parent = View.this;
        super();
    }
}
