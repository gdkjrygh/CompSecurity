.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)V
    .locals 0

    .prologue
    .line 759
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 766
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {p2}, Lcom/qihoo360/mobilesafe/core/c/c$a;->a(Landroid/os/IBinder;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;

    .line 767
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 769
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->i(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Lcom/qihoo360/mobilesafe/core/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 777
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 805
    return-void

    .line 770
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 809
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 811
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->i(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/b;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Lcom/qihoo360/mobilesafe/core/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 818
    :cond_0
    :goto_0
    return-void

    .line 812
    :catch_0
    move-exception v0

    goto :goto_0
.end method
