.class Lcom/jirbo/adcolony/d$5;
.super Lcom/jirbo/adcolony/j;
.source "SourceFile"


# instance fields
.field final synthetic a:D

.field final synthetic b:Lcom/jirbo/adcolony/AdColonyAd;

.field final synthetic c:Lcom/jirbo/adcolony/d;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;DLcom/jirbo/adcolony/AdColonyAd;)V
    .locals 1

    .prologue
    .line 143
    iput-object p1, p0, Lcom/jirbo/adcolony/d$5;->c:Lcom/jirbo/adcolony/d;

    iput-wide p3, p0, Lcom/jirbo/adcolony/d$5;->a:D

    iput-object p5, p0, Lcom/jirbo/adcolony/d$5;->b:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-direct {p0, p2}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    .line 146
    iget-object v0, p0, Lcom/jirbo/adcolony/d$5;->o:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    iget-wide v2, p0, Lcom/jirbo/adcolony/d$5;->a:D

    iget-object v1, p0, Lcom/jirbo/adcolony/d$5;->b:Lcom/jirbo/adcolony/AdColonyAd;

    invoke-virtual {v0, v2, v3, v1}, Lcom/jirbo/adcolony/u;->a(DLcom/jirbo/adcolony/AdColonyAd;)V

    .line 147
    return-void
.end method
