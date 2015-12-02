.class public Lcom/facebook/common/a/c;
.super Ljava/lang/Object;
.source "CancellableRunnable.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private volatile a:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/facebook/common/a/c;->a:Ljava/lang/Runnable;

    .line 15
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/common/a/c;->a:Ljava/lang/Runnable;

    .line 19
    return-void
.end method

.method public run()V
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/common/a/c;->a:Ljava/lang/Runnable;

    .line 24
    if-eqz v0, :cond_0

    .line 25
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 27
    :cond_0
    return-void
.end method
