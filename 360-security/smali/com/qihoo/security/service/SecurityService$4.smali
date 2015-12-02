.class Lcom/qihoo/security/service/SecurityService$4;
.super Lcom/qihoo/security/locale/b$a;
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
    .line 1203
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService$4;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-direct {p0}, Lcom/qihoo/security/locale/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1209
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$4;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->u(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/notify/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/notify/b;->c()V

    .line 1210
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$4;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->v(Lcom/qihoo/security/service/SecurityService;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1222
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1230
    return-void
.end method

.method public a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1243
    return-void
.end method

.method public b()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1234
    return-void
.end method

.method public c()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1238
    return-void
.end method

.method public d()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1226
    return-void
.end method
