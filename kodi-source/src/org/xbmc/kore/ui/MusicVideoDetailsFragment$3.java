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
//            MusicVideoDetailsFragment

class this._cls0
    implements ApiCallback
{

    final MusicVideoDetailsFragment this$0;

    public void onError(int i, String s)
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
        onSuccess((ArrayList)obj);
    }

    public void onSuccess(ArrayList arraylist)
    {
        if (!isAdded())
        {
            return;
        }
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
            org.xbmc.kore.jsonrpc.type.urnType urntype = (org.xbmc.kore.jsonrpc.type.urnType)arraylist.next();
            if (!urntype.type.equals("video"))
            {
                continue;
            }
            i = urntype.playlistid;
            break;
        } while (true);
        if (i != -1)
        {
            arraylist = new org.xbmc.kore.jsonrpc.type.urnType.playlistid();
            arraylist.id = MusicVideoDetailsFragment.access$000(MusicVideoDetailsFragment.this);
            (new org.xbmc.kore.jsonrpc.method.(i, arraylist)).(MusicVideoDetailsFragment.access$100(MusicVideoDetailsFragment.this).getConnection(), new ApiCallback() {

                final MusicVideoDetailsFragment._cls3 this$1;

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
                this$1 = MusicVideoDetailsFragment._cls3.this;
                super();
            }
            }, MusicVideoDetailsFragment.access$200(MusicVideoDetailsFragment.this));
            return;
        } else
        {
            Toast.makeText(getActivity(), 0x7f070065, 0).show();
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = MusicVideoDetailsFragment.this;
        super();
    }
}
