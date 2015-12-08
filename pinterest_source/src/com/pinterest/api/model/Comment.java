// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.utils.PStringUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Model, User, ModelHelper

public class Comment extends Model
{

    private Date cacheExpirationDate;
    private Date createdAt;
    private Long id;
    private String pinUid;
    private String text;
    private String uid;
    private User user;
    private String userUid;

    public Comment()
    {
    }

    public Comment(Long long1)
    {
        id = long1;
    }

    public Comment(Long long1, String s, Date date, String s1, String s2, String s3, Date date1)
    {
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        userUid = s1;
        pinUid = s2;
        text = s3;
        createdAt = date1;
    }

    public static CommentArtifact make(String s, PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        CommentArtifact commentartifact = new CommentArtifact();
        PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("commenter");
        pinterestjsonobject = (Comment)pinterestjsonobject.a(com/pinterest/api/model/Comment);
        pinterestjsonobject.setPinUid(s);
        pinterestjsonobject.setText(PStringUtils.getAbsoluteHtmlString(pinterestjsonobject.getText(), true));
        s = new User();
        if (pinterestjsonobject1 != null)
        {
            s = User.make(pinterestjsonobject1, false);
            pinterestjsonobject.setUserUid(s.getUid());
        }
        s = User.merge(s);
        pinterestjsonobject.cacheUser(s);
        commentartifact.setComment(merge(pinterestjsonobject));
        commentartifact.setUser(s);
        if (flag)
        {
            ModelHelper.setComment(commentartifact.getComment());
            ModelHelper.setPartner(s.getPartner());
            ModelHelper.setUser(commentartifact.getUser());
        }
        return commentartifact;
    }

    public static Comment make(String s, PinterestJsonObject pinterestjsonobject)
    {
        return make(s, pinterestjsonobject, true).getComment();
    }

    public static List makeAll(String s, PinterestJsonArray pinterestjsonarray)
    {
        final ArrayList comments = new ArrayList();
        final ArrayList users = new ArrayList();
        final ArrayList partners = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            CommentArtifact commentartifact = make(s, pinterestjsonarray.d(i), false);
            comments.add(commentartifact.getComment());
            users.add(commentartifact.getUser());
            if (commentartifact.getUser().getPartner() != null)
            {
                partners.add(commentartifact.getUser().getPartner());
            }
        }

        (new _cls1()).execute();
        return comments;
    }

    public static Comment merge(Comment comment)
    {
        return comment;
    }

    public void cacheUser(User user1)
    {
        user = user1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Comment)obj;
            if (uid == null ? ((Comment) (obj)).uid != null : !uid.equals(((Comment) (obj)).uid))
            {
                return false;
            }
        }
        return true;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public Long getId()
    {
        return id;
    }

    public String getPinUid()
    {
        return pinUid;
    }

    public String getText()
    {
        return text;
    }

    public String getUid()
    {
        return uid;
    }

    public User getUser()
    {
        if (user == null)
        {
            user = ModelHelper.getUser(getUserUid());
        }
        return user;
    }

    public String getUserUid()
    {
        return userUid;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setPinUid(String s)
    {
        pinUid = s;
    }

    public void setText(String s)
    {
        text = s;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUserUid(String s)
    {
        userUid = s;
    }

    private class CommentArtifact
    {

        private Comment comment;
        private User user;

        public final Comment getComment()
        {
            return comment;
        }

        public final User getUser()
        {
            return user;
        }

        public final void setComment(Comment comment1)
        {
            comment = comment1;
        }

        public final void setUser(User user1)
        {
            user = user1;
        }

        public CommentArtifact()
        {
        }
    }


    private class _cls1 extends BackgroundTask
    {

        final List val$comments;
        final List val$partners;
        final List val$users;

        public final void run()
        {
            ModelHelper.setComments(comments);
            ModelHelper.setPartners(partners);
            ModelHelper.setUsers(users);
        }

        _cls1()
        {
            comments = list;
            partners = list1;
            users = list2;
            super();
        }
    }

}
