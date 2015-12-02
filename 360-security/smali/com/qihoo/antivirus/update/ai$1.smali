.class Lcom/qihoo/antivirus/update/ai$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/antivirus/update/ai;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/antivirus/update/ai;


# direct methods
.method constructor <init>(Lcom/qihoo/antivirus/update/ai;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/antivirus/update/ai$1;->a:Lcom/qihoo/antivirus/update/ai;

    .line 499
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 505
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai$1;->a:Lcom/qihoo/antivirus/update/ai;

    invoke-static {v1}, Lcom/qihoo/antivirus/update/ai;->a(Lcom/qihoo/antivirus/update/ai;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/qihoo/antivirus/update/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 506
    const-string/jumbo v1, "com.qihoo.action.UPDATE_NOTICE_TIMEOUT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 507
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai$1;->a:Lcom/qihoo/antivirus/update/ai;

    invoke-static {v1}, Lcom/qihoo/antivirus/update/ai;->a(Lcom/qihoo/antivirus/update/ai;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 508
    return-void
.end method
