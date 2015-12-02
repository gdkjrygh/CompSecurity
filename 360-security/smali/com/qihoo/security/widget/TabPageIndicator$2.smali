.class Lcom/qihoo/security/widget/TabPageIndicator$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/TabPageIndicator;->a(ILandroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/qihoo/security/widget/TabPageIndicator;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/TabPageIndicator;I)V
    .locals 0

    .prologue
    .line 393
    iput-object p1, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->b:Lcom/qihoo/security/widget/TabPageIndicator;

    iput p2, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 396
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->b:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-static {v0}, Lcom/qihoo/security/widget/TabPageIndicator;->c(Lcom/qihoo/security/widget/TabPageIndicator;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 397
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->b:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-static {v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(Lcom/qihoo/security/widget/TabPageIndicator;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->a:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    .line 401
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->b:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-static {v0}, Lcom/qihoo/security/widget/TabPageIndicator;->d(Lcom/qihoo/security/widget/TabPageIndicator;)Lcom/qihoo/security/widget/TabPageIndicator$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 402
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->b:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-static {v0}, Lcom/qihoo/security/widget/TabPageIndicator;->d(Lcom/qihoo/security/widget/TabPageIndicator;)Lcom/qihoo/security/widget/TabPageIndicator$b;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->a:I

    invoke-interface {v0, v1, p1}, Lcom/qihoo/security/widget/TabPageIndicator$b;->a(ILandroid/view/View;)Z

    .line 404
    :cond_0
    return-void

    .line 399
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->b:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-static {v0}, Lcom/qihoo/security/widget/TabPageIndicator;->a(Lcom/qihoo/security/widget/TabPageIndicator;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/widget/TabPageIndicator$2;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->a(IZ)V

    goto :goto_0
.end method
