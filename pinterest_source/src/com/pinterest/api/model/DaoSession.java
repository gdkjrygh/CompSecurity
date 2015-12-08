// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.IdentityScope;
import de.greenrobot.dao.IdentityScopeType;
import java.util.Map;

// Referenced classes of package com.pinterest.api.model:
//            CategoryDao, StoryDao, DynamicStoryDao, DynamicRelationshipDao, 
//            DynamicDisplayOptionDao, DynamicTitleDao, DynamicArgumentDao, ActorDao, 
//            NotificationDao, NotificationTemplateDao, ConversationDao, ConversationMessageDao, 
//            UserDao, PartnerDao, BoardDao, CommentDao, 
//            InterestDao, PlaceDao, PinDao, AggregatedPinDataDao, 
//            BoardInviteDao, BusinessTypeDao, SearchFilterDao, FilterOptionDao, 
//            DomainDao, SyncJobDao, SearchTypeaheadDao, Category, 
//            Story, DynamicStory, DynamicRelationship, DynamicDisplayOption, 
//            DynamicTitle, DynamicArgument, Actor, Notification, 
//            NotificationTemplate, Conversation, ConversationMessage, User, 
//            Partner, Board, Comment, Interest, 
//            Place, Pin, AggregatedPinData, BoardInvite, 
//            BusinessType, SearchFilter, FilterOption, Domain, 
//            SyncJob, SearchTypeahead

public class DaoSession extends AbstractDaoSession
{

    private final ActorDao actorDao;
    private final DaoConfig actorDaoConfig;
    private final AggregatedPinDataDao aggregatedPinDataDao;
    private final DaoConfig aggregatedPinDataDaoConfig;
    private final BoardDao boardDao;
    private final DaoConfig boardDaoConfig;
    private final BoardInviteDao boardInviteDao;
    private final DaoConfig boardInviteDaoConfig;
    private final BusinessTypeDao businessTypeDao;
    private final DaoConfig businessTypeDaoConfig;
    private final CategoryDao categoryDao;
    private final DaoConfig categoryDaoConfig;
    private final CommentDao commentDao;
    private final DaoConfig commentDaoConfig;
    private final ConversationDao conversationDao;
    private final DaoConfig conversationDaoConfig;
    private final ConversationMessageDao conversationMessageDao;
    private final DaoConfig conversationMessageDaoConfig;
    private final DomainDao domainDao;
    private final DaoConfig domainDaoConfig;
    private final DynamicArgumentDao dynamicArgumentDao;
    private final DaoConfig dynamicArgumentDaoConfig;
    private final DynamicDisplayOptionDao dynamicDisplayOptionDao;
    private final DaoConfig dynamicDisplayOptionDaoConfig;
    private final DynamicRelationshipDao dynamicRelationshipDao;
    private final DaoConfig dynamicRelationshipDaoConfig;
    private final DynamicStoryDao dynamicStoryDao;
    private final DaoConfig dynamicStoryDaoConfig;
    private final DynamicTitleDao dynamicTitleDao;
    private final DaoConfig dynamicTitleDaoConfig;
    private final FilterOptionDao filterOptionDao;
    private final DaoConfig filterOptionDaoConfig;
    private final InterestDao interestDao;
    private final DaoConfig interestDaoConfig;
    private final NotificationDao notificationDao;
    private final DaoConfig notificationDaoConfig;
    private final NotificationTemplateDao notificationTemplateDao;
    private final DaoConfig notificationTemplateDaoConfig;
    private final PartnerDao partnerDao;
    private final DaoConfig partnerDaoConfig;
    private final PinDao pinDao;
    private final DaoConfig pinDaoConfig;
    private final PlaceDao placeDao;
    private final DaoConfig placeDaoConfig;
    private final SearchFilterDao searchFilterDao;
    private final DaoConfig searchFilterDaoConfig;
    private final SearchTypeaheadDao searchTypeaheadDao;
    private final DaoConfig searchTypeaheadDaoConfig;
    private final StoryDao storyDao;
    private final DaoConfig storyDaoConfig;
    private final SyncJobDao syncJobDao;
    private final DaoConfig syncJobDaoConfig;
    private final UserDao userDao;
    private final DaoConfig userDaoConfig;

