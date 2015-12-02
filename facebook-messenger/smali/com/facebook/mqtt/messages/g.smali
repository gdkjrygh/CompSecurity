.class public Lcom/facebook/mqtt/messages/g;
.super Ljava/lang/Object;
.source "ConnectVariableHeaderBuilder.java"


# instance fields
.field private a:I

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:I

.field private f:Z

.field private g:Z

.field private h:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/facebook/mqtt/messages/g;->a:I

    return v0
.end method

.method public a(I)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 35
    iput p1, p0, Lcom/facebook/mqtt/messages/g;->a:I

    .line 36
    return-object p0
.end method

.method public a(Z)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 55
    iput-boolean p1, p0, Lcom/facebook/mqtt/messages/g;->b:Z

    .line 56
    return-object p0
.end method

.method public b(I)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 135
    iput p1, p0, Lcom/facebook/mqtt/messages/g;->e:I

    .line 136
    return-object p0
.end method

.method public b(Z)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 75
    iput-boolean p1, p0, Lcom/facebook/mqtt/messages/g;->c:Z

    .line 76
    return-object p0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/g;->b:Z

    return v0
.end method

.method public c(I)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 175
    iput p1, p0, Lcom/facebook/mqtt/messages/g;->h:I

    .line 176
    return-object p0
.end method

.method public c(Z)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 95
    iput-boolean p1, p0, Lcom/facebook/mqtt/messages/g;->f:Z

    .line 96
    return-object p0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 65
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/g;->c:Z

    return v0
.end method

.method public d(Z)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 115
    iput-boolean p1, p0, Lcom/facebook/mqtt/messages/g;->d:Z

    .line 116
    return-object p0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/g;->f:Z

    return v0
.end method

.method public e(Z)Lcom/facebook/mqtt/messages/g;
    .locals 0

    .prologue
    .line 155
    iput-boolean p1, p0, Lcom/facebook/mqtt/messages/g;->g:Z

    .line 156
    return-object p0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 105
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/g;->d:Z

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 125
    iget v0, p0, Lcom/facebook/mqtt/messages/g;->e:I

    return v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 145
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/g;->g:Z

    return v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 165
    iget v0, p0, Lcom/facebook/mqtt/messages/g;->h:I

    return v0
.end method

.method public i()Lcom/facebook/mqtt/messages/f;
    .locals 1

    .prologue
    .line 185
    new-instance v0, Lcom/facebook/mqtt/messages/f;

    invoke-direct {v0, p0}, Lcom/facebook/mqtt/messages/f;-><init>(Lcom/facebook/mqtt/messages/g;)V

    return-object v0
.end method
