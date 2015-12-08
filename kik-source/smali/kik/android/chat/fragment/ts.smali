.class final Lkik/android/chat/fragment/ts;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/WebVideoFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/WebVideoFragment;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 124
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/WebVideoFragment;->_errorLayout:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 126
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->c(Lkik/android/chat/fragment/WebVideoFragment;)Lkik/android/widget/WebVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->j()V

    .line 127
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->d(Lkik/android/chat/fragment/WebVideoFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/WebVideoFragment;->c(Lkik/android/chat/fragment/WebVideoFragment;)Lkik/android/widget/WebVideoView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 128
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->d(Lkik/android/chat/fragment/WebVideoFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/WebVideoFragment;->c(Lkik/android/chat/fragment/WebVideoFragment;)Lkik/android/widget/WebVideoView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 129
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->c(Lkik/android/chat/fragment/WebVideoFragment;)Lkik/android/widget/WebVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->k()V

    .line 130
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->a(Lkik/android/chat/fragment/WebVideoFragment;)Lcom/kik/cards/web/video/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->d()V

    .line 131
    iget-object v0, p0, Lkik/android/chat/fragment/ts;->a:Lkik/android/chat/fragment/WebVideoFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/WebVideoFragment;->a(Lkik/android/chat/fragment/WebVideoFragment;)Lcom/kik/cards/web/video/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->l()V

    .line 132
    return-void
.end method
