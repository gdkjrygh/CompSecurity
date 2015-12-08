.class public final Lcom/google/android/gms/internal/tu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/uu;


# instance fields
.field private final a:Lcom/google/android/gms/internal/uj;

.field private final b:Ljava/util/concurrent/locks/Lock;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/common/b;

.field private e:Lcom/google/android/gms/common/ConnectionResult;

.field private f:I

.field private g:I

.field private h:Z

.field private i:I

.field private final j:Landroid/os/Bundle;

.field private final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/d;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/google/android/gms/internal/xi;

.field private m:I

.field private n:Z

.field private o:Z

.field private p:Lcom/google/android/gms/common/internal/as;

.field private q:Z

.field private r:Z

.field private final s:Lcom/google/android/gms/common/internal/w;

.field private final t:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Lcom/google/android/gms/common/api/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/b",
            "<+",
            "Lcom/google/android/gms/internal/xi;",
            "Lcom/google/android/gms/internal/xj;",
            ">;"
        }
    .end annotation
.end field

.field private v:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/util/concurrent/Future",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/uj;Lcom/google/android/gms/common/internal/w;Ljava/util/Map;Lcom/google/android/gms/common/b;Lcom/google/android/gms/common/api/b;Ljava/util/concurrent/locks/Lock;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/uj;",
            "Lcom/google/android/gms/common/internal/w;",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/google/android/gms/common/b;",
            "Lcom/google/android/gms/common/api/b",
            "<+",
            "Lcom/google/android/gms/internal/xi;",
            "Lcom/google/android/gms/internal/xj;",
            ">;",
            "Ljava/util/concurrent/locks/Lock;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/internal/tu;->g:I

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tu;->h:Z

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/tu;->j:Landroid/os/Bundle;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/tu;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/tu;->v:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iput-object p2, p0, Lcom/google/android/gms/internal/tu;->s:Lcom/google/android/gms/common/internal/w;

    iput-object p3, p0, Lcom/google/android/gms/internal/tu;->t:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/internal/tu;->d:Lcom/google/android/gms/common/b;

    iput-object p5, p0, Lcom/google/android/gms/internal/tu;->u:Lcom/google/android/gms/common/api/b;

    iput-object p6, p0, Lcom/google/android/gms/internal/tu;->b:Ljava/util/concurrent/locks/Lock;

    iput-object p7, p0, Lcom/google/android/gms/internal/tu;->c:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/tu;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V
    .locals 2

    .prologue
    .line 0
    .line 5000
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ResolveAccountResponse;->b()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ResolveAccountResponse;->a()Lcom/google/android/gms/common/internal/as;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/tu;->p:Lcom/google/android/gms/common/internal/as;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tu;->o:Z

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ResolveAccountResponse;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tu;->q:Z

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ResolveAccountResponse;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tu;->r:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->f()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->a(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->f()V

    goto :goto_0

    :cond_2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/xi;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/xi;->f_()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/xi;->disconnect()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/tu;->p:Lcom/google/android/gms/common/internal/as;

    :cond_1
    return-void
.end method

.method private a(Lcom/google/android/gms/common/ConnectionResult;)Z
    .locals 3

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/tu;->m:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/google/android/gms/internal/tu;->m:I

    if-ne v1, v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/tu;I)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/tu;->b(I)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/tu;)Ljava/util/concurrent/locks/Lock;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->b:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method

