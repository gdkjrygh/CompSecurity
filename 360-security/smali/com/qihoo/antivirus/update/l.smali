.class public abstract Lcom/qihoo/antivirus/update/l;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/ab;


# instance fields
.field protected a:I

.field protected final b:[I

.field private final c:Landroid/content/Context;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/antivirus/update/l;->a:I

    .line 40
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/qihoo/antivirus/update/l;->b:[I

    .line 8
    iput-object p1, p0, Lcom/qihoo/antivirus/update/l;->c:Landroid/content/Context;

    .line 9
    iput-object p2, p0, Lcom/qihoo/antivirus/update/l;->d:Ljava/lang/String;

    .line 10
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lcom/qihoo/antivirus/update/l;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/qihoo/antivirus/update/l;->c:Landroid/content/Context;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move v0, v1

    .line 22
    :goto_0
    const/4 v3, 0x2

    if-lt v0, v3, :cond_0

    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 23
    :cond_0
    iget-object v3, p0, Lcom/qihoo/antivirus/update/l;->b:[I

    aget v3, v3, v0

    .line 24
    const-string/jumbo v4, "%02d"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v1

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
