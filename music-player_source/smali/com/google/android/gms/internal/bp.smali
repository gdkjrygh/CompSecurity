.class public final Lcom/google/android/gms/internal/bp;
.super Lcom/google/android/gms/internal/cg;


# instance fields
.field private final a:Landroid/app/Activity;

.field private b:Lcom/google/android/gms/internal/bq;

.field private c:Lcom/google/android/gms/internal/bw;

.field private d:Lcom/google/android/gms/internal/em;

.field private e:Lcom/google/android/gms/internal/bt;

.field private f:Lcom/google/android/gms/internal/bz;

.field private g:Landroid/widget/FrameLayout;

.field private h:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private i:Z

.field private j:Z

.field private k:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/cg;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bp;->i:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bp;->j:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/bq;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms.ads.AdActivity"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    iget-object v2, p1, Lcom/google/android/gms/internal/bq;->o:Lcom/google/android/gms/internal/db;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/db;->f:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/bq;->a(Landroid/content/Intent;Lcom/google/android/gms/internal/bq;)V

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private b(Z)V
    .locals 4

    const/4 v3, -0x2

    if-eqz p1, :cond_0

    const/16 v0, 0x32

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/bz;

    iget-object v2, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/bz;-><init>(Landroid/app/Activity;I)V

    iput-object v1, p0, Lcom/google/android/gms/internal/bp;->f:Lcom/google/android/gms/internal/bz;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    if-eqz p1, :cond_1

    const/16 v0, 0xb

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->f:Lcom/google/android/gms/internal/bz;

    iget-object v2, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/bq;->i:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/bz;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/bp;->f:Lcom/google/android/gms/internal/bz;

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/16 v0, 0x9

    goto :goto_1
.end method

.method private static c(IIII)Landroid/widget/RelativeLayout$LayoutParams;
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

