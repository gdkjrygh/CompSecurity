// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.app.NotificationManager;
import android.bluetooth.BluetoothDevice;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.MessageAnnotation;
import com.skype.MessageAnnotationImpl;
import com.skype.MessageImpl;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.Participant;
import com.skype.SkyLib;
import com.skype.Sms;
import com.skype.SmsImpl;
import com.skype.Transfer;
import com.skype.Translator;
import com.skype.VideoMessage;
import com.skype.Voicemail;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.ExperimentEvent;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.ObjectInterfaceMenuDialog;
import com.skype.android.app.account.CustomizeRingtoneDialog;
import com.skype.android.app.chat.picker.InputMethodOverlay;
import com.skype.android.app.chat.picker.MRUManager;
import com.skype.android.app.contacts.PickerActivity;
import com.skype.android.app.location.LocationUtil;
import com.skype.android.app.main.EditPropertyActivity;
import com.skype.android.app.main.EditPropertyFragment;
import com.skype.android.app.media.MediaDocumentDownloadUtil;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.media.MediaDownloadErrorDialog;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.app.media.MediaSaveErrorDialog;
import com.skype.android.app.media.MojiPlaybackStateHolder;
import com.skype.android.app.media.OnMediaDefaultLinkUpdate;
import com.skype.android.app.media.OnMediaDownloadCriticalError;
import com.skype.android.app.media.OnMediaSaveToGallery;
import com.skype.android.app.media.OnMediaSaveToGalleryErrorEvent;
import com.skype.android.app.media.OnMediaThumbnailLinkStatusChange;
import com.skype.android.app.media.OnMediaUploadProgress;
import com.skype.android.app.media.OnMediaUploadStatusChange;
import com.skype.android.app.media.XmmUtil;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.PathRetriever;
import com.skype.android.app.transfer.TransferPhotoPickConversationFragment;
import com.skype.android.app.transfer.TransferType;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.audio.BluetoothReceiver;
import com.skype.android.audio.WiredHeadsetReceiver;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.FileUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.EmoticonSpan;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.push.PushMessageRepository;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ConversationViewState;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.ImageCache;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.SkypeCredit;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.UpdateScheduler;
import com.skype.android.util.ViewStateManager;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.util.cache.FormattedMessageCache;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import com.skype.android.widget.BadgeDecoratorView;
import com.skype.android.widget.bubbles.BubbleTextView;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.chat:
//            MessageAreaCallback, MessageAdapter, AnnotationUtil, SynthAuthReqMessageHolder, 
//            MessageArea, j, MessageHolderUtil, EmptyViewManager, 
//            RemoveMessageDialog, SmsFailedRetryDialog, SmsFailedNoCreditDialog, CancelTransferDialog, 
//            TransferDetailsDialog, SyntheticTypes, ChatListManager, AsyncMediaViewAdapter, 
//            UrlPreviewTextMessageViewHolder, TextMessageViewHolder, TranslationSpan, MessageLoader, 
//            MediaBar, AddParticipantsAccessibilityFragment, AddParticipantsActivity, OnTranslateMessage, 
//            SkypeMessageHolder, HeartsDialog, ChatViewMonitor, MojiMediaMessageViewAdapter, 
//            TranslatorSettingDialog

