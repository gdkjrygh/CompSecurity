.class final Lcom/kik/cache/ah;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cache/ad;


# direct methods
.method constructor <init>(Lcom/kik/cache/ad;)V
    .locals 0

    .prologue
    .line 605
    iput-object p1, p0, Lcom/kik/cache/ah;->a:Lcom/kik/cache/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 609
    iget-object v0, p0, Lcom/kik/cache/ah;->a:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->c(Lcom/kik/cache/ad;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ad$a;

    .line 610
    invoke-static {v0}, Lcom/kik/cache/ad$a;->b(Lcom/kik/cache/ad$a;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cache/ad$c;

    .line 614
    invoke-static {v1}, Lcom/kik/cache/ad$c;->a(Lcom/kik/cache/ad$c;)Lcom/kik/cache/ad$d;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 615
    invoke-virtual {v0}, Lcom/kik/cache/ad$a;->a()Lcom/android/volley/w;

    move-result-object v4

    if-nez v4, :cond_2

    .line 618
    invoke-static {v0}, Lcom/kik/cache/ad$a;->c(Lcom/kik/cache/ad$a;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/kik/cache/ad$c;->a(Lcom/kik/cache/ad$c;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 619
    invoke-static {v1}, Lcom/kik/cache/ad$c;->a(Lcom/kik/cache/ad$c;)Lcom/kik/cache/ad$d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v4, v1, v5}, Lcom/kik/cache/ad$d;->a(Lcom/kik/cache/ad$c;Z)V

    goto :goto_0

    .line 622
    :cond_2
    invoke-static {v1}, Lcom/kik/cache/ad$c;->a(Lcom/kik/cache/ad$c;)Lcom/kik/cache/ad$d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/kik/cache/ad$a;->a()Lcom/android/volley/w;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/kik/cache/ad$d;->a(Lcom/android/volley/w;)V

    goto :goto_0

    .line 626
    :cond_3
    iget-object v0, p0, Lcom/kik/cache/ah;->a:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->c(Lcom/kik/cache/ad;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 627
    iget-object v0, p0, Lcom/kik/cache/ah;->a:Lcom/kik/cache/ad;

    invoke-static {v0}, Lcom/kik/cache/ad;->d(Lcom/kik/cache/ad;)Ljava/lang/Runnable;

    .line 628
    return-void
.end method
