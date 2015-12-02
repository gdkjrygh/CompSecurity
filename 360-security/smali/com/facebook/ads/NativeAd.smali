.class public Lcom/facebook/ads/NativeAd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/facebook/ads/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/ads/NativeAd$d;,
        Lcom/facebook/ads/NativeAd$c;,
        Lcom/facebook/ads/NativeAd$e;,
        Lcom/facebook/ads/NativeAd$MediaCacheFlag;,
        Lcom/facebook/ads/NativeAd$b;,
        Lcom/facebook/ads/NativeAd$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/facebook/ads/internal/c;

.field private static final b:Ljava/lang/String;

.field private static c:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/facebook/ads/NativeAd;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final d:Landroid/content/Context;

.field private final e:Ljava/lang/String;

.field private f:Lcom/facebook/ads/d;

.field private g:Lcom/facebook/ads/f;

.field private h:Lcom/facebook/ads/internal/h;

.field private volatile i:Z

.field private j:Lcom/facebook/ads/internal/adapters/u;

.field private k:Lcom/facebook/ads/internal/d/c;

.field private l:Landroid/view/View;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private n:Landroid/view/View$OnTouchListener;

.field private o:Lcom/facebook/ads/internal/adapters/l;

.field private p:Lcom/facebook/ads/internal/adapters/t;

.field private q:Lcom/facebook/ads/NativeAd$c;

.field private r:Lcom/facebook/ads/NativeAd$d;

.field private s:Lcom/facebook/ads/internal/f/i;

.field private t:Lcom/facebook/ads/NativeAdView$Type;

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/facebook/ads/internal/c;->a:Lcom/facebook/ads/internal/c;

    sput-object v0, Lcom/facebook/ads/NativeAd;->a:Lcom/facebook/ads/internal/c;

    const-class v0, Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/NativeAd;->b:Ljava/lang/String;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/facebook/ads/NativeAd;->c:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/u;Lcom/facebook/ads/internal/d/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/ads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/facebook/ads/NativeAd;->k:Lcom/facebook/ads/internal/d/c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ads/NativeAd;->i:Z

    iput-object p2, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/ads/NativeAd;->m:Ljava/util/List;

    iput-object p1, p0, Lcom/facebook/ads/NativeAd;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/ads/NativeAd;->e:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/d;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->f:Lcom/facebook/ads/d;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/ads/NativeAd;Lcom/facebook/ads/internal/adapters/u;)Lcom/facebook/ads/internal/adapters/u;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    return-object p1
.end method

