.class public Lkik/android/chat/fragment/KikConversationsFragment;
.super Lkik/android/chat/fragment/ConversationsBaseFragment;
.source "SourceFile"

# interfaces
.implements Lkik/android/widget/PullToRevealView$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/KikConversationsFragment$a;
    }
.end annotation


# instance fields
.field private A:Lcom/kik/view/adapters/t;

.field private B:Lcom/kik/view/adapters/t;

.field private C:Lcom/kik/view/adapters/ap;

.field private D:Lkik/android/chat/fragment/KikConversationsFragment$a;

.field private final E:Landroid/os/Handler;

.field private F:Landroid/animation/AnimatorSet;

.field private G:Lkik/android/chat/fragment/ScanCodeTabFragment;

.field private H:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

.field protected _animationContainer:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0043
    .end annotation
.end field

.field protected _composeButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0055
    .end annotation
.end field

.field protected _composeButtonShadow:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0054
    .end annotation
.end field

.field protected _conversationsTopbar:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e004d
    .end annotation
.end field

.field protected _missedConvoButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0050
    .end annotation
.end field

.field protected _missedConvosNotification:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0052
    .end annotation
.end field

.field protected _missedConvosTitle:Landroid/widget/TextView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0053
    .end annotation
.end field

.field protected _navBarShadow:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e004f
    .end annotation
.end field

.field protected _pullToScan:Lkik/android/widget/PullToRevealView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0049
    .end annotation
.end field

.field protected _pullToScanHeader:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e004a
    .end annotation
.end field

.field protected _pullToScanHint:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0044
    .end annotation
.end field

.field protected _settingsButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e0036
    .end annotation
.end field

.field protected _statusbarUnderlay:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e004c
    .end annotation
.end field

.field protected _webButton:Landroid/view/View;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f0e004e
    .end annotation
.end field

.field public l:Lcom/kik/d/f;

.field protected m:Lkik/android/util/ck;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected n:Lkik/a/e/b;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected o:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected p:Lkik/a/a/c;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected q:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected r:Lkik/android/util/ar;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected s:Lkik/a/e/q;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected t:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private x:J

.field private y:Z

.field private z:Lcom/kik/view/adapters/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/ConversationsBaseFragment;-><init>()V

    .line 108
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    .line 110
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->E:Landroid/os/Handler;

    .line 134
    new-instance v0, Lkik/android/chat/fragment/jo;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/jo;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->H:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    .line 1107
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 1

    .prologue
    .line 89
    new-instance v0, Lkik/android/chat/fragment/ju;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/ju;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikConversationsFragment;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 89
    new-instance v0, Lkik/android/chat/fragment/kg;

    invoke-direct {v0, p0, p1}, Lkik/android/chat/fragment/kg;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;I)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment;->b(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-eqz v0, :cond_0

    iput-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    :cond_0
    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikConversationsFragment;JLjava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->f:Lcom/kik/android/a;

    const-string v1, "Video Trimmer Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Forced"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Video Length"

    invoke-virtual {v0, v1, p1, p2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is From Intent"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-static {v0, p3}, Lkik/android/util/by;->b(Lcom/kik/android/a$f;Ljava/lang/String;)V

    new-instance v0, Lkik/android/chat/fragment/VideoTrimmingFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/VideoTrimmingFragment$a;-><init>()V

    invoke-virtual {v0, p3}, Lkik/android/chat/fragment/VideoTrimmingFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/VideoTrimmingFragment$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lkik/android/chat/fragment/VideoTrimmingFragment$a;->a(J)Lkik/android/chat/fragment/VideoTrimmingFragment$a;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/kb;

    invoke-direct {v1, p0, p1, p2, p3}, Lkik/android/chat/fragment/kb;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-void
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikConversationsFragment;)Z
    .locals 1

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikConversationsFragment;)Lkik/android/chat/fragment/ScanCodeTabFragment;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->h()V

    return-void
.end method

