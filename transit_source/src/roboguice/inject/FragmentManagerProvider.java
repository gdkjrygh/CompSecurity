// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.inject.Provider;

public class FragmentManagerProvider
    implements Provider
{

    protected Activity activity;

    public FragmentManagerProvider()
    {
    }

    public FragmentManager get()
    {
        return ((FragmentActivity)activity).getSupportFragmentManager();
    }

    public volatile Object get()
    {
        return get();
    }
}
