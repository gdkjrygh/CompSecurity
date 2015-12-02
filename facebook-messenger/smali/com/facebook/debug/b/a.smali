.class public Lcom/facebook/debug/b/a;
.super Ljava/lang/Object;
.source "Assert.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(II)V
    .locals 1

    .prologue
    .line 68
    invoke-static {}, Lcom/facebook/debug/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertEquals(II)V

    .line 72
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 223
    invoke-static {}, Lcom/facebook/debug/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    invoke-static {p0}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 226
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 214
    invoke-static {}, Lcom/facebook/debug/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertFalse(Ljava/lang/String;Z)V

    .line 217
    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 1

    .prologue
    .line 204
    invoke-static {}, Lcom/facebook/debug/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    invoke-static {p0}, Ljunit/framework/Assert;->assertFalse(Z)V

    .line 207
    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 1

    .prologue
    .line 16
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Z)V
    .locals 1

    .prologue
    .line 304
    invoke-static {}, Lcom/facebook/debug/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    invoke-static {p0, p1}, Ljunit/framework/Assert;->assertTrue(Ljava/lang/String;Z)V

    .line 307
    :cond_0
    return-void
.end method

.method public static b(Z)V
    .locals 1

    .prologue
    .line 295
    invoke-static {}, Lcom/facebook/debug/b/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    invoke-static {p0}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 298
    :cond_0
    return-void
.end method
