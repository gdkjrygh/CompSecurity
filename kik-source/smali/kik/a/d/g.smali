.class public final Lkik/a/d/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:J

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZJZ)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lkik/a/d/g;->a:Ljava/lang/String;

    .line 16
    iput-boolean p2, p0, Lkik/a/d/g;->b:Z

    .line 17
    iput-wide p3, p0, Lkik/a/d/g;->c:J

    .line 18
    iput-boolean p5, p0, Lkik/a/d/g;->d:Z

    .line 19
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lkik/a/d/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 28
    iget-boolean v0, p0, Lkik/a/d/g;->b:Z

    return v0
.end method

.method public final c()J
    .locals 2

    .prologue
    .line 33
    iget-wide v0, p0, Lkik/a/d/g;->c:J

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lkik/a/d/g;->d:Z

    return v0
.end method
