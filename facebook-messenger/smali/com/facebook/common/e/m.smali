.class public Lcom/facebook/common/e/m;
.super Ljava/lang/Object;
.source "SoftError.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Throwable;

.field private final d:Z

.field private final e:I

.field private final f:Z


# direct methods
.method constructor <init>(Lcom/facebook/common/e/n;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Lcom/facebook/common/e/n;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/e/m;->a:Ljava/lang/String;

    .line 29
    invoke-virtual {p1}, Lcom/facebook/common/e/n;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/e/m;->b:Ljava/lang/String;

    .line 30
    invoke-virtual {p1}, Lcom/facebook/common/e/n;->c()Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/e/m;->c:Ljava/lang/Throwable;

    .line 31
    invoke-virtual {p1}, Lcom/facebook/common/e/n;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/common/e/m;->d:Z

    .line 32
    invoke-virtual {p1}, Lcom/facebook/common/e/n;->e()I

    move-result v0

    iput v0, p0, Lcom/facebook/common/e/m;->e:I

    .line 33
    invoke-virtual {p1}, Lcom/facebook/common/e/n;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/common/e/m;->f:Z

    .line 34
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;
    .locals 1

    .prologue
    .line 44
    new-instance v0, Lcom/facebook/common/e/n;

    invoke-direct {v0}, Lcom/facebook/common/e/n;-><init>()V

    invoke-virtual {v0, p0}, Lcom/facebook/common/e/n;->a(Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/common/e/n;->b(Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/m;
    .locals 1

    .prologue
    .line 55
    new-instance v0, Lcom/facebook/common/e/n;

    invoke-direct {v0}, Lcom/facebook/common/e/n;-><init>()V

    invoke-virtual {v0, p0}, Lcom/facebook/common/e/n;->a(Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/common/e/n;->b(Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/common/e/m;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/common/e/m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/common/e/m;->c:Ljava/lang/Throwable;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 94
    iget-boolean v0, p0, Lcom/facebook/common/e/m;->d:Z

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 107
    iget v0, p0, Lcom/facebook/common/e/m;->e:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 122
    if-ne p0, p1, :cond_1

    .line 134
    :cond_0
    :goto_0
    return v0

    .line 123
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 125
    :cond_3
    check-cast p1, Lcom/facebook/common/e/m;

    .line 127
    iget-boolean v2, p0, Lcom/facebook/common/e/m;->d:Z

    iget-boolean v3, p1, Lcom/facebook/common/e/m;->d:Z

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 128
    :cond_4
    iget-boolean v2, p0, Lcom/facebook/common/e/m;->f:Z

    iget-boolean v3, p1, Lcom/facebook/common/e/m;->f:Z

    if-eq v2, v3, :cond_5

    move v0, v1

    goto :goto_0

    .line 129
    :cond_5
    iget v2, p0, Lcom/facebook/common/e/m;->e:I

    iget v3, p1, Lcom/facebook/common/e/m;->e:I

    if-eq v2, v3, :cond_6

    move v0, v1

    goto :goto_0

    .line 130
    :cond_6
    iget-object v2, p0, Lcom/facebook/common/e/m;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/common/e/m;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    move v0, v1

    goto :goto_0

    .line 131
    :cond_7
    iget-object v2, p0, Lcom/facebook/common/e/m;->c:Ljava/lang/Throwable;

    iget-object v3, p1, Lcom/facebook/common/e/m;->c:Ljava/lang/Throwable;

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    move v0, v1

    goto :goto_0

    .line 132
    :cond_8
    iget-object v2, p0, Lcom/facebook/common/e/m;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/common/e/m;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 117
    iget-boolean v0, p0, Lcom/facebook/common/e/m;->f:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 139
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/common/e/m;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/facebook/common/e/m;->b:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-boolean v2, p0, Lcom/facebook/common/e/m;->d:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget v2, p0, Lcom/facebook/common/e/m;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/common/base/Objects;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
