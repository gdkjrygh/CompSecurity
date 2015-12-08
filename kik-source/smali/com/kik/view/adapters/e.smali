.class public Lcom/kik/view/adapters/e;
.super Lcom/kik/view/adapters/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/e$a;
    }
.end annotation


# instance fields
.field private b:Lkik/android/util/bw$a;

.field private c:Lkik/android/e/f;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lkik/android/e/f;Lcom/kik/android/a;Lkik/a/e/n;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 11

    .prologue
    .line 48
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    invoke-direct/range {v1 .. v10}, Lcom/kik/view/adapters/b;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 49
    iput-object p4, p0, Lcom/kik/view/adapters/e;->b:Lkik/android/util/bw$a;

    .line 50
    move-object/from16 v0, p7

    iput-object v0, p0, Lcom/kik/view/adapters/e;->c:Lkik/android/e/f;

    .line 51
    return-void
.end method


# virtual methods
.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 62
    iget-object v0, p0, Lcom/kik/view/adapters/e;->k:Landroid/view/LayoutInflater;

    const v1, 0x7f030065

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 63
    new-instance v2, Lcom/kik/view/adapters/e$a;

    invoke-direct {v2}, Lcom/kik/view/adapters/e$a;-><init>()V

    .line 64
    const v0, 0x7f0e0153

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/e$a;->s:Landroid/widget/ImageView;

    .line 65
    const v0, 0x7f0e0154

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/e$a;->p:Lcom/kik/cache/ContactImageView;

    .line 66
    const v0, 0x7f0e0155

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/e$a;->q:Landroid/widget/ImageView;

    .line 67
    const v0, 0x7f0e0152

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    .line 68
    const v0, 0x7f0e0151

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/e$a;->o:Landroid/widget/TextView;

    .line 69
    const v0, 0x7f0e00dc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v2, Lcom/kik/view/adapters/e$a;->a:Landroid/view/View;

    .line 70
    iput-object v1, v2, Lcom/kik/view/adapters/e$a;->r:Landroid/view/View;

    .line 72
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 73
    return-object v1
.end method

.method public final a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V
    .locals 2

    .prologue
    .line 125
    invoke-super/range {p0 .. p5}, Lcom/kik/view/adapters/b;->a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V

    .line 126
    check-cast p1, Lcom/kik/view/adapters/e$a;

    .line 128
    iget-object v0, p1, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    new-instance v1, Lcom/kik/view/adapters/f;

    invoke-direct {v1, p0, p5, p1}, Lcom/kik/view/adapters/f;-><init>(Lcom/kik/view/adapters/e;Lcom/kik/view/adapters/au$b;Lcom/kik/view/adapters/e$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    iget-object v0, p1, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    new-instance v1, Lcom/kik/view/adapters/g;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/g;-><init>(Lcom/kik/view/adapters/e;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 146
    return-void
.end method

.method protected a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 9

    .prologue
    const/16 v6, 0x11

    const/16 v7, 0xc

    .line 79
    check-cast p2, Lcom/kik/view/adapters/e$a;

    .line 80
    invoke-virtual {p1}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v1

    .line 82
    if-nez v1, :cond_0

    .line 83
    const-class v0, Lkik/a/d/a/m;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/m;

    .line 84
    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {v0}, Lkik/a/d/a/m;->a()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 88
    :cond_0
    const-class v0, Lkik/a/f/e/k;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkik/a/f/e/k;

    .line 89
    invoke-virtual {p1}, Lkik/a/d/s;->o()[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/kik/view/adapters/e;->l:Landroid/content/Context;

    invoke-static {v0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v0

    const-string v3, "show-lock-icon"

    invoke-interface {v0, v3}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 92
    if-eqz v0, :cond_1

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " (E)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 96
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 98
    iget-object v0, p0, Lcom/kik/view/adapters/e;->a:Lkik/android/chat/b/d;

    invoke-virtual {v0}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v0

    .line 99
    iget-object v3, p2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lkik/android/chat/b/b;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 105
    :goto_0
    iget-object v3, p2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    invoke-static {v3, v0}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 107
    iget-object v8, p2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    iget-object v0, p2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v2, :cond_3

    const/4 v2, 0x0

    :goto_1
    const/16 v3, 0x15

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/kik/view/adapters/e;->c:Lkik/android/e/f;

    invoke-static/range {v0 .. v5}, Lcom/kik/android/c/f;->a(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/kik/i/a/a/c;IZLkik/android/e/f;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    iget-object v0, p2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    invoke-static {}, Lkik/android/util/be;->a()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-static {}, Lkik/android/util/be;->b()[Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/view/adapters/e;->b:Lkik/android/util/bw$a;

    invoke-static {v0, v1, v2, v3}, Lkik/android/util/v;->a(Landroid/widget/TextView;Ljava/util/regex/Pattern;[Ljava/lang/String;Lkik/android/util/bw$a;)Z

    invoke-static {v0}, Lkik/android/util/v;->a(Landroid/widget/TextView;)Z

    .line 112
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v6

    .line 119
    :goto_2
    iget-object v1, p2, Lcom/kik/view/adapters/e$a;->a:Landroid/view/View;

    invoke-static {v1, v7, v0}, Lkik/android/util/cv;->a(Landroid/view/View;II)V

    .line 120
    return-void

    .line 102
    :cond_2
    iget-object v0, p0, Lcom/kik/view/adapters/e;->a:Lkik/android/chat/b/d;

    invoke-virtual {v0}, Lkik/android/chat/b/d;->e()Lkik/android/chat/b/b;

    move-result-object v0

    .line 103
    iget-object v3, p2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/kik/view/adapters/e;->a:Lkik/android/chat/b/d;

    invoke-virtual {v4}, Lkik/android/chat/b/d;->b()Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 107
    :cond_3
    invoke-virtual {v2}, Lkik/a/f/e/k;->b()Lcom/kik/i/a/a/c;

    move-result-object v2

    goto :goto_1

    :cond_4
    move v0, v7

    move v7, v6

    .line 116
    goto :goto_2
.end method

.method protected final a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 56
    instance-of v0, p1, Lcom/kik/view/adapters/e$a;

    return v0
.end method
