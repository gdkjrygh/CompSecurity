// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            INotificationSideChannel

class all
    implements all
{

    final boolean all;
    final int id;
    final String packageName;
    final String tag;

    public void send(INotificationSideChannel inotificationsidechannel)
    {
        if (all)
        {
            inotificationsidechannel.cancelAll(packageName);
            return;
        } else
        {
            inotificationsidechannel.cancel(packageName, id, tag);
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("CancelTask[");
        stringbuilder.append("packageName:").append(packageName);
        stringbuilder.append(", id:").append(id);
        stringbuilder.append(", tag:").append(tag);
        stringbuilder.append(", all:").append(all);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public A(String s)
    {
        packageName = s;
        id = 0;
        tag = null;
        all = true;
    }

    public all(String s, int i, String s1)
    {
        packageName = s;
        id = i;
        tag = s1;
        all = false;
    }
}
