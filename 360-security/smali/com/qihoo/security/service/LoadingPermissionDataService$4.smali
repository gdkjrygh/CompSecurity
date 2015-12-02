.class Lcom/qihoo/security/service/LoadingPermissionDataService$4;
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
    .line 123
    iput-object p1, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$4;->b:Lcom/qihoo/security/service/LoadingPermissionDataService;

    iput-object p2, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$4;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$4;->b:Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-static {v0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->a(Lcom/qihoo/security/service/LoadingPermissionDataService;)V

    .line 128
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$4;->a:Landroid/content/Intent;

    const-string/jumbo v1, "FILE_PATH"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 131
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$4;->b:Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-virtual {v0}, Lcom/qihoo/security/service/LoadingPermissionDataService;->stopSelf()V

    .line 134
    :cond_0
    return-void
.end method
