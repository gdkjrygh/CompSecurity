// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.error;


public abstract class NFError
{
    public static class Response
    {

        public static final int CONTINUE_PLAY = 1;
        public static final int IGNORE = 2;
        public static final int TERMINATE_PLAY = 0;
        public int action;
        public int labelId;

        public Response()
        {
            labelId = 0x7f0c007f;
            action = 0;
        }
    }


    public static final String ACTION_IDS[] = {
        "NFErr_MC_NCCP_NonRecoverableError", "NFErr_MC_NCCP_PotentiallyRecoverableError", "NFErr_MC_NCCP_CustomError", "NFErr_MC_NCCP_RegistrationRequired", "NFErr_MC_NCCP_CTicketRenewalRequired", "NFErr_MC_NCCP_MTicketRenewalRequired", "NFErr_MC_NCCP_ImpossibleImpossibility", "NFErr_MC_NCCP_GetNewCredentials", "NFErr_MC_NCCP_UnsupportedVersion", "NFErr_MC_NCCP_SecondaryCredentialsRenewalRequired", 
        "NFErr_MC_NCCP_AbortPlayback", "NFErr_MC_NCCP_StaleCredentials"
    };
    private static final long NFERRS[] = {
        0L, 1L, 0xf0000000L, 0xf0000001L, 0xf0000002L, 0xf0000003L, 0xf0000004L, 0xf0000005L, 0xf0000006L, 0xf0000007L, 
        0xf0000008L, 0xf0000009L, 0xf000000aL, 0xf000000bL, 0xf000000cL, 0xf000000dL, 0xf000000eL, 0xf000000fL, 0xf0000010L, 0xf0000011L, 
        0xf0000012L, 0xf0000013L, 0xf0000014L, 0xf0000015L, 0xf0000016L, 0xf0000017L, 0xf0000018L, 0xf0000019L, 0xf000001aL, 0xf000001bL, 
        0xf000001cL, 0xf000001dL, 0xf000001eL, 0xf000001fL, 0xf0000020L, 0xf0000021L, 0xf0000022L, 0xf0000023L, 0xf0000024L, 0xf0000025L, 
        0xf0000026L, 0xf0000027L, 0xf0000028L, 0xf0000029L, 0xf000002aL, 0xf000002bL, 0xf000002cL, 0xf000002dL, 0xf000002eL, 0xf000002fL, 
        0xf0000030L, 0xf0000031L, 0xf0000032L, 0xf0000033L, 0xf0000034L, 0xf0010000L, 0xf0010001L, 0xf0010002L, 0xf0010003L, 0xf0010004L, 
        0xf0010005L, 0xf0010006L, 0xf0010007L, 0xf0010008L, 0xf0010009L, 0xf001000aL, 0xf001000bL, 0xf001000cL, 0xf001000dL, 0xf001000eL, 
        0xf001000fL, 0xf0010010L, 0xf0020000L, 0xf0020001L, 0xf0020002L, 0xf0020003L, 0xf0020004L, 0xf0020005L, 0xf0020006L, 0xf0020007L, 
        0xf0020008L, 0xf0020009L, 0xf002000aL, 0xf002000bL, 0xf002000cL, 0xf002000dL, 0xf0030001L, 0xf0030002L, 0xf0030003L, 0xf0030003L
    };
    private static final String NFERRS_labels[] = {
        "NFErr_Category_Success", "NFErr_OK", "NFErr_Category_GenericError", "NFErr_Bad", "NFErr_NoMemory", "NFErr_NotImplemented", "NFErr_NotFound", "NFErr_BadParameter", "NFErr_FileNotOpened", "NFErr_DeadLock", 
        "NFErr_Uninitialized_Mutex", "NFErr_InvalidAccess", "NFErr_Thread_NotStarted", "NFErr_Thread_NotFound", "NFErr_ArrayOutofBoundary", "NFErr_Interrupted", "NFErr_TimedOut", "NFErr_WaitingSelf", "NFErr_EmptyList", "NFErr_EndOfFile", 
        "NFErr_IOError", "NFErr_MessageQueueFull", "NFErr_MessageQueueEmpty", "NFErr_NoReplyPort", "NFErr_EndOfStream", "NFErr_ASFDataError", "NFErr_ASFSkipData", "NFErr_CMDWhileWaitingEOS", "NFErr_OtherFilmInProgress", "NFErr_NoFilmInProgress", 
        "NFErr_DRMFailed", "NFErr_InvalidStateTransition", "NFErr_MalformedData", "NFErr_Repeat", "NFErr_NCCPResponseFailed", "NFErr_Stop", "NFErr_NotAllowed", "NFErr_Skip", "NFErr_DuplicateEntry", "NFErr_Pending", 
        "NFErr_InvalidBookmark", "NFErr_SkipToNextKeyFrame", "NFErr_NotActive", "NFErr_NetworkError", "NFErr_DNSTimedOut", "NFErr_ConnRefused", "NFErr_ConnReset", "NFErr_Internal", "NFErr_SSLFailure", "NFErr_SSLUntrusted", 
        "NFErr_SSLExpired", "NFErr_SSLNoCipher", "NFErr_SSLNoCipher", "NFErr_SSLCrlOcsp", "NFErr_Uninitialized", "NFErr_NotReady", "NFErr_Category_McError", "NFErr_MC_AuthFailure", "NFErr_MC_AuthFailureNCCP", "NFErr_MC_InitStreamFailure", 
        "NFErr_MC_StreamSetIncomplete", "NFErr_MC_OpenDeviceFailure", "NFErr_MC_AcquireLicenseFailure", "NFErr_MC_AcquireLicenseFailureNCCP", "NFErr_MC_RefuseToPlayNonDrmed", "NFErr_MC_DevicePlaybackError", "NFErr_MC_DeviceDecryptionError", "NFErr_MC_ConnectionFailure", "NFErr_MC_HttpServerError", "NFErr_MC_HttpClientError", 
        "NFErr_MC_ContentNotAvailable", "NFErr_MC_SubtitleFailure", "NFErr_MC_HeartbeatFailure", "NFErr_MC_HeartbeatFailure", "NFErr_Category_NccpError", "NFErr_MC_NCCP_NonRecoverableError", "NFErr_MC_NCCP_PotentiallyRecoverableError", "NFErr_MC_NCCP_CustomError", "NFErr_MC_NCCP_RegistrationRequired", "NFErr_MC_NCCP_CTicketRenewalRequired", 
        "NFErr_MC_NCCP_MTicketRenewalRequired", "NFErr_MC_NCCP_ImpossibleImpossibility", "NFErr_MC_NCCP_GetNewCredentials", "NFErr_MC_NCCP_UnsupportedVersion", "NFErr_MC_NCCP_SecondaryCredentialsRenewalRequired", "NFErr_MC_NCCP_CannotObtainNpTicket", "NFErr_MC_NCCP_Exception", "NFErr_DeviceAccount_InvalidKey", "NFErr_DeviceAccount_NoCurrentKey", "NFErr_DeviceAccount_TooManyAccounts", 
        "NFErr_NCCPInvalidRedirect"
    };
    private static final long NFERR_CATEGORY_DEVICEACCOUNT_VAL = 0xf0030000L;
    private static final long NFERR_CATEGORY_GENERICERROR_VAL = 0xf0000000L;
    private static final long NFERR_CATEGORY_MASK = 0xffff0000L;
    private static final long NFERR_CATEGORY_MCERROR_VAL = 0xf0010000L;
    private static final long NFERR_CATEGORY_NCCPERROR_VAL = 0xf0020000L;
    private static final long NFERR_CATEGORY_SUCCESS_VAL = 0L;
    public static final long NFErr_ASFDataError = 0xf0000017L;
    public static final long NFErr_ASFSkipData = 0xf0000018L;
    public static final long NFErr_ArrayOutofBoundary = 0xf000000cL;
    public static final long NFErr_Bad = 0xf0000001L;
    public static final long NFErr_BadParameter = 0xf0000005L;
    public static final long NFErr_CMDWhileWaitingEOS = 0xf0000019L;
    public static final long NFErr_Category_GenericError = 0xf0000000L;
    public static final long NFErr_Category_McError = 0xf0010000L;
    public static final long NFErr_Category_NccpError = 0xf0020000L;
    public static final long NFErr_Category_Success = 0L;
    public static final long NFErr_ConnRefused = 0xf000002bL;
    public static final long NFErr_ConnReset = 0xf000002cL;
    public static final long NFErr_DNSTimedOut = 0xf000002aL;
    public static final long NFErr_DRMFailed = 0xf000001cL;
    public static final long NFErr_DeadLock = 0xf0000007L;
    public static final long NFErr_DeviceAccount_InvalidKey = 0xf0030001L;
    public static final long NFErr_DeviceAccount_NoCurrentKey = 0xf0030002L;
    public static final long NFErr_DeviceAccount_TooManyAccounts = 0xf0030003L;
    public static final long NFErr_DuplicateEntry = 0xf0000024L;
    public static final long NFErr_EmptyList = 0xf0000010L;
    public static final long NFErr_EndOfFile = 0xf0000011L;
    public static final long NFErr_EndOfStream = 0xf0000016L;
    public static final long NFErr_FileNotOpened = 0xf0000006L;
    public static final long NFErr_IOError = 0xf0000012L;
    public static final long NFErr_Internal = 0xf000002dL;
    public static final long NFErr_Interrupted = 0xf000000dL;
    public static final long NFErr_InvalidAccess = 0xf0000009L;
    public static final long NFErr_InvalidBookmark = 0xf0000026L;
    public static final long NFErr_InvalidStateTransition = 0xf000001dL;
    public static final long NFErr_MC_AcquireLicenseFailure = 0xf0010006L;
    public static final long NFErr_MC_AcquireLicenseFailureNCCP = 0xf0010007L;
    public static final long NFErr_MC_AuthFailure = 0xf0010001L;
    public static final long NFErr_MC_AuthFailureNCCP = 0xf0010002L;
    public static final long NFErr_MC_ConnectionFailure = 0xf001000bL;
    public static final long NFErr_MC_ContentNotAvailable = 0xf001000eL;
    public static final long NFErr_MC_DeviceDecryptionError = 0xf001000aL;
    public static final long NFErr_MC_DevicePlaybackError = 0xf0010009L;
    public static final long NFErr_MC_HeartbeatFailure = 0xf0010010L;
    public static final long NFErr_MC_HttpClientError = 0xf001000dL;
    public static final long NFErr_MC_HttpServerError = 0xf001000cL;
    public static final long NFErr_MC_InitStreamFailure = 0xf0010003L;
    public static final long NFErr_MC_NCCP_AbortPlayback = 0xf002000bL;
    public static final long NFErr_MC_NCCP_CTicketRenewalRequired = 0xf0020005L;
    public static final long NFErr_MC_NCCP_CustomError = 0xf0020003L;
    public static final long NFErr_MC_NCCP_Exception = 0xf002000dL;
    public static final long NFErr_MC_NCCP_GetNewCredentials = 0xf0020008L;
    public static final long NFErr_MC_NCCP_ImpossibleImpossibility = 0xf0020007L;
    public static final long NFErr_MC_NCCP_MTicketRenewalRequired = 0xf0020006L;
    public static final long NFErr_MC_NCCP_NonRecoverableError = 0xf0020001L;
    public static final long NFErr_MC_NCCP_PotentiallyRecoverableError = 0xf0020002L;
    public static final long NFErr_MC_NCCP_RegistrationRequired = 0xf0020004L;
    public static final long NFErr_MC_NCCP_SecondaryCredentialsRenewalRequired = 0xf002000aL;
    public static final long NFErr_MC_NCCP_StaleCredentials = 0xf002000cL;
    public static final long NFErr_MC_NCCP_UnsupportedVersion = 0xf0020009L;
    public static final long NFErr_MC_OpenDeviceFailure = 0xf0010005L;
    public static final long NFErr_MC_RefuseToPlayNonDrmed = 0xf0010008L;
    public static final long NFErr_MC_StreamSetIncomplete = 0xf0010004L;
    public static final long NFErr_MC_SubtitleFailure = 0xf001000fL;
    public static final long NFErr_MalformedData = 0xf000001eL;
    public static final long NFErr_MessageQueueEmpty = 0xf0000014L;
    public static final long NFErr_MessageQueueFull = 0xf0000013L;
    public static final long NFErr_NCCPInvalidRedirect = 0xf0030003L;
    public static final long NFErr_NCCPResponseFailed = 0xf0000020L;
    public static final long NFErr_NetworkError = 0xf0000029L;
    public static final long NFErr_NoFilmInProgress = 0xf000001bL;
    public static final long NFErr_NoMemory = 0xf0000002L;
    public static final long NFErr_NoReplyPort = 0xf0000015L;
    public static final long NFErr_NotActive = 0xf0000028L;
    public static final long NFErr_NotAllowed = 0xf0000022L;
    public static final long NFErr_NotFound = 0xf0000004L;
    public static final long NFErr_NotImplemented = 0xf0000003L;
    public static final long NFErr_NotReady = 0xf0000034L;
    public static final long NFErr_OK = 1L;
    public static final long NFErr_OtherFilmInProgress = 0xf000001aL;
    public static final long NFErr_Pending = 0xf0000025L;
    public static final long NFErr_Repeat = 0xf000001fL;
    public static final long NFErr_SSLCrlOcsp = 0xf0000032L;
    public static final long NFErr_SSLExpired = 0xf0000030L;
    public static final long NFErr_SSLFailure = 0xf000002eL;
    public static final long NFErr_SSLNoCipher = 0xf0000031L;
    public static final long NFErr_SSLUntrusted = 0xf000002fL;
    public static final long NFErr_Skip = 0xf0000023L;
    public static final long NFErr_SkipToNextKeyFrame = 0xf0000027L;
    public static final long NFErr_Stop = 0xf0000021L;
    public static final long NFErr_Thread_NotFound = 0xf000000bL;
    public static final long NFErr_Thread_NotStarted = 0xf000000aL;
    public static final long NFErr_TimedOut = 0xf000000eL;
    public static final long NFErr_Uninitialized = 0xf0000033L;
    public static final long NFErr_Uninitialized_Mutex = 0xf0000008L;
    public static final long NFErr_WaitingSelf = 0xf000000fL;

