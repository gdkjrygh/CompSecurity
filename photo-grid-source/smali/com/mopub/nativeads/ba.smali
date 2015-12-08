.class final Lcom/mopub/nativeads/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/view/ViewTreeObserver$OnPreDrawListener;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field

.field final b:Ljava/lang/ref/WeakReference;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private d:J

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/bc;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/mopub/nativeads/bd;

.field private g:Lcom/mopub/nativeads/bf;

.field private final h:Lcom/mopub/nativeads/be;

.field private final i:Landroid/os/Handler;

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 75
    new-instance v0, Ljava/util/WeakHashMap;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    new-instance v1, Lcom/mopub/nativeads/bd;

    invoke-direct {v1}, Lcom/mopub/nativeads/bd;-><init>()V

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/mopub/nativeads/ba;-><init>(Landroid/content/Context;Ljava/util/Map;Lcom/mopub/nativeads/bd;Landroid/os/Handler;)V

    .line 79
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/Map;Lcom/mopub/nativeads/bd;Landroid/os/Handler;)V
    .locals 2
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Lcom/mopub/nativeads/bc;",
            ">;",
            "Lcom/mopub/nativeads/bd;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/mopub/nativeads/ba;->d:J

    .line 86
    iput-object p2, p0, Lcom/mopub/nativeads/ba;->e:Ljava/util/Map;

    .line 87
    iput-object p3, p0, Lcom/mopub/nativeads/ba;->f:Lcom/mopub/nativeads/bd;

    .line 88
    iput-object p4, p0, Lcom/mopub/nativeads/ba;->i:Landroid/os/Handler;

    .line 89
    new-instance v0, Lcom/mopub/nativeads/be;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/be;-><init>(Lcom/mopub/nativeads/ba;)V

    iput-object v0, p0, Lcom/mopub/nativeads/ba;->h:Lcom/mopub/nativeads/be;

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/mopub/nativeads/ba;->c:Ljava/util/ArrayList;

    .line 92
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 93
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/mopub/nativeads/ba;->b:Ljava/lang/ref/WeakReference;

    .line 94
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 95
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    .line 96
    const-string v0, "Visibility Tracker was unable to track views because the root view tree observer was not alive"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    .line 108
    :goto_0
    return-void

    .line 99
    :cond_0
    new-instance v1, Lcom/mopub/nativeads/bb;

    invoke-direct {v1, p0}, Lcom/mopub/nativeads/bb;-><init>(Lcom/mopub/nativeads/ba;)V

    iput-object v1, p0, Lcom/mopub/nativeads/ba;->a:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 106
    iget-object v1, p0, Lcom/mopub/nativeads/ba;->a:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/mopub/nativeads/ba;)Z
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/nativeads/ba;->j:Z

    return v0
.end method

.method static synthetic b(Lcom/mopub/nativeads/ba;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->e:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/nativeads/ba;)Lcom/mopub/nativeads/bd;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->f:Lcom/mopub/nativeads/bd;

    return-object v0
.end method

.method static synthetic d(Lcom/mopub/nativeads/ba;)Lcom/mopub/nativeads/bf;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->g:Lcom/mopub/nativeads/bf;

    return-object v0
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 161
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 162
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->i:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 163
    iput-boolean v1, p0, Lcom/mopub/nativeads/ba;->j:Z

    .line 164
    return-void
.end method

.method final a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    return-void
.end method

.method final a(Landroid/view/View;I)V
    .locals 8

    .prologue
    const-wide/16 v4, 0x32

    .line 120
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/bc;

    .line 121
    if-nez v0, :cond_0

    .line 122
    new-instance v0, Lcom/mopub/nativeads/bc;

    invoke-direct {v0}, Lcom/mopub/nativeads/bc;-><init>()V

    .line 123
    iget-object v1, p0, Lcom/mopub/nativeads/ba;->e:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    invoke-virtual {p0}, Lcom/mopub/nativeads/ba;->c()V

    .line 126
    :cond_0
    iput p2, v0, Lcom/mopub/nativeads/bc;->a:I

    .line 127
    iget-wide v2, p0, Lcom/mopub/nativeads/ba;->d:J

    iput-wide v2, v0, Lcom/mopub/nativeads/bc;->b:J

    .line 130
    iget-wide v0, p0, Lcom/mopub/nativeads/ba;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/mopub/nativeads/ba;->d:J

    .line 131
    iget-wide v0, p0, Lcom/mopub/nativeads/ba;->d:J

    rem-long/2addr v0, v4

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 132
    iget-wide v0, p0, Lcom/mopub/nativeads/ba;->d:J

    sub-long v2, v0, v4

    .line 1138
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    .line 1139
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/bc;

    iget-wide v6, v0, Lcom/mopub/nativeads/bc;->b:J

    cmp-long v0, v6, v2

    if-gez v0, :cond_1

    .line 1140
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->c:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1144
    :cond_2
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1145
    invoke-virtual {p0, v0}, Lcom/mopub/nativeads/ba;->a(Landroid/view/View;)V

    goto :goto_1

    .line 1147
    :cond_3
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 134
    :cond_4
    return-void
.end method

.method final a(Lcom/mopub/nativeads/bf;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/mopub/nativeads/ba;->g:Lcom/mopub/nativeads/bf;

    .line 113
    return-void
.end method

.method final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 170
    invoke-virtual {p0}, Lcom/mopub/nativeads/ba;->a()V

    .line 171
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 172
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/mopub/nativeads/ba;->a:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-eqz v1, :cond_1

    .line 173
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 175
    iget-object v1, p0, Lcom/mopub/nativeads/ba;->a:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 177
    :cond_0
    iput-object v2, p0, Lcom/mopub/nativeads/ba;->a:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    .line 179
    :cond_1
    iput-object v2, p0, Lcom/mopub/nativeads/ba;->g:Lcom/mopub/nativeads/bf;

    .line 180
    return-void
.end method

.method final c()V
    .locals 4

    .prologue
    .line 185
    iget-boolean v0, p0, Lcom/mopub/nativeads/ba;->j:Z

    if-eqz v0, :cond_0

    .line 191
    :goto_0
    return-void

    .line 189
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/ba;->j:Z

    .line 190
    iget-object v0, p0, Lcom/mopub/nativeads/ba;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/nativeads/ba;->h:Lcom/mopub/nativeads/be;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
