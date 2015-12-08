// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import java.util.Collection;

final class ixh
    implements jby
{

    public static final android.os.Parcelable.Creator CREATOR = new ixi();
    private final int a;
    private final hyw b;
    private iym c;

    public ixh(int i, hyw hyw1)
    {
        boolean flag;
        if (hyw1.a.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Cannot perform action on 0 medias.");
        a = i;
        b = hyw1;
    }

    ixh(Parcel parcel)
    {
        a = parcel.readInt();
        b = (hyw)parcel.readParcelable(hyw.getClassLoader());
        c = (iym)parcel.readParcelable(iym.getClassLoader());
    }

    public final elb a(Context context)
    {
        Collection collection = b.a;
        context = ((iyj)b.a(context, iyj, collection)).a(a, collection, gaw.c, 10000);
        try
        {
            context = (iyk)context.a();
            c = ((iyk) (context)).b;
            context = b.b(((iyk) (context)).a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return b.a(context);
        }
        return context;
    }

    public final String a()
    {
        return "trash.MoveToTrashUndoableAction";
    }

    public final elb b(Context context)
    {
        p.b(c, "cannot undo failed action.");
        c.a(context);
        return b.b(b.a);
    }

    public final Object b()
    {
        return b.a;
    }

    public final String c(Context context)
    {
        int i = b.a.size();
        return context.getResources().getQuantityString(b.Bg, i, new Object[] {
            Integer.valueOf(i)
        });
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

}
