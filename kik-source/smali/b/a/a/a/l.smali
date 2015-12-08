.class public abstract Lb/a/a/a/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field e:Lb/a/a/a/d;

.field f:Lb/a/a/a/k;

.field g:Landroid/content/Context;

.field h:Lb/a/a/a/i;

.field i:Lb/a/a/a/a/b/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Lb/a/a/a/k;

    invoke-direct {v0, p0}, Lb/a/a/a/k;-><init>(Lb/a/a/a/l;)V

    iput-object v0, p0, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    .line 44
    return-void
.end method

.method private a(Lb/a/a/a/l;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 158
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Lb/a/a/a/a/c/h;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/h;

    .line 159
    if-eqz v0, :cond_1

    .line 160
    invoke-interface {v0}, Lb/a/a/a/a/c/h;->a()[Ljava/lang/Class;

    move-result-object v2

    .line 161
    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 163
    const/4 v0, 0x1

    .line 167
    :goto_1
    return v0

    .line 161
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 167
    goto :goto_1
.end method

.method private c()Z
    .locals 2

    .prologue
    .line 175
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lb/a/a/a/a/c/h;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/h;

    .line 176
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method final a(Landroid/content/Context;Lb/a/a/a/d;Lb/a/a/a/i;Lb/a/a/a/a/b/t;)V
    .locals 3

    .prologue
    .line 56
    iput-object p2, p0, Lb/a/a/a/l;->e:Lb/a/a/a/d;

    .line 57
    new-instance v0, Lb/a/a/a/g;

    invoke-virtual {p0}, Lb/a/a/a/l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lb/a/a/a/l;->x()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lb/a/a/a/g;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    .line 58
    iput-object p3, p0, Lb/a/a/a/l;->h:Lb/a/a/a/i;

    .line 59
    iput-object p4, p0, Lb/a/a/a/l;->i:Lb/a/a/a/a/b/t;

    .line 60
    return-void
.end method

.method protected a_()Z
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x1

    return v0
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 33
    check-cast p1, Lb/a/a/a/l;

    invoke-direct {p0, p1}, Lb/a/a/a/l;->a(Lb/a/a/a/l;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-direct {p1, p0}, Lb/a/a/a/l;->a(Lb/a/a/a/l;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lb/a/a/a/l;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-direct {p1}, Lb/a/a/a/l;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    invoke-direct {p0}, Lb/a/a/a/l;->c()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p1}, Lb/a/a/a/l;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected abstract e()Ljava/lang/Object;
.end method

.method final t()V
    .locals 5

    .prologue
    .line 66
    iget-object v0, p0, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    iget-object v1, p0, Lb/a/a/a/l;->e:Lb/a/a/a/d;

    invoke-virtual {v1}, Lb/a/a/a/d;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Void;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lb/a/a/a/k;->a(Ljava/util/concurrent/ExecutorService;[Ljava/lang/Object;)V

    .line 67
    return-void
.end method

.method protected final u()Lb/a/a/a/a/b/t;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lb/a/a/a/l;->i:Lb/a/a/a/a/b/t;

    return-object v0
.end method

.method public final v()Landroid/content/Context;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    return-object v0
.end method

.method public final w()Lb/a/a/a/d;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lb/a/a/a/l;->e:Lb/a/a/a/d;

    return-object v0
.end method

.method public final x()Ljava/lang/String;
    .locals 2

    .prologue
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".Fabric"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lb/a/a/a/l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final y()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lb/a/a/a/l;->f:Lb/a/a/a/k;

    invoke-virtual {v0}, Lb/a/a/a/k;->f()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
