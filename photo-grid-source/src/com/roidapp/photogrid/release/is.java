// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;


// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor

final class is
    implements Runnable
{

    final ImageEditor a;

    is(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void run()
    {
        ImageEditor.C(a);
    }
}
