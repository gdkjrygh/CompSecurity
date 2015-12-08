.class public final Lcom/roidapp/photogrid/release/hc;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/content/SharedPreferences;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private a()V
    .locals 10

    .prologue
    const v9, 0x7f0c00bf

    const/16 v8, 0xff

    const v7, 0x7f0c00c0

    const/16 v6, 0x32

    const/4 v5, 0x0

    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02039c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 113
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v2

    .line 114
    if-eqz v2, :cond_1

    instance-of v3, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v3, :cond_1

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v3, :cond_1

    .line 115
    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-eqz v3, :cond_2

    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-eqz v3, :cond_2

    .line 116
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 117
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 118
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 119
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 135
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v5, v0, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v5, v1, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 139
    :cond_1
    return-void

    .line 121
    :cond_2
    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-eqz v3, :cond_3

    .line 122
    invoke-virtual {v0, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 123
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 124
    invoke-virtual {v1, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 125
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 127
    :cond_3
    iget-boolean v2, v2, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-eqz v2, :cond_0

    .line 128
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 129
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 130
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 131
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/hc;)V
    .locals 2

    .prologue
    .line 2079
    const-string v0, "DropText"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2080
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 2081
    if-eqz v0, :cond_2

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v1, :cond_2

    .line 2082
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v1, :cond_1

    .line 2083
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->d(Lcom/roidapp/photogrid/release/ao;)V

    .line 2090
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/hc;->a()V

    .line 22
    return-void

    .line 2085
    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07002c

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/hc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 2087
    :cond_2
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v0, :cond_0

    .line 2088
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702fd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/hc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/hc;)V
    .locals 2

    .prologue
    .line 2096
    const-string v0, "RiseText"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2097
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 2098
    if-eqz v0, :cond_2

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-nez v1, :cond_2

    .line 2099
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v1, :cond_1

    .line 2100
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 2107
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/hc;->a()V

    .line 22
    return-void

    .line 2102
    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07002d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/hc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 2104
    :cond_2
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v0, :cond_0

    .line 2105
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702fd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/hc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/hc;)V
    .locals 11

    .prologue
    const v10, 0x7f0c00bf

    const/16 v9, 0xff

    const/16 v8, 0x32

    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 22
    .line 2144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02039c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2145
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02039e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 2146
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v2

    .line 2147
    if-eqz v2, :cond_2

    instance-of v3, v2, Lcom/roidapp/photogrid/release/ra;

    if-eqz v3, :cond_2

    .line 2148
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/PhotoView;->c(Lcom/roidapp/photogrid/release/ao;)V

    .line 2149
    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v3, :cond_3

    .line 2150
    const-string v3, "UnlockText"

    invoke-static {v3}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2151
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    const v4, 0x7f0203b4

    invoke-virtual {v3, v6, v4, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 2152
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0701a4

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2153
    iput-boolean v6, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 2154
    iget-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v3, :cond_0

    .line 2155
    invoke-virtual {v0, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2156
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2158
    :cond_0
    iget-boolean v2, v2, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v2, :cond_1

    .line 2159
    invoke-virtual {v1, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2160
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2173
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v7, v0, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2174
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v7, v1, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 22
    :cond_2
    return-void

    .line 2164
    :cond_3
    const-string v3, "LockText"

    invoke-static {v3}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2165
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    const v4, 0x7f020413

    invoke-virtual {v3, v6, v4, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 2166
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0702fc

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2167
    const/4 v3, 0x1

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/ao;->x:Z

    .line 2168
    invoke-virtual {v0, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2169
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2170
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2171
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method


# virtual methods
.method public final onAttach(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 31
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 32
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hc;->b:Landroid/content/SharedPreferences;

    .line 33
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 34
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .prologue
    const v10, 0x7f0c00bf

    const/16 v9, 0xff

    const/16 v8, 0x32

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 37
    const v0, 0x7f0300c0

    invoke-virtual {p1, v0, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 38
    new-instance v0, Lcom/roidapp/photogrid/release/hd;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/hd;-><init>(Lcom/roidapp/photogrid/release/hc;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    const v0, 0x7f0d0317

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    new-instance v2, Lcom/roidapp/photogrid/release/he;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/he;-><init>(Lcom/roidapp/photogrid/release/hc;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    const v0, 0x7f0d0318

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    .line 55
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    new-instance v2, Lcom/roidapp/photogrid/release/hf;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hf;-><init>(Lcom/roidapp/photogrid/release/hc;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    const v0, 0x7f0d0319

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    new-instance v2, Lcom/roidapp/photogrid/release/hg;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hg;-><init>(Lcom/roidapp/photogrid/release/hc;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f02039c

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1182
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f02039e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1183
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v3

    .line 1184
    if-eqz v3, :cond_1

    instance-of v4, v3, Lcom/roidapp/photogrid/release/ra;

    if-eqz v4, :cond_1

    .line 1185
    iget-boolean v4, v3, Lcom/roidapp/photogrid/release/ao;->x:Z

    if-eqz v4, :cond_2

    .line 1186
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    const v4, 0x7f020413

    invoke-virtual {v3, v6, v4, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 1187
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0702fc

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1188
    invoke-virtual {v0, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1189
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00c0

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1190
    invoke-virtual {v2, v8}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1191
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00c0

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1204
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    invoke-virtual {v3, v7, v0, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1205
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v7, v2, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 72
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/hc;->a()V

    .line 73
    return-object v1

    .line 1193
    :cond_2
    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    const v5, 0x7f0203b4

    invoke-virtual {v4, v6, v5, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 1194
    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->e:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0701a4

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1195
    iget-boolean v4, v3, Lcom/roidapp/photogrid/release/ao;->z:Z

    if-nez v4, :cond_3

    .line 1196
    invoke-virtual {v0, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1197
    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->c:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1199
    :cond_3
    iget-boolean v3, v3, Lcom/roidapp/photogrid/release/ao;->y:Z

    if-nez v3, :cond_0

    .line 1200
    invoke-virtual {v2, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1201
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hc;->d:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hc;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method
