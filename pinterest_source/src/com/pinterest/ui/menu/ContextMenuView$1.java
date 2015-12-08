// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;


// Referenced classes of package com.pinterest.ui.menu:
//            ContextMenuItemView, ContextMenuView

class val.originCenterY
    implements Runnable
{

    final ContextMenuView this$0;
    final float val$initialCenterX;
    final float val$initialCenterY;
    final float val$originCenterX;
    final float val$originCenterY;
    final ContextMenuItemView val$view;

    public void run()
    {
        val$view.centerAround(val$initialCenterX, val$initialCenterY);
        class _cls1
            implements SpringLinearLayout.AnimListener
        {

            final ContextMenuView._cls1 this$1;

            public void onAnimationCancel()
            {
            }

            public void onAnimationComplete()
            {
                ContextMenuView.access$002(this$0, true);
            }

            _cls1()
            {
                this$1 = ContextMenuView._cls1.this;
                super();
            }
        }

        _cls1 _lcls1 = new _cls1();
        val$view.setProperty(1, 0, val$originCenterX - val$initialCenterX, 0.0F, 0.7F, 0.2F, _lcls1);
        val$view.setProperty(1, 1, val$originCenterY - val$initialCenterY, 0.0F, 0.7F, 0.2F, _lcls1);
        val$view.setProperty(1, 2, 0.0F, 0.79F, 0.7F, 0.2F, null);
        val$view.setPivotX(ContextMenuView.access$100(ContextMenuView.this) - val$view.getX());
        val$view.setPivotY(ContextMenuView.access$200(ContextMenuView.this) - val$view.getY());
    }

    w()
    {
        this$0 = final_contextmenuview;
        val$view = contextmenuitemview;
        val$initialCenterX = f;
        val$initialCenterY = f1;
        val$originCenterX = f2;
        val$originCenterY = F.this;
        super();
    }
}
