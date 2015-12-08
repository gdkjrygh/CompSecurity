// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.model;

import android.os.Parcel;
import com.pinterest.api.model.Feed;
import com.pinterest.network.json.PinterestJsonArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.pinterest.activity.create.model:
//            PinnableImage

public class PinnableImageFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private List persistedItems;

    public PinnableImageFeed(Parcel parcel)
    {
        super(null, null);
        persistedItems = Collections.emptyList();
        readFromParcel(parcel);
    }

    public PinnableImageFeed(PinnableImageFeed pinnableimagefeed)
    {
        super(pinnableimagefeed);
        persistedItems = Collections.emptyList();
    }

    public PinnableImageFeed(PinterestJsonArray pinterestjsonarray)
    {
        HashSet hashset;
        ArrayList arraylist;
        int i;
        persistedItems = Collections.emptyList();
        if (pinterestjsonarray == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        hashset = new HashSet();
        arraylist = new ArrayList();
        i = 0;
_L3:
        if (i >= pinterestjsonarray.a()) goto _L2; else goto _L1
_L1:
        PinnableImage pinnableimage = PinnableImage.make(String.valueOf(arraylist.size()), pinterestjsonarray.d(i));
        if (pinnableimage != null)
        {
            try
            {
                if (hashset.add(pinnableimage.getImageUrl()))
                {
                    arraylist.add(pinnableimage);
                }
            }
            catch (Exception exception) { }
        }
        i++;
          goto _L3
_L2:
        setItems(arraylist);
        persistedItems = new ArrayList(arraylist);
    }

    protected List getPersistedItems()
    {
        return new ArrayList(persistedItems);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PinnableImageFeed createFromParcel(Parcel parcel)
        {
            return new PinnableImageFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PinnableImageFeed[] newArray(int i)
        {
            return new PinnableImageFeed[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
