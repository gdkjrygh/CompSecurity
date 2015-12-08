.class final Lkik/android/chat/fragment/si;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/ViewPictureFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ViewPictureFragment;)V
    .locals 0

    .prologue
    .line 624
    iput-object p1, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 628
    iget-object v0, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->k(Lkik/android/chat/fragment/ViewPictureFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->l(Lkik/android/chat/fragment/ViewPictureFragment;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 630
    iget-object v0, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->m(Lkik/android/chat/fragment/ViewPictureFragment;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 631
    iget-object v0, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/ViewPictureFragment;->m(Lkik/android/chat/fragment/ViewPictureFragment;)Ljava/io/File;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->b(Lkik/android/chat/fragment/ViewPictureFragment;Ljava/io/File;)V

    .line 632
    const v0, 0x7f09035d

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->b(I)Ljava/lang/String;

    move-result-object v0

    .line 633
    iget-object v1, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const v2, 0x7f02024d

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 634
    iget-object v1, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    invoke-virtual {v1, v3}, Landroid/widget/ImageButton;->setClickable(Z)V

    .line 636
    iget-object v1, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    iget-object v2, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2, v4, v3}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    .line 642
    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 645
    :cond_0
    return-void

    .line 639
    :cond_1
    const v0, 0x7f090204

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->b(I)Ljava/lang/String;

    move-result-object v0

    .line 640
    iget-object v1, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    iget-object v2, p0, Lkik/android/chat/fragment/si;->a:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v3, v2, v4, v3}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    goto :goto_0
.end method