.method public static a(Lcom/facebook/ads/NativeAd$a;Landroid/widget/ImageView;)V
    .locals 4

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lcom/facebook/ads/internal/util/l;

    invoke-direct {v0, p1}, Lcom/facebook/ads/internal/util/l;-><init>(Landroid/widget/ImageView;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/util/l;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    check-cast p2, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/facebook/ads/NativeAd;->a(Ljava/util/List;Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/internal/h;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    return-object v0
.end method

.method private b(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->q:Lcom/facebook/ads/NativeAd$c;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->q:Lcom/facebook/ads/NativeAd$c;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method static synthetic c(Lcom/facebook/ads/NativeAd;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/ads/NativeAd;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/ads/NativeAd;->p()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/internal/adapters/u;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/NativeAdView$Type;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->t:Lcom/facebook/ads/NativeAdView$Type;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/internal/adapters/t;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->p:Lcom/facebook/ads/internal/adapters/t;

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/ads/NativeAd;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/ads/NativeAd;->u:Z

    return v0
.end method

.method static synthetic i(Lcom/facebook/ads/NativeAd;)Lcom/facebook/ads/f;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->g:Lcom/facebook/ads/f;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/ads/NativeAd;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    return-object v0
.end method

.method static synthetic k(Lcom/facebook/ads/NativeAd;)Landroid/view/View$OnTouchListener;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->n:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method private o()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method private p()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/ads/NativeAd$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ads/NativeAd$d;-><init>(Lcom/facebook/ads/NativeAd;Lcom/facebook/ads/NativeAd$1;)V

    iput-object v0, p0, Lcom/facebook/ads/NativeAd;->r:Lcom/facebook/ads/NativeAd$d;

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->r:Lcom/facebook/ads/NativeAd$d;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd$d;->a()V

    new-instance v0, Lcom/facebook/ads/internal/adapters/t;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->d:Landroid/content/Context;

    new-instance v2, Lcom/facebook/ads/NativeAd$4;

    invoke-direct {v2, p0}, Lcom/facebook/ads/NativeAd$4;-><init>(Lcom/facebook/ads/NativeAd;)V

    iget-object v3, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/ads/internal/adapters/t;-><init>(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/k;Lcom/facebook/ads/internal/adapters/u;)V

    iput-object v0, p0, Lcom/facebook/ads/NativeAd;->p:Lcom/facebook/ads/internal/adapters/t;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Lcom/facebook/ads/NativeAd$MediaCacheFlag;->NONE:Lcom/facebook/ads/NativeAd$MediaCacheFlag;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/ads/NativeAd;->a(Ljava/util/EnumSet;)V

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/facebook/ads/NativeAd;->a(Ljava/util/List;Landroid/view/View;)V

    invoke-virtual {p0, p1, v0}, Lcom/facebook/ads/NativeAd;->a(Landroid/view/View;Ljava/util/List;)V

    return-void
.end method

.method public a(Landroid/view/View;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "Must provide a View"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "Invalid set of clickable views"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/facebook/ads/NativeAd;->b:Ljava/lang/String;

    const-string/jumbo v1, "Ad not loaded"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/facebook/ads/NativeAd;->b:Ljava/lang/String;

    const-string/jumbo v1, "Native Ad was already registered with a View. Auto unregistering and proceeding."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->n()V

    :cond_4
    sget-object v0, Lcom/facebook/ads/NativeAd;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/facebook/ads/NativeAd;->b:Ljava/lang/String;

    const-string/jumbo v1, "View already registered with a NativeAd. Auto unregistering and proceeding."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/facebook/ads/NativeAd;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->n()V

    :cond_5
    new-instance v0, Lcom/facebook/ads/NativeAd$c;

    invoke-direct {v0, p0, v3}, Lcom/facebook/ads/NativeAd$c;-><init>(Lcom/facebook/ads/NativeAd;Lcom/facebook/ads/NativeAd$1;)V

    iput-object v0, p0, Lcom/facebook/ads/NativeAd;->q:Lcom/facebook/ads/NativeAd$c;

    iput-object p1, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_6

    new-instance v0, Lcom/facebook/ads/internal/f/i;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/facebook/ads/NativeAd$2;

    invoke-direct {v2, p0}, Lcom/facebook/ads/NativeAd$2;-><init>(Lcom/facebook/ads/NativeAd;)V

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/internal/f/i;-><init>(Landroid/content/Context;Lcom/facebook/ads/internal/f/h;)V

    iput-object v0, p0, Lcom/facebook/ads/NativeAd;->s:Lcom/facebook/ads/internal/f/i;

    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->s:Lcom/facebook/ads/internal/f/i;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_6
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/facebook/ads/NativeAd;->b(Landroid/view/View;)V

    goto :goto_1

    :cond_7
    new-instance v0, Lcom/facebook/ads/internal/adapters/t;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->d:Landroid/content/Context;

    new-instance v2, Lcom/facebook/ads/NativeAd$e;

    invoke-direct {v2, p0, v3}, Lcom/facebook/ads/NativeAd$e;-><init>(Lcom/facebook/ads/NativeAd;Lcom/facebook/ads/NativeAd$1;)V

    iget-object v3, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/ads/internal/adapters/t;-><init>(Landroid/content/Context;Lcom/facebook/ads/internal/adapters/k;Lcom/facebook/ads/internal/adapters/u;)V

    iput-object v0, p0, Lcom/facebook/ads/NativeAd;->p:Lcom/facebook/ads/internal/adapters/t;

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->k:Lcom/facebook/ads/internal/d/c;

    if-eqz v1, :cond_9

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->k:Lcom/facebook/ads/internal/d/c;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/c;->e()I

    move-result v0

    :cond_8
    :goto_2
    new-instance v1, Lcom/facebook/ads/internal/adapters/l;

    iget-object v2, p0, Lcom/facebook/ads/NativeAd;->d:Landroid/content/Context;

    iget-object v3, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    new-instance v4, Lcom/facebook/ads/NativeAd$3;

    invoke-direct {v4, p0}, Lcom/facebook/ads/NativeAd$3;-><init>(Lcom/facebook/ads/NativeAd;)V

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/facebook/ads/internal/adapters/l;-><init>(Landroid/content/Context;Landroid/view/View;ILcom/facebook/ads/internal/adapters/l$a;)V

    iput-object v1, p0, Lcom/facebook/ads/NativeAd;->o:Lcom/facebook/ads/internal/adapters/l;

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->o:Lcom/facebook/ads/internal/adapters/l;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/l;->a()V

    sget-object v0, Lcom/facebook/ads/NativeAd;->c:Ljava/util/WeakHashMap;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_9
    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    invoke-virtual {v1}, Lcom/facebook/ads/internal/h;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/h;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ads/internal/d/c;->e()I

    move-result v0

    goto :goto_2
.end method

.method public a(Lcom/facebook/ads/d;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/NativeAd;->f:Lcom/facebook/ads/d;

    return-void
.end method

.method public a(Ljava/util/EnumSet;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/ads/NativeAd$MediaCacheFlag;",
            ">;)V"
        }
    .end annotation

    const/4 v6, 0x1

    iget-boolean v0, p0, Lcom/facebook/ads/NativeAd;->i:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "loadAd cannot be called more than once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-boolean v6, p0, Lcom/facebook/ads/NativeAd;->i:Z

    sget-object v3, Lcom/facebook/ads/internal/e;->i:Lcom/facebook/ads/internal/e;

    new-instance v0, Lcom/facebook/ads/internal/h;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/facebook/ads/NativeAd;->e:Ljava/lang/String;

    const/4 v4, 0x0

    sget-object v5, Lcom/facebook/ads/NativeAd;->a:Lcom/facebook/ads/internal/c;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/ads/internal/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/ads/internal/e;Lcom/facebook/ads/AdSize;Lcom/facebook/ads/internal/c;I)V

    iput-object v0, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    new-instance v1, Lcom/facebook/ads/NativeAd$1;

    invoke-direct {v1, p0, p1}, Lcom/facebook/ads/NativeAd$1;-><init>(Lcom/facebook/ads/NativeAd;Ljava/util/EnumSet;)V

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/h;->a(Lcom/facebook/ads/internal/a;)V

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/h;->b()V

    return-void
.end method

.method public b()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->r:Lcom/facebook/ads/NativeAd$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->r:Lcom/facebook/ads/NativeAd$d;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd$d;->b()V

    iput-object v1, p0, Lcom/facebook/ads/NativeAd;->r:Lcom/facebook/ads/NativeAd$d;

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/h;->d()V

    iput-object v1, p0, Lcom/facebook/ads/NativeAd;->h:Lcom/facebook/ads/internal/h;

    :cond_1
    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Lcom/facebook/ads/NativeAd$a;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->d()Lcom/facebook/ads/NativeAd$a;

    move-result-object v0

    goto :goto_0
.end method

.method public e()Lcom/facebook/ads/NativeAd$a;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v0

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public j()Lcom/facebook/ads/NativeAd$b;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->j()Lcom/facebook/ads/NativeAd$b;

    move-result-object v0

    goto :goto_0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->k()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public l()Lcom/facebook/ads/NativeAd$a;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->l()Lcom/facebook/ads/NativeAd$a;

    move-result-object v0

    goto :goto_0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/ads/NativeAd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->j:Lcom/facebook/ads/internal/adapters/u;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/u;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public n()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/facebook/ads/NativeAd;->c:Ljava/util/WeakHashMap;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/facebook/ads/NativeAd;->c:Ljava/util/WeakHashMap;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "View not registered with this NativeAd"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->s:Lcom/facebook/ads/internal/f/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->s:Lcom/facebook/ads/internal/f/i;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iput-object v2, p0, Lcom/facebook/ads/NativeAd;->s:Lcom/facebook/ads/internal/f/i;

    :cond_3
    sget-object v0, Lcom/facebook/ads/NativeAd;->c:Ljava/util/WeakHashMap;

    iget-object v1, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/facebook/ads/NativeAd;->o()V

    iput-object v2, p0, Lcom/facebook/ads/NativeAd;->l:Landroid/view/View;

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->o:Lcom/facebook/ads/internal/adapters/l;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/facebook/ads/NativeAd;->o:Lcom/facebook/ads/internal/adapters/l;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/l;->b()V

    iput-object v2, p0, Lcom/facebook/ads/NativeAd;->o:Lcom/facebook/ads/internal/adapters/l;

    :cond_4
    iput-object v2, p0, Lcom/facebook/ads/NativeAd;->p:Lcom/facebook/ads/internal/adapters/t;

    goto :goto_0
.end method
