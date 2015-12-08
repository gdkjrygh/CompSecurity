.class final Lcom/kik/view/adapters/bx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/kik/view/adapters/bw;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bw;I)V
    .locals 0

    .prologue
    .line 455
    iput-object p1, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iput p2, p0, Lcom/kik/view/adapters/bx;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 459
    iget-object v0, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v0, v0, Lcom/kik/view/adapters/bw;->a:Lcom/kik/view/adapters/bf$b;

    iget-boolean v0, v0, Lcom/kik/view/adapters/bf$b;->z:Z

    if-nez v0, :cond_0

    .line 460
    iget v0, p0, Lcom/kik/view/adapters/bx;->a:I

    const/16 v1, 0x190

    if-ne v0, v1, :cond_2

    .line 461
    iget-object v0, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v0, v0, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->l:Landroid/content/Context;

    iget-object v1, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v1, v1, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, v1, Lcom/kik/view/adapters/bf;->l:Landroid/content/Context;

    const v2, 0x7f0900e3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 468
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v0, v0, Lcom/kik/view/adapters/bw;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v1, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v1, v1, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, v1, Lcom/kik/view/adapters/bf;->a:Lcom/kik/view/adapters/bf$b;

    if-ne v0, v1, :cond_1

    .line 469
    iget-object v0, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v0, v0, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v1, v1, Lcom/kik/view/adapters/bw;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v2, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v2, v2, Lcom/kik/view/adapters/bw;->b:Lkik/a/d/s;

    iget-object v3, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v3, v3, Lcom/kik/view/adapters/bw;->c:Landroid/view/TextureView;

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Landroid/view/View;)V

    .line 471
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v0, v0, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v1, v1, Lcom/kik/view/adapters/bw;->a:Lcom/kik/view/adapters/bf$b;

    iget-object v2, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v2, v2, Lcom/kik/view/adapters/bw;->b:Lkik/a/d/s;

    invoke-virtual {v0, v1, v2, v4}, Lcom/kik/view/adapters/bf;->a(Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;Z)V

    .line 472
    return-void

    .line 463
    :cond_2
    iget v0, p0, Lcom/kik/view/adapters/bx;->a:I

    const/16 v1, 0x191

    if-ne v0, v1, :cond_0

    .line 464
    iget-object v0, p0, Lcom/kik/view/adapters/bx;->b:Lcom/kik/view/adapters/bw;

    iget-object v0, v0, Lcom/kik/view/adapters/bw;->d:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->l:Landroid/content/Context;

    const v1, 0x7f09014d

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
