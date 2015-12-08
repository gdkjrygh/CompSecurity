.class final Lkik/android/chat/fragment/sj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/a/d/d;

.field final synthetic b:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;Lkik/a/d/d;)V
    .locals 0

    .prologue
    .line 656
    iput-object p1, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/sj;->a:Lkik/a/d/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    .line 660
    iget-object v0, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->l(Lkik/android/chat/fragment/ViewPictureFragment;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->l(Lkik/android/chat/fragment/ViewPictureFragment;)I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->k(Lkik/android/chat/fragment/ViewPictureFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/sj;->a:Lkik/a/d/d;

    invoke-virtual {v0, v1}, Lkik/a/h/e;->a(Lkik/a/d/d;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->n(Lkik/android/chat/fragment/ViewPictureFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 662
    iget-object v0, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    .line 664
    invoke-static {}, Lkik/android/util/a;->a()Lkik/android/util/a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/ViewPictureFragment;->o(Lkik/android/chat/fragment/ViewPictureFragment;)[B

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/ViewPictureFragment;->j(Lkik/android/chat/fragment/ViewPictureFragment;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v4, v4, Lkik/android/chat/fragment/ViewPictureFragment;->b:Lcom/kik/cache/ad;

    iget-object v5, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v5, v5, Lkik/android/chat/fragment/ViewPictureFragment;->contentImageView:Lcom/kik/cache/ContentImageView;

    iget-object v6, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v6}, Lkik/android/chat/fragment/ViewPictureFragment;->p(Lkik/android/chat/fragment/ViewPictureFragment;)Lcom/android/volley/r$a;

    move-result-object v6

    iget-object v7, p0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v7, v7, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v7}, Lkik/android/util/a;->a(Lkik/a/d/a/a;[BLjava/lang/String;Lcom/kik/cache/ad;Lcom/kik/cache/ContentImageView;Lcom/android/volley/r$a;Lcom/kik/android/a;)Lcom/kik/g/p;

    move-result-object v0

    .line 667
    new-instance v1, Lkik/android/chat/fragment/sk;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sk;-><init>(Lkik/android/chat/fragment/sj;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 702
    :cond_2
    return-void
.end method
