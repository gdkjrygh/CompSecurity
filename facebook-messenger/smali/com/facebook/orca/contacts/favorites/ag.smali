.class public Lcom/facebook/orca/contacts/favorites/ag;
.super Landroid/support/v4/a/a;
.source "InstallMessengerLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/a/a",
        "<",
        "Lcom/facebook/orca/contacts/favorites/ah;",
        ">;"
    }
.end annotation


# instance fields
.field private final m:Lcom/facebook/user/e;

.field private final n:Lcom/facebook/contacts/data/l;

.field private final o:Lcom/facebook/contacts/a/e;

.field private p:Lcom/facebook/orca/contacts/favorites/ah;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/user/e;Lcom/facebook/contacts/data/l;Lcom/facebook/contacts/a/e;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0, p1}, Landroid/support/v4/a/a;-><init>(Landroid/content/Context;)V

    .line 103
    iput-object p2, p0, Lcom/facebook/orca/contacts/favorites/ag;->m:Lcom/facebook/user/e;

    .line 104
    iput-object p3, p0, Lcom/facebook/orca/contacts/favorites/ag;->n:Lcom/facebook/contacts/data/l;

    .line 105
    iput-object p4, p0, Lcom/facebook/orca/contacts/favorites/ag;->o:Lcom/facebook/contacts/a/e;

    .line 106
    return-void
.end method

.method private t()Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 169
    const-string v0, "getFriendMobileAppData"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 170
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->n:Lcom/facebook/contacts/data/l;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/l;->b()Lcom/google/common/a/es;

    move-result-object v0

    .line 176
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v2

    .line 177
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 178
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 179
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 180
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v5

    invoke-virtual {v0}, Lcom/facebook/user/User;->D()Lcom/facebook/user/MobileAppData;

    move-result-object v0

    invoke-virtual {v2, v5, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    goto :goto_0

    .line 182
    :cond_0
    invoke-virtual {v2}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v2

    .line 183
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->m:Lcom/facebook/user/e;

    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/facebook/user/e;->a(Ljava/util/Collection;)V

    .line 184
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 187
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->m:Lcom/facebook/user/e;

    invoke-interface {v0}, Lcom/facebook/user/e;->c()Lcom/facebook/user/User;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 191
    new-instance v4, Lcom/facebook/user/o;

    invoke-direct {v4}, Lcom/facebook/user/o;-><init>()V

    invoke-virtual {v4, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/User;)Lcom/facebook/user/o;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/MobileAppData;

    invoke-virtual {v4, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/MobileAppData;)Lcom/facebook/user/o;

    move-result-object v0

    .line 194
    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 196
    :catch_0
    move-exception v0

    .line 197
    :try_start_1
    const-string v2, "orca:FriendListsLoader"

    const-string v4, "Exception reading users"

    invoke-static {v2, v4, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->m:Lcom/facebook/user/e;

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    .line 201
    :goto_2
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 202
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0

    .line 199
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->m:Lcom/facebook/user/e;

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    goto :goto_2

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/ag;->m:Lcom/facebook/user/e;

    invoke-interface {v1}, Lcom/facebook/user/e;->d()V

    throw v0
.end method


# virtual methods
.method public synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/ag;->r()Lcom/facebook/orca/contacts/favorites/ah;

    move-result-object v0

    return-object v0
.end method

.method protected i()V
    .locals 2

    .prologue
    .line 112
    invoke-super {p0}, Landroid/support/v4/a/a;->i()V

    .line 113
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onStartLoading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->p:Lcom/facebook/orca/contacts/favorites/ah;

    if-eqz v0, :cond_0

    .line 116
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "Using cached result"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->p:Lcom/facebook/orca/contacts/favorites/ah;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/ag;->b(Ljava/lang/Object;)V

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->p:Lcom/facebook/orca/contacts/favorites/ah;

    if-nez v0, :cond_1

    .line 121
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "Forcing a load"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/ag;->j()V

    .line 124
    :cond_1
    return-void
.end method

.method protected l()V
    .locals 2

    .prologue
    .line 128
    invoke-super {p0}, Landroid/support/v4/a/a;->l()V

    .line 129
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onStopLoading"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/ag;->b()Z

    .line 131
    return-void
.end method

.method protected p()V
    .locals 2

    .prologue
    .line 135
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "onReset"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/ag;->l()V

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->p:Lcom/facebook/orca/contacts/favorites/ah;

    .line 138
    return-void
.end method

.method public r()Lcom/facebook/orca/contacts/favorites/ah;
    .locals 3

    .prologue
    .line 142
    const-string v0, "orca:FriendListsLoader"

    const-string v1, "starting loadInBackground"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/ag;->s()Lcom/facebook/orca/contacts/favorites/ah;

    move-result-object v0

    .line 144
    const-string v1, "orca:FriendListsLoader"

    const-string v2, "loadInBackground. loadLocalData loaded"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/ag;->o:Lcom/facebook/contacts/a/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/ah;->a()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/a/e;->a(Lcom/google/common/a/es;)V

    .line 147
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/ag;->o:Lcom/facebook/contacts/a/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/ah;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/a/e;->b(Lcom/google/common/a/es;)V

    .line 149
    new-instance v1, Lcom/facebook/orca/contacts/favorites/ah;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/ah;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/facebook/orca/contacts/favorites/ah;-><init>(Lcom/google/common/a/es;)V

    iput-object v1, p0, Lcom/facebook/orca/contacts/favorites/ag;->p:Lcom/facebook/orca/contacts/favorites/ah;

    .line 151
    const-string v0, "orca:FriendListsLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadInBackground result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/contacts/favorites/ag;->p:Lcom/facebook/orca/contacts/favorites/ah;

    invoke-virtual {v2}, Lcom/facebook/orca/contacts/favorites/ah;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ag;->p:Lcom/facebook/orca/contacts/favorites/ah;

    return-object v0
.end method

.method s()Lcom/facebook/orca/contacts/favorites/ah;
    .locals 2

    .prologue
    .line 156
    .line 158
    const-wide/16 v0, 0x3

    invoke-static {v0, v1}, Lcom/facebook/debug/d/e;->b(J)V

    .line 159
    const-string v0, "loadInBackground"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 160
    invoke-direct {p0}, Lcom/facebook/orca/contacts/favorites/ag;->t()Lcom/google/common/a/es;

    move-result-object v1

    .line 162
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 163
    const-string v0, "orca:FriendListsLoader"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->c(Ljava/lang/String;)V

    .line 165
    new-instance v0, Lcom/facebook/orca/contacts/favorites/ah;

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/favorites/ah;-><init>(Lcom/google/common/a/es;)V

    return-object v0
.end method
