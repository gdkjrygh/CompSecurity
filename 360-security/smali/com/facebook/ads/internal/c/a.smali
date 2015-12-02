.class public Lcom/facebook/ads/internal/c/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Z

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/ads/internal/c/a;->a:Z

    const-string/jumbo v0, "FacebookAdsSDK"

    sput-object v0, Lcom/facebook/ads/internal/c/a;->b:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/facebook/ads/internal/c/a;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/c/a;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/facebook/ads/internal/c/a;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/c/a;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/facebook/ads/internal/c/a;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/c/a;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/facebook/ads/internal/c/a;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/c/a;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
