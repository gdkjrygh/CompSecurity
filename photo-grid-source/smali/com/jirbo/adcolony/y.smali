.class Lcom/jirbo/adcolony/y;
.super Lcom/jirbo/adcolony/af;
.source "SourceFile"


# static fields
.field static final a:I = 0x400


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/io/OutputStream;

.field d:[B

.field e:I

.field f:I

.field g:I


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/jirbo/adcolony/af;-><init>()V

    .line 12
    const/16 v0, 0x400

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/jirbo/adcolony/y;->d:[B

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/y;->e:I

    .line 19
    iput-object p1, p0, Lcom/jirbo/adcolony/y;->b:Ljava/lang/String;

    .line 21
    sget v0, Lcom/jirbo/adcolony/a;->n:I

    if-eqz v0, :cond_0

    .line 23
    const/16 v0, 0x17

    iput v0, p0, Lcom/jirbo/adcolony/y;->g:I

    .line 24
    iget v0, p0, Lcom/jirbo/adcolony/y;->g:I

    iput v0, p0, Lcom/jirbo/adcolony/y;->f:I

    .line 29
    :cond_0
    :try_start_0
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->f:Lcom/jirbo/adcolony/ADCStorage;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->f:Lcom/jirbo/adcolony/ADCStorage;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCStorage;->b()V

    .line 30
    :cond_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    :goto_0
    return-void

    .line 32
    :catch_0
    move-exception v0

    .line 34
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/y;->a(Ljava/io/IOException;)V

    goto :goto_0
.end method

.method constructor <init>(Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/jirbo/adcolony/af;-><init>()V

    .line 12
    const/16 v0, 0x400

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/jirbo/adcolony/y;->d:[B

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/y;->e:I

    .line 40
    iput-object p1, p0, Lcom/jirbo/adcolony/y;->b:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;

    .line 42
    return-void
.end method

.method public static a([Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 101
    new-instance v0, Lcom/jirbo/adcolony/y;

    const-string v1, "test.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/y;-><init>(Ljava/lang/String;)V

    .line 102
    const-string v1, "A king who was mad at the time"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    .line 103
    const-string v1, "Declared limerick writing a crime"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    .line 104
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 105
    const-string v1, "So late in the night"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    .line 106
    const-string v1, "All the poets would write"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    .line 107
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, -0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 108
    const-string v1, "Verses without any rhyme or meter"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->d()V

    .line 110
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x4

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 111
    const-string v1, "David\nGerrold"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Ljava/lang/String;)V

    .line 112
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 113
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/y;->b(D)V

    .line 114
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 115
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/y;->b(D)V

    .line 116
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 117
    const-wide v2, -0x3f07949000000000L    # -100023.0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/y;->b(D)V

    .line 118
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 119
    const-wide/16 v2, -0x6

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/y;->c(J)V

    .line 120
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 121
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/y;->c(J)V

    .line 122
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 123
    const-wide/16 v2, 0xea

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/y;->c(J)V

    .line 124
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 125
    const-wide/high16 v2, -0x8000000000000000L

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/y;->c(J)V

    .line 126
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 127
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Z)V

    .line 128
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 129
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/y;->b(Z)V

    .line 130
    iget v1, v0, Lcom/jirbo/adcolony/y;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/y;->i:I

    .line 131
    invoke-virtual {v0}, Lcom/jirbo/adcolony/y;->b()V

    .line 132
    return-void
.end method


# virtual methods
.method a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 53
    iget v0, p0, Lcom/jirbo/adcolony/y;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/jirbo/adcolony/y;->d:[B

    const/4 v2, 0x0

    iget v3, p0, Lcom/jirbo/adcolony/y;->e:I

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/y;->e:I

    .line 59
    iget-object v0, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    :cond_0
    :goto_0
    return-void

    .line 61
    :catch_0
    move-exception v0

    .line 63
    iput v4, p0, Lcom/jirbo/adcolony/y;->e:I

    .line 64
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/y;->a(Ljava/io/IOException;)V

    goto :goto_0
.end method

.method a(C)V
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/jirbo/adcolony/y;->d:[B

    iget v1, p0, Lcom/jirbo/adcolony/y;->e:I

    iget v2, p0, Lcom/jirbo/adcolony/y;->f:I

    xor-int/2addr v2, p1

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 47
    iget v0, p0, Lcom/jirbo/adcolony/y;->f:I

    iget v1, p0, Lcom/jirbo/adcolony/y;->g:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jirbo/adcolony/y;->f:I

    .line 48
    iget v0, p0, Lcom/jirbo/adcolony/y;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/jirbo/adcolony/y;->e:I

    const/16 v1, 0x400

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/y;->a()V

    .line 49
    :cond_0
    return-void
.end method

.method a(Ljava/io/IOException;)V
    .locals 2

    .prologue
    .line 89
    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "Error writing \""

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/y;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, "\":"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 90
    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 93
    invoke-virtual {p0}, Lcom/jirbo/adcolony/y;->b()V

    .line 94
    return-void
.end method

.method b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 71
    invoke-virtual {p0}, Lcom/jirbo/adcolony/y;->a()V

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    :cond_0
    :goto_0
    return-void

    .line 80
    :catch_0
    move-exception v0

    .line 82
    iput-object v1, p0, Lcom/jirbo/adcolony/y;->c:Ljava/io/OutputStream;

    .line 83
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/y;->a(Ljava/io/IOException;)V

    goto :goto_0
.end method
