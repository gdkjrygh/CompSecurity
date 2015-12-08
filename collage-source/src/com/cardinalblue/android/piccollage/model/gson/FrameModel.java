// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.a.e;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.h;
import com.google.b.i;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class FrameModel
    implements Parcelable, IGsonable, h
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public FrameModel createFromParcel(Parcel parcel)
        {
            return new FrameModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FrameModel[] newArray(int i)
        {
            return new FrameModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }

    public static class ScrapFrameModelReaderWriter extends o
    {

        protected FrameModel fromA2(l l1, Type type, j j)
        {
            return fromA3(l1, type, j);
        }

        protected volatile Object fromA2(l l1, Type type, j j)
        {
            return fromA2(l1, type, j);
        }

        protected FrameModel fromA3(l l1, Type type, j j)
        {
            l1 = l1.m();
            return new FrameModel(e.a(l1, "center_x", 0.0F), e.a(l1, "center_y", 0.0F), e.a(l1, "base_width", f.b), e.a(l1, "base_height", f.b));
        }

        protected volatile Object fromA3(l l1, Type type, j j)
        {
            return fromA3(l1, type, j);
        }

        protected FrameModel fromV5(l l1, Type type, j j)
        {
            type = l1.m();
            l1 = e.a(type, "center", null);
            type = e.a(type, "size", null);
            if (l1 == null || type == null || l1.length != 2 || type.length != 2)
            {
                return null;
            } else
            {
                return new FrameModel(l1[0], l1[1], type[0], type[1]);
            }
        }

        protected volatile Object fromV5(l l1, Type type, j j)
        {
            return fromV5(l1, type, j);
        }

        protected l toA3(FrameModel framemodel, Type type, r r)
        {
            type = new com.google.b.o();
            type.a("center_x", Float.valueOf(framemodel.getCenterX()));
            type.a("center_y", Float.valueOf(framemodel.getCenterY()));
            type.a("base_width", Float.valueOf(framemodel.getBaseWidth()));
            type.a("base_height", Float.valueOf(framemodel.getBaseHeight()));
            return type;
        }

        protected volatile l toA3(Object obj, Type type, r r)
        {
            return toA3((FrameModel)obj, type, r);
        }

        protected l toV5(FrameModel framemodel, Type type, r r)
        {
            type = new com.google.b.o();
            r = framemodel.getCenter();
            framemodel = framemodel.getSize();
            i j = new i();
            j.a(new q(Float.valueOf(r[0])));
            j.a(new q(Float.valueOf(r[1])));
            type.a("center", j);
            r = new i();
            r.a(new q(Float.valueOf(framemodel[0])));
            r.a(new q(Float.valueOf(framemodel[1])));
            type.a("size", r);
            return type;
        }

        protected volatile l toV5(Object obj, Type type, r r)
        {
            return toV5((FrameModel)obj, type, r);
        }

        public ScrapFrameModelReaderWriter(CollageRoot.VersionEnum versionenum)
        {
            super(versionenum);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    public static final String JSON_TAG_BASE_HEIGHT = "base_height";
    public static final String JSON_TAG_BASE_WIDTH = "base_width";
    public static final String JSON_TAG_CENTER = "center";
    public static final String JSON_TAG_CENTER_X = "center_x";
    public static final String JSON_TAG_CENTER_Y = "center_y";
    public static final String JSON_TAG_SIZE = "size";
    private float mCenter[];
    private float mSize[];

    public FrameModel(float f1, float f2, float f3, float f4)
    {
        mSize = new float[2];
        mCenter = new float[2];
        mCenter[0] = f1;
        mCenter[1] = f2;
        mSize[0] = f3;
        mSize[1] = f4;
    }

    public FrameModel(Parcel parcel)
    {
        mSize = new float[2];
        mCenter = new float[2];
        readFromParcel(parcel);
    }

    public FrameModel createInstance(Type type)
    {
        return new FrameModel(0.0F, 0.0F, f.b, f.b);
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public float getBaseHeight()
    {
        return mSize[1];
    }

    public float getBaseWidth()
    {
        return mSize[0];
    }

    public float[] getCenter()
    {
        return mCenter;
    }

    public float getCenterX()
    {
        return mCenter[0];
    }

    public float getCenterY()
    {
        return mCenter[1];
    }

    public float[] getSize()
    {
        return mSize;
    }

    public void readFromParcel(Parcel parcel)
    {
        setCenterX(parcel.readFloat());
        setCenterY(parcel.readFloat());
        setBaseWidth(parcel.readFloat());
        setBaseHeights(parcel.readFloat());
    }

    public void setBaseHeights(float f1)
    {
        mSize[1] = f1;
    }

    public void setBaseWidth(float f1)
    {
        mSize[0] = f1;
    }

    public void setCenter(float af[])
    {
        if (af == null || af.length != 2)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Invalid argument for scrap center => ");
            if (af == null)
            {
                af = "null object";
            } else
            {
                af = (new StringBuilder()).append("incorrect length: ").append(af.length).toString();
            }
            throw new IllegalArgumentException(stringbuilder.append(af).toString());
        } else
        {
            mCenter = af;
            return;
        }
    }

    public void setCenterX(float f1)
    {
        mCenter[0] = f1;
    }

    public void setCenterY(float f1)
    {
        mCenter[1] = f1;
    }

    public void setSize(float af[])
    {
        if (af == null || af.length != 2)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Invalid argument for scrap size => ");
            if (af == null)
            {
                af = "null object";
            } else
            {
                af = (new StringBuilder()).append("incorrect length: ").append(af.length).toString();
            }
            throw new IllegalArgumentException(stringbuilder.append(af).toString());
        } else
        {
            mSize = af;
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(getCenterX());
        parcel.writeFloat(getCenterY());
        parcel.writeFloat(getBaseWidth());
        parcel.writeFloat(getBaseHeight());
    }

}
