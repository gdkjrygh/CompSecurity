// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import java.util.Date;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.facebook.model:
//            GraphObject, GraphUser, GraphPlace, GraphObjectList

public interface OpenGraphAction
    extends GraphObject
{
    public static final class Factory
    {

        public static OpenGraphAction createForPost()
        {
            return createForPost(com/facebook/model/OpenGraphAction, null);
        }

        public static OpenGraphAction createForPost(Class class1, String s)
        {
            class1 = (OpenGraphAction)GraphObject.Factory.create(class1);
            if (s != null)
            {
                class1.setType(s);
            }
            return class1;
        }

        public static OpenGraphAction createForPost(String s)
        {
            return createForPost(com/facebook/model/OpenGraphAction, s);
        }

        public Factory()
        {
        }
    }


    public abstract GraphObject getApplication();

    public abstract JSONObject getComments();

    public abstract Date getCreatedTime();

    public abstract GraphObject getData();

    public abstract Date getEndTime();

    public abstract Date getExpiresTime();

    public abstract boolean getExplicitlyShared();

    public abstract GraphUser getFrom();

    public abstract String getId();

    public abstract List getImage();

    public abstract JSONObject getLikes();

    public abstract String getMessage();

    public abstract GraphPlace getPlace();

    public abstract Date getPublishTime();

    public abstract String getRef();

    public abstract Date getStartTime();

    public abstract GraphObjectList getTags();

    public abstract String getType();

    public abstract void setApplication(GraphObject graphobject);

    public abstract void setComments(JSONObject jsonobject);

    public abstract void setCreatedTime(Date date);

    public abstract void setData(GraphObject graphobject);

    public abstract void setEndTime(Date date);

    public abstract void setExpiresTime(Date date);

    public abstract void setExplicitlyShared(boolean flag);

    public abstract void setFrom(GraphUser graphuser);

    public abstract void setId(String s);

    public abstract void setImage(List list);

    public abstract void setImageUrls(List list);

    public abstract void setLikes(JSONObject jsonobject);

    public abstract void setMessage(String s);

    public abstract void setPlace(GraphPlace graphplace);

    public abstract void setPublishTime(Date date);

    public abstract void setRef(String s);

    public abstract void setStartTime(Date date);

    public abstract void setTags(List list);

    public abstract void setType(String s);
}
