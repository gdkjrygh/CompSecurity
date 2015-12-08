// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.skype.Account;
import com.skype.android.app.LayoutExperience;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.account:
//            MyInfoFragment

final class this._cls0
    implements AsyncCallback
{

    final MyInfoFragment this$0;

    public final void done(AsyncResult asyncresult)
    {
        Object obj = (ImageView)asyncresult.b();
        asyncresult = (Bitmap)asyncresult.a();
        if (asyncresult == null)
        {
            ((ImageView) (obj)).setImageDrawable(contactUtil.a(defaultAvatars.a(com.skype.android.res.atarType.c, com.skype.android.res.atarSize.c, account.getSkypenameProp())));
        } else
        {
            ((ImageView) (obj)).setImageBitmap(asyncresult);
        }
        if (!layoutExperience.isMultipane())
        {
            if (asyncresult == null)
            {
                defaultAvatars.a(backGroundLayout, account.getSkypenameProp());
            } else
            {
                BitmapDrawable bitmapdrawable = new BitmapDrawable(asyncresult);
                if (android.os._INT >= 16)
                {
                    backGroundLayout.setBackground(bitmapdrawable);
                } else
                {
                    backGroundLayout.setBackgroundDrawable(bitmapdrawable);
                }
            }
            backGroundLayout.getBackground().setAlpha(25);
        }
        if (accountNameContainer != null)
        {
            obj = accountNameContainer;
            if (asyncresult == null)
            {
                asyncresult = null;
            } else
            {
                asyncresult = getResources().getDrawable(0x7f020070);
            }
            ((View) (obj)).setBackgroundDrawable(asyncresult);
        }
    }

    ()
    {
        this$0 = MyInfoFragment.this;
        super();
    }
}
