// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.DialogInterface;
import android.support.v4.app.ac;
import android.support.v4.app.aj;

// Referenced classes of package com.jcp.fragments:
//            MultipleVideosGridFragment

class by
    implements android.content.DialogInterface.OnClickListener
{

    final MultipleVideosGridFragment a;

    by(MultipleVideosGridFragment multiplevideosgridfragment)
    {
        a = multiplevideosgridfragment;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.i().f().c();
    }
}
