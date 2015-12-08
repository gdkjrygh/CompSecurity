.class public final Lcom/kik/view/adapters/be;
.super Lcom/kik/view/adapters/ar;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/be$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/kik/cache/ad;

.field private b:Lkik/android/util/bw$a;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lcom/kik/e/a;)V
    .locals 8

    .prologue
    .line 45
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    invoke-direct/range {v0 .. v7}, Lcom/kik/view/adapters/ar;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/android/a;Lkik/a/e/n;Lcom/kik/e/a;)V

    .line 46
    iput-object p6, p0, Lcom/kik/view/adapters/be;->a:Lcom/kik/cache/ad;

    .line 47
    iput-object p4, p0, Lcom/kik/view/adapters/be;->b:Lkik/android/util/bw$a;

    .line 48
    return-void
.end method


# virtual methods
.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 59
    iget-object v0, p0, Lcom/kik/view/adapters/be;->k:Landroid/view/LayoutInflater;

    const v1, 0x7f03006c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 60
    new-instance v2, Lcom/kik/view/adapters/be$a;

    invoke-direct {v2}, Lcom/kik/view/adapters/be$a;-><init>()V

    .line 62
    const v0, 0x7f0e0164

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    .line 63
    const v0, 0x7f0e0162

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    .line 64
    const v0, 0x7f0e0163

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/be$a;->q:Landroid/widget/ImageView;

    .line 65
    const v0, 0x7f0e0151

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/be$a;->o:Landroid/widget/TextView;

    .line 66
    iput-object v1, v2, Lcom/kik/view/adapters/be$a;->r:Landroid/view/View;

    .line 68
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 70
    return-object v1
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 9

    .prologue
    const/4 v6, 0x1

    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 76
    check-cast p2, Lcom/kik/view/adapters/be$a;

    .line 77
    const-class v0, Lkik/a/d/a/l;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/l;

    .line 78
    const-class v1, Lkik/a/d/a/m;

    invoke-static {p1, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/m;

    .line 79
    const-class v2, Lkik/a/d/a/b;

    invoke-static {p1, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    check-cast v2, Lkik/a/d/a/b;

    .line 80
    const-class v3, Lkik/a/d/a/d;

    invoke-static {p1, v3}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v3

    check-cast v3, Lkik/a/d/a/d;

    .line 82
    iget-object v4, p2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 84
    if-eqz v0, :cond_6

    .line 85
    iget-object v1, p2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Lkik/a/d/a/l;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    invoke-virtual {v0}, Lkik/a/d/a/l;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 88
    iget-object v0, p0, Lcom/kik/view/adapters/be;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 89
    if-eqz v0, :cond_2

    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_2

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->I()Z

    move-result v0

    if-eqz v0, :cond_2

    move v3, v6

    .line 90
    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/be;->m:Lcom/kik/view/adapters/ar$a;

    invoke-interface {v0, p1}, Lcom/kik/view/adapters/ar$a;->a(Lkik/a/d/s;)Lkik/a/d/k;

    move-result-object v1

    .line 91
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    invoke-virtual {v0, v7}, Lcom/kik/cache/ContactImageView;->setVisibility(I)V

    .line 94
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lcom/kik/view/adapters/be;->a:Lcom/kik/cache/ad;

    if-nez v3, :cond_3

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lkik/a/d/k;->p()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_0
    move v3, v6

    :goto_1
    iget-object v4, p0, Lcom/kik/view/adapters/be;->f:Lkik/a/e/r;

    iget-object v5, p0, Lcom/kik/view/adapters/be;->e:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 95
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->q:Landroid/widget/ImageView;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lkik/a/d/k;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_2
    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 137
    :cond_1
    :goto_3
    return-void

    :cond_2
    move v3, v7

    .line 89
    goto :goto_0

    :cond_3
    move v3, v7

    .line 94
    goto :goto_1

    :cond_4
    move v7, v8

    .line 95
    goto :goto_2

    .line 98
    :cond_5
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    invoke-virtual {v0, v8}, Lcom/kik/cache/ContactImageView;->setVisibility(I)V

    .line 99
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 102
    :cond_6
    if-eqz v1, :cond_7

    .line 103
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Lkik/a/d/a/m;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    invoke-virtual {v0, v8}, Lcom/kik/cache/ContactImageView;->setVisibility(I)V

    .line 105
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    .line 107
    :cond_7
    if-eqz v2, :cond_9

    .line 110
    invoke-virtual {v2}, Lkik/a/d/a/b;->a()I

    move-result v0

    if-ne v0, v6, :cond_8

    .line 111
    const v0, 0x7f09015e

    invoke-virtual {v4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 117
    :goto_4
    iget-object v1, p2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    invoke-virtual {v0, v8}, Lcom/kik/cache/ContactImageView;->setVisibility(I)V

    .line 119
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 121
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    const/16 v1, 0xf

    invoke-static {v0, v1}, Landroid/text/util/Linkify;->addLinks(Landroid/widget/TextView;I)Z

    goto :goto_3

    .line 114
    :cond_8
    const v0, 0x7f09015d

    new-array v1, v6, [Ljava/lang/Object;

    invoke-virtual {v2}, Lkik/a/d/a/b;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v7

    invoke-virtual {v4, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 123
    :cond_9
    if-eqz v3, :cond_1

    .line 124
    invoke-virtual {v3}, Lkik/a/d/a/d;->g()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 125
    iget-object v0, p0, Lcom/kik/view/adapters/be;->m:Lcom/kik/view/adapters/ar$a;

    invoke-interface {v0, p1}, Lcom/kik/view/adapters/ar$a;->a(Lkik/a/d/s;)Lkik/a/d/k;

    move-result-object v1

    .line 127
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Lkik/a/d/a/d;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lcom/kik/view/adapters/be;->a:Lcom/kik/cache/ad;

    iget-object v4, p0, Lcom/kik/view/adapters/be;->f:Lkik/a/e/r;

    iget-object v5, p0, Lcom/kik/view/adapters/be;->e:Lcom/kik/android/a;

    move v3, v7

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 130
    new-array v0, v6, [Landroid/view/View;

    iget-object v2, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    aput-object v2, v0, v7

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 131
    iget-object v0, p2, Lcom/kik/view/adapters/be$a;->q:Landroid/widget/ImageView;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lkik/a/d/k;->i()Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_5
    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    :cond_a
    move v7, v8

    goto :goto_5

    .line 134
    :cond_b
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    iget-object v1, p2, Lcom/kik/view/adapters/be$a;->p:Lcom/kik/cache/ContactImageView;

    aput-object v1, v0, v7

    iget-object v1, p2, Lcom/kik/view/adapters/be$a;->a:Landroid/widget/TextView;

    aput-object v1, v0, v6

    const/4 v1, 0x2

    iget-object v2, p2, Lcom/kik/view/adapters/be$a;->o:Landroid/widget/TextView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto/16 :goto_3
.end method

.method protected final a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 53
    instance-of v0, p1, Lcom/kik/view/adapters/be$a;

    return v0
.end method
