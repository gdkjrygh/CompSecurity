// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import com.crittercism.app.Crittercism;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;

public class BoardBaseDialog extends BaseDialog
{

    protected Board _board;
    protected String _boardUid;

    public BoardBaseDialog()
    {
    }

    public static BoardBaseDialog newInstance(Class class1, String s)
    {
        try
        {
            class1 = (BoardBaseDialog)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            Crittercism.logHandledException(class1);
            class1 = new BoardBaseDialog();
        }
        class1.addArgument(s);
        return class1;
    }

    protected void addArgument(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_BOARD_ID", s);
        setArguments(bundle);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            _boardUid = bundle.getString("com.pinterest.EXTRA_BOARD_ID");
            _board = ModelHelper.getBoard(_boardUid);
        }
    }
}
