.class public final Lcom/roidapp/cloudlib/sns/ab;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/view/View;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/EditText;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/ImageView;

.field private h:Lcom/roidapp/cloudlib/sns/ae;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 51
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 53
    sget v1, Lcom/roidapp/cloudlib/as;->ac:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 54
    sget v0, Lcom/roidapp/cloudlib/ar;->b:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/ab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    .line 55
    sget v0, Lcom/roidapp/cloudlib/ar;->ca:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/ab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->b:Landroid/view/View;

    .line 56
    sget v0, Lcom/roidapp/cloudlib/ar;->bt:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/ab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    .line 57
    sget v0, Lcom/roidapp/cloudlib/ar;->bE:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/ab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->d:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/roidapp/cloudlib/ar;->m:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/ab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->g:Landroid/widget/ImageView;

    .line 59
    sget v0, Lcom/roidapp/cloudlib/ar;->bW:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/ab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    .line 60
    sget v0, Lcom/roidapp/cloudlib/ar;->cb:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/ab;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->f:Landroid/view/View;

    .line 61
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    new-instance v1, Lcom/roidapp/cloudlib/sns/ac;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/ac;-><init>(Lcom/roidapp/cloudlib/sns/ab;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->g:Landroid/widget/ImageView;

    new-instance v1, Lcom/roidapp/cloudlib/sns/ad;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/ad;-><init>(Lcom/roidapp/cloudlib/sns/ab;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/ab;)Lcom/roidapp/cloudlib/sns/ae;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->h:Lcom/roidapp/cloudlib/sns/ae;

    return-object v0
.end method

.method private a(Ljava/lang/CharSequence;Z)V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 91
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 94
    :cond_0
    if-eqz p2, :cond_1

    .line 95
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-static {v1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 103
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 116
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 157
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/ab;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 1086
    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;Z)V

    .line 158
    return-void
.end method

.method public final a(Landroid/text/TextWatcher;)V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 142
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 165
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;Z)V

    .line 166
    return-void
.end method

.method public final a(Landroid/view/View$OnClickListener;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/16 v1, 0x8

    .line 169
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 170
    if-eqz p2, :cond_3

    .line 171
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 185
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    :cond_2
    return-void

    .line 178
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_4

    .line 179
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 181
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 182
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/ae;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/ab;->h:Lcom/roidapp/cloudlib/sns/ae;

    .line 48
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 86
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;Z)V

    .line 87
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    .line 127
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 132
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 133
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 136
    :cond_1
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 122
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->g:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->g:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 191
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 193
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->e:Landroid/widget/EditText;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/widget/EditText;)Z

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 161
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/ab;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07003c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;Z)V

    .line 162
    return-void
.end method

.method public final e()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x4

    .line 196
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v2, :cond_1

    .line 200
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 202
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v3, :cond_2

    .line 203
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ab;->c:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 205
    :cond_2
    return-void
.end method
