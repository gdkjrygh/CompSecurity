// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ProgressHelper, TranslateXAnimator, ProgressAnimator

public class TranslateXHelper extends ProgressHelper
{

    public TranslateXHelper(int i, int j)
    {
        super(i, j);
    }

    public ProgressAnimator createAnimator(View view, float f)
    {
        return new TranslateXAnimator(view, getValueFromProportion(f), getEndPosition());
    }

    public void setValue(View view, float f)
    {
        view.setTranslationX(f);
    }
}
