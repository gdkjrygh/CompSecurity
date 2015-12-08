.class public final Lcom/roidapp/photogrid/cloud/t;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field public a:Landroid/widget/ListView;

.field public b:Z

.field c:[Ljava/lang/String;

.field d:[Ljava/lang/String;

.field e:[Ljava/lang/Integer;

.field private f:Landroid/content/Context;

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private h:Z

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/cloudlib/ak;",
            ">;"
        }
    .end annotation
.end field

.field private l:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 94
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 53
    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->i:Z

    .line 55
    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->b:Z

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    .line 61
    new-instance v0, Lcom/roidapp/photogrid/cloud/u;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/u;-><init>(Lcom/roidapp/photogrid/cloud/t;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->l:Landroid/os/Handler;

    .line 95
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/t;->f:Landroid/content/Context;

    .line 96
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->j:Ljava/lang/String;

    .line 97
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    .line 98
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/al;->e()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    .line 99
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/ListView;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Integer;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 102
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 53
    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->i:Z

    .line 55
    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->b:Z

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    .line 61
    new-instance v0, Lcom/roidapp/photogrid/cloud/u;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/u;-><init>(Lcom/roidapp/photogrid/cloud/t;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->l:Landroid/os/Handler;

    .line 103
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/t;->f:Landroid/content/Context;

    .line 104
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/t;->a:Landroid/widget/ListView;

    .line 105
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/t;->c:[Ljava/lang/String;

    .line 106
    iput-object p4, p0, Lcom/roidapp/photogrid/cloud/t;->d:[Ljava/lang/String;

    .line 107
    iput-object p5, p0, Lcom/roidapp/photogrid/cloud/t;->e:[Ljava/lang/Integer;

    .line 108
    iput-object p6, p0, Lcom/roidapp/photogrid/cloud/t;->g:Ljava/util/HashMap;

    .line 109
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->j:Ljava/lang/String;

    .line 110
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/al;->e()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;Ljava/util/HashMap;B)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/ListView;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Integer;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;B)V"
        }
    .end annotation

    .prologue
    .line 115
    invoke-direct/range {p0 .. p6}, Lcom/roidapp/photogrid/cloud/t;-><init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;Ljava/util/HashMap;)V

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    .line 117
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/t;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/t;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 248
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->f:Landroid/content/Context;

    const v1, 0x7f07028d

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 273
    :goto_0
    return-void

    .line 252
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/cloud/v;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/cloud/v;-><init>(Lcom/roidapp/photogrid/cloud/t;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/v;->start()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/t;)Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->i:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/t;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->g:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/t;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->l:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final getCount()I
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->c:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->d:[Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->j:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->b:Z

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 131
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-eqz v1, :cond_1

    .line 135
    :cond_0
    :goto_0
    return v0

    .line 131
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 133
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/t;->b:Z

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 135
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 144
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 152
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const v6, 0x7f0701a2

    const v4, 0x7f02044c

    const/4 v5, 0x0

    .line 161
    if-nez p2, :cond_0

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300d7

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 168
    :cond_0
    const v0, 0x7f0d0386

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 169
    const v1, 0x7f0d0387

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 170
    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    const v2, 0x7f0d0385

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 172
    iget-boolean v3, p0, Lcom/roidapp/photogrid/cloud/t;->b:Z

    if-eqz v3, :cond_7

    .line 173
    iget-boolean v3, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-eqz v3, :cond_1

    if-eqz p1, :cond_2

    :cond_1
    iget-boolean v3, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-nez v3, :cond_4

    const/4 v3, 0x1

    if-ne p1, v3, :cond_4

    .line 175
    :cond_2
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1233
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/t;->c:[Ljava/lang/String;

    aget-object v3, v3, v5

    .line 1234
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 1235
    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    .line 1236
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 176
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1240
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1241
    const-string v3, "("

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1242
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/t;->e:[Ljava/lang/Integer;

    aget-object v3, v3, v5

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1243
    const-string v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1244
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 177
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/t;->d:[Ljava/lang/String;

    aget-object v0, v0, v5

    .line 179
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 180
    const v1, 0x7f020225

    invoke-static {v2, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 181
    const-string v1, "cloudfolder_download"

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 182
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/t;->i:Z

    if-nez v1, :cond_3

    .line 183
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/t;->a(Ljava/lang/String;)V

    .line 219
    :cond_3
    :goto_0
    return-object p2

    .line 185
    :cond_4
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-nez v1, :cond_5

    if-nez p1, :cond_5

    .line 187
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/t;->f:Landroid/content/Context;

    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    invoke-static {v2, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 189
    const-string v0, "cloudfolder_local"

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 191
    :cond_5
    add-int/lit8 v1, p1, -0x1

    .line 192
    iget-boolean v3, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-nez v3, :cond_6

    .line 193
    add-int/lit8 v1, p1, -0x2

    .line 194
    :cond_6
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/ak;

    .line 195
    iget-object v3, v1, Lcom/roidapp/cloudlib/ak;->e:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2223
    iget v0, v1, Lcom/roidapp/cloudlib/ak;->c:I

    .line 196
    invoke-static {v2, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 197
    iget-object v0, v1, Lcom/roidapp/cloudlib/ak;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 200
    :cond_7
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-nez v1, :cond_8

    if-nez p1, :cond_8

    .line 202
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/t;->f:Landroid/content/Context;

    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    invoke-static {v2, v4}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 204
    const-string v0, "cloudfolder_local"

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 205
    :cond_8
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/t;->h:Z

    if-eqz v1, :cond_9

    .line 207
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/ak;

    .line 208
    iget-object v3, v1, Lcom/roidapp/cloudlib/ak;->e:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3223
    iget v0, v1, Lcom/roidapp/cloudlib/ak;->c:I

    .line 209
    invoke-static {v2, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 210
    iget-object v0, v1, Lcom/roidapp/cloudlib/ak;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 213
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/t;->k:Ljava/util/ArrayList;

    add-int/lit8 v3, p1, -0x1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/ak;

    .line 214
    iget-object v3, v1, Lcom/roidapp/cloudlib/ak;->e:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4223
    iget v0, v1, Lcom/roidapp/cloudlib/ak;->c:I

    .line 215
    invoke-static {v2, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 216
    iget-object v0, v1, Lcom/roidapp/cloudlib/ak;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto/16 :goto_0
.end method
