.class public Lcom/roidapp/imagelib/filter/ImageColorView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/ImageButton;

.field private b:Landroid/widget/ImageButton;

.field private c:Landroid/widget/ImageButton;

.field private d:Landroid/widget/ImageButton;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Lcom/roidapp/imagelib/filter/bk;

.field private j:Landroid/widget/TextView;

.field private k:Lcom/roidapp/imagelib/filter/ag;

.field private l:Landroid/content/Context;

.field private m:Lcom/roidapp/imagelib/filter/ah;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .prologue
    .line 74
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 75
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->l:Landroid/content/Context;

    .line 76
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 77
    sget v1, Lcom/roidapp/imagelib/h;->d:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 79
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a()V

    .line 1119
    sget v0, Lcom/roidapp/imagelib/g;->J:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->a:Landroid/widget/ImageButton;

    .line 1120
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->a:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1122
    sget v0, Lcom/roidapp/imagelib/g;->F:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->b:Landroid/widget/ImageButton;

    .line 1123
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->b:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1125
    sget v0, Lcom/roidapp/imagelib/g;->L:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->c:Landroid/widget/ImageButton;

    .line 1126
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->c:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1128
    sget v0, Lcom/roidapp/imagelib/g;->H:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->d:Landroid/widget/ImageButton;

    .line 1129
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1131
    sget v0, Lcom/roidapp/imagelib/g;->K:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 1132
    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1134
    sget v0, Lcom/roidapp/imagelib/g;->aM:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->j:Landroid/widget/TextView;

    .line 1136
    new-instance v0, Lcom/roidapp/imagelib/filter/bk;

    const/16 v2, -0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->l:Landroid/content/Context;

    invoke-direct {v0, v2, v3, v4}, Lcom/roidapp/imagelib/filter/bk;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    .line 1138
    sget v0, Lcom/roidapp/imagelib/g;->aO:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 1139
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1143
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ai;)V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 85
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/ImageColorView;I)I
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->e:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ag;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    const/16 v1, 0x64

    .line 91
    const/16 v0, 0x96

    iput v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->e:I

    .line 92
    iput v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->f:I

    .line 93
    iput v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->g:I

    .line 94
    const/16 v0, 0xb4

    iput v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->h:I

    .line 95
    return-void
.end method

.method private a(Lcom/roidapp/imagelib/filter/ai;)V
    .locals 5

    .prologue
    const/16 v4, 0x64

    const/16 v3, -0x64

    .line 241
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bk;->setTag(Ljava/lang/Object;)V

    .line 242
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->a:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/f;->m:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 243
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->b:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/f;->m:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 244
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->c:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/f;->m:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 245
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->d:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/f;->m:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 247
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 248
    const/4 v0, 0x0

    .line 249
    sget-object v1, Lcom/roidapp/imagelib/filter/af;->a:[I

    invoke-virtual {p1}, Lcom/roidapp/imagelib/filter/ai;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 276
    :goto_0
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;)V

    .line 277
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b()Lcom/roidapp/imagelib/filter/bn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 278
    return-void

    .line 252
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->a:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 253
    iget v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->e:I

    add-int/lit16 v0, v0, -0x96

    .line 254
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    const/16 v2, -0x96

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x96

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 258
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->b:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 259
    iget v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->f:I

    add-int/lit8 v0, v0, -0x64

    .line 260
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 264
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->c:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 265
    iget v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->g:I

    add-int/lit8 v0, v0, -0x64

    .line 266
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 270
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->d:Landroid/widget/ImageButton;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 271
    iget v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->h:I

    add-int/lit16 v0, v0, -0xb4

    .line 272
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    const/16 v2, -0xb4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_0

    .line 249
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic b(Lcom/roidapp/imagelib/filter/ImageColorView;I)I
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->f:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/imagelib/filter/ImageColorView;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->j:Landroid/widget/TextView;

    return-object v0
.end method

.method private b()Lcom/roidapp/imagelib/filter/bn;
    .locals 1

    .prologue
    .line 147
    new-instance v0, Lcom/roidapp/imagelib/filter/ae;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/filter/ae;-><init>(Lcom/roidapp/imagelib/filter/ImageColorView;)V

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/filter/ImageColorView;I)I
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->g:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/imagelib/filter/ImageColorView;)Lcom/roidapp/imagelib/filter/ah;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->m:Lcom/roidapp/imagelib/filter/ah;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/filter/ImageColorView;I)I
    .locals 0

    .prologue
    .line 21
    iput p1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->h:I

    return p1
.end method


