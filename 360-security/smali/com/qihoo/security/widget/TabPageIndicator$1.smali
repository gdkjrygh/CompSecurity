.class Lcom/qihoo/security/widget/TabPageIndicator$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/widget/TabPageIndicator;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/TabPageIndicator;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/TabPageIndicator;)V
    .locals 0

    .prologue
    .line 321
    iput-object p1, p0, Lcom/qihoo/security/widget/TabPageIndicator$1;->a:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .prologue
    .line 330
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$1;->a:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/TabPageIndicator;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 331
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$1;->a:Lcom/qihoo/security/widget/TabPageIndicator;

    iget-object v1, p0, Lcom/qihoo/security/widget/TabPageIndicator$1;->a:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-static {v1}, Lcom/qihoo/security/widget/TabPageIndicator;->a(Lcom/qihoo/security/widget/TabPageIndicator;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo/security/widget/TabPageIndicator;->a(Lcom/qihoo/security/widget/TabPageIndicator;I)I

    .line 332
    iget-object v0, p0, Lcom/qihoo/security/widget/TabPageIndicator$1;->a:Lcom/qihoo/security/widget/TabPageIndicator;

    iget-object v1, p0, Lcom/qihoo/security/widget/TabPageIndicator$1;->a:Lcom/qihoo/security/widget/TabPageIndicator;

    invoke-static {v1}, Lcom/qihoo/security/widget/TabPageIndicator;->b(Lcom/qihoo/security/widget/TabPageIndicator;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/widget/TabPageIndicator;->a(Lcom/qihoo/security/widget/TabPageIndicator;II)V

    .line 333
    return-void
.end method
