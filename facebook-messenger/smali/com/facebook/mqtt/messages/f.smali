.class public Lcom/facebook/mqtt/messages/f;
.super Ljava/lang/Object;
.source "ConnectVariableHeader.java"


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:I

.field private final f:Z

.field private final g:Z

.field private final h:I


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/messages/g;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->a()I

    move-result v0

    iput v0, p0, Lcom/facebook/mqtt/messages/f;->a:I

    .line 21
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->b:Z

    .line 22
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->c:Z

    .line 23
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->d:Z

    .line 24
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->f()I

    move-result v0

    iput v0, p0, Lcom/facebook/mqtt/messages/f;->e:I

    .line 25
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->f:Z

    .line 26
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->g()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->g:Z

    .line 27
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/g;->h()I

    move-result v0

    iput v0, p0, Lcom/facebook/mqtt/messages/f;->h:I

    .line 28
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/facebook/mqtt/messages/f;->a:I

    return v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->b:Z

    return v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->c:Z

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->f:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 72
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->d:Z

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 81
    iget v0, p0, Lcom/facebook/mqtt/messages/f;->e:I

    return v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/f;->g:Z

    return v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 99
    iget v0, p0, Lcom/facebook/mqtt/messages/f;->h:I

    return v0
.end method
