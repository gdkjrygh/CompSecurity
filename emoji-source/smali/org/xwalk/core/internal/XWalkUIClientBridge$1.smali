.class Lorg/xwalk/core/internal/XWalkUIClientBridge$1;
.super Ljava/lang/Object;
.source "XWalkUIClientBridge.java"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkUIClientBridge;->onCreateWindowRequested(Lorg/xwalk/core/internal/XWalkViewBridge;Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;Landroid/webkit/ValueCallback;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkUIClientBridge;

.field final synthetic val$callbackFinal:Landroid/webkit/ValueCallback;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkUIClientBridge;Landroid/webkit/ValueCallback;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge$1;->this$0:Lorg/xwalk/core/internal/XWalkUIClientBridge;

    iput-object p2, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge$1;->val$callbackFinal:Landroid/webkit/ValueCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceiveValue(Ljava/lang/Object;)V
    .locals 2
    .param p1, "value"    # Ljava/lang/Object;

    .prologue
    .line 71
    iget-object v1, p0, Lorg/xwalk/core/internal/XWalkUIClientBridge$1;->val$callbackFinal:Landroid/webkit/ValueCallback;

    invoke-static {p1}, Lorg/xwalk/core/internal/ReflectionHelper;->getBridgeOrWrapper(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkViewBridge;

    invoke-interface {v1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 72
    return-void
.end method
