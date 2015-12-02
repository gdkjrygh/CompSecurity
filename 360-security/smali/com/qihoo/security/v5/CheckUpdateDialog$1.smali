.class Lcom/qihoo/security/v5/CheckUpdateDialog$1;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/CheckUpdateDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/CheckUpdateDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/CheckUpdateDialog;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$1;->a:Lcom/qihoo/security/v5/CheckUpdateDialog;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 58
    if-eqz p2, :cond_0

    .line 59
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 60
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_DISMISS_CHECK_UPDATE_DIALOG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/v5/CheckUpdateDialog$1;->a:Lcom/qihoo/security/v5/CheckUpdateDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/CheckUpdateDialog;->finish()V

    .line 66
    :cond_0
    return-void
.end method
