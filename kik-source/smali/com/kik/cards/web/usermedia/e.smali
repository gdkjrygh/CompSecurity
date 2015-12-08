.class final Lcom/kik/cards/web/usermedia/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/cards/web/usermedia/d;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/usermedia/d;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 328
    iput-object p1, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iput-object p2, p0, Lcom/kik/cards/web/usermedia/e;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 9

    .prologue
    .line 328
    check-cast p1, Ljava/util/List;

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkik/android/util/cq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Lcom/kik/cards/web/usermedia/PhotoPlugin$b;

    iget-object v6, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget-object v6, v6, Lcom/kik/cards/web/usermedia/d;->i:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-direct {v5, v6, v0, v4}, Lcom/kik/cards/web/usermedia/PhotoPlugin$b;-><init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget-object v0, v0, Lcom/kik/cards/web/usermedia/d;->a:Lcom/kik/cards/web/plugin/a;

    const/16 v3, 0xc8

    invoke-static {v0, v3, v1}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/plugin/a;ILjava/util/List;)V

    new-instance v0, Lcom/kik/cards/web/usermedia/PhotoPlugin$c;

    iget-object v1, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget-object v1, v1, Lcom/kik/cards/web/usermedia/d;->i:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    iget-object v3, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget-object v3, v3, Lcom/kik/cards/web/usermedia/d;->e:Landroid/graphics/Bitmap$CompressFormat;

    iget-object v4, p0, Lcom/kik/cards/web/usermedia/e;->a:Ljava/lang/String;

    iget-object v5, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget v5, v5, Lcom/kik/cards/web/usermedia/d;->f:I

    iget-object v6, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget v6, v6, Lcom/kik/cards/web/usermedia/d;->g:I

    iget-object v7, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget v7, v7, Lcom/kik/cards/web/usermedia/d;->h:I

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/kik/cards/web/usermedia/PhotoPlugin$c;-><init>(Lcom/kik/cards/web/usermedia/PhotoPlugin;Ljava/util/List;Landroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;IIIB)V

    iget-object v1, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget-object v1, v1, Lcom/kik/cards/web/usermedia/d;->i:Lcom/kik/cards/web/usermedia/PhotoPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->b(Lcom/kik/cards/web/usermedia/PhotoPlugin;)Lcom/kik/m/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kik/m/q;->a(Ljava/util/concurrent/Callable;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/usermedia/f;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/usermedia/f;-><init>(Lcom/kik/cards/web/usermedia/e;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 372
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget-object v0, v0, Lcom/kik/cards/web/usermedia/d;->a:Lcom/kik/cards/web/plugin/a;

    const/16 v1, 0xc8

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/plugin/a;ILjava/util/List;)V

    .line 373
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 380
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/e;->b:Lcom/kik/cards/web/usermedia/d;

    iget-object v0, v0, Lcom/kik/cards/web/usermedia/d;->a:Lcom/kik/cards/web/plugin/a;

    const/16 v1, 0x1f4

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kik/cards/web/usermedia/PhotoPlugin;->a(Lcom/kik/cards/web/plugin/a;ILjava/util/List;)V

    .line 381
    return-void
.end method
