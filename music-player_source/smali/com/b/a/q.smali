.class public final Lcom/b/a/q;
.super Ljava/lang/Object;


# static fields
.field private static a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/b/a/q;->a:[Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)[Ljava/lang/String;
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    sget-object v0, Lcom/b/a/q;->a:[Ljava/lang/String;

    aget-object v0, v0, v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/b/a/q;->a:[Ljava/lang/String;

    aget-object v0, v0, v4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/b/a/q;->a:[Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->a()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/b/a/q;->a:[Ljava/lang/String;

    aget-object v2, v0, v3

    aput-object v2, v1, v3

    sget-object v1, Lcom/b/a/q;->a:[Ljava/lang/String;

    aget-object v0, v0, v4

    aput-object v0, v1, v4

    sget-object v0, Lcom/b/a/q;->a:[Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
