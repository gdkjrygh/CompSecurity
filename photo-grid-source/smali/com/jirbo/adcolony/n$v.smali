.class Lcom/jirbo/adcolony/n$v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field b:I

.field c:I

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Lcom/jirbo/adcolony/n$g;

.field g:Lcom/jirbo/adcolony/n$g;

.field h:Lcom/jirbo/adcolony/n$g;

.field i:Lcom/jirbo/adcolony/n$g;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1740
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1757
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$v;->a:Z

    if-nez v2, :cond_1

    .line 1763
    :cond_0
    :goto_0
    return v0

    .line 1758
    :cond_1
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v3, p0, Lcom/jirbo/adcolony/n$v;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 1759
    :cond_2
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->h:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v2

    if-nez v2, :cond_3

    move v0, v1

    goto :goto_0

    .line 1760
    :cond_3
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->i:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v2

    if-nez v2, :cond_4

    move v0, v1

    goto :goto_0

    .line 1761
    :cond_4
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->g:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v2

    if-nez v2, :cond_5

    move v0, v1

    goto :goto_0

    .line 1762
    :cond_5
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->f:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1769
    if-nez p1, :cond_1

    .line 1796
    :cond_0
    :goto_0
    return v0

    .line 1771
    :cond_1
    const-string v2, "enabled"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/jirbo/adcolony/n$v;->a:Z

    .line 1772
    iget-boolean v2, p0, Lcom/jirbo/adcolony/n$v;->a:Z

    if-nez v2, :cond_2

    move v0, v1

    goto :goto_0

    .line 1774
    :cond_2
    const-string v2, "width"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/jirbo/adcolony/n$v;->b:I

    .line 1775
    const-string v2, "height"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, p0, Lcom/jirbo/adcolony/n$v;->c:I

    .line 1776
    const-string v2, "background_image"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/jirbo/adcolony/n$v;->d:Ljava/lang/String;

    .line 1777
    const-string v2, "background_image_last_modified"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/jirbo/adcolony/n$v;->e:Ljava/lang/String;

    .line 1779
    sget-object v2, Lcom/jirbo/adcolony/a;->f:Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 1781
    sget-object v2, Lcom/jirbo/adcolony/a;->f:Ljava/lang/String;

    iput-object v2, p0, Lcom/jirbo/adcolony/n$v;->d:Ljava/lang/String;

    .line 1784
    :cond_3
    new-instance v2, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$v;->h:Lcom/jirbo/adcolony/n$g;

    .line 1785
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->h:Lcom/jirbo/adcolony/n$g;

    const-string v3, "replay"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1787
    new-instance v2, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$v;->i:Lcom/jirbo/adcolony/n$g;

    .line 1788
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->i:Lcom/jirbo/adcolony/n$g;

    const-string v3, "continue"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1790
    new-instance v2, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$v;->g:Lcom/jirbo/adcolony/n$g;

    .line 1791
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->g:Lcom/jirbo/adcolony/n$g;

    const-string v3, "download"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1793
    new-instance v2, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v2}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v2, p0, Lcom/jirbo/adcolony/n$v;->f:Lcom/jirbo/adcolony/n$g;

    .line 1794
    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->f:Lcom/jirbo/adcolony/n$g;

    const-string v3, "info"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    .line 1796
    goto/16 :goto_0
.end method

.method b()V
    .locals 3

    .prologue
    .line 1801
    iget-boolean v0, p0, Lcom/jirbo/adcolony/n$v;->a:Z

    if-nez v0, :cond_0

    .line 1807
    :goto_0
    return-void

    .line 1802
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$v;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$v;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1803
    iget-object v0, p0, Lcom/jirbo/adcolony/n$v;->h:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1804
    iget-object v0, p0, Lcom/jirbo/adcolony/n$v;->i:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1805
    iget-object v0, p0, Lcom/jirbo/adcolony/n$v;->g:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1806
    iget-object v0, p0, Lcom/jirbo/adcolony/n$v;->f:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    goto :goto_0
.end method
