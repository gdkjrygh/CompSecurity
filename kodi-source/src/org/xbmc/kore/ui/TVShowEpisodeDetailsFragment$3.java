// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.jsonrpc.ApiCallback;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowEpisodeDetailsFragment

class this._cls0
    implements ApiCallback
{

    final TVShowEpisodeDetailsFragment this$0;

    public void onError(int i, String s)
    {
        Toast.makeText(getActivity(), 0x7f0700a2, 0).show();
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((ArrayList)obj);
    }

    public void onSuccess(ArrayList arraylist)
    {
        if (isAdded())
        {
            byte byte0 = -1;
            arraylist = arraylist.iterator();
            int i;
            do
            {
                i = byte0;
                if (!arraylist.hasNext())
                {
                    break;
                }
                org.xbmc.kore.jsonrpc.type.Type type = (org.xbmc.kore.jsonrpc.type.Type)arraylist.next();
                if (!type.type.equals("video"))
                {
                    continue;
                }
                i = type.playlistid;
                break;
            } while (true);
            if (i != -1)
            {
                arraylist = new org.xbmc.kore.jsonrpc.type.Type.playlistid();
                arraylist.playlistid = TVShowEpisodeDetailsFragment.access$000(TVShowEpisodeDetailsFragment.this);
                (new org.xbmc.kore.jsonrpc.method.pe.playlistid(i, arraylist)).playlistid(TVShowEpisodeDetailsFragment.access$100(TVShowEpisodeDetailsFragment.this).getConnection(), new ApiCallback() {

                    final TVShowEpisodeDetailsFragment._cls3 this$1;

                    public void onError(int j, String s)
                    {
                        if (!isAdded())
                        {
                            return;
                        } else
                        {
                            Toast.makeText(getActivity(), 0x7f0700a2, 0).show();
                            return;
                        }
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((String)obj);
                    }

                    public void onSuccess(String s)
                    {
                        if (!isAdded())
                        {
                            return;
                        } else
                        {
                            Toast.makeText(getActivity(), 0x7f07004f, 0).show();
                            return;
                        }
                    }

            
            {
                this$1 = TVShowEpisodeDetailsFragment._cls3.this;
                super();
            }
                }, TVShowEpisodeDetailsFragment.access$200(TVShowEpisodeDetailsFragment.this));
                return;
            }
            if (isAdded())
            {
                Toast.makeText(getActivity(), 0x7f070065, 0).show();
                return;
            }
        }
    }

    _cls1.this._cls1()
    {
        this$0 = TVShowEpisodeDetailsFragment.this;
        super();
    }
}
