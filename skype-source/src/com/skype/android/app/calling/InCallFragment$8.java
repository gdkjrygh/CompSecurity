// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.Conversation;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.calling:
//            InCallFragment

final class this._cls0
    implements AsyncCallback
{

    final InCallFragment this$0;

    public final void done(AsyncResult asyncresult)
    {
        ImageView imageview = (ImageView)asyncresult.b();
        asyncresult = (Bitmap)asyncresult.a();
        if (asyncresult != null)
        {
            imageview.setImageBitmap(asyncresult);
            return;
        }
        if (isDialogCall())
        {
            imageview.setImageDrawable(contactUtil.c(InCallFragment.access$400(InCallFragment.this)));
            return;
        } else
        {
            imageview.setImageDrawable(defaultAvatars.a(com.skype.android.res.atarType.d, com.skype.android.res.atarSize.c, InCallFragment.access$200(InCallFragment.this).getIdentityProp()));
            return;
        }
    }

    ()
    {
        this$0 = InCallFragment.this;
        super();
    }
}
