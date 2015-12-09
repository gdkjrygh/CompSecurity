// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//            FloatingActionButton

class VisibilityChangedListener
    implements l.InternalVisibilityChangedListener
{

    final FloatingActionButton this$0;
    final VisibilityChangedListener val$listener;

    public void onHidden()
    {
        val$listener.onHidden(FloatingActionButton.this);
    }

    public void onShown()
    {
        val$listener.onShown(FloatingActionButton.this);
    }

    VisibilityChangedListener()
    {
        this$0 = final_floatingactionbutton;
        val$listener = VisibilityChangedListener.this;
        super();
    }
}
