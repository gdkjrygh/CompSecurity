.class Lcom/jirbo/adcolony/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:[B


# instance fields
.field b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 7
    const/16 v0, 0x400

    new-array v0, v0, [B

    sput-object v0, Lcom/jirbo/adcolony/f;->a:[B

    return-void
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->f:Lcom/jirbo/adcolony/ADCStorage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCStorage;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/f;->b:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method a()Lcom/jirbo/adcolony/y;
    .locals 2

    .prologue
    .line 18
    new-instance v0, Lcom/jirbo/adcolony/y;

    iget-object v1, p0, Lcom/jirbo/adcolony/f;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/y;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 35
    invoke-virtual {p0}, Lcom/jirbo/adcolony/f;->a()Lcom/jirbo/adcolony/y;

    move-result-object v1

    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 37
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/jirbo/adcolony/y;->a(C)V

    .line 37
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v1}, Lcom/jirbo/adcolony/y;->b()V

    .line 42
    return-void
.end method

.method b()Lcom/jirbo/adcolony/s;
    .locals 3

    .prologue
    .line 25
    :try_start_0
    new-instance v0, Lcom/jirbo/adcolony/s;

    new-instance v1, Lcom/jirbo/adcolony/x;

    iget-object v2, p0, Lcom/jirbo/adcolony/f;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/jirbo/adcolony/x;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/s;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method c()V
    .locals 2

    .prologue
    .line 46
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jirbo/adcolony/f;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 47
    return-void
.end method
