.class public abstract La/a/a/a/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "La/a/a/a/p;",
        ">;"
    }
.end annotation


# instance fields
.field e:La/a/a/a/f;

.field f:La/a/a/a/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/o",
            "<TResult;>;"
        }
    .end annotation
.end field

.field g:Landroid/content/Context;

.field h:La/a/a/a/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a/a/a/l",
            "<TResult;>;"
        }
    .end annotation
.end field

.field i:La/a/a/a/a/b/x;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, La/a/a/a/o;

    invoke-direct {v0, p0}, La/a/a/a/o;-><init>(La/a/a/a/p;)V

    iput-object v0, p0, La/a/a/a/p;->f:La/a/a/a/o;

    .line 44
    return-void
.end method

.method private a(La/a/a/a/p;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, La/a/a/a/a/c/n;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/n;

    .line 161
    if-eqz v0, :cond_1

    .line 162
    invoke-interface {v0}, La/a/a/a/a/c/n;->a()[Ljava/lang/Class;

    move-result-object v2

    .line 163
    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_1

    aget-object v4, v2, v0

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 165
    const/4 v0, 0x1

    .line 169
    :goto_1
    return v0

    .line 163
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 169
    goto :goto_1
.end method

.method private e()Z
    .locals 2

    .prologue
    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, La/a/a/a/a/c/n;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, La/a/a/a/a/c/n;

    .line 178
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

.method final a(Landroid/content/Context;La/a/a/a/f;La/a/a/a/l;La/a/a/a/a/b/x;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "La/a/a/a/f;",
            "La/a/a/a/l",
            "<TResult;>;",
            "La/a/a/a/a/b/x;",
            ")V"
        }
    .end annotation

    .prologue
    .line 56
    iput-object p2, p0, La/a/a/a/p;->e:La/a/a/a/f;

    .line 57
    new-instance v0, La/a/a/a/j;

    invoke-virtual {p0}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, La/a/a/a/p;->x()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, La/a/a/a/j;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 58
    iput-object p3, p0, La/a/a/a/p;->h:La/a/a/a/l;

    .line 59
    iput-object p4, p0, La/a/a/a/p;->i:La/a/a/a/a/b/x;

    .line 60
    return-void
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 33
    check-cast p1, La/a/a/a/p;

    .line 1142
    invoke-direct {p0, p1}, La/a/a/a/p;->a(La/a/a/a/p;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1149
    :cond_0
    :goto_0
    return v0

    .line 1144
    :cond_1
    invoke-direct {p1, p0}, La/a/a/a/p;->a(La/a/a/a/p;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    .line 1145
    goto :goto_0

    .line 1146
    :cond_2
    invoke-direct {p0}, La/a/a/a/p;->e()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-direct {p1}, La/a/a/a/p;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1148
    :cond_3
    invoke-direct {p0}, La/a/a/a/p;->e()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p1}, La/a/a/a/p;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 1149
    goto :goto_0

    .line 1151
    :cond_4
    const/4 v0, 0x0

    .line 33
    goto :goto_0
.end method

.method protected abstract d()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation
.end method

.method protected e_()Z
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x1

    return v0
.end method

.method final t()V
    .locals 5

    .prologue
    .line 66
    iget-object v0, p0, La/a/a/a/p;->f:La/a/a/a/o;

    iget-object v1, p0, La/a/a/a/p;->e:La/a/a/a/f;

    invoke-virtual {v1}, La/a/a/a/f;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Void;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, La/a/a/a/o;->a(Ljava/util/concurrent/ExecutorService;[Ljava/lang/Object;)V

    .line 67
    return-void
.end method

.method protected final u()La/a/a/a/a/b/x;
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, La/a/a/a/p;->i:La/a/a/a/a/b/x;

    return-object v0
.end method

.method public final v()Landroid/content/Context;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, La/a/a/a/p;->g:Landroid/content/Context;

    return-object v0
.end method

.method public final w()La/a/a/a/f;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, La/a/a/a/p;->e:La/a/a/a/f;

    return-object v0
.end method

.method public final x()Ljava/lang/String;
    .locals 2

    .prologue
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".Fabric"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final y()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/a/c/y;",
            ">;"
        }
    .end annotation

    .prologue
    .line 183
    iget-object v0, p0, La/a/a/a/p;->f:La/a/a/a/o;

    invoke-virtual {v0}, La/a/a/a/o;->f()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
