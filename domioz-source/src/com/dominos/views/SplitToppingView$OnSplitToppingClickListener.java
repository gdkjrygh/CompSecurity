// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import com.dominos.android.sdk.core.models.LabsTopping;

// Referenced classes of package com.dominos.views:
//            SplitToppingView

public interface 
{

    public abstract void onSplitToppingAdded(LabsTopping labstopping, int i, SplitToppingView splittoppingview);

    public abstract void onSplitToppingPartChanged(LabsTopping labstopping);

    public abstract void onSplitToppingRemoved(LabsTopping labstopping, SplitToppingView splittoppingview);

    public abstract void onSplitToppingWeightUpdate(LabsTopping labstopping, int i, SplitToppingView splittoppingview, int j);
}
