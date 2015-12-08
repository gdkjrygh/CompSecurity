// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.java.strings.Strings;

// Referenced classes of package com.soundcloud.android.view:
//            EmptyView

public class EmptyViewBuilder
{

    private Intent action;
    private String actionText;
    private int image;
    private String messageText;
    private String secondaryText;

    public EmptyViewBuilder()
    {
    }

    private String getTextForUser(Context context, int i, String s)
    {
        String s1 = s;
        if (Strings.isBlank(s))
        {
            s1 = context.getString(0x7f070200);
        }
        return context.getString(i, new Object[] {
            s1
        });
    }

    public EmptyView build(Context context)
    {
        return configure(new EmptyView(context));
    }

    public EmptyView configure(EmptyView emptyview)
    {
        if (messageText != null)
        {
            emptyview.setMessageText(messageText);
        }
        if (actionText != null)
        {
            emptyview.setActionText(actionText);
        }
        if (secondaryText != null)
        {
            emptyview.setSecondaryText(secondaryText);
        }
        if (image > 0)
        {
            emptyview.setImage(image);
        }
        emptyview.setButtonActions(action);
        return emptyview;
    }

    public void configureForSearch(EmptyView emptyview)
    {
        emptyview.setImage(0x7f020103);
        emptyview.setMessageText(0x7f0701d3);
        emptyview.setSecondaryText(0x7f0701d4);
    }

    public EmptyViewBuilder forContent(Context context, Uri uri, String s)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.storage.provider.Content[Content.match(uri).ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
            image = 0x7f0200fc;
            messageText = context.getString(0x7f070154);
            secondaryText = context.getString(0x7f070155);
            return this;

        case 2: // '\002'
            image = 0x7f020104;
            messageText = context.getString(0x7f07015e);
            return this;

        case 3: // '\003'
            image = 0x7f020104;
            messageText = getTextForUser(context, 0x7f070126, s);
            return this;

        case 4: // '\004'
            image = 0x7f020101;
            messageText = context.getString(0x7f07015d);
            return this;

        case 5: // '\005'
            image = 0x7f020101;
            messageText = getTextForUser(context, 0x7f070125, s);
            return this;

        case 6: // '\006'
            messageText = context.getString(0x7f07015c);
            image = 0x7f020100;
            return this;

        case 7: // '\007'
            image = 0x7f020100;
            messageText = getTextForUser(context, 0x7f070124, s);
            return this;

        case 8: // '\b'
            image = 0x7f0200fd;
            messageText = getTextForUser(context, 0x7f070122, s);
            return this;

        case 9: // '\t'
            image = 0x7f0200fe;
            messageText = context.getString(0x7f07015b);
            actionText = context.getString(0x7f070158);
            action = new Intent("com.soundcloud.android.action.SEARCH");
            return this;

        case 10: // '\n'
            image = 0x7f0200fe;
            break;
        }
        messageText = getTextForUser(context, 0x7f070123, s);
        return this;
    }

    public EmptyViewBuilder withImage(int i)
    {
        image = i;
        return this;
    }

    public EmptyViewBuilder withMessageText(int i)
    {
        return this;
    }

    public EmptyViewBuilder withMessageText(String s)
    {
        messageText = s;
        return this;
    }

    public EmptyViewBuilder withSecondaryText(String s)
    {
        secondaryText = s;
        return this;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

        static 
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_ACTIVITIES.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_SOUNDS.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER_SOUNDS.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_PLAYLISTS.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER_PLAYLISTS.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_LIKES.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER_LIKES.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER_FOLLOWERS.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.ME_FOLLOWINGS.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER_FOLLOWINGS.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
