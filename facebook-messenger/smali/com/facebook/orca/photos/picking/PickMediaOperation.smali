.class public Lcom/facebook/orca/photos/picking/PickMediaOperation;
.super Landroid/support/v4/app/Fragment;
.source "PickMediaOperation.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "WorldWriteableFiles"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/ui/media/attachments/d;

.field private c:Lcom/facebook/orca/compose/aq;

.field private d:Lcom/facebook/orca/photos/picking/i;

.field private e:Lcom/facebook/orca/photos/picking/PickMediaParams;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    sput-object v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 87
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f:J

    .line 89
    return-void
.end method

.method private O()V
    .locals 3

    .prologue
    .line 249
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 250
    const-string v1, "android.intent.extra.durationLimit"

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 251
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 252
    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Landroid/content/Intent;I)V

    .line 253
    return-void
.end method

.method private P()V
    .locals 3

    .prologue
    .line 262
    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->n()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->R()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    .line 264
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 265
    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->n()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->S()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    .line 267
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    :goto_0
    return-void

    .line 268
    :catch_0
    move-exception v0

    .line 269
    const-string v1, "Exception opening files"

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private Q()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    .line 437
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;

    move-result-object v0

    .line 438
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->U()Ljava/io/File;

    move-result-object v1

    .line 440
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->n()Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/facebook/orca/camera/CropImage;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 441
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    const-string v3, "image/*"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 442
    const-string v0, "outputX"

    iget-object v3, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v3}, Lcom/facebook/orca/photos/picking/PickMediaParams;->c()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 443
    const-string v0, "outputY"

    iget-object v3, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v3}, Lcom/facebook/orca/photos/picking/PickMediaParams;->d()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 444
    const-string v0, "aspectX"

    iget-object v3, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v3}, Lcom/facebook/orca/photos/picking/PickMediaParams;->e()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 445
    const-string v0, "aspectY"

    iget-object v3, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v3}, Lcom/facebook/orca/photos/picking/PickMediaParams;->f()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 446
    const-string v0, "scale"

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 447
    const-string v0, "output"

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 448
    const-string v0, "outputFormat"

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1}, Landroid/graphics/Bitmap$CompressFormat;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 449
    invoke-virtual {v2, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 451
    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->n()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 461
    :goto_0
    return-void

    .line 459
    :cond_0
    invoke-virtual {p0, v2, v5}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method private R()Ljava/lang/String;
    .locals 3

    .prologue
    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "temp-compose-photo_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private S()Ljava/lang/String;
    .locals 3

    .prologue
    .line 468
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "temp-compose-photo-post-cropped_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private T()Ljava/io/File;
    .locals 2

    .prologue
    .line 472
    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->n()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private U()Ljava/io/File;
    .locals 2

    .prologue
    .line 476
    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->n()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->S()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private V()V
    .locals 1

    .prologue
    .line 480
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    .line 481
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->U()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->deleteOnExit()V

    .line 482
    return-void
.end method

.method private W()V
    .locals 1

    .prologue
    .line 492
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 493
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    if-eqz v0, :cond_0

    .line 494
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/i;->b()V

    .line 496
    :cond_0
    return-void
.end method

.method private X()V
    .locals 1

    .prologue
    .line 499
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 500
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    if-eqz v0, :cond_0

    .line 501
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/i;->a()V

    .line 503
    :cond_0
    return-void
.end method

.method private Y()V
    .locals 1

    .prologue
    .line 506
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 507
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    if-eqz v0, :cond_0

    .line 508
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/i;->c()V

    .line 510
    :cond_0
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 204
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->P()V

    .line 205
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;

    move-result-object v0

    .line 206
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 207
    const-string v2, "output"

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 208
    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 209
    const/4 v0, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Landroid/content/Intent;I)V

    .line 210
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a()V

    return-void
.end method

.method private a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 1

    .prologue
    .line 485
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 486
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    if-eqz v0, :cond_0

    .line 487
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/photos/picking/i;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 489
    :cond_0
    return-void
.end method

