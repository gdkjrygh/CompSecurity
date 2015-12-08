.class final Lb/a/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field final synthetic a:Lb/a/a/a/a$b;

.field final synthetic b:Lb/a/a/a/a$a;


# direct methods
.method constructor <init>(Lb/a/a/a/a$a;Lb/a/a/a/a$b;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lb/a/a/a/b;->b:Lb/a/a/a/a$a;

    iput-object p2, p0, Lb/a/a/a/b;->a:Lb/a/a/a/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lb/a/a/a/b;->a:Lb/a/a/a/a$b;

    invoke-virtual {v0, p1}, Lb/a/a/a/a$b;->a(Landroid/app/Activity;)V

    .line 107
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 137
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 121
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lb/a/a/a/b;->a:Lb/a/a/a/a$b;

    invoke-virtual {v0, p1}, Lb/a/a/a/a$b;->c(Landroid/app/Activity;)V

    .line 117
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 132
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lb/a/a/a/b;->a:Lb/a/a/a/a$b;

    invoke-virtual {v0, p1}, Lb/a/a/a/a$b;->b(Landroid/app/Activity;)V

    .line 112
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 126
    return-void
.end method
