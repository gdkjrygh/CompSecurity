// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

public final class DataUtils
{

    public static void copyStringToBuffer(String s, CharArrayBuffer chararraybuffer)
    {
        if (TextUtils.isEmpty(s))
        {
            chararraybuffer.sizeCopied = 0;
        } else
        if (chararraybuffer.data == null || chararraybuffer.data.length < s.length())
        {
            chararraybuffer.data = s.toCharArray();
        } else
        {
            s.getChars(0, s.length(), chararraybuffer.data, 0);
        }
        chararraybuffer.sizeCopied = s.length();
    }

    public static byte[] loadImageBytes(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }
}
