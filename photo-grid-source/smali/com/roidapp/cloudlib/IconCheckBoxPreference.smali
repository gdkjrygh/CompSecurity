.class public Lcom/roidapp/cloudlib/IconCheckBoxPreference;
.super Landroid/preference/CheckBoxPreference;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 16
    invoke-direct {p0, p1, p2, p3}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    sget-object v0, Lcom/roidapp/cloudlib/av;->g:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 18
    sget v1, Lcom/roidapp/cloudlib/av;->h:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a:Landroid/graphics/drawable/Drawable;

    .line 23
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 24
    sget v0, Lcom/roidapp/cloudlib/as;->H:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setLayoutResource(I)V

    .line 26
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 48
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    :cond_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 49
    :cond_1
    iput-object p1, p0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a:Landroid/graphics/drawable/Drawable;

    .line 50
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->notifyChanged()V

    .line 52
    :cond_2
    return-void
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 34
    invoke-super {p0, p1}, Landroid/preference/CheckBoxPreference;->onBindView(Landroid/view/View;)V

    .line 35
    sget v0, Lcom/roidapp/cloudlib/ar;->bc:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 36
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 37
    iget-object v1, p0, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 39
    :cond_0
    return-void
.end method
