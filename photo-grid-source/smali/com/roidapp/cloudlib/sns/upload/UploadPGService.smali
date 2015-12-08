.class public Lcom/roidapp/cloudlib/sns/upload/UploadPGService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/d;


# static fields
.field private static d:I


# instance fields
.field private volatile a:Landroid/os/Looper;

.field private volatile b:Lcom/roidapp/cloudlib/sns/upload/c;

.field private c:Lcom/roidapp/cloudlib/sns/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const/16 v0, 0x10

    sput v0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 134
    return-void
.end method

.method static synthetic a()I
    .locals 1

    .prologue
    .line 36
    const/4 v0, -0x1

    sput v0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->d:I

    return v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/16 v8, 0x438

    const/4 v1, 0x1

    .line 167
    if-nez p0, :cond_1

    move-object p0, v2

    .line 208
    :cond_0
    :goto_0
    return-object p0

    .line 1212
    :cond_1
    const-string v0, ".jpg"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    .line 168
    :goto_1
    if-eqz v0, :cond_0

    .line 170
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-static {p0, v8}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 171
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 173
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-float v0, v0

    const/high16 v3, 0x44870000    # 1080.0f

    div-float/2addr v0, v3

    .line 174
    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, v0, v3

    if-lez v3, :cond_2

    .line 177
    :try_start_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float v0, v4, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/4 v4, 0x1

    invoke-static {v1, v3, v0, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 178
    if-eqz v0, :cond_7

    if-eq v0, v1, :cond_7

    .line 179
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    :goto_2
    move-object v1, v0

    .line 187
    :cond_2
    :goto_3
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 190
    new-instance v3, Ljava/io/File;

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 194
    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    :try_start_2
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x4b

    invoke-virtual {v1, v2, v4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 201
    :try_start_3
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 206
    :goto_4
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    .line 1214
    :cond_3
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    const-wide/32 v6, 0x200000

    cmp-long v0, v4, v6

    if-ltz v0, :cond_4

    move v0, v1

    .line 1215
    goto/16 :goto_1

    .line 1216
    :cond_4
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/baselib/a/b;->b(Ljava/io/File;)Lcom/roidapp/baselib/c/x;

    move-result-object v3

    .line 1217
    if-eqz v3, :cond_5

    iget-object v0, v3, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v0, v3, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-le v0, v8, :cond_5

    move v0, v1

    goto/16 :goto_1

    :cond_5
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 197
    :catch_0
    move-exception v0

    :goto_5
    :try_start_4
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 200
    if-eqz v2, :cond_0

    .line 201
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto/16 :goto_0

    .line 200
    :catchall_0
    move-exception v0

    :goto_6
    if-eqz v2, :cond_6

    .line 201
    :try_start_6
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 203
    :cond_6
    :goto_7
    throw v0

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v1

    goto :goto_7

    .line 200
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_6

    .line 197
    :catch_4
    move-exception v1

    move-object v2, v0

    goto :goto_5

    :catch_5
    move-exception v0

    goto/16 :goto_3

    .line 184
    :catch_6
    move-exception v0

    goto/16 :goto_3

    :cond_7
    move-object v0, v1

    goto/16 :goto_2
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 159
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(I)V

    .line 160
    return-void
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/upload/i;)V
    .locals 11

    .prologue
    .line 110
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/upload/e;->b(Lcom/roidapp/cloudlib/sns/upload/i;)V

    .line 111
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/upload/e;->c(Lcom/roidapp/cloudlib/sns/upload/i;)V

    .line 113
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 115
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 116
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->c:Lcom/roidapp/cloudlib/sns/aa;

    if-nez v1, :cond_0

    new-instance v1, Lcom/roidapp/cloudlib/sns/upload/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/roidapp/cloudlib/sns/upload/d;-><init>(Lcom/roidapp/cloudlib/sns/upload/UploadPGService;B)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->c:Lcom/roidapp/cloudlib/sns/aa;

    .line 117
    :cond_0
    if-nez v0, :cond_2

    .line 118
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->c:Lcom/roidapp/cloudlib/sns/aa;

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 126
    :goto_0
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 128
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 132
    :cond_1
    return-void

    .line 120
    :cond_2
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    const-string v5, "image/jpeg"

    iget-object v6, p1, Lcom/roidapp/cloudlib/sns/upload/i;->b:Ljava/lang/String;

    iget-object v7, p1, Lcom/roidapp/cloudlib/sns/upload/i;->c:Ljava/lang/String;

    iget-object v8, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->c:Lcom/roidapp/cloudlib/sns/aa;

    sget v9, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->d:I

    move-object v10, p0

    invoke-static/range {v1 .. v10}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/w;ILcom/roidapp/baselib/e/d;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 123
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->run()V

    goto :goto_0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 62
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 63
    new-instance v0, Landroid/os/HandlerThread;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 66
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->a:Landroid/os/Looper;

    .line 67
    new-instance v0, Lcom/roidapp/cloudlib/sns/upload/c;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->a:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/sns/upload/c;-><init>(Lcom/roidapp/cloudlib/sns/upload/UploadPGService;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->b:Lcom/roidapp/cloudlib/sns/upload/c;

    .line 68
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->a:Landroid/os/Looper;

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 100
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 4

    .prologue
    .line 72
    if-nez p1, :cond_0

    .line 89
    :goto_0
    return-void

    .line 73
    :cond_0
    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->b:Lcom/roidapp/cloudlib/sns/upload/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 78
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    .line 1177
    new-instance v1, Lcom/roidapp/cloudlib/sns/upload/i;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/roidapp/cloudlib/sns/upload/i;-><init>(Lcom/roidapp/cloudlib/sns/upload/e;B)V

    .line 1178
    const-string v0, "upload_path"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    .line 1179
    const-string v0, "upload_comment"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/upload/i;->c:Ljava/lang/String;

    .line 1180
    const-string v0, "upload_tag"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/upload/i;->b:Ljava/lang/String;

    .line 1181
    const-string v0, "upload_id"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    .line 1182
    const/4 v0, -0x1

    iput v0, v1, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    .line 80
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->d(Lcom/roidapp/cloudlib/sns/upload/i;)V

    .line 82
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Lcom/roidapp/cloudlib/sns/upload/i;)V

    .line 85
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->b:Lcom/roidapp/cloudlib/sns/upload/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/c;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 86
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 87
    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 88
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->b:Lcom/roidapp/cloudlib/sns/upload/c;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/upload/c;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .prologue
    .line 93
    invoke-virtual {p0, p1, p3}, Lcom/roidapp/cloudlib/sns/upload/UploadPGService;->onStart(Landroid/content/Intent;I)V

    .line 94
    const/4 v0, 0x2

    return v0
.end method
