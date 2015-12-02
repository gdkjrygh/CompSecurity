.class public Lcom/facebook/ads/internal/h;
.super Lcom/facebook/ads/internal/b/a;

# interfaces
.implements Lcom/facebook/ads/internal/server/a$a;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/ads/internal/server/a;

.field private final f:Landroid/os/Handler;

.field private final g:Ljava/lang/Runnable;

.field private final h:Ljava/lang/Runnable;

.field private volatile i:Z

.field private j:Z

.field private volatile k:Z

.field private l:Lcom/facebook/ads/internal/adapters/a;

.field private m:Landroid/view/View;

.field private n:Lcom/facebook/ads/internal/d/b;

.field private o:Lcom/facebook/ads/internal/d/d;

.field private p:Lcom/facebook/ads/internal/e;

.field private q:Lcom/facebook/ads/internal/c;

.field private r:Lcom/facebook/ads/AdSize;

.field private s:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/facebook/ads/internal/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/h;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/ads/internal/e;Lcom/facebook/ads/AdSize;Lcom/facebook/ads/internal/c;I)V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/ads/internal/b/a;-><init>()V

    iput-object p1, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/ads/internal/h;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/ads/internal/h;->p:Lcom/facebook/ads/internal/e;

    iput-object p4, p0, Lcom/facebook/ads/internal/h;->r:Lcom/facebook/ads/AdSize;

    iput-object p5, p0, Lcom/facebook/ads/internal/h;->q:Lcom/facebook/ads/internal/c;

    iput p6, p0, Lcom/facebook/ads/internal/h;->s:I

    new-instance v0, Lcom/facebook/ads/internal/server/a;

    invoke-direct {v0}, Lcom/facebook/ads/internal/server/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/ads/internal/h;->e:Lcom/facebook/ads/internal/server/a;

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->e:Lcom/facebook/ads/internal/server/a;

    invoke-virtual {v0, p0}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/server/a$a;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    new-instance v0, Lcom/facebook/ads/internal/h$1;

    invoke-direct {v0, p0}, Lcom/facebook/ads/internal/h$1;-><init>(Lcom/facebook/ads/internal/h;)V

    iput-object v0, p0, Lcom/facebook/ads/internal/h;->g:Ljava/lang/Runnable;

    new-instance v0, Lcom/facebook/ads/internal/h$2;

    invoke-direct {v0, p0}, Lcom/facebook/ads/internal/h$2;-><init>(Lcom/facebook/ads/internal/h;)V

    iput-object v0, p0, Lcom/facebook/ads/internal/h;->h:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/h;Landroid/view/View;)Landroid/view/View;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/h;->m:Landroid/view/View;

    return-object p1
.end method

