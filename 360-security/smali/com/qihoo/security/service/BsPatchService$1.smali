.class Lcom/qihoo/security/service/BsPatchService$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/service/BsPatchService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/qihoo/security/service/BsPatchService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/BsPatchService;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/qihoo/security/service/BsPatchService$1;->d:Lcom/qihoo/security/service/BsPatchService;

    iput-object p2, p0, Lcom/qihoo/security/service/BsPatchService$1;->a:Ljava/io/File;

    iput-object p3, p0, Lcom/qihoo/security/service/BsPatchService$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/qihoo/security/service/BsPatchService$1;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 80
    iget-object v0, p0, Lcom/qihoo/security/service/BsPatchService$1;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/service/BsPatchService$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/service/BsPatchService$1;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/support/BsPatch;->applyPatch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/service/BsPatchService$1;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/service/BsPatchService$1;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_1

    .line 82
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/service/BsPatchService$1;->d:Lcom/qihoo/security/service/BsPatchService;

    invoke-static {v1}, Lcom/qihoo/security/service/BsPatchService;->a(Lcom/qihoo/security/service/BsPatchService;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/dialog/DataFailDialog;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 83
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 84
    iget-object v1, p0, Lcom/qihoo/security/service/BsPatchService$1;->d:Lcom/qihoo/security/service/BsPatchService;

    invoke-static {v1}, Lcom/qihoo/security/service/BsPatchService;->b(Lcom/qihoo/security/service/BsPatchService;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 90
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/service/BsPatchService$1;->d:Lcom/qihoo/security/service/BsPatchService;

    invoke-virtual {v0}, Lcom/qihoo/security/service/BsPatchService;->stopSelf()V

    .line 91
    return-void
.end method
