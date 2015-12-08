// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Spannable;
import android.view.View;
import com.snapchat.android.model.chat.ChatConversation;
import java.util.List;

public final class BB extends BM
{

    private static final String DEFAULT_ID = "CHAT_LOADING_DEFAULT_HEADER";
    private static final String HEADER_ID_SUFFIX = "CHAT_LOADING_HEADER";
    public final String mConversationId;
    public oy mLoadConversationPageTaskExecutor;
    public boolean mShouldUserIterToken;
    public com.snapchat.android.api2.chat.LoadConversationPageTask.TaskStatus mTaskStatus;

    public BB(String s, boolean flag)
    {
        mConversationId = s;
        mShouldUserIterToken = flag;
        mLoadConversationPageTaskExecutor = oy.a();
        mId = (new StringBuilder("CHAT_LOADING_DEFAULT_HEADER")).append(mShouldUserIterToken).toString();
    }

    public final volatile boolean Q()
    {
        return super.Q();
    }

    public final volatile boolean R()
    {
        return super.R();
    }

    public final volatile boolean S()
    {
        return super.S();
    }

    public final volatile boolean T()
    {
        return super.T();
    }

    public final volatile long W()
    {
        return super.W();
    }

    public final volatile long Y()
    {
        return super.Y();
    }

    public final volatile Fd a(View view, ChatConversation chatconversation)
    {
        return super.a(view, chatconversation);
    }

    public final volatile String a()
    {
        return super.a();
    }

    public final volatile long ae()
    {
        return super.ae();
    }

    public final volatile boolean ak()
    {
        return super.ak();
    }

    public final volatile String an()
    {
        return super.an();
    }

    public final volatile Spannable ao()
    {
        return super.ao();
    }

    public final volatile boolean aq()
    {
        return super.aq();
    }

    public final volatile int b(ChatConversation chatconversation)
    {
        return super.b(chatconversation);
    }

    public final volatile String b()
    {
        return super.b();
    }

    public final volatile void c(long l)
    {
        super.c(l);
    }

    public final volatile boolean c()
    {
        return super.c();
    }

    public final volatile String d()
    {
        return super.d();
    }

    public final volatile String j()
    {
        return super.j();
    }

    public final volatile List k()
    {
        return super.k();
    }

    public final volatile boolean p()
    {
        return super.p();
    }

    public final volatile boolean q()
    {
        return super.q();
    }

    public final volatile boolean r()
    {
        return super.r();
    }
}