.method private a(Lcom/facebook/ads/internal/adapters/a;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/facebook/ads/internal/adapters/a;->b()V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/h;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->g()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/ads/internal/h;->a(Lcom/facebook/ads/internal/adapters/a;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/h;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/ads/internal/h;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/a;)Lcom/facebook/ads/internal/adapters/a;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/h;->l:Lcom/facebook/ads/internal/adapters/a;

    return-object p1
.end method

.method static synthetic b(Lcom/facebook/ads/internal/h;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->i()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/ads/internal/h;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->h()V

    return-void
.end method

.method static synthetic d(Lcom/facebook/ads/internal/h;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->e()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/ads/internal/h;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Adapter listener must be called on the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/adapters/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->l:Lcom/facebook/ads/internal/adapters/a;

    return-object v0
.end method

.method private f()Lcom/facebook/ads/internal/server/AdPlacementType;
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->r:Lcom/facebook/ads/AdSize;

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/server/AdPlacementType;->NATIVE:Lcom/facebook/ads/internal/server/AdPlacementType;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->r:Lcom/facebook/ads/AdSize;

    sget-object v1, Lcom/facebook/ads/AdSize;->INTERSTITIAL:Lcom/facebook/ads/AdSize;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/facebook/ads/internal/server/AdPlacementType;->INTERSTITIAL:Lcom/facebook/ads/internal/server/AdPlacementType;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/facebook/ads/internal/server/AdPlacementType;->BANNER:Lcom/facebook/ads/internal/server/AdPlacementType;

    goto :goto_0
.end method

.method private g()V
    .locals 8

    new-instance v0, Lcom/facebook/ads/internal/d/d;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/ads/internal/h;->r:Lcom/facebook/ads/AdSize;

    iget-object v4, p0, Lcom/facebook/ads/internal/h;->p:Lcom/facebook/ads/internal/e;

    iget-object v5, p0, Lcom/facebook/ads/internal/h;->q:Lcom/facebook/ads/internal/c;

    iget v6, p0, Lcom/facebook/ads/internal/h;->s:I

    iget-object v7, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    invoke-static {v7}, Lcom/facebook/ads/e;->a(Landroid/content/Context;)Z

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/ads/internal/d/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/ads/AdSize;Lcom/facebook/ads/internal/e;Lcom/facebook/ads/internal/c;IZ)V

    iput-object v0, p0, Lcom/facebook/ads/internal/h;->o:Lcom/facebook/ads/internal/d/d;

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->e:Lcom/facebook/ads/internal/server/a;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->o:Lcom/facebook/ads/internal/d/d;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ads/internal/server/a;->a(Landroid/content/Context;Lcom/facebook/ads/internal/d/d;)V

    return-void
.end method

.method static synthetic g(Lcom/facebook/ads/internal/h;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/ads/internal/h;->k:Z

    return v0
.end method

.method static synthetic h(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method private h()V
    .locals 8

    const-wide/16 v6, 0x2710

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->n:Lcom/facebook/ads/internal/d/b;

    invoke-virtual {v1}, Lcom/facebook/ads/internal/d/b;->b()Lcom/facebook/ads/internal/d/a;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    sget-object v1, Lcom/facebook/ads/internal/AdErrorType;->NO_FILL:Lcom/facebook/ads/internal/AdErrorType;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/a;->a(Lcom/facebook/ads/internal/b;)V

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->i()V

    :goto_0
    return-void

    :cond_0
    iget-object v3, v2, Lcom/facebook/ads/internal/d/a;->b:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/facebook/ads/internal/d/b;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/c;->a()Lcom/facebook/ads/internal/server/AdPlacementType;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/ads/internal/adapters/m;->a(Ljava/lang/String;Lcom/facebook/ads/internal/server/AdPlacementType;)Lcom/facebook/ads/internal/adapters/a;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/facebook/ads/internal/h;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Adapter does not exist: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->h()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->f()Lcom/facebook/ads/internal/server/AdPlacementType;

    move-result-object v3

    invoke-interface {v0}, Lcom/facebook/ads/internal/adapters/a;->a()Lcom/facebook/ads/internal/server/AdPlacementType;

    move-result-object v4

    if-eq v3, v4, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    sget-object v1, Lcom/facebook/ads/internal/AdErrorType;->INTERNAL_ERROR:Lcom/facebook/ads/internal/AdErrorType;

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/a;->a(Lcom/facebook/ads/internal/b;)V

    goto :goto_0

    :cond_2
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1}, Lcom/facebook/ads/internal/d/b;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v1

    const-string/jumbo v4, "data"

    iget-object v2, v2, Lcom/facebook/ads/internal/d/a;->c:Lorg/json/JSONObject;

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "definition"

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->o:Lcom/facebook/ads/internal/d/d;

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    sget-object v2, Lcom/facebook/ads/internal/AdErrorType;->UNKNOWN_ERROR:Lcom/facebook/ads/internal/AdErrorType;

    const-string/jumbo v4, "environment is empty"

    invoke-virtual {v2, v4}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/ads/internal/a;->a(Lcom/facebook/ads/internal/b;)V

    :cond_3
    sget-object v1, Lcom/facebook/ads/internal/h$9;->a:[I

    invoke-interface {v0}, Lcom/facebook/ads/internal/adapters/a;->a()Lcom/facebook/ads/internal/server/AdPlacementType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ads/internal/server/AdPlacementType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    sget-object v0, Lcom/facebook/ads/internal/h;->b:Ljava/lang/String;

    const-string/jumbo v1, "attempt unexpected adapter type"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    :pswitch_0
    check-cast v0, Lcom/facebook/ads/internal/adapters/b;

    new-instance v1, Lcom/facebook/ads/internal/h$3;

    invoke-direct {v1, p0, v0}, Lcom/facebook/ads/internal/h$3;-><init>(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/b;)V

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    invoke-virtual {v2, v1, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    iget-object v4, p0, Lcom/facebook/ads/internal/h;->r:Lcom/facebook/ads/AdSize;

    new-instance v5, Lcom/facebook/ads/internal/h$4;

    invoke-direct {v5, p0, v1}, Lcom/facebook/ads/internal/h$4;-><init>(Lcom/facebook/ads/internal/h;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v2, v4, v5, v3}, Lcom/facebook/ads/internal/adapters/b;->a(Landroid/content/Context;Lcom/facebook/ads/AdSize;Lcom/facebook/ads/internal/adapters/c;Ljava/util/Map;)V

    goto/16 :goto_0

    :pswitch_1
    check-cast v0, Lcom/facebook/ads/internal/adapters/e;

    new-instance v1, Lcom/facebook/ads/internal/h$5;

    invoke-direct {v1, p0, v0}, Lcom/facebook/ads/internal/h$5;-><init>(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/e;)V

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    invoke-virtual {v2, v1, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    new-instance v4, Lcom/facebook/ads/internal/h$6;

    invoke-direct {v4, p0, v1}, Lcom/facebook/ads/internal/h$6;-><init>(Lcom/facebook/ads/internal/h;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v2, v4, v3}, Lcom/facebook/ads/internal/adapters/e;->a(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/f;Ljava/util/Map;)V

    goto/16 :goto_0

    :pswitch_2
    check-cast v0, Lcom/facebook/ads/internal/adapters/u;

    new-instance v1, Lcom/facebook/ads/internal/h$7;

    invoke-direct {v1, p0, v0}, Lcom/facebook/ads/internal/h$7;-><init>(Lcom/facebook/ads/internal/h;Lcom/facebook/ads/internal/adapters/u;)V

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    invoke-virtual {v2, v1, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v2, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    new-instance v4, Lcom/facebook/ads/internal/h$8;

    invoke-direct {v4, p0, v1}, Lcom/facebook/ads/internal/h$8;-><init>(Lcom/facebook/ads/internal/h;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v2, v4, v3}, Lcom/facebook/ads/internal/adapters/u;->a(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/v;Ljava/util/Map;)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic i(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method private i()V
    .locals 8

    const-wide/16 v6, 0x3e8

    iget-boolean v0, p0, Lcom/facebook/ads/internal/h;->j:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/ads/internal/h;->i:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->n:Lcom/facebook/ads/internal/d/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/b;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/c;->b()J

    move-result-wide v2

    sget-object v1, Lcom/facebook/ads/internal/h$9;->a:[I

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->f()Lcom/facebook/ads/internal/server/AdPlacementType;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/ads/internal/server/AdPlacementType;->ordinal()I

    move-result v4

    aget v1, v1, v4

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/ads/internal/util/h;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ads/internal/h;->i:Z

    goto :goto_0

    :pswitch_1
    iget-object v1, p0, Lcom/facebook/ads/internal/h;->m:Landroid/view/View;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->c:Landroid/content/Context;

    iget-object v4, p0, Lcom/facebook/ads/internal/h;->m:Landroid/view/View;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/c;->e()I

    move-result v0

    invoke-static {v1, v4, v0}, Lcom/facebook/ads/internal/util/h;->a(Landroid/content/Context;Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic j(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method private j()V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/ads/internal/h;->i:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/ads/internal/h;->i:Z

    goto :goto_0
.end method

.method static synthetic k(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method static synthetic l(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method static synthetic n(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method static synthetic o(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/d/d;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->o:Lcom/facebook/ads/internal/d/d;

    return-object v0
.end method

.method static synthetic p(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method static synthetic q(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method

.method static synthetic r(Lcom/facebook/ads/internal/h;)Lcom/facebook/ads/internal/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/ads/internal/d/c;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->n:Lcom/facebook/ads/internal/d/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->n:Lcom/facebook/ads/internal/d/b;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/b;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/ads/internal/b;)V
    .locals 4

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    invoke-virtual {v0, p1}, Lcom/facebook/ads/internal/a;->a(Lcom/facebook/ads/internal/b;)V

    invoke-virtual {p1}, Lcom/facebook/ads/internal/b;->a()Lcom/facebook/ads/internal/AdErrorType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/AdErrorType;->getErrorCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/facebook/ads/internal/h;->i:Z

    if-nez v1, :cond_1

    const/16 v1, 0x3ea

    if-eq v0, v1, :cond_0

    const/16 v1, 0x3e8

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ads/internal/h;->i:Z

    :cond_1
    return-void
.end method

.method public a(Lcom/facebook/ads/internal/server/d;)V
    .locals 2

    invoke-virtual {p1}, Lcom/facebook/ads/internal/server/d;->b()Lcom/facebook/ads/internal/d/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/b;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "invalid placement in response"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object v0, p0, Lcom/facebook/ads/internal/h;->n:Lcom/facebook/ads/internal/d/b;

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->h()V

    return-void
.end method

.method public b()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->g()V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->l:Lcom/facebook/ads/internal/adapters/a;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "no adapter ready to start"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/ads/internal/h;->k:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ad already started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ads/internal/h;->k:Z

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->l:Lcom/facebook/ads/internal/adapters/a;

    invoke-interface {v0}, Lcom/facebook/ads/internal/adapters/a;->a()Lcom/facebook/ads/internal/server/AdPlacementType;

    move-result-object v0

    sget-object v1, Lcom/facebook/ads/internal/h$9;->a:[I

    invoke-virtual {v0}, Lcom/facebook/ads/internal/server/AdPlacementType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/facebook/ads/internal/h;->b:Ljava/lang/String;

    const-string/jumbo v1, "start unexpected adapter type"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->l:Lcom/facebook/ads/internal/adapters/a;

    check-cast v0, Lcom/facebook/ads/internal/adapters/e;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/e;->c()Z

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->m:Landroid/view/View;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ad is not ready"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    iget-object v1, p0, Lcom/facebook/ads/internal/h;->m:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/a;->a(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->i()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/facebook/ads/internal/h;->l:Lcom/facebook/ads/internal/adapters/a;

    check-cast v0, Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->n()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ad is not ready or already displayed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v1, p0, Lcom/facebook/ads/internal/h;->a:Lcom/facebook/ads/internal/a;

    invoke-virtual {v1, v0}, Lcom/facebook/ads/internal/a;->a(Lcom/facebook/ads/internal/adapters/u;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public d()V
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/ads/internal/h;->k:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/facebook/ads/internal/h;->j()V

    iget-object v0, p0, Lcom/facebook/ads/internal/h;->l:Lcom/facebook/ads/internal/adapters/a;

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/h;->a(Lcom/facebook/ads/internal/adapters/a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/ads/internal/h;->m:Landroid/view/View;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/ads/internal/h;->k:Z

    goto :goto_0
.end method
