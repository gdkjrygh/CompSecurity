.class public Lorg/chromium/ui/DropdownAdapter;
.super Landroid/widget/ArrayAdapter;
.source "DropdownAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lorg/chromium/ui/DropdownItem;",
        ">;"
    }
.end annotation


# instance fields
.field private mAreAllItemsEnabled:Z

.field private mContext:Landroid/content/Context;

.field private mSeparators:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/util/Set;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lorg/chromium/ui/DropdownItem;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 32
    .local p2, "items":Ljava/util/List;, "Ljava/util/List<Lorg/chromium/ui/DropdownItem;>;"
    .local p3, "separators":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    sget v0, Lorg/chromium/ui/R$layout;->dropdown_item:I

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 33
    iput-object p3, p0, Lorg/chromium/ui/DropdownAdapter;->mSeparators:Ljava/util/Set;

    .line 34
    iput-object p1, p0, Lorg/chromium/ui/DropdownAdapter;->mContext:Landroid/content/Context;

    .line 35
    invoke-direct {p0}, Lorg/chromium/ui/DropdownAdapter;->checkAreAllItemsEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/ui/DropdownAdapter;->mAreAllItemsEnabled:Z

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Lorg/chromium/ui/DropdownItem;Ljava/util/Set;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "items"    # [Lorg/chromium/ui/DropdownItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[",
            "Lorg/chromium/ui/DropdownItem;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 39
    .local p3, "separators":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    sget v0, Lorg/chromium/ui/R$layout;->dropdown_item:I

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 40
    iput-object p3, p0, Lorg/chromium/ui/DropdownAdapter;->mSeparators:Ljava/util/Set;

    .line 41
    iput-object p1, p0, Lorg/chromium/ui/DropdownAdapter;->mContext:Landroid/content/Context;

    .line 42
    invoke-direct {p0}, Lorg/chromium/ui/DropdownAdapter;->checkAreAllItemsEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lorg/chromium/ui/DropdownAdapter;->mAreAllItemsEnabled:Z

    .line 43
    return-void
.end method

