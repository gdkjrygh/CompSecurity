// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity;

import com.pinterest.activity.signin.dialog.BusinessSignupDialog;
import com.pinterest.activity.signin.dialog.EmailOnlyLoginDialog;
import com.pinterest.activity.signin.dialog.EmailSignupDialog;
import com.pinterest.activity.signin.dialog.FBPermissionDialog;
import com.pinterest.activity.signin.dialog.GenderSignupDialog;
import com.pinterest.activity.signin.dialog.LoginDialog;
import com.pinterest.activity.signin.dialog.PinvitationalRequestInviteDialog;
import com.pinterest.activity.signin.dialog.SignupDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import java.util.ArrayList;

public class DialogHelper
{

    public DialogHelper()
    {
    }

    public static void goBusinessSignup(String s, String s1)
    {
        Events.post(new DialogEvent(new BusinessSignupDialog(s, s1)));
    }

    public static void goEmailOnlyLogin()
    {
        Events.post(new DialogEvent(new EmailOnlyLoginDialog()));
    }

    public static void goEmailSignup()
    {
        Events.post(new DialogEvent(new EmailSignupDialog()));
    }

    public static void goEmailSignup(String s)
    {
        Events.post(new DialogEvent(new EmailSignupDialog(s)));
    }

    public static void goGenderSignup(String s, String s1, String s2, String s3)
    {
        Events.post(new DialogEvent(new GenderSignupDialog(s, s1, s2, s3)));
    }

    public static void goLogin()
    {
        Events.post(new DialogEvent(new LoginDialog()));
    }

    public static void goPinvitationalRequestInvite(String s)
    {
        Events.post(new DialogEvent(new PinvitationalRequestInviteDialog(s)));
    }

    public static void goSignup()
    {
        Events.post(new DialogEvent(new SignupDialog()));
    }

    public static void showFBPermissionMissing(ArrayList arraylist)
    {
        Events.post(new DialogEvent(FBPermissionDialog.newInstance(arraylist)));
    }
}
