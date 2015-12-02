.class public Lcom/facebook/orca/mutators/ResendMessageDialogFragment;
.super Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;
.source "ResendMessageDialogFragment.java"


# instance fields
.field private Z:Lcom/facebook/orca/f/r;

.field private aa:Lcom/facebook/ui/d/d;

.field private ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

.field private ac:Lcom/facebook/analytics/cn;

.field private ad:Lcom/facebook/orca/photos/b/k;

.field private ae:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private af:Lcom/facebook/messages/model/threads/Message;

.field private ag:Landroid/app/AlertDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;-><init>()V

    return-void
.end method

.method private R()V
    .locals 5

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    .line 151
    :goto_0
    return-void

    .line 146
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 147
    const-string v1, "deleteMessagesParams"

    new-instance v2, Lcom/facebook/orca/server/DeleteMessagesParams;

    iget-object v3, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/facebook/orca/server/DeleteMessagesParams;-><init>(Ljava/lang/String;Lcom/google/common/a/fi;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 150
    iget-object v1, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->h:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method private S()V
    .locals 4

    .prologue
    .line 157
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    if-eqz v0, :cond_0

    .line 178
    :goto_0
    return-void

    .line 161
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "deleteMessagesOperation"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/mutators/j;

    invoke-direct {v1, p0}, Lcom/facebook/orca/mutators/j;-><init>(Lcom/facebook/orca/mutators/ResendMessageDialogFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 174
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/m;->message_delete_progress:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 176
    iget-object v1, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v2, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->n()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    goto :goto_0
.end method

.method public static a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/mutators/ResendMessageDialogFragment;
    .locals 2

    .prologue
    .line 52
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 53
    const-string v1, "message"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 55
    new-instance v1, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;

    invoke-direct {v1}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;-><init>()V

    .line 56
    invoke-virtual {v1, v0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->g(Landroid/os/Bundle;)V

    .line 57
    return-object v1
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 184
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a()V

    .line 185
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 191
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 192
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->u()Z

    move-result v1

    if-nez v1, :cond_1

    .line 200
    :cond_0
    :goto_0
    return-void

    .line 195
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

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ag:Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/ResendMessageDialogFragment;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/ResendMessageDialogFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method


# virtual methods
.method protected O()V
    .locals 3

    .prologue
    .line 111
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ae:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ad:Lcom/facebook/orca/photos/b/k;

    iget-object v1, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/photos/b/k;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->Z:Lcom/facebook/orca/f/r;

    iget-object v1, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/r;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 118
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ac:Lcom/facebook/analytics/cn;

    iget-object v1, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->K()Lcom/facebook/messages/model/threads/SendError;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/SendError;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a()V

    .line 122
    return-void
.end method

.method protected P()V
    .locals 0

    .prologue
    .line 126
    invoke-direct {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->R()V

    .line 127
    return-void
.end method

.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 131
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ab:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ag:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ag:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 136
    iput-object v1, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ag:Landroid/app/AlertDialog;

    .line 138
    :cond_1
    invoke-super {p0}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->b()V

    .line 139
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 67
    invoke-super {p0, p1}, Lcom/facebook/orca/dialog/ConfirmActionDialogFragment;->a(Landroid/os/Bundle;)V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 70
    const-class v0, Lcom/facebook/orca/f/r;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/r;

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->Z:Lcom/facebook/orca/f/r;

    .line 71
    const-class v0, Lcom/facebook/ui/d/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/d;

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->aa:Lcom/facebook/ui/d/d;

    .line 72
    const-class v0, Lcom/facebook/analytics/cn;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cn;

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ac:Lcom/facebook/analytics/cn;

    .line 73
    const-class v0, Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/k;

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ad:Lcom/facebook/orca/photos/b/k;

    .line 74
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsNewPhotoUploadEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->ae:Ljavax/inject/a;

    .line 77
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    .line 78
    const-string v1, "message"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    iput-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    .line 79
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ResendMessageDialogFragment needs a message in its arguments Bundle"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 91
    :goto_0
    const/4 v1, 0x0

    .line 92
    iget-object v2, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->Z:Lcom/facebook/orca/f/r;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/r;->b(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/fbservice/service/ServiceException;

    move-result-object v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    iget-object v1, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->aa:Lcom/facebook/ui/d/d;

    invoke-virtual {v1, v0, v3, v3}, Lcom/facebook/ui/d/d;->a(Lcom/facebook/fbservice/service/ServiceException;ZZ)Ljava/lang/String;

    move-result-object v0

    .line 97
    :goto_1
    new-instance v1, Lcom/facebook/orca/activity/i;

    invoke-direct {v1}, Lcom/facebook/orca/activity/i;-><init>()V

    .line 98
    sget v2, Lcom/facebook/o;->retry_send_heading:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/activity/i;->a(Ljava/lang/String;)V

    .line 99
    invoke-virtual {v1, v0}, Lcom/facebook/orca/activity/i;->b(Ljava/lang/String;)V

    .line 100
    sget v0, Lcom/facebook/o;->retry_send_positive_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/activity/i;->c(Ljava/lang/String;)V

    .line 101
    sget-object v0, Lcom/facebook/orca/activity/j;->DELETE:Lcom/facebook/orca/activity/j;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/activity/i;->b(Lcom/facebook/orca/activity/j;)V

    .line 102
    sget v0, Lcom/facebook/o;->retry_send_delete_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/activity/i;->d(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0, v1}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->a(Lcom/facebook/orca/activity/i;)V

    .line 105
    invoke-direct {p0}, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->S()V

    .line 106
    return-void

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/mutators/ResendMessageDialogFragment;->af:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method
