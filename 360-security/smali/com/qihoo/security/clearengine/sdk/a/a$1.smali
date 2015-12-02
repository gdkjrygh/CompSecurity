.class Lcom/qihoo/security/clearengine/sdk/a/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/sdk/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/sdk/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/sdk/a/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a/a$1;->a:Lcom/qihoo/security/clearengine/sdk/a/a;

    .line 231
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a$1;->a:Lcom/qihoo/security/clearengine/sdk/a/a;

    invoke-static {p2}, Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/clearengine/sdk/a/a;->a(Lcom/qihoo/security/clearengine/sdk/a/a;Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;)V

    .line 239
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 246
    iget-object v0, p0, Lcom/qihoo/security/clearengine/sdk/a/a$1;->a:Lcom/qihoo/security/clearengine/sdk/a/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/clearengine/sdk/a/a;->a(Lcom/qihoo/security/clearengine/sdk/a/a;Lcom/qihoo360/mobilesafe/opti/i/plugins/IApkScanService;)V

    .line 247
    return-void
.end method
