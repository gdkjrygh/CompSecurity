.class public final Lcom/kik/view/adapters/bd;
.super Lcom/kik/view/adapters/j;
.source "SourceFile"


# instance fields
.field private d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V
    .locals 6

    .prologue
    .line 25
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/j;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    .line 26
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/bd;->d:Ljava/util/Map;

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/Map;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V
    .locals 6

    .prologue
    .line 31
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/j;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V

    .line 32
    iput-object p3, p0, Lcom/kik/view/adapters/bd;->d:Ljava/util/Map;

    .line 33
    return-void
.end method


# virtual methods
.method protected final a(Lcom/kik/view/adapters/j$a;Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 39
    invoke-virtual {p2}, Lkik/a/d/k;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p0}, Lcom/kik/view/adapters/bd;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090202

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 45
    :goto_0
    iget-object v1, p1, Lcom/kik/view/adapters/j$a;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    return-void

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/bd;->d:Ljava/util/Map;

    invoke-virtual {p2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/view/adapters/bd;->d:Ljava/util/Map;

    invoke-virtual {p2}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
