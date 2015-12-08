.class Lcom/jirbo/adcolony/z;
.super Lcom/jirbo/adcolony/af;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/StringBuilder;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 4
    invoke-direct {p0}, Lcom/jirbo/adcolony/af;-><init>()V

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/z;->a:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static a([Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 29
    new-instance v0, Lcom/jirbo/adcolony/z;

    invoke-direct {v0}, Lcom/jirbo/adcolony/z;-><init>()V

    .line 30
    const-string v1, "A king who was mad at the time"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Ljava/lang/String;)V

    .line 31
    const-string v1, "Declared limerick writing a crime"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Ljava/lang/String;)V

    .line 32
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 33
    const-string v1, "So late in the night"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Ljava/lang/String;)V

    .line 34
    const-string v1, "All the poets would write"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Ljava/lang/String;)V

    .line 35
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, -0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 36
    const-string v1, "Verses without any rhyme or meter"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Lcom/jirbo/adcolony/z;->d()V

    .line 38
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x4

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 39
    const-string v1, "David\nGerrold"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Ljava/lang/String;)V

    .line 40
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 41
    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/z;->b(D)V

    .line 42
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 43
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/z;->b(D)V

    .line 44
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 45
    const-wide v2, -0x3f07949000000000L    # -100023.0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/z;->b(D)V

    .line 46
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 47
    const-wide/16 v2, -0x6

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/z;->c(J)V

    .line 48
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 49
    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/z;->c(J)V

    .line 50
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 51
    const-wide/16 v2, 0xea

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/z;->c(J)V

    .line 52
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 53
    const-wide/high16 v2, -0x8000000000000000L

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/z;->c(J)V

    .line 54
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 55
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Z)V

    .line 56
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 57
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/z;->b(Z)V

    .line 58
    iget v1, v0, Lcom/jirbo/adcolony/z;->i:I

    add-int/lit8 v1, v1, 0x2

    iput v1, v0, Lcom/jirbo/adcolony/z;->i:I

    .line 59
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 60
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 10
    iget-object v0, p0, Lcom/jirbo/adcolony/z;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 11
    iput v1, p0, Lcom/jirbo/adcolony/z;->i:I

    .line 12
    return-void
.end method

.method a(C)V
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/jirbo/adcolony/z;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/jirbo/adcolony/z;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
