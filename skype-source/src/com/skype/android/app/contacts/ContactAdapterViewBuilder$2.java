// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapterViewBuilder, ContactItem

final class this._cls0
    implements AsyncCallback
{

    final ContactAdapterViewBuilder this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (asyncresult.d()) goto _L2; else goto _L1
_L1:
        TextView textview;
        CharSequence charsequence = (CharSequence)asyncresult.a();
        asyncresult = (emHolder)asyncresult.b();
        textview = ((emHolder) (asyncresult)).statusMessage;
        com.skype.lt lt = ((emHolder) (asyncresult)).contact.getAvailability();
        asyncresult = charsequence;
        if (charsequence.length() == 0)
        {
            switch (.SwitchMap.com.skype.Contact.AVAILABILITY[lt.()])
            {
            default:
                asyncresult = charsequence;
                break;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                break MISSING_BLOCK_LABEL_117;
            }
        }
_L3:
        byte byte0;
        if (TextUtils.isEmpty(asyncresult))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
        textview.setText(asyncresult);
_L2:
        return;
        asyncresult = textview.getContext().getString(0x7f080294);
          goto _L3
    }

    emHolder()
    {
        this$0 = ContactAdapterViewBuilder.this;
        super();
    }
}
