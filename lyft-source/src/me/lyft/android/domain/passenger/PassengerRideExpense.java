// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.passenger;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Strings;

public class PassengerRideExpense
    implements INullable
{

    private boolean concurEnabled;
    private String expenseCode;
    private String expenseNote;

    public PassengerRideExpense(boolean flag, String s, String s1)
    {
        concurEnabled = flag;
        expenseNote = Strings.nullToEmpty(s);
        expenseCode = Strings.nullToEmpty(s1);
    }

    public static PassengerRideExpense empty()
    {
        return NullPassengerRideExpense.instance;
    }

    public String getExpenseCode()
    {
        return expenseCode;
    }

    public String getExpenseNote()
    {
        return expenseNote;
    }

    public boolean isConcurEnabled()
    {
        return concurEnabled;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullPassengerRideExpense extends PassengerRideExpense
    {

        private static final PassengerRideExpense instance = new NullPassengerRideExpense();

        public boolean isNull()
        {
            return true;
        }



        public NullPassengerRideExpense()
        {
            super(false, "", "");
        }
    }

}
