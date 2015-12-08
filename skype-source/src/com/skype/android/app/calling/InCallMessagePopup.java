// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.SkypeApplication;
import com.skype.android.app.chat.ChatMessageUtils;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.res.ChatText;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.MessagePopup;
import com.skype.android.widget.PathClippedImageView;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.skype.android.app.calling:
//            InCallMessagePopupComponent, DaggerInCallMessagePopupComponent

public class InCallMessagePopup extends MessagePopup
    implements android.os.Handler.Callback
{

    protected static final float AVATAR_BUBBLE_PERCENTAGE = 0.3F;
    protected static final float AVATAR_PADDING_PERCENTAGE = 0.6F;
    private static final int SMALL_SCREEN_SIZE = 480;
    private static final int WHAT_CLEAR = 3;
    private static final int WHAT_HIDE = 2;
    private static final int WHAT_SHOW = 1;
    protected PathClippedImageView avatar;
    ChatText chatText;
    private InCallMessagePopupComponent component;
    EcsConfiguration configuration;
    ContactUtil contactUtil;
    ImageCache imageCache;
    SkyLib lib;
    private final LinkedList messageQueue;
    TransferUtil transferUtil;
    UserPreferences userPreferences;

    public InCallMessagePopup(Context context)
    {
        this(context, null);
    }

    public InCallMessagePopup(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public InCallMessagePopup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        messageQueue = new LinkedList();
        getComponent().inject(this);
    }

    private InCallMessagePopupComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerInCallMessagePopupComponent.builder().skypeApplicationComponent(((SkypeApplication)getContext().getApplicationContext()).a()).build();
        }
        return component;
    }

    private Contact getContact(Message message)
    {
        String s = message.getAuthorProp();
        Contact contact = (Contact)identityMap.get(s);
        message = contact;
        if (contact == null)
        {
            message = new ContactImpl();
            lib.getContact(s, message);
            identityMap.put(s, message);
        }
        return message;
    }

    public void addMessage(Message message)
    {
        synchronized (messageQueue)
        {
            messageQueue.addLast(message);
            if (messageQueue.size() == 1)
            {
                showMessage(message);
            }
        }
        return;
        message;
        linkedlist;
        JVM INSTR monitorexit ;
        throw message;
    }

    public void clearQueue()
    {
        handler.removeMessages(1);
        handler.removeMessages(2);
        handler.sendEmptyMessage(3);
    }

    public boolean handleMessage(android.os.Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 34
    //                   2 41
    //                   3 107;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        show();
        continue; /* Loop/switch isn't completed */
_L3:
        message = messageQueue;
        message;
        JVM INSTR monitorenter ;
        if (messageQueue.size() > 0)
        {
            messageQueue.removeFirst();
        }
        if (!messageQueue.isEmpty())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        dismiss();
_L5:
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        showMessage((Message)messageQueue.getFirst());
        if (true) goto _L5; else goto _L4
_L4:
        synchronized (messageQueue)
        {
            messageQueue.clear();
            dismiss();
        }
        if (true) goto _L1; else goto _L6
_L6:
        exception1;
        message;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        contentView = (TextView)findViewById(0x7f1003a7);
        new SpannedAnimationDrawableCallback(contentView);
        avatar = (PathClippedImageView)findViewById(0x7f1003a8);
        avatar.setBorderWidth(0);
    }

    protected void resizeComponents(int i)
    {
        contentView.setWidth(i);
        contentView.setHeight(i);
        int j = (int)((float)i * 0.3F);
        avatar.getLayoutParams().width = j;
        avatar.getLayoutParams().height = j;
        if (availableScreenSpace <= 480)
        {
            j = (int)((float)j * 0.6F);
        }
        contentView.setPadding(contentView.getPaddingLeft(), j, contentView.getPaddingRight(), j);
        currentBubbleSize = i;
    }

    protected void showMessage(final Message m)
    {
        Object obj;
        boolean flag1;
        obj = m.getBodyXmlProp();
        flag1 = false;
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$Message$TYPE[];

            static 
            {
                $SwitchMap$com$skype$Message$TYPE = new int[com.skype.Message.TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FILES.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Message$TYPE[com.skype.Message.TYPE.POSTED_FLIK_MESSAGE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2..SwitchMap.com.skype.Message.TYPE[m.getTypeProp().ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 199
    //                   2 218;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_218;
_L1:
        obj = chatText.a(((String) (obj)), Integer.valueOf(0));
        flag1 = true;
_L4:
        CharSequence charsequence;
        boolean flag;
        URLSpan aurlspan[];
        int k;
        if (((CharSequence) (obj)).length() < getResources().getInteger(0x7f0e0000) || ChatMessageUtils.allSpansAreEmoticons(((CharSequence) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setTextOnLayout = true;
        charsequence = ((CharSequence) (obj));
        if (flag)
        {
            charsequence = ((CharSequence) (obj));
            if (flag1)
            {
                charsequence = ((CharSequence) (obj));
                if (ChatMessageUtils.shouldShowBigEmoticons(configuration, userPreferences))
                {
                    setTextOnLayout = false;
                    charsequence = ChatMessageUtils.getLargeEmoticonSpan(((CharSequence) (obj)), userPreferences);
                }
            }
        }
        obj = (Spannable)charsequence;
        aurlspan = (URLSpan[])((Spannable) (obj)).getSpans(0, ((Spannable) (obj)).length(), android/text/style/URLSpan);
        k = aurlspan.length;
        for (int j = 0; j < k; j++)
        {
            ((Spannable) (obj)).removeSpan(aurlspan[j]);
        }

        break MISSING_BLOCK_LABEL_245;
_L2:
        obj = new SpannableString(transferUtil.getMessageNotification(m));
          goto _L4
        obj = new SpannableString(getContext().getString(0x7f0804c5));
          goto _L4
        TextView textview = contentView;
        Context context = getContext();
        int i;
        if (flag)
        {
            i = 0x7f090182;
        } else
        {
            i = 0x7f090183;
        }
        textview.setTextAppearance(context, i);
        contentView.setText(charsequence);
        imageCache.a(getContact(m), avatar, new UiCallback(this, new AsyncCallback() {

            final InCallMessagePopup this$0;
            final Message val$m;

            public final void done(AsyncResult asyncresult)
            {
                Bitmap bitmap = (Bitmap)asyncresult.a();
                asyncresult = (ImageView)asyncresult.b();
                if (bitmap != null)
                {
                    asyncresult.setImageBitmap(bitmap);
                    return;
                } else
                {
                    asyncresult.setImageDrawable(contactUtil.a(getContact(m), com.skype.android.res.DefaultAvatars.AvatarSize.b));
                    return;
                }
            }

            
            {
                this$0 = InCallMessagePopup.this;
                m = message;
                super();
            }
        }));
        handler.sendEmptyMessage(1);
        handler.sendEmptyMessageDelayed(2, 5000L);
        return;
    }

}
