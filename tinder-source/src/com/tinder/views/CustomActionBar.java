// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tinder.activities.ActivityMain;
import com.tinder.e.s;
import com.tinder.fragments.a;
import com.tinder.fragments.bd;
import com.tinder.fragments.bh;
import com.tinder.fragments.bj;
import com.tinder.fragments.bk;
import com.tinder.fragments.c;
import com.tinder.fragments.e;
import com.tinder.fragments.k;

public class CustomActionBar extends RelativeLayout
{

    private Context mCtx;
    private final SparseArray mIconContentDescriptions = new SparseArray(10);
    private ImageButton mIconLeft;
    private ImageButton mIconRightCenter;
    private ImageButton mIconRightLeft;
    private ImageButton mIconRightRight;
    private TextView mTextCenter;
    private TextView mTextCenterLeft;
    private String mTitleAddPhoto;
    private String mTitleAlbums;
    private View mViewSeparator;

    public CustomActionBar(Context context)
    {
        super(context);
        init(context);
        mIconContentDescriptions.put(0x7f0201ef, "action_bar_icon_matches");
        mIconContentDescriptions.put(0x7f0200db, "action_bar_icon_menu");
        mIconContentDescriptions.put(0x7f0201ea, "action_bar_icon_add");
        mIconContentDescriptions.put(0x7f0201eb, "action_bar_icon_back");
        mIconContentDescriptions.put(0x7f0201f0, "action_bar_icon_profile");
        mIconContentDescriptions.put(0x7f0201ed, "action_bar_icon_edit");
        mIconContentDescriptions.put(0x7f0201ec, "action_bar_icon_delete");
        mIconContentDescriptions.put(0x7f0201f1, "action_bar_icon_swap");
        mIconContentDescriptions.put(0x7f0201ee, "action_bar_icon_main");
    }

    private String getIconContentDescription(int i)
    {
        return (String)mIconContentDescriptions.get(i);
    }

    private void init(Context context)
    {
        mCtx = context;
        inflate(mCtx, 0x7f030088, this);
        mIconLeft = (ImageButton)findViewById(0x7f0e0206);
        mTextCenterLeft = (TextView)findViewById(0x7f0e0207);
        mTextCenter = (TextView)findViewById(0x7f0e0208);
        mIconRightLeft = (ImageButton)findViewById(0x7f0e020a);
        mIconRightCenter = (ImageButton)findViewById(0x7f0e020b);
        mIconRightRight = (ImageButton)findViewById(0x7f0e020c);
        mViewSeparator = findViewById(0x7f0e02e8);
        mTitleAlbums = getResources().getString(0x7f06005e);
        mTitleAddPhoto = getResources().getString(0x7f06005d);
    }

    public static void setIcon(ImageButton imagebutton, int i)
    {
        imagebutton.setImageResource(i);
    }

    public ImageButton getIconCenterRight()
    {
        return mIconRightCenter;
    }

    public ImageButton getIconLeft()
    {
        return mIconLeft;
    }

    public ImageButton getIconRight()
    {
        return mIconRightRight;
    }

    public TextView getTextCenter()
    {
        return mTextCenter;
    }

    public TextView getTextHomeAsUp()
    {
        return mTextCenterLeft;
    }

    public void setHomeAsUpText(String s)
    {
        mTextCenterLeft.setText(s);
    }

    public void setIcon(ImageButton imagebutton, final int resId, final s listenerMenuItemClick)
    {
        imagebutton.setImageResource(resId);
        imagebutton.setOnClickListener(new android.view.View.OnClickListener() {

            final CustomActionBar this$0;
            final s val$listenerMenuItemClick;
            final int val$resId;

            public void onClick(View view)
            {
                listenerMenuItemClick.onMenuItemClick(resId);
            }

            
            {
                this$0 = CustomActionBar.this;
                listenerMenuItemClick = s1;
                resId = i;
                super();
            }
        });
        imagebutton.setVisibility(0);
        imagebutton.setContentDescription(getIconContentDescription(resId));
    }

    public void setIconLeft(final int resId, final s listenerMenuItemClick)
    {
        mIconLeft.setImageResource(resId);
        mIconLeft.setOnClickListener(new android.view.View.OnClickListener() {

            final CustomActionBar this$0;
            final s val$listenerMenuItemClick;
            final int val$resId;

            public void onClick(View view)
            {
                listenerMenuItemClick.onMenuItemClick(resId);
            }

            
            {
                this$0 = CustomActionBar.this;
                listenerMenuItemClick = s1;
                resId = i;
                super();
            }
        });
        mIconLeft.setVisibility(0);
        mIconLeft.setContentDescription(getIconContentDescription(resId));
    }

