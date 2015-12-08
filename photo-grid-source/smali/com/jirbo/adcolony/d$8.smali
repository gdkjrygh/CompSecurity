.class Lcom/jirbo/adcolony/d$8;
.super Lcom/jirbo/adcolony/j;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/jirbo/adcolony/AdColonyAd;

.field final synthetic d:Lcom/jirbo/adcolony/d;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 0

    .prologue
    .line 220
    iput-object p1, p0, Lcom/jirbo/adcolony/d$8;->d:Lcom/jirbo/adcolony/d;

    iput-object p3, p0, Lcom/jirbo/adcolony/d$8;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/jirbo/adcolony/d$8;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/jirbo/adcolony/d$8;->c:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-direct {p0, p2}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    .line 223
    iget-object v0, p0, Lcom/jirbo/adcolony/d$8;->o:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    iget-object v1, p0, Lcom/jirbo/adcolony/d$8;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/d$8;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/jirbo/adcolony/k;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    iget-object v3, p0, Lcom/jirbo/adcolony/d$8;->c:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 224
    return-void
.end method