.method private a(Lcom/google/common/b/i;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/b/i",
            "<+",
            "Ljava/io/InputStream;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 275
    new-instance v0, Lcom/facebook/orca/photos/picking/g;

    invoke-direct {v0, p0, p2}, Lcom/facebook/orca/photos/picking/g;-><init>(Lcom/facebook/orca/photos/picking/PickMediaOperation;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/google/common/b/a;->a(Lcom/google/common/b/i;Lcom/google/common/b/j;)J

    .line 282
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 213
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->P()V

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->c:Lcom/facebook/orca/compose/aq;

    iget-object v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-interface {v0, p0, v1}, Lcom/facebook/orca/compose/aq;->a(Lcom/facebook/orca/photos/picking/PickMediaOperation;Lcom/facebook/orca/photos/picking/PickMediaParams;)V

    .line 217
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->c()V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 224
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->P()V

    .line 225
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 226
    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 227
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Landroid/content/Intent;I)V

    .line 228
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b()V

    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 231
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->P()V

    .line 232
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->n()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/images/ImageSearchActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 233
    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Landroid/content/Intent;I)V

    .line 234
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->O()V

    return-void
.end method

.method private f(ILandroid/content/Intent;)V
    .locals 5

    .prologue
    .line 312
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 313
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    .line 335
    :goto_0
    return-void

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/i;->d()V

    .line 321
    const-string v0, "extra_media_items"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 322
    if-eqz v0, :cond_2

    .line 323
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ipc/photos/MediaItem;

    .line 324
    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Lcom/facebook/ipc/photos/MediaItem;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 328
    invoke-virtual {v0}, Lcom/facebook/ipc/photos/MediaItem;->a()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;J)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 329
    iget-object v2, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    if-eqz v2, :cond_1

    .line 330
    iget-object v2, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/photos/picking/i;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    goto :goto_1

    .line 334
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    goto :goto_0
.end method

