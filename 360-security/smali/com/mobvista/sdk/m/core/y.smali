.class final Lcom/mobvista/sdk/m/core/y;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/d/a/h;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mobvista/sdk/m/core/x;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/x;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/y;->b:Lcom/mobvista/sdk/m/core/x;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/y;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 297
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/y;->b:Lcom/mobvista/sdk/m/core/x;

    iget-object v0, v0, Lcom/mobvista/sdk/m/core/x;->b:Lcom/mobvista/sdk/m/core/WallIconCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/y;->b:Lcom/mobvista/sdk/m/core/x;

    iget-object v0, v0, Lcom/mobvista/sdk/m/core/x;->d:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/y;->b:Lcom/mobvista/sdk/m/core/x;

    iget-object v0, v0, Lcom/mobvista/sdk/m/core/x;->b:Lcom/mobvista/sdk/m/core/WallIconCallback;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/y;->b:Lcom/mobvista/sdk/m/core/x;

    iget-object v2, v2, Lcom/mobvista/sdk/m/core/x;->d:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    invoke-static {v2}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/WallIconCallback;->loaded(Landroid/graphics/drawable/Drawable;)V

    .line 305
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/y;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 307
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/y;->b:Lcom/mobvista/sdk/m/core/x;

    iget-object v1, v1, Lcom/mobvista/sdk/m/core/x;->c:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 309
    const-string/jumbo v2, "AD_WALL_ICON_URL"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/y;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 311
    const-string/jumbo v2, "AD_WALL_ICON_FILE"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 314
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 315
    return-void
.end method
