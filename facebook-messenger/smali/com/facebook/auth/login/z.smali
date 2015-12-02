.class public Lcom/facebook/auth/login/z;
.super Lcom/facebook/auth/a/a;
.source "FbAppUserDataCleaner.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/common/executors/a;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/f/b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/f/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/common/executors/a;Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/executors/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/f/b;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/f/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/facebook/auth/a/a;-><init>()V

    .line 18
    const-class v0, Lcom/facebook/auth/login/z;

    iput-object v0, p0, Lcom/facebook/auth/login/z;->a:Ljava/lang/Class;

    .line 28
    iput-object p1, p0, Lcom/facebook/auth/login/z;->b:Lcom/facebook/common/executors/a;

    .line 29
    iput-object p2, p0, Lcom/facebook/auth/login/z;->c:Ljava/util/Set;

    .line 30
    iput-object p3, p0, Lcom/facebook/auth/login/z;->d:Ljava/util/Set;

    .line 31
    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/auth/login/z;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 56
    iget-object v0, p0, Lcom/facebook/auth/login/z;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/f/a;

    .line 57
    invoke-interface {v0}, Lcom/facebook/auth/f/a;->b()V

    goto :goto_0

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/z;->a:Ljava/lang/Class;

    const-string v1, "Privacy critical data is cleared successfully."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 61
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/auth/login/z;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 41
    iget-object v0, p0, Lcom/facebook/auth/login/z;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/f/b;

    .line 42
    invoke-interface {v0}, Lcom/facebook/auth/f/b;->d()V

    goto :goto_0

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/z;->a:Ljava/lang/Class;

    const-string v1, "User data is cleared successfully."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 46
    return-void
.end method
