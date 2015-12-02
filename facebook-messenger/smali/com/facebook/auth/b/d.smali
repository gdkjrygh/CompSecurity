.class public final Lcom/facebook/auth/b/d;
.super Ljava/lang/Object;
.source "LoggedInUserSessionManager.java"

# interfaces
.implements Lcom/facebook/auth/b/b;
.implements Lcom/facebook/auth/b/c;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/auth/viewercontext/d;

.field private final c:Lcom/facebook/user/ac;

.field private final d:Lcom/facebook/common/e/h;

.field private e:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private f:Lcom/facebook/user/User;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private g:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private h:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private i:Lcom/facebook/auth/viewercontext/ViewerContext;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/auth/viewercontext/d;Lcom/facebook/user/ac;Lcom/facebook/common/e/h;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/facebook/auth/b/d;->a:Lcom/facebook/prefs/shared/d;

    .line 54
    iput-object p2, p0, Lcom/facebook/auth/b/d;->b:Lcom/facebook/auth/viewercontext/d;

    .line 55
    iput-object p3, p0, Lcom/facebook/auth/b/d;->c:Lcom/facebook/user/ac;

    .line 56
    iput-object p4, p0, Lcom/facebook/auth/b/d;->d:Lcom/facebook/common/e/h;

    .line 57
    return-void
.end method

.method private declared-synchronized m()Lcom/facebook/user/User;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 140
    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    if-eqz v1, :cond_1

    .line 141
    iget-object v0, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    .line 142
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/facebook/auth/b/d;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 146
    iget-object v1, p0, Lcom/facebook/auth/b/d;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/auth/e/a;->v:Lcom/facebook/prefs/shared/ae;

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 147
    if-eqz v1, :cond_0

    .line 151
    iget-object v2, p0, Lcom/facebook/auth/b/d;->c:Lcom/facebook/user/ac;

    sget-object v3, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v2, v3, v1}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    .line 155
    invoke-virtual {p0}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v1

    .line 156
    iget-object v2, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v2}, Lcom/facebook/user/User;->F()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v3}, Lcom/facebook/user/User;->F()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lcom/facebook/auth/b/d;->g:Z

    if-nez v2, :cond_2

    .line 161
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "auth token does not match me user. current token "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", me user token "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v2}, Lcom/facebook/user/User;->F()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 163
    iget-object v2, p0, Lcom/facebook/auth/b/d;->d:Lcom/facebook/common/e/h;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    invoke-virtual {p0}, Lcom/facebook/auth/b/d;->g()V

    .line 165
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/facebook/auth/b/d;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 140
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 169
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method


