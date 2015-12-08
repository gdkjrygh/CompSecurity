// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.lang.ref.WeakReference;

// Referenced classes of package android.databinding:
//            ViewDataBinding

private static class mObservable extends WeakReference
{

    protected final int mLocalFieldId;
    private final erence mObservable;
    private Object mTarget;

    protected ViewDataBinding getBinder()
    {
        ViewDataBinding viewdatabinding = (ViewDataBinding)get();
        if (viewdatabinding == null)
        {
            unregister();
        }
        return viewdatabinding;
    }

    public Object getTarget()
    {
        return mTarget;
    }

    public void setTarget(Object obj)
    {
        unregister();
        mTarget = obj;
        if (mTarget != null)
        {
            mObservable.addListener(mTarget);
        }
    }

    public boolean unregister()
    {
        boolean flag = false;
        if (mTarget != null)
        {
            mObservable.removeListener(mTarget);
            flag = true;
        }
        mTarget = null;
        return flag;
    }

    public erence(ViewDataBinding viewdatabinding, int i, erence erence)
    {
        super(viewdatabinding);
        mLocalFieldId = i;
        mObservable = erence;
    }
}
