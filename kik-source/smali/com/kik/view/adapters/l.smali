.class public Lcom/kik/view/adapters/l;
.super Lcom/kik/view/adapters/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/l$a;
    }
.end annotation


# instance fields
.field protected final a:Lcom/kik/cache/ad;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct/range {p0 .. p11}, Lcom/kik/view/adapters/n;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 49
    iput-object p6, p0, Lcom/kik/view/adapters/l;->a:Lcom/kik/cache/ad;

    .line 50
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 116
    const/16 v0, 0xa5

    return v0
.end method

.method protected a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 148
    iget-object v0, p0, Lcom/kik/view/adapters/l;->k:Landroid/view/LayoutInflater;

    const v1, 0x7f030066

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 149
    new-instance v2, Lcom/kik/view/adapters/l$a;

    invoke-direct {v2, p0}, Lcom/kik/view/adapters/l$a;-><init>(Lcom/kik/view/adapters/l;)V

    .line 151
    const v0, 0x7f0e0154

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->p:Lcom/kik/cache/ContactImageView;

    .line 152
    const v0, 0x7f0e0155

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->q:Landroid/widget/ImageView;

    .line 153
    const v0, 0x7f0e00e4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/IconImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->h:Lkik/android/widget/IconImageView;

    .line 154
    const v0, 0x7f0e0153

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->s:Landroid/widget/ImageView;

    .line 155
    const v0, 0x7f0e0151

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->o:Landroid/widget/TextView;

    .line 156
    const v0, 0x7f0e00df

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    .line 157
    const v0, 0x7f0e00de

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    .line 158
    const v0, 0x7f0e00e5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->j:Landroid/widget/TextView;

    .line 159
    const v0, 0x7f0e00e7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->k:Landroid/widget/ImageView;

    .line 160
    const v0, 0x7f0e00e0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->i:Landroid/view/View;

    .line 161
    const v0, 0x7f0e0159

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->c:Landroid/view/View;

    .line 162
    const v0, 0x7f0e00e9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->d:Landroid/widget/ImageView;

    .line 163
    const v0, 0x7f0e00e8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->l:Landroid/view/View;

    .line 164
    const v0, 0x7f0e00dc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/MaskedFramelayout;

    iput-object v0, v2, Lcom/kik/view/adapters/l$a;->m:Lkik/android/widget/MaskedFramelayout;

    .line 165
    iput-object v1, v2, Lcom/kik/view/adapters/l$a;->r:Landroid/view/View;

    .line 166
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 168
    return-object v1
.end method

.method protected a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 55
    check-cast p2, Lcom/kik/view/adapters/l$a;

    .line 57
    if-eqz p3, :cond_1

    .line 58
    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->l:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    :goto_0
    const-string v0, "text"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    const/16 v1, 0xe

    invoke-static {v1}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 67
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 68
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 71
    :cond_0
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 72
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 73
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    :goto_1
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 85
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 86
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    :goto_2
    return-void

    .line 61
    :cond_1
    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->l:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/a/d/a/a;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 77
    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    const v1, 0x7f0900be

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 80
    :cond_3
    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 89
    :cond_4
    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method

.method protected a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 96
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/n;->a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V

    .line 97
    check-cast p2, Lcom/kik/view/adapters/l$a;

    .line 98
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->i:Landroid/view/View;

    sget v1, Lcom/kik/view/adapters/l;->p:I

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v0

    sget v1, Lcom/kik/view/adapters/l;->p:I

    invoke-virtual {v0, v1}, Lkik/android/util/cv$b;->d(I)Lkik/android/util/cv$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/util/cv$b;->c(I)Lkik/android/util/cv$b;

    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v0

    sget v1, Lcom/kik/view/adapters/l;->p:I

    invoke-virtual {v0, v1}, Lkik/android/util/cv$b;->d(I)Lkik/android/util/cv$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/util/cv$b;->c(I)Lkik/android/util/cv$b;

    .line 100
    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/l;->d:Lkik/android/chat/b/d;

    invoke-virtual {v0}, Lkik/android/chat/b/d;->e()Lkik/android/chat/b/b;

    move-result-object v0

    .line 101
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 102
    iget-object v0, p0, Lcom/kik/view/adapters/l;->d:Lkik/android/chat/b/d;

    invoke-virtual {v0}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v0

    .line 104
    :cond_0
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->k:Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lkik/android/chat/b/c;->a(Landroid/widget/ImageView;Lkik/android/chat/b/b;)V

    .line 105
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->m:Lkik/android/widget/MaskedFramelayout;

    invoke-static {v1, v0}, Lkik/android/chat/b/c;->a(Landroid/view/View;Lkik/android/chat/b/b;)V

    .line 106
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Lkik/android/chat/b/b;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 107
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lkik/android/chat/b/b;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Lkik/android/chat/b/b;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 109
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/l;->a()I

    move-result v2

    invoke-static {v1, v2}, Lkik/android/util/cv;->a(Landroid/widget/TextView;I)V

    .line 110
    iget-object v1, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Lkik/android/chat/b/b;->b()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 111
    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/l;->a()I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/util/cv;->b(Landroid/widget/TextView;I)V

    .line 112
    return-void

    .line 98
    :cond_1
    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->i:Landroid/view/View;

    sget v1, Lcom/kik/view/adapters/l;->p:I

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->a:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/util/cv$b;->d(I)Lkik/android/util/cv$b;

    move-result-object v0

    sget v1, Lcom/kik/view/adapters/l;->p:I

    invoke-virtual {v0, v1}, Lkik/android/util/cv$b;->c(I)Lkik/android/util/cv$b;

    iget-object v0, p2, Lcom/kik/view/adapters/l$a;->b:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->b(Landroid/view/View;)Lkik/android/util/cv$b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lkik/android/util/cv$b;->d(I)Lkik/android/util/cv$b;

    move-result-object v0

    sget v1, Lcom/kik/view/adapters/l;->p:I

    invoke-virtual {v0, v1}, Lkik/android/util/cv$b;->c(I)Lkik/android/util/cv$b;

    goto :goto_0
.end method

.method protected a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 2

    .prologue
    .line 123
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/kik/view/adapters/l$a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final b(Lcom/kik/view/adapters/n$a;)V
    .locals 3

    .prologue
    .line 174
    move-object v0, p1

    check-cast v0, Lcom/kik/view/adapters/l$a;

    .line 175
    iget-object v1, p1, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    const v2, 0x7f0e01c8

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lkik/android/widget/ProgressWidget;

    iget-object v2, v0, Lcom/kik/view/adapters/l$a;->c:Landroid/view/View;

    iget-object v0, v0, Lcom/kik/view/adapters/l$a;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v2, v0}, Lkik/android/widget/ProgressWidget;->a(Landroid/view/View;Landroid/view/View;)V

    .line 176
    return-void
.end method

.method protected final c(Lcom/kik/view/adapters/n$a;)V
    .locals 2

    .prologue
    .line 181
    check-cast p1, Lcom/kik/view/adapters/l$a;

    .line 182
    iget-object v0, p1, Lcom/kik/view/adapters/l$a;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 183
    return-void
.end method
