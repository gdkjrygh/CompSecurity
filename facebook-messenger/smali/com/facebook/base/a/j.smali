.class public abstract Lcom/facebook/base/a/j;
.super Landroid/app/Application;
.source "DelegatingApplication.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/facebook/base/a/i;",
        ">",
        "Landroid/app/Application;"
    }
.end annotation


# instance fields
.field private a:Lcom/facebook/base/a/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/common/l/h;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 23
    new-instance v0, Lcom/facebook/common/l/h;

    invoke-direct {v0, p0}, Lcom/facebook/common/l/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/base/a/j;->b:Lcom/facebook/common/l/h;

    .line 24
    return-void
.end method

.method private declared-synchronized d()V
    .locals 1

    .prologue
    .line 34
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/a/j;->a:Lcom/facebook/base/a/i;

    if-nez v0, :cond_0

    .line 35
    invoke-virtual {p0}, Lcom/facebook/base/a/j;->a()Lcom/facebook/base/a/i;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/a/j;->a:Lcom/facebook/base/a/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :cond_0
    monitor-exit p0

    return-void

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method protected abstract a()Lcom/facebook/base/a/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    .line 61
    invoke-virtual {p0}, Lcom/facebook/base/a/j;->b()V

    .line 62
    invoke-direct {p0}, Lcom/facebook/base/a/j;->d()V

    .line 63
    return-void
.end method

.method protected b()V
    .locals 0

    .prologue
    .line 45
    return-void
.end method

.method protected c()Lcom/facebook/base/a/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0}, Lcom/facebook/base/a/j;->d()V

    .line 54
    iget-object v0, p0, Lcom/facebook/base/a/j;->a:Lcom/facebook/base/a/i;

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .prologue
    .line 67
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 68
    invoke-direct {p0}, Lcom/facebook/base/a/j;->d()V

    .line 69
    iget-object v0, p0, Lcom/facebook/base/a/j;->a:Lcom/facebook/base/a/i;

    invoke-interface {v0}, Lcom/facebook/base/a/i;->c()V

    .line 70
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 74
    invoke-super {p0}, Landroid/app/Application;->onLowMemory()V

    .line 75
    invoke-direct {p0}, Lcom/facebook/base/a/j;->d()V

    .line 76
    iget-object v0, p0, Lcom/facebook/base/a/j;->a:Lcom/facebook/base/a/i;

    invoke-interface {v0}, Lcom/facebook/base/a/i;->e()V

    .line 77
    return-void
.end method
