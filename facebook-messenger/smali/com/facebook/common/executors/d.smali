.class public Lcom/facebook/common/executors/d;
.super Ljava/lang/Object;
.source "ExecutorWithProgressDialog.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/common/d/a/u;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/common/executors/d;->a:Landroid/content/Context;

    .line 30
    iput-object p2, p0, Lcom/facebook/common/executors/d;->b:Lcom/google/common/d/a/u;

    .line 31
    iput-object p3, p0, Lcom/facebook/common/executors/d;->c:Ljava/util/concurrent/Executor;

    .line 32
    return-void
.end method


# virtual methods
.method public a(IILjava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/common/executors/d;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/facebook/common/executors/d;->a:Landroid/content/Context;

    invoke-virtual {v1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {p0, v0, v1, p3}, Lcom/facebook/common/executors/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 45
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 3

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/common/executors/d;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v0

    .line 56
    iget-object v1, p0, Lcom/facebook/common/executors/d;->b:Lcom/google/common/d/a/u;

    invoke-interface {v1, p3}, Lcom/google/common/d/a/u;->b(Ljava/lang/Runnable;)Lcom/google/common/d/a/s;

    move-result-object v1

    .line 57
    new-instance v2, Lcom/facebook/common/executors/e;

    invoke-direct {v2, p0, v0}, Lcom/facebook/common/executors/e;-><init>(Lcom/facebook/common/executors/d;Landroid/app/ProgressDialog;)V

    .line 68
    iget-object v0, p0, Lcom/facebook/common/executors/d;->c:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 69
    return-void
.end method
