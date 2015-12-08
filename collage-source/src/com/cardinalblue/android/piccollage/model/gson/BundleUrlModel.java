// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.model.o;
import com.google.b.h;
import com.google.b.j;
import com.google.b.l;
import com.google.b.q;
import com.google.b.r;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class BundleUrlModel
    implements Parcelable, IGsonable, h
{
    public static class BundleUrlModelReaderWriter extends o
    {

        private BundleUrlModel createBundleUrlModel(l l1)
        {
            if (!l1.k())
            {
                return null;
            } else
            {
                return new BundleUrlModel(l1.o().c());
            }
        }

        protected BundleUrlModel fromA2(l l1, Type type, j j)
        {
            return fromA3(l1, type, j);
        }

        protected volatile Object fromA2(l l1, Type type, j j)
        {
            return fromA2(l1, type, j);
        }

        protected BundleUrlModel fromA3(l l1, Type type, j j)
        {
            return createBundleUrlModel(l1);
        }

        protected volatile Object fromA3(l l1, Type type, j j)
        {
            return fromA3(l1, type, j);
        }

        protected BundleUrlModel fromV5(l l1, Type type, j j)
        {
            return createBundleUrlModel(l1);
        }

        protected volatile Object fromV5(l l1, Type type, j j)
        {
            return fromV5(l1, type, j);
        }

        protected l toA3(BundleUrlModel bundleurlmodel, Type type, r r)
        {
            bundleurlmodel = bundleurlmodel.getUrl();
            if (TextUtils.isEmpty(bundleurlmodel))
            {
                return null;
            } else
            {
                return new q(bundleurlmodel);
            }
        }

        protected volatile l toA3(Object obj, Type type, r r)
        {
            return toA3((BundleUrlModel)obj, type, r);
        }

        protected l toV5(BundleUrlModel bundleurlmodel, Type type, r r)
        {
            List list;
            type = bundleurlmodel.getUrl();
            if (TextUtils.isEmpty(type))
            {
                return null;
            }
            r = Uri.parse(type);
            list = r.getPathSegments();
            bundleurlmodel = com.cardinalblue.android.piccollage.lib.e.a.a(type);
            static class _cls2
            {

                static final int $SwitchMap$com$cardinalblue$android$piccollage$lib$IImageLoader$Scheme[];

                static 
                {
                    $SwitchMap$com$cardinalblue$android$piccollage$lib$IImageLoader$Scheme = new int[com.cardinalblue.android.piccollage.lib.e.a.values().length];
                    try
                    {
                        $SwitchMap$com$cardinalblue$android$piccollage$lib$IImageLoader$Scheme[com.cardinalblue.android.piccollage.lib.e.a.e.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$cardinalblue$android$piccollage$lib$IImageLoader$Scheme[com.cardinalblue.android.piccollage.lib.e.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls2..SwitchMap.com.cardinalblue.android.piccollage.lib.IImageLoader.Scheme[bundleurlmodel.ordinal()];
            JVM INSTR tableswitch 1 2: default 60
        //                       1 71
        //                       2 194;
               goto _L1 _L2 _L3
_L1:
            bundleurlmodel = type;
_L5:
            return new q(bundleurlmodel);
_L2:
            String s = r.getAuthority();
            if ("backgrounds".equals(s))
            {
                bundleurlmodel = String.format("bundled:/backgrounds/%s", new Object[] {
                    r.getLastPathSegment()
                });
            } else
            {
                bundleurlmodel = type;
                if ("stickers".equals(s))
                {
                    if ("StickerLite".equals(list.get(0)))
                    {
                        bundleurlmodel = String.format("bundled:/StickerLite.bundle/%s", new Object[] {
                            r.getLastPathSegment()
                        });
                    } else
                    {
                        bundleurlmodel = String.format("bundled:/%s/%s", new Object[] {
                            list.get(list.size() - 2), r.getLastPathSegment()
                        });
                    }
                }
            }
            continue; /* Loop/switch isn't completed */
_L3:
            bundleurlmodel = type;
            if (type.startsWith(com.cardinalblue.android.piccollage.lib.e.a.c.b(com.cardinalblue.android.piccollage.controller.o.a().f().getAbsolutePath())))
            {
                bundleurlmodel = String.format("bundled:/%s/%s", new Object[] {
                    list.get(list.size() - 2), r.getLastPathSegment()
                });
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

        protected volatile l toV5(Object obj, Type type, r r)
        {
            return toV5((BundleUrlModel)obj, type, r);
        }

        public BundleUrlModelReaderWriter(CollageRoot.VersionEnum versionenum)
        {
            super(versionenum);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BundleUrlModel createFromParcel(Parcel parcel)
        {
            return new BundleUrlModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public BundleUrlModel[] newArray(int i)
        {
            return new BundleUrlModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mUrl;

    BundleUrlModel(Parcel parcel)
    {
        mUrl = parcel.readString();
    }

    public BundleUrlModel(String s)
    {
        mUrl = s;
    }

    public BundleUrlModel createInstance(Type type)
    {
        return new BundleUrlModel("");
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public void setUrl(String s)
    {
        mUrl = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUrl);
    }

}