    public NFError()
    {
    }

    public static Response getErrorResponse(long l)
    {
        Response response = new Response();
        if (l == 0xf000000cL)
        {
            response.labelId = 0x7f0c00a6;
            return response;
        }
        if (l == 0xf0000017L)
        {
            response.labelId = 0x7f0c00b1;
            return response;
        }
        if (l == 0xf0000018L)
        {
            response.labelId = 0x7f0c00b2;
            return response;
        }
        if (l == 0xf0000001L)
        {
            response.labelId = 0x7f0c009b;
            return response;
        }
        if (l == 0xf0000005L)
        {
            response.labelId = 0x7f0c009f;
            return response;
        }
        if (l == 0xf0000000L)
        {
            response.labelId = 0x7f0c009a;
            return response;
        }
        if (l == 0xf0010000L)
        {
            response.labelId = 0x7f0c009a;
            return response;
        }
        if (l == 0xf0020000L)
        {
            response.labelId = 0x7f0c00e1;
            return response;
        }
        if (l == 0L)
        {
            response.labelId = 0x7f0c0098;
            response.action = 2;
            return response;
        }
        if (l == 0xf0000019L)
        {
            response.labelId = 0x7f0c00b3;
            return response;
        }
        if (l == 0xf000002bL)
        {
            response.labelId = 0x7f0c00c5;
            return response;
        }
        if (l == 0xf000002cL)
        {
            response.labelId = 0x7f0c00c6;
            return response;
        }
        if (l == 0xf0000007L)
        {
            response.labelId = 0x7f0c00a1;
            return response;
        }
        if (l == 0xf000002aL)
        {
            response.labelId = 0x7f0c00c4;
            return response;
        }
        if (l == 0xf000001cL)
        {
            response.labelId = 0x7f0c00b6;
            return response;
        }
        if (l == 0xf0000024L)
        {
            response.labelId = 0x7f0c00be;
            return response;
        }
        if (l == 0xf0000010L)
        {
            response.labelId = 0x7f0c00aa;
            return response;
        }
        if (l == 0xf0000011L)
        {
            response.labelId = 0x7f0c00ab;
            return response;
        }
        if (l == 0xf0000016L)
        {
            response.labelId = 0x7f0c00b0;
            return response;
        }
        if (l == 0xf0000006L)
        {
            response.labelId = 0x7f0c00a0;
            return response;
        }
        if (l == 0xf000002dL)
        {
            response.labelId = 0x7f0c00c7;
            return response;
        }
        if (l == 0xf000000dL)
        {
            response.labelId = 0x7f0c00a7;
            return response;
        }
        if (l == 0xf0000009L)
        {
            response.labelId = 0x7f0c00a3;
            return response;
        }
        if (l == 0xf0000026L)
        {
            response.labelId = 0x7f0c00c0;
            return response;
        }
        if (l == 0xf000001dL)
        {
            response.labelId = 0x7f0c00b7;
            return response;
        }
        if (l == 0xf0000012L)
        {
            response.labelId = 0x7f0c00ac;
            return response;
        }
        if (l == 0xf000001eL)
        {
            response.labelId = 0x7f0c00b8;
            return response;
        }
        if (l == 0xf0010006L)
        {
            response.labelId = 0x7f0c00d4;
            return response;
        }
        if (l == 0xf0010007L)
        {
            response.labelId = 0x7f0c00d5;
            return response;
        }
        if (l == 0xf0010001L)
        {
            response.labelId = 0x7f0c00cf;
            return response;
        }
        if (l == 0xf0010002L)
        {
            response.labelId = 0x7f0c00d0;
            return response;
        }
        if (l == 0xf001000bL)
        {
            response.labelId = 0x7f0c00d9;
            return response;
        }
        if (l == 0xf001000eL)
        {
            response.labelId = 0x7f0c00dc;
            return response;
        }
        if (l == 0xf001000aL)
        {
            response.labelId = 0x7f0c00d8;
            return response;
        }
        if (l == 0xf0010009L)
        {
            response.labelId = 0x7f0c00d7;
            return response;
        }
        if (l == 0xf001000dL)
        {
            response.labelId = 0x7f0c00db;
            return response;
        }
        if (l == 0xf001000cL)
        {
            response.labelId = 0x7f0c00da;
            return response;
        }
        if (l == 0xf0010003L)
        {
            response.labelId = 0x7f0c00d1;
            return response;
        }
        if (l == 0xf0030001L)
        {
            response.labelId = 0x7f0c00ef;
            return response;
        }
        if (l == 0xf0030002L)
        {
            response.labelId = 0x7f0c00f0;
            return response;
        }
        if (l == 0xf0030003L)
        {
            response.labelId = 0x7f0c00f1;
            return response;
        }
        if (l == 0xf0030003L)
        {
            response.labelId = 0x7f0c00f2;
            return response;
        }
        if (l == 0xf0020005L)
        {
            response.labelId = 0x7f0c00e6;
            return response;
        }
        if (l == 0xf002000aL)
        {
            response.labelId = 0x7f0c00eb;
            return response;
        }
        if (l == 0xf002000bL)
        {
            response.labelId = 0x7f0c00ec;
            return response;
        }
        if (l == 0xf002000cL)
        {
            response.labelId = 0x7f0c00ed;
            return response;
        }
        if (l == 0xf0020003L)
        {
            response.labelId = 0x7f0c00e4;
            return response;
        }
        if (l == 0xf002000dL)
        {
            response.labelId = 0x7f0c00ee;
            return response;
        }
        if (l == 0xf0020008L)
        {
            response.labelId = 0x7f0c00e9;
            return response;
        }
        if (l == 0xf0020007L)
        {
            response.labelId = 0x7f0c00e8;
            return response;
        }
        if (l == 0xf0020006L)
        {
            response.labelId = 0x7f0c00e7;
            return response;
        }
        if (l == 0xf0020001L)
        {
            response.labelId = 0x7f0c00e2;
            return response;
        }
        if (l == 0xf0020002L)
        {
            response.labelId = 0x7f0c00e3;
            return response;
        }
        if (l == 0xf0020004L)
        {
            response.labelId = 0x7f0c00e5;
            return response;
        }
        if (l == 0xf0020009L)
        {
            response.labelId = 0x7f0c00ea;
            return response;
        }
        if (l == 0xf0010005L)
        {
            response.labelId = 0x7f0c00d3;
            return response;
        }
        if (l == 0xf0010008L)
        {
            response.labelId = 0x7f0c00d6;
            return response;
        }
        if (l == 0xf0010004L)
        {
            response.labelId = 0x7f0c00d2;
            return response;
        }
        if (l == 0xf001000fL)
        {
            response.labelId = 0x7f0c00dd;
            response.action = 1;
            return response;
        }
        if (l == 0xf0010010L)
        {
            response.labelId = 0x7f0c00de;
            response.action = 1;
            return response;
        }
        if (l == 0xf0000014L)
        {
            response.labelId = 0x7f0c00ae;
            return response;
        }
        if (l == 0xf0000013L)
        {
            response.labelId = 0x7f0c00ad;
            return response;
        }
        if (l == 0xf0000020L)
        {
            response.labelId = 0x7f0c00ba;
            return response;
        }
        if (l == 0xf0000029L)
        {
            response.labelId = 0x7f0c00c3;
            return response;
        }
        if (l == 0xf000001bL)
        {
            response.labelId = 0x7f0c00b5;
            return response;
        }
        if (l == 0xf0000002L)
        {
            response.labelId = 0x7f0c009c;
            return response;
        }
        if (l == 0xf0000015L)
        {
            response.labelId = 0x7f0c00af;
            return response;
        }
        if (l == 0xf0000028L)
        {
            response.labelId = 0x7f0c00c2;
            return response;
        }
        if (l == 0xf0000022L)
        {
            response.labelId = 0x7f0c00bc;
            return response;
        }
        if (l == 0xf0000004L)
        {
            response.labelId = 0x7f0c009e;
            return response;
        }
        if (l == 0xf0000003L)
        {
            response.labelId = 0x7f0c009d;
            return response;
        }
        if (l == 0xf0000034L)
        {
            response.labelId = 0x7f0c00ce;
            return response;
        }
        if (l == 1L)
        {
            response.labelId = 0x7f0c0099;
            response.action = 2;
            return response;
        }
        if (l == 0xf000001aL)
        {
            response.labelId = 0x7f0c00b4;
            return response;
        }
        if (l == 0xf0000025L)
        {
            response.labelId = 0x7f0c00bf;
            return response;
        }
        if (l == 0xf000001fL)
        {
            response.labelId = 0x7f0c00b9;
            return response;
        }
        if (l == 0xf0000023L)
        {
            response.labelId = 0x7f0c00bd;
            return response;
        }
        if (l == 0xf0000027L)
        {
            response.labelId = 0x7f0c00c1;
            return response;
        }
        if (l == 0xf0000030L)
        {
            response.labelId = 0x7f0c00ca;
            return response;
        }
        if (l == 0xf000002eL)
        {
            response.labelId = 0x7f0c00c8;
            return response;
        }
        if (l == 0xf0000031L)
        {
            response.labelId = 0x7f0c00cb;
            return response;
        }
        if (l == 0xf0000032L)
        {
            response.labelId = 0x7f0c00cc;
            return response;
        }
        if (l == 0xf000002fL)
        {
            response.labelId = 0x7f0c00c9;
            return response;
        }
        if (l == 0xf0000021L)
        {
            response.labelId = 0x7f0c00bb;
            return response;
        }
        if (l == 0xf000000bL)
        {
            response.labelId = 0x7f0c00a5;
            return response;
        }
        if (l == 0xf000000aL)
        {
            response.labelId = 0x7f0c00a4;
            return response;
        }
        if (l == 0xf000000eL)
        {
            response.labelId = 0x7f0c00a8;
            return response;
        }
        if (l == 0xf0000033L)
        {
            response.labelId = 0x7f0c00cd;
            return response;
        }
        if (l == 0xf0000008L)
        {
            response.labelId = 0x7f0c00a2;
            return response;
        }
        if (l == 0xf000000fL)
        {
            response.labelId = 0x7f0c00a9;
            return response;
        } else
        {
            return null;
        }
    }

    public static String getLabel(long l)
    {
        for (int i = 0; i < NFERRS.length; i++)
        {
            if (l == NFERRS[i])
            {
                return NFERRS_labels[i];
            }
        }

        return null;
    }

    public static boolean isGenericError(int i)
    {
        return ((long)i & 0xffff0000L) == 0xf0000000L;
    }

    public static boolean isKnown(long l)
    {
        for (int i = 0; i < NFERRS.length; i++)
        {
            if (l == NFERRS[i])
            {
                return true;
            }
        }

        return false;
    }

    public static boolean isMediaControlError(int i)
    {
        return ((long)i & 0xffff0000L) == 0xf0010000L;
    }

    public static boolean isNccpError(int i)
    {
        return ((long)i & 0xffff0000L) == 0xf0020000L;
    }

    public static boolean isSuccessful(long l)
    {
        return (0xffff0000L & l) == 0L;
    }

}
