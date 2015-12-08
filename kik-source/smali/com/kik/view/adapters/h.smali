.class public final Lcom/kik/view/adapters/h;
.super Lcom/kik/view/adapters/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/h$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct/range {p0 .. p11}, Lcom/kik/view/adapters/s;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 42
    return-void
.end method

.method public static b(Lkik/a/d/a/a;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 167
    if-eqz p0, :cond_3

    const-string v2, "text"

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "title"

    invoke-virtual {p0, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v1

    :goto_0
    if-eqz v2, :cond_3

    invoke-static {p0}, Lcom/kik/view/adapters/h;->h(Lkik/a/d/a/a;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v1

    :goto_1
    if-nez v2, :cond_0

    invoke-static {p0}, Lcom/kik/view/adapters/h;->c(Lkik/a/d/a/a;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v0, v1

    :cond_1
    return v0

    :cond_2
    move v2, v0

    goto :goto_0

    :cond_3
    move v2, v0

    goto :goto_1
.end method

.method public static c(Lkik/a/d/a/a;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 186
    if-nez p0, :cond_1

    .line 193
    :cond_0
    :goto_0
    return v0

    .line 189
    :cond_1
    const-string v2, "text"

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 190
    const-string v3, "title"

    invoke-virtual {p0, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 191
    invoke-static {v3}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v2}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v1

    .line 193
    :goto_1
    if-eqz v2, :cond_0

    invoke-static {p0}, Lcom/kik/view/adapters/h;->h(Lkik/a/d/a/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_2
    move v2, v0

    .line 191
    goto :goto_1
.end method

.method private static h(Lkik/a/d/a/a;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 198
    if-nez p0, :cond_1

    .line 203
    :cond_0
    :goto_0
    return v0

    .line 201
    :cond_1
    const-string v2, "png-preview"

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    .line 202
    const-string v3, "preview"

    invoke-virtual {p0, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v3

    .line 203
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
    .line 57
    const v0, 0x7f03006a

    return v0
.end method

.method protected final a(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 47
    new-instance v1, Lcom/kik/view/adapters/h$a;

    invoke-direct {v1}, Lcom/kik/view/adapters/h$a;-><init>()V

    .line 48
    invoke-super {p0, p1, v1}, Lcom/kik/view/adapters/s;->a(Landroid/view/ViewGroup;Lcom/kik/view/adapters/s$a;)Landroid/view/View;

    move-result-object v2

    .line 49
    const v0, 0x7f0e00de

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    .line 50
    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 51
    return-object v2
.end method

.method protected final a(Lkik/a/d/a/a;)Lkik/a/d/d;
    .locals 3

    .prologue
    .line 97
    const-string v0, "png-preview"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    .line 98
    const-string v1, "preview"

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    check-cast v1, Lkik/a/d/d;

    .line 100
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    if-nez v0, :cond_0

    .line 107
    :goto_0
    return-object v1

    .line 103
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object v1, v0

    .line 104
    goto :goto_0

    .line 107
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected final a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
    .locals 3

    .prologue
    .line 63
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V

    .line 64
    check-cast p2, Lcom/kik/view/adapters/h$a;

    .line 66
    if-eqz p1, :cond_0

    invoke-static {p1}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    iget-object v1, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 70
    iget-object v1, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 71
    iget-object v1, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    :cond_0
    :goto_0
    return-void

    .line 74
    :cond_1
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 120
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V

    .line 121
    check-cast p2, Lcom/kik/view/adapters/h$a;

    .line 123
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/a;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 126
    iget-object v1, p2, Lcom/kik/view/adapters/h$a;->k:Landroid/widget/ImageView;

    const v2, 0x7f070045

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 128
    invoke-static {v0}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 131
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->j:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 132
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 133
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->i:Landroid/view/View;

    iget-object v1, p2, Lcom/kik/view/adapters/h$a;->i:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0006

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-static {v0, v1}, Lkik/android/util/cv;->b(Landroid/view/View;I)V

    .line 134
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->i:Landroid/view/View;

    iget-object v1, p2, Lcom/kik/view/adapters/h$a;->e:Landroid/view/ViewGroup;

    invoke-static {v0, v1}, Lkik/android/util/cv;->b(Landroid/view/View;Landroid/view/View;)V

    .line 136
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->i:Landroid/view/View;

    const v1, 0x7f02009c

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 137
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 138
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->k:Landroid/widget/ImageView;

    const v1, 0x7f020269

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 156
    :goto_0
    return-void

    .line 142
    :cond_0
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->j:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->b:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 143
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    sget-object v1, Lkik/android/util/ac;->b:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 145
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->i:Landroid/view/View;

    iget-object v1, p2, Lcom/kik/view/adapters/h$a;->e:Landroid/view/ViewGroup;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/view/View;Landroid/view/View;)V

    .line 146
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->i:Landroid/view/View;

    const/4 v1, -0x2

    invoke-static {v0, v1}, Lkik/android/util/cv;->b(Landroid/view/View;I)V

    .line 147
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    .line 149
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->i:Landroid/view/View;

    iget-object v1, p0, Lcom/kik/view/adapters/h;->d:Lkik/android/chat/b/d;

    invoke-virtual {v1}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/b/c;->a(Landroid/view/View;Lkik/android/chat/b/b;)V

    .line 150
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/view/adapters/h;->d:Lkik/android/chat/b/d;

    invoke-virtual {v1}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 151
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->j:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kik/view/adapters/h;->d:Lkik/android/chat/b/d;

    invoke-virtual {v1}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 152
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->k:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kik/view/adapters/h;->d:Lkik/android/chat/b/d;

    invoke-virtual {v1}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/b/c;->a(Landroid/widget/ImageView;Lkik/android/chat/b/b;)V

    .line 154
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    const/16 v1, 0x28

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/widget/ClampedContentPreviewView;->d(I)V

    goto :goto_0
.end method

.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V
    .locals 3

    .prologue
    .line 82
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/s;->a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V

    .line 83
    check-cast p2, Lcom/kik/view/adapters/h$a;

    .line 84
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v1, Lkik/android/widget/c$a;->c:I

    invoke-virtual {v0, v1}, Lkik/android/widget/ClampedContentPreviewView;->a(I)V

    .line 85
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v1, Lcom/kik/view/adapters/h;->q:I

    sget v2, Lcom/kik/view/adapters/h;->p:I

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/ClampedContentPreviewView;->a(II)V

    .line 92
    :goto_0
    return-void

    .line 89
    :cond_0
    iget-object v0, p2, Lcom/kik/view/adapters/h$a;->d:Lkik/android/widget/ClampedContentPreviewView;

    sget v1, Lcom/kik/view/adapters/h;->p:I

    sget v2, Lcom/kik/view/adapters/h;->q:I

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/ClampedContentPreviewView;->a(II)V

    goto :goto_0
.end method

.method protected final a(Lcom/kik/view/adapters/ar$b;)Z
    .locals 1

    .prologue
    .line 114
    instance-of v0, p1, Lcom/kik/view/adapters/h$a;

    return v0
.end method

.method protected final a(Lcom/kik/view/adapters/n$a;)[Landroid/view/View;
    .locals 3

    .prologue
    .line 161
    check-cast p1, Lcom/kik/view/adapters/h$a;

    .line 162
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/kik/view/adapters/h$a;->h:Lkik/android/widget/IconImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p1, Lcom/kik/view/adapters/h$a;->j:Landroid/widget/TextView;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p1, Lcom/kik/view/adapters/h$a;->k:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    return-object v0
.end method
