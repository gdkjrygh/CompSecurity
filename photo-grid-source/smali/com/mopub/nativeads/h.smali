.class final Lcom/mopub/nativeads/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/mopub/nativeads/ba;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/ax",
            "<",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;>;"
        }
    .end annotation
.end field

.field private final d:Landroid/os/Handler;

.field private final e:Lcom/mopub/nativeads/j;

.field private final f:Lcom/mopub/nativeads/bd;

.field private g:Lcom/mopub/nativeads/bf;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 6

    .prologue
    .line 45
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    new-instance v2, Ljava/util/WeakHashMap;

    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    new-instance v3, Lcom/mopub/nativeads/bd;

    invoke-direct {v3}, Lcom/mopub/nativeads/bd;-><init>()V

    new-instance v4, Lcom/mopub/nativeads/ba;

    invoke-direct {v4, p1}, Lcom/mopub/nativeads/ba;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/os/Handler;

    invoke-direct {v5}, Landroid/os/Handler;-><init>()V

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/mopub/nativeads/h;-><init>(Ljava/util/Map;Ljava/util/Map;Lcom/mopub/nativeads/bd;Lcom/mopub/nativeads/ba;Landroid/os/Handler;)V

    .line 50
    return-void
.end method

.method private constructor <init>(Ljava/util/Map;Ljava/util/Map;Lcom/mopub/nativeads/bd;Lcom/mopub/nativeads/ba;Landroid/os/Handler;)V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/ax",
            "<",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;>;",
            "Lcom/mopub/nativeads/bd;",
            "Lcom/mopub/nativeads/ba;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/mopub/nativeads/h;->b:Ljava/util/Map;

    .line 59
    iput-object p2, p0, Lcom/mopub/nativeads/h;->c:Ljava/util/Map;

    .line 60
    iput-object p3, p0, Lcom/mopub/nativeads/h;->f:Lcom/mopub/nativeads/bd;

    .line 61
    iput-object p4, p0, Lcom/mopub/nativeads/h;->a:Lcom/mopub/nativeads/ba;

    .line 63
    new-instance v0, Lcom/mopub/nativeads/i;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/i;-><init>(Lcom/mopub/nativeads/h;)V

    iput-object v0, p0, Lcom/mopub/nativeads/h;->g:Lcom/mopub/nativeads/bf;

    .line 92
    iget-object v0, p0, Lcom/mopub/nativeads/h;->a:Lcom/mopub/nativeads/ba;

    iget-object v1, p0, Lcom/mopub/nativeads/h;->g:Lcom/mopub/nativeads/bf;

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/ba;->a(Lcom/mopub/nativeads/bf;)V

    .line 94
    iput-object p5, p0, Lcom/mopub/nativeads/h;->d:Landroid/os/Handler;

    .line 95
    new-instance v0, Lcom/mopub/nativeads/j;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/j;-><init>(Lcom/mopub/nativeads/h;)V

    iput-object v0, p0, Lcom/mopub/nativeads/h;->e:Lcom/mopub/nativeads/j;

    .line 96
    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/h;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/mopub/nativeads/h;->b:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/nativeads/h;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/mopub/nativeads/h;->c:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    .line 135
    .line 2128
    iget-object v0, p0, Lcom/mopub/nativeads/h;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 2129
    iget-object v0, p0, Lcom/mopub/nativeads/h;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 2130
    iget-object v0, p0, Lcom/mopub/nativeads/h;->a:Lcom/mopub/nativeads/ba;

    invoke-virtual {v0}, Lcom/mopub/nativeads/ba;->a()V

    .line 2131
    iget-object v0, p0, Lcom/mopub/nativeads/h;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 136
    iget-object v0, p0, Lcom/mopub/nativeads/h;->a:Lcom/mopub/nativeads/ba;

    invoke-virtual {v0}, Lcom/mopub/nativeads/ba;->b()V

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/nativeads/h;->g:Lcom/mopub/nativeads/bf;

    .line 138
    return-void
.end method

.method final a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/mopub/nativeads/h;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1151
    iget-object v0, p0, Lcom/mopub/nativeads/h;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    iget-object v0, p0, Lcom/mopub/nativeads/h;->a:Lcom/mopub/nativeads/ba;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/ba;->a(Landroid/view/View;)V

    .line 122
    return-void
.end method

.method final a(Landroid/view/View;Lcom/mopub/nativeads/NativeResponse;)V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/mopub/nativeads/h;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_1

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 108
    :cond_1
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/h;->a(Landroid/view/View;)V

    .line 110
    invoke-virtual {p2}, Lcom/mopub/nativeads/NativeResponse;->getRecordedImpression()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/mopub/nativeads/NativeResponse;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/mopub/nativeads/h;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iget-object v0, p0, Lcom/mopub/nativeads/h;->a:Lcom/mopub/nativeads/ba;

    invoke-virtual {p2}, Lcom/mopub/nativeads/NativeResponse;->getImpressionMinPercentageViewed()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/mopub/nativeads/ba;->a(Landroid/view/View;I)V

    goto :goto_0
.end method

.method final b()V
    .locals 4
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 143
    iget-object v0, p0, Lcom/mopub/nativeads/h;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    :goto_0
    return-void

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/h;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/nativeads/h;->e:Lcom/mopub/nativeads/j;

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
