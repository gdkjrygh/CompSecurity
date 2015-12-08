// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public final class AppGroupCreationContent
    implements ShareModel
{
    public static final class AppGroupPrivacy extends Enum
    {

        public static final AppGroupPrivacy a;
        public static final AppGroupPrivacy b;
        private static final AppGroupPrivacy c[];

        public static AppGroupPrivacy valueOf(String s)
        {
            return (AppGroupPrivacy)Enum.valueOf(com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy, s);
        }

        public static AppGroupPrivacy[] values()
        {
            return (AppGroupPrivacy[])c.clone();
        }

        static 
        {
            a = new AppGroupPrivacy("Open", 0);
            b = new AppGroupPrivacy("Closed", 1);
            c = (new AppGroupPrivacy[] {
                a, b
            });
        }

        private AppGroupPrivacy(String s, int i)
        {
            super(s, i);
        }
    }


    private final String a;
    private final String b;
    private AppGroupPrivacy c;

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeSerializable(c);
    }
}
