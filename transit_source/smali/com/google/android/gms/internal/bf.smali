.class public final Lcom/google/android/gms/internal/bf;
.super Lcom/google/android/gms/internal/bn$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/bf$b;,
        Lcom/google/android/gms/internal/bf$a;
    }
.end annotation


# instance fields
.field private final fD:Landroid/app/Activity;

.field private fE:Lcom/google/android/gms/internal/bh;

.field private fF:Lcom/google/android/gms/internal/bj;

.field private fG:Lcom/google/android/gms/internal/cq;

.field private fH:Lcom/google/android/gms/internal/bf$b;

.field private fI:Lcom/google/android/gms/internal/bk;

.field private fJ:Landroid/widget/FrameLayout;

.field private fK:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private fL:Z

.field private fM:Z

.field private fN:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/bn$a;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fL:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fM:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    return-void
.end method

.method private T()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fM:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fM:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->as()V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fH:Lcom/google/android/gms/internal/bf$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cq;->i(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fH:Lcom/google/android/gms/internal/bf$b;

    iget-object v0, v0, Lcom/google/android/gms/internal/bf$b;->fQ:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    iget-object v2, p0, Lcom/google/android/gms/internal/bf;->fH:Lcom/google/android/gms/internal/bf$b;

    iget v2, v2, Lcom/google/android/gms/internal/bf$b;->index:I

    iget-object v3, p0, Lcom/google/android/gms/internal/bf;->fH:Lcom/google/android/gms/internal/bf$b;

    iget-object v3, v3, Lcom/google/android/gms/internal/bf$b;->fP:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fT:Lcom/google/android/gms/internal/bi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fT:Lcom/google/android/gms/internal/bi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bi;->B()V

    goto :goto_0
.end method

.method private static a(IIII)Landroid/widget/RelativeLayout$LayoutParams;
    .locals 2

    const/4 v1, 0x0

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, p2, p3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p0, p1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/bh;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms.ads.AdActivity"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    iget-object v2, p1, Lcom/google/android/gms/internal/bh;->eg:Lcom/google/android/gms/internal/co;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/co;->hS:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/bh;->a(Landroid/content/Intent;Lcom/google/android/gms/internal/bh;)V

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private e(Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/bf$a;
        }
    .end annotation

    const/16 v1, 0x400

    const/4 v11, -0x1

    const/4 v2, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget v1, v1, Lcom/google/android/gms/internal/bh;->orientation:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/bf;->setRequestedOrientation(I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v1, v3, :cond_0

    const-string v1, "Enabling hardware acceleration on the AdActivity window."

    invoke-static {v1}, Lcom/google/android/gms/internal/cn;->m(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/cj;->a(Landroid/view/Window;)V

    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fU:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->aw()Lcom/google/android/gms/internal/cr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cr;->aD()Z

    move-result v3

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v1, v1, Lcom/google/android/gms/internal/bh;->fU:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/cq;->av()Lcom/google/android/gms/internal/x;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v5, v5, Lcom/google/android/gms/internal/bh;->eg:Lcom/google/android/gms/internal/co;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/cq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/x;ZZLcom/google/android/gms/internal/h;Lcom/google/android/gms/internal/co;)Lcom/google/android/gms/internal/cq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->aw()Lcom/google/android/gms/internal/cr;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v8, v0, Lcom/google/android/gms/internal/bh;->fV:Lcom/google/android/gms/internal/ag;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v9, v0, Lcom/google/android/gms/internal/bh;->fZ:Lcom/google/android/gms/internal/bl;

    move-object v6, v4

    move-object v7, v4

    move v10, v2

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/cr;->a(Lcom/google/android/gms/internal/q;Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/ag;Lcom/google/android/gms/internal/bl;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->aw()Lcom/google/android/gms/internal/cr;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/bf$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/bf$1;-><init>(Lcom/google/android/gms/internal/bf;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cr;->a(Lcom/google/android/gms/internal/cr$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fz:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v1, v1, Lcom/google/android/gms/internal/bh;->fz:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cq;->loadUrl(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/cq;->a(Lcom/google/android/gms/internal/bf;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0, v1, v11, v11}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->at()V

    :cond_1
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/bf;->c(Z)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fY:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v5, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v6, v0, Lcom/google/android/gms/internal/bh;->fW:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v7, v0, Lcom/google/android/gms/internal/bh;->fY:Ljava/lang/String;

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    move-object v10, v4

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/cq;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/bf$a;

    const-string v1, "No URL or HTML to display in ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bf$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fU:Lcom/google/android/gms/internal/cq;

    iput-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cq;->setContext(Landroid/content/Context;)V

    goto :goto_0
.end method


# virtual methods
.method public Q()Lcom/google/android/gms/internal/bj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    return-object v0
.end method

.method public R()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget v0, v0, Lcom/google/android/gms/internal/bh;->orientation:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bf;->setRequestedOrientation(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fJ:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fJ:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iput-object v2, p0, Lcom/google/android/gms/internal/bf;->fJ:Landroid/widget/FrameLayout;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fK:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fK:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    iput-object v2, p0, Lcom/google/android/gms/internal/bf;->fK:Landroid/webkit/WebChromeClient$CustomViewCallback;

    :cond_2
    return-void
.end method

.method public S()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fI:Lcom/google/android/gms/internal/bk;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bf;->c(Z)V

    return-void
.end method

.method public a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 3

    const/4 v2, -0x1

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bf;->fJ:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fJ:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fJ:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fJ:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/bf;->fK:Landroid/webkit/WebChromeClient$CustomViewCallback;

    return-void
.end method

.method public b(IIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/bf;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bj;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public c(IIII)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/bj;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bj;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/cq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/bf;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cq;->aw()Lcom/google/android/gms/internal/cr;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/cr;->j(Z)V

    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 4

    const/4 v3, -0x2

    if-eqz p1, :cond_0

    const/16 v0, 0x32

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/bk;

    iget-object v2, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/bk;-><init>(Landroid/app/Activity;I)V

    iput-object v1, p0, Lcom/google/android/gms/internal/bf;->fI:Lcom/google/android/gms/internal/bk;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    if-eqz p1, :cond_1

    const/16 v0, 0xb

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fI:Lcom/google/android/gms/internal/bk;

    iget-object v2, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/bh;->fX:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/bk;->d(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/bf;->fI:Lcom/google/android/gms/internal/bk;

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/16 v0, 0x9

    goto :goto_1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fI:Lcom/google/android/gms/internal/bk;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fI:Lcom/google/android/gms/internal/bk;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bk;->d(Z)V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "com.google.android.gms.ads.internal.overlay.hasResumed"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fL:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/bh;->a(Landroid/content/Intent;)Lcom/google/android/gms/internal/bh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/bf$a;

    const-string v1, "Could not get info for ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bf$a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/bf$a; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bf$a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/cn;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    if-nez p1, :cond_4

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fT:Lcom/google/android/gms/internal/bi;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fT:Lcom/google/android/gms/internal/bi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bi;->C()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget v0, v0, Lcom/google/android/gms/internal/bh;->ga:I

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fS:Lcom/google/android/gms/internal/q;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v0, v0, Lcom/google/android/gms/internal/bh;->fS:Lcom/google/android/gms/internal/q;

    invoke-interface {v0}, Lcom/google/android/gms/internal/q;->y()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget v0, v0, Lcom/google/android/gms/internal/bh;->ga:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/bf$a;

    const-string v1, "Could not determine ad overlay type."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bf$a;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bf;->e(Z)V

    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/bf$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v1, v1, Lcom/google/android/gms/internal/bh;->fU:Lcom/google/android/gms/internal/cq;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bf$b;-><init>(Lcom/google/android/gms/internal/cq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bf;->fH:Lcom/google/android/gms/internal/bf$b;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bf;->e(Z)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bf;->e(Z)V

    goto :goto_0

    :pswitch_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fL:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v1, v1, Lcom/google/android/gms/internal/bh;->fR:Lcom/google/android/gms/internal/be;

    iget-object v2, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget-object v2, v2, Lcom/google/android/gms/internal/bh;->fZ:Lcom/google/android/gms/internal/bl;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/bc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/be;Lcom/google/android/gms/internal/bl;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Lcom/google/android/gms/internal/bf$a; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bj;->destroy()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fN:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/bf;->T()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fF:Lcom/google/android/gms/internal/bj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bj;->pause()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/bf;->R()V

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fH:Lcom/google/android/gms/internal/bf$b;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ci;->a(Landroid/webkit/WebView;)V

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/bf;->T()V

    return-void
.end method

.method public onRestart()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fE:Lcom/google/android/gms/internal/bh;

    iget v0, v0, Lcom/google/android/gms/internal/bh;->ga:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fL:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fG:Lcom/google/android/gms/internal/cq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ci;->b(Landroid/webkit/WebView;)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bf;->fL:Z

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "outBundle"    # Landroid/os/Bundle;

    .prologue
    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    iget-boolean v1, p0, Lcom/google/android/gms/internal/bf;->fL:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/bf;->T()V

    return-void
.end method

.method public setRequestedOrientation(I)V
    .locals 1
    .param p1, "requestedOrientation"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/bf;->fD:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method
