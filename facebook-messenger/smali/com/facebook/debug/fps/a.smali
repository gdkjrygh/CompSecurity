.class public Lcom/facebook/debug/fps/a;
.super Ljava/lang/Object;
.source "FPSController.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/debug/fps/k;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/common/executors/a;

.field private final c:Lcom/facebook/debug/fps/b;

.field private final d:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Landroid/app/Activity;",
            "Lcom/facebook/debug/fps/i;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/debug/fps/k;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "UI thread"
    .end annotation
.end field

.field private f:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "UI thread"
    .end annotation
.end field

.field private volatile g:Landroid/app/Activity;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Always set on UI thread. Read on other threads"
    .end annotation
.end field

.field private h:Landroid/app/Activity;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "UiThread"
    .end annotation
.end field

.field private i:Lcom/facebook/debug/fps/c;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "UI thread"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/common/executors/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/debug/fps/k;",
            ">;>;",
            "Lcom/facebook/common/executors/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/facebook/debug/fps/a;->a:Ljavax/inject/a;

    .line 59
    iput-object p2, p0, Lcom/facebook/debug/fps/a;->b:Lcom/facebook/common/executors/a;

    .line 60
    new-instance v0, Lcom/facebook/debug/fps/b;

    invoke-direct {v0, p0}, Lcom/facebook/debug/fps/b;-><init>(Lcom/facebook/debug/fps/a;)V

    iput-object v0, p0, Lcom/facebook/debug/fps/a;->c:Lcom/facebook/debug/fps/b;

    .line 61
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/a/hy;->f()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->h()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/debug/fps/a;->d:Ljava/util/concurrent/ConcurrentMap;

    .line 62
    return-void
.end method

.method static synthetic a(Lcom/facebook/debug/fps/a;Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/debug/fps/a;->g:Landroid/app/Activity;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/debug/fps/a;Lcom/google/common/a/fi;)Lcom/google/common/a/fi;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/debug/fps/a;->e:Lcom/google/common/a/fi;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/debug/fps/a;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->a:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/debug/fps/a;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->g:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/debug/fps/a;Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/debug/fps/a;->h:Landroid/app/Activity;

    return-object p1
.end method

