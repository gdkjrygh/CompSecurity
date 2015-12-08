.class public final Lcom/roidapp/photogrid/video/bl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/a/c",
        "<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/roidapp/photogrid/release/ig;

.field private final b:Z

.field private final c:Z

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/ig;II)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    .line 22
    iput p2, p0, Lcom/roidapp/photogrid/video/bl;->d:I

    .line 23
    iput p3, p0, Lcom/roidapp/photogrid/video/bl;->e:I

    .line 24
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/bl;->c:Z

    .line 25
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/bl;->c:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    iput-boolean v2, p0, Lcom/roidapp/photogrid/video/bl;->b:Z

    .line 26
    return-void

    :cond_2
    move v0, v2

    .line 24
    goto :goto_0
.end method

.method private d()Landroid/graphics/Bitmap;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 30
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    if-nez v1, :cond_1

    .line 47
    :cond_0
    :goto_0
    return-object v0

    .line 34
    :cond_1
    :try_start_0
    iget-boolean v1, p0, Lcom/roidapp/photogrid/video/bl;->c:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    :goto_1
    iget v2, p0, Lcom/roidapp/photogrid/video/bl;->d:I

    iget v3, p0, Lcom/roidapp/photogrid/video/bl;->e:I

    const/4 v4, 0x0

    iget-boolean v5, p0, Lcom/roidapp/photogrid/video/bl;->b:Z

    invoke-static {v1, v2, v3, v4, v5}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 39
    iget-boolean v2, p0, Lcom/roidapp/photogrid/video/bl;->b:Z

    if-eqz v2, :cond_3

    move-object v0, v1

    .line 40
    goto :goto_0

    .line 34
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 42
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget v2, p0, Lcom/roidapp/photogrid/video/bl;->d:I

    iget v3, p0, Lcom/roidapp/photogrid/video/bl;->e:I

    invoke-static {v1, v2, v3}, Lcom/roidapp/baselib/a/a;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 43
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v2

    .line 44
    goto :goto_0

    .line 47
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bl;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 54
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/bl;->a:Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/bl;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/bl;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/video/bl;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/video/bl;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 72
    return-void
.end method
