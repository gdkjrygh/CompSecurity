// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import de.greenrobot.dao.DaoException;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            DaoSession, RankedUserDao, FriendshipDao

public class RankedUser
{

    private String aboutMe;
    private Boolean active;
    private Boolean areFriendshipsPublic;
    private String avatar;
    private Boolean challengesBeta;
    private String city;
    private long contactId;
    private String country;
    private transient DaoSession daoSession;
    private String displayName;
    private String email;
    private String encodedId;
    private Integer entityStatus;
    private Integer friendshipOldStatus;
    private Integer friendshipStatus;
    private List friendships;
    private String fullName;
    private String gender;
    private Long id;
    private Date inviteDate;
    private Long inviteId;
    private Boolean isFromContactBook;
    private Boolean isFromFacebook;
    private Boolean isNewInvite;
    private Date joinedDate;
    private transient RankedUserDao myDao;
    private String nickname;
    private String postal;
    private String state;
    private Long stepsAverage;
    private Long stepsSummary;
    private Date timeCreated;
    private String timezone;
    private Long timezoneOffset;

    public RankedUser()
    {
    }

    public RankedUser(Long long1)
    {
        id = long1;
    }

    public RankedUser(Long long1, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, Long long2, String s9, String s10, Date date, 
            Long long3, Integer integer, Long long4, Integer integer1, Integer integer2, long l, 
            String s11, String s12, Long long5, Boolean boolean1, Date date1, Date date2, Boolean boolean2, 
            Boolean boolean3, Boolean boolean4, Boolean boolean5, Boolean boolean6)
    {
        id = long1;
        aboutMe = s;
        avatar = s1;
        city = s2;
        country = s3;
        displayName = s4;
        encodedId = s5;
        fullName = s6;
        gender = s7;
        nickname = s8;
        timezoneOffset = long2;
        state = s9;
        timezone = s10;
        timeCreated = date;
        stepsSummary = long3;
        entityStatus = integer;
        stepsAverage = long4;
        friendshipStatus = integer1;
        friendshipOldStatus = integer2;
        contactId = l;
        email = s11;
        postal = s12;
        inviteId = long5;
        isNewInvite = boolean1;
        joinedDate = date1;
        inviteDate = date2;
        isFromContactBook = boolean2;
        challengesBeta = boolean3;
        isFromFacebook = boolean4;
        active = boolean5;
        areFriendshipsPublic = boolean6;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getRankedUserDao();
        } else
        {
            daosession = null;
        }
        myDao = daosession;
    }

    public void delete()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.delete(this);
            return;
        }
    }

    public String getAboutMe()
    {
        return aboutMe;
    }

    public Boolean getActive()
    {
        return active;
    }

    public Boolean getAreFriendshipsPublic()
    {
        return areFriendshipsPublic;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public Boolean getChallengesBeta()
    {
        return challengesBeta;
    }

    public String getCity()
    {
        return city;
    }

    public long getContactId()
    {
        return contactId;
    }

    public String getCountry()
    {
        return country;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getEncodedId()
    {
        return encodedId;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Integer getFriendshipOldStatus()
    {
        return friendshipOldStatus;
    }

    public Integer getFriendshipStatus()
    {
        return friendshipStatus;
    }

    public List getFriendships()
    {
        if (friendships != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getFriendshipDao()._queryRankedUser_Friendships(id);
        this;
        JVM INSTR monitorenter ;
        if (friendships == null)
        {
            friendships = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return friendships;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getGender()
    {
        return gender;
    }

    public Long getId()
    {
        return id;
    }

    public Date getInviteDate()
    {
        return inviteDate;
    }

    public Long getInviteId()
    {
        return inviteId;
    }

    public Boolean getIsFromContactBook()
    {
        return isFromContactBook;
    }

    public Boolean getIsFromFacebook()
    {
        return isFromFacebook;
    }

    public Boolean getIsNewInvite()
    {
        return isNewInvite;
    }

    public Date getJoinedDate()
    {
        return joinedDate;
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getPostal()
    {
        return postal;
    }

    public String getState()
    {
        return state;
    }

    public Long getStepsAverage()
    {
        return stepsAverage;
    }

    public Long getStepsSummary()
    {
        return stepsSummary;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public Long getTimezoneOffset()
    {
        return timezoneOffset;
    }

    public void refresh()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.refresh(this);
            return;
        }
    }

    public void resetFriendships()
    {
        this;
        JVM INSTR monitorenter ;
        friendships = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setAboutMe(String s)
    {
        aboutMe = s;
    }

    public void setActive(Boolean boolean1)
    {
        active = boolean1;
    }

    public void setAreFriendshipsPublic(Boolean boolean1)
    {
        areFriendshipsPublic = boolean1;
    }

    public void setAvatar(String s)
    {
        avatar = s;
    }

    public void setChallengesBeta(Boolean boolean1)
    {
        challengesBeta = boolean1;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setContactId(long l)
    {
        contactId = l;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setDisplayName(String s)
    {
        displayName = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setEncodedId(String s)
    {
        encodedId = s;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setFriendshipOldStatus(Integer integer)
    {
        friendshipOldStatus = integer;
    }

    public void setFriendshipStatus(Integer integer)
    {
        friendshipStatus = integer;
    }

    public void setFullName(String s)
    {
        fullName = s;
    }

    public void setGender(String s)
    {
        gender = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setInviteDate(Date date)
    {
        inviteDate = date;
    }

    public void setInviteId(Long long1)
    {
        inviteId = long1;
    }

    public void setIsFromContactBook(Boolean boolean1)
    {
        isFromContactBook = boolean1;
    }

    public void setIsFromFacebook(Boolean boolean1)
    {
        isFromFacebook = boolean1;
    }

    public void setIsNewInvite(Boolean boolean1)
    {
        isNewInvite = boolean1;
    }

    public void setJoinedDate(Date date)
    {
        joinedDate = date;
    }

    public void setNickname(String s)
    {
        nickname = s;
    }

    public void setPostal(String s)
    {
        postal = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setStepsAverage(Long long1)
    {
        stepsAverage = long1;
    }

    public void setStepsSummary(Long long1)
    {
        stepsSummary = long1;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimezone(String s)
    {
        timezone = s;
    }

    public void setTimezoneOffset(Long long1)
    {
        timezoneOffset = long1;
    }

    public void update()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.update(this);
            return;
        }
    }
}
