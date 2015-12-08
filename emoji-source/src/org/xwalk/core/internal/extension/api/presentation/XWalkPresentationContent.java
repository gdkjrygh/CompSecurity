// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import org.xwalk.core.internal.XWalkUIClientInternal;
import org.xwalk.core.internal.XWalkViewInternal;

public class XWalkPresentationContent
{
    public static interface PresentationDelegate
    {

        public abstract void onContentClosed(XWalkPresentationContent xwalkpresentationcontent);

        public abstract void onContentLoaded(XWalkPresentationContent xwalkpresentationcontent);
    }


    public final int INVALID_PRESENTATION_ID = -1;
    private WeakReference mActivity;
    private XWalkViewInternal mContentView;
    private Context mContext;
    private PresentationDelegate mDelegate;
    private int mPresentationId;

    public XWalkPresentationContent(Context context, WeakReference weakreference, PresentationDelegate presentationdelegate)
    {
        mPresentationId = -1;
        mContext = context;
        mActivity = weakreference;
        mDelegate = presentationdelegate;
    }

    private void onContentClosed()
    {
        if (mDelegate != null)
        {
            mDelegate.onContentClosed(this);
        }
    }

    private void onContentLoaded()
    {
        if (mDelegate != null)
        {
            mDelegate.onContentLoaded(this);
        }
    }

    public void close()
    {
        mContentView.onDestroy();
        mPresentationId = -1;
        mContentView = null;
    }

    public View getContentView()
    {
        return mContentView;
    }

    public int getPresentationId()
    {
        return mPresentationId;
    }

    public void load(String s)
    {
        Object obj = (Activity)mActivity.get();
        if (obj == null)
        {
            return;
        }
        if (mContentView == null)
        {
            mContentView = new XWalkViewInternal(mContext, ((Activity) (obj)));
            obj = new XWalkUIClientInternal(mContentView) {

                final XWalkPresentationContent this$0;

                public void onJavascriptCloseWindow(XWalkViewInternal xwalkviewinternal)
                {
                    mPresentationId = -1;
                    onContentClosed();
                }

                public void onPageLoadStopped(XWalkViewInternal xwalkviewinternal, String s1, org.xwalk.core.internal.XWalkUIClientInternal.LoadStatusInternal loadstatusinternal)
                {
                    if (loadstatusinternal == org.xwalk.core.internal.XWalkUIClientInternal.LoadStatusInternal.FINISHED)
                    {
                        mPresentationId = mContentView.getContentID();
                        onContentLoaded();
                    }
                }

            
            {
                this$0 = XWalkPresentationContent.this;
                super(xwalkviewinternal);
            }
            };
            mContentView.setUIClient(((XWalkUIClientInternal) (obj)));
        }
        mContentView.load(s, null);
    }

    public void onPause()
    {
        mContentView.pauseTimers();
        mContentView.onHide();
    }

    public void onResume()
    {
        mContentView.resumeTimers();
        mContentView.onShow();
    }


/*
    static int access$002(XWalkPresentationContent xwalkpresentationcontent, int i)
    {
        xwalkpresentationcontent.mPresentationId = i;
        return i;
    }

*/



}