    public DaoSession(SQLiteDatabase sqlitedatabase, IdentityScopeType identityscopetype, Map map)
    {
        super(sqlitedatabase);
        categoryDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/CategoryDao)).clone();
        categoryDaoConfig.initIdentityScope(identityscopetype);
        storyDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/StoryDao)).clone();
        storyDaoConfig.initIdentityScope(identityscopetype);
        dynamicStoryDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/DynamicStoryDao)).clone();
        dynamicStoryDaoConfig.initIdentityScope(identityscopetype);
        dynamicRelationshipDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/DynamicRelationshipDao)).clone();
        dynamicRelationshipDaoConfig.initIdentityScope(identityscopetype);
        dynamicDisplayOptionDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/DynamicDisplayOptionDao)).clone();
        dynamicDisplayOptionDaoConfig.initIdentityScope(identityscopetype);
        dynamicTitleDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/DynamicTitleDao)).clone();
        dynamicTitleDaoConfig.initIdentityScope(identityscopetype);
        dynamicArgumentDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/DynamicArgumentDao)).clone();
        dynamicArgumentDaoConfig.initIdentityScope(identityscopetype);
        actorDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/ActorDao)).clone();
        actorDaoConfig.initIdentityScope(identityscopetype);
        notificationDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/NotificationDao)).clone();
        notificationDaoConfig.initIdentityScope(identityscopetype);
        notificationTemplateDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/NotificationTemplateDao)).clone();
        notificationTemplateDaoConfig.initIdentityScope(identityscopetype);
        conversationDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/ConversationDao)).clone();
        conversationDaoConfig.initIdentityScope(identityscopetype);
        conversationMessageDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/ConversationMessageDao)).clone();
        conversationMessageDaoConfig.initIdentityScope(identityscopetype);
        userDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/UserDao)).clone();
        userDaoConfig.initIdentityScope(identityscopetype);
        partnerDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/PartnerDao)).clone();
        partnerDaoConfig.initIdentityScope(identityscopetype);
        boardDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/BoardDao)).clone();
        boardDaoConfig.initIdentityScope(identityscopetype);
        commentDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/CommentDao)).clone();
        commentDaoConfig.initIdentityScope(identityscopetype);
        interestDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/InterestDao)).clone();
        interestDaoConfig.initIdentityScope(identityscopetype);
        placeDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/PlaceDao)).clone();
        placeDaoConfig.initIdentityScope(identityscopetype);
        pinDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/PinDao)).clone();
        pinDaoConfig.initIdentityScope(identityscopetype);
        aggregatedPinDataDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/AggregatedPinDataDao)).clone();
        aggregatedPinDataDaoConfig.initIdentityScope(identityscopetype);
        boardInviteDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/BoardInviteDao)).clone();
        boardInviteDaoConfig.initIdentityScope(identityscopetype);
        businessTypeDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/BusinessTypeDao)).clone();
        businessTypeDaoConfig.initIdentityScope(identityscopetype);
        searchFilterDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/SearchFilterDao)).clone();
        searchFilterDaoConfig.initIdentityScope(identityscopetype);
        filterOptionDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/FilterOptionDao)).clone();
        filterOptionDaoConfig.initIdentityScope(identityscopetype);
        domainDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/DomainDao)).clone();
        domainDaoConfig.initIdentityScope(identityscopetype);
        syncJobDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/SyncJobDao)).clone();
        syncJobDaoConfig.initIdentityScope(identityscopetype);
        searchTypeaheadDaoConfig = ((DaoConfig)map.get(com/pinterest/api/model/SearchTypeaheadDao)).clone();
        searchTypeaheadDaoConfig.initIdentityScope(identityscopetype);
        categoryDao = new CategoryDao(categoryDaoConfig, this);
        storyDao = new StoryDao(storyDaoConfig, this);
        dynamicStoryDao = new DynamicStoryDao(dynamicStoryDaoConfig, this);
        dynamicRelationshipDao = new DynamicRelationshipDao(dynamicRelationshipDaoConfig, this);
        dynamicDisplayOptionDao = new DynamicDisplayOptionDao(dynamicDisplayOptionDaoConfig, this);
        dynamicTitleDao = new DynamicTitleDao(dynamicTitleDaoConfig, this);
        dynamicArgumentDao = new DynamicArgumentDao(dynamicArgumentDaoConfig, this);
        actorDao = new ActorDao(actorDaoConfig, this);
        notificationDao = new NotificationDao(notificationDaoConfig, this);
        notificationTemplateDao = new NotificationTemplateDao(notificationTemplateDaoConfig, this);
        conversationDao = new ConversationDao(conversationDaoConfig, this);
        conversationMessageDao = new ConversationMessageDao(conversationMessageDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        partnerDao = new PartnerDao(partnerDaoConfig, this);
        boardDao = new BoardDao(boardDaoConfig, this);
        commentDao = new CommentDao(commentDaoConfig, this);
        interestDao = new InterestDao(interestDaoConfig, this);
        placeDao = new PlaceDao(placeDaoConfig, this);
        pinDao = new PinDao(pinDaoConfig, this);
        aggregatedPinDataDao = new AggregatedPinDataDao(aggregatedPinDataDaoConfig, this);
        boardInviteDao = new BoardInviteDao(boardInviteDaoConfig, this);
        businessTypeDao = new BusinessTypeDao(businessTypeDaoConfig, this);
        searchFilterDao = new SearchFilterDao(searchFilterDaoConfig, this);
        filterOptionDao = new FilterOptionDao(filterOptionDaoConfig, this);
        domainDao = new DomainDao(domainDaoConfig, this);
        syncJobDao = new SyncJobDao(syncJobDaoConfig, this);
        searchTypeaheadDao = new SearchTypeaheadDao(searchTypeaheadDaoConfig, this);
        registerDao(com/pinterest/api/model/Category, categoryDao);
        registerDao(com/pinterest/api/model/Story, storyDao);
        registerDao(com/pinterest/api/model/DynamicStory, dynamicStoryDao);
        registerDao(com/pinterest/api/model/DynamicRelationship, dynamicRelationshipDao);
        registerDao(com/pinterest/api/model/DynamicDisplayOption, dynamicDisplayOptionDao);
        registerDao(com/pinterest/api/model/DynamicTitle, dynamicTitleDao);
        registerDao(com/pinterest/api/model/DynamicArgument, dynamicArgumentDao);
        registerDao(com/pinterest/api/model/Actor, actorDao);
        registerDao(com/pinterest/api/model/Notification, notificationDao);
        registerDao(com/pinterest/api/model/NotificationTemplate, notificationTemplateDao);
        registerDao(com/pinterest/api/model/Conversation, conversationDao);
        registerDao(com/pinterest/api/model/ConversationMessage, conversationMessageDao);
        registerDao(com/pinterest/api/model/User, userDao);
        registerDao(com/pinterest/api/model/Partner, partnerDao);
        registerDao(com/pinterest/api/model/Board, boardDao);
        registerDao(com/pinterest/api/model/Comment, commentDao);
        registerDao(com/pinterest/api/model/Interest, interestDao);
        registerDao(com/pinterest/api/model/Place, placeDao);
        registerDao(com/pinterest/api/model/Pin, pinDao);
        registerDao(com/pinterest/api/model/AggregatedPinData, aggregatedPinDataDao);
        registerDao(com/pinterest/api/model/BoardInvite, boardInviteDao);
        registerDao(com/pinterest/api/model/BusinessType, businessTypeDao);
        registerDao(com/pinterest/api/model/SearchFilter, searchFilterDao);
        registerDao(com/pinterest/api/model/FilterOption, filterOptionDao);
        registerDao(com/pinterest/api/model/Domain, domainDao);
        registerDao(com/pinterest/api/model/SyncJob, syncJobDao);
        registerDao(com/pinterest/api/model/SearchTypeahead, searchTypeaheadDao);
    }

    public void clear()
    {
        categoryDaoConfig.getIdentityScope().clear();
        storyDaoConfig.getIdentityScope().clear();
        dynamicStoryDaoConfig.getIdentityScope().clear();
        dynamicRelationshipDaoConfig.getIdentityScope().clear();
        dynamicDisplayOptionDaoConfig.getIdentityScope().clear();
        dynamicTitleDaoConfig.getIdentityScope().clear();
        dynamicArgumentDaoConfig.getIdentityScope().clear();
        actorDaoConfig.getIdentityScope().clear();
        notificationDaoConfig.getIdentityScope().clear();
        notificationTemplateDaoConfig.getIdentityScope().clear();
        conversationDaoConfig.getIdentityScope().clear();
        conversationMessageDaoConfig.getIdentityScope().clear();
        userDaoConfig.getIdentityScope().clear();
        partnerDaoConfig.getIdentityScope().clear();
        boardDaoConfig.getIdentityScope().clear();
        commentDaoConfig.getIdentityScope().clear();
        interestDaoConfig.getIdentityScope().clear();
        placeDaoConfig.getIdentityScope().clear();
        pinDaoConfig.getIdentityScope().clear();
        aggregatedPinDataDaoConfig.getIdentityScope().clear();
        boardInviteDaoConfig.getIdentityScope().clear();
        businessTypeDaoConfig.getIdentityScope().clear();
        searchFilterDaoConfig.getIdentityScope().clear();
        filterOptionDaoConfig.getIdentityScope().clear();
        domainDaoConfig.getIdentityScope().clear();
        syncJobDaoConfig.getIdentityScope().clear();
        searchTypeaheadDaoConfig.getIdentityScope().clear();
    }

    public ActorDao getActorDao()
    {
        return actorDao;
    }

    public AggregatedPinDataDao getAggregatedPinDataDao()
    {
        return aggregatedPinDataDao;
    }

    public BoardDao getBoardDao()
    {
        return boardDao;
    }

    public BoardInviteDao getBoardInviteDao()
    {
        return boardInviteDao;
    }

    public BusinessTypeDao getBusinessTypeDao()
    {
        return businessTypeDao;
    }

    public CategoryDao getCategoryDao()
    {
        return categoryDao;
    }

    public CommentDao getCommentDao()
    {
        return commentDao;
    }

    public ConversationDao getConversationDao()
    {
        return conversationDao;
    }

    public ConversationMessageDao getConversationMessageDao()
    {
        return conversationMessageDao;
    }

    public DomainDao getDomainDao()
    {
        return domainDao;
    }

    public DynamicArgumentDao getDynamicArgumentDao()
    {
        return dynamicArgumentDao;
    }

    public DynamicDisplayOptionDao getDynamicDisplayOptionDao()
    {
        return dynamicDisplayOptionDao;
    }

    public DynamicRelationshipDao getDynamicRelationshipDao()
    {
        return dynamicRelationshipDao;
    }

    public DynamicStoryDao getDynamicStoryDao()
    {
        return dynamicStoryDao;
    }

    public DynamicTitleDao getDynamicTitleDao()
    {
        return dynamicTitleDao;
    }

    public FilterOptionDao getFilterOptionDao()
    {
        return filterOptionDao;
    }

    public InterestDao getInterestDao()
    {
        return interestDao;
    }

    public NotificationDao getNotificationDao()
    {
        return notificationDao;
    }

    public NotificationTemplateDao getNotificationTemplateDao()
    {
        return notificationTemplateDao;
    }

    public PartnerDao getPartnerDao()
    {
        return partnerDao;
    }

    public PinDao getPinDao()
    {
        return pinDao;
    }

    public PlaceDao getPlaceDao()
    {
        return placeDao;
    }

    public SearchFilterDao getSearchFilterDao()
    {
        return searchFilterDao;
    }

    public SearchTypeaheadDao getSearchTypeaheadDao()
    {
        return searchTypeaheadDao;
    }

    public StoryDao getStoryDao()
    {
        return storyDao;
    }

    public SyncJobDao getSyncJobDao()
    {
        return syncJobDao;
    }

    public UserDao getUserDao()
    {
        return userDao;
    }
}
