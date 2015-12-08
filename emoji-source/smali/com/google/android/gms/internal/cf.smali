.class public Lcom/google/android/gms/internal/cf;
.super Lcom/google/android/gms/internal/cn$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/cf$b;,
        Lcom/google/android/gms/internal/cf$c;,
        Lcom/google/android/gms/internal/cf$a;
    }
.end annotation


# static fields
.field private static final of:I


# instance fields
.field private lN:Lcom/google/android/gms/internal/ex;

.field private final og:Landroid/app/Activity;

.field private oh:Lcom/google/android/gms/internal/ch;

.field private oi:Lcom/google/android/gms/internal/cj;

.field private oj:Lcom/google/android/gms/internal/cf$c;

.field private ok:Lcom/google/android/gms/internal/ck;

.field private ol:Z

.field private om:Landroid/widget/FrameLayout;

.field private on:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field private oo:Z

.field private op:Z

.field private oq:Z

.field private or:Landroid/widget/RelativeLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/cf;->of:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/cn$a;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oo:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->op:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oq:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

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

.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ch;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.google.android.gms.ads.AdActivity"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.ads.internal.overlay.useClientJar"

    iget-object v2, p1, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ev;->sz:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ch;->a(Landroid/content/Intent;Lcom/google/android/gms/internal/ch;)V

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

