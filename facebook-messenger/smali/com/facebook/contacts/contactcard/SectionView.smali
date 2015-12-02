.class public Lcom/facebook/contacts/contactcard/SectionView;
.super Lcom/facebook/widget/f;
.source "SectionView.java"


# instance fields
.field private final a:Landroid/widget/FrameLayout;

.field private final b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/SectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/SectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    sget v0, Lcom/facebook/k;->contacts_section_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/SectionView;->setContentView(I)V

    .line 36
    sget v0, Lcom/facebook/i;->row_list:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/SectionView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    .line 37
    sget v0, Lcom/facebook/i;->entry_section_root:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/SectionView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->a:Landroid/widget/FrameLayout;

    .line 38
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/SectionView;->b()V

    .line 39
    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 65
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 73
    :cond_0
    :goto_0
    return-void

    .line 69
    :cond_1
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 70
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-eqz v1, :cond_0

    .line 71
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    goto :goto_0
.end method

.method protected a(Landroid/view/View;Z)V
    .locals 5

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 48
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/SectionView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 50
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/SectionView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/g;->divider_width:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/SectionView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->default_separator_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 57
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 60
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->a:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 61
    return-void
.end method

.method protected b()V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->a:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 43
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/SectionView;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 44
    return-void
.end method

.method protected b(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/facebook/contacts/contactcard/SectionView;->a(Landroid/view/View;Z)V

    .line 77
    return-void
.end method
