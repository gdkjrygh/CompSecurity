.class public final Lcom/roidapp/cloudlib/sns/login/a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final a:[I


# instance fields
.field private b:Landroid/support/v4/app/Fragment;

.field private c:J

.field private d:I

.field private e:Z

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Z

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 49
    const/4 v0, 0x3

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/roidapp/cloudlib/aq;->ab:I

    aput v2, v0, v1

    const/4 v1, 0x1

    sget v2, Lcom/roidapp/cloudlib/aq;->ac:I

    aput v2, v0, v1

    const/4 v1, 0x2

    sget v2, Lcom/roidapp/cloudlib/aq;->ad:I

    aput v2, v0, v1

    sput-object v0, Lcom/roidapp/cloudlib/sns/login/a;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V
    .locals 7

    .prologue
    .line 67
    const/4 v3, 0x0

    const-wide/16 v4, -0x1

    move-object v1, p0

    move-object v2, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/login/a;-><init>(Landroid/support/v4/app/Fragment;Ljava/util/List;JLjava/lang/String;)V

    .line 68
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/Fragment;Ljava/util/List;JLjava/lang/String;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/Fragment;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;J",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/login/a;-><init>(Landroid/support/v4/app/Fragment;Ljava/util/List;JZLjava/lang/String;)V

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/Fragment;Ljava/util/List;JZLjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/Fragment;",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;JZ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 74
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 56
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->c:J

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->f:Ljava/util/List;

    .line 61
    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/login/a;->g:Ljava/lang/String;

    .line 62
    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/login/a;->h:Ljava/lang/String;

    .line 75
    invoke-virtual {p0, p2}, Lcom/roidapp/cloudlib/sns/login/a;->a(Ljava/util/List;)V

    .line 76
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    .line 77
    iput-boolean p5, p0, Lcom/roidapp/cloudlib/sns/login/a;->j:Z

    .line 78
    iput-wide p3, p0, Lcom/roidapp/cloudlib/sns/login/a;->c:J

    .line 79
    iput-object p6, p0, Lcom/roidapp/cloudlib/sns/login/a;->h:Ljava/lang/String;

    .line 80
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ao;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->d:I

    .line 81
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/login/a;)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method private a(JLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 313
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    if-nez v0, :cond_0

    .line 324
    :goto_0
    return-void

    .line 320
    :cond_0
    invoke-static {p1, p2, p3, p4}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v1

    .line 321
    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/h/h;->C()V

    .line 322
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    check-cast v0, Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/main/b;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    .line 86
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 108
    iput-wide p1, p0, Lcom/roidapp/cloudlib/sns/login/a;->c:J

    .line 109
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/a;->g:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 94
    if-eqz p1, :cond_0

    .line 95
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/a;->f:Ljava/util/List;

    .line 97
    :goto_0
    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->e:Z

    .line 105
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 327
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/a;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->i:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 118
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    .prologue
    const/16 v11, 0x8

    const/4 v10, 0x0

    .line 123
    if-nez p2, :cond_0

    .line 124
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->C:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 126
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/ar;->bf:I

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    .line 127
    sget v1, Lcom/roidapp/cloudlib/ar;->aT:I

    invoke-static {p2, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 128
    sget v2, Lcom/roidapp/cloudlib/ar;->h:I

    invoke-static {p2, v2}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 129
    sget v3, Lcom/roidapp/cloudlib/ar;->aR:I

    invoke-static {p2, v3}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    .line 130
    invoke-virtual {v3, v11}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 131
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/login/a;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/roidapp/cloudlib/sns/b/x;

    .line 132
    iget-object v5, v4, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v5, v4, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    .line 1304
    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v6}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v5

    sget-object v6, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v5

    new-instance v6, Lcom/roidapp/cloudlib/sns/e/a;

    invoke-direct {v6, v0}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 135
    invoke-virtual {v0, v4}, Lcom/roidapp/baselib/view/RoundImageView;->setTag(Ljava/lang/Object;)V

    .line 136
    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/view/RoundImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 138
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->e:Z

    if-eqz v0, :cond_1

    .line 142
    sget v0, Lcom/roidapp/cloudlib/ar;->bS:I

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 143
    add-int/lit8 v5, p1, 0x1

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 146
    sget-object v0, Lcom/roidapp/cloudlib/sns/login/a;->a:[I

    array-length v0, v0

    if-ge p1, v0, :cond_2

    .line 147
    sget-object v0, Lcom/roidapp/cloudlib/sns/login/a;->a:[I

    aget v0, v0, p1

    invoke-virtual {v1, v10, v10, v0, v10}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 151
    :cond_1
    :goto_0
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    invoke-static {v4}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v0

    .line 152
    iget-object v1, v4, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Lcom/roidapp/cloudlib/sns/b/c;)Lcom/roidapp/cloudlib/sns/b/c;

    move-result-object v0

    .line 154
    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_3

    .line 155
    invoke-virtual {v3, v11}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 156
    sget v1, Lcom/roidapp/cloudlib/at;->P:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    .line 157
    iget v1, p0, Lcom/roidapp/cloudlib/sns/login/a;->d:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 158
    sget v1, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 170
    :goto_1
    iget-wide v6, v4, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v8, p0, Lcom/roidapp/cloudlib/sns/login/a;->c:J

    cmp-long v1, v6, v8

    if-nez v1, :cond_5

    .line 171
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    :goto_2
    new-instance v1, Lcom/roidapp/baselib/c/x;

    invoke-direct {v1, v4, v0}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 174
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    sget v0, Lcom/roidapp/cloudlib/ar;->cp:I

    invoke-virtual {p2, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 177
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    return-object p2

    .line 148
    :cond_2
    invoke-virtual {v1, v10, v10, v10, v10}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    goto :goto_0

    .line 159
    :cond_3
    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_4

    .line 160
    invoke-virtual {v3, v11}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 161
    sget v1, Lcom/roidapp/cloudlib/at;->N:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    .line 162
    const-string v1, "#ffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 163
    sget v1, Lcom/roidapp/cloudlib/aq;->k:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_1

    .line 165
    :cond_4
    invoke-virtual {v3, v10}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 166
    const-string v1, ""

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    sget v1, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_1

    .line 172
    :cond_5
    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 12

    .prologue
    const-wide/16 v10, 0x1

    const/4 v8, 0x0

    const/4 v6, 0x1

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    if-nez v0, :cond_1

    .line 241
    :cond_0
    :goto_0
    return-void

    .line 188
    :cond_1
    iput-boolean v6, p0, Lcom/roidapp/cloudlib/sns/login/a;->i:Z

    .line 190
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->g:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 191
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->h:I

    if-ne v0, v1, :cond_3

    .line 192
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "SNS/%s/UserCenter/Click"

    new-array v4, v6, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/login/a;->g:Ljava/lang/String;

    aput-object v5, v4, v8

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v5, "SNS/%s/UserCenter/Click"

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/roidapp/cloudlib/sns/login/a;->g:Ljava/lang/String;

    aput-object v7, v6, v8

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 199
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/main/b;

    if-eqz v0, :cond_5

    .line 200
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 201
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    check-cast v0, Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/login/b;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/login/b;-><init>(Lcom/roidapp/cloudlib/sns/login/a;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/login/a;->h:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Lcom/roidapp/cloudlib/sns/aj;Ljava/lang/String;)V

    goto :goto_0

    .line 194
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->bf:I

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->aT:I

    if-ne v0, v1, :cond_2

    .line 195
    :cond_4
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    const-string v0, "SNS"

    const-string v1, "click"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v3, "SNS/%s/Follow/Click"

    new-array v4, v6, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/login/a;->g:Ljava/lang/String;

    aput-object v5, v4, v8

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v5, "SNS/%s/Follow/Click"

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/roidapp/cloudlib/sns/login/a;->g:Ljava/lang/String;

    aput-object v7, v6, v8

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_1

    .line 213
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->h:I

    if-ne v0, v1, :cond_8

    .line 215
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 216
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto/16 :goto_0

    .line 220
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/c/x;

    .line 221
    iget-object v1, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lcom/roidapp/cloudlib/sns/b/x;

    .line 222
    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/c;

    .line 223
    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_7

    .line 2272
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_0

    .line 2273
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 2274
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    invoke-virtual {v1, v7, v0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 2275
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, v7, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/login/d;

    invoke-direct {v6, p0, v7, v0}, Lcom/roidapp/cloudlib/sns/login/d;-><init>(Lcom/roidapp/cloudlib/sns/login/a;Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 226
    :cond_7
    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_0

    .line 3244
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_0

    .line 3245
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 3246
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    invoke-virtual {v1, v7, v0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 3247
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, v7, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/login/c;

    invoke-direct {v6, p0, v7, v0}, Lcom/roidapp/cloudlib/sns/login/c;-><init>(Lcom/roidapp/cloudlib/sns/login/a;Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 230
    :cond_8
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->b:Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/login/a;->j:Z

    if-nez v0, :cond_0

    .line 231
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->bf:I

    if-eq v0, v1, :cond_9

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->aT:I

    if-ne v0, v1, :cond_b

    .line 232
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/x;

    .line 233
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->c:Ljava/lang/String;

    :goto_2
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-direct {p0, v2, v3, v1, v0}, Lcom/roidapp/cloudlib/sns/login/a;->a(JLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_a
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    goto :goto_2

    .line 235
    :cond_b
    sget v0, Lcom/roidapp/cloudlib/ar;->cp:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 236
    sget v0, Lcom/roidapp/cloudlib/ar;->cp:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/x;

    .line 237
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->c:Ljava/lang/String;

    :goto_3
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-direct {p0, v2, v3, v1, v0}, Lcom/roidapp/cloudlib/sns/login/a;->a(JLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_c
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    goto :goto_3
.end method
