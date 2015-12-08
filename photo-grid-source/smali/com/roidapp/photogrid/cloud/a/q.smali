.class public final Lcom/roidapp/photogrid/cloud/a/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Z

.field public c:Z

.field protected d:Lcom/roidapp/photogrid/release/ParentActivity;

.field protected e:Z

.field protected f:Ljava/lang/String;

.field private g:Lcom/roidapp/photogrid/cloud/a/t;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/cloud/a/l;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/baselib/c/x",
            "<",
            "Lcom/roidapp/photogrid/cloud/a/a;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field private j:Lcom/roidapp/photogrid/cloud/a/u;

.field private k:Lcom/roidapp/photogrid/cloud/a/y;

.field private l:Lcom/roidapp/photogrid/cloud/a/x;

.field private m:Lcom/roidapp/photogrid/cloud/a/n;

.field private n:Lcom/roidapp/photogrid/cloud/a/s;

.field private o:Lcom/roidapp/photogrid/cloud/a/r;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/ParentActivity;ZZZ[Lcom/roidapp/photogrid/cloud/a/l;Landroid/widget/ListView;Ljava/lang/String;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->c:Z

    .line 58
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    .line 69
    iput-object p8, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    .line 1451
    iput-boolean p2, p0, Lcom/roidapp/photogrid/cloud/a/q;->e:Z

    .line 1452
    iput-object p7, p0, Lcom/roidapp/photogrid/cloud/a/q;->f:Ljava/lang/String;

    .line 71
    invoke-direct {p0, p3, p4, p5, p6}, Lcom/roidapp/photogrid/cloud/a/q;->a(ZZ[Lcom/roidapp/photogrid/cloud/a/l;Landroid/widget/ListView;)V

    .line 72
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    return-object v0
.end method

.method private a(ZZ[Lcom/roidapp/photogrid/cloud/a/l;Landroid/widget/ListView;)V
    .locals 14

    .prologue
    .line 75
    if-nez p4, :cond_1

    .line 352
    :cond_0
    :goto_0
    return-void

    .line 78
    :cond_1
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    .line 79
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->c:Z

    .line 80
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 81
    if-eqz v2, :cond_3

    .line 82
    const/4 v1, 0x0

    :goto_1
    array-length v3, v2

    if-ge v1, v3, :cond_2

    .line 83
    aget-object v3, v2, v1

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-eqz v3, :cond_5

    .line 85
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    .line 95
    :cond_2
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/retouch/l;->b()Z

    move-result v1

    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->c:Z

    .line 98
    :cond_3
    if-eqz p1, :cond_6

    const v1, 0x9c47

    move v2, v1

    .line 101
    :goto_2
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    if-eqz v1, :cond_0

    .line 104
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v1

    const-string v3, "ad"

    const-string v4, "nativePos1"

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v4, v5}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v7

    .line 105
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v1}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v1

    const-string v3, "ad"

    const-string v4, "nativePos2"

    const/4 v5, 0x3

    invoke-virtual {v1, v3, v4, v5}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v8

    .line 110
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v3, "lastClickCardID"

    const/4 v4, -0x1

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 111
    const/4 v1, 0x3

    new-array v3, v1, [I

    fill-array-data v3, :array_0

    .line 112
    const/4 v1, -0x1

    if-eq v5, v1, :cond_30

    .line 113
    new-instance v6, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    const/4 v1, 0x0

    move v4, v1

    :goto_3
    const/4 v1, 0x3

    if-ge v4, v1, :cond_9

    aget v9, v3, v4

    .line 115
    if-eq v9, v5, :cond_7

    .line 116
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_4
    :goto_4
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_3

    .line 82
    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 98
    :cond_6
    const v1, 0x9c46

    move v2, v1

    goto :goto_2

    .line 117
    :cond_7
    const/4 v1, 0x1

    if-ne v9, v1, :cond_4

    .line 119
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    if-nez v1, :cond_8

    const/4 v1, 0x1

    :goto_5
    iget-object v10, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v10}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v10

    const-string v11, "weiduoneIsFilter"

    const/4 v12, 0x0

    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    if-eq v1, v10, :cond_4

    .line 120
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 119
    :cond_8
    const/4 v1, 0x0

    goto :goto_5

    .line 123
    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v4, 0x3

    if-eq v1, v4, :cond_c

    .line 124
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v4, v1, [I

    .line 125
    const/4 v1, 0x0

    .line 126
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v3, v1

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 127
    add-int/lit8 v1, v3, 0x1

    aput v9, v4, v3

    move v3, v1

    .line 128
    goto :goto_6

    :cond_a
    move-object v1, v4

    move v3, v5

    .line 132
    :goto_7
    invoke-static {v1}, Lcom/roidapp/baselib/c/n;->a([I)[I

    move-result-object v9

    .line 135
    array-length v4, v9

    const/4 v1, -0x1

    if-ne v3, v1, :cond_d

    const/4 v1, 0x3

    :goto_8
    add-int/2addr v1, v4

    new-array v6, v1, [I

    .line 136
    const/4 v4, 0x0

    .line 137
    const/4 v1, 0x0

    move v13, v4

    move v4, v3

    move v3, v13

    :goto_9
    array-length v5, v6

    if-ge v1, v5, :cond_12

    .line 138
    if-eq v1, v7, :cond_b

    if-ne v1, v8, :cond_e

    .line 139
    :cond_b
    const/4 v5, 0x0

    aput v5, v6, v1

    .line 137
    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 130
    :cond_c
    const/4 v1, -0x1

    move-object v13, v3

    move v3, v1

    move-object v1, v13

    goto :goto_7

    .line 135
    :cond_d
    const/4 v1, 0x4

    goto :goto_8

    .line 140
    :cond_e
    const/4 v5, -0x1

    if-eq v4, v5, :cond_f

    array-length v5, v6

    add-int/lit8 v5, v5, -0x1

    if-ne v1, v5, :cond_f

    .line 142
    aput v4, v6, v1

    .line 143
    const/4 v4, -0x1

    goto :goto_a

    .line 145
    :cond_f
    array-length v5, v6

    add-int/lit8 v5, v5, -0x2

    if-ne v1, v5, :cond_11

    .line 146
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v5}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 147
    const/4 v5, 0x6

    aput v5, v6, v1

    goto :goto_a

    .line 149
    :cond_10
    const/16 v5, 0x8

    aput v5, v6, v1

    goto :goto_a

    .line 154
    :cond_11
    array-length v5, v9

    if-ge v3, v5, :cond_12

    .line 155
    add-int/lit8 v5, v3, 0x1

    aget v3, v9, v3

    aput v3, v6, v1

    move v3, v5

    goto :goto_a

    .line 161
    :cond_12
    const/4 v1, -0x1

    if-ne v4, v1, :cond_13

    array-length v1, v9

    add-int/lit8 v1, v1, -0x1

    if-eq v3, v1, :cond_2f

    .line 163
    :cond_13
    new-instance v5, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    const/4 v1, -0x1

    if-eq v4, v1, :cond_14

    .line 165
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    :cond_14
    :goto_b
    array-length v1, v9

    if-ge v3, v1, :cond_15

    .line 167
    aget v1, v9, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    .line 168
    :cond_15
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    array-length v3, v6

    add-int/2addr v1, v3

    new-array v4, v1, [I

    .line 169
    const/4 v1, 0x0

    const/4 v3, 0x0

    array-length v7, v6

    invoke-static {v6, v1, v4, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 170
    array-length v1, v6

    .line 171
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v3, v1

    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 172
    add-int/lit8 v1, v3, 0x1

    aput v6, v4, v3

    move v3, v1

    .line 173
    goto :goto_c

    :cond_16
    move-object v1, v4

    .line 178
    :goto_d
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v3}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v4

    const-string v5, "ad"

    if-eqz p1, :cond_17

    const-string v3, "firstAheadShare"

    :goto_e
    const/4 v6, 0x1

    invoke-virtual {v4, v5, v3, v6}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    .line 182
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/x;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v6, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    iget-object v7, p0, Lcom/roidapp/photogrid/cloud/a/q;->f:Ljava/lang/String;

    invoke-direct {v3, v5, v6, v7}, Lcom/roidapp/photogrid/cloud/a/x;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/cloud/a/t;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    .line 183
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/cloud/a/x;->f:Z

    if-nez v3, :cond_19

    .line 185
    new-instance v5, Ljava/util/ArrayList;

    array-length v6, v1

    if-nez p3, :cond_18

    const/4 v3, 0x0

    :goto_f
    add-int/2addr v3, v6

    add-int/lit8 v3, v3, 0x1

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    .line 190
    :goto_10
    if-eqz p3, :cond_1b

    .line 191
    move-object/from16 v0, p3

    array-length v5, v0

    const/4 v3, 0x0

    :goto_11
    if-ge v3, v5, :cond_1b

    aget-object v6, p3, v3

    .line 192
    iget-object v7, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 191
    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    .line 178
    :cond_17
    const-string v3, "firstAhead"

    goto :goto_e

    .line 185
    :cond_18
    move-object/from16 v0, p3

    array-length v3, v0

    goto :goto_f

    .line 187
    :cond_19
    new-instance v5, Ljava/util/ArrayList;

    array-length v6, v1

    if-nez p3, :cond_1a

    const/4 v3, 0x0

    :goto_12
    add-int/2addr v3, v6

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    goto :goto_10

    :cond_1a
    move-object/from16 v0, p3

    array-length v3, v0

    goto :goto_12

    .line 194
    :cond_1b
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/s;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/cloud/a/s;-><init>(Lcom/roidapp/photogrid/cloud/a/q;)V

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    .line 196
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/cloud/a/x;->f:Z

    if-nez v3, :cond_1c

    .line 198
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    :cond_1c
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1f

    .line 202
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/n;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v6, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    iget-object v7, p0, Lcom/roidapp/photogrid/cloud/a/q;->f:Ljava/lang/String;

    invoke-direct {v3, v5, v6, v7}, Lcom/roidapp/photogrid/cloud/a/n;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/cloud/a/t;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->m:Lcom/roidapp/photogrid/cloud/a/n;

    .line 203
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->m:Lcom/roidapp/photogrid/cloud/a/n;

    if-eqz v3, :cond_1d

    .line 204
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->m:Lcom/roidapp/photogrid/cloud/a/n;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    :cond_1d
    :goto_13
    const/4 v3, 0x0

    .line 218
    const/4 v6, 0x0

    .line 219
    array-length v8, v1

    const/4 v5, 0x0

    move v7, v6

    move v6, v5

    move v5, v4

    move v4, v3

    :goto_14
    if-ge v6, v8, :cond_2c

    aget v3, v1, v6

    .line 221
    packed-switch v3, :pswitch_data_0

    :cond_1e
    :pswitch_0
    move v3, v4

    .line 313
    :goto_15
    const/4 v4, 0x0

    .line 324
    add-int/lit8 v7, v7, 0x1

    .line 219
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    move v5, v4

    move v4, v3

    goto :goto_14

    .line 208
    :cond_1f
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/o;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v6, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    invoke-direct {v3, v5, v6}, Lcom/roidapp/photogrid/cloud/a/o;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    .line 210
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 223
    :pswitch_1
    if-nez p2, :cond_1e

    .line 225
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/p;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v10, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    iget-boolean v11, p0, Lcom/roidapp/photogrid/cloud/a/q;->b:Z

    iget-boolean v12, p0, Lcom/roidapp/photogrid/cloud/a/q;->c:Z

    invoke-direct {v3, v9, v10, v11, v12}, Lcom/roidapp/photogrid/cloud/a/p;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;ZZ)V

    .line 226
    iget-boolean v9, v3, Lcom/roidapp/photogrid/cloud/a/p;->f:Z

    if-nez v9, :cond_21

    .line 228
    if-eqz v5, :cond_20

    .line 229
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-interface {v5, v9, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v3, v4

    goto :goto_15

    .line 231
    :cond_20
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_21
    move v3, v4

    .line 233
    goto :goto_15

    .line 237
    :pswitch_2
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/y;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v10, p0, Lcom/roidapp/photogrid/cloud/a/q;->f:Ljava/lang/String;

    iget-object v11, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    invoke-direct {v3, v9, v10, v11}, Lcom/roidapp/photogrid/cloud/a/y;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/roidapp/photogrid/cloud/a/t;)V

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->k:Lcom/roidapp/photogrid/cloud/a/y;

    .line 238
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->k:Lcom/roidapp/photogrid/cloud/a/y;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/cloud/a/y;->f:Z

    if-nez v3, :cond_23

    .line 240
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->k:Lcom/roidapp/photogrid/cloud/a/y;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    invoke-virtual {v3, v9}, Lcom/roidapp/photogrid/cloud/a/y;->a(Landroid/widget/BaseAdapter;)V

    .line 241
    if-eqz v5, :cond_22

    .line 242
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->k:Lcom/roidapp/photogrid/cloud/a/y;

    invoke-interface {v3, v5, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v3, v4

    goto :goto_15

    .line 244
    :cond_22
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->k:Lcom/roidapp/photogrid/cloud/a/y;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v4

    goto :goto_15

    .line 246
    :cond_23
    const/4 v3, 0x0

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->k:Lcom/roidapp/photogrid/cloud/a/y;

    move v3, v4

    .line 248
    goto :goto_15

    .line 250
    :pswitch_3
    if-nez p2, :cond_1e

    .line 252
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/u;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v10, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    iget-boolean v11, p0, Lcom/roidapp/photogrid/cloud/a/q;->e:Z

    invoke-direct {v3, v9, v10, v11}, Lcom/roidapp/photogrid/cloud/a/u;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;Z)V

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    .line 253
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/cloud/a/u;->b()I

    move-result v3

    iput v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->a:I

    .line 254
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/cloud/a/u;->f:Z

    if-nez v3, :cond_1e

    .line 256
    if-eqz v5, :cond_24

    .line 257
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    invoke-interface {v3, v5, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v3, v4

    goto/16 :goto_15

    .line 259
    :cond_24
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v4

    goto/16 :goto_15

    .line 268
    :pswitch_4
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_25

    .line 269
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/o;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v10, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    invoke-direct {v3, v9, v10}, Lcom/roidapp/photogrid/cloud/a/o;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    .line 274
    :goto_16
    iget-boolean v9, v3, Lcom/roidapp/photogrid/cloud/a/l;->f:Z

    if-nez v9, :cond_27

    .line 276
    if-eqz v5, :cond_26

    .line 277
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    invoke-interface {v5, v9, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v3, v4

    goto/16 :goto_15

    .line 271
    :cond_25
    new-instance v3, Lcom/roidapp/photogrid/cloud/a/n;

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v10, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    iget-object v11, p0, Lcom/roidapp/photogrid/cloud/a/q;->f:Ljava/lang/String;

    invoke-direct {v3, v9, v10, v11}, Lcom/roidapp/photogrid/cloud/a/n;-><init>(Landroid/app/Activity;Lcom/roidapp/photogrid/cloud/a/t;Ljava/lang/String;)V

    goto :goto_16

    .line 279
    :cond_26
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_27
    move v3, v4

    .line 282
    goto/16 :goto_15

    .line 286
    :pswitch_5
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v3}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v3

    const/4 v9, 0x1

    if-eq v3, v9, :cond_29

    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v3

    iget-boolean v3, v3, Lcom/roidapp/photogrid/common/a;->b:Z

    if-nez v3, :cond_29

    .line 287
    new-instance v9, Lcom/roidapp/photogrid/cloud/a/a;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v10, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    invoke-direct {v9, v3, v2, v4, v10}, Lcom/roidapp/photogrid/cloud/a/a;-><init>(Landroid/app/Activity;IILcom/roidapp/photogrid/cloud/a/t;)V

    .line 288
    iget-boolean v3, v9, Lcom/roidapp/photogrid/cloud/a/a;->f:Z

    if-nez v3, :cond_29

    .line 290
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    invoke-virtual {v9, v3}, Lcom/roidapp/photogrid/cloud/a/a;->a(Landroid/widget/BaseAdapter;)V

    .line 291
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    if-nez v3, :cond_28

    .line 292
    new-instance v3, Ljava/util/ArrayList;

    const/4 v10, 0x2

    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    .line 295
    :cond_28
    if-eqz v5, :cond_2a

    if-nez v7, :cond_2a

    .line 296
    const/4 v3, 0x1

    .line 304
    :goto_17
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    new-instance v10, Lcom/roidapp/baselib/c/x;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v10, v9, v3}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 305
    invoke-virtual {v9}, Lcom/roidapp/photogrid/cloud/a/a;->c()V

    .line 308
    :cond_29
    add-int/lit8 v3, v4, 0x1

    goto/16 :goto_15

    .line 298
    :cond_2a
    if-eqz v5, :cond_2b

    if-eqz v7, :cond_2b

    .line 299
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_17

    .line 302
    :cond_2b
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v3, v5

    goto :goto_17

    .line 328
    :cond_2c
    new-instance v1, Lcom/roidapp/photogrid/cloud/a/m;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    invoke-direct {v1, v2, v3}, Lcom/roidapp/photogrid/cloud/a/m;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    .line 332
    iget-boolean v2, v1, Lcom/roidapp/photogrid/cloud/a/l;->f:Z

    if-nez v2, :cond_2d

    .line 333
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    :cond_2d
    new-instance v1, Lcom/roidapp/photogrid/cloud/a/k;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->g:Lcom/roidapp/photogrid/cloud/a/t;

    invoke-direct {v1, v2, v3}, Lcom/roidapp/photogrid/cloud/a/k;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V

    .line 342
    iget-boolean v2, v1, Lcom/roidapp/photogrid/cloud/a/l;->f:Z

    if-nez v2, :cond_2e

    .line 343
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    :cond_2e
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    move-object/from16 v0, p4

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 350
    new-instance v1, Lcom/roidapp/photogrid/cloud/a/r;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/roidapp/photogrid/cloud/a/r;-><init>(Lcom/roidapp/photogrid/cloud/a/q;ZB)V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->o:Lcom/roidapp/photogrid/cloud/a/r;

    move-object/from16 v0, p4

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    goto/16 :goto_0

    :cond_2f
    move-object v1, v6

    goto/16 :goto_d

    :cond_30
    move-object v1, v3

    move v3, v5

    goto/16 :goto_7

    .line 111
    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x3
    .end array-data

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/a/q;)Ljava/util/List;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    const/4 v5, 0x5

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 463
    .line 1776
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ParentActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 1777
    const-string v3, "REGISTER_COUNT"

    const/4 v4, -0x3

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 1780
    if-lt v2, v5, :cond_0

    .line 1782
    if-lt v2, v5, :cond_0

    move v0, v1

    .line 463
    :cond_0
    if-eqz v0, :cond_1

    .line 2512
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/cloud/a/x;->f:Z

    if-nez v0, :cond_1

    .line 2513
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/cloud/a/x;->f:Z

    .line 2514
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    if-eqz v0, :cond_1

    .line 2515
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->l:Lcom/roidapp/photogrid/cloud/a/x;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2516
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/s;->notifyDataSetChanged()V

    .line 466
    :cond_1
    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    if-eqz v0, :cond_0

    .line 500
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/cloud/a/u;->a(Landroid/graphics/Bitmap;)V

    .line 501
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    if-eqz v0, :cond_1

    .line 502
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/s;->notifyDataSetChanged()V

    .line 503
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 527
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Ljava/lang/String;I)V

    .line 528
    return-void
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 531
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->o:Lcom/roidapp/photogrid/cloud/a/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->o:Lcom/roidapp/photogrid/cloud/a/r;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/a/r;->a(Lcom/roidapp/photogrid/cloud/a/r;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 532
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/q;->o:Lcom/roidapp/photogrid/cloud/a/r;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/a/r;->a(Lcom/roidapp/photogrid/cloud/a/r;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v0, v1, p2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 534
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 471
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->o:Lcom/roidapp/photogrid/cloud/a/r;

    .line 473
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->n:Lcom/roidapp/photogrid/cloud/a/s;

    .line 475
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 476
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/a/l;

    .line 477
    if-eqz v0, :cond_0

    .line 478
    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/l;->a()V

    goto :goto_0

    .line 480
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 481
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->i:Ljava/util/List;

    .line 484
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    if-eqz v0, :cond_5

    .line 485
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/a/l;

    .line 486
    if-eqz v0, :cond_3

    .line 487
    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/a/l;->a()V

    goto :goto_1

    .line 489
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 490
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->h:Ljava/util/List;

    .line 492
    :cond_5
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->j:Lcom/roidapp/photogrid/cloud/a/u;

    .line 493
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->k:Lcom/roidapp/photogrid/cloud/a/y;

    .line 495
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/a/q;->d:Lcom/roidapp/photogrid/release/ParentActivity;

    .line 496
    return-void
.end method
