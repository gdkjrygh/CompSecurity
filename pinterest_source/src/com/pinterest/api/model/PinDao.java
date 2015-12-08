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
//            Pin, DaoSession

public class PinDao extends AbstractDao
{

    public static final String TABLENAME = "PIN";

    public PinDao(DaoConfig daoconfig)
    {
        super(daoconfig);
    }

    public PinDao(DaoConfig daoconfig, DaoSession daosession)
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
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(s).append("'PIN' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT ,'UID' TEXT,'CACHE_EXPIRATION_DATE' INTEGER,'INSERTION_ID' TEXT,'USER_UID' TEXT,'PROMOTER_UID' TEXT,'IS_DOWNSTREAM_PROMOTION' INTEGER,'BOARD_UID' TEXT,'INTEREST_UID' TEXT,'PINNED_TO_BOARD_UID' TEXT,'AGGREGATED_PIN_DATA_UID' TEXT,'CREATED_AT' INTEGER,'DOMAIN' TEXT,'DOMAIN_UID' TEXT,'DESCRIPTION' TEXT,'SEO_DESCRIPTION' TEXT,'CLEAN_DESCRIPTION' TEXT,'LINK' TEXT,'MOBILE_LINK' TEXT,'SOURCE' TEXT,'VIA_USER_UID' TEXT,'ATTR_TITLE' TEXT,'ATTR_PROVIDER_NAME' TEXT,'ATTR_PROVIDER_URL' TEXT,'ATTR_AUTHOR_NAME' TEXT,'ATTR_AUTHOR_URL' TEXT,'ATTR_PROVIDER_ICON_URL' TEXT,'IMAGE_SQUARE_URL' TEXT,'IMAGE_MEDIUM_URL' TEXT,'IMAGE_LARGE_URL' TEXT,'TYPE' TEXT,").append("'EMBED_URL' TEXT,'EMBED_TYPE' TEXT,'IMAGE_SQUARE_WIDTH' INTEGER,'IMAGE_SQUARE_HEIGHT' INTEGER,'IMAGE_MEDIUM_WIDTH' INTEGER,'IMAGE_MEDIUM_HEIGHT' INTEGER,'IMAGE_LARGE_WIDTH' INTEGER,'IMAGE_LARGE_HEIGHT' INTEGER,'EMBED_WIDTH' INTEGER,'EMBED_HEIGHT' INTEGER,'REPIN_COUNT' INTEGER,'LIKE_COUNT' INTEGER,'COMMENT_COUNT' INTEGER,'REPINNED' INTEGER,'LIKED' INTEGER,'VIDEO' INTEGER,'DOMINANT_COLOR' TEXT,'RICH_TITLE' TEXT,'RICH_SITE_NAME' TEXT,'RICH_TYPE_NAME' TEXT,'RICH_ICON' TEXT,'METADATA_JSON' TEXT,'PLACE_UID' TEXT,'HAS_PLACE' INTEGER,'RECOMMENDATION_BLOB' TEXT,'RECOMMENDATION_REASON' TEXT,'RECOMMENDATION_BOARD_UID' TEXT,'RECOMMENDATION_PIN_UID' TEXT,'RECOMMENDATION_INTEREST_UID' TEXT,'ADDITIONAL_HIDE_REASONS' TEXT,'EDITED_FIELDS' TEXT,'HIDDEN_STATE' INTEGER,").append("'FEEDBACK_TYPE' INTEGER,'VIEW_TAGS' TEXT,'CACHEABLE_ID' TEXT,'IS_CINEMATIC' INTEGER,'CINEMATIC_SRC' TEXT,'IS_PROMOTED' INTEGER,'CINEMATIC_PIN_WIDTH' INTEGER,'CINEMATIC_PIN_HEIGHT' INTEGER,'GALLERY' TEXT,'IMAGE_SIGNATURE' TEXT,'BUYABLE_PRODUCT_JSON' TEXT,'CANONICAL_MERCHANT_DOMAIN' TEXT);").toString());
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
        sqlitedatabase.execSQL(stringbuilder.append(s).append("'PIN'").toString());
    }

    protected void bindValues(SQLiteStatement sqlitestatement, Pin pin)
    {
        long l1 = 1L;
        sqlitestatement.clearBindings();
        Object obj = pin.getId();
        if (obj != null)
        {
            sqlitestatement.bindLong(1, ((Long) (obj)).longValue());
        }
        obj = pin.getUid();
        if (obj != null)
        {
            sqlitestatement.bindString(2, ((String) (obj)));
        }
        obj = pin.getCacheExpirationDate();
        if (obj != null)
        {
            sqlitestatement.bindLong(3, ((Date) (obj)).getTime());
        }
        obj = pin.getInsertionId();
        if (obj != null)
        {
            sqlitestatement.bindString(4, ((String) (obj)));
        }
        obj = pin.getUserUid();
        if (obj != null)
        {
            sqlitestatement.bindString(5, ((String) (obj)));
        }
        obj = pin.getPromoterUid();
        if (obj != null)
        {
            sqlitestatement.bindString(6, ((String) (obj)));
        }
        obj = pin.getIsDownstreamPromotion();
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
            sqlitestatement.bindLong(7, l);
        }
        obj = pin.getBoardUid();
        if (obj != null)
        {
            sqlitestatement.bindString(8, ((String) (obj)));
        }
        obj = pin.getInterestUid();
        if (obj != null)
        {
            sqlitestatement.bindString(9, ((String) (obj)));
        }
        obj = pin.getPinnedToBoardUid();
        if (obj != null)
        {
            sqlitestatement.bindString(10, ((String) (obj)));
        }
        obj = pin.getAggregatedPinDataUid();
        if (obj != null)
        {
            sqlitestatement.bindString(11, ((String) (obj)));
        }
        obj = pin.getCreatedAt();
        if (obj != null)
        {
            sqlitestatement.bindLong(12, ((Date) (obj)).getTime());
        }
        obj = pin.getDomain();
        if (obj != null)
        {
            sqlitestatement.bindString(13, ((String) (obj)));
        }
        obj = pin.getDomainUid();
        if (obj != null)
        {
            sqlitestatement.bindString(14, ((String) (obj)));
        }
        obj = pin.getDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(15, ((String) (obj)));
        }
        obj = pin.getSeoDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(16, ((String) (obj)));
        }
        obj = pin.getCleanDescription();
        if (obj != null)
        {
            sqlitestatement.bindString(17, ((String) (obj)));
        }
        obj = pin.getLink();
        if (obj != null)
        {
            sqlitestatement.bindString(18, ((String) (obj)));
        }
        obj = pin.getMobileLink();
        if (obj != null)
        {
            sqlitestatement.bindString(19, ((String) (obj)));
        }
        obj = pin.getSource();
        if (obj != null)
        {
            sqlitestatement.bindString(20, ((String) (obj)));
        }
        obj = pin.getViaUserUid();
        if (obj != null)
        {
            sqlitestatement.bindString(21, ((String) (obj)));
        }
        obj = pin.getAttrTitle();
        if (obj != null)
        {
            sqlitestatement.bindString(22, ((String) (obj)));
        }
        obj = pin.getAttrProviderName();
        if (obj != null)
        {
            sqlitestatement.bindString(23, ((String) (obj)));
        }
        obj = pin.getAttrProviderUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(24, ((String) (obj)));
        }
        obj = pin.getAttrAuthorName();
        if (obj != null)
        {
            sqlitestatement.bindString(25, ((String) (obj)));
        }
        obj = pin.getAttrAuthorUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(26, ((String) (obj)));
        }
        obj = pin.getAttrProviderIconUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(27, ((String) (obj)));
        }
        obj = pin.getImageSquareUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(28, ((String) (obj)));
        }
        obj = pin.getImageMediumUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(29, ((String) (obj)));
        }
        obj = pin.getImageLargeUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(30, ((String) (obj)));
        }
        obj = pin.getType();
        if (obj != null)
        {
            sqlitestatement.bindString(31, ((String) (obj)));
        }
        obj = pin.getEmbedUrl();
        if (obj != null)
        {
            sqlitestatement.bindString(32, ((String) (obj)));
        }
        obj = pin.getEmbedType();
        if (obj != null)
        {
            sqlitestatement.bindString(33, ((String) (obj)));
        }
        obj = pin.getImageSquareWidth();
        if (obj != null)
        {
            sqlitestatement.bindLong(34, ((Integer) (obj)).intValue());
        }
        obj = pin.getImageSquareHeight();
        if (obj != null)
        {
            sqlitestatement.bindLong(35, ((Integer) (obj)).intValue());
        }
        obj = pin.getImageMediumWidth();
        if (obj != null)
        {
            sqlitestatement.bindLong(36, ((Integer) (obj)).intValue());
        }
        obj = pin.getImageMediumHeight();
        if (obj != null)
        {
            sqlitestatement.bindLong(37, ((Integer) (obj)).intValue());
        }
        obj = pin.getImageLargeWidth();
        if (obj != null)
        {
            sqlitestatement.bindLong(38, ((Integer) (obj)).intValue());
        }
        obj = pin.getImageLargeHeight();
        if (obj != null)
        {
            sqlitestatement.bindLong(39, ((Integer) (obj)).intValue());
        }
        obj = pin.getEmbedWidth();
        if (obj != null)
        {
            sqlitestatement.bindLong(40, ((Integer) (obj)).intValue());
        }
        obj = pin.getEmbedHeight();
        if (obj != null)
        {
            sqlitestatement.bindLong(41, ((Integer) (obj)).intValue());
        }
        obj = pin.getRepinCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(42, ((Integer) (obj)).intValue());
        }
        obj = pin.getLikeCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(43, ((Integer) (obj)).intValue());
        }
        obj = pin.getCommentCount();
        if (obj != null)
        {
            sqlitestatement.bindLong(44, ((Integer) (obj)).intValue());
        }
        obj = pin.getRepinned();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(45, l);
        }
        obj = pin.getLiked();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(46, l);
        }
        obj = pin.getVideo();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(47, l);
        }
        obj = pin.getDominantColor();
        if (obj != null)
        {
            sqlitestatement.bindString(48, ((String) (obj)));
        }
        obj = pin.getRichTitle();
        if (obj != null)
        {
            sqlitestatement.bindString(49, ((String) (obj)));
        }
        obj = pin.getRichSiteName();
        if (obj != null)
        {
            sqlitestatement.bindString(50, ((String) (obj)));
        }
        obj = pin.getRichTypeName();
        if (obj != null)
        {
            sqlitestatement.bindString(51, ((String) (obj)));
        }
        obj = pin.getRichIcon();
        if (obj != null)
        {
            sqlitestatement.bindString(52, ((String) (obj)));
        }
        obj = pin.getMetadataJson();
        if (obj != null)
        {
            sqlitestatement.bindString(53, ((String) (obj)));
        }
        obj = pin.getPlaceUid();
        if (obj != null)
        {
            sqlitestatement.bindString(54, ((String) (obj)));
        }
        obj = pin.getHasPlace();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(55, l);
        }
        obj = pin.getRecommendationBlob();
        if (obj != null)
        {
            sqlitestatement.bindString(56, ((String) (obj)));
        }
        obj = pin.getRecommendationReason();
        if (obj != null)
        {
            sqlitestatement.bindString(57, ((String) (obj)));
        }
        obj = pin.getRecommendationBoardUid();
        if (obj != null)
        {
            sqlitestatement.bindString(58, ((String) (obj)));
        }
        obj = pin.getRecommendationPinUid();
        if (obj != null)
        {
            sqlitestatement.bindString(59, ((String) (obj)));
        }
        obj = pin.getRecommendationInterestUid();
        if (obj != null)
        {
            sqlitestatement.bindString(60, ((String) (obj)));
        }
        obj = pin.getAdditionalHideReasons();
        if (obj != null)
        {
            sqlitestatement.bindString(61, ((String) (obj)));
        }
        obj = pin.getEditedFields();
        if (obj != null)
        {
            sqlitestatement.bindString(62, ((String) (obj)));
        }
        obj = pin.getHiddenState();
        if (obj != null)
        {
            sqlitestatement.bindLong(63, ((Integer) (obj)).intValue());
        }
        obj = pin.getFeedbackType();
        if (obj != null)
        {
            sqlitestatement.bindLong(64, ((Integer) (obj)).intValue());
        }
        obj = pin.getViewTags();
        if (obj != null)
        {
            sqlitestatement.bindString(65, ((String) (obj)));
        }
        obj = pin.getCacheableId();
        if (obj != null)
        {
            sqlitestatement.bindString(66, ((String) (obj)));
        }
        obj = pin.getIsCinematic();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = 1L;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(67, l);
        }
        obj = pin.getCinematicSrc();
        if (obj != null)
        {
            sqlitestatement.bindString(68, ((String) (obj)));
        }
        obj = pin.getIsPromoted();
        if (obj != null)
        {
            if (((Boolean) (obj)).booleanValue())
            {
                l = l1;
            } else
            {
                l = 0L;
            }
            sqlitestatement.bindLong(69, l);
        }
        obj = pin.getCinematicPinWidth();
        if (obj != null)
        {
            sqlitestatement.bindLong(70, ((Integer) (obj)).intValue());
        }
        obj = pin.getCinematicPinHeight();
        if (obj != null)
        {
            sqlitestatement.bindLong(71, ((Integer) (obj)).intValue());
        }
        obj = pin.getGallery();
        if (obj != null)
        {
            sqlitestatement.bindString(72, ((String) (obj)));
        }
        obj = pin.getImageSignature();
        if (obj != null)
        {
            sqlitestatement.bindString(73, ((String) (obj)));
        }
        obj = pin.getBuyableProductJson();
        if (obj != null)
        {
            sqlitestatement.bindString(74, ((String) (obj)));
        }
        pin = pin.getCanonicalMerchantDomain();
        if (pin != null)
        {
            sqlitestatement.bindString(75, pin);
        }
    }

    protected volatile void bindValues(SQLiteStatement sqlitestatement, Object obj)
    {
        bindValues(sqlitestatement, (Pin)obj);
    }

    public Long getKey(Pin pin)
    {
        if (pin != null)
        {
            return pin.getId();
        } else
        {
            return null;
        }
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((Pin)obj);
    }

    protected boolean isEntityUpdateable()
    {
        return true;
    }

    public Pin readEntity(Cursor cursor, int i)
    {
        Long long1;
        String s;
        Date date;
        String s1;
        String s2;
        String s3;
        Boolean boolean1;
        String s4;
        String s5;
        String s6;
        String s7;
        Date date1;
        String s8;
        String s9;
        String s10;
        String s11;
        String s12;
        String s13;
        String s14;
        String s15;
        String s16;
        String s17;
        String s18;
        String s19;
        String s20;
        String s21;
        String s22;
        String s23;
        String s24;
        String s25;
        String s26;
        String s27;
        String s28;
        Integer integer;
        Integer integer1;
        Integer integer2;
        Integer integer3;
        Integer integer4;
        Integer integer5;
        Integer integer6;
        Integer integer7;
        Integer integer8;
        Integer integer9;
        Integer integer10;
        Boolean boolean2;
        Boolean boolean3;
        Boolean boolean4;
        String s29;
        String s30;
        String s31;
        String s32;
        String s33;
        String s34;
        String s35;
        Boolean boolean5;
        String s36;
        String s37;
        String s38;
        String s39;
        String s40;
        String s41;
        String s42;
        Integer integer11;
        Integer integer12;
        String s43;
        String s44;
        Boolean boolean6;
        String s45;
        Boolean boolean7;
        Integer integer13;
        Integer integer14;
        String s46;
        String s47;
        String s48;
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
            boolean1 = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 6) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            boolean1 = Boolean.valueOf(flag);
        }
        if (cursor.isNull(i + 7))
        {
            s4 = null;
        } else
        {
            s4 = cursor.getString(i + 7);
        }
        if (cursor.isNull(i + 8))
        {
            s5 = null;
        } else
        {
            s5 = cursor.getString(i + 8);
        }
        if (cursor.isNull(i + 9))
        {
            s6 = null;
        } else
        {
            s6 = cursor.getString(i + 9);
        }
        if (cursor.isNull(i + 10))
        {
            s7 = null;
        } else
        {
            s7 = cursor.getString(i + 10);
        }
        if (cursor.isNull(i + 11))
        {
            date1 = null;
        } else
        {
            date1 = new Date(cursor.getLong(i + 11));
        }
        if (cursor.isNull(i + 12))
        {
            s8 = null;
        } else
        {
            s8 = cursor.getString(i + 12);
        }
        if (cursor.isNull(i + 13))
        {
            s9 = null;
        } else
        {
            s9 = cursor.getString(i + 13);
        }
        if (cursor.isNull(i + 14))
        {
            s10 = null;
        } else
        {
            s10 = cursor.getString(i + 14);
        }
        if (cursor.isNull(i + 15))
        {
            s11 = null;
        } else
        {
            s11 = cursor.getString(i + 15);
        }
        if (cursor.isNull(i + 16))
        {
            s12 = null;
        } else
        {
            s12 = cursor.getString(i + 16);
        }
        if (cursor.isNull(i + 17))
        {
            s13 = null;
        } else
        {
            s13 = cursor.getString(i + 17);
        }
        if (cursor.isNull(i + 18))
        {
            s14 = null;
        } else
        {
            s14 = cursor.getString(i + 18);
        }
        if (cursor.isNull(i + 19))
        {
            s15 = null;
        } else
        {
            s15 = cursor.getString(i + 19);
        }
        if (cursor.isNull(i + 20))
        {
            s16 = null;
        } else
        {
            s16 = cursor.getString(i + 20);
        }
        if (cursor.isNull(i + 21))
        {
            s17 = null;
        } else
        {
            s17 = cursor.getString(i + 21);
        }
        if (cursor.isNull(i + 22))
        {
            s18 = null;
        } else
        {
            s18 = cursor.getString(i + 22);
        }
        if (cursor.isNull(i + 23))
        {
            s19 = null;
        } else
        {
            s19 = cursor.getString(i + 23);
        }
        if (cursor.isNull(i + 24))
        {
            s20 = null;
        } else
        {
            s20 = cursor.getString(i + 24);
        }
        if (cursor.isNull(i + 25))
        {
            s21 = null;
        } else
        {
            s21 = cursor.getString(i + 25);
        }
        if (cursor.isNull(i + 26))
        {
            s22 = null;
        } else
        {
            s22 = cursor.getString(i + 26);
        }
        if (cursor.isNull(i + 27))
        {
            s23 = null;
        } else
        {
            s23 = cursor.getString(i + 27);
        }
        if (cursor.isNull(i + 28))
        {
            s24 = null;
        } else
        {
            s24 = cursor.getString(i + 28);
        }
        if (cursor.isNull(i + 29))
        {
            s25 = null;
        } else
        {
            s25 = cursor.getString(i + 29);
        }
        if (cursor.isNull(i + 30))
        {
            s26 = null;
        } else
        {
            s26 = cursor.getString(i + 30);
        }
        if (cursor.isNull(i + 31))
        {
            s27 = null;
        } else
        {
            s27 = cursor.getString(i + 31);
        }
        if (cursor.isNull(i + 32))
        {
            s28 = null;
        } else
        {
            s28 = cursor.getString(i + 32);
        }
        if (cursor.isNull(i + 33))
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(cursor.getInt(i + 33));
        }
        if (cursor.isNull(i + 34))
        {
            integer1 = null;
        } else
        {
            integer1 = Integer.valueOf(cursor.getInt(i + 34));
        }
        if (cursor.isNull(i + 35))
        {
            integer2 = null;
        } else
        {
            integer2 = Integer.valueOf(cursor.getInt(i + 35));
        }
        if (cursor.isNull(i + 36))
        {
            integer3 = null;
        } else
        {
            integer3 = Integer.valueOf(cursor.getInt(i + 36));
        }
        if (cursor.isNull(i + 37))
        {
            integer4 = null;
        } else
        {
            integer4 = Integer.valueOf(cursor.getInt(i + 37));
        }
        if (cursor.isNull(i + 38))
        {
            integer5 = null;
        } else
        {
            integer5 = Integer.valueOf(cursor.getInt(i + 38));
        }
        if (cursor.isNull(i + 39))
        {
            integer6 = null;
        } else
        {
            integer6 = Integer.valueOf(cursor.getInt(i + 39));
        }
        if (cursor.isNull(i + 40))
        {
            integer7 = null;
        } else
        {
            integer7 = Integer.valueOf(cursor.getInt(i + 40));
        }
        if (cursor.isNull(i + 41))
        {
            integer8 = null;
        } else
        {
            integer8 = Integer.valueOf(cursor.getInt(i + 41));
        }
        if (cursor.isNull(i + 42))
        {
            integer9 = null;
        } else
        {
            integer9 = Integer.valueOf(cursor.getInt(i + 42));
        }
        if (cursor.isNull(i + 43))
        {
            integer10 = null;
        } else
        {
            integer10 = Integer.valueOf(cursor.getInt(i + 43));
        }
        if (cursor.isNull(i + 44))
        {
            boolean2 = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 44) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            boolean2 = Boolean.valueOf(flag1);
        }
        if (cursor.isNull(i + 45))
        {
            boolean3 = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 45) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            boolean3 = Boolean.valueOf(flag2);
        }
        if (cursor.isNull(i + 46))
        {
            boolean4 = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 46) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            boolean4 = Boolean.valueOf(flag3);
        }
        if (cursor.isNull(i + 47))
        {
            s29 = null;
        } else
        {
            s29 = cursor.getString(i + 47);
        }
        if (cursor.isNull(i + 48))
        {
            s30 = null;
        } else
        {
            s30 = cursor.getString(i + 48);
        }
        if (cursor.isNull(i + 49))
        {
            s31 = null;
        } else
        {
            s31 = cursor.getString(i + 49);
        }
        if (cursor.isNull(i + 50))
        {
            s32 = null;
        } else
        {
            s32 = cursor.getString(i + 50);
        }
        if (cursor.isNull(i + 51))
        {
            s33 = null;
        } else
        {
            s33 = cursor.getString(i + 51);
        }
        if (cursor.isNull(i + 52))
        {
            s34 = null;
        } else
        {
            s34 = cursor.getString(i + 52);
        }
        if (cursor.isNull(i + 53))
        {
            s35 = null;
        } else
        {
            s35 = cursor.getString(i + 53);
        }
        if (cursor.isNull(i + 54))
        {
            boolean5 = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 54) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            boolean5 = Boolean.valueOf(flag4);
        }
        if (cursor.isNull(i + 55))
        {
            s36 = null;
        } else
        {
            s36 = cursor.getString(i + 55);
        }
        if (cursor.isNull(i + 56))
        {
            s37 = null;
        } else
        {
            s37 = cursor.getString(i + 56);
        }
        if (cursor.isNull(i + 57))
        {
            s38 = null;
        } else
        {
            s38 = cursor.getString(i + 57);
        }
        if (cursor.isNull(i + 58))
        {
            s39 = null;
        } else
        {
            s39 = cursor.getString(i + 58);
        }
        if (cursor.isNull(i + 59))
        {
            s40 = null;
        } else
        {
            s40 = cursor.getString(i + 59);
        }
        if (cursor.isNull(i + 60))
        {
            s41 = null;
        } else
        {
            s41 = cursor.getString(i + 60);
        }
        if (cursor.isNull(i + 61))
        {
            s42 = null;
        } else
        {
            s42 = cursor.getString(i + 61);
        }
        if (cursor.isNull(i + 62))
        {
            integer11 = null;
        } else
        {
            integer11 = Integer.valueOf(cursor.getInt(i + 62));
        }
        if (cursor.isNull(i + 63))
        {
            integer12 = null;
        } else
        {
            integer12 = Integer.valueOf(cursor.getInt(i + 63));
        }
        if (cursor.isNull(i + 64))
        {
            s43 = null;
        } else
        {
            s43 = cursor.getString(i + 64);
        }
        if (cursor.isNull(i + 65))
        {
            s44 = null;
        } else
        {
            s44 = cursor.getString(i + 65);
        }
        if (cursor.isNull(i + 66))
        {
            boolean6 = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 66) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            boolean6 = Boolean.valueOf(flag5);
        }
        if (cursor.isNull(i + 67))
        {
            s45 = null;
        } else
        {
            s45 = cursor.getString(i + 67);
        }
        if (cursor.isNull(i + 68))
        {
            boolean7 = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 68) != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            boolean7 = Boolean.valueOf(flag6);
        }
        if (cursor.isNull(i + 69))
        {
            integer13 = null;
        } else
        {
            integer13 = Integer.valueOf(cursor.getInt(i + 69));
        }
        if (cursor.isNull(i + 70))
        {
            integer14 = null;
        } else
        {
            integer14 = Integer.valueOf(cursor.getInt(i + 70));
        }
        if (cursor.isNull(i + 71))
        {
            s46 = null;
        } else
        {
            s46 = cursor.getString(i + 71);
        }
        if (cursor.isNull(i + 72))
        {
            s47 = null;
        } else
        {
            s47 = cursor.getString(i + 72);
        }
        if (cursor.isNull(i + 73))
        {
            s48 = null;
        } else
        {
            s48 = cursor.getString(i + 73);
        }
        if (cursor.isNull(i + 74))
        {
            cursor = null;
        } else
        {
            cursor = cursor.getString(i + 74);
        }
        return new Pin(long1, s, date, s1, s2, s3, boolean1, s4, s5, s6, s7, date1, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, s25, s26, s27, s28, integer, integer1, integer2, integer3, integer4, integer5, integer6, integer7, integer8, integer9, integer10, boolean2, boolean3, boolean4, s29, s30, s31, s32, s33, s34, s35, boolean5, s36, s37, s38, s39, s40, s41, s42, integer11, integer12, s43, s44, boolean6, s45, boolean7, integer13, integer14, s46, s47, s48, cursor);
    }

    public volatile Object readEntity(Cursor cursor, int i)
    {
        return readEntity(cursor, i);
    }

    public void readEntity(Cursor cursor, Pin pin, int i)
    {
        boolean flag7 = true;
        Object obj1 = null;
        Object obj;
        if (cursor.isNull(i + 0))
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(cursor.getLong(i + 0));
        }
        pin.setId(((Long) (obj)));
        if (cursor.isNull(i + 1))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 1);
        }
        pin.setUid(((String) (obj)));
        if (cursor.isNull(i + 2))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 2));
        }
        pin.setCacheExpirationDate(((Date) (obj)));
        if (cursor.isNull(i + 3))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 3);
        }
        pin.setInsertionId(((String) (obj)));
        if (cursor.isNull(i + 4))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 4);
        }
        pin.setUserUid(((String) (obj)));
        if (cursor.isNull(i + 5))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 5);
        }
        pin.setPromoterUid(((String) (obj)));
        if (cursor.isNull(i + 6))
        {
            obj = null;
        } else
        {
            boolean flag;
            if (cursor.getShort(i + 6) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
        }
        pin.setIsDownstreamPromotion(((Boolean) (obj)));
        if (cursor.isNull(i + 7))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 7);
        }
        pin.setBoardUid(((String) (obj)));
        if (cursor.isNull(i + 8))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 8);
        }
        pin.setInterestUid(((String) (obj)));
        if (cursor.isNull(i + 9))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 9);
        }
        pin.setPinnedToBoardUid(((String) (obj)));
        if (cursor.isNull(i + 10))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 10);
        }
        pin.setAggregatedPinDataUid(((String) (obj)));
        if (cursor.isNull(i + 11))
        {
            obj = null;
        } else
        {
            obj = new Date(cursor.getLong(i + 11));
        }
        pin.setCreatedAt(((Date) (obj)));
        if (cursor.isNull(i + 12))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 12);
        }
        pin.setDomain(((String) (obj)));
        if (cursor.isNull(i + 13))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 13);
        }
        pin.setDomainUid(((String) (obj)));
        if (cursor.isNull(i + 14))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 14);
        }
        pin.setDescription(((String) (obj)));
        if (cursor.isNull(i + 15))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 15);
        }
        pin.setSeoDescription(((String) (obj)));
        if (cursor.isNull(i + 16))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 16);
        }
        pin.setCleanDescription(((String) (obj)));
        if (cursor.isNull(i + 17))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 17);
        }
        pin.setLink(((String) (obj)));
        if (cursor.isNull(i + 18))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 18);
        }
        pin.setMobileLink(((String) (obj)));
        if (cursor.isNull(i + 19))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 19);
        }
        pin.setSource(((String) (obj)));
        if (cursor.isNull(i + 20))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 20);
        }
        pin.setViaUserUid(((String) (obj)));
        if (cursor.isNull(i + 21))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 21);
        }
        pin.setAttrTitle(((String) (obj)));
        if (cursor.isNull(i + 22))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 22);
        }
        pin.setAttrProviderName(((String) (obj)));
        if (cursor.isNull(i + 23))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 23);
        }
        pin.setAttrProviderUrl(((String) (obj)));
        if (cursor.isNull(i + 24))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 24);
        }
        pin.setAttrAuthorName(((String) (obj)));
        if (cursor.isNull(i + 25))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 25);
        }
        pin.setAttrAuthorUrl(((String) (obj)));
        if (cursor.isNull(i + 26))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 26);
        }
        pin.setAttrProviderIconUrl(((String) (obj)));
        if (cursor.isNull(i + 27))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 27);
        }
        pin.setImageSquareUrl(((String) (obj)));
        if (cursor.isNull(i + 28))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 28);
        }
        pin.setImageMediumUrl(((String) (obj)));
        if (cursor.isNull(i + 29))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 29);
        }
        pin.setImageLargeUrl(((String) (obj)));
        if (cursor.isNull(i + 30))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 30);
        }
        pin.setType(((String) (obj)));
        if (cursor.isNull(i + 31))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 31);
        }
        pin.setEmbedUrl(((String) (obj)));
        if (cursor.isNull(i + 32))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 32);
        }
        pin.setEmbedType(((String) (obj)));
        if (cursor.isNull(i + 33))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 33));
        }
        pin.setImageSquareWidth(((Integer) (obj)));
        if (cursor.isNull(i + 34))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 34));
        }
        pin.setImageSquareHeight(((Integer) (obj)));
        if (cursor.isNull(i + 35))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 35));
        }
        pin.setImageMediumWidth(((Integer) (obj)));
        if (cursor.isNull(i + 36))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 36));
        }
        pin.setImageMediumHeight(((Integer) (obj)));
        if (cursor.isNull(i + 37))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 37));
        }
        pin.setImageLargeWidth(((Integer) (obj)));
        if (cursor.isNull(i + 38))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 38));
        }
        pin.setImageLargeHeight(((Integer) (obj)));
        if (cursor.isNull(i + 39))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 39));
        }
        pin.setEmbedWidth(((Integer) (obj)));
        if (cursor.isNull(i + 40))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 40));
        }
        pin.setEmbedHeight(((Integer) (obj)));
        if (cursor.isNull(i + 41))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 41));
        }
        pin.setRepinCount(((Integer) (obj)));
        if (cursor.isNull(i + 42))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 42));
        }
        pin.setLikeCount(((Integer) (obj)));
        if (cursor.isNull(i + 43))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 43));
        }
        pin.setCommentCount(((Integer) (obj)));
        if (cursor.isNull(i + 44))
        {
            obj = null;
        } else
        {
            boolean flag1;
            if (cursor.getShort(i + 44) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = Boolean.valueOf(flag1);
        }
        pin.setRepinned(((Boolean) (obj)));
        if (cursor.isNull(i + 45))
        {
            obj = null;
        } else
        {
            boolean flag2;
            if (cursor.getShort(i + 45) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = Boolean.valueOf(flag2);
        }
        pin.setLiked(((Boolean) (obj)));
        if (cursor.isNull(i + 46))
        {
            obj = null;
        } else
        {
            boolean flag3;
            if (cursor.getShort(i + 46) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = Boolean.valueOf(flag3);
        }
        pin.setVideo(((Boolean) (obj)));
        if (cursor.isNull(i + 47))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 47);
        }
        pin.setDominantColor(((String) (obj)));
        if (cursor.isNull(i + 48))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 48);
        }
        pin.setRichTitle(((String) (obj)));
        if (cursor.isNull(i + 49))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 49);
        }
        pin.setRichSiteName(((String) (obj)));
        if (cursor.isNull(i + 50))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 50);
        }
        pin.setRichTypeName(((String) (obj)));
        if (cursor.isNull(i + 51))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 51);
        }
        pin.setRichIcon(((String) (obj)));
        if (cursor.isNull(i + 52))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 52);
        }
        pin.setMetadataJson(((String) (obj)));
        if (cursor.isNull(i + 53))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 53);
        }
        pin.setPlaceUid(((String) (obj)));
        if (cursor.isNull(i + 54))
        {
            obj = null;
        } else
        {
            boolean flag4;
            if (cursor.getShort(i + 54) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            obj = Boolean.valueOf(flag4);
        }
        pin.setHasPlace(((Boolean) (obj)));
        if (cursor.isNull(i + 55))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 55);
        }
        pin.setRecommendationBlob(((String) (obj)));
        if (cursor.isNull(i + 56))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 56);
        }
        pin.setRecommendationReason(((String) (obj)));
        if (cursor.isNull(i + 57))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 57);
        }
        pin.setRecommendationBoardUid(((String) (obj)));
        if (cursor.isNull(i + 58))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 58);
        }
        pin.setRecommendationPinUid(((String) (obj)));
        if (cursor.isNull(i + 59))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 59);
        }
        pin.setRecommendationInterestUid(((String) (obj)));
        if (cursor.isNull(i + 60))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 60);
        }
        pin.setAdditionalHideReasons(((String) (obj)));
        if (cursor.isNull(i + 61))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 61);
        }
        pin.setEditedFields(((String) (obj)));
        if (cursor.isNull(i + 62))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 62));
        }
        pin.setHiddenState(((Integer) (obj)));
        if (cursor.isNull(i + 63))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 63));
        }
        pin.setFeedbackType(((Integer) (obj)));
        if (cursor.isNull(i + 64))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 64);
        }
        pin.setViewTags(((String) (obj)));
        if (cursor.isNull(i + 65))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 65);
        }
        pin.setCacheableId(((String) (obj)));
        if (cursor.isNull(i + 66))
        {
            obj = null;
        } else
        {
            boolean flag5;
            if (cursor.getShort(i + 66) != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            obj = Boolean.valueOf(flag5);
        }
        pin.setIsCinematic(((Boolean) (obj)));
        if (cursor.isNull(i + 67))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 67);
        }
        pin.setCinematicSrc(((String) (obj)));
        if (cursor.isNull(i + 68))
        {
            obj = null;
        } else
        {
            boolean flag6;
            if (cursor.getShort(i + 68) != 0)
            {
                flag6 = flag7;
            } else
            {
                flag6 = false;
            }
            obj = Boolean.valueOf(flag6);
        }
        pin.setIsPromoted(((Boolean) (obj)));
        if (cursor.isNull(i + 69))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 69));
        }
        pin.setCinematicPinWidth(((Integer) (obj)));
        if (cursor.isNull(i + 70))
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(cursor.getInt(i + 70));
        }
        pin.setCinematicPinHeight(((Integer) (obj)));
        if (cursor.isNull(i + 71))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 71);
        }
        pin.setGallery(((String) (obj)));
        if (cursor.isNull(i + 72))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 72);
        }
        pin.setImageSignature(((String) (obj)));
        if (cursor.isNull(i + 73))
        {
            obj = null;
        } else
        {
            obj = cursor.getString(i + 73);
        }
        pin.setBuyableProductJson(((String) (obj)));
        if (cursor.isNull(i + 74))
        {
            cursor = obj1;
        } else
        {
            cursor = cursor.getString(i + 74);
        }
        pin.setCanonicalMerchantDomain(cursor);
    }

    public volatile void readEntity(Cursor cursor, Object obj, int i)
    {
        readEntity(cursor, (Pin)obj, i);
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

    protected Long updateKeyAfterInsert(Pin pin, long l)
    {
        pin.setId(Long.valueOf(l));
        return Long.valueOf(l);
    }

    protected volatile Object updateKeyAfterInsert(Object obj, long l)
    {
        return updateKeyAfterInsert((Pin)obj, l);
    }
}
