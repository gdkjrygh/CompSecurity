// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.undo;

import android.os.Parcel;
import com.cardinalblue.android.piccollage.activities.undo.a.g;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.google.b.f;
import com.squareup.a.b;

public class AddScrapOp extends com.cardinalblue.android.piccollage.UndoManager.UndoOperation
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AddScrapOp a(Parcel parcel)
        {
            return new AddScrapOp(parcel);
        }

        public AddScrapOp[] a(int i)
        {
            return new AddScrapOp[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private static final f b;
    private final BaseScrapModel a;

    protected AddScrapOp(Parcel parcel)
    {
        a = (BaseScrapModel)b.a(parcel.readString(), com/cardinalblue/android/piccollage/model/gson/BaseScrapModel);
    }

    public AddScrapOp(BaseScrapModel basescrapmodel)
    {
        a = basescrapmodel;
    }

    public void b()
    {
    }

    public void c()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new g(2, a));
    }

    public void d()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new g(1, a));
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b.a(a));
    }

    static 
    {
        b = CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3);
    }
}
