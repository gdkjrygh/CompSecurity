.class public final Lcom/arist/model/skin/g;
.super Landroid/app/Dialog;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/arist/model/skin/k;


# instance fields
.field private a:Lcom/arist/model/skin/ColorPickerView;

.field private b:Lcom/arist/model/skin/ColorPickerPanelView;

.field private c:Lcom/arist/model/skin/ColorPickerPanelView;

.field private d:Landroid/widget/EditText;

.field private e:Z

.field private f:Landroid/content/res/ColorStateList;

.field private g:Lcom/arist/model/skin/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    const/4 v3, 0x0

    const v0, 0x1030075

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-boolean v3, p0, Lcom/arist/model/skin/g;->e:Z

    invoke-virtual {p0}, Lcom/arist/model/skin/g;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    invoke-virtual {p0}, Lcom/arist/model/skin/g;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v1, 0x7f030011

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/arist/model/skin/g;->setContentView(Landroid/view/View;)V

    const v0, 0x7f06005c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorPickerView;

    iput-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    const v0, 0x7f06005f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorPickerPanelView;

    iput-object v0, p0, Lcom/arist/model/skin/g;->b:Lcom/arist/model/skin/ColorPickerPanelView;

    const v0, 0x7f060060

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/skin/ColorPickerPanelView;

    iput-object v0, p0, Lcom/arist/model/skin/g;->c:Lcom/arist/model/skin/ColorPickerPanelView;

    const v0, 0x7f06005e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    const/high16 v1, 0x80000

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setInputType(I)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/model/skin/g;->f:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    new-instance v1, Lcom/arist/model/skin/h;

    invoke-direct {v1, p0}, Lcom/arist/model/skin/h;-><init>(Lcom/arist/model/skin/g;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->b:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorPickerPanelView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v1}, Lcom/arist/model/skin/ColorPickerView;->b()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v2}, Lcom/arist/model/skin/ColorPickerView;->b()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->b:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorPickerPanelView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->c:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorPickerPanelView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/ColorPickerView;->a(Lcom/arist/model/skin/k;)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->b:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v0, p2}, Lcom/arist/model/skin/ColorPickerPanelView;->a(I)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v0, p2}, Lcom/arist/model/skin/ColorPickerView;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/arist/model/skin/g;)Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic b(Lcom/arist/model/skin/g;)Lcom/arist/model/skin/ColorPickerView;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    return-object v0
.end method

.method private b(I)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorPickerView;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    invoke-static {p1}, Lcom/arist/model/skin/ColorPickerPreference;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/arist/model/skin/g;->f:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    invoke-static {p1}, Lcom/arist/model/skin/ColorPickerPreference;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/arist/model/skin/g;)Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/g;->f:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method private c()V
    .locals 5

    const/4 v1, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorPickerView;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/skin/g;->e:Z

    iget-object v0, p0, Lcom/arist/model/skin/g;->d:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    invoke-direct {p0}, Lcom/arist/model/skin/g;->c()V

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorPickerView;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/arist/model/skin/g;->b(I)V

    return-void
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/g;->c:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v0, p1}, Lcom/arist/model/skin/ColorPickerPanelView;->a(I)V

    iget-boolean v0, p0, Lcom/arist/model/skin/g;->e:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/arist/model/skin/g;->b(I)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/arist/model/skin/i;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/skin/g;->g:Lcom/arist/model/skin/i;

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorPickerView;->c()V

    iget-boolean v0, p0, Lcom/arist/model/skin/g;->e:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/arist/model/skin/g;->c()V

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    invoke-virtual {v0}, Lcom/arist/model/skin/ColorPickerView;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/arist/model/skin/g;->b(I)V

    :cond_0
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f060060

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/g;->g:Lcom/arist/model/skin/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/g;->g:Lcom/arist/model/skin/i;

    iget-object v1, p0, Lcom/arist/model/skin/g;->c:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v1}, Lcom/arist/model/skin/ColorPickerPanelView;->a()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/arist/model/skin/i;->a(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/arist/model/skin/g;->dismiss()V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->b:Lcom/arist/model/skin/ColorPickerPanelView;

    const-string v1, "old_color"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorPickerPanelView;->a(I)V

    iget-object v0, p0, Lcom/arist/model/skin/g;->a:Lcom/arist/model/skin/ColorPickerView;

    const-string v1, "new_color"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorPickerView;->a(I)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Bundle;
    .locals 3

    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "old_color"

    iget-object v2, p0, Lcom/arist/model/skin/g;->b:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v2}, Lcom/arist/model/skin/ColorPickerPanelView;->a()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "new_color"

    iget-object v2, p0, Lcom/arist/model/skin/g;->c:Lcom/arist/model/skin/ColorPickerPanelView;

    invoke-virtual {v2}, Lcom/arist/model/skin/ColorPickerPanelView;->a()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method
