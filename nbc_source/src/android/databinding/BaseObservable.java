// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            Observable, PropertyChangeRegistry

public class BaseObservable
    implements Observable
{

    private transient PropertyChangeRegistry mCallbacks;

    public BaseObservable()
    {
    }

    public void addOnPropertyChangedCallback(Observable.OnPropertyChangedCallback onpropertychangedcallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (mCallbacks == null)
        {
            mCallbacks = new PropertyChangeRegistry();
        }
        mCallbacks.add(onpropertychangedcallback);
        this;
        JVM INSTR monitorexit ;
        return;
        onpropertychangedcallback;
        throw onpropertychangedcallback;
    }

    public void notifyChange()
    {
        this;
        JVM INSTR monitorenter ;
        if (mCallbacks != null)
        {
            mCallbacks.notifyCallbacks(this, 0, null);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void notifyPropertyChanged(int i)
    {
        if (mCallbacks != null)
        {
            mCallbacks.notifyCallbacks(this, i, null);
        }
    }

    public void removeOnPropertyChangedCallback(Observable.OnPropertyChangedCallback onpropertychangedcallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (mCallbacks != null)
        {
            mCallbacks.remove(onpropertychangedcallback);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        onpropertychangedcallback;
        throw onpropertychangedcallback;
    }
}
