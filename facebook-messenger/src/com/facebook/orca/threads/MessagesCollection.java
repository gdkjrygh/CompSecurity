// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.facebook.messages.model.threads.Message;
import com.google.common.a.es;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.threads:
//            h

public class MessagesCollection
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private static final Class a = com/facebook/orca/threads/MessagesCollection;
    private static final l b = new l();
    private final String c;
    private final es d;
    private final boolean e;

    private MessagesCollection(Parcel parcel)
    {
        c = parcel.readString();
        d = es.a(parcel.createTypedArrayList(Message.CREATOR));
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        a(d);
    }

    MessagesCollection(Parcel parcel, h h1)
    {
        this(parcel);
    }

    public MessagesCollection(String s, es es1, boolean flag)
    {
        c = s;
        d = es1;
        e = flag;
        a(es1);
    }

    public static MessagesCollection a(Message message)
    {
        return new MessagesCollection(message.e(), es.a(message), false);
    }

    private static void a(es es1)
    {
        es1 = es1.iterator();
        long l1 = 0x7fffffffffffffffL;
        long l2 = 0x7fffffffffffffffL;
        do
        {
            Message message;
label0:
            {
                if (es1.hasNext())
                {
                    message = (Message)es1.next();
                    if (message.y())
                    {
                        continue;
                    }
                    if (message.f() <= l1 || b(message) <= l2)
                    {
                        break label0;
                    }
                    com.facebook.debug.log.b.a(b, a, "Thread messages were not in order");
                }
                return;
            }
            l1 = message.f();
            l2 = b(message);
        } while (true);
    }

    private static long b(Message message)
    {
        if (message.g())
        {
            return message.h();
        } else
        {
            return message.f();
        }
    }

    public Message a(int i)
    {
        return (Message)d.get(i);
    }

    public String a()
    {
        return c;
    }

    public es b()
    {
        return d;
    }

    public Message c()
    {
        if (d.isEmpty())
        {
            return null;
        } else
        {
            return (Message)d.get(0);
        }
    }

    public boolean d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return d.isEmpty();
    }

    public int f()
    {
        return d.size();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(c);
        parcel.writeTypedList(d);
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
