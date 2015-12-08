// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.PinApi;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.time.TimeUnit;
import com.pinterest.kit.utils.FileUtils;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import de.greenrobot.dao.DeleteQuery;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.QueryBuilder;
import de.greenrobot.dao.WhereCondition;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            PinDao, DaoSession, SearchTypeaheadDao, ModelAccessCache, 
//            Board, BoardDao, BoardInviteDao, ConversationDao, 
//            CommentDao, SyncJobDao, AggregatedPinDataDao, AggregatedPinData, 
//            BoardInvite, CategoryDao, Category, Comment, 
//            Conversation, ConversationMessageDao, DomainDao, Domain, 
//            DynamicStoryDao, DynamicStory, FilterOptionDao, FilterOption, 
//            InterestDao, Interest, ConversationMessage, Story, 
//            Pin, User, SyncJob, NotificationTemplateDao, 
//            NotificationTemplate, NotificationDao, Notification, PartnerDao, 
//            Partner, PlaceDao, Place, MyUser, 
//            SearchFilterDao, SearchFilter, StoryDao, UserDao, 
//            Feed, Model, DaoMaster, SearchTypeahead

public class ModelHelper
{

    private static final String DB_NAME = "pinterest-db";
    private static final String GET_RECENT_CONVERSATIONS_QUERY;
    private static final String GET_USER_PINS_QUERY_WHERE;
    private static final int MAX_CHUNK = 800;
    private static final int MILLISECONDS_IN_SECOND = 1000;
    public static final int OFFLINE_PINS_PAGE_SIZE = 25;
    private static final String SEARCH_TYPEAHED_QUERY;
    private static final String SECRET_BOARD_UIDS_QUERY;
    public static boolean SHOULD_CLEAR_SESSION;
    private static final SimpleDateFormat _dateFormatter;
    private static ModelHelper _instance;
    private static final Object _lock = new Object();
    private static List _pinPickItems = new ArrayList();
    private DaoSession _daoSession;

    public ModelHelper()
    {
        throw new Exception("init(context) only!");
    }

    private ModelHelper(Context context)
    {
        this(context, false);
    }

    private ModelHelper(Context context, boolean flag)
    {
        try
        {
            _daoSession = newSession(context, getDbName(flag));
            return;
        }
        catch (Exception exception)
        {
            _daoSession = newSession(context, getDbName(true));
        }
    }

    public static User blockUser(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        User user = getUser(s);
        if (user != null)
        {
            UserApi.i(s, baseapiresponsehandler, s1);
        }
        return user;
    }

    public static boolean containsUserPin(String s, String s1)
    {
        s = getPinDao().queryBuilder().where(PinDao.Properties.UserUid.eq(s), new WhereCondition[0]).where(PinDao.Properties.Uid.eq(s1), new WhereCondition[0]).list();
        if (s == null)
        {
            s = new ArrayList();
        }
        return s.size() > 0;
    }

    public static Date defaultCacheExpirationDate()
    {
        Date date = Calendar.getInstance().getTime();
        date.setTime(System.currentTimeMillis() + TimeUnit.c.b() * 4L);
        return date;
    }

