// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.skype.Account;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.Message;
import com.skype.MessageAnnotation;
import com.skype.SkyLib;
import com.skype.Sms;
import com.skype.SmsImpl;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.concurrent.CompletableFuture;
import com.skype.android.concurrent.CompletedAsyncResult;
import com.skype.android.push.ChatPushMessage;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.SpanUtil;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.msnp.MsnpMessage;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util.cache:
//            SpannedStringCache

public class FormattedMessageCache
{
    private static final class a extends SpannedStringCache.a
    {

        int a;

        a(long l, CharSequence charsequence, int i1)
        {
            super(l, charsequence);
            a = i1;
        }
    }


    private AsyncService a;
    private SpannedStringCache b;
    private ChatText c;
    private Context d;
    private Provider e;
    private SkyLib f;
    private TimeUtil g;
    private TimeAnomalyTelemetry h;
    private ObjectIdMap i;
    private ContactUtil j;
    private SpanUtil k;

    public FormattedMessageCache(Application application, AsyncService asyncservice, SpannedStringCache spannedstringcache, ChatText chattext, Provider provider, SkyLib skylib, TimeUtil timeutil, 
            ObjectIdMap objectidmap, ContactUtil contactutil, SpanUtil spanutil)
    {
        d = application;
        a = asyncservice;
        b = spannedstringcache;
        c = chattext;
        e = provider;
        f = skylib;
        j = contactutil;
        g = timeutil;
        i = objectidmap;
        k = spanutil;
    }

    private transient CharSequence a(int l, int i1, String as[])
    {
        String s = String.format(d.getString(l), (Object[])as);
        as = s;
        if (i1 > 0)
        {
            as = s.replace("<contact>", String.format("%1$s%2$s", new Object[] {
                "<b>", String.format("<font color=\"%1$s\">", new Object[] {
                    d.getResources().getString(i1)
                })
            })).replace("</contact>", "</font></b>");
        }
        return c.a(as, Integer.valueOf(0));
    }

