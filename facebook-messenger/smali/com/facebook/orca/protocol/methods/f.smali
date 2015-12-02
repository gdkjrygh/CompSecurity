.class public Lcom/facebook/orca/protocol/methods/f;
.super Ljava/lang/Object;
.source "CreateThreadMethod.java"


# instance fields
.field private final a:Lcom/facebook/orca/server/SendMessageByRecipientsParams;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/server/SendMessageByRecipientsParams;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/f;->a:Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    .line 40
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/f;->b:Ljava/lang/String;

    .line 41
    iput-object p3, p0, Lcom/facebook/orca/protocol/methods/f;->c:Ljava/lang/String;

    .line 42
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/protocol/methods/f;)Lcom/facebook/orca/server/SendMessageByRecipientsParams;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/f;->a:Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/protocol/methods/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/protocol/methods/f;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/f;->c:Ljava/lang/String;

    return-object v0
.end method
