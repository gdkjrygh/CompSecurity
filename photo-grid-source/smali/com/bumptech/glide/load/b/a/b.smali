.class final Lcom/bumptech/glide/load/b/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/a/m;


# instance fields
.field private final a:Lcom/bumptech/glide/load/b/a/c;

.field private b:I

.field private c:I

.field private d:Landroid/graphics/Bitmap$Config;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/a/c;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lcom/bumptech/glide/load/b/a/b;->a:Lcom/bumptech/glide/load/b/a/c;

    .line 84
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/b;->a:Lcom/bumptech/glide/load/b/a/c;

    invoke-virtual {v0, p0}, Lcom/bumptech/glide/load/b/a/c;->a(Lcom/bumptech/glide/load/b/a/m;)V

    .line 119
    return-void
.end method

.method public final a(IILandroid/graphics/Bitmap$Config;)V
    .locals 0

    .prologue
    .line 87
    iput p1, p0, Lcom/bumptech/glide/load/b/a/b;->b:I

    .line 88
    iput p2, p0, Lcom/bumptech/glide/load/b/a/b;->c:I

    .line 89
    iput-object p3, p0, Lcom/bumptech/glide/load/b/a/b;->d:Landroid/graphics/Bitmap$Config;

    .line 90
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 94
    instance-of v1, p1, Lcom/bumptech/glide/load/b/a/b;

    if-eqz v1, :cond_0

    .line 95
    check-cast p1, Lcom/bumptech/glide/load/b/a/b;

    .line 96
    iget v1, p0, Lcom/bumptech/glide/load/b/a/b;->b:I

    iget v2, p1, Lcom/bumptech/glide/load/b/a/b;->b:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/bumptech/glide/load/b/a/b;->c:I

    iget v2, p1, Lcom/bumptech/glide/load/b/a/b;->c:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/load/b/a/b;->d:Landroid/graphics/Bitmap$Config;

    iget-object v2, p1, Lcom/bumptech/glide/load/b/a/b;->d:Landroid/graphics/Bitmap$Config;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    .line 100
    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 105
    iget v0, p0, Lcom/bumptech/glide/load/b/a/b;->b:I

    .line 106
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/bumptech/glide/load/b/a/b;->c:I

    add-int/2addr v0, v1

    .line 107
    mul-int/lit8 v1, v0, 0x1f

    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/b;->d:Landroid/graphics/Bitmap$Config;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/b/a/b;->d:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v0}, Landroid/graphics/Bitmap$Config;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v0, v1

    .line 108
    return v0

    .line 107
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 113
    iget v0, p0, Lcom/bumptech/glide/load/b/a/b;->b:I

    iget v1, p0, Lcom/bumptech/glide/load/b/a/b;->c:I

    iget-object v2, p0, Lcom/bumptech/glide/load/b/a/b;->d:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Lcom/bumptech/glide/load/b/a/a;->c(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
