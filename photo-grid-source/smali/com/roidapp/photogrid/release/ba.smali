.class public final Lcom/roidapp/photogrid/release/ba;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:[I

.field private c:[Ljava/lang/String;

.field private d:[Z


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;[I[Z)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ba;->a:Landroid/content/Context;

    .line 23
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ba;->b:[I

    .line 24
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ba;->c:[Ljava/lang/String;

    .line 25
    iput-object p4, p0, Lcom/roidapp/photogrid/release/ba;->d:[Z

    .line 26
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ba;->c:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ba;->c:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 37
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    .line 42
    if-nez p2, :cond_0

    .line 43
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ba;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030093

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 48
    :cond_0
    const v0, 0x7f0d0206

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 50
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ba;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ba;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    const/16 v2, 0x500

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ba;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    const/16 v2, 0x4a0

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ba;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    const/16 v2, 0x320

    if-ne v1, v2, :cond_2

    .line 54
    const/high16 v1, 0x41f00000    # 30.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 56
    :cond_2
    const v1, 0x7f0d0205

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 58
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ba;->c:[Ljava/lang/String;

    aget-object v2, v2, p1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ba;->d:[Z

    aget-boolean v2, v2, p1

    if-nez v2, :cond_3

    .line 60
    const/16 v2, 0x90

    const/16 v3, 0x97

    const/16 v4, 0x80

    invoke-static {v2, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ba;->b:[I

    aget v0, v0, p1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 64
    return-object p2
.end method
