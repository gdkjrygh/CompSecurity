.class public abstract Lcom/qihoo/security/opti/trashclear/ui/a;
.super Landroid/widget/BaseAdapter;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/a$e;,
        Lcom/qihoo/security/opti/trashclear/ui/a$d;,
        Lcom/qihoo/security/opti/trashclear/ui/a$c;,
        Lcom/qihoo/security/opti/trashclear/ui/a$a;,
        Lcom/qihoo/security/opti/trashclear/ui/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/widget/BaseAdapter;"
    }
.end annotation


# instance fields
.field protected final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field protected b:Landroid/content/Context;

.field private final c:Landroid/util/SparseIntArray;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private f:I

.field private g:I

.field private h:Lcom/qihoo/security/opti/trashclear/ui/a$b;

.field private i:Lcom/qihoo/security/opti/trashclear/ui/a$a;

.field private j:I

.field private k:Lcom/qihoo/security/opti/trashclear/ui/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/a$c",
            "<TT;>;"
        }
    .end annotation
.end field

.field private l:Lcom/qihoo/security/opti/trashclear/ui/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/a$d",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;>;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 59
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 34
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->c:Landroid/util/SparseIntArray;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->d:Ljava/util/List;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->e:Ljava/util/Map;

    .line 41
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->f:I

    .line 42
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->g:I

    .line 671
    iput-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->k:Lcom/qihoo/security/opti/trashclear/ui/a$c;

    .line 690
    iput-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->l:Lcom/qihoo/security/opti/trashclear/ui/a$d;

    .line 60
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->b:Landroid/content/Context;

    .line 61
    if-nez p2, :cond_0

    .line 62
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 65
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->i()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->j:I

    .line 69
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 70
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_1

    .line 67
    :cond_1
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->j:I

    goto :goto_0

    .line 73
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/a;->c()V

    .line 74
    return-void
.end method

.method private a(ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 3

    .prologue
    .line 493
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 495
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->i()Ljava/lang/Integer;

    move-result-object v1

    .line 496
    if-nez p2, :cond_0

    .line 497
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->b:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    if-nez v1, :cond_1

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {v2, p4, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 522
    :cond_0
    new-instance v1, Lcom/qihoo/security/opti/trashclear/ui/a$e;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->l:Lcom/qihoo/security/opti/trashclear/ui/a$d;

    invoke-direct {v1, p0, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/a$e;-><init>(Lcom/qihoo/security/opti/trashclear/ui/a;Lcom/qihoo/security/opti/trashclear/ui/i;Lcom/qihoo/security/opti/trashclear/ui/a$d;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 524
    invoke-virtual {p0, p2, v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 526
    return-object p2

    .line 497
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p4

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/a;)Lcom/qihoo/security/opti/trashclear/ui/a$c;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->k:Lcom/qihoo/security/opti/trashclear/ui/a$c;

    return-object v0
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/ui/i;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 724
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 737
    :cond_0
    return-void

    .line 727
    :cond_1
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->i()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 728
    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    .line 729
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->i()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    :cond_2
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 732
    if-eqz v0, :cond_0

    .line 733
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 734
    invoke-direct {p0, v0, p2}, Lcom/qihoo/security/opti/trashclear/ui/a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;Ljava/util/Map;)V

    goto :goto_0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 272
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 273
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 274
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 275
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 276
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 279
    :cond_2
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 717
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 718
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 719
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->e:Ljava/util/Map;

    invoke-direct {p0, v0, v2}, Lcom/qihoo/security/opti/trashclear/ui/a;->a(Lcom/qihoo/security/opti/trashclear/ui/i;Ljava/util/Map;)V

    goto :goto_0

    .line 721
    :cond_0
    return-void
.end method

.method private f(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 81
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 88
    :cond_0
    return-void

    .line 85
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 86
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->f(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 85
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method private g(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 236
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v0

    .line 237
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 239
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 241
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 243
    :cond_0
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->f()V

    .line 244
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 246
    return-void
.end method

.method private h(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 254
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    .line 255
    if-eqz v0, :cond_1

    .line 256
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->b()Ljava/util/List;

    move-result-object v1

    .line 257
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 258
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 259
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 260
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    .line 261
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 268
    :cond_0
    :goto_0
    return-void

    .line 264
    :cond_1
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->f()V

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 266
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 439
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    return-object v0
.end method

.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    return-object v0
.end method

.method protected abstract a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/a$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/a$c",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 674
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->k:Lcom/qihoo/security/opti/trashclear/ui/a$c;

    .line 675
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/a$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/a$d",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 693
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->l:Lcom/qihoo/security/opti/trashclear/ui/a$d;

    .line 694
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 202
    if-eqz p1, :cond_0

    .line 203
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/a;->g(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 204
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/a;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 205
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/a;->notifyDataSetChanged()V

    .line 207
    :cond_0
    return-void
.end method

.method protected b(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 585
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/a$1;

    invoke-direct {v0, p0, p2}, Lcom/qihoo/security/opti/trashclear/ui/a$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/a;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 593
    return-void
.end method

.method public b(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 407
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 408
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1, v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->a(Z)V

    .line 409
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/a;->b()V

    .line 410
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/a;->c(Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 411
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/a;->notifyDataSetChanged()V

    .line 412
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->h:Lcom/qihoo/security/opti/trashclear/ui/a$b;

    if-eqz v0, :cond_0

    .line 413
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->h:Lcom/qihoo/security/opti/trashclear/ui/a$b;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/a$b;->a()V

    .line 417
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->i:Lcom/qihoo/security/opti/trashclear/ui/a$a;

    if-eqz v0, :cond_1

    .line 418
    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 419
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->i:Lcom/qihoo/security/opti/trashclear/ui/a$a;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/a$a;->a()V

    .line 423
    :cond_1
    return-void

    .line 408
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected abstract c(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation
.end method

.method protected d(Lcom/qihoo/security/opti/trashclear/ui/i;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)I"
        }
    .end annotation

    .prologue
    .line 469
    if-eqz p1, :cond_0

    .line 470
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->e:Ljava/util/Map;

    invoke-interface {p1}, Lcom/qihoo/security/opti/trashclear/ui/i;->i()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 471
    if-eqz v0, :cond_0

    .line 472
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 475
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e(Lcom/qihoo/security/opti/trashclear/ui/i;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)I"
        }
    .end annotation

    .prologue
    .line 548
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 549
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 551
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 434
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/a;->a(I)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 444
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .prologue
    .line 458
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 459
    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)I

    move-result v0

    return v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 486
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->j:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/qihoo/security/opti/trashclear/ui/a;->a(ILandroid/view/View;Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 480
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/a;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    .line 481
    if-lez v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method