.method private c(Z)V
    .locals 12

    const/high16 v5, 0x1000000

    const/16 v1, 0x400

    const/4 v11, -0x1

    const/4 v2, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget v1, v1, Lcom/google/android/gms/internal/bq;->l:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/bp;->a(I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v1, v3, :cond_0

    const-string v1, "Enabling hardware acceleration on the AdActivity window."

    invoke-static {v1}, Lcom/google/android/gms/internal/ek;->a(Ljava/lang/String;)V

    invoke-virtual {v0, v5, v5}, Landroid/view/Window;->setFlags(II)V

    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->f:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->e()Lcom/google/android/gms/internal/eo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eo;->a()Z

    move-result v3

    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v1, v1, Lcom/google/android/gms/internal/bq;->f:Lcom/google/android/gms/internal/em;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/em;->d()Lcom/google/android/gms/internal/ab;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v5, v5, Lcom/google/android/gms/internal/bq;->o:Lcom/google/android/gms/internal/db;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/em;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ab;ZZLcom/google/android/gms/internal/kz;Lcom/google/android/gms/internal/db;)Lcom/google/android/gms/internal/em;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->e()Lcom/google/android/gms/internal/eo;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v8, v0, Lcom/google/android/gms/internal/bq;->g:Lcom/google/android/gms/internal/v;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v9, v0, Lcom/google/android/gms/internal/bq;->k:Lcom/google/android/gms/internal/ca;

    move-object v6, v4

    move-object v7, v4

    move v10, v2

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/eo;->a(Lcom/google/android/gms/internal/lj;Lcom/google/android/gms/internal/bv;Lcom/google/android/gms/internal/v;Lcom/google/android/gms/internal/ca;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->e()Lcom/google/android/gms/internal/eo;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/br;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/br;-><init>(Lcom/google/android/gms/internal/bp;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/eo;->a(Lcom/google/android/gms/internal/eq;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->n:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v1, v1, Lcom/google/android/gms/internal/bq;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->loadUrl(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/bp;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, v1, v11, v11}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->b()V

    :cond_1
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/bp;->b(Z)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->j:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v5, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v6, v0, Lcom/google/android/gms/internal/bq;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v7, v0, Lcom/google/android/gms/internal/bq;->j:Ljava/lang/String;

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    move-object v10, v4

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/em;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/bs;

    const-string v1, "No URL or HTML to display in ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bs;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->f:Lcom/google/android/gms/internal/em;

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Landroid/content/Context;)V

    goto :goto_0
.end method

.method private k()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/bp;->j:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bp;->j:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->e:Lcom/google/android/gms/internal/bt;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->e:Lcom/google/android/gms/internal/bt;

    iget-object v0, v0, Lcom/google/android/gms/internal/bt;->c:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    iget-object v2, p0, Lcom/google/android/gms/internal/bp;->e:Lcom/google/android/gms/internal/bt;

    iget v2, v2, Lcom/google/android/gms/internal/bt;->a:I

    iget-object v3, p0, Lcom/google/android/gms/internal/bp;->e:Lcom/google/android/gms/internal/bt;

    iget-object v3, v3, Lcom/google/android/gms/internal/bt;->b:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->e:Lcom/google/android/gms/internal/bv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->e:Lcom/google/android/gms/internal/bv;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bv;->o()V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public final a(IIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/bp;->c(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/bw;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 3

    const/4 v2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "com.google.android.gms.ads.internal.overlay.hasResumed"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/bp;->i:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/bq;->a(Landroid/content/Intent;)Lcom/google/android/gms/internal/bq;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/bs;

    const-string v1, "Could not get info for ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bs;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/bs; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bs;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    if-nez p1, :cond_4

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->e:Lcom/google/android/gms/internal/bv;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->e:Lcom/google/android/gms/internal/bv;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bv;->p()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget v0, v0, Lcom/google/android/gms/internal/bq;->m:I

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->d:Lcom/google/android/gms/internal/lj;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v0, v0, Lcom/google/android/gms/internal/bq;->d:Lcom/google/android/gms/internal/lj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lj;->r()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget v0, v0, Lcom/google/android/gms/internal/bq;->m:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/bs;

    const-string v1, "Could not determine ad overlay type."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bs;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bp;->c(Z)V

    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/bt;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v1, v1, Lcom/google/android/gms/internal/bq;->f:Lcom/google/android/gms/internal/em;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bt;-><init>(Lcom/google/android/gms/internal/em;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->e:Lcom/google/android/gms/internal/bt;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bp;->c(Z)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bp;->c(Z)V

    goto :goto_0

    :pswitch_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/bp;->i:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v1, v1, Lcom/google/android/gms/internal/bq;->c:Lcom/google/android/gms/internal/bn;

    iget-object v2, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget-object v2, v2, Lcom/google/android/gms/internal/bq;->k:Lcom/google/android/gms/internal/ca;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/bm;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bn;Lcom/google/android/gms/internal/ca;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Lcom/google/android/gms/internal/bs; {:try_start_1 .. :try_end_1} :catch_0

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

.method public final a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 3

    const/4 v2, -0x1

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->g:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->g:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/bp;->h:Landroid/webkit/WebChromeClient$CustomViewCallback;

    return-void
.end method

.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->f:Lcom/google/android/gms/internal/bz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->f:Lcom/google/android/gms/internal/bz;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bz;->a(Z)V

    :cond_0
    return-void
.end method

.method public final b()Lcom/google/android/gms/internal/bw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    return-object v0
.end method

.method public final b(IIII)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/bw;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/bw;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/em;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    const/4 v2, 0x0

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/bp;->c(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/em;->e()Lcom/google/android/gms/internal/eo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/eo;->c()V

    :cond_0
    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    iget-boolean v1, p0, Lcom/google/android/gms/internal/bp;->i:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final c()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget v0, v0, Lcom/google/android/gms/internal/bq;->l:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/bp;->a(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->g:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iput-object v2, p0, Lcom/google/android/gms/internal/bp;->g:Landroid/widget/FrameLayout;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->h:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->h:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    iput-object v2, p0, Lcom/google/android/gms/internal/bp;->h:Landroid/webkit/WebChromeClient$CustomViewCallback;

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e()V
    .locals 0

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->b:Lcom/google/android/gms/internal/bq;

    iget v0, v0, Lcom/google/android/gms/internal/bq;->m:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/bp;->i:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-static {v0}, Lcom/google/android/gms/internal/ea;->b(Landroid/webkit/WebView;)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/bp;->i:Z

    goto :goto_0
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bw;->c()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/bp;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->e:Lcom/google/android/gms/internal/bt;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-static {v0}, Lcom/google/android/gms/internal/ea;->a(Landroid/webkit/WebView;)V

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/bp;->k()V

    return-void
.end method

.method public final h()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/bp;->k()V

    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->c:Lcom/google/android/gms/internal/bw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bw;->a()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->d:Lcom/google/android/gms/internal/em;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/bp;->k()V

    return-void
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bp;->k:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/bp;->f:Lcom/google/android/gms/internal/bz;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bp;->b(Z)V

    return-void
.end method
