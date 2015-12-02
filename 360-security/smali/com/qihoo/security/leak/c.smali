.class public abstract Lcom/qihoo/security/leak/c;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lcom/qihoo/security/leak/d;

.field public c:Lcom/qihoo/security/locale/d;

.field d:J

.field private e:Z


# direct methods
.method constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/leak/c;->e:Z

    .line 148
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/leak/c;->d:J

    .line 35
    iput-object v2, p0, Lcom/qihoo/security/leak/c;->a:Landroid/content/Context;

    .line 36
    iput-object v2, p0, Lcom/qihoo/security/leak/c;->b:Lcom/qihoo/security/leak/d;

    .line 37
    return-void
.end method

.method constructor <init>(Lcom/qihoo/security/leak/d;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/leak/c;->e:Z

    .line 148
    iput-wide v2, p0, Lcom/qihoo/security/leak/c;->d:J

    .line 29
    iput-object p1, p0, Lcom/qihoo/security/leak/c;->b:Lcom/qihoo/security/leak/d;

    .line 30
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/leak/c;->a:Landroid/content/Context;

    .line 31
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->b:Lcom/qihoo/security/leak/d;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/d;->b()Lcom/qihoo/security/leak/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/leak/e;->a(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/leak/c;->d:J

    .line 32
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method final a(JJ)V
    .locals 7

    .prologue
    .line 155
    iget-wide v0, p0, Lcom/qihoo/security/leak/c;->d:J

    .line 156
    iget-wide v2, p0, Lcom/qihoo/security/leak/c;->d:J

    const-wide/16 v4, -0x1

    xor-long/2addr v4, p3

    and-long/2addr v2, v4

    and-long v4, p1, p3

    or-long/2addr v2, v4

    iput-wide v2, p0, Lcom/qihoo/security/leak/c;->d:J

    .line 157
    iget-wide v2, p0, Lcom/qihoo/security/leak/c;->d:J

    xor-long/2addr v0, v2

    .line 158
    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->b:Lcom/qihoo/security/leak/d;

    invoke-virtual {v0}, Lcom/qihoo/security/leak/d;->b()Lcom/qihoo/security/leak/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->m()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/qihoo/security/leak/c;->d:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/leak/e;->b(Ljava/lang/String;J)V

    .line 161
    :cond_0
    return-void
.end method

.method a(Z)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x1

    .line 145
    if-eqz p1, :cond_0

    move-wide v0, v2

    :goto_0
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/qihoo/security/leak/c;->a(JJ)V

    .line 146
    return-void

    .line 145
    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method final b(JJ)Z
    .locals 3

    .prologue
    .line 164
    iget-wide v0, p0, Lcom/qihoo/security/leak/c;->d:J

    and-long/2addr v0, p3

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 2

    .prologue
    const-wide/16 v0, 0x1

    .line 50
    invoke-virtual {p0, v0, v1, v0, v1}, Lcom/qihoo/security/leak/c;->b(JJ)Z

    move-result v0

    return v0
.end method

.method public abstract d()Landroid/graphics/drawable/Drawable;
.end method

.method abstract e()I
.end method

.method public f()Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 54
    invoke-virtual {p0, v0}, Lcom/qihoo/security/leak/c;->a(Z)V

    .line 55
    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 2

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aget-object v0, v0, v1

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 2

    .prologue
    .line 122
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aget-object v0, v0, v1

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/qihoo/security/leak/c;->c:Lcom/qihoo/security/locale/d;

    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aget-object v0, v0, v1

    return-object v0
.end method

.method m()Ljava/lang/String;
    .locals 1

    .prologue
    .line 141
    invoke-virtual {p0}, Lcom/qihoo/security/leak/c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method n()Z
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 179
    const-string/jumbo v2, "Xiaomi"

    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 189
    :cond_0
    :goto_0
    return v0

    .line 182
    :cond_1
    const/16 v2, 0x9

    new-array v3, v2, [Ljava/lang/String;

    const-string/jumbo v2, "MI-ONE Plus"

    aput-object v2, v3, v0

    const-string/jumbo v2, "MI-ONE C1"

    aput-object v2, v3, v1

    const/4 v2, 0x2

    const-string/jumbo v4, "MI 1S"

    aput-object v4, v3, v2

    const/4 v2, 0x3

    const-string/jumbo v4, "MI 1SC"

    aput-object v4, v3, v2

    const/4 v2, 0x4

    const-string/jumbo v4, "MI 2"

    aput-object v4, v3, v2

    const/4 v2, 0x5

    const-string/jumbo v4, "MI 2C"

    aput-object v4, v3, v2

    const/4 v2, 0x6

    const-string/jumbo v4, "MI 2S"

    aput-object v4, v3, v2

    const/4 v2, 0x7

    const-string/jumbo v4, "MI 2SC"

    aput-object v4, v3, v2

    const/16 v2, 0x8

    const-string/jumbo v4, "MI 2A"

    aput-object v4, v3, v2

    .line 184
    array-length v4, v3

    move v2, v0

    :goto_1
    if-ge v2, v4, :cond_0

    aget-object v5, v3, v2

    .line 185
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v0, v1

    .line 186
    goto :goto_0

    .line 184
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method o()Z
    .locals 2

    .prologue
    .line 194
    const-string/jumbo v0, "E30"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string/jumbo v0, "8x25q"

    sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    const/4 v0, 0x1

    .line 197
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 174
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