public class ChatFragment extends SkypeFragment
    implements android.os.Handler.Callback, com.skype.android.app.ObjectInterfaceMenuDialog.MenuCallback, ChatListManager.ChatListCallback, MediaBar.MediaBarCallback, MessageAreaCallback, com.skype.android.app.chat.picker.ExtensiblePickerDialogFragment.Callback, com.skype.android.app.chat.picker.ExtensiblePickerDialogFragment.SearchCallback, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaSendCallback, com.skype.android.audio.BluetoothReceiver.Listener, com.skype.android.audio.WiredHeadsetReceiver.Listener, AsyncCallback
{
    public static final class MojiForwardSource extends Enum
    {

        private static final MojiForwardSource $VALUES[];
        public static final MojiForwardSource BUTTON;
        public static final MojiForwardSource CONTEXTUAL_MENU;

        public static MojiForwardSource valueOf(String s)
        {
            return (MojiForwardSource)Enum.valueOf(com/skype/android/app/chat/ChatFragment$MojiForwardSource, s);
        }

        public static MojiForwardSource[] values()
        {
            return (MojiForwardSource[])$VALUES.clone();
        }

        static 
        {
            BUTTON = new MojiForwardSource("BUTTON", 0);
            CONTEXTUAL_MENU = new MojiForwardSource("CONTEXTUAL_MENU", 1);
            $VALUES = (new MojiForwardSource[] {
                BUTTON, CONTEXTUAL_MENU
            });
        }

        private MojiForwardSource(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String EXTRA_CHAT_FRAGMENT_CREATED_TIMESTAMP = "createdTimestamp";
    private static final String EXTRA_CONVERSATION_TIMESTAMP = "convoTimestamp";
    private static final String EXTRA_EXPANDED_MESSAGE_POSITION = "expandedPosition";
    public static final String EXTRA_LOAD_UNTIL_TIMESTAMP = "loadUntilTimestamp";
    public static final String EXTRA_MESSAGE_ID_SCROLL_TO = "messageIdScrollTo";
    private static final String EXTRA_MESSAGE_SUBTYPE_ORDINAL = "messageSubTypeOrdinal";
    private static final String EXTRA_PENDING_EXPAND_POSITION = "pendingExpandPosition";
    private static final String EXTRA_PICTURE_URI = "photoUri";
    private static final String EXTRA_PLAYED_MOJIS = "playedMojis";
    private static final String EXTRA_SCROLL_POSITION = "scrollPosition";
    public static final String EXTRA_SEND_TEXT = "sendText";
    public static final String EXTRA_SHOW_TIMESTAMP_IN_MENU_OPTION = "showTimestampInMenuOption";
    public static final String EXTRA_START_IN_SMS = "startInSmsMode";
    public static final String EXTRA_VOICEMAIL_ID_TO_PLAY = "voicemailToPlay";
    private static final int HIDE_HEART_NOTIFICATION_DELAY = 5000;
    private static final String IMAGE_CAPTURE_NAME = "photo_";
    public static final int OPTION_CAN_SEND_FILES = 0;
    public static final int OPTION_CAN_SEND_LOCATION = 6;
    public static final int OPTION_CAN_SEND_MEDIA_MESSAGE = 5;
    public static final int OPTION_CAN_SEND_MOJIS = 8;
    public static final int OPTION_CAN_SEND_SMS = 7;
    public static final int OPTION_CAN_SEND_TAKE_PICTURES = 3;
    public static final int OPTION_CAN_SEND_TAKE_PICTURES_P2P = 4;
    public static final int OPTION_CAN_VIDEO_MESSAGE = 1;
    public static final int OPTION_SMS_TARGETS_AVAILABLE = 2;
    private static final String PHOTO_SHARING_NATIVE_CAMERA_CANCEL = "Native Camera";
    private static final String PHOTO_SHARING_NATIVE_GALLERY_CANCEL = "Native Gallery";
    private static final int REFRESH_DELAY = 1000;
    private static final int REQUEST_ADD_PARTICIPANTS = 4;
    private static final int REQUEST_CHOOSE_AND_SHARE_PICTURE_ASYNC = 2;
    public static final int REQUEST_FORWARD_MOJI = 6;
    private static final int REQUEST_FORWARD_PHOTO = 5;
    private static final int REQUEST_MEDIA_PICKER_CONTENT_SEARCH = 7;
    private static final int REQUEST_PICK_FILES = 0;
    private static final int REQUEST_PICTURE_CROP = 3;
    private static final int REQUEST_TAKE_AND_SHARE_PICTURE = 1;
    private static final int SHOW_HEART_NOTIFICATION_DELAY = 250;
    private static final int TEXT_STATUS_REFRESH_BATCH_TIME = 1000;
    private static final int TEXT_STATUS_TIMEOUT = 10000;
    private static final int WHAT_HIDE_HEART_NOTIFICATION = 10;
    private static final int WHAT_HIDE_KEYBOARD = 7;
    private static final int WHAT_LOAD = 4;
    private static final int WHAT_REFRESH = 2;
    private static final int WHAT_REFRESH_MEDIA_BAR = 8;
    private static final int WHAT_RELOAD = 3;
    private static final int WHAT_SET_TEXT_STATUS_READING = 5;
    private static final int WHAT_SET_TEXT_STATUS_WRITING = 6;
    private static final int WHAT_SHOW_HEART_NOTIFICATION = 9;
    private static final int WHAT_SHOW_KEYBOARD = 1;
    private static Drawable arrowNotificationIcon = null;
    private static Drawable heartNotificationIcon = null;
    private static final Logger log = Logger.getLogger("ChatFragment");
    private static int originalTextKey = 0x80000000;
    AccessibilityUtil accessibility;
    Account account;
    ActionBarCustomizer actionBarCustomizer;
    private MessageAdapter adapter;
    Analytics analytics;
    AnnotationUtil annotationUtil;
    AsyncService async;
    private long chatFragmentCreatedTimestamp;
    private ChatListManager chatListManager;
    ChatText chatText;
    private Contact contact;
    ContactUtil contactUtil;
    private Conversation conversation;
    private int conversationTimestamp;
    ConversationUtil conversationUtil;
    private boolean doNotShowKeyboard;
    EcsConfiguration ecsConfiguration;
    private EmptyViewManager emptyViewManager;
    EventBus eventBus;
    private AsyncCallback fileCallback;
    private Handler handler;
    View heartNotification;
    ImageCache imageCache;
    InputMethodManager ime;
    private InputMethodOverlay inputMethodOverlay;
    LayoutExperience layoutExperience;
    SkyLib lib;
    RecyclerView listView;
    private LocationUtil locationUtil;
    ObjectIdMap map;
    private boolean markedUnread;
    private Participant me;
    MediaBar mediaBar;
    MediaContentRoster mediaContentRoster;
    MediaDocumentDownloadUtil mediaDocumentDownloadUtil;
    private AsyncCallback mediaDocumentUploadCallback;
    MediaDocumentUploadUtil mediaDocumentUploadUtil;
    MessageArea messageArea;
    FormattedMessageCache messageCache;
    MessageHolderUtil messageHolderUtil;
    private MojiForwardSource mojiForwardSource;
    private MojiPlaybackStateHolder mojiPlaybackStateHolder;
    MRUManager mruManager;
    Navigation navigation;
    NavigationUrl navigationUrl;
    NetworkUtil networkUtil;
    NotificationManager notificationManager;
    private int pendingMediaDocumentId;
    PermissionRequest permissionRequest;
    private Uri pictureUri;
    PushMessageRepository pushMessageRepository;
    ViewGroup rootView;
    SkypeCredit skypeCredit;
    private Sms sms;
    private NumberFormat smsPriceFormat;
    ViewStateManager stateManager;
    TimeAnomalyTelemetry timeAnomalyTelemetry;
    TimeUtil timeUtil;
    TransferUtil transferUtil;
    private SparseArray translatedMessagePositions;
    private Map translatedOriginalTexts;
    Translator translator;
    private UpdateScheduler updateScheduler;
    UserPreferences userPreferences;
    private ConversationViewState viewState;
    ViewStub viewStub;
    private boolean visibleOnScreen;

    public ChatFragment()
    {
        conversationTimestamp = -1;
        doNotShowKeyboard = false;
        pendingMediaDocumentId = -1;
        translatedMessagePositions = new SparseArray();
        translatedOriginalTexts = new HashMap();
        fileCallback = new AsyncCallback() {

            final ChatFragment this$0;

            public final void done(AsyncResult asyncresult)
            {
                if (asyncresult.e() && !((Boolean)asyncresult.a()).booleanValue())
                {
                    asyncresult = getString(0x7f080449);
                    Toast.makeText(getContext(), asyncresult, 1).show();
                }
            }

            
            {
                this$0 = ChatFragment.this;
                super();
            }
        };
        mediaDocumentUploadCallback = new AsyncCallback() {

            final ChatFragment this$0;

            public final void done(AsyncResult asyncresult)
            {
label0:
                {
                    Boolean boolean1;
                    boolean flag;
                    boolean flag1;
                    if (!asyncresult.e())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag1 = flag;
                    if (flag)
                    {
                        break label0;
                    }
                    asyncresult = ((Map)asyncresult.a()).values().iterator();
                    do
                    {
                        flag1 = flag;
                        if (!asyncresult.hasNext())
                        {
                            break label0;
                        }
                        boolean1 = (Boolean)asyncresult.next();
                    } while (boolean1.booleanValue());
                    if (!boolean1.booleanValue())
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                }
                if (flag1)
                {
                    asyncresult = getString(0x7f08044a);
                    Toast.makeText(getActivity(), asyncresult, 1).show();
                }
            }

            
            {
                this$0 = ChatFragment.this;
                super();
            }
        };
    }

    private int addHeart(Message message, int i)
    {
        message.addAnnotation(com.skype.MessageAnnotation.TYPE.EMOTICON, "heart", "");
        adapter.notifyItemChanged(i);
        return annotationUtil.getAnnotationCount(message, com.skype.MessageAnnotation.TYPE.EMOTICON, "heart");
    }

    private void addSynthAuthReq()
    {
        adapter.add(new SynthAuthReqMessageHolder(contact, contactUtil));
    }

    private boolean canShowTranslationContextMenu(Message message, Bundle bundle)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (bundle.containsKey("messageSubTypeOrdinal"))
        {
            int i = bundle.getInt("messageSubTypeOrdinal");
            flag = flag1;
            if (ecsConfiguration.isTranslatorEnabled())
            {
                flag = flag1;
                if (!FormattedMessageCache.f(message))
                {
                    flag = flag1;
                    if (i == UrlPreviewTextMessageViewHolder.MessageSubType.SIMPLE_MESSAGE.ordinal())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private boolean canTakePictures()
    {
        boolean flag1 = false;
        FragmentActivity fragmentactivity = getActivity();
        boolean flag = flag1;
        if (fragmentactivity != null)
        {
            flag = flag1;
            if (fragmentactivity.getPackageManager().queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 0x10000).size() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    private void checkMyStatus(boolean flag)
    {
label0:
        {
            if (conversation.getMyStatusProp() == com.skype.Conversation.MY_STATUS.RETIRED_VOLUNTARILY)
            {
                if (!flag)
                {
                    break label0;
                }
                conversation.removeFromInbox();
                conversation.unPin();
                getActivity().finish();
            }
            return;
        }
        updateMessageArea(false);
        removeFocusFromMessageArea();
    }

    private void createOutgoingSms()
    {
        if (sms == null)
        {
            sms = new SmsImpl();
            if (lib.createOutgoingSms(sms))
            {
                map.a(sms);
                map.b(sms);
            }
        }
    }

    private Bitmap decodeReasonablySizedBitmap(String s)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        int l = options.outWidth;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int i1 = Math.min(displaymetrics.widthPixels, displaymetrics.heightPixels);
        int k = 1;
        int i = 1;
        if (l > i1)
        {
            do
            {
                k = i;
                if (l / i <= i1)
                {
                    break;
                }
                i *= 2;
            } while (true);
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = k;
        return BitmapFactory.decodeFile(s, options);
    }

    private void dismissKeyboard()
    {
        removeFocusFromMessageArea();
        inputMethodOverlay.hideWithInputMethod(messageArea.getEditText());
    }

    private void displaySpecialMessage(Spanned spanned)
    {
        updateMessageArea(false);
        EditText edittext = messageArea.getEditText();
        edittext.setMovementMethod(LinkMovementMethod.getInstance());
        edittext.setEnabled(true);
        edittext.setFocusable(false);
        edittext.setClickable(false);
        edittext.setText(spanned);
        edittext.setSingleLine(false);
    }

    private void displayToastForForwardMedia(List list, String s)
    {
        list = String.format(s, new Object[] {
            participantsToString(list)
        });
        Toast.makeText(getActivity(), list, 1).show();
    }

    private void forwardMediaDocument(int i, int k)
    {
        Intent intent = new Intent(getActivity(), com/skype/android/app/contacts/PickerActivity);
        intent.putExtra("fragmentClass", com/skype/android/app/transfer/TransferPhotoPickConversationFragment);
        intent.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.bs);
        intent.putExtra("CHECKBOX_MODE", true);
        intent.putExtra("CUSTOM_TITLE", 0x7f08023e);
        intent.putExtra("HINT_TEXT_ID", 0x7f08017f);
        intent.putExtra("SELECT_CONVERSATION", true);
        pendingMediaDocumentId = i;
        if (k == 5)
        {
            intent.putExtra("CUSTOM_TITLE", 0x7f080142);
        } else
        if (k == 6)
        {
            intent.putExtra("CUSTOM_TITLE", 0x7f080141);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid request type: ")).append(k).toString());
        }
        pendingMediaDocumentId = i;
        startActivityForResult(intent, k);
    }

    private void forwardPendingMedia(Intent intent, String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        if (intent.getExtras() != null && intent.getExtras().containsKey("com.skype.objIds") && pendingMediaDocumentId != -1)
        {
            intent = intent.getExtras().getIntArray("com.skype.objIds");
            int k = intent.length;
            for (int i = 0; i < k; i++)
            {
                int l = intent[i];
                Conversation conversation1 = (Conversation)map.a(l, com/skype/Conversation);
                arraylist.add(conversation1.getDisplaynameProp());
                conversation1.postMediaDocument(pendingMediaDocumentId, s);
            }

            pendingMediaDocumentId = -1;
            displayToastForForwardMedia(arraylist, s1);
        }
    }

    private BitSet getChatCapabilities()
    {
        boolean flag5 = true;
        boolean flag4 = false;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag7 = canTakePictures();
        if (conversation != null)
        {
            flag = ConversationUtil.t(conversation);
            flag4 = conversationUtil.j(conversation);
            BitSet bitset;
            boolean flag6;
            if (conversationUtil.k(conversation) && !flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!ContactUtil.g(contact) && getAvailableSmsTargets().size() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag6 = mediaDocumentUploadUtil.canSendMediaMessage(conversation);
            flag3 = conversationUtil.l(conversation);
            flag2 = flag1;
            flag1 = flag6;
        }
        bitset = new BitSet();
        if (flag4 && !conversationUtil.b(false) && ecsConfiguration.isViMIconVisibleInChatPage())
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        bitset.set(1, flag4);
        bitset.set(6, flag3);
        bitset.set(0, flag);
        if (!flag1 && flag && flag7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bitset.set(4, flag);
        if (flag1 && flag7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bitset.set(3, flag);
        bitset.set(5, flag1);
        bitset.set(7, flag2);
        if (ecsConfiguration.isMojiSupported() && mediaContentRoster.f())
        {
            flag = flag5;
        } else
        {
            flag = false;
        }
        bitset.set(8, flag);
        return bitset;
    }

    private List getChatMessageContextMenuItemIdsVisibility(Message message, Bundle bundle)
    {
        SparseBooleanArray sparsebooleanarray;
        ArrayList arraylist;
        boolean flag;
        boolean flag1;
        sparsebooleanarray = new SparseBooleanArray();
        arraylist = new ArrayList();
        sparsebooleanarray.put(0x7f1005af, false);
        sparsebooleanarray.put(0x7f1005b0, false);
        sparsebooleanarray.put(0x7f1005b2, false);
        sparsebooleanarray.put(0x7f1005b1, false);
        sparsebooleanarray.put(0x7f1005b4, true);
        sparsebooleanarray.put(0x7f1005b5, false);
        sparsebooleanarray.put(0x7f1005b6, false);
        sparsebooleanarray.put(0x7f1005b7, false);
        static final class _cls8
        {

            static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];
            static final int $SwitchMap$com$skype$Message$TYPE[];
            static final int $SwitchMap$com$skype$PROPKEY[];
            static final int $SwitchMap$com$skype$Sms$FAILUREREASON[];
            static final int $SwitchMap$com$skype$Sms$STATUS[];
            static final int $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[];

            static 
            {
                $SwitchMap$com$skype$Sms$STATUS = new int[com.skype.Sms.STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$Sms$STATUS[com.skype.Sms.STATUS.FAILED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    $SwitchMap$com$skype$Sms$STATUS[com.skype.Sms.STATUS.SOME_TARGETS_FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    $SwitchMap$com$skype$Sms$STATUS[com.skype.Sms.STATUS.SENDING_TO_SERVER.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    $SwitchMap$com$skype$Sms$STATUS[com.skype.Sms.STATUS.SENT_TO_SERVER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                $SwitchMap$com$skype$Sms$FAILUREREASON = new int[com.skype.Sms.FAILUREREASON.values().length];
                try
                {
                    $SwitchMap$com$skype$Sms$FAILUREREASON[com.skype.Sms.FAILUREREASON.INSUFFICIENT_FUNDS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.MediaDocument.MEDIA_STATUS.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_TARGET_STATUSES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_STATUS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_PRICE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.SMS_PRICE_PRECISION.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_HOME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_MOBILE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_OFFICE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_MY_STATUS.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_IS_P2P_MIGRATED.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_MEDIA_MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VIDEO_MESSAGE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_AUDIO_MESSAGE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_VOICE_MESSAGE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_LOCATION.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus = new int[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.values().length];
                try
                {
                    $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$audio$WiredHeadsetReceiver$WiredHeadsetStatus[com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.skype.Message.TYPE type;
        com.skype.Message.PERMISSIONS permissions;
        int i;
        if (bundle != null && bundle.getBoolean("showTimestampInMenuOption", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sparsebooleanarray.put(0x7f1005b8, flag);
        sparsebooleanarray.put(0x7f1005b9, false);
        bundle.getBoolean("showTimestampInMenuOption", false);
        if (message == null) goto _L2; else goto _L1
_L1:
        flag1 = message.getAuthorProp().equals(account.getSkypenameProp());
        type = message.getTypeProp();
        permissions = message.getPermissions();
        if (permissions != null && permissions.equals(com.skype.Message.PERMISSIONS.PERM_DELETABLE))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _cls8..SwitchMap.com.skype.Message.TYPE[type.ordinal()];
        JVM INSTR tableswitch 1 7: default 232
    //                   1 332
    //                   2 368
    //                   3 422
    //                   4 422
    //                   5 451
    //                   6 451
    //                   7 462;
           goto _L3 _L4 _L5 _L6 _L6 _L7 _L7 _L8
_L3:
        if (!XmmUtil.isXmmMessageType(type)) goto _L10; else goto _L9
_L9:
        sparsebooleanarray.put(0x7f1005b4, false);
        sparsebooleanarray.put(0x7f1005b5, false);
        sparsebooleanarray.put(0x7f1005b6, false);
        sparsebooleanarray.put(0x7f1005b7, false);
_L2:
        for (i = 0; i < sparsebooleanarray.size(); i++)
        {
            arraylist.add(Pair.create(Integer.valueOf(sparsebooleanarray.keyAt(i)), Boolean.valueOf(sparsebooleanarray.valueAt(i))));
        }

        break; /* Loop/switch isn't completed */
_L4:
        sparsebooleanarray.put(0x7f1005b4, flag);
        sparsebooleanarray.put(0x7f1005b5, shouldAllowMediaDocumentDownload(message));
        sparsebooleanarray.put(0x7f1005b6, shouldAllowMediaDocumentDownload(message));
        continue; /* Loop/switch isn't completed */
_L5:
        if (!TextUtils.isEmpty(XmmUtil.getMetadataAuxiliaryUrl(message)))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        sparsebooleanarray.put(0x7f1005b3, flag1);
        sparsebooleanarray.put(0x7f1005b7, ecsConfiguration.isExpMojiForwardContextMenuEnabled());
        sparsebooleanarray.put(0x7f1005b4, flag);
        continue; /* Loop/switch isn't completed */
_L6:
        sparsebooleanarray.put(0x7f1005b4, false);
        if (ecsConfiguration.isViMSaveToGalleryEnabled())
        {
            sparsebooleanarray.put(0x7f1005b9, true);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        sparsebooleanarray.put(0x7f1005b4, false);
        continue; /* Loop/switch isn't completed */
_L8:
        sparsebooleanarray.put(0x7f1005af, true);
        sparsebooleanarray.put(0x7f1005b0, true);
        sparsebooleanarray.put(0x7f1005b2, false);
        sparsebooleanarray.put(0x7f1005b4, flag);
        continue; /* Loop/switch isn't completed */
_L10:
        sparsebooleanarray.put(0x7f1005af, true);
        sparsebooleanarray.put(0x7f1005b0, true);
        if (flag1)
        {
            if (message.canEdit() && !TextUtils.isEmpty(message.getBodyXmlProp()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sparsebooleanarray.put(0x7f1005b2, flag);
            sparsebooleanarray.put(0x7f1005b4, flag);
        } else
        {
            sparsebooleanarray.put(0x7f1005b2, false);
            sparsebooleanarray.put(0x7f1005b4, flag);
            if (canShowTranslationContextMenu(message, bundle))
            {
                sparsebooleanarray.put(0x7f1005b1, true);
            }
        }
        if (true) goto _L2; else goto _L11
_L11:
        return arraylist;
    }

    private Message getMessageFromAnnotationEvent(com.skype.android.gen.SkyLibListener.OnMessageAnnotation onmessageannotation)
    {
        MessageAnnotationImpl messageannotationimpl = new MessageAnnotationImpl();
        if (lib.getMessageAnnotation(onmessageannotation.getAnnotationObjectID(), messageannotationimpl))
        {
            int i = lib.findObjectByDbID(com.skype.SkyLib.OBJECTTYPE.MESSAGE, messageannotationimpl.getMessageIdProp());
            onmessageannotation = new MessageImpl();
            if (lib.getConversationMessage(i, onmessageannotation))
            {
                return onmessageannotation;
            }
        }
        return null;
    }

    private MojiForwardSource getMojiForwardSource()
    {
        return mojiForwardSource;
    }

    private Long getTimestampLoadUntil()
    {
        Object obj = null;
        Bundle bundle = getActivity().getIntent().getExtras();
        Long long1 = obj;
        if (bundle != null)
        {
            long1 = obj;
            if (bundle.containsKey("loadUntilTimestamp"))
            {
                Long long2 = Long.valueOf(bundle.getLong("loadUntilTimestamp"));
                getActivity().getIntent().removeExtra("loadUntilTimestamp");
                long1 = long2;
                if (timeUtil.i(TimeUtil.f(long2.longValue())))
                {
                    long1 = Long.valueOf(TimeUtil.h(long2.longValue()));
                }
            }
        }
        return long1;
    }

    private void handleChatItemExpansion(int i, boolean flag)
    {
        int k = adapter.getCurrentExpandedPosition();
        j j1 = (j)listView.findViewHolderForPosition(i);
        j j2 = (j)listView.findViewHolderForPosition(k);
        if (ecsConfiguration.isHeartMarkedEnabled() && flag)
        {
            Message message = messageHolderUtil.getMessageObject(adapter.getItem(i));
            if (message != null && message.canAnnotate())
            {
                adapter.handleShowHideLovedByText(j1, j2, i);
            }
        }
        adapter.handleShowHideTimestamp(j1, j2, k, i);
    }

    private void handleIncomingMessageTranslation(Message message, String s, int i)
    {
        com.skype.android.util.ConversationUtil.TranslatorSetting translatorsetting = conversationUtil.C(conversation);
        Object obj = translatorsetting.b;
        String s1 = ((String) (obj));
        if (((String) (obj)).isEmpty())
        {
            s1 = Locale.getDefault().getLanguage();
        }
        reportTranslatorTextEvent(translatorsetting.c, translatorsetting.b, true);
        obj = lib.contentEncodeCloud(s, true);
        boolean flag;
        if (((com.skype.SkyLib.ContentEncodeCloud_Result) (obj)).m_return)
        {
            flag = translator.translateText(message.getObjectID(), conversation.getObjectID(), ((com.skype.SkyLib.ContentEncodeCloud_Result) (obj)).m_result, s1);
        } else
        {
            flag = translator.translateText(message.getObjectID(), conversation.getObjectID(), s, s1);
        }
        if (flag)
        {
            translatedMessagePositions.put(message.getObjectID(), Integer.valueOf(i));
        }
    }

    private void handleMessageAreaFocus(boolean flag)
    {
        boolean flag2 = true;
        boolean flag3 = false;
        View view = getView();
        if (view != null && view.isInTouchMode())
        {
            boolean flag1;
            if (flag && messageArea.isEnabled())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (messageArea.getEditText().getText().length() > 0)
                {
                    setMyTextStatusToWriting();
                } else
                {
                    setMyTextStatusToReading();
                }
            } else
            {
                handler.sendEmptyMessageDelayed(7, 100L);
                setMyTextStatusToReading();
            }
            if (layoutExperience.isMultipane() && adapter.isEmpty() && emptyViewManager.isInflated())
            {
                EmptyViewManager emptyviewmanager;
                byte byte0;
                if (getResources().getConfiguration().orientation != 2)
                {
                    flag2 = false;
                }
                emptyviewmanager = emptyViewManager;
                byte0 = flag3;
                if (flag1)
                {
                    byte0 = flag3;
                    if (flag2)
                    {
                        byte0 = 4;
                    }
                }
                emptyviewmanager.setVisibility(byte0);
            }
        }
    }

    private boolean handleMessageItemSelected(MenuItem menuitem, Message message, Bundle bundle)
    {
        String s;
        int i;
        if (messageCache.e(message))
        {
            s = messageCache.c(message);
        } else
        {
            s = message.getStrPropertyWithXmlStripped(PROPKEY.MESSAGE_BODY_XML, "");
        }
        i = menuitem.getItemId();
        i;
        JVM INSTR tableswitch 2131756463 2131756473: default 88
    //                   2131756463 507
    //                   2131756464 274
    //                   2131756465 533
    //                   2131756466 131
    //                   2131756467 669
    //                   2131756468 553
    //                   2131756469 603
    //                   2131756470 621
    //                   2131756471 643
    //                   2131756472 597
    //                   2131756473 749;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        log.info((new StringBuilder("handleMessageItemSelected unhandled for id: ")).append(i).toString());
        return false;
_L5:
        if (layoutExperience.isMultipane())
        {
            menuitem = SkypeDialogFragment.create(message, com/skype/android/app/main/EditPropertyFragment);
            menuitem.getArguments().putSerializable("com.skype.propkey", PROPKEY.MESSAGE_BODY_XML);
            menuitem.getArguments().putInt("com.skype.objId", message.getObjectID());
            menuitem.getArguments().putInt("conversationId", conversation.getObjectID());
            menuitem.getArguments().putString("com.skype.objClass", com/skype/Message.getName());
            menuitem.show(getActivity().getSupportFragmentManager());
        } else
        {
            menuitem = navigation.intentFor(message, com/skype/android/app/main/EditPropertyActivity);
            menuitem.putExtra("com.skype.propkey", PROPKEY.MESSAGE_BODY_XML);
            menuitem.putExtra("conversationId", conversation.getObjectID());
            startActivity(menuitem);
        }
        return true;
_L3:
        String s1;
        menuitem = new Date((long)message.getTimestampProp() * 1000L);
        s1 = DateFormat.getTimeFormat(getActivity()).format(menuitem);
        menuitem = "";
        bundle = timeUtil.c(lib.getServerTime(), TimeUtil.h(message.getTimestampProp()));
        menuitem = bundle;
_L13:
        bundle = message.getAuthorDisplaynameProp();
        StringBuilder stringbuilder;
        if (messageArea.getEditText().getText().toString().trim().equals(""))
        {
            message = "";
        } else
        {
            message = "\n";
        }
        stringbuilder = new StringBuilder();
        stringbuilder.append(getString(0x7f0804a0, new Object[] {
            message, bundle, menuitem, s1, "\n> "
        }));
        stringbuilder.append(s);
        stringbuilder.append('\n');
        messageArea.getEditText().append(stringbuilder);
        messageArea.toggleImageSpan(false, chatText);
        handler.sendEmptyMessageDelayed(1, 500L);
        return true;
        bundle;
        timeAnomalyTelemetry.a(bundle, message.getTypeProp(), "ChatFragment#handleMessageItemSelected#itemId#chat_context_menu_quote");
          goto _L13
_L2:
        ((ClipboardManager)getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", s));
        return true;
_L4:
        handleIncomingMessageTranslation(message, s, bundle.getInt("pendingExpandPosition"));
        reportTranslatorContextMenuEvent(message);
        return false;
_L7:
        menuitem = new RemoveMessageDialog();
        bundle = new Bundle();
        bundle.putInt("com.skype.objId", message.getObjectID());
        menuitem.setArguments(bundle);
        menuitem.show(getFragmentManager());
        return true;
_L11:
        return handleTimestampMenuItemSelected(bundle);
_L8:
        eventBus.a(new OnMediaSaveToGallery(message));
        return true;
_L9:
        menuitem = XmmUtil.getMediaDocument(message);
        if (menuitem != null)
        {
            forwardMediaDocument(menuitem.getObjectID(), 5);
        }
        return true;
_L10:
        menuitem = XmmUtil.getMediaDocument(message);
        if (menuitem != null)
        {
            forwardMoji(menuitem.getObjectID(), 6, MojiForwardSource.CONTEXTUAL_MENU);
        }
        return true;
_L6:
        message = XmmUtil.getMediaDocument(message);
        navigationUrl.goToUrl(getActivity(), XmmUtil.getMetadataAuxiliaryUrl(message), true);
        bundle = new SkypeTelemetryEvent(LogEvent.N);
        bundle.put(LogAttributeName.E, XmmUtil.getMetadataStringValue(message, "pickerTitle"));
        bundle.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(message));
        bundle.put(LogAttributeName.a, menuitem.getTitle());
        analytics.a(bundle);
        return false;
_L12:
        eventBus.a(new OnMediaSaveToGallery(message));
        return true;
    }

    private void handleMigratedP2PConversation()
    {
        if (conversation.getIsP2pMigratedProp())
        {
            displaySpecialMessage(Html.fromHtml(getString(0x7f080408, new Object[] {
                conversation.getThreadIdFromChatName()
            })));
        }
    }

    private void handleSmsStatus(Sms sms1)
    {
        _cls8..SwitchMap.com.skype.Sms.STATUS[sms1.getStatusProp().ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 45
    //                   2 45
    //                   3 152
    //                   4 152;
           goto _L1 _L2 _L2 _L3 _L3
_L1:
        return;
_L2:
        if (sms1.getFailureReasonProp() != null)
        {
            switch (_cls8..SwitchMap.com.skype.Sms.FAILUREREASON[sms1.getFailureReasonProp().ordinal()])
            {
            default:
                ((SmsFailedRetryDialog)SkypeDialogFragment.create(sms1, com/skype/android/app/chat/SmsFailedRetryDialog)).show(getFragmentManager());
                break;

            case 1: // '\001'
                break; /* Loop/switch isn't completed */
            }
        }
_L5:
        if (sms != null)
        {
            map.b(sms.getObjectID());
            sms = null;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        ((SmsFailedNoCreditDialog)SkypeDialogFragment.create(sms1, com/skype/android/app/chat/SmsFailedNoCreditDialog)).show(getFragmentManager());
          goto _L5
          goto _L1
_L3:
        updateScheduler.a(2);
        return;
    }

    private void handleSmsTargetStatus(Sms sms1)
    {
        if (sms1.getTargetStatus(sms1.getTargetNumbersProp()) == com.skype.Sms.TARGETSTATUS.TARGET_DELIVERY_FAILED)
        {
            ((SmsFailedRetryDialog)SkypeDialogFragment.create(sms1, com/skype/android/app/chat/SmsFailedRetryDialog)).show(getFragmentManager());
        }
    }

    private boolean handleTimestampMenuItemSelected(Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            handleChatItemExpansion(bundle.getInt("pendingExpandPosition", -1), false);
            flag = true;
        }
        return flag;
    }

    private boolean handleTransferMenuItemSelected(MenuItem menuitem, Transfer transfer, Bundle bundle)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756537: 
            transferUtil.openFile(transfer, getActivity());
            return true;

        case 2131756538: 
            menuitem = (CancelTransferDialog)SkypeDialogFragment.create(transfer, com/skype/android/app/chat/CancelTransferDialog);
            menuitem.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final ChatFragment this$0;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    updateScheduler.a(2);
                }

            
            {
                this$0 = ChatFragment.this;
                super();
            }
            });
            menuitem.show(getFragmentManager());
            return true;

        case 2131756539: 
            ((TransferDetailsDialog)SkypeDialogFragment.create(transfer, com/skype/android/app/chat/TransferDetailsDialog)).show(getFragmentManager());
            return true;

        case 2131756472: 
            return handleTimestampMenuItemSelected(bundle);
        }
    }

    private void handleUnknownNumberConversation()
    {
        displaySpecialMessage(Html.fromHtml(getString(0x7f08048a)));
        messageArea.getEditText().setTextColor(getResources().getColor(0x7f0f0111));
        messageArea.setUiElementsVisible(false);
    }

    private boolean hasSameAuthMessage(List list)
    {
        boolean flag1 = false;
        list = list.iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!list.hasNext())
            {
                break;
            }
            Message message = (Message)list.next();
            if (!com.skype.Message.TYPE.REQUESTED_AUTH.equals(message.getTypeProp()))
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        flag1 = flag;
        if (!flag)
        {
            flag1 = flag;
            if (adapter.hasSynthAuthRequest())
            {
                flag1 = true;
            }
        }
        return flag1;
    }

    private boolean hasVisibleItems(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((Boolean)((Pair)list.next()).second).booleanValue())
            {
                return true;
            }
        }

        return false;
    }

    private boolean isContactRequestPending()
    {
        return contact != null && contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.UNKNOWN_OR_PENDINGAUTH_BUDDIES);
    }

    private boolean isContactWaitingAuthorization()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (contact != null)
        {
            flag = flag1;
            if (contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_WAITING_MY_AUTHORIZATION))
            {
                long l = contact.getAuthreqTimestampProp();
                flag = flag1;
                if (!adapter.hasNewerMessages(l & 0xffffffffL))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private boolean isFromMe(Message message)
    {
        return message.getAuthorProp().equals(account.getSkypenameProp());
    }

    private boolean isHeartedByMe(com.skype.Message.GetOwnAnnotations_Result getownannotations_result)
    {
        return annotationUtil.getOwnAnnotationIndex(getownannotations_result, "heart") >= 0;
    }

    private boolean isLoadingMoreMessagesHeaderVisible()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!adapter.isEmpty())
        {
            flag = flag1;
            if (adapter.getItemViewType(0) == SyntheticTypes.HEADER.getType())
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean isSameConversation(int i)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        return lib.getConversationByConvoID(i, conversationimpl) && conversation.getIdentityProp().equals(conversationimpl.getIdentityProp());
    }

    private boolean isTranslationSuccessful(com.skype.android.gen.TranslatorListener.OnTranscribedMessage ontranscribedmessage)
    {
        return ontranscribedmessage.getStatus() == com.skype.Translator.TRANSLATOR_STATUS.TRANSLATOR_CONNECTED && !TextUtils.isEmpty(ontranscribedmessage.getText());
    }

    private void loadInitialMessages(int i, boolean flag)
    {
        startMessageLoaderTask(i, flag);
        List list = pushMessageRepository.getMessages(conversation.getIdentityProp());
        if (list != null)
        {
            chatListManager.updateAdapter(list);
        }
    }

    private void markConversationConsumed(int i)
    {
        if (visibleOnScreen && !markedUnread && conversation.getConsumptionHorizonProp() < i)
        {
            conversation.setConsumedHorizon(i, true);
        }
    }

    private String participantsToString(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        for (list = list.iterator(); list.hasNext(); stringbuilder.append(s))
        {
            s = (String)list.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.toString();
    }

    private void photoSharingSaveAndUploadCameraImage(Uri uri)
    {
        String s = PathRetriever.getPath(getActivity(), uri, false);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        s = String.format("%s;%dx%d", new Object[] {
            Long.valueOf((new File(s)).length()), Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight)
        });
        analytics.a(AnalyticsEvent.bJ, s);
        analytics.a(AnalyticsEvent.bK, ConversationUtil.b(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS));
        FileUtil.saveFileToGallery(FileUtil.createFileFromUri(uri), getActivity().getApplicationContext());
        mediaDocumentUploadUtil.uploadPictureAsync(conversation, uri, mediaDocumentUploadCallback);
        uri = new SkypeTelemetryEvent(KpiEvent.b);
        uri.put(KpiAttributeName.l, KpiAttributeValue.b);
        analytics.a(uri);
    }

    private int removeHeart(Message message, com.skype.Message.GetOwnAnnotations_Result getownannotations_result, int i)
    {
        int k = annotationUtil.getOwnAnnotationIndex(getownannotations_result, "heart");
        message.removeAnnotation(getownannotations_result.m_messageannotationObjectIDList[k]);
        adapter.notifyItemChanged(i);
        return annotationUtil.getAnnotationCount(message, com.skype.MessageAnnotation.TYPE.EMOTICON, "heart");
    }

    private void reportExistingPhotoAnalytics(int i)
    {
        analytics.a(AnalyticsEvent.bH, i);
        analytics.a(AnalyticsEvent.bI, ConversationUtil.b(conversation, com.skype.Conversation.PARTICIPANTFILTER.OTHER_CONSUMERS));
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(KpiEvent.b);
        skypetelemetryevent.put(KpiAttributeName.l, KpiAttributeValue.g);
        analytics.a(skypetelemetryevent);
    }

    private void reportSendText(String s, int i)
    {
        s = chatText.a(s);
        Iterator iterator = mruManager.onTextPosted(s).iterator();
        while (iterator.hasNext()) 
        {
            s = (EmoticonSpan)iterator.next();
            EmoticonContent emoticoncontent = s.b();
            s = s.c();
            SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.ag);
            skypetelemetryevent.put(LogAttributeName.L, Integer.valueOf(i));
            skypetelemetryevent.put(LogAttributeName.M, emoticoncontent.a());
            skypetelemetryevent.put(LogAttributeName.N, s);
            skypetelemetryevent.put(LogAttributeName.O, emoticoncontent.j().toString());
            LogAttributeName logattributename = LogAttributeName.P;
            if (emoticoncontent.q())
            {
                s = "Featured";
            } else
            {
                s = "Regular";
            }
            skypetelemetryevent.put(logattributename, s);
            skypetelemetryevent.put(LogAttributeName.Q, emoticoncontent.r());
            skypetelemetryevent.put(LogAttributeName.R, Integer.valueOf(emoticoncontent.s()));
            analytics.a(skypetelemetryevent);
        }
        s = new SkypeTelemetryEvent(KpiEvent.b);
        s.put(KpiAttributeName.l, KpiAttributeValue.h);
        analytics.a(s);
    }

    private void reportTranslatorContextMenuEvent(Message message)
    {
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.ak);
        skypetelemetryevent.put(LogAttributeName.l, Integer.valueOf(message.getObjectID()));
        analytics.a(skypetelemetryevent);
    }

    private void reportTranslatorErrorEvent(com.skype.Translator.TRANSLATOR_STATUS translator_status)
    {
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.an);
        skypetelemetryevent.put(LogAttributeName.g, Integer.valueOf(conversation.getObjectID()));
        skypetelemetryevent.put(LogAttributeName.n, translator_status);
        analytics.a(skypetelemetryevent);
    }

    private void reportTranslatorTextEvent(String s, String s1, boolean flag)
    {
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.am);
        skypetelemetryevent.put(LogAttributeName.g, Integer.valueOf(conversation.getObjectID()));
        skypetelemetryevent.put(LogAttributeName.i, s);
        skypetelemetryevent.put(LogAttributeName.p, s1);
        skypetelemetryevent.put(LogAttributeName.j, Boolean.valueOf(flag));
        analytics.a(skypetelemetryevent);
    }

    private void scrollToMessageIfRequested()
    {
        Bundle bundle = getActivity().getIntent().getExtras();
        if (bundle != null && bundle.containsKey("messageIdScrollTo"))
        {
            int i = bundle.getInt("messageIdScrollTo");
            chatListManager.scrollToMessage(i);
            getActivity().getIntent().removeExtra("messageIdScrollTo");
        }
    }

    private void sendSms(String s)
    {
        String s2 = viewState.h();
        createOutgoingSms();
        com.skype.Sms.SetBody_Result setbody_result = sms.setBody(s);
        String s1 = s2;
        if (s2 == null)
        {
            List list = contactUtil.j(contact);
            s1 = s2;
            if (!list.isEmpty())
            {
                s1 = (String)((Pair)list.get(0)).second;
            }
        }
        sms.setTargets(new String[] {
            s1
        });
        if (setbody_result.m_return == com.skype.Sms.SETBODYRESULT.BODY_INVALID)
        {
            log.warning("sendSms got BODY_INVALID error");
        } else
        {
            conversation.postSMS(sms.getObjectID(), s);
            analytics.c(AnalyticsEvent.o);
        }
        sms = null;
    }

    private void setMessageAreaExtraPadding(int i)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)messageArea.getLayoutParams();
        layoutparams.bottomMargin = i;
        messageArea.setLayoutParams(layoutparams);
    }

    private void setProgressForMedia(MediaDocument mediadocument, String s, int i, int k)
    {
        com.skype.Message.TYPE type = null;
        if (!s.equals(MediaLinkProfile.ORIGINAL.toString())) goto _L2; else goto _L1
_L1:
        type = com.skype.Message.TYPE.POSTED_FILE_MESSAGE;
_L4:
        if (type != null)
        {
            ((AsyncMediaViewAdapter)adapter.getMessageViewAdapter(type)).setProgressForMedia(mediadocument, i, k);
        }
        return;
_L2:
        if (s.equals(MediaLinkProfile.VIDEO_PROFILE.toString()))
        {
            type = com.skype.Message.TYPE.POSTED_VIDEO;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean shouldAllowMediaDocumentDownload(Message message)
    {
        com.skype.MediaDocument.DOCUMENT_TYPE document_type;
        if (!TextUtils.isEmpty(message.getBodyXmlProp()) || message.getEditTimestampProp() <= 0)
        {
            if ((message = XmmUtil.getMediaDocument(message)) != null && ((document_type = message.getDocTypeProp()) == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PHOTO && message.getUploadStatus(lib.getDefaultContentId(document_type).m_contentId) == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_NOT_STARTED) && (((com.skype.MediaDocument.GetMediaLink_Result) (message = message.getMediaLink(MediaLinkProfile.SAVE_PROFILE.toString(), com.skype.MediaDocument.MEDIA_GET_POLICY.CACHE_ONLY))).m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADING && ((com.skype.MediaDocument.GetMediaLink_Result) (message)).m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED))
            {
                return true;
            }
        }
        return false;
    }

    private void showTranslationText(j j1, String s)
    {
        if (j1 instanceof UrlPreviewTextMessageViewHolder)
        {
            j1 = ((UrlPreviewTextMessageViewHolder)j1).getSubTypeHolder(getContext());
            if (j1 instanceof TextMessageViewHolder)
            {
                j1 = ((TextMessageViewHolder)j1).textView;
                if (j1 != null)
                {
                    CharSequence charsequence = j1.getText();
                    j1.setText(TranslationSpan.attachTranslationSpan(chatText, charsequence, s));
                }
            }
        }
    }

    private void startMessageLoaderTask(int i)
    {
        startMessageLoaderTask(i, false);
    }

    private void startMessageLoaderTask(int i, boolean flag)
    {
        conversationTimestamp = i;
        MessageLoader messageloader = new MessageLoader(conversation, map, messageCache, i, flag);
        async.a(messageloader, new UiCallback(this, this));
    }

    private void updateEmptyView()
    {
        if (!adapter.isEmpty())
        {
            View view = ViewUtil.a(rootView, 0x7f100333);
            if (view != null)
            {
                view.setVisibility(8);
                updateMessageArea(true);
            }
        }
    }

    private void updateLovedByTextView(j j1, Message message, int i, boolean flag)
    {
        if (i == 0)
        {
            j1 = j1.getLovedByText();
            j1.setText("");
            j1.setVisibility(8);
            return;
        } else
        {
            j1 = j1.getLovedByText();
            j1.setText(adapter.getFormattedLovedByText(message, i, flag));
            j1.setVisibility(0);
            return;
        }
    }

    private void updateMediaBar()
    {
        mediaBar.update(getChatCapabilities());
        BadgeDecoratorView badgedecoratorview = (BadgeDecoratorView)mediaBar.getButton(0x7f100405);
        if (badgedecoratorview.getVisibility() == 0)
        {
            boolean flag;
            if (ecsConfiguration.isVimFiltersBadgeEnabled() && !userPreferences.vimFiltersAccessed())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            badgedecoratorview.setBadgeVisible(flag);
        }
    }

    private void updateMessageArea(boolean flag)
    {
        if (!flag)
        {
            messageArea.setEnabled(false);
            messageArea.setBackgroundColor(getResources().getColor(0x7f0f0112));
            mediaBar.setVisibility(8);
            return;
        } else
        {
            messageArea.setEnabled(true);
            messageArea.setBackgroundColor(getResources().getColor(0x7f0f0135));
            mediaBar.setVisibility(0);
            return;
        }
    }

    public void addParticipants()
    {
        String s;
        if (accessibility.a())
        {
            Intent intent = navigation.intentFor(conversation, com/skype/android/app/contacts/PickerActivity);
            intent.putExtra("fragmentClass", com/skype/android/app/chat/AddParticipantsAccessibilityFragment);
            intent.putExtra("CHECKBOX_MODE", true);
            intent.putExtra("CUSTOM_ACTION", com.skype.android.widget.SymbolElement.SymbolCode.aw);
            Object obj = conversationUtil.c(conversation, com.skype.Conversation.PARTICIPANTFILTER.CONSUMERS);
            if (((List) (obj)).size() > 0)
            {
                int ai[] = new int[((List) (obj)).size()];
                int i = 0;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
                {
                    ai[i] = ((Contact)((Iterator) (obj)).next()).getObjectID();
                    i++;
                }

                intent.putExtra("com.skype.objIds", ai);
            }
            startActivityForResult(intent, 4);
        } else
        {
            Intent intent1 = navigation.intentFor(conversation, com/skype/android/app/chat/AddParticipantsActivity);
            intent1.putExtra("showMsgArea", false);
            startActivityForResult(intent1, 4);
        }
        messageArea.setHidden(true);
        s = String.valueOf(messageArea.getEditText().getText());
        if (!TextUtils.isEmpty(s))
        {
            viewState.a(s);
        }
    }

    public void deviceConnected(BluetoothDevice bluetoothdevice)
    {
        adapter.notifyDataSetChanged();
    }

    public void deviceDisconnected(BluetoothDevice bluetoothdevice)
    {
        adapter.notifyDataSetChanged();
    }

    public void done(AsyncResult asyncresult)
    {
        if (!asyncresult.e())
        {
            return;
        }
        asyncresult = (List)asyncresult.a();
        if ((isContactRequestPending() || isContactWaitingAuthorization()) && !hasSameAuthMessage(asyncresult))
        {
            addSynthAuthReq();
        }
        if ((!ConversationUtil.d(conversation) || ContactUtil.s(contact) || isContactWaitingAuthorization()) && asyncresult.size() > 0)
        {
            chatListManager.displayMessageList(conversation, asyncresult);
        }
        if (adapter.isEmpty())
        {
            if (!emptyViewManager.isInflated())
            {
                emptyViewManager.inflateEmptyView(viewStub, contact);
                if (ecsConfiguration.isMessageAreaDisabledBeforeSendingAddRequest() && emptyViewManager.isAddContact() || emptyViewManager.isSuggestedContact())
                {
                    updateMessageArea(false);
                }
            }
        } else
        {
            updateEmptyView();
        }
        scrollToMessageIfRequested();
    }

    public void forwardMoji(int i, int k, MojiForwardSource mojiforwardsource)
    {
        mojiForwardSource = mojiforwardsource;
        forwardMediaDocument(i, k);
    }

    public List getAvailableSmsTargets()
    {
        Object obj = new ArrayList();
        if (contact != null)
        {
            obj = contactUtil.j(contact);
        }
        return ((List) (obj));
    }

    public long getChatFragmentCreatedTimestamp()
    {
        return chatFragmentCreatedTimestamp;
    }

    public RecyclerView getChatListView()
    {
        return listView;
    }

    public int getPickerHeight()
    {
        return inputMethodOverlay.getInputMethodHeight();
    }

    public int getSelectedSmsTarget()
    {
label0:
        {
            List list = getAvailableSmsTargets();
            String s;
            Iterator iterator;
            Pair pair;
            int i;
            int k;
            if (list != null)
            {
                i = list.size() - 1;
            } else
            {
                i = 0;
            }
            s = viewState.h();
            k = i;
            if (contact == null)
            {
                break label0;
            }
            k = i;
            if (TextUtils.isEmpty(s))
            {
                break label0;
            }
            k = i;
            if (list == null)
            {
                break label0;
            }
            iterator = list.iterator();
            do
            {
                k = i;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                pair = (Pair)iterator.next();
            } while (!s.equals(pair.second));
            k = list.indexOf(pair);
        }
        return k;
    }

    public boolean getShowEmoticonsOnly()
    {
        return viewState.d();
    }

    public String getSmsPrice()
    {
        if (viewState.d())
        {
            Object obj = messageArea.getEditText().getText().toString();
            if (!((String) (obj)).isEmpty())
            {
                createOutgoingSms();
                obj = sms.setBody(((String) (obj)));
                sms.setTargets(new String[] {
                    viewState.h()
                });
                if (((com.skype.Sms.SetBody_Result) (obj)).m_return == com.skype.Sms.SETBODYRESULT.BODY_OK)
                {
                    float f = sms.getPriceProp();
                    if (f >= 0.0F)
                    {
                        int k = sms.getPricePrecisionProp();
                        for (int i = 0; i < k; i++)
                        {
                            f /= 10F;
                        }

                        return smsPriceFormat.format(f);
                    }
                }
            }
        }
        return "";
    }

    boolean handleBackPressed()
    {
        return inputMethodOverlay.hideWithInputMethod(messageArea.getEditText());
    }

    public boolean handleMessage(android.os.Message message)
    {
        if (!isVisible() && !isResumed())
        {
            log.warning((new StringBuilder("ChatFragment not attached. Message ignored: ")).append(message.what).toString());
            return true;
        }
        message.what;
        JVM INSTR tableswitch 1 10: default 100
    //                   1 102
    //                   2 161
    //                   3 178
    //                   4 211
    //                   5 233
    //                   6 266
    //                   7 142
    //                   8 302
    //                   9 309
    //                   10 349;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        return false;
_L2:
        if (isVisible())
        {
            messageArea.resumeEditing();
            ime.showSoftInput(messageArea.getEditText(), 0);
            messageArea.updateEmoticonButtonForHiddenPicker();
        }
        continue; /* Loop/switch isn't completed */
_L8:
        ime.hideSoftInputFromWindow(getView().getWindowToken(), 0);
        continue; /* Loop/switch isn't completed */
_L3:
        adapter.notifyDataSetChanged();
        chatListManager.scrollToPosition();
        continue; /* Loop/switch isn't completed */
_L4:
        message = (Long)message.obj;
        if (message != null)
        {
            loadInitialMessages(message.intValue(), true);
        } else
        {
            loadInitialMessages(0, false);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        message = (Integer)message.obj;
        if (message != null)
        {
            startMessageLoaderTask(message.intValue());
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        conversation.setMyTextStatusTo(com.skype.Participant.TEXT_STATUS.READING);
        handler.removeMessages(5);
        handler.removeMessages(6);
        continue; /* Loop/switch isn't completed */
_L7:
        conversation.setMyTextStatusTo(com.skype.Participant.TEXT_STATUS.WRITING);
        handler.removeMessages(5);
        handler.sendEmptyMessageDelayed(5, 10000L);
        continue; /* Loop/switch isn't completed */
_L9:
        updateMediaBar();
        continue; /* Loop/switch isn't completed */
_L10:
        heartNotification.setVisibility(0);
        handler.removeMessages(10);
        handler.sendMessageDelayed(handler.obtainMessage(10), 5000L);
        continue; /* Loop/switch isn't completed */
_L11:
        heartNotification.setVisibility(8);
        if (true) goto _L1; else goto _L12
_L12:
    }

    public void headsetStateChanged(com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus wiredheadsetstatus)
    {
        int ai[] = _cls8..SwitchMap.com.skype.android.audio.WiredHeadsetReceiver.WiredHeadsetStatus;
        wiredheadsetstatus.ordinal();
        adapter.notifyDataSetChanged();
    }

    public void hidePicker()
    {
        if (DeviceFeatures.d())
        {
            setMessageAreaExtraPadding(0);
            ime.showSoftInput(messageArea.getEditText(), 1);
        }
        inputMethodOverlay.hide();
    }

    public boolean isInSMSMode()
    {
        return viewState.d();
    }

    public boolean isMessageAreaEmpty()
    {
        return messageArea.getEditText().getText().length() == 0;
    }

    public boolean isMessageAreaEnabled()
    {
        return true;
    }

    public boolean isPickerShowing()
    {
        return inputMethodOverlay.isShowing();
    }

    public boolean isSendSMSOptionAvailable()
    {
        return getChatCapabilities().get(7);
    }

    public boolean needsBottomSpacing()
    {
        return false;
    }

    boolean onAcceptEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        switch (_cls8..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return false;

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return true;
        }
    }

    boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        return onpropertychange.getSender().getObjectID() == conversation.getObjectID() && (onpropertychange.getPropKey() == PROPKEY.CONVERSATION_MY_STATUS || onpropertychange.getPropKey() == PROPKEY.CONVERSATION_IS_P2P_MIGRATED);
    }

    boolean onAcceptEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        return onmessage.getConversationObjectID() == conversation.getObjectID();
    }

    boolean onAcceptEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        return onobjectpropertychangewithvalue.getPropKey() == PROPKEY.CONTACT_DISPLAYNAME;
    }

    boolean onAcceptEvent(com.skype.android.gen.SmsListener.OnPropertyChange onpropertychange)
    {
        switch (_cls8..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return true;
        }
    }

    public void onActivityResult(int i, int k, Intent intent)
    {
        super.onActivityResult(i, k, intent);
        if (k != -1) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 0 7: default 60
    //                   0 84
    //                   1 112
    //                   2 198
    //                   3 268
    //                   4 277
    //                   5 389
    //                   6 422
    //                   7 587;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        log.warning((new StringBuilder("Result Ok. Not properly handled requestCode: ")).append(i).toString());
_L13:
        return;
_L4:
        if (ecsConfiguration.isAsyncFileSharingEnabled())
        {
            sendFileAsync(intent.getData());
            return;
        } else
        {
            sendFiles(intent.getData());
            return;
        }
_L5:
        if (getChatCapabilities().get(3))
        {
            if (mediaDocumentUploadUtil.shouldPerformCropForPreviewBeforeUpload())
            {
                intent = new Intent("com.android.camera.action.CROP");
                intent.setDataAndType(pictureUri, "image/*");
                startActivityForResult(intent, 3);
                return;
            } else
            {
                photoSharingSaveAndUploadCameraImage(pictureUri);
                return;
            }
        } else
        {
            FileUtil.saveFileToGallery(FileUtil.createFileFromUri(pictureUri), getActivity().getApplicationContext());
            sendFiles(pictureUri);
            return;
        }
_L6:
        Uri uri = intent.getData();
        if (uri != null)
        {
            reportExistingPhotoAnalytics(1);
            mediaDocumentUploadUtil.uploadPictureAsync(conversation, uri, mediaDocumentUploadCallback);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            reportExistingPhotoAnalytics(intent.getClipData().getItemCount());
            mediaDocumentUploadUtil.uploadPictureAsync(conversation, intent, mediaDocumentUploadCallback);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        photoSharingSaveAndUploadCameraImage(intent.getData());
        return;
_L8:
        if (!intent.getBooleanExtra("publishDraftMsg", false))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = String.valueOf(viewState.c());
        if (!TextUtils.isEmpty(intent))
        {
            sendText(intent);
            return;
        }
        if (true) goto _L13; else goto _L12
_L12:
        intent = viewState.c();
        if (!TextUtils.isEmpty(intent))
        {
            messageArea.getEditText().setText(intent);
            messageArea.getEditText().setSelection(intent.length());
            intent = messageArea;
            boolean flag;
            if (!viewState.d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent.toggleImageSpan(flag, chatText);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        forwardPendingMedia(intent, getResources().getString(0x7f080304), getString(0x7f0802b7));
        analytics.c(AnalyticsEvent.bM);
        return;
_L10:
        String s1 = getResources().getString(0x7f0802dd);
        String s2 = getString(0x7f0802b6);
        MediaDocument mediadocument = (MediaDocument)map.a(pendingMediaDocumentId, com/skype/MediaDocument);
        forwardPendingMedia(intent, s1, s2);
        intent = new SkypeTelemetryEvent(LogEvent.I);
        intent.put(LogAttributeName.E, XmmUtil.getMetadataStringValue(mediadocument, "pickerTitle"));
        intent.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(mediadocument));
        intent.put(LogAttributeName.K, getMojiForwardSource().toString());
        analytics.a(intent);
        if (ecsConfiguration.getExpMojiForwardExpUserGroup() == ExperimentTag.e)
        {
            analytics.a(ExperimentEvent.i, ExperimentTag.d);
            return;
        }
        if (ecsConfiguration.getExpMojiForwardExpUserGroup() == ExperimentTag.g)
        {
            analytics.a(ExperimentEvent.i, ExperimentTag.f);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        String s;
        s = intent.getStringExtra("MEDIA_TYPE");
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 628
    //                   -1840876541: 705
    //                   972678305: 689;
           goto _L14 _L15 _L16
_L14:
        break; /* Loop/switch isn't completed */
_L15:
        break MISSING_BLOCK_LABEL_705;
_L17:
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            intent = intent.getStringExtra("MEDIA_ID");
            intent = (EmoticonContent)mediaContentRoster.a(intent, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON);
            messageArea.onEmoticonSelected(intent, chatText);
            return;

        case 1: // '\001'
            i = intent.getIntExtra("MOJI_CONTENT_ID", -1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        if (s.equals("MEDIA_EMOTICON"))
        {
            i = 0;
        }
          goto _L17
        if (s.equals("MEDIA_FLIK"))
        {
            i = 1;
        }
          goto _L17
        if (i == -1) goto _L13; else goto _L18
_L18:
        mediaDocumentUploadUtil.postMoji(conversation, i);
        return;
_L2:
        if (k == 0)
        {
            switch (i)
            {
            default:
                log.warning((new StringBuilder("Result Canceled. Not properly handled requestCode: ")).append(i).toString());
                return;

            case 2: // '\002'
                analytics.a(AnalyticsEvent.bL, "Native Gallery");
                return;

            case 1: // '\001'
            case 3: // '\003'
                analytics.a(AnalyticsEvent.bL, "Native Camera");
                return;
            }
        }
        if (true) goto _L13; else goto _L19
_L19:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        messageArea.onInputAreaFocus(false);
    }

    public void onConsumedHorizonChanged(int i)
    {
        markConversationConsumed(i);
    }

    public boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface, Bundle bundle)
    {
        if (objectinterface instanceof Transfer)
        {
            return handleTransferMenuItemSelected(menuitem, (Transfer)objectinterface, bundle);
        }
        objectinterface = (Message)objectinterface;
        if (objectinterface != null)
        {
            return handleMessageItemSelected(menuitem, objectinterface, bundle);
        } else
        {
            return false;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        lifecycleSupport.addListener(actionBarCustomizer);
        setRetainInstance(true);
        if (getArguments() == null)
        {
            bundle = getActivity().getIntent().getExtras();
        } else
        {
            bundle = getArguments();
        }
        viewState = (ConversationViewState)stateManager.a(conversation, com/skype/android/util/ConversationViewState);
        me = conversationUtil.o(conversation);
        if (ConversationUtil.d(conversation))
        {
            contact = new ContactImpl();
            lib.getContact(conversation.getIdentityProp(), contact);
            if (bundle != null && (bundle.containsKey("startInSmsMode") || ContactUtil.g(contact)))
            {
                boolean flag = bundle.getBoolean("startInSmsMode", ContactUtil.g(contact));
                viewState.b(flag);
                if (flag && TextUtils.isEmpty(viewState.h()))
                {
                    viewState.a((String)((Pair)contactUtil.j(contact).get(0)).second);
                }
            }
        }
        smsPriceFormat = skypeCredit.i();
        if (bundle != null && bundle.containsKey("sendText"))
        {
            sendText(bundle.getString("sendText"));
            bundle.remove("sendText");
        }
        handler = new Handler(this);
        updateScheduler = new UpdateScheduler(handler);
        chatFragmentCreatedTimestamp = System.currentTimeMillis() / 1000L;
        mojiPlaybackStateHolder = new MojiPlaybackStateHolder();
        locationUtil = new LocationUtil();
        TransferType.setExtensionsFromEcs(ecsConfiguration);
    }

    public void onCreateContextMenu(Menu menu, ObjectInterface objectinterface, Bundle bundle)
    {
        if (!(objectinterface instanceof Transfer)) goto _L2; else goto _L1
_L1:
        objectinterface = (Transfer)objectinterface;
        boolean flag2 = transferUtil.isIncoming(objectinterface);
        boolean flag3 = transferUtil.isCompleted(objectinterface);
        boolean flag4 = (new File(objectinterface.getFilepathProp())).exists();
        getActivity().getMenuInflater().inflate(0x7f110021, menu);
        objectinterface = menu.findItem(0x7f1005fa);
        boolean flag;
        if (!flag3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        objectinterface.setVisible(flag);
        objectinterface = menu.findItem(0x7f1005fb);
        if (flag3 && flag4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        objectinterface.setVisible(flag);
        if (flag2)
        {
            objectinterface = menu.findItem(0x7f1005f9);
            if (flag3 && flag4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            objectinterface.setVisible(flag);
        } else
        {
            menu.findItem(0x7f1005f9).setVisible(flag4);
        }
        menu = menu.findItem(0x7f1005b8);
        if (bundle != null && bundle.getBoolean("showTimestampInMenuOption", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.setVisible(flag);
_L4:
        return;
_L2:
        objectinterface = (Message)objectinterface;
        bundle = getChatMessageContextMenuItemIdsVisibility(objectinterface, bundle);
        getActivity().getMenuInflater().inflate(0x7f110007, menu);
        int i;
        boolean flag1;
        for (bundle = bundle.iterator(); bundle.hasNext(); menu.findItem(i).setVisible(flag1))
        {
            Pair pair = (Pair)bundle.next();
            i = ((Integer)pair.first).intValue();
            flag1 = ((Boolean)pair.second).booleanValue();
        }

        switch (_cls8..SwitchMap.com.skype.Message.TYPE[objectinterface.getTypeProp().ordinal()])
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            return;

        case 1: // '\001'
            menu.findItem(0x7f1005b4).setTitle(0x7f08016a);
            return;

        case 2: // '\002'
            objectinterface = XmmUtil.getMetadataAuxiliaryText(objectinterface);
            if (!TextUtils.isEmpty(objectinterface))
            {
                menu.findItem(0x7f1005b3).setTitle(objectinterface);
                return;
            }
            break;

        case 7: // '\007'
            menu.findItem(0x7f1005af).setTitle(0x7f080133);
            menu.findItem(0x7f1005b0).setTitle(0x7f080167);
            menu.findItem(0x7f1005b4).setTitle(0x7f08016a);
            return;

        case 3: // '\003'
        case 4: // '\004'
            menu.findItem(0x7f1005b9).setTitle(0x7f08017c);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03006d, viewgroup, false);
    }

    public void onDestroyView()
    {
        String s = messageArea.getEditText().getText().toString();
        viewState.a(s);
        messageArea.clearCallback();
        super.onDestroyView();
    }

    public void onEmoticonSelected(EmoticonContent emoticoncontent)
    {
        messageArea.onEmoticonSelected(emoticoncontent, chatText);
    }

    public void onEvent(OnTranslateMessage ontranslatemessage)
    {
        Message message = ontranslatemessage.getMessage();
        handleIncomingMessageTranslation(message, message.getStrPropertyWithXmlStripped(PROPKEY.MESSAGE_BODY_XML, ""), ontranslatemessage.getPosition());
    }

    public void onEvent(OnMediaDefaultLinkUpdate onmediadefaultlinkupdate)
    {
        com.skype.MediaDocument.MEDIA_STATUS media_status;
        int i;
        i = onmediadefaultlinkupdate.getMediaDocument().getObjectID();
        media_status = onmediadefaultlinkupdate.getStatus();
        _cls8..SwitchMap.com.skype.MediaDocument.MEDIA_STATUS[media_status.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 61
    //                   2 142
    //                   3 142;
           goto _L1 _L2 _L3 _L3
_L1:
        updateScheduler.a(2, 1000L, null);
        return;
_L2:
        if (MediaLinkProfile.fromString(onmediadefaultlinkupdate.getProfile()) == MediaLinkProfile.DEFAULT_PROFILE)
        {
            mojiPlaybackStateHolder.onProgressUpdate(i, onmediadefaultlinkupdate.getSizeDownloaded(), onmediadefaultlinkupdate.getTotalSize());
        } else
        if (MediaLinkProfile.fromString(onmediadefaultlinkupdate.getProfile()) == MediaLinkProfile.VIDEO_PROFILE || MediaLinkProfile.fromString(onmediadefaultlinkupdate.getProfile()) == MediaLinkProfile.ORIGINAL)
        {
            setProgressForMedia(onmediadefaultlinkupdate.getMediaDocument(), onmediadefaultlinkupdate.getProfile(), onmediadefaultlinkupdate.getSizeDownloaded(), onmediadefaultlinkupdate.getTotalSize());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        mediaDocumentDownloadUtil.putUnavailableMedia(i, MediaLinkProfile.fromString(onmediadefaultlinkupdate.getProfile()), media_status);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onEvent(OnMediaDownloadCriticalError onmediadownloadcriticalerror)
    {
        if (onmediadownloadcriticalerror.getProfile() == MediaLinkProfile.SAVE_PROFILE || onmediadownloadcriticalerror.getProfile() == MediaLinkProfile.PREVIEW_PROFILE)
        {
            MediaDownloadErrorDialog.create(false).show(getActivity().getSupportFragmentManager());
        }
    }

    public void onEvent(OnMediaSaveToGalleryErrorEvent onmediasavetogalleryerrorevent)
    {
        MediaSaveErrorDialog.create(onmediasavetogalleryerrorevent.getMediaLinkSaveError(), onmediasavetogalleryerrorevent.getTitleId(), onmediasavetogalleryerrorevent.getMessageId(), onmediasavetogalleryerrorevent.getSdCardMissingId()).show(getActivity().getSupportFragmentManager());
    }

    public void onEvent(OnMediaThumbnailLinkStatusChange onmediathumbnaillinkstatuschange)
    {
        com.skype.MediaDocument.MEDIA_STATUS media_status = onmediathumbnaillinkstatuschange.getStatus();
        if (media_status == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_NOT_AVAILABLE || media_status == com.skype.MediaDocument.MEDIA_STATUS.MEDIA_BAD_CONTENT)
        {
            mediaDocumentDownloadUtil.putUnavailableMedia(onmediathumbnaillinkstatuschange.getMediaDocumentId(), onmediathumbnaillinkstatuschange.getProfile(), media_status);
        }
        updateScheduler.a(2, 1000L, null);
    }

    public void onEvent(OnMediaUploadProgress onmediauploadprogress)
    {
        com.skype.MediaDocument.MEDIA_STATUS media_status = onmediauploadprogress.getStatus();
        _cls8..SwitchMap.com.skype.MediaDocument.MEDIA_STATUS[media_status.ordinal()];
        JVM INSTR tableswitch 1 1: default 32
    //                   1 45;
           goto _L1 _L2
_L1:
        updateScheduler.a(2, 1000L, null);
        return;
_L2:
        if (MediaLinkProfile.fromString(onmediauploadprogress.getProfile()) == MediaLinkProfile.VIDEO_PROFILE || MediaLinkProfile.fromString(onmediauploadprogress.getProfile()) == MediaLinkProfile.ORIGINAL)
        {
            setProgressForMedia(onmediauploadprogress.getMediaDocument(), onmediauploadprogress.getProfile(), onmediauploadprogress.getSizeUploaded(), onmediauploadprogress.getTotalSize());
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onEvent(OnMediaUploadStatusChange onmediauploadstatuschange)
    {
        updateScheduler.a(2, 1000L, null);
    }

    void onEvent(com.skype.android.gen.ContactGroupListener.OnChange onchange)
    {
        if (contact != null && onchange.getContactObjectID() == contact.getObjectID() && !emptyViewManager.isInflated() && adapter.isEmpty())
        {
            emptyViewManager.inflateEmptyView(viewStub, contact);
        }
    }

    void onEvent(com.skype.android.gen.ContactListener.OnPropertyChange onpropertychange)
    {
        if (contact != null && onpropertychange.getSender().getObjectID() == contact.getObjectID())
        {
            messageArea.updateSmsTargets();
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnCapabilitiesChanged oncapabilitieschanged)
    {
        if (oncapabilitieschanged.getSender().getObjectID() == conversation.getObjectID())
        {
            boolean flag;
            if (!conversation.getIsP2pMigratedProp() && (ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_TEXT) || ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_SMS)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            updateMessageArea(flag);
            updateScheduler.a(8, 1000L, null);
        }
    }

    void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        if (onpropertychange.getSender().getObjectID() != conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        _cls8..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()];
        JVM INSTR tableswitch 8 9: default 56
    //                   8 57
    //                   9 63;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        checkMyStatus(true);
        return;
_L4:
        handleMigratedP2PConversation();
        return;
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMetadataUpdated onmetadataupdated)
    {
        updateScheduler.a(2, 1000L, null);
    }

    void onEvent(com.skype.android.gen.MessageListener.OnPropertyChange onpropertychange)
    {
        while (onpropertychange.getPropKey() == PROPKEY.MESSAGE_CONSUMPTION_STATUS || ((Message)onpropertychange.getSender()).getConvoIdProp() != conversation.getDbID()) 
        {
            return;
        }
        updateScheduler.a(2);
    }

    void onEvent(com.skype.android.gen.ParticipantListener.OnPropertyChange onpropertychange)
    {
        Participant participant;
label0:
        {
            participant = (Participant)onpropertychange.getSender();
            if (participant.getConvoIdProp() == conversation.getDbID() && onpropertychange.getPropKey() == PROPKEY.PARTICIPANT_TEXT_STATUS)
            {
                boolean flag;
                if (me == null || me.getObjectID() == participant.getObjectID())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (onpropertychange.getPropKey() == PROPKEY.PARTICIPANT_TEXT_STATUS && !flag && participant.getConvoIdProp() == conversation.getDbID())
                {
                    onpropertychange = participant.getTextStatusProp();
                    if (onpropertychange != com.skype.Participant.TEXT_STATUS.WRITING && onpropertychange != com.skype.Participant.TEXT_STATUS.WRITING_AS_ANGRY && onpropertychange != com.skype.Participant.TEXT_STATUS.WRITING_AS_CAT)
                    {
                        break label0;
                    }
                    chatListManager.addParticipantTypingIndicator(participant);
                }
            }
            return;
        }
        chatListManager.removeParticipantTypingIndicator(participant);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnEmoticonListUpdated onemoticonlistupdated)
    {
        updateScheduler.a(8, 1000L, null);
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnMessage onmessage)
    {
        Message message = (Message)map.a(onmessage.getMessageObjectID(), com/skype/Message);
        if (contact != null && message.getTypeProp().equals(com.skype.Message.TYPE.GRANTED_AUTH))
        {
            getActionBarActivity().supportInvalidateOptionsMenu();
        }
        SkypeMessageHolder skypemessageholder = null;
        boolean flag = message.getAuthorProp().equals(account.getSkypenameProp());
        if (adapter.findMessageById(onmessage.getMessageObjectID()) == null)
        {
            if (!adapter.isEmpty() && !flag)
            {
                adapter.removeSyntheticMessages();
            }
            skypemessageholder = new SkypeMessageHolder(conversation, message, conversationUtil);
            int i = message.getTimestampProp();
            if (i > adapter.getNewestMessageTimestamp())
            {
                adapter.setNewestMessageTimestamp(i);
            }
            i = adapter.add(skypemessageholder);
            if (flag && ecsConfiguration.isMessageStatusIndicatorEnabled())
            {
                adapter.setPositionOfLastMessageFromMe(i);
            }
            updateScheduler.a(2);
        }
        chatListManager.onNewSkypeMessage(skypemessageholder, flag);
        updateEmptyView();
        mojiPlaybackStateHolder.onNewSkypeMessage();
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnMessageAnnotation onmessageannotation)
    {
        if (ecsConfiguration.isHeartMarkedEnabled())
        {
            onmessageannotation = getMessageFromAnnotationEvent(onmessageannotation);
            if (onmessageannotation != null && isFromMe(onmessageannotation) && isSameConversation(onmessageannotation.getConvoIdProp()) && chatListManager.showHeartInAppNotification(onmessageannotation))
            {
                chatListManager.setLastHeartedMessage(onmessageannotation);
                handler.removeMessages(9);
                handler.sendMessageDelayed(handler.obtainMessage(9), 250L);
            }
        }
    }

    void onEvent(com.skype.android.gen.SkyLibListener.OnObjectPropertyChangeWithValue onobjectpropertychangewithvalue)
    {
        if (onobjectpropertychangewithvalue.getPropKey() == PROPKEY.CONTACT_DISPLAYNAME && ContactUtil.e(((Contact)map.a(onobjectpropertychangewithvalue.getObjectID(), com/skype/Contact)).getIdentity()))
        {
            updateScheduler.a(2);
        }
    }

    void onEvent(com.skype.android.gen.SmsListener.OnPropertyChange onpropertychange)
    {
        switch (_cls8..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            handleSmsTargetStatus((Sms)onpropertychange.getSender());
            return;

        case 2: // '\002'
            handleSmsStatus((Sms)onpropertychange.getSender());
            return;

        case 3: // '\003'
        case 4: // '\004'
            messageArea.updateSmsInformation();
            break;
        }
    }

    void onEvent(com.skype.android.gen.TransferListener.OnPropertyChange onpropertychange)
    {
        if (((Transfer)onpropertychange.getSender()).getConvoIdProp() == conversation.getDbID())
        {
            updateScheduler.a(2, 1000L, null);
        }
    }

    public void onEvent(com.skype.android.gen.TranslatorListener.OnTranscribedMessage ontranscribedmessage)
    {
        String s = ontranscribedmessage.getText();
        if (ontranscribedmessage.getConvId() == conversation.getObjectID()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ontranscribedmessage.getMsgId() > 0)
        {
            Integer integer = (Integer)translatedMessagePositions.get(ontranscribedmessage.getMsgId());
            if (integer != null && s != null)
            {
                int i = integer.intValue();
                showTranslationText((j)listView.findViewHolderForPosition(i), s);
                translatedMessagePositions.remove(ontranscribedmessage.getMsgId());
                return;
            } else
            {
                reportTranslatorErrorEvent(ontranscribedmessage.getStatus());
                return;
            }
        }
        String s1 = (String)translatedOriginalTexts.get(Integer.valueOf(ontranscribedmessage.getMsgId()));
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int k;
        if (isTranslationSuccessful(ontranscribedmessage))
        {
            s = ConversationUtil.b(s);
            com.skype.SkyLib.ContentStripXML_Result contentstripxml_result = lib.contentStripXML(s);
            Object obj = conversationUtil.C(conversation);
            obj = FormattedMessageCache.a(((com.skype.android.util.ConversationUtil.TranslatorSetting) (obj)).b, ((com.skype.android.util.ConversationUtil.TranslatorSetting) (obj)).c);
            if (contentstripxml_result.m_return)
            {
                if (ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_ANNOTATION))
                {
                    k = conversation.postTextWithAnnotation(contentstripxml_result.m_result, com.skype.MessageAnnotation.TYPE.TRANSLATION, ((String) (obj)), s1).m_return;
                } else
                {
                    k = conversation.postText(contentstripxml_result.m_result, false);
                }
            } else
            if (ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_ANNOTATION))
            {
                k = conversation.postTextWithAnnotation(s, com.skype.MessageAnnotation.TYPE.TRANSLATION, ((String) (obj)), s1).m_return;
            } else
            {
                k = conversation.postText(s, false);
            }
        } else
        {
            k = conversation.postText(s1, false);
            reportTranslatorErrorEvent(ontranscribedmessage.getStatus());
        }
        translatedOriginalTexts.remove(Integer.valueOf(ontranscribedmessage.getMsgId()));
        if (k <= 0) goto _L1; else goto _L3
_L3:
        reportSendText(s, k);
        return;
        if (s != null) goto _L1; else goto _L4
_L4:
        reportTranslatorErrorEvent(ontranscribedmessage.getStatus());
        return;
    }

    public void onEvent(com.skype.android.gen.TranslatorListener.OnTranslatorStatusChanged ontranslatorstatuschanged)
    {
        if (ontranslatorstatuschanged.getStatus() == com.skype.Translator.TRANSLATOR_STATUS.TRANSLATOR_CONNECT_FAILED_AUTH || ontranslatorstatuschanged.getStatus() == com.skype.Translator.TRANSLATOR_STATUS.TRANSLATOR_CONNECT_FAILED_SVC || ontranslatorstatuschanged.getStatus() == com.skype.Translator.TRANSLATOR_STATUS.TRANSLATOR_CONNECT_FAILED_SESSION || ontranslatorstatuschanged.getStatus() == com.skype.Translator.TRANSLATOR_STATUS.TRANSLATOR_CONNECT_TIMEOUT)
        {
            log.warning((new StringBuilder("Translator status changed ")).append(ontranslatorstatuschanged.getStatus()).toString());
            reportTranslatorErrorEvent(ontranslatorstatuschanged.getStatus());
            return;
        } else
        {
            log.info((new StringBuilder("Translator status changed ")).append(ontranslatorstatuschanged.getStatus()).toString());
            return;
        }
    }

    void onEvent(com.skype.android.gen.VideoMessageListener.OnPropertyChange onpropertychange)
    {
        onpropertychange = (VideoMessage)onpropertychange.getSender();
        map.b(onpropertychange);
        updateScheduler.a(2);
    }

    void onEvent(com.skype.android.gen.VideoMessageListener.OnThumbnailPath onthumbnailpath)
    {
        String s = String.valueOf(onthumbnailpath.getSender().getObjectID());
        if (imageCache.a(s) == null)
        {
            onthumbnailpath = new File(onthumbnailpath.getLocalPath());
            if (onthumbnailpath.exists())
            {
                onthumbnailpath = decodeReasonablySizedBitmap(onthumbnailpath.getAbsolutePath());
                imageCache.a(s, onthumbnailpath);
                updateScheduler.a(2);
            }
        }
    }

    void onEvent(com.skype.android.gen.VoicemailListener.OnPropertyChange onpropertychange)
    {
        if (!accessibility.a() && ((Voicemail)onpropertychange.getSender()).getConvoIdProp() == conversation.getDbID())
        {
            updateScheduler.a(2, 1000L, null);
        }
    }

    void onEvent(com.skype.android.util.cache.SpannedStringCache.OnCleared oncleared)
    {
        adapter.notifyDataSetChanged();
    }

    public void onHeartClick(int i)
    {
        Object obj;
        obj = adapter.getItem(i);
        obj = messageHolderUtil.getMessageObject(((MessageHolder) (obj)));
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        j j1;
        j1 = (j)listView.findViewHolderForPosition(i);
        com.skype.Message.GetOwnAnnotations_Result getownannotations_result = ((Message) (obj)).getOwnAnnotations(com.skype.MessageAnnotation.TYPE.EMOTICON);
        if (!isHeartedByMe(getownannotations_result))
        {
            break; /* Loop/switch isn't completed */
        }
        int k = removeHeart(((Message) (obj)), getownannotations_result, i);
        if (adapter.getCurrentExpandedPosition() == i)
        {
            updateLovedByTextView(j1, ((Message) (obj)), k, false);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int l = addHeart(((Message) (obj)), i);
        if (adapter.getCurrentExpandedPosition() == i)
        {
            updateLovedByTextView(j1, ((Message) (obj)), l, true);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onHideMessageArea()
    {
        removeFocusFromMessageArea();
        View view = getView();
        if (view != null)
        {
            ime.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void onItemClick(int i)
    {
        if (!accessibility.a())
        {
            handleChatItemExpansion(i, true);
        }
    }

    public void onItemLongClick(ObjectInterface objectinterface, int i, boolean flag, String s)
    {
        Bundle bundle;
        bundle = new Bundle();
        if (!accessibility.a())
        {
            bundle.putInt("pendingExpandPosition", i);
            bundle.putBoolean("showTimestampInMenuOption", flag);
        }
        if (!(objectinterface instanceof Transfer)) goto _L2; else goto _L1
_L1:
        objectinterface = (Transfer)objectinterface;
        objectinterface = ObjectInterfaceMenuDialog.create(this, transferUtil.getLocalFilename(objectinterface), objectinterface, bundle);
_L7:
        objectinterface.show(getFragmentManager());
_L4:
        return;
_L2:
        if (!(objectinterface instanceof Message)) goto _L4; else goto _L3
_L3:
        objectinterface = (Message)objectinterface;
        android.support.v7.widget.RecyclerView.v v = listView.findViewHolderForPosition(i);
        if (v instanceof UrlPreviewTextMessageViewHolder)
        {
            bundle.putInt("messageSubTypeOrdinal", ((UrlPreviewTextMessageViewHolder)v).getMessageSubtype().ordinal());
        }
        if (!hasVisibleItems(getChatMessageContextMenuItemIdsVisibility(objectinterface, bundle))) goto _L4; else goto _L5
_L5:
        if (s != null)
        {
            s = new SpannableString(s);
            s.setSpan(new android.text.style.AlignmentSpan.Standard(android.text.Layout.Alignment.ALIGN_CENTER), 0, s.length(), 0);
            objectinterface = ObjectInterfaceMenuDialog.create(this, s, objectinterface, bundle);
        } else
        {
            objectinterface = ObjectInterfaceMenuDialog.create(this, null, objectinterface, bundle);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onKeyboardDismissed()
    {
        dismissKeyboard();
    }

    public void onLoadMoreMessages(int i)
    {
        handler.sendMessageDelayed(handler.obtainMessage(4, Integer.valueOf(i)), 250L);
    }

    public void onMediaBarItemClicked(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756038: 
            permissionRequest.a(Permission.o, true, new PermissionHandlerAdapter() {

                final ChatFragment this$0;

                public final void onGranted()
                {
                    analytics.c(AnalyticsEvent.bX);
                    navigation.toLocation(conversation);
                }

            
            {
                this$0 = ChatFragment.this;
                super();
            }
            });
            return;

        case 2131756034: 
            analytics.c(AnalyticsEvent.cb);
            view = new Intent("android.intent.action.GET_CONTENT");
            view.addCategory("android.intent.category.OPENABLE");
            view.setType("*/*");
            startActivityForResult(Intent.createChooser(view, null), 0);
            return;

        case 2131756036: 
            permissionRequest.a(Permission.m, true, new PermissionHandlerAdapter() {

                final ChatFragment this$0;

                public final void onGranted()
                {
                    analytics.c(AnalyticsEvent.bZ);
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), (new StringBuilder("photo_")).append(System.currentTimeMillis()).append(".jpg").toString());
                    pictureUri = Uri.fromFile(file);
                    intent.putExtra("output", pictureUri);
                    startActivityForResult(intent, 1);
                }

            
            {
                this$0 = ChatFragment.this;
                super();
            }
            });
            return;

        case 2131756037: 
            analytics.c(AnalyticsEvent.ca);
            permissionRequest.a(Permission.l, true, new PermissionHandlerAdapter() {

                final ChatFragment this$0;

                public final void onGranted()
                {
                    analytics.c(AnalyticsEvent.t);
                    startVideoMessageFlow();
                }

            
            {
                this$0 = ChatFragment.this;
                super();
            }
            });
            updateMediaBar();
            return;

        case 2131756035: 
            analytics.c(AnalyticsEvent.bY);
            view = new Intent("android.intent.action.GET_CONTENT");
            view.setType("image/*");
            break;
        }
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            view.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        startActivityForResult(Intent.createChooser(view, getString(0x7f080239)), 2);
    }

    public void onMessageAreaFocused(boolean flag)
    {
        handleMessageAreaFocus(flag);
    }

    public void onMessageAreaTextChanged(CharSequence charsequence)
    {
        if (charsequence.length() == 0)
        {
            setMyTextStatusToReading();
            return;
        } else
        {
            setMyTextStatusToWriting();
            return;
        }
    }

    public void onOtherLovedThisClick(int i)
    {
        Object obj = adapter.getItem(i);
        for (obj = messageHolderUtil.getMessageObject(((MessageHolder) (obj))); obj == null || annotationUtil.getAnnotationCount(((Message) (obj)), com.skype.MessageAnnotation.TYPE.EMOTICON, "heart") <= 1;)
        {
            return;
        }

        HeartsDialog heartsdialog = new HeartsDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("com.skype.objId", ((Message) (obj)).getObjectID());
        heartsdialog.setArguments(bundle);
        heartsdialog.show(getFragmentManager());
    }

    public void onPause()
    {
        super.onPause();
        chatListManager.onChatPaused();
        WiredHeadsetReceiver.b(this);
        BluetoothReceiver.b(this);
    }

    public void onPickerDeleteKey()
    {
        if (messageArea != null)
        {
            messageArea.onDeleteKey();
        }
    }

    public void onPickerDismiss()
    {
        if (messageArea != null)
        {
            if (DeviceFeatures.d())
            {
                setMessageAreaExtraPadding(0);
            }
            messageArea.resumeEditing();
        }
    }

    public void onPickerSearchButtonClicked()
    {
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.H);
        analytics.a(skypetelemetryevent);
        startActivityForResult(navigation.intentForMediaPickerSearch(conversation), 7);
    }

    public void onReloadMoreMessages(long l)
    {
        handler.sendMessageDelayed(handler.obtainMessage(3, Long.valueOf(l)), 250L);
    }

    public void onResume()
    {
        super.onResume();
        messageArea.setHidden(false);
        Long long1 = getTimestampLoadUntil();
        handler.removeMessages(3);
        handler.sendMessage(handler.obtainMessage(3, long1));
        checkMyStatus(false);
        if (!TextUtils.isEmpty(messageArea.getEditText().getText()) && !ConversationUtil.t(conversation) && !doNotShowKeyboard)
        {
            handler.sendEmptyMessageDelayed(1, 500L);
        } else
        {
            chatListManager.requestFocus();
        }
        chatListManager.onChatResumed();
        doNotShowKeyboard = true;
        messageArea.updateSmsTargets();
        if (ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_TEXT) || ConversationUtil.a(conversation, com.skype.Conversation.CAPABILITY.CAN_SEND_SMS)) goto _L2; else goto _L1
_L1:
        updateMessageArea(false);
        mediaBar.setVisibility(8);
        if (!ContactUtil.a(contact)) goto _L4; else goto _L3
_L3:
        messageArea.getEditText().setHint(getString(0x7f0804a3));
_L6:
        handleMigratedP2PConversation();
_L2:
        if (accessibility.a())
        {
            chatListManager.handleAccessbilityForInCallChat(conversation);
        }
        WiredHeadsetReceiver.a(this);
        BluetoothReceiver.a(this);
        updateMediaBar();
        return;
_L4:
        if (ContactUtil.p(contact))
        {
            messageArea.getEditText().setHint("");
            messageArea.setUiElementsVisible(false);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("photoUri", pictureUri);
        bundle.putInt("scrollPosition", chatListManager.computeScrollPosition());
        bundle.putInt("convoTimestamp", conversationTimestamp);
        bundle.putLong("createdTimestamp", chatFragmentCreatedTimestamp);
        if (isLoadingMoreMessagesHeaderVisible())
        {
            adapter.updateExpandPosition(-1);
        }
        bundle.putInt("expandedPosition", adapter.getCurrentExpandedPosition());
        bundle.putIntegerArrayList("playedMojis", mojiPlaybackStateHolder.getPlayedArrayList());
    }

    public void onSendMoji(MojiContent mojicontent)
    {
        mediaDocumentUploadUtil.postMoji(conversation, mojicontent.k());
        dismissKeyboard();
        mruManager.onMojisPosted(mojicontent);
        Object obj = (MediaDocument)map.a(mojicontent.k(), com/skype/MediaDocument);
        SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.ad);
        skypetelemetryevent.put(LogAttributeName.E, mojicontent.m());
        skypetelemetryevent.put(LogAttributeName.F, XmmUtil.getMediaDocumentId(((MediaDocument) (obj))));
        skypetelemetryevent.put(LogAttributeName.G, mojicontent.j().toString());
        LogAttributeName logattributename = LogAttributeName.H;
        if (mojicontent.q())
        {
            obj = "Featured";
        } else
        {
            obj = "Regular";
        }
        skypetelemetryevent.put(logattributename, obj);
        skypetelemetryevent.put(LogAttributeName.I, mojicontent.r());
        skypetelemetryevent.put(LogAttributeName.J, Integer.valueOf(mojicontent.s()));
        analytics.a(skypetelemetryevent);
        mojicontent = new SkypeTelemetryEvent(KpiEvent.b);
        mojicontent.put(KpiAttributeName.l, KpiAttributeValue.e);
        analytics.a(mojicontent);
        switch (ecsConfiguration.getMojiTitleExperimentUserGroupInteger())
        {
        default:
            return;

        case 1: // '\001'
            analytics.a(ExperimentEvent.k, ExperimentTag.b);
            return;

        case 2: // '\002'
            analytics.a(ExperimentEvent.k, ExperimentTag.d);
            break;
        }
    }

    public void onStart()
    {
        super.onStart();
        handler.sendMessageDelayed(handler.obtainMessage(3), 500L);
    }

    public void onStop()
    {
        super.onStop();
        emptyViewManager.resetEmptyView();
        com.skype.android.app.media.MediaDocumentDownloadUtil.TelemetryUrlPreviewFuture.reportUiCacheCount(analytics);
        conversationUtil.d(conversation.getObjectID());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = new ChatViewMonitor(listView);
        adapter = new MessageAdapter(getActivity(), lib, account, userPreferences, mediaDocumentDownloadUtil, mojiPlaybackStateHolder, view, messageHolderUtil, ecsConfiguration, locationUtil, annotationUtil, conversation);
        view = adapter.getMojiMediaMessageViewAdapter(com.skype.Message.TYPE.POSTED_FLIK_MESSAGE);
        if (view != null && (view instanceof MojiMediaMessageViewAdapter))
        {
            lifecycleSupport.addListener((MojiMediaMessageViewAdapter)view);
        }
        chatListManager = new ChatListManager(getActivity(), conversationUtil, contactUtil, timeUtil, lib, timeAnomalyTelemetry);
        chatListManager.configureListView(listView, adapter);
        chatListManager.setChatListCallback(this);
        emptyViewManager = new EmptyViewManager(this, accessibility, navigation, contactUtil, imageCache);
        inputMethodOverlay = new InputMethodOverlay(getActivity(), this, this, this);
        if (contactUtil.i(contact))
        {
            handleUnknownNumberConversation();
            viewState.b(false);
        } else
        {
            updateMessageArea(isMessageAreaEnabled());
        }
        mediaBar.setCallback(this);
        messageArea.setCallback(this);
        if (viewState.d())
        {
            messageArea.toggleSmsMode(viewState.h());
        }
        view = viewState.c();
        if (!TextUtils.isEmpty(view))
        {
            messageArea.getEditText().setText(view);
            messageArea.getEditText().setSelection(view.length());
            view = messageArea;
            int i;
            boolean flag;
            if (!viewState.d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.toggleImageSpan(flag, chatText);
        }
        handleMessageAreaFocus(false);
        removeFocusFromMessageArea();
        view = getActivity().getIntent().getExtras();
        if (view != null && view.containsKey("voicemailToPlay"))
        {
            i = view.getInt("voicemailToPlay");
            getActivity().getIntent().removeExtra("voicemailToPlay");
            ((Voicemail)map.a(i, com/skype/Voicemail)).startPlayback();
            notificationManager.cancel(conversation.getDbID());
        }
        if (ecsConfiguration.getExpMojiForwardExpUserGroup() != ExperimentTag.a)
        {
            analytics.a(ExperimentEvent.h, ecsConfiguration.getExpMojiForwardExpUserGroup());
        }
        heartNotification.setOnClickListener(new android.view.View.OnClickListener() {

            final ChatFragment this$0;

            public final void onClick(View view1)
            {
                handler.removeMessages(10);
                chatListManager.scrollToLastHeartedMessage();
                heartNotification.setVisibility(8);
            }

            
            {
                this$0 = ChatFragment.this;
                super();
            }
        });
    }

    public void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
        if (bundle != null)
        {
            if (bundle.containsKey("photoUri"))
            {
                pictureUri = (Uri)bundle.getParcelable("photoUri");
            }
            conversationTimestamp = bundle.getInt("convoTimestamp", conversation.getInboxTimestampProp());
            chatListManager.setScrollPosition(bundle.getInt("scrollPosition", -1));
            adapter.setCurrentExpandedPosition(bundle.getInt("expandedPosition", -1));
            chatFragmentCreatedTimestamp = bundle.getLong("createdTimestamp", System.currentTimeMillis() / 1000L);
            mojiPlaybackStateHolder.onChatViewStateRestored(bundle.getIntegerArrayList("playedMojis"));
            return;
        } else
        {
            conversationTimestamp = conversation.getInboxTimestampProp();
            return;
        }
    }

    public void removeFocusFromMessageArea()
    {
        chatListManager.requestFocus();
        messageArea.clearFocus();
    }

    public void scoConnected()
    {
    }

    public void scoDisconnected()
    {
    }

    public void sendFileAsync(Uri uri)
    {
        Object obj = null;
        File file = obj;
        if (uri != null)
        {
            uri = PathRetriever.getPath(getContext(), uri, false);
            file = obj;
            if (uri != null)
            {
                file = new File(uri);
            }
        }
        if (file != null && file.exists())
        {
            uri = (new StringBuilder()).append(getString(0x7f0803c4)).append(" ").append(file.getName()).toString();
            mediaDocumentUploadUtil.uploadFileAsync(conversation, file.getName(), file.getPath(), uri, fileCallback);
        }
        uri = new SkypeTelemetryEvent(KpiEvent.b);
        uri.put(KpiAttributeName.l, KpiAttributeValue.c);
        analytics.a(uri);
    }

    public void sendFiles(Uri uri)
    {
        transferUtil.sendFiles(uri, conversation);
        analytics.c(AnalyticsEvent.aV);
        uri = new SkypeTelemetryEvent(KpiEvent.b);
        uri.put(KpiAttributeName.l, KpiAttributeValue.c);
        analytics.a(uri);
    }

    public void sendText(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        String s = charsequence.toString();
        if (!viewState.d()) goto _L4; else goto _L3
_L3:
        sendSms(s);
_L6:
        if (accessibility.a())
        {
            AccessibilityUtil.b(messageArea, getString(0x7f08006d, new Object[] {
                charsequence
            }));
        }
        markConversationConsumed(lib.getServerTime());
_L2:
        if (messageArea != null)
        {
            messageArea.getEditText().setText("");
            viewState.a(null);
        }
        return;
_L4:
        int i;
        i = 0;
        com.skype.android.util.ConversationUtil.TranslatorSetting translatorsetting = conversationUtil.C(conversation);
        if (!conversationUtil.B(conversation) || !ConversationUtil.a(translatorsetting))
        {
            break; /* Loop/switch isn't completed */
        }
        Integer integer = Integer.valueOf(originalTextKey);
        originalTextKey++;
        com.skype.SkyLib.ContentEncodeCloud_Result contentencodecloud_result = lib.contentEncodeCloud(s, true);
        reportTranslatorTextEvent(translatorsetting.b, translatorsetting.c, false);
        boolean flag;
        if (contentencodecloud_result.m_return)
        {
            flag = translator.translateText(integer.intValue(), conversation.getObjectID(), contentencodecloud_result.m_result, translatorsetting.c, translatorsetting.b);
        } else
        {
            flag = translator.translateText(integer.intValue(), conversation.getObjectID(), s, translatorsetting.c, translatorsetting.b);
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        translatedOriginalTexts.put(integer, s);
_L7:
        if (i > 0)
        {
            reportSendText(s, i);
        }
        if (true) goto _L6; else goto _L5
_L5:
        i = conversation.postText(s, false);
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    void setMarkedUnread(boolean flag)
    {
        markedUnread = flag;
    }

    public void setMyTextStatusToReading()
    {
        handler.sendEmptyMessage(5);
    }

    public void setMyTextStatusToWriting()
    {
        updateScheduler.a(6, 1000L, null);
    }

    public void setSmsRecipientPhone(String s)
    {
        byte byte0 = 0;
        viewState.a(s);
        ConversationViewState conversationviewstate = viewState;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        conversationviewstate.b(flag);
        s = mediaBar;
        if (viewState.d())
        {
            byte0 = 8;
        }
        s.setVisibility(byte0);
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        setVisibleOnScreen(flag);
    }

    public void setVisibleOnScreen(boolean flag)
    {
        visibleOnScreen = flag;
    }

    public void showEmoticonPicker()
    {
        inputMethodOverlay.showWithInputMethod(messageArea.getEditText());
        if (DeviceFeatures.d())
        {
            int k = getPickerHeight();
            int i = k;
            if (k == 0)
            {
                i = getActivity().getCurrentFocus().getMeasuredHeight();
            }
            setMessageAreaExtraPadding(i);
        }
        switch (ecsConfiguration.getMojiTitleExperimentUserGroupInteger())
        {
        default:
            return;

        case 1: // '\001'
            analytics.a(ExperimentEvent.j, ExperimentTag.c);
            return;

        case 2: // '\002'
            analytics.a(ExperimentEvent.j, ExperimentTag.e);
            break;
        }
    }

    public boolean showKeyboard()
    {
        return handler.sendEmptyMessageDelayed(1, 250L);
    }

    public void showRingtoneOptions()
    {
        ((CustomizeRingtoneDialog)SkypeDialogFragment.create(conversation, com/skype/android/app/account/CustomizeRingtoneDialog)).show(getFragmentManager());
    }

    public void showTranslatorSetting()
    {
        ((TranslatorSettingDialog)SkypeDialogFragment.create(conversation, com/skype/android/app/chat/TranslatorSettingDialog)).show(getFragmentManager());
    }

    public void startVideoMessageFlow()
    {
        navigation.videoMessage(conversation);
    }

    public void toggleMessageAreaForSMS(boolean flag)
    {
        if (!viewState.d() && flag)
        {
            messageArea.toggleSmsMode((String)((Pair)getAvailableSmsTargets().get(0)).second);
            return;
        } else
        {
            messageArea.toggleSmsMode(null);
            return;
        }
    }








/*
    static Uri access$402(ChatFragment chatfragment, Uri uri)
    {
        chatfragment.pictureUri = uri;
        return uri;
    }

*/
}
