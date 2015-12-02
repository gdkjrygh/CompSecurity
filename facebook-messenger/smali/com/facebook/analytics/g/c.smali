.class Lcom/facebook/analytics/g/c;
.super Ljava/lang/Object;
.source "AnalyticsHighEventsRateReporter.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/analytics/g/a;


# direct methods
.method private constructor <init>(Lcom/facebook/analytics/g/a;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/analytics/g/a;Lcom/facebook/analytics/g/b;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0, p1}, Lcom/facebook/analytics/g/c;-><init>(Lcom/facebook/analytics/g/a;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-static {v0}, Lcom/facebook/analytics/g/a;->a(Lcom/facebook/analytics/g/a;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-static {v0}, Lcom/facebook/analytics/g/a;->b(Lcom/facebook/analytics/g/a;)Lcom/facebook/common/time/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    .line 72
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-static {v0}, Lcom/facebook/analytics/g/a;->c(Lcom/facebook/analytics/g/a;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-static {v0}, Lcom/facebook/analytics/g/a;->c(Lcom/facebook/analytics/g/a;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    .line 74
    iget-object v0, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-static {v0}, Lcom/facebook/analytics/g/a;->c(Lcom/facebook/analytics/g/a;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-static {v0}, Lcom/facebook/analytics/g/a;->c(Lcom/facebook/analytics/g/a;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/g/d;

    invoke-virtual {v0, v3, v4}, Lcom/facebook/analytics/g/d;->b(J)D

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmpg-double v0, v6, v8

    if-gtz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/facebook/analytics/g/c;->a:Lcom/facebook/analytics/g/a;

    invoke-static {v0}, Lcom/facebook/analytics/g/a;->c(Lcom/facebook/analytics/g/a;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->remove(I)V

    .line 72
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 79
    :cond_1
    monitor-exit v2

    .line 80
    return-void

    .line 79
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
