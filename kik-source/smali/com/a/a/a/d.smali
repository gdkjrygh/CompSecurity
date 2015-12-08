.class final Lcom/a/a/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field final synthetic a:Lcom/a/a/a/c;


# direct methods
.method constructor <init>(Lcom/a/a/a/c;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 28
    iget-object v0, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    sget-object v2, Lcom/a/a/a/q$a;->a:Lcom/a/a/a/q$a;

    invoke-static {v0, v2, p1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 29
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 33
    iget-object v0, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    sget-object v2, Lcom/a/a/a/q$a;->g:Lcom/a/a/a/q$a;

    invoke-static {v0, v2, p1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 34
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 38
    iget-object v0, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    sget-object v2, Lcom/a/a/a/q$a;->e:Lcom/a/a/a/q$a;

    invoke-static {v0, v2, p1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 39
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 43
    iget-object v0, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    sget-object v2, Lcom/a/a/a/q$a;->c:Lcom/a/a/a/q$a;

    invoke-static {v0, v2, p1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 44
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 48
    iget-object v0, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    sget-object v2, Lcom/a/a/a/q$a;->d:Lcom/a/a/a/q$a;

    invoke-static {v0, v2, p1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 49
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 53
    iget-object v0, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    sget-object v2, Lcom/a/a/a/q$a;->b:Lcom/a/a/a/q$a;

    invoke-static {v0, v2, p1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 54
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 58
    iget-object v0, p0, Lcom/a/a/a/d;->a:Lcom/a/a/a/c;

    iget-object v1, v0, Lcom/a/a/a/o;->b:Lcom/a/a/a/t;

    iget-object v0, v0, Lcom/a/a/a/o;->a:Lcom/a/a/a/r;

    sget-object v2, Lcom/a/a/a/q$a;->f:Lcom/a/a/a/q$a;

    invoke-static {v0, v2, p1}, Lcom/a/a/a/q;->a(Lcom/a/a/a/r;Lcom/a/a/a/q$a;Landroid/app/Activity;)Lcom/a/a/a/q;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/a/a/a/t;->a(Ljava/lang/Object;Z)V

    .line 59
    return-void
.end method
