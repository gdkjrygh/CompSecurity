.class public Lcom/facebook/auth/login/a;
.super Ljava/lang/Object;
.source "AuthDataStoreLogoutHelper.java"


# instance fields
.field private final a:Lcom/facebook/common/executors/a;

.field private final b:Lcom/facebook/fbservice/service/o;

.field private final c:Lcom/facebook/http/b/ap;

.field private final d:Lcom/facebook/auth/b/b;

.field private final e:Lcom/facebook/auth/userscope/b;


# direct methods
.method public constructor <init>(Lcom/facebook/common/executors/a;Lcom/facebook/fbservice/service/o;Lcom/facebook/http/b/ap;Lcom/facebook/auth/b/b;Lcom/facebook/auth/userscope/b;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/facebook/auth/login/a;->a:Lcom/facebook/common/executors/a;

    .line 32
    iput-object p2, p0, Lcom/facebook/auth/login/a;->b:Lcom/facebook/fbservice/service/o;

    .line 33
    iput-object p3, p0, Lcom/facebook/auth/login/a;->c:Lcom/facebook/http/b/ap;

    .line 34
    iput-object p4, p0, Lcom/facebook/auth/login/a;->d:Lcom/facebook/auth/b/b;

    .line 35
    iput-object p5, p0, Lcom/facebook/auth/login/a;->e:Lcom/facebook/auth/userscope/b;

    .line 36
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 45
    iget-object v2, p0, Lcom/facebook/auth/login/a;->a:Lcom/facebook/common/executors/a;

    invoke-interface {v2}, Lcom/facebook/common/executors/a;->b()V

    .line 50
    iget-object v2, p0, Lcom/facebook/auth/login/a;->b:Lcom/facebook/fbservice/service/o;

    invoke-virtual {v2}, Lcom/facebook/fbservice/service/o;->a()V

    .line 53
    :try_start_0
    iget-object v2, p0, Lcom/facebook/auth/login/a;->c:Lcom/facebook/http/b/ap;

    invoke-virtual {v2}, Lcom/facebook/http/b/ap;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 56
    :try_start_1
    iget-object v2, p0, Lcom/facebook/auth/login/a;->c:Lcom/facebook/http/b/ap;

    invoke-virtual {v2}, Lcom/facebook/http/b/ap;->c()V

    .line 58
    iget-object v2, p0, Lcom/facebook/auth/login/a;->b:Lcom/facebook/fbservice/service/o;

    invoke-virtual {v2}, Lcom/facebook/fbservice/service/o;->d()V

    .line 60
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 63
    iget-object v2, p0, Lcom/facebook/auth/login/a;->d:Lcom/facebook/auth/b/b;

    invoke-interface {v2}, Lcom/facebook/auth/b/b;->b()Z

    move-result v2

    if-nez v2, :cond_1

    move v2, v0

    :goto_0
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 65
    iget-object v2, p0, Lcom/facebook/auth/login/a;->d:Lcom/facebook/auth/b/b;

    instance-of v2, v2, Lcom/facebook/auth/b/d;

    if-eqz v2, :cond_0

    .line 67
    iget-object v2, p0, Lcom/facebook/auth/login/a;->d:Lcom/facebook/auth/b/b;

    invoke-interface {v2}, Lcom/facebook/auth/b/b;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v2

    if-nez v2, :cond_2

    :goto_1
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/a;->e:Lcom/facebook/auth/userscope/b;

    invoke-virtual {v0}, Lcom/facebook/auth/userscope/b;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :try_start_2
    iget-object v0, p0, Lcom/facebook/auth/login/a;->c:Lcom/facebook/http/b/ap;

    invoke-virtual {v0}, Lcom/facebook/http/b/ap;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 83
    iget-object v0, p0, Lcom/facebook/auth/login/a;->b:Lcom/facebook/fbservice/service/o;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/o;->b()V

    .line 85
    return-void

    :cond_1
    move v2, v1

    .line 63
    goto :goto_0

    :cond_2
    move v0, v1

    .line 67
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    :try_start_3
    iget-object v1, p0, Lcom/facebook/auth/login/a;->c:Lcom/facebook/http/b/ap;

    invoke-virtual {v1}, Lcom/facebook/http/b/ap;->b()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/facebook/auth/login/a;->b:Lcom/facebook/fbservice/service/o;

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/o;->b()V

    throw v0
.end method