    public static void deleteAllSearchTypeahead()
    {
        synchronized (_lock)
        {
            getSearchTypeaheadDao();
            SearchTypeaheadDao.dropTable(getInstance()._daoSession.getDatabase(), true);
            getSearchTypeaheadDao();
            SearchTypeaheadDao.createTable(getInstance()._daoSession.getDatabase(), false);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void deleteBoard(String s)
    {
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        Board board;
        board = getBoard(s);
        ModelAccessCache.removeBoard(s);
        if (board == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (board.getId() != null)
        {
            getBoardDao().delete(board);
            Events.postSticky(new Board.UpdateEvent(board, true));
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void deleteBoard(final String boardUid, final BaseApiResponseHandler handler, String s)
    {
        BoardApi.k(boardUid, new _cls4(), s);
    }

    public static void deleteBoardInvite(String s)
    {
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        s = getBoardInviteAcceptable(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        getBoardInviteDao().delete(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void deleteConversation(Conversation conversation)
    {
        synchronized (_lock)
        {
            getConversationDao().delete(conversation);
            getInstance()._daoSession.clear();
        }
        return;
        conversation;
        obj;
        JVM INSTR monitorexit ;
        throw conversation;
    }

    public static void deletePin(String s)
    {
        if (s == null)
        {
            return;
        }
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        Pin pin;
        pin = getPin(s);
        ModelAccessCache.removePin(s);
        if (pin == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        getPinDao().delete(pin);
        Events.postSticky(new Pin.UpdateEvent(pin, true));
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void deletePin(final String pinUid, final BaseApiResponseHandler handler, String s)
    {
        PinApi.h(pinUid, new _cls3(), s);
    }

    public static void deletePinComment(String s)
    {
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        s = getComment(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        getCommentDao().delete(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void deletePinComments(Long long1)
    {
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        long1 = getCommentDao().queryBuilder().where(CommentDao.Properties.PinUid.eq(long1), new WhereCondition[0]).list();
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (long1.size() > 0)
        {
            getCommentDao().deleteInTx(long1);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        long1;
        obj;
        JVM INSTR monitorexit ;
        throw long1;
    }

    public static void deleteSyncJob(SyncJob syncjob)
    {
        if (syncjob == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getSyncJobDao().delete(syncjob);
        }
        return;
        syncjob;
        obj;
        JVM INSTR monitorexit ;
        throw syncjob;
    }

    public static void deleteSyncJobGroup(String s)
    {
        synchronized (_lock)
        {
            getSyncJobDao().queryBuilder().where(SyncJobDao.Properties.GroupUid.like((new StringBuilder()).append(s).append("%").toString()), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void deleteSyncJobs()
    {
        synchronized (_lock)
        {
            getSyncJobDao().deleteAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void enforceCachePolicy(SQLiteDatabase sqlitedatabase)
    {
        Pair pair;
        Pair pair1;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        Pair pair5;
        Pair pair6;
        Pair pair7;
        Pair pair8;
        Pair pair9;
        Pair pair10;
        Pair pair11;
        Pair pair12;
        Pair pair13;
        Pair pair14;
        Pair pair15;
        Pair pair16;
        StopWatch.get().start("model_cache_cleanup");
        pair = new Pair("PIN", PinDao.Properties.CacheExpirationDate.columnName);
        pair1 = new Pair("BOARD", BoardDao.Properties.CacheExpirationDate.columnName);
        pair2 = new Pair("USER", UserDao.Properties.CacheExpirationDate.columnName);
        pair3 = new Pair("INTEREST", InterestDao.Properties.CacheExpirationDate.columnName);
        pair4 = new Pair("ACTOR", ActorDao.Properties.CacheExpirationDate.columnName);
        pair5 = new Pair("BOARD_INVITE", BoardInviteDao.Properties.CacheExpirationDate.columnName);
        pair6 = new Pair("BUSINESS_TYPE", BusinessTypeDao.Properties.CacheExpirationDate.columnName);
        pair7 = new Pair("COMMENT", CommentDao.Properties.CacheExpirationDate.columnName);
        pair8 = new Pair("CONVERSATION", ConversationDao.Properties.CacheExpirationDate.columnName);
        pair9 = new Pair("CONVERSATION_MESSAGE", ConversationMessageDao.Properties.CacheExpirationDate.columnName);
        pair10 = new Pair("FILTER_OPTION", FilterOptionDao.Properties.CacheExpirationDate.columnName);
        pair11 = new Pair("NOTIFICATION", NotificationDao.Properties.CacheExpirationDate.columnName);
        pair12 = new Pair("NOTIFICATION_TEMPLATE", NotificationTemplateDao.Properties.CacheExpirationDate.columnName);
        pair13 = new Pair("PARTNER", PartnerDao.Properties.CacheExpirationDate.columnName);
        pair14 = new Pair("PLACE", PlaceDao.Properties.CacheExpirationDate.columnName);
        pair15 = new Pair("SEARCH_FILTER", SearchFilterDao.Properties.CacheExpirationDate.columnName);
        pair16 = new Pair("STORY", StoryDao.Properties.CacheExpirationDate.columnName);
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        sqlitedatabase.execSQL("BEGIN");
        int i = 0;
_L2:
        if (i >= 17)
        {
            break; /* Loop/switch isn't completed */
        }
        Pair pair17 = (new Pair[] {
            pair, pair1, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, 
            pair10, pair11, pair12, pair13, pair14, pair15, pair16
        })[i];
        sqlitedatabase.execSQL((new StringBuilder("DELETE FROM ")).append((String)pair17.first).append(" WHERE ").append((String)pair17.second).append(" < strftime('%s000','now','localtime')").toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.execSQL("COMMIT");
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT total_changes()", null);
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_555;
        }
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_555;
        }
        boolean flag;
        if (sqlitedatabase.getLong(0) > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SHOULD_CLEAR_SESSION = flag;
        sqlitedatabase.close();
        obj;
        JVM INSTR monitorexit ;
        StopWatch.get().stop("model_cache_cleanup");
        return;
        sqlitedatabase;
        obj;
        JVM INSTR monitorexit ;
        throw sqlitedatabase;
    }

    public static Date extendedCacheExpirationDate()
    {
        Date date = Calendar.getInstance().getTime();
        date.setTime(System.currentTimeMillis() + TimeUnit.e.b() * 4L);
        return date;
    }

    private String generateNewDBName()
    {
        return (new StringBuilder("pinterest-db")).append(System.currentTimeMillis()).toString();
    }

    public static AggregatedPinData getAggregatedPinData(String s)
    {
        if (s != null)
        {
            if ((s = getAggregatedPinDataDao().queryBuilder().where(AggregatedPinDataDao.Properties.Uid.eq(s), new WhereCondition[0]).list()) != null && s.size() > 0)
            {
                return (AggregatedPinData)s.get(0);
            }
        }
        return null;
    }

    protected static AggregatedPinDataDao getAggregatedPinDataDao()
    {
        return getInstance()._daoSession.getAggregatedPinDataDao();
    }

    public static Board getBoard(String s)
    {
        if (s != null)
        {
            Board board = ModelAccessCache.getBoard(s);
            if (board != null)
            {
                return board;
            }
            s = getBoardDao().queryBuilder().where(BoardDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
            if (s != null && s.size() > 0)
            {
                s = (Board)s.get(0);
                ModelAccessCache.put(s);
                return s;
            }
        }
        return null;
    }

    protected static BoardDao getBoardDao()
    {
        return getInstance()._daoSession.getBoardDao();
    }

    public static BoardInvite getBoardInviteAcceptable(String s)
    {
        s = getBoardInviteDao().queryBuilder().where(BoardInviteDao.Properties.IsAcceptable.eq(Boolean.valueOf(true)), new WhereCondition[] {
            BoardInviteDao.Properties.BoardUid.eq(s)
        }).list();
        if (s != null && s.size() > 0)
        {
            return (BoardInvite)s.get(0);
        } else
        {
            return null;
        }
    }

    protected static BoardInviteDao getBoardInviteDao()
    {
        return getInstance()._daoSession.getBoardInviteDao();
    }

    public static List getBoardInvites(List list)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        ArrayList arraylist = new ArrayList();
        int k = (int)Math.ceil((float)list.size() / 800F);
        for (int i = 0; i < k; i++)
        {
            int l = Math.min((i + 1) * 800, list.size());
            arraylist.addAll(getBoardInviteDao().queryBuilder().where(BoardInviteDao.Properties.Uid.in(list.subList(i * 800, l)), new WhereCondition[0]).list());
        }

        if (arraylist.size() > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            BoardInvite boardinvite = new BoardInvite();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                boardinvite.setUid((String)list.next());
                int j = arraylist.indexOf(boardinvite);
                if (j != -1)
                {
                    arraylist1.add(arraylist.get(j));
                }
            } while (true);
            return arraylist1;
        } else
        {
            return new ArrayList();
        }
    }

    public static List getBoardInvitesAcceptable()
    {
        return getBoardInviteDao().queryBuilder().where(BoardInviteDao.Properties.IsAcceptable.eq(Boolean.valueOf(true)), new WhereCondition[0]).list();
    }

    public static List getBoardPins(String s)
    {
        if (s == null)
        {
            s = new ArrayList();
        } else
        {
            Object obj = getPinDao();
            s = (new StringBuilder()).append(PinDao.Properties.BoardUid.columnName).append(" = ").append(s).toString();
            String s1 = PinDao.Properties.CacheableId.columnName;
            String s2 = (new StringBuilder()).append(PinDao.Properties.CreatedAt.columnName).append(" desc").toString();
            obj = ((PinDao) (obj)).query(s, new String[0], s1, null, s2);
            s = ((String) (obj));
            if (obj == null)
            {
                return new ArrayList();
            }
        }
        return s;
    }

    public static List getBoards(List list)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        ArrayList arraylist = new ArrayList();
        int k = (int)Math.ceil((float)list.size() / 800F);
        for (int i = 0; i < k; i++)
        {
            int l = Math.min((i + 1) * 800, list.size());
            arraylist.addAll(getBoardDao().queryBuilder().where(BoardDao.Properties.Uid.in(list.subList(i * 800, l)), new WhereCondition[0]).list());
        }

        if (arraylist.size() > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            Board board = new Board();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                board.setUid((String)list.next());
                int j = arraylist.indexOf(board);
                if (j != -1)
                {
                    arraylist1.add(arraylist.get(j));
                }
            } while (true);
            return arraylist1;
        } else
        {
            return new ArrayList();
        }
    }

    public static List getBrowsableCategories(List list)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        List list1 = getCategoryDao().queryBuilder().where(CategoryDao.Properties.Browsable.eq(Boolean.valueOf(true)), new WhereCondition[] {
            CategoryDao.Properties.Key.in(list)
        }).list();
        if (list1.size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            Category category = new Category();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                category.setKey((String)list.next());
                int i = list1.indexOf(category);
                if (i != -1)
                {
                    arraylist.add(list1.get(i));
                }
            } while (true);
            return arraylist;
        } else
        {
            return new ArrayList();
        }
    }

    public static List getCategories()
    {
        List list = getCategoryDao().queryBuilder().list();
        if (list != null && list.size() > 0)
        {
            return list;
        } else
        {
            return new ArrayList();
        }
    }

    public static List getCategories(List list)
    {
        List list1 = getCategoryDao().queryBuilder().where(CategoryDao.Properties.Key.in(list), new WhereCondition[0]).list();
        if (list1 != null && list1.size() > 0)
        {
            Category category = new Category();
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                category.setKey((String)list.next());
                int i = list1.indexOf(category);
                if (i != -1)
                {
                    arraylist.add(list1.get(i));
                }
            } while (true);
            return arraylist;
        } else
        {
            return new ArrayList();
        }
    }

    public static Category getCategory(String s)
    {
        if (s != null)
        {
            Category category = ModelAccessCache.getCategory(s);
            if (category != null)
            {
                return category;
            }
            s = getCategoryDao().queryBuilder().where(CategoryDao.Properties.Key.eq(s), new WhereCondition[0]).list();
            if (s != null && s.size() > 0)
            {
                s = (Category)s.get(0);
                ModelAccessCache.put(s);
                return s;
            }
        }
        return null;
    }

    protected static CategoryDao getCategoryDao()
    {
        return getInstance()._daoSession.getCategoryDao();
    }

    public static Comment getComment(String s)
    {
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        s = getCommentDao().queryBuilder().where(CommentDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (s.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s = (Comment)s.get(0);
        return s;
        obj;
        JVM INSTR monitorexit ;
        return null;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected static CommentDao getCommentDao()
    {
        return getInstance()._daoSession.getCommentDao();
    }

    public static List getComments(List list)
    {
        Object obj = _lock;
        obj;
        JVM INSTR monitorenter ;
        List list1 = getCommentDao().queryBuilder().where(CommentDao.Properties.Uid.in(list), new WhereCondition[0]).list();
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        ArrayList arraylist;
        Comment comment;
        if (list1.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        arraylist = new ArrayList();
        comment = new Comment();
        list = list.iterator();
_L2:
        int i;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_127;
            }
            comment.setUid((String)list.next());
            i = list1.indexOf(comment);
        } while (i == -1);
        arraylist.add(list1.get(i));
        if (true) goto _L2; else goto _L1
_L1:
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
        obj;
        JVM INSTR monitorexit ;
        return arraylist;
        obj;
        JVM INSTR monitorexit ;
        return new ArrayList();
    }

    public static Conversation getConversation(String s)
    {
        s = getConversationDao().queryBuilder().where(ConversationDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
        if (!s.isEmpty())
        {
            return (Conversation)s.get(0);
        } else
        {
            return null;
        }
    }

    protected static ConversationDao getConversationDao()
    {
        return getInstance()._daoSession.getConversationDao();
    }

    protected static ConversationMessageDao getConversationMessageDao()
    {
        return getInstance()._daoSession.getConversationMessageDao();
    }

    public static List getConversationMessages(String s, int i)
    {
        return getConversationMessageDao().queryBuilder().where(ConversationMessageDao.Properties.ConversationId.eq(s), new WhereCondition[0]).orderDesc(new Property[] {
            ConversationMessageDao.Properties.CreatedAt
        }).limit(i).list();
    }

    private String getDbName(boolean flag)
    {
        String s = Preferences.user().getString("DB_NAME", null);
        if (StringUtils.isNotBlank(s))
        {
            final File dbFile = Application.context().getDatabasePath(s);
            if (dbFile != null && dbFile.exists())
            {
                PLog.error((new StringBuilder("Disk cache size is: ")).append(dbFile.length() / 1000L).append("kb").toString(), new Object[0]);
                if (!flag)
                {
                    return s;
                }
                (new _cls5()).execute();
            }
        }
        s = generateNewDBName();
        Preferences.user().set("DB_NAME", s);
        return s;
    }

    public static Domain getDomain(String s)
    {
        if (s != null)
        {
            Domain domain = ModelAccessCache.getDomain(s);
            if (domain != null)
            {
                return domain;
            }
            s = getDomainDao().queryBuilder().where(DomainDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
            if (s != null && s.size() > 0)
            {
                s = (Domain)s.get(0);
                ModelAccessCache.put(s);
                return s;
            }
        }
        return null;
    }

    protected static DomainDao getDomainDao()
    {
        return getInstance()._daoSession.getDomainDao();
    }

    public static DynamicStory getDynamicStory(String s)
    {
        if (s != null)
        {
            if ((s = getDynamicStoryDao().queryBuilder().where(DynamicStoryDao.Properties.Uid.eq(s), new WhereCondition[0]).list()) != null && s.size() > 0)
            {
                return (DynamicStory)s.get(0);
            }
        }
        return null;
    }

    protected static DynamicStoryDao getDynamicStoryDao()
    {
        return getInstance()._daoSession.getDynamicStoryDao();
    }

    public static FilterOption getFilterOption(String s)
    {
        if (s != null)
        {
            if ((s = getFilterOptionDao().queryBuilder().where(FilterOptionDao.Properties.TypeValue.eq(s), new WhereCondition[0]).list()) != null && s.size() > 0)
            {
                return (FilterOption)s.get(0);
            }
        }
        return null;
    }

    protected static FilterOptionDao getFilterOptionDao()
    {
        return getInstance()._daoSession.getFilterOptionDao();
    }

    public static ModelHelper getInstance()
    {
        ModelHelper modelhelper;
        synchronized (_lock)
        {
            if (_instance == null)
            {
                _instance = new ModelHelper(Application.context());
            }
            modelhelper = _instance;
        }
        return modelhelper;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Interest getInterest(String s)
    {
        if (s != null)
        {
            Interest interest = ModelAccessCache.getInterest(s);
            if (interest != null)
            {
                return interest;
            }
            s = getInterestDao().queryBuilder().where(InterestDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
            if (s != null && s.size() > 0)
            {
                s = (Interest)s.get(0);
                ModelAccessCache.put(s);
                return s;
            }
        }
        return null;
    }

    protected static InterestDao getInterestDao()
    {
        return getInstance()._daoSession.getInterestDao();
    }

    public static List getInterests(List list)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        ArrayList arraylist = new ArrayList();
        int k = (int)Math.ceil((float)list.size() / 800F);
        for (int i = 0; i < k; i++)
        {
            int l = Math.min((i + 1) * 800, list.size());
            arraylist.addAll(getInterestDao().queryBuilder().where(InterestDao.Properties.Uid.in(list.subList(i * 800, l)), new WhereCondition[0]).list());
        }

        if (arraylist.size() > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            Interest interest = new Interest();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                interest.setUid((String)list.next());
                int j = arraylist.indexOf(interest);
                if (j != -1)
                {
                    arraylist1.add(arraylist.get(j));
                }
            } while (true);
            return arraylist1;
        } else
        {
            return new ArrayList();
        }
    }

    public static ConversationMessage getLastConversationMessage(String s)
    {
        s = getConversationMessages(s, 1);
        if (s != null && !s.isEmpty())
        {
            return (ConversationMessage)s.get(0);
        } else
        {
            return null;
        }
    }

    public static Model getModelFromJson(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null || !pinterestjsonobject.f("type"))
        {
            return null;
        }
        switch (Story.getIntType(pinterestjsonobject.a("type", "")))
        {
        default:
            return null;

        case 0: // '\0'
            return Pin.make(pinterestjsonobject);

        case 2: // '\002'
            return User.make(pinterestjsonobject);

        case 1: // '\001'
            return Board.make(pinterestjsonobject);

        case 3: // '\003'
            return Interest.make(pinterestjsonobject);

        case 4: // '\004'
            return DynamicStory.make(pinterestjsonobject);
        }
    }

    public static SyncJob getNextSyncJob()
    {
        synchronized (_lock)
        {
            obj1 = getSyncJobDao().queryBuilder().orderAsc(new Property[] {
                SyncJobDao.Properties.Action, SyncJobDao.Properties.Type, SyncJobDao.Properties.GroupUid, SyncJobDao.Properties.Id
            }).limit(1).list();
        }
        if (obj1 == null || ((List) (obj1)).size() == 0)
        {
            return null;
        } else
        {
            return (SyncJob)((List) (obj1)).get(0);
        }
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    protected static NotificationDao getNotificationDao()
    {
        return getInstance()._daoSession.getNotificationDao();
    }

    public static NotificationTemplate getNotificationTemplate(String s)
    {
        s = getNotificationTemplateDao().queryBuilder().where(NotificationTemplateDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
        if (s.size() > 0)
        {
            return (NotificationTemplate)s.get(0);
        } else
        {
            return null;
        }
    }

    protected static NotificationTemplateDao getNotificationTemplateDao()
    {
        return getInstance()._daoSession.getNotificationTemplateDao();
    }

    public static List getNotifications(List list)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        ArrayList arraylist = new ArrayList();
        int k = (int)Math.ceil((float)list.size() / 800F);
        for (int i = 0; i < k; i++)
        {
            int l = Math.min((i + 1) * 800, list.size());
            arraylist.addAll(getNotificationDao().queryBuilder().where(NotificationDao.Properties.Uid.in(list.subList(i * 800, l)), new WhereCondition[0]).list());
        }

        if (arraylist.size() > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            Notification notification = new Notification();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                notification.setUid((String)list.next());
                int j = arraylist.indexOf(notification);
                if (j != -1)
                {
                    arraylist1.add(arraylist.get(j));
                }
            } while (true);
            return arraylist1;
        } else
        {
            return new ArrayList();
        }
    }

    public static Partner getPartner(String s)
    {
        if (s != null)
        {
            if ((s = getPartnerDao().queryBuilder().where(PartnerDao.Properties.Uid.eq(s), new WhereCondition[0]).list()) != null && s.size() > 0)
            {
                return (Partner)s.get(0);
            }
        }
        return null;
    }

    protected static PartnerDao getPartnerDao()
    {
        return getInstance()._daoSession.getPartnerDao();
    }

    public static Pin getPin(String s)
    {
        if (s != null)
        {
            Pin pin = ModelAccessCache.getPin(s);
            if (pin != null)
            {
                return pin;
            }
            s = getPinDao().queryBuilder().where(PinDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
            if (s != null && s.size() > 0)
            {
                s = (Pin)s.get(0);
                ModelAccessCache.put(s);
                return s;
            }
        }
        return null;
    }

    public static List getPinComments(Long long1)
    {
        long1 = getCommentDao().queryBuilder().where(CommentDao.Properties.PinUid.eq(long1), new WhereCondition[0]).list();
        if (long1 != null && long1.size() > 0)
        {
            return long1;
        } else
        {
            return new ArrayList();
        }
    }

    protected static PinDao getPinDao()
    {
        return getInstance()._daoSession.getPinDao();
    }

    public static Pin getPinFromPlace(String s)
    {
        if (s != null)
        {
            s = getPinDao().queryBuilder().where(PinDao.Properties.PlaceUid.eq(s), new WhereCondition[0]).list();
            if (s != null && s.size() > 0)
            {
                s = (Pin)s.get(0);
                ModelAccessCache.put(s);
                return s;
            }
        }
        return null;
    }

    public static List getPinPicksItems()
    {
        return _pinPickItems;
    }

    public static List getPins(List list)
    {
        return getPins(list, false);
    }

    public static List getPins(List list, boolean flag)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        ArrayList arraylist = new ArrayList();
        int k = (int)Math.ceil((float)list.size() / 800F);
        int i = 0;
        while (i < k) 
        {
            int l = i * 800;
            int i1 = Math.min((i + 1) * 800, list.size());
            if (flag)
            {
                arraylist.addAll(getPinDao().queryBuilder().where(PinDao.Properties.Uid.in(list.subList(l, i1)), new WhereCondition[] {
                    PinDao.Properties.Liked.eq(Boolean.valueOf(true))
                }).list());
            } else
            {
                arraylist.addAll(getPinDao().queryBuilder().where(PinDao.Properties.Uid.in(list.subList(l, i1)), new WhereCondition[0]).list());
            }
            i++;
        }
        if (arraylist.size() > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            Pin pin = new Pin();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                pin.setUid((String)list.next());
                int j = arraylist.indexOf(pin);
                if (j != -1)
                {
                    arraylist1.add(arraylist.get(j));
                }
            } while (true);
            return arraylist1;
        } else
        {
            return new ArrayList();
        }
    }

    public static Place getPlace(String s)
    {
        if (s != null)
        {
            if ((s = getPlaceDao().queryBuilder().where(PlaceDao.Properties.Uid.eq(s), new WhereCondition[0]).list()) != null && s.size() > 0)
            {
                return (Place)s.get(0);
            }
        }
        return null;
    }

    protected static PlaceDao getPlaceDao()
    {
        return getInstance()._daoSession.getPlaceDao();
    }

    public static List getRecentConversationUsers()
    {
        Object obj = getRecentConversations();
        ArrayList arraylist = new ArrayList();
        HashSet hashset = new HashSet();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = ((Conversation)((Iterator) (obj)).next()).getCachedUsers();
            if (obj1 != null)
            {
                obj1 = ((List) (obj1)).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    User user = (User)((Iterator) (obj1)).next();
                    if (!MyUser.isUserMe(user) && !user.getUid().equals("424605208526455283") && hashset.add(user.getUid()))
                    {
                        TypeAheadItem typeaheaditem = new TypeAheadItem();
                        typeaheaditem.setUid(user.getUid());
                        typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.PINNER);
                        typeaheaditem.setTitle(user.getFullName());
                        typeaheaditem.setImageUri(user.getImageMediumUrl());
                        typeaheaditem.setIdentifier(user.getUsername());
                        arraylist.add(typeaheaditem);
                    }
                }
            }
        }

        return arraylist;
    }

    public static List getRecentConversations()
    {
        ArrayList arraylist = new ArrayList();
        Cursor cursor = getInstance()._daoSession.getDatabase().rawQuery(GET_RECENT_CONVERSATIONS_QUERY, null);
        if (cursor != null && cursor.moveToFirst())
        {
            for (; !cursor.isAfterLast(); cursor.moveToNext())
            {
                String s = cursor.getString(0);
                String s1 = cursor.getString(1);
                int i = cursor.getInt(2);
                String s2 = cursor.getString(3);
                Conversation conversation = new Conversation();
                conversation.setUid(s);
                conversation.setUsers(s1);
                conversation.setUnread(Integer.valueOf(i));
                conversation.setEmails(s2);
                arraylist.add(conversation);
            }

            cursor.close();
        }
        return arraylist;
    }

    public static SearchFilter getSearchFilter(String s)
    {
        if (s != null)
        {
            if ((s = getSearchFilterDao().queryBuilder().where(FilterOptionDao.Properties.TypeValue.eq(s), new WhereCondition[0]).list()) != null && s.size() > 0)
            {
                return (SearchFilter)s.get(0);
            }
        }
        return null;
    }

    protected static SearchFilterDao getSearchFilterDao()
    {
        return getInstance()._daoSession.getSearchFilterDao();
    }

    protected static SearchTypeaheadDao getSearchTypeaheadDao()
    {
        return getInstance()._daoSession.getSearchTypeaheadDao();
    }

    public static List getSearchTypeaheadList(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            s = new ArrayList();
        } else
        {
            s = (new StringBuilder("^")).append(s).append("*").toString();
            List list = getSearchTypeaheadDao().queryRaw(SEARCH_TYPEAHED_QUERY, new String[] {
                s
            });
            s = list;
            if (list == null)
            {
                return new ArrayList();
            }
        }
        return s;
    }

    public static long getSearchTypeaheadTableSize()
    {
        long l;
        synchronized (_lock)
        {
            l = getSearchTypeaheadDao().queryBuilder().count();
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static List getServerCategories()
    {
        List list = getCategoryDao().queryBuilder().where(CategoryDao.Properties.Hash.isNotNull(), new WhereCondition[0]).orderAsc(new Property[] {
            CategoryDao.Properties.Name
        }).list();
        if (list != null && list.size() > 0)
        {
            return list;
        } else
        {
            return new ArrayList();
        }
    }

    public static List getStories(List list)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        ArrayList arraylist = new ArrayList();
        int k = (int)Math.ceil((float)list.size() / 800F);
        for (int i = 0; i < k; i++)
        {
            int l = Math.min((i + 1) * 800, list.size());
            arraylist.addAll(getStoryDao().queryBuilder().where(StoryDao.Properties.Uid.in(list.subList(i * 800, l)), new WhereCondition[0]).list());
        }

        if (arraylist.size() > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            Story story = new Story();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                story.setUid((String)list.next());
                int j = arraylist.indexOf(story);
                if (j != -1)
                {
                    arraylist1.add(arraylist.get(j));
                }
            } while (true);
            return arraylist1;
        } else
        {
            return new ArrayList();
        }
    }

    public static Story getStory(String s)
    {
        if (s != null)
        {
            if ((s = getStoryDao().queryBuilder().where(StoryDao.Properties.Uid.eq(s), new WhereCondition[0]).list()) != null && s.size() > 0)
            {
                return (Story)s.get(0);
            }
        }
        return null;
    }

    protected static StoryDao getStoryDao()
    {
        return getInstance()._daoSession.getStoryDao();
    }

    protected static SyncJobDao getSyncJobDao()
    {
        return getInstance()._daoSession.getSyncJobDao();
    }

    public static List getSyncJobGroup(String s)
    {
        synchronized (_lock)
        {
            s = getSyncJobDao().queryBuilder().where(SyncJobDao.Properties.GroupUid.eq(s), new WhereCondition[0]).orderAsc(new Property[] {
                SyncJobDao.Properties.Type
            }).list();
        }
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static User getUser(String s)
    {
        if (s != null)
        {
            User user = ModelAccessCache.getUser(s);
            if (user != null)
            {
                return user;
            }
            s = getUserDao().queryBuilder().where(UserDao.Properties.Uid.eq(s), new WhereCondition[0]).list();
            if (s != null && s.size() > 0)
            {
                s = (User)s.get(0);
                ModelAccessCache.put(s);
                return s;
            }
        }
        return null;
    }

    public static List getUserBoards(String s)
    {
        s = getBoardDao().queryBuilder().where(BoardDao.Properties.UserUid.eq(s), new WhereCondition[0]).orderAsc(new Property[] {
            BoardDao.Properties.Name
        }).list();
        if (s != null)
        {
            return s;
        } else
        {
            return new ArrayList();
        }
    }

    protected static UserDao getUserDao()
    {
        return getInstance()._daoSession.getUserDao();
    }

    public static List getUserPins(String s, int i)
    {
        s = getPinDao().queryRaw(GET_USER_PINS_QUERY_WHERE, new String[] {
            s, "25", String.valueOf(i * 25)
        });
        if (s != null)
        {
            return s;
        } else
        {
            return new ArrayList();
        }
    }

    public static List getUserPublicBoards(String s)
    {
        s = getBoardDao().queryBuilder().where(BoardDao.Properties.UserUid.eq(s), new WhereCondition[0]).where(BoardDao.Properties.Secret.eq(Boolean.valueOf(false)), new WhereCondition[0]).orderAsc(new Property[] {
            BoardDao.Properties.Name
        }).list();
        if (s == null)
        {
            s = new ArrayList();
        }
        return new ArrayList(new LinkedHashSet(s));
    }

    public static List getUserSecretBoards(String s)
    {
        s = getBoardDao().queryBuilder().where(BoardDao.Properties.UserUid.eq(s), new WhereCondition[0]).where(BoardDao.Properties.Secret.eq(Boolean.valueOf(true)), new WhereCondition[0]).orderAsc(new Property[] {
            BoardDao.Properties.Name
        }).list();
        if (s == null)
        {
            s = new ArrayList();
        }
        return new ArrayList(new LinkedHashSet(s));
    }

    public static List getUsers(List list)
    {
        if (list == null || list.size() == 0)
        {
            return new ArrayList();
        }
        ArrayList arraylist;
        int j;
        arraylist = new ArrayList();
        j = (int)Math.ceil((float)list.size() / 800F);
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = Math.min((i + 1) * 800, list.size());
        arraylist.addAll(getUserDao().queryBuilder().where(UserDao.Properties.Uid.in(list.subList(i * 800, k)), new WhereCondition[0]).list());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ArrayList arraylist1;
        User user;
        if (arraylist.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        arraylist1 = new ArrayList();
        user = new User();
        list = list.iterator();
_L4:
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_237;
            }
            user.setUid((String)list.next());
            i = arraylist.indexOf(user);
        } while (i == -1);
        arraylist1.add(arraylist.get(i));
        if (true) goto _L4; else goto _L3
_L3:
        list;
        PLog.wtf(list, "failed to fetch users", new Object[0]);
        CrashReporting.a(list);
        return new ArrayList();
        return arraylist1;
    }

    public static boolean isSameDay(long l, long l1)
    {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.setTimeInMillis(l * 1000L);
        calendar1.setTimeInMillis(l1 * 1000L);
        return isSameDay(calendar, calendar1);
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar1)
    {
        return calendar.get(6) == calendar1.get(6) && calendar.get(1) == calendar1.get(1);
    }

    public static boolean isValid(Object obj)
    {
        do
        {
            if (obj == null)
            {
                return false;
            }
            if ((obj instanceof String) && (((String)obj).trim().length() == 0 || ((String)obj).equalsIgnoreCase("null")))
            {
                return false;
            }
            if ((obj instanceof CharSequence) && TextUtils.getTrimmedLength((CharSequence)obj) == 0)
            {
                return false;
            }
            if ((obj instanceof Long) && ((Long)obj).longValue() == 0L)
            {
                return false;
            }
            if (obj instanceof List)
            {
                return ((List)obj).size() > 0;
            }
            if (obj instanceof Feed)
            {
                return ((Feed)obj).getCount() > 0;
            }
            if (obj instanceof Model)
            {
                obj = ((Model)obj).getUid();
            } else
            {
                return true;
            }
        } while (true);
    }

    public static boolean isValidString(String s)
    {
        return StringUtils.isNotBlank(s) && !s.equalsIgnoreCase("null");
    }

    public static List modelCollectionToUids(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(((Model)collection.next()).getUid())) { }
        return arraylist;
    }

    private DaoSession newSession(Context context, String s)
    {
        return (new DaoMaster((new _cls1(context, s, null)).getWritableDatabase())).newSession();
    }

    public static void removeAllData()
    {
        synchronized (_lock)
        {
            _instance = new ModelHelper(Application.context(), true);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void repinPin(final Pin pin, final com.pinterest.api.remote.PinApi.PinDetailParams params, ApiResponseHandler apiresponsehandler, String s)
    {
        if (pin != null)
        {
            pin.setRepinned(Boolean.valueOf(true));
            (new _cls2()).execute();
            PinApi.a(params, apiresponsehandler, s);
        }
    }

    public static List searchUserPins(String s, String s1)
    {
        s = getPinDao().queryBuilder().where(PinDao.Properties.UserUid.eq(s), new WhereCondition[0]).where(PinDao.Properties.Description.like((new StringBuilder("%")).append(s1).append("%").toString()), new WhereCondition[0]).orderAsc(new Property[] {
            PinDao.Properties.CreatedAt
        }).list();
        if (s != null)
        {
            return s;
        } else
        {
            return new ArrayList();
        }
    }

    public static void setAggregatedPinData(AggregatedPinData aggregatedpindata)
    {
        if (aggregatedpindata == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getAggregatedPinDataDao().insertOrReplace(aggregatedpindata);
        }
        return;
        aggregatedpindata;
        obj;
        JVM INSTR monitorexit ;
        throw aggregatedpindata;
    }

    public static void setBoard(Board board)
    {
        if (board == null)
        {
            return;
        }
        synchronized (_lock)
        {
            ModelAccessCache.put(board);
            getBoardDao().insertOrReplace(board);
            Events.post(new Board.UpdateEvent(board));
        }
        return;
        board;
        obj;
        JVM INSTR monitorexit ;
        throw board;
    }

    public static void setBoardInvites(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getBoardInviteDao().deleteAll();
            getBoardInviteDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setBoards(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getBoardDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setCategories(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getCategoryDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setCategory(Category category)
    {
        if (category == null)
        {
            return;
        }
        synchronized (_lock)
        {
            ModelAccessCache.put(category);
            getCategoryDao().insertOrReplace(category);
        }
        return;
        category;
        obj;
        JVM INSTR monitorexit ;
        throw category;
    }

    public static void setComment(Comment comment)
    {
        if (comment == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getCommentDao().insertOrReplace(comment);
        }
        return;
        comment;
        obj;
        JVM INSTR monitorexit ;
        throw comment;
    }

    public static void setComments(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getCommentDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setConversation(Conversation conversation)
    {
        synchronized (_lock)
        {
            getConversationDao().insertOrReplaceInTx(new Conversation[] {
                conversation
            });
        }
        return;
        conversation;
        obj;
        JVM INSTR monitorexit ;
        throw conversation;
    }

    public static void setConversationMessage(ConversationMessage conversationmessage)
    {
        if (conversationmessage != null)
        {
            synchronized (_lock)
            {
                getConversationMessageDao().insertOrReplaceInTx(new ConversationMessage[] {
                    conversationmessage
                });
            }
            return;
        } else
        {
            return;
        }
        conversationmessage;
        obj;
        JVM INSTR monitorexit ;
        throw conversationmessage;
    }

    public static void setConversationMessages(List list)
    {
        if (list != null)
        {
            synchronized (_lock)
            {
                getConversationMessageDao().insertOrReplaceInTx(list);
            }
            return;
        } else
        {
            return;
        }
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setConversations(List list)
    {
        synchronized (_lock)
        {
            getConversationDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setDomain(Domain domain)
    {
        if (domain == null)
        {
            return;
        }
        synchronized (_lock)
        {
            ModelAccessCache.put(domain);
            getDomainDao().insertOrReplace(domain);
        }
        return;
        domain;
        obj;
        JVM INSTR monitorexit ;
        throw domain;
    }

    public static void setDomains(List list)
    {
        synchronized (_lock)
        {
            getDomainDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setDynamicStories(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getDynamicStoryDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setDynamicStory(DynamicStory dynamicstory)
    {
        if (dynamicstory == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getDynamicStoryDao().insertOrReplace(dynamicstory);
        }
        return;
        dynamicstory;
        obj;
        JVM INSTR monitorexit ;
        throw dynamicstory;
    }

    public static void setFilterOption(FilterOption filteroption)
    {
        if (filteroption == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getFilterOptionDao().insertOrReplace(filteroption);
        }
        return;
        filteroption;
        obj;
        JVM INSTR monitorexit ;
        throw filteroption;
    }

    public static void setFilterOptions(List list)
    {
        synchronized (_lock)
        {
            getFilterOptionDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setInterest(Interest interest)
    {
        if (interest == null)
        {
            return;
        }
        synchronized (_lock)
        {
            ModelAccessCache.put(interest);
            getInterestDao().insertOrReplace(interest);
        }
        return;
        interest;
        obj;
        JVM INSTR monitorexit ;
        throw interest;
    }

    public static void setInterests(List list)
    {
        synchronized (_lock)
        {
            getInterestDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setNotification(Notification notification)
    {
        if (notification == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getNotificationDao().insertOrReplace(notification);
        }
        return;
        notification;
        obj;
        JVM INSTR monitorexit ;
        throw notification;
    }

    public static void setNotificationTemplate(NotificationTemplate notificationtemplate)
    {
        if (notificationtemplate == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getNotificationTemplateDao().insertOrReplace(notificationtemplate);
        }
        return;
        notificationtemplate;
        obj;
        JVM INSTR monitorexit ;
        throw notificationtemplate;
    }

    public static void setNotificationTemplates(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getNotificationTemplateDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setNotifications(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getNotificationDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setPartner(Partner partner)
    {
        if (partner == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getPartnerDao().insertOrReplace(partner);
        }
        return;
        partner;
        obj;
        JVM INSTR monitorexit ;
        throw partner;
    }

    public static void setPartners(List list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        synchronized (_lock)
        {
            getPartnerDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setPin(Pin pin)
    {
        if (pin == null)
        {
            return;
        }
        synchronized (_lock)
        {
            ModelAccessCache.put(pin);
            getPinDao().insertOrReplace(pin);
            Events.post(new Pin.UpdateEvent(pin));
        }
        return;
        pin;
        obj;
        JVM INSTR monitorexit ;
        throw pin;
    }

    public static void setPinPicksItems(List list)
    {
        _pinPickItems = list;
    }

    public static void setPins(List list)
    {
        synchronized (_lock)
        {
            getPinDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setPlace(Place place)
    {
        if (place == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getPlaceDao().insertOrReplace(place);
        }
        return;
        place;
        obj;
        JVM INSTR monitorexit ;
        throw place;
    }

    public static void setPlaces(List list)
    {
        synchronized (_lock)
        {
            getPlaceDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setSearchFilter(SearchFilter searchfilter)
    {
        if (searchfilter == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getSearchFilterDao().insertOrReplace(searchfilter);
        }
        return;
        searchfilter;
        obj;
        JVM INSTR monitorexit ;
        throw searchfilter;
    }

    public static void setSearchFilters(List list)
    {
        synchronized (_lock)
        {
            getSearchFilterDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setSearchTypeahead(SearchTypeahead searchtypeahead)
    {
        if (searchtypeahead == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getSearchTypeaheadDao().insertOrReplaceInTx(new SearchTypeahead[] {
                searchtypeahead
            });
        }
        return;
        searchtypeahead;
        obj;
        JVM INSTR monitorexit ;
        throw searchtypeahead;
    }

    public static void setSearchTypeaheads(List list)
    {
        synchronized (_lock)
        {
            getSearchTypeaheadDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setStories(List list)
    {
        if (list == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getStoryDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setStory(Story story)
    {
        if (story == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getStoryDao().insertOrReplace(story);
        }
        return;
        story;
        obj;
        JVM INSTR monitorexit ;
        throw story;
    }

    public static void setSyncJob(SyncJob syncjob)
    {
        if (syncjob == null)
        {
            return;
        }
        synchronized (_lock)
        {
            getSyncJobDao().insertOrReplace(syncjob);
        }
        return;
        syncjob;
        obj;
        JVM INSTR monitorexit ;
        throw syncjob;
    }

    public static void setSyncJobs(List list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        synchronized (_lock)
        {
            getSyncJobDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static void setUser(User user)
    {
        if (user == null)
        {
            return;
        }
        synchronized (_lock)
        {
            ModelAccessCache.put(user);
            getUserDao().insertOrReplace(user);
            Events.post(new User.UpdateEvent(user));
        }
        return;
        user;
        obj;
        JVM INSTR monitorexit ;
        throw user;
    }

    public static void setUsers(List list)
    {
        synchronized (_lock)
        {
            getUserDao().insertOrReplaceInTx(list);
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    public static Date stringToDate(String s)
    {
        Date date = new Date();
        if (!isValid(s))
        {
            return date;
        }
        try
        {
            s = _dateFormatter.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            PLog.info((new StringBuilder("Exception: ")).append(s).toString(), new Object[0]);
            return date;
        }
        return s;
    }

    public static User unblockUser(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        User user = getUser(s);
        if (user != null)
        {
            UserApi.j(s, baseapiresponsehandler, s1);
        }
        return user;
    }

    public static void updateBoard(Board board, String s, String s1, String s2, Boolean boolean1, Boolean boolean2, BaseApiResponseHandler baseapiresponsehandler, String s3)
    {
        setBoard(board);
        BoardApi.a(board.getUid(), s, s1, s2, boolean1, board.getLayout(), boolean2, baseapiresponsehandler, s3);
    }

    public static Comment updateComment(Comment comment)
    {
        Comment comment1 = Comment.merge(comment);
        synchronized (_lock)
        {
            getCommentDao().insertOrReplace(comment1);
        }
        return comment1;
        exception;
        comment;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Pin updatePin(Pin pin)
    {
        Pin pin1 = Pin.merge(pin);
        synchronized (_lock)
        {
            getPinDao().insertOrReplace(pin1);
        }
        return pin1;
        exception;
        pin;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static User updateUser(User user)
    {
        User user1 = User.merge(user);
        setUser(user);
        return user1;
    }

    public SQLiteDatabase getDatabase()
    {
        return getInstance()._daoSession.getDatabase();
    }

    public long getSizeOnDisk()
    {
        return FileUtils.getFileSize(Application.context().getDatabasePath(getDbName(false)));
    }

    public void onDestroy()
    {
        enforceCachePolicy(getDatabase());
        _instance = null;
        Application.watch(this);
    }

    static 
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
        _dateFormatter = simpledateformat;
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SECRET_BOARD_UIDS_QUERY = String.format("SELECT %s FROM %s WHERE %s = 1", new Object[] {
            BoardDao.Properties.Uid.columnName, "BOARD", BoardDao.Properties.Secret.columnName
        });
        GET_USER_PINS_QUERY_WHERE = String.format("WHERE (%s = ? AND %s NOT IN (%s)) GROUP BY %s ORDER BY %s desc LIMIT ? OFFSET ?", new Object[] {
            PinDao.Properties.UserUid.columnName, PinDao.Properties.BoardUid.columnName, SECRET_BOARD_UIDS_QUERY, PinDao.Properties.CacheableId.columnName, PinDao.Properties.CreatedAt.columnName
        });
        GET_RECENT_CONVERSATIONS_QUERY = String.format("SELECT %s, %s, %s, %s, %s FROM %s INNER JOIN %s ON %s=%s GROUP BY %s ORDER BY %s DESC LIMIT 25", new Object[] {
            ConversationMessageDao.Properties.ConversationId.columnName, ConversationDao.Properties.Users.columnName, ConversationDao.Properties.Unread.columnName, ConversationDao.Properties.Emails.columnName, (new StringBuilder("MAX(")).append(ConversationMessageDao.Properties.CreatedAt.columnName).append(")").toString(), "CONVERSATION_MESSAGE", "CONVERSATION", ConversationMessageDao.Properties.ConversationId.columnName, (new StringBuilder("CONVERSATION.")).append(ConversationDao.Properties.Uid.columnName).toString(), ConversationMessageDao.Properties.ConversationId.columnName, 
            (new StringBuilder("MAX(")).append(ConversationMessageDao.Properties.CreatedAt.columnName).append(")").toString()
        });
        SEARCH_TYPEAHED_QUERY = String.format("WHERE %s MATCH ? ORDER BY %s desc LIMIT 10", new Object[] {
            SearchTypeaheadDao.Properties.Query.columnName, SearchTypeaheadDao.Properties.Score.columnName
        });
    }

    private class _cls4 extends BaseApiResponseHandler
    {

        final String val$boardUid;
        final BaseApiResponseHandler val$handler;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if (handler != null)
            {
                handler.onFailure(throwable, apiresponse);
            }
        }

        public final void onFinish()
        {
            super.onFinish();
            if (handler != null)
            {
                handler.onFinish();
            }
        }

        public final void onStart()
        {
            super.onStart();
            if (handler != null)
            {
                handler.onStart();
            }
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            CreateBoardHelper.removeBoardFromCache(boardUid);
            ModelHelper.deleteBoard(boardUid);
            if (handler != null)
            {
                handler.onSuccess(apiresponse);
            }
        }

        _cls4()
        {
            handler = baseapiresponsehandler;
            boardUid = s;
            super();
        }
    }


    private class _cls3 extends BaseApiResponseHandler
    {

        final BaseApiResponseHandler val$handler;
        final String val$pinUid;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            handler.onFailure(throwable, apiresponse);
        }

        public final void onFinish()
        {
            handler.onFinish();
        }

        public final void onStart()
        {
            handler.onStart();
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            ModelHelper.deletePin(pinUid);
            handler.onSuccess(apiresponse);
        }

        _cls3()
        {
            pinUid = s;
            handler = baseapiresponsehandler;
            super();
        }
    }


    private class _cls5 extends BackgroundTask
    {

        final ModelHelper this$0;
        final File val$dbFile;

        public void run()
        {
            dbFile.delete();
        }

        _cls5()
        {
            this$0 = ModelHelper.this;
            dbFile = file;
            super();
        }
    }


    private class _cls1 extends DaoMaster.DevOpenHelper
    {

        final ModelHelper this$0;

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            super.onCreate(sqlitedatabase);
            sqlitedatabase = Preferences.persisted();
            Clock clock = Clock.a;
            sqlitedatabase.set("PREF_DB_CREATED_AT", Clock.a());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            super.onUpgrade(sqlitedatabase, i, j);
            sqlitedatabase = Preferences.persisted();
            Clock clock = Clock.a;
            sqlitedatabase.set("PREF_DB_CREATED_AT", Clock.a());
        }

        _cls1(Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
        {
            this$0 = ModelHelper.this;
            super(context, s, cursorfactory);
        }
    }


    private class _cls2 extends BackgroundTask
    {

        final com.pinterest.api.remote.PinApi.PinDetailParams val$params;
        final Pin val$pin;

        public final void run()
        {
            MyUser.addLastUsedBoard(params.b);
            Board board = pin.getBoard();
            if (board != null && !Constants.isTrue(board.getSecret()))
            {
                pin.setRepinCount(Integer.valueOf(pin.getRepinCountDisplay() + 1));
            }
            ModelHelper.setPin(pin);
        }

        _cls2()
        {
            params = pindetailparams;
            pin = pin1;
            super();
        }
    }

}
