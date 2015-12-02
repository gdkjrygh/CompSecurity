.class public Lcom/qihoo/security/h/d;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 6
    invoke-static {}, Lcom/qihoo/security/h/f;->a()Lcom/qihoo/security/h/f;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/qihoo/security/h/f;->a(Ljava/lang/String;I)V

    .line 8
    invoke-static {}, Lcom/qihoo/security/h/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    invoke-static {}, Lcom/qihoo/security/h/a;->a()Lcom/qihoo/security/h/a;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/qihoo/security/h/a;->a(Ljava/lang/String;I)V

    .line 11
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 14
    invoke-static {}, Lcom/qihoo/security/h/f;->a()Lcom/qihoo/security/h/f;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/qihoo/security/h/f;->b(Ljava/lang/String;I)V

    .line 15
    invoke-static {}, Lcom/qihoo/security/h/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    invoke-static {}, Lcom/qihoo/security/h/a;->a()Lcom/qihoo/security/h/a;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/qihoo/security/h/a;->b(Ljava/lang/String;I)V

    .line 18
    :cond_0
    return-void
.end method
