// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.common.Objects;
import me.lyft.android.managers.ImageLoader;

public class UserImageView extends FrameLayout
{

    ImageLoader imageLoader;
    TextView partySizeTextView;
    ImageView userImageView;

    public UserImageView(Context context)
    {
        this(context, null);
    }

    public UserImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, me.lyft.android.R.styleable.UserImageView);
        boolean flag = context.getBoolean(0, false);
        context.recycle();
        initialize(flag);
    }

    private void initialize(boolean flag)
    {
        Scoop scoop = Scoop.a(this);
        scoop.b(this);
        scoop.a(getContext()).inflate(0x7f030147, this, true);
        ButterKnife.a(this, this);
        if (flag)
        {
            setPartyIndicatorDrawable(0x7f020194);
            setPartyTextSize(0x7f080009);
        }
    }

    public void loadPhoto(String s)
    {
        imageLoader.load(s).fit().centerInside().placeholder(0x7f0201fc).into(userImageView);
    }

    protected void setPartyIndicatorBackground(int i)
    {
        partySizeTextView.setBackgroundResource(i);
    }

    protected void setPartyIndicatorDrawable(int i)
    {
        partySizeTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    protected void setPartyTextSize(int i)
    {
        partySizeTextView.setTextSize(0, getResources().getDimension(i));
    }

    public void setUserPartySize(Integer integer)
    {
        boolean flag = true;
        integer = (Integer)Objects.firstNonNull(integer, Integer.valueOf(0));
        if (integer.intValue() <= 1)
        {
            flag = false;
        }
        showPartyIndicator(flag);
        partySizeTextView.setText(Integer.toString(integer.intValue()));
    }

    protected void showPartyIndicator(boolean flag)
    {
        TextView textview = partySizeTextView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }
}
