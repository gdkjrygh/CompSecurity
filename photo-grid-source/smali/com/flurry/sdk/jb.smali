.class public Lcom/flurry/sdk/jb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kf;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/flurry/sdk/jb;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/jb;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    return-void
.end method

.method public static declared-synchronized a()Lcom/flurry/sdk/jb;
    .locals 3

    .prologue
    .line 29
    const-class v1, Lcom/flurry/sdk/jb;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    const-class v2, Lcom/flurry/sdk/jb;

    invoke-virtual {v0, v2}, Lcom/flurry/sdk/jo;->a(Ljava/lang/Class;)Lcom/flurry/sdk/kf;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/jb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Lcom/flurry/sdk/lb;)Lcom/flurry/sdk/jn;
    .locals 1

    .prologue
    .line 200
    if-nez p1, :cond_0

    .line 201
    const/4 v0, 0x0

    .line 204
    :goto_0
    return-object v0

    :cond_0
    const-class v0, Lcom/flurry/sdk/jn;

    invoke-virtual {p1, v0}, Lcom/flurry/sdk/lb;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/jn;

    goto :goto_0
.end method

.method private m()Lcom/flurry/sdk/jn;
    .locals 1

    .prologue
    .line 196
    invoke-static {}, Lcom/flurry/sdk/ld;->a()Lcom/flurry/sdk/ld;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ld;->e()Lcom/flurry/sdk/lb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/flurry/sdk/jb;->a(Lcom/flurry/sdk/lb;)Lcom/flurry/sdk/jn;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/flurry/sdk/jn;

    invoke-static {v0}, Lcom/flurry/sdk/lb;->a(Ljava/lang/Class;)V

    .line 43
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    .line 44
    invoke-static {}, Lcom/flurry/sdk/lk;->a()Lcom/flurry/sdk/lk;

    .line 45
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    .line 46
    invoke-static {}, Lcom/flurry/sdk/jq;->a()Lcom/flurry/sdk/jq;

    .line 47
    invoke-static {}, Lcom/flurry/sdk/ji;->a()Lcom/flurry/sdk/ji;

    .line 48
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    .line 49
    invoke-static {}, Lcom/flurry/sdk/jj;->a()Lcom/flurry/sdk/jj;

    .line 50
    invoke-static {}, Lcom/flurry/sdk/jg;->a()Lcom/flurry/sdk/jg;

    .line 51
    invoke-static {}, Lcom/flurry/sdk/jc;->a()Lcom/flurry/sdk/jc;

    .line 52
    invoke-static {}, Lcom/flurry/sdk/jl;->a()Lcom/flurry/sdk/jl;

    .line 53
    invoke-static {}, Lcom/flurry/sdk/jf;->a()Lcom/flurry/sdk/jf;

    .line 54
    invoke-static {}, Lcom/flurry/sdk/jm;->a()Lcom/flurry/sdk/jm;

    .line 55
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 143
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v0

    .line 144
    if-eqz v0, :cond_0

    .line 145
    invoke-virtual {v0, p1}, Lcom/flurry/sdk/jn;->a(Ljava/lang/String;)V

    .line 147
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 173
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v0

    .line 174
    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {v0, p1, p2}, Lcom/flurry/sdk/jn;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 60
    invoke-static {}, Lcom/flurry/sdk/jm;->b()V

    .line 61
    invoke-static {}, Lcom/flurry/sdk/jf;->b()V

    .line 62
    invoke-static {}, Lcom/flurry/sdk/jl;->b()V

    .line 63
    invoke-static {}, Lcom/flurry/sdk/jc;->b()V

    .line 64
    invoke-static {}, Lcom/flurry/sdk/jg;->b()V

    .line 65
    invoke-static {}, Lcom/flurry/sdk/jj;->b()V

    .line 66
    invoke-static {}, Lcom/flurry/sdk/jc;->b()V

    .line 67
    invoke-static {}, Lcom/flurry/sdk/ji;->b()V

    .line 68
    invoke-static {}, Lcom/flurry/sdk/jq;->b()V

    .line 69
    invoke-static {}, Lcom/flurry/sdk/lg;->b()V

    .line 70
    invoke-static {}, Lcom/flurry/sdk/lk;->b()V

    .line 71
    invoke-static {}, Lcom/flurry/sdk/jy;->b()V

    .line 73
    const-class v0, Lcom/flurry/sdk/jn;

    invoke-static {v0}, Lcom/flurry/sdk/lb;->b(Ljava/lang/Class;)V

    .line 74
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 158
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v0

    .line 159
    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0, p1}, Lcom/flurry/sdk/jn;->b(Ljava/lang/String;)V

    .line 162
    :cond_0
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 77
    const/4 v0, 0x0

    .line 79
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v1

    .line 80
    if-eqz v1, :cond_0

    .line 81
    invoke-virtual {v1}, Lcom/flurry/sdk/jn;->b()Ljava/lang/String;

    move-result-object v0

    .line 84
    :cond_0
    return-object v0
