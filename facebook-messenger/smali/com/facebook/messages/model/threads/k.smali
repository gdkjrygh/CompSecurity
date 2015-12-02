.class public Lcom/facebook/messages/model/threads/k;
.super Ljava/lang/Object;
.source "TitanAttachmentInfoBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/facebook/messages/model/threads/k;
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/facebook/messages/model/threads/k;->b:I

    .line 35
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;)Lcom/facebook/messages/model/threads/k;
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/facebook/messages/model/threads/k;->f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    .line 71
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/k;
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/messages/model/threads/k;->a:Ljava/lang/String;

    .line 26
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/messages/model/threads/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 30
    iget v0, p0, Lcom/facebook/messages/model/threads/k;->b:I

    return v0
.end method

.method public b(I)Lcom/facebook/messages/model/threads/k;
    .locals 0

    .prologue
    .line 61
    iput p1, p0, Lcom/facebook/messages/model/threads/k;->e:I

    .line 62
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/k;
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/messages/model/threads/k;->c:Ljava/lang/String;

    .line 44
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/k;
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/messages/model/threads/k;->d:Ljava/lang/String;

    .line 53
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/messages/model/threads/k;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/messages/model/threads/k;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lcom/facebook/messages/model/threads/k;->e:I

    return v0
.end method

.method public f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/messages/model/threads/k;->f:Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    return-object v0
.end method

.method public g()Lcom/facebook/messages/model/threads/TitanAttachmentInfo;
    .locals 1

    .prologue
    .line 75
    new-instance v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    invoke-direct {v0, p0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;-><init>(Lcom/facebook/messages/model/threads/k;)V

    return-object v0
.end method
