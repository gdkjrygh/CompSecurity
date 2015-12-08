.class Lcom/google/ads/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/h$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/ads/h$a",
        "<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/ads/f;


# direct methods
.method constructor <init>(Lcom/google/ads/f;Z)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/google/ads/f$1;->b:Lcom/google/ads/f;

    iput-boolean p2, p0, Lcom/google/ads/f$1;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    .line 149
    iget-object v0, p0, Lcom/google/ads/f$1;->b:Lcom/google/ads/f;

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/google/ads/f$1;->a:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/ads/f;->a(IZ)V

    .line 150
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x2

    .line 155
    invoke-static {p1}, Lcom/google/ads/h;->a(Ljava/io/InputStream;)[B

    move-result-object v1

    .line 156
    if-nez v1, :cond_0

    .line 157
    iget-object v1, p0, Lcom/google/ads/f$1;->b:Lcom/google/ads/f;

    iget-boolean v2, p0, Lcom/google/ads/f$1;->a:Z

    invoke-virtual {v1, v4, v2}, Lcom/google/ads/f;->a(IZ)V

    .line 167
    :goto_0
    return-object v0

    .line 161
    :cond_0
    const/4 v2, 0x0

    array-length v3, v1

    invoke-static {v1, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 162
    if-nez v1, :cond_1

    .line 163
    iget-object v1, p0, Lcom/google/ads/f$1;->b:Lcom/google/ads/f;

    iget-boolean v2, p0, Lcom/google/ads/f$1;->a:Z

    invoke-virtual {v1, v4, v2}, Lcom/google/ads/f;->a(IZ)V

    goto :goto_0

    .line 167
    :cond_1
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/google/ads/f$1;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 146
    invoke-virtual {p0, p1}, Lcom/google/ads/f$1;->a(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method
