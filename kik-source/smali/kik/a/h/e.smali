.class public final Lkik/a/h/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lkik/a/h/e;


# instance fields
.field private b:Lkik/a/e/v;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method public static a()Lkik/a/h/e;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lkik/a/h/e;->a:Lkik/a/h/e;

    if-nez v0, :cond_0

    .line 23
    new-instance v0, Lkik/a/h/e;

    invoke-direct {v0}, Lkik/a/h/e;-><init>()V

    sput-object v0, Lkik/a/h/e;->a:Lkik/a/h/e;

    .line 25
    :cond_0
    sget-object v0, Lkik/a/h/e;->a:Lkik/a/h/e;

    return-object v0
.end method


# virtual methods
.method public final a(Lkik/a/e/v;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lkik/a/h/e;->b:Lkik/a/e/v;

    .line 31
    return-void
.end method

.method public final a(Lkik/a/d/d;)Z
    .locals 2

    .prologue
    .line 35
    iget-object v0, p0, Lkik/a/h/e;->b:Lkik/a/e/v;

    invoke-virtual {p1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/v;->t(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final a(Lkik/a/d/o;)[B
    .locals 2

    .prologue
    .line 40
    instance-of v0, p1, Lkik/a/d/d;

    if-eqz v0, :cond_2

    .line 41
    invoke-virtual {p1}, Lkik/a/d/o;->c()[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p1}, Lkik/a/d/o;->c()[B

    move-result-object v0

    .line 52
    :goto_0
    return-object v0

    :cond_0
    move-object v0, p1

    .line 44
    check-cast v0, Lkik/a/d/d;

    invoke-virtual {v0}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lkik/a/h/e;->b:Lkik/a/e/v;

    check-cast p1, Lkik/a/d/d;

    invoke-virtual {p1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/v;->x(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_0

    .line 48
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p1}, Lkik/a/d/o;->c()[B

    move-result-object v0

    goto :goto_0
.end method
