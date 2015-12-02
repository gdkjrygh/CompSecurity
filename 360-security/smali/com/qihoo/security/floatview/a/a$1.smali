.class Lcom/qihoo/security/floatview/a/a$1;
.super Lcom/qihoo/security/floatview/a/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/floatview/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/a/a;)V
    .locals 0

    .prologue
    .line 188
    iput-object p1, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-direct {p0}, Lcom/qihoo/security/floatview/a/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 242
    const-string/jumbo v0, "fvs"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->h(Lcom/qihoo/security/floatview/a/a;)I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 255
    :goto_0
    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0, p1}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;I)I

    .line 249
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "fv_mode"

    iget-object v2, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v2}, Lcom/qihoo/security/floatview/a/a;->h(Lcom/qihoo/security/floatview/a/a;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 192
    const-string/jumbo v0, "fvs"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 198
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;Z)Z

    .line 209
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->b(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 210
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->d(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->c(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/c$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/c;)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->d(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->e(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/b$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->f(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->f()Z

    .line 232
    :cond_0
    :goto_2
    return-void

    .line 200
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->b(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v0

    if-eq v0, p1, :cond_0

    .line 204
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0, p1}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;Z)Z

    .line 205
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->a(Lcom/qihoo/security/floatview/a/a;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "fv_enabled"

    iget-object v2, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v2}, Lcom/qihoo/security/floatview/a/a;->b(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_0

    .line 213
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->d(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->c(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/c$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/c;)V

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->d(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v1}, Lcom/qihoo/security/floatview/a/a;->e(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/service/b$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 216
    :catch_0
    move-exception v0

    goto :goto_1

    .line 227
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->g(Lcom/qihoo/security/floatview/a/a;)Lcom/qihoo/security/floatview/ui/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/a;->g()V

    goto :goto_2
.end method

.method public a(ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 275
    return-void
.end method

.method public a()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 236
    const-string/jumbo v0, "fvs"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->b(Lcom/qihoo/security/floatview/a/a;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 259
    const-string/jumbo v0, "fvs"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 263
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-static {v0}, Lcom/qihoo/security/floatview/a/a;->h(Lcom/qihoo/security/floatview/a/a;)I

    move-result v0

    return v0
.end method

.method public c()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 281
    return-void
.end method

.method public d()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 285
    const-string/jumbo v0, "fvs"

    invoke-static {v0}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerPermissionByUid(Ljava/lang/String;)V

    .line 286
    iget-object v0, p0, Lcom/qihoo/security/floatview/a/a$1;->a:Lcom/qihoo/security/floatview/a/a;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/a/a;->d()V

    .line 287
    return-void
.end method
