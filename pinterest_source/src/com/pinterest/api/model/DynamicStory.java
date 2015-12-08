// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Model, DynamicTitle, User, DynamicRelationship, 
//            DynamicDisplayOption, ModelHelper

public class DynamicStory extends Model
{

    public static final String STORY_TYPE_BOARDS = "recommended_boards";
    public static final String STORY_TYPE_RELATED_PINS = "related_pins";
    public static final String STORY_TYPE_TOPICS = "recommended_topics";
    public static final String STORY_TYPE_TOPIC_PINS = "recommended_topic_pins";
    public static final String STORY_TYPE_USERS = "recommended_users";
    public static final String STORY_TYPE_USER_BOARDS = "recommended_user_boards";
    public static final String TYPE = "story";
    private boolean _shouldAnimateOnAppear;
    private HashMap auxData;
    private Date cacheExpirationDate;
    private String containerType;
    private String contentIds;
    private Boolean disableLogging;
    private DynamicDisplayOption displayOption;
    private String featuredIds;
    private Long id;
    private boolean isClientGenerated;
    private boolean isUserFollowing;
    private boolean noFollowButton;
    private List objects;
    private Integer position;
    private String regularIds;
    private DynamicRelationship relationship;
    private String storyType;
    private DynamicTitle subtitle;
    private DynamicTitle title;
    private String type;
    private String uid;
    private User user;

    public DynamicStory()
    {
        _shouldAnimateOnAppear = false;
        objects = new ArrayList();
    }

    public DynamicStory(Long long1)
    {
        _shouldAnimateOnAppear = false;
        objects = new ArrayList();
        id = long1;
    }

    public DynamicStory(Long long1, Date date, String s, String s1, String s2, String s3, Boolean boolean1, 
            String s4, String s5, String s6, Integer integer)
    {
        _shouldAnimateOnAppear = false;
        objects = new ArrayList();
        id = long1;
        cacheExpirationDate = date;
        type = s;
        uid = s1;
        storyType = s2;
        containerType = s3;
        disableLogging = boolean1;
        featuredIds = s4;
        regularIds = s5;
        contentIds = s6;
        position = integer;
    }

    public static DynamicStory make(PinterestJsonObject pinterestjsonobject)
    {
        return make(pinterestjsonobject, true);
    }

