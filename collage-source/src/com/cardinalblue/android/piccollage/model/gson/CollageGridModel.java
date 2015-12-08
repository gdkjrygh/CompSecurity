// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.a.e;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.g;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.h;
import com.google.b.i;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class CollageGridModel
    implements Parcelable, IGsonable, h
{
    public static final class BorderRatioIndex extends Enum
    {

        private static final BorderRatioIndex $VALUES[];
        public static final BorderRatioIndex X;
        public static final BorderRatioIndex Y;

        public static BorderRatioIndex valueOf(String s)
        {
            return (BorderRatioIndex)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/CollageGridModel$BorderRatioIndex, s);
        }

        public static BorderRatioIndex[] values()
        {
            return (BorderRatioIndex[])$VALUES.clone();
        }

        static 
        {
            X = new BorderRatioIndex("X", 0);
            Y = new BorderRatioIndex("Y", 1);
            $VALUES = (new BorderRatioIndex[] {
                X, Y
            });
        }

        private BorderRatioIndex(String s, int j)
        {
            super(s, j);
        }
    }

    public static class CollageGridModelReaderWriter extends o
    {

        protected CollageGridModel fromA2(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected volatile Object fromA2(l l1, Type type, j j1)
        {
            return fromA2(l1, type, j1);
        }

        protected CollageGridModel fromA3(l l1, Type type, j j1)
        {
            if (!l1.k())
            {
                return null;
            } else
            {
                type = new CollageGridModel(-1, -1);
                type.setFrameStructure(l1.c());
                return type;
            }
        }

        protected volatile Object fromA3(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected CollageGridModel fromV5(l l1, Type type, j j1)
        {
            if (!l1.j())
            {
                return null;
            }
            type = new CollageGridModel(-1, -1);
            Object obj = l1.m();
            l1 = (float[])j1.a(((com.google.b.o) (obj)).c("border_size"), [F);
            String s = e.a(((com.google.b.o) (obj)), "name", com.cardinalblue.android.piccollage.model.f.h.a.name());
            obj = ((com.google.b.o) (obj)).c("slots").n();
            ArrayList arraylist = new ArrayList();
            for (int i1 = 0; i1 < ((i) (obj)).a(); i1++)
            {
                i k = ((i) (obj)).a(i1).m().c("rect").n();
                float af[] = (float[])j1.a(k.a(0), [F);
                float af1[] = (float[])j1.a(k.a(1), [F);
                arraylist.add(new RectF(af[0], af[1], af1[0], af1[1]));
            }

            if (l1.length >= 2)
            {
                type.setBorderSize(l1[0], l1[1]);
            } else
            {
                type.setBorderSize(0.0F, 0.0F);
            }
            type.setGridName(s);
            type.addAllSlots(arraylist);
            return type;
        }

        protected volatile Object fromV5(l l1, Type type, j j1)
        {
            return fromV5(l1, type, j1);
        }

        protected l toA3(CollageGridModel collagegridmodel, Type type, r r1)
        {
            return new q(collagegridmodel.getFrameStructure());
        }

        protected volatile l toA3(Object obj, Type type, r r1)
        {
            return toA3((CollageGridModel)obj, type, r1);
        }

        protected l toV5(CollageGridModel collagegridmodel, Type type, r r1)
        {
            com.google.b.o o1;
            o1 = new com.google.b.o();
            if (!collagegridmodel.isBorderSizeValid() || TextUtils.isEmpty(collagegridmodel.getGridName()))
            {
                break MISSING_BLOCK_LABEL_246;
            }
            o1.a("border_size", r1.a(collagegridmodel.getBorderSize(), [F));
            o1.a("name", collagegridmodel.getGridName());
            type = new i();
            for (collagegridmodel = collagegridmodel.getSlots().iterator(); collagegridmodel.hasNext(); type.a(r1))
            {
                Object obj = (RectF)collagegridmodel.next();
                r1 = new i();
                r1.a(new q(Float.valueOf(((RectF) (obj)).left)));
                r1.a(new q(Float.valueOf(((RectF) (obj)).top)));
                i k = new i();
                k.a(new q(Float.valueOf(((RectF) (obj)).right)));
                k.a(new q(Float.valueOf(((RectF) (obj)).bottom)));
                obj = new i();
                ((i) (obj)).a(r1);
                ((i) (obj)).a(k);
                r1 = new com.google.b.o();
                r1.a("rect", ((l) (obj)));
            }

            float f1;
            i i1;
            Object obj1;
            try
            {
                o1.a("slots", type);
            }
            // Misplaced declaration of an exception variable
            catch (CollageGridModel collagegridmodel)
            {
                return null;
            }
            break MISSING_BLOCK_LABEL_526;
            collagegridmodel.ensureCollageSize();
            type = new d(collagegridmodel.getFrameStructure());
_L1:
            f1 = type.e() / 2.0F;
            o1.a("border_size", r1.a(new float[] {
                f1, ((float)collagegridmodel.getCollageWidth() * f1) / (float)collagegridmodel.getCollageHeight()
            }, [F));
            o1.a("name", type.g());
            collagegridmodel = new i();
            for (type = type.b().iterator(); type.hasNext(); collagegridmodel.a(r1))
            {
                obj1 = (g)type.next();
                r1 = new i();
                r1.a(new q(Float.valueOf(((g) (obj1)).f())));
                r1.a(new q(Float.valueOf(((g) (obj1)).g())));
                i1 = new i();
                i1.a(new q(Float.valueOf(((g) (obj1)).d())));
                i1.a(new q(Float.valueOf(((g) (obj1)).e())));
                obj1 = new i();
                ((i) (obj1)).a(r1);
                ((i) (obj1)).a(i1);
                r1 = new com.google.b.o();
                r1.a("rect", ((l) (obj1)));
            }

            break MISSING_BLOCK_LABEL_512;
            type;
            f.a(type);
            type = d.a();
              goto _L1
            o1.a("slots", collagegridmodel);
            return o1;
        }

        protected volatile l toV5(Object obj, Type type, r r1)
        {
            return toV5((CollageGridModel)obj, type, r1);
        }

        public CollageGridModelReaderWriter(CollageRoot.VersionEnum versionenum)
        {
            super(versionenum);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CollageGridModel createFromParcel(Parcel parcel)
        {
            return new CollageGridModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public CollageGridModel[] newArray(int j)
        {
            return new CollageGridModel[j];
        }

        public volatile Object[] newArray(int j)
        {
            return newArray(j);
        }

    };
    private static final float INVALID_BORDER_SIZE = -1F;
    private static final int INVALID_HEIGHT = -1;
    private static final int INVALID_WIDTH = -1;
    public static final String JSON_KEY_BORDER_WIDTH = "border_width";
    public static final String JSON_KEY_ID = "frame_id";
    public static final String JSON_KEY_RECT = "frame_rects";
    public static final String JSON_TAG_BORDER_SIZE = "border_size";
    public static final String JSON_TAG_NAME = "name";
    public static final String JSON_TAG_SLOTS = "slots";
    public static final String JSON_TAG_SLOTS_RECT = "rect";
    private float mBorderSize[] = {
        -1F, -1F
    };
    private int mCollageHeight;
    private int mCollageWidth;
    private String mFrameStructure;
    private String mName;
    private List mSlots;

    public CollageGridModel(int j, int k)
    {
        mSlots = new ArrayList();
        mCollageWidth = -1;
        mCollageHeight = -1;
        mCollageWidth = j;
        mCollageHeight = k;
    }

    private CollageGridModel(Parcel parcel)
    {
        mSlots = new ArrayList();
        mCollageWidth = -1;
        mCollageHeight = -1;
        mBorderSize = parcel.createFloatArray();
        mName = parcel.readString();
        parcel.readTypedList(mSlots, RectF.CREATOR);
        mFrameStructure = parcel.readString();
        mCollageWidth = parcel.readInt();
        mCollageHeight = parcel.readInt();
    }


    private String generateFrameStructure()
    {
        while (!isBorderSizeValid() || TextUtils.isEmpty(mName) || !com.cardinalblue.android.piccollage.model.f.h.a.name().equals(mName) && mSlots.size() == 0) 
        {
            return null;
        }
        Object obj1 = com.cardinalblue.android.piccollage.model.f.h.a(mName);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = com.cardinalblue.android.piccollage.model.f.h.a;
            f.a(new IllegalArgumentException((new StringBuilder()).append("Unknown frame name => ").append(mName).toString()));
        }
        float f1 = getBorderSizeX();
        obj1 = com.cardinalblue.android.piccollage.model.f.a(((com.cardinalblue.android.piccollage.model.f.h) (obj)));
        ArrayList arraylist = new ArrayList();
        ((com.cardinalblue.android.piccollage.model.f) (obj1)).a(mSlots.size(), arraylist);
        obj = new d(arraylist, ((com.cardinalblue.android.piccollage.model.f.h) (obj)).ordinal());
        for (int j = 0; j < mSlots.size(); j++)
        {
            ((d) (obj)).a(j, new g((RectF)mSlots.get(j), 0.0F));
        }

        ((d) (obj)).a(2.0F * f1);
        return ((d) (obj)).toString();
    }

    private float getBorderSize(int j)
    {
        return mBorderSize[j];
    }

    private boolean isBorderSizeValid()
    {
        float f1 = mBorderSize[0];
        float f2 = mBorderSize[1];
        return f1 >= 0.0F && f2 >= 0.0F;
    }

    private void updateBorderSizeAt(BorderRatioIndex borderratioindex, float f1)
    {
        int j = borderratioindex.ordinal();
        mBorderSize[j] = f1;
    }

    public void addAllSlots(Collection collection)
    {
        mSlots.addAll(collection);
    }

    public void addSlot(RectF rectf)
    {
        mSlots.add(rectf);
    }

    public CollageGridModel createInstance(Type type)
    {
        return new CollageGridModel(-1, -1);
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public void ensureCollageSize()
    {
        if (mCollageWidth <= -1 || mCollageHeight <= -1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Collage size information set improperly. ").append(mCollageWidth).append(", ").append(mCollageHeight).toString());
        } else
        {
            return;
        }
    }

    public float[] getBorderSize()
    {
        return mBorderSize;
    }

    public float getBorderSizeX()
    {
        return getBorderSize(BorderRatioIndex.X.ordinal());
    }

    public float getBorderSizeY()
    {
        return getBorderSize(BorderRatioIndex.Y.ordinal());
    }

    public int getCollageHeight()
    {
        return mCollageHeight;
    }

    public int getCollageWidth()
    {
        return mCollageWidth;
    }

    public String getFrameStructure()
    {
        if (TextUtils.isEmpty(mFrameStructure))
        {
            mFrameStructure = generateFrameStructure();
        }
        return mFrameStructure;
    }

    public String getGridName()
    {
        return mName;
    }

    public List getSlots()
    {
        return mSlots;
    }

    public void parseFrameStructure()
    {
        ensureCollageSize();
        float f1;
        float f2;
        Object obj;
        try
        {
            obj = new d(mFrameStructure);
        }
        catch (JSONException jsonexception)
        {
            f.a(jsonexception);
            jsonexception = d.a();
        }
        f1 = ((d) (obj)).e() / 2.0F;
        f2 = ((float)mCollageWidth * f1) / (float)mCollageHeight;
        mBorderSize[0] = f1;
        mBorderSize[1] = f2;
        mName = ((d) (obj)).g();
        new i();
        Object obj1;
        for (obj = ((d) (obj)).b().iterator(); ((Iterator) (obj)).hasNext(); mSlots.add(obj1))
        {
            obj1 = (g)((Iterator) (obj)).next();
            obj1 = new RectF(((g) (obj1)).f(), ((g) (obj1)).g(), ((g) (obj1)).d(), ((g) (obj1)).e());
        }

    }

    public void reset()
    {
        mBorderSize[0] = -1F;
        mBorderSize[1] = -1F;
        mName = null;
        mSlots.clear();
        mFrameStructure = null;
    }

    public void setBorderSize(float f1, float f2)
    {
        updateBorderSizeAt(BorderRatioIndex.X, f1);
        updateBorderSizeAt(BorderRatioIndex.Y, f2);
    }

    public void setCollageHeight(int j)
    {
        mCollageHeight = j;
    }

    public void setCollageWidth(int j)
    {
        mCollageWidth = j;
    }

    public void setFrameStructure(String s)
    {
        reset();
        mFrameStructure = s;
    }

    public void setGridName(String s)
    {
        mName = s;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeFloatArray(mBorderSize);
        parcel.writeString(mName);
        parcel.writeTypedList(mSlots);
        parcel.writeString(mFrameStructure);
        parcel.writeInt(mCollageWidth);
        parcel.writeInt(mCollageHeight);
    }


}
