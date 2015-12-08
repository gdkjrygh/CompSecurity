// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            SwipeDismissBehavior

class it> extends android.support.v4.widget.
{

    private int mOriginalCapturedViewLeft;
    final SwipeDismissBehavior this$0;

    private boolean shouldDismiss(View view, float f)
    {
        if (f == 0.0F) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (ViewCompat.getLayoutDirection(view) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (SwipeDismissBehavior.access$200(SwipeDismissBehavior.this) != 2) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        if (SwipeDismissBehavior.access$200(SwipeDismissBehavior.this) == 0)
        {
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (f >= 0.0F)
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_64;
        if (f > 0.0F) goto _L3; else goto _L5
_L5:
        return false;
        if (SwipeDismissBehavior.access$200(SwipeDismissBehavior.this) != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f <= 0.0F)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        if (f < 0.0F) goto _L3; else goto _L6
_L6:
        return false;
_L2:
        int i = view.getLeft();
        int j = mOriginalCapturedViewLeft;
        int k = Math.round((float)view.getWidth() * SwipeDismissBehavior.access$300(SwipeDismissBehavior.this));
        if (Math.abs(i - j) < k)
        {
            return false;
        }
        if (true) goto _L3; else goto _L7
_L7:
        return false;
    }

    public int clampViewPositionHorizontal(View view, int i, int j)
    {
        int k;
        if (ViewCompat.getLayoutDirection(view) == 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (SwipeDismissBehavior.access$200(SwipeDismissBehavior.this) == 0)
        {
            if (j != 0)
            {
                k = mOriginalCapturedViewLeft - view.getWidth();
                j = mOriginalCapturedViewLeft;
            } else
            {
                k = mOriginalCapturedViewLeft;
                j = mOriginalCapturedViewLeft + view.getWidth();
            }
        } else
        if (SwipeDismissBehavior.access$200(SwipeDismissBehavior.this) == 1)
        {
            if (j != 0)
            {
                k = mOriginalCapturedViewLeft;
                j = mOriginalCapturedViewLeft + view.getWidth();
            } else
            {
                k = mOriginalCapturedViewLeft - view.getWidth();
                j = mOriginalCapturedViewLeft;
            }
        } else
        {
            k = mOriginalCapturedViewLeft - view.getWidth();
            j = mOriginalCapturedViewLeft + view.getWidth();
        }
        return SwipeDismissBehavior.access$400(k, i, j);
    }

    public int clampViewPositionVertical(View view, int i, int j)
    {
        return view.getTop();
    }

    public int getViewHorizontalDragRange(View view)
    {
        return view.getWidth();
    }

    public void onViewDragStateChanged(int i)
    {
        if (SwipeDismissBehavior.access$000(SwipeDismissBehavior.this) != null)
        {
            SwipeDismissBehavior.access$000(SwipeDismissBehavior.this).onDragStateChanged(i);
        }
    }

    public void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        float f = (float)view.getWidth() * SwipeDismissBehavior.access$500(SwipeDismissBehavior.this);
        float f1 = (float)view.getWidth() * SwipeDismissBehavior.access$600(SwipeDismissBehavior.this);
        if ((float)i <= f)
        {
            ViewCompat.setAlpha(view, 1.0F);
            return;
        }
        if ((float)i >= f1)
        {
            ViewCompat.setAlpha(view, 0.0F);
            return;
        } else
        {
            ViewCompat.setAlpha(view, SwipeDismissBehavior.access$700(0.0F, 1.0F - SwipeDismissBehavior.fraction(f, f1, i), 1.0F));
            return;
        }
    }

    public void onViewReleased(View view, float f, float f1)
    {
        int i = view.getWidth();
        boolean flag = false;
        if (shouldDismiss(view, f))
        {
            if (view.getLeft() < mOriginalCapturedViewLeft)
            {
                i = mOriginalCapturedViewLeft - i;
            } else
            {
                i = mOriginalCapturedViewLeft + i;
            }
            flag = true;
        } else
        {
            i = mOriginalCapturedViewLeft;
        }
        if (SwipeDismissBehavior.access$100(SwipeDismissBehavior.this).settleCapturedViewAt(i, view.getTop()))
        {
            ViewCompat.postOnAnimation(view, new ttleRunnable(SwipeDismissBehavior.this, view, flag));
        } else
        if (flag && SwipeDismissBehavior.access$000(SwipeDismissBehavior.this) != null)
        {
            SwipeDismissBehavior.access$000(SwipeDismissBehavior.this).onDismiss(view);
            return;
        }
    }

    public boolean tryCaptureView(View view, int i)
    {
        mOriginalCapturedViewLeft = view.getLeft();
        return true;
    }

    ttleRunnable()
    {
        this$0 = SwipeDismissBehavior.this;
        super();
    }
}
