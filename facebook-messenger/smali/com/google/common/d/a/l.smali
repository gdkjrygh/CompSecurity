.class final Lcom/google/common/d/a/l;
.super Ljava/lang/Object;
.source "Futures.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/common/d/a/s;

.field final synthetic b:Lcom/google/common/d/a/h;


# direct methods
.method constructor <init>(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V
    .locals 0

    .prologue
    .line 1065
    iput-object p1, p0, Lcom/google/common/d/a/l;->a:Lcom/google/common/d/a/s;

    iput-object p2, p0, Lcom/google/common/d/a/l;->b:Lcom/google/common/d/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1071
    :try_start_0
    iget-object v0, p0, Lcom/google/common/d/a/l;->a:Lcom/google/common/d/a/s;

    invoke-static {v0}, Lcom/google/common/d/a/ad;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v0

    .line 1072
    iget-object v1, p0, Lcom/google/common/d/a/l;->b:Lcom/google/common/d/a/h;

    invoke-interface {v1, v0}, Lcom/google/common/d/a/h;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    .line 1080
    :goto_0
    return-void

    .line 1073
    :catch_0
    move-exception v0

    .line 1074
    iget-object v1, p0, Lcom/google/common/d/a/l;->b:Lcom/google/common/d/a/h;

    invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/common/d/a/h;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1075
    :catch_1
    move-exception v0

    .line 1076
    iget-object v1, p0, Lcom/google/common/d/a/l;->b:Lcom/google/common/d/a/h;

    invoke-interface {v1, v0}, Lcom/google/common/d/a/h;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1077
    :catch_2
    move-exception v0

    .line 1078
    iget-object v1, p0, Lcom/google/common/d/a/l;->b:Lcom/google/common/d/a/h;

    invoke-interface {v1, v0}, Lcom/google/common/d/a/h;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
