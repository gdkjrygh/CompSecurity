.class final Lcom/kik/view/adapters/bp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/i/a;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bf$b;

.field final synthetic b:Lkik/a/d/a/a;

.field final synthetic c:Lkik/a/d/s;

.field final synthetic d:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/a/a;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iput-object p3, p0, Lcom/kik/view/adapters/bp;->b:Lkik/a/d/a/a;

    iput-object p4, p0, Lcom/kik/view/adapters/bp;->c:Lkik/a/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .prologue
    .line 298
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, v1, Lcom/kik/view/adapters/bf;->h:Lcom/kik/l/ab;

    iget-object v2, p0, Lcom/kik/view/adapters/bp;->b:Lkik/a/d/a/a;

    invoke-virtual {v2}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/kik/l/ab;->c(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v2, v2, Lcom/kik/view/adapters/bf;->g:Lkik/a/e/v;

    invoke-static {v0, v1, v2}, Lkik/android/i/b;->a(Landroid/content/Context;ZLkik/a/e/v;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 323
    :cond_0
    :goto_0
    return-void

    .line 302
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget v0, v0, Lcom/kik/view/adapters/bf$b;->n:I

    if-ne v0, p1, :cond_0

    .line 303
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ak;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 307
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    iget-boolean v0, v0, Lcom/kik/view/adapters/bf$b;->z:Z

    if-eqz v0, :cond_0

    .line 311
    :cond_2
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kik/view/adapters/bf$b;->z:Z

    .line 313
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->x:Lcom/kik/view/adapters/ak;

    .line 314
    iget-object v1, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v1, v1, Lcom/kik/view/adapters/bf$b;->u:Landroid/widget/ImageView;

    new-instance v2, Lcom/kik/view/adapters/bq;

    invoke-direct {v2, p0, v0}, Lcom/kik/view/adapters/bq;-><init>(Lcom/kik/view/adapters/bp;Lcom/kik/view/adapters/ak;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bp;->c:Lkik/a/d/s;

    iget-object v2, p0, Lcom/kik/view/adapters/bp;->b:Lkik/a/d/a/a;

    iget-object v3, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    invoke-static {v0, v1, v2, v3}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf;Lkik/a/d/s;Lkik/a/d/a/a;Lcom/kik/view/adapters/bf$b;)V

    goto :goto_0
.end method

.method public final b(I)V
    .locals 5

    .prologue
    .line 328
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bf$b;->y:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, v1, Lcom/kik/view/adapters/bf;->g:Lkik/a/e/v;

    invoke-static {v0, v1}, Lkik/android/i/b;->a(Landroid/content/Context;Lkik/a/e/v;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 337
    :cond_0
    :goto_0
    return-void

    .line 332
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->a:Lcom/kik/view/adapters/bf$b;

    iget v0, v0, Lcom/kik/view/adapters/bf$b;->n:I

    if-ne v0, p1, :cond_0

    .line 333
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->h:Lcom/kik/l/ab;

    iget-object v1, p0, Lcom/kik/view/adapters/bp;->b:Lkik/a/d/a/a;

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kik/l/ab;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->h:Lcom/kik/l/ab;

    iget-object v1, p0, Lcom/kik/view/adapters/bp;->b:Lkik/a/d/a/a;

    iget-object v2, p0, Lcom/kik/view/adapters/bp;->c:Lkik/a/d/s;

    invoke-virtual {v2}, Lkik/a/d/s;->o()[B

    move-result-object v2

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/kik/view/adapters/bp;->d:Lcom/kik/view/adapters/bf;

    iget-object v4, v4, Lcom/kik/view/adapters/bf;->e:Lcom/kik/android/a;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/kik/l/ab;->b(Lkik/a/d/a/a;[BLkik/a/e/s;Lcom/kik/android/a;)Lcom/kik/g/p;

    goto :goto_0
.end method
