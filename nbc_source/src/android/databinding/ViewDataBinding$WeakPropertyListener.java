// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ViewDataBinding, Observable

private static class mListener extends mListener
    implements mListener
{

    final removeListener mListener;

    public void addListener(Observable observable)
    {
        observable.addOnPropertyChangedCallback(this);
    }

    public volatile void addListener(Object obj)
    {
        addListener((Observable)obj);
    }

    public addListener getListener()
    {
        return mListener;
    }

    public void onPropertyChanged(Observable observable, int i)
    {
        ViewDataBinding viewdatabinding;
        for (viewdatabinding = mListener.r(); viewdatabinding == null || (Observable)mListener.t() != observable;)
        {
            return;
        }

        ViewDataBinding.access$500(viewdatabinding, mListener.eldId, observable, i);
    }

    public void removeListener(Observable observable)
    {
        observable.removeOnPropertyChangedCallback(this);
    }

    public volatile void removeListener(Object obj)
    {
        removeListener((Observable)obj);
    }

    public (ViewDataBinding viewdatabinding, int i)
    {
        mListener = new mListener(viewdatabinding, i, this);
    }
}
