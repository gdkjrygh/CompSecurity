.class Lcom/qihoo/security/h/f$b;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/h/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/h/f;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/h/f;)V
    .locals 0

    .prologue
    .line 185
    iput-object p1, p0, Lcom/qihoo/security/h/f$b;->a:Lcom/qihoo/security/h/f;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/h/f;Lcom/qihoo/security/h/f$1;)V
    .locals 0

    .prologue
    .line 185
    invoke-direct {p0, p1}, Lcom/qihoo/security/h/f$b;-><init>(Lcom/qihoo/security/h/f;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    .line 189
    if-nez p2, :cond_1

    .line 200
    :cond_0
    :goto_0
    return-void

    .line 191
    :cond_1
    const-string/jumbo v0, "android.intent.extra.changed_package_list"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 194
    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    .line 196
    iget-object v1, p0, Lcom/qihoo/security/h/f$b;->a:Lcom/qihoo/security/h/f;

    invoke-static {v1}, Lcom/qihoo/security/h/f;->a(Lcom/qihoo/security/h/f;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/qihoo/security/h/f$b;->a:Lcom/qihoo/security/h/f;

    invoke-static {v3}, Lcom/qihoo/security/h/f;->a(Lcom/qihoo/security/h/f;)Landroid/content/Context;

    move-result-object v3

    const-class v4, Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v3, "com.qihoo360.mobilesafe.shield.pkgsavailable"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string/jumbo v3, "pkgslist"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method
