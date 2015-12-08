.class final Lcom/bumptech/glide/load/b/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/b/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/b/b/c;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bumptech/glide/load/b/a;

.field private final b:Lcom/bumptech/glide/load/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b",
            "<TDataType;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDataType;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/a;Lcom/bumptech/glide/load/b;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b",
            "<TDataType;>;TDataType;)V"
        }
    .end annotation

    .prologue
    .line 259
    iput-object p1, p0, Lcom/bumptech/glide/load/b/d;->a:Lcom/bumptech/glide/load/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 260
    iput-object p2, p0, Lcom/bumptech/glide/load/b/d;->b:Lcom/bumptech/glide/load/b;

    .line 261
    iput-object p3, p0, Lcom/bumptech/glide/load/b/d;->c:Ljava/lang/Object;

    .line 262
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)Z
    .locals 4

    .prologue
    .line 266
    const/4 v0, 0x0

    .line 267
    const/4 v2, 0x0

    .line 269
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/b/d;->a:Lcom/bumptech/glide/load/b/a;

    invoke-static {v1}, Lcom/bumptech/glide/load/b/a;->a(Lcom/bumptech/glide/load/b/a;)Lcom/bumptech/glide/load/b/c;

    .line 1294
    new-instance v1, Ljava/io/BufferedOutputStream;

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/load/b/d;->b:Lcom/bumptech/glide/load/b;

    iget-object v3, p0, Lcom/bumptech/glide/load/b/d;->c:Ljava/lang/Object;

    invoke-interface {v2, v3, v1}, Lcom/bumptech/glide/load/b;->a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 278
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 284
    :cond_0
    :goto_0
    return v0

    .line 272
    :catch_0
    move-exception v1

    move-object v1, v2

    :goto_1
    :try_start_3
    const-string v2, "DecodeJob"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 276
    if-eqz v1, :cond_0

    .line 278
    :try_start_4
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    .line 281
    :catch_1
    move-exception v1

    goto :goto_0

    .line 276
    :catchall_0
    move-exception v0

    :goto_2
    if-eqz v2, :cond_1

    .line 278
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 281
    :cond_1
    :goto_3
    throw v0

    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_3

    .line 276
    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_2

    .line 272
    :catch_4
    move-exception v2

    goto :goto_1
.end method
