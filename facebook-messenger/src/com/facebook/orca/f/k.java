// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.location.Location;
import android.net.Uri;
import com.facebook.fbservice.service.s;
import com.facebook.location.r;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.p;
import java.util.List;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.f:
//            ad, af, ae

public class k
    implements p
{

    private static final Class a = com/facebook/orca/f/k;
    private final a b;
    private final ad c;
    private final r d;
    private final af e;

    public k(a a1, ad ad1, r r1, af af1)
    {
        b = a1;
        c = ad1;
        d = r1;
        e = af1;
    }

    public long a(String s)
    {
        return c.b(s);
    }

    public s a(FolderName foldername, s s)
    {
        return e.a(foldername, s);
    }

    public s a(String s, s s1)
    {
        return e.a(s, s1);
    }

    public User a()
    {
        return (User)b.b();
    }

    public User a(UserKey userkey)
    {
        return c.a(userkey);
    }

    public String a(ParticipantInfo participantinfo)
    {
        return c.a(participantinfo);
    }

    public void a(String s, Location location, long l)
    {
        c.a(s, location, l);
    }

    public boolean a(FolderName foldername)
    {
        return c.a(foldername);
    }

    public Uri b(UserKey userkey)
    {
        userkey = c.a(userkey);
        if (userkey != null)
        {
            return userkey.r();
        } else
        {
            return null;
        }
    }

    public ThreadSummary b(String s)
    {
        return c.a(s, ae.PREFER_MERGED_FOLDERS);
    }

    public ThreadsCollection b(FolderName foldername)
    {
        return c.c(foldername);
    }

    public UserKey b()
    {
        User user = (User)b.b();
        if (user != null)
        {
            return user.c();
        } else
        {
            return null;
        }
    }

    public String b(ParticipantInfo participantinfo)
    {
        return c.b(participantinfo);
    }

    public MessagesCollection c(String s)
    {
        return c.b(s, ae.PREFER_MERGED_FOLDERS);
    }

    public ThreadSummary c(UserKey userkey)
    {
        return c.a(userkey, ae.PREFER_MERGED_FOLDERS);
    }

    public String c()
    {
        User user = (User)b.b();
        if (user != null)
        {
            return user.b();
        } else
        {
            return null;
        }
    }

    public List c(FolderName foldername)
    {
        return c.d(foldername);
    }

    public Location d()
    {
        return d.a();
    }

    public boolean d(FolderName foldername)
    {
        return e.a(foldername);
    }

    public boolean d(String s)
    {
        return e.a(s);
    }

    public boolean e(FolderName foldername)
    {
        return e.b(foldername);
    }

    public boolean e(String s)
    {
        return e.b(s);
    }

    public long f(FolderName foldername)
    {
        return c.f(foldername);
    }

    public FolderCounts g(FolderName foldername)
    {
        return c.e(foldername);
    }

}
