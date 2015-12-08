.class public Lcom/arist/activity/EqualizerActivity;
.super Lcom/arist/activity/base/BaseActivity;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Lcom/arist/model/equize/l;
.implements Lcom/arist/model/skin/l;


# instance fields
.field private a:[Lcom/arist/model/skin/ColorProgressBar;

.field private b:Lcom/arist/model/equize/a;

.field private c:Landroid/widget/CheckBox;

.field private d:Landroid/view/View;

.field private e:Lcom/arist/model/equize/RotatView;

.field private g:Lcom/arist/model/equize/RotatView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/arist/activity/base/BaseActivity;-><init>()V

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/arist/model/skin/ColorProgressBar;

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/EqualizerActivity;)Lcom/arist/model/equize/a;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    return-object v0
.end method

.method private a(Z)V
    .locals 2

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->d:Landroid/view/View;

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    return-void
.end method

.method public final a(Lcom/arist/b/a;F)V
    .locals 4

    const/high16 v3, 0x40000000    # 2.0f

    const-string v0, "setAudioEffectProgress"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "max:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget v1, p1, Lcom/arist/b/a;->b:I

    int-to-float v1, v1

    add-float/2addr v1, p2

    mul-float v2, v3, p2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget v1, p1, Lcom/arist/b/a;->c:I

    int-to-float v1, v1

    add-float/2addr v1, p2

    mul-float v2, v3, p2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget v1, p1, Lcom/arist/b/a;->d:I

    int-to-float v1, v1

    add-float/2addr v1, p2

    mul-float v2, v3, p2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget v1, p1, Lcom/arist/b/a;->e:I

    int-to-float v1, v1

    add-float/2addr v1, p2

    mul-float v2, v3, p2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget v1, p1, Lcom/arist/b/a;->f:I

    int-to-float v1, v1

    add-float/2addr v1, p2

    mul-float v2, v3, p2

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/arist/model/skin/ColorProgressBar;->a(F)V

    return-void
.end method

.method public final a(Lcom/arist/model/equize/RotatView;F)V
    .locals 4

    invoke-virtual {p1}, Lcom/arist/model/equize/RotatView;->getId()I

    move-result v0

    const v1, 0x7f060016

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    float-to-double v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/arist/model/equize/a;->a(D)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/arist/model/equize/RotatView;->getId()I

    move-result v0

    const v1, 0x7f060017

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    float-to-double v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/arist/model/equize/a;->b(D)V

    goto :goto_0
.end method