# virtual methods
.method public final a(Landroid/support/v4/app/Fragment;)V
    .locals 3

    .prologue
    .line 110
    instance-of v0, p1, Lcom/roidapp/imagelib/filter/ag;

    if-eqz v0, :cond_0

    .line 111
    check-cast p1, Lcom/roidapp/imagelib/filter/ag;

    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    return-void

    .line 113
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet ImageFilterColorFragment.OnFilterColorListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Lcom/roidapp/imagelib/b/b;I)V
    .locals 1

    .prologue
    .line 99
    if-eqz p1, :cond_0

    .line 100
    invoke-virtual {p1}, Lcom/roidapp/imagelib/b/b;->c()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->e:I

    .line 2092
    iget v0, p1, Lcom/roidapp/imagelib/b/b;->b:I

    add-int/lit8 v0, v0, 0x64

    .line 101
    iput v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->f:I

    .line 2103
    iget v0, p1, Lcom/roidapp/imagelib/b/b;->c:I

    add-int/lit8 v0, v0, 0x64

    .line 102
    iput v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->g:I

    .line 103
    invoke-virtual {p1}, Lcom/roidapp/imagelib/b/b;->d()I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->h:I

    .line 105
    invoke-static {p2}, Lcom/roidapp/imagelib/filter/ai;->a(I)Lcom/roidapp/imagelib/filter/ai;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ai;)V

    .line 107
    :cond_0
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/ah;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->m:Lcom/roidapp/imagelib/filter/ah;

    .line 202
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 207
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 208
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/ag;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 237
    :cond_0
    :goto_0
    return-void

    .line 211
    :cond_1
    sget v1, Lcom/roidapp/imagelib/g;->J:I

    if-ne v0, v1, :cond_2

    .line 212
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 213
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ai;)V

    .line 214
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b()Lcom/roidapp/imagelib/filter/bn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 215
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->a(Lcom/roidapp/imagelib/filter/ai;)V

    goto :goto_0

    .line 216
    :cond_2
    sget v1, Lcom/roidapp/imagelib/g;->F:I

    if-ne v0, v1, :cond_3

    .line 217
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 218
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->b:Lcom/roidapp/imagelib/filter/ai;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ai;)V

    .line 219
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b()Lcom/roidapp/imagelib/filter/bn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 220
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->b:Lcom/roidapp/imagelib/filter/ai;

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->a(Lcom/roidapp/imagelib/filter/ai;)V

    goto :goto_0

    .line 221
    :cond_3
    sget v1, Lcom/roidapp/imagelib/g;->L:I

    if-ne v0, v1, :cond_4

    .line 222
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 223
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->c:Lcom/roidapp/imagelib/filter/ai;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ai;)V

    .line 224
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b()Lcom/roidapp/imagelib/filter/bn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 225
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->c:Lcom/roidapp/imagelib/filter/ai;

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->a(Lcom/roidapp/imagelib/filter/ai;)V

    goto :goto_0

    .line 226
    :cond_4
    sget v1, Lcom/roidapp/imagelib/g;->H:I

    if-ne v0, v1, :cond_5

    .line 227
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 228
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->d:Lcom/roidapp/imagelib/filter/ai;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/filter/ai;)V

    .line 229
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b()Lcom/roidapp/imagelib/filter/bn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 230
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->d:Lcom/roidapp/imagelib/filter/ai;

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/ag;->a(Lcom/roidapp/imagelib/filter/ai;)V

    goto :goto_0

    .line 231
    :cond_5
    sget v1, Lcom/roidapp/imagelib/g;->K:I

    if-ne v0, v1, :cond_0

    .line 232
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    .line 2285
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bk;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ai;

    .line 2286
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a()V

    .line 2287
    sget-object v1, Lcom/roidapp/imagelib/filter/af;->a:[I

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ai;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 2302
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->k:Lcom/roidapp/imagelib/filter/ag;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/ag;->d()V

    .line 234
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->b()Lcom/roidapp/imagelib/filter/bn;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Lcom/roidapp/imagelib/filter/bn;)V

    goto/16 :goto_0

    .line 2289
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    iget v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->e:I

    add-int/lit16 v1, v1, -0x96

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;)V

    goto :goto_1

    .line 2292
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    iget v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->f:I

    add-int/lit8 v1, v1, -0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;)V

    goto :goto_1

    .line 2295
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    iget v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->g:I

    add-int/lit8 v1, v1, -0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;)V

    goto :goto_1

    .line 2298
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->i:Lcom/roidapp/imagelib/filter/bk;

    iget v1, p0, Lcom/roidapp/imagelib/filter/ImageColorView;->h:I

    add-int/lit16 v1, v1, -0xb4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bk;->a(Ljava/lang/Integer;)V

    goto :goto_1

    .line 2287
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
