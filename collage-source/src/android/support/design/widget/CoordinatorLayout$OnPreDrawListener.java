// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

class this._cls0
    implements android.view.nPreDrawListener
{

    final CoordinatorLayout this$0;

    public boolean onPreDraw()
    {
        dispatchOnDependentViewChanged(false);
        return true;
    }

    ()
    {
        this$0 = CoordinatorLayout.this;
        super();
    }
}
