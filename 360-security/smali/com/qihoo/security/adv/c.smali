.class public Lcom/qihoo/security/adv/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/qihoo/security/adv/c;",
        ">;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lcom/qihoo/security/adv/c;->b:I

    return v0
.end method

.method public a(Lcom/qihoo/security/adv/c;)I
    .locals 2

    .prologue
    .line 55
    iget v0, p0, Lcom/qihoo/security/adv/c;->a:I

    iget v1, p1, Lcom/qihoo/security/adv/c;->a:I

    if-le v0, v1, :cond_0

    .line 56
    const/4 v0, -0x1

    .line 60
    :goto_0
    return v0

    .line 57
    :cond_0
    iget v0, p0, Lcom/qihoo/security/adv/c;->a:I

    iget v1, p1, Lcom/qihoo/security/adv/c;->a:I

    if-ge v0, v1, :cond_1

    .line 58
    const/4 v0, 0x1

    goto :goto_0

    .line 60
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/qihoo/security/adv/c;->a:I

    .line 35
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/qihoo/security/adv/c;->c:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/adv/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 42
    iput p1, p0, Lcom/qihoo/security/adv/c;->b:I

    .line 43
    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 12
    check-cast p1, Lcom/qihoo/security/adv/c;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/adv/c;->a(Lcom/qihoo/security/adv/c;)I

    move-result v0

    return v0
.end method
