.class public Lcom/qihoo/antivirus/update/s;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:J

.field private j:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;JILjava/lang/String;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/qihoo/antivirus/update/s;->b:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/qihoo/antivirus/update/s;->c:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lcom/qihoo/antivirus/update/s;->d:Ljava/lang/String;

    .line 21
    iput-wide p4, p0, Lcom/qihoo/antivirus/update/s;->e:J

    .line 22
    iput p6, p0, Lcom/qihoo/antivirus/update/s;->f:I

    .line 23
    iput-object p7, p0, Lcom/qihoo/antivirus/update/s;->g:Ljava/lang/String;

    .line 24
    iput-object p8, p0, Lcom/qihoo/antivirus/update/s;->h:Ljava/lang/String;

    .line 25
    iput-wide p9, p0, Lcom/qihoo/antivirus/update/s;->i:J

    .line 26
    iput p11, p0, Lcom/qihoo/antivirus/update/s;->j:I

    .line 27
    iput-object p12, p0, Lcom/qihoo/antivirus/update/s;->a:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/qihoo/antivirus/update/s;->j:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/antivirus/update/s;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/antivirus/update/s;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/qihoo/antivirus/update/s;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 53
    iget-wide v0, p0, Lcom/qihoo/antivirus/update/s;->e:J

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/qihoo/antivirus/update/s;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/antivirus/update/s;->h:Ljava/lang/String;

    return-object v0
.end method

.method public h()J
    .locals 2

    .prologue
    .line 65
    iget-wide v0, p0, Lcom/qihoo/antivirus/update/s;->i:J

    return-wide v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 69
    iget v0, p0, Lcom/qihoo/antivirus/update/s;->f:I

    return v0
.end method

.method public j()I
    .locals 2

    .prologue
    .line 74
    const/4 v0, 0x0

    .line 76
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/antivirus/update/s;->a:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 80
    :goto_0
    return v0

    .line 77
    :catch_0
    move-exception v1

    goto :goto_0
.end method
