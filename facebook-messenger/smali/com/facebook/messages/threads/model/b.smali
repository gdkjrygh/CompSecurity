.class public Lcom/facebook/messages/threads/model/b;
.super Ljava/lang/Object;
.source "ThreadViewSpec.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/user/UserIdentifierKey;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/facebook/user/UserIdentifierKey;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    .line 44
    iput-object p2, p0, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    .line 45
    return-void
.end method

.method public static a(Lcom/facebook/user/UserIdentifierKey;)Lcom/facebook/messages/threads/model/b;
    .locals 2

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/messages/threads/model/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/facebook/messages/threads/model/b;-><init>(Ljava/lang/String;Lcom/facebook/user/UserIdentifierKey;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/facebook/user/UserIdentifierKey;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 57
    if-ne p0, p1, :cond_1

    .line 68
    :cond_0
    :goto_0
    return v0

    .line 58
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 60
    :cond_3
    check-cast p1, Lcom/facebook/messages/threads/model/b;

    .line 62
    iget-object v2, p0, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_4
    move v0, v1

    .line 63
    goto :goto_0

    .line 62
    :cond_5
    iget-object v2, p1, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 64
    :cond_6
    iget-object v2, p0, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    iget-object v3, p1, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    invoke-virtual {v2, v3}, Lcom/facebook/user/UserIdentifierKey;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 66
    goto :goto_0

    .line 64
    :cond_7
    iget-object v2, p1, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public hashCode()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 73
    iget-object v0, p0, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/messages/threads/model/b;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 74
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/facebook/messages/threads/model/b;->b:Lcom/facebook/user/UserIdentifierKey;

    invoke-virtual {v1}, Lcom/facebook/user/UserIdentifierKey;->hashCode()I

    move-result v1

    :cond_0
    add-int/2addr v0, v1

    .line 75
    return v0

    :cond_1
    move v0, v1

    .line 73
    goto :goto_0
.end method
