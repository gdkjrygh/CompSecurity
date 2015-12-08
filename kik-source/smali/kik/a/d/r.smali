.class public final Lkik/a/d/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Z

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method private constructor <init>(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-boolean p1, p0, Lkik/a/d/r;->a:Z

    .line 35
    iput-wide p2, p0, Lkik/a/d/r;->b:J

    .line 36
    iput-object p4, p0, Lkik/a/d/r;->c:Ljava/lang/String;

    .line 37
    iput-object p5, p0, Lkik/a/d/r;->d:Ljava/lang/String;

    .line 38
    iput-object p6, p0, Lkik/a/d/r;->e:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public static a(J)Lkik/a/d/r;
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 15
    new-instance v0, Lkik/a/d/r;

    const/4 v1, 0x0

    move-wide v2, p0

    move-object v5, v4

    move-object v6, v4

    invoke-direct/range {v0 .. v6}, Lkik/a/d/r;-><init>(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkik/a/d/r;
    .locals 8

    .prologue
    .line 24
    new-instance v0, Lkik/a/d/r;

    const/4 v1, 0x1

    move-wide v2, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lkik/a/d/r;-><init>(ZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lkik/a/d/r;->a:Z

    return v0
.end method

.method public final b()J
    .locals 2

    .prologue
    .line 54
    iget-wide v0, p0, Lkik/a/d/r;->b:J

    return-wide v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lkik/a/d/r;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lkik/a/d/r;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lkik/a/d/r;->e:Ljava/lang/String;

    return-object v0
.end method
