// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.DriveLog;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            MetadataBundleCreator, FieldRegistry

public final class MetadataBundle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new MetadataBundleCreator();
    public final Bundle mValueBundle;
    final int mVersionCode;

    MetadataBundle(int i, Bundle bundle)
    {
        mVersionCode = i;
        mValueBundle = (Bundle)Preconditions.checkNotNull(bundle);
        mValueBundle.setClassLoader(getClass().getClassLoader());
        bundle = new ArrayList();
        Iterator iterator = mValueBundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (FieldRegistry.getFieldByName(s1) == null)
            {
                bundle.add(s1);
                DriveLog.w("MetadataBundle", (new StringBuilder("Ignored unknown metadata field in bundle: ")).append(s1).toString());
            }
        } while (true);
        String s;
        for (bundle = bundle.iterator(); bundle.hasNext(); mValueBundle.remove(s))
        {
            s = (String)bundle.next();
        }

    }

    private MetadataBundle(Bundle bundle)
    {
        this(1, bundle);
    }

    public static MetadataBundle copyOf(MetadataBundle metadatabundle)
    {
        return new MetadataBundle(new Bundle(metadatabundle.mValueBundle));
    }

    public static MetadataBundle create()
    {
        return new MetadataBundle(new Bundle());
    }

    public static MetadataBundle of(MetadataField metadatafield, Object obj)
    {
        MetadataBundle metadatabundle = create();
        metadatabundle.put(metadatafield, obj);
        return metadatabundle;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof MetadataBundle))
        {
            return false;
        }
        obj = (MetadataBundle)obj;
        Object obj1 = mValueBundle.keySet();
        if (!((Set) (obj1)).equals(((MetadataBundle) (obj)).mValueBundle.keySet()))
        {
            return false;
        }
        obj1 = ((Set) (obj1)).iterator();
        String s;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s = (String)((Iterator) (obj1)).next();
        } while (Objects.equal(mValueBundle.get(s), ((MetadataBundle) (obj)).mValueBundle.get(s)));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public final Object get(MetadataField metadatafield)
    {
        return metadatafield.getFromBundle(mValueBundle);
    }

    public final int hashCode()
    {
        int i = 1;
        for (Iterator iterator = mValueBundle.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            i = i * 31 + mValueBundle.get(s).hashCode();
        }

        return i;
    }

    public final void put(MetadataField metadatafield, Object obj)
    {
        if (FieldRegistry.getFieldByName(metadatafield.getName()) == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Unregistered field: ")).append(metadatafield.getName()).toString());
        } else
        {
            metadatafield.putInBundle(obj, mValueBundle);
            return;
        }
    }

    public final void setContext(Context context)
    {
        BitmapTeleporter bitmapteleporter = (BitmapTeleporter)get(BasicFields.THUMBNAIL);
        if (bitmapteleporter != null)
        {
            bitmapteleporter.setTempDir(context.getCacheDir());
        }
    }

    public final String toString()
    {
        return (new StringBuilder("MetadataBundle [values=")).append(mValueBundle).append("]").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MetadataBundleCreator.writeToParcel$476a8ef0(this, parcel);
    }

}
