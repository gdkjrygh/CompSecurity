// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import me.lyft.android.persistence.expensenotes.IExpenseNoteStorage;

// Referenced classes of package me.lyft.android.application.ride:
//            IExpenseNoteSession

public class ExpenseNoteSession
    implements IExpenseNoteSession
{

    private boolean concurEnabled;
    private boolean concurFlagEditedByUser;
    private String expenseCode;
    private String expenseNote;
    private final IExpenseNoteStorage expenseNoteStorage;
    private String rideId;
    private final IUserProvider userProvider;

    public ExpenseNoteSession(IExpenseNoteStorage iexpensenotestorage, IUserProvider iuserprovider)
    {
        concurFlagEditedByUser = false;
        expenseNoteStorage = iexpensenotestorage;
        userProvider = iuserprovider;
        rideId = (String)Objects.firstNonNull(iexpensenotestorage.getRideId(), "");
        concurEnabled = iexpensenotestorage.isConcurEnabled();
        expenseNote = (String)Objects.firstNonNull(iexpensenotestorage.getExpenseNote(), "");
        expenseCode = (String)Objects.firstNonNull(iexpensenotestorage.getExpenseCode(), "");
    }

    public String getExpenseCode()
    {
        return expenseCode;
    }

    public String getExpenseNote()
    {
        return expenseNote;
    }

    public String getRideId()
    {
        return rideId;
    }

    public boolean isConcurEnabled()
    {
        if (wasConcurEdited())
        {
            return concurEnabled;
        } else
        {
            return userProvider.getUser().sendConcurRideReceipts();
        }
    }

    public void reset()
    {
        rideId = "";
        concurEnabled = false;
        concurFlagEditedByUser = false;
        expenseNote = "";
        expenseCode = "";
        expenseNoteStorage.reset();
    }

    public void setConcurEnabled(boolean flag)
    {
        concurFlagEditedByUser = true;
        concurEnabled = flag;
        expenseNoteStorage.setConcurEnabled(flag);
    }

    public void setExpenseCode(String s)
    {
        s = Strings.nullToEmpty(s);
        expenseCode = s;
        expenseNoteStorage.setExpenseCode(s);
    }

    public void setExpenseNote(String s)
    {
        s = Strings.nullToEmpty(s);
        expenseNote = s;
        expenseNoteStorage.setExpenseNote(s);
    }

    public void setRideId(String s)
    {
        s = Strings.nullToEmpty(s);
        rideId = s;
        expenseNoteStorage.setRideId(s);
    }

    boolean wasConcurEdited()
    {
        return concurFlagEditedByUser;
    }
}
