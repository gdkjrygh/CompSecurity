.class public final Lkik/a/d/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/a/d/h;-><init>(Ljava/lang/String;B)V

    .line 19
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;B)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lkik/a/d/h;->a:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/d/h;->c:Z

    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lkik/a/d/h;->a:Ljava/lang/String;

    .line 41
    iput-boolean p2, p0, Lkik/a/d/h;->c:Z

    .line 42
    iput-object p3, p0, Lkik/a/d/h;->b:Ljava/lang/String;

    .line 43
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lkik/a/d/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lkik/a/d/h;->b:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 67
    iput-boolean p1, p0, Lkik/a/d/h;->c:Z

    .line 68
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lkik/a/d/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 57
    iget-boolean v0, p0, Lkik/a/d/h;->c:Z

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 81
    instance-of v0, p1, Lkik/a/d/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/h;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/h;->a:Ljava/lang/String;

    check-cast p1, Lkik/a/d/h;

    iget-object v1, p1, Lkik/a/d/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lkik/a/d/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
