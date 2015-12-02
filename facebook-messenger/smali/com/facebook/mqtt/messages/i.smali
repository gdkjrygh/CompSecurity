.class public Lcom/facebook/mqtt/messages/i;
.super Ljava/lang/Object;
.source "FixedHeaderBuilder.java"


# instance fields
.field private a:Lcom/facebook/mqtt/messages/k;

.field private b:Z

.field private c:I

.field private d:Z

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/mqtt/messages/i;->e:I

    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/mqtt/messages/i;
    .locals 0

    .prologue
    .line 39
    iput p1, p0, Lcom/facebook/mqtt/messages/i;->c:I

    .line 40
    return-object p0
.end method

.method public a(Lcom/facebook/mqtt/messages/k;)Lcom/facebook/mqtt/messages/i;
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/facebook/mqtt/messages/i;->a:Lcom/facebook/mqtt/messages/k;

    .line 22
    return-object p0
.end method

.method public a(Z)Lcom/facebook/mqtt/messages/i;
    .locals 0

    .prologue
    .line 30
    iput-boolean p1, p0, Lcom/facebook/mqtt/messages/i;->b:Z

    .line 31
    return-object p0
.end method

.method public a()Lcom/facebook/mqtt/messages/k;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/facebook/mqtt/messages/i;->a:Lcom/facebook/mqtt/messages/k;

    return-object v0
.end method

.method public b(I)Lcom/facebook/mqtt/messages/i;
    .locals 0

    .prologue
    .line 57
    iput p1, p0, Lcom/facebook/mqtt/messages/i;->e:I

    .line 58
    return-object p0
.end method

.method public b(Z)Lcom/facebook/mqtt/messages/i;
    .locals 0

    .prologue
    .line 48
    iput-boolean p1, p0, Lcom/facebook/mqtt/messages/i;->d:Z

    .line 49
    return-object p0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/i;->b:Z

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/mqtt/messages/i;->c:I

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 44
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/i;->d:Z

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/facebook/mqtt/messages/i;->e:I

    return v0
.end method

.method public f()Lcom/facebook/mqtt/messages/h;
    .locals 1

    .prologue
    .line 62
    new-instance v0, Lcom/facebook/mqtt/messages/h;

    invoke-direct {v0, p0}, Lcom/facebook/mqtt/messages/h;-><init>(Lcom/facebook/mqtt/messages/i;)V

    return-object v0
.end method
