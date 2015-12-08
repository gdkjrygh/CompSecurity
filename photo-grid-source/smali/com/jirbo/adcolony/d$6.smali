.class Lcom/jirbo/adcolony/d$6;
.super Lcom/jirbo/adcolony/j;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/jirbo/adcolony/AdColonyAd;

.field final synthetic d:Lcom/jirbo/adcolony/d;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Ljava/lang/String;ILcom/jirbo/adcolony/AdColonyAd;)V
    .locals 0

    .prologue
    .line 192
    iput-object p1, p0, Lcom/jirbo/adcolony/d$6;->d:Lcom/jirbo/adcolony/d;

    iput-object p3, p0, Lcom/jirbo/adcolony/d$6;->a:Ljava/lang/String;

    iput p4, p0, Lcom/jirbo/adcolony/d$6;->b:I

    iput-object p5, p0, Lcom/jirbo/adcolony/d$6;->c:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-direct {p0, p2}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    .line 195
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 196
    const-string v1, "v4vc_name"

    iget-object v2, p0, Lcom/jirbo/adcolony/d$6;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v1, "v4vc_amount"

    iget v2, p0, Lcom/jirbo/adcolony/d$6;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 198
    iget-object v1, p0, Lcom/jirbo/adcolony/d$6;->o:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "reward_v4vc"

    iget-object v3, p0, Lcom/jirbo/adcolony/d$6;->c:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v1, v2, v0, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 199
    return-void
.end method
