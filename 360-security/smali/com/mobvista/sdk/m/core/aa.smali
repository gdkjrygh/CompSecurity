.class final Lcom/mobvista/sdk/m/core/aa;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/d/a/h;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/core/WallIconCallback;

.field final synthetic b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;Lcom/mobvista/sdk/m/core/WallIconCallback;)V
    .locals 0

    .prologue
    .line 376
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/aa;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/aa;->a:Lcom/mobvista/sdk/m/core/WallIconCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 380
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/aa;->a:Lcom/mobvista/sdk/m/core/WallIconCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/aa;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 381
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/aa;->a:Lcom/mobvista/sdk/m/core/WallIconCallback;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/aa;->b:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/WallIconCallback;->loaded(Landroid/graphics/drawable/Drawable;)V

    .line 384
    :cond_0
    return-void
.end method
