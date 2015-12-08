// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.media.SoundPool;

// Referenced classes of package com.scannerfire.utils:
//            SoundControl

class eListener
    implements android.media.dCompleteListener
{

    public void onLoadComplete(SoundPool soundpool, int i, int j)
    {
        SoundControl.access$0(true);
    }

    eListener()
    {
    }
}
