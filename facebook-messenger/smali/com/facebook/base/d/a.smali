.class public abstract Lcom/facebook/base/d/a;
.super Landroid/app/IntentService;
.source "FbIntentService.java"

# interfaces
.implements Lcom/facebook/base/h;


# instance fields
.field private final a:Lcom/facebook/base/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0, p1}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 17
    new-instance v0, Lcom/facebook/base/i;

    invoke-direct {v0}, Lcom/facebook/base/i;-><init>()V

    iput-object v0, p0, Lcom/facebook/base/d/a;->a:Lcom/facebook/base/i;

    .line 26
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 29
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/base/d/a;->a:Lcom/facebook/base/i;

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
    .line 34
    iget-object v0, p0, Lcom/facebook/base/d/a;->a:Lcom/facebook/base/i;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/base/i;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    return-void
.end method
