.class public final Lcom/roidapp/baselib/hlistview/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filterable;
.implements Landroid/widget/WrapperListAdapter;


# static fields
.field static final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/hlistview/y;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/hlistview/y;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/hlistview/y;",
            ">;"
        }
    .end annotation
.end field

.field d:Z

.field private final e:Landroid/widget/ListAdapter;

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/hlistview/aa;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/hlistview/y;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/hlistview/y;",
            ">;",
            "Landroid/widget/ListAdapter;",
            ")V"
        }
    .end annotation

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p3, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    .line 58
    instance-of v0, p3, Landroid/widget/Filterable;

    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/aa;->f:Z

    .line 60
    if-nez p1, :cond_0

    .line 61
    sget-object v0, Lcom/roidapp/baselib/hlistview/aa;->c:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    .line 66
    :goto_0
    if-nez p2, :cond_1

    .line 67
    sget-object v0, Lcom/roidapp/baselib/hlistview/aa;->c:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    .line 72
    :goto_1
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/aa;->a(Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/roidapp/baselib/hlistview/aa;->a(Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_2
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/aa;->d:Z

    .line 75
    return-void

    .line 63
    :cond_0
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    goto :goto_0

    .line 69
    :cond_1
    iput-object p2, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    goto :goto_1

    .line 72
    :cond_2
    const/4 v0, 0x0

    goto :goto_2
.end method

.method private static a(Ljava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/hlistview/y;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 90
    if-eqz p0, :cond_1

    .line 91
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/y;

    .line 92
    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/y;->c:Z

    if-nez v0, :cond_0

    .line 93
    const/4 v0, 0x0

    .line 97
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 143
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    .line 144
    iget-boolean v1, p0, Lcom/roidapp/baselib/hlistview/aa;->d:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 146
    :cond_0
    :goto_0
    return v0

    .line 144
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getCount()I
    .locals 2

    .prologue
    .line 135
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 1082
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2078
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 136
    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    add-int/2addr v0, v1

    .line 138
    :goto_0
    return v0

    .line 2082
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 3078
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 138
    add-int/2addr v0, v1

    goto :goto_0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 265
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/aa;->f:Z

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    check-cast v0, Landroid/widget/Filterable;

    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    move-result-object v0

    .line 268
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 173
    .line 5078
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 174
    if-ge p1, v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/y;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/y;->b:Ljava/lang/Object;

    .line 189
    :goto_0
    return-object v0

    .line 179
    :cond_0
    sub-int v1, p1, v0

    .line 180
    const/4 v0, 0x0

    .line 181
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v2, :cond_1

    .line 182
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 183
    if-ge v1, v0, :cond_1

    .line 184
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 189
    :cond_1
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    sub-int v0, v1, v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/y;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/y;->b:Ljava/lang/Object;

    goto :goto_0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 193
    .line 6078
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 194
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    if-lt p1, v0, :cond_0

    .line 195
    sub-int v0, p1, v0

    .line 196
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 197
    if-ge v0, v1, :cond_0

    .line 198
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    .line 201
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public final getItemViewType(I)I
    .locals 2

    .prologue
    .line 233
    .line 8078
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 234
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_0

    if-lt p1, v0, :cond_0

    .line 235
    sub-int v0, p1, v0

    .line 236
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 237
    if-ge v0, v1, :cond_0

    .line 238
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v0

    .line 242
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x2

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 213
    .line 7078
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 214
    if-ge p1, v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/y;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/y;->a:Landroid/view/View;

    .line 229
    :goto_0
    return-object v0

    .line 219
    :cond_0
    sub-int v1, p1, v0

    .line 220
    const/4 v0, 0x0

    .line 221
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v2, :cond_1

    .line 222
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 223
    if-ge v1, v0, :cond_1

    .line 224
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, v1, p2, p3}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 229
    :cond_1
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    sub-int v0, v1, v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/y;

    iget-object v0, v0, Lcom/roidapp/baselib/hlistview/y;->a:Landroid/view/View;

    goto :goto_0
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getViewTypeCount()I

    move-result v0

    .line 249
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final getWrappedAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    return-object v0
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->hasStableIds()Z

    move-result v0

    .line 208
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isEnabled(I)Z
    .locals 3

    .prologue
    .line 152
    .line 4078
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 153
    if-ge p1, v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/y;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/y;->c:Z

    .line 168
    :goto_0
    return v0

    .line 158
    :cond_0
    sub-int v1, p1, v0

    .line 159
    const/4 v0, 0x0

    .line 160
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v2, :cond_1

    .line 161
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 162
    if-ge v1, v0, :cond_1

    .line 163
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v0

    goto :goto_0

    .line 168
    :cond_1
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/aa;->b:Ljava/util/ArrayList;

    sub-int v0, v1, v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/hlistview/y;

    iget-boolean v0, v0, Lcom/roidapp/baselib/hlistview/y;->c:Z

    goto :goto_0
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 256
    :cond_0
    return-void
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 259
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/aa;->e:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 262
    :cond_0
    return-void
.end method
