.class public Lkik/a/d/a/d;
.super Lkik/a/d/a/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/a/d/a/d$1;,
        Lkik/a/d/a/d$a;
    }
.end annotation


# instance fields
.field a:Z

.field private b:I

.field private c:Lkik/a/d/a/d$a;

.field private d:Lkik/a/d/j;

.field private e:Ljava/lang/String;

.field private f:J

.field private g:Z


# direct methods
.method public constructor <init>(I)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 29
    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v1, p0

    move-object v3, v2

    move-object v5, v2

    invoke-direct/range {v1 .. v7}, Lkik/a/d/a/d;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V

    .line 30
    iput p1, p0, Lkik/a/d/a/d;->b:I

    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 35
    invoke-direct {p0, v0, v0}, Lkik/a/d/a/g;-><init>(ZZ)V

    .line 25
    iput-boolean v0, p0, Lkik/a/d/a/d;->g:Z

    .line 36
    invoke-virtual {p0, p1}, Lkik/a/d/a/d;->a(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0, p2}, Lkik/a/d/a/d;->b(Ljava/lang/String;)V

    .line 38
    iput-object p4, p0, Lkik/a/d/a/d;->e:Ljava/lang/String;

    .line 39
    iput-boolean p3, p0, Lkik/a/d/a/d;->a:Z

    .line 40
    iput-wide p5, p0, Lkik/a/d/a/d;->f:J

    .line 41
    return-void
.end method


# virtual methods
.method public final a()Lkik/a/d/a/d$a;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lkik/a/d/a/d;->c:Lkik/a/d/a/d$a;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 80
    iput p1, p0, Lkik/a/d/a/d;->b:I

    .line 81
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 105
    iput-wide p1, p0, Lkik/a/d/a/d;->f:J

    .line 106
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 64
    const-string v0, "address-book-matching"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    sget-object v0, Lkik/a/d/a/d$a;->a:Lkik/a/d/a/d$a;

    iput-object v0, p0, Lkik/a/d/a/d;->c:Lkik/a/d/a/d$a;

    .line 76
    :goto_0
    return-void

    .line 67
    :cond_0
    const-string v0, "explicit-username-search"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    sget-object v0, Lkik/a/d/a/d$a;->b:Lkik/a/d/a/d$a;

    iput-object v0, p0, Lkik/a/d/a/d;->c:Lkik/a/d/a/d$a;

    goto :goto_0

    .line 70
    :cond_1
    const-string v0, "inline-username-search"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 71
    sget-object v0, Lkik/a/d/a/d$a;->c:Lkik/a/d/a/d$a;

    iput-object v0, p0, Lkik/a/d/a/d;->c:Lkik/a/d/a/d$a;

    goto :goto_0

    .line 74
    :cond_2
    sget-object v0, Lkik/a/d/a/d$a;->d:Lkik/a/d/a/d$a;

    iput-object v0, p0, Lkik/a/d/a/d;->c:Lkik/a/d/a/d$a;

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 100
    iput-boolean p1, p0, Lkik/a/d/a/d;->a:Z

    .line 101
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 50
    sget-object v0, Lkik/a/d/a/d$1;->a:[I

    iget-object v1, p0, Lkik/a/d/a/d;->c:Lkik/a/d/a/d$a;

    invoke-virtual {v1}, Lkik/a/d/a/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 58
    const-string v0, ""

    :goto_0
    return-object v0

    .line 52
    :pswitch_0
    const-string v0, "address-book-matching"

    goto :goto_0

    .line 54
    :pswitch_1
    const-string v0, "explicit-username-search"

    goto :goto_0

    .line 56
    :pswitch_2
    const-string v0, "inline-username-search"

    goto :goto_0

    .line 50
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 85
    if-eqz p1, :cond_0

    .line 86
    invoke-static {p1}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v0

    iput-object v0, p0, Lkik/a/d/a/d;->d:Lkik/a/d/j;

    .line 91
    :goto_0
    return-void

    .line 89
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/a/d/a/d;->d:Lkik/a/d/j;

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/d/a/d;->g:Z

    .line 111
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lkik/a/d/a/d;->e:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public final d()Lkik/a/d/j;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lkik/a/d/a/d;->d:Lkik/a/d/j;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lkik/a/d/a/d;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 125
    iget-boolean v0, p0, Lkik/a/d/a/d;->a:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 130
    iget-boolean v0, p0, Lkik/a/d/a/d;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/d/a/d;->e:Ljava/lang/String;

    invoke-static {v0}, Lkik/a/h/i;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()J
    .locals 2

    .prologue
    .line 135
    iget-wide v0, p0, Lkik/a/d/a/d;->f:J

    return-wide v0
.end method

.method public final i()I
    .locals 1

    .prologue
    .line 140
    iget v0, p0, Lkik/a/d/a/d;->b:I

    return v0
.end method
