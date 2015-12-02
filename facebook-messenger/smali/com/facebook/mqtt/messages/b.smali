.class public Lcom/facebook/mqtt/messages/b;
.super Ljava/lang/Object;
.source "ConnAckVariableHeader.java"


# instance fields
.field private final a:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-byte p1, p0, Lcom/facebook/mqtt/messages/b;->a:B

    .line 19
    return-void
.end method


# virtual methods
.method public a()B
    .locals 1

    .prologue
    .line 27
    iget-byte v0, p0, Lcom/facebook/mqtt/messages/b;->a:B

    return v0
.end method
