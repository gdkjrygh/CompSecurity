// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.app.Activity;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Model;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.UserApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class ReportHelper
{

    public ReportHelper()
    {
    }

    public static void blockUser(final User user, String s)
    {
        Pinalytics.a(ElementType.USER_BLOCK_BUTTON, ComponentType.MODAL_DIALOG, user.getUid());
        ModelHelper.blockUser(user.getUid(), new _cls3(), s);
    }

    public static void showBlockDialog(Activity activity, final User user)
    {
        final BaseDialog dialog = new BaseDialog();
        String s;
        int i;
        int j;
        int k;
        final boolean blocked;
        if (user.getBlocked() == Boolean.TRUE)
        {
            blocked = true;
        } else
        {
            blocked = false;
        }
        if (blocked)
        {
            i = 0x7f0705af;
        } else
        {
            i = 0x7f07007d;
        }
        if (blocked)
        {
            j = 0x7f0705a7;
        } else
        {
            j = 0x7f070070;
        }
        if (blocked)
        {
            k = 0x7f0705ac;
        } else
        {
            k = 0x7f07007a;
        }
        if (user.getFullName() == null)
        {
            s = "";
        } else
        {
            s = user.getFullName();
        }
        dialog.setTitle(String.format(activity.getString(i), new Object[] {
            s
        }));
        if (user.getFirstName() != null)
        {
            dialog.setMessage(String.format(activity.getString(k), new Object[] {
                user.getFirstName()
            }));
        }
        dialog.setPositiveButton(activity.getString(j), new _cls5());
        dialog.setNegativeButton(0x7f0700af, null);
        Events.post(new DialogEvent(dialog));
    }

    public static void showUnfollowDialog(final Model board)
    {
        String s;
        String s1;
        final BaseDialog dialog;
        String s2;
        dialog = new BaseDialog();
        s2 = Resources.string(0x7f0705b2);
        s1 = "";
        s = "";
        if (!(board instanceof Board)) goto _L2; else goto _L1
_L1:
        board = (Board)board;
        s1 = Resources.string(0x7f0705ba);
        s = Resources.string(0x7f0705b7);
        dialog.setPositiveButton(s2, new _cls6());
_L4:
        dialog.setTitle(s1);
        dialog.setMessage(s);
        dialog.setNegativeButton(0x7f0700af, null);
        Events.post(new DialogEvent(dialog));
        return;
_L2:
        if (board instanceof User)
        {
            final User user = (User)board;
            if (user.getFullName() == null)
            {
                board = "";
            } else
            {
                board = user.getFullName();
            }
            s1 = String.format(Resources.string(0x7f0705c4), new Object[] {
                board
            });
            if (user.getFirstName() == null)
            {
                board = "";
            } else
            {
                board = user.getFirstName();
            }
            s = String.format(Resources.string(0x7f0705c1), new Object[] {
                board
            });
            dialog.setPositiveButton(s2, new _cls7());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void unblockUser(final User user, String s)
    {
        Pinalytics.a(ElementType.USER_BLOCK_BUTTON, ComponentType.MODAL_DIALOG, user.getUid());
        ModelHelper.unblockUser(user.getUid(), new _cls4(), s);
    }

    public static void unfollowBoard(final Board board, String s)
    {
        BoardApi.j(board.getUid(), new _cls1(), s);
    }

    public static void unfollowUser(final User user, String s)
    {
        UserApi.h(user.getUid(), new _cls2(), s);
    }

    private class _cls3 extends ApiResponseHandler
    {

        final User val$user;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (apiresponse != null)
            {
                Application.showToast(apiresponse.getMessageDisplay());
            } else
            if (user.getFullName() != null)
            {
                Application.showToast(Resources.string(0x7f070078, new Object[] {
                    user.getFullName()
                }));
                return;
            }
        }

        public final void onFinish()
        {
            super.onFinish();
            Events.post(new DialogHideEvent(true));
        }

        public final void onStart()
        {
            if (user.getFullName() != null)
            {
                Events.post(new DialogEvent(new LoadingDialog(Resources.string(0x7f07007b, new Object[] {
                    user.getFullName()
                }))));
            }
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.USER_BLOCK, user.getUid());
            if (user.getFullName() != null)
            {
                Application.showToastShort(Resources.string(0x7f07007c, new Object[] {
                    user.getFullName()
                }));
            }
            user.setBlocked(Boolean.valueOf(true));
            user.setFollowing(false);
            ModelHelper.setUser(user);
            Events.post(new com.pinterest.api.model.User.UpdateEvent(user));
            Events.postSticky(new com.pinterest.api.model.User.UserFollowEvent(user));
        }

        _cls3()
        {
            user = user1;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final boolean val$blocked;
        final BaseDialog val$dialog;
        final User val$user;

        public final void onClick(View view)
        {
            if (blocked)
            {
                ReportHelper.unblockUser(user, null);
            } else
            {
                ReportHelper.blockUser(user, null);
            }
            dialog.dismiss();
        }

        _cls5()
        {
            blocked = flag;
            user = user1;
            dialog = basedialog;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final Board val$board;
        final BaseDialog val$dialog;

        public final void onClick(View view)
        {
            ReportHelper.unfollowBoard(board, null);
            dialog.dismiss();
        }

        _cls6()
        {
            board = board1;
            dialog = basedialog;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final BaseDialog val$dialog;
        final User val$user;

        public final void onClick(View view)
        {
            ReportHelper.unfollowUser(user, null);
            dialog.dismiss();
        }

        _cls7()
        {
            user = user1;
            dialog = basedialog;
            super();
        }
    }


    private class _cls4 extends ApiResponseHandler
    {

        final User val$user;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (apiresponse != null)
            {
                Application.showToast(apiresponse.getMessageDisplay());
            } else
            if (user.getFullName() != null)
            {
                Application.showToast(Resources.string(0x7f0705ab, new Object[] {
                    user.getFullName()
                }));
                return;
            }
        }

        public final void onFinish()
        {
            super.onFinish();
            Events.post(new DialogHideEvent(true));
        }

        public final void onStart()
        {
            if (user.getFullName() != null)
            {
                Events.post(new DialogEvent(new LoadingDialog(Resources.string(0x7f0705ad, new Object[] {
                    user.getFullName()
                }))));
            }
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.USER_UNBLOCK, user.getUid());
            if (user.getFullName() != null)
            {
                Application.showToastShort(Resources.string(0x7f0705ae, new Object[] {
                    user.getFullName()
                }));
            }
            user.setBlocked(Boolean.valueOf(false));
            ModelHelper.setUser(user);
            Events.post(new com.pinterest.api.model.User.UpdateEvent(user));
        }

        _cls4()
        {
            user = user1;
            super();
        }
    }


    private class _cls1 extends ApiResponseHandler
    {

        final Board val$board;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (apiresponse != null)
            {
                Application.showToast(apiresponse.getMessageDisplay());
                return;
            } else
            {
                Application.showToast(Resources.string(0x7f0705c0));
                return;
            }
        }

        public final void onFinish()
        {
            super.onFinish();
            Events.post(new DialogHideEvent(true));
        }

        public final void onStart()
        {
            Events.post(new DialogEvent(new LoadingDialog(Resources.string(0x7f0705b8))));
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.BOARD_UNFOLLOW, board.getUid());
            Application.showToastShort(Resources.string(0x7f0705b9));
            board.setFollowing(Boolean.valueOf(false));
            ModelHelper.setBoard(board);
            Events.post(new com.pinterest.api.model.Board.UpdateEvent(board));
        }

        _cls1()
        {
            board = board1;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final User val$user;

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            if (apiresponse != null)
            {
                Application.showToast(apiresponse.getMessageDisplay());
            } else
            if (user.getFullName() != null)
            {
                Application.showToast(Resources.string(0x7f0705c0, new Object[] {
                    user.getFullName()
                }));
                return;
            }
        }

        public final void onFinish()
        {
            super.onFinish();
            Events.post(new DialogHideEvent(true));
        }

        public final void onStart()
        {
            if (user.getFullName() != null)
            {
                Events.post(new DialogEvent(new LoadingDialog(Resources.string(0x7f0705c2, new Object[] {
                    user.getFullName()
                }))));
            }
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            Pinalytics.a(EventType.USER_UNFOLLOW, user.getUid());
            if (user.getFullName() != null)
            {
                Application.showToastShort(Resources.string(0x7f0705c3, new Object[] {
                    user.getFullName()
                }));
            }
            user.setFollowing(false);
            ModelHelper.setUser(user);
            Events.post(new com.pinterest.api.model.User.UpdateEvent(user));
            Events.postSticky(new com.pinterest.api.model.User.UserFollowEvent(user));
        }

        _cls2()
        {
            user = user1;
            super();
        }
    }

}
