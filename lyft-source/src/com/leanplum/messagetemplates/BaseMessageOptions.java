// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Log;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.utils.BitmapUtil;

// Referenced classes of package com.leanplum.messagetemplates:
//            MessageTemplates

abstract class BaseMessageOptions
{

    private int acceptButtonBackgroundColor;
    private String acceptButtonText;
    private int acceptButtonTextColor;
    private int backgroundColor;
    private Bitmap backgroundImage;
    private ActionContext context;
    private int messageColor;
    private String messageText;
    private String title;
    private int titleColor;

    protected BaseMessageOptions(ActionContext actioncontext)
    {
        context = actioncontext;
        setTitle(actioncontext.stringNamed("Title.Text"));
        setTitleColor(actioncontext.numberNamed("Title.Color").intValue());
        setMessageText(actioncontext.stringNamed("Message.Text"));
        setMessageColor(actioncontext.numberNamed("Message.Color").intValue());
        java.io.InputStream inputstream = actioncontext.streamNamed("Background image");
        if (inputstream != null)
        {
            try
            {
                setBackgroundImage(BitmapFactory.decodeStream(inputstream));
            }
            catch (Exception exception)
            {
                Log.e("Leanplum", "Error loading background image", exception);
            }
        }
        setBackgroundColor(actioncontext.numberNamed("Background color").intValue());
        setAcceptButtonText(actioncontext.stringNamed("Accept button.Text"));
        setAcceptButtonBackgroundColor(actioncontext.numberNamed("Accept button.Background color").intValue());
        setAcceptButtonTextColor(actioncontext.numberNamed("Accept button.Text color").intValue());
    }

    private void setAcceptButtonBackgroundColor(int i)
    {
        acceptButtonBackgroundColor = i;
    }

    private void setAcceptButtonText(String s)
    {
        acceptButtonText = s;
    }

    private void setAcceptButtonTextColor(int i)
    {
        acceptButtonTextColor = i;
    }

    private void setBackgroundColor(int i)
    {
        backgroundColor = i;
    }

    private void setBackgroundImage(Bitmap bitmap)
    {
        backgroundImage = bitmap;
    }

    private void setMessageColor(int i)
    {
        messageColor = i;
    }

    private void setMessageText(String s)
    {
        messageText = s;
    }

    private void setTitle(String s)
    {
        title = s;
    }

    private void setTitleColor(int i)
    {
        titleColor = i;
    }

    public static ActionArgs toArgs(Context context1)
    {
        return (new ActionArgs()).with("Title.Text", MessageTemplates.a(context1)).withColor("Title.Color", 0xff000000).with("Message.Text", "Popup message goes here.").withColor("Message.Color", 0xff000000).withFile("Background image", null).withColor("Background color", -1).with("Accept button.Text", "OK").withColor("Accept button.Background color", -1).withColor("Accept button.Text color", Color.argb(255, 0, 122, 255)).withAction("Accept action", null);
    }

    public void accept()
    {
        context.runTrackedActionNamed("Accept action");
    }

    public int getAcceptButtonBackgroundColor()
    {
        return acceptButtonBackgroundColor;
    }

    public String getAcceptButtonText()
    {
        return acceptButtonText;
    }

    public int getAcceptButtonTextColor()
    {
        return acceptButtonTextColor;
    }

    public int getBackgroundColor()
    {
        return backgroundColor;
    }

    public Bitmap getBackgroundImage()
    {
        return backgroundImage;
    }

    public Bitmap getBackgroundImageRounded(int i)
    {
        return BitmapUtil.getRoundedCornerBitmap(backgroundImage, i);
    }

    public int getMessageColor()
    {
        return messageColor;
    }

    public String getMessageText()
    {
        return messageText;
    }

    public String getTitle()
    {
        return title;
    }

    public int getTitleColor()
    {
        return titleColor;
    }
}
