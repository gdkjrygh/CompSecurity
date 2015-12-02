.class Lcom/facebook/common/executors/ae;
.super Ljava/lang/Object;
.source "WakingExecutorService.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/facebook/common/executors/ae",
        "<TV;>;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/facebook/common/executors/ac;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/executors/ac",
            "<TV;>;"
        }
    .end annotation
.end field

.field public final b:J


# direct methods
.method public constructor <init>(Lcom/facebook/common/executors/ac;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/executors/ac",
            "<TV;>;J)V"
        }
    .end annotation

    .prologue
    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    iput-object p1, p0, Lcom/facebook/common/executors/ae;->a:Lcom/facebook/common/executors/ac;

    .line 343
    iput-wide p2, p0, Lcom/facebook/common/executors/ae;->b:J

    .line 344
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/common/executors/ae;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/executors/ae",
            "<TV;>;)I"
        }
    .end annotation

    .prologue
    .line 348
    iget-wide v0, p0, Lcom/facebook/common/executors/ae;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p1, Lcom/facebook/common/executors/ae;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v0

    return v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 337
    check-cast p1, Lcom/facebook/common/executors/ae;

    invoke-virtual {p0, p1}, Lcom/facebook/common/executors/ae;->a(Lcom/facebook/common/executors/ae;)I

    move-result v0

    return v0
.end method
