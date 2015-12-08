// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.mediacontent.PackInfo;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerTab

final class this._cls0 extends android.support.v7.widget.erTab._cls1
{

    final PickerTab this$0;

    public final int getSpanSize(int i)
    {
        com.skype.android.mediacontent.mInfo minfo = (com.skype.android.mediacontent.mInfo)PickerTab.access$100(PickerTab.this).d.get(i);
        int j = minfo.a();
        if (i - minfo.c == j - 1)
        {
            i = j % PickerTab.access$200(PickerTab.this);
            if (i > 0)
            {
                return (PickerTab.access$200(PickerTab.this) + 1) - i;
            }
        }
        return 1;
    }

    fo()
    {
        this$0 = PickerTab.this;
        super();
    }
}
