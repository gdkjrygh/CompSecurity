.class Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;
.super Ljava/lang/Object;
.source "XWalkContent.java"

# interfaces
.implements Lorg/xwalk/core/internal/XWalkGeolocationPermissions$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "XWalkGeolocationCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContent;


# direct methods
.method private constructor <init>(Lorg/xwalk/core/internal/XWalkContent;)V
    .locals 0

    .prologue
    .line 653
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;->this$0:Lorg/xwalk/core/internal/XWalkContent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/xwalk/core/internal/XWalkContent;Lorg/xwalk/core/internal/XWalkContent$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/xwalk/core/internal/XWalkContent;
    .param p2, "x1"    # Lorg/xwalk/core/internal/XWalkContent$1;

    .prologue
    .line 653
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;-><init>(Lorg/xwalk/core/internal/XWalkContent;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/String;ZZ)V
    .locals 1
    .param p1, "origin"    # Ljava/lang/String;
    .param p2, "allow"    # Z
    .param p3, "retain"    # Z

    .prologue
    .line 656
    new-instance v0, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;

    invoke-direct {v0, p0, p3, p2, p1}, Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback$1;-><init>(Lorg/xwalk/core/internal/XWalkContent$XWalkGeolocationCallback;ZZLjava/lang/String;)V

    invoke-static {v0}, Lorg/chromium/base/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 669
    return-void
.end method
