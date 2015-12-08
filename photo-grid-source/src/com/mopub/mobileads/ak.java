// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            MraidActivity

final class ak
    implements com.mopub.mraid.MraidController.UseCustomCloseListener
{

    final MraidActivity a;

    ak(MraidActivity mraidactivity)
    {
        a = mraidactivity;
        super();
    }

    public final void useCustomCloseChanged(boolean flag)
    {
        if (flag)
        {
            a.c();
            return;
        } else
        {
            a.b();
            return;
        }
    }
}
