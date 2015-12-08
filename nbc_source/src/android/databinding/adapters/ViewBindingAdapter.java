// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.view.View;

// Referenced classes of package android.databinding.adapters:
//            ListenerUtil

public class ViewBindingAdapter
{
    public static interface OnViewAttachedToWindow
    {

        public abstract void onViewAttachedToWindow(View view);
    }

    public static interface OnViewDetachedFromWindow
    {

        public abstract void onViewDetachedFromWindow(View view);
    }


    public static int FADING_EDGE_HORIZONTAL = 1;
    public static int FADING_EDGE_NONE = 0;
    public static int FADING_EDGE_VERTICAL = 2;

    public ViewBindingAdapter()
    {
    }

    public static void setClickListener(View view, android.view.View.OnClickListener onclicklistener, boolean flag)
    {
        view.setOnClickListener(onclicklistener);
        view.setClickable(flag);
    }

    public static void setListener(View view, OnViewAttachedToWindow onviewattachedtowindow)
    {
        setListener(view, ((OnViewDetachedFromWindow) (null)), onviewattachedtowindow);
    }

    public static void setListener(View view, OnViewDetachedFromWindow onviewdetachedfromwindow)
    {
        setListener(view, onviewdetachedfromwindow, ((OnViewAttachedToWindow) (null)));
    }

    public static void setListener(View view, OnViewDetachedFromWindow onviewdetachedfromwindow, OnViewAttachedToWindow onviewattachedtowindow)
    {
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            if (onviewdetachedfromwindow == null && onviewattachedtowindow == null)
            {
                onviewdetachedfromwindow = null;
            } else
            {
                onviewdetachedfromwindow = new android.view.View.OnAttachStateChangeListener(onviewattachedtowindow, onviewdetachedfromwindow) {

                    final OnViewAttachedToWindow val$attach;
                    final OnViewDetachedFromWindow val$detach;

                    public void onViewAttachedToWindow(View view1)
                    {
                        if (attach != null)
                        {
                            attach.onViewAttachedToWindow(view1);
                        }
                    }

                    public void onViewDetachedFromWindow(View view1)
                    {
                        if (detach != null)
                        {
                            detach.onViewDetachedFromWindow(view1);
                        }
                    }

            
            {
                attach = onviewattachedtowindow;
                detach = onviewdetachedfromwindow;
                super();
            }
                };
            }
            onviewattachedtowindow = (android.view.View.OnAttachStateChangeListener)ListenerUtil.trackListener(view, onviewdetachedfromwindow, com.android.databinding.library.baseAdapters.R.id.onAttachStateChangeListener);
            if (onviewattachedtowindow != null)
            {
                view.removeOnAttachStateChangeListener(onviewattachedtowindow);
            }
            if (onviewdetachedfromwindow != null)
            {
                view.addOnAttachStateChangeListener(onviewdetachedfromwindow);
            }
        }
    }

    public static void setListener(View view, android.view.View.OnLongClickListener onlongclicklistener, boolean flag)
    {
        view.setOnLongClickListener(onlongclicklistener);
        view.setLongClickable(flag);
    }

    public static void setOnClick(View view, android.view.View.OnClickListener onclicklistener, boolean flag)
    {
        view.setOnClickListener(onclicklistener);
        view.setClickable(flag);
    }

    public static void setOnLayoutChangeListener(View view, android.view.View.OnLayoutChangeListener onlayoutchangelistener, android.view.View.OnLayoutChangeListener onlayoutchangelistener1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            if (onlayoutchangelistener != null)
            {
                view.removeOnLayoutChangeListener(onlayoutchangelistener);
            }
            if (onlayoutchangelistener1 != null)
            {
                view.addOnLayoutChangeListener(onlayoutchangelistener1);
            }
        }
    }

    public static void setOnLongClick(View view, android.view.View.OnLongClickListener onlongclicklistener, boolean flag)
    {
        view.setOnLongClickListener(onlongclicklistener);
        view.setLongClickable(flag);
    }

    public static void setPadding(View view, int i)
    {
        view.setPadding(i, i, i, i);
    }

    public static void setPaddingBottom(View view, int i)
    {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void setPaddingEnd(View view, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
            return;
        } else
        {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
            return;
        }
    }

    public static void setPaddingLeft(View view, int i)
    {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void setPaddingRight(View view, int i)
    {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static void setPaddingStart(View view, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
            return;
        } else
        {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
    }

    public static void setPaddingTop(View view, int i)
    {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void setRequiresFadingEdge(View view, int i)
    {
        boolean flag;
        boolean flag1;
        if ((FADING_EDGE_VERTICAL & i) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((FADING_EDGE_HORIZONTAL & i) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.setVerticalFadingEdgeEnabled(flag);
        view.setHorizontalFadingEdgeEnabled(flag1);
    }

}
