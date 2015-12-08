// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.DialogInterface;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            FbPhotoFragment

final class ag
    implements android.content.DialogInterface.OnClickListener
{

    final FbPhotoFragment a;

    ag(FbPhotoFragment fbphotofragment)
    {
        a = fbphotofragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.h();
    }
}
