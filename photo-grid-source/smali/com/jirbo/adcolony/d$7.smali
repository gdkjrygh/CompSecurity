.class Lcom/jirbo/adcolony/d$7;
.super Lcom/jirbo/adcolony/j;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/jirbo/adcolony/d;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;Lcom/jirbo/adcolony/d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 209
    iput-object p1, p0, Lcom/jirbo/adcolony/d$7;->c:Lcom/jirbo/adcolony/d;

    iput-object p3, p0, Lcom/jirbo/adcolony/d$7;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/jirbo/adcolony/d$7;->b:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/jirbo/adcolony/j;-><init>(Lcom/jirbo/adcolony/d;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 3

    .prologue
    .line 212
    iget-object v0, p0, Lcom/jirbo/adcolony/d$7;->o:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    iget-object v1, p0, Lcom/jirbo/adcolony/d$7;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/d$7;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/jirbo/adcolony/k;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 213
    return-void
.end method
