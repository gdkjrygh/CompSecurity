.class Landroid/support/v4/view/bc;
.super Landroid/database/DataSetObserver;
.source "ViewPager.java"


# instance fields
.field final synthetic a:Landroid/support/v4/view/ViewPager;


# direct methods
.method private constructor <init>(Landroid/support/v4/view/ViewPager;)V
    .locals 0

    .prologue
    .line 2545
    iput-object p1, p0, Landroid/support/v4/view/bc;->a:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/at;)V
    .locals 0

    .prologue
    .line 2545
    invoke-direct {p0, p1}, Landroid/support/v4/view/bc;-><init>(Landroid/support/v4/view/ViewPager;)V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .prologue
    .line 2548
    iget-object v0, p0, Landroid/support/v4/view/bc;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->b()V

    .line 2549
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .prologue
    .line 2552
    iget-object v0, p0, Landroid/support/v4/view/bc;->a:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->b()V

    .line 2553
    return-void
.end method
