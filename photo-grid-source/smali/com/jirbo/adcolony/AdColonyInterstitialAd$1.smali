.class Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;
.super Lcom/jirbo/adcolony/j;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/AdColonyInterstitialAd;Lcom/jirbo/adcolony/d;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;->a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-direct {p0, p2}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;->a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;->o:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;->a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$1;->a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 102
    :cond_0
    return-void
.end method
