.class public Lcom/facebook/orca/emoji/c;
.super Ljava/lang/Object;
.source "Emoji.java"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lcom/facebook/orca/emoji/c;->a:I

    .line 24
    iput p2, p0, Lcom/facebook/orca/emoji/c;->b:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/emoji/c;->c:I

    .line 26
    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Lcom/facebook/orca/emoji/c;->a:I

    .line 40
    iput p2, p0, Lcom/facebook/orca/emoji/c;->b:I

    .line 41
    iput p3, p0, Lcom/facebook/orca/emoji/c;->c:I

    .line 42
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/facebook/orca/emoji/c;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lcom/facebook/orca/emoji/c;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/facebook/orca/emoji/c;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/c;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/c;->c()I

    move-result v1

    if-eqz v1, :cond_0

    .line 71
    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {p0}, Lcom/facebook/orca/emoji/c;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
