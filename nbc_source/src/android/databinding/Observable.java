// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;


public interface Observable
{
    public static abstract class OnPropertyChangedCallback
    {

        public abstract void onPropertyChanged(Observable observable, int i);

        public OnPropertyChangedCallback()
        {
        }
    }


    public abstract void addOnPropertyChangedCallback(OnPropertyChangedCallback onpropertychangedcallback);

    public abstract void removeOnPropertyChangedCallback(OnPropertyChangedCallback onpropertychangedcallback);
}
