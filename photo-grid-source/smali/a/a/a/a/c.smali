.class final La/a/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field final synthetic a:La/a/a/a/d;

.field final synthetic b:La/a/a/a/b;


# direct methods
.method constructor <init>(La/a/a/a/b;La/a/a/a/d;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, La/a/a/a/c;->b:La/a/a/a/b;

    iput-object p2, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-virtual {v0, p1}, La/a/a/a/d;->a(Landroid/app/Activity;)V

    .line 107
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-virtual {v0, p1}, La/a/a/a/d;->g(Landroid/app/Activity;)V

    .line 138
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-virtual {v0, p1}, La/a/a/a/d;->d(Landroid/app/Activity;)V

    .line 122
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-virtual {v0, p1}, La/a/a/a/d;->c(Landroid/app/Activity;)V

    .line 117
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-virtual {v0, p1}, La/a/a/a/d;->f(Landroid/app/Activity;)V

    .line 133
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-virtual {v0, p1}, La/a/a/a/d;->b(Landroid/app/Activity;)V

    .line 112
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, La/a/a/a/c;->a:La/a/a/a/d;

    invoke-virtual {v0, p1}, La/a/a/a/d;->e(Landroid/app/Activity;)V

    .line 127
    return-void
.end method
