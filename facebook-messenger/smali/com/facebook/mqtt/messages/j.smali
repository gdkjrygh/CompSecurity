.class public Lcom/facebook/mqtt/messages/j;
.super Ljava/lang/Object;
.source "MessageIdVariableHeader.java"


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lcom/facebook/mqtt/messages/j;->a:I

    .line 14
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 17
    iget v0, p0, Lcom/facebook/mqtt/messages/j;->a:I

    return v0
.end method
