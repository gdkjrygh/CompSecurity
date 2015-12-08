// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;


// Referenced classes of package com.pinterest.ui.grid:
//            PinterestAdapterView

class it> extends com.pinterest.api.model.>
{

    final PinterestAdapterView this$0;

    public void onChange(int i, boolean flag)
    {
        if (flag)
        {
            reset();
            return;
        } else
        {
            PinterestAdapterView.access$800(PinterestAdapterView.this, i);
            return;
        }
    }

    ()
    {
        this$0 = PinterestAdapterView.this;
        super();
    }
}
