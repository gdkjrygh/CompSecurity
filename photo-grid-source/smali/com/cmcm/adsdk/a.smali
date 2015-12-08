.class public final Lcom/cmcm/adsdk/a;
.super Lcom/cmcm/adsdk/b;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 19
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ID cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 22
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/cmcm/adsdk/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-static {p0, p1}, Lcom/cmcm/adsdk/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 24
    return-void
.end method
