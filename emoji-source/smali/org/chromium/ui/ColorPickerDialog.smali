.class public Lorg/chromium/ui/ColorPickerDialog;
.super Landroid/app/AlertDialog;
.source "ColorPickerDialog.java"

# interfaces
.implements Lorg/chromium/ui/OnColorChangedListener;


# instance fields
.field private final mAdvancedColorPicker:Lorg/chromium/ui/ColorPickerAdvanced;

.field private mCurrentColor:I

.field private final mCurrentColorView:Landroid/view/View;

.field private final mInitialColor:I

.field private final mListener:Lorg/chromium/ui/OnColorChangedListener;

.field private final mMoreButton:Landroid/widget/Button;

.field private final mSimpleColorPicker:Lorg/chromium/ui/ColorPickerSimple;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/chromium/ui/OnColorChangedListener;I[Lorg/chromium/ui/ColorSuggestion;)V
    .locals 9
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "listener"    # Lorg/chromium/ui/OnColorChangedListener;
    .param p3, "color"    # I
    .param p4, "suggestions"    # [Lorg/chromium/ui/ColorSuggestion;

    .prologue
    const/4 v8, 0x0

    .line 46
    const/4 v6, 0x0

    invoke-direct {p0, p1, v6}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    .line 48
    iput-object p2, p0, Lorg/chromium/ui/ColorPickerDialog;->mListener:Lorg/chromium/ui/OnColorChangedListener;

    .line 49
    iput p3, p0, Lorg/chromium/ui/ColorPickerDialog;->mInitialColor:I

    .line 50
    iget v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mInitialColor:I

    iput v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mCurrentColor:I

    .line 53
    const-string v6, "layout_inflater"

    invoke-virtual {p1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    .line 55
    .local v1, "inflater":Landroid/view/LayoutInflater;
    sget v6, Lorg/chromium/ui/R$layout;->color_picker_dialog_title:I

    invoke-virtual {v1, v6, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 56
    .local v4, "title":Landroid/view/View;
    invoke-virtual {p0, v4}, Lorg/chromium/ui/ColorPickerDialog;->setCustomTitle(Landroid/view/View;)V

    .line 58
    sget v6, Lorg/chromium/ui/R$id;->selected_color_view:I

    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mCurrentColorView:Landroid/view/View;

    .line 60
    sget v6, Lorg/chromium/ui/R$id;->title:I

    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 61
    .local v5, "titleText":Landroid/widget/TextView;
    sget v6, Lorg/chromium/ui/R$string;->color_picker_dialog_title:I

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(I)V

    .line 64
    sget v6, Lorg/chromium/ui/R$string;->color_picker_button_set:I

    invoke-virtual {p1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 65
    .local v3, "positiveButtonText":Ljava/lang/String;
    const/4 v6, -0x1

    new-instance v7, Lorg/chromium/ui/ColorPickerDialog$1;

    invoke-direct {v7, p0}, Lorg/chromium/ui/ColorPickerDialog$1;-><init>(Lorg/chromium/ui/ColorPickerDialog;)V

    invoke-virtual {p0, v6, v3, v7}, Lorg/chromium/ui/ColorPickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 80
    sget v6, Lorg/chromium/ui/R$string;->color_picker_button_cancel:I

    invoke-virtual {p1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 81
    .local v2, "negativeButtonText":Ljava/lang/String;
    const/4 v6, -0x2

    new-instance v7, Lorg/chromium/ui/ColorPickerDialog$2;

    invoke-direct {v7, p0}, Lorg/chromium/ui/ColorPickerDialog$2;-><init>(Lorg/chromium/ui/ColorPickerDialog;)V

    invoke-virtual {p0, v6, v2, v7}, Lorg/chromium/ui/ColorPickerDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 89
    new-instance v6, Lorg/chromium/ui/ColorPickerDialog$3;

    invoke-direct {v6, p0}, Lorg/chromium/ui/ColorPickerDialog$3;-><init>(Lorg/chromium/ui/ColorPickerDialog;)V

    invoke-virtual {p0, v6}, Lorg/chromium/ui/ColorPickerDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 97
    sget v6, Lorg/chromium/ui/R$layout;->color_picker_dialog_content:I

    invoke-virtual {v1, v6, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 98
    .local v0, "content":Landroid/view/View;
    invoke-virtual {p0, v0}, Lorg/chromium/ui/ColorPickerDialog;->setView(Landroid/view/View;)V

    .line 101
    sget v6, Lorg/chromium/ui/R$id;->more_colors_button:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mMoreButton:Landroid/widget/Button;

    .line 102
    iget-object v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mMoreButton:Landroid/widget/Button;

    new-instance v7, Lorg/chromium/ui/ColorPickerDialog$4;

    invoke-direct {v7, p0}, Lorg/chromium/ui/ColorPickerDialog$4;-><init>(Lorg/chromium/ui/ColorPickerDialog;)V

    invoke-virtual {v6, v7}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    sget v6, Lorg/chromium/ui/R$id;->color_picker_advanced:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lorg/chromium/ui/ColorPickerAdvanced;

    iput-object v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mAdvancedColorPicker:Lorg/chromium/ui/ColorPickerAdvanced;

    .line 112
    iget-object v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mAdvancedColorPicker:Lorg/chromium/ui/ColorPickerAdvanced;

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, Lorg/chromium/ui/ColorPickerAdvanced;->setVisibility(I)V

    .line 115
    sget v6, Lorg/chromium/ui/R$id;->color_picker_simple:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lorg/chromium/ui/ColorPickerSimple;

    iput-object v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mSimpleColorPicker:Lorg/chromium/ui/ColorPickerSimple;

    .line 116
    iget-object v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mSimpleColorPicker:Lorg/chromium/ui/ColorPickerSimple;

    invoke-virtual {v6, p4, p0}, Lorg/chromium/ui/ColorPickerSimple;->init([Lorg/chromium/ui/ColorSuggestion;Lorg/chromium/ui/OnColorChangedListener;)V

    .line 118
    iget v6, p0, Lorg/chromium/ui/ColorPickerDialog;->mInitialColor:I

    invoke-direct {p0, v6}, Lorg/chromium/ui/ColorPickerDialog;->updateCurrentColor(I)V

    .line 119
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/ui/ColorPickerDialog;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/ColorPickerDialog;

    .prologue
    .line 20
    iget v0, p0, Lorg/chromium/ui/ColorPickerDialog;->mCurrentColor:I

    return v0
.end method

.method static synthetic access$100(Lorg/chromium/ui/ColorPickerDialog;I)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/ui/ColorPickerDialog;
    .param p1, "x1"    # I

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lorg/chromium/ui/ColorPickerDialog;->tryNotifyColorSet(I)V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/ui/ColorPickerDialog;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/ui/ColorPickerDialog;

    .prologue
    .line 20
    iget v0, p0, Lorg/chromium/ui/ColorPickerDialog;->mInitialColor:I

    return v0
.end method

.method static synthetic access$300(Lorg/chromium/ui/ColorPickerDialog;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/ui/ColorPickerDialog;

    .prologue
    .line 20
    invoke-direct {p0}, Lorg/chromium/ui/ColorPickerDialog;->showAdvancedView()V

    return-void
.end method

.method private showAdvancedView()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 139
    sget v2, Lorg/chromium/ui/R$id;->more_colors_button_border:I

    invoke-virtual {p0, v2}, Lorg/chromium/ui/ColorPickerDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 140
    .local v0, "buttonBorder":Landroid/view/View;
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 142
    sget v2, Lorg/chromium/ui/R$id;->color_picker_simple:I

    invoke-virtual {p0, v2}, Lorg/chromium/ui/ColorPickerDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 143
    .local v1, "simpleView":Landroid/view/View;
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 145
    iget-object v2, p0, Lorg/chromium/ui/ColorPickerDialog;->mAdvancedColorPicker:Lorg/chromium/ui/ColorPickerAdvanced;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lorg/chromium/ui/ColorPickerAdvanced;->setVisibility(I)V

    .line 146
    iget-object v2, p0, Lorg/chromium/ui/ColorPickerDialog;->mAdvancedColorPicker:Lorg/chromium/ui/ColorPickerAdvanced;

    invoke-virtual {v2, p0}, Lorg/chromium/ui/ColorPickerAdvanced;->setListener(Lorg/chromium/ui/OnColorChangedListener;)V

    .line 147
    iget-object v2, p0, Lorg/chromium/ui/ColorPickerDialog;->mAdvancedColorPicker:Lorg/chromium/ui/ColorPickerAdvanced;

    iget v3, p0, Lorg/chromium/ui/ColorPickerDialog;->mCurrentColor:I

    invoke-virtual {v2, v3}, Lorg/chromium/ui/ColorPickerAdvanced;->setColor(I)V

    .line 148
    return-void
.end method

.method private tryNotifyColorSet(I)V
    .locals 1
    .param p1, "color"    # I

    .prologue
    .line 154
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerDialog;->mListener:Lorg/chromium/ui/OnColorChangedListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/ui/ColorPickerDialog;->mListener:Lorg/chromium/ui/OnColorChangedListener;

    invoke-interface {v0, p1}, Lorg/chromium/ui/OnColorChangedListener;->onColorChanged(I)V

    .line 155
    :cond_0
    return-void
.end method

.method private updateCurrentColor(I)V
    .locals 1
    .param p1, "color"    # I

    .prologue
    .line 162
    iput p1, p0, Lorg/chromium/ui/ColorPickerDialog;->mCurrentColor:I

    .line 163
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerDialog;->mCurrentColorView:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/chromium/ui/ColorPickerDialog;->mCurrentColorView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 164
    :cond_0
    return-void
.end method


# virtual methods
.method public onColorChanged(I)V
    .locals 0
    .param p1, "color"    # I

    .prologue
    .line 129
    invoke-direct {p0, p1}, Lorg/chromium/ui/ColorPickerDialog;->updateCurrentColor(I)V

    .line 130
    return-void
.end method
