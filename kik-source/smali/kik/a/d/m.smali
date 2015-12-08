.class public final Lkik/a/d/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lkik/a/d/m;->a:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lkik/a/d/m;->b:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lkik/a/d/m;->c:Ljava/lang/String;

    .line 25
    iput-object p6, p0, Lkik/a/d/m;->f:Ljava/util/List;

    .line 26
    iput-object p4, p0, Lkik/a/d/m;->d:Ljava/lang/String;

    .line 27
    iput-object p5, p0, Lkik/a/d/m;->e:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/a/d/m;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lkik/a/d/m;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lkik/a/d/m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lkik/a/d/m;->f:Ljava/util/List;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lkik/a/d/m;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lkik/a/d/m;->e:Ljava/lang/String;

    return-object v0
.end method
