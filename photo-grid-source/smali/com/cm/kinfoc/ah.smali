.class public final Lcom/cm/kinfoc/ah;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Lcom/cm/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/cm/a/a",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Properties;",
            ">;"
        }
    .end annotation
.end field

.field private transient b:Ljava/lang/String;

.field private transient c:Ljava/util/Properties;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Lcom/cm/a/a;

    invoke-direct {v0}, Lcom/cm/a/a;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/ah;->a:Lcom/cm/a/a;

    .line 21
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 23
    invoke-direct {p0, v0}, Lcom/cm/kinfoc/ah;->a(Ljava/io/BufferedReader;)V

    .line 24
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 25
    return-void
.end method

.method private a(Ljava/io/BufferedReader;)V
    .locals 3

    .prologue
    .line 29
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1035
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 1036
    const-string v1, "\\[.*\\]"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1037
    const-string v1, "\\[(.*)\\]"

    const-string v2, "$1"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cm/kinfoc/ah;->b:Ljava/lang/String;

    .line 1038
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/ah;->c:Ljava/util/Properties;

    goto :goto_0

    .line 1039
    :cond_1
    const-string v1, ".*=.*"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1040
    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    .line 1041
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1042
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 1043
    iget-object v1, p0, Lcom/cm/kinfoc/ah;->c:Ljava/util/Properties;

    invoke-virtual {v1, v2, v0}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 1044
    iget-object v0, p0, Lcom/cm/kinfoc/ah;->a:Lcom/cm/a/a;

    iget-object v1, p0, Lcom/cm/kinfoc/ah;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/cm/kinfoc/ah;->c:Ljava/util/Properties;

    invoke-virtual {v0, v1, v2}, Lcom/cm/a/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 32
    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .prologue
    .line 51
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/cm/kinfoc/ah;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 55
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result p3

    .line 59
    :goto_0
    return p3

    .line 57
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/cm/kinfoc/ah;->a:Lcom/cm/a/a;

    invoke-virtual {v0, p1}, Lcom/cm/a/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Properties;

    .line 66
    if-nez v0, :cond_1

    .line 75
    :cond_0
    :goto_0
    return-object p3

    .line 70
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 72
    if-eqz v0, :cond_0

    move-object p3, v0

    goto :goto_0
.end method
