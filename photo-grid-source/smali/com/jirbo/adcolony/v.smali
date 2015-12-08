.class Lcom/jirbo/adcolony/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/jirbo/adcolony/d;

.field b:Z

.field c:Z

.field d:Z

.field e:Z

.field f:D

.field g:D

.field h:D

.field i:I

.field j:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-boolean v0, p0, Lcom/jirbo/adcolony/v;->d:Z

    .line 23
    iput-boolean v0, p0, Lcom/jirbo/adcolony/v;->e:Z

    .line 31
    const-string v0, "uuid"

    iput-object v0, p0, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    .line 36
    iput-object p1, p0, Lcom/jirbo/adcolony/v;->a:Lcom/jirbo/adcolony/d;

    .line 37
    return-void
.end method


# virtual methods
.method a()V
    .locals 0

    .prologue
    .line 41
    return-void
.end method

.method a(D)V
    .locals 3

    .prologue
    .line 167
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Submitting session duration "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jirbo/adcolony/l;->b(D)Lcom/jirbo/adcolony/l;

    .line 168
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 169
    const-string v1, "session_length"

    double-to-int v2, p1

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 170
    iget-object v1, p0, Lcom/jirbo/adcolony/v;->a:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "session_end"

    invoke-virtual {v1, v2, v0}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 171
    return-void
.end method

.method b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 45
    iget-object v0, p0, Lcom/jirbo/adcolony/v;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/b;->b:Z

    if-eqz v0, :cond_1

    .line 47
    iget-boolean v0, p0, Lcom/jirbo/adcolony/v;->d:Z

    if-eqz v0, :cond_0

    .line 49
    iput-boolean v2, p0, Lcom/jirbo/adcolony/v;->d:Z

    .line 50
    iget-object v0, p0, Lcom/jirbo/adcolony/v;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "install"

    invoke-virtual {v0, v1, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 53
    :cond_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/v;->e:Z

    if-eqz v0, :cond_1

    .line 55
    iput-boolean v2, p0, Lcom/jirbo/adcolony/v;->e:Z

    .line 56
    iget-object v0, p0, Lcom/jirbo/adcolony/v;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "session_start"

    invoke-virtual {v0, v1, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 59
    :cond_1
    return-void
.end method

.method c()V
    .locals 6

    .prologue
    const/4 v2, 0x1

    .line 63
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "AdColony resuming"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 64
    sput-boolean v2, Lcom/jirbo/adcolony/a;->r:Z

    .line 66
    iget-boolean v0, p0, Lcom/jirbo/adcolony/v;->b:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "AdColony.onResume() called multiple times in succession."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 67
    :cond_0
    iput-boolean v2, p0, Lcom/jirbo/adcolony/v;->b:Z

    .line 68
    invoke-virtual {p0}, Lcom/jirbo/adcolony/v;->g()V

    .line 70
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v0

    .line 71
    iget-boolean v2, p0, Lcom/jirbo/adcolony/v;->c:Z

    if-eqz v2, :cond_2

    .line 73
    iget-wide v2, p0, Lcom/jirbo/adcolony/v;->g:D

    sub-double v2, v0, v2

    iget-object v4, p0, Lcom/jirbo/adcolony/v;->a:Lcom/jirbo/adcolony/d;

    iget-object v4, v4, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget v4, v4, Lcom/jirbo/adcolony/c;->d:I

    int-to-double v4, v4

    cmpl-double v2, v2, v4

    if-lez v2, :cond_1

    .line 75
    iget-wide v2, p0, Lcom/jirbo/adcolony/v;->h:D

    invoke-virtual {p0, v2, v3}, Lcom/jirbo/adcolony/v;->a(D)V

    .line 76
    iput-wide v0, p0, Lcom/jirbo/adcolony/v;->f:D

    .line 77
    invoke-virtual {p0}, Lcom/jirbo/adcolony/v;->h()V

    .line 85
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/v;->c:Z

    .line 86
    invoke-virtual {p0}, Lcom/jirbo/adcolony/v;->f()V

    .line 93
    :goto_0
    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    .line 94
    return-void

    .line 90
    :cond_2
    iput-wide v0, p0, Lcom/jirbo/adcolony/v;->f:D

    .line 91
    invoke-virtual {p0}, Lcom/jirbo/adcolony/v;->h()V

    goto :goto_0
.end method

.method d()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 98
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "AdColony suspending"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 99
    sput-boolean v2, Lcom/jirbo/adcolony/a;->r:Z

    .line 101
    iget-boolean v0, p0, Lcom/jirbo/adcolony/v;->b:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "AdColony.onPause() called without initial call to onResume()."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 102
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/v;->b:Z

    .line 104
    iput-boolean v2, p0, Lcom/jirbo/adcolony/v;->c:Z

    .line 105
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/jirbo/adcolony/v;->g:D

    .line 106
    invoke-virtual {p0}, Lcom/jirbo/adcolony/v;->f()V

    .line 107
    return-void
.end method

.method e()V
    .locals 2

    .prologue
    .line 112
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "AdColony terminating"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 113
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->r:Z

    .line 115
    iget-wide v0, p0, Lcom/jirbo/adcolony/v;->h:D

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/v;->a(D)V

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/v;->c:Z

    .line 118
    invoke-virtual {p0}, Lcom/jirbo/adcolony/v;->f()V

    .line 119
    return-void
.end method

.method f()V
    .locals 4

    .prologue
    .line 123
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 124
    const-string v1, "allow_resume"

    iget-boolean v2, p0, Lcom/jirbo/adcolony/v;->c:Z

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 125
    const-string v1, "start_time"

    iget-wide v2, p0, Lcom/jirbo/adcolony/v;->f:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 126
    const-string v1, "finish_time"

    iget-wide v2, p0, Lcom/jirbo/adcolony/v;->g:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 127
    const-string v1, "session_time"

    iget-wide v2, p0, Lcom/jirbo/adcolony/v;->h:D

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;D)V

    .line 129
    new-instance v1, Lcom/jirbo/adcolony/f;

    const-string v2, "session_info.txt"

    invoke-direct {v1, v2}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 130
    return-void
.end method

.method g()V
    .locals 4

    .prologue
    .line 134
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "session_info.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    .line 135
    if-eqz v0, :cond_0

    .line 137
    const-string v1, "allow_resume"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/jirbo/adcolony/v;->c:Z

    .line 138
    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/jirbo/adcolony/v;->f:D

    .line 139
    const-string v1, "finish_time"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/jirbo/adcolony/v;->g:D

    .line 140
    const-string v1, "session_time"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->f(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/jirbo/adcolony/v;->h:D

    .line 146
    :goto_0
    return-void

    .line 144
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/v;->d:Z

    goto :goto_0
.end method

.method h()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 150
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/v;->e:Z

    .line 151
    invoke-static {}, Lcom/jirbo/adcolony/ab;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    .line 152
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/jirbo/adcolony/v;->h:D

    .line 153
    iput v1, p0, Lcom/jirbo/adcolony/v;->i:I

    .line 156
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    if-nez v0, :cond_1

    .line 163
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 158
    :goto_0
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v2, v2, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ae;->a()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 160
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v2, v2, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2, v0}, Lcom/jirbo/adcolony/n$ae;->a(I)Lcom/jirbo/adcolony/n$ab;

    move-result-object v2

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    if-eqz v2, :cond_2

    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v2, v2, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2, v0}, Lcom/jirbo/adcolony/n$ae;->a(I)Lcom/jirbo/adcolony/n$ab;

    move-result-object v2

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iput v1, v2, Lcom/jirbo/adcolony/ag;->d:I

    .line 158
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
