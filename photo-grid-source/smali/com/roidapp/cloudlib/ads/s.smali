.class public final Lcom/roidapp/cloudlib/ads/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Lcom/roidapp/cloudlib/ads/o;


# direct methods
.method public static a()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    .line 21
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/cloudlib/ads/s;->a:Z

    .line 22
    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 11
    sget-boolean v0, Lcom/roidapp/cloudlib/ads/s;->a:Z

    if-nez v0, :cond_0

    .line 12
    new-instance v0, Lcom/roidapp/cloudlib/ads/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/ads/t;-><init>(B)V

    .line 13
    sput-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    invoke-interface {v0, p0}, Lcom/roidapp/cloudlib/ads/o;->a(Landroid/app/Activity;)V

    .line 14
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/cloudlib/ads/s;->a:Z

    .line 16
    :cond_0
    return-void
.end method

.method public static b()V
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/o;->a()V

    .line 30
    :cond_0
    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    invoke-interface {v0, p0}, Lcom/roidapp/cloudlib/ads/o;->b(Landroid/app/Activity;)V

    .line 26
    :cond_0
    return-void
.end method

.method public static c()Z
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/o;->b()Z

    move-result v0

    .line 34
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static d()Z
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/cloudlib/ads/s;->b:Lcom/roidapp/cloudlib/ads/o;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/ads/o;->c()Z

    move-result v0

    .line 40
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
