// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import java.io.Serializable;

public class TLFCacheFile
    implements Serializable
{

    private static final long serialVersionUID = 0x606fd8b96a0aef31L;
    private Boolean _isImage;
    private Object data;
    private String directory;
    private String fileName;
    private Boolean hasUICData;
    private String moduleName;
    private String sessionId;

    public TLFCacheFile()
    {
        _isImage = Boolean.valueOf(false);
        hasUICData = Boolean.valueOf(false);
    }

    public TLFCacheFile(Object obj, String s, Boolean boolean1, String s1)
    {
        isImage(Boolean.valueOf(false));
        setData(obj);
        setSessionId(s);
        setHasUICData(boolean1);
        setModuleName(s1);
    }

    public final Boolean clean()
    {
        isImage(Boolean.valueOf(false));
        setData(null);
        setSessionId(null);
        setDirectory(null);
        setFileName(null);
        setHasUICData(Boolean.valueOf(false));
        return Boolean.valueOf(true);
    }

    public final Object getData()
    {
        return data;
    }

    public final String getDirectory()
    {
        return directory;
    }

    public final String getFileName()
    {
        return fileName;
    }

    public final Boolean getHasUICData()
    {
        return hasUICData;
    }

    public final String getModuleName()
    {
        return moduleName;
    }

    public final String getSessionId()
    {
        return sessionId;
    }

    public final Boolean isImage()
    {
        return _isImage;
    }

    public final void isImage(Boolean boolean1)
    {
        _isImage = boolean1;
    }

    public final void setData(Object obj)
    {
        data = obj;
    }

    public final void setDirectory(String s)
    {
        directory = s;
    }

    public final void setFileName(String s)
    {
        fileName = s;
    }

    public final void setHasUICData(Boolean boolean1)
    {
        hasUICData = boolean1;
    }

    public final void setModuleName(String s)
    {
        moduleName = s;
    }

    public final void setSessionId(String s)
    {
        sessionId = s;
    }
}
