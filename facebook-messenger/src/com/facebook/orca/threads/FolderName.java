// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.viewercontext.ViewerContext;
import com.google.common.a.fi;
import com.google.common.base.Objects;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.threads:
//            FolderType, e

public class FolderName
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    public static final FolderName a;
    public static final FolderName b;
    public static final FolderName c;
    public static final FolderName d;
    public static final FolderName e;
    public static final FolderName f;
    private static final fi g;
    private final FolderType h;
    private final String i;
    private final String j;

    private FolderName(Parcel parcel)
    {
        h = (FolderType)parcel.readParcelable(com/facebook/orca/threads/FolderType.getClassLoader());
        i = parcel.readString();
        j = b(h, i);
        c();
    }

    FolderName(Parcel parcel, e e1)
    {
        this(parcel);
    }

    private FolderName(FolderType foldertype)
    {
        this(foldertype, ((String) (null)));
    }

    private FolderName(FolderType foldertype, String s)
    {
        h = foldertype;
        i = s;
        j = b(foldertype, s);
        c();
    }

    static FolderName a(FolderName foldername)
    {
        return b(foldername);
    }

    public static FolderName a(FolderType foldertype)
    {
        return b(new FolderName(foldertype));
    }

    public static FolderName a(FolderType foldertype, ViewerContext viewercontext)
    {
        if (viewercontext != null && viewercontext.c())
        {
            return a(foldertype, viewercontext.a());
        } else
        {
            return a(foldertype);
        }
    }

    static FolderName a(FolderType foldertype, String s)
    {
        return b(new FolderName(foldertype, s));
    }

    public static FolderName a(String s)
    {
        String as[] = s.split(":::::");
        if (as.length == 1)
        {
            return a(FolderType.a(as[0]));
        }
        if (as.length == 2)
        {
            return a(FolderType.a(as[0]), as[1]);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid name ").append(s).toString());
        }
    }

    private static FolderName b(FolderName foldername)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            FolderName foldername1 = (FolderName)iterator.next();
            if (Objects.equal(foldername1, foldername))
            {
                return foldername1;
            }
        }

        return foldername;
    }

    private static String b(FolderType foldertype, String s)
    {
        if (s != null)
        {
            return (new StringBuilder()).append(foldertype.a()).append(":::::").append(s).toString();
        } else
        {
            return foldertype.a();
        }
    }

    private void c()
    {
        if (i != null && h != FolderType.b && h != FolderType.c)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected folder name for a pages profile: ").append(j).toString());
        } else
        {
            return;
        }
    }

    public FolderType a()
    {
        return h;
    }

    public String b()
    {
        return j;
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
            obj = (FolderName)obj;
            if (j == null ? ((FolderName) (obj)).j != null : !j.equals(((FolderName) (obj)).j))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (j != null)
        {
            return j.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return j;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeParcelable(h, k);
        parcel.writeString(i);
    }

    static 
    {
        a = new FolderName(FolderType.a);
        b = new FolderName(FolderType.b);
        c = new FolderName(FolderType.c);
        d = new FolderName(FolderType.d);
        e = new FolderName(FolderType.e);
        f = new FolderName(FolderType.f);
        g = fi.a(b, c, d, e, f);
    }
}
