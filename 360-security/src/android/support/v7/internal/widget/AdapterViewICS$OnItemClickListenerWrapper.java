// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.internal.widget:
//            AdapterViewICS

class mWrappedListener
    implements android.widget.lickListenerWrapper
{

    private final this._cls0 mWrappedListener;
    final AdapterViewICS this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        mWrappedListener.lick(AdapterViewICS.this, view, i, l);
    }

    public ( )
    {
        this$0 = AdapterViewICS.this;
        super();
        mWrappedListener = ;
    }
}
