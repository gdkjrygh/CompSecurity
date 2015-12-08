.class public abstract Lkik/a/f/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkik/a/f/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lkik/a/f/h;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public c()Lkik/a/f/g/c;
    .locals 1

    .prologue
    .line 51
    sget-object v0, Lkik/a/f/g/c;->b:Lkik/a/f/g/c;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 14
    const-string v0, "kik.com"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .prologue
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lkik/a/f/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-inactive."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lkik/a/f/h;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m()I
    .locals 2

    .prologue
    .line 33
    invoke-virtual {p0}, Lkik/a/f/h;->c()Lkik/a/f/g/c;

    move-result-object v0

    sget-object v1, Lkik/a/f/g/c;->b:Lkik/a/f/g/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lkik/a/f/h;->c()Lkik/a/f/g/c;

    move-result-object v0

    sget-object v1, Lkik/a/f/g/c;->d:Lkik/a/f/g/c;

    if-ne v0, v1, :cond_1

    .line 34
    :cond_0
    const/16 v0, 0x1467

    .line 36
    :goto_0
    return v0

    :cond_1
    const/16 v0, 0x1466

    goto :goto_0
.end method

.method public final n()I
    .locals 2

    .prologue
    .line 42
    invoke-virtual {p0}, Lkik/a/f/h;->c()Lkik/a/f/g/c;

    move-result-object v0

    sget-object v1, Lkik/a/f/g/c;->b:Lkik/a/f/g/c;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lkik/a/f/h;->c()Lkik/a/f/g/c;

    move-result-object v0

    sget-object v1, Lkik/a/f/g/c;->d:Lkik/a/f/g/c;

    if-ne v0, v1, :cond_1

    .line 43
    :cond_0
    const/16 v0, 0x1bb

    .line 45
    :goto_0
    return v0

    :cond_1
    const/16 v0, 0x50

    goto :goto_0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    const-string v0, "talk.kik.com"

    return-object v0
.end method
