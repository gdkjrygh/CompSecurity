.class Landroid/support/v4/view/az;
.super Landroid/support/v4/view/a;
.source "ViewPager.java"


# instance fields
.field final synthetic b:Landroid/support/v4/view/ViewPager;


# direct methods
.method constructor <init>(Landroid/support/v4/view/ViewPager;)V
    .locals 0

    .prologue
    .line 2501
    iput-object p1, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-direct {p0}, Landroid/support/v4/view/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/support/v4/view/a/a;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2511
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/a;->a(Landroid/view/View;Landroid/support/v4/view/a/a;)V

    .line 2512
    const-class v1, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/support/v4/view/a/a;->a(Ljava/lang/CharSequence;)V

    .line 2513
    iget-object v1, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/x;->a()I

    move-result v1

    if-le v1, v0, :cond_2

    :goto_0
    invoke-virtual {p2, v0}, Landroid/support/v4/view/a/a;->a(Z)V

    .line 2514
    iget-object v0, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/x;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    .line 2515
    const/16 v0, 0x1000

    invoke-virtual {p2, v0}, Landroid/support/v4/view/a/a;->a(I)V

    .line 2517
    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v0}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v1}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/view/x;->a()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 2518
    const/16 v0, 0x2000

    invoke-virtual {p2, v0}, Landroid/support/v4/view/a/a;->a(I)V

    .line 2520
    :cond_1
    return-void

    .line 2513
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2524
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/a;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2541
    :goto_0
    return v0

    .line 2527
    :cond_0
    sparse-switch p2, :sswitch_data_0

    move v0, v1

    .line 2541
    goto :goto_0

    .line 2529
    :sswitch_0
    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    if-ltz v2, :cond_1

    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    iget-object v3, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v3}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/view/x;->a()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_1

    .line 2530
    iget-object v1, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    :cond_1
    move v0, v1

    .line 2533
    goto :goto_0

    .line 2535
    :sswitch_1
    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    if-lez v2, :cond_2

    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    iget-object v3, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v3}, Landroid/support/v4/view/ViewPager;->a(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/x;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/view/x;->a()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 2536
    iget-object v1, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Landroid/support/v4/view/az;->b:Landroid/support/v4/view/ViewPager;

    invoke-static {v2}, Landroid/support/v4/view/ViewPager;->b(Landroid/support/v4/view/ViewPager;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 2539
    goto :goto_0

    .line 2527
    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_0
        0x2000 -> :sswitch_1
    .end sparse-switch
.end method

.method public d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .prologue
    .line 2505
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/a;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2506
    const-class v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 2507
    return-void
.end method
