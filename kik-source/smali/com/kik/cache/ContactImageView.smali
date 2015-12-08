.class public Lcom/kik/cache/ContactImageView;
.super Lkik/android/widget/KikNetworkedImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cache/ContactImageView$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Boolean;

.field private b:Lkik/a/d/k;

.field private c:Landroid/graphics/Bitmap;

.field private d:Landroid/graphics/Bitmap;

.field private h:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;)V

    .line 83
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0, p1, p2}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 88
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 93
    return-void
.end method

.method private a(Lkik/a/d/aa;Lcom/kik/cache/ad;ZLcom/android/volley/r$b;ZZ)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 107
    sget-object v3, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    move-object v0, p1

    move-object v1, p4

    move v2, p3

    move v4, p6

    move v5, p5

    invoke-static/range {v0 .. v5}, Lcom/kik/cache/ak;->a(Lkik/a/d/aa;Lcom/android/volley/r$b;ZLcom/android/volley/r$a;ZZ)Lcom/kik/cache/ak;

    move-result-object v1

    .line 108
    iget-object v0, p1, Lkik/a/d/aa;->i:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/kik/cache/ContactImageView;->a:Ljava/lang/Boolean;

    .line 109
    const/4 v5, 0x1

    move-object v0, p0

    move-object v2, p2

    move v3, v7

    move v4, v7

    move v6, v7

    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/ContactImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    .line 110
    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 1

    .prologue
    .line 203
    iput-object p1, p0, Lcom/kik/cache/ContactImageView;->h:Landroid/graphics/Bitmap;

    .line 204
    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    new-instance v0, Lkik/android/widget/cs;

    invoke-direct {v0, p1, p2}, Lkik/android/widget/cs;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 208
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 186
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->d:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->d:Landroid/graphics/Bitmap;

    if-eq p1, v0, :cond_1

    .line 188
    :cond_0
    iput-object v1, p0, Lcom/kik/cache/ContactImageView;->d:Landroid/graphics/Bitmap;

    .line 189
    iput-object v1, p0, Lcom/kik/cache/ContactImageView;->c:Landroid/graphics/Bitmap;

    .line 190
    iput-object v1, p0, Lcom/kik/cache/ContactImageView;->h:Landroid/graphics/Bitmap;

    .line 192
    :cond_1
    invoke-super {p0, p1}, Lkik/android/widget/KikNetworkedImageView;->a(Landroid/graphics/Bitmap;)V

    .line 193
    return-void
.end method

.method public final a(Lkik/a/d/aa;Lcom/kik/cache/ad;)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 97
    sget-object v4, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, v3

    move v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/aa;Lcom/kik/cache/ad;ZLcom/android/volley/r$b;ZZ)V

    .line 98
    return-void
.end method

.method public final a(Lkik/a/d/k;Lcom/kik/cache/ad;ZIZZZLkik/a/e/r;Lcom/kik/android/a;)V
    .locals 8

    .prologue
    .line 124
    iput-object p1, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    .line 126
    if-eqz p1, :cond_6

    .line 127
    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    invoke-virtual {p0}, Lcom/kik/cache/ContactImageView;->e()V

    .line 130
    const/4 p1, 0x0

    .line 132
    :cond_0
    instance-of v0, p1, Lkik/a/d/n;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 134
    const/4 p3, 0x0

    move v3, p3

    move-object v0, p1

    .line 138
    :goto_0
    if-eqz v3, :cond_3

    .line 139
    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->g:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->c:Landroid/graphics/Bitmap;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->g:Landroid/graphics/Bitmap;

    iput-object v1, p0, Lcom/kik/cache/ContactImageView;->d:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->g:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/cache/ContactImageView;->c:Landroid/graphics/Bitmap;

    :cond_1
    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->c:Landroid/graphics/Bitmap;

    iput-object v1, p0, Lcom/kik/cache/ContactImageView;->g:Landroid/graphics/Bitmap;

    .line 145
    :cond_2
    :goto_1
    const/4 v7, 0x1

    .line 146
    const/4 v1, 0x0

    .line 147
    if-eqz v0, :cond_5

    .line 150
    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    move-object v1, v0

    .line 151
    check-cast v1, Lkik/a/d/n;

    .line 152
    invoke-virtual {v1}, Lkik/a/d/n;->w()Ljava/util/List;

    .line 153
    invoke-virtual {v1}, Lkik/a/d/n;->w()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Lcom/kik/cache/ContactImageView$a;->a(I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 154
    invoke-virtual {p0, v1}, Lcom/kik/cache/ContactImageView;->a(Landroid/graphics/Bitmap;)V

    .line 156
    check-cast v0, Lkik/a/d/n;

    sget-object v1, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    sget-object v3, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    move-object/from16 v4, p8

    move v5, p7

    move-object v6, p2

    move-object/from16 v7, p9

    invoke-static/range {v0 .. v7}, Lcom/kik/cache/v;->a(Lkik/a/d/n;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;Lkik/a/e/r;ZLcom/kik/cache/ad;Lcom/kik/android/a;)Lcom/kik/cache/v;

    move-result-object v1

    .line 158
    const/4 v6, 0x0

    .line 163
    :goto_2
    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v2, p2

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/kik/cache/ContactImageView;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad;IIZZ)V

    .line 164
    return-void

    .line 142
    :cond_3
    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->g:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->d:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/kik/cache/ContactImageView;->d:Landroid/graphics/Bitmap;

    iput-object v1, p0, Lcom/kik/cache/ContactImageView;->g:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 161
    :cond_4
    sget-object v1, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    sget-object v2, Lcom/kik/cache/z;->d:Lcom/android/volley/r$a;

    const/4 v5, 0x0

    move v4, p4

    move v6, p6

    invoke-static/range {v0 .. v6}, Lcom/kik/cache/k;->a(Lkik/a/d/k;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZIZZ)Lcom/kik/cache/k;

    move-result-object v1

    move v6, v7

    goto :goto_2

    :cond_5
    move v6, v7

    goto :goto_2

    :cond_6
    move v3, p3

    move-object v0, p1

    goto :goto_0
.end method

.method public final a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 114
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v5, v4

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v0 .. v7}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZZZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 115
    return-void
.end method

.method public final a(Lkik/a/d/k;Lcom/kik/cache/ad;ZZZLkik/a/e/r;Lcom/kik/android/a;)V
    .locals 10

    .prologue
    .line 119
    const/4 v4, 0x4

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v5, p4

    move v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-virtual/range {v0 .. v9}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZIZZZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 120
    return-void
.end method

.method protected final a()Z
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->i()Z

    move-result v0

    .line 72
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->a:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Lkik/a/d/aa;Lcom/kik/cache/ad;)V
    .locals 7

    .prologue
    const/4 v3, 0x1

    .line 102
    sget-object v4, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, v3

    move v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/aa;Lcom/kik/cache/ad;ZLcom/android/volley/r$b;ZZ)V

    .line 103
    return-void
.end method

.method protected final b()Z
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    instance-of v0, v0, Lkik/a/d/n;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Lkik/a/d/k;
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/kik/cache/ContactImageView;->b:Lkik/a/d/k;

    return-object v0
.end method
