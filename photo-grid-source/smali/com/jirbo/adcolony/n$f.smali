.class Lcom/jirbo/adcolony/n$f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Lcom/jirbo/adcolony/ADCData$g;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 127
    if-nez p1, :cond_0

    .line 166
    :goto_0
    return v6

    .line 129
    :cond_0
    const-string v0, "update"

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->a:Ljava/lang/String;

    .line 130
    const-string v0, "install"

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->b:Ljava/lang/String;

    .line 131
    const-string v0, "dynamic_interests"

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->c:Ljava/lang/String;

    .line 132
    const-string v0, "user_meta_data"

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->d:Ljava/lang/String;

    .line 133
    const-string v0, "in_app_purchase"

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->e:Ljava/lang/String;

    .line 134
    const-string v0, "session_end"

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->g:Ljava/lang/String;

    .line 135
    const-string v0, "session_start"

    invoke-virtual {p1, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->f:Ljava/lang/String;

    .line 138
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    .line 139
    iget-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    const-string v1, "update"

    iget-object v2, p0, Lcom/jirbo/adcolony/n$f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    const-string v1, "install"

    iget-object v2, p0, Lcom/jirbo/adcolony/n$f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    const-string v1, "dynamic_interests"

    iget-object v2, p0, Lcom/jirbo/adcolony/n$f;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    const-string v1, "user_meta_data"

    iget-object v2, p0, Lcom/jirbo/adcolony/n$f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    const-string v1, "in_app_purchase"

    iget-object v2, p0, Lcom/jirbo/adcolony/n$f;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    iget-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    const-string v1, "session_end"

    iget-object v2, p0, Lcom/jirbo/adcolony/n$f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    const-string v1, "session_start"

    iget-object v2, p0, Lcom/jirbo/adcolony/n$f;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    new-instance v1, Lcom/jirbo/adcolony/f;

    const-string v0, "iap_cache.txt"

    invoke-direct {v1, v0}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    .line 149
    invoke-static {v1}, Lcom/jirbo/adcolony/k;->c(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v2

    .line 150
    if-eqz v2, :cond_2

    .line 152
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v2}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 155
    new-instance v3, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v3}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    invoke-virtual {v2, v0, v3}, Lcom/jirbo/adcolony/ADCData$c;->a(ILcom/jirbo/adcolony/ADCData$g;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    .line 156
    sget-object v4, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v4, v4, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v5, "in_app_purchase"

    invoke-virtual {v4, v5, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 152
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 160
    :cond_1
    invoke-virtual {v1}, Lcom/jirbo/adcolony/f;->c()V

    .line 161
    sget-object v0, Lcom/jirbo/adcolony/a;->Z:Lcom/jirbo/adcolony/ADCData$c;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCData$c;->j()V

    .line 164
    :cond_2
    sput-boolean v6, Lcom/jirbo/adcolony/a;->F:Z

    goto/16 :goto_0
.end method
