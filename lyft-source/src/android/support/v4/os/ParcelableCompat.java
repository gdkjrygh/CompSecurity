// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;


// Referenced classes of package android.support.v4.os:
//            ParcelableCompatCreatorHoneycombMR2Stub, ParcelableCompatCreatorCallbacks

public class ParcelableCompat
{

    public static android.os.Parcelable.Creator a(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
    {
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return ParcelableCompatCreatorHoneycombMR2Stub.a(parcelablecompatcreatorcallbacks);
        } else
        {
            return new CompatCreator(parcelablecompatcreatorcallbacks);
        }
    }

    private class CompatCreator
        implements android.os.Parcelable.Creator
    {

        final ParcelableCompatCreatorCallbacks a;

        public Object createFromParcel(Parcel parcel)
        {
            return a.a(parcel, null);
        }

        public Object[] newArray(int i)
        {
            return a.a(i);
        }

        public CompatCreator(ParcelableCompatCreatorCallbacks parcelablecompatcreatorcallbacks)
        {
            a = parcelablecompatcreatorcallbacks;
        }
    }

}
