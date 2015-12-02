.class public Lcom/qihoo/security/app/e;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a()V
    .locals 1

    .prologue
    .line 29
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    .line 34
    if-nez v0, :cond_0

    .line 35
    invoke-static {}, Lcom/qihoo/security/a;->a()V

    .line 37
    :cond_0
    return-void
.end method

.method public static b()V
    .locals 5

    .prologue
    .line 43
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 50
    invoke-static {v0}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 51
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Z)V

    .line 52
    const-class v1, Lcom/qihoo/security/appbox/ui/AppBoxShortcutActivity;

    const v2, 0x7f020041

    const v3, 0x7f0c01e4

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/mobilesafe/b/m;->a(Landroid/content/Context;Ljava/lang/Class;IILandroid/graphics/Bitmap;)V

    .line 56
    :cond_0
    return-void
.end method
