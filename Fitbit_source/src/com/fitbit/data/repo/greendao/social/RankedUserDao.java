// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.social:
//            RankedUser, DaoSession

public class RankedUserDao extends AbstractDao
{
    public static class Properties
    {

        public static final Property AboutMe = new Property(1, java/lang/String, "aboutMe", false, "ABOUT_ME");
        public static final Property Active = new Property(29, java/lang/Boolean, "active", false, "ACTIVE");
        public static final Property AreFriendshipsPublic = new Property(30, java/lang/Boolean, "areFriendshipsPublic", false, "ARE_FRIENDSHIPS_PUBLIC");
        public static final Property Avatar = new Property(2, java/lang/String, "avatar", false, "AVATAR");
        public static final Property ChallengesBeta = new Property(27, java/lang/Boolean, "challengesBeta", false, "CHALLENGES_BETA");
        public static final Property City = new Property(3, java/lang/String, "city", false, "CITY");
        public static final Property ContactId;
        public static final Property Country = new Property(4, java/lang/String, "country", false, "COUNTRY");
        public static final Property DisplayName = new Property(5, java/lang/String, "displayName", false, "DISPLAY_NAME");
        public static final Property Email = new Property(20, java/lang/String, "email", false, "EMAIL");
        public static final Property EncodedId = new Property(6, java/lang/String, "encodedId", false, "ENCODED_ID");
        public static final Property EntityStatus = new Property(15, java/lang/Integer, "entityStatus", false, "ENTITY_STATUS");
        public static final Property FriendshipOldStatus = new Property(18, java/lang/Integer, "friendshipOldStatus", false, "FRIENDSHIP_OLD_STATUS");
        public static final Property FriendshipStatus = new Property(17, java/lang/Integer, "friendshipStatus", false, "FRIENDSHIP_STATUS");
        public static final Property FullName = new Property(7, java/lang/String, "fullName", false, "FULL_NAME");
        public static final Property Gender = new Property(8, java/lang/String, "gender", false, "GENDER");
        public static final Property Id = new Property(0, java/lang/Long, "id", true, "_id");
        public static final Property InviteDate = new Property(25, java/util/Date, "inviteDate", false, "INVITE_DATE");
        public static final Property InviteId = new Property(22, java/lang/Long, "inviteId", false, "INVITE_ID");
        public static final Property IsFromContactBook = new Property(26, java/lang/Boolean, "isFromContactBook", false, "IS_FROM_CONTACT_BOOK");
        public static final Property IsFromFacebook = new Property(28, java/lang/Boolean, "isFromFacebook", false, "IS_FROM_FACEBOOK");
        public static final Property IsNewInvite = new Property(23, java/lang/Boolean, "isNewInvite", false, "IS_NEW_INVITE");
        public static final Property JoinedDate = new Property(24, java/util/Date, "joinedDate", false, "JOINED_DATE");
        public static final Property Nickname = new Property(9, java/lang/String, "nickname", false, "NICKNAME");
        public static final Property Postal = new Property(21, java/lang/String, "postal", false, "POSTAL");
        public static final Property State = new Property(11, java/lang/String, "state", false, "STATE");
        public static final Property StepsAverage = new Property(16, java/lang/Long, "stepsAverage", false, "STEPS_AVERAGE");
        public static final Property StepsSummary = new Property(14, java/lang/Long, "stepsSummary", false, "STEPS_SUMMARY");
        public static final Property TimeCreated = new Property(13, java/util/Date, "timeCreated", false, "TIME_CREATED");
        public static final Property Timezone = new Property(12, java/lang/String, "timezone", false, "TIMEZONE");
        public static final Property TimezoneOffset = new Property(10, java/lang/Long, "timezoneOffset", false, "TIMEZONE_OFFSET");

        static 
        {
            ContactId = new Property(19, Long.TYPE, "contactId", false, "CONTACT_ID");
        }

        public Properties()
        {
        }
    }


    public static final String TABLENAME = "RANKED_USER";
    private DaoSession daoSession;

