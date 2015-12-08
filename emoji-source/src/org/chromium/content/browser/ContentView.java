// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import org.chromium.base.TraceEvent;
import org.chromium.content_public.browser.WebContents;

// Referenced classes of package org.chromium.content.browser:
//            SmartClipProvider, JellyBeanContentView, ContentViewCore

public class ContentView extends FrameLayout
    implements ContentViewCore.InternalAccessDelegate, SmartClipProvider
{

    private static final String TAG = "ContentView";
    protected final ContentViewCore mContentViewCore;

    protected ContentView(Context context, ContentViewCore contentviewcore)
    {
        super(context, null, 0x1010085);
        if (getScrollBarStyle() == 0)
        {
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        mContentViewCore = contentviewcore;
    }

    public static ContentView newInstance(Context context, ContentViewCore contentviewcore)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return new ContentView(context, contentviewcore);
        } else
        {
            return new JellyBeanContentView(context, contentviewcore);
        }
    }

    public boolean awakenScrollBars()
    {
        return super.awakenScrollBars();
    }

    public boolean awakenScrollBars(int i, boolean flag)
    {
        return mContentViewCore.awakenScrollBars(i, flag);
    }

    protected int computeHorizontalScrollExtent()
    {
        return mContentViewCore.computeHorizontalScrollExtent();
    }

    protected int computeHorizontalScrollOffset()
    {
        return mContentViewCore.computeHorizontalScrollOffset();
    }

    protected int computeHorizontalScrollRange()
    {
        return mContentViewCore.computeHorizontalScrollRange();
    }

    protected int computeVerticalScrollExtent()
    {
        return mContentViewCore.computeVerticalScrollExtent();
    }

    protected int computeVerticalScrollOffset()
    {
        return mContentViewCore.computeVerticalScrollOffset();
    }

    protected int computeVerticalScrollRange()
    {
        return mContentViewCore.computeVerticalScrollRange();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (isFocused())
        {
            return mContentViewCore.dispatchKeyEvent(keyevent);
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        return mContentViewCore.dispatchKeyEventPreIme(keyevent);
    }

    public boolean drawChild(Canvas canvas, View view, long l)
    {
        return super.drawChild(canvas, view, l);
    }

    public void extractSmartClipData(int i, int j, int k, int l)
    {
        mContentViewCore.extractSmartClipData(i, j, k, l);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mContentViewCore.onAttachedToWindow();
    }

    public boolean onCheckIsTextEditor()
    {
        return mContentViewCore.onCheckIsTextEditor();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        mContentViewCore.onConfigurationChanged(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        return mContentViewCore.onCreateInputConnection(editorinfo);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mContentViewCore.onDetachedFromWindow();
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        TraceEvent.begin();
        super.onFocusChanged(flag, i, rect);
        mContentViewCore.onFocusChanged(flag);
        TraceEvent.end();
    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        return mContentViewCore.onGenericMotionEvent(motionevent);
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        boolean flag = mContentViewCore.onHoverEvent(motionevent);
        if (!mContentViewCore.isTouchExplorationEnabled())
        {
            super.onHoverEvent(motionevent);
        }
        return flag;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        mContentViewCore.onInitializeAccessibilityEvent(accessibilityevent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        mContentViewCore.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        return mContentViewCore.onKeyUp(i, keyevent);
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        TraceEvent.begin();
        super.onSizeChanged(i, j, k, l);
        mContentViewCore.onSizeChanged(i, j, k, l);
        TraceEvent.end();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return mContentViewCore.onTouchEvent(motionevent);
    }

    protected void onVisibilityChanged(View view, int i)
    {
        super.onVisibilityChanged(view, i);
        mContentViewCore.onVisibilityChanged(view, i);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        mContentViewCore.onWindowFocusChanged(flag);
    }

    public boolean performLongClick()
    {
        return false;
    }

    public void scrollBy(int i, int j)
    {
        mContentViewCore.scrollBy(i, j);
    }

    public void scrollTo(int i, int j)
    {
        mContentViewCore.scrollTo(i, j);
    }

    public void setSmartClipResultHandler(final Handler resultHandler)
    {
        if (resultHandler == null)
        {
            mContentViewCore.setSmartClipDataListener(null);
            return;
        } else
        {
            mContentViewCore.setSmartClipDataListener(new ContentViewCore.SmartClipDataListener() {

                final ContentView this$0;
                final Handler val$resultHandler;

                public void onSmartClipDataExtracted(String s, String s1, Rect rect)
                {
                    Bundle bundle = new Bundle();
                    bundle.putString("url", mContentViewCore.getWebContents().getVisibleUrl());
                    bundle.putString("title", mContentViewCore.getWebContents().getTitle());
                    bundle.putParcelable("rect", rect);
                    bundle.putString("text", s);
                    bundle.putString("html", s1);
                    try
                    {
                        s = Message.obtain(resultHandler, 0);
                        s.setData(bundle);
                        s.sendToTarget();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        Log.e("ContentView", "Error calling handler for smart clip data: ", s);
                    }
                }

            
            {
                this$0 = ContentView.this;
                resultHandler = handler;
                super();
            }
            });
            return;
        }
    }

    public boolean super_awakenScrollBars(int i, boolean flag)
    {
        return super.awakenScrollBars(i, flag);
    }

    public boolean super_dispatchKeyEvent(KeyEvent keyevent)
    {
        return super.dispatchKeyEvent(keyevent);
    }

    public boolean super_dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        return super.dispatchKeyEventPreIme(keyevent);
    }

    public void super_onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public boolean super_onGenericMotionEvent(MotionEvent motionevent)
    {
        return super.onGenericMotionEvent(motionevent);
    }

    public boolean super_onKeyUp(int i, KeyEvent keyevent)
    {
        return super.onKeyUp(i, keyevent);
    }
}
