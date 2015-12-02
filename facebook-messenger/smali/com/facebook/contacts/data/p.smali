.class public Lcom/facebook/contacts/data/p;
.super Ljava/lang/Object;
.source "DynamicContactDataEnsurer.java"


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
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/fbservice/ops/k;

.field private d:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/contacts/data/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/contacts/data/p;

    sput-object v0, Lcom/facebook/contacts/data/p;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/fbservice/ops/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/fbservice/ops/k;",
            ")V"
        }
    .end annotation

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/facebook/contacts/data/p;->b:Ljavax/inject/a;

    .line 43
    iput-object p2, p0, Lcom/facebook/contacts/data/p;->c:Lcom/facebook/fbservice/ops/k;

    .line 44
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/data/p;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/contacts/data/p;->d:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/contacts/data/p;Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/contacts/data/p;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/data/p;Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/contacts/data/p;->a(Lcom/facebook/fbservice/service/ServiceException;)V

    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 85
    sget-object v0, Lcom/facebook/contacts/data/p;->a:Ljava/lang/Class;

    const-string v1, "onSyncChatContextSucceeded"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/facebook/contacts/data/p;->e:Lcom/facebook/contacts/data/r;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/facebook/contacts/data/p;->e:Lcom/facebook/contacts/data/r;

    invoke-interface {v0}, Lcom/facebook/contacts/data/r;->a()V

    .line 89
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 92
    sget-object v0, Lcom/facebook/contacts/data/p;->a:Ljava/lang/Class;

    const-string v1, "SYNC_CHAT_CONTEXT error"

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    iget-object v0, p0, Lcom/facebook/contacts/data/p;->e:Lcom/facebook/contacts/data/r;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/facebook/contacts/data/p;->e:Lcom/facebook/contacts/data/r;

    invoke-interface {v0}, Lcom/facebook/contacts/data/r;->b()V

    .line 96
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/contacts/data/p;->d:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_1

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/data/p;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    sget-object v0, Lcom/facebook/contacts/data/p;->a:Ljava/lang/Class;

    const-string v1, "start SYNC_CHAT_CONTEXT"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 59
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 60
    new-instance v1, Lcom/facebook/contacts/server/FetchChatContextParams;

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {v1, v2}, Lcom/facebook/contacts/server/FetchChatContextParams;-><init>(Lcom/facebook/fbservice/service/s;)V

    .line 62
    const-string v2, "fetchChatContextParams"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 63
    iget-object v1, p0, Lcom/facebook/contacts/data/p;->c:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->p:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/data/p;->d:Lcom/google/common/d/a/s;

    .line 66
    iget-object v0, p0, Lcom/facebook/contacts/data/p;->d:Lcom/google/common/d/a/s;

    new-instance v1, Lcom/facebook/contacts/data/q;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/data/q;-><init>(Lcom/facebook/contacts/data/p;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/contacts/data/r;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/contacts/data/p;->e:Lcom/facebook/contacts/data/r;

    .line 48
    return-void
.end method
