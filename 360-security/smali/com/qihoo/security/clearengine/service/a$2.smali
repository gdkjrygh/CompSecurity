.class Lcom/qihoo/security/clearengine/service/a$2;
.super Lcom/qihoo/security/clearengine/a/a$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/service/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/service/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/service/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    .line 143
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/a/a$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/service/a$2;)Lcom/qihoo/security/clearengine/service/a;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    return-object v0
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation

    .prologue
    .line 212
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/a;->a(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;

    move-result-object v0

    .line 213
    if-eqz v0, :cond_0

    .line 214
    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;->getList()Ljava/util/List;

    move-result-object v0

    .line 216
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 156
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/clearengine/service/a$2$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/clearengine/service/a$2$1;-><init>(Lcom/qihoo/security/clearengine/service/a$2;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 167
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 168
    return-void
.end method

.method public a(I[ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 148
    if-eqz p3, :cond_0

    .line 149
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 151
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-virtual {v1, p1, p2, v0}, Lcom/qihoo/security/clearengine/service/a;->a(I[ILjava/util/ArrayList;)V

    .line 152
    return-void
.end method

.method public a(Lcom/qihoo/security/clearengine/a/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 197
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->d(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/b;->a(Lcom/qihoo/security/clearengine/a/b;)V

    .line 198
    return-void
.end method

.method public a(Lcom/qihoo/security/clearengine/a/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 187
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/c;->a(Lcom/qihoo/security/clearengine/a/c;)V

    .line 188
    return-void
.end method

.method public a(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/service/a;->a(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;

    move-result-object v0

    .line 222
    if-eqz v0, :cond_0

    .line 223
    invoke-interface {v0, p1}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;->insert(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 224
    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;->save()V

    .line 226
    :cond_0
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 177
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/a;->a(Ljava/util/List;)V

    .line 178
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
    .line 172
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/service/a;->b()V

    .line 173
    return-void
.end method

.method public b(Lcom/qihoo/security/clearengine/a/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 202
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->d(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/b;->b(Lcom/qihoo/security/clearengine/a/b;)V

    .line 203
    return-void
.end method

.method public b(Lcom/qihoo/security/clearengine/a/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 192
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/service/a;->a(Lcom/qihoo/security/clearengine/service/a;)Lcom/qihoo/security/clearengine/service/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/service/c;->b(Lcom/qihoo/security/clearengine/a/c;)V

    .line 193
    return-void
.end method

.method public b(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    .locals 2

    .prologue
    .line 230
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/service/a;->a(I)Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;

    move-result-object v0

    .line 231
    if-eqz v0, :cond_0

    .line 232
    invoke-interface {v0, p1}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;->remove(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V

    .line 233
    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/opti/i/whitelist/IUserBWList;->save()V

    .line 235
    :cond_0
    return-void
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 182
    iget-object v0, p0, Lcom/qihoo/security/clearengine/service/a$2;->a:Lcom/qihoo/security/clearengine/service/a;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/service/a;->c()V

    .line 183
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
    .line 208
    return-void
.end method
