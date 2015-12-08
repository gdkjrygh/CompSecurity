// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.okhttp.OkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.Toolbar;

public class ProxySettingsView extends LinearLayout
{

    Button enableProxyButton;
    EditText ipAddress1TextView;
    EditText ipAddress2TextView;
    EditText ipAddress3TextView;
    EditText ipAddress4TextView;
    ILyftPreferences lyftPreferences;
    OkHttpClient okHttpClient;
    Toolbar toolbar;

    public ProxySettingsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private String getIpAddress()
    {
        return Strings.joinWithDelimiter(".", new String[] {
            ipAddress1TextView.getText().toString(), ipAddress2TextView.getText().toString(), ipAddress3TextView.getText().toString(), ipAddress4TextView.getText().toString()
        });
    }

    private boolean isProxyEnabled()
    {
        Proxy proxy = okHttpClient.getProxy();
        return proxy != null && !proxy.equals(Proxy.NO_PROXY);
    }

    private void setIpAddress(String s)
    {
        s = s.split("\\.");
        if (s.length > 0)
        {
            ipAddress1TextView.setText(s[0]);
        }
        if (s.length > 1)
        {
            ipAddress2TextView.setText(s[1]);
        }
        if (s.length > 2)
        {
            ipAddress3TextView.setText(s[2]);
        }
        if (s.length > 3)
        {
            ipAddress4TextView.setText(s[3]);
        }
    }

    private void updateProxyButtonText()
    {
        if (isProxyEnabled())
        {
            enableProxyButton.setText(0x7f07011b);
            return;
        } else
        {
            enableProxyButton.setText(0x7f070167);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        toolbar.setTitle(getResources().getString(0x7f0702d5));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        updateProxyButtonText();
        setIpAddress(lyftPreferences.getProxyIpAddress());
        enableProxyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ProxySettingsView this$0;

            public void onClick(View view)
            {
                if (isProxyEnabled())
                {
                    okHttpClient.setProxy(Proxy.NO_PROXY);
                    lyftPreferences.setProxyEnabled(Boolean.valueOf(false));
                } else
                {
                    view = getIpAddress();
                    Object obj = new InetSocketAddress(view, 8888);
                    obj = new Proxy(java.net.Proxy.Type.HTTP, ((java.net.SocketAddress) (obj)));
                    okHttpClient.setProxy(((Proxy) (obj)));
                    lyftPreferences.setProxyEnabled(Boolean.valueOf(true));
                    lyftPreferences.setProxyIpAddress(view);
                }
                updateProxyButtonText();
            }

            
            {
                this$0 = ProxySettingsView.this;
                super();
            }
        });
    }



}
