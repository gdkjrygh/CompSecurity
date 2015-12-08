.class public final Lcom/roidapp/photogrid/cloud/a/m;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/CharSequence;

.field private b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 29
    const/4 v0, 0x4

    invoke-direct {p0, p1, v0, p2}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 31
    invoke-static {p1}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-ne v0, v5, :cond_2

    .line 32
    iput-boolean v5, p0, Lcom/roidapp/photogrid/cloud/a/m;->f:Z

    .line 38
    :goto_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    .line 39
    const-string v1, "ID"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 41
    const-string v0, "Lebih mulus, lebih cerah, dan lebih cantik! BeautyPlus\u2014\u2014penyempurna otomatis kecantikan Anda dalam satu ketuk."

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->a:Ljava/lang/CharSequence;

    .line 50
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->a:Ljava/lang/CharSequence;

    if-nez v0, :cond_5

    .line 51
    iput-boolean v5, p0, Lcom/roidapp/photogrid/cloud/a/m;->f:Z

    .line 60
    :cond_1
    :goto_2
    return-void

    .line 33
    :cond_2
    const-string v0, "com.commsource.beautyplus"

    invoke-static {p1, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->f:Z

    goto :goto_0

    .line 42
    :cond_3
    const-string v1, "MY"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 44
    const-string v0, "Lebih licin, lebih cerah dan lebih cantik! BeautyPlus\u2014\u2014penambah kecantikan auto magik anda dalam satu ketik."

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->a:Ljava/lang/CharSequence;

    goto :goto_1

    .line 45
    :cond_4
    const-string v1, "PH"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    const-string v0, "Mas makinis, mas makinang at mas maganda! BeautyPlus\u2014\u2014ang iyong magic na auto beauty enhancer sa isang tap lang."

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->a:Ljava/lang/CharSequence;

    goto :goto_1

    .line 53
    :cond_5
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    invoke-static {p1}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v2

    const-string v3, "ad"

    const-string v4, "beautyPlusRatio"

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/cloudlib/a/a;->b(Ljava/lang/String;Ljava/lang/String;)F

    move-result v2

    float-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 54
    iput-boolean v5, p0, Lcom/roidapp/photogrid/cloud/a/m;->f:Z

    goto :goto_2
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 64
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/m;->f:Z

    if-nez v1, :cond_0

    if-nez p1, :cond_1

    .line 95
    :cond_0
    :goto_0
    return-object v0

    .line 66
    :cond_1
    if-eqz p2, :cond_7

    .line 67
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/roidapp/photogrid/cloud/a/m;

    if-nez v1, :cond_7

    move-object v1, v0

    .line 74
    :goto_1
    if-eqz v1, :cond_6

    .line 75
    :goto_2
    if-eqz v1, :cond_4

    .line 76
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 77
    const v0, 0x7f0d006d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 78
    if-eqz v0, :cond_2

    .line 79
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/m;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    :cond_2
    const v0, 0x7f0d006b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 81
    if-eqz v0, :cond_3

    .line 82
    const v2, 0x7f020342

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 83
    :cond_3
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    const v0, 0x7f0d006c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 87
    invoke-virtual {v1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 90
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->b:Z

    if-nez v0, :cond_5

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->b:Z

    :cond_5
    move-object v0, v1

    .line 95
    goto :goto_0

    .line 74
    :cond_6
    const v0, 0x7f030010

    invoke-virtual {p1, v0, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    goto :goto_2

    :cond_7
    move-object v1, p2

    goto :goto_1
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/m;->d:Landroid/content/Context;

    const-string v1, "http://app.appsflyer.com/com.commsource.beautyplus?pid=photogrid"

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 125
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/a/l;->onClick(Landroid/view/View;)V

    .line 126
    return-void
.end method
