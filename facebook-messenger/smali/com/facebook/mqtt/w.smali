.class public Lcom/facebook/mqtt/w;
.super Ljava/lang/Object;
.source "MqttParameters.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Lcom/facebook/mqtt/t;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:Lcom/fasterxml/jackson/databind/node/ObjectNode;


# direct methods
.method public constructor <init>(Lcom/facebook/mqtt/t;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILcom/fasterxml/jackson/databind/node/ObjectNode;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/facebook/mqtt/w;->a:Lcom/facebook/mqtt/t;

    .line 57
    iput-object p2, p0, Lcom/facebook/mqtt/w;->b:Ljava/lang/String;

    .line 58
    iput-object p3, p0, Lcom/facebook/mqtt/w;->c:Ljava/lang/String;

    .line 59
    iput-object p4, p0, Lcom/facebook/mqtt/w;->d:Ljava/lang/String;

    .line 60
    iput-object p5, p0, Lcom/facebook/mqtt/w;->e:Ljava/lang/String;

    .line 61
    iput p6, p0, Lcom/facebook/mqtt/w;->f:I

    .line 62
    iput p7, p0, Lcom/facebook/mqtt/w;->g:I

    .line 63
    iput p8, p0, Lcom/facebook/mqtt/w;->h:I

    .line 64
    iput p9, p0, Lcom/facebook/mqtt/w;->i:I

    .line 65
    iput-object p10, p0, Lcom/facebook/mqtt/w;->j:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 66
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/mqtt/t;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/mqtt/w;->a:Lcom/facebook/mqtt/t;

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 73
    const/4 v0, 0x1

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/mqtt/w;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/mqtt/w;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/mqtt/w;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/mqtt/w;->e:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/facebook/mqtt/w;->f:I

    return v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 100
    iget v0, p0, Lcom/facebook/mqtt/w;->g:I

    return v0
.end method

.method public i()I
    .locals 1

    .prologue
    .line 107
    iget v0, p0, Lcom/facebook/mqtt/w;->h:I

    return v0
.end method

.method public j()I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/facebook/mqtt/w;->i:I

    return v0
.end method

.method public k()Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/mqtt/w;->j:Lcom/fasterxml/jackson/databind/node/ObjectNode;

    return-object v0
.end method
