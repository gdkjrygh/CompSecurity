// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.LocalContent;
import com.google.android.gms.nearby.sharing.SharedContent;
import com.google.android.gms.nearby.sharing.ViewableItem;

public final class lma
    implements android.os.Parcelable.Creator
{

    public lma()
    {
    }

    public static void a(SharedContent sharedcontent, Parcel parcel, int i)
    {
        int j = b.q(parcel, 20293);
        b.c(parcel, 1, sharedcontent.a);
        b.a(parcel, 3, sharedcontent.b, false);
        b.a(parcel, 8, sharedcontent.c, i, false);
        b.a(parcel, 9, sharedcontent.d, i, false);
        b.r(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = b.b(parcel);
        ViewableItem aviewableitem[] = null;
        String s = null;
        int i = 0;
        LocalContent alocalcontent[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 2: // '\002'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 3: // '\003'
                    s = b.i(parcel, k);
                    break;

                case 8: // '\b'
                    aviewableitem = (ViewableItem[])b.b(parcel, k, ViewableItem.CREATOR);
                    break;

                case 9: // '\t'
                    alocalcontent = (LocalContent[])b.b(parcel, k, LocalContent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SharedContent(i, s, aviewableitem, alocalcontent);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new SharedContent[i];
    }
}
