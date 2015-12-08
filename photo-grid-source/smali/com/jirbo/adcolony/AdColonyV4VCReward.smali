.class public Lcom/jirbo/adcolony/AdColonyV4VCReward;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field b:Ljava/lang/String;

.field c:I


# direct methods
.method constructor <init>(ZLjava/lang/String;I)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-boolean p1, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->a:Z

    .line 12
    iput-object p2, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->b:Ljava/lang/String;

    .line 13
    iput p3, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->c:I

    .line 14
    return-void
.end method


# virtual methods
.method public amount()I
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->c:I

    return v0
.end method

.method public name()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->b:Ljava/lang/String;

    return-object v0
.end method

.method public success()Z
    .locals 1

    .prologue
    .line 18
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/jirbo/adcolony/AdColonyV4VCReward;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 34
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "no reward"

    goto :goto_0
.end method
