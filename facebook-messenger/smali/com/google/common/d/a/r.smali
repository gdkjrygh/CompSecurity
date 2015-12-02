.class Lcom/google/common/d/a/r;
.super Ljava/lang/Object;
.source "Futures.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/common/d/a/s;

.field final synthetic c:Lcom/google/common/d/a/p;


# direct methods
.method constructor <init>(Lcom/google/common/d/a/p;ILcom/google/common/d/a/s;)V
    .locals 0

    .prologue
    .line 1437
    iput-object p1, p0, Lcom/google/common/d/a/r;->c:Lcom/google/common/d/a/p;

    iput p2, p0, Lcom/google/common/d/a/r;->a:I

    iput-object p3, p0, Lcom/google/common/d/a/r;->b:Lcom/google/common/d/a/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1440
    iget-object v0, p0, Lcom/google/common/d/a/r;->c:Lcom/google/common/d/a/p;

    iget v1, p0, Lcom/google/common/d/a/r;->a:I

    iget-object v2, p0, Lcom/google/common/d/a/r;->b:Lcom/google/common/d/a/s;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/p;->a(Lcom/google/common/d/a/p;ILjava/util/concurrent/Future;)V

    .line 1441
    return-void
.end method
