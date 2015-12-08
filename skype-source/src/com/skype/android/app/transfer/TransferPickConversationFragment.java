// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.chat.ChatActivity;
import com.skype.android.app.contacts.ConversationAdapter;
import com.skype.android.app.contacts.ConversationLoader;
import com.skype.android.app.contacts.PickerFragment;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ObjectInterfaceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferUtil, TransferType, TransferPhotoPickConversationFragment

public class TransferPickConversationFragment extends PickerFragment
{

    ConversationAdapter adapter;
    Analytics analytics;
    AsyncService async;
    ConversationUtil conversationUtil;
    EcsConfiguration ecsConfiguration;
    LayoutExperience layoutExperience;
    SkyLib lib;
    ObjectIdMap map;
    MediaDocumentUploadUtil mediaDocumentUploadUtil;
    Navigation navigation;
    TransferUtil transferUtil;
    UserPreferences userPrefs;

    public TransferPickConversationFragment()
    {
    }

    public static Class getFragmentClassForIntent(Intent intent)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$app$transfer$TransferType[];

            static 
            {
                $SwitchMap$com$skype$android$app$transfer$TransferType = new int[TransferType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$transfer$TransferType[TransferType.IMAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.app.transfer.TransferType[TransferUtil.queryFileType(intent.getType(), null).ordinal()])
        {
        default:
            return com/skype/android/app/transfer/TransferPickConversationFragment;

        case 1: // '\001'
            return com/skype/android/app/transfer/TransferPhotoPickConversationFragment;
        }
    }

    protected Callable getLoader()
    {
        return new ConversationLoader(lib, userPrefs, ecsConfiguration.isAsyncFileSharingEnabled());
    }

    protected int getObjectId(ObjectInterfaceItem objectinterfaceitem)
    {
        return ((Recent)objectinterfaceitem).getConversationObjectId();
    }

    protected Class getObjectInterfaceType()
    {
        return com/skype/Conversation;
    }

    protected int getTitleId()
    {
        Bundle bundle = getArguments();
        if (bundle == null)
        {
            return 0;
        } else
        {
            return bundle.getInt("CUSTOM_TITLE", 0);
        }
    }

    protected List getValidConversations(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Recent recent = (Recent)list.next();
            Object obj = (Conversation)map.a(recent.getConversationObjectId(), com/skype/Conversation);
            if (((Conversation) (obj)).getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
            {
                obj = conversationUtil.r(((Conversation) (obj)));
                if (!ContactUtil.g(((Contact) (obj))) && !ContactUtil.h(((Contact) (obj))) && ((Contact) (obj)).getGivenAuthlevelProp() == com.skype.Contact.AUTHLEVEL.AUTHORIZED_BY_ME && ((Contact) (obj)).getIntProperty(PROPKEY.USER_ISAUTHORIZED) > 0)
                {
                    arraylist.add(recent);
                }
            } else
            {
                arraylist.add(recent);
            }
        } while (true);
        return arraylist;
    }

    protected boolean isInteractive(Object obj)
    {
        return obj instanceof Recent;
    }

    protected void navigateToConversation(List list)
    {
        if (list.size() == 1)
        {
            list = (Conversation)list.get(0);
            list = navigation.intentFor(list, com/skype/android/app/chat/ChatActivity);
            list.addFlags(0x4000000);
        } else
        {
            list = new Intent(getActivity(), com/skype/android/app/main/SplashActivity);
            list.addFlags(0x10000000);
            list.putExtra("com.skype.index", 0);
        }
        startActivity(list);
    }

    public void onConfirm(List list)
    {
        Intent intent = (Intent)getArguments().getParcelable("com.skype.sendIntent");
        if (intent == null) goto _L2; else goto _L1
_L1:
        String s = intent.getAction();
label0:
        do
        {
            ConversationImpl conversationimpl;
label1:
            do
            {
                for (Iterator iterator = list.iterator(); iterator.hasNext();)
                {
                    ObjectInterface objectinterface = (ObjectInterface)iterator.next();
                    conversationimpl = new ConversationImpl();
                    if (lib.getConversation(objectinterface.getObjectID(), conversationimpl))
                    {
                        if (!"android.intent.action.SEND".equals(s))
                        {
                            continue label1;
                        }
                        Uri uri = (Uri)intent.getParcelableExtra("android.intent.extra.STREAM");
                        if (uri != null)
                        {
                            uploadOrSendFile(intent, uri, conversationimpl);
                        } else
                        {
                            String s1 = intent.getStringExtra("android.intent.extra.TEXT");
                            if (s1 != null)
                            {
                                conversationimpl.postText(s1, false);
                            }
                        }
                    }
                }

                break label0;
            } while (!"android.intent.action.SEND_MULTIPLE".equals(s));
            Iterator iterator1 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM").iterator();
            while (iterator1.hasNext()) 
            {
                Uri uri1 = (Uri)iterator1.next();
                if (uri1 != null)
                {
                    uploadOrSendFile(intent, uri1, conversationimpl);
                }
            }
        } while (true);
        navigateToConversation(list);
_L4:
        getActivity().finish();
        return;
_L2:
        Intent intent1 = new Intent();
        int ai[] = new int[list.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((ObjectInterface)list.get(i)).getObjectID();
        }

        intent1.putExtra("com.skype.objIds", ai);
        getActivity().setResult(-1, intent1);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setDataAdapter(adapter);
    }

    public void onDataLoaded(List list)
    {
        list = getValidConversations(list);
        adapter.update(list);
        adapter.setData(list);
        adapter.notifyDataSetChanged();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        adapter.setMultipleChoice(isMultipleChoice());
        getListView().setAdapter(adapter);
    }

    protected void setContentDescriptionForAccessibility(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder)
    {
    }

    protected void uploadOrSendFile(Intent intent, Uri uri, Conversation conversation)
    {
        transferUtil.sendFiles(uri, conversation);
    }
}
