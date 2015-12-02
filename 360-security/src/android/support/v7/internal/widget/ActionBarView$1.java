// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, AdapterViewICS

class this._cls0
    implements nItemSelectedListener
{

    final ActionBarView this$0;

    public void onItemSelected(AdapterViewICS adapterviewics, View view, int i, long l)
    {
        if (ActionBarView.access$000(ActionBarView.this) != null)
        {
            ActionBarView.access$000(ActionBarView.this).onBarView(i, l);
        }
    }

    public void onNothingSelected(AdapterViewICS adapterviewics)
    {
    }

    nItemSelectedListener()
    {
        this$0 = ActionBarView.this;
        super();
    }
}
