.class public Lcom/facebook/ads/internal/adapters/n;
.super Lcom/facebook/ads/internal/adapters/b;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/facebook/ads/internal/f/b;

.field private c:Lcom/facebook/ads/internal/adapters/r;

.field private d:Lcom/facebook/ads/internal/adapters/c;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/facebook/ads/internal/adapters/p;

.field private g:Lcom/facebook/ads/internal/f/a;

.field private h:Landroid/content/Context;

.field private i:J

.field private j:Lcom/facebook/ads/internal/util/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/facebook/ads/internal/adapters/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/adapters/n;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/internal/adapters/b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/adapters/n;J)J
    .locals 1

    iput-wide p1, p0, Lcom/facebook/ads/internal/adapters/n;->i:J

    return-wide p1
.end method

.method static synthetic a(Lcom/facebook/ads/internal/adapters/n;)Lcom/facebook/ads/internal/adapters/c;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->d:Lcom/facebook/ads/internal/adapters/c;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/ads/internal/adapters/n;Lcom/facebook/ads/internal/f/a;)Lcom/facebook/ads/internal/f/a;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/n;->g:Lcom/facebook/ads/internal/f/a;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/ads/internal/adapters/n;Lcom/facebook/ads/internal/util/b$a;)Lcom/facebook/ads/internal/util/b$a;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/n;->j:Lcom/facebook/ads/internal/util/b$a;

    return-object p1
.end method

