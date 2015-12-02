.class Lcom/qihoo/security/service/LoadingPermissionDataService$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/service/LoadingPermissionDataService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/service/LoadingPermissionDataService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/LoadingPermissionDataService;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$1;->a:Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$1;->a:Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-static {v0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->a(Lcom/qihoo/security/service/LoadingPermissionDataService;)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$1;->a:Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-virtual {v0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->stopSelf()V

    .line 91
    return-void
.end method
