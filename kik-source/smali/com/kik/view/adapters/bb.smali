.class public Lcom/kik/view/adapters/bb;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/bb$a;,
        Lcom/kik/view/adapters/bb$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Landroid/widget/ArrayAdapter;

.field private final c:Lcom/kik/view/adapters/bb$a;

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    .line 34
    new-instance v0, Lcom/kik/view/adapters/bb$a;

    invoke-direct {v0, p0}, Lcom/kik/view/adapters/bb$a;-><init>(Lcom/kik/view/adapters/bb;)V

    iput-object v0, p0, Lcom/kik/view/adapters/bb;->c:Lcom/kik/view/adapters/bb$a;

    .line 35
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/view/adapters/bb;->d:Z

    .line 42
    new-instance v0, Landroid/widget/ArrayAdapter;

    const v1, 0x7f03007c

    invoke-direct {v0, p1, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    .line 43
    return-void
.end method

.method private a(Lcom/kik/view/adapters/bb$b;)Z
    .locals 1

    .prologue
    .line 351
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/kik/view/adapters/bb;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lcom/kik/view/adapters/bb$b;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(I)Landroid/widget/Adapter;
    .locals 3

    .prologue
    .line 367
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 369
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    .line 370
    iget-object v0, v0, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    .line 372
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v2

    if-eqz v2, :cond_1

    .line 374
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 380
    if-ge p1, v2, :cond_0

    .line 387
    :goto_1
    return-object v0

    .line 385
    :cond_0
    sub-int/2addr p1, v2

    .line 367
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 387
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)Landroid/widget/Adapter;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 176
    if-nez p1, :cond_0

    move-object v0, v2

    .line 185
    :goto_0
    return-object v0

    .line 180
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 181
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bb$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    goto :goto_0

    .line 180
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    .line 185
    goto :goto_0
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 392
    iput-boolean p1, p0, Lcom/kik/view/adapters/bb;->d:Z

    .line 393
    return-void
.end method

