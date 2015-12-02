.class public Lcom/facebook/orca/d/m;
.super Ljava/lang/Object;
.source "AudioClipPlayerQueue.java"


# instance fields
.field private final a:Landroid/media/AudioManager;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/d/e;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/orca/d/bf;

.field private final d:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/facebook/orca/d/e;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/orca/d/l;

.field private final f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private g:Lcom/facebook/orca/d/e;


# direct methods
.method public constructor <init>(Landroid/media/AudioManager;Ljavax/inject/a;Lcom/facebook/orca/d/bf;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/AudioManager;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/d/e;",
            ">;",
            "Lcom/facebook/orca/d/bf;",
            ")V"
        }
    .end annotation

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Lcom/facebook/orca/d/n;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/n;-><init>(Lcom/facebook/orca/d/m;)V

    iput-object v0, p0, Lcom/facebook/orca/d/m;->e:Lcom/facebook/orca/d/l;

    .line 36
    new-instance v0, Lcom/facebook/orca/d/o;

    invoke-direct {v0, p0}, Lcom/facebook/orca/d/o;-><init>(Lcom/facebook/orca/d/m;)V

    iput-object v0, p0, Lcom/facebook/orca/d/m;->f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 67
    iput-object p1, p0, Lcom/facebook/orca/d/m;->a:Landroid/media/AudioManager;

    .line 68
    iput-object p2, p0, Lcom/facebook/orca/d/m;->b:Ljavax/inject/a;

    .line 69
    iput-object p3, p0, Lcom/facebook/orca/d/m;->c:Lcom/facebook/orca/d/bf;

    .line 70
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/d/m;->d:Ljava/util/Queue;

    .line 71
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/d/m;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/orca/d/m;->h()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/d/m;)Lcom/facebook/orca/d/e;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    return-object v0
.end method

.method private c(Landroid/net/Uri;)Lcom/facebook/orca/d/e;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/facebook/orca/d/m;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/e;

    .line 136
    invoke-virtual {v0, p1}, Lcom/facebook/orca/d/e;->a(Landroid/net/Uri;)V

    .line 137
    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/d/m;->c:Lcom/facebook/orca/d/bf;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/bf;->a(I)V

    .line 116
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/orca/d/m;->c:Lcom/facebook/orca/d/bf;

    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/bf;->a(I)V

    .line 120
    return-void
.end method

.method private e()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 123
    iget-object v2, p0, Lcom/facebook/orca/d/m;->a:Landroid/media/AudioManager;

    iget-object v3, p0, Lcom/facebook/orca/d/m;->f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v4, 0x2

    invoke-virtual {v2, v3, v1, v4}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v2

    .line 127
    if-ne v2, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/orca/d/m;->a:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/facebook/orca/d/m;->f:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 132
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 144
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->c()V

    .line 158
    :goto_0
    return-void

    .line 147
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/d/m;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 149
    invoke-direct {p0}, Lcom/facebook/orca/d/m;->c()V

    .line 150
    invoke-direct {p0}, Lcom/facebook/orca/d/m;->e()Z

    .line 151
    iget-object v0, p0, Lcom/facebook/orca/d/m;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/e;

    iput-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    iget-object v1, p0, Lcom/facebook/orca/d/m;->e:Lcom/facebook/orca/d/l;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/e;->a(Lcom/facebook/orca/d/l;)V

    .line 153
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->a()V

    goto :goto_0

    .line 156
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/d/m;->f()V

    goto :goto_0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 165
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    iget-object v1, p0, Lcom/facebook/orca/d/m;->e:Lcom/facebook/orca/d/l;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/d/e;->b(Lcom/facebook/orca/d/l;)V

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    .line 167
    invoke-direct {p0}, Lcom/facebook/orca/d/m;->g()V

    .line 168
    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/facebook/orca/d/e;
    .locals 2

    .prologue
    .line 78
    invoke-direct {p0, p1}, Lcom/facebook/orca/d/m;->c(Landroid/net/Uri;)Lcom/facebook/orca/d/e;

    move-result-object v0

    .line 80
    iget-object v1, p0, Lcom/facebook/orca/d/m;->d:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->clear()V

    .line 81
    iget-object v1, p0, Lcom/facebook/orca/d/m;->d:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-direct {p0}, Lcom/facebook/orca/d/m;->g()V

    .line 84
    return-object v0
.end method

.method public a()V
    .locals 0

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/facebook/orca/d/m;->b()V

    .line 93
    invoke-direct {p0}, Lcom/facebook/orca/d/m;->d()V

    .line 94
    return-void
.end method

.method public b(Landroid/net/Uri;)Lcom/facebook/orca/d/e;
    .locals 3

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->b()Landroid/net/Uri;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    .line 111
    :goto_0
    return-object v0

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/d/m;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/e;

    .line 107
    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->b()Landroid/net/Uri;

    move-result-object v2

    if-ne v2, p1, :cond_1

    goto :goto_0

    .line 111
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/d/m;->g:Lcom/facebook/orca/d/e;

    invoke-virtual {v0}, Lcom/facebook/orca/d/e;->c()V

    .line 100
    :cond_0
    return-void
.end method
