.class Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;
.super Ljava/lang/Object;
.source "XWalkContentsClientBridge.java"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/XWalkContentsClientBridge;->allowCertificateError(I[BLjava/lang/String;I)Z
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

.field final synthetic val$id:I


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/XWalkContentsClientBridge;I)V
    .locals 0

    .prologue
    .line 584
    iput-object p1, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    iput p2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;->val$id:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceiveValue(Ljava/lang/Boolean;)V
    .locals 3
    .param p1, "value"    # Ljava/lang/Boolean;

    .prologue
    .line 587
    iget-object v0, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;->this$0:Lorg/xwalk/core/internal/XWalkContentsClientBridge;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget v2, p0, Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;->val$id:I

    # invokes: Lorg/xwalk/core/internal/XWalkContentsClientBridge;->proceedSslError(ZI)V
    invoke-static {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkContentsClientBridge;->access$700(Lorg/xwalk/core/internal/XWalkContentsClientBridge;ZI)V

    .line 588
    return-void
.end method

.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 584
    check-cast p1, Ljava/lang/Boolean;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lorg/xwalk/core/internal/XWalkContentsClientBridge$4;->onReceiveValue(Ljava/lang/Boolean;)V

    return-void
.end method