.method private e()Z
    .locals 2

    .prologue
    .line 639
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->p:Lkik/a/a/c;

    const-string v1, "browser_button_removal"

    invoke-virtual {v0, v1}, Lkik/a/a/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 641
    if-eqz v0, :cond_0

    const-string v1, "hide"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikConversationsFragment;)Z
    .locals 1

    .prologue
    .line 89
    iget-boolean v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->y:Z

    return v0
.end method

.method private f()V
    .locals 5

    .prologue
    .line 784
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 785
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->b:Lkik/a/e/r;

    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->c:Lkik/a/e/v;

    invoke-virtual {v0, v1, v2, v3, v4}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Landroid/app/Activity;Lkik/a/e/r;Lkik/a/e/v;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/ka;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ka;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 798
    :goto_0
    return-void

    .line 794
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/SendToFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/SendToFragment$a;-><init>()V

    .line 795
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/SendToFragment$a;->a(Z)Lkik/android/chat/fragment/SendToFragment$a;

    .line 796
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 4

    .prologue
    .line 89
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->ac()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    const v1, 0x7f090029

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikConversationsFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f0902e4

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090299

    new-instance v3, Lkik/android/chat/fragment/jz;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/jz;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f0902c5

    new-instance v3, Lkik/android/chat/fragment/jy;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/jy;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    new-instance v2, Lkik/android/chat/fragment/jx;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/jx;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Landroid/content/DialogInterface$OnCancelListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->y:Z

    iget-object v0, v0, Lkik/android/chat/fragment/KikDialogFragment$a;->a:Lkik/android/chat/fragment/KikDialogFragment;

    sget-object v1, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v2, "addr2"

    invoke-virtual {p0, v0, v1, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 924
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->z:Lcom/kik/view/adapters/t;

    if-eqz v0, :cond_0

    .line 929
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/kh;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kh;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 939
    :cond_0
    return-void
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikConversationsFragment;)Z
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->y:Z

    return v0
.end method

.method private h()V
    .locals 10

    .prologue
    const v9, 0x7f0d0021

    const/high16 v7, -0x80000000

    const/4 v8, 0x1

    const/4 v0, 0x0

    .line 998
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    if-nez v1, :cond_0

    .line 1059
    :goto_0
    return-void

    .line 1002
    :cond_0
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 1003
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->L()I

    move-result v1

    if-eqz v3, :cond_1

    if-lez v1, :cond_1

    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    iget-object v5, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v5}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v5, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    iget-object v6, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v6}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v6, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Landroid/widget/ListView;->measure(II)V

    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v4}, Landroid/widget/ListView;->getMeasuredHeight()I

    move-result v4

    iget-object v5, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v5}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v6, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v6}, Landroid/widget/ListView;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0d0023

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    sub-int v3, v5, v3

    if-ge v4, v3, :cond_1

    move v1, v0

    .line 1005
    :cond_1
    if-lez v1, :cond_6

    .line 1006
    iget-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v3}, Lkik/android/widget/PullToRevealView;->a()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1007
    new-array v3, v8, [Landroid/view/View;

    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    aput-object v4, v3, v0

    invoke-static {v3}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 1013
    :goto_1
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 1014
    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-static {v4}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v4

    invoke-virtual {v4, v3}, Lkik/android/util/cv$b;->b(I)Lkik/android/util/cv$b;

    .line 1016
    iget-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->B()Ljava/util/List;

    move-result-object v3

    .line 1017
    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v4}, Lkik/a/e/i;->C()Ljava/util/List;

    move-result-object v4

    .line 1018
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v3, v4

    .line 1021
    if-ne v3, v8, :cond_4

    .line 1022
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f090198

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1027
    :goto_2
    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1029
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->D()I

    move-result v0

    .line 1030
    if-le v1, v0, :cond_5

    .line 1031
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosTitle:Landroid/widget/TextView;

    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosTitle:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070064

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 1032
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosNotification:Landroid/widget/ImageView;

    const v2, 0x7f070066

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1044
    :cond_2
    :goto_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(I)V

    .line 1046
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    new-instance v1, Lkik/android/chat/fragment/ki;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ki;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 1010
    :cond_3
    new-array v3, v8, [Landroid/view/View;

    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    aput-object v4, v3, v0

    invoke-static {v3}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_1

    .line 1025
    :cond_4
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f090163

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v0

    invoke-virtual {v2, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 1035
    :cond_5
    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosNotification:Landroid/widget/ImageView;

    const v3, 0x7f070065

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1036
    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosTitle:Landroid/widget/TextView;

    iget-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvosTitle:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f070063

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 1037
    if-ge v1, v0, :cond_2

    .line 1041
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0, v1}, Lkik/a/e/i;->b(I)V

    goto :goto_3

    .line 1056
    :cond_6
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-static {v1}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lkik/android/util/cv$b;->b(I)Lkik/android/util/cv$b;

    .line 1057
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_missedConvoButton:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikConversationsFragment;)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->f()V

    return-void
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikConversationsFragment;)Lcom/kik/view/adapters/t;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->z:Lcom/kik/view/adapters/t;

    return-object v0
