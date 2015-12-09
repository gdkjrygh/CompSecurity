// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import com.dominos.android.sdk.core.models.LabsTopping;

// Referenced classes of package com.dominos.views:
//            PizzaCheeseView

public interface 
{

    public abstract void onCheeseToppingAdded(LabsTopping labstopping, int i, PizzaCheeseView pizzacheeseview);

    public abstract void onCheeseToppingPartChanged(LabsTopping labstopping);

    public abstract void onCheeseToppingRemoved(LabsTopping labstopping);

    public abstract void onCheeseToppingWeightUpdate(LabsTopping labstopping, int i, String s);
}
