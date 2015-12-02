.class public Lcom/facebook/messages/model/share/d;
.super Ljava/lang/Object;
.source "ShareMediaBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

.field private f:Lcom/facebook/messages/model/share/ShareMediaVideo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/share/ShareMediaPhoto;)Lcom/facebook/messages/model/share/d;
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/facebook/messages/model/share/d;->e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

    .line 65
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/share/ShareMediaVideo;)Lcom/facebook/messages/model/share/d;
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/messages/model/share/d;->f:Lcom/facebook/messages/model/share/ShareMediaVideo;

    .line 74
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/messages/model/share/d;->a:Ljava/lang/String;

    .line 29
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/messages/model/share/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/messages/model/share/d;->b:Ljava/lang/String;

    .line 38
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/messages/model/share/d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/messages/model/share/d;->c:Ljava/lang/String;

    .line 47
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/messages/model/share/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/messages/model/share/d;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/messages/model/share/d;->d:Ljava/lang/String;

    .line 56
    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/messages/model/share/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/facebook/messages/model/share/ShareMediaPhoto;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/messages/model/share/d;->e:Lcom/facebook/messages/model/share/ShareMediaPhoto;

    return-object v0
.end method

.method public f()Lcom/facebook/messages/model/share/ShareMediaVideo;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/messages/model/share/d;->f:Lcom/facebook/messages/model/share/ShareMediaVideo;

    return-object v0
.end method

.method public g()Lcom/facebook/messages/model/share/ShareMedia;
    .locals 1

    .prologue
    .line 78
    new-instance v0, Lcom/facebook/messages/model/share/ShareMedia;

    invoke-direct {v0, p0}, Lcom/facebook/messages/model/share/ShareMedia;-><init>(Lcom/facebook/messages/model/share/d;)V

    return-object v0
.end method