.end method


# virtual methods
.method public final M()Z
    .locals 1

    .prologue
    .line 1104
    const/4 v0, 0x1

    return v0
.end method

.method public final a()I
    .locals 1

    .prologue
    .line 1077
    const/4 v0, 0x1

    return v0
.end method

.method public final a(F)V
    .locals 8

    .prologue
    const/high16 v4, 0x43b40000    # 360.0f

    .line 494
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getView()Landroid/view/View;

    move-result-object v2

    .line 495
    if-nez v2, :cond_0

    .line 533
    :goto_0
    return-void

    .line 498
    :cond_0
    const v0, 0x7f0e0046

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 499
    const v1, 0x7f0e0047

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 501
    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setPivotX(F)V

    .line 502
    invoke-virtual {v0}, Landroid/widget/ImageView;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setPivotY(F)V

    .line 504
    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setPivotX(F)V

    .line 505
    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setPivotY(F)V

    .line 507
    mul-float v3, p1, v4

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setRotation(F)V

    .line 508
    neg-float v0, p1

    mul-float/2addr v0, v4

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setRotation(F)V

    .line 510
    invoke-static {}, Lkik/android/chat/b/a;->a()I

    move-result v0

    .line 511
    const v3, 0x7f0c002b

    invoke-static {v3}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v3

    .line 513
    invoke-static {v0, v3, p1}, Lkik/android/util/aa;->a(IIF)I

    move-result v3

    .line 515
    const v0, 0x7f0e0048

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 518
    const v2, 0x7f0d0023

    invoke-static {v2}, Lkik/android/chat/KikApplication;->d(I)I

    move-result v2

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->N()I

    move-result v4

    add-int/2addr v2, v4

    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v2, v4

    invoke-static {}, Lkik/android/widget/PullToRevealView;->f()I

    move-result v4

    iget-object v5, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHint:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    add-int/2addr v1, v4

    int-to-float v1, v1

    mul-float/2addr v1, p1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    float-to-int v1, v1

    add-int/2addr v1, v2

    .line 523
    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHint:Landroid/view/View;

    invoke-static {v2}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lkik/android/util/cv$b;->a(I)Lkik/android/util/cv$b;

    .line 525
    float-to-double v4, p1

    const-wide v6, 0x3fe6666666666666L    # 0.7

    cmpl-double v1, v4, v6

    if-lez v1, :cond_1

    .line 526
    const v1, 0x7f0901f6

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 532
    :goto_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    goto/16 :goto_0

    .line 529
    :cond_1
    const v1, 0x7f0901db

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method

