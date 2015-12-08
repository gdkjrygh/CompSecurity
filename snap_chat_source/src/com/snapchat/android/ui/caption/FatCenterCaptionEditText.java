// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import Fx;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;

// Referenced classes of package com.snapchat.android.ui.caption:
//            FatCaptionEditText, CaptionTypeEnums

public class FatCenterCaptionEditText extends FatCaptionEditText
{

    public FatCenterCaptionEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setGravity(49);
    }

    protected final void e()
    {
        super.e();
        setGravity(49);
    }

    protected final Fx k()
    {
        CaptionTypeEnums captiontypeenums = CaptionTypeEnums.FAT_CENTER_CAPTION_TYPE;
        boolean flag1 = p;
        boolean flag;
        if (j().size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new Fx(captiontypeenums, flag1, flag, A);
    }
}
