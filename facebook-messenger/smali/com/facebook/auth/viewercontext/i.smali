.class public Lcom/facebook/auth/viewercontext/i;
.super Ljava/lang/Object;
.source "ViewerContextManagerProvider.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/auth/viewercontext/e;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/auth/b/b;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/auth/viewercontext/f;

.field private final d:Lcom/facebook/auth/userscope/b;


# direct methods
.method public constructor <init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Landroid/content/Context;Lcom/facebook/auth/userscope/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Ljavax/inject/a",
            "<",
            "Landroid/content/Context;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/facebook/auth/userscope/b;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/auth/viewercontext/i;->a:Lcom/facebook/auth/b/b;

    .line 37
    iput-object p2, p0, Lcom/facebook/auth/viewercontext/i;->b:Ljavax/inject/a;

    .line 38
    new-instance v0, Lcom/facebook/auth/viewercontext/f;

    invoke-direct {v0, p1, p3}, Lcom/facebook/auth/viewercontext/f;-><init>(Lcom/facebook/auth/b/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/auth/viewercontext/i;->c:Lcom/facebook/auth/viewercontext/f;

    .line 39
    iput-object p4, p0, Lcom/facebook/auth/viewercontext/i;->d:Lcom/facebook/auth/userscope/b;

    .line 40
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/auth/viewercontext/e;
    .locals 4

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/i;->d:Lcom/facebook/auth/userscope/b;

    invoke-virtual {v0}, Lcom/facebook/auth/userscope/b;->getCurrentViewerContextManager()Lcom/facebook/auth/viewercontext/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 46
    new-instance v0, Lcom/facebook/auth/userscope/e;

    iget-object v1, p0, Lcom/facebook/auth/viewercontext/i;->a:Lcom/facebook/auth/b/b;

    iget-object v2, p0, Lcom/facebook/auth/viewercontext/i;->d:Lcom/facebook/auth/userscope/b;

    invoke-virtual {v2}, Lcom/facebook/auth/userscope/b;->getCurrentViewerContextManager()Lcom/facebook/auth/viewercontext/e;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/auth/userscope/e;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/auth/viewercontext/e;)V

    .line 68
    :goto_0
    return-object v0

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/i;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 53
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 54
    instance-of v1, v0, Lcom/facebook/base/h;

    if-nez v1, :cond_1

    .line 55
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Activity must support PropertyBag interface"

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v1, v0

    .line 57
    check-cast v1, Lcom/facebook/base/h;

    .line 59
    monitor-enter p0

    .line 60
    :try_start_0
    invoke-interface {v1, p0}, Lcom/facebook/base/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/viewercontext/f;

    .line 61
    if-nez v2, :cond_3

    .line 62
    new-instance v2, Lcom/facebook/auth/viewercontext/f;

    iget-object v3, p0, Lcom/facebook/auth/viewercontext/i;->a:Lcom/facebook/auth/b/b;

    invoke-direct {v2, v3, v0}, Lcom/facebook/auth/viewercontext/f;-><init>(Lcom/facebook/auth/b/a;Landroid/content/Context;)V

    .line 63
    invoke-interface {v1, p0, v2}, Lcom/facebook/base/h;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v2

    .line 65
    :goto_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 68
    :cond_2
    iget-object v0, p0, Lcom/facebook/auth/viewercontext/i;->c:Lcom/facebook/auth/viewercontext/f;

    goto :goto_0

    :cond_3
    move-object v0, v2

    goto :goto_1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    invoke-virtual {p0}, Lcom/facebook/auth/viewercontext/i;->a()Lcom/facebook/auth/viewercontext/e;

    move-result-object v0

    return-object v0
.end method
