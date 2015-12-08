.class final Lkik/android/widget/PagerIconTabs$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/PagerIconTabs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/widget/PagerIconTabs;


# direct methods
.method private constructor <init>(Lkik/android/widget/PagerIconTabs;)V
    .locals 0

    .prologue
    .line 256
    iput-object p1, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lkik/android/widget/PagerIconTabs;B)V
    .locals 0

    .prologue
    .line 256
    invoke-direct {p0, p1}, Lkik/android/widget/PagerIconTabs$a;-><init>(Lkik/android/widget/PagerIconTabs;)V

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 2

    .prologue
    .line 261
    if-nez p1, :cond_0

    .line 262
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    iget-object v1, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v1}, Lkik/android/widget/PagerIconTabs;->a(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;I)V

    .line 264
    :cond_0
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 265
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    .line 267
    :cond_1
    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 2

    .prologue
    .line 272
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0, p1}, Lkik/android/widget/PagerIconTabs;->c(Lkik/android/widget/PagerIconTabs;I)I

    .line 273
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0, p2}, Lkik/android/widget/PagerIconTabs;->a(Lkik/android/widget/PagerIconTabs;F)F

    .line 274
    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    .line 275
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    add-int/lit8 v1, p1, 0x1

    invoke-static {v0, v1}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;I)V

    .line 280
    :goto_0
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-virtual {v0}, Lkik/android/widget/PagerIconTabs;->invalidate()V

    .line 282
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 285
    :cond_0
    return-void

    .line 278
    :cond_1
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0, p1}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;I)V

    goto :goto_0
.end method

.method public final onPageSelected(I)V
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lkik/android/widget/PagerIconTabs$a;->a:Lkik/android/widget/PagerIconTabs;

    invoke-static {v0}, Lkik/android/widget/PagerIconTabs;->b(Lkik/android/widget/PagerIconTabs;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 293
    :cond_0
    return-void
.end method
