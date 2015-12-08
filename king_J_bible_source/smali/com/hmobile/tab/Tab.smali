.class public Lcom/hmobile/tab/Tab;
.super Ljava/lang/Object;
.source "Tab.java"


# instance fields
.field private btn:Landroid/widget/ImageView;

.field private context:Landroid/app/Activity;

.field private dialog:Landroid/app/Dialog;

.field private img:Landroid/widget/ImageView;

.field private intent:Landroid/content/Intent;

.field private isSelected:Z

.field public preferedHeight:I

.field private requestCode:I

.field private resourceIcon:I

.field private resourceIconSelected:I

.field private tabTag:Ljava/lang/String;

.field private transparentResourceID:I

.field txtStripe:Landroid/widget/TextView;

.field private view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2
    .param p1, "context"    # Landroid/app/Activity;
    .param p2, "tabTag"    # Ljava/lang/String;

    .prologue
    const/4 v1, -0x1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lcom/hmobile/tab/Tab;->resourceIconSelected:I

    .line 33
    iput v1, p0, Lcom/hmobile/tab/Tab;->preferedHeight:I

    .line 37
    iput v1, p0, Lcom/hmobile/tab/Tab;->requestCode:I

    .line 40
    if-nez p1, :cond_0

    .line 41
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Context can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 43
    :cond_0
    iput-object p2, p0, Lcom/hmobile/tab/Tab;->tabTag:Ljava/lang/String;

    .line 44
    iput-object p1, p0, Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;

    .line 45
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/tab/Tab;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic access$1(Lcom/hmobile/tab/Tab;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->dialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$2(Lcom/hmobile/tab/Tab;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$3(Lcom/hmobile/tab/Tab;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->tabTag:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$4(Lcom/hmobile/tab/Tab;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/hmobile/tab/Tab;->requestCode:I

    return v0
.end method

.method private bindListenersforSample()V
    .locals 2

    .prologue
    .line 118
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->img:Landroid/widget/ImageView;

    new-instance v1, Lcom/hmobile/tab/Tab$1;

    invoke-direct {v1, p0}, Lcom/hmobile/tab/Tab$1;-><init>(Lcom/hmobile/tab/Tab;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    return-void
.end method

.method private createViewSample()V
    .locals 13

    .prologue
    const/4 v12, 0x0

    .line 79
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 80
    .local v1, "displaymetrics":Landroid/util/DisplayMetrics;
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v10

    invoke-interface {v10}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v10

    .line 81
    invoke-virtual {v10, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 82
    iget v10, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    add-int/lit8 v9, v10, -0x4

    .line 83
    .local v9, "width":I
    div-int/lit8 v8, v9, 0x5

    .line 84
    .local v8, "w":I
    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    .line 85
    .local v0, "density":F
    const/high16 v10, 0x42400000    # 48.0f

    mul-float/2addr v10, v0

    float-to-int v2, v10

    .line 87
    .local v2, "h":I
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v5

    .line 88
    .local v5, "inflater":Landroid/view/LayoutInflater;
    const v10, 0x7f030032

    const/4 v11, 0x0

    invoke-virtual {v5, v10, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 89
    .local v7, "v":Landroid/view/View;
    const v10, 0x7f0e00d0

    invoke-virtual {v7, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    .line 90
    .local v6, "rl":Landroid/widget/LinearLayout;
    const v10, 0x7f0e0124

    invoke-virtual {v7, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/ImageView;

    iput-object v10, p0, Lcom/hmobile/tab/Tab;->img:Landroid/widget/ImageView;

    .line 91
    const v10, 0x7f0e0123

    invoke-virtual {v7, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    iput-object v10, p0, Lcom/hmobile/tab/Tab;->txtStripe:Landroid/widget/TextView;

    .line 92
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->img:Landroid/widget/ImageView;

    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v11, v8, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    iget v4, p0, Lcom/hmobile/tab/Tab;->resourceIcon:I

    .line 94
    .local v4, "iconId":I
    iget-boolean v10, p0, Lcom/hmobile/tab/Tab;->isSelected:Z

    if-eqz v10, :cond_0

    iget v10, p0, Lcom/hmobile/tab/Tab;->resourceIconSelected:I

    if-eqz v10, :cond_0

    .line 95
    iget v4, p0, Lcom/hmobile/tab/Tab;->resourceIconSelected:I

    .line 97
    :cond_0
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;

    invoke-virtual {v10}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-static {v10, v4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 99
    .local v3, "icon":Landroid/graphics/Bitmap;
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->img:Landroid/widget/ImageView;

    invoke-virtual {v10, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 100
    iget-boolean v10, p0, Lcom/hmobile/tab/Tab;->isSelected:Z

    if-eqz v10, :cond_1

    .line 101
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->img:Landroid/widget/ImageView;

    const v11, 0x7f0200a4

    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 102
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->txtStripe:Landroid/widget/TextView;

    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 103
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->txtStripe:Landroid/widget/TextView;

    const-string v11, "#5384AB"

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 113
    :goto_0
    invoke-direct {p0}, Lcom/hmobile/tab/Tab;->bindListenersforSample()V

    .line 114
    iput-object v6, p0, Lcom/hmobile/tab/Tab;->view:Landroid/view/View;

    .line 115
    return-void

    .line 107
    :cond_1
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->img:Landroid/widget/ImageView;

    const v11, 0x7f0200a5

    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 108
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->txtStripe:Landroid/widget/TextView;

    invoke-virtual {v10, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 109
    iget-object v10, p0, Lcom/hmobile/tab/Tab;->txtStripe:Landroid/widget/TextView;

    iget-object v11, p0, Lcom/hmobile/tab/Tab;->context:Landroid/app/Activity;

    invoke-virtual {v11}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const v12, 0x7f08002a

    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v11

    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setBackgroundColor(I)V

    goto :goto_0
.end method


# virtual methods
.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->tabTag:Ljava/lang/String;

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->view:Landroid/view/View;

    if-nez v0, :cond_0

    .line 73
    invoke-direct {p0}, Lcom/hmobile/tab/Tab;->createViewSample()V

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/hmobile/tab/Tab;->view:Landroid/view/View;

    return-object v0
.end method

.method public setDialog(Landroid/app/Dialog;)V
    .locals 0
    .param p1, "dialog"    # Landroid/app/Dialog;

    .prologue
    .line 182
    iput-object p1, p0, Lcom/hmobile/tab/Tab;->dialog:Landroid/app/Dialog;

    .line 183
    return-void
.end method

.method public setIcon(I)V
    .locals 0
    .param p1, "resourceIcon"    # I

    .prologue
    .line 48
    iput p1, p0, Lcom/hmobile/tab/Tab;->resourceIcon:I

    .line 50
    return-void
.end method

.method public setIconSelected(I)V
    .locals 0
    .param p1, "resourceIcon"    # I

    .prologue
    .line 53
    iput p1, p0, Lcom/hmobile/tab/Tab;->resourceIconSelected:I

    .line 54
    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 62
    iput-object p1, p0, Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;

    .line 63
    return-void
.end method

.method public setIntent(Landroid/content/Intent;I)V
    .locals 0
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "requestForResult"    # I

    .prologue
    .line 57
    iput-object p1, p0, Lcom/hmobile/tab/Tab;->intent:Landroid/content/Intent;

    .line 58
    iput p2, p0, Lcom/hmobile/tab/Tab;->requestCode:I

    .line 59
    return-void
.end method

.method public setSelected(Z)V
    .locals 0
    .param p1, "isSelected"    # Z

    .prologue
    .line 174
    iput-boolean p1, p0, Lcom/hmobile/tab/Tab;->isSelected:Z

    .line 175
    return-void
.end method

.method public setTransparentResourceID(I)V
    .locals 0
    .param p1, "transparentResourceID"    # I

    .prologue
    .line 178
    iput p1, p0, Lcom/hmobile/tab/Tab;->transparentResourceID:I

    .line 179
    return-void
.end method
