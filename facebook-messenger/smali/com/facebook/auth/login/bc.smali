.class public Lcom/facebook/auth/login/bc;
.super Ljava/lang/Object;
.source "LoginOperations.java"


# instance fields
.field private final a:Lcom/facebook/auth/b/b;

.field private final b:Lcom/facebook/http/protocol/w;

.field private final c:Lcom/facebook/auth/protocol/h;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/a/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/http/protocol/w;Lcom/facebook/auth/protocol/h;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/http/protocol/w;",
            "Lcom/facebook/auth/protocol/h;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/a/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/auth/login/bc;->a:Lcom/facebook/auth/b/b;

    .line 42
    iput-object p2, p0, Lcom/facebook/auth/login/bc;->b:Lcom/facebook/http/protocol/w;

    .line 43
    iput-object p3, p0, Lcom/facebook/auth/login/bc;->c:Lcom/facebook/auth/protocol/h;

    .line 44
    iput-object p4, p0, Lcom/facebook/auth/login/bc;->d:Ljava/util/Set;

    .line 45
    return-void
.end method

.method static synthetic a(Lcom/facebook/auth/login/bc;)Lcom/facebook/auth/protocol/h;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/auth/login/bc;->c:Lcom/facebook/auth/protocol/h;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/auth/login/bc;)Lcom/facebook/auth/b/b;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/auth/login/bc;->a:Lcom/facebook/auth/b/b;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/auth/login/bc;->a:Lcom/facebook/auth/b/b;

    instance-of v0, v0, Lcom/facebook/auth/b/d;

    const-string v1, "handleLogin can only be used with LoggedInUserSessionManager"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 57
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 60
    new-instance v0, Lcom/facebook/auth/login/be;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/auth/login/be;-><init>(Lcom/facebook/auth/login/bc;Lcom/facebook/auth/login/bd;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object v0, p0, Lcom/facebook/auth/login/bc;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/c;

    .line 64
    invoke-interface {v0}, Lcom/facebook/auth/a/c;->b()Lcom/facebook/http/protocol/v;

    move-result-object v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 71
    :cond_1
    new-instance v0, Lcom/facebook/http/protocol/l;

    invoke-direct {v0}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 72
    sget-object v2, Lcom/facebook/http/protocol/m;->BOOTSTRAP:Lcom/facebook/http/protocol/m;

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/l;->a(Lcom/facebook/http/protocol/m;)V

    .line 74
    iget-object v2, p0, Lcom/facebook/auth/login/bc;->b:Lcom/facebook/http/protocol/w;

    const-string v3, "handleLogin"

    invoke-virtual {v2, v3, v1, v0}, Lcom/facebook/http/protocol/w;->a(Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/l;)V

    .line 75
    return-void
.end method