.method private b(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->k()V

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->c()I

    move-result v2

    invoke-static {v0, v2}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/uj;->j()Z

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/tu;->h:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/uj;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/ak;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_1
    iput-boolean v1, p0, Lcom/google/android/gms/internal/tu;->h:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ak;->a()V

    return-void

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private b(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/ConnectionResult;",
            "Lcom/google/android/gms/common/api/a",
            "<*>;I)V"
        }
    .end annotation

    .prologue
    const v3, 0x7fffffff

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 0
    const/4 v2, 0x2

    if-eq p3, v2, :cond_2

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/a;->a()Lcom/google/android/gms/common/api/b;

    .line 3000
    if-ne p3, v0, :cond_0

    .line 4000
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v0

    .line 3000
    :goto_0
    if-eqz v2, :cond_5

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/tu;->e:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/google/android/gms/internal/tu;->f:I

    if-ge v3, v2, :cond_5

    .line 0
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    iput-object p1, p0, Lcom/google/android/gms/internal/tu;->e:Lcom/google/android/gms/common/ConnectionResult;

    iput v3, p0, Lcom/google/android/gms/internal/tu;->f:I

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/a;->c()Lcom/google/android/gms/common/api/d;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4000
    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->c()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/common/b;->b(I)Landroid/content/Intent;

    move-result-object v2

    if-eqz v2, :cond_4

    move v2, v0

    goto :goto_0

    :cond_4
    move v2, v1

    goto :goto_0

    :cond_5
    move v0, v1

    .line 3000
    goto :goto_1
.end method

.method private b(I)Z
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/tu;->g:I

    if-eq v0, p1, :cond_0

    const-string v0, "GoogleApiClientConnecting"

    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/uj;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "GoogleApiClientConnecting"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GoogleApiClient connecting is in step "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/google/android/gms/internal/tu;->g:I

    invoke-static {v2}, Lcom/google/android/gms/internal/tu;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " but received callback for step "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/tu;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/tu;->a(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/uj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    return-object v0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const-string v0, "UNKNOWN"

    :goto_0
    return-object v0

    :pswitch_0
    const-string v0, "STEP_GETTING_SERVICE_BINDINGS"

    goto :goto_0

    :pswitch_1
    const-string v0, "STEP_VALIDATING_ACCOUNT"

    goto :goto_0

    :pswitch_2
    const-string v0, "STEP_AUTHENTICATING"

    goto :goto_0

    :pswitch_3
    const-string v0, "STEP_GETTING_REMOTE_SERVICE"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic c(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    .prologue
    .line 0
    .line 6000
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->h()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/tu;->a(Lcom/google/android/gms/common/ConnectionResult;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->h()V

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/tu;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/tu;->n:Z

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/xi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    return-object v0
.end method

.method private e()Z
    .locals 4

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/internal/tu;->i:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/google/android/gms/internal/tu;->i:I

    iget v1, p0, Lcom/google/android/gms/internal/tu;->i:I

    if-lez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/tu;->i:I

    if-gez v1, :cond_1

    const-string v1, "GoogleApiClientConnecting"

    iget-object v2, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/uj;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "GoogleApiClientConnecting"

    const-string v2, "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect."

    new-instance v3, Ljava/lang/Exception;

    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    invoke-static {v1, v2, v3}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->e:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->e:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/common/internal/as;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->p:Lcom/google/android/gms/common/internal/as;

    return-object v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 0
    iget v0, p0, Lcom/google/android/gms/internal/tu;->i:I

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/tu;->n:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/google/android/gms/internal/tu;->o:Z

    if-eqz v0, :cond_0

    .line 2000
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/tu;->g:I

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/tu;->i:I

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/d;

    iget-object v3, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v3, v3, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->g()V

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v3, v3, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->v:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/android/gms/internal/uv;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ug;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/ug;-><init>(Lcom/google/android/gms/internal/tu;Ljava/util/ArrayList;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 0
    :cond_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->h()V

    goto :goto_0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/tu;)Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->l()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private g()V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/tu;->g:I

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->l()Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/uj;->f:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->v:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/android/gms/internal/uv;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ua;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/google/android/gms/internal/ua;-><init>(Lcom/google/android/gms/internal/tu;B)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private h()V
    .locals 4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/tu;->g:I

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/tu;->i:I

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/d;

    iget-object v3, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v3, v3, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->i()V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v3, v3, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->v:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/android/gms/internal/uv;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ue;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/ue;-><init>(Lcom/google/android/gms/internal/tu;Ljava/util/ArrayList;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method static synthetic h(Lcom/google/android/gms/internal/tu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->j()V

    return-void
.end method

.method private i()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/uj;->f()V

    invoke-static {}, Lcom/google/android/gms/internal/uv;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/tv;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/tv;-><init>(Lcom/google/android/gms/internal/tu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/tu;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->p:Lcom/google/android/gms/common/internal/as;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/tu;->r:Z

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/xi;->a(Lcom/google/android/gms/common/internal/as;Z)V

    :cond_0
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/tu;->a(Z)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v2, v2, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/c;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/c;->disconnect()V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/tu;->h:Z

    if-eqz v0, :cond_3

    iput-boolean v3, p0, Lcom/google/android/gms/internal/tu;->h:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/tu;->b()V

    :goto_1
    return-void

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->j:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v1, v1, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/internal/ak;->a(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->j:Landroid/os/Bundle;

    goto :goto_2
.end method

.method static synthetic i(Lcom/google/android/gms/internal/tu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->h()V

    return-void
.end method

.method private j()V
    .locals 6

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tu;->n:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/uj;->f:Ljava/util/Set;

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/d;

    iget-object v2, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v2, v2, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v2, v2, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    new-instance v3, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v4, 0x11

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic j(Lcom/google/android/gms/internal/tu;)Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->e()Z

    move-result v0

    return v0
.end method

.method private k()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->v:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method static synthetic k(Lcom/google/android/gms/internal/tu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->f()V

    return-void
.end method

.method private l()Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashSet;

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->s:Lcom/google/android/gms/common/internal/w;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/w;->c()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->s:Lcom/google/android/gms/common/internal/w;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/w;->e()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a;

    iget-object v4, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v4, v4, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->c()Lcom/google/android/gms/common/api/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/internal/x;

    iget-object v0, v0, Lcom/google/android/gms/common/internal/x;->a:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method static synthetic l(Lcom/google/android/gms/internal/tu;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->g()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/to;)Lcom/google/android/gms/internal/to;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/google/android/gms/common/api/c;",
            "R::",
            "Lcom/google/android/gms/common/api/r;",
            "T:",
            "Lcom/google/android/gms/internal/to",
            "<TR;TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->b:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final a()V
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ak;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iput-boolean v6, p0, Lcom/google/android/gms/internal/tu;->h:Z

    iput-boolean v6, p0, Lcom/google/android/gms/internal/tu;->n:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/tu;->e:Lcom/google/android/gms/common/ConnectionResult;

    iput v6, p0, Lcom/google/android/gms/internal/tu;->g:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/tu;->m:I

    iput-boolean v6, p0, Lcom/google/android/gms/internal/tu;->o:Z

    iput-boolean v6, p0, Lcom/google/android/gms/internal/tu;->q:Z

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->t:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v1, v1, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->c()Lcom/google/android/gms/common/api/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/api/c;

    iget-object v2, p0, Lcom/google/android/gms/internal/tu;->t:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->a()Lcom/google/android/gms/common/api/b;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/c;->zzlN()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    iput-boolean v4, p0, Lcom/google/android/gms/internal/tu;->n:Z

    iget v4, p0, Lcom/google/android/gms/internal/tu;->m:I

    if-ge v2, v4, :cond_0

    iput v2, p0, Lcom/google/android/gms/internal/tu;->m:I

    :cond_0
    if-eqz v2, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/tu;->k:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/a;->c()Lcom/google/android/gms/common/api/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v4, Lcom/google/android/gms/internal/ub;

    invoke-direct {v4, p0, v0, v2}, Lcom/google/android/gms/internal/ub;-><init>(Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/api/a;I)V

    invoke-interface {v7, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/tu;->n:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->s:Lcom/google/android/gms/common/internal/w;

    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    .line 1000
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    .line 0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/w;->a(Ljava/lang/Integer;)V

    new-instance v5, Lcom/google/android/gms/internal/uf;

    invoke-direct {v5, p0, v6}, Lcom/google/android/gms/internal/uf;-><init>(Lcom/google/android/gms/internal/tu;B)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->u:Lcom/google/android/gms/common/api/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/tu;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/uj;->a()Landroid/os/Looper;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/tu;->s:Lcom/google/android/gms/common/internal/w;

    iget-object v4, p0, Lcom/google/android/gms/internal/tu;->s:Lcom/google/android/gms/common/internal/w;

    invoke-virtual {v4}, Lcom/google/android/gms/common/internal/w;->h()Lcom/google/android/gms/internal/xj;

    move-result-object v4

    move-object v6, v5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/common/api/b;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/w;Ljava/lang/Object;Lcom/google/android/gms/common/api/k;Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/c;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/xi;

    iput-object v0, p0, Lcom/google/android/gms/internal/tu;->l:Lcom/google/android/gms/internal/xi;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/tu;->i:I

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->v:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/android/gms/internal/uv;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/uc;

    invoke-direct {v2, p0, v7}, Lcom/google/android/gms/internal/uc;-><init>(Lcom/google/android/gms/internal/tu;Ljava/util/Map;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(I)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->j:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->i()V

    goto :goto_0
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/ConnectionResult;",
            "Lcom/google/android/gms/common/api/a",
            "<*>;I)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/tu;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/tu;->b(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->i()V

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ut;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ut;->f()V

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/uj;->d()V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->e:Lcom/google/android/gms/common/ConnectionResult;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iput-boolean v2, p0, Lcom/google/android/gms/internal/tu;->h:Z

    :goto_1
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/tu;->k()V

    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/tu;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/tu;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->a:Lcom/google/android/gms/common/internal/ak;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/ak;->a()V

    goto :goto_1
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/tu;->h:Z

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    const-string v0, "CONNECTING"

    return-object v0
.end method
