// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ViewDataBinding, OnRebindCallback

static final class otifierCallback extends otifierCallback
{

    public void onNotifyCallback(OnRebindCallback onrebindcallback, ViewDataBinding viewdatabinding, int i, Void void1)
    {
        i;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 29
    //                   2 44
    //                   3 50;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (!onrebindcallback.onPreBind(viewdatabinding))
        {
            ViewDataBinding.access$002(viewdatabinding, true);
            return;
        }
          goto _L1
_L3:
        onrebindcallback.onCanceled(viewdatabinding);
        return;
_L4:
        onrebindcallback.onBound(viewdatabinding);
        return;
    }

    public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
    {
        onNotifyCallback((OnRebindCallback)obj, (ViewDataBinding)obj1, i, (Void)obj2);
    }

    otifierCallback()
    {
    }
}
