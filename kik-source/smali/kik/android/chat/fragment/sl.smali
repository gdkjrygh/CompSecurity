.class final Lkik/android/chat/fragment/sl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/sk;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/sk;)V
    .locals 0

    .prologue
    .line 674
    iput-object p1, p0, Lkik/android/chat/fragment/sl;->a:Lkik/android/chat/fragment/sk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 678
    iget-object v0, p0, Lkik/android/chat/fragment/sl;->a:Lkik/android/chat/fragment/sk;

    iget-object v0, v0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/sl;->a:Lkik/android/chat/fragment/sk;

    iget-object v1, v1, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v1, v1, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    const v2, 0x7f090135

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/ViewPictureFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 679
    iget-object v0, p0, Lkik/android/chat/fragment/sl;->a:Lkik/android/chat/fragment/sk;

    iget-object v0, v0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    const v1, 0x7f02024d

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 680
    iget-object v0, p0, Lkik/android/chat/fragment/sl;->a:Lkik/android/chat/fragment/sk;

    iget-object v0, v0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/ViewPictureFragment;->_saveButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setClickable(Z)V

    .line 681
    return-void
.end method
