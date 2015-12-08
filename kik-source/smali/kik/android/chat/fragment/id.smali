.class final Lkik/android/chat/fragment/id;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .prologue
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    const/4 v4, 0x1

    .line 121
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    if-nez v0, :cond_1

    .line 143
    :cond_0
    :goto_0
    return v4

    .line 124
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v1}, Lkik/android/widget/KikFinderCodeImageView;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget-object v3, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v3, v3, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v3}, Lkik/android/widget/KikFinderCodeImageView;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    .line 125
    iget-object v2, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v2}, Lkik/android/widget/KikFinderCodeImageView;->f()F

    move-result v2

    float-to-double v2, v2

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    :cond_2
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/util/cs;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lkik/android/util/cs;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 127
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    .line 128
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0, p2}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Landroid/view/MotionEvent;)V

    .line 129
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->c(Lkik/android/chat/fragment/KikCodeFragment;)V

    .line 130
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->d(Lkik/android/chat/fragment/KikCodeFragment;)Z

    goto :goto_0

    .line 132
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v4, :cond_4

    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->e(Lkik/android/chat/fragment/KikCodeFragment;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 133
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCodeFragment;->c()V

    .line 134
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->f(Lkik/android/chat/fragment/KikCodeFragment;)I

    .line 135
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0}, Lkik/android/widget/KikFinderCodeImageView;->b()V

    .line 136
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v1}, Lkik/android/widget/KikFinderCodeImageView;->d()Lcom/kik/scan/KikCode;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Lcom/kik/scan/KikCode;)Lcom/kik/scan/KikCode;

    .line 137
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->g(Lkik/android/chat/fragment/KikCodeFragment;)V

    goto/16 :goto_0

    .line 139
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 140
    iget-object v0, p0, Lkik/android/chat/fragment/id;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0, p2}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Landroid/view/MotionEvent;)V

    goto/16 :goto_0
.end method
