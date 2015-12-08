.class public final Lcom/b/a/a;
.super Ljava/lang/Object;


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static c:I

.field public static d:Ljava/lang/String;

.field public static e:Ljava/lang/String;

.field public static f:Z

.field public static g:I

.field public static h:Z

.field public static i:Z

.field public static j:Z

.field public static k:Z

.field public static l:J

.field private static m:Ljava/lang/String;

.field private static n:Ljava/lang/String;

.field private static o:[D


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    sput-object v1, Lcom/b/a/a;->m:Ljava/lang/String;

    sput-object v1, Lcom/b/a/a;->n:Ljava/lang/String;

    sput-object v1, Lcom/b/a/a;->a:Ljava/lang/String;

    sput-object v1, Lcom/b/a/a;->b:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/b/a/a;->d:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/b/a/a;->e:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/b/a/a;->f:Z

    sput-object v1, Lcom/b/a/a;->o:[D

    sput-boolean v2, Lcom/b/a/a;->h:Z

    sput-boolean v2, Lcom/b/a/a;->i:Z

    sput-boolean v2, Lcom/b/a/a;->j:Z

    sput-boolean v2, Lcom/b/a/a;->k:Z

    const-wide/16 v0, 0x7530

    sput-wide v0, Lcom/b/a/a;->l:J

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 2

    sget v0, Lcom/b/a/a;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "5.5.3.0"

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "5.5.3"

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/b/a/a;->m:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {p0}, Lb/a/ff;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/b/a/a;->m:Ljava/lang/String;

    :cond_0
    sget-object v0, Lcom/b/a/a;->m:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/b/a/a;->n:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {p0}, Lb/a/ff;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/b/a/a;->n:Ljava/lang/String;

    :cond_0
    sget-object v0, Lcom/b/a/a;->n:Ljava/lang/String;

    return-object v0
.end method

.method public static b()[D
    .locals 1

    sget-object v0, Lcom/b/a/a;->o:[D

    return-object v0
.end method
