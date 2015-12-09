// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.jcp.fragments:
//            MultipleVideosGridFragment

class ce
    implements android.content.DialogInterface.OnClickListener
{

    final MultipleVideosGridFragment a;

    ce(MultipleVideosGridFragment multiplevideosgridfragment)
    {
        a = multiplevideosgridfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.onCloseVideoClick();
    }
}
