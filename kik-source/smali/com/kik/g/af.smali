.class final Lcom/kik/g/af;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/concurrent/ExecutorService;

.field final synthetic b:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 747
    iput-object p1, p0, Lcom/kik/g/af;->a:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lcom/kik/g/af;->b:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 751
    iget-object v0, p0, Lcom/kik/g/af;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kik/g/ag;

    invoke-direct {v1, p0, p1}, Lcom/kik/g/ag;-><init>(Lcom/kik/g/af;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 757
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 773
    iget-object v0, p0, Lcom/kik/g/af;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kik/g/ai;

    invoke-direct {v1, p0}, Lcom/kik/g/ai;-><init>(Lcom/kik/g/af;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 779
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 762
    iget-object v0, p0, Lcom/kik/g/af;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/kik/g/ah;

    invoke-direct {v1, p0, p1}, Lcom/kik/g/ah;-><init>(Lcom/kik/g/af;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 768
    return-void
.end method