    private CharSequence a(Message message, int l, int i1)
    {
        com.skype.Message.TYPE type;
        int k1;
        k1 = 0x7f08036a;
        type = message.getTypeProp();
        if (type != null) goto _L2; else goto _L1
_L1:
        Object obj = " ";
_L22:
        b.a(message.getObjectID(), new a(l, ((CharSequence) (obj)), i1));
        return ((CharSequence) (obj));
_L2:
        obj = null;
        static final class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.skype.SkyLib.LEAVE_REASON.values().length];
                try
                {
                    b[com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[com.skype.SkyLib.LEAVE_REASON.LIVE_MANUAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[com.skype.SkyLib.LEAVE_REASON.LEAVE_REASON_NONE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[com.skype.SkyLib.LEAVE_REASON.LIVE_BUSY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[com.skype.SkyLib.LEAVE_REASON.LIVE_PSTN_BLOCKED_REGULATORY_INDIA.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                a = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    a[com.skype.Message.TYPE.SPAWNED_CONFERENCE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[com.skype.Message.TYPE.RETIRED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[com.skype.Message.TYPE.RETIRED_OTHERS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.skype.Message.TYPE.ADDED_CONSUMERS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.skype.Message.TYPE.POSTED_EMOTE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.skype.Message.TYPE.SET_METADATA.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.skype.Message.TYPE.ADDED_LEGACY_CONSUMERS.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.skype.Message.TYPE.STARTED_LIVESESSION.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.skype.Message.TYPE.ENDED_LIVESESSION.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.skype.Message.TYPE.HAS_BIRTHDAY.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.skype.Message.TYPE.GRANTED_AUTH.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.skype.Message.TYPE.POSTED_VOICE_MESSAGE.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.skype.Message.TYPE.POSTED_CONTACTS.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.skype.Message.TYPE.POSTED_SMS.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[type.ordinal()];
        JVM INSTR tableswitch 1 14: default 132
    //                   1 655
    //                   2 429
    //                   3 453
    //                   4 281
    //                   5 150
    //                   6 183
    //                   7 399
    //                   8 581
    //                   9 641
    //                   10 848
    //                   11 873
    //                   12 898
    //                   13 913
    //                   14 940;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L3:
        Object obj1;
        Object obj2;
        int j1;
        boolean flag;
        if (e(message))
        {
            obj = j(message);
        } else
        {
            obj = c.a(message.getBodyXmlProp(), Integer.valueOf(0));
        }
        continue; /* Loop/switch isn't completed */
_L8:
        obj = a(0x7f0803bd, i1, new String[] {
            h(message), message.getBodyXmlProp()
        });
        continue; /* Loop/switch isn't completed */
_L9:
        j1 = message.getParamKeyProp();
        if (j1 == com.skype.Message.SET_METADATA_KEY.SET_META_TOPIC.toInt() || j1 == com.skype.Message.SET_METADATA_KEY.SET_META_NAME.toInt())
        {
            obj = a(0x7f0803dc, i1, new String[] {
                h(message), message.getBodyXmlProp()
            });
        } else
        if (j1 == com.skype.Message.SET_METADATA_KEY.SET_META_PICTURE.toInt())
        {
            obj = a(0x7f0803dd, i1, new String[] {
                h(message)
            });
        }
        continue; /* Loop/switch isn't completed */
_L7:
        obj = i(message);
        obj1 = h(message);
        if (((String) (obj1)).equals(obj))
        {
            obj = a(0x7f080424, i1, new String[] {
                obj1
            });
            continue; /* Loop/switch isn't completed */
        }
        if (ContactUtil.e(((String) (obj1)))) goto _L19; else goto _L18
_L18:
        j.getClass();
        if (!((String) (obj1)).contains("(Guest)")) goto _L20; else goto _L19
_L19:
        obj = a(0x7f080424, i1, new String[] {
            obj
        });
        continue; /* Loop/switch isn't completed */
_L20:
        obj = a(0x7f0803aa, i1, new String[] {
            obj1, obj
        });
        continue; /* Loop/switch isn't completed */
_L10:
        obj = i(message);
        obj = c.a(0x7f080406, new Object[] {
            obj
        });
        continue; /* Loop/switch isn't completed */
_L5:
        obj = a(0x7f0803ae, i1, new String[] {
            h(message)
        });
        continue; /* Loop/switch isn't completed */
_L6:
        obj = i(message);
        obj1 = h(message);
        j1 = f.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.CONVERSATION, message.getConvoIdProp());
        if (((String) (obj1)).equals(((Conversation)i.a(j1, com/skype/Conversation)).getIdentityProp()))
        {
            j.getClass();
            if (((String) (obj)).contains("(Guest)"))
            {
                obj = a(0x7f0803de, i1, new String[] {
                    obj
                });
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = a(0x7f0803b0, i1, new String[] {
            obj1, obj
        });
        continue; /* Loop/switch isn't completed */
_L11:
        obj = message.getLeaveReasonProp();
        flag = g(message);
        j1 = k1;
        if (((com.skype.SkyLib.LEAVE_REASON) (obj)).equals(com.skype.SkyLib.LEAVE_REASON.LIVE_NO_ANSWER))
        {
            if (flag)
            {
                j1 = k1;
            } else
            {
                j1 = 0x7f08037f;
            }
        }
        obj = d.getString(j1);
        continue; /* Loop/switch isn't completed */
_L12:
        obj = d.getString(0x7f08036f);
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = (Account)e.get();
        obj2 = new ConversationImpl();
        if (!f.getConversationByIdentity(message.getConvoGuidProp(), ((Conversation) (obj2)), true))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (new StringBuilder("skype:?chat&amp;blob=")).append(((Conversation) (obj2)).getJoinBlob()).toString();
        if (message.getAuthorProp().equals(((Account) (obj1)).getSkypenameProp()))
        {
            obj1 = a(0x7f080459, i1, new String[] {
                obj
            });
        } else
        {
            obj1 = a(0x7f0803ac, i1, new String[] {
                h(message), obj
            });
        }
        obj2 = ((Conversation) (obj2)).getMyStatusProp();
        if (obj2 != com.skype.Conversation.MY_STATUS.RETIRED_VOLUNTARILY)
        {
            obj = obj1;
            if (obj2 != com.skype.Conversation.MY_STATUS.RETIRED_FORCEFULLY)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = obj1;
        if (obj1 instanceof Spannable)
        {
            SpanUtil.b((Spannable)obj1);
            obj = obj1;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        obj = a(0x7f080368, i1, new String[] {
            h(message)
        });
        continue; /* Loop/switch isn't completed */
_L14:
        obj = a(0x7f0803b2, i1, new String[] {
            h(message)
        });
        continue; /* Loop/switch isn't completed */
_L15:
        obj = d.getString(0x7f080454);
        continue; /* Loop/switch isn't completed */
_L16:
        obj = d.getString(0x7f0803af, new Object[] {
            h(message)
        });
        continue; /* Loop/switch isn't completed */
_L17:
        obj = new SmsImpl();
        if (message.getSMS(((Sms) (obj))))
        {
            obj = ((Sms) (obj)).getBodyProp();
        } else
        {
            obj = message.getBodyXmlProp();
        }
        obj = c.a(((String) (obj)));
        if (true) goto _L22; else goto _L21
_L21:
    }

    static CharSequence a(FormattedMessageCache formattedmessagecache, Message message, int l)
    {
        return formattedmessagecache.a(message, l, -1);
    }

    private static CharSequence a(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return charsequence;
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        ForegroundColorSpan aforegroundcolorspan[] = (ForegroundColorSpan[])spannablestringbuilder.getSpans(0, charsequence.length(), android/text/style/ForegroundColorSpan);
        int j1 = aforegroundcolorspan.length;
        for (int l = 0; l < j1; l++)
        {
            spannablestringbuilder.removeSpan(aforegroundcolorspan[l]);
        }

        charsequence = (StyleSpan[])spannablestringbuilder.getSpans(0, charsequence.length(), android/text/style/StyleSpan);
        j1 = charsequence.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            StyleSpan stylespan = charsequence[i1];
            if (stylespan.getStyle() == 1)
            {
                spannablestringbuilder.removeSpan(stylespan);
            }
        }

        return spannablestringbuilder;
    }

    private CharSequence a(boolean flag)
    {
        if (flag)
        {
            return d.getString(0x7f080380);
        } else
        {
            return d.getString(0x7f08037d);
        }
    }

    public static String a(String s, String s1)
    {
        return (new StringBuilder("original.")).append(s).append(".").append(s1).toString();
    }

    private static boolean a(com.skype.Message.GetAnnotations_Result getannotations_result, int l)
    {
        return getannotations_result.m_annotationObjectIDList != null && getannotations_result.m_annotationObjectIDList.length > 0 && l >= 0 && l < getannotations_result.m_annotationObjectIDList.length;
    }

    private static boolean a(Message message, a a1, int l, int i1)
    {
        if (a1 != null && a1.b == (long)l && a1.a >= i1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        a1 = message.getTypeProp();
        switch (_cls2.a[a1.ordinal()])
        {
        default:
            return false;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return ContactUtil.e(message.getIdentitiesProp());

        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean f(Message message)
    {
        return a(message.getAnnotations(com.skype.MessageAnnotation.TYPE.TRANSLATION), k(message));
    }

    private String h(Message message)
    {
        String s1 = message.getAuthorDisplaynameProp();
        if (TextUtils.isEmpty(s1) || !ContactUtil.e(message.getIdentitiesProp()) || ContactUtil.e(s1)) goto _L2; else goto _L1
_L1:
        String s = j.a(s1, com.skype.Contact.TYPE.SKYPE);
_L4:
        return TextUtils.htmlEncode(s).replaceAll("'", "&apos;");
_L2:
        if (!TextUtils.isEmpty(s1))
        {
            s = s1;
            if (!ContactUtil.e(s1))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        ContactImpl contactimpl = new ContactImpl();
        s = s1;
        if (f.getContact(message.getAuthorProp(), contactimpl))
        {
            s = j.l(contactimpl);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private String i(Message message)
    {
        int j1 = 0;
        String s = "";
        String as1[] = message.getIdentitiesProp().split(" ");
        message = s;
        if (as1.length > 0)
        {
            String as[] = new String[as1.length];
            for (int l = 0; l < as1.length; l++)
            {
                message = new ContactImpl();
                if (f.getContact(as1[l], message))
                {
                    as[l] = j.l(message);
                }
            }

            StringBuilder stringbuilder = new StringBuilder();
            int k1 = as.length;
            int i1 = 0;
            while (j1 < k1) 
            {
                String s1 = as[j1];
                if (stringbuilder.length() > 0)
                {
                    if (i1 == k1 - 1)
                    {
                        message = d.getString(0x7f0802a4);
                    } else
                    {
                        message = ", ";
                    }
                    stringbuilder.append(message);
                }
                stringbuilder.append(s1);
                j1++;
                i1++;
            }
            message = stringbuilder.toString();
        }
        return message;
    }

    private CharSequence j(Message message)
    {
label0:
        {
            String s = "";
            com.skype.Message.GetAnnotations_Result getannotations_result = message.getAnnotations(com.skype.MessageAnnotation.TYPE.TRANSLATION);
            int l = k(message);
            message = s;
            if (a(getannotations_result, l))
            {
                message = ((MessageAnnotation)i.a(getannotations_result.m_annotationObjectIDList[l], com/skype/MessageAnnotation)).getValueProp();
                com.skype.SkyLib.ContentEncodeCloud_Result contentencodecloud_result = f.contentEncodeCloud(message, true);
                if (!contentencodecloud_result.m_return)
                {
                    break label0;
                }
                message = c.a(contentencodecloud_result.m_result, Integer.valueOf(0));
            }
            return message;
        }
        return c.a(message, Integer.valueOf(0));
    }

    private static int k(Message message)
    {
        int i1;
        byte byte0;
        byte0 = -1;
        message = message.countAnnotations(com.skype.MessageAnnotation.TYPE.TRANSLATION);
        i1 = byte0;
        if (((com.skype.Message.CountAnnotations_Result) (message)).m_keys == null) goto _L2; else goto _L1
_L1:
        int l = 0;
_L7:
        i1 = byte0;
        if (l >= ((com.skype.Message.CountAnnotations_Result) (message)).m_keys.length) goto _L2; else goto _L3
_L3:
        if (!((com.skype.Message.CountAnnotations_Result) (message)).m_keys[l].startsWith("original")) goto _L5; else goto _L4
_L4:
        i1 = l;
_L2:
        return i1;
_L5:
        l++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final CharSequence a(Conversation conversation)
    {
        SpannedStringCache.a a1 = b.a(conversation.getObjectID());
        long l = conversation.getMetaTopicProp().hashCode() & 0x7fffffff;
        if (a1 != null && a1.b == l)
        {
            return a1.c;
        } else
        {
            CharSequence charsequence = c.a(conversation.getMetaTopicProp());
            b.a(conversation.getObjectID(), l, charsequence);
            return charsequence;
        }
    }

    public final CharSequence a(Message message)
    {
        return a(message, -1);
    }

    public final CharSequence a(Message message, int l)
    {
        a a1 = (a)b.a(message.getObjectID());
        int i1;
        if (message.getEditTimestampProp() > 0)
        {
            i1 = message.getEditTimestampProp();
        } else
        {
            i1 = message.getTimestampProp();
        }
        if (!a(message, a1, i1, l))
        {
            if (a1.a > l)
            {
                return a(a1.c);
            } else
            {
                return a1.c;
            }
        } else
        {
            return a(message, i1, l);
        }
    }

    public final CharSequence a(Message message, boolean flag)
    {
        int l = message.getParamValueProp();
        if (l > 0)
        {
            CharSequence charsequence;
            try
            {
                charsequence = g.b(l, flag);
            }
            catch (TimeAnomalyException timeanomalyexception)
            {
                h.a(timeanomalyexception, message.getTypeProp(), "FormattedMessageCache#getCallDurationString");
                return d.getString(0x7f0801b8);
            }
            return charsequence;
        }
        flag = g(message);
        l = f.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.CONVERSATION, message.getConvoIdProp());
        if (l == 0)
        {
            return a(flag);
        }
        Conversation conversation = (Conversation)i.a(l, com/skype/Conversation);
        com.skype.SkyLib.LEAVE_REASON leave_reason = message.getLeaveReasonProp();
        if (message.getOtherLiveMessage() == 0 && leave_reason == com.skype.SkyLib.LEAVE_REASON.LEAVE_REASON_NONE && ConversationUtil.t(conversation))
        {
            return a(flag);
        }
        message = leave_reason;
        if (conversation.getTypeProp() != com.skype.Conversation.TYPE.DIALOG)
        {
            message = leave_reason;
            if (leave_reason == com.skype.SkyLib.LEAVE_REASON.LEAVE_REASON_NONE)
            {
                message = com.skype.SkyLib.LEAVE_REASON.LIVE_MANUAL;
            }
        }
        switch (_cls2.b[message.ordinal()])
        {
        default:
            return d.getString(0x7f08036d);

        case 1: // '\001'
            if (flag)
            {
                return d.getString(0x7f08036e);
            } else
            {
                return "";
            }

        case 2: // '\002'
        case 3: // '\003'
            return d.getString(0x7f08036e);

        case 4: // '\004'
            return d.getString(0x7f08036c);

        case 5: // '\005'
            return d.getString(0x7f080379);
        }
    }

    public final CharSequence a(ChatPushMessage chatpushmessage)
    {
        int l = (int)Long.parseLong(chatpushmessage.getMsnpMessage().d());
        SpannedStringCache.a a1 = b.a(l);
        int i1 = (int)chatpushmessage.getReceivedTimestamp();
        if (a1 != null && a1.b == (long)i1)
        {
            return a1.c;
        } else
        {
            chatpushmessage = c.a(chatpushmessage.getMessageBody());
            b.a(l, new a(i1, chatpushmessage, -1));
            return chatpushmessage;
        }
    }

    public final Future a(Message message, Object obj, AsyncCallback asynccallback)
    {
        a a1 = (a)b.a(message.getObjectID());
        int l;
        if (message.getEditTimestampProp() > 0)
        {
            l = message.getEditTimestampProp();
        } else
        {
            l = message.getTimestampProp();
        }
        if (!a(message, a1, l, -1))
        {
            CharSequence charsequence = a1.c;
            message = charsequence;
            if (a1.a > 0)
            {
                message = a(charsequence);
            }
            if (asynccallback != null)
            {
                asynccallback.done(new CompletedAsyncResult(message, obj));
            }
            return CompletableFuture.completedFuture(message);
        } else
        {
            return a.a(new Callable(message, l) {

                final Message a;
                final int b;
                final FormattedMessageCache c;

                public final Object call()
                    throws Exception
                {
                    return FormattedMessageCache.a(c, a, b);
                }

            
            {
                c = FormattedMessageCache.this;
                a = message;
                b = l;
                super();
            }
            }, obj, asynccallback);
        }
    }

    public final CharSequence b(Message message)
    {
        return j(message);
    }

    public final String c(Message message)
    {
        String s = "";
        com.skype.Message.GetAnnotations_Result getannotations_result = message.getAnnotations(com.skype.MessageAnnotation.TYPE.TRANSLATION);
        int l = k(message);
        message = s;
        if (a(getannotations_result, l))
        {
            message = ((MessageAnnotation)i.a(getannotations_result.m_annotationObjectIDList[l], com/skype/MessageAnnotation)).getValueProp();
        }
        return message;
    }

    public final CharSequence d(Message message)
    {
        return c.a(message.getBodyXmlProp(), Integer.valueOf(0));
    }

    public final boolean e(Message message)
    {
        return g(message) && f(message);
    }

    public final boolean g(Message message)
    {
        return message.getAuthorProp().equalsIgnoreCase(((Account)e.get()).getSkypenameProp());
    }
}
