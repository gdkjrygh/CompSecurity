// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcel;

final class gwc
    implements dis
{

    private final Context a;

    gwc(Context context)
    {
        a = context;
    }

    public final dir a(int i, byte abyte0[])
    {
        Object obj = Parcel.obtain();
        ((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj)).setDataPosition(0);
        abyte0 = (gue)gue.CREATOR.createFromParcel(((Parcel) (obj)));
        obj = (gvv)((Parcel) (obj)).readValue(gvv.getClassLoader());
        return new gwb(a, abyte0, ((gvv) (obj)));
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.photoeditor.save.SaveEditsOptimisticAction";
    }

    public final byte[] a(dir dir)
    {
        dir = (gwb)dir;
        Parcel parcel = Parcel.obtain();
        ((gwb) (dir)).a.writeToParcel(parcel, 0);
        parcel.writeValue(((gwb) (dir)).b);
        return parcel.marshall();
    }
}
