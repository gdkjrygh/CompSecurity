// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package com.soundcloud.android.view:
//            CustomFontLoader

public class CustomFontEditText extends EditText
{

    public CustomFontEditText(Context context)
    {
        super(context);
    }

    public CustomFontEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        CustomFontLoader.applyCustomFont(context, this, attributeset);
    }

    public CustomFontEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        CustomFontLoader.applyCustomFont(context, this, attributeset);
    }
}