.method private checkAreAllItemsEnabled()Z
    .locals 3

    .prologue
    .line 46
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {p0}, Lorg/chromium/ui/DropdownAdapter;->getCount()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 47
    invoke-virtual {p0, v0}, Lorg/chromium/ui/DropdownAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/chromium/ui/DropdownItem;

    .line 48
    .local v1, "item":Lorg/chromium/ui/DropdownItem;
    invoke-interface {v1}, Lorg/chromium/ui/DropdownItem;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Lorg/chromium/ui/DropdownItem;->isGroupHeader()Z

    move-result v2

    if-nez v2, :cond_0

    .line 49
    const/4 v2, 0x0

    .line 52
    .end local v1    # "item":Lorg/chromium/ui/DropdownItem;
    :goto_1
    return v2

    .line 46
    .restart local v1    # "item":Lorg/chromium/ui/DropdownItem;
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 52
    .end local v1    # "item":Lorg/chromium/ui/DropdownItem;
    :cond_1
    const/4 v2, 0x1

    goto :goto_1
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 110
    iget-boolean v0, p0, Lorg/chromium/ui/DropdownAdapter;->mAreAllItemsEnabled:Z

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 57
    move-object v6, p2

    .line 58
    .local v6, "layout":Landroid/view/View;
    if-nez p2, :cond_0

    .line 59
    iget-object v9, p0, Lorg/chromium/ui/DropdownAdapter;->mContext:Landroid/content/Context;

    const-string v10, "layout_inflater"

    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/LayoutInflater;

    .line 61
    .local v3, "inflater":Landroid/view/LayoutInflater;
    sget v9, Lorg/chromium/ui/R$layout;->dropdown_item:I

    const/4 v10, 0x0

    invoke-virtual {v3, v9, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 62
    new-instance v9, Lorg/chromium/ui/DropdownDividerDrawable;

    invoke-direct {v9}, Lorg/chromium/ui/DropdownDividerDrawable;-><init>()V

    invoke-static {v6, v9}, Lorg/chromium/base/ApiCompatibilityUtils;->setBackgroundForView(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 65
    .end local v3    # "inflater":Landroid/view/LayoutInflater;
    :cond_0
    invoke-virtual {p0, p1}, Lorg/chromium/ui/DropdownAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/chromium/ui/DropdownItem;

    .line 67
    .local v4, "item":Lorg/chromium/ui/DropdownItem;
    sget v9, Lorg/chromium/ui/R$id;->dropdown_label:I

    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 68
    .local v5, "labelView":Landroid/widget/TextView;
    invoke-interface {v4}, Lorg/chromium/ui/DropdownItem;->getLabel()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    invoke-interface {v4}, Lorg/chromium/ui/DropdownItem;->isEnabled()Z

    move-result v9

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 71
    invoke-interface {v4}, Lorg/chromium/ui/DropdownItem;->isGroupHeader()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 72
    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {v5, v9, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 77
    :goto_0
    invoke-virtual {v6}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lorg/chromium/ui/DropdownDividerDrawable;

    .line 78
    .local v0, "divider":Lorg/chromium/ui/DropdownDividerDrawable;
    iget-object v9, p0, Lorg/chromium/ui/DropdownAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, Lorg/chromium/ui/R$dimen;->dropdown_item_height:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 79
    .local v2, "height":I
    if-nez p1, :cond_2

    .line 80
    const/4 v9, 0x0

    invoke-virtual {v0, v9}, Lorg/chromium/ui/DropdownDividerDrawable;->setColor(I)V

    .line 94
    :goto_1
    new-instance v9, Landroid/widget/AbsListView$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v9, v10, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    sget v9, Lorg/chromium/ui/R$id;->dropdown_sublabel:I

    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 97
    .local v8, "sublabelView":Landroid/widget/TextView;
    invoke-interface {v4}, Lorg/chromium/ui/DropdownItem;->getSublabel()Ljava/lang/String;

    move-result-object v7

    .line 98
    .local v7, "sublabel":Ljava/lang/CharSequence;
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 99
    const/16 v9, 0x8

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 105
    :goto_2
    return-object v6

    .line 74
    .end local v0    # "divider":Lorg/chromium/ui/DropdownDividerDrawable;
    .end local v2    # "height":I
    .end local v7    # "sublabel":Ljava/lang/CharSequence;
    .end local v8    # "sublabelView":Landroid/widget/TextView;
    :cond_1
    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual {v5, v9, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_0

    .line 82
    .restart local v0    # "divider":Lorg/chromium/ui/DropdownDividerDrawable;
    .restart local v2    # "height":I
    :cond_2
    iget-object v9, p0, Lorg/chromium/ui/DropdownAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, Lorg/chromium/ui/R$dimen;->dropdown_item_divider_height:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 84
    .local v1, "dividerHeight":I
    add-int/2addr v2, v1

    .line 85
    invoke-virtual {v0, v1}, Lorg/chromium/ui/DropdownDividerDrawable;->setHeight(I)V

    .line 86
    iget-object v9, p0, Lorg/chromium/ui/DropdownAdapter;->mSeparators:Ljava/util/Set;

    if-eqz v9, :cond_3

    iget-object v9, p0, Lorg/chromium/ui/DropdownAdapter;->mSeparators:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 87
    iget-object v9, p0, Lorg/chromium/ui/DropdownAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, Lorg/chromium/ui/R$color;->dropdown_dark_divider_color:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Lorg/chromium/ui/DropdownDividerDrawable;->setColor(I)V

    goto :goto_1

    .line 90
    :cond_3
    iget-object v9, p0, Lorg/chromium/ui/DropdownAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    sget v10, Lorg/chromium/ui/R$color;->dropdown_divider_color:I

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-virtual {v0, v9}, Lorg/chromium/ui/DropdownDividerDrawable;->setColor(I)V

    goto :goto_1

    .line 101
    .end local v1    # "dividerHeight":I
    .restart local v7    # "sublabel":Ljava/lang/CharSequence;
    .restart local v8    # "sublabelView":Landroid/widget/TextView;
    :cond_4
    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method

.method public isEnabled(I)Z
    .locals 3
    .param p1, "position"    # I

    .prologue
    const/4 v1, 0x0

    .line 115
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lorg/chromium/ui/DropdownAdapter;->getCount()I

    move-result v2

    if-lt p1, v2, :cond_1

    .line 117
    :cond_0
    :goto_0
    return v1

    .line 116
    :cond_1
    invoke-virtual {p0, p1}, Lorg/chromium/ui/DropdownAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/ui/DropdownItem;

    .line 117
    .local v0, "item":Lorg/chromium/ui/DropdownItem;
    invoke-interface {v0}, Lorg/chromium/ui/DropdownItem;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Lorg/chromium/ui/DropdownItem;->isGroupHeader()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0
.end method
