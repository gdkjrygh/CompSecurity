.class Lcom/facebook/ui/images/cache/b;
.super Lcom/facebook/ui/media/cache/a;
.source "ImageCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/ui/media/cache/a",
        "<",
        "Lcom/facebook/ui/images/cache/d;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/cache/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/cache/a;Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)V
    .locals 7

    .prologue
    .line 164
    iput-object p1, p0, Lcom/facebook/ui/images/cache/b;->a:Lcom/facebook/ui/images/cache/a;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, Lcom/facebook/ui/media/cache/a;-><init>(Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/facebook/ui/images/cache/d;Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    .line 168
    invoke-virtual {p1}, Lcom/facebook/ui/images/cache/d;->a()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    iget v2, v0, Lcom/facebook/ui/images/cache/e;->b:I

    .line 169
    invoke-virtual {p1}, Lcom/facebook/ui/images/cache/d;->a()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    iget v3, v0, Lcom/facebook/ui/images/cache/e;->c:I

    .line 170
    invoke-virtual {p1}, Lcom/facebook/ui/images/cache/d;->a()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    iget-object v5, v0, Lcom/facebook/ui/images/cache/e;->d:Lcom/facebook/ui/images/cache/f;

    .line 173
    invoke-static {p2}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Ljava/io/File;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 174
    iget-object v1, p0, Lcom/facebook/ui/images/cache/b;->a:Lcom/facebook/ui/images/cache/a;

    invoke-static {v1}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/images/cache/a;)Lcom/facebook/ui/media/attachments/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/media/attachments/d;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/ui/media/attachments/a;

    move-result-object v1

    .line 175
    iget-object v0, p0, Lcom/facebook/ui/images/cache/b;->a:Lcom/facebook/ui/images/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/images/cache/a;->c(Lcom/facebook/ui/images/cache/a;)Lcom/facebook/ui/images/a/a;

    move-result-object v0

    iget-object v4, p0, Lcom/facebook/ui/images/cache/b;->a:Lcom/facebook/ui/images/cache/a;

    invoke-static {v4}, Lcom/facebook/ui/images/cache/a;->b(Lcom/facebook/ui/images/cache/a;)Z

    move-result v4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/ui/images/a/a;->a(Lcom/facebook/ui/media/attachments/a;IIZLcom/facebook/ui/images/cache/f;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/facebook/ui/media/cache/l;Ljava/io/File;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 164
    check-cast p1, Lcom/facebook/ui/images/cache/d;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/ui/images/cache/b;->a(Lcom/facebook/ui/images/cache/d;Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/facebook/ui/images/cache/d;Landroid/graphics/Bitmap;Ljava/io/File;)V
    .locals 3

    .prologue
    .line 182
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 184
    :try_start_0
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->hasAlpha()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p2, v0, v2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    :goto_0
    invoke-static {v1}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    .line 192
    return-void

    .line 187
    :cond_0
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x5f

    invoke-virtual {p2, v0, v2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 190
    :catchall_0
    move-exception v0

    invoke-static {v1}, Lcom/google/common/b/c;->a(Ljava/io/Closeable;)V

    throw v0
.end method

.method protected bridge synthetic a(Lcom/facebook/ui/media/cache/l;Ljava/lang/Object;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 164
    check-cast p1, Lcom/facebook/ui/images/cache/d;

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/ui/images/cache/b;->a(Lcom/facebook/ui/images/cache/d;Landroid/graphics/Bitmap;Ljava/io/File;)V

    return-void
.end method
