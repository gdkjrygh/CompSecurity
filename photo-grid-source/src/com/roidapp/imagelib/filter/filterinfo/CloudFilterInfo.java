// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.filterinfo;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import com.roidapp.imagelib.filter.r;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.roidapp.imagelib.filter.filterinfo:
//            IFilterInfo, a

public class CloudFilterInfo
    implements IFilterInfo
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public Bundle f;

    public CloudFilterInfo()
    {
    }

    public final int a()
    {
        return b;
    }

    public final Drawable a(Context context)
    {
        context = r.a(context, d);
        if (context != null)
        {
            context = context.getResources();
            return context.getDrawable(context.getIdentifier(e, "drawable", d));
        } else
        {
            return null;
        }
    }

    public final InputStream a(Context context, String s)
    {
        context = r.a(context, d);
        if (context == null)
        {
            return null;
        }
        try
        {
            context = context.getAssets().open(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeBundle(f);
    }

}
