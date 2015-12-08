.class Lcom/worklight/common/security/WLDeviceAuthManager$1;
.super Ljava/lang/Object;
.source "WLDeviceAuthManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/worklight/common/security/WLDeviceAuthManager;->saveCertificate(Ljava/lang/String;Ljava/security/KeyPair;Ljava/security/cert/Certificate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/worklight/common/security/WLDeviceAuthManager;


# direct methods
.method constructor <init>(Lcom/worklight/common/security/WLDeviceAuthManager;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/worklight/common/security/WLDeviceAuthManager$1;->this$0:Lcom/worklight/common/security/WLDeviceAuthManager;

    .line 350
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lcom/worklight/common/security/WLDeviceAuthManager$1;->this$0:Lcom/worklight/common/security/WLDeviceAuthManager;

    # getter for: Lcom/worklight/common/security/WLDeviceAuthManager;->webView:Landroid/webkit/WebView;
    invoke-static {v0}, Lcom/worklight/common/security/WLDeviceAuthManager;->access$0(Lcom/worklight/common/security/WLDeviceAuthManager;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "javascript:WL.DeviceAuth.__sendDeviceAuthentication()"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 354
    return-void
.end method
