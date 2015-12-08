.class Lcom/jirbo/adcolony/d$4;
.super Lcom/jirbo/adcolony/j;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/AdColonyAd;

.field final synthetic b:Lcom/jirbo/adcolony/d;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/jirbo/adcolony/d$4;->b:Lcom/jirbo/adcolony/d;

    iput-object p3, p0, Lcom/jirbo/adcolony/d$4;->a:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-direct {p0, p2}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    .line 134
    iget-object v0, p0, Lcom/jirbo/adcolony/d$4;->a:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->g:Ljava/lang/String;

    invoke-static {v0}, Lcom/jirbo/adcolony/AdColony;->isZoneV4VC(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/d$4;->a:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->k:Ljava/lang/String;

    const-string v1, "native"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/d$4;->b:Lcom/jirbo/adcolony/d;

    const-string v1, "start"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{\"ad_slot\":"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/jirbo/adcolony/d$4;->a:Lcom/jirbo/adcolony/AdColonyAd;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v3, v3, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v3, v3, Lcom/jirbo/adcolony/ag;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", \"replay\":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/jirbo/adcolony/d$4;->a:Lcom/jirbo/adcolony/AdColonyAd;

    iget-boolean v3, v3, Lcom/jirbo/adcolony/AdColonyAd;->s:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/jirbo/adcolony/d$4;->a:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 135
    :cond_1
    return-void
.end method
