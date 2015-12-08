.class Lcom/jirbo/adcolony/AdColonyInterstitialAd$2;
.super Lcom/jirbo/adcolony/j;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/AdColonyInterstitialAd;Lcom/jirbo/adcolony/d;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$2;->a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-direct {p0, p2}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    .prologue
    .line 115
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$2;->o:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$2;->a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyInterstitialAd$2;->a:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 116
    return-void
.end method
