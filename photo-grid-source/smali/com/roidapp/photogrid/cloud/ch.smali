.class public final Lcom/roidapp/photogrid/cloud/ch;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Lcom/roidapp/cloudlib/sns/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/f;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/roidapp/baselib/view/FlowLayout;

.field private c:Lcom/roidapp/baselib/view/FlowLayout;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/ProgressBar;

.field private h:Landroid/widget/RelativeLayout;

.field private i:F

.field private j:I

.field private k:Lcom/roidapp/photogrid/cloud/cm;

.field private l:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 65
    new-instance v0, Lcom/roidapp/photogrid/cloud/ci;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/ci;-><init>(Lcom/roidapp/photogrid/cloud/ch;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->a:Lcom/roidapp/cloudlib/sns/w;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/ch;Ljava/lang/String;)Landroid/view/View;
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/cloud/ch;->a(Ljava/lang/String;I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;I)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, -0x2

    const/high16 v3, 0x41800000    # 16.0f

    .line 227
    new-instance v0, Landroid/widget/CheckBox;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 228
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTag(Ljava/lang/Object;)V

    .line 229
    new-instance v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    iget v2, p0, Lcom/roidapp/photogrid/cloud/ch;->i:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->rightMargin:I

    .line 231
    iget v2, p0, Lcom/roidapp/photogrid/cloud/ch;->i:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    .line 232
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 233
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/ch;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 234
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 235
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 240
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 241
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090009

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v5, v1}, Landroid/widget/CheckBox;->setTextSize(IF)V

    .line 243
    const v1, 0x7f0205d0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    .line 244
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 245
    new-instance v1, Lcom/roidapp/photogrid/cloud/cj;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/cloud/cj;-><init>(Lcom/roidapp/photogrid/cloud/ch;Landroid/widget/CheckBox;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 265
    return-object v0

    .line 237
    :cond_0
    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 238
    iget v1, p0, Lcom/roidapp/photogrid/cloud/ch;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setTextColor(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/ch;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 40
    .line 3127
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3128
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->g:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 3129
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->b:Lcom/roidapp/baselib/view/FlowLayout;

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/view/FlowLayout;->setVisibility(I)V

    .line 40
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/ch;Ljava/util/List;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/16 v7, 0x8

    .line 3182
    if-eqz p1, :cond_3

    .line 3184
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FlowLayout;->removeAllViews()V

    .line 3185
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3186
    const-string v1, "history_tag"

    const-string v3, ""

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3187
    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 3188
    array-length v0, v4

    if-lez v0, :cond_2

    move v1, v2

    .line 3189
    :goto_0
    array-length v0, v4

    if-ge v1, v0, :cond_2

    .line 3191
    aget-object v0, v4, v1

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    move v3, v2

    .line 3193
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 3194
    aget-object v5, v4, v1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v0, "#"

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3195
    const/4 v0, 0x1

    .line 3199
    :goto_2
    if-nez v0, :cond_0

    .line 3200
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    aget-object v3, v4, v1

    const/4 v5, 0x2

    invoke-direct {p0, v3, v5}, Lcom/roidapp/photogrid/cloud/ch;->a(Ljava/lang/String;I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/view/FlowLayout;->addView(Landroid/view/View;)V

    .line 3189
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 3193
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 3205
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FlowLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_3

    .line 3206
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3207
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    invoke-virtual {v0, v7}, Lcom/roidapp/baselib/view/FlowLayout;->setVisibility(I)V

    .line 3208
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3209
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->f:Landroid/view/View;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 40
    :cond_3
    return-void

    :cond_4
    move v0, v2

    goto :goto_2
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->k:Lcom/roidapp/photogrid/cloud/cm;

    if-nez v0, :cond_1

    .line 223
    :cond_0
    :goto_0
    return v2

    .line 216
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->k:Lcom/roidapp/photogrid/cloud/cm;

    invoke-interface {v0}, Lcom/roidapp/photogrid/cloud/cm;->a()Ljava/util/ArrayList;

    move-result-object v3

    .line 217
    if-eqz v3, :cond_0

    move v1, v2

    .line 219
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 220
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 221
    const/4 v2, 0x1

    goto :goto_0

    .line 219
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/baselib/view/FlowLayout;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->b:Lcom/roidapp/baselib/view/FlowLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/photogrid/cloud/cm;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->k:Lcom/roidapp/photogrid/cloud/cm;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/ch;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->g:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/ch;)I
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lcom/roidapp/photogrid/cloud/ch;->j:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/ch;)Lcom/roidapp/baselib/view/FlowLayout;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 119
    iput p1, p0, Lcom/roidapp/photogrid/cloud/ch;->l:I

    .line 120
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/cloud/cm;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ch;->k:Lcom/roidapp/photogrid/cloud/cm;

    .line 124
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/16 v2, 0x8

    .line 270
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 271
    const v1, 0x7f0d02f8

    if-ne v0, v1, :cond_1

    .line 1286
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1289
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 1290
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1291
    const v2, 0x7f0700bf

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f07035d

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f070392

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/roidapp/photogrid/cloud/cl;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/cloud/cl;-><init>(Lcom/roidapp/photogrid/cloud/ch;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f070034

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/cloud/ck;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/ck;-><init>(Lcom/roidapp/photogrid/cloud/ch;)V

    invoke-virtual {v1, v0, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 282
    :cond_0
    :goto_0
    return-void

    .line 273
    :cond_1
    const v1, 0x7f0d02f4

    if-ne v0, v1, :cond_0

    .line 274
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 275
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    .line 2133
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 2134
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->g:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2135
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->b:Lcom/roidapp/baselib/view/FlowLayout;

    invoke-virtual {v0, v2}, Lcom/roidapp/baselib/view/FlowLayout;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/q;->d(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 279
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/16 v5, 0x8

    .line 109
    const v0, 0x7f0300bb

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 110
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 111
    iget v3, p0, Lcom/roidapp/photogrid/cloud/ch;->l:I

    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 112
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1139
    const v0, 0x7f0d02f2

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->g:Landroid/widget/ProgressBar;

    .line 1140
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->g:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1142
    const v0, 0x7f0d02f3

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FlowLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->b:Lcom/roidapp/baselib/view/FlowLayout;

    .line 1144
    const v0, 0x7f0d02f4

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->h:Landroid/widget/RelativeLayout;

    .line 1145
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1147
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->a:Lcom/roidapp/cloudlib/sns/w;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/q;->d(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 1148
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 1150
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/roidapp/photogrid/cloud/ch;->i:F

    .line 1151
    const-string v0, "#253034"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/ch;->j:I

    .line 1157
    const v0, 0x7f0d02f7

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FlowLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    .line 1158
    const v0, 0x7f0d02f6

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->e:Landroid/widget/TextView;

    .line 1159
    const v0, 0x7f0d02f8

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->d:Landroid/widget/TextView;

    .line 1160
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1161
    const v0, 0x7f0d02f5

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->f:Landroid/view/View;

    .line 1163
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/ch;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1164
    const-string v3, "history_tag"

    const-string v4, ""

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1165
    const-string v3, ","

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 1166
    array-length v0, v3

    if-lez v0, :cond_1

    move v0, v1

    .line 1167
    :goto_0
    array-length v1, v3

    if-ge v0, v1, :cond_2

    .line 1168
    aget-object v1, v3, v0

    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1170
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    aget-object v4, v3, v0

    const/4 v5, 0x2

    invoke-direct {p0, v4, v5}, Lcom/roidapp/photogrid/cloud/ch;->a(Ljava/lang/String;I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/roidapp/baselib/view/FlowLayout;->addView(Landroid/view/View;)V

    .line 1167
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1173
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1174
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->c:Lcom/roidapp/baselib/view/FlowLayout;

    invoke-virtual {v0, v5}, Lcom/roidapp/baselib/view/FlowLayout;->setVisibility(I)V

    .line 1175
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1176
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ch;->f:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 115
    :cond_2
    return-object v2
.end method
