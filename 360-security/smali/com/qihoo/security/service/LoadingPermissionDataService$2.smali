.class Lcom/qihoo/security/service/LoadingPermissionDataService$2;
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
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/qihoo/security/service/LoadingPermissionDataService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/LoadingPermissionDataService;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$2;->b:Lcom/qihoo/security/service/LoadingPermissionDataService;

    iput-object p2, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$2;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 99
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$2;->b:Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-static {v0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->a(Lcom/qihoo/security/service/LoadingPermissionDataService;)V

    .line 100
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$2;->a:Landroid/content/Intent;

    const-string/jumbo v1, "pkgname"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 101
    iget-object v1, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$2;->a:Landroid/content/Intent;

    const-string/jumbo v2, "pkguid"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 102
    invoke-static {v0, v1}, Lcom/qihoo/security/h/d;->a(Ljava/lang/String;I)V

    .line 106
    return-void
.end method
