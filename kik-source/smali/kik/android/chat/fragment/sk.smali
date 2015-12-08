.class final Lkik/android/chat/fragment/sk;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/sj;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/sj;)V
    .locals 0

    .prologue
    .line 667
    iput-object p1, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 688
    iget-object v0, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 689
    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v1, v1, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    const/4 v2, 0x1

    invoke-static {v1, v3, v0, v2, v3}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    .line 691
    iget-object v0, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    new-instance v1, Lkik/android/chat/fragment/sm;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sm;-><init>(Lkik/android/chat/fragment/sk;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->b(Ljava/lang/Runnable;)V

    .line 699
    return-void

    .line 688
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final c()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 671
    iget-object v0, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 672
    :goto_0
    iget-object v1, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v1, v1, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/ViewPictureFragment;->f:Lcom/kik/android/a;

    const/4 v2, 0x0

    invoke-static {v1, v3, v0, v3, v2}, Lkik/android/util/by;->a(Lcom/kik/android/a;ZLjava/lang/String;ZZ)V

    .line 674
    iget-object v0, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    new-instance v1, Lkik/android/chat/fragment/sl;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/sl;-><init>(Lkik/android/chat/fragment/sk;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment;->b(Ljava/lang/Runnable;)V

    .line 683
    return-void

    .line 671
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/sk;->a:Lkik/android/chat/fragment/sj;

    iget-object v0, v0, Lkik/android/chat/fragment/sj;->b:Lkik/android/chat/fragment/ViewPictureFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/ViewPictureFragment;->e(Lkik/android/chat/fragment/ViewPictureFragment;)Lkik/a/d/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
