.class Lcom/jirbo/adcolony/n$j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field b:D

.field c:Z

.field d:Z

.field e:Ljava/lang/String;

.field f:Lcom/jirbo/adcolony/n$o;

.field g:Ljava/lang/String;

.field h:Lcom/jirbo/adcolony/n$l;

.field i:Lcom/jirbo/adcolony/n$g;

.field j:Lcom/jirbo/adcolony/n$g;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1810
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1829
    invoke-static {}, Lcom/jirbo/adcolony/q;->c()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1831
    const/16 v0, 0x8

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 1832
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad not ready due to no network connection."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    .line 1839
    :cond_0
    :goto_0
    return v0

    .line 1834
    :cond_1
    iget-boolean v1, p0, Lcom/jirbo/adcolony/n$j;->a:Z

    if-eqz v1, :cond_0

    .line 1835
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->f:Lcom/jirbo/adcolony/n$o;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$o;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1836
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->h:Lcom/jirbo/adcolony/n$l;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$l;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1837
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->i:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1838
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->j:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$g;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1839
    const/4 v0, 0x1

    goto :goto_0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1844
    if-nez p1, :cond_1

    .line 1871
    :cond_0
    :goto_0
    return v0

    .line 1846
    :cond_1
    const-string v1, "enabled"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$j;->a:Z

    .line 1848
    const-string v1, "load_timeout"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/jirbo/adcolony/n$j;->b:D

    .line 1849
    const-string v1, "load_timeout_enabled"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$j;->c:Z

    .line 1850
    const-string v1, "load_spinner_enabled"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$j;->d:Z

    .line 1851
    const-string v1, "background_color"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$j;->e:Ljava/lang/String;

    .line 1853
    const-string v1, "html5_tag"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$j;->g:Ljava/lang/String;

    .line 1856
    new-instance v1, Lcom/jirbo/adcolony/n$o;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$o;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$j;->f:Lcom/jirbo/adcolony/n$o;

    .line 1857
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->f:Lcom/jirbo/adcolony/n$o;

    const-string v2, "mraid_js"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$o;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1860
    new-instance v1, Lcom/jirbo/adcolony/n$l;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$l;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$j;->h:Lcom/jirbo/adcolony/n$l;

    .line 1861
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->h:Lcom/jirbo/adcolony/n$l;

    const-string v2, "background_logo"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$l;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1864
    new-instance v1, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$j;->i:Lcom/jirbo/adcolony/n$g;

    .line 1865
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->i:Lcom/jirbo/adcolony/n$g;

    const-string v2, "replay"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1868
    new-instance v1, Lcom/jirbo/adcolony/n$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$g;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$j;->j:Lcom/jirbo/adcolony/n$g;

    .line 1869
    iget-object v1, p0, Lcom/jirbo/adcolony/n$j;->j:Lcom/jirbo/adcolony/n$g;

    const-string v2, "close"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$g;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1871
    const/4 v0, 0x1

    goto/16 :goto_0
.end method

.method b()V
    .locals 1

    .prologue
    .line 1876
    iget-boolean v0, p0, Lcom/jirbo/adcolony/n$j;->a:Z

    if-nez v0, :cond_1

    .line 1881
    :cond_0
    :goto_0
    return-void

    .line 1877
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->f:Lcom/jirbo/adcolony/n$o;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->f:Lcom/jirbo/adcolony/n$o;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$o;->b()V

    .line 1878
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->h:Lcom/jirbo/adcolony/n$l;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->h:Lcom/jirbo/adcolony/n$l;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$l;->b()V

    .line 1879
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->i:Lcom/jirbo/adcolony/n$g;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->i:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    .line 1880
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->j:Lcom/jirbo/adcolony/n$g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/n$j;->j:Lcom/jirbo/adcolony/n$g;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$g;->b()V

    goto :goto_0
.end method
