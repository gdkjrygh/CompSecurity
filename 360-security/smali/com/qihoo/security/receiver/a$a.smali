.class Lcom/qihoo/security/receiver/a$a;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/receiver/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/receiver/a;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/receiver/a;)V
    .locals 1

    .prologue
    .line 19
    iput-object p1, p0, Lcom/qihoo/security/receiver/a$a;->a:Lcom/qihoo/security/receiver/a;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/receiver/a$a;->b:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/receiver/a;Lcom/qihoo/security/receiver/a$1;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/qihoo/security/receiver/a$a;-><init>(Lcom/qihoo/security/receiver/a;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 24
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/receiver/a$a;->b:Ljava/lang/String;

    .line 25
    const-string/jumbo v0, "android.intent.action.SCREEN_ON"

    iget-object v1, p0, Lcom/qihoo/security/receiver/a$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26
    iget-object v0, p0, Lcom/qihoo/security/receiver/a$a;->a:Lcom/qihoo/security/receiver/a;

    invoke-static {v0}, Lcom/qihoo/security/receiver/a;->a(Lcom/qihoo/security/receiver/a;)Lcom/qihoo/security/receiver/a$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/receiver/a$b;->b()V

    .line 32
    :cond_0
    :goto_0
    return-void

    .line 27
    :cond_1
    const-string/jumbo v0, "android.intent.action.SCREEN_OFF"

    iget-object v1, p0, Lcom/qihoo/security/receiver/a$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 28
    iget-object v0, p0, Lcom/qihoo/security/receiver/a$a;->a:Lcom/qihoo/security/receiver/a;

    invoke-static {v0}, Lcom/qihoo/security/receiver/a;->a(Lcom/qihoo/security/receiver/a;)Lcom/qihoo/security/receiver/a$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/receiver/a$b;->c()V

    goto :goto_0

    .line 29
    :cond_2
    const-string/jumbo v0, "android.intent.action.USER_PRESENT"

    iget-object v1, p0, Lcom/qihoo/security/receiver/a$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/receiver/a$a;->a:Lcom/qihoo/security/receiver/a;

    invoke-static {v0}, Lcom/qihoo/security/receiver/a;->a(Lcom/qihoo/security/receiver/a;)Lcom/qihoo/security/receiver/a$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/receiver/a$b;->a()V

    goto :goto_0
.end method
