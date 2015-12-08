// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.profiles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.profiles:
//            ProfileSelectionActivity

private class <init> extends BaseAdapter
{

    final ProfileSelectionActivity this$0;

    public int getCount()
    {
        return ProfileSelectionActivity.access$400(ProfileSelectionActivity.this).size();
    }

    public UserProfile getItem(int i)
    {
        return (UserProfile)ProfileSelectionActivity.access$400(ProfileSelectionActivity.this).get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = getLayoutInflater().inflate(0x7f030074, null, false);
            viewgroup.setTag(new getItem((AdvancedImageView)viewgroup.findViewById(0x7f07018b), (TextView)viewgroup.findViewById(0x7f07018c)));
        }
        view = (getItem)viewgroup.getTag();
        UserProfile userprofile = getItem(i);
        getItem(view).setText(userprofile.getProfileName());
        NetflixActivity.getImageLoader(ProfileSelectionActivity.this).showImg(this._mth0(view), userprofile.getAvatarUrl(), com.netflix.mediaclient.servicemgr..this._fld0, userprofile.getFirstName(), true, true);
        return viewgroup;
    }

    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        ProfileSelectionActivity.access$700(ProfileSelectionActivity.this);
    }

    private ()
    {
        this$0 = ProfileSelectionActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
