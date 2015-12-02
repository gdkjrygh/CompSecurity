.class public Lcom/facebook/mqtt/messages/e;
.super Ljava/lang/Object;
.source "ConnectPayloadBuilder.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/mqtt/messages/e;->a:Ljava/lang/String;

    .line 33
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/mqtt/messages/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/mqtt/messages/e;->b:Ljava/lang/String;

    .line 53
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/mqtt/messages/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/mqtt/messages/e;->c:Ljava/lang/String;

    .line 73
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/mqtt/messages/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/facebook/mqtt/messages/e;->d:Ljava/lang/String;

    .line 93
    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/mqtt/messages/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/facebook/mqtt/messages/e;
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/mqtt/messages/e;->e:Ljava/lang/String;

    .line 113
    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/mqtt/messages/e;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/facebook/mqtt/messages/d;
    .locals 1

    .prologue
    .line 122
    new-instance v0, Lcom/facebook/mqtt/messages/d;

    invoke-direct {v0, p0}, Lcom/facebook/mqtt/messages/d;-><init>(Lcom/facebook/mqtt/messages/e;)V

    return-object v0
.end method