.method public final a(Landroid/widget/AbsListView;III)V
    .locals 3

    .prologue
    .line 673
    invoke-super {p0, p1, p2, p3, p4}, Lkik/android/chat/fragment/ConversationsBaseFragment;->a(Landroid/widget/AbsListView;III)V

    .line 674
    if-nez p1, :cond_1

    .line 690
    :cond_0
    :goto_0
    return-void

    .line 677
    :cond_1
    add-int v0, p2, p3

    if-ne v0, p4, :cond_0

    .line 678
    invoke-virtual {p1}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 679
    if-eqz v0, :cond_0

    .line 682
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getHeight()I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getScrollY()I

    move-result v2

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_0

    .line 684
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->D()I

    move-result v0

    .line 685
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->L()I

    move-result v1

    if-le v1, v0, :cond_0

    .line 686
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->L()I

    move-result v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->b(I)V

    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->h()V

    goto :goto_0
.end method

.method public final b(Lkik/a/d/f;)V
    .locals 1

    .prologue
    .line 943
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->A()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment;->a(I)V

    .line 944
    return-void
.end method

.method public final b(Z)V
    .locals 13

    .prologue
    .line 948
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    if-nez v0, :cond_0

    .line 994
    :goto_0
    return-void

    .line 951
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->B()Ljava/util/List;

    move-result-object v2

    .line 952
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->C()Ljava/util/List;

    move-result-object v11

    .line 953
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->a:Lkik/a/e/i;

    invoke-interface {v0}, Lkik/a/e/i;->A()Ljava/util/List;

    move-result-object v12

    .line 954
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->q:Lcom/kik/l/ab;

    invoke-interface {v0}, Lcom/kik/l/ab;->a()Lcom/kik/cache/ad;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->t:Lcom/kik/cache/ad;

    .line 955
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->z:Lcom/kik/view/adapters/t;

    if-nez v0, :cond_1

    .line 956
    new-instance v0, Lcom/kik/view/adapters/t;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->t:Lcom/kik/cache/ad;

    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->b:Lkik/a/e/r;

    iget-object v5, p0, Lkik/android/chat/fragment/KikConversationsFragment;->d:Lkik/a/e/l;

    iget-object v6, p0, Lkik/android/chat/fragment/KikConversationsFragment;->e:Lkik/a/e/n;

    iget-object v7, p0, Lkik/android/chat/fragment/KikConversationsFragment;->f:Lcom/kik/android/a;

    invoke-direct/range {v0 .. v7}, Lcom/kik/view/adapters/t;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/kik/cache/ad;Lkik/a/e/r;Lkik/a/e/l;Lkik/a/e/n;Lcom/kik/android/a;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->A:Lcom/kik/view/adapters/t;

    .line 957
    new-instance v3, Lcom/kik/view/adapters/t;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget-object v6, p0, Lkik/android/chat/fragment/KikConversationsFragment;->t:Lcom/kik/cache/ad;

    iget-object v7, p0, Lkik/android/chat/fragment/KikConversationsFragment;->b:Lkik/a/e/r;

    iget-object v8, p0, Lkik/android/chat/fragment/KikConversationsFragment;->d:Lkik/a/e/l;

    iget-object v9, p0, Lkik/android/chat/fragment/KikConversationsFragment;->e:Lkik/a/e/n;

    iget-object v10, p0, Lkik/android/chat/fragment/KikConversationsFragment;->f:Lcom/kik/android/a;

    move-object v5, v11

    invoke-direct/range {v3 .. v10}, Lcom/kik/view/adapters/t;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/kik/cache/ad;Lkik/a/e/r;Lkik/a/e/l;Lkik/a/e/n;Lcom/kik/android/a;)V

    iput-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->B:Lcom/kik/view/adapters/t;

    .line 958
    new-instance v3, Lcom/kik/view/adapters/t;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget-object v6, p0, Lkik/android/chat/fragment/KikConversationsFragment;->t:Lcom/kik/cache/ad;

    iget-object v7, p0, Lkik/android/chat/fragment/KikConversationsFragment;->b:Lkik/a/e/r;

    iget-object v8, p0, Lkik/android/chat/fragment/KikConversationsFragment;->d:Lkik/a/e/l;

    iget-object v9, p0, Lkik/android/chat/fragment/KikConversationsFragment;->e:Lkik/a/e/n;

    iget-object v10, p0, Lkik/android/chat/fragment/KikConversationsFragment;->f:Lcom/kik/android/a;

    move-object v5, v12

    invoke-direct/range {v3 .. v10}, Lcom/kik/view/adapters/t;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/kik/cache/ad;Lkik/a/e/r;Lkik/a/e/l;Lkik/a/e/n;Lcom/kik/android/a;)V

    iput-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->z:Lcom/kik/view/adapters/t;

    .line 959
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->g()V

    .line 961
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->B:Lcom/kik/view/adapters/t;

    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->a()V

    .line 962
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->A:Lcom/kik/view/adapters/t;

    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->a()V

    .line 964
    new-instance v0, Lcom/kik/view/adapters/ap;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kik/view/adapters/ap;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->C:Lcom/kik/view/adapters/ap;

    .line 965
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->C:Lcom/kik/view/adapters/ap;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->z:Lcom/kik/view/adapters/t;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/ap;->c(Landroid/widget/Adapter;)V

    .line 966
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->C:Lcom/kik/view/adapters/ap;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->A:Lcom/kik/view/adapters/t;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/ap;->a(Landroid/widget/Adapter;)V

    .line 967
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->C:Lcom/kik/view/adapters/ap;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->B:Lcom/kik/view/adapters/t;

    invoke-virtual {v0, v1}, Lcom/kik/view/adapters/ap;->b(Landroid/widget/Adapter;)V

    .line 969
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_2

    .line 970
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->C:Lcom/kik/view/adapters/ap;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 973
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->A:Lcom/kik/view/adapters/t;

    invoke-virtual {v0, v2}, Lcom/kik/view/adapters/t;->a(Ljava/util/List;)V

    .line 974
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->B:Lcom/kik/view/adapters/t;

    invoke-virtual {v0, v11}, Lcom/kik/view/adapters/t;->a(Ljava/util/List;)V

    .line 975
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->B:Lcom/kik/view/adapters/t;

    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->notifyDataSetChanged()V

    .line 976
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->A:Lcom/kik/view/adapters/t;

    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->notifyDataSetChanged()V

    .line 977
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->z:Lcom/kik/view/adapters/t;

    invoke-virtual {v0, v12}, Lcom/kik/view/adapters/t;->a(Ljava/util/List;)V

    .line 978
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->z:Lcom/kik/view/adapters/t;

    invoke-virtual {v0}, Lcom/kik/view/adapters/t;->notifyDataSetChanged()V

    .line 979
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->C:Lcom/kik/view/adapters/ap;

    invoke-virtual {v0}, Lcom/kik/view/adapters/ap;->notifyDataSetChanged()V

    .line 982
    if-nez p1, :cond_3

    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->x:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xc8

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    .line 983
    :cond_3
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->x:J

    .line 990
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 991
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->requestFocus()Z

    .line 993
    :cond_4
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->h()V

    goto/16 :goto_0
