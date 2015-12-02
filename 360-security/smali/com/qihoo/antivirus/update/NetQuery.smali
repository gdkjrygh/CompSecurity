.class public Lcom/qihoo/antivirus/update/NetQuery;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field final a:Landroid/content/Context;

.field private b:Lcom/qihoo/antivirus/update/z;

.field private final c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/NetQuery;->b:Lcom/qihoo/antivirus/update/z;

    .line 65
    iput-object p1, p0, Lcom/qihoo/antivirus/update/NetQuery;->a:Landroid/content/Context;

    .line 66
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/NetQuery;->nt1()I

    move-result v0

    iput v0, p0, Lcom/qihoo/antivirus/update/NetQuery;->c:I

    .line 67
    return-void
.end method

.method private native nt1()I
.end method

.method private native nt2(I)I
.end method

.method private native nt3(ILjava/lang/String;Ljava/lang/Object;)I
.end method

.method private native nt6(ILjava/lang/String;I[Ljava/lang/String;)I
.end method


# virtual methods
.method public RequestCallback(Ljava/lang/String;Ljava/lang/String;[BI)[B
    .locals 2

    .prologue
    .line 157
    iget-object v0, p0, Lcom/qihoo/antivirus/update/NetQuery;->b:Lcom/qihoo/antivirus/update/z;

    if-nez v0, :cond_0

    .line 158
    new-instance v0, Lcom/qihoo/antivirus/update/p;

    iget-object v1, p0, Lcom/qihoo/antivirus/update/NetQuery;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/antivirus/update/p;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/antivirus/update/NetQuery;->b:Lcom/qihoo/antivirus/update/z;

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/NetQuery;->b:Lcom/qihoo/antivirus/update/z;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/qihoo/antivirus/update/z;->a(Ljava/lang/String;Ljava/lang/String;[BI)[B

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;I[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 122
    iget v0, p0, Lcom/qihoo/antivirus/update/NetQuery;->c:I

    if-nez v0, :cond_0

    .line 123
    const/4 v0, -0x2

    .line 125
    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/antivirus/update/NetQuery;->c:I

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/qihoo/antivirus/update/NetQuery;->nt6(ILjava/lang/String;I[Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 73
    iget v1, p0, Lcom/qihoo/antivirus/update/NetQuery;->c:I

    if-nez v1, :cond_1

    .line 76
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/qihoo/antivirus/update/NetQuery;->c:I

    invoke-direct {p0, v1}, Lcom/qihoo/antivirus/update/NetQuery;->nt2(I)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 83
    iget v1, p0, Lcom/qihoo/antivirus/update/NetQuery;->c:I

    if-nez v1, :cond_1

    .line 86
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/qihoo/antivirus/update/NetQuery;->c:I

    invoke-direct {p0, v1, p1, p2}, Lcom/qihoo/antivirus/update/NetQuery;->nt3(ILjava/lang/String;Ljava/lang/Object;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method
