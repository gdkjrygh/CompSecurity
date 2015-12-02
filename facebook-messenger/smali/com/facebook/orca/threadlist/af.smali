.class public Lcom/facebook/orca/threadlist/af;
.super Landroid/widget/BaseAdapter;
.source "ThreadListAdapter.java"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/lang/Object;

.field public static final d:Ljava/lang/Object;

.field public static final e:Ljava/lang/Object;


# instance fields
.field private final f:Landroid/content/Context;

.field private final g:Landroid/view/LayoutInflater;

.field private final h:Lcom/facebook/orca/f/b;

.field private final i:Lcom/facebook/orca/f/x;

.field private final j:Lcom/facebook/orca/photos/a/e;

.field private k:Lcom/facebook/orca/threadlist/al;

.field private l:Lcom/facebook/orca/threadlist/ak;

.field private m:Ljava/lang/String;

.field private n:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<*>;"
        }
    .end annotation
.end field

.field private p:Lcom/google/common/base/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Supplier",
            "<",
            "Lcom/facebook/orca/threadlist/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadlist/af;->a:Ljava/lang/Object;

    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadlist/af;->b:Ljava/lang/Object;

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadlist/af;->c:Ljava/lang/Object;

    .line 52
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadlist/af;->d:Ljava/lang/Object;

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadlist/af;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/f/b;Lcom/facebook/orca/f/x;Lcom/facebook/orca/photos/a/e;Landroid/view/LayoutInflater;)V
    .locals 2

    .prologue
    .line 73
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 61
    sget-object v0, Lcom/facebook/orca/threadlist/al;->NORMAL:Lcom/facebook/orca/threadlist/al;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/af;->k:Lcom/facebook/orca/threadlist/al;

    .line 62
    sget-object v0, Lcom/facebook/orca/threadlist/ak;->NONE:Lcom/facebook/orca/threadlist/ak;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/af;->l:Lcom/facebook/orca/threadlist/ak;

    .line 64
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/af;->n:Lcom/google/common/a/es;

    .line 65
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/af;->o:Lcom/google/common/a/es;

    .line 66
    new-instance v0, Lcom/facebook/orca/threadlist/aj;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/orca/threadlist/aj;-><init>(Lcom/facebook/orca/threadlist/af;Lcom/facebook/orca/threadlist/ag;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/af;->p:Lcom/google/common/base/Supplier;

    .line 74
    iput-object p1, p0, Lcom/facebook/orca/threadlist/af;->f:Landroid/content/Context;

    .line 75
    iput-object p2, p0, Lcom/facebook/orca/threadlist/af;->h:Lcom/facebook/orca/f/b;

    .line 76
    iput-object p3, p0, Lcom/facebook/orca/threadlist/af;->i:Lcom/facebook/orca/f/x;

    .line 77
    iput-object p4, p0, Lcom/facebook/orca/threadlist/af;->j:Lcom/facebook/orca/photos/a/e;

    .line 78
    iput-object p5, p0, Lcom/facebook/orca/threadlist/af;->g:Landroid/view/LayoutInflater;

    .line 79
    return-void
.end method

.method private a(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .prologue
    .line 284
    .line 285
    if-nez p1, :cond_0

    .line 286
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->g:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_thread_list_start_thread_button_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 287
    sget v0, Lcom/facebook/i;->thread_list_start_thread_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 288
    sget v1, Lcom/facebook/o;->thread_start_thread_button:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 290
    :cond_0
    return-object p1
.end method

.method private a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 315
    .line 316
    if-nez p1, :cond_0

    .line 317
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->g:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_load_more_placeholder_footer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 319
    :cond_0
    return-object p1
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/af;)Lcom/facebook/orca/f/b;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->h:Lcom/facebook/orca/f/b;

    return-object v0
.end method

.method private a(Lcom/google/common/a/es;Lcom/google/common/base/Predicate;)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;",
            "Lcom/google/common/base/Predicate",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 138
    invoke-interface {p2, v0}, Lcom/google/common/base/Predicate;->apply(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 139
    const/4 v0, 0x1

    :goto_1
    move v1, v0

    goto :goto_0

    .line 142
    :cond_0
    if-nez v1, :cond_1

    .line 152
    :goto_2
    return-object p1

    .line 146
    :cond_1
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 147
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 148
    invoke-interface {p2, v0}, Lcom/google/common/base/Predicate;->apply(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 149
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_3

    .line 152
    :cond_3
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object p1

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method private a()V
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->k:Lcom/facebook/orca/threadlist/al;

    sget-object v1, Lcom/facebook/orca/threadlist/al;->NORMAL:Lcom/facebook/orca/threadlist/al;

    if-ne v0, v1, :cond_0

    .line 108
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/af;->b()V

    .line 112
    :goto_0
    return-void

    .line 110
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/af;->c()V

    goto :goto_0
.end method

.method private b(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .prologue
    .line 294
    .line 295
    if-nez p1, :cond_0

    .line 296
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->g:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_thread_list_new_thread_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 297
    sget v0, Lcom/facebook/i;->thread_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 298
    iget-object v1, p0, Lcom/facebook/orca/threadlist/af;->m:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 299
    iget-object v1, p0, Lcom/facebook/orca/threadlist/af;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    :cond_0
    return-object p1
.end method

.method private b(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 323
    .line 324
    if-nez p1, :cond_0

    .line 325
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->g:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_load_more_footer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 327
    :cond_0
    return-object p1
.end method

.method static synthetic b(Lcom/facebook/orca/threadlist/af;)Lcom/facebook/orca/f/x;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->i:Lcom/facebook/orca/f/x;

    return-object v0
.end method

.method private b(Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->h:Lcom/facebook/orca/f/b;

    invoke-virtual {v0}, Lcom/facebook/orca/f/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    :goto_0
    return-object p1

    :cond_0
    new-instance v0, Lcom/facebook/orca/threadlist/ag;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/ag;-><init>(Lcom/facebook/orca/threadlist/af;)V

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadlist/af;->a(Lcom/google/common/a/es;Lcom/google/common/base/Predicate;)Lcom/google/common/a/es;

    move-result-object p1

    goto :goto_0
.end method

.method private b()V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->n:Lcom/google/common/a/es;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/af;->c(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/af;->b(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/af;->o:Lcom/google/common/a/es;

    .line 116
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/af;->notifyDataSetChanged()V

    .line 117
    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/threadlist/af;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->f:Landroid/content/Context;

    return-object v0
.end method

.method private c(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 332
    .line 333
    if-nez p1, :cond_0

    .line 334
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->g:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_loading_footer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 336
    :cond_0
    return-object p1
.end method

.method private c(Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->i:Lcom/facebook/orca/f/x;

    invoke-virtual {v0}, Lcom/facebook/orca/f/x;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 180
    :goto_0
    return-object p1

    :cond_0
    new-instance v0, Lcom/facebook/orca/threadlist/ah;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/ah;-><init>(Lcom/facebook/orca/threadlist/af;)V

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadlist/af;->a(Lcom/google/common/a/es;Lcom/google/common/base/Predicate;)Lcom/google/common/a/es;

    move-result-object p1

    goto :goto_0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 120
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    .line 121
    sget-object v1, Lcom/facebook/orca/threadlist/af;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 122
    iget-object v1, p0, Lcom/facebook/orca/threadlist/af;->n:Lcom/google/common/a/es;

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadlist/af;->c(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadlist/af;->b(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/threadlist/af;->d(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Iterable;)Lcom/google/common/a/et;

    .line 129
    invoke-virtual {v0}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/af;->o:Lcom/google/common/a/es;

    .line 130
    return-void
.end method

.method private d(Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 193
    new-instance v0, Lcom/facebook/orca/threadlist/ai;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/ai;-><init>(Lcom/facebook/orca/threadlist/af;)V

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threadlist/af;->a(Lcom/google/common/a/es;Lcom/google/common/base/Predicate;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;Landroid/view/View;)Landroid/view/View;
    .locals 2

    .prologue
    .line 306
    check-cast p2, Lcom/facebook/orca/threadlist/q;

    .line 307
    if-nez p2, :cond_0

    .line 308
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->p:Lcom/google/common/base/Supplier;

    invoke-interface {v0}, Lcom/google/common/base/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/q;

    .line 310
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/threadlist/af;->k:Lcom/facebook/orca/threadlist/al;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/threadlist/q;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threadlist/al;)V

    .line 311
    return-object v0

    :cond_0
    move-object v0, p2

    goto :goto_0
.end method

.method a(Lcom/facebook/orca/threadlist/ak;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/facebook/orca/threadlist/af;->l:Lcom/facebook/orca/threadlist/ak;

    .line 99
    return-void
.end method

.method public a(Lcom/facebook/orca/threadlist/al;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/orca/threadlist/af;->k:Lcom/facebook/orca/threadlist/al;

    .line 83
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 102
    iput-object p1, p0, Lcom/facebook/orca/threadlist/af;->n:Lcom/google/common/a/es;

    .line 103
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/af;->a()V

    .line 104
    return-void
.end method

.method public a(Lcom/google/common/base/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/base/Supplier",
            "<",
            "Lcom/facebook/orca/threadlist/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/orca/threadlist/af;->p:Lcom/google/common/base/Supplier;

    .line 87
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/orca/threadlist/af;->m:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public getCount()I
    .locals 3

    .prologue
    .line 235
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->o:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->l:Lcom/facebook/orca/threadlist/ak;

    sget-object v2, Lcom/facebook/orca/threadlist/ak;->NONE:Lcom/facebook/orca/threadlist/ak;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->o:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->o:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 252
    :goto_0
    return-object v0

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->o:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne p1, v0, :cond_3

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->l:Lcom/facebook/orca/threadlist/ak;

    sget-object v1, Lcom/facebook/orca/threadlist/ak;->LOAD_MORE_PLACEHOLDER:Lcom/facebook/orca/threadlist/ak;

    if-ne v0, v1, :cond_1

    .line 245
    sget-object v0, Lcom/facebook/orca/threadlist/af;->c:Ljava/lang/Object;

    goto :goto_0

    .line 246
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/af;->l:Lcom/facebook/orca/threadlist/ak;

    sget-object v1, Lcom/facebook/orca/threadlist/ak;->LOAD_MORE:Lcom/facebook/orca/threadlist/ak;

    if-ne v0, v1, :cond_2

    .line 247
    sget-object v0, Lcom/facebook/orca/threadlist/af;->d:Ljava/lang/Object;

    goto :goto_0

    .line 249
    :cond_2
    sget-object v0, Lcom/facebook/orca/threadlist/af;->e:Ljava/lang/Object;

    goto :goto_0

    .line 252
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 257
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 3

    .prologue
    const/4 v1, 0x2

    .line 211
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadlist/af;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 212
    sget-object v2, Lcom/facebook/orca/threadlist/af;->a:Ljava/lang/Object;

    if-ne v0, v2, :cond_0

    .line 213
    const/4 v0, 0x0

    .line 229
    :goto_0
    return v0

    .line 214
    :cond_0
    sget-object v2, Lcom/facebook/orca/threadlist/af;->b:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    .line 215
    const/4 v0, 0x3

    goto :goto_0

    .line 216
    :cond_1
    sget-object v2, Lcom/facebook/orca/threadlist/af;->c:Ljava/lang/Object;

    if-ne v0, v2, :cond_2

    .line 217
    const/4 v0, 0x4

    goto :goto_0

    .line 218
    :cond_2
    sget-object v2, Lcom/facebook/orca/threadlist/af;->d:Ljava/lang/Object;

    if-ne v0, v2, :cond_3

    .line 219
    const/4 v0, 0x5

    goto :goto_0

    .line 220
    :cond_3
    sget-object v2, Lcom/facebook/orca/threadlist/af;->e:Ljava/lang/Object;

    if-ne v0, v2, :cond_4

    .line 221
    const/4 v0, 0x6

    goto :goto_0

    .line 222
    :cond_4
    instance-of v2, v0, Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v2, :cond_6

    .line 223
    iget-object v2, p0, Lcom/facebook/orca/threadlist/af;->j:Lcom/facebook/orca/photos/a/e;

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/j;

    move-result-object v0

    .line 225
    invoke-interface {v0}, Lcom/facebook/widget/tiles/j;->a()I

    move-result v0

    .line 227
    if-ge v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_0

    .line 229
    :cond_6
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 262
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadlist/af;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 263
    if-nez v0, :cond_0

    .line 264
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null item"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 266
    :cond_0
    sget-object v1, Lcom/facebook/orca/threadlist/af;->a:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 267
    invoke-direct {p0, p2}, Lcom/facebook/orca/threadlist/af;->a(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    .line 277
    :goto_0
    return-object v0

    .line 268
    :cond_1
    sget-object v1, Lcom/facebook/orca/threadlist/af;->b:Ljava/lang/Object;

    if-ne v0, v1, :cond_2

    .line 269
    invoke-direct {p0, p2}, Lcom/facebook/orca/threadlist/af;->b(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 270
    :cond_2
    sget-object v1, Lcom/facebook/orca/threadlist/af;->c:Ljava/lang/Object;

    if-ne v0, v1, :cond_3

    .line 271
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/threadlist/af;->a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 272
    :cond_3
    sget-object v1, Lcom/facebook/orca/threadlist/af;->d:Ljava/lang/Object;

    if-ne v0, v1, :cond_4

    .line 273
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/threadlist/af;->b(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 274
    :cond_4
    sget-object v1, Lcom/facebook/orca/threadlist/af;->e:Ljava/lang/Object;

    if-ne v0, v1, :cond_5

    .line 275
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/threadlist/af;->c(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 276
    :cond_5
    instance-of v1, v0, Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v1, :cond_6

    .line 277
    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/threadlist/af;->a(Lcom/facebook/orca/threads/ThreadSummary;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 279
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown object type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 206
    const/4 v0, 0x7

    return v0
.end method