    public void setMenu(Object obj)
    {
        (new StringBuilder("item=")).append(obj);
        mTextCenter.setVisibility(0);
        mTextCenterLeft.setOnClickListener(null);
        mIconRightCenter.setPadding(0, 0, 0, 0);
        if (obj instanceof k)
        {
            obj = (k)obj;
            mTextCenterLeft.setVisibility(0);
            mTextCenterLeft.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            mViewSeparator.setVisibility(0);
            setTitle(mCtx.getString(0x7f0601ce));
            setHomeAsUpText(null);
            setIcon(mIconRightCenter, 0);
            setIcon(mIconRightRight, 0x7f0201ef, new s() {

                final CustomActionBar this$0;

                public void onMenuItemClick(int i)
                {
                    Context _tmp = mCtx;
                }

            
            {
                this$0 = CustomActionBar.this;
                super();
            }
            });
            return;
        }
        if (obj instanceof bd)
        {
            setIcon(mIconLeft, 0x7f0200db, new s() {

                final CustomActionBar this$0;

                public void onMenuItemClick(int i)
                {
                    ((ActivityMain)mCtx).h();
                }

            
            {
                this$0 = CustomActionBar.this;
                super();
            }
            });
            setHomeAsUpText(null);
            setTitle(null);
            setIcon(mIconRightRight, 0x7f0201ef, new s() {

                final CustomActionBar this$0;

                public void onMenuItemClick(int i)
                {
                    Context _tmp = mCtx;
                }

            
            {
                this$0 = CustomActionBar.this;
                super();
            }
            });
            return;
        }
        if (obj instanceof e)
        {
            obj = (e)obj;
            setIcon(mIconLeft, 0x7f0201eb, ((s) (obj)));
            mTextCenterLeft.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            setHomeAsUpText(mTitleAlbums);
            setTitle("");
            mIconRightRight.setVisibility(8);
            return;
        }
        if (obj instanceof a)
        {
            obj = (a)obj;
            setIcon(mIconLeft, 0x7f0201eb, ((s) (obj)));
            mTextCenterLeft.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            setHomeAsUpText(mTitleAddPhoto);
            setTitle("");
            mIconRightRight.setVisibility(8);
            return;
        }
        if (obj instanceof bk)
        {
            obj = (bk)obj;
            setIcon(mIconLeft, 0x7f0201eb, ((s) (obj)));
            mTextCenterLeft.setVisibility(0);
            mTextCenterLeft.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            mTextCenterLeft.setText(0x7f06016e);
            setIcon(mIconRightRight, 0);
            setTitle("");
            return;
        }
        if (obj instanceof bh)
        {
            obj = (bh)obj;
            setIcon(mIconLeft, 0x7f0201eb, ((s) (obj)));
            mTextCenterLeft.setVisibility(0);
            mTextCenterLeft.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            mTextCenterLeft.setText(0x7f06016e);
            setTitle("");
            return;
        }
        if (obj instanceof bj)
        {
            obj = (bj)obj;
            setIcon(mIconLeft, 0x7f0201eb, ((s) (obj)));
            mTextCenterLeft.setVisibility(0);
            mTextCenterLeft.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            mTextCenterLeft.setText(0x7f060078);
            setTitle("");
            return;
        }
        if (obj instanceof c)
        {
            obj = (c)obj;
            setIcon(mIconLeft, 0x7f0201eb, ((s) (obj)));
            mTextCenterLeft.setVisibility(0);
            mTextCenterLeft.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            mTextCenterLeft.setText(0x7f06008b);
            setIcon(mIconRightRight, 0);
            setTitle("");
            return;
        } else
        {
            setIcon(mIconLeft, 0x7f0200db, new s() {

                final CustomActionBar this$0;

                public void onMenuItemClick(int i)
                {
                    ((ActivityMain)mCtx).h();
                }

            
            {
                this$0 = CustomActionBar.this;
                super();
            }
            });
            setHomeAsUpText(null);
            setTitle(null);
            setIcon(mIconRightCenter, 0);
            setIcon(mIconRightRight, 0x7f0201ef, new s() {

                final CustomActionBar this$0;

                public void onMenuItemClick(int i)
                {
                    if (mCtx instanceof ActivityMain)
                    {
                        ((ActivityMain)mCtx).i();
                    }
                }

            
            {
                this$0 = CustomActionBar.this;
                super();
            }
            });
            return;
        }
    }

    public void setTitle(String s)
    {
        if (s == null)
        {
            mTextCenter.setBackgroundResource(0x7f02004d);
        } else
        {
            mTextCenter.setBackgroundResource(0);
        }
        mTextCenter.setText(s);
        mTextCenter.setVisibility(0);
    }

}
