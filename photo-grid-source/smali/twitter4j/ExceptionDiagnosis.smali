.class final Ltwitter4j/ExceptionDiagnosis;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x64cc93f854f97a4L


# instance fields
.field hexString:Ljava/lang/String;

.field lineNumberHash:I

.field stackLineHash:I

.field th:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Ltwitter4j/ExceptionDiagnosis;-><init>(Ljava/lang/Throwable;[Ljava/lang/String;)V

    .line 32
    return-void
.end method

.method constructor <init>(Ljava/lang/Throwable;[Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string v0, ""

    iput-object v0, p0, Ltwitter4j/ExceptionDiagnosis;->hexString:Ljava/lang/String;

    .line 35
    iput-object p1, p0, Ltwitter4j/ExceptionDiagnosis;->th:Ljava/lang/Throwable;

    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    .line 38
    iput v1, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    .line 39
    iput v1, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    .line 40
    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    move v2, v0

    :goto_0
    if-ltz v2, :cond_2

    .line 41
    aget-object v4, v3, v2

    .line 42
    array-length v5, p2

    move v0, v1

    :goto_1
    if-ge v0, v5, :cond_0

    aget-object v6, p2, v0

    .line 43
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 44
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    add-int/2addr v0, v5

    .line 45
    iget v5, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    mul-int/lit8 v5, v5, 0x1f

    add-int/2addr v0, v5

    iput v0, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    .line 46
    iget v0, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    add-int/2addr v0, v4

    iput v0, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    .line 40
    :cond_0
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_0

    .line 42
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 51
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/ExceptionDiagnosis;->hexString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    invoke-direct {p0, v1}, Ltwitter4j/ExceptionDiagnosis;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    invoke-direct {p0, v1}, Ltwitter4j/ExceptionDiagnosis;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/ExceptionDiagnosis;->hexString:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ltwitter4j/ExceptionDiagnosis;->hexString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ltwitter4j/ExceptionDiagnosis;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {v1, v2, p2}, Ltwitter4j/ExceptionDiagnosis;-><init>(Ljava/lang/Throwable;[Ljava/lang/String;)V

    invoke-virtual {v1}, Ltwitter4j/ExceptionDiagnosis;->asHexString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltwitter4j/ExceptionDiagnosis;->hexString:Ljava/lang/String;

    .line 56
    :cond_3
    return-void
.end method

.method private toHexString(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0000000"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x8

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method final asHexString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Ltwitter4j/ExceptionDiagnosis;->hexString:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 86
    if-ne p0, p1, :cond_1

    .line 94
    :cond_0
    :goto_0
    return v0

    .line 87
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

    .line 89
    :cond_3
    check-cast p1, Ltwitter4j/ExceptionDiagnosis;

    .line 91
    iget v2, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    iget v3, p1, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 92
    :cond_4
    iget v2, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    iget v3, p1, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method final getLineNumberHash()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    return v0
.end method

.method final getLineNumberHashAsHex()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget v0, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    invoke-direct {p0, v0}, Ltwitter4j/ExceptionDiagnosis;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final getStackLineHash()I
    .locals 1

    .prologue
    .line 60
    iget v0, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    return v0
.end method

.method final getStackLineHashAsHex()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget v0, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    invoke-direct {p0, v0}, Ltwitter4j/ExceptionDiagnosis;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 99
    iget v0, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    .line 100
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    add-int/2addr v0, v1

    .line 101
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ExceptionDiagnosis{stackLineHash="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ltwitter4j/ExceptionDiagnosis;->stackLineHash:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lineNumberHash="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltwitter4j/ExceptionDiagnosis;->lineNumberHash:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
