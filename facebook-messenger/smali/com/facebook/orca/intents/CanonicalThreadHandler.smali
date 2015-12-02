.class public Lcom/facebook/orca/intents/CanonicalThreadHandler;
.super Lcom/facebook/base/activity/i;
.source "CanonicalThreadHandler.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private p:Lcom/facebook/orca/f/k;

.field private q:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private r:Lcom/facebook/widget/listview/EmptyListViewItem;

.field private s:Landroid/content/ComponentName;

.field private t:Lcom/facebook/orca/threadview/do;

.field private u:Lcom/facebook/user/UserKey;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Intent;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 138
    const-string v0, "trigger"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 139
    if-eqz v0, :cond_0

    .line 140
    const-string v1, "trigger"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 148
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 149
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->d()Lcom/facebook/user/User;

    move-result-object v1

    .line 150
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 151
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 152
    const-string v3, "focus_compose"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 155
    if-eqz v0, :cond_0

    .line 157
    new-instance v1, Landroid/content/Intent;

    const-class v4, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v1, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 158
    const-string v4, "thread_id"

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    const-string v0, "focus_compose"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 160
    invoke-direct {p0, v2, v1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Landroid/content/Intent;Landroid/content/Intent;)V

    .line 161
    invoke-virtual {p0, v1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->startActivity(Landroid/content/Intent;)V

    .line 162
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->finish()V

    .line 212
    :goto_0
    return-void

    .line 163
    :cond_0
    if-eqz v1, :cond_5

    .line 167
    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v4, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v4, :cond_1

    invoke-virtual {v1}, Lcom/facebook/user/User;->E()Ljava/lang/String;

    move-result-object v0

    const-string v4, "user"

    invoke-static {v0, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    new-instance v0, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v1}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 172
    invoke-static {v0}, Lcom/facebook/user/RecipientInfo;->a(Lcom/facebook/user/UserWithIdentifier;)Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 175
    new-instance v1, Landroid/content/Intent;

    const-class v4, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v1, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 176
    const-string v4, "thread_view_spec"

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 177
    const-string v0, "focus_compose"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 178
    invoke-direct {p0, v2, v1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Landroid/content/Intent;Landroid/content/Intent;)V

    .line 179
    invoke-virtual {p0, v1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->startActivity(Landroid/content/Intent;)V

    .line 180
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->finish()V

    goto :goto_0

    .line 185
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v3, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 186
    invoke-virtual {v1}, Lcom/facebook/user/User;->E()Ljava/lang/String;

    move-result-object v3

    const-string v4, "page"

    invoke-static {v3, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 187
    const-string v3, "disableContactPicker"

    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 189
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v3

    .line 190
    if-nez v3, :cond_4

    .line 192
    invoke-virtual {v1}, Lcom/facebook/user/User;->o()Lcom/facebook/user/UserPhoneNumber;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 193
    new-instance v3, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v1}, Lcom/facebook/user/User;->o()Lcom/facebook/user/UserPhoneNumber;

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 195
    const-string v1, "to"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 201
    :cond_3
    :goto_1
    const-string v1, "focus_compose"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 202
    invoke-direct {p0, v2, v0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Landroid/content/Intent;Landroid/content/Intent;)V

    .line 203
    invoke-virtual {p0, v0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->startActivity(Landroid/content/Intent;)V

    .line 204
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->finish()V

    goto/16 :goto_0

    .line 198
    :cond_4
    new-instance v4, Lcom/facebook/user/UserWithIdentifier;

    invoke-direct {v4, v1, v3}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 199
    const-string v1, "to"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    goto :goto_1

    .line 207
    :cond_5
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/d/a;->a(Landroid/app/Activity;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto/16 :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 218
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/d/a;->a(Landroid/app/Activity;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 223
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/intents/CanonicalThreadHandler;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/intents/CanonicalThreadHandler;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 63
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 65
    sget v0, Lcom/facebook/k;->orca_loading_screen:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->setContentView(I)V

    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 68
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->p:Lcom/facebook/orca/f/k;

    .line 69
    sget v0, Lcom/facebook/i;->empty_item_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/listview/EmptyListViewItem;

    iput-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->r:Lcom/facebook/widget/listview/EmptyListViewItem;

    .line 71
    const-class v0, Landroid/content/ComponentName;

    const-class v2, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    iput-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->s:Landroid/content/ComponentName;

    .line 72
    const-class v0, Lcom/facebook/orca/threadview/do;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/do;

    iput-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->t:Lcom/facebook/orca/threadview/do;

    .line 74
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 75
    const-string v0, "user_key"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->u:Lcom/facebook/user/UserKey;

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->u:Lcom/facebook/user/UserKey;

    if-nez v0, :cond_1

    .line 77
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->finish()V

    .line 119
    :cond_0
    :goto_0
    return-void

    .line 81
    :cond_1
    const-string v0, "fetchCanonicalThread"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->q:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 82
    iget-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->q:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v2, Lcom/facebook/orca/intents/a;

    invoke-direct {v2, p0}, Lcom/facebook/orca/intents/a;-><init>(Lcom/facebook/orca/intents/CanonicalThreadHandler;)V

    invoke-virtual {v0, v2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 95
    iget-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->r:Lcom/facebook/widget/listview/EmptyListViewItem;

    sget v2, Lcom/facebook/o;->thread_list_loading:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->setMessage(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->r:Lcom/facebook/widget/listview/EmptyListViewItem;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Z)V

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->p:Lcom/facebook/orca/f/k;

    iget-object v2, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->u:Lcom/facebook/user/UserKey;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 100
    if-eqz v2, :cond_0

    .line 101
    const-string v0, "focus_compose"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 102
    const-string v0, "use_thread_list"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 107
    iget-object v4, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->s:Landroid/content/ComponentName;

    invoke-virtual {v0, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 108
    const/high16 v4, 0x4000000

    invoke-virtual {v0, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 112
    :goto_1
    const-string v4, "thread_id"

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    const-string v2, "focus_compose"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 115
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->a(Landroid/content/Intent;Landroid/content/Intent;)V

    .line 116
    invoke-virtual {p0, v0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->startActivity(Landroid/content/Intent;)V

    .line 117
    invoke-virtual {p0}, Lcom/facebook/orca/intents/CanonicalThreadHandler;->finish()V

    goto :goto_0

    .line 110
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-class v4, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Lcom/facebook/analytics/f/a;->CANONICAL_THREAD_HANDLER_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected onResume()V
    .locals 3

    .prologue
    .line 123
    invoke-super {p0}, Lcom/facebook/base/activity/i;->onResume()V

    .line 126
    iget-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->q:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    new-instance v0, Lcom/facebook/orca/server/ac;

    invoke-direct {v0}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v1, Lcom/facebook/fbservice/service/s;->STALE_DATA_OKAY:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->u:Lcom/facebook/user/UserKey;

    invoke-static {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 131
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 132
    const-string v2, "fetchThreadParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/intents/CanonicalThreadHandler;->q:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->k:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 135
    :cond_0
    return-void
.end method
