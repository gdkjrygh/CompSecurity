.class final Lcom/miteksystems/misnap/b;
.super Ljava/lang/Object;


# instance fields
.field private a:[I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Ljava/lang/ref/SoftReference;

.field private f:Landroid/os/Handler;

.field private g:I

.field private h:J

.field private i:Landroid/graphics/Bitmap;

.field private j:Landroid/graphics/BitmapFactory$Options;


# direct methods
.method constructor <init>(Landroid/widget/ImageView;[II)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/b;->f:Landroid/os/Handler;

    iput-object p2, p0, Lcom/miteksystems/misnap/b;->a:[I

    iput v2, p0, Lcom/miteksystems/misnap/b;->b:I

    new-instance v0, Ljava/lang/ref/SoftReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/miteksystems/misnap/b;->e:Ljava/lang/ref/SoftReference;

    iput-boolean v2, p0, Lcom/miteksystems/misnap/b;->c:Z

    iput-boolean v2, p0, Lcom/miteksystems/misnap/b;->d:Z

    const/16 v0, 0x3e8

    div-int/2addr v0, p3

    iput v0, p0, Lcom/miteksystems/misnap/b;->g:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/miteksystems/misnap/b;->h:J

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/b;->j:Landroid/graphics/BitmapFactory$Options;

    iget-object v0, p0, Lcom/miteksystems/misnap/b;->j:Landroid/graphics/BitmapFactory$Options;

    iget-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    iput-object v1, v0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/miteksystems/misnap/b;->j:Landroid/graphics/BitmapFactory$Options;

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/b;->j:Landroid/graphics/BitmapFactory$Options;

    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    iget-object v0, p0, Lcom/miteksystems/misnap/b;->j:Landroid/graphics/BitmapFactory$Options;

    iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lcom/miteksystems/misnap/b;->a:[I

    aget v1, v1, v2

    iget-object v2, p0, Lcom/miteksystems/misnap/b;->j:Landroid/graphics/BitmapFactory$Options;

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/miteksystems/misnap/b;->a:[I

    aget v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/miteksystems/misnap/b;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/miteksystems/misnap/b;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private declared-synchronized a(Ljava/lang/Runnable;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/b;->a:[I

    iget v1, p0, Lcom/miteksystems/misnap/b;->b:I

    aget v1, v0, v1

    iget v0, p0, Lcom/miteksystems/misnap/b;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/miteksystems/misnap/b;->b:I

    iget-object v2, p0, Lcom/miteksystems/misnap/b;->a:[I

    array-length v2, v2

    if-lt v0, v2, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/b;->c:Z

    const/4 v0, -0x1

    move v2, v0

    :goto_0
    iget-boolean v0, p0, Lcom/miteksystems/misnap/b;->c:Z

    if-nez v0, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/b;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_1
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/b;->h:J

    sub-long/2addr v2, v4

    long-to-int v0, v2

    iget v2, p0, Lcom/miteksystems/misnap/b;->g:I

    div-int/2addr v0, v2

    iget v2, p0, Lcom/miteksystems/misnap/b;->b:I

    iget-object v3, p0, Lcom/miteksystems/misnap/b;->a:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x2

    if-ge v2, v3, :cond_2

    add-int/lit8 v2, v0, -0x2

    iget v3, p0, Lcom/miteksystems/misnap/b;->b:I

    if-le v2, v3, :cond_2

    iget-object v2, p0, Lcom/miteksystems/misnap/b;->a:[I

    array-length v2, v2

    if-gt v0, v2, :cond_3

    add-int/lit8 v0, v0, -0x2

    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "skipping "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/miteksystems/misnap/b;->b:I

    sub-int v3, v0, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " frames"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iput v0, p0, Lcom/miteksystems/misnap/b;->b:I

    :cond_2
    iget-object v0, p0, Lcom/miteksystems/misnap/b;->a:[I

    iget v2, p0, Lcom/miteksystems/misnap/b;->b:I

    aget v0, v0, v2

    move v2, v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/miteksystems/misnap/b;->a:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x2

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/miteksystems/misnap/b;->e:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-nez v0, :cond_5

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/b;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_5
    :try_start_2
    iget-object v3, p0, Lcom/miteksystems/misnap/b;->f:Landroid/os/Handler;

    iget v4, p0, Lcom/miteksystems/misnap/b;->g:I

    add-int/lit8 v4, v4, -0xa

    int-to-long v4, v4

    invoke-virtual {v3, p1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {v0}, Landroid/widget/ImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    if-ne v1, v2, :cond_6

    sget-boolean v0, Lcom/miteksystems/misnap/r;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :cond_6
    :try_start_3
    iget-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_7

    sget-boolean v1, Lcom/miteksystems/misnap/r;->a:Z

    iget-object v1, p0, Lcom/miteksystems/misnap/b;->j:Landroid/graphics/BitmapFactory$Options;

    invoke-static {v3, v2, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0}, Landroid/widget/ImageView;->postInvalidate()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    :try_start_4
    iget-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    if-nez v1, :cond_0

    sget-boolean v1, Lcom/miteksystems/misnap/r;->a:Z

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_1

    :catch_0
    move-exception v1

    :try_start_5
    sget-boolean v3, Lcom/miteksystems/misnap/r;->a:Z

    if-eqz v3, :cond_8

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    iget-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_9
    :try_start_6
    iget-object v1, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    if-nez v1, :cond_0

    sget-boolean v1, Lcom/miteksystems/misnap/r;->a:Z

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_1

    :catchall_1
    move-exception v1

    iget-object v3, p0, Lcom/miteksystems/misnap/b;->i:Landroid/graphics/Bitmap;

    if-nez v3, :cond_a

    sget-boolean v3, Lcom/miteksystems/misnap/r;->a:Z

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_a
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0
.end method


# virtual methods
.method final a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/miteksystems/misnap/b;->d:Z

    return v0
.end method

.method final declared-synchronized b()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/miteksystems/misnap/b;->c:Z

    iget-boolean v0, p0, Lcom/miteksystems/misnap/b;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/miteksystems/misnap/b;->d:Z

    new-instance v0, Lcom/miteksystems/misnap/c;

    invoke-direct {v0, p0}, Lcom/miteksystems/misnap/c;-><init>(Lcom/miteksystems/misnap/b;)V

    iget-object v1, p0, Lcom/miteksystems/misnap/b;->f:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final declared-synchronized c()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/miteksystems/misnap/b;->d:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/miteksystems/misnap/b;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
