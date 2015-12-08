.class public final Lcom/kik/view/adapters/ac;
.super Lcom/kik/view/adapters/bf;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lcom/kik/e/a;Lkik/android/i/b;Lcom/kik/view/adapters/af;)V
    .locals 14

    .prologue
    .line 33
    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v13}, Lcom/kik/view/adapters/bf;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;Lkik/android/i/b;Lcom/kik/view/adapters/af;)V

    .line 34
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 56
    const v0, 0x7f030068

    return v0
.end method

.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 39
    new-instance v1, Lcom/kik/view/adapters/bf$b;

    invoke-direct {v1}, Lcom/kik/view/adapters/bf$b;-><init>()V

    .line 40
    invoke-super {p0, p1, v1}, Lcom/kik/view/adapters/bf;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/bf$b;)Landroid/view/View;

    move-result-object v2

    .line 41
    const v0, 0x7f0e00dd

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/MaskedContentPreviewImage;

    iput-object v0, v1, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    .line 42
    iget-object v0, v1, Lcom/kik/view/adapters/bf$b;->d:Lkik/android/widget/ClampedContentPreviewView;

    const v3, 0x7f0c0020

    invoke-static {v3}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lkik/android/widget/ClampedContentPreviewView;->b(I)V

    .line 43
    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 44
    return-object v2
.end method

.method protected final a(Lkik/a/d/a/a;)Lkik/a/d/d;
    .locals 1

    .prologue
    .line 77
    const-string v0, "preview"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    return-object v0
.end method

.method protected final a(Lcom/kik/view/adapters/bf$b;)V
    .locals 3

    .prologue
    .line 50
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/kik/view/adapters/bf$b;->i:Landroid/view/View;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 51
    return-void
.end method

.method protected final a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 2

    .prologue
    .line 62
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/bf;->a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V

    .line 63
    check-cast p2, Lcom/kik/view/adapters/bf$b;

    .line 64
    if-eqz p1, :cond_0

    .line 65
    iget-object v0, p2, Lcom/kik/view/adapters/bf$b;->j:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->a(Landroid/widget/TextView;)V

    .line 66
    iget-object v0, p2, Lcom/kik/view/adapters/bf$b;->j:Landroid/widget/TextView;

    invoke-static {p1}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object v0, p2, Lcom/kik/view/adapters/bf$b;->h:Lkik/android/widget/IconImageView;

    iget-object v1, p0, Lcom/kik/view/adapters/ac;->n:Lkik/a/e/n;

    invoke-virtual {v0, p1, v1}, Lkik/android/widget/IconImageView;->a(Lkik/a/d/a/a;Lkik/a/e/n;)Z

    .line 68
    iget-object v0, p2, Lcom/kik/view/adapters/bf$b;->j:Landroid/widget/TextView;

    const/16 v1, 0x78

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 70
    iget-object v0, p2, Lcom/kik/view/adapters/bf$b;->j:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 72
    :cond_0
    return-void
.end method
