.class public Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
.super Ljava/lang/Object;
.source "XWalkJavascriptResultHandlerInternal.java"

# interfaces
.implements Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;


# annotations
.annotation build Lorg/xwalk/core/internal/XWalkAPI;
    createInternally = true
    impl = Lorg/xwalk/core/internal/XWalkJavascriptResultInternal;
.end annotation


# instance fields
.field private mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

.field private final mId:I


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .line 23
    const/4 v0, -0x1

    iput v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mId:I

    .line 24
    return-void
.end method

.method constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;I)V
    .locals 0
    .param p1, "bridge"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    .param p2, "id"    # I

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .line 16
    iput p2, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mId:I

    .line 17
    return-void
.end method

.method static synthetic access$000(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    .prologue
    .line 10
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    return-object v0
.end method

.method static synthetic access$002(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;Lorg/xwalk/core/internal/XWalkContentsClientBridge;)Lorg/xwalk/core/internal/XWalkContentsClientBridge;
    .locals 0
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;
    .param p1, "x1"    # Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    .prologue
    .line 10
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mBridge:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    return-object p1
.end method

.method static synthetic access$100(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)I
    .locals 1
    .param p0, "x0"    # Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;

    .prologue
    .line 10
    iget v0, p0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->mId:I

    return v0
.end method


# virtual methods
.method public cancel()V
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 49
    new-instance v0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;

    invoke-direct {v0, p0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$2;-><init>(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;)V

    invoke-static {v0}, Lorg/chromium/base/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 58
    return-void
.end method

.method public confirm()V
    .locals 1
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;->confirmWithResult(Ljava/lang/String;)V

    .line 30
    return-void
.end method

.method public confirmWithResult(Ljava/lang/String;)V
    .locals 1
    .param p1, "promptResult"    # Ljava/lang/String;
    .annotation build Lorg/xwalk/core/internal/XWalkAPI;
    .end annotation

    .prologue
    .line 35
    new-instance v0, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;

    invoke-direct {v0, p0, p1}, Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal$1;-><init>(Lorg/xwalk/core/internal/XWalkJavascriptResultHandlerInternal;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/chromium/base/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 44
    return-void
.end method
