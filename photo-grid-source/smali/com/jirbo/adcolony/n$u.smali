.class Lcom/jirbo/adcolony/n$u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Lcom/jirbo/adcolony/n$l;

.field d:Lcom/jirbo/adcolony/n$t;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1356
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1367
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$u;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1370
    :cond_0
    :goto_0
    return v0

    .line 1368
    :cond_1
    iget-object v1, p0, Lcom/jirbo/adcolony/n$u;->c:Lcom/jirbo/adcolony/n$l;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$l;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1369
    iget-object v1, p0, Lcom/jirbo/adcolony/n$u;->d:Lcom/jirbo/adcolony/n$t;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$t;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1370
    const/4 v0, 0x1

    goto :goto_0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1375
    const-string v1, "background_image"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$u;->a:Ljava/lang/String;

    .line 1376
    const-string v1, "background_image_last_modified"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$u;->b:Ljava/lang/String;

    .line 1378
    new-instance v1, Lcom/jirbo/adcolony/n$l;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$l;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$u;->c:Lcom/jirbo/adcolony/n$l;

    .line 1379
    iget-object v1, p0, Lcom/jirbo/adcolony/n$u;->c:Lcom/jirbo/adcolony/n$l;

    const-string v2, "background_logo"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$l;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1384
    :cond_0
    :goto_0
    return v0

    .line 1381
    :cond_1
    new-instance v1, Lcom/jirbo/adcolony/n$t;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$t;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$u;->d:Lcom/jirbo/adcolony/n$t;

    .line 1382
    iget-object v1, p0, Lcom/jirbo/adcolony/n$u;->d:Lcom/jirbo/adcolony/n$t;

    const-string v2, "dialog"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$t;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1384
    const/4 v0, 0x1

    goto :goto_0
.end method

.method b()V
    .locals 3

    .prologue
    .line 1389
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->c:Lcom/jirbo/adcolony/o;

    iget-object v1, p0, Lcom/jirbo/adcolony/n$u;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/jirbo/adcolony/n$u;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1390
    iget-object v0, p0, Lcom/jirbo/adcolony/n$u;->c:Lcom/jirbo/adcolony/n$l;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$l;->b()V

    .line 1391
    iget-object v0, p0, Lcom/jirbo/adcolony/n$u;->d:Lcom/jirbo/adcolony/n$t;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$t;->b()V

    .line 1392
    return-void
.end method
