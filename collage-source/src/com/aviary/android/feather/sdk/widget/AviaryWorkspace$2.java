// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;


// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryWorkspace, AviaryWorkspaceIndicator

class b
    implements Runnable
{

    final int a;
    final int b;
    final AviaryWorkspace c;

    public void run()
    {
        if (AviaryWorkspace.c(c) != null)
        {
            AviaryWorkspace.c(c).a(a, b);
        }
    }

    icator(AviaryWorkspace aviaryworkspace, int i, int j)
    {
        c = aviaryworkspace;
        a = i;
        b = j;
        super();
    }
}
