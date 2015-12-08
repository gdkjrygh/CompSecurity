// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

// Referenced classes of package com.skype.android.widget:
//            PathClippedImageView, PathType, SymbolView

public class SkypeAvatarView extends RelativeLayout
{

    private PathClippedImageView a;
    private SymbolView b;
    private PathType c;

    public SkypeAvatarView(Context context)
    {
        super(context);
        a(((AttributeSet) (null)));
    }

    public SkypeAvatarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset);
    }

    public SkypeAvatarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        LayoutInflater.from(getContext()).inflate(R.layout.skype_avatar, this, true);
        a = (PathClippedImageView)findViewById(R.id.skype_avatar_image);
        c = PathType.a;
        a.setPathType(PathType.a);
        a.setBorderWidth(0);
        b = (SymbolView)findViewById(R.id.skype_avatar_presence);
        b.setSymbolCode(SymbolElement.SymbolCode.a);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        attributeset = getContext().obtainStyledAttributes(attributeset, R.styleable.SkypeAvatarView);
        int j;
        if (attributeset.getBoolean(0, true))
        {
            int i = (int)attributeset.getDimension(1, getResources().getDimension(R.dimen.skype_avatar_presence_small));
            b.setTextSize(0, i);
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)b.getLayoutParams();
            i = (int)attributeset.getDimension(3, getResources().getDimension(R.dimen.skype_avatar_presence_margin_small));
            layoutparams.setMargins(i, i, i, i);
            b.setLayoutParams(layoutparams);
            i = (int)attributeset.getDimension(2, getResources().getDimension(R.dimen.skype_avatar_presence_border_small));
            b.setPadding(i, i, i, i);
        } else
        {
            removeView(b);
        }
        j = (int)attributeset.getDimension(4, 0.0F);
        if (j != 0)
        {
            a.getLayoutParams().height = j;
            a.getLayoutParams().width = j;
        }
        j = (int)attributeset.getDimension(5, 0.0F);
        a.setBorderWidth(j);
        attributeset.getInt(9, 0);
        JVM INSTR tableswitch 0 2: default 288
    //                   0 375
    //                   1 385
    //                   2 395;
           goto _L3 _L4 _L5 _L6
_L3:
        a.setPathType(c);
        a.setClipCircleEnabled(attributeset.getBoolean(8, false));
        a.setBorderColor(attributeset.getColor(6, getResources().getColor(R.color.white)));
        a.setBorderClickedColor(attributeset.getColor(7, getResources().getColor(R.color.skype_pale_blue)));
        attributeset.recycle();
_L2:
        return;
_L4:
        c = PathType.a;
        continue; /* Loop/switch isn't completed */
_L5:
        c = PathType.c;
        continue; /* Loop/switch isn't completed */
_L6:
        c = PathType.b;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public final PathClippedImageView a()
    {
        return a;
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final SymbolView b()
    {
        return b;
    }

    public void setAlternativeShape(PathType pathtype)
    {
        PathClippedImageView pathclippedimageview = a;
        if (pathtype == null)
        {
            pathtype = c;
        }
        pathclippedimageview.setPathType(pathtype);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        a.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable)
    {
        a.setImageDrawable(drawable);
    }

    public void setPresenceVisible(boolean flag)
    {
        SymbolView symbolview = b;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        symbolview.setVisibility(i);
    }
}
