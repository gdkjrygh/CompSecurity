// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Set;

final class 
    implements android.os.ayState.AnswerMap._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap.getClassLoader());
          = new nit>();
        bundle.readFromParcel(parcel);
        String s;
        for (parcel = bundle.keySet().iterator(); parcel.hasNext(); .nit>(Integer.valueOf(s), bundle.getString(s)))
        {
            s = (String)parcel.next();
        }

        return ;
    }

    public final volatile Object[] newArray(int i)
    {
        return new nit>[i];
    }

    ()
    {
    }
}
