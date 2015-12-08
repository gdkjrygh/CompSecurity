// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            User, DaoSession

public class UserDao extends AbstractDao
{

    public static final String TABLENAME = "USER";

    public UserDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public UserDao(DaoConfig daoconfig, DaoSession daosession)
    {
        super(daoconfig, daosession);
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'USER' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'UID' TEXT,'CACHE_EXPIRATION_DATE' INTEGER,'IMAGE_SMALL_URL' TEXT,'IMAGE_MEDIUM_URL' TEXT,'IMAGE_LARGE_URL' TEXT,'FIRST_NAME' TEXT,'LAST_NAME' TEXT,'FULL_NAME' TEXT,'USERNAME' TEXT,'GENDER' TEXT,'EMAIL' TEXT,'EMAIL_VERIFIED' INTEGER,'ABOUT' TEXT,'FACEBOOK_URL' TEXT,'LOCATION' TEXT,'TWITTER_URL' TEXT,'WEBSITE' TEXT,'WEBSITE_VERIFIED' INTEGER,'VERIFIED_IDENTITY' INTEGER,'EXPLICIT_FOLLOWING' INTEGER,'IMPLICIT_FOLLOWING' INTEGER,'BLOCKED' INTEGER,'PUBLISH_TIMELINE' INTEGER,'PUBLISH_STREAM' INTEGER,'IS_EMPLOYEE' INTEGER,'HAS_PASSWORD' INTEGER,'FOLLOWING_COUNT' INTEGER,'INTEREST_FOLLOWING_COUNT' INTEGER,'FOLLOWERS_COUNT' INTEGER,'LIKE_COUNT' INTEGER,").append("'BOARD_COUNT' INTEGER,'PIN_COUNT' INTEGER,'CREATED_AT' INTEGER,'LAST_PIN_LIKED' INTEGER,'EXCLUDE_FROM_SEARCH' INTEGER,'HIDE_FROM_NEWS' INTEGER,'PERSONALIZE_FROM_OFFSITE_BROWSING' INTEGER,'PARTNER_UID' TEXT,'PIN_THUMBNAIL_URLS' TEXT,'ADS_CUSTOMIZE_FROM_CONVERSION' INTEGER,'IMPRESSUM_URL' TEXT,'SHOW_IMPRESSUM' INTEGER,'SOCIAL_NETWORK_NAME' TEXT,'CUSTOM_GENDER' TEXT,'CANONICAL_MERCHANT_DOMAIN' TEXT);").toString());
    }

    public static void dropTable(SQLiteDatabase sqlitedatabase, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DROP TABLE ");
        String s;
        if (flag)
        {
            s = "IF EXISTS ";
        } else
        {
            s = "";
        }
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'USER'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, User user)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = user.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = user.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = user.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Date) (obj)).getTime());
        }
        obj = user.getImageSmallUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = user.getImageMediumUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = user.getImageLargeUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = user.getFirstName();
        if (obj != null)
        {
            sqlitestatement.bindString(7, ((String) (obj)));
        }
        obj = user.getLastName();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = user.getFullName();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = user.getUsername();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = user.getGender();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = user.getEmail();
        if (obj != null)
        {
            sqlitestatement.bindString(12, ((String) (obj)));
        }
        obj = user.getEmailVerified();
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
            sqlitestatement.bindLong(13, l);
        }
        obj = user.getAbout();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = user.getFacebookUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = user.getLocation();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = user.getTwitterUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(17, ((String) (obj)));
        }
        obj = user.getWebsite();
        if (obj != null)
        {
            sqlitestatement.bindString(18, ((String) (obj)));
        }
        obj = user.getWebsiteVerified();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(19, l);
        }
        obj = user.getVerifiedIdentity();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(20, l);
        }
        obj = user.getExplicitFollowing();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(21, l);
        }
        obj = user.getImplicitFollowing();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(22, l);
        }
        obj = user.getBlocked();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(23, l);
        }
        obj = user.getPublishTimeline();
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
        obj = user.getPublishStream();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(25, l);
        }
        obj = user.getIsEmployee();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(26, l);
        }
        obj = user.getHasPassword();
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
        obj = user.getFollowingCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(28, ((Integer) (obj)).intValue());
        }
        obj = user.getInterestFollowingCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(29, ((Integer) (obj)).intValue());
        }
        obj = user.getFollowersCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(30, ((Integer) (obj)).intValue());
        }
        obj = user.getLikeCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(31, ((Integer) (obj)).intValue());
        }
        obj = user.getBoardCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(32, ((Integer) (obj)).intValue());
        }
        obj = user.getPinCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(33, ((Integer) (obj)).intValue());
        }
        obj = user.getCreatedAt();
        if (obj != null)
        {
            sqlitestatement.bindLong(34, ((Date) (obj)).getTime());
        }
        obj = user.getLastPinLiked();
        if (obj != null)
        {
            sqlitestatement.bindLong(35, ((Date) (obj)).getTime());
        }
        obj = user.getExcludeFromSearch();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(36, l);
        }
        obj = user.getHideFromNews();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(37, l);
        }
        obj = user.getPersonalizeFromOffsiteBrowsing();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(38, l);
        }
        obj = user.getPartnerUid();
        if (obj != null)
        {
            sqlitestatement.bindString(39, ((String) (obj)));
        }
        obj = user.getPinThumbnailUrls();
        if (obj != null)
        {
            sqlitestatement.bindString(40, ((String) (obj)));
        }
        obj = user.getAdsCustomizeFromConversion();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(41, l);
        }
        obj = user.getImpressumUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(42, ((String) (obj)));
        }
        obj = user.getShowImpressum();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(43, l);
        }
        obj = user.getSocialNetworkName();
        if (obj != null)
        {
            sqlitestatement.bindString(44, ((String) (obj)));
        }
        obj = user.getCustomGender();
        if (obj != null)
        {
            sqlitestatement.bindString(45, ((String) (obj)));
        }
        user = user.getCanonicalMerchantDomain();
        if (user != null)
        {
            sqlitestatement.bindString(46, user);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (User)obj);
    }

    public Long getKey(User user)
    {
        if (user != null)
        {
            return user.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((User)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public User readEntity(Cursor cursor, int i)
    {
        Long long1;
        String s;
        Date date;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        Boolean boolean1;
        String s10;
        String s11;
        String s12;
        String s13;
        String s14;
        Boolean boolean2;
        Boolean boolean3;
        Boolean boolean4;
        Boolean boolean5;
        Boolean boolean6;
        Boolean boolean7;
        Boolean boolean8;
        Boolean boolean9;
        Boolean boolean10;
        Integer integer;
        Integer integer1;
        Integer integer2;
        Integer integer3;
        Integer integer4;
        Integer integer5;
        Date date1;
        Date date2;
        Boolean boolean11;
        Boolean boolean12;
        Boolean boolean13;
        String s15;
        String s16;
        Boolean boolean14;
        String s17;
        Boolean boolean15;
        String s18;
        String s19;
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
            date = null;
        } else
        {
            date = new Date(cursor.getLong(i + 2));
        }
        if (cursor.isNull(i + 3))
        {
            s1 = null;
        } else
        {
            s1 = cursor.getString(i + 3);
        }
        if (cursor.isNull(i + 4))
        {
            s2 = null;
        } else
        {
            s2 = cursor.getString(i + 4);
        }
        if (cursor.isNull(i + 5))
        {
            s3 = null;
        } else
        {
            s3 = cursor.getString(i + 5);
        }
        if (cursor.isNull(i + 6))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 6);
        }
        if (cursor.isNull(i + 7))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 10);
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
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 12) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 13))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            s11 = null;
        } else
        {
            s11 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            s13 = null;
        } else
        {
            s13 = cursor.getString(i + 16);
        }
        if (cursor.isNull(i + 17))
        {
            s14 = null;
        } else
        {
            s14 = cursor.getString(i + 17);
        }
        if (cursor.isNull(i + 18))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 18) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 19))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 19) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 20))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 20) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 21))
        {
            boolean5 = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 21) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            boolean5 = Boolean.valueOf(flag4);
        }
        if (cursor.isNull(i + 22))
        {
            boolean6 = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 22) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            boolean6 = Boolean.valueOf(flag5);
        }
        if (cursor.isNull(i + 23))
        {
            boolean7 = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 23) != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            boolean7 = Boolean.valueOf(flag6);
        }
        if (cursor.isNull(i + 24))
        {
            boolean8 = null;
        } else
        {
            boolean flag7;
            if (cursor.getShort(i + 24) != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            boolean8 = Boolean.valueOf(flag7);
        }
        if (cursor.isNull(i + 25))
        {
            boolean9 = null;
        } else
        {
            boolean flag8;
            if (cursor.getShort(i + 25) != 0)
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            boolean9 = Boolean.valueOf(flag8);
        }
        if (cursor.isNull(i + 26))
        {
            boolean10 = null;
        } else
        {
            boolean flag9;
            if (cursor.getShort(i + 26) != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            boolean10 = Boolean.valueOf(flag9);
        }
        if (cursor.isNull(i + 27))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 27));
        }
        if (cursor.isNull(i + 28))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 28));
        }
        if (cursor.isNull(i + 29))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 29));
        }
        if (cursor.isNull(i + 30))
        {
            integer3 = null;
        } else
        {
            integer3 = Integer.valueOf(cursor.getInt(i + 30));
        }
        if (cursor.isNull(i + 31))
        {
            integer4 = null;
        } else
        {
            integer4 = Integer.valueOf(cursor.getInt(i + 31));
        }
        if (cursor.isNull(i + 32))
        {
            integer5 = null;
        } else
        {
            integer5 = Integer.valueOf(cursor.getInt(i + 32));
        }
        if (cursor.isNull(i + 33))
        {
            date1 = null;
        } else
        {
            date1 = new Date(cursor.getLong(i + 33));
        }
        if (cursor.isNull(i + 34))
        {
            date2 = null;
        } else
        {
            date2 = new Date(cursor.getLong(i + 34));
        }
        if (cursor.isNull(i + 35))
        {
            boolean11 = null;
        } else
        {
            boolean flag10;
            if (cursor.getShort(i + 35) != 0)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            boolean11 = Boolean.valueOf(flag10);
        }
        if (cursor.isNull(i + 36))
        {
            boolean12 = null;
        } else
        {
            boolean flag11;
            if (cursor.getShort(i + 36) != 0)
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            boolean12 = Boolean.valueOf(flag11);
        }
        if (cursor.isNull(i + 37))
        {
            boolean13 = null;
        } else
        {
            boolean flag12;
            if (cursor.getShort(i + 37) != 0)
            {
                flag12 = true;
            } else
            {
                flag12 = false;
            }
            boolean13 = Boolean.valueOf(flag12);
        }
        if (cursor.isNull(i + 38))
        {
            s15 = null;
        } else
        {
            s15 = cursor.getString(i + 38);
        }
        if (cursor.isNull(i + 39))
        {
            s16 = null;
        } else
        {
            s16 = cursor.getString(i + 39);
        }
        if (cursor.isNull(i + 40))
        {
            boolean14 = null;
        } else
        {
            boolean flag13;
            if (cursor.getShort(i + 40) != 0)
            {
                flag13 = true;
            } else
            {
                flag13 = false;
            }
            boolean14 = Boolean.valueOf(flag13);
        }
        if (cursor.isNull(i + 41))
        {
            s17 = null;
        } else
        {
            s17 = cursor.getString(i + 41);
        }
        if (cursor.isNull(i + 42))
        {
            boolean15 = null;
        } else
        {
            boolean flag14;
            if (cursor.getShort(i + 42) != 0)
            {
                flag14 = true;
            } else
            {
                flag14 = false;
            }
            boolean15 = Boolean.valueOf(flag14);
        }
        if (cursor.isNull(i + 43))
        {
            s18 = null;
        } else
        {
            s18 = cursor.getString(i + 43);
        }
        if (cursor.isNull(i + 44))
        {
            s19 = null;
        } else
        {
            s19 = cursor.getString(i + 44);
        }
        if (cursor.isNull(i + 45))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 45);
        }
        return new User(long1, s, date, s1, s2, s3, s4, s5, s6, s7, s8, s9, boolean1, s10, s11, s12, s13, s14, boolean2, boolean3, boolean4, boolean5, boolean6, boolean7, boolean8, boolean9, boolean10, integer, integer1, integer2, integer3, integer4, integer5, date1, date2, boolean11, boolean12, boolean13, s15, s16, boolean14, s17, boolean15, s18, s19, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, User user, int i)
    {
        boolean flag15 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        user.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        user.setUid(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 2));
        }
        user.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        user.setImageSmallUrl(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        user.setImageMediumUrl(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        user.setImageLargeUrl(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 6);
        }
        user.setFirstName(((String) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        user.setLastName(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        user.setFullName(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        user.setUsername(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        user.setGender(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 11);
        }
        user.setEmail(((String) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 12) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        user.setEmailVerified(((Boolean) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        user.setAbout(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        user.setFacebookUrl(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        user.setLocation(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 16);
        }
        user.setTwitterUrl(((String) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 17);
        }
        user.setWebsite(((String) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 18) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        user.setWebsiteVerified(((Boolean) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 19) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        user.setVerifiedIdentity(((Boolean) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 20) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        user.setExplicitFollowing(((Boolean) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 21) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            obj = Boolean.valueOf(flag4);
        }
        user.setImplicitFollowing(((Boolean) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 22) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            obj = Boolean.valueOf(flag5);
        }
        user.setBlocked(((Boolean) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 23) != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            obj = Boolean.valueOf(flag6);
        }
        user.setPublishTimeline(((Boolean) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            boolean flag7;
            if (cursor.getShort(i + 24) != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            obj = Boolean.valueOf(flag7);
        }
        user.setPublishStream(((Boolean) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            boolean flag8;
            if (cursor.getShort(i + 25) != 0)
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            obj = Boolean.valueOf(flag8);
        }
        user.setIsEmployee(((Boolean) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            boolean flag9;
            if (cursor.getShort(i + 26) != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            obj = Boolean.valueOf(flag9);
        }
        user.setHasPassword(((Boolean) (obj)));
        if (cursor.isNull(i + 27))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 27));
        }
        user.setFollowingCount(((Integer) (obj)));
        if (cursor.isNull(i + 28))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 28));
        }
        user.setInterestFollowingCount(((Integer) (obj)));
        if (cursor.isNull(i + 29))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 29));
        }
        user.setFollowersCount(((Integer) (obj)));
        if (cursor.isNull(i + 30))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 30));
        }
        user.setLikeCount(((Integer) (obj)));
        if (cursor.isNull(i + 31))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 31));
        }
        user.setBoardCount(((Integer) (obj)));
        if (cursor.isNull(i + 32))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 32));
        }
        user.setPinCount(((Integer) (obj)));
        if (cursor.isNull(i + 33))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 33));
        }
        user.setCreatedAt(((Date) (obj)));
        if (cursor.isNull(i + 34))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 34));
        }
        user.setLastPinLiked(((Date) (obj)));
        if (cursor.isNull(i + 35))
        {
            obj = null;
        } else
        {
            boolean flag10;
            if (cursor.getShort(i + 35) != 0)
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            obj = Boolean.valueOf(flag10);
        }
        user.setExcludeFromSearch(((Boolean) (obj)));
        if (cursor.isNull(i + 36))
        {
            obj = null;
        } else
        {
            boolean flag11;
            if (cursor.getShort(i + 36) != 0)
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            obj = Boolean.valueOf(flag11);
        }
        user.setHideFromNews(((Boolean) (obj)));
        if (cursor.isNull(i + 37))
        {
            obj = null;
        } else
        {
            boolean flag12;
            if (cursor.getShort(i + 37) != 0)
            {
                flag12 = true;
            } else
            {
                flag12 = false;
            }
            obj = Boolean.valueOf(flag12);
        }
        user.setPersonalizeFromOffsiteBrowsing(((Boolean) (obj)));
        if (cursor.isNull(i + 38))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 38);
        }
        user.setPartnerUid(((String) (obj)));
        if (cursor.isNull(i + 39))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 39);
        }
        user.setPinThumbnailUrls(((String) (obj)));
        if (cursor.isNull(i + 40))
        {
            obj = null;
        } else
        {
            boolean flag13;
            if (cursor.getShort(i + 40) != 0)
            {
                flag13 = true;
            } else
            {
                flag13 = false;
            }
            obj = Boolean.valueOf(flag13);
        }
        user.setAdsCustomizeFromConversion(((Boolean) (obj)));
        if (cursor.isNull(i + 41))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 41);
        }
        user.setImpressumUrl(((String) (obj)));
        if (cursor.isNull(i + 42))
        {
            obj = null;
        } else
        {
            boolean flag14;
            if (cursor.getShort(i + 42) != 0)
            {
                flag14 = flag15;
            } else
            {
                flag14 = false;
            }
            obj = Boolean.valueOf(flag14);
        }
        user.setShowImpressum(((Boolean) (obj)));
        if (cursor.isNull(i + 43))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 43);
        }
        user.setSocialNetworkName(((String) (obj)));
        if (cursor.isNull(i + 44))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 44);
        }
        user.setCustomGender(((String) (obj)));
        if (cursor.isNull(i + 45))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 45);
        }
        user.setCanonicalMerchantDomain(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (User)obj, i);
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

    protected Long updateKeyAfterInsert(User user, long l)
    {
        user.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((User)obj, l);
    }
}
