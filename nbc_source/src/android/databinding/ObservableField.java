// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.io.Serializable;

// Referenced classes of package android.databinding:
//            BaseObservable

public class ObservableField extends BaseObservable
    implements Serializable
{

    static final long serialVersionUID = 1L;
    private Object mValue;

    public ObservableField()
    {
    }

    public ObservableField(Object obj)
    {
        mValue = obj;
    }

    public Object get()
    {
        return mValue;
    }

    public void set(Object obj)
    {
        if (obj != mValue)
        {
            mValue = obj;
            notifyChange();
        }
    }
}
