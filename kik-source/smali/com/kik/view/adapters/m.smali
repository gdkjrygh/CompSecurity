.class public final Lcom/kik/view/adapters/m;
.super Lcom/kik/view/adapters/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/m$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct/range {p0 .. p11}, Lcom/kik/view/adapters/l;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 47
    return-void
.end method

.method private a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/view/adapters/m$a;Z)V
    .locals 6

    .prologue
    .line 148
    iget-object v0, p3, Lcom/kik/view/adapters/m$a;->f:Lcom/kik/cache/ContentPreviewImageView;

    iget-object v3, p0, Lcom/kik/view/adapters/m;->a:Lcom/kik/cache/ad;

    iget-object v5, p0, Lcom/kik/view/adapters/m;->n:Lkik/a/e/n;

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContentPreviewImageView;->a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/cache/ad;ZLkik/a/e/n;)V

    .line 149
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p3, Lcom/kik/view/adapters/m$a;->f:Lcom/kik/cache/ContentPreviewImageView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 150
    return-void
.end method

.method public static a(Lkik/a/d/a/a;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 108
    if-nez p0, :cond_1

    .line 114
    :cond_0
    :goto_0
    return v0

    .line 111
    :cond_1
    const-string v2, "png-preview"

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    .line 112
    const-string v3, "preview"

    invoke-virtual {p0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v3

    .line 114
    if-eqz v2, :cond_3

    move v2, v1

    :goto_1
    if-nez v2, :cond_2

    if-eqz v3, :cond_4

    move v2, v1

    :goto_2
    if-eqz v2, :cond_0

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v2, v0

    goto :goto_1

    :cond_4
    move v2, v0

    goto :goto_2
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 103
    const/16 v0, 0xff

    return v0
.end method

.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 59
    iget-object v0, p0, Lcom/kik/view/adapters/m;->k:Landroid/view/LayoutInflater;

    const v1, 0x7f030067

    invoke-virtual {v0, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 60
    new-instance v2, Lcom/kik/view/adapters/m$a;

    invoke-direct {v2, p0, v3}, Lcom/kik/view/adapters/m$a;-><init>(Lcom/kik/view/adapters/m;B)V

    .line 62
    const v0, 0x7f0e00dd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContentPreviewImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->f:Lcom/kik/cache/ContentPreviewImageView;

    .line 63
    const v0, 0x7f0e0154

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->p:Lcom/kik/cache/ContactImageView;

    .line 64
    const v0, 0x7f0e0155

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->q:Landroid/widget/ImageView;

    .line 65
    const v0, 0x7f0e00e4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/IconImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->h:Lkik/android/widget/IconImageView;

    .line 66
    const v0, 0x7f0e0153

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->s:Landroid/widget/ImageView;

    .line 67
    const v0, 0x7f0e0151

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->o:Landroid/widget/TextView;

    .line 68
    const v0, 0x7f0e00df

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->a:Landroid/widget/TextView;

    .line 69
    const v0, 0x7f0e00de

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->b:Landroid/widget/TextView;

    .line 70
    const v0, 0x7f0e00e5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->j:Landroid/widget/TextView;

    .line 71
    const v0, 0x7f0e00e7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->k:Landroid/widget/ImageView;

    .line 72
    const v0, 0x7f0e00e0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->i:Landroid/view/View;

    .line 73
    const v0, 0x7f0e0159

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->c:Landroid/view/View;

    .line 74
    const v0, 0x7f0e00e9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->d:Landroid/widget/ImageView;

    .line 75
    const v0, 0x7f0e00e8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->l:Landroid/view/View;

    .line 76
    const v0, 0x7f0e00dc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/MaskedFramelayout;

    iput-object v0, v2, Lcom/kik/view/adapters/m$a;->m:Lkik/android/widget/MaskedFramelayout;

    .line 77
    iput-object v1, v2, Lcom/kik/view/adapters/m$a;->r:Landroid/view/View;

    .line 78
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 80
    return-object v1
.end method

.method protected final a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 120
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/l;->a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V

    .line 122
    instance-of v0, p2, Lcom/kik/view/adapters/m$a;

    if-nez v0, :cond_0

    .line 144
    :goto_0
    return-void

    .line 125
    :cond_0
    check-cast p2, Lcom/kik/view/adapters/m$a;

    .line 127
    const-string v0, "png-preview"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    .line 128
    const-string v1, "preview"

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    check-cast v1, Lkik/a/d/d;

    .line 129
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    if-nez v0, :cond_1

    .line 130
    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0, p2, p3}, Lcom/kik/view/adapters/m;->a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/view/adapters/m$a;Z)V

    .line 140
    :goto_1
    iget-object v0, p2, Lcom/kik/view/adapters/m$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 141
    const v0, 0x7f0c0005

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v0

    .line 143
    :goto_2
    iget-object v1, p2, Lcom/kik/view/adapters/m$a;->f:Lcom/kik/cache/ContentPreviewImageView;

    invoke-virtual {v1, v0}, Lcom/kik/cache/ContentPreviewImageView;->b(I)V

    goto :goto_0

    .line 132
    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 133
    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p3}, Lcom/kik/view/adapters/m;->a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/view/adapters/m$a;Z)V

    goto :goto_1

    .line 136
    :cond_2
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p2, Lcom/kik/view/adapters/m$a;->f:Lcom/kik/cache/ContentPreviewImageView;

    aput-object v1, v0, v2

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_2
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 2

    .prologue
    .line 86
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/l;->a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V

    .line 87
    check-cast p2, Lcom/kik/view/adapters/m$a;

    .line 88
    iget-object v0, p2, Lcom/kik/view/adapters/m$a;->b:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 91
    iget-object v0, p2, Lcom/kik/view/adapters/m$a;->b:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 93
    iget-object v0, p0, Lcom/kik/view/adapters/m;->d:Lkik/android/chat/b/d;

    invoke-virtual {v0}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v0

    .line 94
    iget-object v1, p2, Lcom/kik/view/adapters/m$a;->k:Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lkik/android/chat/b/c;->a(Landroid/widget/ImageView;Lkik/android/chat/b/b;)V

    .line 95
    iget-object v1, p2, Lcom/kik/view/adapters/m$a;->a:Landroid/widget/TextView;

    invoke-static {v1, v0}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 96
    iget-object v1, p2, Lcom/kik/view/adapters/m$a;->j:Landroid/widget/TextView;

    invoke-static {v1, v0}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 97
    return-void
.end method

.method protected final a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 2

    .prologue
    .line 53
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/kik/view/adapters/m$a;

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
