.class public final Lcom/roidapp/videolib/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/videolib/core/a/c;


# direct methods
.method public static a(Landroid/content/Context;)Lcom/roidapp/videolib/core/a/c;
    .locals 1

    .prologue
    .line 23
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V

    .line 24
    new-instance v0, Lcom/roidapp/videolib/a/b;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/a/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/roidapp/videolib/a/a;->a:Lcom/roidapp/videolib/core/a/c;

    return-object v0
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/roidapp/videolib/a/a;->a:Lcom/roidapp/videolib/core/a/c;

    if-eqz v0, :cond_0

    .line 32
    sget-object v0, Lcom/roidapp/videolib/a/a;->a:Lcom/roidapp/videolib/core/a/c;

    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/c;->b()V

    .line 33
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/videolib/a/a;->a:Lcom/roidapp/videolib/core/a/c;

    .line 35
    :cond_0
    return-void
.end method