    public RankedUserDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public RankedUserDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
        daoSession = daosession;
    }

    public static void createTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        String s;
        if (flag)
        {
            s = "IF NOT EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE TABLE ").append(s).append("'RANKED_USER' (").append("'_id' INTEGER PRIMARY KEY ,").append("'ABOUT_ME' TEXT,").append("'AVATAR' TEXT,").append("'CITY' TEXT,").append("'COUNTRY' TEXT,").append("'DISPLAY_NAME' TEXT,").append("'ENCODED_ID' TEXT UNIQUE ,").append("'FULL_NAME' TEXT,").append("'GENDER' TEXT,").append("'NICKNAME' TEXT,").append("'TIMEZONE_OFFSET' INTEGER,").append("'STATE' TEXT,").append("'TIMEZONE' TEXT,").append("'TIME_CREATED' INTEGER,").append("'STEPS_SUMMARY' INTEGER,").append("'ENTITY_STATUS' INTEGER,").append("'STEPS_AVERAGE' INTEGER,").append("'FRIENDSHIP_STATUS' INTEGER,").append("'FRIENDSHIP_OLD_STATUS' INTEGER,").append("'CONTACT_ID' INTEGER NOT NULL ,").append("'EMAIL' TEXT,").append("'POSTAL' TEXT,").append("'INVITE_ID' INTEGER,").append("'IS_NEW_INVITE' INTEGER,").append("'JOINED_DATE' INTEGER,").append("'INVITE_DATE' INTEGER,").append("'IS_FROM_CONTACT_BOOK' INTEGER,").append("'CHALLENGES_BETA' INTEGER,").append("'IS_FROM_FACEBOOK' INTEGER,").append("'ACTIVE' INTEGER,").append("'ARE_FRIENDSHIPS_PUBLIC' INTEGER);").toString());
        sqlitedatabase.execSQL((new StringBuilder()).append("CREATE INDEX ").append(s).append("IDX_RANKED_USER_ENCODED_ID ON RANKED_USER").append(" (ENCODED_ID);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'RANKED_USER'").toString());
    }

    protected void attachEntity(RankedUser rankeduser)
    {
        super.attachEntity(rankeduser);
        rankeduser.__setDaoSession(daoSession);
    }

    protected volatile void attachEntity(Object obj)
    {
        attachEntity((RankedUser)obj);
    }

    protected void bindValues(SQLiteStatement sqlitestatement, RankedUser rankeduser)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = rankeduser.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = rankeduser.getAboutMe();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = rankeduser.getAvatar();
        if (obj != null)
        {
            sqlitestatement.bindString(3, ((String) (obj)));
        }
        obj = rankeduser.getCity();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = rankeduser.getCountry();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = rankeduser.getDisplayName();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = rankeduser.getEncodedId();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = rankeduser.getFullName();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = rankeduser.getGender();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = rankeduser.getNickname();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = rankeduser.getTimezoneOffset();
        if (obj != null)
        {
            sqlitestatement.bindLong(11, ((Long) (obj)).longValue());
        }
        obj = rankeduser.getState();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = rankeduser.getTimezone();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = rankeduser.getTimeCreated();
        if (obj != null)
        {
            sqlitestatement.bindLong(14, ((Date) (obj)).getTime());
        }
        obj = rankeduser.getStepsSummary();
        if (obj != null)
        {
            sqlitestatement.bindLong(15, ((Long) (obj)).longValue());
        }
        obj = rankeduser.getEntityStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(16, ((Integer) (obj)).intValue());
        }
        obj = rankeduser.getStepsAverage();
        if (obj != null)
        {
            sqlitestatement.bindLong(17, ((Long) (obj)).longValue());
        }
        obj = rankeduser.getFriendshipStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(18, ((Integer) (obj)).intValue());
        }
        obj = rankeduser.getFriendshipOldStatus();
        if (obj != null)
        {
            sqlitestatement.bindLong(19, ((Integer) (obj)).intValue());
        }
        sqlitestatement.bindLong(20, rankeduser.getContactId());
        obj = rankeduser.getEmail();
        if (obj != null)
        {
            sqlitestatement.bindString(21, ((String) (obj)));
        }
        obj = rankeduser.getPostal();
        if (obj != null)
        {
            sqlitestatement.bindString(22, ((String) (obj)));
        }
        obj = rankeduser.getInviteId();
        if (obj != null)
        {
            sqlitestatement.bindLong(23, ((Long) (obj)).longValue());
        }
        obj = rankeduser.getIsNewInvite();
        long l;
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(24, l);
        }
        obj = rankeduser.getJoinedDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(25, ((Date) (obj)).getTime());
        }
        obj = rankeduser.getInviteDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(26, ((Date) (obj)).getTime());
        }
        obj = rankeduser.getIsFromContactBook();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(27, l);
        }
        obj = rankeduser.getChallengesBeta();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(28, l);
        }
        obj = rankeduser.getIsFromFacebook();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(29, l);
        }
        obj = rankeduser.getActive();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(30, l);
        }
        rankeduser = rankeduser.getAreFriendshipsPublic();
        if (rankeduser != null)
        {
            if (rankeduser.booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(31, l);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (RankedUser)obj);
    }

    public Long getKey(RankedUser rankeduser)
    {
        if (rankeduser != null)
        {
            return rankeduser.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((RankedUser)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public RankedUser readEntity(Cursor cursor, int i)
    {
        Long long1;
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        Long long2;
        String s9;
        String s10;
        Date date;
        Long long3;
        Integer integer;
        Long long4;
        Integer integer1;
        Integer integer2;
        String s11;
        String s12;
        Long long5;
        Boolean boolean1;
        Date date1;
        Date date2;
        Boolean boolean2;
        Boolean boolean3;
        Boolean boolean4;
        Boolean boolean5;
        long l;
        if (cursor.isNull(i + 0))
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(cursor.getLong(i + 0));
        }
        if (cursor.isNull(i + 1))
        {
            s = null;
        } else
        {
            s = cursor.getString(i + 1);
        }
        if (cursor.isNull(i + 2))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 2);
        }
        if (cursor.isNull(i + 3))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            long2 = null;
        } else
        {
            long2 = Long.valueOf(cursor.getLong(i + 10));
        }
        if (cursor.isNull(i + 11))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 11);
        }
        if (cursor.isNull(i + 12))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 13));
        }
        if (cursor.isNull(i + 14))
        {
            long3 = null;
        } else
        {
            long3 = Long.valueOf(cursor.getLong(i + 14));
        }
        if (cursor.isNull(i + 15))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 15));
        }
        if (cursor.isNull(i + 16))
        {
            long4 = null;
        } else
        {
            long4 = Long.valueOf(cursor.getLong(i + 16));
        }
        if (cursor.isNull(i + 17))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 17));
        }
        if (cursor.isNull(i + 18))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 18));
        }
        l = cursor.getLong(i + 19);
        if (cursor.isNull(i + 20))
        {
            s11 = null;
        } else
        {
            s11 = cursor.getString(i + 20);
        }
        if (cursor.isNull(i + 21))
        {
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 21);
        }
        if (cursor.isNull(i + 22))
        {
            long5 = null;
        } else
        {
            long5 = Long.valueOf(cursor.getLong(i + 22));
        }
        if (cursor.isNull(i + 23))
        {
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 23) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 24))
        {
            date1 = null;
        } else
        {
            date1 = new Date(cursor.getLong(i + 24));
        }
        if (cursor.isNull(i + 25))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 25));
        }
        if (cursor.isNull(i + 26))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 26) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 27))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 27) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 28))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 28) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 29))
        {
            boolean5 = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 29) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            boolean5 = Boolean.valueOf(flag4);
        }
        if (cursor.isNull(i + 30))
        {
            cursor = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 30) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            cursor = Boolean.valueOf(flag5);
        }
        return new RankedUser(long1, s, s1, s2, s3, s4, s5, s6, s7, s8, long2, s9, s10, date, long3, integer, long4, integer1, integer2, l, s11, s12, long5, boolean1, date1, date2, boolean2, boolean3, boolean4, boolean5, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, RankedUser rankeduser, int i)
    {
        boolean flag6 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        rankeduser.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        rankeduser.setAboutMe(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 2);
        }
        rankeduser.setAvatar(((String) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        rankeduser.setCity(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        rankeduser.setCountry(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        rankeduser.setDisplayName(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        rankeduser.setEncodedId(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        rankeduser.setFullName(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        rankeduser.setGender(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        rankeduser.setNickname(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 10));
        }
        rankeduser.setTimezoneOffset(((Long) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        rankeduser.setState(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        rankeduser.setTimezone(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 13));
        }
        rankeduser.setTimeCreated(((Date) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 14));
        }
        rankeduser.setStepsSummary(((Long) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 15));
        }
        rankeduser.setEntityStatus(((Integer) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 16));
        }
        rankeduser.setStepsAverage(((Long) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 17));
        }
        rankeduser.setFriendshipStatus(((Integer) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 18));
        }
        rankeduser.setFriendshipOldStatus(((Integer) (obj)));
        rankeduser.setContactId(cursor.getLong(i + 19));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 20);
        }
        rankeduser.setEmail(((String) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 21);
        }
        rankeduser.setPostal(((String) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 22));
        }
        rankeduser.setInviteId(((Long) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 23) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        rankeduser.setIsNewInvite(((Boolean) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 24));
        }
        rankeduser.setJoinedDate(((Date) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 25));
        }
        rankeduser.setInviteDate(((Date) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 26) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        rankeduser.setIsFromContactBook(((Boolean) (obj)));
        if (cursor.isNull(i + 27))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 27) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        rankeduser.setChallengesBeta(((Boolean) (obj)));
        if (cursor.isNull(i + 28))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 28) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        rankeduser.setIsFromFacebook(((Boolean) (obj)));
        if (cursor.isNull(i + 29))
        {
            obj = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 29) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            obj = Boolean.valueOf(flag4);
        }
        rankeduser.setActive(((Boolean) (obj)));
        if (cursor.isNull(i + 30))
        {
            cursor = obj1;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 30) != 0)
            {
                flag5 = flag6;
            } else
            {
                flag5 = false;
            }
            cursor = Boolean.valueOf(flag5);
        }
        rankeduser.setAreFriendshipsPublic(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (RankedUser)obj, i);
    }

    public Long readKey(Cursor cursor, int i)
    {
        if (cursor.isNull(i + 0))
        {
            return null;
        } else
        {
            return Long.valueOf(cursor.getLong(i + 0));
        }
    }

    public volatile Object readKey(Cursor cursor, int i)
    {
        return readKey(cursor, i);
    }

    protected Long updateKeyAfterInsert(RankedUser rankeduser, long l)
    {
        rankeduser.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((RankedUser)obj, l);
    }
}
