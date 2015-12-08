.class public final Lcom/kik/l/z;
.super Lcom/kik/l/y;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/kik/l/y;-><init>(Landroid/database/Cursor;)V

    .line 24
    return-void
.end method

.method public static a(Lkik/a/d/a/d;)Landroid/content/ContentValues;
    .locals 4

    .prologue
    .line 28
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 29
    if-eqz p0, :cond_0

    .line 30
    const-string v1, "body"

    invoke-virtual {p0}, Lkik/a/d/a/d;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    const-string v1, "friend_attribute_type"

    invoke-virtual {p0}, Lkik/a/d/a/d;->a()Lkik/a/d/a/d$a;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/a/d$a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    const-string v1, "referrer_jid"

    invoke-virtual {p0}, Lkik/a/d/a/d;->d()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v1, "reply"

    invoke-virtual {p0}, Lkik/a/d/a/d;->f()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 34
    const-string v1, "timestamp"

    invoke-virtual {p0}, Lkik/a/d/a/d;->h()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 36
    :cond_0
    return-object v0
.end method
