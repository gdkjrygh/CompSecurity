// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.widget.Toast;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment

final class this._cls0
    implements AsyncCallback
{

    final ChatFragment this$0;

    public final void done(AsyncResult asyncresult)
    {
label0:
        {
            Boolean boolean1;
            boolean flag;
            boolean flag1;
            if (!asyncresult.e())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (flag)
            {
                break label0;
            }
            asyncresult = ((Map)asyncresult.a()).values().iterator();
            do
            {
                flag1 = flag;
                if (!asyncresult.hasNext())
                {
                    break label0;
                }
                boolean1 = (Boolean)asyncresult.next();
            } while (boolean1.booleanValue());
            if (!boolean1.booleanValue())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            asyncresult = getString(0x7f08044a);
            Toast.makeText(getActivity(), asyncresult, 1).show();
        }
    }

    ()
    {
        this$0 = ChatFragment.this;
        super();
    }
}
