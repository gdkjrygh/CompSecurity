.class Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator$PrecacheRunnable;
.super Ljava/lang/Object;
.source "PreCachingAlgorithmDecorator.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PrecacheRunnable"
.end annotation


# instance fields
.field private final mZoom:I

.field final synthetic this$0:Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;


# direct methods
.method public constructor <init>(Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;I)V
    .locals 0
    .param p2, "zoom"    # I

    .prologue
    .line 93
    .local p0, "this":Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator$PrecacheRunnable;, "Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator<TT;>.PrecacheRunnable;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator$PrecacheRunnable;->this$0:Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput p2, p0, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator$PrecacheRunnable;->mZoom:I

    .line 95
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .local p0, "this":Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator$PrecacheRunnable;, "Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator<TT;>.PrecacheRunnable;"
    const-wide v2, 0x407f400000000000L    # 500.0

    .line 101
    :try_start_0
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    mul-double/2addr v0, v2

    add-double/2addr v0, v2

    double-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :goto_0
    iget-object v0, p0, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator$PrecacheRunnable;->this$0:Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;

    iget v1, p0, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator$PrecacheRunnable;->mZoom:I

    # invokes: Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;->getClustersInternal(I)Ljava/util/Set;
    invoke-static {v0, v1}, Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;->access$000(Lcom/google/maps/android/clustering/algo/PreCachingAlgorithmDecorator;I)Ljava/util/Set;

    .line 106
    return-void

    .line 102
    :catch_0
    move-exception v0

    goto :goto_0
.end method
