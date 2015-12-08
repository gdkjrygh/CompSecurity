// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;


public class MediaPickerSearchSuggestionsItem
{

    private String suggestion;
    private com.skype.android.widget.SymbolElement.SymbolCode symbolCode;
    private int symbolColor;

    public MediaPickerSearchSuggestionsItem()
    {
    }

    public String getSuggestion()
    {
        return suggestion;
    }

    public com.skype.android.widget.SymbolElement.SymbolCode getSymbolCode()
    {
        return symbolCode;
    }

    public int getSymbolColor()
    {
        return symbolColor;
    }

    public void setSuggestion(String s)
    {
        suggestion = s;
    }

    public void setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode symbolcode)
    {
        symbolCode = symbolcode;
    }

    public void setSymbolColor(int i)
    {
        symbolColor = i;
    }
}
