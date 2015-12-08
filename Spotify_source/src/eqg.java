// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class eqg extends eqj
{

    List c;

    public eqg()
    {
        c = Collections.emptyList();
    }

    private void a(List list, LinkedList linkedlist)
    {
        for (linkedlist = linkedlist.iterator(); linkedlist.hasNext(); ((Runnable)linkedlist.next()).run()) { }
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < c.size(); j++)
            {
                linkedlist = (PlayerTrack)list.get(i);
                PlayerTrack playertrack = (PlayerTrack)c.get(j);
                if (PlayerTrackUtil.areUidsEqual(linkedlist, playertrack) && !linkedlist.equals(playertrack))
                {
                    c(i);
                }
            }

        }

    }

    public final int a(PlayerTrack aplayertrack[], PlayerTrack playertrack, PlayerTrack aplayertrack1[])
    {
        ArrayList arraylist = new ArrayList();
        if (aplayertrack != null)
        {
            arraylist.addAll(Arrays.asList(aplayertrack));
        }
        if (playertrack != null)
        {
            arraylist.add(playertrack);
        }
        if (aplayertrack1 != null)
        {
            arraylist.addAll(Arrays.asList(aplayertrack1));
        }
        gib.a("Carousel adapter tracks", aplayertrack, playertrack, aplayertrack1);
        aplayertrack = new LinkedList();
        int i = geb.a(c, arraylist, new gec(aplayertrack) {

            final eqg a;
            private LinkedList b;

            public final void a(int j)
            {
                b.add(new Runnable(this, j) {

                    private int a;
                    private _cls1 b;

                    public final void run()
                    {
                        b.a.d(a);
                    }

            
            {
                b = _pcls1;
                a = i;
                super();
            }
                });
            }

            public final void a(int j, int k)
            {
                b.add(new Runnable(this, j, k) {

                    private int a;
                    private int b;
                    private _cls1 c;

                    public final void run()
                    {
                        c.a.b(a, b);
                    }

            
            {
                c = _pcls1;
                a = i;
                b = j;
                super();
            }
                });
            }

            public final void b(int j)
            {
                b.add(new Runnable(this, j) {

                    private int a;
                    private _cls1 b;

                    public final void run()
                    {
                        b.a.e(a);
                    }

            
            {
                b = _pcls1;
                a = i;
                super();
            }
                });
            }

            public final void b(int j, int k)
            {
                b.add(new Runnable(this, j, k) {

                    private int a;
                    private int b;
                    private _cls1 c;

                    public final void run()
                    {
                        c.a.c(a, b);
                    }

            
            {
                c = _pcls1;
                a = i;
                b = j;
                super();
            }
                });
            }

            
            {
                a = eqg.this;
                b = linkedlist;
                super();
            }
        }, new ged() {

            public final boolean a(Object obj, Object obj1)
            {
                obj = (PlayerTrack)obj;
                obj1 = (PlayerTrack)obj1;
                return PlayerTrackUtil.areUidsEqual(((PlayerTrack) (obj)), ((PlayerTrack) (obj1))) && PlayerTrackUtil.areTitlesEqual(((PlayerTrack) (obj)), ((PlayerTrack) (obj1)));
            }

        });
        c = arraylist;
        if (i == 0)
        {
            return 0;
        }
        if (i < 3)
        {
            a(((List) (arraylist)), ((LinkedList) (aplayertrack)));
            return 1;
        } else
        {
            c();
            return 2;
        }
    }

    public final int b()
    {
        return c.size();
    }

    public final long b(int i)
    {
        return (long)((PlayerTrack)c.get(i)).uri().hashCode();
    }

    public final PlayerTrack f(int i)
    {
        return (PlayerTrack)c.get(i);
    }
}
