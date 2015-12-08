.class public final Lcom/kik/cards/usermedia/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Long;

.field private b:I


# direct methods
.method public constructor <init>(Ljava/lang/Long;I)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    .line 53
    iput p2, p0, Lcom/kik/cards/usermedia/q;->b:I

    .line 54
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 63
    iget v0, p0, Lcom/kik/cards/usermedia/q;->b:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 26
    if-ne p0, p1, :cond_1

    .line 47
    :cond_0
    :goto_0
    return v0

    .line 29
    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    .line 30
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    .line 33
    goto :goto_0

    .line 35
    :cond_3
    check-cast p1, Lcom/kik/cards/usermedia/q;

    .line 36
    iget-object v2, p0, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    if-nez v2, :cond_4

    .line 37
    iget-object v2, p1, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    if-eqz v2, :cond_5

    move v0, v1

    .line 38
    goto :goto_0

    .line 41
    :cond_4
    iget-object v2, p0, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    iget-object v3, p1, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    invoke-virtual {v2, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    .line 42
    goto :goto_0

    .line 44
    :cond_5
    iget v2, p0, Lcom/kik/cards/usermedia/q;->b:I

    iget v3, p1, Lcom/kik/cards/usermedia/q;->b:I

    if-eq v2, v3, :cond_0

    move v0, v1

    .line 45
    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 16
    iget-object v0, p0, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1f

    .line 19
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/kik/cards/usermedia/q;->b:I

    add-int/2addr v0, v1

    .line 20
    return v0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/usermedia/q;->a:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->hashCode()I

    move-result v0

    goto :goto_0
.end method
