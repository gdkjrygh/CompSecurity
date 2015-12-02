.class public Lcom/mobvista/sdk/m/core/MobvistaAdWall;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Lcom/mobvista/sdk/m/core/ac;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private final e:I

.field private f:Ljava/util/HashMap;

.field private g:Lcom/mobvista/sdk/m/core/c/f;

.field private h:Ljava/util/HashMap;

.field private i:Z


# direct methods
.method protected constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/16 v0, 0x2714

    iput v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->e:I

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->g:Lcom/mobvista/sdk/m/core/c/f;

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->i:Z

    .line 52
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d:Ljava/lang/String;

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->h:Ljava/util/HashMap;

    .line 56
    new-instance v0, Lcom/mobvista/sdk/m/core/ac;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/mobvista/sdk/m/core/ac;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a:Lcom/mobvista/sdk/m/core/ac;

    .line 57
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->g:Lcom/mobvista/sdk/m/core/c/f;

    if-nez v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/f;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->g:Lcom/mobvista/sdk/m/core/c/f;

    .line 60
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Lcom/mobvista/sdk/m/core/ac;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a:Lcom/mobvista/sdk/m/core/ac;

    return-object v0
.end method

.method private a(I)V
    .locals 4

    .prologue
    .line 70
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 201
    :goto_0
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->f:Ljava/util/HashMap;

    if-nez v0, :cond_1

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->f:Ljava/util/HashMap;

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->f:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 79
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/c;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->g:Lcom/mobvista/sdk/m/core/c/f;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/mobvista/sdk/m/core/loader/c;-><init>(Landroid/content/Context;Lcom/mobvista/sdk/m/core/c/f;Ljava/lang/String;)V

    .line 80
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->f:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    :goto_1
    new-instance v1, Lcom/mobvista/sdk/m/core/w;

    invoke-direct {v1, p0, p1}, Lcom/mobvista/sdk/m/core/w;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;I)V

    invoke-virtual {v0, p1, v1}, Lcom/mobvista/sdk/m/core/loader/c;->a(ILcom/mobvista/sdk/m/core/loader/g;)V

    goto :goto_0

    .line 82
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->f:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/loader/c;

    goto :goto_1
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/MobvistaAdWall;I)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->i:Z

    return v0
.end method

.method static synthetic c(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->h:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public clickWall()V
    .locals 1

    .prologue
    .line 242
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->clickWall(I)V

    .line 243
    return-void
.end method

.method public clickWall(I)V
    .locals 2

    .prologue
    .line 238
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->getWallIntent(I)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 239
    return-void
.end method

.method public getAdWallIcon(Lcom/mobvista/sdk/m/core/WallIconCallback;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 260
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    const-string/jumbo v1, "mobvista_SDK_M"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 262
    const-string/jumbo v1, "AD_WALL_ICON_URL"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 263
    const-string/jumbo v2, "AD_WALL_ICON_FILE"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 266
    new-instance v3, Lcom/mobvista/sdk/m/core/loader/b;

    invoke-direct {v3}, Lcom/mobvista/sdk/m/core/loader/b;-><init>()V

    .line 267
    iget-object v4, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/mobvista/sdk/m/core/loader/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 268
    const/16 v4, 0x2714

    new-instance v5, Lcom/mobvista/sdk/m/core/x;

    invoke-direct {v5, p0, v1, p1, v0}, Lcom/mobvista/sdk/m/core/x;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;Ljava/lang/String;Lcom/mobvista/sdk/m/core/WallIconCallback;Landroid/content/SharedPreferences;)V

    invoke-virtual {v3, v4, v5}, Lcom/mobvista/sdk/m/core/loader/b;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    .line 342
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    .line 344
    :try_start_0
    invoke-static {v2}, Lcom/mobvista/sdk/m/a/f/a;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 345
    if-nez v2, :cond_1

    .line 347
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v0

    new-instance v2, Lcom/mobvista/sdk/m/core/z;

    invoke-direct {v2, p0, p1}, Lcom/mobvista/sdk/m/core/z;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;Lcom/mobvista/sdk/m/core/WallIconCallback;)V

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 397
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v0

    const-string/jumbo v1, "img_market.png"

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_1
    return-object v0

    .line 367
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 368
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/a/d/a/k;

    move-result-object v0

    const-string/jumbo v2, "img_market.png"

    invoke-virtual {v0, v2}, Lcom/mobvista/sdk/m/a/d/a/k;->a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_1

    .line 371
    :cond_2
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v0, v3, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 375
    :catch_0
    move-exception v0

    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v0

    new-instance v2, Lcom/mobvista/sdk/m/core/aa;

    invoke-direct {v2, p0, p1}, Lcom/mobvista/sdk/m/core/aa;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;Lcom/mobvista/sdk/m/core/WallIconCallback;)V

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    goto :goto_0
.end method

.method public getWallIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 209
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->getWallIntent(I)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public getWallIntent(I)Landroid/content/Intent;
    .locals 5

    .prologue
    .line 213
    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    if-gez p1, :cond_1

    .line 214
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "only can set tab between 0 to 2"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_1
    new-instance v0, Lcom/mobvista/sdk/m/core/ab;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/ab;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;)V

    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 220
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->h:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 222
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "com.mobvista.sdk.m.ACTION_ACT_ORDER"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 223
    iget-object v3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 226
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->b:Landroid/content/Context;

    const-class v3, Lcom/mobvista/sdk/m/core/AdMobvistaAct;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 227
    const-string/jumbo v2, "BUNDLE_UNITID"

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->c:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    const-string/jumbo v2, "BUNDLE_KEY"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 229
    const-string/jumbo v1, "BUNDLE_TAB"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 230
    const-string/jumbo v1, "BUNDLE_FBID"

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 232
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->i:Z

    .line 234
    return-object v0
.end method

.method public loadWallIcon(Lcom/mobvista/sdk/m/core/WallIconCallback;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 204
    invoke-virtual {p0, p1}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->getAdWallIcon(Lcom/mobvista/sdk/m/core/WallIconCallback;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public preloadWall()V
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(I)V

    .line 65
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(I)V

    .line 66
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a(I)V

    .line 67
    return-void
.end method

.method public release()V
    .locals 1

    .prologue
    .line 252
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a:Lcom/mobvista/sdk/m/core/ac;

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdWall;->a:Lcom/mobvista/sdk/m/core/ac;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/ac;->a()V

    .line 255
    :cond_0
    return-void
.end method
