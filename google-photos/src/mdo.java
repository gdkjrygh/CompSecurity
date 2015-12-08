// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class mdo extends mdm
{

    private lhw a;

    public mdo()
    {
        a = new lhw();
    }

    public final Intent a(Activity activity)
    {
        try
        {
            lhw lhw1 = a;
            android.content.res.Resources.Theme theme = activity.getTheme();
            TypedValue typedvalue = new TypedValue();
            TypedValue typedvalue1 = new TypedValue();
            if (theme.resolveAttribute(0x1010433, typedvalue, true) && !lhw1.a.hasExtra("primary_color"))
            {
                lhw1.a.putExtra("primary_color", typedvalue.data);
            }
            if (theme.resolveAttribute(0x1010434, typedvalue1, true) && !lhw1.a.hasExtra("primary_color_dark"))
            {
                lhw1.a.putExtra("primary_color_dark", typedvalue1.data);
            }
            jxz.a();
            jxz.b(activity);
            activity = lhw1.a;
            a = new lhw();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("GcorePlacePickerIntentBuilderImpl", "unable to build PlacePicker intent", activity);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Log.e("GcorePlacePickerIntentBuilderImpl", "unable to build PlacePicker intent", activity);
            return null;
        }
        return activity;
    }

    public final mdx a(mep mep1)
    {
        Object obj = new LatLng(mep1.a().a, mep1.a().b);
        Object obj1 = new LatLng(mep1.b().a, mep1.b().b);
        mep1 = a;
        obj = new LatLngBounds(((LatLng) (obj)), ((LatLng) (obj1)));
        b.d(obj);
        mep1 = ((lhw) (mep1)).a;
        obj1 = Parcel.obtain();
        ((SafeParcelable) (obj)).writeToParcel(((Parcel) (obj1)), 0);
        byte abyte0[] = ((Parcel) (obj1)).marshall();
        ((Parcel) (obj1)).recycle();
        mep1.putExtra("latlng_bounds", abyte0);
        return this;
    }
}
