.class public abstract Lcom/facebook/base/d/b;
.super Landroid/app/Service;
.source "FbService.java"

# interfaces
.implements Lcom/facebook/base/h;


# instance fields
.field private final a:Lcom/facebook/base/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 17
    new-instance v0, Lcom/facebook/base/i;

    invoke-direct {v0}, Lcom/facebook/base/i;-><init>()V

    iput-object v0, p0, Lcom/facebook/base/d/b;->a:Lcom/facebook/base/i;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 20
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/d/b;->a:Lcom/facebook/base/i;

    invoke-virtual {v0, p1}, Lcom/facebook/base/i;->a(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/base/d/b;->a:Lcom/facebook/base/i;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    return-void
.end method
