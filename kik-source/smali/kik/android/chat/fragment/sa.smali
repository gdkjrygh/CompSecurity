.class final Lkik/android/chat/fragment/sa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/VideoTrimmingFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/VideoTrimmingFragment;)V
    .locals 0

    .prologue
    .line 450
    iput-object p1, p0, Lkik/android/chat/fragment/sa;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 454
    iget-object v0, p0, Lkik/android/chat/fragment/sa;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/VideoTrimmingFragment;->a(Lkik/android/chat/fragment/VideoTrimmingFragment;Z)Z

    .line 455
    new-array v0, v1, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Lkik/android/chat/fragment/sa;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoPlayIcon:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 456
    iget-object v0, p0, Lkik/android/chat/fragment/sa;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/VideoTrimmingFragment;->_videoView:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 457
    iget-object v0, p0, Lkik/android/chat/fragment/sa;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/VideoTrimmingFragment;->k(Lkik/android/chat/fragment/VideoTrimmingFragment;)Lkik/android/util/bf;

    move-result-object v0

    if-nez v0, :cond_0

    .line 458
    iget-object v0, p0, Lkik/android/chat/fragment/sa;->a:Lkik/android/chat/fragment/VideoTrimmingFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/VideoTrimmingFragment;->l(Lkik/android/chat/fragment/VideoTrimmingFragment;)V

    .line 460
    :cond_0
    return-void
.end method
