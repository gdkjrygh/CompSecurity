// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.model.c;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.c.a;
import com.google.b.h;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class ClippingPathModel
    implements Parcelable, IGsonable, h
{
    public static class ClippingPathModelReaderWriter extends o
    {

        private static final Type sToken = (new a() {

        }).getType();

        protected ClippingPathModel fromA2(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected volatile Object fromA2(l l1, Type type, j j1)
        {
            return fromA2(l1, type, j1);
        }

        protected ClippingPathModel fromA3(l l1, Type type, j j1)
        {
            if (l1.j())
            {
                l1 = l1.m();
                if (l1.a().size() != 2 || !l1.b("x") || !l1.b("y"))
                {
                    return null;
                } else
                {
                    return new ClippingPathModel(ClippingPathModel.parseFromPathXY(l1.c("x").c(), l1.c("y").c()), false);
                }
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("ClippingPathModel incorrect! Expect JsonObject is ").append(l1.getClass().getSimpleName()).toString());
            }
        }

        protected volatile Object fromA3(l l1, Type type, j j1)
        {
            return fromA3(l1, type, j1);
        }

        protected ClippingPathModel fromV5(l l1, Type type, j j1)
        {
            return new ClippingPathModel((List)j1.a(l1, sToken), true);
        }

        protected volatile Object fromV5(l l1, Type type, j j1)
        {
            return fromV5(l1, type, j1);
        }

        protected l toA3(ClippingPathModel clippingpathmodel, Type type, r r1)
        {
            if (!clippingpathmodel.isEmpty())
            {
                if (!(r1 = clippingpathmodel.getScaledClippingPath()).isEmpty())
                {
                    clippingpathmodel = new StringBuilder();
                    type = new StringBuilder();
                    PointF pointf;
                    for (r1 = r1.iterator(); r1.hasNext(); type.append(pointf.y).append(","))
                    {
                        pointf = (PointF)r1.next();
                        clippingpathmodel.append(pointf.x).append(",");
                    }

                    clippingpathmodel.delete(clippingpathmodel.length() - 1, clippingpathmodel.length());
                    type.delete(type.length() - 1, type.length());
                    r1 = new com.google.b.o();
                    r1.a("x", new q(clippingpathmodel.toString()));
                    r1.a("y", new q(type.toString()));
                    return r1;
                }
            }
            return null;
        }

        protected volatile l toA3(Object obj, Type type, r r1)
        {
            return toA3((ClippingPathModel)obj, type, r1);
        }

        protected l toV5(ClippingPathModel clippingpathmodel, Type type, r r1)
        {
            clippingpathmodel.normalizePoints();
            return r1.a(clippingpathmodel.getClippingPath(), sToken);
        }

        protected volatile l toV5(Object obj, Type type, r r1)
        {
            return toV5((ClippingPathModel)obj, type, r1);
        }


        public ClippingPathModelReaderWriter(CollageRoot.VersionEnum versionenum)
        {
            super(versionenum);
        }
    }

    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public ClippingPathModel createFromParcel(Parcel parcel)
        {
            return new ClippingPathModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ClippingPathModel[] newArray(int i)
        {
            return new ClippingPathModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    public static final String JSON_TAG_X = "x";
    public static final String JSON_TAG_Y = "y";
    private ArrayList mClippingPoints;
    private boolean mIsNormalised;
    private int mScrapHeight;
    private int mScrapWidth;

    public ClippingPathModel()
    {
        this(((List) (new ArrayList())), true);
    }

    public ClippingPathModel(int i, int j, c c1)
    {
        mScrapWidth = -1;
        mScrapHeight = -1;
        mIsNormalised = true;
        mClippingPoints = new ArrayList();
        mIsNormalised = false;
        setScrapWidth(i);
        setScrapHeight(j);
        if (c1 != null)
        {
            setClippingPoints(c1.b());
        }
        normalizePoints();
    }

    ClippingPathModel(Parcel parcel)
    {
        boolean flag = true;
        super();
        mScrapWidth = -1;
        mScrapHeight = -1;
        mIsNormalised = true;
        mClippingPoints = new ArrayList();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        mIsNormalised = flag;
        mScrapWidth = parcel.readInt();
        mScrapHeight = parcel.readInt();
        parcel.readTypedList(mClippingPoints, PointF.CREATOR);
    }

    public ClippingPathModel(List list, boolean flag)
    {
        mScrapWidth = -1;
        mScrapHeight = -1;
        mIsNormalised = true;
        mClippingPoints = new ArrayList();
        mIsNormalised = flag;
        setClippingPoints(list);
    }

    public static List parseFromPathXY(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        boolean flag = TextUtils.isEmpty(s);
        boolean flag1 = TextUtils.isEmpty(s1);
        if (flag && flag1)
        {
            return null;
        }
        if (!flag && flag1)
        {
            throw new IllegalArgumentException("pathY is empty but pathX not");
        }
        if (flag && !flag1)
        {
            throw new IllegalArgumentException("pathX is empty but pathY not");
        }
        s = s.split(",");
        s1 = s1.split(",");
        if (s.length != s1.length)
        {
            throw new IllegalArgumentException("Length of clipping path X and Y inconsistent");
        }
        for (int i = 0; i < s.length; i++)
        {
            arraylist.add(new PointF(Float.parseFloat(s[i]), Float.parseFloat(s1[i])));
        }

        return arraylist;
    }

    public ClippingPathModel createInstance(Type type)
    {
        return new ClippingPathModel();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public void ensureScrapSize()
    {
        if (mScrapWidth < 0 || mScrapHeight < 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Illegal scrap size: width, height = ").append(mScrapWidth).append(", ").append(mScrapHeight).toString());
        } else
        {
            return;
        }
    }

    public ArrayList getClippingPath()
    {
        normalizePoints();
        ArrayList arraylist = new ArrayList();
        PointF pointf;
        for (Iterator iterator = mClippingPoints.iterator(); iterator.hasNext(); arraylist.add(new PointF(pointf.x, pointf.y)))
        {
            pointf = (PointF)iterator.next();
        }

        return arraylist;
    }

    public ArrayList getScaledClippingPath()
    {
        ArrayList arraylist = getClippingPath();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
            PointF pointf = (PointF)iterator.next();
            pointf.x = (float)((double)pointf.x - 0.5D);
            pointf.y = (float)((double)pointf.y - 0.5D);
            pointf.x = pointf.x * (float)mScrapWidth;
            pointf.y = pointf.y * (float)mScrapHeight;
        }

        return arraylist;
    }

    public boolean isEmpty()
    {
        return mClippingPoints.isEmpty();
    }

    public void normalizePoints()
    {
        ensureScrapSize();
        if (!mIsNormalised)
        {
            for (Iterator iterator = mClippingPoints.iterator(); iterator.hasNext();)
            {
                PointF pointf = (PointF)iterator.next();
                pointf.x = Math.max(0.0F, Math.min(1.0F, pointf.x / (float)mScrapWidth + 0.5F));
                pointf.y = Math.max(0.0F, Math.min(1.0F, pointf.y / (float)mScrapHeight + 0.5F));
            }

            mIsNormalised = true;
        }
    }

    public void setClippingPoints(List list)
    {
        mClippingPoints.clear();
        if (list != null)
        {
            mClippingPoints.addAll(list);
        }
    }

    public void setScrapHeight(int i)
    {
        mScrapHeight = i;
    }

    public void setScrapSize(int i, int j)
    {
        setScrapWidth(i);
        setScrapHeight(j);
    }

    public void setScrapWidth(int i)
    {
        mScrapWidth = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (mIsNormalised)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(mScrapWidth);
        parcel.writeInt(mScrapHeight);
        parcel.writeTypedList(mClippingPoints);
    }

}
