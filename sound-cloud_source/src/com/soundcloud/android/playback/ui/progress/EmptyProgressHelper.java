// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.view.View;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ProgressHelper, ProgressAnimator

public class EmptyProgressHelper extends ProgressHelper
{

    protected EmptyProgressHelper()
    {
        super(0, 0);
    }

    public ProgressAnimator createAnimator(View view, float f)
    {
        return null;
    }

    public void setValue(View view, float f)
    {
    }
}
