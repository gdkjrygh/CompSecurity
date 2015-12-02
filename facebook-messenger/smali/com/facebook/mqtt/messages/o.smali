.class public Lcom/facebook/mqtt/messages/o;
.super Ljava/lang/Object;
.source "PublishVariableHeader.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/facebook/mqtt/messages/o;->a:Ljava/lang/String;

    .line 15
    iput p2, p0, Lcom/facebook/mqtt/messages/o;->b:I

    .line 16
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/mqtt/messages/o;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/facebook/mqtt/messages/o;->b:I

    return v0
.end method
