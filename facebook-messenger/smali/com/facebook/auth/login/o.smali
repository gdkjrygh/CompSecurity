.class public Lcom/facebook/auth/login/o;
.super Ljava/lang/Object;
.source "AuthOperations.java"


# instance fields
.field private final a:Lcom/facebook/auth/b/d;

.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/a/b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/auth/protocol/c;

.field private final e:Lcom/facebook/auth/protocol/e;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/auth/protocol/b;

.field private final h:Lcom/facebook/auth/protocol/a;

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/facebook/auth/login/am;

.field private final k:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/facebook/auth/login/a;


# direct methods
.method public constructor <init>(Lcom/facebook/auth/b/a;Lcom/facebook/prefs/shared/d;Ljava/util/Set;Lcom/facebook/auth/protocol/c;Lcom/facebook/auth/protocol/e;Lcom/facebook/auth/protocol/b;Lcom/facebook/auth/protocol/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/auth/login/am;Ljavax/inject/a;Lcom/facebook/auth/login/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/a;",
            "Lcom/facebook/prefs/shared/d;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/auth/a/b;",
            ">;",
            "Lcom/facebook/auth/protocol/c;",
            "Lcom/facebook/auth/protocol/e;",
            "Lcom/facebook/auth/protocol/b;",
            "Lcom/facebook/auth/protocol/a;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/auth/login/am;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/auth/login/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    instance-of v0, p1, Lcom/facebook/auth/b/d;

    const-string v1, "AuthDataStore must be an LoggedInUserSessionManager"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 61
    check-cast p1, Lcom/facebook/auth/b/d;

    iput-object p1, p0, Lcom/facebook/auth/login/o;->a:Lcom/facebook/auth/b/d;

    .line 62
    iput-object p2, p0, Lcom/facebook/auth/login/o;->b:Lcom/facebook/prefs/shared/d;

    .line 63
    iput-object p3, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    .line 64
    iput-object p4, p0, Lcom/facebook/auth/login/o;->d:Lcom/facebook/auth/protocol/c;

    .line 65
    iput-object p5, p0, Lcom/facebook/auth/login/o;->e:Lcom/facebook/auth/protocol/e;

    .line 66
    iput-object p6, p0, Lcom/facebook/auth/login/o;->g:Lcom/facebook/auth/protocol/b;

    .line 67
    iput-object p7, p0, Lcom/facebook/auth/login/o;->h:Lcom/facebook/auth/protocol/a;

    .line 68
    iput-object p8, p0, Lcom/facebook/auth/login/o;->f:Ljavax/inject/a;

    .line 69
    iput-object p9, p0, Lcom/facebook/auth/login/o;->i:Ljavax/inject/a;

    .line 70
    iput-object p10, p0, Lcom/facebook/auth/login/o;->j:Lcom/facebook/auth/login/am;

    .line 71
    iput-object p11, p0, Lcom/facebook/auth/login/o;->k:Ljavax/inject/a;

    .line 72
    iput-object p12, p0, Lcom/facebook/auth/login/o;->l:Lcom/facebook/auth/login/a;

    .line 73
    return-void
.end method

.method private a(Ljava/util/concurrent/Callable;)Lcom/facebook/auth/protocol/AuthenticationResult;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable",
            "<",
            "Lcom/facebook/auth/protocol/AuthenticationResult;",
            ">;)",
            "Lcom/facebook/auth/protocol/AuthenticationResult;"
        }
    .end annotation

    .prologue
    .line 200
    :try_start_0
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 201
    invoke-interface {v0}, Lcom/facebook/auth/a/b;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 224
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 225
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 226
    invoke-interface {v0, v1}, Lcom/facebook/auth/a/b;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 205
    :cond_0
    :try_start_1
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/protocol/AuthenticationResult;

    .line 208
    invoke-interface {v0}, Lcom/facebook/auth/protocol/AuthenticationResult;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 209
    iget-object v1, p0, Lcom/facebook/auth/login/o;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 210
    sget-object v2, Lcom/facebook/auth/e/a;->i:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0}, Lcom/facebook/auth/protocol/AuthenticationResult;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 212
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 216
    :cond_1
    iget-object v1, p0, Lcom/facebook/auth/login/o;->j:Lcom/facebook/auth/login/am;

    invoke-virtual {v1}, Lcom/facebook/auth/login/am;->c()V

    .line 217
    iget-object v1, p0, Lcom/facebook/auth/login/o;->a:Lcom/facebook/auth/b/d;

    invoke-interface {v0}, Lcom/facebook/auth/protocol/AuthenticationResult;->a()Lcom/facebook/auth/credentials/FacebookCredentials;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/auth/b/d;->a(Lcom/facebook/auth/credentials/FacebookCredentials;)V

    .line 219
    iget-object v1, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/a/b;

    .line 220
    invoke-interface {v1, v0}, Lcom/facebook/auth/a/b;->a(Lcom/facebook/auth/protocol/AuthenticationResult;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    .line 229
    :cond_2
    throw v1

    .line 223
    :cond_3
    return-object v0
.end method

.method static synthetic a(Lcom/facebook/auth/login/o;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/o;->b:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method

.method private a(Lcom/facebook/http/protocol/f;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/protocol/f",
            "<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/auth/login/o;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->k()V

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 125
    invoke-interface {v0}, Lcom/facebook/auth/a/b;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 166
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/auth/login/o;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v1}, Lcom/facebook/auth/b/d;->l()V

    throw v0

    .line 128
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 129
    invoke-interface {v0}, Lcom/facebook/auth/a/b;->d()V

    goto :goto_1

    .line 132
    :cond_1
    if-eqz p1, :cond_2

    .line 133
    iget-object v0, p0, Lcom/facebook/auth/login/o;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 134
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    :cond_2
    iget-object v0, p0, Lcom/facebook/auth/login/o;->l:Lcom/facebook/auth/login/a;

    new-instance v1, Lcom/facebook/auth/login/r;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/r;-><init>(Lcom/facebook/auth/login/o;)V

    invoke-virtual {v0, v1}, Lcom/facebook/auth/login/a;->a(Ljava/lang/Runnable;)V

    .line 150
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 151
    invoke-interface {v0}, Lcom/facebook/auth/a/b;->f()V

    goto :goto_2

    .line 154
    :cond_3
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 155
    invoke-interface {v0}, Lcom/facebook/auth/a/b;->g()V

    goto :goto_3

    .line 158
    :cond_4
    iget-object v0, p0, Lcom/facebook/auth/login/o;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 159
    sget-object v1, Lcom/facebook/auth/e/a;->h:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 160
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 162
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/a/b;

    .line 163
    invoke-interface {v0}, Lcom/facebook/auth/a/b;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    .line 166
    :cond_5
    iget-object v0, p0, Lcom/facebook/auth/login/o;->a:Lcom/facebook/auth/b/d;

    invoke-virtual {v0}, Lcom/facebook/auth/b/d;->l()V

    .line 168
    return-void
.end method

.method static synthetic b(Lcom/facebook/auth/login/o;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/o;->k:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/auth/login/o;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/o;->f:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/auth/login/o;)Lcom/facebook/auth/protocol/e;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/o;->e:Lcom/facebook/auth/protocol/e;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/auth/login/o;)Lcom/facebook/auth/protocol/c;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/o;->d:Lcom/facebook/auth/protocol/c;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/auth/login/o;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/o;->c:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/auth/login/o;)Lcom/facebook/auth/b/d;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/auth/login/o;->a:Lcom/facebook/auth/b/d;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/auth/credentials/PasswordCredentials;)Lcom/facebook/auth/protocol/AuthenticationResult;
    .locals 1

    .prologue
    .line 98
    new-instance v0, Lcom/facebook/auth/login/q;

    invoke-direct {v0, p0, p1}, Lcom/facebook/auth/login/q;-><init>(Lcom/facebook/auth/login/o;Lcom/facebook/auth/credentials/PasswordCredentials;)V

    invoke-direct {p0, v0}, Lcom/facebook/auth/login/o;->a(Ljava/util/concurrent/Callable;)Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/auth/protocol/AuthenticationResult;
    .locals 1

    .prologue
    .line 76
    new-instance v0, Lcom/facebook/auth/login/p;

    invoke-direct {v0, p0, p1}, Lcom/facebook/auth/login/p;-><init>(Lcom/facebook/auth/login/o;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/facebook/auth/login/o;->a(Ljava/util/concurrent/Callable;)Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 171
    const/4 v1, 0x0

    .line 172
    iget-object v0, p0, Lcom/facebook/auth/login/o;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/facebook/auth/login/o;->g:Lcom/facebook/auth/protocol/b;

    .line 175
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/auth/login/o;->a(Lcom/facebook/http/protocol/f;)V

    .line 176
    return-void

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/auth/login/o;->h:Lcom/facebook/auth/protocol/a;

    invoke-direct {p0, v0}, Lcom/facebook/auth/login/o;->a(Lcom/facebook/http/protocol/f;)V

    .line 180
    return-void
.end method
