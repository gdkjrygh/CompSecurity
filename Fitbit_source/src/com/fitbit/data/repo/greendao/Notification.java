// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;


public class Notification
{

    private Integer entityStatus;
    private Long id;
    private Boolean isRead;
    private String message;
    private String programName;
    private Long serverId;
    private Long timestamp;
    private String type;
    private String userAvatar;
    private String userDisplayName;
    private String userEncodedId;

    public Notification()
    {
    }

    public Notification(Long long1)
    {
        id = long1;
    }

    public Notification(Long long1, Long long2, Integer integer, String s, Boolean boolean1, Long long3, String s1, 
            String s2, String s3, String s4, String s5)
    {
        id = long1;
        serverId = long2;
        entityStatus = integer;
        type = s;
        isRead = boolean1;
        timestamp = long3;
        message = s1;
        userAvatar = s2;
        userDisplayName = s3;
        userEncodedId = s4;
        programName = s5;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getIsRead()
    {
        return isRead;
    }

    public String getMessage()
    {
        return message;
    }

    public String getProgramName()
    {
        return programName;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }

    public String getType()
    {
        return type;
    }

    public String getUserAvatar()
    {
        return userAvatar;
    }

    public String getUserDisplayName()
    {
        return userDisplayName;
    }

    public String getUserEncodedId()
    {
        return userEncodedId;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setIsRead(Boolean boolean1)
    {
        isRead = boolean1;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setProgramName(String s)
    {
        programName = s;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setTimestamp(Long long1)
    {
        timestamp = long1;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUserAvatar(String s)
    {
        userAvatar = s;
    }

    public void setUserDisplayName(String s)
    {
        userDisplayName = s;
    }

    public void setUserEncodedId(String s)
    {
        userEncodedId = s;
    }
}
