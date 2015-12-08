// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.model;

import com.pinterest.api.model.Model;
import com.pinterest.api.model.User;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONException;

public class CollaboratorInvite extends Model
{

    public static final String DELETE_ACCESS = "delete";
    private String access;
    private long boardUid;
    private User inviteBy;
    private User invitedUser;
    private Status status;
    private String uid;

    public CollaboratorInvite()
    {
    }

    private static CollaboratorInvite make(PinterestJsonObject pinterestjsonobject, String s)
    {
        CollaboratorInvite collaboratorinvite = new CollaboratorInvite();
        collaboratorinvite.setUid(s);
        collaboratorinvite.setInviteBy(User.make(pinterestjsonobject.c("invited_by_user")));
        collaboratorinvite.setInvitedUser(User.make(pinterestjsonobject.c("invited_user")));
        collaboratorinvite.setStatus(Status.parseString(pinterestjsonobject.a("status", ""), null));
        collaboratorinvite.setBoardUid(pinterestjsonobject.c("board").a("id", 0L));
        collaboratorinvite.setAccess(pinterestjsonobject.e("access").a(" "));
        return collaboratorinvite;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < pinterestjsonarray.a()) 
        {
            try
            {
                arraylist.add(make(pinterestjsonarray.d(i), String.valueOf(i + 1000)));
            }
            catch (JSONException jsonexception) { }
            i++;
        }
        return arraylist;
    }

    public boolean containsAccess(String s)
    {
        return access != null && access.contains(s);
    }

    public String getAccess()
    {
        return access;
    }

    public long getBoardUid()
    {
        return boardUid;
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public User getInviteBy()
    {
        return inviteBy;
    }

    public User getInvitedUser()
    {
        return invitedUser;
    }

    public Status getStatus()
    {
        return status;
    }

    public String getUid()
    {
        return uid;
    }

    public boolean isCollaborator()
    {
        return isOwner() || status == Status.ACCEPTED;
    }

    public boolean isOwner()
    {
        return status == Status.OWNER;
    }

    public void setAccess(String s)
    {
        access = s;
    }

    public void setBoardUid(long l)
    {
        boardUid = l;
    }

    public void setCacheExpirationDate(Date date)
    {
    }

    public void setInviteBy(User user)
    {
        inviteBy = user;
    }

    public void setInvitedUser(User user)
    {
        invitedUser = user;
    }

    public void setStatus(Status status1)
    {
        status = status1;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status ACCEPTED;
        public static final Status DENIED;
        public static final Status NEW;
        public static final Status OWNER;
        public static final Status PENDING_APPROVAL;

        public static Status parseString(String s, Status status1)
        {
            try
            {
                s = valueOf(PStringUtils.toEnumUpperCase(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return status1;
            }
            return s;
        }

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/pinterest/activity/board/model/CollaboratorInvite$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            ACCEPTED = new Status("ACCEPTED", 0);
            NEW = new Status("NEW", 1);
            DENIED = new Status("DENIED", 2);
            OWNER = new Status("OWNER", 3);
            PENDING_APPROVAL = new Status("PENDING_APPROVAL", 4);
            $VALUES = (new Status[] {
                ACCEPTED, NEW, DENIED, OWNER, PENDING_APPROVAL
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }

}