.method private a(I)V
    .locals 6

    const/4 v5, 0x0

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/ads/internal/adapters/n;->i:J

    iput-object v5, p0, Lcom/facebook/ads/internal/adapters/n;->j:Lcom/facebook/ads/internal/util/b$a;

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->e:Ljava/util/Map;

    const-string/jumbo v1, "data"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/q;->a(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/adapters/q;

    move-result-object v2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->h:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/facebook/ads/internal/util/g;->a(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/i;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->d:Lcom/facebook/ads/internal/adapters/c;

    sget-object v1, Lcom/facebook/ads/c;->b:Lcom/facebook/ads/c;

    invoke-interface {v0, p0, v1}, Lcom/facebook/ads/internal/adapters/c;->a(Lcom/facebook/ads/internal/adapters/b;Lcom/facebook/ads/c;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/facebook/ads/internal/f/b;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->h:Landroid/content/Context;

    new-instance v3, Lcom/facebook/ads/internal/adapters/n$1;

    invoke-direct {v3, p0, v2}, Lcom/facebook/ads/internal/adapters/n$1;-><init>(Lcom/facebook/ads/internal/adapters/n;Lcom/facebook/ads/internal/adapters/q;)V

    invoke-direct {v0, v1, v3, p1}, Lcom/facebook/ads/internal/f/b;-><init>(Landroid/content/Context;Lcom/facebook/ads/internal/f/b$a;I)V

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    new-instance v0, Lcom/facebook/ads/internal/adapters/r;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->h:Landroid/content/Context;

    iget-object v3, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    new-instance v4, Lcom/facebook/ads/internal/adapters/n$2;

    invoke-direct {v4, p0}, Lcom/facebook/ads/internal/adapters/n$2;-><init>(Lcom/facebook/ads/internal/adapters/n;)V

    invoke-direct {v0, v1, v3, v4}, Lcom/facebook/ads/internal/adapters/r;-><init>(Landroid/content/Context;Landroid/webkit/WebView;Lcom/facebook/ads/internal/adapters/k;)V

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->c:Lcom/facebook/ads/internal/adapters/r;

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->c:Lcom/facebook/ads/internal/adapters/r;

    invoke-virtual {v0, v2}, Lcom/facebook/ads/internal/adapters/r;->a(Lcom/facebook/ads/internal/adapters/q;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    invoke-static {}, Lcom/facebook/ads/internal/util/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/facebook/ads/internal/adapters/q;->d()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "text/html"

    const-string/jumbo v4, "utf-8"

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/ads/internal/f/b;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->d:Lcom/facebook/ads/internal/adapters/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->d:Lcom/facebook/ads/internal/adapters/c;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    invoke-interface {v0, p0, v1}, Lcom/facebook/ads/internal/adapters/c;->a(Lcom/facebook/ads/internal/adapters/b;Landroid/view/View;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/ads/internal/adapters/n;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->h:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/ads/internal/adapters/n;)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/ads/internal/adapters/n;->i:J

    return-wide v0
.end method

.method static synthetic d(Lcom/facebook/ads/internal/adapters/n;)Lcom/facebook/ads/internal/util/b$a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->j:Lcom/facebook/ads/internal/util/b$a;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/ads/internal/adapters/n;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/ads/internal/adapters/n;)Lcom/facebook/ads/internal/f/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->g:Lcom/facebook/ads/internal/f/a;

    return-object v0
.end method

.method private e()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->e:Ljava/util/Map;

    const-string/jumbo v1, "definition"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ads/internal/d/c;

    new-instance v1, Lcom/facebook/ads/internal/adapters/p;

    invoke-direct {v1}, Lcom/facebook/ads/internal/adapters/p;-><init>()V

    iput-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->f:Lcom/facebook/ads/internal/adapters/p;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->f:Lcom/facebook/ads/internal/adapters/p;

    iget-object v2, p0, Lcom/facebook/ads/internal/adapters/n;->h:Landroid/content/Context;

    new-instance v3, Lcom/facebook/ads/internal/adapters/n$3;

    invoke-direct {v3, p0, v0}, Lcom/facebook/ads/internal/adapters/n$3;-><init>(Lcom/facebook/ads/internal/adapters/n;Lcom/facebook/ads/internal/d/c;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->e:Ljava/util/Map;

    invoke-virtual {v1, v2, v3, v0}, Lcom/facebook/ads/internal/adapters/p;->a(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/v;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/facebook/ads/AdSize;Lcom/facebook/ads/internal/adapters/c;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/ads/AdSize;",
            "Lcom/facebook/ads/internal/adapters/c;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/n;->h:Landroid/content/Context;

    iput-object p3, p0, Lcom/facebook/ads/internal/adapters/n;->d:Lcom/facebook/ads/internal/adapters/c;

    iput-object p4, p0, Lcom/facebook/ads/internal/adapters/n;->e:Ljava/util/Map;

    sget-object v0, Lcom/facebook/ads/AdSize;->RECTANGLE_HEIGHT_250:Lcom/facebook/ads/AdSize;

    if-ne p2, v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/ads/internal/adapters/n;->e()V

    :goto_0
    return-void

    :cond_0
    const-string/jumbo v0, "definition"

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ads/internal/d/c;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/c;->e()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/adapters/n;->a(I)V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    invoke-static {v0}, Lcom/facebook/ads/internal/util/i;->a(Landroid/webkit/WebView;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/f/b;->destroy()V

    iput-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->b:Lcom/facebook/ads/internal/f/b;

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->g:Lcom/facebook/ads/internal/f/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->g:Lcom/facebook/ads/internal/f/a;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/f/a;->b()V

    iput-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->g:Lcom/facebook/ads/internal/f/a;

    :cond_1
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->f:Lcom/facebook/ads/internal/adapters/p;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->f:Lcom/facebook/ads/internal/adapters/p;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/p;->b()V

    iput-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->f:Lcom/facebook/ads/internal/adapters/p;

    :cond_2
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->c:Lcom/facebook/ads/internal/adapters/r;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->c:Lcom/facebook/ads/internal/adapters/r;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/r;->a()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/n;->f:Lcom/facebook/ads/internal/adapters/p;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "mil"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/n;->f:Lcom/facebook/ads/internal/adapters/p;

    invoke-virtual {v1, v0}, Lcom/facebook/ads/internal/adapters/p;->a(Ljava/util/Map;)V

    goto :goto_0
.end method
