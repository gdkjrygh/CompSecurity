// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel

public class Article extends BaseModel
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls4();
    private String html;
    private String title;
    private String topicName;
    private int weight;

    public Article()
    {
    }

    private Article(Parcel parcel)
    {
        id = parcel.readInt();
        title = parcel.readString();
        html = parcel.readString();
        topicName = parcel.readString();
        weight = parcel.readInt();
    }

    Article(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public static RestTask loadInstantAnswers(String s, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("per_page", "3");
        hashmap.put("forum_id", String.valueOf(getConfig().getForumId()));
        hashmap.put("query", s);
        if (getConfig().getTopicId() != -1)
        {
            hashmap.put("topic_id", String.valueOf(getConfig().getTopicId()));
        }
        return doGet(apiPath("/instant_answers/search.json", new Object[0]), hashmap, new _cls3(callback, callback));
    }

    public static void loadPage(int i, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("sort", "ordered");
        hashmap.put("filter", "published");
        hashmap.put("per_page", "50");
        hashmap.put("page", String.valueOf(i));
        doGet(apiPath("/articles.json", new Object[0]), hashmap, new _cls1(callback, callback));
    }

    public static void loadPageForTopic(int i, int j, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("sort", "ordered");
        hashmap.put("filter", "published");
        hashmap.put("per_page", "50");
        hashmap.put("page", String.valueOf(j));
        doGet(apiPath("/topics/%d/articles.json", new Object[] {
            Integer.valueOf(i)
        }), hashmap, new _cls2(callback, callback));
    }

    public int describeContents()
    {
        return 0;
    }

    public String getHtml()
    {
        return html;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTopicName()
    {
        return topicName;
    }

    public int getWeight()
    {
        return weight;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        title = getString(jsonobject, "question");
        html = getHtml(jsonobject, "answer_html");
        if (jsonobject.has("normalized_weight"))
        {
            weight = jsonobject.getInt("normalized_weight");
        }
        if (!jsonobject.isNull("topic"))
        {
            topicName = getString(jsonobject.getJSONObject("topic"), "name");
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(id);
        parcel.writeString(title);
        parcel.writeString(html);
        parcel.writeString(topicName);
        parcel.writeInt(weight);
    }


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}

}
