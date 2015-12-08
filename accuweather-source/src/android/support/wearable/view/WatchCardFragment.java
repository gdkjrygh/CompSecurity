// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.app.Fragment;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.wearable.view:
//            BackgroundParallaxer, WatchCardView

public abstract class WatchCardFragment extends Fragment
    implements BackgroundParallaxer
{

    private WatchCardView mCardView;

    public WatchCardFragment()
    {
    }

    public static Bundle createArguments()
    {
        return new Bundle();
    }

    public abstract Drawable getBackground();

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mCardView = new WatchCardView(viewgroup.getContext());
        mCardView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        layoutinflater = getArguments();
        if (layoutinflater.containsKey("header"))
        {
            mCardView.setHeader(layoutinflater.getString("header"));
        }
        if (layoutinflater.containsKey("description"))
        {
            mCardView.setDescription(layoutinflater.getString("description"));
        }
        if (layoutinflater.containsKey("icon"))
        {
            mCardView.setIcon(viewgroup.getResources().getDrawable(layoutinflater.getInt("icon")));
        }
        return mCardView;
    }

    public void onDestroyView()
    {
        mCardView = null;
        super.onDestroyView();
    }
}
