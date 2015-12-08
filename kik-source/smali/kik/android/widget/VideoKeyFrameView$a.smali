.class final Lkik/android/widget/VideoKeyFrameView$a;
.super Lkik/android/util/bf;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xa
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/VideoKeyFrameView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/widget/VideoKeyFrameView;

.field private b:I


# direct methods
.method public constructor <init>(Lkik/android/widget/VideoKeyFrameView;I)V
    .locals 0

    .prologue
    .line 379
    iput-object p1, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 380
    iput p2, p0, Lkik/android/widget/VideoKeyFrameView$a;->b:I

    .line 381
    return-void
.end method

.method private varargs a()Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const-wide/16 v6, 0x3e8

    .line 386
    const/4 v1, 0x0

    .line 388
    :try_start_0
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v0}, Lkik/android/widget/VideoKeyFrameView;->b(Lkik/android/widget/VideoKeyFrameView;)Landroid/media/MediaMetadataRetriever;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v2}, Lkik/android/widget/VideoKeyFrameView;->a(Lkik/android/widget/VideoKeyFrameView;)J

    move-result-wide v2

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView$a;->b:I

    int-to-long v4, v4

    mul-long/2addr v2, v4

    mul-long/2addr v2, v6

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 391
    if-nez v1, :cond_0

    .line 392
    :try_start_1
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v0}, Lkik/android/widget/VideoKeyFrameView;->b(Lkik/android/widget/VideoKeyFrameView;)Landroid/media/MediaMetadataRetriever;

    move-result-object v0

    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v2}, Lkik/android/widget/VideoKeyFrameView;->a(Lkik/android/widget/VideoKeyFrameView;)J

    move-result-wide v2

    iget v4, p0, Lkik/android/widget/VideoKeyFrameView$a;->b:I

    int-to-long v4, v4

    mul-long/2addr v2, v4

    mul-long/2addr v2, v6

    const-wide/16 v4, 0x64

    add-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 395
    :cond_0
    if-eqz v1, :cond_1

    .line 396
    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v0}, Lkik/android/widget/VideoKeyFrameView;->c(Lkik/android/widget/VideoKeyFrameView;)I

    move-result v0

    iget-object v2, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v2}, Lkik/android/widget/VideoKeyFrameView;->d(Lkik/android/widget/VideoKeyFrameView;)I

    move-result v2

    invoke-static {v1, v0, v2}, Lkik/android/widget/VideoKeyFrameView;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 397
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    .line 409
    :goto_0
    return-object v0

    .line 402
    :catch_0
    move-exception v0

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/a/a/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :catch_2
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :catch_3
    move-exception v0

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    goto :goto_1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 373
    invoke-direct {p0}, Lkik/android/widget/VideoKeyFrameView$a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 373
    check-cast p1, Landroid/graphics/Bitmap;

    iget v0, p0, Lkik/android/widget/VideoKeyFrameView$a;->b:I

    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v1}, Lkik/android/widget/VideoKeyFrameView;->e(Lkik/android/widget/VideoKeyFrameView;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-static {v0}, Lkik/android/widget/VideoKeyFrameView;->f(Lkik/android/widget/VideoKeyFrameView;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    invoke-virtual {v0}, Lkik/android/widget/VideoKeyFrameView;->invalidate()V

    new-instance v0, Lkik/android/widget/VideoKeyFrameView$a;

    iget-object v1, p0, Lkik/android/widget/VideoKeyFrameView$a;->a:Lkik/android/widget/VideoKeyFrameView;

    iget v2, p0, Lkik/android/widget/VideoKeyFrameView$a;->b:I

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v0, v1, v2}, Lkik/android/widget/VideoKeyFrameView$a;-><init>(Lkik/android/widget/VideoKeyFrameView;I)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lkik/android/widget/VideoKeyFrameView$a;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method
