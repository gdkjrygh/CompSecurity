.class public final Lcom/c/b/ay;
.super Lcom/c/b/d;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/az;
.implements Ljava/util/RandomAccess;


# static fields
.field public static final a:Lcom/c/b/az;

.field private static final b:Lcom/c/b/ay;


# instance fields
.field private final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 68
    new-instance v0, Lcom/c/b/ay;

    invoke-direct {v0}, Lcom/c/b/ay;-><init>()V

    .line 70
    sput-object v0, Lcom/c/b/ay;->b:Lcom/c/b/ay;

    invoke-virtual {v0}, Lcom/c/b/ay;->b()V

    .line 78
    sget-object v0, Lcom/c/b/ay;->b:Lcom/c/b/ay;

    sput-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 82
    invoke-direct {p0}, Lcom/c/b/d;-><init>()V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    .line 84
    return-void
.end method

.method public constructor <init>(Lcom/c/b/az;)V
    .locals 2

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/c/b/d;-><init>()V

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lcom/c/b/az;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    .line 92
    invoke-virtual {p0, p1}, Lcom/c/b/ay;->addAll(Ljava/util/Collection;)Z

    .line 93
    return-void
.end method

.method private static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 259
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 260
    check-cast p0, Ljava/lang/String;

    .line 264
    :goto_0
    return-object p0

    .line 261
    :cond_0
    instance-of v0, p0, Lcom/c/b/f;

    if-eqz v0, :cond_1

    .line 262
    check-cast p0, Lcom/c/b/f;

    invoke-virtual {p0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 264
    :cond_1
    check-cast p0, [B

    invoke-static {p0}, Lcom/c/b/au;->b([B)Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method


# virtual methods
.method public final a(I)Lcom/c/b/f;
    .locals 2

    .prologue
    .line 220
    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 221
    instance-of v0, v1, Lcom/c/b/f;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Lcom/c/b/f;

    .line 222
    :goto_0
    if-eq v0, v1, :cond_0

    .line 223
    iget-object v1, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v1, p1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 225
    :cond_0
    return-object v0

    .line 221
    :cond_1
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    check-cast v0, [B

    invoke-static {v0}, Lcom/c/b/f;->a([B)Lcom/c/b/f;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lcom/c/b/f;)V
    .locals 1

    .prologue
    .line 206
    invoke-virtual {p0}, Lcom/c/b/ay;->c()V

    .line 207
    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    iget v0, p0, Lcom/c/b/ay;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/ay;->modCount:I

    .line 209
    return-void
.end method

.method public final bridge synthetic a()Z
    .locals 1

    .prologue
    .line 65
    invoke-super {p0}, Lcom/c/b/d;->a()Z

    move-result v0

    return v0
.end method

.method public final synthetic add(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 65
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/c/b/ay;->c()V

    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget v0, p0, Lcom/c/b/ay;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/ay;->modCount:I

    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 2

    .prologue
    .line 163
    invoke-virtual {p0}, Lcom/c/b/ay;->c()V

    .line 166
    instance-of v0, p2, Lcom/c/b/az;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/c/b/az;

    invoke-interface {p2}, Lcom/c/b/az;->d()Ljava/util/List;

    move-result-object p2

    .line 168
    :cond_0
    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result v0

    .line 169
    iget v1, p0, Lcom/c/b/ay;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/ay;->modCount:I

    .line 170
    return v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 158
    invoke-virtual {p0}, Lcom/c/b/ay;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/c/b/ay;->addAll(ILjava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 199
    invoke-virtual {p0}, Lcom/c/b/ay;->c()V

    .line 200
    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 201
    iget v0, p0, Lcom/c/b/ay;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/ay;->modCount:I

    .line 202
    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/az;
    .locals 1

    .prologue
    .line 398
    invoke-super {p0}, Lcom/c/b/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 399
    new-instance v0, Lcom/c/b/bz;

    invoke-direct {v0, p0}, Lcom/c/b/bz;-><init>(Lcom/c/b/az;)V

    move-object p0, v0

    .line 401
    :cond_0
    return-object p0
.end method

.method public final synthetic get(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    instance-of v1, v0, Lcom/c/b/f;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/c/b/f;

    invoke-virtual {v0}, Lcom/c/b/f;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/c/b/f;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    check-cast v0, [B

    invoke-static {v0}, Lcom/c/b/au;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lcom/c/b/au;->a([B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public final synthetic remove(I)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 65
    invoke-virtual {p0}, Lcom/c/b/ay;->c()V

    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/c/b/ay;->modCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/b/ay;->modCount:I

    invoke-static {v0}, Lcom/c/b/ay;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 65
    invoke-super {p0, p1}, Lcom/c/b/d;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic removeAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 65
    invoke-super {p0, p1}, Lcom/c/b/d;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic retainAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 65
    invoke-super {p0, p1}, Lcom/c/b/d;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 65
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/c/b/ay;->c()V

    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/ay;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/c/b/ay;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
