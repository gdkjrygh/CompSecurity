.class public Lcom/jirbo/adcolony/AdColonyVideoAd;
.super Lcom/jirbo/adcolony/AdColonyInterstitialAd;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;-><init>()V

    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;-><init>(Ljava/lang/String;)V

    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic withListener(Lcom/jirbo/adcolony/AdColonyAdListener;)Lcom/jirbo/adcolony/AdColonyInterstitialAd;
    .locals 1

    .prologue
    .line 3
    invoke-virtual {p0, p1}, Lcom/jirbo/adcolony/AdColonyVideoAd;->withListener(Lcom/jirbo/adcolony/AdColonyAdListener;)Lcom/jirbo/adcolony/AdColonyVideoAd;

    move-result-object v0

    return-object v0
.end method

.method public withListener(Lcom/jirbo/adcolony/AdColonyAdListener;)Lcom/jirbo/adcolony/AdColonyVideoAd;
    .locals 0

    .prologue
    .line 17
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyVideoAd;->v:Lcom/jirbo/adcolony/AdColonyAdListener;

    .line 18
    return-object p0
.end method
