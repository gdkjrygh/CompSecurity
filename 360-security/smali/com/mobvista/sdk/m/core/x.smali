.class final Lcom/mobvista/sdk/m/core/x;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/a/c/d;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mobvista/sdk/m/core/WallIconCallback;

.field final synthetic c:Landroid/content/SharedPreferences;

.field final synthetic d:Lcom/mobvista/sdk/m/core/MobvistaAdWall;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/core/MobvistaAdWall;Ljava/lang/String;Lcom/mobvista/sdk/m/core/WallIconCallback;Landroid/content/SharedPreferences;)V
    .locals 0

    .prologue
    .line 268
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/x;->d:Lcom/mobvista/sdk/m/core/MobvistaAdWall;

    iput-object p2, p0, Lcom/mobvista/sdk/m/core/x;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/mobvista/sdk/m/core/x;->b:Lcom/mobvista/sdk/m/core/WallIconCallback;

    iput-object p4, p0, Lcom/mobvista/sdk/m/core/x;->c:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OnLoadCanceled(I)V
    .locals 0

    .prologue
    .line 338
    return-void
.end method

.method public final OnLoadError(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 332
    return-void
.end method

.method public final OnLoadFinish(ILjava/lang/Object;)V
    .locals 3

    .prologue
    .line 278
    if-eqz p2, :cond_1

    .line 279
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 280
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 281
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/x;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/x;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 291
    :cond_0
    invoke-static {}, Lcom/mobvista/sdk/m/a/d/a/d;->a()Lcom/mobvista/sdk/m/a/d/a/d;

    move-result-object v1

    new-instance v2, Lcom/mobvista/sdk/m/core/y;

    invoke-direct {v2, p0, v0}, Lcom/mobvista/sdk/m/core/y;-><init>(Lcom/mobvista/sdk/m/core/x;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lcom/mobvista/sdk/m/a/d/a/d;->a(Ljava/lang/String;Lcom/mobvista/sdk/m/a/d/a/h;)V

    .line 326
    :cond_1
    return-void
.end method

.method public final OnLoadStart(I)V
    .locals 0

    .prologue
    .line 274
    return-void
.end method
