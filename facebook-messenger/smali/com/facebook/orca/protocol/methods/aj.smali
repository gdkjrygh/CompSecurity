.class public Lcom/facebook/orca/protocol/methods/aj;
.super Ljava/lang/Object;
.source "SendBroadcastMethod.java"


# instance fields
.field private final a:Lcom/facebook/orca/server/SendMessageByRecipientsParams;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/server/SendMessageByRecipientsParams;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/aj;->a:Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    .line 45
    iput-object p2, p0, Lcom/facebook/orca/protocol/methods/aj;->b:Ljava/lang/String;

    .line 46
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/protocol/methods/aj;)Lcom/facebook/orca/server/SendMessageByRecipientsParams;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/aj;->a:Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/protocol/methods/aj;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/protocol/methods/aj;->b:Ljava/lang/String;

    return-object v0
.end method