# virtual methods
.method public declared-synchronized a()Lcom/facebook/auth/viewercontext/ViewerContext;
    .locals 1

    .prologue
    .line 261
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/auth/b/d;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 262
    const/4 v0, 0x0

    .line 267
    :goto_0
    monitor-exit p0

    return-object v0

    .line 263
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/auth/b/d;->i:Lcom/facebook/auth/viewercontext/ViewerContext;

    if-nez v0, :cond_1

    .line 264
    iget-object v0, p0, Lcom/facebook/auth/b/d;->b:Lcom/facebook/auth/viewercontext/d;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/b/d;->i:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 267
    :cond_1
    iget-object v0, p0, Lcom/facebook/auth/b/d;->i:Lcom/facebook/auth/viewercontext/ViewerContext;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 261
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/auth/credentials/FacebookCredentials;)V
    .locals 1

    .prologue
    .line 215
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/facebook/auth/b/d;->a(Lcom/facebook/auth/credentials/FacebookCredentials;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    monitor-exit p0

    return-void

    .line 215
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/auth/credentials/FacebookCredentials;Z)V
    .locals 4

    .prologue
    .line 228
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/auth/b/d;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 229
    sget-object v1, Lcom/facebook/auth/e/a;->c:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 230
    sget-object v1, Lcom/facebook/auth/e/a;->d:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 231
    sget-object v1, Lcom/facebook/auth/e/a;->e:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->c()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 232
    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 233
    sget-object v1, Lcom/facebook/auth/e/a;->f:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->e()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 237
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 238
    sget-object v1, Lcom/facebook/auth/e/a;->j:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 242
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 243
    sget-object v1, Lcom/facebook/auth/e/a;->k:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->f()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 247
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 248
    sget-object v1, Lcom/facebook/auth/e/a;->m:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/auth/credentials/FacebookCredentials;->g()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 252
    :cond_3
    sget-object v1, Lcom/facebook/auth/e/a;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 253
    sget-object v1, Lcom/facebook/auth/e/a;->h:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    .line 254
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 255
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/auth/b/d;->i:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 256
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/auth/b/d;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    monitor-exit p0

    return-void

    .line 228
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/facebook/user/User;)V
    .locals 3

    .prologue
    .line 99
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    if-eqz v0, :cond_4

    .line 100
    new-instance v0, Lcom/facebook/user/o;

    invoke-direct {v0}, Lcom/facebook/user/o;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/user/o;->a(Lcom/facebook/user/User;)Lcom/facebook/user/o;

    move-result-object v0

    .line 101
    invoke-virtual {v0}, Lcom/facebook/user/o;->o()Lcom/facebook/common/w/q;

    move-result-object v1

    sget-object v2, Lcom/facebook/common/w/q;->UNSET:Lcom/facebook/common/w/q;

    if-ne v1, v2, :cond_0

    .line 102
    iget-object v1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->x()Lcom/facebook/common/w/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/o;->a(Lcom/facebook/common/w/q;)Lcom/facebook/user/o;

    .line 104
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/user/o;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 105
    iget-object v1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->j()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/o;->a(Ljava/util/List;)Lcom/facebook/user/o;

    .line 107
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/user/o;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 108
    iget-object v1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->k()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/o;->b(Ljava/util/List;)Lcom/facebook/user/o;

    .line 110
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/user/o;->w()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    .line 111
    iget-object v1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->F()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/o;->g(Ljava/lang/String;)V

    .line 113
    :cond_3
    iget-object v1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v1}, Lcom/facebook/user/User;->y()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/o;->a(Z)V

    .line 114
    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object p1

    .line 116
    :cond_4
    invoke-virtual {p0, p1}, Lcom/facebook/auth/b/d;->b(Lcom/facebook/user/User;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    monitor-exit p0

    return-void

    .line 99
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/facebook/user/User;)V
    .locals 3

    .prologue
    .line 89
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/auth/b/d;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 90
    iget-object v1, p0, Lcom/facebook/auth/b/d;->c:Lcom/facebook/user/ac;

    invoke-virtual {v1, p1}, Lcom/facebook/user/ac;->a(Lcom/facebook/user/User;)Ljava/lang/String;

    move-result-object v1

    .line 91
    sget-object v2, Lcom/facebook/auth/e/a;->v:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 92
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 93
    iput-object p1, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    .line 94
    iget-object v0, p0, Lcom/facebook/auth/b/d;->d:Lcom/facebook/common/e/h;

    const-string v1, "uid"

    iget-object v2, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    invoke-virtual {v2}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    monitor-exit p0

    return-void

    .line 89
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Z
    .locals 1

    .prologue
    .line 62
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/facebook/auth/b/d;->m()Lcom/facebook/user/User;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/auth/b/d;->a()Lcom/facebook/auth/viewercontext/ViewerContext;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Z
    .locals 1

    .prologue
    .line 66
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/auth/b/d;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 76
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/auth/b/d;->i()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const/4 v0, 0x0

    .line 80
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/facebook/auth/b/d;->m()Lcom/facebook/user/User;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()V
    .locals 1

    .prologue
    .line 124
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/auth/b/d;->f()V

    .line 125
    invoke-virtual {p0}, Lcom/facebook/auth/b/d;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    monitor-exit p0

    return-void

    .line 124
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()V
    .locals 2

    .prologue
    .line 133
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/facebook/auth/b/d;->f:Lcom/facebook/user/User;

    .line 134
    iget-object v0, p0, Lcom/facebook/auth/b/d;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 135
    sget-object v1, Lcom/facebook/auth/e/a;->v:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    .line 136
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    .line 133
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized g()V
    .locals 1

    .prologue
    .line 185
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/auth/b/d;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    monitor-exit p0

    return-void

    .line 185
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h()V
    .locals 1

    .prologue
    .line 197
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/auth/b/d;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    monitor-exit p0

    return-void

    .line 197
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized i()Z
    .locals 1

    .prologue
    .line 206
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/facebook/auth/b/d;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized j()V
    .locals 2

    .prologue
    .line 278
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/auth/b/d;->g()V

    .line 279
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/auth/b/d;->i:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 280
    iget-object v0, p0, Lcom/facebook/auth/b/d;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->k:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/auth/e/a;->m:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    monitor-exit p0

    return-void

    .line 278
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k()V
    .locals 1

    .prologue
    .line 296
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/auth/b/d;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    monitor-exit p0

    return-void

    .line 296
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized l()V
    .locals 1

    .prologue
    .line 303
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/facebook/auth/b/d;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 304
    monitor-exit p0

    return-void

    .line 303
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
