.class final Lcom/kik/view/adapters/v$a;
.super Landroid/widget/Filter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/view/adapters/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/v;


# direct methods
.method private constructor <init>(Lcom/kik/view/adapters/v;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/kik/view/adapters/v;B)V
    .locals 0

    .prologue
    .line 107
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/v$a;-><init>(Lcom/kik/view/adapters/v;)V

    return-void
.end method


# virtual methods
.method protected final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 9

    .prologue
    .line 112
    new-instance v2, Landroid/widget/Filter$FilterResults;

    invoke-direct {v2}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 114
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-static {v0}, Lcom/kik/view/adapters/v;->a(Lcom/kik/view/adapters/v;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-static {v0}, Lcom/kik/view/adapters/v;->b(Lcom/kik/view/adapters/v;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 117
    iget-object v0, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-static {v0}, Lcom/kik/view/adapters/v;->b(Lcom/kik/view/adapters/v;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, v2, Landroid/widget/Filter$FilterResults;->count:I

    .line 118
    monitor-exit v1

    .line 146
    :goto_0
    return-object v2

    .line 118
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 121
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-static {v0}, Lcom/kik/view/adapters/v;->a(Lcom/kik/view/adapters/v;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    .line 122
    :try_start_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 123
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 124
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 126
    iget-object v0, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-static {v0}, Lcom/kik/view/adapters/v;->b(Lcom/kik/view/adapters/v;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 127
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 128
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v1, v7, :cond_3

    .line 130
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 131
    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    .line 134
    invoke-virtual {v8, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 135
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 141
    :cond_3
    iput-object v5, v2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 142
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v2, Landroid/widget/Filter$FilterResults;->count:I

    .line 143
    monitor-exit v3

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0
.end method

.method protected final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 4

    .prologue
    .line 152
    iget-object v0, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-static {v0}, Lcom/kik/view/adapters/v;->a(Lcom/kik/view/adapters/v;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 153
    :try_start_0
    iget-object v0, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    .line 155
    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 157
    iget-object v2, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-virtual {v2}, Lcom/kik/view/adapters/v;->clear()V

    .line 158
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 160
    iget-object v3, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-virtual {v3, v0}, Lcom/kik/view/adapters/v;->add(Ljava/lang/Object;)V

    goto :goto_0

    .line 163
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 162
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/kik/view/adapters/v$a;->a:Lcom/kik/view/adapters/v;

    invoke-virtual {v0}, Lcom/kik/view/adapters/v;->notifyDataSetChanged()V

    .line 163
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method
