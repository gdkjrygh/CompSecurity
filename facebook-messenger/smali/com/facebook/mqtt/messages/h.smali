.class public Lcom/facebook/mqtt/messages/h;
.super Ljava/lang/Object;
.source "FixedHeader.java"


# instance fields
.field private final a:Lcom/facebook/mqtt/messages/k;

.field private final b:Z

.field private final c:I

.field private final d:Z

.field private final e:I


# direct methods
.method constructor <init>(Lcom/facebook/mqtt/messages/i;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/i;->a()Lcom/facebook/mqtt/messages/k;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/mqtt/messages/h;->a:Lcom/facebook/mqtt/messages/k;

    .line 18
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/i;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/mqtt/messages/h;->b:Z

    .line 19
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/i;->c()I

    move-result v0

    iput v0, p0, Lcom/facebook/mqtt/messages/h;->c:I

    .line 20
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/i;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/mqtt/messages/h;->d:Z

    .line 21
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/i;->e()I

    move-result v0

    iput v0, p0, Lcom/facebook/mqtt/messages/h;->e:I

    .line 22
    return-void
.end method

.method public static newBuilder()Lcom/facebook/mqtt/messages/i;
    .locals 1

    .prologue
    .line 30
    new-instance v0, Lcom/facebook/mqtt/messages/i;

    invoke-direct {v0}, Lcom/facebook/mqtt/messages/i;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/messages/k;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/mqtt/messages/h;->a:Lcom/facebook/mqtt/messages/k;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/h;->b:Z

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lcom/facebook/mqtt/messages/h;->c:I

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 66
    iget-boolean v0, p0, Lcom/facebook/mqtt/messages/h;->d:Z

    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 75
    iget v0, p0, Lcom/facebook/mqtt/messages/h;->e:I

    return v0
.end method
