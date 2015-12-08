.class public Lcom/google/android/gms/internal/dp;
.super Lcom/google/android/gms/internal/dx$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/dp$b;,
        Lcom/google/android/gms/internal/dp$c;,
        Lcom/google/android/gms/internal/dp$a;
    }
.end annotation


# static fields
.field private static final rL:I


# instance fields
.field private mo:Lcom/google/android/gms/internal/gu;

.field private final nB:Landroid/app/Activity;

.field private rM:Lcom/google/android/gms/internal/dr;

.field private rN:Lcom/google/android/gms/internal/dt;

.field private rO:Lcom/google/android/gms/internal/dp$c;

.field private rP:Lcom/google/android/gms/internal/du;

.field private rQ:Z

.field private rR:Z

.field private rS:Landroid/widget/FrameLayout;

.field private rT:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private rU:Z

.field private rV:Z

.field private rW:Z

.field private rX:Landroid/widget/RelativeLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/dp;->rL:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/dx$a;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rR:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rU:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rV:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rW:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

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

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/dr;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms.ads.AdActivity"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    iget-object v2, p1, Lcom/google/android/gms/internal/dr;->lO:Lcom/google/android/gms/internal/gs;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/gs;->wV:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/dr;->a(Landroid/content/Intent;Lcom/google/android/gms/internal/dr;)V

    invoke-static {}, Lcom/google/android/gms/internal/ll;->in()Z

    move-result v1

    if-nez v1, :cond_0

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    instance-of v1, p0, Landroid/app/Activity;

    if-nez v1, :cond_1

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_1
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public X()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rQ:Z

    return-void
.end method

.method public a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 3

    const/4 v2, -0x1

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dp;->rS:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rS:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rS:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rS:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->X()V

    iput-object p2, p0, Lcom/google/android/gms/internal/dp;->rT:Landroid/webkit/WebChromeClient$CustomViewCallback;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rR:Z

    return-void
.end method

