.class public final Lcom/roidapp/cloudlib/sns/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/cloudlib/sns/a/c;


# instance fields
.field private a:Z

.field private b:Landroid/content/Context;

.field private c:Landroid/view/WindowManager;

.field private d:Landroid/view/View;

.field private e:Landroid/view/View;

.field private f:Landroid/view/WindowManager$LayoutParams;

.field private final g:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 3

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Lcom/roidapp/cloudlib/sns/j;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/j;-><init>(Lcom/roidapp/cloudlib/sns/i;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->g:Ljava/lang/Runnable;

    .line 41
    if-eqz p1, :cond_0

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    :cond_0
    :goto_0
    return-void

    .line 43
    :cond_1
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/i;->b:Landroid/content/Context;

    .line 44
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->c:Landroid/view/WindowManager;

    .line 45
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 46
    sget v1, Lcom/roidapp/cloudlib/as;->U:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    new-instance v1, Lcom/roidapp/cloudlib/sns/k;

    invoke-direct {v1, p0, p2}, Lcom/roidapp/cloudlib/sns/k;-><init>(Lcom/roidapp/cloudlib/sns/i;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 55
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->L:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->e:Landroid/view/View;

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x420c0000    # 35.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ap;->e:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 59
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->f:Landroid/view/WindowManager$LayoutParams;

    .line 60
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->f:Landroid/view/WindowManager$LayoutParams;

    const/4 v2, -0x1

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 61
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->f:Landroid/view/WindowManager$LayoutParams;

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 62
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->f:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->f:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x30

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 64
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->f:Landroid/view/WindowManager$LayoutParams;

    const v1, 0x40008

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 101
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bT:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 102
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 103
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->e:Landroid/view/View;

    if-nez v0, :cond_0

    .line 131
    :goto_0
    return-void

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->e:Landroid/view/View;

    int-to-float v1, p1

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/cloudlib/sns/i;->a(Ljava/lang/String;I)V

    .line 69
    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    if-nez v0, :cond_0

    .line 98
    :goto_0
    return-void

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->e:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 76
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->e:Landroid/view/View;

    int-to-float v1, p2

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewCompat;->setTranslationY(Landroid/view/View;F)V

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 81
    :try_start_0
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/i;->a:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->c:Landroid/view/WindowManager;

    if-eqz v0, :cond_2

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/i;->a:Z

    .line 83
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/a/a;->a(Lcom/roidapp/cloudlib/sns/a/c;)V

    .line 84
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->c:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/i;->f:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cN:I

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 89
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    sget v2, Lcom/roidapp/cloudlib/ar;->bT:I

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 92
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/i;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 93
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 94
    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->b:Landroid/content/Context;

    sget v2, Lcom/roidapp/cloudlib/at;->e:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 106
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/i;->a:Z

    if-eqz v0, :cond_1

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/i;->a:Z

    .line 109
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->c:Landroid/view/WindowManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->c:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :cond_0
    :goto_0
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/a/a;->b(Lcom/roidapp/cloudlib/sns/a/c;)V

    .line 115
    :cond_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 118
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/i;->b()V

    .line 119
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->d:Landroid/view/View;

    .line 120
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->e:Landroid/view/View;

    .line 121
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->c:Landroid/view/WindowManager;

    .line 122
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 135
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->bT:I

    if-ne v0, v1, :cond_0

    .line 136
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/i;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    .line 138
    :cond_0
    return-void
.end method
