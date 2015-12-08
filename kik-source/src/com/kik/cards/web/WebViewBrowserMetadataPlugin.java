// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.webkit.WebView;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import com.kik.g.s;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web:
//            av, aw, bh, bi, 
//            bf, bg

public class WebViewBrowserMetadataPlugin extends d
    implements av, aw
{
    private final class a
    {

        String a;
        String b;
        String c;
        final WebViewBrowserMetadataPlugin d;

        private a()
        {
            d = WebViewBrowserMetadataPlugin.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final WebView a;
    private a b;
    private p d;

    public WebViewBrowserMetadataPlugin(WebView webview)
    {
        super("Metadata");
        a = webview;
    }

    static p a(WebViewBrowserMetadataPlugin webviewbrowsermetadataplugin)
    {
        webviewbrowsermetadataplugin.d = null;
        return null;
    }

    static WebView b(WebViewBrowserMetadataPlugin webviewbrowsermetadataplugin)
    {
        return webviewbrowsermetadataplugin.a;
    }

    public final p a()
    {
        String s1;
        boolean flag1;
        s1 = null;
        flag1 = false;
        if (b == null) goto _L2; else goto _L1
_L1:
        String s2;
        Object obj;
        obj = b;
        boolean flag = flag1;
        if (obj != null)
        {
            if (a == null)
            {
                flag = flag1;
            } else
            {
                s2 = bf.i(a.getUrl());
                obj = bf.i(((a) (obj)).c);
                flag = flag1;
                if (s2 != null)
                {
                    flag = flag1;
                    if (s2.equals(obj))
                    {
                        flag = true;
                    }
                }
            }
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        s2 = b.a;
        s1 = b.b;
_L5:
        if (d != null)
        {
            obj = d;
        } else
        {
            obj = s.a(new p(), 750L);
            ((p) (obj)).a(new bg(this));
            d = com.kik.sdkutils.d.a(a, ((p) (obj)));
            a.loadUrl("javascript:(function() {try{var attr = function(tag, attr) {var str = tag.getAttribute(attr);if (!str) {return undefined;}if (str.trim() === '') {return undefined;}return str;};var metaTags = !!document.querySelectorAll ? document.querySelectorAll('meta') : document.getElementsByTagName('meta');var meta = {};for (var i = 0; i < metaTags.length; ++i) {var tag = metaTags[i];meta[attr(tag, 'property') || attr(tag, 'name') || attr(tag, 'id')] = attr(tag, 'content') || attr(tag, 'value');}var linkTags = !!document.querySelectorAll ? document.querySelectorAll('link') : document.getElementsByTagName('link');var link = {};for (var i = 0; i < linkTags.length; ++i) {var tag = linkTags[i];link[attr(tag, 'rel')] = attr(tag, 'href');}var root = location.protocol + '//' + location.host;var description = meta['og:description'] || meta['twitter:description'] || meta['description'];var appName = meta['og:site_name'] || meta['application-name'] || meta['apple-mobile-web-app-title'];var title = meta['og:title'] || meta['twitter:title'] || (!!appName ? document.title : undefined);var titleToDisplay = (!title && description) ? description : title;var descriptionToDisplay = (!title && description) ? undefined : description;if (!titleToDisplay && !descriptionToDisplay) {titleToDisplay = document.title;descriptionToDisplay = location.href;if (!titleToDisplay) {titleToDisplay = descriptionToDisplay;descriptionToDisplay = undefined;}}var data = {'title': titleToDisplay || (descriptionToDisplay ? undefined : location.href),'description': descriptionToDisplay,'app-name': appName || document.title || location.hostname,'app-icon': link['kik-icon'] || link['apple-touch-icon'] || link['apple-touch-icon-precomposed'] || link['shortcut icon'] || link['icon'] || root + '/apple-touch-icon.png','preview-image': meta['og:image'] || meta['og:image:src'] || meta['twitter:image'] || meta['twitter:image:src'] || link['img_src'],'layout': (meta['twitter:card'] || '').trim().toLowerCase() === 'photo' ? 'photo' : 'article','url': link['canonical'] || location.href};var metadataPlugin;if (typeof(cards) !== 'undefined' && cards._ && (metadataPlugin = cards._.bridge('Metadata'))) {metadataPlugin.updatePageInfo(data);}else {try {window.prompt('CardsBridge', JSON.stringify(['batchInvoke', ['invokeFunction', 'requestPlugin', JSON.stringify({'name': 'Metadata'})], ['invokeFunction', 'Metadata.updatePageInfo', JSON.stringify(data)]]));}catch (e) {}}}catch(e){}})();");
            obj = d;
        }
        return s.a(s.b(((p) (obj)), new bh(this, s2, s1)), new bi(this, s2, s1));
_L2:
        s2 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(String s1, String s2, String s3)
    {
        a a1 = new a((byte)0);
        a1.c = s3;
        a1.b = s2;
        a1.a = s1;
        b = a1;
    }

    public final boolean b()
    {
        return true;
    }

    public j updatePageInfo(JSONObject jsonobject, String s1)
    {
        if (d == null)
        {
            d = s.a(jsonobject);
        } else
        {
            d.a(jsonobject);
        }
        return new j();
    }
}
