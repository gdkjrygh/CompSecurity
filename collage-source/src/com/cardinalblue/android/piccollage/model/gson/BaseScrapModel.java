// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.view.h;
import com.cardinalblue.android.piccollage.view.k;
import com.cardinalblue.android.piccollage.view.n;
import com.cardinalblue.android.piccollage.view.o;
import com.google.b.j;
import com.google.b.l;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            FrameModel, TagModel, VideoScrapModel, ImageScrapModel, 
//            CollageRoot, TextScrapModel, ClippingPathModel

public class BaseScrapModel
    implements Parcelable
{
    public static class ScrapModelReaderWriter extends com.cardinalblue.android.piccollage.model.o
    {

        private BaseScrapModel doDeserialize(l l1, Type type, j j1)
            throws p
        {
            type = l1.m().c("scrap_type").c();
            if ("image".equals(type))
            {
                return (BaseScrapModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/ImageScrapModel);
            }
            if (VideoScrapModel.TYPE_VIDEO_SCRAP.equals(type))
            {
                return (BaseScrapModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/VideoScrapModel);
            }
            if (TextScrapModel.TYPE_TEXT_SCRAP.equals(type))
            {
                return (BaseScrapModel)j1.a(l1, com/cardinalblue/android/piccollage/model/gson/TextScrapModel);
            } else
            {
                return null;
            }
        }

        private l doSerialzie(BaseScrapModel basescrapmodel, r r1)
        {
            if (basescrapmodel instanceof VideoScrapModel)
            {
                return r1.a(basescrapmodel, com/cardinalblue/android/piccollage/model/gson/VideoScrapModel);
            }
            if (basescrapmodel instanceof ImageScrapModel)
            {
                return r1.a(basescrapmodel, com/cardinalblue/android/piccollage/model/gson/ImageScrapModel);
            }
            if (basescrapmodel instanceof TextScrapModel)
            {
                return r1.a(basescrapmodel, com/cardinalblue/android/piccollage/model/gson/TextScrapModel);
            } else
            {
                return null;
            }
        }

        protected BaseScrapModel fromA2(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected volatile Object fromA2(l l1, Type type, j j1)
        {
            return fromA2(l1, type, j1);
        }

        protected BaseScrapModel fromA3(l l1, Type type, j j1)
        {
            type = doDeserialize(l1, type, j1);
            if (type != null)
            {
                l1 = l1.m();
                if (l1.b("frame_slot_number"))
                {
                    type.setFrameSlotNumber(l1.c("frame_slot_number").g());
                }
                if (type instanceof ImageScrapModel)
                {
                    if (((ImageScrapModel)type).isBackground())
                    {
                        type.setFrameSlotNumber(-1);
                    }
                    l1 = ((ImageScrapModel)type).getClippingPath();
                    if (l1 != null)
                    {
                        l1.setScrapSize((int)type.getFrame().getBaseWidth(), (int)type.getFrame().getBaseHeight());
                    }
                }
            }
            return type;
        }

        protected volatile Object fromA3(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected BaseScrapModel fromV5(l l1, Type type, j j1)
        {
            type = doDeserialize(l1, type, j1);
            if (type != null)
            {
                l1 = l1.m();
                if (l1.b("grid_slot_number"))
                {
                    int i1 = l1.c("grid_slot_number").g();
                    int i = i1;
                    if (i1 > -1)
                    {
                        i = i1 - 1;
                    }
                    type.setFrameSlotNumber(i);
                }
                if ((type instanceof ImageScrapModel) && ((ImageScrapModel)type).isBackground())
                {
                    type.setFrameSlotNumber(-1);
                }
            }
            return type;
        }

        protected volatile Object fromV5(l l1, Type type, j j1)
        {
            return fromV5(l1, type, j1);
        }

        protected l toA3(BaseScrapModel basescrapmodel, Type type, r r1)
        {
            return doSerialzie(basescrapmodel, r1);
        }

        protected volatile l toA3(Object obj, Type type, r r1)
        {
            return toA3((BaseScrapModel)obj, type, r1);
        }

        protected l toV5(BaseScrapModel basescrapmodel, Type type, r r1)
        {
            type = doSerialzie(basescrapmodel, r1);
            if (type != null)
            {
                r1 = type.m();
                r1.a("frame_slot_number");
                r1.a("id");
                r1.a("grid_slot_number", new q(Integer.valueOf(basescrapmodel.getFrameSlotNumber() + 1)));
            }
            return type;
        }

        protected volatile l toV5(Object obj, Type type, r r1)
        {
            return toV5((BaseScrapModel)obj, type, r1);
        }

        public ScrapModelReaderWriter(CollageRoot.VersionEnum versionenum)
        {
            super(versionenum);
        }
    }

    public static class TransformModel
        implements Parcelable, com.google.b.h
    {

        public static final android.os.Parcelable.Creator CREATOR = new Creator();
        private float mAngle;
        private float mScale;

        public TransformModel createInstance(Type type)
        {
            return new TransformModel();
        }

        public volatile Object createInstance(Type type)
        {
            return createInstance(type);
        }

        public int describeContents()
        {
            return 0;
        }

        public float getAngle()
        {
            return mAngle;
        }

        public float getScale()
        {
            return mScale;
        }

        public void readFromParcel(Parcel parcel)
        {
            setAngle(parcel.readFloat());
            setScale(parcel.readFloat());
        }

        public void setAngle(float f1)
        {
            mAngle = f1;
        }

        public void setScale(float f1)
        {
            mScale = f1;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeFloat(getAngle());
            parcel.writeFloat(getScale());
        }


        private TransformModel()
        {
        }

        TransformModel(float f1, float f2)
        {
            setAngle(f1);
            setScale(f2);
        }

        TransformModel(Parcel parcel)
        {
            readFromParcel(parcel);
        }
    }

    public static class TransformModel.Creator
        implements android.os.Parcelable.Creator
    {

        public TransformModel createFromParcel(Parcel parcel)
        {
            return new TransformModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public TransformModel[] newArray(int i)
        {
            return new TransformModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public TransformModel.Creator()
        {
        }
    }


    private static final String JSON_TAG_CREATED_AT = "created_at";
    private static final String JSON_TAG_FRAME = "frame";
    private static final String JSON_TAG_FRAME_SLOT_NUMBER = "frame_slot_number";
    private static final String JSON_TAG_GRID_SLOT_NUMBER = "grid_slot_number";
    private static final String JSON_TAG_SCRAP_ID = "id";
    private static final String JSON_TAG_SCRAP_TYPE = "scrap_type";
    private static final String JSON_TAG_TAGS = "tags";
    private static final String JSON_TAG_TRANSFORM = "transform";
    private static final String JSON_TAG_UPDATED_AT = "updated_at";
    private static final String JSON_TAG_Z_INDEX = "z_index";
    private Date mCreatedAt;
    private FrameModel mFrame;
    private int mFrameSlotNumber;
    private long mId;
    private String mScrapType;
    private List mTags;
    private TransformModel mTransform;
    private Date mUpdatedAt;
    private int mZIndex;

    BaseScrapModel()
    {
        mId = 0x8000000000000000L;
        mZIndex = 0x80000000;
        mFrameSlotNumber = -1;
        mTags = new ArrayList();
    }

    BaseScrapModel(Parcel parcel)
    {
        mId = 0x8000000000000000L;
        mZIndex = 0x80000000;
        mFrameSlotNumber = -1;
        mTags = new ArrayList();
        setScrapType(parcel.readString());
        setzIndex(parcel.readInt());
        setFrameSlotNumber(parcel.readInt());
        mTransform = (TransformModel)parcel.readParcelable(TransformModel.CREATOR.getClass().getClassLoader());
        mFrame = (FrameModel)parcel.readParcelable(FrameModel.CREATOR.getClass().getClassLoader());
        parcel.readTypedList(mTags, TagModel.CREATOR);
        mId = parcel.readLong();
    }

    BaseScrapModel(String s, k k1)
    {
        mId = 0x8000000000000000L;
        mZIndex = 0x80000000;
        mFrameSlotNumber = -1;
        mTags = new ArrayList();
        mScrapType = s;
        mZIndex = k1.W();
        mFrameSlotNumber = k1.t();
        mTransform = new TransformModel(k1.Q(), k1.P());
        mFrame = new FrameModel(k1.K(), k1.L(), k1.S(), k1.T());
        mTags = k1.ac();
        mId = k1.U();
    }

    public static k generateScrap(BaseScrapModel basescrapmodel)
    {
        if (!(basescrapmodel instanceof VideoScrapModel)) goto _L2; else goto _L1
_L1:
        basescrapmodel = o.a((VideoScrapModel)basescrapmodel);
        return basescrapmodel;
        basescrapmodel;
        f.a(basescrapmodel);
_L4:
        return null;
_L2:
        if (basescrapmodel instanceof ImageScrapModel)
        {
            basescrapmodel = (ImageScrapModel)basescrapmodel;
            com.cardinalblue.android.piccollage.view.g g;
            try
            {
                if (basescrapmodel.getImage() == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                g = h.a(com.cardinalblue.android.b.k.a(), basescrapmodel);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                f.a(new IllegalArgumentException((new StringBuilder()).append(illegalargumentexception.getMessage()).append(" : json ").append(CollageRoot.versionedTypeAdapterGson(CollageRoot.VersionEnum.A3).a(basescrapmodel).toString()).toString()));
                continue; /* Loop/switch isn't completed */
            }
            return g;
        }
        if (!(basescrapmodel instanceof TextScrapModel))
        {
            continue; /* Loop/switch isn't completed */
        }
        basescrapmodel = new n((TextScrapModel)basescrapmodel);
        return basescrapmodel;
        basescrapmodel;
        f.a(basescrapmodel);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Date getCreatedAt()
    {
        return mCreatedAt;
    }

    private Date getUpdatedAt()
    {
        return mUpdatedAt;
    }

    private void setCreatedAt(Date date)
    {
        mCreatedAt = date;
    }

    private void setUpdatedAt(Date date)
    {
        mUpdatedAt = date;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof BaseScrapModel) || ((BaseScrapModel)obj).getId() != getId()) 
        {
            return false;
        }
        return true;
    }

    public FrameModel getFrame()
    {
        return mFrame;
    }

    public int getFrameSlotNumber()
    {
        return mFrameSlotNumber;
    }

    public long getId()
    {
        return mId;
    }

    public String getScrapType()
    {
        return mScrapType;
    }

    public List getTags()
    {
        return mTags;
    }

    public TransformModel getTransform()
    {
        return mTransform;
    }

    public int getzIndex()
    {
        return mZIndex;
    }

    public boolean hasChange(BaseScrapModel basescrapmodel)
    {
        while (basescrapmodel == null || basescrapmodel.getzIndex() == getzIndex() && basescrapmodel.getTransform().getScale() == getTransform().getScale() && basescrapmodel.getTransform().getAngle() == getTransform().getAngle() && basescrapmodel.getFrame().getCenterY() == getFrame().getCenterY() && basescrapmodel.getFrame().getCenterX() == getFrame().getCenterX() && basescrapmodel.getFrame().getBaseWidth() == getFrame().getBaseWidth() && basescrapmodel.getFrame().getBaseHeight() == getFrame().getBaseHeight()) 
        {
            return false;
        }
        return true;
    }

    public void setFrame(FrameModel framemodel)
    {
        mFrame = framemodel;
    }

    public void setFrameSlotNumber(int i)
    {
        mFrameSlotNumber = i;
    }

    public void setId(long l)
    {
        mId = l;
    }

    public void setScrapType(String s)
    {
        mScrapType = s;
    }

    public void setTags(List list)
    {
        mTags = list;
    }

    public void setTransform(TransformModel transformmodel)
    {
        mTransform = transformmodel;
    }

    public void setzIndex(int i)
    {
        mZIndex = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(getScrapType());
        parcel.writeInt(getzIndex());
        parcel.writeInt(getFrameSlotNumber());
        parcel.writeParcelable(getTransform(), i);
        parcel.writeParcelable(getFrame(), i);
        parcel.writeTypedList(mTags);
        parcel.writeLong(mId);
    }
}
