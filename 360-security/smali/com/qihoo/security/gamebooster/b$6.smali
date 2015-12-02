.class Lcom/qihoo/security/gamebooster/b$6;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/b;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/b;)V
    .locals 0

    .prologue
    .line 1092
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/b$6;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 1096
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 1100
    const-string/jumbo v1, "clear_cloud_query_success"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1101
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/b$6;->a:Lcom/qihoo/security/gamebooster/b;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/b;->l(Lcom/qihoo/security/gamebooster/b;)V

    .line 1104
    :cond_0
    return-void
.end method
