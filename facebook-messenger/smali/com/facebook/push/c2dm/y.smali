.class public Lcom/facebook/push/c2dm/y;
.super Ljava/lang/Object;
.source "PushTokenHolder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Z

.field private final d:I


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Ljavax/inject/a;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/prefs/shared/d;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;ZI)V"
        }
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    .line 25
    iput-object p2, p0, Lcom/facebook/push/c2dm/y;->b:Ljavax/inject/a;

    .line 26
    iput-boolean p3, p0, Lcom/facebook/push/c2dm/y;->c:Z

    .line 27
    iput p4, p0, Lcom/facebook/push/c2dm/y;->d:I

    .line 28
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/push/c2dm/z;
    .locals 1

    .prologue
    .line 74
    if-nez p1, :cond_0

    .line 75
    sget-object v0, Lcom/facebook/push/c2dm/z;->C2DM:Lcom/facebook/push/c2dm/z;

    .line 81
    :goto_0
    return-object v0

    .line 78
    :cond_0
    :try_start_0
    const-class v0, Lcom/facebook/push/c2dm/z;

    invoke-static {v0, p1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/z;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    .line 81
    sget-object v0, Lcom/facebook/push/c2dm/z;->C2DM:Lcom/facebook/push/c2dm/z;

    goto :goto_0
.end method

.method public a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->b:Lcom/facebook/prefs/shared/ae;

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/facebook/push/c2dm/z;)V
    .locals 4

    .prologue
    .line 99
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 100
    iget-object v2, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v2

    .line 101
    sget-object v3, Lcom/facebook/push/c2dm/c;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 102
    sget-object v3, Lcom/facebook/push/c2dm/c;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 103
    sget-object v3, Lcom/facebook/push/c2dm/c;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 104
    sget-object v0, Lcom/facebook/push/c2dm/c;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p2}, Lcom/facebook/push/c2dm/z;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 105
    sget-object v0, Lcom/facebook/push/c2dm/c;->j:Lcom/facebook/prefs/shared/ae;

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 106
    invoke-interface {v2}, Lcom/facebook/prefs/shared/e;->a()V

    .line 107
    return-void
.end method

.method public b()Lcom/facebook/push/c2dm/z;
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/facebook/push/c2dm/y;->c:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/push/c2dm/z;->GCM:Lcom/facebook/push/c2dm/z;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/facebook/push/c2dm/z;->C2DM:Lcom/facebook/push/c2dm/z;

    goto :goto_0
.end method

.method public c()Lcom/facebook/push/c2dm/z;
    .locals 3

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->h:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/y;->a(Ljava/lang/String;)Lcom/facebook/push/c2dm/z;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 56
    iget v1, p0, Lcom/facebook/push/c2dm/y;->d:I

    iget-object v2, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/push/c2dm/c;->l:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v2

    if-eq v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 61
    iget v0, p0, Lcom/facebook/push/c2dm/y;->d:I

    return v0
.end method

.method public f()Lcom/facebook/push/c2dm/z;
    .locals 3

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->i:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-virtual {p0, v0}, Lcom/facebook/push/c2dm/y;->a(Ljava/lang/String;)Lcom/facebook/push/c2dm/z;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 2

    .prologue
    .line 70
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/y;->f()Lcom/facebook/push/c2dm/z;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/c2dm/z;->GCM:Lcom/facebook/push/c2dm/z;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 89
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 90
    sget-object v1, Lcom/facebook/push/c2dm/c;->b:Lcom/facebook/prefs/shared/ae;

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 91
    sget-object v1, Lcom/facebook/push/c2dm/c;->c:Lcom/facebook/prefs/shared/ae;

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 92
    sget-object v1, Lcom/facebook/push/c2dm/c;->l:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v4}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 93
    sget-object v1, Lcom/facebook/push/c2dm/c;->e:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 94
    sget-object v1, Lcom/facebook/push/c2dm/c;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v4}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 95
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 96
    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 3

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->c:Lcom/facebook/prefs/shared/ae;

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 115
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 118
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/push/c2dm/y;->i()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public k()Z
    .locals 3

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->j:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    return v0
.end method

.method public l()J
    .locals 4

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->d:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public m()V
    .locals 4

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/c2dm/c;->j:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/c2dm/c;->l:Lcom/facebook/prefs/shared/ae;

    iget v2, p0, Lcom/facebook/push/c2dm/y;->d:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/c2dm/c;->k:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/push/c2dm/c;->c:Lcom/facebook/prefs/shared/ae;

    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 138
    return-void
.end method

.method public n()V
    .locals 3

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/push/c2dm/c;->j:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 145
    return-void
.end method

.method public o()J
    .locals 4

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/push/c2dm/y;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/c2dm/c;->k:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    return-wide v0
.end method
