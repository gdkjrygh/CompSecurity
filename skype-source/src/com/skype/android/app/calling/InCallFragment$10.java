// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.skype.Account;
import com.skype.Contact;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

final class val.contact
    implements AsyncCallback
{

    final InCallFragment this$0;
    final Contact val$contact;

    public final void done(AsyncResult asyncresult)
    {
        View view;
        view = (View)asyncresult.b();
        asyncresult = (Bitmap)asyncresult.a();
        if (asyncresult == null) goto _L2; else goto _L1
_L1:
        if (!(view instanceof ImageView)) goto _L4; else goto _L3
_L3:
        ((ImageView)view).setImageBitmap(asyncresult);
_L6:
        return;
_L4:
        if (view instanceof RelativeLayout)
        {
            asyncresult = new BitmapDrawable(asyncresult);
            if (android.os.INT >= 16)
            {
                view.setBackground(asyncresult);
            } else
            {
                view.setBackgroundDrawable(asyncresult);
            }
            view.getBackground().setAlpha(25);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (view instanceof ImageView)
        {
            ((ImageView)view).setImageDrawable(contactUtil.a(val$contact, com.skype.android.res.tarSize.b));
            return;
        }
        if (view instanceof RelativeLayout)
        {
            defaultAvatars.a(view, account.getSkypenameProp());
            view.getBackground().setAlpha(25);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    ()
    {
        this$0 = final_incallfragment;
        val$contact = Contact.this;
        super();
    }
}
