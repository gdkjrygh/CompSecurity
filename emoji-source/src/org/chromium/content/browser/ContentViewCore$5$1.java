// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.ViewGroup;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore, PopupZoomer

class val.zoomer
    implements Runnable
{

    static final boolean $assertionsDisabled;
    final .assertionsDisabled this$1;
    final PopupZoomer val$zoomer;

    public void run()
    {
        if (ontainerViewAtCreation.indexOfChild(val$zoomer) == -1)
        {
            ontainerViewAtCreation.addView(val$zoomer);
        } else
        if (!$assertionsDisabled)
        {
            throw new AssertionError("PopupZoomer should never be shown without being hidden");
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ContentViewCore.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$zoomer = PopupZoomer.this;
        super();
    }

    // Unreferenced inner class org/chromium/content/browser/ContentViewCore$5

/* anonymous class */
    class ContentViewCore._cls5
        implements PopupZoomer.OnVisibilityChangedListener
    {

        private final ViewGroup mContainerViewAtCreation;
        final ContentViewCore this$0;

        public void onPopupZoomerHidden(final PopupZoomer zoomer)
        {
            mContainerViewAtCreation.post(new ContentViewCore._cls5._cls2());
        }

        public void onPopupZoomerShown(PopupZoomer popupzoomer)
        {
            mContainerViewAtCreation.post(popupzoomer. new ContentViewCore._cls5._cls1());
        }


            
            {
                this$0 = ContentViewCore.this;
                super();
                mContainerViewAtCreation = ContentViewCore.access$000(ContentViewCore.this);
            }

        // Unreferenced inner class org/chromium/content/browser/ContentViewCore$5$2

/* anonymous class */
        class ContentViewCore._cls5._cls2
            implements Runnable
        {

            static final boolean $assertionsDisabled;
            final ContentViewCore._cls5 this$1;
            final PopupZoomer val$zoomer;

            public void run()
            {
                if (mContainerViewAtCreation.indexOfChild(zoomer) != -1)
                {
                    mContainerViewAtCreation.removeView(zoomer);
                    mContainerViewAtCreation.invalidate();
                } else
                if (!$assertionsDisabled)
                {
                    throw new AssertionError("PopupZoomer should never be hidden without being shown");
                }
            }

            static 
            {
                boolean flag;
                if (!org/chromium/content/browser/ContentViewCore.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $assertionsDisabled = flag;
            }

                    
                    {
                        this$1 = ContentViewCore._cls5.this;
                        zoomer = popupzoomer;
                        super();
                    }
        }

    }

}
