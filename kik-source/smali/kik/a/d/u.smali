.class public final Lkik/a/d/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Ljava/util/Vector;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/Vector;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput p1, p0, Lkik/a/d/u;->a:I

    .line 26
    iput-object p2, p0, Lkik/a/d/u;->b:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lkik/a/d/u;->c:Ljava/lang/String;

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/a/d/u;->d:Z

    .line 29
    iput-object p4, p0, Lkik/a/d/u;->e:Ljava/util/Vector;

    .line 30
    iput-object p5, p0, Lkik/a/d/u;->f:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lkik/a/d/u;->a:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lkik/a/d/u;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lkik/a/d/u;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/util/Vector;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lkik/a/d/u;->e:Ljava/util/Vector;

    return-object v0
.end method
