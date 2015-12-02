.class Lcom/facebook/common/executors/r;
.super Ljava/lang/Object;
.source "KeyedExecutor.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field final b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/facebook/common/executors/q;",
            ">;"
        }
    .end annotation
.end field

.field c:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/executors/r;->b:Ljava/util/Queue;

    .line 96
    iput-object p1, p0, Lcom/facebook/common/executors/r;->a:Ljava/lang/Object;

    .line 97
    return-void
.end method
