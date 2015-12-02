.class Lcom/qihoo/security/service/PackageMonitorService$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


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
    .line 274
    iput-object p1, p0, Lcom/qihoo/security/service/PackageMonitorService$3;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService$3;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-virtual {v0}, Lcom/qihoo/security/service/PackageMonitorService;->stopSelf()V

    .line 281
    return-void
.end method