.method static synthetic c(Lcom/facebook/debug/fps/a;)Lcom/google/common/a/fi;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->e:Lcom/google/common/a/fi;

    return-object v0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 106
    invoke-direct {p0}, Lcom/facebook/debug/fps/a;->h()Lcom/google/common/a/fi;

    move-result-object v1

    .line 107
    sget-object v0, Lcom/facebook/debug/fps/k;->ENABLE:Lcom/facebook/debug/fps/k;

    invoke-virtual {v1, v0}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/debug/fps/a;->g:Landroid/app/Activity;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 108
    :goto_0
    if-eqz v0, :cond_2

    .line 109
    invoke-direct {p0}, Lcom/facebook/debug/fps/a;->d()V

    .line 110
    invoke-direct {p0}, Lcom/facebook/debug/fps/a;->f()V

    .line 112
    invoke-virtual {p0}, Lcom/facebook/debug/fps/a;->b()Lcom/facebook/debug/fps/i;

    move-result-object v0

    .line 113
    if-eqz v0, :cond_0

    .line 114
    sget-object v2, Lcom/facebook/debug/fps/k;->ENABLE_RECORD_DATA:Lcom/facebook/debug/fps/k;

    invoke-virtual {v1, v2}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/facebook/debug/fps/i;->setEnableRecordingData(Z)V

    .line 115
    sget-object v2, Lcom/facebook/debug/fps/k;->ENABLE_FRAME_COUNTER:Lcom/facebook/debug/fps/k;

    invoke-virtual {v1, v2}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/facebook/debug/fps/i;->setEnableFrameCounter(Z)V

    .line 116
    sget-object v2, Lcom/facebook/debug/fps/k;->ENABLE_OUTPUT_TO_LOGCAT:Lcom/facebook/debug/fps/k;

    invoke-virtual {v1, v2}, Lcom/google/common/a/fi;->contains(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/debug/fps/i;->setEnableOutputToLogcat(Z)V

    .line 122
    :cond_0
    :goto_1
    return-void

    .line 107
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 119
    :cond_2
    invoke-direct {p0}, Lcom/facebook/debug/fps/a;->g()V

    .line 120
    invoke-direct {p0}, Lcom/facebook/debug/fps/a;->e()V

    goto :goto_1
.end method

.method private d()V
    .locals 5

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 126
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->g:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 139
    :goto_0
    return-void

    .line 129
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/debug/fps/a;->b()Lcom/facebook/debug/fps/i;

    move-result-object v0

    .line 130
    if-nez v0, :cond_1

    .line 131
    new-instance v0, Lcom/facebook/debug/fps/i;

    iget-object v1, p0, Lcom/facebook/debug/fps/a;->g:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/facebook/debug/fps/i;-><init>(Landroid/content/Context;)V

    .line 132
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x2bc

    const/16 v3, 0x64

    const/16 v4, 0x30

    invoke-direct {v1, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 134
    iget-object v2, p0, Lcom/facebook/debug/fps/a;->g:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Landroid/view/Window;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    iget-object v1, p0, Lcom/facebook/debug/fps/a;->d:Ljava/util/concurrent/ConcurrentMap;

    iget-object v2, p0, Lcom/facebook/debug/fps/a;->g:Landroid/app/Activity;

    invoke-interface {v1, v2, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/debug/fps/i;->setVisibility(I)V

    .line 138
    invoke-virtual {v0}, Lcom/facebook/debug/fps/i;->bringToFront()V

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/debug/fps/a;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/debug/fps/a;->c()V

    return-void
.end method

.method static synthetic e(Lcom/facebook/debug/fps/a;)Lcom/google/common/a/fi;
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/debug/fps/a;->h()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 142
    invoke-virtual {p0}, Lcom/facebook/debug/fps/a;->b()Lcom/facebook/debug/fps/i;

    move-result-object v0

    .line 143
    if-eqz v0, :cond_0

    .line 144
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/facebook/debug/fps/i;->setVisibility(I)V

    .line 146
    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/facebook/debug/fps/a;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->d:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 173
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->i:Lcom/facebook/debug/fps/c;

    if-nez v0, :cond_0

    .line 174
    new-instance v0, Lcom/facebook/debug/fps/c;

    invoke-direct {v0, p0}, Lcom/facebook/debug/fps/c;-><init>(Lcom/facebook/debug/fps/a;)V

    iput-object v0, p0, Lcom/facebook/debug/fps/a;->i:Lcom/facebook/debug/fps/c;

    .line 175
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->i:Lcom/facebook/debug/fps/c;

    invoke-virtual {v0}, Lcom/facebook/debug/fps/c;->start()V

    .line 177
    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 180
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 181
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->i:Lcom/facebook/debug/fps/c;

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->i:Lcom/facebook/debug/fps/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/facebook/debug/fps/c;->a:Z

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/debug/fps/a;->i:Lcom/facebook/debug/fps/c;

    .line 185
    :cond_0
    return-void
.end method

.method private h()Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/debug/fps/k;",
            ">;"
        }
    .end annotation

    .prologue
    .line 188
    iget-boolean v0, p0, Lcom/facebook/debug/fps/a;->f:Z

    if-eqz v0, :cond_0

    .line 189
    sget-object v0, Lcom/facebook/debug/fps/k;->ENABLE:Lcom/facebook/debug/fps/k;

    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE_RECORD_DATA:Lcom/facebook/debug/fps/k;

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    .line 191
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->e:Lcom/google/common/a/fi;

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/debug/fps/b;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->c:Lcom/facebook/debug/fps/b;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 93
    invoke-virtual {p0}, Lcom/facebook/debug/fps/a;->b()Lcom/facebook/debug/fps/i;

    move-result-object v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {v0, p1}, Lcom/facebook/debug/fps/i;->a(Ljava/lang/String;)V

    .line 97
    :cond_0
    return-void
.end method

.method b()Lcom/facebook/debug/fps/i;
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->h:Landroid/app/Activity;

    if-nez v0, :cond_0

    .line 156
    const/4 v0, 0x0

    .line 158
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/debug/fps/a;->d:Ljava/util/concurrent/ConcurrentMap;

    iget-object v1, p0, Lcom/facebook/debug/fps/a;->h:Landroid/app/Activity;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/fps/i;

    goto :goto_0
.end method
