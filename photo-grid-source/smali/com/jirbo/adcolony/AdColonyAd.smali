.class public abstract Lcom/jirbo/adcolony/AdColonyAd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final a:I = 0x0

.field static final b:I = 0x1

.field static final c:I = 0x2

.field static final d:I = 0x3

.field static final e:I = 0x4


# instance fields
.field f:I

.field g:Ljava/lang/String;

.field h:Lcom/jirbo/adcolony/n$ab;

.field i:Lcom/jirbo/adcolony/n$a;

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Ljava/lang/String;

.field n:D

.field o:D

.field p:I

.field q:Z

.field r:Z

.field s:Z

.field t:Z

.field u:Lcom/jirbo/adcolony/AdColonyIAPEngagement;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->j:Ljava/lang/String;

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->k:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->l:Ljava/lang/String;

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->m:Ljava/lang/String;

    .line 28
    iput-wide v2, p0, Lcom/jirbo/adcolony/AdColonyAd;->n:D

    .line 29
    iput-wide v2, p0, Lcom/jirbo/adcolony/AdColonyAd;->o:D

    .line 38
    sget-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->NONE:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->u:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    return-void
.end method


# virtual methods
.method abstract a()V
.end method

.method abstract a(Z)Z
.end method

.method abstract b()Z
.end method

.method b(Z)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 87
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 95
    :goto_0
    return v0

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyAd;->isReady()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_1

    move v0, v2

    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/AdColonyAd;->a(Z)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_2

    move v0, v2

    goto :goto_0

    .line 93
    :cond_2
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/jirbo/adcolony/d;->h(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    .line 94
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$ab;->j()Lcom/jirbo/adcolony/n$a;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    .line 95
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    if-eqz v0, :cond_4

    move v0, v1

    goto :goto_0

    .line 94
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$ab;->i()Lcom/jirbo/adcolony/n$a;

    move-result-object v0

    goto :goto_1

    :cond_4
    move v0, v2

    .line 95
    goto :goto_0
.end method

.method c()Z
    .locals 1

    .prologue
    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyAd;->b(Z)Z

    move-result v0

    return v0
.end method

.method public canceled()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 46
    iget v1, p0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAvailableViews()I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyAd;->isReady()Z

    move-result v1

    if-nez v1, :cond_1

    .line 75
    :cond_0
    :goto_0
    return v0

    .line 73
    :cond_1
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyAd;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 75
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$ab;->d()I

    move-result v0

    goto :goto_0
.end method

.method public iapEnabled()Z
    .locals 1

    .prologue
    .line 52
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->t:Z

    return v0
.end method

.method public iapEngagementType()Lcom/jirbo/adcolony/AdColonyIAPEngagement;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->u:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    return-object v0
.end method

.method public iapProductID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->m:Ljava/lang/String;

    return-object v0
.end method

.method abstract isReady()Z
.end method

.method public noFill()Z
    .locals 2

    .prologue
    .line 47
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public notShown()Z
    .locals 2

    .prologue
    .line 44
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public shown()Z
    .locals 2

    .prologue
    .line 43
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public skipped()Z
    .locals 2

    .prologue
    .line 48
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyAd;->f:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
