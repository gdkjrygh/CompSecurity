.class public Lcom/facebook/ads/internal/adapters/view/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/facebook/ads/internal/adapters/view/b;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/facebook/ads/internal/adapters/view/b$a;

.field private c:Lcom/facebook/ads/internal/f/b;

.field private d:Lcom/facebook/ads/internal/adapters/q;

.field private e:Lcom/facebook/ads/internal/adapters/r;

.field private f:J

.field private g:J

.field private h:Lcom/facebook/ads/internal/util/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/facebook/ads/internal/adapters/view/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/adapters/view/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/ads/InterstitialAdActivity;Lcom/facebook/ads/internal/adapters/view/b$a;)V
    .locals 4

    const/4 v3, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/facebook/ads/internal/adapters/view/a;->b:Lcom/facebook/ads/internal/adapters/view/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->f:J

    new-instance v0, Lcom/facebook/ads/internal/f/b;

    new-instance v1, Lcom/facebook/ads/internal/adapters/view/a$1;

    invoke-direct {v1, p0, p1}, Lcom/facebook/ads/internal/adapters/view/a$1;-><init>(Lcom/facebook/ads/internal/adapters/view/a;Lcom/facebook/ads/InterstitialAdActivity;)V

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/ads/internal/f/b;-><init>(Landroid/content/Context;Lcom/facebook/ads/internal/f/b$a;I)V

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    const v1, 0x186a1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/f/b;->setId(I)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/f/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lcom/facebook/ads/internal/adapters/r;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    new-instance v2, Lcom/facebook/ads/internal/adapters/view/a$2;

    invoke-direct {v2, p0}, Lcom/facebook/ads/internal/adapters/view/a$2;-><init>(Lcom/facebook/ads/internal/adapters/view/a;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/ads/internal/adapters/r;-><init>(Landroid/content/Context;Landroid/webkit/WebView;Lcom/facebook/ads/internal/adapters/k;)V

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->e:Lcom/facebook/ads/internal/adapters/r;

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->e:Lcom/facebook/ads/internal/adapters/r;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/adapters/r;->c()V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    invoke-interface {p2, v0}, Lcom/facebook/ads/internal/adapters/view/b$a;->a(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/adapters/view/a;J)J
    .locals 1

    iput-wide p1, p0, Lcom/facebook/ads/internal/adapters/view/a;->g:J

    return-wide p1
.end method

.method static synthetic a(Lcom/facebook/ads/internal/adapters/view/a;)Lcom/facebook/ads/internal/adapters/view/b$a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->b:Lcom/facebook/ads/internal/adapters/view/b$a;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/ads/internal/adapters/view/a;Lcom/facebook/ads/internal/util/b$a;)Lcom/facebook/ads/internal/util/b$a;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/adapters/view/a;->h:Lcom/facebook/ads/internal/util/b$a;

    return-object p1
.end method

.method static synthetic b(Lcom/facebook/ads/internal/adapters/view/a;)Lcom/facebook/ads/internal/adapters/r;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->e:Lcom/facebook/ads/internal/adapters/r;

    return-object v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/facebook/ads/internal/adapters/view/a;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/f/b;->onPause()V

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 6

    const/4 v5, 0x0

    if-eqz p2, :cond_1

    const-string/jumbo v0, "dataModel"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string/jumbo v0, "dataModel"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/adapters/q;->a(Landroid/os/Bundle;)Lcom/facebook/ads/internal/adapters/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    invoke-static {}, Lcom/facebook/ads/internal/util/i;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    invoke-virtual {v2}, Lcom/facebook/ads/internal/adapters/q;->d()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "text/html"

    const-string/jumbo v4, "utf-8"

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/ads/internal/f/b;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p1}, Lcom/facebook/ads/internal/adapters/q;->b(Landroid/content/Intent;)Lcom/facebook/ads/internal/adapters/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->e:Lcom/facebook/ads/internal/adapters/r;

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/adapters/r;->a(Lcom/facebook/ads/internal/adapters/q;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    invoke-static {}, Lcom/facebook/ads/internal/util/i;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    invoke-virtual {v2}, Lcom/facebook/ads/internal/adapters/q;->d()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "text/html"

    const-string/jumbo v4, "utf-8"

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/ads/internal/f/b;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    if-eqz v0, :cond_0

    const-string/jumbo v0, "dataModel"

    iget-object v1, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    invoke-virtual {v1}, Lcom/facebook/ads/internal/adapters/q;->i()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    iget-wide v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->g:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->h:Lcom/facebook/ads/internal/util/b$a;

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->g:J

    iget-object v2, p0, Lcom/facebook/ads/internal/adapters/view/a;->h:Lcom/facebook/ads/internal/util/b$a;

    iget-object v3, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    invoke-virtual {v3}, Lcom/facebook/ads/internal/adapters/q;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/ads/internal/util/b;->a(JLcom/facebook/ads/internal/util/b$a;Ljava/lang/String;)Lcom/facebook/ads/internal/util/b;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/util/d;->a(Lcom/facebook/ads/internal/util/b;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/f/b;->onResume()V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 4

    iget-wide v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->f:J

    sget-object v2, Lcom/facebook/ads/internal/util/b$a;->c:Lcom/facebook/ads/internal/util/b$a;

    iget-object v3, p0, Lcom/facebook/ads/internal/adapters/view/a;->d:Lcom/facebook/ads/internal/adapters/q;

    invoke-virtual {v3}, Lcom/facebook/ads/internal/adapters/q;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/ads/internal/util/b;->a(JLcom/facebook/ads/internal/util/b$a;Ljava/lang/String;)Lcom/facebook/ads/internal/util/b;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/util/d;->a(Lcom/facebook/ads/internal/util/b;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    invoke-static {v0}, Lcom/facebook/ads/internal/util/i;->a(Landroid/webkit/WebView;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/f/b;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/ads/internal/adapters/view/a;->c:Lcom/facebook/ads/internal/f/b;

    :cond_0
    return-void
.end method
