.class public final Lkik/android/util/p$a;
.super Lkik/android/util/bf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Lkik/android/e/d;

.field b:Ljava/lang/String;

.field c:Z

.field final d:Lkik/a/f/k;

.field final e:Lkik/a/e/n;

.field final f:Lkik/a/e/w;

.field final g:Lkik/a/e/v;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;)V
    .locals 1

    .prologue
    .line 273
    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 256
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    .line 257
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/p$a;->c:Z

    .line 274
    iput-object p1, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    .line 275
    iput-object p2, p0, Lkik/android/util/p$a;->d:Lkik/a/f/k;

    .line 276
    iput-object p3, p0, Lkik/android/util/p$a;->e:Lkik/a/e/n;

    .line 277
    iput-object p4, p0, Lkik/android/util/p$a;->f:Lkik/a/e/w;

    .line 278
    iput-object p5, p0, Lkik/android/util/p$a;->g:Lkik/a/e/v;

    .line 279
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;B)V
    .locals 1

    .prologue
    .line 282
    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 256
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    .line 257
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/p$a;->c:Z

    .line 283
    iput-object p1, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    .line 284
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/util/p$a;->c:Z

    .line 285
    iput-object p2, p0, Lkik/android/util/p$a;->d:Lkik/a/f/k;

    .line 286
    iput-object p3, p0, Lkik/android/util/p$a;->e:Lkik/a/e/n;

    .line 287
    iput-object p4, p0, Lkik/android/util/p$a;->f:Lkik/a/e/w;

    .line 288
    iput-object p5, p0, Lkik/android/util/p$a;->g:Lkik/a/e/v;

    .line 289
    return-void
.end method

.method public constructor <init>(Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/w;Lkik/a/e/v;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 264
    invoke-direct {p0}, Lkik/android/util/bf;-><init>()V

    .line 256
    iput-object v1, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    .line 257
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/p$a;->c:Z

    .line 265
    iput-object v1, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    .line 266
    iput-object p1, p0, Lkik/android/util/p$a;->d:Lkik/a/f/k;

    .line 267
    iput-object p2, p0, Lkik/android/util/p$a;->e:Lkik/a/e/n;

    .line 268
    iput-object p3, p0, Lkik/android/util/p$a;->f:Lkik/a/e/w;

    .line 269
    iput-object p4, p0, Lkik/android/util/p$a;->g:Lkik/a/e/v;

    .line 270
    return-void
.end method

.method private varargs a([Lkik/android/e/d;)Ljava/lang/Integer;
    .locals 5

    .prologue
    .line 294
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/p;->a(Lkik/android/util/p;)V

    .line 296
    :try_start_0
    array-length v0, p1

    if-lez v0, :cond_0

    .line 297
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lkik/android/util/p$a;->a:Lkik/android/e/d;

    .line 300
    :cond_0
    iget-object v0, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 301
    invoke-static {}, Lkik/android/util/p;->j()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lkik/android/util/p$a;->d:Lkik/a/f/k;

    iget-boolean v3, p0, Lkik/android/util/p$a;->c:Z

    iget-object v4, p0, Lkik/android/util/p$a;->g:Lkik/a/e/v;

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/p;->a(Ljava/lang/Object;Ljava/lang/String;Lkik/a/f/k;ZLkik/a/e/v;)Lkik/android/p$a;

    move-result-object v0

    iget v0, v0, Lkik/android/p$a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 312
    :goto_0
    return-object v0

    .line 304
    :cond_1
    invoke-static {}, Lkik/android/util/p;->j()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/p$a;->d:Lkik/a/f/k;

    iget-object v2, p0, Lkik/android/util/p$a;->g:Lkik/a/e/v;

    invoke-static {v0, v1, v2}, Lkik/android/p;->a(Ljava/lang/Object;Lkik/a/f/k;Lkik/a/e/v;)Lkik/android/p$a;

    move-result-object v0

    iget v0, v0, Lkik/android/p$a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    goto :goto_0

    .line 309
    :catch_0
    move-exception v0

    const/4 v0, -0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 312
    :catch_1
    move-exception v0

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 253
    check-cast p1, [Lkik/android/e/d;

    invoke-direct {p0, p1}, Lkik/android/util/p$a;->a([Lkik/android/e/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 253
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_1

    invoke-static {}, Lkik/android/util/p;->j()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/e;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lkik/android/util/p$a;->a:Lkik/android/e/d;

    invoke-interface {v1, v0}, Lkik/android/e/d;->a(Landroid/graphics/Bitmap;)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    iget-object v0, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/util/p$a;->e:Lkik/a/e/n;

    iget-object v2, p0, Lkik/android/util/p$a;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const-string v4, "0"

    invoke-interface {v0, v2, v3, v4}, Lkik/a/e/n;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Z

    :goto_0
    :try_start_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object v0, p0, Lkik/android/util/p$a;->f:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->f()V

    invoke-static {}, Lkik/android/util/p;->j()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :goto_2
    return-void

    :cond_0
    iget-object v0, p0, Lkik/android/util/p$a;->e:Lkik/a/e/n;

    iget-object v2, p0, Lkik/android/util/p$a;->g:Lkik/a/e/v;

    invoke-static {v2}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const-string v4, "0"

    invoke-interface {v0, v2, v3, v4}, Lkik/a/e/n;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/android/util/p$a;->a:Lkik/android/e/d;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    invoke-interface {v0}, Lkik/android/e/d;->k_()V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1
.end method
