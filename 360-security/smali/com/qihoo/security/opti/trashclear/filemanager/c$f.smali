.class Lcom/qihoo/security/opti/trashclear/filemanager/c$f;
.super Landroid/os/HandlerThread;
.source "360Security"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/c;)V
    .locals 1

    .prologue
    .line 303
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    .line 304
    const-string/jumbo v0, "FileIconLoader"

    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 305
    return-void
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/filemanager/c$c;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 367
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    iget-wide v2, p1, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->b:J

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 374
    :goto_0
    return-object v0

    .line 369
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/opti/trashclear/filemanager/c$c;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 382
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    iget-wide v2, p1, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->b:J

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Landroid/provider/MediaStore$Video$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 389
    :goto_0
    return-object v0

    .line 384
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 308
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->b:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 309
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->b:Landroid/os/Handler;

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->b:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 312
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v8, 0x2

    const/4 v3, 0x1

    .line 316
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 317
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 318
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;

    .line 319
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;

    .line 320
    if-eqz v1, :cond_0

    iget v2, v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->b:I

    if-nez v2, :cond_0

    .line 321
    iput v3, v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->b:I

    .line 323
    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/c$1;->a:[I

    iget-object v5, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->c:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    invoke-virtual {v5}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->ordinal()I

    move-result v5

    aget v2, v2, v5

    packed-switch v2, :pswitch_data_0

    .line 348
    :cond_1
    :goto_1
    iput v8, v1, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->b:I

    .line 349
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 325
    :pswitch_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->b(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Landroid/content/Context;

    move-result-object v2

    iget-object v5, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->a:Ljava/lang/String;

    invoke-static {v2, v5}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 326
    if-eqz v2, :cond_1

    .line 327
    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 332
    :pswitch_1
    iget-object v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->c:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    sget-object v5, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Video:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    if-ne v2, v5, :cond_4

    move v2, v3

    .line 333
    :goto_2
    iget-wide v6, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->b:J

    cmp-long v5, v6, v10

    if-nez v5, :cond_2

    .line 334
    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    iget-object v6, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->a:Ljava/lang/String;

    invoke-virtual {v5, v6, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->a(Ljava/lang/String;Z)J

    move-result-wide v6

    iput-wide v6, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->b:J

    .line 336
    :cond_2
    iget-wide v6, v0, Lcom/qihoo/security/opti/trashclear/filemanager/c$c;->b:J

    cmp-long v5, v6, v10

    if-nez v5, :cond_3

    .line 342
    :cond_3
    if-eqz v2, :cond_5

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->b(Lcom/qihoo/security/opti/trashclear/filemanager/c$c;)Landroid/graphics/Bitmap;

    move-result-object v2

    :goto_3
    invoke-virtual {v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;->a(Ljava/lang/Object;)V

    goto :goto_1

    .line 332
    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    .line 342
    :cond_5
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a(Lcom/qihoo/security/opti/trashclear/filemanager/c$c;)Landroid/graphics/Bitmap;

    move-result-object v2

    goto :goto_3

    .line 353
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$f;->a:Lcom/qihoo/security/opti/trashclear/filemanager/c;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c;->c(Lcom/qihoo/security/opti/trashclear/filemanager/c;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 354
    return v3

    .line 323
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
