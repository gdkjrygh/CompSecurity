// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence.expensenote;

import android.content.SharedPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.persistence.expensenotes.IExpenseNoteStorage;

public class ExpenseNoteStorage
    implements IExpenseNoteStorage
{

    private static final String CONCUR_ENABLED = "concur_enabled";
    private static final String EXPENSE_CODE = "expense_code";
    private static final String EXPENSE_NOTE = "expense_note";
    private static final String RIDE_ID = "ride_id";
    private final SharedPreferences preferences;

    public ExpenseNoteStorage(LyftApplication lyftapplication)
    {
        preferences = lyftapplication.getSharedPreferences("expense_note", 0);
    }

    private String getString(String s)
    {
        return preferences.getString(s, "");
    }

    private void putString(String s, String s1)
    {
        preferences.edit().putString(s, s1).apply();
    }

    public String getExpenseCode()
    {
        return getString("expense_code");
    }

    public String getExpenseNote()
    {
        return getString("expense_note");
    }

    public String getRideId()
    {
        return getString("ride_id");
    }

    public boolean isConcurEnabled()
    {
        return preferences.getBoolean("concur_enabled", false);
    }

    public void reset()
    {
        preferences.edit().remove("ride_id").remove("concur_enabled").remove("expense_note").remove("expense_code").apply();
    }

    public void setConcurEnabled(boolean flag)
    {
        preferences.edit().putBoolean("concur_enabled", flag).apply();
    }

    public void setExpenseCode(String s)
    {
        putString("expense_code", s);
    }

    public void setExpenseNote(String s)
    {
        putString("expense_note", s);
    }

    public void setRideId(String s)
    {
        putString("ride_id", s);
    }
}
