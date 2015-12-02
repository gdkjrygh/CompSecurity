.class public Lcom/facebook/mqtt/t;
.super Ljava/lang/Object;
.source "MqttConfig.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZ)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/mqtt/t;->a:Ljava/lang/String;

    .line 19
    iput p2, p0, Lcom/facebook/mqtt/t;->b:I

    .line 20
    iput p3, p0, Lcom/facebook/mqtt/t;->c:I

    .line 21
    iput-boolean p4, p0, Lcom/facebook/mqtt/t;->d:Z

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/mqtt/t;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/facebook/mqtt/t;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/facebook/mqtt/t;->c:I

    return v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/facebook/mqtt/t;->d:Z

    return v0
.end method