.method public final c(Ljava/lang/String;Landroid/widget/Adapter;)V
    .locals 3

    .prologue
    .line 72
    if-eqz p2, :cond_0

    .line 73
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    new-instance v1, Lcom/kik/view/adapters/bb$b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/kik/view/adapters/bb$b;-><init>(Lcom/kik/view/adapters/bb;Ljava/lang/String;Landroid/widget/Adapter;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/String;Landroid/widget/Adapter;Z)V
    .locals 2

    .prologue
    .line 85
    if-eqz p2, :cond_0

    .line 86
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    new-instance v1, Lcom/kik/view/adapters/bb$b;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/kik/view/adapters/bb$b;-><init>(Lcom/kik/view/adapters/bb;Ljava/lang/String;Landroid/widget/Adapter;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;Landroid/widget/Adapter;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 109
    if-eqz p2, :cond_0

    .line 110
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1, v2}, Landroid/widget/ArrayAdapter;->insert(Ljava/lang/Object;I)V

    .line 111
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    new-instance v1, Lcom/kik/view/adapters/bb$b;

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/kik/view/adapters/bb$b;-><init>(Lcom/kik/view/adapters/bb;Ljava/lang/String;Landroid/widget/Adapter;Z)V

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 113
    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/String;Landroid/widget/Adapter;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 117
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 143
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    const/4 v1, 0x1

    move v2, v1

    move v3, v0

    move v1, v0

    .line 124
    :goto_1
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 125
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bb$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 127
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    iget-boolean v2, v0, Lcom/kik/view/adapters/bb$b;->c:Z

    move v3, v1

    .line 124
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/bb;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 133
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->remove(Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 135
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1, v3}, Landroid/widget/ArrayAdapter;->insert(Ljava/lang/Object;I)V

    .line 136
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    new-instance v1, Lcom/kik/view/adapters/bb$b;

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/kik/view/adapters/bb$b;-><init>(Lcom/kik/view/adapters/bb;Ljava/lang/String;Landroid/widget/Adapter;Z)V

    invoke-interface {v0, v3, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 139
    :cond_4
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 140
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    new-instance v1, Lcom/kik/view/adapters/bb$b;

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/kik/view/adapters/bb$b;-><init>(Lcom/kik/view/adapters/bb;Ljava/lang/String;Landroid/widget/Adapter;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final f(Ljava/lang/String;Landroid/widget/Adapter;)V
    .locals 3

    .prologue
    .line 153
    if-eqz p2, :cond_0

    .line 154
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    new-instance v1, Lcom/kik/view/adapters/bb$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/kik/view/adapters/bb$b;-><init>(Lcom/kik/view/adapters/bb;Ljava/lang/String;Landroid/widget/Adapter;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 232
    move v1, v2

    move v3, v2

    .line 233
    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 234
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    .line 236
    iget-object v4, v0, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    .line 237
    invoke-direct {p0, v0}, Lcom/kik/view/adapters/bb;->a(Lcom/kik/view/adapters/bb$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 238
    :goto_1
    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v5

    if-lez v5, :cond_0

    .line 239
    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    add-int/2addr v0, v4

    add-int/2addr v3, v0

    .line 233
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    move v0, v2

    .line 237
    goto :goto_1

    .line 242
    :cond_2
    return v3
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 191
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 192
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    .line 193
    iget-object v4, v0, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    .line 195
    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v3

    if-eqz v3, :cond_3

    .line 197
    invoke-direct {p0, v0}, Lcom/kik/view/adapters/bb;->a(Lcom/kik/view/adapters/bb$b;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    .line 201
    :goto_1
    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v5

    add-int/2addr v5, v3

    .line 204
    if-nez p1, :cond_1

    invoke-direct {p0, v0}, Lcom/kik/view/adapters/bb;->a(Lcom/kik/view/adapters/bb$b;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 205
    iget-object v0, v0, Lcom/kik/view/adapters/bb$b;->a:Ljava/lang/String;

    .line 214
    :goto_2
    return-object v0

    :cond_0
    move v3, v2

    .line 197
    goto :goto_1

    .line 207
    :cond_1
    if-ge p1, v5, :cond_2

    .line 208
    sub-int v0, p1, v3

    invoke-interface {v4, v0}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    .line 212
    :cond_2
    sub-int/2addr p1, v5

    .line 191
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 214
    :cond_4
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 357
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 10

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 261
    .line 263
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v1, v2

    move v3, v4

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    .line 264
    sub-int v6, p1, v1

    .line 266
    iget-object v7, v0, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    .line 267
    invoke-interface {v7}, Landroid/widget/Adapter;->getCount()I

    move-result v8

    if-nez v8, :cond_0

    .line 269
    invoke-interface {v7}, Landroid/widget/Adapter;->getViewTypeCount()I

    move-result v0

    add-int/2addr v0, v3

    move v3, v0

    .line 271
    goto :goto_0

    .line 273
    :cond_0
    invoke-direct {p0, v0}, Lcom/kik/view/adapters/bb;->a(Lcom/kik/view/adapters/bb$b;)Z

    move-result v8

    .line 275
    if-eqz v8, :cond_1

    move v0, v4

    .line 276
    :goto_1
    invoke-interface {v7}, Landroid/widget/Adapter;->getCount()I

    move-result v9

    add-int/2addr v9, v0

    .line 279
    if-nez v6, :cond_2

    if-eqz v8, :cond_2

    .line 294
    :goto_2
    return v2

    :cond_1
    move v0, v2

    .line 275
    goto :goto_1

    .line 284
    :cond_2
    if-ge v6, v9, :cond_3

    .line 286
    sub-int v0, v6, v0

    invoke-interface {v7, v0}, Landroid/widget/Adapter;->getItemViewType(I)I

    move-result v0

    add-int v2, v3, v0

    .line 287
    goto :goto_2

    .line 291
    :cond_3
    add-int v0, v1, v9

    .line 292
    invoke-interface {v7}, Landroid/widget/Adapter;->getViewTypeCount()I

    move-result v1

    add-int/2addr v1, v3

    move v3, v1

    move v1, v0

    .line 293
    goto :goto_0

    .line 294
    :cond_4
    const/4 v2, -0x1

    goto :goto_2
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 306
    move v1, v2

    move v3, v2

    .line 307
    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 309
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    .line 311
    iget-object v6, v0, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    .line 313
    invoke-interface {v6}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    if-nez v4, :cond_0

    .line 315
    add-int/lit8 v3, v3, 0x1

    .line 307
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 319
    :cond_0
    invoke-direct {p0, v0}, Lcom/kik/view/adapters/bb;->a(Lcom/kik/view/adapters/bb$b;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    .line 320
    :goto_2
    invoke-interface {v6}, Landroid/widget/Adapter;->getCount()I

    move-result v7

    add-int/2addr v7, v4

    .line 323
    if-nez p1, :cond_4

    invoke-direct {p0, v0}, Lcom/kik/view/adapters/bb;->a(Lcom/kik/view/adapters/bb$b;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 324
    iget-object v1, p0, Lcom/kik/view/adapters/bb;->b:Landroid/widget/ArrayAdapter;

    invoke-virtual {v1, v3, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 326
    iget-boolean v2, p0, Lcom/kik/view/adapters/bb;->d:Z

    if-eqz v2, :cond_3

    iget-boolean v0, v0, Lcom/kik/view/adapters/bb$b;->c:Z

    if-eqz v0, :cond_3

    .line 327
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d0019

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    :goto_3
    move-object v0, v1

    .line 346
    :cond_1
    :goto_4
    return-object v0

    :cond_2
    move v4, v2

    .line 319
    goto :goto_2

    .line 330
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput v5, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_3

    .line 335
    :cond_4
    if-ge p1, v7, :cond_5

    .line 336
    sub-int v0, p1, v4

    invoke-interface {v6, v0, p2, p3}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 337
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-nez v1, :cond_1

    .line 338
    const-string v1, "AUTOMATION_CONTACT_CELL"

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 343
    :cond_5
    sub-int/2addr p1, v7

    .line 344
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 346
    :cond_6
    const/4 v0, 0x0

    goto :goto_4
.end method

.method public getViewTypeCount()I
    .locals 3

    .prologue
    .line 249
    const/4 v1, 0x1

    .line 250
    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/kik/view/adapters/bb;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/bb$b;

    iget-object v0, v0, Lcom/kik/view/adapters/bb$b;->b:Landroid/widget/Adapter;

    .line 253
    invoke-interface {v0}, Landroid/widget/Adapter;->getViewTypeCount()I

    move-result v0

    add-int/2addr v2, v0

    .line 250
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 255
    :cond_0
    return v2
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 62
    const/4 v0, 0x1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/kik/view/adapters/bb;->getCount()I

    move-result v0

    .line 56
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isEnabled(I)Z
    .locals 1

    .prologue
    .line 300
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/bb;->getItemViewType(I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
