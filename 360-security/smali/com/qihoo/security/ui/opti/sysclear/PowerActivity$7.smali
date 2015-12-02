.class Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;
.super Lcom/qihoo360/mobilesafe/core/c/b;
.source "360Security"


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
    .line 821
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 847
    return-void
.end method

.method public a(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 825
    invoke-super {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/b;->a(Ljava/util/List;Z)V

    .line 827
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->y:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 843
    return-void
.end method

.method public b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 851
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->l(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 852
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z

    .line 865
    :cond_0
    :goto_0
    return-void

    .line 857
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;Z)Z

    .line 861
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 862
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;->finish()V

    goto :goto_0
.end method
