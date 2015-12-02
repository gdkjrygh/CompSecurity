.class public Lcom/facebook/orca/mutators/RemoveMemberActivity;
.super Lcom/facebook/orca/activity/e;
.source "RemoveMemberActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private p:Lcom/facebook/orca/f/k;

.field private q:Lcom/facebook/orca/threads/ThreadSummary;

.field private r:Lcom/facebook/user/User;

.field private s:Lcom/facebook/fbservice/ops/BlueServiceFragment;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/orca/activity/e;-><init>()V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->finish()V

    .line 112
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 118
    invoke-static {p0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/d/a;->a(Landroid/app/Activity;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    .line 123
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/RemoveMemberActivity;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/RemoveMemberActivity;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private m()Lcom/facebook/orca/activity/i;
    .locals 5

    .prologue
    .line 45
    new-instance v0, Lcom/facebook/orca/activity/i;

    invoke-direct {v0}, Lcom/facebook/orca/activity/i;-><init>()V

    .line 46
    sget v1, Lcom/facebook/o;->thread_remove_member_confirm_heading:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/activity/i;->a(Ljava/lang/String;)V

    .line 47
    sget v1, Lcom/facebook/o;->thread_remove_member_confirm_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->r:Lcom/facebook/user/User;

    invoke-virtual {v4}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/user/Name;->d()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/activity/i;->b(Ljava/lang/String;)V

    .line 49
    sget v1, Lcom/facebook/o;->thread_remove_member_confirm_ok_button:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/activity/i;->c(Ljava/lang/String;)V

    .line 50
    sget-object v1, Lcom/facebook/orca/activity/j;->DELETE:Lcom/facebook/orca/activity/j;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/activity/i;->a(Lcom/facebook/orca/activity/j;)V

    .line 51
    return-object v0
.end method

.method private n()V
    .locals 3

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 105
    :goto_0
    return-void

    .line 101
    :cond_0
    new-instance v0, Lcom/facebook/orca/server/RemoveMemberParams;

    iget-object v1, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->q:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->r:Lcom/facebook/user/User;

    invoke-virtual {v2}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/server/RemoveMemberParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 103
    const-string v2, "removeMemberParams"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->o:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 56
    invoke-super {p0, p1}, Lcom/facebook/orca/activity/e;->b(Landroid/os/Bundle;)V

    .line 58
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    .line 59
    const-class v1, Lcom/facebook/orca/f/k;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->p:Lcom/facebook/orca/f/k;

    .line 62
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 63
    const-string v1, "threadid"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 64
    const-string v2, "user_key"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 66
    iget-object v2, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->p:Lcom/facebook/orca/f/k;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->q:Lcom/facebook/orca/threads/ThreadSummary;

    .line 67
    iget-object v1, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->p:Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->r:Lcom/facebook/user/User;

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->q:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->r:Lcom/facebook/user/User;

    if-nez v0, :cond_1

    .line 69
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->finish()V

    .line 89
    :goto_0
    return-void

    .line 73
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->m()Lcom/facebook/orca/activity/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->a(Lcom/facebook/orca/activity/i;)V

    .line 75
    const-string v0, "removeMemberOperation"

    invoke-static {p0, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/i;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 76
    iget-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/mutators/i;

    invoke-direct {v1, p0}, Lcom/facebook/orca/mutators/i;-><init>(Lcom/facebook/orca/mutators/RemoveMemberActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/mutators/RemoveMemberActivity;->s:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    sget v2, Lcom/facebook/o;->thread_remove_member_progress:I

    invoke-direct {v1, p0, v2}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    goto :goto_0
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/facebook/analytics/f/a;->REMOVE_MEMBER_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method protected j()V
    .locals 0

    .prologue
    .line 93
    invoke-direct {p0}, Lcom/facebook/orca/mutators/RemoveMemberActivity;->n()V

    .line 94
    return-void
.end method
