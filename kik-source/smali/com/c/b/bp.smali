.class public final Lcom/c/b/bp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/as$b;


# instance fields
.field private a:Lcom/c/b/as$b;

.field private b:Lcom/c/b/as$a;

.field private c:Lcom/c/b/as;

.field private d:Z


# direct methods
.method public constructor <init>(Lcom/c/b/as;Lcom/c/b/as$b;Z)V
    .locals 1

    .prologue
    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    if-nez p1, :cond_0

    .line 88
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 90
    :cond_0
    iput-object p1, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    .line 91
    iput-object p2, p0, Lcom/c/b/bp;->a:Lcom/c/b/as$b;

    .line 92
    iput-boolean p3, p0, Lcom/c/b/bp;->d:Z

    .line 93
    return-void
.end method

.method private f()V
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    if-eqz v0, :cond_0

    .line 227
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    .line 229
    :cond_0
    iget-boolean v0, p0, Lcom/c/b/bp;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/c/b/bp;->a:Lcom/c/b/as$b;

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/c/b/bp;->a:Lcom/c/b/as$b;

    invoke-interface {v0}, Lcom/c/b/as$b;->a()V

    .line 233
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/bp;->d:Z

    .line 235
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lcom/c/b/as;)Lcom/c/b/bp;
    .locals 1

    .prologue
    .line 172
    if-nez p1, :cond_0

    .line 173
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 175
    :cond_0
    iput-object p1, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    .line 176
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    if-eqz v0, :cond_1

    .line 177
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    invoke-virtual {v0}, Lcom/c/b/as$a;->k()V

    .line 178
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    .line 180
    :cond_1
    invoke-direct {p0}, Lcom/c/b/bp;->f()V

    .line 181
    return-object p0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 239
    invoke-direct {p0}, Lcom/c/b/bp;->f()V

    .line 240
    return-void
.end method

.method public final b()Lcom/c/b/as;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    invoke-virtual {v0}, Lcom/c/b/as$a;->h()Lcom/c/b/bd;

    move-result-object v0

    check-cast v0, Lcom/c/b/as;

    iput-object v0, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    return-object v0
.end method

.method public final b(Lcom/c/b/as;)Lcom/c/b/bp;
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    iget-object v1, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    invoke-virtual {v1}, Lcom/c/b/as;->w()Lcom/c/b/bd;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 193
    iput-object p1, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    .line 197
    :goto_0
    invoke-direct {p0}, Lcom/c/b/bp;->f()V

    .line 198
    return-object p0

    .line 195
    :cond_0
    invoke-virtual {p0}, Lcom/c/b/bp;->d()Lcom/c/b/as$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method public final c()Lcom/c/b/as;
    .locals 1

    .prologue
    .line 125
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/bp;->d:Z

    .line 126
    invoke-virtual {p0}, Lcom/c/b/bp;->b()Lcom/c/b/as;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/c/b/as$a;
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    if-nez v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    invoke-virtual {v0, p0}, Lcom/c/b/as;->a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;

    move-result-object v0

    check-cast v0, Lcom/c/b/as$a;

    iput-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    .line 143
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    iget-object v1, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    invoke-virtual {v0, v1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    .line 144
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    invoke-virtual {v0}, Lcom/c/b/as$a;->m()V

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    return-object v0
.end method

.method public final e()Lcom/c/b/bg;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/c/b/bp;->b:Lcom/c/b/as$a;

    .line 160
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/bp;->c:Lcom/c/b/as;

    goto :goto_0
.end method
