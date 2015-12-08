// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.DialogInterface;

// Referenced classes of package com.millennialmedia.android:
//            MMSDK

static final class ickListener
    implements android.content.terface.OnClickListener
{

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }

    ickListener()
    {
    }
}
