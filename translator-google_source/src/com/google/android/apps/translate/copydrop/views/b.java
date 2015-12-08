// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;


// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            CopyView

final class b
    implements Runnable
{

    final CopyView a;

    b(CopyView copyview)
    {
        a = copyview;
        super();
    }

    public final void run()
    {
        a.a();
    }
}
