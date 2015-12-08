// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.Intent;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONObject;

public interface UserActionLogging
{
    public static final class CommandName extends Enum
    {

        private static final CommandName $VALUES[];
        public static final CommandName rating;

        public static CommandName valueOf(String s)
        {
            return (CommandName)Enum.valueOf(com/netflix/mediaclient/servicemgr/UserActionLogging$CommandName, s);
        }

        public static CommandName[] values()
        {
            return (CommandName[])$VALUES.clone();
        }

        static 
        {
            rating = new CommandName("rating", 0);
            $VALUES = (new CommandName[] {
                rating
            });
        }

        private CommandName(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class PaymentType extends Enum
    {

        private static final PaymentType $VALUES[];
        public static final PaymentType boletto;
        public static final PaymentType creditCard;
        public static final PaymentType directDebit;
        public static final PaymentType ideal;
        public static final PaymentType paypal;

        public static PaymentType valueOf(String s)
        {
            return (PaymentType)Enum.valueOf(com/netflix/mediaclient/servicemgr/UserActionLogging$PaymentType, s);
        }

        public static PaymentType[] values()
        {
            return (PaymentType[])$VALUES.clone();
        }

        static 
        {
            directDebit = new PaymentType("directDebit", 0);
            creditCard = new PaymentType("creditCard", 1);
            ideal = new PaymentType("ideal", 2);
            paypal = new PaymentType("paypal", 3);
            boletto = new PaymentType("boletto", 4);
            $VALUES = (new PaymentType[] {
                directDebit, creditCard, ideal, paypal, boletto
            });
        }

        private PaymentType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Streams extends Enum
    {

        private static final Streams $VALUES[];
        public static final Streams _1;
        public static final Streams _2;
        public static final Streams _3;
        public static final Streams _4;
        private String mValue;

        public static Streams find(String s)
        {
            if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
            Streams streams = null;
_L4:
            return streams;
_L2:
            Streams astreams[] = values();
            int j = astreams.length;
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    Streams streams1 = astreams[i];
                    streams = streams1;
                    if (streams1.getValue().equals(s))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return null;
        }

        public static Streams valueOf(String s)
        {
            return (Streams)Enum.valueOf(com/netflix/mediaclient/servicemgr/UserActionLogging$Streams, s);
        }

        public static Streams[] values()
        {
            return (Streams[])$VALUES.clone();
        }

        public String getValue()
        {
            return mValue;
        }

        static 
        {
            _1 = new Streams("_1", 0, "1");
            _2 = new Streams("_2", 1, "2");
            _3 = new Streams("_3", 2, "3");
            _4 = new Streams("_4", 3, "4");
            $VALUES = (new Streams[] {
                _1, _2, _3, _4
            });
        }

        private Streams(String s, int i, String s1)
        {
            super(s, i);
            mValue = s1;
        }
    }


    public static final String ACTIONS[] = {
        "com.netflix.mediaclient.intent.action.LOG_UIA_SIGNUP_START", "com.netflix.mediaclient.intent.action.LOG_UIA_SIGNUP_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_START", "com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_START", "com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_START", "com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_START", "com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_ENDED", 
        "com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_START", "com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_REGISTER_START", "com.netflix.mediaclient.intent.action.LOG_UIA_REGISTER_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_START", "com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_START", "com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_ENDED", "com.netflix.mediaclient.intent.action.LOG_UIA_SUBMIT_PAYMENT_START", "com.netflix.mediaclient.intent.action.LOG_UIA_SUBMIT_PAYMENT_ENDED", 
        "com.netflix.mediaclient.intent.action.LOG_UIA_UPGRADE_STREAMS_START", "com.netflix.mediaclient.intent.action.LOG_UIA_UPGRADE_STREAMS_ENDED"
    };
    public static final String ADD_TO_PLAYLIST_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_ENDED";
    public static final String ADD_TO_PLAYLIST_START = "com.netflix.mediaclient.intent.action.LOG_UIA_ADD_TO_PLAYLIST_START";
    public static final String EXTRA_CMD = "cmd";
    public static final String EXTRA_ERROR = "error";
    public static final String EXTRA_ERROR_CODE = "error_code";
    public static final String EXTRA_HTTP_RESPONSE = "http_response";
    public static final String EXTRA_ID = "id";
    public static final String EXTRA_PAYMENT_TYPE = "payment_type";
    public static final String EXTRA_RANK = "rank";
    public static final String EXTRA_RATING = "rating";
    public static final String EXTRA_REASON = "reason";
    public static final String EXTRA_STREAMS = "streams";
    public static final String EXTRA_SUCCESS = "sucess";
    public static final String EXTRA_TERM = "term";
    public static final String EXTRA_TITLE_RANK = "title_rank";
    public static final String EXTRA_VIEW = "view";
    public static final String LOGIN_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_ENDED";
    public static final String LOGIN_START = "com.netflix.mediaclient.intent.action.LOG_UIA_LOGIN_START";
    public static final String NAVIGATION_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_ENDED";
    public static final String NAVIGATION_START = "com.netflix.mediaclient.intent.action.LOG_UIA_NAVIGATION_START";
    public static final String RATE_TITLE_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_ENDED";
    public static final String RATE_TITLE_START = "com.netflix.mediaclient.intent.action.LOG_UIA_RATE_TITLE_START";
    public static final String REGISTER_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_REGISTER_ENDED";
    public static final String REGISTER_START = "com.netflix.mediaclient.intent.action.LOG_UIA_REGISTER_START";
    public static final String REMOVE_FROM_PLAYLIST_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_ENDED";
    public static final String REMOVE_FROM_PLAYLIST_START = "com.netflix.mediaclient.intent.action.LOG_UIA_REMOVE_FROM_PLAYLIST_START";
    public static final String SEARCH_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_ENDED";
    public static final String SEARCH_START = "com.netflix.mediaclient.intent.action.LOG_UIA_SEARCH_START";
    public static final String SIGNUP_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_SIGNUP_ENDED";
    public static final String SIGNUP_START = "com.netflix.mediaclient.intent.action.LOG_UIA_SIGNUP_START";
    public static final String START_PLAY_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_ENDED";
    public static final String START_PLAY_START = "com.netflix.mediaclient.intent.action.LOG_UIA_START_PLAY_START";
    public static final String SUBMIT_PAYMENT_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_SUBMIT_PAYMENT_ENDED";
    public static final String SUBMIT_PAYMENT_START = "com.netflix.mediaclient.intent.action.LOG_UIA_SUBMIT_PAYMENT_START";
    public static final String UPGRADE_STREAMS_ENDED = "com.netflix.mediaclient.intent.action.LOG_UIA_UPGRADE_STREAMS_ENDED";
    public static final String UPGRADE_STREAMS_START = "com.netflix.mediaclient.intent.action.LOG_UIA_UPGRADE_STREAMS_START";

    public abstract void endAcknowledgeSignupSession(IClientLogging.CompletionReason completionreason, UIError uierror, IClientLogging.ModalView modalview);

    public abstract void endAddToPlaylistSession(IClientLogging.CompletionReason completionreason, UIError uierror, int i);

    public abstract void endLoginSession(IClientLogging.CompletionReason completionreason, UIError uierror);

    public abstract void endNavigationSession(IClientLogging.ModalView modalview, IClientLogging.CompletionReason completionreason, UIError uierror);

    public abstract void endRateTitleSession(IClientLogging.CompletionReason completionreason, UIError uierror, Integer integer, int i);

    public abstract void endRegisterSession(IClientLogging.CompletionReason completionreason, UIError uierror);

    public abstract void endRemoveFromPlaylistSession(IClientLogging.CompletionReason completionreason, UIError uierror);

    public abstract void endSearchSession(long l, IClientLogging.CompletionReason completionreason, UIError uierror);

    public abstract void endStartPlaySession(IClientLogging.CompletionReason completionreason, UIError uierror, Integer integer);

    public abstract void endSubmitPaymentSession(IClientLogging.CompletionReason completionreason, UIError uierror, boolean flag, PaymentType paymenttype, JSONObject jsonobject);

    public abstract void endUpgradeStreamsSession(IClientLogging.CompletionReason completionreason, UIError uierror, Streams streams);

    public abstract boolean handleIntent(Intent intent, boolean flag);

    public abstract void setDataContext(DataContext datacontext);

    public abstract void startAcknowledgeSignupSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startAddToPlaylistSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startLoginSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startNavigationSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startRateTitleSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startRegisterSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startRemoveFromPlaylistSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startSearchSession(long l, CommandName commandname, IClientLogging.ModalView modalview, String s);

    public abstract void startStartPlaySession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startSubmitPaymentSession(CommandName commandname, IClientLogging.ModalView modalview);

    public abstract void startUpgradeStreamsSession(CommandName commandname, IClientLogging.ModalView modalview, Streams streams);

}
