.class public Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;
.super Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;
.source "DeleteMessagesDialogFragment.java"


# instance fields
.field private Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private aa:Landroid/app/AlertDialog;

.field private ab:Ljava/lang/String;

.field private ac:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;-><init>()V

    return-void
.end method

.method private R()V
    .locals 4

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    if-eqz v0, :cond_0

    .line 88
    :goto_0
    return-void

    .line 71
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "deleteMessagesOperation"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/mutators/a;

    invoke-direct {v1, p0}, Lcom/facebook/orca/mutators/a;-><init>(Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 84
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/m;->message_delete_progress:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 86
    iget-object v1, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v2, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->n()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    goto :goto_0
.end method

.method private S()V
    .locals 5

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 117
    :goto_0
    return-void

    .line 112
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 113
    const-string v1, "deleteMessagesParams"

    new-instance v2, Lcom/facebook/orca/server/DeleteMessagesParams;

    iget-object v3, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->ab:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->ac:Lcom/google/common/a/fi;

    invoke-direct {v2, v3, v4}, Lcom/facebook/orca/server/DeleteMessagesParams;-><init>(Ljava/lang/String;Lcom/google/common/a/fi;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 116
    iget-object v1, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->h:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a()V

    .line 124
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 130
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 131
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->u()Z

    move-result v1

    if-nez v1, :cond_1

    .line 139
    :cond_0
    :goto_0
    return-void

    .line 134
    :cond_1
    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/ui/d/a;->a(Landroid/support/v4/app/DialogFragment;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->aa:Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private d(I)Lcom/facebook/orca/activity/i;
    .locals 3

    .prologue
    .line 40
    new-instance v0, Lcom/facebook/orca/activity/i;

    invoke-direct {v0}, Lcom/facebook/orca/activity/i;-><init>()V

    .line 41
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    .line 42
    sget v2, Lcom/facebook/m;->message_delete_confirm_title:I

    invoke-virtual {v1, v2, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/activity/i;->a(Ljava/lang/String;)V

    .line 43
    sget v2, Lcom/facebook/m;->message_delete_confirm_msg:I

    invoke-virtual {v1, v2, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/activity/i;->b(Ljava/lang/String;)V

    .line 44
    sget v2, Lcom/facebook/m;->message_delete_confirm_ok_button:I

    invoke-virtual {v1, v2, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/activity/i;->c(Ljava/lang/String;)V

    .line 46
    sget-object v1, Lcom/facebook/orca/activity/j;->DELETE:Lcom/facebook/orca/activity/j;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/activity/i;->a(Lcom/facebook/orca/activity/j;)V

    .line 47
    return-object v0
.end method


# virtual methods
.method protected O()V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->S()V

    .line 93
    return-void
.end method

.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 97
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->Z:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->aa:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->aa:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 102
    iput-object v1, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->aa:Landroid/app/AlertDialog;

    .line 104
    :cond_1
    invoke-super {p0}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->b()V

    .line 105
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->a(Landroid/os/Bundle;)V

    .line 54
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    .line 55
    const-string v1, "thread_id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->ab:Ljava/lang/String;

    .line 56
    const-string v1, "message_ids"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/fi;->a(Ljava/util/Collection;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->ac:Lcom/google/common/a/fi;

    .line 57
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->ac:Lcom/google/common/a/fi;

    invoke-virtual {v0}, Lcom/google/common/a/fi;->size()I

    move-result v0

    .line 58
    invoke-direct {p0, v0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->d(I)Lcom/facebook/orca/activity/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a(Lcom/facebook/orca/activity/i;)V

    .line 60
    invoke-direct {p0}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->R()V

    .line 61
    return-void
.end method
