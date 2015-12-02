.class public Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;
.super Landroid/widget/LinearLayout;
.source "ListMenuItemView.java"

# interfaces
.implements Lcom/actionbarsherlock/internal/view/menu/k;


# instance fields
.field final a:Landroid/content/Context;

.field private b:Lcom/actionbarsherlock/internal/view/menu/c;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/RadioButton;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/CheckBox;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:I

.field private j:Landroid/content/Context;

.field private k:Z

.field private l:Landroid/view/LayoutInflater;

.field private m:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 63
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->a:Landroid/content/Context;

    .line 66
    sget-object v0, Lcom/facebook/q;->SherlockMenuView:[I

    invoke-virtual {p1, p2, v0, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 70
    sget v1, Lcom/facebook/q;->SherlockMenuView_itemBackground:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->h:Landroid/graphics/drawable/Drawable;

    .line 71
    sget v1, Lcom/facebook/q;->SherlockMenuView_itemTextAppearance:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->i:I

    .line 73
    sget v1, Lcom/facebook/q;->SherlockMenuView_preserveIconSpacing:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->k:Z

    .line 75
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->j:Landroid/content/Context;

    .line 77
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 244
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 245
    sget v1, Lcom/facebook/k;->abs__list_menu_item_icon:I

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    .line 247
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    invoke-virtual {p0, v0, v2}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;I)V

    .line 248
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 251
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 252
    sget v1, Lcom/facebook/k;->abs__list_menu_item_radio:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    .line 255
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V

    .line 256
    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 259
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 260
    sget v1, Lcom/facebook/k;->abs__list_menu_item_checkbox:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    .line 263
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V

    .line 264
    return-void
.end method

.method private getInflater()Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 275
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->l:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->l:Landroid/view/LayoutInflater;

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->l:Landroid/view/LayoutInflater;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/actionbarsherlock/internal/view/menu/c;I)V
    .locals 2

    .prologue
    .line 100
    iput-object p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    .line 103
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/c;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setVisibility(I)V

    .line 105
    invoke-virtual {p1, p0}, Lcom/actionbarsherlock/internal/view/menu/c;->a(Lcom/actionbarsherlock/internal/view/menu/k;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 106
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/c;->r()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setCheckable(Z)V

    .line 107
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/c;->l()Z

    move-result v0

    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/c;->j()C

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->a(ZC)V

    .line 108
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/c;->q()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 109
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/c;->b()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setEnabled(Z)V

    .line 110
    return-void

    .line 103
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public a(ZC)V
    .locals 3

    .prologue
    .line 193
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->l()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 196
    :goto_0
    if-nez v0, :cond_0

    .line 197
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->g:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/view/menu/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    :cond_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->g:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    if-eq v1, v0, :cond_1

    .line 201
    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 203
    :cond_1
    return-void

    .line 193
    :cond_2
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 267
    const/4 v0, 0x0

    return v0
.end method

.method public getItemData()Lcom/actionbarsherlock/internal/view/menu/c;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    return-object v0
.end method

.method protected onFinishInflate()V
    .locals 3

    .prologue
    .line 86
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 88
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 90
    sget v0, Lcom/facebook/i;->abs__title:I

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->e:Landroid/widget/TextView;

    .line 91
    iget v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 92
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->j:Landroid/content/Context;

    iget v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->i:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 96
    :cond_0
    sget v0, Lcom/facebook/i;->abs__shortcut:I

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->g:Landroid/widget/TextView;

    .line 97
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 232
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->k:Z

    if-eqz v0, :cond_0

    .line 234
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 235
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 236
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v2, :cond_0

    iget v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-gtz v2, :cond_0

    .line 237
    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 240
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 241
    return-void
.end method

.method public setCheckable(Z)V
    .locals 5

    .prologue
    const/16 v1, 0x8

    .line 132
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    if-nez v0, :cond_1

    .line 172
    :cond_0
    :goto_0
    return-void

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    if-nez v0, :cond_2

    .line 137
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c()V

    .line 139
    :cond_2
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    if-nez v0, :cond_3

    .line 140
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d()V

    .line 148
    :cond_3
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->s()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 149
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    .line 150
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    move-object v3, v2

    move-object v2, v0

    .line 156
    :goto_1
    if-eqz p1, :cond_7

    .line 157
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->t()Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 159
    if-eqz p1, :cond_6

    const/4 v0, 0x0

    .line 160
    :goto_2
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->getVisibility()I

    move-result v4

    if-eq v4, v0, :cond_4

    .line 161
    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 165
    :cond_4
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 166
    invoke-virtual {v2, v1}, Landroid/widget/CompoundButton;->setVisibility(I)V

    goto :goto_0

    .line 152
    :cond_5
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    .line 153
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    move-object v3, v2

    move-object v2, v0

    goto :goto_1

    :cond_6
    move v0, v1

    .line 159
    goto :goto_2

    .line 169
    :cond_7
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    goto :goto_0
.end method

.method public setChecked(Z)V
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->s()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    if-nez v0, :cond_0

    .line 179
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c()V

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d:Landroid/widget/RadioButton;

    .line 189
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 190
    return-void

    .line 183
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    if-nez v0, :cond_2

    .line 184
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->d()V

    .line 186
    :cond_2
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->f:Landroid/widget/CheckBox;

    goto :goto_0
.end method

.method public setForceShowIcon(Z)V
    .locals 0

    .prologue
    .line 113
    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->m:Z

    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->k:Z

    .line 114
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 206
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/c;->w()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->m:Z

    if-eqz v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 207
    :goto_0
    if-nez v0, :cond_3

    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->k:Z

    if-nez v2, :cond_3

    .line 228
    :cond_1
    :goto_1
    return-void

    :cond_2
    move v0, v1

    .line 206
    goto :goto_0

    .line 211
    :cond_3
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    if-nez v2, :cond_4

    if-nez p1, :cond_4

    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->k:Z

    if-eqz v2, :cond_1

    .line 215
    :cond_4
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    if-nez v2, :cond_5

    .line 216
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->b()V

    .line 219
    :cond_5
    if-nez p1, :cond_6

    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->k:Z

    if-eqz v2, :cond_8

    .line 220
    :cond_6
    iget-object v2, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_7

    :goto_2
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 222
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 223
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 220
    :cond_7
    const/4 p1, 0x0

    goto :goto_2

    .line 226
    :cond_8
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 117
    if-eqz p1, :cond_1

    .line 118
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 124
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/ListMenuItemView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method
