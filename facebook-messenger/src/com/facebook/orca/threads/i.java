// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.debug.log.b;
import com.facebook.messages.model.threads.Message;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Objects;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.threads:
//            MessagesCollection, k

public class i
{

    private static final Class a = com/facebook/orca/threads/i;

    public i()
    {
    }

    private MessagesCollection a(MessagesCollection messagescollection, MessagesCollection messagescollection1, boolean flag)
    {
        com.facebook.debug.log.b.a(a, "MERGE: %d new, %d old", new Object[] {
            Integer.valueOf(messagescollection.f()), Integer.valueOf(messagescollection1.f())
        });
        if (!Objects.equal(messagescollection.a(), messagescollection1.a()))
        {
            throw new IllegalArgumentException("Message Collections with different thread ids");
        }
        if (!messagescollection.e() || !messagescollection1.e()) goto _L2; else goto _L1
_L1:
        return messagescollection;
_L2:
        if (messagescollection.e())
        {
            return messagescollection1;
        }
        if (messagescollection1.e()) goto _L1; else goto _L3
_L3:
        if (!d(messagescollection, messagescollection1))
        {
            return messagescollection1;
        }
        Message message = messagescollection.a(messagescollection.f() - 1);
        k k1 = new k(null);
        k k2 = new k(null);
        for (Iterator iterator = messagescollection.b().iterator(); iterator.hasNext(); k1.a((Message)iterator.next())) { }
        Iterator iterator1 = messagescollection1.b().iterator();
        Message message1;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_857;
            }
            message1 = (Message)iterator1.next();
            k2.a(message1);
        } while (!a(message1, message));
        et et1;
        k k3;
        Message message2;
        Message message3;
        int l;
        int i1;
        int j1;
        int l1;
        for (int j = 1; j != 0; j = 0)
        {
            break MISSING_BLOCK_LABEL_328;
        }

        a("MERGE: couldn't find sync point", new Object[0]);
        if (flag) goto _L1; else goto _L4
_L4:
        l = 0;
        j = 0;
        l1 = messagescollection.f();
        j1 = messagescollection1.f();
        et1 = es.e();
        k3 = new k(null);
        do
        {
            i1 = j;
            if (l >= l1)
            {
                break;
            }
            i1 = j;
            if (j >= j1)
            {
                break;
            }
            message2 = messagescollection.a(l);
            message = messagescollection1.a(j);
            if (k3.b(message2))
            {
                l++;
            } else
            if (k3.b(message))
            {
                j++;
            } else
            if (a(message2, message))
            {
                a("MERGE: inserting matching element (%s)", new Object[] {
                    message2.d()
                });
                if (b(message, message2))
                {
                    et1.b(message);
                } else
                {
                    et1.b(message2);
                }
                l++;
                j++;
            } else
            if (k2.b(message2))
            {
                message3 = k2.c(message2);
                if (message2.f() > message3.f() || !message2.y() && message3.y())
                {
                    a("MERGE: Inserting new element (%s) and discarding old", new Object[] {
                        message2.d()
                    });
                    et1.b(message2);
                    k3.a(message2);
                    k2.d(message3);
                    l++;
                } else
                {
                    a("MERGE: Iterating old to find message matching (%s)", new Object[] {
                        message2.d()
                    });
                    while (!a(message2, message) && j < j1) 
                    {
                        message = messagescollection1.a(j);
                        if (k1.b(message) && !b(message, message2))
                        {
                            k2.d(message);
                            a("MERGE: Not inserting old element (%s)", new Object[] {
                                message.d()
                            });
                        } else
                        if (k3.b(message))
                        {
                            k2.d(message);
                            a("MERGE: Not inserting old element (%s)", new Object[] {
                                message.d()
                            });
                        } else
                        {
                            a("MERGE: Inserting missing old element (%s)", new Object[] {
                                message.d()
                            });
                            et1.b(message);
                            k3.a(message);
                        }
                        j++;
                    }
                }
            } else
            {
                a("MERGE: Inserting new element (%s)", new Object[] {
                    message2.d()
                });
                et1.b(message2);
                k3.a(message2);
                l++;
            }
        } while (true);
        break MISSING_BLOCK_LABEL_747;
        a("MERGE: found sync point (%s)", new Object[] {
            message.d()
        });
          goto _L4
        while (i1 < j1) 
        {
            message = messagescollection1.a(i1);
            if (k3.b(message))
            {
                a("MERGE: Not inserting old element (%s)", new Object[] {
                    message.d()
                });
            } else
            {
                a("MERGE: inserting old element (%s)", new Object[] {
                    message.d()
                });
                et1.b(message);
                k3.a(message);
            }
            i1++;
        }
        return new MessagesCollection(messagescollection.a(), et1.b(), messagescollection1.d());
    }

    private static transient void a(String s, Object aobj[])
    {
    }

    private boolean a(Message message, Message message1)
    {
        while (Objects.equal(message.d(), message1.d()) || message.x() && message1.x() && Objects.equal(message.w(), message1.w())) 
        {
            return true;
        }
        return false;
    }

    private boolean b(Message message, Message message1)
    {
        return !message.y() && message1.y();
    }

    private boolean d(MessagesCollection messagescollection, MessagesCollection messagescollection1)
    {
        messagescollection = messagescollection.b().h_();
        for (messagescollection1 = messagescollection1.b().h_(); messagescollection.hasNext() && messagescollection1.hasNext();)
        {
            Message message = (Message)messagescollection.next();
            Message message1 = (Message)messagescollection1.next();
            if (message.y() || message1.y() || !Objects.equal(message.d(), message1.d()))
            {
                return true;
            }
        }

        return messagescollection.hasNext();
    }

    public MessagesCollection a(MessagesCollection messagescollection, MessagesCollection messagescollection1)
    {
        return a(messagescollection, messagescollection1, false);
    }

    public MessagesCollection b(MessagesCollection messagescollection, MessagesCollection messagescollection1)
    {
        return a(messagescollection, messagescollection1, true);
    }

    public boolean c(MessagesCollection messagescollection, MessagesCollection messagescollection1)
    {
        if (messagescollection.e() && messagescollection1.e())
        {
            return true;
        }
        if (messagescollection.e())
        {
            return true;
        }
        if (messagescollection1.e())
        {
            return true;
        }
        messagescollection = messagescollection.a(messagescollection.f() - 1);
        for (messagescollection1 = messagescollection1.b().iterator(); messagescollection1.hasNext();)
        {
            if (Objects.equal(((Message)messagescollection1.next()).d(), messagescollection.d()))
            {
                return true;
            }
        }

        return false;
    }

}
