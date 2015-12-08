.class public final Lcom/kik/view/adapters/z;
.super Lcom/kik/view/adapters/s;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct/range {p0 .. p11}, Lcom/kik/view/adapters/s;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 40
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
    .line 45
    new-instance v1, Lcom/kik/view/adapters/s$a;

    invoke-direct {v1}, Lcom/kik/view/adapters/s$a;-><init>()V

    .line 46
    invoke-super {p0, p1, v1}, Lcom/kik/view/adapters/s;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/s$a;)Landroid/view/View;

    move-result-object v2

    .line 47
    const v0, 0x7f0e00dd

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/MaskedContentPreviewImage;

    iput-object v0, v1, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    .line 48
    iget-object v0, v1, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    const v3, 0x7f0c0020

    invoke-static {v3}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lkik/android/widget/ClampedContentPreviewView;->b(I)V

    .line 49
    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 50
    return-object v2
.end method

.method protected final a(Lkik/a/d/a/a;)Lkik/a/d/d;
    .locals 1

    .prologue
    .line 93
    const-string v0, "preview"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    return-object v0
.end method

.method protected final a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 2

    .prologue
    .line 78
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V

    .line 79
    check-cast p2, Lcom/kik/view/adapters/s$a;

    .line 80
    if-eqz p1, :cond_0

    .line 81
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->j:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->a(Landroid/widget/TextView;)V

    .line 82
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->j:Landroid/widget/TextView;

    invoke-static {p1}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->h:Lkik/android/widget/IconImageView;

    iget-object v1, p0, Lcom/kik/view/adapters/z;->n:Lkik/a/e/n;

    invoke-virtual {v0, p1, v1}, Lkik/android/widget/IconImageView;->a(Lkik/a/d/a/a;Lkik/a/e/n;)Z

    .line 84
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->j:Landroid/widget/TextView;

    const/16 v1, 0x78

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 86
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->j:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 88
    :cond_0
    return-void
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V
    .locals 3

    .prologue
    .line 63
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V

    .line 64
    check-cast p2, Lcom/kik/view/adapters/s$a;

    .line 66
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v1, Lkik/android/widget/c$a;->c:I

    invoke-virtual {v0, v1}, Lkik/android/widget/ClampedContentPreviewView;->a(I)V

    .line 67
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v1, Lcom/kik/view/adapters/z;->q:I

    sget v2, Lcom/kik/view/adapters/z;->p:I

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/ClampedContentPreviewView;->a(II)V

    .line 73
    :goto_0
    return-void

    .line 71
    :cond_0
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v1, Lcom/kik/view/adapters/z;->p:I

    sget v2, Lcom/kik/view/adapters/z;->q:I

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/ClampedContentPreviewView;->a(II)V

    goto :goto_0
.end method

.method protected final a(Lkik/android/net/a/b;Lkik/android/widget/ProgressWidget;Lcom/kik/view/adapters/n$a;Lkik/a/d/s;)V
    .locals 8

    .prologue
    const/16 v7, 0x65

    .line 107
    iget-object v0, p0, Lcom/kik/view/adapters/z;->i:Lkik/a/e/i;

    invoke-virtual {p4}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v5

    .line 108
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p4, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 110
    invoke-virtual {p0, v0}, Lcom/kik/view/adapters/z;->g(Lkik/a/d/a/a;)V

    .line 111
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    .line 112
    new-instance v0, Lcom/kik/view/adapters/aa;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/kik/view/adapters/aa;-><init>(Lcom/kik/view/adapters/z;Lkik/android/net/a/b;Lcom/kik/view/adapters/n$a;Lkik/android/widget/ProgressWidget;Lkik/a/d/f;Lkik/a/d/s;)V

    invoke-virtual {p2, v0}, Lkik/android/widget/ProgressWidget;->b(Landroid/view/View$OnClickListener;)V

    .line 123
    invoke-virtual {p2}, Lkik/android/widget/ProgressWidget;->a()V

    .line 125
    invoke-virtual {p4}, Lkik/a/d/s;->c()I

    move-result v0

    const/16 v1, -0x64

    if-ne v0, v1, :cond_0

    .line 126
    iget-object v0, p3, Lcom/kik/view/adapters/n$a;->s:Landroid/widget/ImageView;

    const v1, 0x7f02022e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 128
    invoke-virtual {p4}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/view/adapters/z;->g:Lkik/a/e/v;

    invoke-virtual {v5, v0, v7, v1}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    .line 132
    :cond_0
    invoke-virtual {p4}, Lkik/a/d/s;->c()I

    move-result v0

    if-ne v0, v7, :cond_1

    .line 133
    invoke-virtual {p1}, Lkik/android/net/a/b;->l()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/view/adapters/ab;

    invoke-direct {v1, p0, p4}, Lcom/kik/view/adapters/ab;-><init>(Lcom/kik/view/adapters/z;Lkik/a/d/s;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 141
    :cond_1
    return-void
.end method

.method protected final d(Lkik/a/d/a/a;)V
    .locals 0

    .prologue
    .line 99
    invoke-super {p0, p1}, Lcom/kik/view/adapters/s;->d(Lkik/a/d/a/a;)V

    .line 100
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/z;->g(Lkik/a/d/a/a;)V

    .line 101
    return-void
.end method
