.class Lcom/qihoo/security/service/LoadingPermissionDataService$5;
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
    .line 139
    iput-object p1, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$5;->b:Lcom/qihoo/security/service/LoadingPermissionDataService;

    iput-object p2, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$5;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 143
    iget-object v0, p0, Lcom/qihoo/security/service/LoadingPermissionDataService$5;->a:Landroid/content/Intent;

    const-string/jumbo v1, "pkgslist"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 144
    invoke-static {}, Lcom/qihoo/security/h/f;->a()Lcom/qihoo/security/h/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/h/f;->a([Ljava/lang/String;)V

    .line 145
    return-void
.end method
