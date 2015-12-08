// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class MediaErrorCode extends Enum
{

    private static final MediaErrorCode $VALUES[];
    public static final MediaErrorCode AAXS_AppIDMismatch;
    public static final MediaErrorCode AAXS_AppVersionMismatch;
    public static final MediaErrorCode AAXS_ApplicationSpecificError;
    public static final MediaErrorCode AAXS_AuthenticationFailed;
    public static final MediaErrorCode AAXS_AuthorizationFailed;
    public static final MediaErrorCode AAXS_BadParameter;
    public static final MediaErrorCode AAXS_BadSignature;
    public static final MediaErrorCode AAXS_CachedLicenseExpired;
    public static final MediaErrorCode AAXS_ClientUpdateRequired;
    public static final MediaErrorCode AAXS_ClockTamperingDetected;
    public static final MediaErrorCode AAXS_ContentExpired;
    public static final MediaErrorCode AAXS_ContentIdSettingsNoAccess;
    public static final MediaErrorCode AAXS_ContentNotYetValid;
    public static final MediaErrorCode AAXS_CorruptGlobalStateStore;
    public static final MediaErrorCode AAXS_CorruptServerStateStore;
    public static final MediaErrorCode AAXS_CorruptedAdditionalHeader;
    public static final MediaErrorCode AAXS_CorruptedDRMMetadata;
    public static final MediaErrorCode AAXS_DRMNoAccessError;
    public static final MediaErrorCode AAXS_DeviceBindingFailed;
    public static final MediaErrorCode AAXS_DomainJoinFailed;
    public static final MediaErrorCode AAXS_DomainRegistrationRequired;
    public static final MediaErrorCode AAXS_DomainTokenExpired;
    public static final MediaErrorCode AAXS_DomainTokenInvalid;
    public static final MediaErrorCode AAXS_DomainTokenTooNew;
    public static final MediaErrorCode AAXS_DomainTokenTooOld;
    public static final MediaErrorCode AAXS_HardStopIntervalExpired;
    public static final MediaErrorCode AAXS_HostAuthenticateFailed;
    public static final MediaErrorCode AAXS_I15nFailed;
    public static final MediaErrorCode AAXS_IncognitoModeNotAllowed;
    public static final MediaErrorCode AAXS_IncompatibleAdobeCPVersion;
    public static final MediaErrorCode AAXS_InsufficientDeviceCapabilites;
    public static final MediaErrorCode AAXS_IntegrityVerificationFailed;
    public static final MediaErrorCode AAXS_InterfaceNotAvailable;
    public static final MediaErrorCode AAXS_InternalFailure;
    public static final MediaErrorCode AAXS_InvalidDRMPlatform;
    public static final MediaErrorCode AAXS_InvalidDRMVersion;
    public static final MediaErrorCode AAXS_InvalidRuntimePlatform;
    public static final MediaErrorCode AAXS_InvalidRuntimeVersion;
    public static final MediaErrorCode AAXS_InvalidVoucher;
    public static final MediaErrorCode AAXS_LicenseIntegrity;
    public static final MediaErrorCode AAXS_LoadAdobeCPFailed;
    public static final MediaErrorCode AAXS_MachineTokenInvalid;
    public static final MediaErrorCode AAXS_MigrationFailed;
    public static final MediaErrorCode AAXS_MinorErr_DisplayResolutionLargerThanConstraint;
    public static final MediaErrorCode AAXS_MissingAdobeCPGetAPI;
    public static final MediaErrorCode AAXS_MissingAdobeCPModule;
    public static final MediaErrorCode AAXS_NOTUSED_MOVED;
    public static final MediaErrorCode AAXS_NeedAuthentication;
    public static final MediaErrorCode AAXS_NoACPProtectionAvail;
    public static final MediaErrorCode AAXS_NoAnalogPlaybackAllowed;
    public static final MediaErrorCode AAXS_NoAnalogProtectionAvail;
    public static final MediaErrorCode AAXS_NoCGMSAProtectionAvail;
    public static final MediaErrorCode AAXS_NoCorrespondingRoot;
    public static final MediaErrorCode AAXS_NoDeviceId;
    public static final MediaErrorCode AAXS_NoDigitalPlaybackAllowed;
    public static final MediaErrorCode AAXS_NoDigitalProtectionAvail;
    public static final MediaErrorCode AAXS_NoOPConstraintInPixelConstraints;
    public static final MediaErrorCode AAXS_NoValidEmbeddedLicense;
    public static final MediaErrorCode AAXS_NotRegisteredToDomain;
    public static final MediaErrorCode AAXS_OperationTimeoutError;
    public static final MediaErrorCode AAXS_PermissionDenied;
    public static final MediaErrorCode AAXS_PlaybackWindowExpired;
    public static final MediaErrorCode AAXS_RequireSSL;
    public static final MediaErrorCode AAXS_ResolutionLargerThanMaxResolution;
    public static final MediaErrorCode AAXS_ServerConnectionFailed;
    public static final MediaErrorCode AAXS_ServerErrorTryAgain;
    public static final MediaErrorCode AAXS_ServerVersionTooHigh;
    public static final MediaErrorCode AAXS_ServerVersionTooLow;
    public static final MediaErrorCode AAXS_StoreTamperingDetected;
    public static final MediaErrorCode AAXS_UnknownConnectionType;
    public static final MediaErrorCode AAXS_UnsupportedIOSPlaylistError;
    public static final MediaErrorCode AAXS_UserSettingsNoAccess;
    public static final MediaErrorCode AAXS_WriteMicrosafeFailed;
    public static final MediaErrorCode AAXS_WrongLicenseKey;
    public static final MediaErrorCode ASYNC_OPERATION_IN_PROGRESS;
    public static final MediaErrorCode AUDIO_ONLY_STREAM_END;
    public static final MediaErrorCode AUDIO_ONLY_STREAM_START;
    public static final MediaErrorCode AUDIO_START_ERROR;
    public static final MediaErrorCode BAD_MANIFEST_SIGNATURE;
    public static final MediaErrorCode BAD_MEDIA_INTERLEAVING;
    public static final MediaErrorCode BAD_MEDIA_SAMPLE_FOUND;
    public static final MediaErrorCode CALLED_FROM_WRONG_THREAD;
    public static final MediaErrorCode CANNOT_ERASE_TIMELINE;
    public static final MediaErrorCode CANNOT_FAIL_OVER;
    public static final MediaErrorCode CANNOT_HANDLE_MAIN_MANIFEST_UPDATE;
    public static final MediaErrorCode CANNOT_LOAD_PLAYLIST;
    public static final MediaErrorCode CANNOT_SPLIT_TIMELINE;
    public static final MediaErrorCode CODEC_NOT_SUPPORTED;
    public static final MediaErrorCode COMPONENT_CREATION_FAILURE;
    public static final MediaErrorCode CONTAINER_NOT_SUPPORTED;
    public static final MediaErrorCode CONTENT_LENGTH_MISMATCH;
    public static final MediaErrorCode CRYPTO_ALGORITHM_NOT_SUPPORTED;
    public static final MediaErrorCode CRYPTO_ERROR_BAD_CERTIFICATE;
    public static final MediaErrorCode CRYPTO_ERROR_BAD_PARAMETER;
    public static final MediaErrorCode CRYPTO_ERROR_BUFFER_TOO_SMALL;
    public static final MediaErrorCode CRYPTO_ERROR_CORRUPTED_DATA;
    public static final MediaErrorCode CRYPTO_ERROR_DIGEST_FINISH;
    public static final MediaErrorCode CRYPTO_ERROR_DIGEST_UPDATE;
    public static final MediaErrorCode CRYPTO_ERROR_UNKNOWN;
    public static final MediaErrorCode CURRENT_PERIOD_EXPIRED;
    public static final MediaErrorCode DECODER_FAILED;
    public static final MediaErrorCode DEVICE_OPEN_ERROR;
    public static final MediaErrorCode DID_NOT_GET_NEXT_FRAGMENT;
    public static final MediaErrorCode DRM_INIT_ERROR;
    public static final MediaErrorCode DRM_NOT_AVAILABLE;
    public static final MediaErrorCode END_OF_PERIOD;
    public static final MediaErrorCode EOF;
    public static final MediaErrorCode FILE_NOT_FOUND;
    public static final MediaErrorCode FILE_OPEN_ERROR;
    public static final MediaErrorCode FILE_READ_ERROR;
    public static final MediaErrorCode FILE_STRUCTURE_INVALID;
    public static final MediaErrorCode FILE_WRITE_ERROR;
    public static final MediaErrorCode FRAGMENT_READ_ERROR;
    public static final MediaErrorCode GENERIC_ERROR;
    public static final MediaErrorCode HTTP_TIME_OUT;
    public static final MediaErrorCode ID3PARSE_ERROR;
    public static final MediaErrorCode INCOMPATIBLE_RENDER_MODE;
    public static final MediaErrorCode INTERNAL_ERROR;
    public static final MediaErrorCode INVALID_KEY;
    public static final MediaErrorCode INVALID_OPERATION;
    public static final MediaErrorCode INVALID_PARAMETER;
    public static final MediaErrorCode INVALID_REPLACE_DURATION;
    public static final MediaErrorCode INVALID_SEEK_TIME;
    public static final MediaErrorCode IRRECOVERABLE_ERROR;
    public static final MediaErrorCode KEY_NOT_FOUND;
    public static final MediaErrorCode KEY_SERVER_NOT_FOUND;
    public static final MediaErrorCode LISTENER_NOT_FOUND;
    public static final MediaErrorCode LIVE_HOLD;
    public static final MediaErrorCode LIVE_WINDOW_MOVED_BACKWARD;
    public static final MediaErrorCode LOST_CONNECTION_RECOVERABLE;
    public static final MediaErrorCode MANIFEST_FILE_UNEXPECTEDLY_CHANGED;
    public static final MediaErrorCode MAX_ERRORS;
    public static final MediaErrorCode NETWORK_DOWN;
    public static final MediaErrorCode NETWORK_ERROR;
    public static final MediaErrorCode NETWORK_UNAVAILABLE;
    public static final MediaErrorCode NOT_IMPLEMENTED;
    public static final MediaErrorCode NO_AUDIO_SINK;
    public static final MediaErrorCode NO_FIXED_SIZE;
    public static final MediaErrorCode NO_TIMELINE;
    public static final MediaErrorCode NO_USABLE_BITRATE_PROFILE;
    public static final MediaErrorCode NULL_OPERATION;
    public static final MediaErrorCode OPERATION_ABORTED;
    public static final MediaErrorCode OP_INVALID_WITH_AUDIO_ONLY_FILE;
    public static final MediaErrorCode OP_ONLY_ALLOWED_IN_PAUSED_STATE;
    public static final MediaErrorCode OUT_OF_MEMORY;
    public static final MediaErrorCode OVERFLOW;
    public static final MediaErrorCode PARSE_ERROR;
    public static final MediaErrorCode PARSE_ERROR_INCOMPATIBLE_VERSION;
    public static final MediaErrorCode PARTIAL_REPLACEMENT;
    public static final MediaErrorCode PERIOD_HOLD;
    public static final MediaErrorCode PERIOD_NOT_LOADED;
    public static final MediaErrorCode PLAYBACK_NOT_AUTHORIZED;
    public static final MediaErrorCode POSTROLL_WITH_LIVE_NOT_ALLOWED;
    public static final MediaErrorCode PREVIOUS_STEP_SEEK_IN_PROGRESS;
    public static final MediaErrorCode PROTOCOL_NOT_SUPPORTED;
    public static final MediaErrorCode RANGE_ERROR;
    public static final MediaErrorCode RANGE_SPANS_READ_HEAD;
    public static final MediaErrorCode RENDITION_M3U8_ERROR;
    public static final MediaErrorCode REPLACEMENT_FAILED;
    public static final MediaErrorCode SECURITY_ERROR;
    public static final MediaErrorCode SEEK_FAILED;
    public static final MediaErrorCode SEGMENT_SKIPPED_ON_FAILURE;
    public static final MediaErrorCode SIZE_UNKNOWN;
    public static final MediaErrorCode SOURCE_NOT_SPECIFIED;
    public static final MediaErrorCode SPS_PPS_FOUND_OUTSIDE_AVCC;
    public static final MediaErrorCode SUCCESS;
    public static final MediaErrorCode SWITCH_TO_ASYMMETRIC_PROFILE;
    public static final MediaErrorCode TIMELINE_TOO_SHORT;
    public static final MediaErrorCode UNDER_FLOW;
    public static final MediaErrorCode UNSUPPORTED_CONFIG;
    public static final MediaErrorCode UNSUPPORTED_HLS_VERSION;
    public static final MediaErrorCode UNSUPPORTED_OPERATION;
    public static final MediaErrorCode VIDEO_PROFILE_NOT_SUPPORTED;
    public static final MediaErrorCode WAITING_FOR_INIT;
    private final int value;

    private MediaErrorCode(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static MediaErrorCode valueOf(String s)
    {
        return (MediaErrorCode)Enum.valueOf(com/adobe/ave/MediaErrorCode, s);
    }

    public static MediaErrorCode[] values()
    {
        return (MediaErrorCode[])$VALUES.clone();
    }

    public final int getValue()
    {
        return value;
    }

    static 
    {
        END_OF_PERIOD = new MediaErrorCode("END_OF_PERIOD", 0, -1);
        SUCCESS = new MediaErrorCode("SUCCESS", 1, 0);
        ASYNC_OPERATION_IN_PROGRESS = new MediaErrorCode("ASYNC_OPERATION_IN_PROGRESS", 2, 1);
        EOF = new MediaErrorCode("EOF", 3, 2);
        DECODER_FAILED = new MediaErrorCode("DECODER_FAILED", 4, 3);
        DEVICE_OPEN_ERROR = new MediaErrorCode("DEVICE_OPEN_ERROR", 5, 4);
        FILE_NOT_FOUND = new MediaErrorCode("FILE_NOT_FOUND", 6, 5);
        GENERIC_ERROR = new MediaErrorCode("GENERIC_ERROR", 7, 6);
        IRRECOVERABLE_ERROR = new MediaErrorCode("IRRECOVERABLE_ERROR", 8, 7);
        LOST_CONNECTION_RECOVERABLE = new MediaErrorCode("LOST_CONNECTION_RECOVERABLE", 9, 8);
        NO_FIXED_SIZE = new MediaErrorCode("NO_FIXED_SIZE", 10, 9);
        NOT_IMPLEMENTED = new MediaErrorCode("NOT_IMPLEMENTED", 11, 10);
        OUT_OF_MEMORY = new MediaErrorCode("OUT_OF_MEMORY", 12, 11);
        PARSE_ERROR = new MediaErrorCode("PARSE_ERROR", 13, 12);
        SIZE_UNKNOWN = new MediaErrorCode("SIZE_UNKNOWN", 14, 13);
        UNDER_FLOW = new MediaErrorCode("UNDER_FLOW", 15, 14);
        UNSUPPORTED_CONFIG = new MediaErrorCode("UNSUPPORTED_CONFIG", 16, 15);
        UNSUPPORTED_OPERATION = new MediaErrorCode("UNSUPPORTED_OPERATION", 17, 16);
        WAITING_FOR_INIT = new MediaErrorCode("WAITING_FOR_INIT", 18, 17);
        INVALID_PARAMETER = new MediaErrorCode("INVALID_PARAMETER", 19, 18);
        INVALID_OPERATION = new MediaErrorCode("INVALID_OPERATION", 20, 19);
        OP_ONLY_ALLOWED_IN_PAUSED_STATE = new MediaErrorCode("OP_ONLY_ALLOWED_IN_PAUSED_STATE", 21, 20);
        OP_INVALID_WITH_AUDIO_ONLY_FILE = new MediaErrorCode("OP_INVALID_WITH_AUDIO_ONLY_FILE", 22, 21);
        PREVIOUS_STEP_SEEK_IN_PROGRESS = new MediaErrorCode("PREVIOUS_STEP_SEEK_IN_PROGRESS", 23, 22);
        SOURCE_NOT_SPECIFIED = new MediaErrorCode("SOURCE_NOT_SPECIFIED", 24, 23);
        RANGE_ERROR = new MediaErrorCode("RANGE_ERROR", 25, 24);
        INVALID_SEEK_TIME = new MediaErrorCode("INVALID_SEEK_TIME", 26, 25);
        FILE_STRUCTURE_INVALID = new MediaErrorCode("FILE_STRUCTURE_INVALID", 27, 26);
        COMPONENT_CREATION_FAILURE = new MediaErrorCode("COMPONENT_CREATION_FAILURE", 28, 27);
        DRM_INIT_ERROR = new MediaErrorCode("DRM_INIT_ERROR", 29, 28);
        CONTAINER_NOT_SUPPORTED = new MediaErrorCode("CONTAINER_NOT_SUPPORTED", 30, 29);
        SEEK_FAILED = new MediaErrorCode("SEEK_FAILED", 31, 30);
        CODEC_NOT_SUPPORTED = new MediaErrorCode("CODEC_NOT_SUPPORTED", 32, 31);
        NETWORK_UNAVAILABLE = new MediaErrorCode("NETWORK_UNAVAILABLE", 33, 32);
        NETWORK_ERROR = new MediaErrorCode("NETWORK_ERROR", 34, 33);
        OVERFLOW = new MediaErrorCode("OVERFLOW", 35, 34);
        VIDEO_PROFILE_NOT_SUPPORTED = new MediaErrorCode("VIDEO_PROFILE_NOT_SUPPORTED", 36, 35);
        PERIOD_NOT_LOADED = new MediaErrorCode("PERIOD_NOT_LOADED", 37, 36);
        INVALID_REPLACE_DURATION = new MediaErrorCode("INVALID_REPLACE_DURATION", 38, 37);
        CALLED_FROM_WRONG_THREAD = new MediaErrorCode("CALLED_FROM_WRONG_THREAD", 39, 38);
        FRAGMENT_READ_ERROR = new MediaErrorCode("FRAGMENT_READ_ERROR", 40, 39);
        OPERATION_ABORTED = new MediaErrorCode("OPERATION_ABORTED", 41, 40);
        UNSUPPORTED_HLS_VERSION = new MediaErrorCode("UNSUPPORTED_HLS_VERSION", 42, 41);
        CANNOT_FAIL_OVER = new MediaErrorCode("CANNOT_FAIL_OVER", 43, 42);
        HTTP_TIME_OUT = new MediaErrorCode("HTTP_TIME_OUT", 44, 43);
        NETWORK_DOWN = new MediaErrorCode("NETWORK_DOWN", 45, 44);
        NO_USABLE_BITRATE_PROFILE = new MediaErrorCode("NO_USABLE_BITRATE_PROFILE", 46, 45);
        BAD_MANIFEST_SIGNATURE = new MediaErrorCode("BAD_MANIFEST_SIGNATURE", 47, 46);
        CANNOT_LOAD_PLAYLIST = new MediaErrorCode("CANNOT_LOAD_PLAYLIST", 48, 47);
        REPLACEMENT_FAILED = new MediaErrorCode("REPLACEMENT_FAILED", 49, 48);
        SWITCH_TO_ASYMMETRIC_PROFILE = new MediaErrorCode("SWITCH_TO_ASYMMETRIC_PROFILE", 50, 49);
        LIVE_WINDOW_MOVED_BACKWARD = new MediaErrorCode("LIVE_WINDOW_MOVED_BACKWARD", 51, 50);
        CURRENT_PERIOD_EXPIRED = new MediaErrorCode("CURRENT_PERIOD_EXPIRED", 52, 51);
        CONTENT_LENGTH_MISMATCH = new MediaErrorCode("CONTENT_LENGTH_MISMATCH", 53, 52);
        PERIOD_HOLD = new MediaErrorCode("PERIOD_HOLD", 54, 53);
        LIVE_HOLD = new MediaErrorCode("LIVE_HOLD", 55, 54);
        BAD_MEDIA_INTERLEAVING = new MediaErrorCode("BAD_MEDIA_INTERLEAVING", 56, 55);
        DRM_NOT_AVAILABLE = new MediaErrorCode("DRM_NOT_AVAILABLE", 57, 56);
        PLAYBACK_NOT_AUTHORIZED = new MediaErrorCode("PLAYBACK_NOT_AUTHORIZED", 58, 57);
        BAD_MEDIA_SAMPLE_FOUND = new MediaErrorCode("BAD_MEDIA_SAMPLE_FOUND", 59, 58);
        RANGE_SPANS_READ_HEAD = new MediaErrorCode("RANGE_SPANS_READ_HEAD", 60, 59);
        POSTROLL_WITH_LIVE_NOT_ALLOWED = new MediaErrorCode("POSTROLL_WITH_LIVE_NOT_ALLOWED", 61, 60);
        INTERNAL_ERROR = new MediaErrorCode("INTERNAL_ERROR", 62, 61);
        SPS_PPS_FOUND_OUTSIDE_AVCC = new MediaErrorCode("SPS_PPS_FOUND_OUTSIDE_AVCC", 63, 62);
        PARTIAL_REPLACEMENT = new MediaErrorCode("PARTIAL_REPLACEMENT", 64, 63);
        RENDITION_M3U8_ERROR = new MediaErrorCode("RENDITION_M3U8_ERROR", 65, 64);
        NULL_OPERATION = new MediaErrorCode("NULL_OPERATION", 66, 65);
        SEGMENT_SKIPPED_ON_FAILURE = new MediaErrorCode("SEGMENT_SKIPPED_ON_FAILURE", 67, 66);
        INCOMPATIBLE_RENDER_MODE = new MediaErrorCode("INCOMPATIBLE_RENDER_MODE", 68, 67);
        PROTOCOL_NOT_SUPPORTED = new MediaErrorCode("PROTOCOL_NOT_SUPPORTED", 69, 68);
        PARSE_ERROR_INCOMPATIBLE_VERSION = new MediaErrorCode("PARSE_ERROR_INCOMPATIBLE_VERSION", 70, 69);
        MANIFEST_FILE_UNEXPECTEDLY_CHANGED = new MediaErrorCode("MANIFEST_FILE_UNEXPECTEDLY_CHANGED", 71, 70);
        CANNOT_SPLIT_TIMELINE = new MediaErrorCode("CANNOT_SPLIT_TIMELINE", 72, 71);
        CANNOT_ERASE_TIMELINE = new MediaErrorCode("CANNOT_ERASE_TIMELINE", 73, 72);
        DID_NOT_GET_NEXT_FRAGMENT = new MediaErrorCode("DID_NOT_GET_NEXT_FRAGMENT", 74, 73);
        NO_TIMELINE = new MediaErrorCode("NO_TIMELINE", 75, 74);
        LISTENER_NOT_FOUND = new MediaErrorCode("LISTENER_NOT_FOUND", 76, 75);
        AUDIO_START_ERROR = new MediaErrorCode("AUDIO_START_ERROR", 77, 76);
        NO_AUDIO_SINK = new MediaErrorCode("NO_AUDIO_SINK", 78, 77);
        FILE_OPEN_ERROR = new MediaErrorCode("FILE_OPEN_ERROR", 79, 78);
        FILE_WRITE_ERROR = new MediaErrorCode("FILE_WRITE_ERROR", 80, 79);
        FILE_READ_ERROR = new MediaErrorCode("FILE_READ_ERROR", 81, 80);
        ID3PARSE_ERROR = new MediaErrorCode("ID3PARSE_ERROR", 82, 81);
        SECURITY_ERROR = new MediaErrorCode("SECURITY_ERROR", 83, 82);
        TIMELINE_TOO_SHORT = new MediaErrorCode("TIMELINE_TOO_SHORT", 84, 83);
        AUDIO_ONLY_STREAM_START = new MediaErrorCode("AUDIO_ONLY_STREAM_START", 85, 84);
        AUDIO_ONLY_STREAM_END = new MediaErrorCode("AUDIO_ONLY_STREAM_END", 86, 85);
        CANNOT_HANDLE_MAIN_MANIFEST_UPDATE = new MediaErrorCode("CANNOT_HANDLE_MAIN_MANIFEST_UPDATE", 87, 86);
        KEY_NOT_FOUND = new MediaErrorCode("KEY_NOT_FOUND", 88, 87);
        INVALID_KEY = new MediaErrorCode("INVALID_KEY", 89, 88);
        KEY_SERVER_NOT_FOUND = new MediaErrorCode("KEY_SERVER_NOT_FOUND", 90, 89);
        CRYPTO_ALGORITHM_NOT_SUPPORTED = new MediaErrorCode("CRYPTO_ALGORITHM_NOT_SUPPORTED", 91, 300);
        CRYPTO_ERROR_CORRUPTED_DATA = new MediaErrorCode("CRYPTO_ERROR_CORRUPTED_DATA", 92, 301);
        CRYPTO_ERROR_BUFFER_TOO_SMALL = new MediaErrorCode("CRYPTO_ERROR_BUFFER_TOO_SMALL", 93, 302);
        CRYPTO_ERROR_BAD_CERTIFICATE = new MediaErrorCode("CRYPTO_ERROR_BAD_CERTIFICATE", 94, 303);
        CRYPTO_ERROR_DIGEST_UPDATE = new MediaErrorCode("CRYPTO_ERROR_DIGEST_UPDATE", 95, 304);
        CRYPTO_ERROR_DIGEST_FINISH = new MediaErrorCode("CRYPTO_ERROR_DIGEST_FINISH", 96, 305);
        CRYPTO_ERROR_BAD_PARAMETER = new MediaErrorCode("CRYPTO_ERROR_BAD_PARAMETER", 97, 306);
        CRYPTO_ERROR_UNKNOWN = new MediaErrorCode("CRYPTO_ERROR_UNKNOWN", 98, 307);
        AAXS_InvalidVoucher = new MediaErrorCode("AAXS_InvalidVoucher", 99, 3300);
        AAXS_AuthenticationFailed = new MediaErrorCode("AAXS_AuthenticationFailed", 100, 3301);
        AAXS_RequireSSL = new MediaErrorCode("AAXS_RequireSSL", 101, 3302);
        AAXS_ContentExpired = new MediaErrorCode("AAXS_ContentExpired", 102, 3303);
        AAXS_AuthorizationFailed = new MediaErrorCode("AAXS_AuthorizationFailed", 103, 3304);
        AAXS_ServerConnectionFailed = new MediaErrorCode("AAXS_ServerConnectionFailed", 104, 3305);
        AAXS_ClientUpdateRequired = new MediaErrorCode("AAXS_ClientUpdateRequired", 105, 3306);
        AAXS_InternalFailure = new MediaErrorCode("AAXS_InternalFailure", 106, 3307);
        AAXS_WrongLicenseKey = new MediaErrorCode("AAXS_WrongLicenseKey", 107, 3308);
        AAXS_CorruptedAdditionalHeader = new MediaErrorCode("AAXS_CorruptedAdditionalHeader", 108, 3309);
        AAXS_AppIDMismatch = new MediaErrorCode("AAXS_AppIDMismatch", 109, 3310);
        AAXS_AppVersionMismatch = new MediaErrorCode("AAXS_AppVersionMismatch", 110, 3311);
        AAXS_LicenseIntegrity = new MediaErrorCode("AAXS_LicenseIntegrity", 111, 3312);
        AAXS_WriteMicrosafeFailed = new MediaErrorCode("AAXS_WriteMicrosafeFailed", 112, 3313);
        AAXS_CorruptedDRMMetadata = new MediaErrorCode("AAXS_CorruptedDRMMetadata", 113, 3314);
        AAXS_PermissionDenied = new MediaErrorCode("AAXS_PermissionDenied", 114, 3315);
        AAXS_NOTUSED_MOVED = new MediaErrorCode("AAXS_NOTUSED_MOVED", 115, 3316);
        AAXS_LoadAdobeCPFailed = new MediaErrorCode("AAXS_LoadAdobeCPFailed", 116, 3317);
        AAXS_IncompatibleAdobeCPVersion = new MediaErrorCode("AAXS_IncompatibleAdobeCPVersion", 117, 3318);
        AAXS_MissingAdobeCPGetAPI = new MediaErrorCode("AAXS_MissingAdobeCPGetAPI", 118, 3319);
        AAXS_HostAuthenticateFailed = new MediaErrorCode("AAXS_HostAuthenticateFailed", 119, 3320);
        AAXS_I15nFailed = new MediaErrorCode("AAXS_I15nFailed", 120, 3321);
        AAXS_DeviceBindingFailed = new MediaErrorCode("AAXS_DeviceBindingFailed", 121, 3322);
        AAXS_CorruptGlobalStateStore = new MediaErrorCode("AAXS_CorruptGlobalStateStore", 122, 3323);
        AAXS_MachineTokenInvalid = new MediaErrorCode("AAXS_MachineTokenInvalid", 123, 3324);
        AAXS_CorruptServerStateStore = new MediaErrorCode("AAXS_CorruptServerStateStore", 124, 3325);
        AAXS_StoreTamperingDetected = new MediaErrorCode("AAXS_StoreTamperingDetected", 125, 3326);
        AAXS_ClockTamperingDetected = new MediaErrorCode("AAXS_ClockTamperingDetected", 126, 3327);
        AAXS_ServerErrorTryAgain = new MediaErrorCode("AAXS_ServerErrorTryAgain", 127, 3328);
        AAXS_ApplicationSpecificError = new MediaErrorCode("AAXS_ApplicationSpecificError", 128, 3329);
        AAXS_NeedAuthentication = new MediaErrorCode("AAXS_NeedAuthentication", 129, 3330);
        AAXS_ContentNotYetValid = new MediaErrorCode("AAXS_ContentNotYetValid", 130, 3331);
        AAXS_CachedLicenseExpired = new MediaErrorCode("AAXS_CachedLicenseExpired", 131, 3332);
        AAXS_PlaybackWindowExpired = new MediaErrorCode("AAXS_PlaybackWindowExpired", 132, 3333);
        AAXS_InvalidDRMPlatform = new MediaErrorCode("AAXS_InvalidDRMPlatform", 133, 3334);
        AAXS_InvalidDRMVersion = new MediaErrorCode("AAXS_InvalidDRMVersion", 134, 3335);
        AAXS_InvalidRuntimePlatform = new MediaErrorCode("AAXS_InvalidRuntimePlatform", 135, 3336);
        AAXS_InvalidRuntimeVersion = new MediaErrorCode("AAXS_InvalidRuntimeVersion", 136, 3337);
        AAXS_UnknownConnectionType = new MediaErrorCode("AAXS_UnknownConnectionType", 137, 3338);
        AAXS_NoAnalogPlaybackAllowed = new MediaErrorCode("AAXS_NoAnalogPlaybackAllowed", 138, 3339);
        AAXS_NoAnalogProtectionAvail = new MediaErrorCode("AAXS_NoAnalogProtectionAvail", 139, 3340);
        AAXS_NoDigitalPlaybackAllowed = new MediaErrorCode("AAXS_NoDigitalPlaybackAllowed", 140, 3341);
        AAXS_NoDigitalProtectionAvail = new MediaErrorCode("AAXS_NoDigitalProtectionAvail", 141, 3342);
        AAXS_IntegrityVerificationFailed = new MediaErrorCode("AAXS_IntegrityVerificationFailed", 142, 3343);
        AAXS_MissingAdobeCPModule = new MediaErrorCode("AAXS_MissingAdobeCPModule", 143, 3344);
        AAXS_DRMNoAccessError = new MediaErrorCode("AAXS_DRMNoAccessError", 144, 3345);
        AAXS_MigrationFailed = new MediaErrorCode("AAXS_MigrationFailed", 145, 3346);
        AAXS_InsufficientDeviceCapabilites = new MediaErrorCode("AAXS_InsufficientDeviceCapabilites", 146, 3347);
        AAXS_HardStopIntervalExpired = new MediaErrorCode("AAXS_HardStopIntervalExpired", 147, 3348);
        AAXS_ServerVersionTooHigh = new MediaErrorCode("AAXS_ServerVersionTooHigh", 148, 3349);
        AAXS_ServerVersionTooLow = new MediaErrorCode("AAXS_ServerVersionTooLow", 149, 3350);
        AAXS_DomainTokenInvalid = new MediaErrorCode("AAXS_DomainTokenInvalid", 150, 3351);
        AAXS_DomainTokenTooOld = new MediaErrorCode("AAXS_DomainTokenTooOld", 151, 3352);
        AAXS_DomainTokenTooNew = new MediaErrorCode("AAXS_DomainTokenTooNew", 152, 3353);
        AAXS_DomainTokenExpired = new MediaErrorCode("AAXS_DomainTokenExpired", 153, 3354);
        AAXS_DomainJoinFailed = new MediaErrorCode("AAXS_DomainJoinFailed", 154, 3355);
        AAXS_NoCorrespondingRoot = new MediaErrorCode("AAXS_NoCorrespondingRoot", 155, 3356);
        AAXS_NoValidEmbeddedLicense = new MediaErrorCode("AAXS_NoValidEmbeddedLicense", 156, 3357);
        AAXS_NoACPProtectionAvail = new MediaErrorCode("AAXS_NoACPProtectionAvail", 157, 3358);
        AAXS_NoCGMSAProtectionAvail = new MediaErrorCode("AAXS_NoCGMSAProtectionAvail", 158, 3359);
        AAXS_DomainRegistrationRequired = new MediaErrorCode("AAXS_DomainRegistrationRequired", 159, 3360);
        AAXS_NotRegisteredToDomain = new MediaErrorCode("AAXS_NotRegisteredToDomain", 160, 3361);
        AAXS_OperationTimeoutError = new MediaErrorCode("AAXS_OperationTimeoutError", 161, 3362);
        AAXS_UnsupportedIOSPlaylistError = new MediaErrorCode("AAXS_UnsupportedIOSPlaylistError", 162, 3363);
        AAXS_NoDeviceId = new MediaErrorCode("AAXS_NoDeviceId", 163, 3364);
        AAXS_IncognitoModeNotAllowed = new MediaErrorCode("AAXS_IncognitoModeNotAllowed", 164, 3365);
        AAXS_BadParameter = new MediaErrorCode("AAXS_BadParameter", 165, 3366);
        AAXS_BadSignature = new MediaErrorCode("AAXS_BadSignature", 166, 3367);
        AAXS_UserSettingsNoAccess = new MediaErrorCode("AAXS_UserSettingsNoAccess", 167, 3368);
        AAXS_InterfaceNotAvailable = new MediaErrorCode("AAXS_InterfaceNotAvailable", 168, 3369);
        AAXS_ContentIdSettingsNoAccess = new MediaErrorCode("AAXS_ContentIdSettingsNoAccess", 169, 3370);
        AAXS_NoOPConstraintInPixelConstraints = new MediaErrorCode("AAXS_NoOPConstraintInPixelConstraints", 170, 3371);
        AAXS_ResolutionLargerThanMaxResolution = new MediaErrorCode("AAXS_ResolutionLargerThanMaxResolution", 171, 3372);
        AAXS_MinorErr_DisplayResolutionLargerThanConstraint = new MediaErrorCode("AAXS_MinorErr_DisplayResolutionLargerThanConstraint", 172, 3373);
        MAX_ERRORS = new MediaErrorCode("MAX_ERRORS", 173, 3374);
        $VALUES = (new MediaErrorCode[] {
            END_OF_PERIOD, SUCCESS, ASYNC_OPERATION_IN_PROGRESS, EOF, DECODER_FAILED, DEVICE_OPEN_ERROR, FILE_NOT_FOUND, GENERIC_ERROR, IRRECOVERABLE_ERROR, LOST_CONNECTION_RECOVERABLE, 
            NO_FIXED_SIZE, NOT_IMPLEMENTED, OUT_OF_MEMORY, PARSE_ERROR, SIZE_UNKNOWN, UNDER_FLOW, UNSUPPORTED_CONFIG, UNSUPPORTED_OPERATION, WAITING_FOR_INIT, INVALID_PARAMETER, 
            INVALID_OPERATION, OP_ONLY_ALLOWED_IN_PAUSED_STATE, OP_INVALID_WITH_AUDIO_ONLY_FILE, PREVIOUS_STEP_SEEK_IN_PROGRESS, SOURCE_NOT_SPECIFIED, RANGE_ERROR, INVALID_SEEK_TIME, FILE_STRUCTURE_INVALID, COMPONENT_CREATION_FAILURE, DRM_INIT_ERROR, 
            CONTAINER_NOT_SUPPORTED, SEEK_FAILED, CODEC_NOT_SUPPORTED, NETWORK_UNAVAILABLE, NETWORK_ERROR, OVERFLOW, VIDEO_PROFILE_NOT_SUPPORTED, PERIOD_NOT_LOADED, INVALID_REPLACE_DURATION, CALLED_FROM_WRONG_THREAD, 
            FRAGMENT_READ_ERROR, OPERATION_ABORTED, UNSUPPORTED_HLS_VERSION, CANNOT_FAIL_OVER, HTTP_TIME_OUT, NETWORK_DOWN, NO_USABLE_BITRATE_PROFILE, BAD_MANIFEST_SIGNATURE, CANNOT_LOAD_PLAYLIST, REPLACEMENT_FAILED, 
            SWITCH_TO_ASYMMETRIC_PROFILE, LIVE_WINDOW_MOVED_BACKWARD, CURRENT_PERIOD_EXPIRED, CONTENT_LENGTH_MISMATCH, PERIOD_HOLD, LIVE_HOLD, BAD_MEDIA_INTERLEAVING, DRM_NOT_AVAILABLE, PLAYBACK_NOT_AUTHORIZED, BAD_MEDIA_SAMPLE_FOUND, 
            RANGE_SPANS_READ_HEAD, POSTROLL_WITH_LIVE_NOT_ALLOWED, INTERNAL_ERROR, SPS_PPS_FOUND_OUTSIDE_AVCC, PARTIAL_REPLACEMENT, RENDITION_M3U8_ERROR, NULL_OPERATION, SEGMENT_SKIPPED_ON_FAILURE, INCOMPATIBLE_RENDER_MODE, PROTOCOL_NOT_SUPPORTED, 
            PARSE_ERROR_INCOMPATIBLE_VERSION, MANIFEST_FILE_UNEXPECTEDLY_CHANGED, CANNOT_SPLIT_TIMELINE, CANNOT_ERASE_TIMELINE, DID_NOT_GET_NEXT_FRAGMENT, NO_TIMELINE, LISTENER_NOT_FOUND, AUDIO_START_ERROR, NO_AUDIO_SINK, FILE_OPEN_ERROR, 
            FILE_WRITE_ERROR, FILE_READ_ERROR, ID3PARSE_ERROR, SECURITY_ERROR, TIMELINE_TOO_SHORT, AUDIO_ONLY_STREAM_START, AUDIO_ONLY_STREAM_END, CANNOT_HANDLE_MAIN_MANIFEST_UPDATE, KEY_NOT_FOUND, INVALID_KEY, 
            KEY_SERVER_NOT_FOUND, CRYPTO_ALGORITHM_NOT_SUPPORTED, CRYPTO_ERROR_CORRUPTED_DATA, CRYPTO_ERROR_BUFFER_TOO_SMALL, CRYPTO_ERROR_BAD_CERTIFICATE, CRYPTO_ERROR_DIGEST_UPDATE, CRYPTO_ERROR_DIGEST_FINISH, CRYPTO_ERROR_BAD_PARAMETER, CRYPTO_ERROR_UNKNOWN, AAXS_InvalidVoucher, 
            AAXS_AuthenticationFailed, AAXS_RequireSSL, AAXS_ContentExpired, AAXS_AuthorizationFailed, AAXS_ServerConnectionFailed, AAXS_ClientUpdateRequired, AAXS_InternalFailure, AAXS_WrongLicenseKey, AAXS_CorruptedAdditionalHeader, AAXS_AppIDMismatch, 
            AAXS_AppVersionMismatch, AAXS_LicenseIntegrity, AAXS_WriteMicrosafeFailed, AAXS_CorruptedDRMMetadata, AAXS_PermissionDenied, AAXS_NOTUSED_MOVED, AAXS_LoadAdobeCPFailed, AAXS_IncompatibleAdobeCPVersion, AAXS_MissingAdobeCPGetAPI, AAXS_HostAuthenticateFailed, 
            AAXS_I15nFailed, AAXS_DeviceBindingFailed, AAXS_CorruptGlobalStateStore, AAXS_MachineTokenInvalid, AAXS_CorruptServerStateStore, AAXS_StoreTamperingDetected, AAXS_ClockTamperingDetected, AAXS_ServerErrorTryAgain, AAXS_ApplicationSpecificError, AAXS_NeedAuthentication, 
            AAXS_ContentNotYetValid, AAXS_CachedLicenseExpired, AAXS_PlaybackWindowExpired, AAXS_InvalidDRMPlatform, AAXS_InvalidDRMVersion, AAXS_InvalidRuntimePlatform, AAXS_InvalidRuntimeVersion, AAXS_UnknownConnectionType, AAXS_NoAnalogPlaybackAllowed, AAXS_NoAnalogProtectionAvail, 
            AAXS_NoDigitalPlaybackAllowed, AAXS_NoDigitalProtectionAvail, AAXS_IntegrityVerificationFailed, AAXS_MissingAdobeCPModule, AAXS_DRMNoAccessError, AAXS_MigrationFailed, AAXS_InsufficientDeviceCapabilites, AAXS_HardStopIntervalExpired, AAXS_ServerVersionTooHigh, AAXS_ServerVersionTooLow, 
            AAXS_DomainTokenInvalid, AAXS_DomainTokenTooOld, AAXS_DomainTokenTooNew, AAXS_DomainTokenExpired, AAXS_DomainJoinFailed, AAXS_NoCorrespondingRoot, AAXS_NoValidEmbeddedLicense, AAXS_NoACPProtectionAvail, AAXS_NoCGMSAProtectionAvail, AAXS_DomainRegistrationRequired, 
            AAXS_NotRegisteredToDomain, AAXS_OperationTimeoutError, AAXS_UnsupportedIOSPlaylistError, AAXS_NoDeviceId, AAXS_IncognitoModeNotAllowed, AAXS_BadParameter, AAXS_BadSignature, AAXS_UserSettingsNoAccess, AAXS_InterfaceNotAvailable, AAXS_ContentIdSettingsNoAccess, 
            AAXS_NoOPConstraintInPixelConstraints, AAXS_ResolutionLargerThanMaxResolution, AAXS_MinorErr_DisplayResolutionLargerThanConstraint, MAX_ERRORS
        });
    }
}
