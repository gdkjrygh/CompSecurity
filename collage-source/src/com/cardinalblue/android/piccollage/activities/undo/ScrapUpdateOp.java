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

public class ScrapUpdateOp extends com.cardinalblue.android.piccollage.UndoManager.UndoOperation
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ScrapUpdateOp a(Parcel parcel)
        {
            return new ScrapUpdateOp(parcel);
        }

        public ScrapUpdateOp[] a(int i)
        {
            return new ScrapUpdateOp[i];
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
    private static final f c;
    protected final BaseScrapModel a;
    protected final BaseScrapModel b;
    private final int d;

    protected ScrapUpdateOp(Parcel parcel)
    {
        d = parcel.readInt();
        a = (BaseScrapModel)c.a(parcel.readString(), com/cardinalblue/android/piccollage/model/gson/BaseScrapModel);
        b = (BaseScrapModel)c.a(parcel.readString(), com/cardinalblue/android/piccollage/model/gson/BaseScrapModel);
    }

    public ScrapUpdateOp(BaseScrapModel basescrapmodel, BaseScrapModel basescrapmodel1)
    {
        this(basescrapmodel, basescrapmodel1, 3);
    }

    public ScrapUpdateOp(BaseScrapModel basescrapmodel, BaseScrapModel basescrapmodel1, int i)
    {
        a = basescrapmodel;
        b = basescrapmodel1;
        d = i;
    }

    public void b()
    {
    }

    public void c()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new g(d, a));
    }

    public void d()
    {
        com.cardinalblue.android.piccollage.controller.d.a().c(new g(d, b));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(d);
        parcel.writeString(c.a(a));
        parcel.writeString(c.a(b));
    }

    static 
    {
        c = CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3);
    }
}
