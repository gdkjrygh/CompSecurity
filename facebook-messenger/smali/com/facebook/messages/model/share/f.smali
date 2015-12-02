.class public Lcom/facebook/messages/model/share/f;
.super Ljava/lang/Object;
.source "ShareMediaPhotoBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/messages/model/share/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 57
    iput p1, p0, Lcom/facebook/messages/model/share/f;->e:I

    .line 58
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/messages/model/share/f;->a:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/messages/model/share/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 65
    iput p1, p0, Lcom/facebook/messages/model/share/f;->f:I

    .line 66
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/messages/model/share/f;->b:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/messages/model/share/f;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/messages/model/share/f;->c:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/messages/model/share/f;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcom/facebook/messages/model/share/f;->d:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public e()I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/facebook/messages/model/share/f;->e:I

    return v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lcom/facebook/messages/model/share/f;->f:I

    return v0
.end method

.method public g()Lcom/facebook/messages/model/share/ShareMediaPhoto;
    .locals 1

    .prologue
    .line 69
    new-instance v0, Lcom/facebook/messages/model/share/ShareMediaPhoto;

    invoke-direct {v0, p0}, Lcom/facebook/messages/model/share/ShareMediaPhoto;-><init>(Lcom/facebook/messages/model/share/f;)V

    return-object v0
.end method
