// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import com.adobe.adobepass.accessenabler.models.Event;
import com.adobe.adobepass.accessenabler.models.MetadataKey;
import com.adobe.adobepass.accessenabler.models.MetadataStatus;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import java.util.ArrayList;

public interface IAccessEnablerDelegate
{

    public abstract void displayProviderDialog(ArrayList arraylist);

    public abstract void navigateToUrl(String s);

    public abstract void preauthorizedResources(ArrayList arraylist);

    public abstract void selectedProvider(Mvpd mvpd);

    public abstract void sendTrackingData(Event event, ArrayList arraylist);

    public abstract void setAuthenticationStatus(int i, String s);

    public abstract void setMetadataStatus(MetadataKey metadatakey, MetadataStatus metadatastatus);

    public abstract void setRequestorComplete(int i);

    public abstract void setToken(String s, String s1);

    public abstract void tokenRequestFailed(String s, String s1, String s2);
}
