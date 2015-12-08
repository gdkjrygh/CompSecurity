// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.graphics.PointF;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.google.b.f;
import com.google.b.g;
import com.google.b.h;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            PointFReaderWriter, BaseScrapModel, CollageGridModel, ColorModel, 
//            FrameModel, ClippingPathModel, BundleUrlModel, JsonCollage, 
//            TextFormatModel

public class CollageRoot
    implements h
{
    private static class CBDateJsonReaderWriter
        implements k, s
    {

        public volatile Object deserialize(l l1, Type type, j j)
            throws p
        {
            return deserialize(l1, type, j);
        }

        public Date deserialize(l l1, Type type, j j)
            throws p
        {
            return com.cardinalblue.android.b.k.d(l1.c());
        }

        public volatile l serialize(Object obj, Type type, r r)
        {
            return serialize((Date)obj, type, r);
        }

        public l serialize(Date date, Type type, r r)
        {
            if (date != null)
            {
                return new q(com.cardinalblue.android.b.k.a(date));
            } else
            {
                return null;
            }
        }

        private CBDateJsonReaderWriter()
        {
        }

    }

    public static class CollageModel
        implements h
    {

        protected static final String TAG_JSON = "json";
        protected static final String TAG_STRUCT = "struct";
        JsonCollage json;

        public CollageModel createInstance(Type type)
        {
            return new CollageModel();
        }

        public volatile Object createInstance(Type type)
        {
            return createInstance(type);
        }

        public JsonCollage getJsonCollage()
        {
            return json;
        }

        public void setJsonCollage(JsonCollage jsoncollage)
        {
            json = jsoncollage;
        }

        private CollageModel()
        {
            json = new JsonCollage();
        }

        public CollageModel(AbstractCollage abstractcollage)
        {
            setJsonCollage(new JsonCollage(abstractcollage));
        }


        public CollageModel(JsonCollage jsoncollage)
        {
            setJsonCollage(jsoncollage);
        }
    }

    public static class CollageModelReader
        implements k
    {

        public CollageModel deserialize(l l1, Type type, j j1)
            throws p
        {
            if (!l1.j())
            {
                return null;
            }
            type = l1.m();
            if (type.b("json"))
            {
                l1 = (JsonCollage)j1.a(type.c("json"), com/cardinalblue/android/piccollage/model/gson/JsonCollage);
            } else
            {
                l1 = null;
            }
            if (l1 == null && type.b("struct"))
            {
                l1 = (JsonCollage)j1.a(type.c("struct"), com/cardinalblue/android/piccollage/model/gson/JsonCollage);
            }
            if (l1 == null)
            {
                l1 = null;
            } else
            {
                l1 = new CollageModel(l1);
            }
            return l1;
        }

        public volatile Object deserialize(l l1, Type type, j j1)
            throws p
        {
            return deserialize(l1, type, j1);
        }

        public CollageModelReader()
        {
        }
    }

    public static final class VersionEnum extends Enum
    {

        private static final VersionEnum $VALUES[];
        public static final VersionEnum A2;
        public static final VersionEnum A3;
        public static final VersionEnum V5;
        private final int versionCode;

        public static VersionEnum valueOf(String s)
        {
            return (VersionEnum)Enum.valueOf(com/cardinalblue/android/piccollage/model/gson/CollageRoot$VersionEnum, s);
        }

        public static VersionEnum[] values()
        {
            return (VersionEnum[])$VALUES.clone();
        }

        public int getVersionCode()
        {
            return versionCode;
        }

        static 
        {
            A2 = new VersionEnum("A2", 0, 2);
            A3 = new VersionEnum("A3", 1, 3);
            V5 = new VersionEnum("V5", 2, 5);
            $VALUES = (new VersionEnum[] {
                A2, A3, V5
            });
        }

        private VersionEnum(String s, int i, int j)
        {
            super(s, i);
            versionCode = j;
        }
    }


    public static final int CURRENT_COLLAGE_VERSION = 3;
    public static final int VERSION_BACKGROUND_SCRAP_IN_SCRAP_LIST = 2;
    public static final int VERSION_INITIAL = 1;
    public static final int VERSION_NO_OVERLAY_ACTIONBAR = 3;
    private static f sCollageA2Gson;
    private static f sCollageA3Gson;
    private static f sCollageV5Gson;
    CollageModel collage;

    private CollageRoot()
    {
        collage = new CollageModel();
    }

    public CollageRoot(AbstractCollage abstractcollage)
    {
        collage = new CollageModel(abstractcollage);
    }

    private static f createVersionedGson(VersionEnum versionenum)
    {
        return (new g()).a(com/cardinalblue/android/piccollage/model/gson/CollageRoot$CollageModel, new CollageModelReader()).a(android/graphics/PointF, new PointFReaderWriter()).a(com/cardinalblue/android/piccollage/model/gson/BaseScrapModel, new BaseScrapModel.ScrapModelReaderWriter(versionenum)).a(com/cardinalblue/android/piccollage/model/gson/CollageGridModel, new CollageGridModel.CollageGridModelReaderWriter(versionenum)).a(com/cardinalblue/android/piccollage/model/gson/ColorModel, new ColorModel.ColorModelJsonReaderWriter(versionenum)).a(com/cardinalblue/android/piccollage/model/gson/FrameModel, new FrameModel.ScrapFrameModelReaderWriter(versionenum)).a(com/cardinalblue/android/piccollage/model/gson/ClippingPathModel, new ClippingPathModel.ClippingPathModelReaderWriter(versionenum)).a(com/cardinalblue/android/piccollage/model/gson/BundleUrlModel, new BundleUrlModel.BundleUrlModelReaderWriter(versionenum)).a(com/cardinalblue/android/piccollage/model/gson/JsonCollage, new JsonCollage.JsonCollageReaderWriter(versionenum)).a(com/cardinalblue/android/piccollage/model/gson/TextFormatModel, new TextFormatModel.TextFormatModelReaderWriter(versionenum)).a(java/util/Date, new CBDateJsonReaderWriter()).a();
    }

    public static f versionedTypeAdapterGson(VersionEnum versionenum)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum[];

            static 
            {
                $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum = new int[VersionEnum.values().length];
                try
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum[VersionEnum.V5.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum[VersionEnum.A2.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$model$gson$CollageRoot$VersionEnum[VersionEnum.A3.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum[versionenum.ordinal()])
        {
        default:
            if (sCollageA3Gson != null)
            {
                return sCollageA3Gson;
            } else
            {
                versionenum = createVersionedGson(versionenum);
                sCollageA3Gson = versionenum;
                return versionenum;
            }

        case 1: // '\001'
            if (sCollageV5Gson != null)
            {
                return sCollageV5Gson;
            } else
            {
                versionenum = createVersionedGson(versionenum);
                sCollageV5Gson = versionenum;
                return versionenum;
            }

        case 2: // '\002'
            break;
        }
        if (sCollageA2Gson != null)
        {
            return sCollageA2Gson;
        } else
        {
            versionenum = createVersionedGson(versionenum);
            sCollageA2Gson = versionenum;
            return versionenum;
        }
    }

    public CollageRoot createInstance(Type type)
    {
        return new CollageRoot();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public String getCaption()
    {
        return collage.getJsonCollage().getCaption();
    }

    public String getFrame()
    {
        return collage.getJsonCollage().getFrame();
    }

    public int getHeight()
    {
        return collage.getJsonCollage().getHeight();
    }

    public PhotoboxTemplateList.PhotoboxTemplate getKiteTemplateModel()
    {
        return collage.getJsonCollage().getKiteTemplateModel();
    }

    public String getLogName()
    {
        return collage.getJsonCollage().getLogName();
    }

    public List getScraps()
    {
        return collage.getJsonCollage().getScraps();
    }

    public List getTags()
    {
        return collage.getJsonCollage().getTags();
    }

    public int getVersion()
    {
        return collage.getJsonCollage().getVersion();
    }

    public int getWidth()
    {
        return collage.getJsonCollage().getWidth();
    }

    public CollageGridModel getgetGridModel()
    {
        return collage.getJsonCollage().getGridModel();
    }

    public void setCollageModel(CollageModel collagemodel)
    {
        collage = collagemodel;
    }

    public void setHeight(int i)
    {
        collage.getJsonCollage().setHeight(i);
    }

    public void setScraps(List list)
    {
        collage.getJsonCollage().setScraps(list);
    }

    public void setVersion(int i)
    {
        collage.getJsonCollage().setVersion(i);
    }
}
