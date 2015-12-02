// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.c;

import android.net.Uri;
import android.provider.BaseColumns;

public final class j
    implements BaseColumns
{

    public static final Uri a = Uri.parse("content://mms-sms/");
    public static final Uri b = Uri.parse("content://mms-sms/conversations");
    public static final Uri c = Uri.parse("content://mms-sms/messages/byphone");
    public static final Uri d = Uri.parse("content://mms-sms/undelivered");
    public static final Uri e = Uri.parse("content://mms-sms/draft");
    public static final Uri f = Uri.parse("content://mms-sms/locked");
    public static final Uri g = Uri.parse("content://mms-sms/search");

    public j()
    {
    }

}
