.class public Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static a:Z

.field private static final b:Ljava/lang/String;


# instance fields
.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    .line 32
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 36
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->a:Z

    .line 37
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 38
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 39
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 40
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 43
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 44
    const-string v1, "tag_close_dialog"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 45
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 48
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 2

    .prologue
    .line 114
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->a:Z

    .line 115
    sget-object v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    const-string v1, "onBackPressed"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 117
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 12

    .prologue
    const/high16 v4, 0x3f000000    # 0.5f

    const-wide v10, 0x3fc1111111111111L    # 0.13333333333333333

    const/4 v3, 0x1

    const/4 v8, 0x0

    .line 52
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 53
    sget-object v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    const-string v1, "oncreate"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "tag_close_dialog"

    invoke-virtual {v0, v1, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 56
    sget-object v1, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "isClose"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    if-eqz v0, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->finish()V

    .line 67
    :goto_0
    return-void

    .line 61
    :cond_0
    sget v0, Lcom/cmcm/adsdk/i;->a:I

    invoke-virtual {p0, v0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->setContentView(I)V

    .line 62
    sget-object v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    const-string v1, "setContenView"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1070
    sget v0, Lcom/cmcm/adsdk/h;->a:I

    invoke-virtual {p0, v0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->c:Landroid/widget/ImageView;

    .line 1071
    sget v0, Lcom/cmcm/adsdk/h;->b:I

    invoke-virtual {p0, v0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->d:Landroid/widget/TextView;

    .line 1072
    sget v0, Lcom/cmcm/adsdk/h;->c:I

    invoke-virtual {p0, v0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->e:Landroid/widget/TextView;

    .line 1073
    sget v0, Lcom/cmcm/adsdk/h;->d:I

    invoke-virtual {p0, v0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->f:Landroid/widget/ImageView;

    .line 1075
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    .line 1076
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 1077
    int-to-double v6, v0

    mul-double/2addr v6, v10

    double-to-int v2, v6

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1078
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1079
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1081
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 1082
    int-to-double v6, v0

    mul-double/2addr v6, v10

    double-to-int v2, v6

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1083
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1087
    const-wide v6, 0x3fb1111111111111L    # 0.06666666666666667

    int-to-double v0, v0

    mul-double/2addr v0, v6

    double-to-int v0, v0

    .line 1088
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0, v8, v0, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1090
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->d:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    sget-object v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    const-string v1, "init"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1094
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 1095
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    move v5, v3

    move v6, v4

    invoke-direct/range {v0 .. v6}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    .line 1096
    const-wide/16 v4, 0x320

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    .line 1097
    invoke-virtual {v0, v3}, Landroid/view/animation/RotateAnimation;->setRepeatMode(I)V

    .line 1098
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/RotateAnimation;->setRepeatCount(I)V

    .line 1099
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1100
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 66
    sget-object v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    const-string v1, "startAnim"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 121
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 122
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 125
    :cond_0
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 105
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 106
    sget-object v0, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->b:Ljava/lang/String;

    const-string v1, "onNewIntent"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string v0, "tag_close_dialog"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/PicksLoadingActivity;->finish()V

    .line 110
    :cond_0
    return-void
.end method
