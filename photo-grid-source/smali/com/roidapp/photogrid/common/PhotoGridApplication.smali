.class public Lcom/roidapp/photogrid/common/PhotoGridApplication;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/c/af;
.implements Lcom/roidapp/baselib/c/r;


# instance fields
.field private a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/common/PhotoGridApplication;->a:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 128
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/PhotoGridApplication;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "watch"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/roidapp/photogrid/common/PhotoGridApplication;->a:Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 67
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    .line 78
    return-void
.end method

.method public onCreate()V
    .locals 6

    .prologue
    .line 46
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 48
    invoke-static {p0}, Lcom/roidapp/baselib/c/aj;->a(Landroid/app/Application;)V

    .line 49
    invoke-static {p0}, Lcom/roidapp/baselib/c/q;->a(Lcom/roidapp/baselib/c/r;)V

    .line 1102
    invoke-virtual {p0}, Lcom/roidapp/photogrid/common/PhotoGridApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/FacebookSdk;->sdkInitialize(Landroid/content/Context;)V

    .line 1105
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;
    :try_end_0
    .catch Ljava/lang/VerifyError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1109
    :goto_0
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/filter/c;

    invoke-direct {v1}, Lcom/roidapp/photogrid/filter/c;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Lcom/roidapp/imagelib/a;)V

    .line 1112
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/cloud/s;

    invoke-direct {v1}, Lcom/roidapp/photogrid/cloud/s;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->a(Lcom/roidapp/cloudlib/aj;)V

    .line 1114
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;)V

    .line 1116
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/video/bk;

    invoke-direct {v1}, Lcom/roidapp/photogrid/video/bk;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/e;->a(Lcom/roidapp/videolib/a;)V

    .line 2095
    new-instance v0, Lcom/roidapp/photogrid/b/e;

    invoke-direct {v0}, Lcom/roidapp/photogrid/b/e;-><init>()V

    invoke-static {v0}, Lcom/cm/kinfoc/a/e;->a(Lcom/cm/kinfoc/a/e;)V

    .line 2096
    new-instance v0, Lcom/roidapp/photogrid/b/h;

    invoke-direct {v0}, Lcom/roidapp/photogrid/b/h;-><init>()V

    invoke-static {v0}, Lcom/cm/kinfoc/a/g;->a(Lcom/cm/kinfoc/a/g;)V

    .line 2097
    invoke-static {}, Lcom/roidapp/cloudlib/sns/f/a;->a()Lcom/roidapp/cloudlib/sns/f/a;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/b/j;

    invoke-direct {v1}, Lcom/roidapp/photogrid/b/j;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/f/a;->a(Lcom/roidapp/cloudlib/sns/f/b;)V

    .line 52
    const/4 v0, 0x1

    new-array v0, v0, [La/a/a/a/p;

    const/4 v1, 0x0

    new-instance v2, Lcom/b/a/b;

    invoke-direct {v2}, Lcom/b/a/b;-><init>()V

    new-instance v3, Lcom/b/a/c/s;

    invoke-direct {v3}, Lcom/b/a/c/s;-><init>()V

    const-string v4, "release"

    const-string v5, "debug"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    invoke-virtual {v3, v4}, Lcom/b/a/c/s;->a(Z)Lcom/b/a/c/s;

    move-result-object v3

    invoke-virtual {v3}, Lcom/b/a/c/s;->a()Lcom/b/a/c/h;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/b/a/b;->a(Lcom/b/a/c/h;)Lcom/b/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/b/a/b;->a()Lcom/b/a/a;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p0, v0}, La/a/a/a/f;->a(Landroid/content/Context;[La/a/a/a/p;)La/a/a/a/f;

    .line 55
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-static {}, Lcom/cmcm/adsdk/a;->a()V

    .line 57
    const-string v0, "209"

    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    const-string v1, "cn"

    invoke-static {p0, v1}, Lcom/roidapp/photogrid/common/ag;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/cmcm/adsdk/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-static {}, Lcom/roidapp/cloudlib/ads/b;->a()V

    .line 60
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/ads/q;->a()V

    .line 62
    invoke-static {p0}, Lcom/roidapp/baselib/c/b;->a(Landroid/content/Context;)V

    .line 63
    return-void

    .line 1107
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/VerifyError;->printStackTrace()V

    goto/16 :goto_0
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 157
    invoke-super {p0}, Landroid/app/Application;->onLowMemory()V

    .line 158
    invoke-static {p0}, Lcom/bumptech/glide/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/p;->a()V

    .line 159
    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 164
    invoke-super {p0, p1}, Landroid/app/Application;->onTrimMemory(I)V

    .line 165
    invoke-static {p0}, Lcom/bumptech/glide/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/p;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/p;->a(I)V

    .line 166
    return-void
.end method
