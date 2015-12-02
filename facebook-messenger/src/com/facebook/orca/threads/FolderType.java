// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.threads:
//            f

public class FolderType
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    public static final FolderType a = new FolderType("none");
    public static final FolderType b;
    public static final FolderType c;
    public static final FolderType d;
    public static final FolderType e;
    public static final FolderType f;
    private static final Class g = com/facebook/orca/threads/FolderType;
    private static final fi h;
    private final String i;

    private FolderType(Parcel parcel)
    {
        i = parcel.readString();
        boolean flag;
        if (!i.contains(":::::"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    FolderType(Parcel parcel, f f1)
    {
        this(parcel);
    }

    private FolderType(String s)
    {
        this(s, ((Collection) (es.d())));
    }

    private FolderType(String s, Collection collection)
    {
        boolean flag;
        if (!s.contains(":::::"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        i = s;
    }

    static FolderType a(FolderType foldertype)
    {
        return b(foldertype);
    }

    public static FolderType a(String s)
    {
        return b(new FolderType(s));
    }

    private static FolderType b(FolderType foldertype)
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            FolderType foldertype1 = (FolderType)iterator.next();
            if (Objects.equal(foldertype1, foldertype))
            {
                return foldertype1;
            }
        }

        com.facebook.debug.log.b.d(g, "Unexpected folder type %s", new Object[] {
            foldertype
        });
        return foldertype;
    }

    public String a()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FolderType)obj;
            if (i == null ? ((FolderType) (obj)).i != null : !i.equals(((FolderType) (obj)).i))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (i != null)
        {
            return i.hashCode();
        } else
        {
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(i);
    }

    static 
    {
        b = new FolderType("inbox");
        c = new FolderType("other");
        d = new FolderType("mms-sms");
        e = new FolderType("merged_inbox");
        f = new FolderType("archived-mms-sms");
        h = fi.a(b, c, d, e, f);
    }
}
