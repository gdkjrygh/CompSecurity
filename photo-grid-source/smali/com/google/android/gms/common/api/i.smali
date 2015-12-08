.class public final Lcom/google/android/gms/common/api/i;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/accounts/Account;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Landroid/view/View;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Lcom/google/android/gms/common/internal/x;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Landroid/content/Context;

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/common/api/a",
            "<*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private j:Landroid/support/v4/app/FragmentActivity;

.field private k:I

.field private l:Lcom/google/android/gms/common/api/l;

.field private m:Landroid/os/Looper;

.field private n:Lcom/google/android/gms/common/b;

.field private o:Lcom/google/android/gms/common/api/b;
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

.field private final p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/k;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/api/l;",
            ">;"
        }
    .end annotation
.end field

.field private r:Lcom/google/android/gms/internal/xj;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->b:Ljava/util/Set;

    new-instance v0, Lcom/google/android/gms/internal/vr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->g:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/vr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->i:Ljava/util/Map;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/common/api/i;->k:I

    invoke-static {}, Lcom/google/android/gms/common/b;->a()Lcom/google/android/gms/common/b;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->n:Lcom/google/android/gms/common/b;

    sget-object v0, Lcom/google/android/gms/internal/xe;->c:Lcom/google/android/gms/common/api/b;

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->o:Lcom/google/android/gms/common/api/b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->p:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->q:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/google/android/gms/common/api/i;->h:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->m:Landroid/os/Looper;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->e:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/common/api/i;)Landroid/support/v4/app/FragmentActivity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->j:Landroid/support/v4/app/FragmentActivity;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/internal/uz;Lcom/google/android/gms/common/api/h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/internal/uz;Lcom/google/android/gms/common/api/h;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/uz;Lcom/google/android/gms/common/api/h;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/common/api/i;->k:I

    iget-object v1, p0, Lcom/google/android/gms/common/api/i;->l:Lcom/google/android/gms/common/api/l;

    invoke-virtual {p1, v0, p2, v1}, Lcom/google/android/gms/internal/uz;->a(ILcom/google/android/gms/common/api/h;Lcom/google/android/gms/common/api/l;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/a;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a",
            "<+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/common/api/i;"
        }
    .end annotation

    .prologue
    .line 0
    const-string v0, "Api must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->i:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->b:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/a;->a()Lcom/google/android/gms/common/api/b;

    .line 1000
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 0
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final a()Lcom/google/android/gms/common/internal/w;
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->i:Ljava/util/Map;

    sget-object v1, Lcom/google/android/gms/internal/xe;->g:Lcom/google/android/gms/common/api/a;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->r:Lcom/google/android/gms/internal/xj;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "SignIn.API can\'t be used in conjunction with requestServerAuthCode."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->i:Ljava/util/Map;

    sget-object v1, Lcom/google/android/gms/internal/xe;->g:Lcom/google/android/gms/common/api/a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/xj;

    iput-object v0, p0, Lcom/google/android/gms/common/api/i;->r:Lcom/google/android/gms/internal/xj;

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/internal/w;

    iget-object v1, p0, Lcom/google/android/gms/common/api/i;->a:Landroid/accounts/Account;

    iget-object v2, p0, Lcom/google/android/gms/common/api/i;->b:Ljava/util/Set;

    iget-object v3, p0, Lcom/google/android/gms/common/api/i;->g:Ljava/util/Map;

    iget v4, p0, Lcom/google/android/gms/common/api/i;->c:I

    iget-object v5, p0, Lcom/google/android/gms/common/api/i;->d:Landroid/view/View;

    iget-object v6, p0, Lcom/google/android/gms/common/api/i;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/common/api/i;->f:Ljava/lang/String;

    iget-object v8, p0, Lcom/google/android/gms/common/api/i;->r:Lcom/google/android/gms/internal/xj;

    if-eqz v8, :cond_2

    iget-object v8, p0, Lcom/google/android/gms/common/api/i;->r:Lcom/google/android/gms/internal/xj;

    :goto_1
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/accounts/Account;Ljava/util/Set;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/xj;)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    sget-object v8, Lcom/google/android/gms/internal/xj;->a:Lcom/google/android/gms/internal/xj;

    goto :goto_1
.end method

.method public final b()Lcom/google/android/gms/common/api/h;
    .locals 10

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/common/api/i;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "must call addApi() to add at least one API"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->b(ZLjava/lang/Object;)V

    iget v0, p0, Lcom/google/android/gms/common/api/i;->k:I

    if-ltz v0, :cond_2

    .line 2000
    new-instance v0, Lcom/google/android/gms/internal/uj;

    iget-object v1, p0, Lcom/google/android/gms/common/api/i;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/common/api/i;->m:Landroid/os/Looper;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/i;->a()Lcom/google/android/gms/common/internal/w;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/common/api/i;->n:Lcom/google/android/gms/common/b;

    iget-object v5, p0, Lcom/google/android/gms/common/api/i;->o:Lcom/google/android/gms/common/api/b;

    iget-object v6, p0, Lcom/google/android/gms/common/api/i;->i:Ljava/util/Map;

    iget-object v7, p0, Lcom/google/android/gms/common/api/i;->p:Ljava/util/ArrayList;

    iget-object v8, p0, Lcom/google/android/gms/common/api/i;->q:Ljava/util/ArrayList;

    iget v9, p0, Lcom/google/android/gms/common/api/i;->k:I

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/uj;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/w;Lcom/google/android/gms/common/b;Lcom/google/android/gms/common/api/b;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/i;->j:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v1}, Lcom/google/android/gms/internal/uz;->a(Landroid/support/v4/app/FragmentActivity;)Lcom/google/android/gms/internal/uz;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/common/api/i;->h:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lcom/google/android/gms/common/api/j;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/h;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 0
    :goto_1
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2000
    :cond_1
    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/internal/uz;Lcom/google/android/gms/common/api/h;)V

    goto :goto_1

    .line 0
    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/uj;

    iget-object v1, p0, Lcom/google/android/gms/common/api/i;->h:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/common/api/i;->m:Landroid/os/Looper;

    invoke-virtual {p0}, Lcom/google/android/gms/common/api/i;->a()Lcom/google/android/gms/common/internal/w;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/common/api/i;->n:Lcom/google/android/gms/common/b;

    iget-object v5, p0, Lcom/google/android/gms/common/api/i;->o:Lcom/google/android/gms/common/api/b;

    iget-object v6, p0, Lcom/google/android/gms/common/api/i;->i:Ljava/util/Map;

    iget-object v7, p0, Lcom/google/android/gms/common/api/i;->p:Ljava/util/ArrayList;

    iget-object v8, p0, Lcom/google/android/gms/common/api/i;->q:Ljava/util/ArrayList;

    const/4 v9, -0x1

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/uj;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/w;Lcom/google/android/gms/common/b;Lcom/google/android/gms/common/api/b;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/ArrayList;I)V

    goto :goto_1
.end method
