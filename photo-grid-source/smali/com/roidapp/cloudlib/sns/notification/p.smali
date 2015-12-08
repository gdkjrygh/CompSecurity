.class public final Lcom/roidapp/cloudlib/sns/notification/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/PopupWindow;

.field private c:Z

.field private d:I

.field private e:I

.field private f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->c:Z

    .line 32
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/notification/p;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/notification/p;)Landroid/widget/PopupWindow;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 67
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View;I)V
    .locals 10

    .prologue
    const/4 v5, -0x2

    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 35
    .line 1070
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    if-eqz v0, :cond_5

    .line 1072
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1074
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 2039
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->N:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 2040
    sget v0, Lcom/roidapp/cloudlib/ar;->bF:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->f:Landroid/widget/TextView;

    .line 2041
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, v1, v5, v5, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    .line 2044
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/PopupWindow;)V

    .line 2046
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/q;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/notification/q;-><init>(Lcom/roidapp/cloudlib/sns/notification/p;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 2053
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 2054
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 2055
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 2056
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 2058
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42380000    # 46.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->d:I

    .line 2059
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41b00000    # 22.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->e:I

    .line 2060
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    .line 1075
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    .line 1077
    :cond_0
    if-eqz p1, :cond_5

    .line 1078
    if-le p2, v4, :cond_2

    .line 1079
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->aj:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1083
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 1084
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 1086
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 1087
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 1088
    invoke-virtual {p1, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 1089
    invoke-virtual {p1, v5}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 1091
    iget v0, v1, Landroid/graphics/Rect;->bottom:I

    .line 1092
    iget v6, v1, Landroid/graphics/Rect;->left:I

    .line 1093
    iget v7, v1, Landroid/graphics/Rect;->bottom:I

    iget v1, v1, Landroid/graphics/Rect;->top:I

    sub-int v1, v7, v1

    .line 1095
    iget-boolean v7, p0, Lcom/roidapp/cloudlib/sns/notification/p;->c:Z

    .line 1100
    if-nez v7, :cond_1

    .line 1103
    if-ge v1, v4, :cond_1

    .line 1104
    sub-int v1, v4, v1

    add-int/2addr v0, v1

    .line 1108
    :cond_1
    div-int/lit8 v1, v3, 0x2

    iget v8, p0, Lcom/roidapp/cloudlib/sns/notification/p;->d:I

    div-int/lit8 v8, v8, 0x2

    sub-int/2addr v1, v8

    add-int/lit8 v1, v1, 0x0

    .line 1109
    :goto_1
    add-int v8, v6, v1

    iget v9, p0, Lcom/roidapp/cloudlib/sns/notification/p;->d:I

    add-int/2addr v8, v9

    iget v9, v5, Landroid/graphics/Rect;->right:I

    if-le v8, v9, :cond_3

    .line 1110
    div-int/lit8 v8, v3, 0x4

    sub-int/2addr v1, v8

    goto :goto_1

    .line 1081
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/notification/p;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/cloudlib/at;->ai:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1113
    :cond_3
    if-eqz v7, :cond_6

    .line 1114
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->e:I

    add-int/2addr v0, v4

    rsub-int/lit8 v2, v0, 0x0

    .line 1122
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/p;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 1123
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1124
    new-instance v1, Lcom/roidapp/cloudlib/sns/notification/r;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/notification/r;-><init>(Lcom/roidapp/cloudlib/sns/notification/p;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    :cond_5
    return-void

    .line 1116
    :cond_6
    :goto_2
    add-int v3, v0, v2

    iget v6, p0, Lcom/roidapp/cloudlib/sns/notification/p;->e:I

    add-int/2addr v3, v6

    iget v6, v5, Landroid/graphics/Rect;->bottom:I

    if-le v3, v6, :cond_4

    .line 1117
    div-int/lit8 v3, v4, 0x4

    sub-int/2addr v2, v3

    goto :goto_2
.end method
