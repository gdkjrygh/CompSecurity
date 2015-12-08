// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import com.microsoft.applications.telemetry.EventProperties;
import com.microsoft.applications.telemetry.ILogger;
import com.microsoft.applications.telemetry.ISemanticContext;
import com.microsoft.applications.telemetry.LogConfiguration;
import com.microsoft.applications.telemetry.LogManager;
import com.microsoft.applications.telemetry.PiiKind;
import com.skype.Account;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.AccountProvider;
import com.skype.telemetry.event.TelemetryEvent;
import com.skype.telemetry.sdk.AriaAccessInterface;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class AriaAccess
    implements AriaAccessInterface
{

    private AtomicBoolean a;
    private volatile ILogger b;
    private final AccountProvider c;
    private final EcsConfiguration d;
    private final BlockingDeque e = new LinkedBlockingDeque();

    public AriaAccess(Application application, AsyncService asyncservice, String s, LogConfiguration logconfiguration, AccountProvider accountprovider, EcsConfiguration ecsconfiguration)
    {
        a = new AtomicBoolean(false);
        c = accountprovider;
        d = ecsconfiguration;
        try
        {
            System.loadLibrary("telemetryclient");
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            throw new RuntimeException(application.getMessage(), application);
        }
        asyncservice.a(new Runnable(application, s, logconfiguration) {

            final Application a;
            final String b;
            final LogConfiguration c;
            final AriaAccess d;

            public final void run()
            {
                LogManager.initialize(a, b, c);
                AriaAccess.a(d, LogManager.getLogger());
                AriaAccess.a(d).getSemanticContext().setAppId("D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A");
                AriaAccess.b(d).set(true);
                for (; !AriaAccess.c(d).isEmpty(); AriaAccess.a(d, (TelemetryEvent)AriaAccess.c(d).poll())) { }
            }

            
            {
                d = AriaAccess.this;
                a = application;
                b = s;
                c = logconfiguration;
                super();
            }
        });
    }

    static ILogger a(AriaAccess ariaaccess)
    {
        return ariaaccess.b;
    }

    static ILogger a(AriaAccess ariaaccess, ILogger ilogger)
    {
        ariaaccess.b = ilogger;
        return ilogger;
    }

    static void a(AriaAccess ariaaccess, TelemetryEvent telemetryevent)
    {
        ariaaccess.b(telemetryevent);
    }

    static AtomicBoolean b(AriaAccess ariaaccess)
    {
        return ariaaccess.a;
    }

    private void b(TelemetryEvent telemetryevent)
    {
        EventProperties eventproperties = new EventProperties(telemetryevent.getName());
        eventproperties.setName(telemetryevent.getName());
        if (telemetryevent.hasAttributes())
        {
            java.util.Map.Entry entry;
            for (telemetryevent = telemetryevent.getAttributes().entrySet().iterator(); telemetryevent.hasNext(); eventproperties.setProperty((String)entry.getKey(), String.valueOf(entry.getValue()), PiiKind.NONE))
            {
                entry = (java.util.Map.Entry)telemetryevent.next();
            }

        }
        eventproperties.setProperty("Platform_Uiversion", "20703/6.13.0.608", PiiKind.NONE);
        eventproperties.setProperty("Client_Name", "Android", PiiKind.NONE);
        eventproperties.setProperty("Skype_InitiatingUser_Username", c.get().getSkypenameProp(), PiiKind.NONE);
        eventproperties.setProperty("ecs_etag", d.getETag(), PiiKind.NONE);
        eventproperties.setProperty("UserId", c.get().getSkypenameProp(), PiiKind.IDENTITY);
        b.logEvent(eventproperties);
    }

    static BlockingDeque c(AriaAccess ariaaccess)
    {
        return ariaaccess.e;
    }

    public final void a(TelemetryEvent telemetryevent)
    {
        if (!a.get())
        {
            e.add(telemetryevent);
            return;
        } else
        {
            b(telemetryevent);
            return;
        }
    }
}
