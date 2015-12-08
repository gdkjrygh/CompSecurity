// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.view.View;
import android.view.ViewStub;

// Referenced classes of package android.databinding:
//            ViewStubProxy, DataBindingUtil, ViewDataBinding

class this._cls0
    implements android.view.teListener
{

    final ViewStubProxy this$0;

    public void onInflate(ViewStub viewstub, View view)
    {
        ViewStubProxy.access$002(ViewStubProxy.this, view);
        ViewStubProxy.access$102(ViewStubProxy.this, DataBindingUtil.bind(view, viewstub.getLayoutResource()));
        ViewStubProxy.access$202(ViewStubProxy.this, null);
        if (ViewStubProxy.access$300(ViewStubProxy.this) != null)
        {
            ViewStubProxy.access$300(ViewStubProxy.this).onInflate(viewstub, view);
            ViewStubProxy.access$302(ViewStubProxy.this, null);
        }
        ViewStubProxy.access$400(ViewStubProxy.this).invalidateAll();
        ViewStubProxy.access$400(ViewStubProxy.this).forceExecuteBindings();
    }

    ner()
    {
        this$0 = ViewStubProxy.this;
        super();
    }
}
