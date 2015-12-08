.class public abstract Lcom/kik/view/adapters/s;
.super Lcom/kik/view/adapters/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/s$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct/range {p0 .. p11}, Lcom/kik/view/adapters/n;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 55
    return-void
.end method


# virtual methods
.method protected abstract a()I
.end method

.method protected a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 60
    new-instance v0, Lcom/kik/view/adapters/s$a;

    invoke-direct {v0}, Lcom/kik/view/adapters/s$a;-><init>()V

    .line 61
    invoke-virtual {p0, p1, v0}, Lcom/kik/view/adapters/s;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/s$a;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/s$a;)Landroid/view/View;
    .locals 3

    .prologue
    .line 66
    iget-object v0, p0, Lcom/kik/view/adapters/s;->k:Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/kik/view/adapters/s;->a()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 67
    const v0, 0x7f0e00dd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ClampedContentPreviewView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    .line 68
    const v0, 0x7f0e0154

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->p:Lcom/kik/cache/ContactImageView;

    .line 69
    const v0, 0x7f0e0155

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->q:Landroid/widget/ImageView;

    .line 70
    const v0, 0x7f0e00e4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/IconImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->h:Lkik/android/widget/IconImageView;

    .line 71
    const v0, 0x7f0e0153

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->s:Landroid/widget/ImageView;

    .line 72
    const v0, 0x7f0e0151

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->o:Landroid/widget/TextView;

    .line 73
    const v0, 0x7f0e00e5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->j:Landroid/widget/TextView;

    .line 74
    const v0, 0x7f0e00e7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->k:Landroid/widget/ImageView;

    .line 75
    const v0, 0x7f0e00e0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->i:Landroid/view/View;

    .line 76
    const v0, 0x7f0e0159

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->b:Landroid/view/View;

    .line 77
    const v0, 0x7f0e00e9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->c:Landroid/widget/ImageView;

    .line 78
    const v0, 0x7f0e00dc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/MaskedFramelayout;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->m:Lkik/android/widget/MaskedFramelayout;

    .line 79
    const v0, 0x7f0e00e8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->l:Landroid/view/View;

    .line 80
    const v0, 0x7f0e015b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p2, Lcom/kik/view/adapters/s$a;->e:Landroid/view/ViewGroup;

    .line 81
    iput-object v1, p2, Lcom/kik/view/adapters/s$a;->r:Landroid/view/View;

    .line 82
    invoke-virtual {v1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 83
    return-object v1
.end method

.method protected abstract a(Lkik/a/d/a/a;)Lkik/a/d/d;
.end method

.method protected a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    const v1, 0x7f0e01c8

    const/16 v2, 0x8

    const/4 v6, 0x0

    .line 91
    check-cast p2, Lcom/kik/view/adapters/s$a;

    .line 92
    if-eqz p3, :cond_2

    .line 93
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->l:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 98
    :goto_0
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->r:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    instance-of v0, v0, Lcom/kik/cache/MaskedContentPreviewImage;

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->r:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ProgressWidget;

    iget-object v1, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    check-cast v1, Lcom/kik/cache/MaskedContentPreviewImage;

    invoke-virtual {v0, v1}, Lkik/android/widget/ProgressWidget;->a(Lcom/kik/cache/MaskedContentPreviewImage;)V

    .line 104
    :cond_0
    if-eqz p1, :cond_1

    .line 105
    invoke-static {p1}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/a/a;)Lkik/a/d/d;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/view/adapters/s;->g:Lkik/a/e/v;

    invoke-static {v1, v0}, Lkik/android/util/aa;->a(Lkik/a/e/v;Lkik/a/d/d;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    const v1, 0x7f0c0020

    invoke-static {v1}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/ClampedContentPreviewView;->b(I)V

    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->i:Landroid/view/View;

    const v1, 0x7f02009d

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 106
    :goto_1
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/a/a;)Lkik/a/d/d;

    move-result-object v1

    .line 107
    if-nez v1, :cond_5

    .line 108
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    invoke-virtual {v0, v3}, Lkik/android/widget/ClampedContentPreviewView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    invoke-virtual {v0, v2}, Lkik/android/widget/ClampedContentPreviewView;->setVisibility(I)V

    .line 114
    :cond_1
    :goto_2
    return-void

    .line 96
    :cond_2
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->l:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 105
    :cond_3
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    invoke-virtual {v0, v6}, Lkik/android/widget/ClampedContentPreviewView;->b(I)V

    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->i:Landroid/view/View;

    const v1, 0x7f02009c

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :cond_4
    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->i:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    invoke-virtual {v0, v6}, Lkik/android/widget/ClampedContentPreviewView;->b(I)V

    goto :goto_1

    .line 111
    :cond_5
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/s;->e(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    iget-object v3, p0, Lcom/kik/view/adapters/s;->o:Lcom/kik/cache/ad;

    iget-object v5, p0, Lcom/kik/view/adapters/s;->n:Lkik/a/e/n;

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lkik/android/widget/ClampedContentPreviewView;->a(Lkik/a/d/d;Ljava/lang/String;Lcom/kik/cache/ad;ZLkik/a/e/n;)V

    iget-object v0, p2, Lcom/kik/view/adapters/s$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    invoke-virtual {v0, v6}, Lkik/android/widget/ClampedContentPreviewView;->setVisibility(I)V

    goto :goto_2
.end method

.method protected a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 215
    instance-of v0, p1, Lcom/kik/view/adapters/s$a;

    return v0
.end method

.method protected b(Lcom/kik/view/adapters/n$a;)V
    .locals 3

    .prologue
    .line 180
    move-object v0, p1

    check-cast v0, Lcom/kik/view/adapters/s$a;

    .line 181
    iget-object v1, p1, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    const v2, 0x7f0e01c8

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lkik/android/widget/ProgressWidget;

    iget-object v2, v0, Lcom/kik/view/adapters/s$a;->b:Landroid/view/View;

    iget-object v0, v0, Lcom/kik/view/adapters/s$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v2, v0}, Lkik/android/widget/ProgressWidget;->a(Landroid/view/View;Landroid/view/View;)V

    .line 182
    return-void
