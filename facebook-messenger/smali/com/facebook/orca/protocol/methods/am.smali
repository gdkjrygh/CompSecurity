.class public Lcom/facebook/orca/protocol/methods/am;
.super Ljava/lang/Object;
.source "SendMessageMethod.java"


# instance fields
.field private final a:Lcom/facebook/messages/model/threads/Message;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/am;->a:Lcom/facebook/messages/model/threads/Message;

    .line 39
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/am;->b:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Lcom/facebook/orca/protocol/methods/am;->c:Ljava/lang/String;

    .line 41
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/protocol/methods/am;)Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/am;->a:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/protocol/methods/am;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/am;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/protocol/methods/am;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/am;->c:Ljava/lang/String;

    return-object v0
.end method
