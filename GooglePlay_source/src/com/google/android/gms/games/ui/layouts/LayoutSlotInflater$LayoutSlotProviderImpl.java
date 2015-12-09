// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import java.util.Collection;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            LayoutSlotInflater, LayoutSlot

private static final class mLayoutSlots
    implements mLayoutSlots
{

    HashMap mLayoutSlots;

    public final LayoutSlot getLayoutSlot(String s)
    {
        return (LayoutSlot)mLayoutSlots.get(s);
    }

    public final Collection getLayoutSlots()
    {
        return mLayoutSlots.values();
    }

    public ()
    {
        mLayoutSlots = new HashMap();
    }
}
