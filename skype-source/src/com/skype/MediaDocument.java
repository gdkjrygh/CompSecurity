// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, NativeStringConvert

public interface MediaDocument
    extends ObjectInterface
{
    public static final class DOCUMENT_TYPE extends Enum
    {

        private static final DOCUMENT_TYPE $VALUES[];
        public static final DOCUMENT_TYPE MEDIA_AUDIO;
        public static final DOCUMENT_TYPE MEDIA_AVATAR;
        public static final DOCUMENT_TYPE MEDIA_EMOTICON;
        public static final DOCUMENT_TYPE MEDIA_FILE;
        public static final DOCUMENT_TYPE MEDIA_FLIK;
        public static final DOCUMENT_TYPE MEDIA_PACK;
        public static final DOCUMENT_TYPE MEDIA_PHOTO;
        public static final DOCUMENT_TYPE MEDIA_PHOTO_WITH_AUDIO;
        public static final DOCUMENT_TYPE MEDIA_TAB;
        public static final DOCUMENT_TYPE MEDIA_UNKNOWN;
        public static final DOCUMENT_TYPE MEDIA_URL_PREVIEW;
        public static final DOCUMENT_TYPE MEDIA_VIDEO;
        public static final DOCUMENT_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static DOCUMENT_TYPE fromInt(int i)
        {
            DOCUMENT_TYPE document_type = (DOCUMENT_TYPE)intToTypeMap.a(i);
            if (document_type != null)
            {
                return document_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static DOCUMENT_TYPE valueOf(String s)
        {
            return (DOCUMENT_TYPE)Enum.valueOf(com/skype/MediaDocument$DOCUMENT_TYPE, s);
        }

        public static DOCUMENT_TYPE[] values()
        {
            return (DOCUMENT_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MEDIA_UNKNOWN = new DOCUMENT_TYPE("MEDIA_UNKNOWN", 0, 0);
            MEDIA_VIDEO = new DOCUMENT_TYPE("MEDIA_VIDEO", 1, 1);
            MEDIA_PHOTO = new DOCUMENT_TYPE("MEDIA_PHOTO", 2, 2);
            MEDIA_AUDIO = new DOCUMENT_TYPE("MEDIA_AUDIO", 3, 3);
            MEDIA_PHOTO_WITH_AUDIO = new DOCUMENT_TYPE("MEDIA_PHOTO_WITH_AUDIO", 4, 4);
            MEDIA_AVATAR = new DOCUMENT_TYPE("MEDIA_AVATAR", 5, 5);
            MEDIA_URL_PREVIEW = new DOCUMENT_TYPE("MEDIA_URL_PREVIEW", 6, 6);
            MEDIA_EMOTICON = new DOCUMENT_TYPE("MEDIA_EMOTICON", 7, 7);
            MEDIA_FLIK = new DOCUMENT_TYPE("MEDIA_FLIK", 8, 8);
            MEDIA_PACK = new DOCUMENT_TYPE("MEDIA_PACK", 9, 9);
            MEDIA_FILE = new DOCUMENT_TYPE("MEDIA_FILE", 10, 10);
            MEDIA_TAB = new DOCUMENT_TYPE("MEDIA_TAB", 11, 11);
            WRAPPER_UNKNOWN_VALUE = new DOCUMENT_TYPE("WRAPPER_UNKNOWN_VALUE", 12, 0x7fffffff);
            $VALUES = (new DOCUMENT_TYPE[] {
                MEDIA_UNKNOWN, MEDIA_VIDEO, MEDIA_PHOTO, MEDIA_AUDIO, MEDIA_PHOTO_WITH_AUDIO, MEDIA_AVATAR, MEDIA_URL_PREVIEW, MEDIA_EMOTICON, MEDIA_FLIK, MEDIA_PACK, 
                MEDIA_FILE, MEDIA_TAB, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            DOCUMENT_TYPE adocument_type[] = values();
            int k = adocument_type.length;
            for (int i = 0; i < k; i++)
            {
                DOCUMENT_TYPE document_type = adocument_type[i];
                intToTypeMap.a(document_type.value, document_type);
            }

        }

        private DOCUMENT_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class GetMediaLink_Result
    {

        public String m_path;
        public MEDIA_STATUS m_return;

        public void init(byte abyte0[], MEDIA_STATUS media_status)
        {
            m_path = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = media_status;
        }

        public GetMediaLink_Result()
        {
        }
    }

    public static class GetMetadataIntValue_Result
    {

        public boolean m_return;
        public int m_value;

        public void init(int i, boolean flag)
        {
            m_value = i;
            m_return = flag;
        }

        public GetMetadataIntValue_Result()
        {
        }
    }

    public static class GetMetadataStringValue_Result
    {

        public boolean m_return;
        public String m_value;

        public void init(byte abyte0[], boolean flag)
        {
            m_value = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public GetMetadataStringValue_Result()
        {
        }
    }

    public static final class MEDIA_GET_POLICY extends Enum
    {

        private static final MEDIA_GET_POLICY $VALUES[];
        public static final MEDIA_GET_POLICY CACHE_ONLY;
        public static final MEDIA_GET_POLICY CACHE_THEN_DOWNLOAD;
        public static final MEDIA_GET_POLICY CACHE_THEN_LINK;
        public static final MEDIA_GET_POLICY CANCEL_DOWNLOAD;
        public static final MEDIA_GET_POLICY DOWNLOAD_ONLY;
        public static final MEDIA_GET_POLICY DOWNLOAD_TO_FILE;
        public static final MEDIA_GET_POLICY LINK_ONLY;
        public static final MEDIA_GET_POLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static MEDIA_GET_POLICY fromInt(int i)
        {
            MEDIA_GET_POLICY media_get_policy = (MEDIA_GET_POLICY)intToTypeMap.a(i);
            if (media_get_policy != null)
            {
                return media_get_policy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static MEDIA_GET_POLICY valueOf(String s)
        {
            return (MEDIA_GET_POLICY)Enum.valueOf(com/skype/MediaDocument$MEDIA_GET_POLICY, s);
        }

        public static MEDIA_GET_POLICY[] values()
        {
            return (MEDIA_GET_POLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            CACHE_ONLY = new MEDIA_GET_POLICY("CACHE_ONLY", 0, 0);
            CACHE_THEN_LINK = new MEDIA_GET_POLICY("CACHE_THEN_LINK", 1, 1);
            CACHE_THEN_DOWNLOAD = new MEDIA_GET_POLICY("CACHE_THEN_DOWNLOAD", 2, 2);
            LINK_ONLY = new MEDIA_GET_POLICY("LINK_ONLY", 3, 3);
            DOWNLOAD_ONLY = new MEDIA_GET_POLICY("DOWNLOAD_ONLY", 4, 4);
            CANCEL_DOWNLOAD = new MEDIA_GET_POLICY("CANCEL_DOWNLOAD", 5, 5);
            DOWNLOAD_TO_FILE = new MEDIA_GET_POLICY("DOWNLOAD_TO_FILE", 6, 6);
            WRAPPER_UNKNOWN_VALUE = new MEDIA_GET_POLICY("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new MEDIA_GET_POLICY[] {
                CACHE_ONLY, CACHE_THEN_LINK, CACHE_THEN_DOWNLOAD, LINK_ONLY, DOWNLOAD_ONLY, CANCEL_DOWNLOAD, DOWNLOAD_TO_FILE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            MEDIA_GET_POLICY amedia_get_policy[] = values();
            int k = amedia_get_policy.length;
            for (int i = 0; i < k; i++)
            {
                MEDIA_GET_POLICY media_get_policy = amedia_get_policy[i];
                intToTypeMap.a(media_get_policy.value, media_get_policy);
            }

        }

        private MEDIA_GET_POLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class MEDIA_STATUS extends Enum
    {

        private static final MEDIA_STATUS $VALUES[];
        public static final MEDIA_STATUS MEDIA_AVAILABLE_ONLINE;
        public static final MEDIA_STATUS MEDIA_BAD_CONTENT;
        public static final MEDIA_STATUS MEDIA_LOADED;
        public static final MEDIA_STATUS MEDIA_LOADING;
        public static final MEDIA_STATUS MEDIA_NOT_AVAILABLE;
        public static final MEDIA_STATUS MEDIA_PROCESSING;
        public static final MEDIA_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static MEDIA_STATUS fromInt(int i)
        {
            MEDIA_STATUS media_status = (MEDIA_STATUS)intToTypeMap.a(i);
            if (media_status != null)
            {
                return media_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static MEDIA_STATUS valueOf(String s)
        {
            return (MEDIA_STATUS)Enum.valueOf(com/skype/MediaDocument$MEDIA_STATUS, s);
        }

        public static MEDIA_STATUS[] values()
        {
            return (MEDIA_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MEDIA_LOADING = new MEDIA_STATUS("MEDIA_LOADING", 0, 0);
            MEDIA_LOADED = new MEDIA_STATUS("MEDIA_LOADED", 1, 1);
            MEDIA_AVAILABLE_ONLINE = new MEDIA_STATUS("MEDIA_AVAILABLE_ONLINE", 2, 2);
            MEDIA_NOT_AVAILABLE = new MEDIA_STATUS("MEDIA_NOT_AVAILABLE", 3, 3);
            MEDIA_PROCESSING = new MEDIA_STATUS("MEDIA_PROCESSING", 4, 4);
            MEDIA_BAD_CONTENT = new MEDIA_STATUS("MEDIA_BAD_CONTENT", 5, 5);
            WRAPPER_UNKNOWN_VALUE = new MEDIA_STATUS("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
            $VALUES = (new MEDIA_STATUS[] {
                MEDIA_LOADING, MEDIA_LOADED, MEDIA_AVAILABLE_ONLINE, MEDIA_NOT_AVAILABLE, MEDIA_PROCESSING, MEDIA_BAD_CONTENT, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            MEDIA_STATUS amedia_status[] = values();
            int k = amedia_status.length;
            for (int i = 0; i < k; i++)
            {
                MEDIA_STATUS media_status = amedia_status[i];
                intToTypeMap.a(media_status.value, media_status);
            }

        }

        private MEDIA_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface MediaDocumentIListener
    {

        public abstract void onDownloadError(MediaDocument mediadocument, String s, NETWORK_ERROR network_error, boolean flag);

        public abstract void onMediaLinkProgress(MediaDocument mediadocument, String s, int i, int j, int k);

        public abstract void onMediaLinkStatusChange(MediaDocument mediadocument, MEDIA_STATUS media_status, String s, String s1);

        public abstract void onMetadataUpdated(MediaDocument mediadocument);

        public abstract void onUploadError(MediaDocument mediadocument, String s, NETWORK_ERROR network_error, boolean flag);

        public abstract void onUploadProgress(MediaDocument mediadocument, String s, int i, int j);

        public abstract void onUploadStatusChanged(MediaDocument mediadocument, String s, UPLOAD_STATUS upload_status);
    }

    public static final class NETWORK_ERROR extends Enum
    {

        private static final NETWORK_ERROR $VALUES[];
        public static final NETWORK_ERROR CONNECTION_TIMEOUT;
        public static final NETWORK_ERROR HOST_NAME_NOT_RESOLVED;
        public static final NETWORK_ERROR INTERNAL_ERROR;
        public static final NETWORK_ERROR PROTOCOL_ERROR;
        public static final NETWORK_ERROR PROTOCOL_LIMITS_ERROR;
        public static final NETWORK_ERROR SERVER_NOT_AVAILABLE;
        public static final NETWORK_ERROR SSL_ERROR;
        public static final NETWORK_ERROR WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static NETWORK_ERROR fromInt(int i)
        {
            NETWORK_ERROR network_error = (NETWORK_ERROR)intToTypeMap.a(i);
            if (network_error != null)
            {
                return network_error;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static NETWORK_ERROR valueOf(String s)
        {
            return (NETWORK_ERROR)Enum.valueOf(com/skype/MediaDocument$NETWORK_ERROR, s);
        }

        public static NETWORK_ERROR[] values()
        {
            return (NETWORK_ERROR[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            HOST_NAME_NOT_RESOLVED = new NETWORK_ERROR("HOST_NAME_NOT_RESOLVED", 0, 0);
            SSL_ERROR = new NETWORK_ERROR("SSL_ERROR", 1, 1);
            SERVER_NOT_AVAILABLE = new NETWORK_ERROR("SERVER_NOT_AVAILABLE", 2, 2);
            CONNECTION_TIMEOUT = new NETWORK_ERROR("CONNECTION_TIMEOUT", 3, 3);
            PROTOCOL_ERROR = new NETWORK_ERROR("PROTOCOL_ERROR", 4, 4);
            INTERNAL_ERROR = new NETWORK_ERROR("INTERNAL_ERROR", 5, 5);
            PROTOCOL_LIMITS_ERROR = new NETWORK_ERROR("PROTOCOL_LIMITS_ERROR", 6, 6);
            WRAPPER_UNKNOWN_VALUE = new NETWORK_ERROR("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
            $VALUES = (new NETWORK_ERROR[] {
                HOST_NAME_NOT_RESOLVED, SSL_ERROR, SERVER_NOT_AVAILABLE, CONNECTION_TIMEOUT, PROTOCOL_ERROR, INTERNAL_ERROR, PROTOCOL_LIMITS_ERROR, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            NETWORK_ERROR anetwork_error[] = values();
            int k = anetwork_error.length;
            for (int i = 0; i < k; i++)
            {
                NETWORK_ERROR network_error = anetwork_error[i];
                intToTypeMap.a(network_error.value, network_error);
            }

        }

        private NETWORK_ERROR(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class SERVICE_TRUST_TYPE extends Enum
    {

        private static final SERVICE_TRUST_TYPE $VALUES[];
        public static final SERVICE_TRUST_TYPE AUTH_TRUSTED;
        public static final SERVICE_TRUST_TYPE NOT_TRUSTED;
        public static final SERVICE_TRUST_TYPE TRUSTED;
        public static final SERVICE_TRUST_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static SERVICE_TRUST_TYPE fromInt(int i)
        {
            SERVICE_TRUST_TYPE service_trust_type = (SERVICE_TRUST_TYPE)intToTypeMap.a(i);
            if (service_trust_type != null)
            {
                return service_trust_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static SERVICE_TRUST_TYPE valueOf(String s)
        {
            return (SERVICE_TRUST_TYPE)Enum.valueOf(com/skype/MediaDocument$SERVICE_TRUST_TYPE, s);
        }

        public static SERVICE_TRUST_TYPE[] values()
        {
            return (SERVICE_TRUST_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOT_TRUSTED = new SERVICE_TRUST_TYPE("NOT_TRUSTED", 0, 0);
            AUTH_TRUSTED = new SERVICE_TRUST_TYPE("AUTH_TRUSTED", 1, 1);
            TRUSTED = new SERVICE_TRUST_TYPE("TRUSTED", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new SERVICE_TRUST_TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new SERVICE_TRUST_TYPE[] {
                NOT_TRUSTED, AUTH_TRUSTED, TRUSTED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            SERVICE_TRUST_TYPE aservice_trust_type[] = values();
            int k = aservice_trust_type.length;
            for (int i = 0; i < k; i++)
            {
                SERVICE_TRUST_TYPE service_trust_type = aservice_trust_type[i];
                intToTypeMap.a(service_trust_type.value, service_trust_type);
            }

        }

        private SERVICE_TRUST_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STATUS extends Enum
    {

        private static final STATUS $VALUES[];
        public static final STATUS ACCESS_DENIED;
        public static final STATUS AVAILABLE;
        public static final STATUS DELETED;
        public static final STATUS EXPIRED;
        public static final STATUS FAILED;
        public static final STATUS MALWARE;
        public static final STATUS NOT_AVAILABLE;
        public static final STATUS NOT_CREATED;
        public static final STATUS UNSAFE;
        public static final STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static STATUS fromInt(int i)
        {
            STATUS status = (STATUS)intToTypeMap.a(i);
            if (status != null)
            {
                return status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static STATUS valueOf(String s)
        {
            return (STATUS)Enum.valueOf(com/skype/MediaDocument$STATUS, s);
        }

        public static STATUS[] values()
        {
            return (STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            NOT_CREATED = new STATUS("NOT_CREATED", 0, 0);
            NOT_AVAILABLE = new STATUS("NOT_AVAILABLE", 1, 1);
            AVAILABLE = new STATUS("AVAILABLE", 2, 2);
            ACCESS_DENIED = new STATUS("ACCESS_DENIED", 3, 3);
            DELETED = new STATUS("DELETED", 4, 4);
            EXPIRED = new STATUS("EXPIRED", 5, 5);
            FAILED = new STATUS("FAILED", 6, 6);
            MALWARE = new STATUS("MALWARE", 7, 8);
            UNSAFE = new STATUS("UNSAFE", 8, 9);
            WRAPPER_UNKNOWN_VALUE = new STATUS("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
            $VALUES = (new STATUS[] {
                NOT_CREATED, NOT_AVAILABLE, AVAILABLE, ACCESS_DENIED, DELETED, EXPIRED, FAILED, MALWARE, UNSAFE, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            STATUS astatus[] = values();
            int k = astatus.length;
            for (int i = 0; i < k; i++)
            {
                STATUS status = astatus[i];
                intToTypeMap.a(status.value, status);
            }

        }

        private STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class STORAGE_POLICY extends Enum
    {

        private static final STORAGE_POLICY $VALUES[];
        public static final STORAGE_POLICY STORAGE_POLICY_COPY_TO_CACHE;
        public static final STORAGE_POLICY STORAGE_POLICY_MOVE_TO_CACHE;
        public static final STORAGE_POLICY STORAGE_POLICY_TAKE_OWNERSHIP;
        public static final STORAGE_POLICY STORAGE_POLICY_WEAK_LINK;
        public static final STORAGE_POLICY WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static STORAGE_POLICY fromInt(int i)
        {
            STORAGE_POLICY storage_policy = (STORAGE_POLICY)intToTypeMap.a(i);
            if (storage_policy != null)
            {
                return storage_policy;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static STORAGE_POLICY valueOf(String s)
        {
            return (STORAGE_POLICY)Enum.valueOf(com/skype/MediaDocument$STORAGE_POLICY, s);
        }

        public static STORAGE_POLICY[] values()
        {
            return (STORAGE_POLICY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            STORAGE_POLICY_COPY_TO_CACHE = new STORAGE_POLICY("STORAGE_POLICY_COPY_TO_CACHE", 0, 0);
            STORAGE_POLICY_MOVE_TO_CACHE = new STORAGE_POLICY("STORAGE_POLICY_MOVE_TO_CACHE", 1, 1);
            STORAGE_POLICY_WEAK_LINK = new STORAGE_POLICY("STORAGE_POLICY_WEAK_LINK", 2, 2);
            STORAGE_POLICY_TAKE_OWNERSHIP = new STORAGE_POLICY("STORAGE_POLICY_TAKE_OWNERSHIP", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new STORAGE_POLICY("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new STORAGE_POLICY[] {
                STORAGE_POLICY_COPY_TO_CACHE, STORAGE_POLICY_MOVE_TO_CACHE, STORAGE_POLICY_WEAK_LINK, STORAGE_POLICY_TAKE_OWNERSHIP, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            STORAGE_POLICY astorage_policy[] = values();
            int k = astorage_policy.length;
            for (int i = 0; i < k; i++)
            {
                STORAGE_POLICY storage_policy = astorage_policy[i];
                intToTypeMap.a(storage_policy.value, storage_policy);
            }

        }

        private STORAGE_POLICY(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class UPLOAD_STATUS extends Enum
    {

        private static final UPLOAD_STATUS $VALUES[];
        public static final UPLOAD_STATUS UPLOAD_COMPLETED;
        public static final UPLOAD_STATUS UPLOAD_FAILED;
        public static final UPLOAD_STATUS UPLOAD_IN_PROGRESS;
        public static final UPLOAD_STATUS UPLOAD_NOT_STARTED;
        public static final UPLOAD_STATUS UPLOAD_QUEUED;
        public static final UPLOAD_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static UPLOAD_STATUS fromInt(int i)
        {
            UPLOAD_STATUS upload_status = (UPLOAD_STATUS)intToTypeMap.a(i);
            if (upload_status != null)
            {
                return upload_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static UPLOAD_STATUS valueOf(String s)
        {
            return (UPLOAD_STATUS)Enum.valueOf(com/skype/MediaDocument$UPLOAD_STATUS, s);
        }

        public static UPLOAD_STATUS[] values()
        {
            return (UPLOAD_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            UPLOAD_NOT_STARTED = new UPLOAD_STATUS("UPLOAD_NOT_STARTED", 0, 0);
            UPLOAD_QUEUED = new UPLOAD_STATUS("UPLOAD_QUEUED", 1, 1);
            UPLOAD_IN_PROGRESS = new UPLOAD_STATUS("UPLOAD_IN_PROGRESS", 2, 2);
            UPLOAD_COMPLETED = new UPLOAD_STATUS("UPLOAD_COMPLETED", 3, 3);
            UPLOAD_FAILED = new UPLOAD_STATUS("UPLOAD_FAILED", 4, 4);
            WRAPPER_UNKNOWN_VALUE = new UPLOAD_STATUS("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
            $VALUES = (new UPLOAD_STATUS[] {
                UPLOAD_NOT_STARTED, UPLOAD_QUEUED, UPLOAD_IN_PROGRESS, UPLOAD_COMPLETED, UPLOAD_FAILED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            UPLOAD_STATUS aupload_status[] = values();
            int k = aupload_status.length;
            for (int i = 0; i < k; i++)
            {
                UPLOAD_STATUS upload_status = aupload_status[i];
                intToTypeMap.a(upload_status.value, upload_status);
            }

        }

        private UPLOAD_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }


    public abstract void addListener(MediaDocumentIListener mediadocumentilistener);

    public abstract boolean consume();

    public abstract boolean delete();

    public abstract MEDIA_STATUS downloadToFile(String s, String s1);

    public abstract int getConsumptionStatusProp();

    public abstract int getConvoIdProp();

    public abstract String getDescriptionProp();

    public abstract DOCUMENT_TYPE getDocTypeProp();

    public abstract GetMediaLink_Result getMediaLink(String s);

    public abstract GetMediaLink_Result getMediaLink(String s, MEDIA_GET_POLICY media_get_policy);

    public abstract int getMessageIdProp();

    public abstract GetMetadataIntValue_Result getMetadataIntValue(String s);

    public abstract GetMetadataStringValue_Result getMetadataStringValue(String s);

    public abstract String getMimeTypeProp();

    public abstract String getOriginalNameProp();

    public abstract String getServiceProp();

    public abstract STATUS getStatusProp();

    public abstract String getThumbnailUrlProp();

    public abstract String getTitleProp();

    public abstract SERVICE_TRUST_TYPE getTrust();

    public abstract String getTypeProp();

    public abstract UPLOAD_STATUS getUploadStatus(String s);

    public abstract String getUriProp();

    public abstract String getWebUrlProp();

    public abstract boolean linkProfileToContentId(String s, String s1);

    public abstract boolean linkProfiles(String s, String s1);

    public abstract void removeListener(MediaDocumentIListener mediadocumentilistener);

    public abstract boolean setMediaByContentId(String s, String s1);

    public abstract boolean setMediaByContentId(String s, String s1, STORAGE_POLICY storage_policy);

    public abstract boolean setMediaByProfileId(String s, String s1);

    public abstract boolean setMediaByProfileId(String s, String s1, STORAGE_POLICY storage_policy);

    public abstract boolean sync();

    public abstract boolean upload(String s);
}