.end method

.method public d()J
    .locals 3

    .prologue
    .line 88
    const-wide/16 v0, 0x0

    .line 90
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v2

    .line 91
    if-eqz v2, :cond_0

    .line 92
    invoke-virtual {v2}, Lcom/flurry/sdk/jn;->c()J

    move-result-wide v0

    .line 95
    :cond_0
    return-wide v0
.end method

.method public e()J
    .locals 3

    .prologue
    .line 99
    const-wide/16 v0, 0x0

    .line 101
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v2

    .line 102
    if-eqz v2, :cond_0

    .line 103
    invoke-virtual {v2}, Lcom/flurry/sdk/jn;->d()J

    move-result-wide v0

    .line 106
    :cond_0
    return-wide v0
.end method

.method public f()J
    .locals 3

    .prologue
    .line 110
    const-wide/16 v0, -0x1

    .line 112
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v2

    .line 113
    if-eqz v2, :cond_0

    .line 114
    invoke-virtual {v2}, Lcom/flurry/sdk/jn;->e()J

    move-result-wide v0

    .line 117
    :cond_0
    return-wide v0
.end method

.method public g()J
    .locals 3

    .prologue
    .line 121
    const-wide/16 v0, 0x0

    .line 123
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v2

    .line 124
    if-eqz v2, :cond_0

    .line 125
    invoke-virtual {v2}, Lcom/flurry/sdk/jn;->g()J

    move-result-wide v0

    .line 128
    :cond_0
    return-wide v0
.end method

.method public h()J
    .locals 3

    .prologue
    .line 132
    const-wide/16 v0, 0x0

    .line 134
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v2

    .line 135
    if-eqz v2, :cond_0

    .line 136
    invoke-virtual {v2}, Lcom/flurry/sdk/jn;->f()J

    move-result-wide v0

    .line 139
    :cond_0
    return-wide v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v0

    .line 151
    if-eqz v0, :cond_0

    .line 152
    invoke-virtual {v0}, Lcom/flurry/sdk/jn;->h()Ljava/lang/String;

    move-result-object v0

    .line 154
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 165
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v0

    .line 166
    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {v0}, Lcom/flurry/sdk/jn;->i()Ljava/lang/String;

    move-result-object v0

    .line 169
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public k()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 180
    invoke-direct {p0}, Lcom/flurry/sdk/jb;->m()Lcom/flurry/sdk/jn;

    move-result-object v0

    .line 181
    if-eqz v0, :cond_0

    .line 182
    invoke-virtual {v0}, Lcom/flurry/sdk/jn;->j()Ljava/util/Map;

    move-result-object v0

    .line 184
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public l()Lcom/flurry/sdk/ji$a;
    .locals 1

    .prologue
    .line 192
    invoke-static {}, Lcom/flurry/sdk/ji;->a()Lcom/flurry/sdk/ji;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/ji;->d()Lcom/flurry/sdk/ji$a;

    move-result-object v0

    return-object v0
.end method
