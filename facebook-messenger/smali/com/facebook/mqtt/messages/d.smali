.class public Lcom/facebook/mqtt/messages/d;
.super Ljava/lang/Object;
.source "ConnectPayload.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/messages/e;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/e;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/mqtt/messages/d;->a:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/e;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/mqtt/messages/d;->b:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/e;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/mqtt/messages/d;->c:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/e;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/mqtt/messages/d;->d:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Lcom/facebook/mqtt/messages/e;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/mqtt/messages/d;->e:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/mqtt/messages/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/mqtt/messages/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/mqtt/messages/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/mqtt/messages/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/mqtt/messages/d;->e:Ljava/lang/String;

    return-object v0
.end method
