.class Lcom/qihoo/security/service/SecurityService$1;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/service/SecurityService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/service/SecurityService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/SecurityService;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService$1;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 198
    const-string/jumbo v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    :cond_0
    :goto_0
    return-void

    .line 200
    :cond_1
    const-string/jumbo v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/qihoo/security/opti/b/a;->b(Z)V

    .line 202
    invoke-static {}, Lcom/qihoo/security/opti/b/a;->a()V

    goto :goto_0

    .line 203
    :cond_2
    const-string/jumbo v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/opti/b/a;->b(Z)V

    .line 205
    invoke-static {}, Lcom/qihoo/security/opti/b/a;->a()V

    .line 206
    invoke-static {}, Lcom/qihoo/security/opti/b/a;->b()V

    goto :goto_0
.end method
