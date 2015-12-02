.class public Lcom/facebook/widget/listview/EmptyListViewItem;
.super Lcom/facebook/widget/f;
.source "EmptyListViewItem.java"


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/ProgressBar;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    invoke-direct {p0, p2}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Landroid/util/AttributeSet;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    invoke-direct {p0, p2}, Lcom/facebook/widget/listview/EmptyListViewItem;->a(Landroid/util/AttributeSet;)V

    .line 47
    return-void
.end method

.method private a(Landroid/util/AttributeSet;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 50
    invoke-virtual {p0}, Lcom/facebook/widget/listview/EmptyListViewItem;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Landroid/view/LayoutInflater;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->a:Landroid/view/LayoutInflater;

    .line 51
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_empty_list_view_item:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->b:Landroid/view/View;

    .line 52
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->b:Landroid/view/View;

    sget v1, Lcom/facebook/i;->empty_item_wrapper:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->c:Landroid/widget/RelativeLayout;

    .line 53
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->b:Landroid/view/View;

    sget v1, Lcom/facebook/i;->empty_item_progress:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->d:Landroid/widget/ProgressBar;

    .line 54
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->b:Landroid/view/View;

    sget v1, Lcom/facebook/i;->empty_item_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->e:Landroid/widget/TextView;

    .line 56
    invoke-virtual {p0}, Lcom/facebook/widget/listview/EmptyListViewItem;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->EmptyListViewItem:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 58
    sget v1, Lcom/facebook/q;->EmptyListViewItem_textColor:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 59
    iget-object v1, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->e:Landroid/widget/TextView;

    sget v2, Lcom/facebook/q;->EmptyListViewItem_textColor:I

    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    :cond_0
    sget v1, Lcom/facebook/q;->EmptyListViewItem_empty_background_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 63
    iget-object v1, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->c:Landroid/widget/RelativeLayout;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/q;->EmptyListViewItem_empty_background_color:I

    invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 67
    :cond_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    .prologue
    .line 92
    iget-object v1, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->d:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 93
    return-void

    .line 92
    :cond_0
    const/4 v0, 0x4

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->d:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 73
    return-void
.end method

.method public setMessage(I)V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 85
    return-void
.end method

.method public setMessage(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    return-void
.end method

.method public setMovementMethod(Landroid/text/method/MovementMethod;)V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 89
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/widget/listview/EmptyListViewItem;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 77
    return-void
.end method
