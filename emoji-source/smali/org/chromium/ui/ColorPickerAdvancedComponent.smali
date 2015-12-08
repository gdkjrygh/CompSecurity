.class public Lorg/chromium/ui/ColorPickerAdvancedComponent;
.super Ljava/lang/Object;
.source "ColorPickerAdvancedComponent.java"


# instance fields
.field private mGradientColors:[I

.field private mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

.field private final mGradientView:Landroid/view/View;

.field private final mSeekBar:Landroid/widget/SeekBar;

.field private final mText:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Landroid/view/View;IILandroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 5
    .param p1, "rootView"    # Landroid/view/View;
    .param p2, "textResourceId"    # I
    .param p3, "seekBarMax"    # I
    .param p4, "seekBarListener"    # Landroid/widget/SeekBar$OnSeekBarChangeListener;

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    sget v2, Lorg/chromium/ui/R$id;->gradient:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientView:Landroid/view/View;

    .line 49
    sget v2, Lorg/chromium/ui/R$id;->text:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mText:Landroid/widget/TextView;

    .line 50
    iget-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mText:Landroid/widget/TextView;

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(I)V

    .line 51
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    sget-object v3, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    iput-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    .line 52
    sget v2, Lorg/chromium/ui/R$id;->seek_bar:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/SeekBar;

    iput-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mSeekBar:Landroid/widget/SeekBar;

    .line 53
    iget-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mSeekBar:Landroid/widget/SeekBar;

    invoke-virtual {v2, p4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 54
    iget-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mSeekBar:Landroid/widget/SeekBar;

    invoke-virtual {v2, p3}, Landroid/widget/SeekBar;->setMax(I)V

    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 58
    .local v0, "context":Landroid/content/Context;
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lorg/chromium/ui/R$drawable;->color_picker_advanced_select_handle:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    .line 61
    .local v1, "offset":I
    iget-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mSeekBar:Landroid/widget/SeekBar;

    div-int/lit8 v3, v1, 0x2

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setThumbOffset(I)V

    .line 62
    return-void
.end method


# virtual methods
.method public getValue()F
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mSeekBar:Landroid/widget/SeekBar;

    invoke-virtual {v0}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public setGradientColors([I)V
    .locals 3
    .param p1, "newColors"    # [I

    .prologue
    .line 86
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientColors:[I

    .line 87
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    .line 88
    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 89
    .local v0, "currentOrientation":Landroid/graphics/drawable/GradientDrawable$Orientation;
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    iget-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientColors:[I

    invoke-direct {v1, v0, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    iput-object v1, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    .line 93
    .end local v0    # "currentOrientation":Landroid/graphics/drawable/GradientDrawable$Orientation;
    :goto_0
    iget-object v1, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientView:Landroid/view/View;

    iget-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-static {v1, v2}, Lorg/chromium/base/ApiCompatibilityUtils;->setBackgroundForView(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 94
    return-void

    .line 91
    :cond_0
    iget-object v1, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget-object v2, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mGradientColors:[I

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    goto :goto_0
.end method

.method public setValue(F)V
    .locals 2
    .param p1, "newValue"    # F

    .prologue
    .line 77
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerAdvancedComponent;->mSeekBar:Landroid/widget/SeekBar;

    float-to-int v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 78
    return-void
.end method
