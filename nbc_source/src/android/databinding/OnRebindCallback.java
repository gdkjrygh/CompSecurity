// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ViewDataBinding

public abstract class OnRebindCallback
{

    public OnRebindCallback()
    {
    }

    public void onBound(ViewDataBinding viewdatabinding)
    {
    }

    public void onCanceled(ViewDataBinding viewdatabinding)
    {
    }

    public boolean onPreBind(ViewDataBinding viewdatabinding)
    {
        return true;
    }
}
