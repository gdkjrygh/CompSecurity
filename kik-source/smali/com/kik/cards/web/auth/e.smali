.class final Lcom/kik/cards/web/auth/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/auth/AuthPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/AuthPlugin;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/kik/cards/web/auth/e;->a:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a([B)Ljava/lang/String;
    .locals 2

    .prologue
    .line 71
    :try_start_0
    invoke-static {p0}, Lcom/kik/m/e;->b([B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 81
    :goto_0
    return-object v0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 75
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 78
    :cond_0
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 81
    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    check-cast p1, [B

    invoke-static {p1}, Lcom/kik/cards/web/auth/e;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
