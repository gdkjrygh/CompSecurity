.class Lcom/qihoo/security/service/SecurityService$2;
.super Lcom/qihoo/security/service/a$a;
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
    .line 1018
    iput-object p1, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-direct {p0}, Lcom/qihoo/security/service/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1022
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1026
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->u(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/notify/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/notify/b;->c()V

    .line 1027
    return-void
.end method

.method public a(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1073
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0, p1}, Lcom/qihoo/security/service/SecurityService;->d(Lcom/qihoo/security/service/SecurityService;I)I

    .line 1077
    invoke-virtual {p0}, Lcom/qihoo/security/service/SecurityService$2;->f()V

    .line 1078
    return-void
.end method

.method public a(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1115
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1116
    invoke-static {}, Lcom/qihoo/utils/notice/c;->d()V

    .line 1120
    return-void
.end method

.method public a(Lcom/qihoo/security/service/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1094
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1095
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->o(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/service/SecurityService$a;->a(ILjava/lang/Object;)V

    .line 1096
    return-void
.end method

.method public a(Lcom/qihoo/security/service/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1040
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1041
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->o(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$a;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/service/SecurityService$a;->a(ILjava/lang/Object;)V

    .line 1042
    return-void
.end method

.method public a(Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1106
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1110
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->u(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/notify/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/notify/b;->a(Z)V

    .line 1111
    return-void
.end method

.method public b()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1031
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1035
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->u(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/notify/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/notify/b;->c()V

    .line 1036
    return-void
.end method

.method public b(II)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1124
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1128
    return-void
.end method

.method public b(Lcom/qihoo/security/service/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1100
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1101
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->o(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/service/SecurityService$a;->a(ILjava/lang/Object;)V

    .line 1102
    return-void
.end method

.method public b(Lcom/qihoo/security/service/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1046
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1047
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->o(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Lcom/qihoo/security/service/SecurityService$a;->a(ILjava/lang/Object;)V

    .line 1048
    return-void
.end method

.method public c()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1052
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1053
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->s(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->k(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    if-lez v0, :cond_0

    .line 1054
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->k(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    .line 1056
    :goto_0
    return v0

    :cond_0
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryUsedPercent()I

    move-result v0

    goto :goto_0
.end method

.method public d()J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1061
    const-string/jumbo v0, "ss"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 1062
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->l(Lcom/qihoo/security/service/SecurityService;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1063
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->k(Lcom/qihoo/security/service/SecurityService;)I

    move-result v0

    if-lez v0, :cond_0

    .line 1064
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->l(Lcom/qihoo/security/service/SecurityService;)J

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v2}, Lcom/qihoo/security/service/SecurityService;->k(Lcom/qihoo/security/service/SecurityService;)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x64

    int-to-long v2, v2

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x64

    div-long/2addr v0, v2

    .line 1067
    :goto_0
    return-wide v0

    :cond_0
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryFreeKb()J

    move-result-wide v0

    goto :goto_0
.end method

.method public e()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1083
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/service/SecurityService;->d(Lcom/qihoo/security/service/SecurityService;I)I

    .line 1084
    invoke-virtual {p0}, Lcom/qihoo/security/service/SecurityService$2;->f()V

    .line 1085
    return-void
.end method

.method public f()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 1089
    iget-object v0, p0, Lcom/qihoo/security/service/SecurityService$2;->a:Lcom/qihoo/security/service/SecurityService;

    invoke-static {v0}, Lcom/qihoo/security/service/SecurityService;->c(Lcom/qihoo/security/service/SecurityService;)Lcom/qihoo/security/service/SecurityService$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/service/SecurityService$b;->a()V

    .line 1090
    return-void
.end method
