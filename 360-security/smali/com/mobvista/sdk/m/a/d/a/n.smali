.class public Lcom/mobvista/sdk/m/a/d/a/n;
.super Landroid/graphics/drawable/BitmapDrawable;
.source "360Security"


# instance fields
.field private a:I

.field private b:I

.field private c:Z


# direct methods
.method private declared-synchronized a()V
    .locals 3

    .prologue
    .line 86
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/n;->a:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/n;->b:I

    if-gtz v0, :cond_0

    iget-boolean v0, p0, Lcom/mobvista/sdk/m/a/d/a/n;->c:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/d/a/n;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const-string/jumbo v0, "CountingBitmapDrawable"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "No longer being used or cached so recycling. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/a/d/a/n;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    :cond_0
    monitor-exit p0

    return-void

    .line 86
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized b()Z
    .locals 1

    .prologue
    .line 96
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/mobvista/sdk/m/a/d/a/n;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 96
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .prologue
    .line 71
    monitor-enter p0

    .line 72
    if-eqz p1, :cond_0

    .line 73
    :try_start_0
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/n;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/mobvista/sdk/m/a/d/a/n;->a:I

    .line 77
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/d/a/n;->a()V

    .line 81
    return-void

    .line 75
    :cond_0
    :try_start_1
    iget v0, p0, Lcom/mobvista/sdk/m/a/d/a/n;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/mobvista/sdk/m/a/d/a/n;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
