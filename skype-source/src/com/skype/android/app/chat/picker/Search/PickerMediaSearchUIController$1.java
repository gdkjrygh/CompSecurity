// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import java.util.Set;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            PickerMediaSearchUIController

final class this._cls0
    implements AsyncCallback
{

    final PickerMediaSearchUIController this$0;

    public final void done(AsyncResult asyncresult)
    {
        PickerMediaSearchUIController.access$000(PickerMediaSearchUIController.this, (Set)asyncresult.a());
    }

    ()
    {
        this$0 = PickerMediaSearchUIController.this;
        super();
    }
}
