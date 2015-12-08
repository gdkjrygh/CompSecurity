// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;


// Referenced classes of package com.pinterest.activity.pin.fragment:
//            CsrPickerFragment

public class I
{

    public static void inject(butterknife.rFragment rfragment, CsrPickerFragment csrpickerfragment, Object obj)
    {
        com.pinterest.fragment.tor.inject(rfragment, csrpickerfragment, obj);
        csrpickerfragment._headerVw = rfragment._headerVw(obj, 0x7f0f0133, "field '_headerVw'");
    }

    public static void reset(CsrPickerFragment csrpickerfragment)
    {
        com.pinterest.fragment.tor.reset(csrpickerfragment);
        csrpickerfragment._headerVw = null;
    }

    public I()
    {
    }
}
