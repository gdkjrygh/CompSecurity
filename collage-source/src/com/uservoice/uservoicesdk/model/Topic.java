// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.uservoice.uservoicesdk.rest.Callback;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel

public class Topic extends BaseModel
    implements Parcelable
{

    public static Topic ALL_ARTICLES = new _cls1();
    public static final android.os.Parcelable.Creator CREATOR = new _cls4();
    protected String name;
    private int numberOfArticles;

    public Topic()
    {
    }

    private Topic(Parcel parcel)
    {
        id = parcel.readInt();
        name = parcel.readString();
        numberOfArticles = parcel.readInt();
    }

    Topic(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public static void loadTopic(int i, Callback callback)
    {
        doGet(apiPath("/topics/%d.json", new Object[] {
            Integer.valueOf(i)
        }), new _cls3(callback, callback));
    }

    public static void loadTopics(Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("per_page", "100");
        doGet(apiPath("/topics.json", new Object[0]), hashmap, new _cls2(callback, callback));
    }

    public int describeContents()
    {
        return 0;
    }

    public String getName()
    {
        return name;
    }

    public int getNumberOfArticles()
    {
        return numberOfArticles;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        name = getString(jsonobject, "name");
        numberOfArticles = jsonobject.getInt("article_count");
    }

    public String toString()
    {
        return name;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeInt(numberOfArticles);
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}

}
