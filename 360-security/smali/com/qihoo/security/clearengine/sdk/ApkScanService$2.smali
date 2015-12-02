.class Lcom/qihoo/security/clearengine/sdk/ApkScanService$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/clearengine/sdk/ApkScanService;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/sdk/ApkScanService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/sdk/ApkScanService;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/ApkScanService$2;->a:Lcom/qihoo/security/clearengine/sdk/ApkScanService;

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 113
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 114
    return-void
.end method
