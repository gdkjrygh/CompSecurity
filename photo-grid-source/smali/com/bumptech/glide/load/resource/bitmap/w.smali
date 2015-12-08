.class public final Lcom/bumptech/glide/load/resource/bitmap/w;
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
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/bitmap/f;

.field private b:Lcom/bumptech/glide/load/b/a/e;

.field private c:Lcom/bumptech/glide/load/a;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/f;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    invoke-direct {p0, v0, p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/w;-><init>(Lcom/bumptech/glide/load/resource/bitmap/f;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V

    .line 40
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/resource/bitmap/f;Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/a;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    .line 44
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->b:Lcom/bumptech/glide/load/b/a/e;

    .line 45
    iput-object p3, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->c:Lcom/bumptech/glide/load/a;

    .line 46
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/b/x;
    .locals 6

    .prologue
    .line 19
    move-object v1, p1

    check-cast v1, Ljava/io/InputStream;

    .line 1050
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    iget-object v2, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->b:Lcom/bumptech/glide/load/b/a/e;

    iget-object v5, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->c:Lcom/bumptech/glide/load/a;

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/resource/bitmap/f;->a(Ljava/io/InputStream;Lcom/bumptech/glide/load/b/a/e;IILcom/bumptech/glide/load/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1051
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->b:Lcom/bumptech/glide/load/b/a/e;

    invoke-static {v0, v1}, Lcom/bumptech/glide/load/resource/bitmap/c;->a(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;)Lcom/bumptech/glide/load/resource/bitmap/c;

    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 56
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->a:Lcom/bumptech/glide/load/resource/bitmap/f;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/bitmap/f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->c:Lcom/bumptech/glide/load/a;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->d:Ljava/lang/String;

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/w;->d:Ljava/lang/String;

    return-object v0
.end method
