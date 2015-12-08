// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.view.View;
import android.view.ViewStub;

// Referenced classes of package android.databinding:
//            ViewDataBinding, DataBindingUtil

public class ViewStubProxy
{

    private ViewDataBinding mContainingBinding;
    private android.view.ViewStub.OnInflateListener mOnInflateListener;
    private android.view.ViewStub.OnInflateListener mProxyListener;
    private View mRoot;
    private ViewDataBinding mViewDataBinding;
    private ViewStub mViewStub;

    public ViewStubProxy(ViewStub viewstub)
    {
        mProxyListener = new android.view.ViewStub.OnInflateListener() {

            final ViewStubProxy this$0;

            public void onInflate(ViewStub viewstub1, View view)
            {
                mRoot = view;
                mViewDataBinding = DataBindingUtil.bind(view, viewstub1.getLayoutResource());
                mViewStub = null;
                if (mOnInflateListener != null)
                {
                    mOnInflateListener.onInflate(viewstub1, view);
                    mOnInflateListener = null;
                }
                mContainingBinding.invalidateAll();
                mContainingBinding.forceExecuteBindings();
            }

            
            {
                this$0 = ViewStubProxy.this;
                super();
            }
        };
        mViewStub = viewstub;
        mViewStub.setOnInflateListener(mProxyListener);
    }

    public ViewDataBinding getBinding()
    {
        return mViewDataBinding;
    }

    public View getRoot()
    {
        return mRoot;
    }

    public ViewStub getViewStub()
    {
        return mViewStub;
    }

    public boolean isInflated()
    {
        return mRoot != null;
    }

    public void setContainingBinding(ViewDataBinding viewdatabinding)
    {
        mContainingBinding = viewdatabinding;
    }

    public void setOnInflateListener(android.view.ViewStub.OnInflateListener oninflatelistener)
    {
        if (mViewStub != null)
        {
            mOnInflateListener = oninflatelistener;
        }
    }


/*
    static View access$002(ViewStubProxy viewstubproxy, View view)
    {
        viewstubproxy.mRoot = view;
        return view;
    }

*/


/*
    static ViewDataBinding access$102(ViewStubProxy viewstubproxy, ViewDataBinding viewdatabinding)
    {
        viewstubproxy.mViewDataBinding = viewdatabinding;
        return viewdatabinding;
    }

*/


/*
    static ViewStub access$202(ViewStubProxy viewstubproxy, ViewStub viewstub)
    {
        viewstubproxy.mViewStub = viewstub;
        return viewstub;
    }

*/



/*
    static android.view.ViewStub.OnInflateListener access$302(ViewStubProxy viewstubproxy, android.view.ViewStub.OnInflateListener oninflatelistener)
    {
        viewstubproxy.mOnInflateListener = oninflatelistener;
        return oninflatelistener;
    }

*/

}
