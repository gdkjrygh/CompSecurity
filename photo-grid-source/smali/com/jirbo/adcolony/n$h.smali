.class Lcom/jirbo/adcolony/n$h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:I

.field d:Z

.field e:Z

.field f:Z

.field g:D

.field h:Lcom/jirbo/adcolony/n$v;

.field i:Lcom/jirbo/adcolony/n$j;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1684
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1701
    iget-object v2, p0, Lcom/jirbo/adcolony/n$h;->i:Lcom/jirbo/adcolony/n$j;

    iget-boolean v2, v2, Lcom/jirbo/adcolony/n$j;->a:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/jirbo/adcolony/n$h;->i:Lcom/jirbo/adcolony/n$j;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$j;->a()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1704
    :cond_0
    :goto_0
    return v0

    .line 1702
    :cond_1
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$h;->d:Z

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 1703
    :cond_2
    iget-object v2, p0, Lcom/jirbo/adcolony/n$h;->h:Lcom/jirbo/adcolony/n$v;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$v;->a()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/jirbo/adcolony/n$h;->i:Lcom/jirbo/adcolony/n$j;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$j;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_3
    move v0, v1

    .line 1704
    goto :goto_0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1709
    if-nez p1, :cond_1

    .line 1729
    :cond_0
    :goto_0
    return v0

    .line 1711
    :cond_1
    const-string v2, "enabled"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$h;->d:Z

    .line 1712
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$h;->d:Z

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 1714
    :cond_2
    const-string v2, "uuid"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/jirbo/adcolony/n$h;->a:Ljava/lang/String;

    .line 1715
    const-string v2, "ad_id"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/jirbo/adcolony/n$h;->b:I

    .line 1716
    const-string v2, "ad_campaign_id"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/jirbo/adcolony/n$h;->c:I

    .line 1717
    const-string v2, "dissolve"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$h;->e:Z

    .line 1718
    const-string v2, "enable_in_app_store"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$h;->f:Z

    .line 1719
    const-string v2, "dissolve_delay"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/jirbo/adcolony/n$h;->g:D

    .line 1722
    new-instance v2, Lcom/jirbo/adcolony/n$v;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$v;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$h;->h:Lcom/jirbo/adcolony/n$v;

    .line 1723
    iget-object v2, p0, Lcom/jirbo/adcolony/n$h;->h:Lcom/jirbo/adcolony/n$v;

    const-string v3, "static"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$v;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1726
    new-instance v2, Lcom/jirbo/adcolony/n$j;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$j;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$h;->i:Lcom/jirbo/adcolony/n$j;

    .line 1727
    iget-object v2, p0, Lcom/jirbo/adcolony/n$h;->i:Lcom/jirbo/adcolony/n$j;

    const-string v3, "html5"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$j;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 1729
    goto :goto_0
.end method

.method b()V
    .locals 1

    .prologue
    .line 1734
    iget-boolean v0, p0, Lcom/jirbo/adcolony/n$h;->d:Z

    if-nez v0, :cond_0

    .line 1737
    :goto_0
    return-void

    .line 1735
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/n$h;->h:Lcom/jirbo/adcolony/n$v;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$v;->b()V

    .line 1736
    iget-object v0, p0, Lcom/jirbo/adcolony/n$h;->i:Lcom/jirbo/adcolony/n$j;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$j;->b()V

    goto :goto_0
.end method
