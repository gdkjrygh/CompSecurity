.class Lcom/jirbo/adcolony/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jirbo/adcolony/ADCDownload$Listener;


# instance fields
.field a:Lcom/jirbo/adcolony/d;

.field b:Z

.field c:Z

.field d:Z

.field e:Z

.field f:Z

.field g:D

.field h:Landroid/os/Handler;

.field i:Ljava/lang/Runnable;

.field j:Lcom/jirbo/adcolony/n$e;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;)V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/b;->e:Z

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/b;->f:Z

    .line 22
    new-instance v0, Lcom/jirbo/adcolony/n$e;

    invoke-direct {v0}, Lcom/jirbo/adcolony/n$e;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    .line 28
    iput-object p1, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    .line 29
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 30
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/b;->h:Landroid/os/Handler;

    .line 31
    new-instance v0, Lcom/jirbo/adcolony/b$1;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/b$1;-><init>(Lcom/jirbo/adcolony/b;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/b;->i:Ljava/lang/Runnable;

    .line 42
    return-void
.end method


# virtual methods
.method a()V
    .locals 0

    .prologue
    .line 46
    return-void
.end method

.method a(Lcom/jirbo/adcolony/ADCData$g;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 295
    if-nez p1, :cond_1

    .line 310
    :cond_0
    :goto_0
    return v0

    .line 296
    :cond_1
    const-string v2, "status"

    invoke-virtual {p1, v2}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "success"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 297
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    const-string v3, "app"

    invoke-virtual {p1, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/n$e;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 298
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Finished parsing manifest"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 300
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->h:Ljava/lang/String;

    const-string v2, "none"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 302
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v2, "Enabling debug logging."

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 303
    invoke-static {v1}, Lcom/jirbo/adcolony/a;->a(I)V

    :goto_1
    move v0, v1

    .line 310
    goto :goto_0

    .line 307
    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->a(I)V

    goto :goto_1
.end method

.method a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 108
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/b;->a(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method a(Ljava/lang/String;Z)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 113
    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ae;->a()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 115
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2, v0}, Lcom/jirbo/adcolony/n$ae;->a(I)Lcom/jirbo/adcolony/n$ab;

    move-result-object v2

    .line 116
    invoke-virtual {v2, p2}, Lcom/jirbo/adcolony/n$ab;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    .line 118
    :cond_0
    return v1

    .line 113
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method b()V
    .locals 3

    .prologue
    .line 50
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "Attempting to load backup manifest from file."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 52
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "manifest.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    .line 53
    invoke-static {v0}, Lcom/jirbo/adcolony/k;->b(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v1

    .line 54
    if-eqz v1, :cond_0

    .line 56
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/b;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/b;->b:Z

    .line 59
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$e;->a()V

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 63
    :cond_1
    sget-object v1, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v2, "Invalid manifest loaded."

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 64
    invoke-virtual {v0}, Lcom/jirbo/adcolony/f;->c()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/b;->b:Z

    goto :goto_0
.end method

.method b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 123
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/b;->b(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method b(Ljava/lang/String;Z)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 127
    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/jirbo/adcolony/b;->c(Ljava/lang/String;Z)Z

    move-result v0

    .line 130
    :goto_0
    return v0

    .line 128
    :cond_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/b;->b:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Ads are not ready to be played, as they are still downloading."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 129
    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v0, p1, v2, v1}, Lcom/jirbo/adcolony/n$e;->a(Ljava/lang/String;ZZ)Z

    move-result v0

    goto :goto_0

    .line 130
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v0, p1, v1, v2}, Lcom/jirbo/adcolony/n$e;->a(Ljava/lang/String;ZZ)Z

    move-result v0

    goto :goto_0
.end method

.method c()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 72
    iget-boolean v0, p0, Lcom/jirbo/adcolony/b;->b:Z

    if-nez v0, :cond_0

    .line 85
    :goto_0
    return-object v1

    .line 75
    :cond_0
    const/4 v0, 0x0

    move v4, v0

    move-object v0, v1

    move v1, v4

    :goto_1
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ae;->a()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 77
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/n$ae;->a(I)Lcom/jirbo/adcolony/n$ab;

    move-result-object v2

    .line 78
    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ab;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 80
    iget-object v0, v2, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    .line 81
    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ab;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v1, v2, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    goto :goto_0

    .line 75
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move-object v1, v0

    .line 85
    goto :goto_0
.end method

.method c(Ljava/lang/String;Z)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 134
    iget-boolean v1, p0, Lcom/jirbo/adcolony/b;->b:Z

    if-nez v1, :cond_0

    .line 136
    :goto_0
    return v0

    .line 135
    :cond_0
    if-eqz p2, :cond_1

    iget-object v1, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v1, p1, v2, v0}, Lcom/jirbo/adcolony/n$e;->a(Ljava/lang/String;ZZ)Z

    move-result v0

    goto :goto_0

    .line 136
    :cond_1
    iget-object v1, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v1, p1, v0, v2}, Lcom/jirbo/adcolony/n$e;->a(Ljava/lang/String;ZZ)Z

    move-result v0

    goto :goto_0
.end method

.method d()Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 90
    iget-boolean v0, p0, Lcom/jirbo/adcolony/b;->b:Z

    if-nez v0, :cond_0

    .line 103
    :goto_0
    return-object v1

    .line 93
    :cond_0
    const/4 v0, 0x0

    move v4, v0

    move-object v0, v1

    move v1, v4

    :goto_1
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ae;->a()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 95
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/n$ae;->a(I)Lcom/jirbo/adcolony/n$ab;

    move-result-object v2

    .line 96
    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ab;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 98
    iget-object v0, v2, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    .line 99
    invoke-virtual {v2}, Lcom/jirbo/adcolony/n$ab;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v1, v2, Lcom/jirbo/adcolony/n$ab;->a:Ljava/lang/String;

    goto :goto_0

    .line 93
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    move-object v1, v0

    .line 103
    goto :goto_0
.end method

.method e()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 141
    iget-boolean v0, p0, Lcom/jirbo/adcolony/b;->e:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/jirbo/adcolony/a;->z:Z

    if-eqz v0, :cond_1

    .line 143
    :cond_0
    iput-boolean v1, p0, Lcom/jirbo/adcolony/b;->e:Z

    .line 144
    iput-boolean v2, p0, Lcom/jirbo/adcolony/b;->c:Z

    .line 145
    iput-boolean v1, p0, Lcom/jirbo/adcolony/b;->f:Z

    .line 146
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->h:Landroid/os/Handler;

    iget-object v1, p0, Lcom/jirbo/adcolony/b;->i:Ljava/lang/Runnable;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 152
    :goto_0
    return-void

    .line 150
    :cond_1
    iput-boolean v2, p0, Lcom/jirbo/adcolony/b;->f:Z

    goto :goto_0
.end method

.method f()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 156
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v0

    iget-wide v2, p0, Lcom/jirbo/adcolony/b;->g:D

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    iput-boolean v5, p0, Lcom/jirbo/adcolony/b;->c:Z

    .line 158
    :cond_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/b;->c:Z

    if-eqz v0, :cond_1

    .line 160
    iput-boolean v4, p0, Lcom/jirbo/adcolony/b;->c:Z

    .line 161
    invoke-static {}, Lcom/jirbo/adcolony/g;->c()I

    move-result v0

    const/16 v1, 0x20

    if-lt v0, v1, :cond_1

    .line 163
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v0

    const-wide v2, 0x4082c00000000000L    # 600.0

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/jirbo/adcolony/b;->g:D

    .line 164
    invoke-virtual {p0}, Lcom/jirbo/adcolony/b;->g()V

    .line 167
    :cond_1
    invoke-static {}, Lcom/jirbo/adcolony/q;->c()Z

    move-result v0

    if-nez v0, :cond_3

    .line 169
    sget-boolean v0, Lcom/jirbo/adcolony/a;->C:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    .line 170
    :cond_2
    sput-boolean v4, Lcom/jirbo/adcolony/a;->C:Z

    .line 177
    :goto_0
    return-void

    .line 174
    :cond_3
    sget-boolean v0, Lcom/jirbo/adcolony/a;->C:Z

    if-nez v0, :cond_4

    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    .line 175
    :cond_4
    sput-boolean v5, Lcom/jirbo/adcolony/a;->C:Z

    goto :goto_0
.end method

.method g()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 181
    sput-boolean v0, Lcom/jirbo/adcolony/a;->r:Z

    .line 182
    sget-object v2, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v3, "Refreshing manifest"

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 183
    invoke-static {}, Lcom/jirbo/adcolony/q;->c()Z

    move-result v2

    if-nez v2, :cond_1

    .line 185
    sget-object v1, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v2, "Not connected to network."

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 186
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "attempted_load:"

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    iget-boolean v2, p0, Lcom/jirbo/adcolony/b;->d:Z

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Z)Lcom/jirbo/adcolony/l;

    move-result-object v1

    const-string v2, " is_configured:"

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    iget-boolean v2, p0, Lcom/jirbo/adcolony/b;->b:Z

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Z)Lcom/jirbo/adcolony/l;

    .line 187
    iget-boolean v1, p0, Lcom/jirbo/adcolony/b;->d:Z

    if-nez v1, :cond_0

    .line 189
    iput-boolean v0, p0, Lcom/jirbo/adcolony/b;->d:Z

    .line 190
    iget-boolean v0, p0, Lcom/jirbo/adcolony/b;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/b;->b()V

    .line 240
    :cond_0
    :goto_0
    return-void

    .line 195
    :cond_1
    new-instance v3, Lcom/jirbo/adcolony/z;

    invoke-direct {v3}, Lcom/jirbo/adcolony/z;-><init>()V

    .line 196
    sget-object v2, Lcom/jirbo/adcolony/c;->c:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 197
    const-string v2, "?app_id="

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 198
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v2, v2, Lcom/jirbo/adcolony/c;->j:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 200
    const-string v2, "&zones="

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 201
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v2, v2, Lcom/jirbo/adcolony/c;->k:[Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 204
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v4, v2, Lcom/jirbo/adcolony/c;->k:[Ljava/lang/String;

    array-length v5, v4

    move v2, v1

    :goto_1
    if-ge v2, v5, :cond_3

    aget-object v6, v4, v2

    .line 206
    if-eqz v0, :cond_2

    move v0, v1

    .line 208
    :goto_2
    invoke-virtual {v3, v6}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 204
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 207
    :cond_2
    const-string v7, ","

    invoke-virtual {v3, v7}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 212
    :cond_3
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-object v0, v0, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, ""

    .line 213
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget v2, v2, Lcom/jirbo/adcolony/v;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 215
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v2, v2, Lcom/jirbo/adcolony/c;->h:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 217
    const-string v2, "&carrier="

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 218
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v2, v2, Lcom/jirbo/adcolony/c;->w:Ljava/lang/String;

    invoke-static {v2}, Lcom/jirbo/adcolony/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 219
    const-string v2, "&network_type="

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 220
    invoke-static {}, Lcom/jirbo/adcolony/q;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "wifi"

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 223
    :goto_4
    const-string v2, "&custom_id="

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 224
    iget-object v2, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v2, v2, Lcom/jirbo/adcolony/c;->x:Ljava/lang/String;

    invoke-static {v2}, Lcom/jirbo/adcolony/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 225
    const-string v2, "&sid="

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 226
    invoke-virtual {v3, v0}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 227
    const-string v0, "&s_imp_count="

    invoke-virtual {v3, v0}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 228
    invoke-virtual {v3, v1}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    .line 236
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "Downloading ad manifest from"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 237
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    invoke-virtual {v0, v3}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 239
    new-instance v0, Lcom/jirbo/adcolony/ADCDownload;

    iget-object v1, p0, Lcom/jirbo/adcolony/b;->a:Lcom/jirbo/adcolony/d;

    invoke-virtual {v3}, Lcom/jirbo/adcolony/z;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0}, Lcom/jirbo/adcolony/ADCDownload;-><init>(Lcom/jirbo/adcolony/d;Ljava/lang/String;Lcom/jirbo/adcolony/ADCDownload$Listener;)V

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCDownload;->b()V

    goto/16 :goto_0

    .line 212
    :cond_4
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-object v0, v0, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    goto/16 :goto_3

    .line 221
    :cond_5
    invoke-static {}, Lcom/jirbo/adcolony/q;->b()Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "cell"

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    goto :goto_4

    .line 222
    :cond_6
    const-string v2, "none"

    invoke-virtual {v3, v2}, Lcom/jirbo/adcolony/z;->a(Ljava/lang/String;)V

    goto :goto_4
.end method

.method public on_download_finished(Lcom/jirbo/adcolony/ADCDownload;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 244
    sput-boolean v2, Lcom/jirbo/adcolony/a;->r:Z

    .line 245
    iget-boolean v0, p1, Lcom/jirbo/adcolony/ADCDownload;->i:Z

    if-eqz v0, :cond_0

    .line 247
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Finished downloading:"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 248
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    iget-object v1, p1, Lcom/jirbo/adcolony/ADCDownload;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 257
    iget-object v0, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/jirbo/adcolony/k;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v0

    .line 259
    if-nez v0, :cond_1

    .line 261
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Invalid JSON in manifest.  Raw data:"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 262
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    iget-object v1, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 291
    :goto_0
    return-void

    .line 252
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Error downloading:"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 253
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    iget-object v1, p1, Lcom/jirbo/adcolony/ADCDownload;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    goto :goto_0

    .line 267
    :cond_1
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/b;->a(Lcom/jirbo/adcolony/ADCData$g;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 269
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad manifest updated."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 270
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "manifest.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/f;->a(Ljava/lang/String;)V

    .line 271
    iput-boolean v2, p0, Lcom/jirbo/adcolony/b;->b:Z

    .line 279
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$e;->a()V

    .line 281
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->i:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->i:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 283
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    const-string v1, "all"

    iput-object v1, v0, Lcom/jirbo/adcolony/n$e;->i:Ljava/lang/String;

    .line 285
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->j:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->j:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 287
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    const-string v1, "all"

    iput-object v1, v0, Lcom/jirbo/adcolony/n$e;->j:Ljava/lang/String;

    .line 290
    :cond_5
    invoke-static {}, Lcom/jirbo/adcolony/a;->h()V

    goto :goto_0

    .line 275
    :cond_6
    sget-object v0, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v1, "Invalid manifest."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    goto :goto_0
.end method
