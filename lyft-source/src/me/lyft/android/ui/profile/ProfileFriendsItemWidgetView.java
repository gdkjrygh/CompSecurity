// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.managers.ImageLoader;

public class ProfileFriendsItemWidgetView extends LinearLayout
{

    TextView friendNameTextView;
    ImageView friendPhotoImageView;
    ImageLoader imageLoader;

    public ProfileFriendsItemWidgetView(Context context)
    {
        super(context);
        setOrientation(1);
        Scoop scoop = Scoop.a(this);
        scoop.b(this);
        scoop.a(context).inflate(0x7f030107, this, true);
        ButterKnife.a(this);
    }

    public void setUserInfo(String s, String s1)
    {
        friendNameTextView.setText(s);
        imageLoader.load(s1).fit().centerInside().error(0x7f0201bb).placeholder(0x7f0201bb).into(friendPhotoImageView);
    }
}