.method public b(IIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/dp;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/dt;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public c(IIII)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/dt;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/dt;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/gu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/dp;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/gv;->A(Z)V

    :cond_0
    return-void
.end method

.method public ce()Lcom/google/android/gms/internal/dt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    return-object v0
.end method

.method public cf()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rR:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget v0, v0, Lcom/google/android/gms/internal/dr;->orientation:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dp;->setRequestedOrientation(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rS:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rS:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iput-object v2, p0, Lcom/google/android/gms/internal/dp;->rS:Landroid/widget/FrameLayout;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rT:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rT:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    iput-object v2, p0, Lcom/google/android/gms/internal/dp;->rT:Landroid/webkit/WebChromeClient$CustomViewCallback;

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rR:Z

    return-void
.end method

.method public cg()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rP:Lcom/google/android/gms/internal/du;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dp;->p(Z)V

    return-void
.end method

.method ch()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rV:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rV:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->cj()V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rO:Lcom/google/android/gms/internal/dp$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gu;->z(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rO:Lcom/google/android/gms/internal/dp$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/dp$c;->sa:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v2, p0, Lcom/google/android/gms/internal/dp;->rO:Lcom/google/android/gms/internal/dp$c;

    iget v2, v2, Lcom/google/android/gms/internal/dp$c;->index:I

    iget-object v3, p0, Lcom/google/android/gms/internal/dp;->rO:Lcom/google/android/gms/internal/dp$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/dp$c;->rZ:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sd:Lcom/google/android/gms/internal/ds;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sd:Lcom/google/android/gms/internal/ds;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->ag()V

    goto :goto_0
.end method

.method ci()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->ci()V

    return-void
.end method

.method cj()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->cj()V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

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
    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rU:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/dr;->b(Landroid/content/Intent;)Lcom/google/android/gms/internal/dr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/dp$a;

    const-string v1, "Could not get info for ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dp$a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/dp$a; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dp$a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gr;->W(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sn:Lcom/google/android/gms/internal/y;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sn:Lcom/google/android/gms/internal/y;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/y;->mi:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rW:Z

    :goto_1
    if-nez p1, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sd:Lcom/google/android/gms/internal/ds;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sd:Lcom/google/android/gms/internal/ds;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ds;->ah()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget v0, v0, Lcom/google/android/gms/internal/dr;->sk:I

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sc:Lcom/google/android/gms/internal/t;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->sc:Lcom/google/android/gms/internal/t;

    invoke-interface {v0}, Lcom/google/android/gms/internal/t;->onAdClicked()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget v0, v0, Lcom/google/android/gms/internal/dr;->sk:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/dp$a;

    const-string v1, "Could not determine ad overlay type."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dp$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rW:Z

    goto :goto_1

    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dp;->r(Z)V

    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/dp$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v1, v1, Lcom/google/android/gms/internal/dr;->se:Lcom/google/android/gms/internal/gu;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dp$c;-><init>(Lcom/google/android/gms/internal/gu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dp;->rO:Lcom/google/android/gms/internal/dp$c;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dp;->r(Z)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/dp;->r(Z)V

    goto :goto_0

    :pswitch_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rU:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v1, v1, Lcom/google/android/gms/internal/dr;->sb:Lcom/google/android/gms/internal/do;

    iget-object v2, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v2, v2, Lcom/google/android/gms/internal/dr;->sj:Lcom/google/android/gms/internal/dv;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/dm;->a(Landroid/content/Context;Lcom/google/android/gms/internal/do;Lcom/google/android/gms/internal/dv;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Lcom/google/android/gms/internal/dp$a; {:try_start_1 .. :try_end_1} :catch_0

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

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dt;->destroy()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->ch()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rN:Lcom/google/android/gms/internal/dt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dt;->pause()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->cf()V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rO:Lcom/google/android/gms/internal/dp$c;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-static {v0}, Lcom/google/android/gms/internal/gi;->a(Landroid/webkit/WebView;)V

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->ch()V

    return-void
.end method

.method public onRestart()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget v0, v0, Lcom/google/android/gms/internal/dr;->sk:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rU:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-static {v0}, Lcom/google/android/gms/internal/gi;->b(Landroid/webkit/WebView;)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rU:Z

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "outBundle"    # Landroid/os/Bundle;

    .prologue
    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    iget-boolean v1, p0, Lcom/google/android/gms/internal/dp;->rU:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->ch()V

    return-void
.end method

.method public p(Z)V
    .locals 4

    const/4 v3, -0x2

    if-eqz p1, :cond_0

    const/16 v0, 0x32

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/du;

    iget-object v2, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/du;-><init>(Landroid/app/Activity;I)V

    iput-object v1, p0, Lcom/google/android/gms/internal/dp;->rP:Lcom/google/android/gms/internal/du;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    if-eqz p1, :cond_1

    const/16 v0, 0xb

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rP:Lcom/google/android/gms/internal/du;

    iget-object v2, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/dr;->sh:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/du;->q(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/dp;->rP:Lcom/google/android/gms/internal/du;

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/16 v0, 0x9

    goto :goto_1
.end method

.method public q(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rP:Lcom/google/android/gms/internal/du;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rP:Lcom/google/android/gms/internal/du;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/du;->q(Z)V

    :cond_0
    return-void
.end method

.method r(Z)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/dp$a;
        }
    .end annotation

    const/16 v3, 0x400

    const/4 v13, -0x1

    const/4 v4, 0x0

    const/4 v2, 0x1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rQ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/dp;->rW:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v1, v1, Lcom/google/android/gms/internal/dr;->sn:Lcom/google/android/gms/internal/y;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/y;->ms:Z

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget v1, v1, Lcom/google/android/gms/internal/dr;->orientation:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/dp;->setRequestedOrientation(I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v1, v3, :cond_3

    const-string v1, "Enabling hardware acceleration on the AdActivity window."

    invoke-static {v1}, Lcom/google/android/gms/internal/gr;->S(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/gm;->a(Landroid/view/Window;)V

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/dp$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    iget-object v3, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v3, v3, Lcom/google/android/gms/internal/dr;->sm:Ljava/lang/String;

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/dp$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rW:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->X()V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->se:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dN()Z

    move-result v3

    if-eqz p1, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v1, v1, Lcom/google/android/gms/internal/dr;->se:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/gu;->ac()Lcom/google/android/gms/internal/ay;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v5, v5, Lcom/google/android/gms/internal/dr;->lO:Lcom/google/android/gms/internal/gs;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/gu;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/gs;)Lcom/google/android/gms/internal/gu;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v8, v0, Lcom/google/android/gms/internal/dr;->sf:Lcom/google/android/gms/internal/cb;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v9, v0, Lcom/google/android/gms/internal/dr;->sj:Lcom/google/android/gms/internal/dv;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v11, v0, Lcom/google/android/gms/internal/dr;->sl:Lcom/google/android/gms/internal/ce;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->se:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gv;->dM()Lcom/google/android/gms/internal/v;

    move-result-object v12

    move-object v6, v4

    move-object v7, v4

    move v10, v2

    invoke-virtual/range {v5 .. v12}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/cb;Lcom/google/android/gms/internal/dv;ZLcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/v;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dD()Lcom/google/android/gms/internal/gv;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/dp$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/dp$1;-><init>(Lcom/google/android/gms/internal/dp;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gv;->a(Lcom/google/android/gms/internal/gv$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->rH:Ljava/lang/String;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v1, v1, Lcom/google/android/gms/internal/dr;->rH:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gu;->loadUrl(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gu;->a(Lcom/google/android/gms/internal/dp;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/dp;->rW:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    sget v1, Lcom/google/android/gms/internal/dp;->rL:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gu;->setBackgroundColor(I)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0, v1, v13, v13}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lcom/google/android/gms/internal/dp;->ci()V

    :cond_6
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/dp;->p(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gu;->dE()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/dp;->q(Z)V

    :cond_7
    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rX:Landroid/widget/RelativeLayout;

    sget v1, Lcom/google/android/gms/internal/dp;->rL:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->si:Ljava/lang/String;

    if-eqz v0, :cond_a

    iget-object v5, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v6, v0, Lcom/google/android/gms/internal/dr;->sg:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v7, v0, Lcom/google/android/gms/internal/dr;->si:Ljava/lang/String;

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    move-object v10, v4

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/gu;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    new-instance v0, Lcom/google/android/gms/internal/dp$a;

    const-string v1, "No URL or HTML to display in ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/dp$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->rM:Lcom/google/android/gms/internal/dr;

    iget-object v0, v0, Lcom/google/android/gms/internal/dr;->se:Lcom/google/android/gms/internal/gu;

    iput-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->mo:Lcom/google/android/gms/internal/gu;

    iget-object v1, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gu;->setContext(Landroid/content/Context;)V

    goto :goto_1
.end method

.method public setRequestedOrientation(I)V
    .locals 1
    .param p1, "requestedOrientation"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nB:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method
