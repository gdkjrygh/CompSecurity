.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;)V
    .locals 0

    .prologue
    .line 777
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 780
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 782
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 784
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->j(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 785
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->a(Z)V

    .line 787
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Lcom/qihoo360/mobilesafe/core/c/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 788
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;J)J
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 801
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->o()V

    .line 802
    return-void

    .line 791
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 792
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6$1;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$6;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->j(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 794
    :catch_0
    move-exception v0

    goto :goto_0
.end method
