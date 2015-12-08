// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.util.debug.FeatureFlagManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IU
{

    private static final String TAG = "ServerChatConversationUtils";

    public static ChatConversation a(Qi qi, long l)
    {
        Object obj = null;
        if (qi != null) goto _L2; else goto _L1
_L1:
        return ((ChatConversation) (obj));
_L2:
        Object obj1;
        String as[];
        as = qi.a().split("~");
        obj1 = Bt.q();
        if (obj1 == null) goto _L1; else goto _L3
_L3:
        int i;
        int j;
        j = as.length;
        i = 0;
_L6:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj = as[i];
        if (((String) (obj)).equals(obj1)) goto _L5; else goto _L4
_L4:
        obj1 = new ChatConversation(((String) (obj1)), ((String) (obj)));
        By.c().a(((ChatConversation) (obj1)), qi, false, false, l);
        obj = obj1;
        if (!((ChatConversation) (obj1)).mIsUserInConversation)
        {
            Timber.f("ServerChatConversationUtils", "CHAT-LOG: ServerChatConversation sending release message for %s", new Object[] {
                ((ChatConversation) (obj1)).mId
            });
            sw.a().a(((ChatConversation) (obj1)), Sk.a.DELETE);
            return ((ChatConversation) (obj1));
        }
          goto _L1
_L5:
        i++;
          goto _L6
        obj = obj1;
          goto _L4
    }

    public static List a(List list)
    {
        ArrayList arraylist;
        String s;
        Iterator iterator;
        arraylist = new ArrayList(list.size());
        s = Bt.q();
        iterator = list.iterator();
_L16:
        Qo qo;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        qo = (Qo)iterator.next();
        if (!qo.d()) goto _L2; else goto _L1
_L1:
        list = qo.c();
        if (!list.b()) goto _L4; else goto _L3
_L3:
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$soju$android$MessageBody$Type[];

            static 
            {
                $SwitchMap$com$snapchat$soju$android$MessageBody$Type = new int[RP.a.values().length];
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.TEXT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.MEDIA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.STORY_REPLY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.DISCOVER_SHARE_V2.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.STICKER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.SCREENSHOT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.HERE_SCREENSHOT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$MessageBody$Type[RP.a.WELCOME_MESSAGE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.soju.android.MessageBody.Type[list.a().f().ordinal()];
        JVM INSTR tableswitch 1 8: default 128
    //                   1 157
    //                   2 169
    //                   3 181
    //                   4 218
    //                   5 230
    //                   6 242
    //                   7 254
    //                   8 266;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L5:
        list = new BH(list);
_L14:
        list.d(qo.g());
        arraylist.add(list);
        continue; /* Loop/switch isn't completed */
_L6:
        list = new BG(list);
        continue; /* Loop/switch isn't completed */
_L7:
        list = new ChatMedia(list);
        continue; /* Loop/switch isn't completed */
_L8:
        FeatureFlagManager.a();
        if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.REPLY_STORY_TO_CHAT))
        {
            list = new BF(list);
        } else
        {
            list = new BH(list);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        list = new BD(list);
        continue; /* Loop/switch isn't completed */
_L10:
        list = new BE(list);
        continue; /* Loop/switch isn't completed */
_L11:
        list = new BC(list);
        continue; /* Loop/switch isn't completed */
_L12:
        list = new BC(list);
        continue; /* Loop/switch isn't completed */
_L13:
        list = new BK(list);
        continue; /* Loop/switch isn't completed */
_L4:
        list = new BH(list);
        if (true) goto _L14; else goto _L2
_L2:
        if (qo.b())
        {
            arraylist.add(IY.a(qo.a()));
        } else
        if (qo.f())
        {
            list = com.snapchat.android.model.CashTransaction.a.a(qo.e());
            if (!TextUtils.equals(s, ((CashTransaction) (list)).mRecipientUsername) || ((CashTransaction) (list)).mTransactionStatus != com.snapchat.android.model.CashTransaction.TransactionStatus.INITIATED)
            {
                list = new CashFeedItem(list);
                list.mIterToken = qo.g();
                arraylist.add(list);
            }
        }
        if (true) goto _L16; else goto _L15
_L15:
        return arraylist;
    }
}
