// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.pinterest.network.json.PinterestJsonObject;

public class AtMention
{

    protected Spannable _displaySpan;
    protected String _filterString;
    protected String _imageUrl;
    protected String _name;
    protected String _username;

    public AtMention()
    {
    }

    public static AtMention make(PinterestJsonObject pinterestjsonobject)
    {
        AtMention atmention = new AtMention();
        atmention.setName(pinterestjsonobject.a("full_name", ""));
        atmention.setUsername(pinterestjsonobject.a("username", ""));
        atmention.setImageUrl(pinterestjsonobject.a("image_medium_url", ""));
        atmention.updateStrings();
        return atmention;
    }

    public Spannable getDisplaySpan()
    {
        return _displaySpan;
    }

    public String getFilterableString()
    {
        return _filterString;
    }

    public String getImageUrl()
    {
        return _imageUrl;
    }

    public String getName()
    {
        return _name;
    }

    public String getUsername()
    {
        return _username;
    }

    public void setImageUrl(String s)
    {
        _imageUrl = s;
    }

    public void setName(String s)
    {
        _name = s;
    }

    public void setUsername(String s)
    {
        _username = s;
    }

    protected void updateStrings()
    {
        String s = String.format("%s (%s)", new Object[] {
            _username, _name
        });
        _displaySpan = new SpannableString(s);
        _displaySpan.setSpan(new StyleSpan(1), 0, _username.length(), 33);
        int i = Math.max(s.indexOf(_name) - 1, 0);
        _displaySpan.setSpan(new ForegroundColorSpan(0xff888888), i, s.length(), 33);
        _filterString = String.format("%s %s", new Object[] {
            _username, _name
        });
    }
}
