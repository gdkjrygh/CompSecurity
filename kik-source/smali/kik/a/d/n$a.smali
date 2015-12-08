.class public final Lkik/a/d/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/d/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Ljava/util/List;

.field private c:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 312
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, v0, v1, v2}, Lkik/a/d/n$a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)V

    .line 313
    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)V
    .locals 0

    .prologue
    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 317
    iput-object p1, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    .line 318
    iput-object p2, p0, Lkik/a/d/n$a;->b:Ljava/util/List;

    .line 319
    iput-object p3, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    .line 320
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 328
    iget-object v0, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    return-void
.end method

.method public final a(Lkik/a/d/k;)Z
    .locals 2

    .prologue
    .line 401
    iget-object v0, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lkik/a/d/n$a;->b:Ljava/util/List;

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 337
    iget-object v0, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    iget-object v0, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c()Ljava/util/Set;
    .locals 1

    .prologue
    .line 363
    iget-object v0, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 369
    return-void
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 373
    iget-object v0, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 383
    iget-object v0, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 384
    iget-object v0, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 389
    iget-object v0, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 390
    iget-object v0, p0, Lkik/a/d/n$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 391
    iget-object v0, p0, Lkik/a/d/n$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 406
    iget-object v0, p0, Lkik/a/d/n$a;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
