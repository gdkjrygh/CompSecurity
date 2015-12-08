// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ViewDataBinding, ObservableMap

private static class nce extends ck
    implements nce
{

    final removeListener mListener;

    public void addListener(ObservableMap observablemap)
    {
        observablemap.addOnMapChangedCallback(this);
    }

    public volatile void addListener(Object obj)
    {
        addListener((ObservableMap)obj);
    }

    public addListener getListener()
    {
        return mListener;
    }

    public void onMapChanged(ObservableMap observablemap, Object obj)
    {
        obj = mListener.Binder();
        if (obj == null || observablemap != mListener.Target())
        {
            return;
        } else
        {
            ViewDataBinding.access$500(((ViewDataBinding) (obj)), mListener.calFieldId, observablemap, 0);
            return;
        }
    }

    public void removeListener(ObservableMap observablemap)
    {
        observablemap.removeOnMapChangedCallback(this);
    }

    public volatile void removeListener(Object obj)
    {
        removeListener((ObservableMap)obj);
    }

    public nce(ViewDataBinding viewdatabinding, int i)
    {
        mListener = new it>(viewdatabinding, i, this);
    }
}
