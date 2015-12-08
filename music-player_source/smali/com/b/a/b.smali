.class public final Lcom/b/a/b;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/b/a/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/b/a/n;

    invoke-direct {v0}, Lcom/b/a/n;-><init>()V

    sput-object v0, Lcom/b/a/b;->a:Lcom/b/a/n;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lcom/b/a/b;->a:Lcom/b/a/n;

    invoke-virtual {v0, p0}, Lcom/b/a/n;->b(Landroid/content/Context;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 2

    if-nez p2, :cond_0

    const-string v0, "MobclickAgent"

    const-string v1, "input map is null"

    invoke-static {v0, v1}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/b/a/b;->a:Lcom/b/a/n;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, p0, p1, v1}, Lcom/b/a/n;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    if-nez p0, :cond_0

    const-string v0, "MobclickAgent"

    const-string v1, "unexpected null context in onResume"

    invoke-static {v0, v1}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/b/a/b;->a:Lcom/b/a/n;

    invoke-virtual {v0, p0}, Lcom/b/a/n;->a(Landroid/content/Context;)V

    goto :goto_0
.end method
