// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import com.mobvista.sdk.m.a.a.d.a;
import com.mobvista.sdk.m.a.a.d.b;
import com.mobvista.sdk.m.a.e.c;
import com.mobvista.sdk.m.a.e.d;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            u

public final class JumpLoader extends a
    implements d
{

    JumpLoaderResult a;
    private int b;
    private String c;
    private b d;
    private boolean e;

    public JumpLoader()
    {
        b = 0;
        c = null;
        a = null;
        d = null;
        e = true;
    }

    public final void a(Context context, String s, b b1, boolean flag)
    {
        c = new String(s);
        d = b1;
        a = null;
        (new u()).a(context, s, b1, flag);
    }

    public final void a(c c1)
    {
    }

    public final boolean a()
    {
        return e;
    }

    public final void b()
    {
        e = false;
    }

    public final void b(c c1)
    {
        while (!e || d == null) 
        {
            return;
        }
        if (a.isSuccess())
        {
            d.a(a);
            return;
        } else
        {
            d.a(a.getMsg());
            return;
        }
    }

    private class JumpLoaderResult
        implements NoProGuard, Serializable
    {

        public static final int CODE_DOWNLOAD = 3;
        public static final int CODE_LINK = 2;
        public static final int CODE_MARKET = 1;
        public static final int CODE_NULL = 4;
        private static final long serialVersionUID = 1L;
        private int code;
        private String content;
        private boolean jumpDone;
        private String msg;
        private String noticeurl;
        private boolean success;
        private String url;

        public int getCode()
        {
            return code;
        }

        public String getContent()
        {
            return content;
        }

        public String getMsg()
        {
            return msg;
        }

        public String getNoticeurl()
        {
            return noticeurl;
        }

        public String getUrl()
        {
            return url;
        }

        public boolean isSuccess()
        {
            return success;
        }

        public boolean isjumpDone()
        {
            return jumpDone;
        }

        public void setCode(int i)
        {
            code = i;
        }

        public void setContent(String s)
        {
            content = s;
        }

        public void setMsg(String s)
        {
            msg = s;
        }

        public void setNoticeurl(String s)
        {
            noticeurl = s;
        }

        public void setSuccess(boolean flag)
        {
            success = flag;
        }

        public void setUrl(String s)
        {
            url = s;
        }

        public void setjumpDone(boolean flag)
        {
            jumpDone = flag;
        }

        public JumpLoaderResult()
        {
        }
    }

}
