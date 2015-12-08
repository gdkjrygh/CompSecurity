.class public Lcom/roidapp/cloudlib/ads/PushAdActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 81
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->startActivity(Landroid/content/Intent;)V

    .line 83
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->finish()V

    .line 84
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/ads/PushAdActivity;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->a()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    .line 26
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 28
    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->setContentView(Landroid/view/View;)V

    .line 30
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 31
    invoke-static {}, Lcom/roidapp/cloudlib/ads/q;->b()Lcom/roidapp/cloudlib/ads/q;

    move-result-object v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 1104
    if-nez v3, :cond_1

    const/4 v0, 0x0

    move-object v1, v0

    .line 32
    :goto_0
    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/roidapp/cloudlib/ads/q;->b(Lcom/roidapp/cloudlib/ads/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {v1}, Lcom/roidapp/cloudlib/ads/r;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 65
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->a()V

    .line 66
    :goto_1
    return-void

    .line 1105
    :cond_1
    new-instance v0, Lcom/roidapp/cloudlib/ads/r;

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/ads/r;-><init>(Lcom/roidapp/cloudlib/ads/q;)V

    .line 1106
    const-string v1, "adType"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->a(Lcom/roidapp/cloudlib/ads/r;I)I

    .line 1107
    const-string v1, "playUrl"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->a(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    .line 1108
    const-string v1, "resUrl"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->b(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    .line 1109
    const-string v1, "package"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->c(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    .line 1110
    const-string v1, "url"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/ads/r;->d(Lcom/roidapp/cloudlib/ads/r;Ljava/lang/String;)Ljava/lang/String;

    move-object v1, v0

    .line 1111
    goto :goto_0

    .line 2087
    :pswitch_0
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/ads/r;->b()Ljava/lang/String;

    move-result-object v0

    .line 3040
    invoke-static {v0}, Lcom/roidapp/cloudlib/ads/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2087
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v0, v3, v4}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    new-instance v3, Landroid/widget/ImageView;

    invoke-direct {v3, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 40
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 41
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 3136
    invoke-static {v1}, Lcom/roidapp/cloudlib/ads/r;->b(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {v1}, Lcom/roidapp/cloudlib/ads/r;->e(Lcom/roidapp/cloudlib/ads/r;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_2
    const/4 v0, 0x1

    .line 42
    :goto_2
    if-eqz v0, :cond_3

    .line 43
    new-instance v0, Lcom/roidapp/cloudlib/ads/p;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/cloudlib/ads/p;-><init>(Lcom/roidapp/cloudlib/ads/PushAdActivity;Lcom/roidapp/cloudlib/ads/r;)V

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    :cond_3
    invoke-virtual {v2, v3, v5, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    goto/16 :goto_1

    .line 3136
    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 71
    invoke-direct {p0}, Lcom/roidapp/cloudlib/ads/PushAdActivity;->a()V

    .line 72
    const/4 v0, 0x1

    .line 74
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method
