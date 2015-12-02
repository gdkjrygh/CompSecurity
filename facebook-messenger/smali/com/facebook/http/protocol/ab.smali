.class public abstract Lcom/facebook/http/protocol/ab;
.super Lcom/facebook/http/a/a/a/a/a;
.source "ContentBody.java"


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/http/a/a/a/a/a;-><init>(Ljava/lang/String;)V

    .line 19
    iput p2, p0, Lcom/facebook/http/protocol/ab;->a:I

    .line 20
    iput-object p3, p0, Lcom/facebook/http/protocol/ab;->b:Ljava/lang/String;

    .line 21
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/http/protocol/ab;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    const-string v0, "binary"

    return-object v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 48
    iget v0, p0, Lcom/facebook/http/protocol/ab;->a:I

    int-to-long v0, v0

    return-wide v0
.end method
