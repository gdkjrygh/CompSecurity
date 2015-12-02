.class public Lcom/facebook/orca/login/an;
.super Ljava/lang/Object;
.source "WildfireUserLookupOperation.java"


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
.field private b:Lcom/facebook/orca/login/ap;

.field private c:Ljava/lang/String;

.field private d:Lcom/facebook/fbservice/ops/BlueServiceFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/facebook/orca/login/an;

    sput-object v0, Lcom/facebook/orca/login/an;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 3

    .prologue
    .line 76
    sget-object v0, Lcom/facebook/orca/login/an;->a:Ljava/lang/Class;

    const-string v1, "User lookup succeeded. Redirecting to login screen..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 79
    iget-object v1, p0, Lcom/facebook/orca/login/an;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/user/User;->q()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/login/an;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 86
    sget-object v0, Lcom/facebook/orca/login/an;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "User lookup failed with error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 87
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    if-ne v0, v1, :cond_0

    .line 88
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 89
    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    .line 90
    sget-object v1, Lcom/facebook/orca/login/an;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "API error code: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 97
    :cond_0
    invoke-direct {p0, v4, v4, v4}, Lcom/facebook/orca/login/an;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/an;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/an;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/login/an;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/orca/login/an;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 104
    new-instance v0, Lcom/facebook/base/fragment/e;

    const-class v1, Lcom/facebook/auth/login/PasswordCredentialsFragment;

    invoke-direct {v0, v1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->a()Lcom/facebook/base/fragment/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    .line 107
    if-eqz p1, :cond_0

    .line 108
    invoke-static {p1, p2, p3}, Lcom/facebook/auth/login/PasswordCredentialsFragment;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 112
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/login/an;->b:Lcom/facebook/orca/login/ap;

    invoke-interface {v1, v0}, Lcom/facebook/orca/login/ap;->c(Landroid/content/Intent;)V

    .line 113
    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 2

    .prologue
    .line 40
    const-string v0, "userLookupOperation"

    invoke-static {p1, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Lcom/facebook/fbservice/ops/BlueServiceFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/an;->d:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    .line 42
    iget-object v0, p0, Lcom/facebook/orca/login/an;->d:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    new-instance v1, Lcom/facebook/orca/login/ao;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/ao;-><init>(Lcom/facebook/orca/login/an;)V

    invoke-virtual {v0, v1}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/ops/h;)V

    .line 55
    return-void
.end method

.method public a(Lcom/facebook/orca/login/ap;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/orca/login/an;->b:Lcom/facebook/orca/login/ap;

    .line 59
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 65
    sget-object v0, Lcom/facebook/orca/login/an;->a:Ljava/lang/Class;

    const-string v1, "This number already belongs to a full Facebook account."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 67
    iput-object p2, p0, Lcom/facebook/orca/login/an;->c:Ljava/lang/String;

    .line 70
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 71
    const-string v1, "uid"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/login/an;->d:Lcom/facebook/fbservice/ops/BlueServiceFragment;

    sget-object v2, Lcom/facebook/orca/server/aq;->d:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/fbservice/ops/BlueServiceFragment;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 73
    return-void
.end method
