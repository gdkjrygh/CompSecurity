.class public final Lcom/kik/view/adapters/w;
.super Lcom/kik/view/adapters/ay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/w$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lcom/kik/e/a;)V
    .locals 9

    .prologue
    .line 32
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    move-object v6, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/kik/view/adapters/ay;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/android/a;Lcom/kik/cache/ad;Lkik/a/e/n;Lcom/kik/e/a;)V

    .line 33
    return-void
.end method

.method private a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/view/adapters/w$a;)V
    .locals 3

    .prologue
    .line 136
    iget-object v0, p3, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    invoke-virtual {p1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/view/adapters/w;->n:Lkik/a/e/n;

    invoke-virtual {v0, v1, p2, v2}, Lkik/android/widget/LegacyLazyLoadingImage;->a(Ljava/lang/String;Ljava/lang/String;Lkik/a/e/n;)V

    .line 137
    iget-object v0, p3, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/LegacyLazyLoadingImage;->setVisibility(I)V

    .line 138
    return-void
.end method


# virtual methods
.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 43
    iget-object v0, p0, Lcom/kik/view/adapters/w;->k:Landroid/view/LayoutInflater;

    const v1, 0x7f03006b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 44
    new-instance v2, Lcom/kik/view/adapters/w$a;

    invoke-direct {v2}, Lcom/kik/view/adapters/w$a;-><init>()V

    .line 45
    const v0, 0x7f0e00dd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/LegacyLazyLoadingImage;

    iput-object v0, v2, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    .line 46
    const v0, 0x7f0e0154

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/w$a;->p:Lcom/kik/cache/ContactImageView;

    .line 47
    const v0, 0x7f0e0155

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/w$a;->q:Landroid/widget/ImageView;

    .line 48
    const v0, 0x7f0e0153

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/w$a;->s:Landroid/widget/ImageView;

    .line 49
    const v0, 0x7f0e0151

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/w$a;->o:Landroid/widget/TextView;

    .line 50
    iput-object v1, v2, Lcom/kik/view/adapters/w$a;->r:Landroid/view/View;

    .line 51
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 52
    return-object v1
.end method

.method public final a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V
    .locals 7

    .prologue
    const/16 v6, 0xb

    const/16 v4, 0x9

    const/4 v3, -0x1

    const/4 v5, 0x0

    .line 119
    invoke-super/range {p0 .. p5}, Lcom/kik/view/adapters/ay;->a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V

    move-object v0, p1

    .line 121
    check-cast v0, Lcom/kik/view/adapters/w$a;

    iget-object v1, v0, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    invoke-virtual {v1}, Lkik/android/widget/LegacyLazyLoadingImage;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p2}, Lkik/a/d/s;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v6, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v1, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v2, 0x2d

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    iget v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    const/4 v4, 0x3

    invoke-static {v4}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v4

    iget v5, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    :goto_0
    iget-object v0, v0, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    invoke-virtual {v0, v1}, Lkik/android/widget/LegacyLazyLoadingImage;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 123
    check-cast p1, Lcom/kik/view/adapters/w$a;

    .line 125
    iget-object v0, p1, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    new-instance v1, Lcom/kik/view/adapters/y;

    invoke-direct {v1, p0, p5, p1}, Lcom/kik/view/adapters/y;-><init>(Lcom/kik/view/adapters/w;Lcom/kik/view/adapters/au$b;Lcom/kik/view/adapters/w$a;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/LegacyLazyLoadingImage;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    return-void

    .line 121
    :cond_0
    invoke-virtual {v1, v6, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v1, v4, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v2, 0x34

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    iget v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    iget v4, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v2, v3, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 84
    check-cast p2, Lcom/kik/view/adapters/w$a;

    .line 85
    iget-object v0, p2, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    invoke-virtual {v0, v1, v1, v1, v1}, Lkik/android/widget/LegacyLazyLoadingImage;->setPadding(IIII)V

    .line 87
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 89
    if-eqz v0, :cond_0

    .line 91
    const-string v1, "png-preview"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    check-cast v1, Lkik/a/d/d;

    .line 93
    const-string v2, "preview"

    invoke-virtual {v0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    check-cast v2, Lkik/a/d/d;

    .line 95
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    if-nez v1, :cond_1

    .line 96
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0, p2}, Lcom/kik/view/adapters/w;->a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/view/adapters/w$a;)V

    .line 106
    :cond_0
    :goto_0
    iget-object v0, p2, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    new-instance v1, Lcom/kik/view/adapters/x;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/x;-><init>(Lcom/kik/view/adapters/w;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/LegacyLazyLoadingImage;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 114
    return-void

    .line 98
    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 99
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0, p2}, Lcom/kik/view/adapters/w;->a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/view/adapters/w$a;)V

    goto :goto_0

    .line 102
    :cond_2
    iget-object v0, p2, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/android/widget/LegacyLazyLoadingImage;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p2, Lcom/kik/view/adapters/w$a;->a:Lkik/android/widget/LegacyLazyLoadingImage;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lkik/android/widget/LegacyLazyLoadingImage;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 58
    instance-of v0, p1, Lcom/kik/view/adapters/w$a;

    return v0
.end method
