// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


// Referenced classes of package android.databinding:
//            MapChangeRegistry, ObservableMap

static final class hangedCallback extends ifierCallback
{

    public void onNotifyCallback(hangedCallback hangedcallback, ObservableMap observablemap, int i, Object obj)
    {
        hangedcallback.onMapChanged(observablemap, obj);
    }

    public volatile void onNotifyCallback(Object obj, Object obj1, int i, Object obj2)
    {
        onNotifyCallback((hangedCallback)obj, (ObservableMap)obj1, i, obj2);
    }

    hangedCallback()
    {
    }
}
