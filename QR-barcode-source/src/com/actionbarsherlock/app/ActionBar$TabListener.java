// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.app;

import android.support.v4.app.FragmentTransaction;

// Referenced classes of package com.actionbarsherlock.app:
//            ActionBar

public static interface 
{

    public abstract void onTabReselected( , FragmentTransaction fragmenttransaction);

    public abstract void onTabSelected( , FragmentTransaction fragmenttransaction);

    public abstract void onTabUnselected( , FragmentTransaction fragmenttransaction);
}
