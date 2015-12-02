.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;
.super Lcom/qihoo360/mobilesafe/core/c/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)V
    .locals 0

    .prologue
    .line 897
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

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
    .line 926
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
    .line 902
    invoke-super {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/b;->a(Ljava/util/List;Z)V

    .line 904
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->y:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7$1;-><init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 920
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
    .line 930
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->l(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 931
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z

    .line 944
    :cond_0
    :goto_0
    return-void

    .line 936
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;Z)Z

    .line 940
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 941
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity$7;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;->finish()V

    goto :goto_0
.end method
