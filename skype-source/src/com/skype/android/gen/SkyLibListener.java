// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Metatag;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class SkyLibListener
    implements com.skype.SkyLib.SkyLibIListener
{
    public static class OnAccessConnected
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAccessConnected(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnAccessConnectionFailure
    {

        private com.skype.AccessSession.FAILUREREASON _reason;
        private SkyLib _sender;

        public com.skype.AccessSession.FAILUREREASON getReason()
        {
            return _reason;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAccessConnectionFailure(SkyLib skylib, com.skype.AccessSession.FAILUREREASON failurereason)
        {
            _sender = skylib;
            _reason = failurereason;
        }
    }

    public static class OnAccessDetectFailure
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAccessDetectFailure(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnAccessDetecting
    {

        private SkyLib _sender;
        private com.skype.AccessSession.HOTSPOTTYPE _type;

        public SkyLib getSender()
        {
            return _sender;
        }

        public com.skype.AccessSession.HOTSPOTTYPE getType()
        {
            return _type;
        }

        public OnAccessDetecting(SkyLib skylib, com.skype.AccessSession.HOTSPOTTYPE hotspottype)
        {
            _sender = skylib;
            _type = hotspottype;
        }
    }

    public static class OnAccessDisconnected
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAccessDisconnected(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnAccessEvent
    {

        private int _data;
        private com.skype.SkyLib.ACCESSEVENTTYPE _eventtype;
        private SkyLib _sender;

        public int getData()
        {
            return _data;
        }

        public com.skype.SkyLib.ACCESSEVENTTYPE getEventtype()
        {
            return _eventtype;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAccessEvent(SkyLib skylib, com.skype.SkyLib.ACCESSEVENTTYPE accesseventtype, int i)
        {
            _sender = skylib;
            _eventtype = accesseventtype;
            _data = i;
        }
    }

    public static class OnAccountAvatarResult
    {

        private com.skype.SkyLib.AUTH_RESULT _code;
        private byte _data[];
        private SkyLib _sender;
        private String _skypename;

        public com.skype.SkyLib.AUTH_RESULT getCode()
        {
            return _code;
        }

        public byte[] getData()
        {
            return _data;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public String getSkypename()
        {
            return _skypename;
        }

        public OnAccountAvatarResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String s, byte abyte0[])
        {
            _sender = skylib;
            _code = auth_result;
            _skypename = s;
            _data = abyte0;
        }
    }

    public static class OnAccountPartnerLinkResult
    {

        private String _body;
        private com.skype.SkyLib.AUTH_RESULT _code;
        private SkyLib _sender;

        public String getBody()
        {
            return _body;
        }

        public com.skype.SkyLib.AUTH_RESULT getCode()
        {
            return _code;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAccountPartnerLinkResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String s)
        {
            _sender = skylib;
            _code = auth_result;
            _body = s;
        }
    }

    public static class OnApp2AppDatagram
    {

        private String _appname;
        private byte _data[];
        private SkyLib _sender;
        private String _stream;

        public String getAppname()
        {
            return _appname;
        }

        public byte[] getData()
        {
            return _data;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public String getStream()
        {
            return _stream;
        }

        public OnApp2AppDatagram(SkyLib skylib, String s, String s1, byte abyte0[])
        {
            _sender = skylib;
            _appname = s;
            _stream = s1;
            _data = abyte0;
        }
    }

    public static class OnApp2AppStreamListChange
    {

        private String _appname;
        private com.skype.SkyLib.APP2APP_STREAMS _listType;
        private int _receivedSizes[];
        private SkyLib _sender;
        private String _streams[];

        public String getAppname()
        {
            return _appname;
        }

        public com.skype.SkyLib.APP2APP_STREAMS getListType()
        {
            return _listType;
        }

        public int[] getReceivedSizes()
        {
            return _receivedSizes;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public String[] getStreams()
        {
            return _streams;
        }

        public OnApp2AppStreamListChange(SkyLib skylib, String s, com.skype.SkyLib.APP2APP_STREAMS app2app_streams, String as[], int ai[])
        {
            _sender = skylib;
            _appname = s;
            _listType = app2app_streams;
            _streams = as;
            _receivedSizes = ai;
        }
    }

    public static class OnAuthTokenRequest
    {

        private long _partnerId;
        private String _scopes[];
        private SkyLib _sender;

        public long getPartnerId()
        {
            return _partnerId;
        }

        public String[] getScopes()
        {
            return _scopes;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAuthTokenRequest(SkyLib skylib, long l, String as[])
        {
            _sender = skylib;
            _partnerId = l;
            _scopes = as;
        }
    }

    public static class OnAuthTokenResult
    {

        private int _request_id;
        private SkyLib _sender;
        private boolean _success;
        private String _token;

        public int getRequest_id()
        {
            return _request_id;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public boolean getSuccess()
        {
            return _success;
        }

        public String getToken()
        {
            return _token;
        }

        public OnAuthTokenResult(SkyLib skylib, boolean flag, int i, String s)
        {
            _sender = skylib;
            _success = flag;
            _request_id = i;
            _token = s;
        }
    }

    public static class OnAuthTokenResultWithTimeout
    {

        private int _expiration;
        private int _expirationDelay;
        private int _request_id;
        private SkyLib _sender;
        private boolean _success;
        private String _token;

        public int getExpiration()
        {
            return _expiration;
        }

        public int getExpirationDelay()
        {
            return _expirationDelay;
        }

        public int getRequest_id()
        {
            return _request_id;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public boolean getSuccess()
        {
            return _success;
        }

        public String getToken()
        {
            return _token;
        }

        public OnAuthTokenResultWithTimeout(SkyLib skylib, boolean flag, int i, String s, int j, int k)
        {
            _sender = skylib;
            _success = flag;
            _request_id = i;
            _token = s;
            _expiration = j;
            _expirationDelay = k;
        }
    }

    public static class OnAvailableDeviceListChange
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAvailableDeviceListChange(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnAvailableVideoDeviceListChange
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnAvailableVideoDeviceListChange(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnCallerIDOptionsChange
    {

        private com.skype.SkyLib.CALLERID_OPTIONS_CHANGE _code;
        private int _reqid;
        private SkyLib _sender;

        public com.skype.SkyLib.CALLERID_OPTIONS_CHANGE getCode()
        {
            return _code;
        }

        public int getReqid()
        {
            return _reqid;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnCallerIDOptionsChange(SkyLib skylib, int i, com.skype.SkyLib.CALLERID_OPTIONS_CHANGE callerid_options_change)
        {
            _sender = skylib;
            _reqid = i;
            _code = callerid_options_change;
        }
    }

    public static class OnChatServiceConnectivity
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnChatServiceConnectivity(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnCheckUpgradeResult
    {

        private boolean _isManual;
        private com.skype.SkyLib.UPGRADERESULT _result;
        private SkyLib _sender;

        public boolean getIsManual()
        {
            return _isManual;
        }

        public com.skype.SkyLib.UPGRADERESULT getResult()
        {
            return _result;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnCheckUpgradeResult(SkyLib skylib, boolean flag, com.skype.SkyLib.UPGRADERESULT upgraderesult)
        {
            _sender = skylib;
            _isManual = flag;
            _result = upgraderesult;
        }
    }

    public static class OnContactGoneOffline
    {

        private int _contactObjectID;
        private SkyLib _sender;

        public int getContactObjectID()
        {
            return _contactObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnContactGoneOffline(SkyLib skylib, int i)
        {
            _sender = skylib;
            _contactObjectID = i;
        }
    }

    public static class OnContactGroupMembershipChanged
    {

        private boolean _added;
        private int _contactObjectID;
        private int _groupObjectId;
        private SkyLib _sender;

        public boolean getAdded()
        {
            return _added;
        }

        public int getContactObjectID()
        {
            return _contactObjectID;
        }

        public int getGroupObjectId()
        {
            return _groupObjectId;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnContactGroupMembershipChanged(SkyLib skylib, int i, int j, boolean flag)
        {
            _sender = skylib;
            _contactObjectID = i;
            _groupObjectId = j;
            _added = flag;
        }
    }

    public static class OnContactOnlineAppearance
    {

        private int _contactObjectID;
        private SkyLib _sender;

        public int getContactObjectID()
        {
            return _contactObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnContactOnlineAppearance(SkyLib skylib, int i)
        {
            _sender = skylib;
            _contactObjectID = i;
        }
    }

    public static class OnContentItemChange
    {

        private int _Id;
        private SkyLib _sender;

        public int getId()
        {
            return _Id;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnContentItemChange(SkyLib skylib, int i)
        {
            _sender = skylib;
            _Id = i;
        }
    }

    public static class OnContentListingResult
    {

        private int _contextid;
        private int _requestID;
        private com.skype.SkyLib.CONTENT_LIST_RESULT _result;
        private byte _result_hash[];
        private SkyLib _sender;

        public int getContextid()
        {
            return _contextid;
        }

        public int getRequestID()
        {
            return _requestID;
        }

        public com.skype.SkyLib.CONTENT_LIST_RESULT getResult()
        {
            return _result;
        }

        public byte[] getResult_hash()
        {
            return _result_hash;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnContentListingResult(SkyLib skylib, int i, com.skype.SkyLib.CONTENT_LIST_RESULT content_list_result, byte abyte0[], int j)
        {
            _sender = skylib;
            _requestID = i;
            _result = content_list_result;
            _result_hash = abyte0;
            _contextid = j;
        }
    }

    public static class OnConversationListChange
    {

        private boolean _added;
        private int _conversationObjectID;
        private SkyLib _sender;
        private com.skype.Conversation.LIST_TYPE _type;

        public boolean getAdded()
        {
            return _added;
        }

        public int getConversationObjectID()
        {
            return _conversationObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public com.skype.Conversation.LIST_TYPE getType()
        {
            return _type;
        }

        public OnConversationListChange(SkyLib skylib, int i, com.skype.Conversation.LIST_TYPE list_type, boolean flag)
        {
            _sender = skylib;
            _conversationObjectID = i;
            _type = list_type;
            _added = flag;
        }
    }

    public static class OnCustomAPINotification
    {

        private int _code;
        private SkyLib _sender;

        public int getCode()
        {
            return _code;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnCustomAPINotification(SkyLib skylib, int i)
        {
            _sender = skylib;
            _code = i;
        }
    }

    public static class OnEcsEvent
    {

        private com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE _eventType;
        private SkyLib _sender;

        public com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE getEventType()
        {
            return _eventType;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnEcsEvent(SkyLib skylib, com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE ecs_callback_event_type)
        {
            _sender = skylib;
            _eventType = ecs_callback_event_type;
        }
    }

    public static class OnEmoticonListUpdated
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnEmoticonListUpdated(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnExternalLoginRequest
    {

        private byte _blob[];
        private SkyLib _sender;

        public byte[] getBlob()
        {
            return _blob;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnExternalLoginRequest(SkyLib skylib, byte abyte0[])
        {
            _sender = skylib;
            _blob = abyte0;
        }
    }

    public static class OnFileTransferInitiated
    {

        private int _conversationObjectID;
        private int _messageObjectID;
        private SkyLib _sender;
        private int _transferObjectID;

        public int getConversationObjectID()
        {
            return _conversationObjectID;
        }

        public int getMessageObjectID()
        {
            return _messageObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public int getTransferObjectID()
        {
            return _transferObjectID;
        }

        public OnFileTransferInitiated(SkyLib skylib, int i, int j, int k)
        {
            _sender = skylib;
            _conversationObjectID = i;
            _messageObjectID = j;
            _transferObjectID = k;
        }
    }

    public static class OnH264Activated
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnH264Activated(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnHistorySyncFinished
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnHistorySyncFinished(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnHttpResponse
    {

        private byte _data[];
        private int _httpcode;
        private int _reqID;
        private com.skype.SkyLib.WEBGW_RESULT _result;
        private SkyLib _sender;
        private int _userdata;

        public byte[] getData()
        {
            return _data;
        }

        public int getHttpcode()
        {
            return _httpcode;
        }

        public int getReqID()
        {
            return _reqID;
        }

        public com.skype.SkyLib.WEBGW_RESULT getResult()
        {
            return _result;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public int getUserdata()
        {
            return _userdata;
        }

        public OnHttpResponse(SkyLib skylib, int i, com.skype.SkyLib.WEBGW_RESULT webgw_result, int j, byte abyte0[], int k)
        {
            _sender = skylib;
            _reqID = i;
            _result = webgw_result;
            _httpcode = j;
            _data = abyte0;
            _userdata = k;
        }
    }

    public static class OnHttpStreamResponse
    {

        private byte _data[];
        private int _reqID;
        private SkyLib _sender;
        private int _userdata;

        public byte[] getData()
        {
            return _data;
        }

        public int getReqID()
        {
            return _reqID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public int getUserdata()
        {
            return _userdata;
        }

        public OnHttpStreamResponse(SkyLib skylib, int i, byte abyte0[], int j)
        {
            _sender = skylib;
            _reqID = i;
            _data = abyte0;
            _userdata = j;
        }
    }

    public static class OnIncomingAlert
    {

        private int _alertObjectID;
        private SkyLib _sender;

        public int getAlertObjectID()
        {
            return _alertObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnIncomingAlert(SkyLib skylib, int i)
        {
            _sender = skylib;
            _alertObjectID = i;
        }
    }

    public static class OnIncomingPriceQuote
    {

        private int _priceQuoteObjectID;
        private SkyLib _sender;

        public int getPriceQuoteObjectID()
        {
            return _priceQuoteObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnIncomingPriceQuote(SkyLib skylib, int i)
        {
            _sender = skylib;
            _priceQuoteObjectID = i;
        }
    }

    public static class OnInitialEasSyncDone
    {

        private SkyLib _sender;
        private com.skype.SkyLib.CONTACT_SYNC_TYPE _type;

        public SkyLib getSender()
        {
            return _sender;
        }

        public com.skype.SkyLib.CONTACT_SYNC_TYPE getType()
        {
            return _type;
        }

        public OnInitialEasSyncDone(SkyLib skylib, com.skype.SkyLib.CONTACT_SYNC_TYPE contact_sync_type)
        {
            _sender = skylib;
            _type = contact_sync_type;
        }
    }

    public static class OnMessage
    {

        private boolean _changesInboxTimestamp;
        private int _conversationObjectID;
        private int _messageObjectID;
        private SkyLib _sender;
        private boolean _showNotification;
        private int _supersedesHistoryMessageObjectID;

        public boolean getChangesInboxTimestamp()
        {
            return _changesInboxTimestamp;
        }

        public int getConversationObjectID()
        {
            return _conversationObjectID;
        }

        public int getMessageObjectID()
        {
            return _messageObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public boolean getShowNotification()
        {
            return _showNotification;
        }

        public int getSupersedesHistoryMessageObjectID()
        {
            return _supersedesHistoryMessageObjectID;
        }

        public OnMessage(SkyLib skylib, int i, boolean flag, int j, int k, boolean flag1)
        {
            _sender = skylib;
            _messageObjectID = i;
            _changesInboxTimestamp = flag;
            _supersedesHistoryMessageObjectID = j;
            _conversationObjectID = k;
            _showNotification = flag1;
        }
    }

    public static class OnMessageAnnotation
    {

        private int _annotationObjectID;
        private SkyLib _sender;

        public int getAnnotationObjectID()
        {
            return _annotationObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnMessageAnnotation(SkyLib skylib, int i)
        {
            _sender = skylib;
            _annotationObjectID = i;
        }
    }

    public static class OnNewCustomContactGroup
    {

        private int _groupObjectID;
        private SkyLib _sender;

        public int getGroupObjectID()
        {
            return _groupObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnNewCustomContactGroup(SkyLib skylib, int i)
        {
            _sender = skylib;
            _groupObjectID = i;
        }
    }

    public static class OnNrgLevelsChange
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnNrgLevelsChange(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnObjectDelete
    {

        private int _objectID;
        private com.skype.SkyLib.OBJECTTYPE _objectType;
        private SkyLib _sender;

        public int getObjectID()
        {
            return _objectID;
        }

        public com.skype.SkyLib.OBJECTTYPE getObjectType()
        {
            return _objectType;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnObjectDelete(SkyLib skylib, com.skype.SkyLib.OBJECTTYPE objecttype, int i)
        {
            _sender = skylib;
            _objectType = objecttype;
            _objectID = i;
        }
    }

    public static class OnObjectPropertyChangeWithValue
    {

        private int _objectID;
        private PROPKEY _propKey;
        private Metatag _property;
        private SkyLib _sender;

        public int getObjectID()
        {
            return _objectID;
        }

        public PROPKEY getPropKey()
        {
            return _propKey;
        }

        public Metatag getProperty()
        {
            return _property;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnObjectPropertyChangeWithValue(SkyLib skylib, int i, PROPKEY propkey, Metatag metatag)
        {
            _sender = skylib;
            _objectID = i;
            _propKey = propkey;
            _property = metatag;
        }
    }

    public static class OnOperationModeChanged
    {

        private int _level;
        private SkyLib _sender;

        public int getLevel()
        {
            return _level;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnOperationModeChanged(SkyLib skylib, int i)
        {
            _sender = skylib;
            _level = i;
        }
    }

    public static class OnParticipantListChange
    {

        private int _conversationObjectID;
        private SkyLib _sender;

        public int getConversationObjectID()
        {
            return _conversationObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnParticipantListChange(SkyLib skylib, int i)
        {
            _sender = skylib;
            _conversationObjectID = i;
        }
    }

    public static class OnPartnerLinkInfoResult
    {

        private String _accessToken;
        private com.skype.SkyLib.AUTH_RESULT _code;
        private String _partnerUsername;
        private SkyLib _sender;
        private String _skypename;
        private String _uid;

        public String getAccessToken()
        {
            return _accessToken;
        }

        public com.skype.SkyLib.AUTH_RESULT getCode()
        {
            return _code;
        }

        public String getPartnerUsername()
        {
            return _partnerUsername;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public String getSkypename()
        {
            return _skypename;
        }

        public String getUid()
        {
            return _uid;
        }

        public OnPartnerLinkInfoResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String s, String s1, String s2, String s3)
        {
            _sender = skylib;
            _code = auth_result;
            _skypename = s;
            _uid = s1;
            _accessToken = s2;
            _partnerUsername = s3;
        }
    }

    public static class OnPartnerQueryResult
    {

        private String _data;
        private com.skype.SkyLib.PARTNER_QUERY_ERROR _errcode;
        private int _reqid;
        private SkyLib _sender;

        public String getData()
        {
            return _data;
        }

        public com.skype.SkyLib.PARTNER_QUERY_ERROR getErrcode()
        {
            return _errcode;
        }

        public int getReqid()
        {
            return _reqid;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnPartnerQueryResult(SkyLib skylib, int i, com.skype.SkyLib.PARTNER_QUERY_ERROR partner_query_error, String s)
        {
            _sender = skylib;
            _reqid = i;
            _errcode = partner_query_error;
            _data = s;
        }
    }

    public static class OnPendingMediaDocumentsListChanged
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnPendingMediaDocumentsListChanged(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnPromotedSCDContactsFound
    {

        private int _requestId;
        private int _resultObjectIDList[];
        private SkyLib _sender;

        public int getRequestId()
        {
            return _requestId;
        }

        public int[] getResultObjectIDList()
        {
            return _resultObjectIDList;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnPromotedSCDContactsFound(SkyLib skylib, int i, int ai[])
        {
            _sender = skylib;
            _requestId = i;
            _resultObjectIDList = ai;
        }
    }

    public static class OnPublicAPINotification
    {

        private int _clientID;
        private String _notification;
        private SkyLib _sender;

        public int getClientID()
        {
            return _clientID;
        }

        public String getNotification()
        {
            return _notification;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnPublicAPINotification(SkyLib skylib, int i, String s)
        {
            _sender = skylib;
            _clientID = i;
            _notification = s;
        }
    }

    public static class OnPushHandlingComplete
    {

        private int _pushId;
        private com.skype.SkyLib.PUSHHANDLINGRESULT _result;
        private SkyLib _sender;

        public int getPushId()
        {
            return _pushId;
        }

        public com.skype.SkyLib.PUSHHANDLINGRESULT getResult()
        {
            return _result;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnPushHandlingComplete(SkyLib skylib, int i, com.skype.SkyLib.PUSHHANDLINGRESULT pushhandlingresult)
        {
            _sender = skylib;
            _pushId = i;
            _result = pushhandlingresult;
        }
    }

    public static class OnQualityTestResult
    {

        private String _details;
        private SkyLib _sender;
        private com.skype.SkyLib.QUALITYTESTRESULT _testResult;
        private com.skype.SkyLib.QUALITYTESTTYPE _testType;
        private String _withUser;
        private String _xmlDetails;

        public String getDetails()
        {
            return _details;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public com.skype.SkyLib.QUALITYTESTRESULT getTestResult()
        {
            return _testResult;
        }

        public com.skype.SkyLib.QUALITYTESTTYPE getTestType()
        {
            return _testType;
        }

        public String getWithUser()
        {
            return _withUser;
        }

        public String getXmlDetails()
        {
            return _xmlDetails;
        }

        public OnQualityTestResult(SkyLib skylib, com.skype.SkyLib.QUALITYTESTTYPE qualitytesttype, com.skype.SkyLib.QUALITYTESTRESULT qualitytestresult, String s, String s1, String s2)
        {
            _sender = skylib;
            _testType = qualitytesttype;
            _testResult = qualitytestresult;
            _withUser = s;
            _details = s1;
            _xmlDetails = s2;
        }
    }

    public static class OnRegisterContextsComplete
    {

        private int _requestId;
        private SkyLib _sender;
        private com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT _success;

        public int getRequestId()
        {
            return _requestId;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT getSuccess()
        {
            return _success;
        }

        public OnRegisterContextsComplete(SkyLib skylib, com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT pnm_register_contexts_result, int i)
        {
            _sender = skylib;
            _success = pnm_register_contexts_result;
            _requestId = i;
        }
    }

    public static class OnSeamlessCapableResult
    {

        private boolean _capable;
        private String _identity;
        private SkyLib _sender;

        public boolean getCapable()
        {
            return _capable;
        }

        public String getIdentity()
        {
            return _identity;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnSeamlessCapableResult(SkyLib skylib, String s, boolean flag)
        {
            _sender = skylib;
            _identity = s;
            _capable = flag;
        }
    }

    public static class OnSearchMessagesResult
    {

        private int _objectIDs[];
        private int _queryID;
        private SkyLib _sender;
        private String _snippets[];

        public int[] getObjectIDs()
        {
            return _objectIDs;
        }

        public int getQueryID()
        {
            return _queryID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public String[] getSnippets()
        {
            return _snippets;
        }

        public OnSearchMessagesResult(SkyLib skylib, int i, int ai[], String as[])
        {
            _sender = skylib;
            _queryID = i;
            _objectIDs = ai;
            _snippets = as;
        }
    }

    public static class OnServerTimeAvailable
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnServerTimeAvailable(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnStatsReported
    {

        private byte _attributes[];
        private SkyLib _sender;
        private int _statsType;

        public byte[] getAttributes()
        {
            return _attributes;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public int getStatsType()
        {
            return _statsType;
        }

        public OnStatsReported(SkyLib skylib, int i, byte abyte0[])
        {
            _sender = skylib;
            _statsType = i;
            _attributes = abyte0;
        }
    }

    public static class OnSuggestedAccountsResult
    {

        private String _avatars[];
        private com.skype.SkyLib.AUTH_RESULT _code;
        private String _fullnames[];
        private SkyLib _sender;
        private String _skypenames[];

        public String[] getAvatars()
        {
            return _avatars;
        }

        public com.skype.SkyLib.AUTH_RESULT getCode()
        {
            return _code;
        }

        public String[] getFullnames()
        {
            return _fullnames;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public String[] getSkypenames()
        {
            return _skypenames;
        }

        public OnSuggestedAccountsResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String as[], String as1[], String as2[])
        {
            _sender = skylib;
            _code = auth_result;
            _skypenames = as;
            _fullnames = as1;
            _avatars = as2;
        }
    }

    public static class OnTrackedObjectChanged
    {

        private int _callbacksLeft;
        private com.skype.SkyLib.OBJECT_TRACKER_CHANGE_TYPE _changeType;
        private int _itemId;
        private int _objectId;
        private com.skype.SkyLib.OBJECTTYPE _objectType;
        private SkyLib _sender;

        public int getCallbacksLeft()
        {
            return _callbacksLeft;
        }

        public com.skype.SkyLib.OBJECT_TRACKER_CHANGE_TYPE getChangeType()
        {
            return _changeType;
        }

        public int getItemId()
        {
            return _itemId;
        }

        public int getObjectId()
        {
            return _objectId;
        }

        public com.skype.SkyLib.OBJECTTYPE getObjectType()
        {
            return _objectType;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnTrackedObjectChanged(SkyLib skylib, int i, com.skype.SkyLib.OBJECTTYPE objecttype, com.skype.SkyLib.OBJECT_TRACKER_CHANGE_TYPE object_tracker_change_type, int j, int k)
        {
            _sender = skylib;
            _objectId = i;
            _objectType = objecttype;
            _changeType = object_tracker_change_type;
            _itemId = j;
            _callbacksLeft = k;
        }
    }

    public static class OnTrouterCheckConnectionComplete
    {

        private boolean _isConnected;
        private SkyLib _sender;

        public boolean getIsConnected()
        {
            return _isConnected;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnTrouterCheckConnectionComplete(SkyLib skylib, boolean flag)
        {
            _sender = skylib;
            _isConnected = flag;
        }
    }

    public static class OnTrouterConnectionStateChanged
    {

        private com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE _eventType;
        private SkyLib _sender;

        public com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE getEventType()
        {
            return _eventType;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnTrouterConnectionStateChanged(SkyLib skylib, com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE trouter_connection_state_callback_event_type)
        {
            _sender = skylib;
            _eventType = trouter_connection_state_callback_event_type;
        }
    }

    public static class OnTrouterSuspendComplete
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnTrouterSuspendComplete(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnTrouterSuspendReady
    {

        private SkyLib _sender;

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnTrouterSuspendReady(SkyLib skylib)
        {
            _sender = skylib;
        }
    }

    public static class OnUnifiedMastersChanged
    {

        private int _contactObjectID;
        private SkyLib _sender;

        public int getContactObjectID()
        {
            return _contactObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnUnifiedMastersChanged(SkyLib skylib, int i)
        {
            _sender = skylib;
            _contactObjectID = i;
        }
    }

    public static class OnUnifiedServantsChanged
    {

        private int _contactObjectID;
        private SkyLib _sender;

        public int getContactObjectID()
        {
            return _contactObjectID;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public OnUnifiedServantsChanged(SkyLib skylib, int i)
        {
            _sender = skylib;
            _contactObjectID = i;
        }
    }

    public static class OnVideoMessagingEntitlementChanged
    {

        private String _ids[];
        private boolean _isEntitled;
        private String _planName;
        private SkyLib _sender;
        private int _values[];

        public String[] getIds()
        {
            return _ids;
        }

        public boolean getIsEntitled()
        {
            return _isEntitled;
        }

        public String getPlanName()
        {
            return _planName;
        }

        public SkyLib getSender()
        {
            return _sender;
        }

        public int[] getValues()
        {
            return _values;
        }

        public OnVideoMessagingEntitlementChanged(SkyLib skylib, boolean flag, String s, String as[], int ai[])
        {
            _sender = skylib;
            _isEntitled = flag;
            _planName = s;
            _ids = as;
            _values = ai;
        }
    }


    EventBus eventBus;

    public SkyLibListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onAccessConnected(SkyLib skylib)
    {
        skylib = new OnAccessConnected(skylib);
        eventBus.a(skylib);
    }

    public void onAccessConnectionFailure(SkyLib skylib, com.skype.AccessSession.FAILUREREASON failurereason)
    {
        skylib = new OnAccessConnectionFailure(skylib, failurereason);
        eventBus.a(skylib);
    }

    public void onAccessDetectFailure(SkyLib skylib)
    {
        skylib = new OnAccessDetectFailure(skylib);
        eventBus.a(skylib);
    }

    public void onAccessDetecting(SkyLib skylib, com.skype.AccessSession.HOTSPOTTYPE hotspottype)
    {
        skylib = new OnAccessDetecting(skylib, hotspottype);
        eventBus.a(skylib);
    }

    public void onAccessDisconnected(SkyLib skylib)
    {
        skylib = new OnAccessDisconnected(skylib);
        eventBus.a(skylib);
    }

    public void onAccessEvent(SkyLib skylib, com.skype.SkyLib.ACCESSEVENTTYPE accesseventtype, int i)
    {
        skylib = new OnAccessEvent(skylib, accesseventtype, i);
        eventBus.a(skylib);
    }

    public void onAccountAvatarResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String s, byte abyte0[])
    {
        skylib = new OnAccountAvatarResult(skylib, auth_result, s, abyte0);
        eventBus.a(skylib);
    }

    public void onAccountPartnerLinkResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String s)
    {
        skylib = new OnAccountPartnerLinkResult(skylib, auth_result, s);
        eventBus.a(skylib);
    }

    public void onApp2AppDatagram(SkyLib skylib, String s, String s1, byte abyte0[])
    {
        skylib = new OnApp2AppDatagram(skylib, s, s1, abyte0);
        eventBus.a(skylib);
    }

    public void onApp2AppStreamListChange(SkyLib skylib, String s, com.skype.SkyLib.APP2APP_STREAMS app2app_streams, String as[], int ai[])
    {
        skylib = new OnApp2AppStreamListChange(skylib, s, app2app_streams, as, ai);
        eventBus.a(skylib);
    }

    public void onAuthTokenRequest(SkyLib skylib, long l, String as[])
    {
        skylib = new OnAuthTokenRequest(skylib, l, as);
        eventBus.a(skylib);
    }

    public void onAuthTokenResult(SkyLib skylib, boolean flag, int i, String s)
    {
        skylib = new OnAuthTokenResult(skylib, flag, i, s);
        eventBus.a(skylib);
    }

    public void onAuthTokenResultWithTimeout(SkyLib skylib, boolean flag, int i, String s, int j, int k)
    {
        skylib = new OnAuthTokenResultWithTimeout(skylib, flag, i, s, j, k);
        eventBus.a(skylib);
    }

    public void onAvailableDeviceListChange(SkyLib skylib)
    {
        skylib = new OnAvailableDeviceListChange(skylib);
        eventBus.a(skylib);
    }

    public void onAvailableVideoDeviceListChange(SkyLib skylib)
    {
        skylib = new OnAvailableVideoDeviceListChange(skylib);
        eventBus.a(skylib);
    }

    public void onCallerIDOptionsChange(SkyLib skylib, int i, com.skype.SkyLib.CALLERID_OPTIONS_CHANGE callerid_options_change)
    {
        skylib = new OnCallerIDOptionsChange(skylib, i, callerid_options_change);
        eventBus.a(skylib);
    }

    public void onChatServiceConnectivity(SkyLib skylib)
    {
        skylib = new OnChatServiceConnectivity(skylib);
        eventBus.a(skylib);
    }

    public void onCheckUpgradeResult(SkyLib skylib, boolean flag, com.skype.SkyLib.UPGRADERESULT upgraderesult)
    {
        skylib = new OnCheckUpgradeResult(skylib, flag, upgraderesult);
        eventBus.a(skylib);
    }

    public void onContactGoneOffline(SkyLib skylib, int i)
    {
        skylib = new OnContactGoneOffline(skylib, i);
        eventBus.a(skylib);
    }

    public void onContactGroupMembershipChanged(SkyLib skylib, int i, int j, boolean flag)
    {
        skylib = new OnContactGroupMembershipChanged(skylib, i, j, flag);
        eventBus.a(skylib);
    }

    public void onContactOnlineAppearance(SkyLib skylib, int i)
    {
        skylib = new OnContactOnlineAppearance(skylib, i);
        eventBus.a(skylib);
    }

    public void onContentItemChange(SkyLib skylib, int i)
    {
        skylib = new OnContentItemChange(skylib, i);
        eventBus.a(skylib);
    }

    public void onContentListingResult(SkyLib skylib, int i, com.skype.SkyLib.CONTENT_LIST_RESULT content_list_result, byte abyte0[], int j)
    {
        skylib = new OnContentListingResult(skylib, i, content_list_result, abyte0, j);
        eventBus.a(skylib);
    }

    public void onConversationListChange(SkyLib skylib, int i, com.skype.Conversation.LIST_TYPE list_type, boolean flag)
    {
        skylib = new OnConversationListChange(skylib, i, list_type, flag);
        eventBus.a(skylib);
    }

    public void onCustomAPINotification(SkyLib skylib, int i)
    {
        skylib = new OnCustomAPINotification(skylib, i);
        eventBus.a(skylib);
    }

    public void onEcsEvent(SkyLib skylib, com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE ecs_callback_event_type)
    {
        skylib = new OnEcsEvent(skylib, ecs_callback_event_type);
        eventBus.a(skylib);
    }

    public void onEmoticonListUpdated(SkyLib skylib)
    {
        skylib = new OnEmoticonListUpdated(skylib);
        eventBus.a(skylib);
    }

    public void onExternalLoginRequest(SkyLib skylib, byte abyte0[])
    {
        skylib = new OnExternalLoginRequest(skylib, abyte0);
        eventBus.a(skylib);
    }

    public void onFileTransferInitiated(SkyLib skylib, int i, int j, int k)
    {
        skylib = new OnFileTransferInitiated(skylib, i, j, k);
        eventBus.a(skylib);
    }

    public void onH264Activated(SkyLib skylib)
    {
        skylib = new OnH264Activated(skylib);
        eventBus.a(skylib);
    }

    public void onHistorySyncFinished(SkyLib skylib)
    {
        skylib = new OnHistorySyncFinished(skylib);
        eventBus.a(skylib);
    }

    public void onHttpResponse(SkyLib skylib, int i, com.skype.SkyLib.WEBGW_RESULT webgw_result, int j, byte abyte0[], int k)
    {
        skylib = new OnHttpResponse(skylib, i, webgw_result, j, abyte0, k);
        eventBus.a(skylib);
    }

    public void onHttpStreamResponse(SkyLib skylib, int i, byte abyte0[], int j)
    {
        skylib = new OnHttpStreamResponse(skylib, i, abyte0, j);
        eventBus.a(skylib);
    }

    public void onIncomingAlert(SkyLib skylib, int i)
    {
        skylib = new OnIncomingAlert(skylib, i);
        eventBus.a(skylib);
    }

    public void onIncomingPriceQuote(SkyLib skylib, int i)
    {
        skylib = new OnIncomingPriceQuote(skylib, i);
        eventBus.a(skylib);
    }

    public void onInitialEasSyncDone(SkyLib skylib, com.skype.SkyLib.CONTACT_SYNC_TYPE contact_sync_type)
    {
        skylib = new OnInitialEasSyncDone(skylib, contact_sync_type);
        eventBus.a(skylib);
    }

    public void onMessage(SkyLib skylib, int i, boolean flag, int j, int k, boolean flag1)
    {
        skylib = new OnMessage(skylib, i, flag, j, k, flag1);
        eventBus.a(skylib);
    }

    public void onMessageAnnotation(SkyLib skylib, int i)
    {
        skylib = new OnMessageAnnotation(skylib, i);
        eventBus.a(skylib);
    }

    public void onNewCustomContactGroup(SkyLib skylib, int i)
    {
        skylib = new OnNewCustomContactGroup(skylib, i);
        eventBus.a(skylib);
    }

    public void onNrgLevelsChange(SkyLib skylib)
    {
        skylib = new OnNrgLevelsChange(skylib);
        eventBus.a(skylib);
    }

    public void onObjectDelete(SkyLib skylib, com.skype.SkyLib.OBJECTTYPE objecttype, int i)
    {
        skylib = new OnObjectDelete(skylib, objecttype, i);
        eventBus.a(skylib);
    }

    public void onObjectPropertyChangeWithValue(SkyLib skylib, int i, PROPKEY propkey, Metatag metatag)
    {
        skylib = new OnObjectPropertyChangeWithValue(skylib, i, propkey, metatag);
        eventBus.a(skylib);
    }

    public void onOperationModeChanged(SkyLib skylib, int i)
    {
        skylib = new OnOperationModeChanged(skylib, i);
        eventBus.a(skylib);
    }

    public void onParticipantListChange(SkyLib skylib, int i)
    {
        skylib = new OnParticipantListChange(skylib, i);
        eventBus.a(skylib);
    }

    public void onPartnerLinkInfoResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String s, String s1, String s2, String s3)
    {
        skylib = new OnPartnerLinkInfoResult(skylib, auth_result, s, s1, s2, s3);
        eventBus.a(skylib);
    }

    public void onPartnerQueryResult(SkyLib skylib, int i, com.skype.SkyLib.PARTNER_QUERY_ERROR partner_query_error, String s)
    {
        skylib = new OnPartnerQueryResult(skylib, i, partner_query_error, s);
        eventBus.a(skylib);
    }

    public void onPendingMediaDocumentsListChanged(SkyLib skylib)
    {
        skylib = new OnPendingMediaDocumentsListChanged(skylib);
        eventBus.a(skylib);
    }

    public void onPromotedSCDContactsFound(SkyLib skylib, int i, int ai[])
    {
        skylib = new OnPromotedSCDContactsFound(skylib, i, ai);
        eventBus.a(skylib);
    }

    public void onPublicAPINotification(SkyLib skylib, int i, String s)
    {
        skylib = new OnPublicAPINotification(skylib, i, s);
        eventBus.a(skylib);
    }

    public void onPushHandlingComplete(SkyLib skylib, int i, com.skype.SkyLib.PUSHHANDLINGRESULT pushhandlingresult)
    {
        skylib = new OnPushHandlingComplete(skylib, i, pushhandlingresult);
        eventBus.a(skylib);
    }

    public void onQualityTestResult(SkyLib skylib, com.skype.SkyLib.QUALITYTESTTYPE qualitytesttype, com.skype.SkyLib.QUALITYTESTRESULT qualitytestresult, String s, String s1, String s2)
    {
        skylib = new OnQualityTestResult(skylib, qualitytesttype, qualitytestresult, s, s1, s2);
        eventBus.a(skylib);
    }

    public void onRegisterContextsComplete(SkyLib skylib, com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT pnm_register_contexts_result, int i)
    {
        skylib = new OnRegisterContextsComplete(skylib, pnm_register_contexts_result, i);
        eventBus.a(skylib);
    }

    public void onSeamlessCapableResult(SkyLib skylib, String s, boolean flag)
    {
        skylib = new OnSeamlessCapableResult(skylib, s, flag);
        eventBus.a(skylib);
    }

    public void onSearchMessagesResult(SkyLib skylib, int i, int ai[], String as[])
    {
        skylib = new OnSearchMessagesResult(skylib, i, ai, as);
        eventBus.a(skylib);
    }

    public void onServerTimeAvailable(SkyLib skylib)
    {
        skylib = new OnServerTimeAvailable(skylib);
        eventBus.a(skylib);
    }

    public void onStatsReported(SkyLib skylib, int i, byte abyte0[])
    {
        skylib = new OnStatsReported(skylib, i, abyte0);
        eventBus.a(skylib);
    }

    public void onSuggestedAccountsResult(SkyLib skylib, com.skype.SkyLib.AUTH_RESULT auth_result, String as[], String as1[], String as2[])
    {
        skylib = new OnSuggestedAccountsResult(skylib, auth_result, as, as1, as2);
        eventBus.a(skylib);
    }

    public void onTrackedObjectChanged(SkyLib skylib, int i, com.skype.SkyLib.OBJECTTYPE objecttype, com.skype.SkyLib.OBJECT_TRACKER_CHANGE_TYPE object_tracker_change_type, int j, int k)
    {
        skylib = new OnTrackedObjectChanged(skylib, i, objecttype, object_tracker_change_type, j, k);
        eventBus.a(skylib);
    }

    public void onTrouterCheckConnectionComplete(SkyLib skylib, boolean flag)
    {
        skylib = new OnTrouterCheckConnectionComplete(skylib, flag);
        eventBus.a(skylib);
    }

    public void onTrouterConnectionStateChanged(SkyLib skylib, com.skype.SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE trouter_connection_state_callback_event_type)
    {
        skylib = new OnTrouterConnectionStateChanged(skylib, trouter_connection_state_callback_event_type);
        eventBus.a(skylib);
    }

    public void onTrouterSuspendComplete(SkyLib skylib)
    {
        skylib = new OnTrouterSuspendComplete(skylib);
        eventBus.a(skylib);
    }

    public void onTrouterSuspendReady(SkyLib skylib)
    {
        skylib = new OnTrouterSuspendReady(skylib);
        eventBus.a(skylib);
    }

    public void onUnifiedMastersChanged(SkyLib skylib, int i)
    {
        skylib = new OnUnifiedMastersChanged(skylib, i);
        eventBus.a(skylib);
    }

    public void onUnifiedServantsChanged(SkyLib skylib, int i)
    {
        skylib = new OnUnifiedServantsChanged(skylib, i);
        eventBus.a(skylib);
    }

    public void onVideoMessagingEntitlementChanged(SkyLib skylib, boolean flag, String s, String as[], int ai[])
    {
        skylib = new OnVideoMessagingEntitlementChanged(skylib, flag, s, as, ai);
        eventBus.a(skylib);
    }
}
