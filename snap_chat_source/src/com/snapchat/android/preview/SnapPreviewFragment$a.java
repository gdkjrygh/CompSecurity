// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;


// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class <init>
    implements Runnable
{

    boolean a;
    private SnapPreviewFragment b;

    public final void run()
    {
        if (!a)
        {
            SnapPreviewFragment.K(b);
        }
    }

    private (SnapPreviewFragment snappreviewfragment)
    {
        b = snappreviewfragment;
        super();
        a = false;
    }

    a(SnapPreviewFragment snappreviewfragment, byte byte0)
    {
        this(snappreviewfragment);
    }
}
