.class public Lkik/a/d/a/e;
.super Lkik/a/d/a/g;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/Vector;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/Vector;

.field private e:Ljava/lang/String;

.field private f:Z


# direct methods
.method public constructor <init>(Ljava/util/Vector;Ljava/util/Vector;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, v0, v0}, Lkik/a/d/a/g;-><init>(ZZ)V

    .line 18
    iput-object p1, p0, Lkik/a/d/a/e;->a:Ljava/util/Vector;

    .line 19
    iput-object p2, p0, Lkik/a/d/a/e;->d:Ljava/util/Vector;

    .line 20
    iput-object p3, p0, Lkik/a/d/a/e;->b:Ljava/lang/String;

    .line 21
    iput-object p4, p0, Lkik/a/d/a/e;->c:Ljava/lang/String;

    .line 22
    iput-object p5, p0, Lkik/a/d/a/e;->e:Ljava/lang/String;

    .line 23
    iput-boolean p6, p0, Lkik/a/d/a/e;->f:Z

    .line 24
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Vector;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lkik/a/d/a/e;->a:Ljava/util/Vector;

    return-object v0
.end method

.method public final b()Ljava/util/Vector;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lkik/a/d/a/e;->d:Ljava/util/Vector;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lkik/a/d/a/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lkik/a/d/a/e;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 53
    iget-boolean v0, p0, Lkik/a/d/a/e;->f:Z

    return v0
.end method
