// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.model.p;
import com.google.b.i;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class ColorModel
    implements Parcelable, IGsonable
{
    public static class ColorModelJsonReaderWriter extends p
    {

        private l toA3(ColorModel colormodel)
        {
            return new q(Integer.valueOf(colormodel.getColor()));
        }

        private l toV5(ColorModel colormodel)
        {
            colormodel = colormodel.getNormARGB();
            i j = new i();
            int i1 = colormodel.length;
            for (int k = 0; k < i1; k++)
            {
                j.a(new q(Float.valueOf(colormodel[k])));
            }

            return j;
        }

        public ColorModel deserialize(l l1, Type type, j j)
            throws com.google.b.p
        {
            float f1;
            f1 = 0.0F;
            type = new ColorModel();
            if (!l1.k()) goto _L2; else goto _L1
_L1:
            int k = l1.g();
_L10:
            type.setColor(k);
            return type;
_L2:
            if (!l1.i()) goto _L4; else goto _L3
_L3:
            float f;
            l1 = l1.n();
            k = l1.a();
            f = 1.0F;
            k;
            JVM INSTR tableswitch 3 4: default 76
        //                       3 135
        //                       4 125;
               goto _L5 _L6 _L7
_L5:
            float f2;
            float f3;
            f3 = 0.0F;
            f2 = 0.0F;
            f = 0.0F;
_L8:
            k = Color.argb(Math.round(f * 255F), Math.round(f2 * 255F), Math.round(f1 * 255F), Math.round(f3 * 255F));
            continue; /* Loop/switch isn't completed */
_L7:
            f = l1.a(3).e();
_L6:
            f2 = l1.a(0).e();
            f1 = l1.a(1).e();
            f3 = l1.a(2).e();
            if (true) goto _L8; else goto _L4
_L4:
            k = 0;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public volatile Object deserialize(l l1, Type type, j j)
            throws com.google.b.p
        {
            return deserialize(l1, type, j);
        }

        public l serialize(ColorModel colormodel, Type type, r r)
        {
            static class _cls2
            {

                static final int $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum[];

                static 
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum = new int[CollageRoot.VersionEnum.values().length];
                    try
                    {
                        $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum[CollageRoot.VersionEnum.V5.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum[CollageRoot.VersionEnum.A3.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls2..SwitchMap.com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum[((CollageRoot.VersionEnum)getVersion()).ordinal()])
            {
            default:
                return null;

            case 1: // '\001'
                return toV5(colormodel);

            case 2: // '\002'
                return toA3(colormodel);
            }
        }

        public volatile l serialize(Object obj, Type type, r r)
        {
            return serialize((ColorModel)obj, type, r);
        }

        public ColorModelJsonReaderWriter()
        {
            this(CollageRoot.VersionEnum.A3);
        }

        public ColorModelJsonReaderWriter(CollageRoot.VersionEnum versionenum)
        {
            super(versionenum);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ColorModel createFromParcel(Parcel parcel)
        {
            return new ColorModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ColorModel[] newArray(int i)
        {
            return new ColorModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private int mColor;

    public ColorModel()
    {
    }

    public ColorModel(int i)
    {
        setColor(i);
    }

    private ColorModel(Parcel parcel)
    {
        mColor = parcel.readInt();
    }


    public transient ColorModel(int ai[])
    {
        setColor(ai);
    }

    public int describeContents()
    {
        return 0;
    }

    public int[] getARGB()
    {
        return (new int[] {
            Color.red(mColor), Color.green(mColor), Color.blue(mColor), Color.alpha(mColor)
        });
    }

    public int getColor()
    {
        return mColor;
    }

    public float[] getNormARGB()
    {
        return (new float[] {
            (float)Color.red(mColor) / 255F, (float)Color.green(mColor) / 255F, (float)Color.blue(mColor) / 255F, (float)Color.alpha(mColor) / 255F
        });
    }

    public void setColor(int i)
    {
        mColor = i;
    }

    public transient void setColor(int ai[])
    {
        int i;
        int j;
        j = 0;
        i = 255;
        ai.length;
        JVM INSTR tableswitch 3 4: default 32
    //                   3 58
    //                   4 54;
           goto _L1 _L2 _L3
_L1:
        int k;
        int l;
        l = 0;
        k = 0;
        i = 0;
_L5:
        setColor(Color.argb(i, k, j, l));
        return;
_L3:
        i = ai[3];
_L2:
        k = ai[0];
        j = ai[1];
        l = ai[2];
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mColor);
    }

}