.end method

.method protected final c(Lcom/kik/view/adapters/n$a;)V
    .locals 2

    .prologue
    .line 187
    check-cast p1, Lcom/kik/view/adapters/s$a;

    .line 188
    iget-object v0, p1, Lcom/kik/view/adapters/s$a;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 189
    return-void
.end method

.method protected e(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final f(Lkik/a/d/a/a;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 128
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/a/a;)Lkik/a/d/d;

    move-result-object v1

    .line 129
    if-nez v1, :cond_1

    .line 140
    :cond_0
    :goto_0
    return-object v0

    .line 132
    :cond_1
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v2

    invoke-virtual {v2, v1}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v1

    .line 133
    if-eqz v1, :cond_0

    .line 137
    const/4 v2, 0x0

    :try_start_0
    array-length v3, v1

    invoke-static {v1, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 140
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected final g(Lkik/a/d/a/a;)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 193
    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/kik/view/adapters/s;->e:Lcom/kik/android/a;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/kik/view/adapters/s;->g:Lkik/a/e/v;

    if-nez v2, :cond_1

    .line 210
    :cond_0
    :goto_0
    return-void

    .line 198
    :cond_1
    const-string v2, "com.kik.ext.video-gallery"

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "com.kik.ext.video-camera"

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 199
    :cond_2
    invoke-virtual {p1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 200
    iget-object v2, p0, Lcom/kik/view/adapters/s;->h:Lcom/kik/l/ab;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/kik/l/ab;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Lkik/android/i/i;->a()Lkik/android/i/i;

    move-result-object v2

    invoke-virtual {p1}, Lkik/a/d/a/a;->k()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/android/i/i;->a(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 206
    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/kik/view/adapters/s;->e:Lcom/kik/android/a;

    const-string v2, "Content Upload Retry"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "App ID"

    invoke-virtual {p1}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Is Upload Content Expired"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    goto :goto_0

    :cond_4
    move v0, v1

    .line 200
    goto :goto_1

    .line 204
    :cond_5
    iget-object v2, p0, Lcom/kik/view/adapters/s;->g:Lkik/a/e/v;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lkik/a/e/v;->u(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v0, v1

    goto :goto_1

    :cond_6
    move v0, v1

    goto :goto_1
.end method
