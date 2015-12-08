.class public Lcom/arist/model/skin/ColorPickerPreference;
.super Landroid/preference/Preference;

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;
.implements Lcom/arist/model/skin/i;


# instance fields
.field a:Landroid/view/View;

.field b:Lcom/arist/model/skin/g;

.field private c:I

.field private d:F

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->d:F

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorPickerPreference;->e:Z

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorPickerPreference;->f:Z

    invoke-direct {p0, p2}, Lcom/arist/model/skin/ColorPickerPreference;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->c:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->d:F

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorPickerPreference;->e:Z

    iput-boolean v1, p0, Lcom/arist/model/skin/ColorPickerPreference;->f:Z

    invoke-direct {p0, p2}, Lcom/arist/model/skin/ColorPickerPreference;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)I
    .locals 2

    const-string v0, "#"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_0
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private a()V
    .locals 7

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->a:Landroid/view/View;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v1, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->a:Landroid/view/View;

    const v2, 0x1020018

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingTop()I

    move-result v3

    iget v4, p0, Lcom/arist/model/skin/ColorPickerPreference;->d:F

    const/high16 v5, 0x41000000    # 8.0f

    mul-float/2addr v4, v5

    float-to-int v4, v4

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getPaddingBottom()I

    move-result v5

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {v0, v6, v2}, Landroid/widget/LinearLayout;->removeViews(II)V

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setMinimumWidth(I)V

    new-instance v0, Lcom/arist/model/skin/a;

    const/high16 v2, 0x40a00000    # 5.0f

    iget v3, p0, Lcom/arist/model/skin/ColorPickerPreference;->d:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-direct {v0, v2}, Lcom/arist/model/skin/a;-><init>(I)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/arist/model/skin/ColorPickerPreference;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lcom/arist/model/skin/g;

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/arist/model/skin/ColorPickerPreference;->c:I

    invoke-direct {v0, v1, v2}, Lcom/arist/model/skin/g;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v0, p0}, Lcom/arist/model/skin/g;->a(Lcom/arist/model/skin/i;)V

    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v0}, Lcom/arist/model/skin/g;->b()V

    :cond_0
    iget-boolean v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v0}, Lcom/arist/model/skin/g;->a()V

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v0, p1}, Lcom/arist/model/skin/g;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_2
    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v0}, Lcom/arist/model/skin/g;->show()V

    return-void
.end method

.method private a(Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->d:F

    invoke-virtual {p0, p0}, Lcom/arist/model/skin/ColorPickerPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    if-eqz p1, :cond_0

    const-string v0, "alphaSlider"

    invoke-interface {p1, v2, v0, v1}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->e:Z

    const-string v0, "hexValue"

    invoke-interface {p1, v2, v0, v1}, Landroid/util/AttributeSet;->getAttributeBooleanValue(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->f:Z

    :cond_0
    return-void
.end method

.method private b()Landroid/graphics/Bitmap;
    .locals 8

    const/4 v7, 0x1

    iget v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->d:F

    const/high16 v1, 0x41a80000    # 21.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p0, Lcom/arist/model/skin/ColorPickerPreference;->c:I

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v5, :cond_0

    return-object v4

    :cond_0
    move v2, v3

    :goto_1
    if-lt v2, v6, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-le v3, v7, :cond_2

    if-le v2, v7, :cond_2

    add-int/lit8 v0, v5, -0x2

    if-ge v3, v0, :cond_2

    add-int/lit8 v0, v6, -0x2

    if-lt v2, v0, :cond_4

    :cond_2
    const v0, -0x777778

    :goto_2
    invoke-virtual {v4, v3, v2, v0}, Landroid/graphics/Bitmap;->setPixel(III)V

    if-eq v3, v2, :cond_3

    invoke-virtual {v4, v2, v3, v0}, Landroid/graphics/Bitmap;->setPixel(III)V

    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_2
.end method

.method public static b(I)Ljava/lang/String;
    .locals 7

    const/4 v6, 0x1

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v4, v6, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "0"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v4, v6, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "0"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v4, v6, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "0"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v4, v6, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "0"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "#"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(I)Ljava/lang/String;
    .locals 6

    const/4 v5, 0x1

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v5, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "0"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v5, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "0"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v5, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "0"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "#"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPreference;->isPersistent()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/arist/model/skin/ColorPickerPreference;->persistInt(I)Z

    :cond_0
    iput p1, p0, Lcom/arist/model/skin/ColorPickerPreference;->c:I

    invoke-direct {p0}, Lcom/arist/model/skin/ColorPickerPreference;->a()V

    :try_start_0
    invoke-virtual {p0}, Lcom/arist/model/skin/ColorPickerPreference;->getOnPreferenceChangeListener()Landroid/preference/Preference$OnPreferenceChangeListener;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Landroid/preference/Preference$OnPreferenceChangeListener;->onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    iput-object p1, p0, Lcom/arist/model/skin/ColorPickerPreference;->a:Landroid/view/View;

    invoke-direct {p0}, Lcom/arist/model/skin/ColorPickerPreference;->a()V

    return-void
.end method

.method protected onGetDefaultValue(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 1

    const/high16 v0, -0x1000000

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/arist/model/skin/ColorPickerPreference;->a(Landroid/os/Bundle;)V

    const/4 v0, 0x0

    return v0
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/arist/model/skin/ColorPickerPreference$SavedState;

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0, p1}, Landroid/preference/Preference;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    :goto_0
    return-void

    :cond_1
    check-cast p1, Lcom/arist/model/skin/ColorPickerPreference$SavedState;

    invoke-virtual {p1}, Lcom/arist/model/skin/ColorPickerPreference$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/preference/Preference;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p1, Lcom/arist/model/skin/ColorPickerPreference$SavedState;->a:Landroid/os/Bundle;

    invoke-direct {p0, v0}, Lcom/arist/model/skin/ColorPickerPreference;->a(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/preference/Preference;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v0}, Lcom/arist/model/skin/g;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lcom/arist/model/skin/ColorPickerPreference$SavedState;

    invoke-direct {v0, v1}, Lcom/arist/model/skin/ColorPickerPreference$SavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v1, p0, Lcom/arist/model/skin/ColorPickerPreference;->b:Lcom/arist/model/skin/g;

    invoke-virtual {v1}, Lcom/arist/model/skin/g;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Lcom/arist/model/skin/ColorPickerPreference$SavedState;->a:Landroid/os/Bundle;

    goto :goto_0
.end method

.method protected onSetInitialValue(ZLjava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/arist/model/skin/ColorPickerPreference;->c:I

    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorPickerPreference;->getPersistedInt(I)I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/arist/model/skin/ColorPickerPreference;->a(I)V

    return-void

    :cond_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method
