.class public Lcom/facebook/orca/login/af;
.super Ljava/lang/Object;
.source "WildfireRegistrationOperation.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/orca/login/ah;

.field private final c:Lcom/facebook/analytics/av;

.field private final d:Lcom/facebook/auth/b/d;

.field private final e:Lcom/facebook/auth/login/v;

.field private final f:Lcom/facebook/prefs/shared/d;

.field private final g:Lcom/facebook/orca/nux/h;

.field private final h:Lcom/facebook/orca/login/b;

.field private final i:Lcom/facebook/auth/login/am;

.field private final j:Lcom/facebook/user/a/h;

.field private k:Ljava/lang/String;

.field private l:Lcom/facebook/fbservice/ops/BlueServiceFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/orca/login/af;

    sput-object v0, Lcom/facebook/orca/login/af;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/d;Lcom/facebook/analytics/av;Lcom/facebook/auth/login/v;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/nux/h;Lcom/facebook/orca/login/b;Lcom/facebook/auth/login/am;Lcom/facebook/user/a/h;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/facebook/orca/login/af;->d:Lcom/facebook/auth/b/d;

    .line 69
    iput-object p2, p0, Lcom/facebook/orca/login/af;->c:Lcom/facebook/analytics/av;

    .line 70
    iput-object p3, p0, Lcom/facebook/orca/login/af;->e:Lcom/facebook/auth/login/v;

    .line 71
    iput-object p4, p0, Lcom/facebook/orca/login/af;->f:Lcom/facebook/prefs/shared/d;

    .line 72
    iput-object p5, p0, Lcom/facebook/orca/login/af;->g:Lcom/facebook/orca/nux/h;

    .line 73
    iput-object p6, p0, Lcom/facebook/orca/login/af;->h:Lcom/facebook/orca/login/b;

    .line 74
    iput-object p7, p0, Lcom/facebook/orca/login/af;->i:Lcom/facebook/auth/login/am;

    .line 75
    iput-object p8, p0, Lcom/facebook/orca/login/af;->j:Lcom/facebook/user/a/h;

    .line 76
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 133
    sget-object v0, Lcom/facebook/orca/login/af;->a:Ljava/lang/Class;

    const-string v1, "Registration succeeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 135
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;

    .line 138
    iget-object v1, p0, Lcom/facebook/orca/login/af;->i:Lcom/facebook/auth/login/am;

    invoke-virtual {v1}, Lcom/facebook/auth/login/am;->c()V

    .line 139
    iget-object v1, p0, Lcom/facebook/orca/login/af;->d:Lcom/facebook/auth/b/d;

    new-instance v2, Lcom/facebook/auth/credentials/FacebookCredentials;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->b()Ljava/lang/String;

    move-result-object v4

    const-wide/16 v5, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/facebook/auth/credentials/FacebookCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {v1, v2, v7}, Lcom/facebook/auth/b/d;->a(Lcom/facebook/auth/credentials/FacebookCredentials;Z)V

    .line 143
    iget-object v1, p0, Lcom/facebook/orca/login/af;->c:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/orca/login/af;->h:Lcom/facebook/orca/login/b;

    iget-object v3, p0, Lcom/facebook/orca/login/af;->k:Ljava/lang/String;

    const-string v4, "registration_success"

    invoke-virtual {v2, v3, v4}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "user_id"

    invoke-virtual {v0}, Lcom/facebook/orca/server/ConfirmPhoneAndRegisterPartialAccountResult;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/login/af;->f:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->p:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v7}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/login/af;->g:Lcom/facebook/orca/nux/h;

    invoke-virtual {v0}, Lcom/facebook/orca/nux/h;->a()V

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/login/af;->e:Lcom/facebook/auth/login/v;

    invoke-virtual {v0}, Lcom/facebook/auth/login/v;->b()V

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/login/af;->b:Lcom/facebook/orca/login/ah;

    invoke-interface {v0}, Lcom/facebook/orca/login/ah;->T()V

    .line 156
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 3

    .prologue
    .line 159
    sget-object v0, Lcom/facebook/orca/login/af;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registration failed with error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/login/af;->c:Lcom/facebook/analytics/av;

    iget-object v1, p0, Lcom/facebook/orca/login/af;->h:Lcom/facebook/orca/login/b;

    const-string v2, "registration_failure"

    invoke-virtual {v1, v2, p1}, Lcom/facebook/orca/login/b;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 164
    iget-object v0, p0, Lcom/facebook/orca/login/af;->b:Lcom/facebook/orca/login/ah;

    invoke-interface {v0, p1}, Lcom/facebook/orca/login/ah;->b(Lcom/facebook/fbservice/service/ServiceException;)V

    .line 165
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/af;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/af;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/af;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/af;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 79
    const-string v0, "registerPartialAccountOperation"

    invoke-static {p1, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/af;->l:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/login/af;->l:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/login/ag;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/ag;-><init>(Lcom/facebook/orca/login/af;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 94
    return-void
.end method

.method public a(Lcom/facebook/orca/login/ah;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/facebook/orca/login/af;->b:Lcom/facebook/orca/login/ah;

    .line 98
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/orca/login/af;->k:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/orca/login/af;->j:Lcom/facebook/user/a/h;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/user/a/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 122
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 123
    const-string v2, "phone"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    const-string v2, "countryCode"

    invoke-virtual {v1, v2, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string v2, "confirmationCode"

    invoke-virtual {v1, v2, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v2, "fullName"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v0, "firstName"

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "lastName"

    invoke-virtual {v1, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/login/af;->l:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->c:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v0, v2, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 130
    return-void
.end method

.method public a()Z
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/orca/login/af;->l:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->b()Lcom/facebook/fbservice/ops/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/ops/j;->INIT:Lcom/facebook/fbservice/ops/j;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
