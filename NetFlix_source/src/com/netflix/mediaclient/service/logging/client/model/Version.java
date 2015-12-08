// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import android.content.Context;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class Version
{

    public static final String APP = "app";
    public static final String MDXJS = "mdxjs";
    public static final String MDXLIB = "mdxlib";
    public static final String NRDAPP = "nrdapp";
    public static final String NRDLIB = "nrdlib";
    public static final String NRDSDK = "nrdsdk";
    public static final String UI = "ui";
    private String app;
    private String mdxjs;
    private String mdxlib;
    private String nrdapp;
    private String nrdlib;
    private String nrdsdk;
    private String ui;

    public Version()
    {
    }

    Version(Context context)
    {
        app = AndroidManifestUtils.getVersionName(context);
        ui = app;
        nrdapp = SecurityRepository.getNrdAppVersion();
        nrdlib = SecurityRepository.getNrdLibVersion();
        mdxlib = SecurityRepository.getMdxLibVersion();
        mdxjs = SecurityRepository.getMdxJsVersion();
        nrdsdk = SecurityRepository.getNrdSdkVersion();
    }

    public static Version createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            Version version = new Version();
            version.app = JsonUtils.getString(jsonobject, "app", null);
            version.ui = JsonUtils.getString(jsonobject, "ui", null);
            version.nrdapp = JsonUtils.getString(jsonobject, "nrdapp", null);
            version.nrdlib = JsonUtils.getString(jsonobject, "nrdlib", null);
            version.mdxlib = JsonUtils.getString(jsonobject, "mdxlib", null);
            version.mdxjs = JsonUtils.getString(jsonobject, "mdxjs", null);
            version.nrdsdk = JsonUtils.getString(jsonobject, "nrdsdk", null);
            return version;
        }
    }

    public String getApp()
    {
        return app;
    }

    public String getMdxjs()
    {
        return mdxjs;
    }

    public String getMdxlib()
    {
        return mdxlib;
    }

    public String getNrdapp()
    {
        return nrdapp;
    }

    public String getNrdlib()
    {
        return nrdlib;
    }

    public String getNrdsdk()
    {
        return nrdsdk;
    }

    public String getUi()
    {
        return ui;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (app != null)
        {
            jsonobject.put("app", app);
        }
        if (ui != null)
        {
            jsonobject.put("ui", ui);
        }
        if (nrdapp != null)
        {
            jsonobject.put("nrdapp", nrdapp);
        }
        if (nrdlib != null)
        {
            jsonobject.put("nrdlib", nrdlib);
        }
        if (mdxlib != null)
        {
            jsonobject.put("mdxlib", mdxlib);
        }
        if (mdxjs != null)
        {
            jsonobject.put("mdxjs", mdxjs);
        }
        if (nrdsdk != null)
        {
            jsonobject.put("nrdsdk", nrdsdk);
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Version [app=").append(app).append(", ui=").append(ui).append(", nrdapp=").append(nrdapp).append(", nrdlib=").append(nrdlib).append(", mdxlib=").append(mdxlib).append(", mdxjs=").append(mdxjs).append(", nrdsdk=").append(nrdsdk).append("]").toString();
    }
}
