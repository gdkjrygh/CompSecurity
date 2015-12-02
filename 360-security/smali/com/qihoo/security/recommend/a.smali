.class public Lcom/qihoo/security/recommend/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/recommend/a$a;
    }
.end annotation


# instance fields
.field private a:Lcom/qihoo/security/recommend/a$a;

.field private b:Landroid/view/View;

.field private c:Lcom/qihoo/security/widget/RatioImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

.field private i:Landroid/content/Context;

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/recommend/a;)Lcom/qihoo/security/recommend/a$a;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->a:Lcom/qihoo/security/recommend/a$a;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/recommend/a;)Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;
    .locals 1

    .prologue
    .line 12
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->h:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 29
    iput-object p1, p0, Lcom/qihoo/security/recommend/a;->b:Landroid/view/View;

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->b:Landroid/view/View;

    const v1, 0x7f0b021a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/RatioImageView;

    iput-object v0, p0, Lcom/qihoo/security/recommend/a;->c:Lcom/qihoo/security/widget/RatioImageView;

    .line 31
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->b:Landroid/view/View;

    const v1, 0x7f0b021b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/recommend/a;->d:Landroid/widget/TextView;

    .line 32
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->b:Landroid/view/View;

    const v1, 0x7f0b021d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/recommend/a;->e:Landroid/widget/TextView;

    .line 33
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->b:Landroid/view/View;

    const v1, 0x7f0b021c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/recommend/a;->f:Landroid/widget/TextView;

    .line 34
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->b:Landroid/view/View;

    const v1, 0x7f0b021e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/recommend/a;->g:Landroid/widget/TextView;

    .line 35
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/recommend/a;->i:Landroid/content/Context;

    .line 36
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->g:Landroid/widget/TextView;

    new-instance v1, Lcom/qihoo/security/recommend/a$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/recommend/a$1;-><init>(Lcom/qihoo/security/recommend/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->e:Landroid/widget/TextView;

    new-instance v1, Lcom/qihoo/security/recommend/a$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/recommend/a$2;-><init>(Lcom/qihoo/security/recommend/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    return-void
.end method

.method public a(Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 77
    iput-object p1, p0, Lcom/qihoo/security/recommend/a;->h:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    .line 78
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->c:Lcom/qihoo/security/widget/RatioImageView;

    iget-object v1, p0, Lcom/qihoo/security/recommend/a;->h:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    iget v1, v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->iconRes:I

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/RatioImageView;->setImageResource(I)V

    .line 79
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/qihoo/security/recommend/a;->h:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    iget v1, v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->titleRes:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/recommend/a;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/qihoo/security/recommend/a;->h:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    iget v1, v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->okRes:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 82
    return-void
.end method

.method public a(Lcom/qihoo/security/recommend/a$a;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/qihoo/security/recommend/a;->a:Lcom/qihoo/security/recommend/a$a;

    .line 74
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 89
    iput-boolean p1, p0, Lcom/qihoo/security/recommend/a;->j:Z

    .line 90
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/qihoo/security/recommend/a;->j:Z

    return v0
.end method
