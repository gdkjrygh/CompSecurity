.class public final Lcom/kik/view/adapters/i;
.super Lcom/kik/view/adapters/bf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/i$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;Lkik/android/i/b;Lcom/kik/view/adapters/af;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct/range {p0 .. p13}, Lcom/kik/view/adapters/bf;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;Lkik/android/i/b;Lcom/kik/view/adapters/af;)V

    .line 44
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 65
    const v0, 0x7f03006a

    return v0
.end method

.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 49
    new-instance v1, Lcom/kik/view/adapters/i$a;

    invoke-direct {v1}, Lcom/kik/view/adapters/i$a;-><init>()V

    .line 50
    invoke-super {p0, p1, v1}, Lcom/kik/view/adapters/bf;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/bf$b;)Landroid/view/View;

    move-result-object v2

    .line 51
    const v0, 0x7f0e00de

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    .line 52
    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 53
    return-object v2
.end method

.method protected final a(Lkik/a/d/a/a;)Lkik/a/d/d;
    .locals 3

    .prologue
    .line 90
    const-string v0, "png-preview"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    .line 91
    const-string v1, "preview"

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    check-cast v1, Lkik/a/d/d;

    .line 93
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    if-nez v0, :cond_0

    .line 100
    :goto_0
    return-object v1

    .line 96
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object v1, v0

    .line 97
    goto :goto_0

    .line 100
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected final a(Lcom/kik/view/adapters/bf$b;)V
    .locals 0

    .prologue
    .line 60
    return-void
.end method

.method protected final a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 3

    .prologue
    .line 71
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/bf;->a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V

    .line 72
    check-cast p2, Lcom/kik/view/adapters/i$a;

    .line 74
    if-eqz p1, :cond_0

    .line 75
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 78
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 79
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    :cond_0
    :goto_0
    return-void

    .line 82
    :cond_1
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 113
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/bf;->a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V

    .line 114
    check-cast p2, Lcom/kik/view/adapters/i$a;

    .line 116
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/a;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 119
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->k:Landroid/widget/ImageView;

    const v2, 0x7f070045

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 121
    invoke-static {v0}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 122
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 124
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->j:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 125
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 126
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0006

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/util/cv;->b(Landroid/view/View;I)V

    .line 127
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->e:Landroid/view/ViewGroup;

    invoke-static {v0, v1}, Lkik/android/util/cv;->b(Landroid/view/View;Landroid/view/View;)V

    .line 129
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    const v1, 0x7f02009c

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 130
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 132
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->k:Landroid/widget/ImageView;

    const v1, 0x7f020269

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 152
    :goto_0
    return-void

    .line 135
    :cond_0
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->j:Landroid/widget/TextView;

    sget-object v2, Lkik/android/util/ac;->b:Lkik/android/util/cv$d;

    invoke-static {v1, v2}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 136
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    sget-object v2, Lkik/android/util/ac;->b:Lkik/android/util/cv$d;

    invoke-static {v1, v2}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 138
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    iget-object v2, p2, Lcom/kik/view/adapters/i$a;->e:Landroid/view/ViewGroup;

    invoke-static {v1, v2}, Lkik/android/util/cv;->a(Landroid/view/View;Landroid/view/View;)V

    .line 139
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    const/4 v2, -0x2

    invoke-static {v1, v2}, Lkik/android/util/cv;->b(Landroid/view/View;I)V

    .line 140
    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    aput-object v3, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 142
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    sget v2, Lkik/android/chat/b/d;->a:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 143
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->a:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/kik/view/adapters/i;->d:Lkik/android/chat/b/d;

    invoke-virtual {v2}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v2

    invoke-static {v1, v2}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 144
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->j:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/kik/view/adapters/i;->d:Lkik/android/chat/b/d;

    invoke-virtual {v2}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v2

    invoke-static {v1, v2}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 145
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->k:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/kik/view/adapters/i;->d:Lkik/android/chat/b/d;

    invoke-virtual {v2}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v2

    invoke-static {v1, v2}, Lkik/android/chat/b/c;->a(Landroid/widget/ImageView;Lkik/android/chat/b/b;)V

    .line 148
    iget-object v1, p2, Lcom/kik/view/adapters/i$a;->i:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/kik/view/adapters/i;->f(Lkik/a/d/a/a;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/util/cv;->a(Landroid/view/View;Landroid/graphics/Bitmap;)Z

    .line 150
    iget-object v0, p2, Lcom/kik/view/adapters/i$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    const/16 v1, 0x28

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/ClampedContentPreviewView;->d(I)V

    goto :goto_0
.end method

.method protected final a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 107
    instance-of v0, p1, Lcom/kik/view/adapters/i$a;

    return v0
.end method

.method protected final a(Lcom/kik/view/adapters/n$a;)[Landroid/view/View;
    .locals 3

    .prologue
    .line 157
    check-cast p1, Lcom/kik/view/adapters/i$a;

    .line 158
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/kik/view/adapters/i$a;->h:Lkik/android/widget/IconImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p1, Lcom/kik/view/adapters/i$a;->j:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p1, Lcom/kik/view/adapters/i$a;->k:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    return-object v0
.end method
