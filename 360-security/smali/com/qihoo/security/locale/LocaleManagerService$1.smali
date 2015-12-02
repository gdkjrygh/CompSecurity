.class Lcom/qihoo/security/locale/LocaleManagerService$1;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/locale/LocaleManagerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/locale/LocaleManagerService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/locale/LocaleManagerService;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/qihoo/security/locale/LocaleManagerService$1;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 58
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "android.intent.action.LOCALE_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$1;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/locale/LocaleManagerService$1;->a:Lcom/qihoo/security/locale/LocaleManagerService;

    invoke-static {v0}, Lcom/qihoo/security/locale/LocaleManagerService;->a(Lcom/qihoo/security/locale/LocaleManagerService;)Lcom/qihoo/security/locale/LocaleManagerService$a;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/LocaleManagerService$a;->sendEmptyMessage(I)Z

    .line 68
    :cond_0
    return-void
.end method
