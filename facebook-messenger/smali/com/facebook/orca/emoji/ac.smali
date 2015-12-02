.class public Lcom/facebook/orca/emoji/ac;
.super Ljava/lang/Object;
.source "Emojis.java"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lcom/facebook/orca/emoji/ac;->a:I

    .line 27
    iput p2, p0, Lcom/facebook/orca/emoji/ac;->b:I

    .line 28
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 32
    if-ne p0, p1, :cond_1

    .line 40
    :cond_0
    :goto_0
    return v0

    .line 33
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

    .line 35
    :cond_3
    check-cast p1, Lcom/facebook/orca/emoji/ac;

    .line 37
    iget v2, p0, Lcom/facebook/orca/emoji/ac;->b:I

    iget v3, p1, Lcom/facebook/orca/emoji/ac;->b:I

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_0

    .line 38
    :cond_4
    iget v2, p0, Lcom/facebook/orca/emoji/ac;->a:I

    iget v3, p1, Lcom/facebook/orca/emoji/ac;->a:I

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 45
    iget v0, p0, Lcom/facebook/orca/emoji/ac;->a:I

    .line 46
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/facebook/orca/emoji/ac;->b:I

    add-int/2addr v0, v1

    .line 47
    return v0
.end method