.end method

.method protected final b()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 470
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    if-nez v1, :cond_1

    .line 478
    :cond_0
    :goto_0
    return v0

    .line 473
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v1}, Lkik/android/widget/PullToRevealView;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 474
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v0}, Lkik/android/widget/PullToRevealView;->d()V

    .line 475
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final c()V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x2

    .line 538
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    if-nez v0, :cond_0

    .line 586
    :goto_0
    return-void

    .line 542
    :cond_0
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->c(I)V

    .line 545
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->E:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 546
    new-array v0, v4, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/ScanCodeTabFragment;->getView()Landroid/view/View;

    move-result-object v1

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 548
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->b()V

    .line 550
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 552
    new-array v1, v2, [Landroid/view/View;

    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHint:Landroid/view/View;

    aput-object v2, v1, v3

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 554
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButton:Landroid/view/View;

    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v3, v4, [F

    fill-array-data v3, :array_0

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 555
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_navBarShadow:Landroid/view/View;

    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v3, v4, [F

    fill-array-data v3, :array_1

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 556
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_conversationsTopbar:Landroid/view/View;

    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v3, v4, [F

    fill-array-data v3, :array_2

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->e()Z

    move-result v1

    if-nez v1, :cond_1

    .line 558
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v3, v4, [F

    fill-array-data v3, :array_3

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 560
    :cond_1
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_settingsButton:Landroid/view/View;

    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v3, v4, [F

    fill-array-data v3, :array_4

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 562
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    sget-object v2, Landroid/view/View;->ALPHA:Landroid/util/Property;

    new-array v3, v4, [F

    fill-array-data v3, :array_5

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 563
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 565
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Landroid/animation/ObjectAnimator;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/animation/ObjectAnimator;

    .line 566
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    .line 567
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 568
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 570
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    new-instance v1, Lkik/android/chat/fragment/js;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/js;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 585
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto/16 :goto_0

    .line 554
    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 555
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 556
    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 558
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 560
    :array_4
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 562
    :array_5
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final d()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 591
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    if-nez v0, :cond_0

    .line 635
    :goto_0
    return-void

    .line 594
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_1

    .line 596
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    .line 597
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 598
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->F:Landroid/animation/AnimatorSet;

    .line 601
    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment;->c(I)V

    .line 603
    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButton:Landroid/view/View;

    aput-object v1, v0, v4

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_statusbarUnderlay:Landroid/view/View;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_navBarShadow:Landroid/view/View;

    aput-object v1, v0, v5

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButtonShadow:Landroid/view/View;

    aput-object v1, v0, v6

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_conversationsTopbar:Landroid/view/View;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_settingsButton:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 605
    const/4 v0, 0x6

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButton:Landroid/view/View;

    aput-object v1, v0, v4

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_statusbarUnderlay:Landroid/view/View;

    aput-object v1, v0, v3

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_navBarShadow:Landroid/view/View;

    aput-object v1, v0, v5

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_composeButtonShadow:Landroid/view/View;

    aput-object v1, v0, v6

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_conversationsTopbar:Landroid/view/View;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    iget-object v2, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_settingsButton:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->c([Landroid/view/View;)V

    .line 608
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 609
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 610
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    aput-object v1, v0, v4

    invoke-static {v0}, Lkik/android/util/cv;->c([Landroid/view/View;)V

    .line 613
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->E:Landroid/os/Handler;

    new-instance v1, Lkik/android/chat/fragment/jt;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/jt;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 634
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-static {v0}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lkik/android/util/cv$b;->b(I)Lkik/android/util/cv$b;

    goto/16 :goto_0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 225
    invoke-super {p0, p1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 227
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->f()V

    .line 228
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .prologue
    .line 1083
    invoke-super {p0, p1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1084
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    .line 1085
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/kj;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kj;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/ListView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1093
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 171
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikConversationsFragment;)V

    .line 172
    invoke-super {p0, p1}, Lkik/android/chat/fragment/ConversationsBaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 173
    invoke-static {}, Lkik/android/chat/KikApplication;->i()Lkik/android/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->l:Lcom/kik/d/f;

    .line 174
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->r:Lkik/android/util/ar;

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "kik.FIRST_OPENDATE"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->c:Lkik/a/e/v;

    const-string v1, "kik.FIRST_OPENDATE"

    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Long;)Z

    .line 175
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 232
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->c:Lkik/a/e/v;

    const-string v1, "kik.web.home.preloaded"

    invoke-interface {v0, v1}, Lkik/a/e/v;->y(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 233
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->c:Lkik/a/e/v;

    const-string v1, "kik.web.home.preloaded"

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    .line 234
    const-string v0, "https://home.kik.com/"

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v4, p0, Lkik/android/chat/fragment/KikConversationsFragment;->s:Lkik/a/e/q;

    invoke-static {v0, v1, v4}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Ljava/lang/String;Landroid/content/Context;Lkik/a/e/q;)Lcom/kik/g/p;

    .line 239
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->o:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/aa;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->o:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->f()V

    .line 242
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->n:Lkik/a/e/b;

    invoke-interface {v0}, Lkik/a/e/b;->c()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/kk;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kk;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 254
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->j()V

    .line 258
    const v0, 0x7f03000a

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    .line 259
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    invoke-static {p0, v0}, Lbutterknife/ButterKnife;->inject(Ljava/lang/Object;Landroid/view/View;)V

    .line 260
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Landroid/os/Bundle;)V

    .line 269
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 270
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v4

    .line 272
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-direct {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    .line 273
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;-><init>()V

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->a:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Lkik/android/chat/fragment/ScanCodeTabFragment$c;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Z)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->f()Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v0

    .line 277
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    iget-object v5, p0, Lkik/android/chat/fragment/KikConversationsFragment;->H:Lkik/android/chat/fragment/ScanCodeTabFragment$b;

    invoke-virtual {v1, v5}, Lkik/android/chat/fragment/ScanCodeTabFragment;->a(Lkik/android/chat/fragment/ScanCodeTabFragment$b;)V

    .line 278
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->i()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->setArguments(Landroid/os/Bundle;)V

    .line 280
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    const v1, 0x7f0e004c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 282
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->N()I

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 284
    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v1}, Lkik/android/widget/PullToRevealView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 285
    iget v6, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v6, v5

    iput v6, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 286
    iget-object v6, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v6, v1}, Lkik/android/widget/PullToRevealView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 288
    invoke-static {v0, v5}, Lkik/android/util/cv;->b(Landroid/view/View;I)V

    .line 290
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_animationContainer:Landroid/view/View;

    invoke-static {}, Lkik/android/chat/b/a;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 292
    const v0, 0x7f0e0042

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-virtual {v4, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 293
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 295
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    const v1, 0x7f0e004b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    .line 297
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Lkik/android/widget/PullToRevealView;->a(Landroid/widget/ListView;)V

    .line 298
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScanHeader:Landroid/view/View;

    invoke-virtual {v0, v1}, Lkik/android/widget/PullToRevealView;->a(Landroid/view/View;)V

    .line 299
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v0, p0}, Lkik/android/widget/PullToRevealView;->a(Lkik/android/widget/PullToRevealView$a;)V

    .line 301
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    const-string v1, "AUTOMATION_CONVERSATIONS_LIST"

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 303
    const/16 v0, 0x9

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 304
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    invoke-virtual {v0, v7}, Landroid/widget/ListView;->setOverscrollFooter(Landroid/graphics/drawable/Drawable;)V

    .line 307
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    const v4, 0x7f0e003e

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 309
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/kl;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kl;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 317
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/km;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/km;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 335
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    new-instance v1, Lkik/android/chat/fragment/kn;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kn;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 345
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    const v1, 0x7f0e0055

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 346
    new-instance v1, Lkik/android/chat/fragment/ko;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ko;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 355
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    const v1, 0x7f0e004e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 356
    const-string v1, "AUTOMATION_CONVERSATION_WEB_BUTTON"

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 357
    new-instance v1, Lkik/android/chat/fragment/kp;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kp;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 378
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    const v1, 0x7f0e0036

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 379
    new-instance v1, Lkik/android/chat/fragment/kq;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kq;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->j:Landroid/widget/ListView;

    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v7, v3}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 399
    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikConversationsFragment;->b(Z)V

    .line 403
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->S:Lkik/a/e/f;

    invoke-interface {v0}, Lkik/a/e/f;->o()V

    .line 405
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Lkik/android/chat/fragment/KikConversationsFragment$a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 406
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Lkik/android/chat/fragment/KikConversationsFragment$a;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v4

    invoke-static {v0}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 408
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->b(Lkik/android/chat/fragment/KikConversationsFragment$a;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->e()Lkik/a/d/a/a;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lkik/android/f/a/f;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    :cond_4
    move v0, v3

    :goto_0
    if-eqz v0, :cond_a

    .line 409
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->f()V

    .line 415
    :cond_5
    :goto_1
    invoke-static {}, Lkik/android/util/u;->d()Z

    move-result v0

    if-nez v0, :cond_6

    .line 418
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v0}, Lkik/android/widget/PullToRevealView;->b()V

    .line 421
    :cond_6
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->c:Lkik/a/e/v;

    const-string v1, "kik.scan.hint.display"

    invoke-interface {v0, v1}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Lkik/android/util/u;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 422
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->c:Lkik/a/e/v;

    const-string v1, "kik.scan.hint.display"

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    .line 423
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    new-instance v1, Lkik/android/chat/fragment/jp;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/jp;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/PullToRevealView;->post(Ljava/lang/Runnable;)Z

    .line 433
    :cond_7
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->m:Lkik/android/util/ck;

    sget-object v1, Lkik/android/util/ck$b;->c:Lkik/android/util/ck$b;

    invoke-virtual {v0, v1}, Lkik/android/util/ck;->a(Lkik/android/util/ck$b;)V

    .line 435
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->d(Lkik/android/chat/fragment/KikConversationsFragment$a;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 436
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Z)Lkik/android/chat/fragment/KikConversationsFragment$a;

    new-instance v0, Lkik/android/chat/fragment/jq;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/jq;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment;->b(Ljava/lang/Runnable;)V

    .line 439
    :cond_8
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    return-object v0

    :cond_9
    move v0, v2

    .line 408
    goto :goto_0

    .line 411
    :cond_a
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/f/a/f;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->c(Lkik/android/chat/fragment/KikConversationsFragment$a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 412
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0901bf

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0900c9

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    const v1, 0x7f090299

    invoke-static {v1}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lkik/android/chat/fragment/kd;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/kd;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1, v3}, Lkik/android/chat/fragment/ProgressDialogFragment;->c(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    new-instance v1, Lkik/android/chat/fragment/ke;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/ke;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->a(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    invoke-static {}, Lkik/android/q;->a()Lkik/android/q;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->c(Lkik/android/chat/fragment/KikConversationsFragment$a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v3, p0, Lkik/android/chat/fragment/KikConversationsFragment;->k:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lkik/android/q;->a(Landroid/net/Uri;Landroid/content/Context;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/kf;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kf;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->D:Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-virtual {v0, v7}, Lkik/android/chat/fragment/KikConversationsFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikConversationsFragment$a;

    goto/16 :goto_1
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 695
    invoke-super {p0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->onPause()V

    .line 697
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->h:Lkik/android/chat/fragment/ProgressDialogFragment;

    if-nez v0, :cond_0

    .line 698
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->w()V

    .line 700
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 180
    invoke-super {p0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->onResume()V

    .line 182
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->G:Lkik/android/chat/fragment/ScanCodeTabFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 184
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_pullToScan:Lkik/android/widget/PullToRevealView;

    invoke-virtual {v0}, Lkik/android/widget/PullToRevealView;->c()V

    .line 186
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikConversationsFragment;->c(I)V

    .line 189
    :cond_1
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->g()V

    .line 192
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->n:Lkik/a/e/b;

    invoke-interface {v0}, Lkik/a/e/b;->c()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/kc;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/kc;-><init>(Lkik/android/chat/fragment/KikConversationsFragment;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 209
    invoke-direct {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 210
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 211
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 220
    :cond_2
    :goto_0
    return-void

    .line 215
    :cond_3
    iget-object v0, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 216
    new-array v0, v3, [Landroid/view/View;

    iget-object v1, p0, Lkik/android/chat/fragment/KikConversationsFragment;->_webButton:Landroid/view/View;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_0
.end method

.method public final v()Z
    .locals 1

    .prologue
    .line 484
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikConversationsFragment;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 485
    const/4 v0, 0x1

    .line 488
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lkik/android/chat/fragment/ConversationsBaseFragment;->v()Z

    move-result v0

    goto :goto_0
.end method

.method public final y()I
    .locals 1

    .prologue
    .line 1098
    const v0, 0x7f0c0077

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v0

    return v0
.end method
