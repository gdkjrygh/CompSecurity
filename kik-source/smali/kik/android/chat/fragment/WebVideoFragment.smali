.class public Lkik/android/chat/fragment/WebVideoFragment;
.super Lcom/kik/ui/fragment/FragmentBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/WebVideoFragment$a;
    }
.end annotation


# instance fields
.field _errorLayout:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e009d
    .end annotation
.end field

.field _loadingLayout:Landroid/view/ViewGroup;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e009c
    .end annotation
.end field

.field private a:Z

.field private b:Lkik/android/widget/VideoController;

.field private c:Lcom/kik/cards/web/video/b;

.field private d:Lkik/android/widget/WebVideoView;

.field private e:Landroid/view/ViewGroup;

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase;-><init>()V

    .line 315
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/WebVideoFragment;)Lcom/kik/cards/web/video/b;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/WebVideoFragment;)Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->g:Z

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/WebVideoFragment;)Lkik/android/widget/WebVideoView;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/WebVideoFragment;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->e:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/WebVideoFragment;)V
    .locals 6

    .prologue
    const/16 v5, 0x13

    const/16 v4, 0xe

    const/4 v3, 0x0

    .line 30
    iget-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/WebVideoFragment;->b:Lkik/android/widget/VideoController;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/WebVideoFragment;->b:Lkik/android/widget/VideoController;

    invoke-virtual {v1}, Lkik/android/widget/VideoController;->a()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_3

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v4, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->a:Z

    goto :goto_0

    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v4, :cond_4

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v5, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_1

    :cond_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v5, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x700

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method public final B()Z
    .locals 1

    .prologue
    .line 293
    const/4 v0, 0x1

    return v0
.end method

.method public final a()V
    .locals 6

    .prologue
    const/16 v5, 0x13

    const/16 v4, 0xe

    const/4 v3, 0x1

    .line 169
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->b:Lkik/android/widget/VideoController;

    if-eqz v0, :cond_1

    .line 170
    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 171
    if-eqz v0, :cond_1

    .line 172
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_2

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v4, :cond_2

    .line 173
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 193
    :cond_0
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->b:Lkik/android/widget/VideoController;

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->c()V

    .line 194
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->a:Z

    .line 198
    :cond_1
    return-void

    .line 175
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v4, :cond_3

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v5, :cond_3

    .line 176
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 178
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v5, :cond_0

    .line 179
    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v1

    if-eqz v1, :cond_4

    .line 180
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0

    .line 183
    :cond_4
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0xf06

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 248
    if-nez p1, :cond_0

    .line 249
    iget-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->f:Z

    if-eqz v0, :cond_1

    .line 250
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->b()V

    .line 256
    :cond_0
    :goto_0
    return-void

    .line 253
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->n()V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 298
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->f:Z

    .line 299
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 303
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->_errorLayout:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 305
    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    .line 306
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 310
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 311
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 313
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 46
    const v0, 0x7f03001b

    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 47
    invoke-static {}, Lcom/kik/cards/web/video/b;->a()Lcom/kik/cards/web/video/b;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    .line 48
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0, p0}, Lcom/kik/cards/web/video/b;->a(Lkik/android/chat/fragment/WebVideoFragment;)V

    .line 49
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->g()Lkik/android/widget/WebVideoView;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    .line 50
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->v()I

    move-result v0

    .line 51
    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentActivity;->setRequestedOrientation(I)V

    .line 53
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v0, 0x11

    invoke-direct {v2, v3, v3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 55
    const v0, 0x7f0e009b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->e:Landroid/view/ViewGroup;

    .line 56
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->e:Landroid/view/ViewGroup;

    iget-object v3, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    invoke-static {p0, v1}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 59
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->i()V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    new-instance v0, Lkik/android/widget/VideoController;

    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Lkik/android/widget/VideoController;-><init>(Landroid/content/Context;B)V

    iput-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->b:Lkik/android/widget/VideoController;

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    iget-object v2, p0, Lkik/android/chat/fragment/WebVideoFragment;->b:Lkik/android/widget/VideoController;

    invoke-virtual {v0, v2}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/VideoController;)V

    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    new-instance v2, Lkik/android/chat/fragment/tp;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/tp;-><init>(Lkik/android/chat/fragment/WebVideoFragment;)V

    invoke-virtual {v0, v2}, Lkik/android/widget/WebVideoView;->a(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    new-instance v2, Lkik/android/chat/fragment/tq;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/tq;-><init>(Lkik/android/chat/fragment/WebVideoFragment;)V

    invoke-virtual {v0, v2}, Lkik/android/widget/WebVideoView;->a(Lkik/android/widget/cv;)V

    new-instance v0, Lkik/android/chat/fragment/tr;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/tr;-><init>(Lkik/android/chat/fragment/WebVideoFragment;)V

    iget-object v2, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v2, v0}, Lkik/android/widget/WebVideoView;->a(Landroid/media/MediaPlayer$OnInfoListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->_errorLayout:Landroid/view/ViewGroup;

    const v2, 0x7f0e009f

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v2, Lkik/android/chat/fragment/ts;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/ts;-><init>(Lkik/android/chat/fragment/WebVideoFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->e:Landroid/view/ViewGroup;

    new-instance v2, Lkik/android/chat/fragment/tt;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/tt;-><init>(Lkik/android/chat/fragment/WebVideoFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->l()V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->_loadingLayout:Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->a()V

    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    .line 60
    :cond_1
    :goto_0
    return-object v1

    .line 59
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->c()V

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 282
    invoke-super {p0}, Lcom/kik/ui/fragment/FragmentBase;->onDestroy()V

    .line 285
    iget-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->g:Z

    if-eqz v0, :cond_0

    .line 286
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->u()V

    .line 288
    :cond_0
    return-void
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    .line 269
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->n()V

    .line 270
    iget-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->a:Z

    if-eqz v0, :cond_0

    .line 271
    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    .line 273
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->e:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    if-eqz v0, :cond_1

    .line 274
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->e:Landroid/view/ViewGroup;

    iget-object v1, p0, Lkik/android/chat/fragment/WebVideoFragment;->d:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 276
    :cond_1
    invoke-super {p0}, Lcom/kik/ui/fragment/FragmentBase;->onDestroyView()V

    .line 277
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 241
    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    .line 242
    invoke-super {p0}, Lcom/kik/ui/fragment/FragmentBase;->onPause()V

    .line 243
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 234
    invoke-super {p0}, Lcom/kik/ui/fragment/FragmentBase;->onResume()V

    .line 235
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->f:Z

    .line 236
    return-void
.end method

.method public final v()Z
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lkik/android/chat/fragment/WebVideoFragment;->c:Lcom/kik/cards/web/video/b;

    invoke-virtual {v0}, Lcom/kik/cards/web/video/b;->i()V

    .line 262
    invoke-virtual {p0}, Lkik/android/chat/fragment/WebVideoFragment;->a()V

    .line 263
    const/4 v0, 0x1

    return v0
.end method
