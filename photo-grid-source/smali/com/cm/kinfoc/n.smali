.class public final Lcom/cm/kinfoc/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field private final b:Ljava/lang/String;

.field private c:Lcom/cm/kinfoc/ah;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const-string v0, "http://helpgrid1.ksmobile.com/c/"

    iput-object v0, p0, Lcom/cm/kinfoc/n;->b:Ljava/lang/String;

    .line 27
    iput-boolean v3, p0, Lcom/cm/kinfoc/n;->a:Z

    .line 31
    :try_start_0
    new-instance v0, Lcom/cm/kinfoc/ah;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/cm/kinfoc/a/e;->c()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-char v2, Ljava/io/File;->separatorChar:C

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "kctrl.dat"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cm/kinfoc/ah;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/cm/kinfoc/n;->c:Lcom/cm/kinfoc/ah;

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cm/kinfoc/n;->a:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :goto_0
    return-void

    .line 34
    :catch_0
    move-exception v0

    .line 35
    iput-boolean v3, p0, Lcom/cm/kinfoc/n;->a:Z

    .line 36
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 41
    iget-boolean v1, p0, Lcom/cm/kinfoc/n;->a:Z

    if-eqz v1, :cond_0

    .line 42
    iget-object v1, p0, Lcom/cm/kinfoc/n;->c:Lcom/cm/kinfoc/ah;

    const-string v2, "common"

    const-string v3, "product"

    invoke-virtual {v1, v2, v3, v0}, Lcom/cm/kinfoc/ah;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 44
    :cond_0
    return v0
.end method

.method public final a(Ljava/lang/String;)I
    .locals 3

    .prologue
    const/16 v0, 0x2710

    .line 58
    iget-boolean v1, p0, Lcom/cm/kinfoc/n;->a:Z

    if-eqz v1, :cond_0

    .line 59
    iget-object v1, p0, Lcom/cm/kinfoc/n;->c:Lcom/cm/kinfoc/ah;

    const-string v2, "probability"

    invoke-virtual {v1, p1, v2, v0}, Lcom/cm/kinfoc/ah;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 63
    :cond_0
    return v0
.end method

.method public final a(I)Ljava/lang/String;
    .locals 4

    .prologue
    .line 120
    iget-boolean v0, p0, Lcom/cm/kinfoc/n;->a:Z

    if-eqz v0, :cond_0

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "server"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 123
    iget-object v1, p0, Lcom/cm/kinfoc/n;->c:Lcom/cm/kinfoc/ah;

    const-string v2, "common"

    const-string v3, "http://helpgrid1.ksmobile.com/c/"

    invoke-virtual {v1, v2, v0, v3}, Lcom/cm/kinfoc/ah;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 125
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "http://helpgrid1.ksmobile.com/c/"

    goto :goto_0
.end method

.method public final b()I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 49
    iget-boolean v1, p0, Lcom/cm/kinfoc/n;->a:Z

    if-eqz v1, :cond_0

    .line 50
    iget-object v1, p0, Lcom/cm/kinfoc/n;->c:Lcom/cm/kinfoc/ah;

    const-string v2, "common"

    const-string v3, "validity"

    invoke-virtual {v1, v2, v3, v0}, Lcom/cm/kinfoc/ah;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 52
    :cond_0
    return v0
.end method

.method public final b(Ljava/lang/String;)I
    .locals 3

    .prologue
    const/16 v0, 0x2710

    .line 69
    iget-boolean v1, p0, Lcom/cm/kinfoc/n;->a:Z

    if-eqz v1, :cond_0

    .line 70
    iget-object v1, p0, Lcom/cm/kinfoc/n;->c:Lcom/cm/kinfoc/ah;

    const-string v2, "userprobability"

    invoke-virtual {v1, p1, v2, v0}, Lcom/cm/kinfoc/ah;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 74
    :cond_0
    return v0
.end method
