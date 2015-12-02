.class Lcom/qihoo/security/ui/b/a$1;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/b/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/b/a;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/qihoo/security/ui/b/a$1;->a:Lcom/qihoo/security/ui/b/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 72
    if-nez p2, :cond_1

    .line 84
    :cond_0
    :goto_0
    return-void

    .line 75
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 79
    const-string/jumbo v1, "com.qihoo.security.REBOOT_MAIN_SCREEN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$1;->a:Lcom/qihoo/security/ui/b/a;

    const-string/jumbo v1, "locale changed"

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 81
    :cond_2
    const-string/jumbo v1, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/b/a$1;->a:Lcom/qihoo/security/ui/b/a;

    const-string/jumbo v1, "system locale changed"

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
