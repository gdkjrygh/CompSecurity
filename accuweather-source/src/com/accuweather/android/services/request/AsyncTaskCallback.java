// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;


public interface AsyncTaskCallback
{

    public abstract void onBackground();

    public abstract void onBackgroundProcessingError(Exception exception);

    public abstract void onPostExecute(Object obj);
}
