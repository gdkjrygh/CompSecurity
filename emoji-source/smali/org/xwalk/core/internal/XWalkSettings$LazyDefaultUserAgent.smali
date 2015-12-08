.class Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;
.super Ljava/lang/Object;
.source "XWalkSettings.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LazyDefaultUserAgent"
.end annotation


# static fields
.field private static final sInstance:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 79
    # invokes: Lorg/xwalk/core/internal/XWalkSettings;->nativeGetDefaultUserAgent()Ljava/lang/String;
    invoke-static {}, Lorg/xwalk/core/internal/XWalkSettings;->access$000()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->sInstance:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$500()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    sget-object v0, Lorg/xwalk/core/internal/XWalkSettings$LazyDefaultUserAgent;->sInstance:Ljava/lang/String;

    return-object v0
.end method
