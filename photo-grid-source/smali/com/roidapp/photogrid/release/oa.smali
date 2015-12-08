.class public final Lcom/roidapp/photogrid/release/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/PopupWindow;

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:Landroid/view/View;

.field private e:[Ljava/lang/String;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:[I

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->l:Z

    .line 50
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->m:Z

    .line 52
    const/16 v0, 0x2d0

    iput v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    .line 62
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    .line 63
    iput-object p2, p0, Lcom/roidapp/photogrid/release/oa;->d:Landroid/view/View;

    .line 64
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->c:Z

    .line 65
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oa;->c()V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;ZZIZ)V
    .locals 7

    .prologue
    const/4 v6, 0x7

    const/4 v5, 0x6

    const/16 v4, 0x2d0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/oa;->l:Z

    .line 50
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/oa;->m:Z

    .line 52
    iput v4, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    .line 91
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    .line 92
    iput-object p2, p0, Lcom/roidapp/photogrid/release/oa;->d:Landroid/view/View;

    .line 93
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/oa;->c:Z

    .line 94
    iput-boolean p3, p0, Lcom/roidapp/photogrid/release/oa;->i:Z

    .line 95
    iput-boolean p4, p0, Lcom/roidapp/photogrid/release/oa;->k:Z

    .line 96
    iput p5, p0, Lcom/roidapp/photogrid/release/oa;->n:I

    .line 99
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_2

    .line 100
    const/16 v0, 0x438

    if-lt p5, v0, :cond_1

    .line 101
    const/16 v0, 0x5a0

    if-ge p5, v0, :cond_0

    .line 102
    new-array v0, v5, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    .line 103
    const/16 v0, 0x780

    iput v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    .line 131
    :goto_0
    iput-boolean p6, p0, Lcom/roidapp/photogrid/release/oa;->j:Z

    .line 132
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oa;->c()V

    .line 133
    return-void

    .line 105
    :cond_0
    new-array v0, v6, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    .line 106
    const/16 v0, 0xa00

    iput v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    goto :goto_0

    .line 109
    :cond_1
    invoke-static {p1}, Lcom/roidapp/photogrid/release/hw;->be(Landroid/content/Context;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    .line 110
    iput v4, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    goto :goto_0

    .line 112
    :cond_2
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v0, :cond_3

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_6

    .line 114
    :cond_3
    const/16 v0, 0x438

    if-lt p5, v0, :cond_5

    .line 115
    const/16 v0, 0x5a0

    if-ge p5, v0, :cond_4

    .line 116
    new-array v0, v5, [I

    fill-array-data v0, :array_2

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    .line 117
    const/16 v0, 0x780

    iput v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    goto :goto_0

    .line 119
    :cond_4
    new-array v0, v6, [I

    fill-array-data v0, :array_3

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    .line 120
    const/16 v0, 0xa00

    iput v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    goto :goto_0

    .line 123
    :cond_5
    invoke-static {p1}, Lcom/roidapp/photogrid/release/hw;->bd(Landroid/content/Context;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    .line 124
    iput v4, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    goto :goto_0

    .line 127
    :cond_6
    new-array v0, v3, [I

    const/16 v1, 0x1e0

    aput v1, v0, v2

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    .line 128
    const/16 v0, 0x1e0

    iput v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    .line 129
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/oa;->l:Z

    goto :goto_0

    .line 102
    nop

    :array_0
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 105
    :array_1
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
        0xa00
    .end array-data

    .line 116
    :array_2
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
    .end array-data

    .line 119
    :array_3
    .array-data 4
        0x2d0
        0x400
        0x438
        0x67c
        0x780
        0x800
        0xa00
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/TextView;Landroid/view/View;Z)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->l:Z

    .line 50
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->m:Z

    .line 52
    const/16 v0, 0x2d0

    iput v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    .line 76
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    .line 77
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->m:Z

    .line 78
    iput-object p2, p0, Lcom/roidapp/photogrid/release/oa;->g:Landroid/widget/TextView;

    .line 79
    iput-object p3, p0, Lcom/roidapp/photogrid/release/oa;->d:Landroid/view/View;

    .line 80
    iput-boolean p4, p0, Lcom/roidapp/photogrid/release/oa;->i:Z

    .line 81
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oa;->c()V

    .line 82
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/oa;)Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->c:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/oa;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method private c()V
    .locals 9

    .prologue
    const v7, 0x7f070312

    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 138
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->c:Z

    if-eqz v0, :cond_2

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->d:Landroid/view/View;

    const v4, 0x7f0d04aa

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    .line 140
    new-array v0, v3, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    const-string v3, ".JPG"

    aput-object v3, v0, v1

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    const-string v3, ".PNG"

    aput-object v3, v0, v2

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    :cond_0
    :goto_0
    return-void

    .line 147
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 149
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->m:Z

    if-eqz v0, :cond_c

    .line 150
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->d:Landroid/view/View;

    const v5, 0x7f0d04a6

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    .line 151
    invoke-static {}, Lcom/a/c/d;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 152
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070315

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v1

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v2

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070314

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v3

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070313

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v4

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 159
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 160
    const-string v0, "medium"

    move v8, v1

    move-object v1, v0

    move v0, v8

    .line 171
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    aget-object v0, v3, v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 175
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oa;->g:Landroid/widget/TextView;

    const-string v0, "smart"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07024d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 162
    :cond_3
    const-string v5, "smart"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v8, v1

    move-object v1, v0

    move v0, v8

    .line 163
    goto :goto_1

    .line 164
    :cond_4
    const-string v1, "high"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    move-object v1, v0

    move v0, v2

    .line 165
    goto :goto_1

    .line 166
    :cond_5
    const-string v1, "medium"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v1, v0

    move v0, v3

    .line 167
    goto :goto_1

    :cond_6
    move-object v1, v0

    move v0, v4

    .line 169
    goto :goto_1

    .line 175
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07024c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 179
    :cond_8
    new-array v0, v4, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    .line 180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v1

    .line 181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070314

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v2

    .line 182
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070313

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 184
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    const-string v1, "Medium"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 189
    :cond_9
    const-string v0, "high"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    aget-object v0, v0, v1

    .line 195
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 191
    :cond_a
    const-string v0, "medium"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    aget-object v0, v0, v2

    goto :goto_3

    .line 194
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->e:[Ljava/lang/String;

    aget-object v0, v0, v3

    goto :goto_3

    .line 200
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->d:Landroid/view/View;

    const v3, 0x7f0d04a6

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    .line 201
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->k:Z

    if-eqz v0, :cond_d

    .line 202
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    aget v0, v0, v3

    .line 203
    iget-object v3, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "P"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    iget-object v3, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v3, v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;I)V

    .line 205
    iget-object v3, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    const v5, 0x7f070289

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, "P"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v1

    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 206
    const/16 v2, 0x11

    invoke-virtual {v0, v2, v1, v1}, Landroid/widget/Toast;->setGravity(III)V

    .line 207
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 209
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    .line 210
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v1

    if-ge v0, v1, :cond_e

    .line 211
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "P"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    .line 214
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v0

    .line 215
    if-nez v0, :cond_f

    .line 216
    iget v0, p0, Lcom/roidapp/photogrid/release/oa;->o:I

    .line 217
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;I)V

    .line 219
    :cond_f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->f:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "P"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/oa;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/oa;)Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->m:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/oa;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/oa;)Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->j:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/oa;)Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/oa;->l:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/oa;)[I
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->h:[I

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/4 v6, -0x2

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 519
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    if-nez v0, :cond_1

    .line 1228
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300fb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1229
    const v0, 0x7f0d03f6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 1230
    new-instance v2, Lcom/roidapp/photogrid/release/oh;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    invoke-direct {v2, p0, v3}, Lcom/roidapp/photogrid/release/oh;-><init>(Lcom/roidapp/photogrid/release/oa;Landroid/content/Context;)V

    .line 1231
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1232
    new-instance v2, Lcom/roidapp/photogrid/release/ob;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ob;-><init>(Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1295
    new-instance v2, Lcom/roidapp/photogrid/release/oc;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/oc;-><init>(Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1307
    invoke-virtual {v1, v4}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 1308
    new-instance v0, Lcom/roidapp/photogrid/release/od;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/od;-><init>(Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1323
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, v1, v6, v6, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    .line 1324
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    .line 1326
    :try_start_0
    const-class v0, Landroid/widget/PopupWindow;

    const-string v1, "mAnchor"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 1328
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 1329
    const-class v0, Landroid/widget/PopupWindow;

    const-string v2, "mOnScrollChangedListener"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 1331
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 1332
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 1334
    new-instance v3, Lcom/roidapp/photogrid/release/oe;

    invoke-direct {v3, p0, v1, v0}, Lcom/roidapp/photogrid/release/oe;-><init>(Lcom/roidapp/photogrid/release/oa;Ljava/lang/reflect/Field;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 1349
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1354
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1355
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 1356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 1357
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 1358
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/of;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/of;-><init>(Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1366
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->update()V

    .line 522
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 523
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 532
    :goto_1
    return-void

    .line 1351
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 527
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt v0, v1, :cond_3

    .line 528
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setAttachedInDecor(Z)V

    .line 530
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->a:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oa;->d:Landroid/view/View;

    invoke-virtual {v0, v1, v5, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    goto :goto_1
.end method

.method public final b()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 534
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oa;->b:Landroid/content/Context;

    const-string v1, "DebugMode"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 536
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
