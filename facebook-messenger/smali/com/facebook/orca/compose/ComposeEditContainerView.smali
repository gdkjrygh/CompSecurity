.class public Lcom/facebook/orca/compose/ComposeEditContainerView;
.super Landroid/widget/LinearLayout;
.source "ComposeEditContainerView.java"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    return-void
.end method

.method private a(II)V
    .locals 5

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/compose/ComposeEditContainerView;->a:Landroid/view/View;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lcom/facebook/widget/f/d;->a(Landroid/view/View;I)Landroid/view/TouchDelegate;

    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/facebook/orca/compose/ComposeEditContainerView;->b:Landroid/view/View;

    invoke-static {v1, p1, p2}, Lcom/facebook/widget/f/d;->a(Landroid/view/View;II)Landroid/view/TouchDelegate;

    move-result-object v1

    .line 61
    new-instance v2, Lcom/facebook/common/t/a/a;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/view/TouchDelegate;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-direct {v2, p0, v3}, Lcom/facebook/common/t/a/a;-><init>(Landroid/view/View;[Landroid/view/TouchDelegate;)V

    .line 63
    invoke-virtual {p0, v2}, Lcom/facebook/orca/compose/ComposeEditContainerView;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 64
    return-void
.end method


# virtual methods
.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 34
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 36
    sget v0, Lcom/facebook/i;->compose_button_location:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeEditContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeEditContainerView;->a:Landroid/view/View;

    .line 37
    sget v0, Lcom/facebook/i;->compose_edit_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeEditContainerView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/compose/ComposeEditContainerView;->b:Landroid/view/View;

    .line 40
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/orca/compose/ComposeEditContainerView;->setAddStatesFromChildren(Z)V

    .line 41
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .prologue
    .line 46
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 48
    if-eqz p1, :cond_0

    .line 49
    invoke-direct {p0, p3, p5}, Lcom/facebook/orca/compose/ComposeEditContainerView;->a(II)V

    .line 51
    :cond_0
    return-void
.end method