.method private aT()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cf;->op:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->op:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->bY()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oj:Lcom/google/android/gms/internal/cf$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ex;->q(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oj:Lcom/google/android/gms/internal/cf$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/cf$c;->ou:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v2, p0, Lcom/google/android/gms/internal/cf;->oj:Lcom/google/android/gms/internal/cf$c;

    iget v2, v2, Lcom/google/android/gms/internal/cf$c;->index:I

    iget-object v3, p0, Lcom/google/android/gms/internal/cf;->oj:Lcom/google/android/gms/internal/cf$c;

    iget-object v3, v3, Lcom/google/android/gms/internal/cf$c;->ot:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ci;->Z()V

    goto :goto_0
.end method

.method private k(Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/cf$a;
        }
    .end annotation

    const/16 v3, 0x400

    const/4 v12, -0x1

    const/4 v2, 0x1

    const/4 v4, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cf;->ol:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->requestWindowFeature(I)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/cf;->oq:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v1, v1, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    iget-boolean v1, v1, Lcom/google/android/gms/internal/v;->ld:Z

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget v1, v1, Lcom/google/android/gms/internal/ch;->orientation:I

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/cf;->setRequestedOrientation(I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v1, v3, :cond_3

    const-string v1, "Enabling hardware acceleration on the AdActivity window."

    invoke-static {v1}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/eq;->a(Landroid/view/Window;)V

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/cf$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    iget-object v3, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v3, v3, Lcom/google/android/gms/internal/ch;->oG:Ljava/lang/String;

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/cf$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oq:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cf;->S()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ey;->cj()Z

    move-result v3

    if-eqz p1, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v1, v1, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ex;->V()Lcom/google/android/gms/internal/al;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v5, v5, Lcom/google/android/gms/internal/ch;->kQ:Lcom/google/android/gms/internal/ev;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ex;->a(Landroid/content/Context;Lcom/google/android/gms/internal/al;ZZLcom/google/android/gms/internal/k;Lcom/google/android/gms/internal/ev;)Lcom/google/android/gms/internal/ex;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v8, v0, Lcom/google/android/gms/internal/ch;->oz:Lcom/google/android/gms/internal/ba;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v9, v0, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v11, v0, Lcom/google/android/gms/internal/ch;->oF:Lcom/google/android/gms/internal/bd;

    move-object v6, v4

    move-object v7, v4

    move v10, v2

    invoke-virtual/range {v5 .. v11}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/t;Lcom/google/android/gms/internal/ci;Lcom/google/android/gms/internal/ba;Lcom/google/android/gms/internal/cl;ZLcom/google/android/gms/internal/bd;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/cf$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/cf$1;-><init>(Lcom/google/android/gms/internal/cf;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ey;->a(Lcom/google/android/gms/internal/ey$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v1, v1, Lcom/google/android/gms/internal/ch;->ob:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ex;->loadUrl(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ex;->a(Lcom/google/android/gms/internal/cf;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oq:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    sget v1, Lcom/google/android/gms/internal/cf;->of:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ex;->setBackgroundColor(I)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0, v1, v12, v12}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;II)V

    if-nez p1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->bZ()V

    :cond_6
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/cf;->i(Z)V

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    sget v1, Lcom/google/android/gms/internal/cf;->of:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    goto/16 :goto_0

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    if-eqz v0, :cond_9

    iget-object v5, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v6, v0, Lcom/google/android/gms/internal/ch;->oA:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v7, v0, Lcom/google/android/gms/internal/ch;->oC:Ljava/lang/String;

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    move-object v10, v4

    invoke-virtual/range {v5 .. v10}, Lcom/google/android/gms/internal/ex;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_9
    new-instance v0, Lcom/google/android/gms/internal/cf$a;

    const-string v1, "No URL or HTML to display in ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cf$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    iput-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ex;->setContext(Landroid/content/Context;)V

    goto :goto_1
.end method


# virtual methods
.method public S()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->ol:Z

    return-void
.end method

.method public a(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 3

    const/4 v2, -0x1

    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cf;->om:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->om:Landroid/widget/FrameLayout;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->om:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1, v2, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->om:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cf;->S()V

    iput-object p2, p0, Lcom/google/android/gms/internal/cf;->on:Landroid/webkit/WebChromeClient$CustomViewCallback;

    return-void
.end method

.method public aQ()Lcom/google/android/gms/internal/cj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    return-object v0
.end method

.method public aR()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget v0, v0, Lcom/google/android/gms/internal/ch;->orientation:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/cf;->setRequestedOrientation(I)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->om:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cf;->S()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->om:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iput-object v2, p0, Lcom/google/android/gms/internal/cf;->om:Landroid/widget/FrameLayout;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->on:Landroid/webkit/WebChromeClient$CustomViewCallback;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->on:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    iput-object v2, p0, Lcom/google/android/gms/internal/cf;->on:Landroid/webkit/WebChromeClient$CustomViewCallback;

    :cond_2
    return-void
.end method

.method public aS()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->ok:Lcom/google/android/gms/internal/ck;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/cf;->i(Z)V

    return-void
.end method

.method public b(IIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/cf;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cj;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public c(IIII)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/cj;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    iget-object v2, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/cj;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ex;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    invoke-static {p1, p2, p3, p4}, Lcom/google/android/gms/internal/cf;->a(IIII)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v2

    invoke-virtual {v0, v1, v3, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ex;->cb()Lcom/google/android/gms/internal/ey;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ey;->r(Z)V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public i(Z)V
    .locals 4

    const/4 v3, -0x2

    if-eqz p1, :cond_0

    const/16 v0, 0x32

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/ck;

    iget-object v2, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/ck;-><init>(Landroid/app/Activity;I)V

    iput-object v1, p0, Lcom/google/android/gms/internal/cf;->ok:Lcom/google/android/gms/internal/ck;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    if-eqz p1, :cond_1

    const/16 v0, 0xb

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->ok:Lcom/google/android/gms/internal/ck;

    iget-object v2, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ch;->oB:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ck;->j(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/google/android/gms/internal/cf;->ok:Lcom/google/android/gms/internal/ck;

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    const/16 v0, 0x9

    goto :goto_1
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->ok:Lcom/google/android/gms/internal/ck;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->ok:Lcom/google/android/gms/internal/ck;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ck;->j(Z)V

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
    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oo:Z

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ch;->a(Landroid/content/Intent;)Lcom/google/android/gms/internal/ch;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/cf$a;

    const-string v1, "Could not get info for ad overlay."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cf$a;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/cf$a; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cf$a;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->oH:Lcom/google/android/gms/internal/v;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/v;->lb:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oq:Z

    :goto_1
    if-nez p1, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->ox:Lcom/google/android/gms/internal/ci;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ci;->aa()V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget v0, v0, Lcom/google/android/gms/internal/ch;->oE:I

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v0, v0, Lcom/google/android/gms/internal/ch;->ow:Lcom/google/android/gms/internal/t;

    invoke-interface {v0}, Lcom/google/android/gms/internal/t;->onAdClicked()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget v0, v0, Lcom/google/android/gms/internal/ch;->oE:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/cf$a;

    const-string v1, "Could not determine ad overlay type."

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cf$a;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oq:Z

    goto :goto_1

    :pswitch_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/cf;->k(Z)V

    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/cf$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v1, v1, Lcom/google/android/gms/internal/ch;->oy:Lcom/google/android/gms/internal/ex;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cf$c;-><init>(Lcom/google/android/gms/internal/ex;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cf;->oj:Lcom/google/android/gms/internal/cf$c;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/cf;->k(Z)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/cf;->k(Z)V

    goto :goto_0

    :pswitch_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oo:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v1, v1, Lcom/google/android/gms/internal/ch;->ov:Lcom/google/android/gms/internal/ce;

    iget-object v2, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget-object v2, v2, Lcom/google/android/gms/internal/ch;->oD:Lcom/google/android/gms/internal/cl;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/cc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ce;Lcom/google/android/gms/internal/cl;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Lcom/google/android/gms/internal/cf$a; {:try_start_1 .. :try_end_1} :catch_0

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

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cj;->destroy()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->or:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/cf;->aT()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oi:Lcom/google/android/gms/internal/cj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cj;->pause()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cf;->aR()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oj:Lcom/google/android/gms/internal/cf$c;

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->a(Landroid/webkit/WebView;)V

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/internal/cf;->aT()V

    return-void
.end method

.method public onRestart()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->oh:Lcom/google/android/gms/internal/ch;

    iget v0, v0, Lcom/google/android/gms/internal/ch;->oE:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oo:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->lN:Lcom/google/android/gms/internal/ex;

    invoke-static {v0}, Lcom/google/android/gms/internal/eo;->b(Landroid/webkit/WebView;)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/cf;->oo:Z

    goto :goto_0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "outBundle"    # Landroid/os/Bundle;

    .prologue
    const-string v0, "com.google.android.gms.ads.internal.overlay.hasResumed"

    iget-boolean v1, p0, Lcom/google/android/gms/internal/cf;->oo:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public onStart()V
    .locals 0

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/cf;->aT()V

    return-void
.end method

.method public setRequestedOrientation(I)V
    .locals 1
    .param p1, "requestedOrientation"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/cf;->og:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method
