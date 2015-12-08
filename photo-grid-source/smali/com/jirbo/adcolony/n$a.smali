.class Lcom/jirbo/adcolony/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field i:Z

.field j:Z

.field k:Z

.field l:Z

.field m:Z

.field n:Z

.field o:Z

.field p:Lcom/jirbo/adcolony/n$n;

.field q:Lcom/jirbo/adcolony/n$x;

.field r:Lcom/jirbo/adcolony/n$m;

.field s:Lcom/jirbo/adcolony/n$c;

.field t:Lcom/jirbo/adcolony/n$b;

.field u:Lcom/jirbo/adcolony/n$h;

.field v:Lcom/jirbo/adcolony/n$aa;

.field w:Lcom/jirbo/adcolony/n$p;

.field x:Lcom/jirbo/adcolony/n$y;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 941
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 974
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->r:Lcom/jirbo/adcolony/n$m;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$m;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 989
    :cond_0
    :goto_0
    return v0

    .line 977
    :cond_1
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$c;->a:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$c;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 979
    :cond_2
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$p;->a:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$p;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 982
    :cond_3
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    iget-boolean v1, v1, Lcom/jirbo/adcolony/n$h;->d:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$h;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 985
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$aa;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 987
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->x:Lcom/jirbo/adcolony/n$y;

    invoke-virtual {v1}, Lcom/jirbo/adcolony/n$y;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 989
    const/4 v0, 0x1

    goto :goto_0
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 994
    if-nez p1, :cond_1

    .line 1048
    :cond_0
    :goto_0
    return v0

    .line 995
    :cond_1
    const-string v1, "uuid"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->a:Ljava/lang/String;

    .line 998
    const-string v1, "title"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->b:Ljava/lang/String;

    .line 999
    const-string v1, "ad_campaign_id"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$a;->c:I

    .line 1000
    const-string v1, "ad_id"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$a;->d:I

    .line 1001
    const-string v1, "ad_group_id"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$a;->e:I

    .line 1002
    const-string v1, "cpcv_bid"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$a;->f:I

    .line 1003
    const-string v1, "net_earnings"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$a;->g:I

    .line 1004
    const-string v1, "expires"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jirbo/adcolony/n$a;->h:I

    .line 1005
    const-string v1, "enable_in_app_store"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$a;->i:Z

    .line 1006
    const-string v1, "video_events_on_replays"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$a;->j:Z

    .line 1007
    const-string v1, "test_ad"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$a;->k:Z

    .line 1008
    const-string v1, "fullscreen"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$a;->l:Z

    .line 1009
    const-string v1, "house_ad"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$a;->m:Z

    .line 1010
    const-string v1, "contracted"

    invoke-virtual {p1, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/n$a;->n:Z

    .line 1013
    new-instance v1, Lcom/jirbo/adcolony/n$n;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$n;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    .line 1014
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->p:Lcom/jirbo/adcolony/n$n;

    const-string v2, "limits"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$n;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1017
    new-instance v1, Lcom/jirbo/adcolony/n$x;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$x;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->q:Lcom/jirbo/adcolony/n$x;

    .line 1018
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->q:Lcom/jirbo/adcolony/n$x;

    const-string v2, "third_party_tracking"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$x;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1021
    new-instance v1, Lcom/jirbo/adcolony/n$m;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$m;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->r:Lcom/jirbo/adcolony/n$m;

    .line 1022
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->r:Lcom/jirbo/adcolony/n$m;

    const-string v2, "in_app_browser"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$m;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1024
    new-instance v1, Lcom/jirbo/adcolony/n$p;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$p;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    .line 1025
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    const-string v2, "native"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$p;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1028
    new-instance v1, Lcom/jirbo/adcolony/n$c;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$c;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    .line 1029
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    const-string v2, "v4vc"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$c;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1032
    new-instance v1, Lcom/jirbo/adcolony/n$b;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$b;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->t:Lcom/jirbo/adcolony/n$b;

    .line 1033
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->t:Lcom/jirbo/adcolony/n$b;

    const-string v2, "ad_tracking"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$b;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1036
    new-instance v1, Lcom/jirbo/adcolony/n$h;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$h;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    .line 1037
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    const-string v2, "companion_ad"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$h;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1040
    new-instance v1, Lcom/jirbo/adcolony/n$aa;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$aa;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    .line 1041
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    const-string v2, "video"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$aa;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1043
    new-instance v1, Lcom/jirbo/adcolony/n$y;

    invoke-direct {v1}, Lcom/jirbo/adcolony/n$y;-><init>()V

    iput-object v1, p0, Lcom/jirbo/adcolony/n$a;->x:Lcom/jirbo/adcolony/n$y;

    .line 1044
    iget-object v1, p0, Lcom/jirbo/adcolony/n$a;->x:Lcom/jirbo/adcolony/n$y;

    const-string v2, "v4iap"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/n$y;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1048
    const/4 v0, 0x1

    goto/16 :goto_0
.end method

.method b()V
    .locals 1

    .prologue
    .line 1053
    iget-object v0, p0, Lcom/jirbo/adcolony/n$a;->s:Lcom/jirbo/adcolony/n$c;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$c;->b()V

    .line 1054
    iget-object v0, p0, Lcom/jirbo/adcolony/n$a;->r:Lcom/jirbo/adcolony/n$m;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$m;->b()V

    .line 1055
    iget-object v0, p0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$p;->b()V

    .line 1056
    iget-object v0, p0, Lcom/jirbo/adcolony/n$a;->u:Lcom/jirbo/adcolony/n$h;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$h;->b()V

    .line 1057
    iget-object v0, p0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$aa;->c()V

    .line 1058
    return-void
.end method
