// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.os.Parcel;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public static class offsetY extends le
{

    public static final android.os.ler.ReflectedParcelable CREATOR = new android.os.Parcelable.Creator() {

        public OrmmaController.ResizeProperties createFromParcel(Parcel parcel)
        {
            return new OrmmaController.ResizeProperties(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public OrmmaController.ResizeProperties[] newArray(int i)
        {
            return new OrmmaController.ResizeProperties[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public boolean allowOffscreen;
    public String customClosePosition;
    public int height;
    public int offsetX;
    public int offsetY;
    public int width;


    public _cls1()
    {
        width = -1;
        height = -1;
        offsetX = -1;
        offsetY = -1;
        width = 0;
        height = 0;
        customClosePosition = "top-right";
        offsetX = 0;
        offsetY = 0;
        allowOffscreen = true;
    }

    protected allowOffscreen(Parcel parcel)
    {
        super(parcel);
        width = -1;
        height = -1;
        offsetX = -1;
        offsetY = -1;
    }
}
