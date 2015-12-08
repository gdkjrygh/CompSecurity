.class public final Lcom/cmcm/adsdk/b/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 8
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cmcm/adsdk/b/c/b;->a:Z

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 34
    sget-boolean v0, Lcom/cmcm/adsdk/b/c/b;->a:Z

    if-eqz v0, :cond_0

    .line 35
    const-string v0, "CMAD"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 41
    sget-boolean v0, Lcom/cmcm/adsdk/b/c/b;->a:Z

    if-eqz v0, :cond_0

    .line 42
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 55
    sget-boolean v0, Lcom/cmcm/adsdk/b/c/b;->a:Z

    if-eqz v0, :cond_0

    .line 56
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 62
    sget-boolean v0, Lcom/cmcm/adsdk/b/c/b;->a:Z

    if-eqz v0, :cond_0

    .line 63
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    :cond_0
    return-void
.end method
