// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.widget.CompoundButton;

// Referenced classes of package com.google.android.apps.translate.widget:
//            HandwritingInputView

final class k
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final HandwritingInputView a;

    k(HandwritingInputView handwritinginputview)
    {
        a = handwritinginputview;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        HandwritingInputView.a(a);
    }
}
