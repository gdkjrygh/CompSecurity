.class public final Lorg/d/a/b;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field protected a:Ljava/lang/Throwable;

.field protected b:I

.field protected c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 24
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 14
    iput v0, p0, Lorg/d/a/b;->b:I

    .line 15
    iput v0, p0, Lorg/d/a/b;->c:I

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/d/a/a;Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-nez p1, :cond_1

    const-string v0, ""

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p2, :cond_2

    const-string v0, ""

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez p3, :cond_3

    const-string v0, ""

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 14
    iput v3, p0, Lorg/d/a/b;->b:I

    .line 15
    iput v3, p0, Lorg/d/a/b;->c:I

    .line 44
    if-eqz p2, :cond_0

    .line 45
    invoke-interface {p2}, Lorg/d/a/a;->getLineNumber()I

    move-result v0

    iput v0, p0, Lorg/d/a/b;->b:I

    .line 46
    invoke-interface {p2}, Lorg/d/a/a;->getColumnNumber()I

    move-result v0

    iput v0, p0, Lorg/d/a/b;->c:I

    .line 48
    :cond_0
    iput-object p3, p0, Lorg/d/a/b;->a:Ljava/lang/Throwable;

    .line 49
    return-void

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "(position:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Lorg/d/a/a;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ") "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "caused by: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2
.end method


# virtual methods
.method public final getColumnNumber()I
    .locals 1

    .prologue
    .line 64
    iget v0, p0, Lorg/d/a/b;->c:I

    return v0
.end method

.method public final getDetail()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lorg/d/a/b;->a:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final getLineNumber()I
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lorg/d/a/b;->b:I

    return v0
.end method

.method public final printStackTrace()V
    .locals 4

    .prologue
    .line 81
    iget-object v0, p0, Lorg/d/a/b;->a:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    .line 82
    invoke-super {p0}, Ljava/lang/Exception;->printStackTrace()V

    .line 88
    :goto_0
    return-void

    .line 85
    :cond_0
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    monitor-enter v1

    .line 86
    :try_start_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; nested exception is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 87
    iget-object v0, p0, Lorg/d/a/b;->a:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
