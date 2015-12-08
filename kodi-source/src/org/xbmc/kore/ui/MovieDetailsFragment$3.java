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
//            MovieDetailsFragment

class this._cls0
    implements ApiCallback
{

    final MovieDetailsFragment this$0;

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
            org.xbmc.kore.jsonrpc.type.tsReturnType tsreturntype = (org.xbmc.kore.jsonrpc.type.tsReturnType)arraylist.next();
            if (!tsreturntype.type.equals("video"))
            {
                continue;
            }
            i = tsreturntype.playlistid;
            break;
        } while (true);
        if (i != -1)
        {
            arraylist = new org.xbmc.kore.jsonrpc.type.>();
            arraylist.id = MovieDetailsFragment.access$000(MovieDetailsFragment.this);
            (new org.xbmc.kore.jsonrpc.method.(i, arraylist)).(MovieDetailsFragment.access$100(MovieDetailsFragment.this).getConnection(), new ApiCallback() {

                final MovieDetailsFragment._cls3 this$1;

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
                this$1 = MovieDetailsFragment._cls3.this;
                super();
            }
            }, MovieDetailsFragment.access$200(MovieDetailsFragment.this));
            return;
        } else
        {
            Toast.makeText(getActivity(), 0x7f070065, 0).show();
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = MovieDetailsFragment.this;
        super();
    }
}
