// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.graphics.Canvas;

// Referenced classes of package com.google.android.libraries.bind.data:
//            DataView, Data

public interface BindingViewGroup
    extends DataView
{

    public abstract boolean isOwnedByParent();

    public abstract void prepareForRecycling();

    public abstract void setMeasuredDimensionProxy$255f295();

    public abstract void setOwnedByParent$1385ff();

    public abstract void superDrawProxy(Canvas canvas);

    public abstract void updateBoundDataProxy(Data data);
}
