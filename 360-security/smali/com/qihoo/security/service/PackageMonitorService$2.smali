.class Lcom/qihoo/security/service/PackageMonitorService$2;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/service/PackageMonitorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/service/PackageMonitorService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/PackageMonitorService;)V
    .locals 0

    .prologue
    .line 264
    iput-object p1, p0, Lcom/qihoo/security/service/PackageMonitorService$2;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 268
    sget-object v0, Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;->FUNC_MONITOR_MALWARE:Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;

    invoke-static {v0}, Lcom/qihoo/security/quc/AccountLog;->a(Lcom/qihoo/security/quc/AccountLog$FUNC_LIST;)V

    .line 269
    return-void
.end method
