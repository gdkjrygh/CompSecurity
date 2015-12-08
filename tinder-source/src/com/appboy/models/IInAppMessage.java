// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models;

import android.graphics.Bitmap;
import android.net.Uri;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.enums.inappmessage.DismissType;
import java.util.Map;
import org.json.JSONObject;

public interface IInAppMessage
{

    public abstract JSONObject forJsonPut();

    public abstract boolean getAnimateIn();

    public abstract boolean getAnimateOut();

    public abstract int getBackgroundColor();

    public abstract Bitmap getBitmap();

    public abstract ClickAction getClickAction();

    public abstract DismissType getDismissType();

    public abstract int getDurationInMilliseconds();

    public abstract Map getExtras();

    public abstract String getIcon();

    public abstract int getIconBackgroundColor();

    public abstract int getIconColor();

    public abstract boolean getImageDownloadSuccessful();

    public abstract String getImageUrl();

    public abstract String getMessage();

    public abstract int getMessageTextColor();

    public abstract Uri getUri();

    public abstract boolean logClick();

    public abstract boolean logImpression();

    public abstract void setAnimateIn(boolean flag);

    public abstract void setAnimateOut(boolean flag);

    public abstract void setBackgroundColor(int i);

    public abstract void setBitmap(Bitmap bitmap);

    public abstract boolean setClickAction(ClickAction clickaction);

    public abstract boolean setClickAction(ClickAction clickaction, Uri uri);

    public abstract void setDismissType(DismissType dismisstype);

    public abstract void setDurationInMilliseconds(int i);

    public abstract void setIcon(String s);

    public abstract void setIconBackgroundColor(int i);

    public abstract void setIconColor(int i);

    public abstract void setImageDownloadSuccessful(boolean flag);

    public abstract void setImageUrl(String s);

    public abstract void setMessage(String s);

    public abstract void setMessageTextColor(int i);
}
