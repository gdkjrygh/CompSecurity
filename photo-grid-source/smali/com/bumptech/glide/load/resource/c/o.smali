.class public final Lcom/bumptech/glide/load/resource/c/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/e",
        "<",
        "Ljava/io/InputStream;",
        "Lcom/bumptech/glide/load/resource/c/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/bumptech/glide/load/resource/c/q;

.field private static final b:Lcom/bumptech/glide/load/resource/c/p;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/bumptech/glide/load/resource/c/q;

.field private final e:Lcom/bumptech/glide/load/b/a/e;

.field private final f:Lcom/bumptech/glide/load/resource/c/p;

.field private final g:Lcom/bumptech/glide/load/resource/c/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lcom/bumptech/glide/load/resource/c/q;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/c/q;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/c/o;->a:Lcom/bumptech/glide/load/resource/c/q;

    .line 29
    new-instance v0, Lcom/bumptech/glide/load/resource/c/p;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/c/p;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/c/o;->b:Lcom/bumptech/glide/load/resource/c/p;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/b/a/e;)V
    .locals 2

    .prologue
    .line 42
    sget-object v0, Lcom/bumptech/glide/load/resource/c/o;->a:Lcom/bumptech/glide/load/resource/c/q;

    sget-object v1, Lcom/bumptech/glide/load/resource/c/o;->b:Lcom/bumptech/glide/load/resource/c/p;

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/bumptech/glide/load/resource/c/o;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/resource/c/q;Lcom/bumptech/glide/load/resource/c/p;)V

    .line 43
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/resource/c/q;Lcom/bumptech/glide/load/resource/c/p;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/o;->c:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/c/o;->e:Lcom/bumptech/glide/load/b/a/e;

    .line 50
    iput-object p4, p0, Lcom/bumptech/glide/load/resource/c/o;->f:Lcom/bumptech/glide/load/resource/c/p;

    .line 51
    new-instance v0, Lcom/bumptech/glide/load/resource/c/a;

    invoke-direct {v0, p2}, Lcom/bumptech/glide/load/resource/c/a;-><init>(Lcom/bumptech/glide/load/b/a/e;)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/o;->g:Lcom/bumptech/glide/load/resource/c/a;

    .line 52
    iput-object p3, p0, Lcom/bumptech/glide/load/resource/c/o;->d:Lcom/bumptech/glide/load/resource/c/q;

    .line 53
    return-void
.end method

.method private a(Ljava/io/InputStream;II)Lcom/bumptech/glide/load/resource/c/e;
    .locals 12

    .prologue
    const/4 v0, 0x0

    .line 57
    invoke-static {p1}, Lcom/bumptech/glide/load/resource/c/o;->a(Ljava/io/InputStream;)[B

    move-result-object v8

    .line 58
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/o;->d:Lcom/bumptech/glide/load/resource/c/q;

    invoke-virtual {v1, v8}, Lcom/bumptech/glide/load/resource/c/q;->a([B)Lcom/bumptech/glide/b/e;

    move-result-object v10

    .line 59
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/o;->f:Lcom/bumptech/glide/load/resource/c/p;

    iget-object v2, p0, Lcom/bumptech/glide/load/resource/c/o;->g:Lcom/bumptech/glide/load/resource/c/a;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/load/resource/c/p;->a(Lcom/bumptech/glide/b/b;)Lcom/bumptech/glide/b/a;

    move-result-object v11

    .line 1069
    :try_start_0
    invoke-virtual {v10}, Lcom/bumptech/glide/b/e;->b()Lcom/bumptech/glide/b/d;

    move-result-object v7

    .line 1070
    invoke-virtual {v7}, Lcom/bumptech/glide/b/d;->a()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v7}, Lcom/bumptech/glide/b/d;->b()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-eqz v1, :cond_1

    .line 63
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/o;->d:Lcom/bumptech/glide/load/resource/c/q;

    invoke-virtual {v1, v10}, Lcom/bumptech/glide/load/resource/c/q;->a(Lcom/bumptech/glide/b/e;)V

    .line 64
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/o;->f:Lcom/bumptech/glide/load/resource/c/p;

    invoke-virtual {v1, v11}, Lcom/bumptech/glide/load/resource/c/p;->a(Lcom/bumptech/glide/b/a;)V

    return-object v0

    .line 1089
    :cond_1
    :try_start_1
    invoke-virtual {v11, v7, v8}, Lcom/bumptech/glide/b/a;->a(Lcom/bumptech/glide/b/d;[B)V

    .line 1090
    invoke-virtual {v11}, Lcom/bumptech/glide/b/a;->a()V

    .line 1091
    invoke-virtual {v11}, Lcom/bumptech/glide/b/a;->f()Landroid/graphics/Bitmap;

    move-result-object v9

    .line 1076
    if-eqz v9, :cond_0

    .line 1080
    invoke-static {}, Lcom/bumptech/glide/load/resource/d;->b()Lcom/bumptech/glide/load/resource/d;

    move-result-object v4

    .line 1082
    new-instance v0, Lcom/bumptech/glide/load/resource/c/b;

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/o;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/bumptech/glide/load/resource/c/o;->g:Lcom/bumptech/glide/load/resource/c/a;

    iget-object v3, p0, Lcom/bumptech/glide/load/resource/c/o;->e:Lcom/bumptech/glide/load/b/a/e;

    move v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v9}, Lcom/bumptech/glide/load/resource/c/b;-><init>(Landroid/content/Context;Lcom/bumptech/glide/b/b;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/g;IILcom/bumptech/glide/b/d;[BLandroid/graphics/Bitmap;)V

    .line 1085
    new-instance v1, Lcom/bumptech/glide/load/resource/c/e;

    invoke-direct {v1, v0}, Lcom/bumptech/glide/load/resource/c/e;-><init>(Lcom/bumptech/glide/load/resource/c/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v1

    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/o;->d:Lcom/bumptech/glide/load/resource/c/q;

    invoke-virtual {v1, v10}, Lcom/bumptech/glide/load/resource/c/q;->a(Lcom/bumptech/glide/b/e;)V

    .line 64
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/o;->f:Lcom/bumptech/glide/load/resource/c/p;

    invoke-virtual {v1, v11}, Lcom/bumptech/glide/load/resource/c/p;->a(Lcom/bumptech/glide/b/a;)V

    throw v0
.end method

.method private static a(Ljava/io/InputStream;)[B
    .locals 4

    .prologue
    const/16 v0, 0x4000

    .line 101
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 104
    const/16 v0, 0x4000

    :try_start_0
    new-array v0, v0, [B

    .line 105
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 106
    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 109
    :catch_0
    move-exception v0

    .line 110
    const-string v2, "GifResourceDecoder"

    const-string v3, "Error reading data from stream"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 113
    :goto_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    .line 108
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    .locals 1

    .prologue
    .line 26
    check-cast p1, Ljava/io/InputStream;

    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/load/resource/c/o;->a(Ljava/io/InputStream;II)Lcom/bumptech/glide/load/resource/c/e;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    const-string v0, ""

    return-object v0
.end method
