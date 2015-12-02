.class Lcom/qihoo/security/widget/MaterialRippleLayout$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/MaterialRippleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/MaterialRippleLayout;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/widget/MaterialRippleLayout;)V
    .locals 0

    .prologue
    .line 604
    iput-object p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/widget/MaterialRippleLayout;Lcom/qihoo/security/widget/MaterialRippleLayout$1;)V
    .locals 0

    .prologue
    .line 604
    invoke-direct {p0, p1}, Lcom/qihoo/security/widget/MaterialRippleLayout$a;-><init>(Lcom/qihoo/security/widget/MaterialRippleLayout;)V

    return-void
.end method

.method private a(Landroid/widget/AdapterView;)V
    .locals 4

    .prologue
    .line 621
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result v2

    .line 622
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    .line 623
    :goto_0
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 624
    iget-object v3, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {p1, v3, v2, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 626
    :cond_0
    return-void

    .line 622
    :cond_1
    const-wide/16 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 609
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/AdapterView;

    if-eqz v0, :cond_1

    .line 610
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/AdapterView;

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a(Landroid/widget/AdapterView;)V

    .line 618
    :cond_0
    :goto_0
    return-void

    .line 611
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->f(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 613
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->g(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/widget/AdapterView;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a(Landroid/widget/AdapterView;)V

    goto :goto_0

    .line 614
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->h(Lcom/qihoo/security/widget/MaterialRippleLayout;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 616
    iget-object v0, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$a;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-static {v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    goto :goto_0
.end method