.method static synthetic f(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    return-void
.end method

.method static synthetic g(Lcom/facebook/orca/photos/picking/PickMediaOperation;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->Y()V

    return-void
.end method


# virtual methods
.method public a(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 421
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 422
    invoke-virtual {p0, p2, p3}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(ILandroid/content/Intent;)V

    .line 434
    :cond_0
    :goto_0
    return-void

    .line 423
    :cond_1
    const/4 v0, 0x6

    if-ne p1, v0, :cond_2

    .line 424
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f(ILandroid/content/Intent;)V

    goto :goto_0

    .line 425
    :cond_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 426
    invoke-virtual {p0, p2, p3}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b(ILandroid/content/Intent;)V

    goto :goto_0

    .line 427
    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 428
    invoke-virtual {p0, p2, p3}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->c(ILandroid/content/Intent;)V

    goto :goto_0

    .line 429
    :cond_4
    const/4 v0, 0x3

    if-ne p1, v0, :cond_5

    .line 430
    invoke-virtual {p0, p2, p3}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d(ILandroid/content/Intent;)V

    goto :goto_0

    .line 431
    :cond_5
    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 432
    invoke-virtual {p0, p2, p3}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e(ILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public a(ILandroid/content/Intent;)V
    .locals 5

    .prologue
    .line 285
    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    .line 286
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 287
    iget-object v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v1

    .line 289
    if-eqz v1, :cond_1

    .line 290
    sget-object v2, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Got attachment "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 292
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;

    move-result-object v0

    .line 293
    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/a;->c()Lcom/google/common/b/i;

    move-result-object v1

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->R()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/google/common/b/i;Ljava/lang/String;)V

    .line 294
    iget-object v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 295
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->Q()V

    .line 309
    :goto_0
    return-void

    .line 297
    :cond_0
    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 299
    :catch_0
    move-exception v0

    .line 300
    sget-object v1, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    const-string v2, "Got IOException while trying to process file"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 301
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    goto :goto_0

    .line 304
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->X()V

    goto :goto_0

    .line 307
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    goto :goto_0
.end method

.method public a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 93
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;)V

    .line 94
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 95
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/d;

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b:Lcom/facebook/ui/media/attachments/d;

    .line 96
    const-class v0, Lcom/facebook/orca/compose/aq;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/aq;

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->c:Lcom/facebook/orca/compose/aq;

    .line 97
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/d;

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b:Lcom/facebook/ui/media/attachments/d;

    .line 98
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 102
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/os/Bundle;)V

    .line 103
    if-eqz p1, :cond_0

    .line 104
    const-string v0, "params"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/PickMediaParams;

    iput-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 105
    const-string v0, "uniqueId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f:J

    .line 107
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/photos/picking/PickMediaParams;)V
    .locals 3

    .prologue
    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f:J

    .line 128
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    if-eqz v0, :cond_0

    .line 131
    sget-object v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    const-string v1, "Photo operation already in progress. Shouldn\'t happen"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 134
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->p()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 135
    invoke-virtual {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->p()Landroid/support/v4/app/q;

    move-result-object v1

    const-string v2, "dialog"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 136
    if-eqz v1, :cond_1

    .line 137
    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 140
    :cond_1
    iput-object p1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 141
    invoke-virtual {p1}, Lcom/facebook/orca/photos/picking/PickMediaParams;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/photos/picking/PickMediaParams;->g()Ljava/util/EnumSet;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->a(Ljava/lang/String;Ljava/util/EnumSet;)Lcom/facebook/orca/photos/picking/MediaChoiceDialog;

    move-result-object v1

    .line 145
    new-instance v2, Lcom/facebook/orca/photos/picking/f;

    invoke-direct {v2, p0, p1}, Lcom/facebook/orca/photos/picking/f;-><init>(Lcom/facebook/orca/photos/picking/PickMediaOperation;Lcom/facebook/orca/photos/picking/PickMediaParams;)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->a(Lcom/facebook/orca/photos/picking/c;)V

    .line 174
    const-string v2, "dialog"

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/photos/picking/MediaChoiceDialog;->a(Landroid/support/v4/app/ad;Ljava/lang/String;)I

    .line 175
    return-void
.end method

.method public a(Lcom/facebook/orca/photos/picking/PickMediaParams;I)V
    .locals 2

    .prologue
    .line 180
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f:J

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    if-eqz v0, :cond_0

    .line 184
    sget-object v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    const-string v1, "Photo operation already in progress. Shouldn\'t happen"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 186
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    .line 188
    packed-switch p2, :pswitch_data_0

    .line 201
    :goto_0
    :pswitch_0
    return-void

    .line 190
    :pswitch_1
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a()V

    goto :goto_0

    .line 194
    :pswitch_2
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b()V

    goto :goto_0

    .line 198
    :pswitch_3
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d()V

    goto :goto_0

    .line 188
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public a(Lcom/facebook/orca/photos/picking/i;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->d:Lcom/facebook/orca/photos/picking/i;

    .line 122
    return-void
.end method

.method public b(ILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 338
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 348
    iget-object v0, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/picking/PickMediaParams;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 349
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->Q()V

    .line 354
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->V()V

    .line 358
    :goto_1
    return-void

    .line 351
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    goto :goto_0

    .line 356
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    goto :goto_1
.end method

.method public c(ILandroid/content/Intent;)V
    .locals 5

    .prologue
    .line 361
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 362
    const/4 v1, 0x0

    .line 364
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    .line 365
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 366
    :try_start_1
    new-instance v1, Ljava/io/File;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/google/common/b/f;->a(Ljava/io/File;)Lcom/google/common/b/i;

    move-result-object v1

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->R()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/google/common/b/i;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 372
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 373
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->Q()V

    .line 380
    :goto_1
    return-void

    .line 368
    :catch_0
    move-exception v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    .line 369
    :goto_2
    sget-object v2, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    const-string v3, "Got IOException while trying to process file"

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 370
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    goto :goto_0

    .line 375
    :cond_0
    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    goto :goto_1

    .line 378
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    goto :goto_1

    .line 368
    :catch_1
    move-exception v1

    goto :goto_2
.end method

.method public d(ILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 383
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 384
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->U()Ljava/io/File;

    move-result-object v0

    .line 385
    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 386
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->V()V

    .line 390
    :goto_0
    return-void

    .line 388
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    goto :goto_0
.end method

.method public e(ILandroid/content/Intent;)V
    .locals 4

    .prologue
    .line 393
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 394
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    .line 417
    :goto_0
    return-void

    .line 398
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->b(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 399
    iget-object v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->b:Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v0

    .line 401
    if-nez v0, :cond_1

    .line 402
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->X()V

    goto :goto_0

    .line 406
    :cond_1
    sget-object v1, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Got video attachment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 408
    :try_start_0
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->T()Ljava/io/File;

    move-result-object v1

    .line 409
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/a;->c()Lcom/google/common/b/i;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->R()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/google/common/b/i;Ljava/lang/String;)V

    .line 411
    invoke-static {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->b(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 413
    :catch_0
    move-exception v0

    .line 414
    sget-object v1, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a:Ljava/lang/Class;

    const-string v2, "Got IOException while trying to process file"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 415
    invoke-direct {p0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->W()V

    goto :goto_0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 111
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->e(Landroid/os/Bundle;)V

    .line 112
    const-string v0, "params"

    iget-object v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->e:Lcom/facebook/orca/photos/picking/PickMediaParams;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 113
    const-string v0, "uniqueId"

    iget-wide v1, p0, Lcom/facebook/orca/photos/picking/PickMediaOperation;->f:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 114
    return-void
.end method
