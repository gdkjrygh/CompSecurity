// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.MediaResource;
import com.google.common.a.hq;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.facebook.orca.compose:
//            ba

public class MessageDraft
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ba();
    private final String a;
    private final int b;
    private final List c;
    private final String d;

    private MessageDraft(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readArrayList(com/facebook/ui/media/attachments/MediaResource.getClassLoader());
        d = parcel.readString();
    }

    MessageDraft(Parcel parcel, ba ba1)
    {
        this(parcel);
    }

    public MessageDraft(String s, int i, String s1)
    {
        a = s;
        b = i;
        c = hq.a();
        d = s1;
    }

    public MessageDraft(String s, int i, List list, String s1)
    {
        Preconditions.checkNotNull(list);
        a = s;
        b = i;
        c = list;
        d = s1;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public List c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MessageDraft))
            {
                return false;
            }
            obj = (MessageDraft)obj;
            if (!Objects.equal(a(), ((MessageDraft) (obj)).a()) || !Objects.equal(c(), ((MessageDraft) (obj)).c()) || !Objects.equal(d(), ((MessageDraft) (obj)).d()) || b() != ((MessageDraft) (obj)).b())
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeList(c);
        parcel.writeString(d);
    }

}
