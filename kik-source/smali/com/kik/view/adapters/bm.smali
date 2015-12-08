.class final Lcom/kik/view/adapters/bm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/net/a/b;

.field final synthetic b:Landroid/widget/ImageView;

.field final synthetic c:Lkik/android/widget/ProgressWidget;

.field final synthetic d:Lkik/a/d/f;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lkik/android/net/a/b;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Lkik/a/d/f;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 795
    iput-object p1, p0, Lcom/kik/view/adapters/bm;->f:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bm;->a:Lkik/android/net/a/b;

    iput-object p3, p0, Lcom/kik/view/adapters/bm;->b:Landroid/widget/ImageView;

    iput-object p4, p0, Lcom/kik/view/adapters/bm;->c:Lkik/android/widget/ProgressWidget;

    iput-object p5, p0, Lcom/kik/view/adapters/bm;->d:Lkik/a/d/f;

    iput-object p6, p0, Lcom/kik/view/adapters/bm;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 799
    iget-object v0, p0, Lcom/kik/view/adapters/bm;->f:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->l:Landroid/content/Context;

    iget-object v1, p0, Lcom/kik/view/adapters/bm;->f:Lcom/kik/view/adapters/bf;

    iget-object v1, v1, Lcom/kik/view/adapters/bf;->l:Landroid/content/Context;

    const v2, 0x7f090267

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 800
    iget-object v0, p0, Lcom/kik/view/adapters/bm;->f:Lcom/kik/view/adapters/bf;

    iget-object v1, p0, Lcom/kik/view/adapters/bm;->a:Lkik/android/net/a/b;

    iget-object v2, p0, Lcom/kik/view/adapters/bm;->b:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/kik/view/adapters/bm;->c:Lkik/android/widget/ProgressWidget;

    iget-object v4, p0, Lcom/kik/view/adapters/bm;->d:Lkik/a/d/f;

    iget-object v5, p0, Lcom/kik/view/adapters/bm;->e:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/kik/view/adapters/bf;->a(Lkik/android/net/a/b;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Lkik/a/d/f;Ljava/lang/String;)V

    .line 801
    return-void
.end method
