.class public Lcom/facebook/ads/internal/dev/Debug;
.super Ljava/lang/Object;


# static fields
.field private static a:Z

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/ads/internal/dev/Debug;->a:Z

    const-string v0, "FacebookAdsSDK"

    sput-object v0, Lcom/facebook/ads/internal/dev/Debug;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/facebook/ads/internal/dev/Debug;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/dev/Debug;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/facebook/ads/internal/dev/Debug;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/dev/Debug;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public static v(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static w(Ljava/lang/String;)V
    .locals 1

    sget-boolean v0, Lcom/facebook/ads/internal/dev/Debug;->a:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/dev/Debug;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method
