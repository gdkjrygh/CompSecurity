// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.os.Handler;
import android.widget.Toast;
import java.util.ArrayList;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment

class val.callbackHandler
    implements ApiCallback
{

    final MediaFileListFragment this$0;
    final Handler val$callbackHandler;
    final HostConnection val$connection;
    final int val$playlistId;

    public void onError(int i, String s)
    {
        if (!isAdded())
        {
            return;
        } else
        {
            Toast.makeText(getActivity(), String.format(getString(0x7f0700d3), new Object[] {
                s
            }), 0).show();
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((ArrayList)obj);
    }

    public void onSuccess(ArrayList arraylist)
    {
        if (arraylist.isEmpty())
        {
            (new org.xbmc.kore.jsonrpc.method.Handler(val$playlistId)).Id(val$connection, new ApiCallback() {

                final MediaFileListFragment._cls7 this$1;

                public void onError(int i, String s)
                {
                    if (!isAdded())
                    {
                        return;
                    } else
                    {
                        Toast.makeText(getActivity(), String.format(getString(0x7f0700d5), new Object[] {
                            s
                        }), 0).show();
                        return;
                    }
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((String)obj);
                }

                public void onSuccess(String s)
                {
                }

            
            {
                this$1 = MediaFileListFragment._cls7.this;
                super();
            }
            }, val$callbackHandler);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = final_mediafilelistfragment;
        val$playlistId = i;
        val$connection = hostconnection;
        val$callbackHandler = Handler.this;
        super();
    }
}
