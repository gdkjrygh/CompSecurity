// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Application;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.text.TypeFacedSpan;

// Referenced classes of package com.skype.android:
//            SkypeDialogFragment

public static class a extends android.support.v7.app.
{

    private TypeFaceFactory a;
    private Context b;

    public final android.support.v7.app. a(int i)
    {
        a(((CharSequence) (b.getString(i))));
        return this;
    }

    public final android.support.v7.app. a(CharSequence charsequence)
    {
        charsequence = new SpannableStringBuilder(charsequence);
        charsequence.setSpan(new TypeFacedSpan(a), 0, charsequence.length(), 33);
        super.(charsequence);
        return this;
    }

    public (Context context)
    {
        super(context, 0x7f0900cd);
        b = context;
        a = SegoeTypeFaceFactory.getInstance((Application)context.getApplicationContext());
    }
}
