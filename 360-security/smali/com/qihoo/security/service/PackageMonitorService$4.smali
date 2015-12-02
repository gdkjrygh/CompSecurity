.class Lcom/qihoo/security/service/PackageMonitorService$4;
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
    .line 285
    iput-object p1, p0, Lcom/qihoo/security/service/PackageMonitorService$4;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 293
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService$4;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-static {v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(Lcom/qihoo/security/service/PackageMonitorService;)V

    .line 294
    return-void
.end method
