.class public Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;
.super Landroid/support/v4/app/DialogFragment;
.source "DeleteThreadDialogFragment.java"


# static fields
.field private static final Z:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private aa:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private ab:Ljava/lang/String;

.field private ac:Lcom/facebook/fbservice/ops/k;

.field private ad:Lcom/facebook/prefs/shared/d;

.field private ae:Lcom/facebook/analytics/av;

.field private af:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    const-class v0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    sput-object v0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->Z:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    return-void
.end method

.method private O()V
    .locals 4

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->aa:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 119
    :goto_0
    return-void

    .line 96
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 97
    const-string v1, "deleteThreadParams"

    new-instance v2, Lcom/facebook/orca/server/DeleteThreadParams;

    iget-object v3, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ab:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/facebook/orca/server/DeleteThreadParams;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 98
    iget-object v1, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ac:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/orca/server/aq;->g:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    .line 100
    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->n()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->thread_delete_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/fbservice/ops/m;->a(Lcom/facebook/fbservice/ops/ab;)Lcom/facebook/fbservice/ops/m;

    .line 102
    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->aa:Lcom/google/common/d/a/s;

    .line 104
    invoke-direct {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->P()V

    .line 106
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->aa:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/orca/mutators/d;

    invoke-direct {v1, p0}, Lcom/facebook/orca/mutators/d;-><init>(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method private P()V
    .locals 3

    .prologue
    .line 153
    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v0, "delete_thread"

    invoke-direct {v1, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->r()Landroid/support/v4/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/analytics/d;

    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->r()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/d;

    invoke-interface {v0}, Lcom/facebook/analytics/d;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/analytics/cb;->a(Lcom/facebook/analytics/f/a;)Lcom/facebook/analytics/cb;

    .line 157
    :cond_0
    const-string v0, "thread_id"

    iget-object v2, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ab:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ae:Lcom/facebook/analytics/av;

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 159
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;
    .locals 3

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;

    invoke-direct {v0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;-><init>()V

    .line 49
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 50
    const-string v2, "threadId"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual {v0, v1}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->g(Landroid/os/Bundle;)V

    .line 52
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->aa:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->af:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 150
    :goto_0
    return-void

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->af:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/ui/d/a;->a(Landroid/content/Context;)Lcom/facebook/ui/d/a;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_error_dialog_title:I

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(I)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/ui/d/a;->a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/mutators/e;

    invoke-direct {v1, p0}, Lcom/facebook/orca/mutators/e;-><init>(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/d/a;->a(Landroid/content/DialogInterface$OnClickListener;)Lcom/facebook/ui/d/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/d/a;->a()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->O()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ab:Ljava/lang/String;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 126
    sget-object v0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->Z:Ljava/lang/Class;

    const-string v1, "Delete some shared preferences for deleted thread"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 127
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->d(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 128
    iget-object v1, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ad:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 129
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 57
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->a(Landroid/os/Bundle;)V

    .line 58
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    .line 59
    const-string v1, "threadId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ab:Ljava/lang/String;

    .line 60
    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->n()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->af:Landroid/content/Context;

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->af:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 63
    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ac:Lcom/facebook/fbservice/ops/k;

    .line 64
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ae:Lcom/facebook/analytics/av;

    .line 65
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->ad:Lcom/facebook/prefs/shared/d;

    .line 66
    return-void
.end method

.method public c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 70
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/facebook/o;->thread_delete_confirm_title:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->thread_delete_confirm_msg:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->thread_delete_confirm_ok_button:I

    new-instance v2, Lcom/facebook/orca/mutators/c;

    invoke-direct {v2, p0}, Lcom/facebook/orca/mutators/c;-><init>(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/facebook/o;->dialog_cancel:I

    new-instance v2, Lcom/facebook/orca/mutators/b;

    invoke-direct {v2, p0}, Lcom/facebook/orca/mutators/b;-><init>(Lcom/facebook/orca/mutators/DeleteThreadDialogFragment;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method
