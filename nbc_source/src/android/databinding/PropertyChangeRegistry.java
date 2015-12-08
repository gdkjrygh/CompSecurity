// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            CallbackRegistry, Observable

public class PropertyChangeRegistry extends CallbackRegistry
{

    private static final CallbackRegistry.NotifierCallback NOTIFIER_CALLBACK = new CallbackRegistry.NotifierCallback() {

        public void onNotifyCallback(Observable.OnPropertyChangedCallback onpropertychangedcallback, Observable observable, int i, Void void1)
        {
            onpropertychangedcallback.onPropertyChanged(observable, i);
        }

        public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
        {
            onNotifyCallback((Observable.OnPropertyChangedCallback)obj, (Observable)obj1, i, (Void)obj2);
        }

    };

    public PropertyChangeRegistry()
    {
        super(NOTIFIER_CALLBACK);
    }

    public void notifyChange(Observable observable, int i)
    {
        notifyCallbacks(observable, i, null);
    }

}
