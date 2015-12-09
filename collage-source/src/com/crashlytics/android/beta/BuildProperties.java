// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class BuildProperties
{

    private static final String BUILD_ID = "build_id";
    private static final String PACKAGE_NAME = "package_name";
    private static final String VERSION_CODE = "version_code";
    private static final String VERSION_NAME = "version_name";
    public final String buildId;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    BuildProperties(String s, String s1, String s2, String s3)
    {
        versionCode = s;
        versionName = s1;
        buildId = s2;
        packageName = s3;
    }

    public static BuildProperties fromProperties(Properties properties)
    {
        return new BuildProperties(properties.getProperty("version_code"), properties.getProperty("version_name"), properties.getProperty("build_id"), properties.getProperty("package_name"));
    }

    public static BuildProperties fromPropertiesStream(InputStream inputstream)
        throws IOException
    {
        Properties properties = new Properties();
        properties.load(inputstream);
        return fromProperties(properties);
    }
}
