// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            ViewDataBinding, ObservableList

private static class ce extends ack
    implements ce
{

    final removeListener mListener;

    public void addListener(ObservableList observablelist)
    {
        observablelist.addOnListChangedCallback(this);
    }

    public volatile void addListener(Object obj)
    {
        addListener((ObservableList)obj);
    }

    public addListener getListener()
    {
        return mListener;
    }

    public void onChanged(ObservableList observablelist)
    {
        ViewDataBinding viewdatabinding = mListener.inder();
        ObservableList observablelist1;
        if (viewdatabinding != null)
        {
            if ((observablelist1 = (ObservableList)mListener.arget()) == observablelist)
            {
                ViewDataBinding.access$500(viewdatabinding, mListener.alFieldId, observablelist1, 0);
                return;
            }
        }
    }

    public void onItemRangeChanged(ObservableList observablelist, int i, int j)
    {
        onChanged(observablelist);
    }

    public void onItemRangeInserted(ObservableList observablelist, int i, int j)
    {
        onChanged(observablelist);
    }

    public void onItemRangeMoved(ObservableList observablelist, int i, int j, int k)
    {
        onChanged(observablelist);
    }

    public void onItemRangeRemoved(ObservableList observablelist, int i, int j)
    {
        onChanged(observablelist);
    }

    public void removeListener(ObservableList observablelist)
    {
        observablelist.removeOnListChangedCallback(this);
    }

    public volatile void removeListener(Object obj)
    {
        removeListener((ObservableList)obj);
    }

    public ce(ViewDataBinding viewdatabinding, int i)
    {
        mListener = new t>(viewdatabinding, i, this);
    }
}