    public static DynamicStory make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        Object obj;
        if (pinterestjsonobject == null)
        {
            obj = null;
        } else
        {
            DynamicStory dynamicstory = (DynamicStory)pinterestjsonobject.a(com/pinterest/api/model/DynamicStory);
            if (pinterestjsonobject.f("title"))
            {
                dynamicstory.setTitle(DynamicTitle.make(pinterestjsonobject.c("title")));
            }
            if (pinterestjsonobject.f("subtitle"))
            {
                dynamicstory.setSubtitle(DynamicTitle.make(pinterestjsonobject.c("subtitle")));
            }
            obj = pinterestjsonobject.c("user");
            if (obj != null)
            {
                dynamicstory.user = User.make(((PinterestJsonObject) (obj)));
            }
            if (pinterestjsonobject.f("no_follow_button"))
            {
                dynamicstory.noFollowButton = pinterestjsonobject.a("no_follow_button").booleanValue();
            }
            if (pinterestjsonobject.f("is_following"))
            {
                dynamicstory.isUserFollowing = pinterestjsonobject.a("is_following").booleanValue();
            }
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("content");
            obj = dynamicstory;
            if (pinterestjsonobject1 != null)
            {
                if (pinterestjsonobject.c("relationships") != null)
                {
                    dynamicstory.relationship = DynamicRelationship.make(pinterestjsonobject.c("relationships"));
                }
                pinterestjsonobject = pinterestjsonobject.c("display_options");
                if (pinterestjsonobject != null)
                {
                    dynamicstory.displayOption = (DynamicDisplayOption)pinterestjsonobject.a(com/pinterest/api/model/DynamicDisplayOption);
                }
                dynamicstory.featuredIds = pinterestjsonobject1.e("featured_ids").a(",");
                pinterestjsonobject = pinterestjsonobject1.e("objects");
                if (pinterestjsonobject.a() > 0)
                {
                    StringBuilder stringbuilder = new StringBuilder();
                    for (int i = 0; i < pinterestjsonobject.a(); i++)
                    {
                        Model model = ModelHelper.getModelFromJson(pinterestjsonobject.c(i));
                        if (model != null)
                        {
                            dynamicstory.objects.add(model);
                            stringbuilder.append(String.format("%s:%s|", new Object[] {
                                pinterestjsonobject.c(i).a("type", ""), model.getUid()
                            }));
                        }
                    }

                    dynamicstory.setContentIds(stringbuilder.toString());
                }
                dynamicstory.getAuxData();
                ModelHelper.setDynamicStory(dynamicstory);
                return dynamicstory;
            }
        }
        return ((DynamicStory) (obj));
    }

    public HashMap getAuxData()
    {
        if (auxData == null)
        {
            auxData = new HashMap();
            auxData.put("story_id", getUid());
            auxData.put("story_type", getStoryType());
            auxData.put("content_ids", getContentIds());
        }
        return auxData;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getContainerType()
    {
        return containerType;
    }

    public String getContentIds()
    {
        return contentIds;
    }

    public Boolean getDisableLogging()
    {
        return disableLogging;
    }

    public DynamicDisplayOption getDisplayOption()
    {
        return displayOption;
    }

    public String getFeaturedIds()
    {
        return featuredIds;
    }

    public Model getFirstRelationObject()
    {
        if (getRelationship() != null && getRelationship().getObject(0) != null)
        {
            return getRelationship().getObject(0);
        } else
        {
            return null;
        }
    }

    public Long getId()
    {
        return id;
    }

    public boolean getIsClientGenerated()
    {
        return isClientGenerated;
    }

    public List getObjects()
    {
        return objects;
    }

    public int getObjectsCount()
    {
        return objects.size();
    }

    public Integer getPosition()
    {
        return position;
    }

    public String getRegularIds()
    {
        return regularIds;
    }

    public DynamicRelationship getRelationship()
    {
        return relationship;
    }

    public boolean getShouldAnimateOnAppear()
    {
        return _shouldAnimateOnAppear;
    }

    public String getStoryType()
    {
        return storyType;
    }

    public DynamicTitle getSubtitle()
    {
        return subtitle;
    }

    public DynamicTitle getTitle()
    {
        return title;
    }

    public String getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public User getUser()
    {
        return user;
    }

    public boolean isNoFollowButton()
    {
        return noFollowButton;
    }

    public boolean isUserFollowing()
    {
        return isUserFollowing;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setContainerType(String s)
    {
        containerType = s;
    }

    public void setContentIds(String s)
    {
        contentIds = s;
    }

    public void setDisableLogging(Boolean boolean1)
    {
        disableLogging = boolean1;
    }

    public void setDisplayOption(DynamicDisplayOption dynamicdisplayoption)
    {
        displayOption = dynamicdisplayoption;
    }

    public void setFeaturedIds(String s)
    {
        featuredIds = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setIsClientGenerated(boolean flag)
    {
        isClientGenerated = flag;
    }

    public void setObjects(List list)
    {
        objects = list;
    }

    public void setPosition(Integer integer)
    {
        position = integer;
    }

    public void setRegularIds(String s)
    {
        regularIds = s;
    }

    public void setShouldAnimateOnAppear(boolean flag)
    {
        _shouldAnimateOnAppear = flag;
    }

    public void setStoryType(String s)
    {
        storyType = s;
    }

    public void setSubtitle(DynamicTitle dynamictitle)
    {
        subtitle = dynamictitle;
    }

    public void setTitle(DynamicTitle dynamictitle)
    {
        title = dynamictitle;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUserFollowing(boolean flag)
    {
        isUserFollowing = flag;
    }
}
