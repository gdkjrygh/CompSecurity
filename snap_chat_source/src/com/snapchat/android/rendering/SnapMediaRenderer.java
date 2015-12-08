// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.rendering;

import android.view.ViewGroup;
import sR;
import sT;

public interface SnapMediaRenderer
{
    public static final class ErrorCode extends Enum
    {

        private static final ErrorCode $VALUES[];
        public static final ErrorCode CANNOT_DECRYPT_MEDIA_ERROR;
        public static final ErrorCode EXTERNAL_STORAGE_REQUIRED;
        public static final ErrorCode MEDIA_UNAVAILABLE_LOCALLY;
        public static final ErrorCode PLAYBACK_ERROR;

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/snapchat/android/rendering/SnapMediaRenderer$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])$VALUES.clone();
        }

        static 
        {
            EXTERNAL_STORAGE_REQUIRED = new ErrorCode("EXTERNAL_STORAGE_REQUIRED", 0);
            MEDIA_UNAVAILABLE_LOCALLY = new ErrorCode("MEDIA_UNAVAILABLE_LOCALLY", 1);
            CANNOT_DECRYPT_MEDIA_ERROR = new ErrorCode("CANNOT_DECRYPT_MEDIA_ERROR", 2);
            PLAYBACK_ERROR = new ErrorCode("PLAYBACK_ERROR", 3);
            $VALUES = (new ErrorCode[] {
                EXTERNAL_STORAGE_REQUIRED, MEDIA_UNAVAILABLE_LOCALLY, CANNOT_DECRYPT_MEDIA_ERROR, PLAYBACK_ERROR
            });
        }

        private ErrorCode(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a();

        public abstract void a(int i, int j, int k);

        public abstract void a(ErrorCode errorcode);

        public abstract void b();
    }


    public abstract void a();

    public abstract void a(ViewGroup viewgroup);

    public abstract void a(sT st, sR sr, a a1, boolean flag);

    public abstract void a(boolean flag);

    public abstract void b();

    public abstract void b(boolean flag);

    public abstract void c();

    public abstract void d();
}
