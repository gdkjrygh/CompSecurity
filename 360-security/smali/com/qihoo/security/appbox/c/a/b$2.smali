.class Lcom/qihoo/security/appbox/c/a/b$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/android/volley/toolbox/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/c/a/b;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/android/volley/toolbox/g$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Ljava/lang/Integer;

.field final synthetic c:Landroid/graphics/drawable/Drawable;

.field final synthetic d:Landroid/graphics/drawable/Drawable;

.field final synthetic e:Lcom/qihoo/security/appbox/c/a/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/c/a/b;Landroid/widget/ImageView;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 195
    iput-object p1, p0, Lcom/qihoo/security/appbox/c/a/b$2;->e:Lcom/qihoo/security/appbox/c/a/b;

    iput-object p2, p0, Lcom/qihoo/security/appbox/c/a/b$2;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/qihoo/security/appbox/c/a/b$2;->b:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/qihoo/security/appbox/c/a/b$2;->c:Landroid/graphics/drawable/Drawable;

    iput-object p5, p0, Lcom/qihoo/security/appbox/c/a/b$2;->d:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 198
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$2;->a:Landroid/widget/ImageView;

    const v1, 0x7f0b0006

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 199
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/appbox/c/a/b$2;->b:Ljava/lang/Integer;

    if-eq v0, v1, :cond_1

    .line 200
    :cond_0
    const/4 v0, 0x0

    .line 203
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/android/volley/VolleyError;)V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$2;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/appbox/c/a/b$2;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$2;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/appbox/c/a/b$2;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 211
    :cond_0
    return-void
.end method

.method public a(Lcom/android/volley/toolbox/g$c;Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 215
    invoke-direct {p0}, Lcom/qihoo/security/appbox/c/a/b$2;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 234
    :cond_0
    :goto_0
    return-void

    .line 219
    :cond_1
    invoke-virtual {p1}, Lcom/android/volley/toolbox/g$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 220
    if-nez p2, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$2;->d:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 221
    new-instance v0, Landroid/graphics/drawable/TransitionDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/qihoo/security/appbox/c/a/b$2;->d:Landroid/graphics/drawable/Drawable;

    aput-object v3, v1, v2

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {p1}, Lcom/android/volley/toolbox/g$c;->b()Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    aput-object v2, v1, v5

    invoke-direct {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 225
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    .line 226
    iget-object v1, p0, Lcom/qihoo/security/appbox/c/a/b$2;->a:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 227
    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    goto :goto_0

    .line 229
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$2;->a:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/android/volley/toolbox/g$c;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 231
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$2;->d:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$2;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/qihoo/security/appbox/c/a/b$2;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method
