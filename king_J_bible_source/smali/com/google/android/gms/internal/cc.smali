.class public Lcom/google/android/gms/internal/cc;
.super Lcom/google/android/gms/internal/ck$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/cc$b;,
        Lcom/google/android/gms/internal/cc$c;,
        Lcom/google/android/gms/internal/cc$a;
    }
.end annotation


# instance fields
.field private lC:Lcom/google/android/gms/internal/dz;

.field private final nS:Landroid/app/Activity;

.field private nT:Lcom/google/android/gms/internal/ce;

.field private nU:Lcom/google/android/gms/internal/cg;

.field private nV:Lcom/google/android/gms/internal/cc$c;

.field private nW:Lcom/google/android/gms/internal/ch;

.field private nX:Z

.field private nY:Landroid/widget/FrameLayout;

.field private nZ:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private oa:Z

.field private ob:Z

.field private oc:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ck$a;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cc;->oa:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cc;->ob:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    return-void
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

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ce;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms.ads.AdActivity"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    iget-object v2, p1, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/dx;->rt:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ce;->a(Landroid/content/Intent;Lcom/google/android/gms/internal/ce;)V

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    instance-of v1, p0, Landroid/app/Activity;

    if-nez v1, :cond_0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private aN()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cc;->ob:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cc;->ob:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bF()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nV:Lcom/google/android/gms/internal/cc$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dz;->p(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nV:Lcom/google/android/gms/internal/cc$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/cc$c;->of:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v2, p0, Lcom/google/android/gms/internal/cc;->nV:Lcom/google/android/gms/internal/cc$c;

    iget v2, v2, Lcom/google/android/gms/internal/cc$c;->index:I

    iget-object v3, p0, Lcom/google/android/gms/internal/cc;->nV:Lcom/google/android/gms/internal/cc$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/cc$c;->oe:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cf;->V()V

    goto :goto_0
.end method

.method private j(Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/cc$a;
        }
    .end annotation

    const/16 v1, 0x400

    const/4 v12, -0x1

    const/4 v2, 0x1

    const/4 v4, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cc;->nX:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget v1, v1, Lcom/google/android/gms/internal/ce;->orientation:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/cc;->setRequestedOrientation(I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v1, v3, :cond_1

    const-string v1, "Enabling hardware acceleration on the AdActivity window."

    invoke-static {v1}, Lcom/google/android/gms/internal/dw;->v(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ds;->a(Landroid/view/Window;)V

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/cc$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    iget-object v3, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v3, v3, Lcom/google/android/gms/internal/ce;->or:Ljava/lang/String;

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/cc$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cc;->N()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ea;->bP()Z

    move-result v3

    if-eqz p1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v1, v1, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/dz;->R()Lcom/google/android/gms/internal/ak;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v5, v5, Lcom/google/android/gms/internal/ce;->kK:Lcom/google/android/gms/internal/dx;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/dz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;ZZLcom/google/android/gms/internal/l;Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/dz;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v8, v0, Lcom/google/android/gms/internal/ce;->ok:Lcom/google/android/gms/internal/az;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v9, v0, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v11, v0, Lcom/google/android/gms/internal/ce;->oq:Lcom/google/android/gms/internal/bc;

    move-object v6, v4

    move-object v7, v4

    move v10, v2

    invoke-virtual/range {v5 .. v11}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/cf;Lcom/google/android/gms/internal/az;Lcom/google/android/gms/internal/ci;ZLcom/google/android/gms/internal/bc;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/cc$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/cc$1;-><init>(Lcom/google/android/gms/internal/cc;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ea;->a(Lcom/google/android/gms/internal/ea$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v1, v1, Lcom/google/android/gms/internal/ce;->nO:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dz;->loadUrl(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/dz;->a(Lcom/google/android/gms/internal/cc;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0, v1, v12, v12}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    if-nez p1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bG()V

    :cond_3
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/cc;->h(Z)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v5, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v6, v0, Lcom/google/android/gms/internal/ce;->ol:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v7, v0, Lcom/google/android/gms/internal/ce;->on:Ljava/lang/String;

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    move-object v10, v4

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/dz;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/cc$a;

    const-string v1, "No URL or HTML to display in ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cc$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    iput-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dz;->setContext(Landroid/content/Context;)V

    goto :goto_0
.end method


# virtual methods
.method public N()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cc;->nX:Z

    return-void
.end method

.method public a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 3

    const/4 v2, -0x1

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cc;->nY:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nY:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nY:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nY:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cc;->N()V

    iput-object p2, p0, Lcom/google/android/gms/internal/cc;->nZ:Landroid/webkit/WebChromeClient$CustomViewCallback;

    return-void
.end method

.method public aK()Lcom/google/android/gms/internal/cg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    return-object v0
.end method

.method public aL()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget v0, v0, Lcom/google/android/gms/internal/ce;->orientation:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/cc;->setRequestedOrientation(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nY:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cc;->N()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nY:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iput-object v2, p0, Lcom/google/android/gms/internal/cc;->nY:Landroid/widget/FrameLayout;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nZ:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nZ:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    iput-object v2, p0, Lcom/google/android/gms/internal/cc;->nZ:Landroid/webkit/WebChromeClient$CustomViewCallback;

    :cond_2
    return-void
.end method

.method public aM()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nW:Lcom/google/android/gms/internal/ch;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/cc;->h(Z)V

    return-void
.end method

.method public b(IIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/cc;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cg;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public c(IIII)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/cg;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/cg;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/dz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/cc;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bI()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ea;->q(Z)V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public h(Z)V
    .locals 4

    const/4 v3, -0x2

    if-eqz p1, :cond_0

    const/16 v0, 0x32

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ch;

    iget-object v2, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ch;-><init>(Landroid/app/Activity;I)V

    iput-object v1, p0, Lcom/google/android/gms/internal/cc;->nW:Lcom/google/android/gms/internal/ch;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    if-eqz p1, :cond_1

    const/16 v0, 0xb

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nW:Lcom/google/android/gms/internal/ch;

    iget-object v2, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ce;->om:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ch;->i(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/cc;->nW:Lcom/google/android/gms/internal/ch;

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/16 v0, 0x9

    goto :goto_1
.end method

.method public i(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nW:Lcom/google/android/gms/internal/ch;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nW:Lcom/google/android/gms/internal/ch;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ch;->i(Z)V

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
    iput-boolean v0, p0, Lcom/google/android/gms/internal/cc;->oa:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ce;->a(Landroid/content/Intent;)Lcom/google/android/gms/internal/ce;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/cc$a;

    const-string v1, "Could not get info for ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cc$a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/cc$a; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cc$a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dw;->z(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    if-nez p1, :cond_4

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oi:Lcom/google/android/gms/internal/cf;

    invoke-interface {v0}, Lcom/google/android/gms/internal/cf;->W()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget v0, v0, Lcom/google/android/gms/internal/ce;->op:I

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v0, v0, Lcom/google/android/gms/internal/ce;->oh:Lcom/google/android/gms/internal/u;

    invoke-interface {v0}, Lcom/google/android/gms/internal/u;->P()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget v0, v0, Lcom/google/android/gms/internal/ce;->op:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/cc$a;

    const-string v1, "Could not determine ad overlay type."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cc$a;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/cc;->j(Z)V

    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/cc$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v1, v1, Lcom/google/android/gms/internal/ce;->oj:Lcom/google/android/gms/internal/dz;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cc$c;-><init>(Lcom/google/android/gms/internal/dz;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cc;->nV:Lcom/google/android/gms/internal/cc$c;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/cc;->j(Z)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/cc;->j(Z)V

    goto :goto_0

    :pswitch_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/cc;->oa:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v1, v1, Lcom/google/android/gms/internal/ce;->og:Lcom/google/android/gms/internal/cb;

    iget-object v2, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget-object v2, v2, Lcom/google/android/gms/internal/ce;->oo:Lcom/google/android/gms/internal/ci;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/bz;->a(Landroid/content/Context;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/ci;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Lcom/google/android/gms/internal/cc$a; {:try_start_1 .. :try_end_1} :catch_0

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

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->destroy()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->oc:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/cc;->aN()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nU:Lcom/google/android/gms/internal/cg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->pause()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cc;->aL()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nV:Lcom/google/android/gms/internal/cc$c;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/internal/dq;->a(Landroid/webkit/WebView;)V

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/cc;->aN()V

    return-void
.end method

.method public onRestart()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nT:Lcom/google/android/gms/internal/ce;

    iget v0, v0, Lcom/google/android/gms/internal/ce;->op:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cc;->oa:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->lC:Lcom/google/android/gms/internal/dz;

    invoke-static {v0}, Lcom/google/android/gms/internal/dq;->b(Landroid/webkit/WebView;)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cc;->oa:Z

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "outBundle"    # Landroid/os/Bundle;

    .prologue
    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    iget-boolean v1, p0, Lcom/google/android/gms/internal/cc;->oa:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/cc;->aN()V

    return-void
.end method

.method public setRequestedOrientation(I)V
    .locals 1
    .param p1, "requestedOrientation"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/cc;->nS:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method