.method public final a(Lcom/arist/model/skin/ColorProgressBar;ZF)V
    .locals 2

    if-nez p2, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/arist/model/skin/ColorProgressBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0, p3}, Lcom/arist/model/equize/a;->a(F)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v1, v0, p3}, Lcom/arist/model/equize/a;->a(IF)V

    const v0, 0x7f0900ab

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->d()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public handleClicked(Landroid/view/View;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-virtual {p0}, Lcom/arist/activity/EqualizerActivity;->onBackPressed()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->k()V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->i()V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    new-instance v1, Lcom/arist/b/a;

    invoke-direct {v1}, Lcom/arist/b/a;-><init>()V

    iget-object v2, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    iget-object v3, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lcom/arist/model/skin/ColorProgressBar;->a()F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/arist/model/equize/a;->b(F)I

    move-result v2

    iput v2, v1, Lcom/arist/b/a;->b:I

    iget-object v2, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    iget-object v3, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lcom/arist/model/skin/ColorProgressBar;->a()F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/arist/model/equize/a;->b(F)I

    move-result v2

    iput v2, v1, Lcom/arist/b/a;->c:I

    iget-object v2, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    iget-object v3, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v4, 0x3

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lcom/arist/model/skin/ColorProgressBar;->a()F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/arist/model/equize/a;->b(F)I

    move-result v2

    iput v2, v1, Lcom/arist/b/a;->d:I

    iget-object v2, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    iget-object v3, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lcom/arist/model/skin/ColorProgressBar;->a()F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/arist/model/equize/a;->b(F)I

    move-result v2

    iput v2, v1, Lcom/arist/b/a;->e:I

    iget-object v2, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    iget-object v3, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    const/4 v4, 0x5

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lcom/arist/model/skin/ColorProgressBar;->a()F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/arist/model/equize/a;->b(F)I

    move-result v2

    iput v2, v1, Lcom/arist/b/a;->f:I

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/a;->b(Lcom/arist/b/a;)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->j()V

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->l()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f060010
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0, p2}, Lcom/arist/model/equize/a;->a(Z)V

    invoke-direct {p0, p2}, Lcom/arist/activity/EqualizerActivity;->a(Z)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f030001

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->setContentView(I)V

    new-instance v0, Lcom/arist/model/equize/a;

    invoke-direct {v0, p0}, Lcom/arist/model/equize/a;-><init>(Lcom/arist/activity/EqualizerActivity;)V

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->j:Landroid/os/Handler;

    const v0, 0x7f060082

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    array-length v1, v1

    if-lt v2, v1, :cond_0

    const v0, 0x7f060011

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->c:Landroid/widget/CheckBox;

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->c:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v1}, Lcom/arist/model/equize/a;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v0, 0x7f06001a

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->d:Landroid/view/View;

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->d:Landroid/view/View;

    new-instance v1, Lcom/arist/activity/f;

    invoke-direct {v1, p0}, Lcom/arist/activity/f;-><init>(Lcom/arist/activity/EqualizerActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const v0, 0x7f060016

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/equize/RotatView;

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->e:Lcom/arist/model/equize/RotatView;

    const v0, 0x7f060017

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/arist/model/equize/RotatView;

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->g:Lcom/arist/model/equize/RotatView;

    const v0, 0x7f060012

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f060015

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/activity/EqualizerActivity;->i:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->c()Lcom/arist/b/a;

    move-result-object v0

    iget-object v1, v0, Lcom/arist/b/a;->a:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/arist/activity/EqualizerActivity;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v1}, Lcom/arist/model/equize/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/arist/activity/EqualizerActivity;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v1}, Lcom/arist/model/equize/a;->f()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0, v0, v1}, Lcom/arist/activity/EqualizerActivity;->a(Lcom/arist/b/a;F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->a()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/arist/activity/EqualizerActivity;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->e:Lcom/arist/model/equize/RotatView;

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v1}, Lcom/arist/model/equize/a;->g()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/RotatView;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->g:Lcom/arist/model/equize/RotatView;

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v1}, Lcom/arist/model/equize/a;->h()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/model/equize/RotatView;->a(F)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->e:Lcom/arist/model/equize/RotatView;

    invoke-virtual {v0, p0}, Lcom/arist/model/equize/RotatView;->a(Lcom/arist/model/equize/l;)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->g:Lcom/arist/model/equize/RotatView;

    invoke-virtual {v0, p0}, Lcom/arist/model/equize/RotatView;->a(Lcom/arist/model/equize/l;)V

    iget-object v0, p0, Lcom/arist/activity/EqualizerActivity;->b:Lcom/arist/model/equize/a;

    invoke-virtual {v0}, Lcom/arist/model/equize/a;->b()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/arist/activity/EqualizerActivity;->a(Z)V

    return-void

    :cond_0
    iget-object v3, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const v4, 0x7f060083

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/arist/model/skin/ColorProgressBar;

    aput-object v1, v3, v2

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    aget-object v1, v1, v2

    invoke-virtual {v1, p0}, Lcom/arist/model/skin/ColorProgressBar;->a(Lcom/arist/model/skin/l;)V

    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->a:[Lcom/arist/model/skin/ColorProgressBar;

    aget-object v1, v1, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/arist/model/skin/ColorProgressBar;->setTag(Ljava/lang/Object;)V

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto/16 :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 6

    invoke-super {p0, p1, p2}, Lcom/arist/activity/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    const/16 v1, 0x19

    if-eq p1, v1, :cond_0

    const/16 v1, 0x18

    if-ne p1, v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/arist/activity/EqualizerActivity;->j:Landroid/os/Handler;

    new-instance v2, Lcom/arist/activity/g;

    invoke-direct {v2, p0}, Lcom/arist/activity/g;-><init>(Lcom/arist/activity/EqualizerActivity;)V

    const-wide/16 v4, 0x64

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return v0
.end method
