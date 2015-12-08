// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.facebook.model:
//            GraphObject, GraphObjectList

public interface OpenGraphObject
    extends GraphObject
{
    public static final class Factory
    {

        public static OpenGraphObject createForPost(Class class1, String s)
        {
            return createForPost(class1, s, null, null, null, null);
        }

        public static OpenGraphObject createForPost(Class class1, String s, String s1, String s2, String s3, String s4)
        {
            class1 = (OpenGraphObject)GraphObject.Factory.create(class1);
            if (s != null)
            {
                class1.setType(s);
            }
            if (s1 != null)
            {
                class1.setTitle(s1);
            }
            if (s2 != null)
            {
                class1.setImageUrls(Arrays.asList(new String[] {
                    s2
                }));
            }
            if (s3 != null)
            {
                class1.setUrl(s3);
            }
            if (s4 != null)
            {
                class1.setDescription(s4);
            }
            class1.setCreateObject(true);
            class1.setData(GraphObject.Factory.create());
            return class1;
        }

        public static OpenGraphObject createForPost(String s)
        {
            return createForPost(com/facebook/model/OpenGraphObject, s);
        }

        public Factory()
        {
        }
    }


    public abstract GraphObject getApplication();

    public abstract GraphObjectList getAudio();

    public abstract boolean getCreateObject();

    public abstract Date getCreatedTime();

    public abstract GraphObject getData();

    public abstract String getDescription();

    public abstract String getDeterminer();

    public abstract String getId();

    public abstract GraphObjectList getImage();

    public abstract boolean getIsScraped();

    public abstract String getPostActionId();

    public abstract List getSeeAlso();

    public abstract String getSiteName();

    public abstract String getTitle();

    public abstract String getType();

    public abstract Date getUpdatedTime();

    public abstract String getUrl();

    public abstract GraphObjectList getVideo();

    public abstract void setApplication(GraphObject graphobject);

    public abstract void setAudio(GraphObjectList graphobjectlist);

    public abstract void setCreateObject(boolean flag);

    public abstract void setCreatedTime(Date date);

    public abstract void setData(GraphObject graphobject);

    public abstract void setDescription(String s);

    public abstract void setDeterminer(String s);

    public abstract void setId(String s);

    public abstract void setImage(GraphObjectList graphobjectlist);

    public abstract void setImageUrls(List list);

    public abstract void setIsScraped(boolean flag);

    public abstract void setPostActionId(String s);

    public abstract void setSeeAlso(List list);

    public abstract void setSiteName(String s);

    public abstract void setTitle(String s);

    public abstract void setType(String s);

    public abstract void setUpdatedTime(Date date);

    public abstract void setUrl(String s);

    public abstract void setVideo(GraphObjectList graphobjectlist);
}
