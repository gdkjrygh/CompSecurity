.class public Lkik/a/d/a/l;
.super Lkik/a/d/a/g;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 11
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lkik/a/d/a/g;-><init>(ZZ)V

    .line 12
    iput-object p1, p0, Lkik/a/d/a/l;->a:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lkik/a/d/a/l;->b:Ljava/lang/String;

    .line 14
    iput-boolean p3, p0, Lkik/a/d/a/l;->c:Z

    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lkik/a/d/a/l;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lkik/a/d/a/l;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 29
    iget-boolean v0, p0, Lkik/a/d/a/l;->c:Z

    return v0
.end method
