.class public abstract Lezvcard/util/CaseClasses;
.super Ljava/lang/Object;
.source "CaseClasses.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected volatile preDefined:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation
.end field

.field protected runtimeDefined:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lezvcard/util/CaseClasses;, "Lezvcard/util/CaseClasses<TT;TV;>;"
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v0, 0x0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object v0, p0, Lezvcard/util/CaseClasses;->preDefined:Ljava/util/Collection;

    .line 48
    iput-object v0, p0, Lezvcard/util/CaseClasses;->runtimeDefined:Ljava/util/Collection;

    .line 55
    iput-object p1, p0, Lezvcard/util/CaseClasses;->clazz:Ljava/lang/Class;

    .line 56
    return-void
.end method

.method private checkInit()V
    .locals 1

    .prologue
    .line 125
    .local p0, "this":Lezvcard/util/CaseClasses;, "Lezvcard/util/CaseClasses<TT;TV;>;"
    iget-object v0, p0, Lezvcard/util/CaseClasses;->preDefined:Ljava/util/Collection;

    if-nez v0, :cond_1

    .line 126
    monitor-enter p0

    .line 128
    :try_start_0
    iget-object v0, p0, Lezvcard/util/CaseClasses;->preDefined:Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 129
    invoke-direct {p0}, Lezvcard/util/CaseClasses;->init()V

    .line 131
    :cond_0
    monitor-exit p0

    .line 133
    :cond_1
    return-void

    .line 131
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private init()V
    .locals 11

    .prologue
    .line 136
    .local p0, "this":Lezvcard/util/CaseClasses;, "Lezvcard/util/CaseClasses<TT;TV;>;"
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .local v8, "preDefined":Ljava/util/Collection;, "Ljava/util/Collection<TT;>;"
    iget-object v9, p0, Lezvcard/util/CaseClasses;->clazz:Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Field;
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v5, :cond_1

    aget-object v3, v0, v4

    .line 138
    .local v3, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v6

    .line 140
    .local v6, "modifiers":I
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v9

    iget-object v10, p0, Lezvcard/util/CaseClasses;->clazz:Ljava/lang/Class;

    if-ne v9, v10, :cond_0

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    iget-object v10, p0, Lezvcard/util/CaseClasses;->clazz:Ljava/lang/Class;

    if-ne v9, v10, :cond_0

    .line 146
    const/4 v9, 0x0

    :try_start_0
    invoke-virtual {v3, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 147
    .local v7, "obj":Ljava/lang/Object;
    if-eqz v7, :cond_0

    .line 148
    iget-object v9, p0, Lezvcard/util/CaseClasses;->clazz:Ljava/lang/Class;

    invoke-virtual {v9, v7}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 149
    .local v1, "c":Ljava/lang/Object;, "TT;"
    invoke-interface {v8, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    .end local v1    # "c":Ljava/lang/Object;, "TT;"
    .end local v7    # "obj":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 151
    :catch_0
    move-exception v2

    .line 154
    .local v2, "ex":Ljava/lang/Exception;
    new-instance v9, Ljava/lang/RuntimeException;

    invoke-direct {v9, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v9

    .line 159
    .end local v2    # "ex":Ljava/lang/Exception;
    .end local v3    # "field":Ljava/lang/reflect/Field;
    .end local v6    # "modifiers":I
    :cond_1
    new-instance v9, Ljava/util/ArrayList;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v9, p0, Lezvcard/util/CaseClasses;->runtimeDefined:Ljava/util/Collection;

    .line 160
    invoke-static {v8}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v9

    iput-object v9, p0, Lezvcard/util/CaseClasses;->preDefined:Ljava/util/Collection;

    .line 161
    return-void
.end method


# virtual methods
.method public all()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 120
    .local p0, "this":Lezvcard/util/CaseClasses;, "Lezvcard/util/CaseClasses<TT;TV;>;"
    invoke-direct {p0}, Lezvcard/util/CaseClasses;->checkInit()V

    .line 121
    iget-object v0, p0, Lezvcard/util/CaseClasses;->preDefined:Ljava/util/Collection;

    return-object v0
.end method

.method protected abstract create(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TT;"
        }
    .end annotation
.end method

.method public find(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TT;"
        }
    .end annotation

    .prologue
    .line 80
    .local p0, "this":Lezvcard/util/CaseClasses;, "Lezvcard/util/CaseClasses<TT;TV;>;"
    .local p1, "value":Ljava/lang/Object;, "TV;"
    invoke-direct {p0}, Lezvcard/util/CaseClasses;->checkInit()V

    .line 82
    iget-object v2, p0, Lezvcard/util/CaseClasses;->preDefined:Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, "i$":Ljava/util/Iterator;
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 83
    .local v1, "obj":Ljava/lang/Object;, "TT;"
    invoke-virtual {p0, v1, p1}, Lezvcard/util/CaseClasses;->matches(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 87
    .end local v1    # "obj":Ljava/lang/Object;, "TT;"
    :goto_0
    return-object v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TT;"
        }
    .end annotation

    .prologue
    .line 97
    .local p0, "this":Lezvcard/util/CaseClasses;, "Lezvcard/util/CaseClasses<TT;TV;>;"
    .local p1, "value":Ljava/lang/Object;, "TV;"
    invoke-virtual {p0, p1}, Lezvcard/util/CaseClasses;->find(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 98
    .local v1, "found":Ljava/lang/Object;, "TT;"
    if-eqz v1, :cond_0

    .line 111
    .end local v1    # "found":Ljava/lang/Object;, "TT;"
    :goto_0
    return-object v1

    .line 102
    .restart local v1    # "found":Ljava/lang/Object;, "TT;"
    :cond_0
    iget-object v5, p0, Lezvcard/util/CaseClasses;->runtimeDefined:Ljava/util/Collection;

    monitor-enter v5

    .line 103
    :try_start_0
    iget-object v4, p0, Lezvcard/util/CaseClasses;->runtimeDefined:Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 104
    .local v3, "obj":Ljava/lang/Object;, "TT;"
    invoke-virtual {p0, v3, p1}, Lezvcard/util/CaseClasses;->matches(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 105
    monitor-exit v5

    move-object v1, v3

    goto :goto_0

    .line 109
    .end local v3    # "obj":Ljava/lang/Object;, "TT;"
    :cond_2
    invoke-virtual {p0, p1}, Lezvcard/util/CaseClasses;->create(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 110
    .local v0, "created":Ljava/lang/Object;, "TT;"
    iget-object v4, p0, Lezvcard/util/CaseClasses;->runtimeDefined:Ljava/util/Collection;

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    monitor-exit v5

    move-object v1, v0

    goto :goto_0

    .line 112
    .end local v0    # "created":Ljava/lang/Object;, "TT;"
    .end local v2    # "i$":Ljava/util/Iterator;
    :catchall_0
    move-exception v4

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v4
.end method

.method protected abstract matches(Ljava/lang/Object;Ljava/lang/Object;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TV;)Z"
        }
    .end annotation
.end method
